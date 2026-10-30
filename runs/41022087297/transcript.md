# Sandbox transcript (2026-10-30T07:47:06Z, 2dfe77e)

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
  "correlation_id": "22eeabad-1716-4531-bf39-1fbd22ef2c88"
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
  "session_id": "03921d22-8752-4609-a256-2d6681f62f68",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDczMzUsImlhdCI6MTc5MzM0NjQzNSwianRpIjoiODNhZjExMzYtMGM0ZS00NjgxLWFjOWYtYzA1NjEyMTQwNzA3Iiwic2lkIjoiMDM5MjFkMjItODc1Mi00NjA5LWEyNTYtMmQ2NjgxZjYyZjY4In0.P1jkpyM-H9ZjzqUeBIZolSh4MnZ0LUvFV-QRp7Rron0",
  "access_expires_at": "2026-10-30T08:02:15.330994692Z",
  "refresh_token": "7KWO4TcV0pO6Wdy1LybyKyB0ItDkeT06KXWzg-wwhZo",
  "refresh_expires_at": "2026-10-30T19:47:15.328919594Z",
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
  "session_id": "e5506c52-a35e-44ff-bff4-e9ee7a9a54ee",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDczMzcsImlhdCI6MTc5MzM0NjQzNywianRpIjoiODg4Njk2YjMtYWY4Mi00MzA0LThkMzktZTY1ZWM3ZDBiNGMyIiwic2lkIjoiZTU1MDZjNTItYTM1ZS00NGZmLWJmZjQtZTllZTdhOWE1NGVlIn0.j_LQj8C5-EGDGwJfVQTYPDad2quTPzNn0FztTlDXE_Q",
  "access_expires_at": "2026-10-30T08:02:17.292945008Z",
  "refresh_token": "AJRD3tZaxyWsDjFHcHvuEmYUxSC_k8jgoS5YZnmXQJE",
  "refresh_expires_at": "2026-10-30T19:47:17.291651635Z",
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
  "device_ref": "sandbox-11483"
}
```

```json
{
  "challenge_id": "b8a1385f-3980-4dfc-bdc6-501bbf8b0a54",
  "expires_at": "2026-10-30T07:52:17.895951497Z",
  "resend_available_at": "2026-10-30T07:47:18.895951497Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "236417",
  "sent_at": "2026-10-30T07:47:17.908482061Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b8a1385f-3980-4dfc-bdc6-501bbf8b0a54",
  "code": "236417",
  "device_ref": "sandbox-11483"
}
```

```json
{
  "session_id": "469ff3f0-1505-4481-b625-379455165310",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NzMzOCwiaWF0IjoxNzkzMzQ2NDM4LCJqdGkiOiI1YWI5YzQzZS00ZjdkLTRjOTItOWE5OC1hY2MyMTE2MmNlNWMiLCJzaWQiOiI0NjlmZjNmMC0xNTA1LTQ0ODEtYjYyNS0zNzk0NTUxNjUzMTAifQ.bE_WjWut002gAb3C9k9-CcoS4AVotevnRn3Bd8JRfhA",
  "access_expires_at": "2026-10-30T08:02:18.228827497Z",
  "refresh_token": "jqmuhKjhbWhUgjyAUbyulN2t_nyEV4fytQ4dmH3lkdQ",
  "refresh_expires_at": "2026-11-29T07:47:18.227795887Z",
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
  "command_id": "14cbd7d6-0f40-4dad-ac36-222f99b2d17a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:47:18Z",
    "sequence": 1793346438796
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7ea07351-db3e-4ca2-bb88-fd581fa0bf9b",
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
  "last_heartbeat_at": "2026-10-30T07:47:18.991822Z",
  "last_location_at": "2026-10-30T07:47:18.991822Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634318211",
  "device_ref": "sandbox-2826"
}
```

```json
{
  "challenge_id": "f6736b52-a8cf-42d6-98e6-c0c7f2d83023",
  "expires_at": "2026-10-30T07:52:19.284406164Z",
  "resend_available_at": "2026-10-30T07:47:20.284406164Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634318211` → **200**

```json
{
  "phone": "+380634318211",
  "audience": "CLIENT",
  "code": "163000",
  "sent_at": "2026-10-30T07:47:19.289604979Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f6736b52-a8cf-42d6-98e6-c0c7f2d83023",
  "code": "163000",
  "device_ref": "sandbox-2826"
}
```

```json
{
  "session_id": "b6973d81-232b-45be-81cd-70568760bc77",
  "subject": {
    "type": "CLIENT",
    "id": "da85a700-e644-4c00-9a97-09b5c441af34"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTg1YTcwMC1lNjQ0LTRjMDAtOWE5Ny0wOWI1YzQ0MWFmMzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ3MzM5LCJpYXQiOjE3OTMzNDY0MzksImp0aSI6ImM3MzE3ZTlkLWQ3MGQtNDI4MC04NjA5LWYyY2I5MWYyNmM5MiIsInNpZCI6ImI2OTczZDgxLTIzMmItNDViZS04MWNkLTcwNTY4NzYwYmM3NyJ9.LdH1FxzbQrBrFym_vyMHzSge67MUwcgrSdH7PdH7ixw",
  "access_expires_at": "2026-10-30T08:02:19.606722804Z",
  "refresh_token": "xhPveNdxq0FR-Tvw0Z6CnvSlB7OOJu3-7lQ5iFrzdEY",
  "refresh_expires_at": "2026-11-29T07:47:19.605647324Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9aba9de9-5200-4b96-87e5-26c6af5411bc",
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
  "id": "b7459aef-2238-4b8f-a691-c610c2be8583",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:52:19.935874Z",
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
  "command_id": "5a9eee61-ad9a-484f-8ba6-4d307ad1ec47",
  "quote_id": "b7459aef-2238-4b8f-a691-c610c2be8583",
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
  "id": "1037fb1f-477e-4b7a-b95f-013e38e9b491",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "da85a700-e644-4c00-9a97-09b5c441af34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T07:47:20.353922Z",
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
    "id": "6afcb628-1785-46ef-8548-49b73c84a0dc",
    "order_id": "1037fb1f-477e-4b7a-b95f-013e38e9b491",
    "expires_at": "2026-10-30T07:47:35.369462Z",
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

`POST /api/driver/v1/offers/6afcb628-1785-46ef-8548-49b73c84a0dc/accept` → **200**

```json
{
  "command_id": "36999eb7-73a7-478f-83ce-e686ac7b82c3"
}
```

```json
{
  "id": "6fd16789-d8bf-4a39-8da7-c5ea4586ef78",
  "order_id": "1037fb1f-477e-4b7a-b95f-013e38e9b491",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "399f2a71-5218-46ec-bfb2-b2bda0fcddb9",
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
  "command_id": "38388bda-96c3-4de4-86c4-3b2acadb283d",
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
  "changed_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T07:47:21.620460278Z"
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
  "id": "399f2a71-5218-46ec-bfb2-b2bda0fcddb9",
  "order_id": "1037fb1f-477e-4b7a-b95f-013e38e9b491",
  "assignment_id": "6fd16789-d8bf-4a39-8da7-c5ea4586ef78",
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

`POST /api/driver/v1/work-sessions/7ea07351-db3e-4ca2-bb88-fd581fa0bf9b/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:47:22Z",
    "sequence": 1793346442520
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7ea07351-db3e-4ca2-bb88-fd581fa0bf9b",
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
  "last_heartbeat_at": "2026-10-30T07:47:22.546773Z",
  "last_location_at": "2026-10-30T07:47:22.546773Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/399f2a71-5218-46ec-bfb2-b2bda0fcddb9/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "f9ec43f4-dd2f-43bf-a8a6-d02c5eb2d57a",
  "expected_version": 0
}
```

```json
{
  "id": "399f2a71-5218-46ec-bfb2-b2bda0fcddb9",
  "order_id": "1037fb1f-477e-4b7a-b95f-013e38e9b491",
  "assignment_id": "6fd16789-d8bf-4a39-8da7-c5ea4586ef78",
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
  "arrived_at": "2026-10-30T07:47:22.854664Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/399f2a71-5218-46ec-bfb2-b2bda0fcddb9/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "ff2ef92c-6301-4a3c-9c72-b81c6d1b91f4",
  "expected_version": 1
}
```

```json
{
  "id": "399f2a71-5218-46ec-bfb2-b2bda0fcddb9",
  "order_id": "1037fb1f-477e-4b7a-b95f-013e38e9b491",
  "assignment_id": "6fd16789-d8bf-4a39-8da7-c5ea4586ef78",
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
  "arrived_at": "2026-10-30T07:47:22.854664Z",
  "started_at": "2026-10-30T07:47:23.144393Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/399f2a71-5218-46ec-bfb2-b2bda0fcddb9/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "38f710be-8cd6-458a-be9d-e6a06d75f94c",
  "expected_version": 2,
  "reported_at": "2026-10-30T07:47:23Z",
  "cash_received": true
}
```

```json
{
  "id": "399f2a71-5218-46ec-bfb2-b2bda0fcddb9",
  "order_id": "1037fb1f-477e-4b7a-b95f-013e38e9b491",
  "assignment_id": "6fd16789-d8bf-4a39-8da7-c5ea4586ef78",
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
  "arrived_at": "2026-10-30T07:47:22.854664Z",
  "started_at": "2026-10-30T07:47:23.144393Z",
  "completed_at": "2026-10-30T07:47:23.450978Z",
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
  "session_id": "7ea07351-db3e-4ca2-bb88-fd581fa0bf9b",
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
  "last_heartbeat_at": "2026-10-30T07:47:22.546773Z",
  "last_location_at": "2026-10-30T07:47:22.546773Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7ea07351-db3e-4ca2-bb88-fd581fa0bf9b/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "5e031476-1ab9-4815-895b-ea59155f9f47",
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
  "command_id": "db261003-d9c5-458d-b35f-985fd07f2f21",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:47:24Z",
    "sequence": 1793346444343
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
  "correlation_id": "0683d819-6157-43ee-957a-a373d924edbf",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "98f8f732-5b15-4db5-9b6e-fd47c631ab7b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:47:24Z",
    "sequence": 1793346444705
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ab9be600-bbfa-46f8-9ba8-1d55f8963b5a",
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
  "last_heartbeat_at": "2026-10-30T07:47:24.726544Z",
  "last_location_at": "2026-10-30T07:47:24.726544Z",
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
  "changed_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T07:47:21.62046Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "5f9a8002-4241-4435-a6c1-ef5fc01a6de7",
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
  "changed_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T07:47:25.284612357Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ab9be600-bbfa-46f8-9ba8-1d55f8963b5a",
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
  "last_heartbeat_at": "2026-10-30T07:47:24.726544Z",
  "last_location_at": "2026-10-30T07:47:24.726544Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ab9be600-bbfa-46f8-9ba8-1d55f8963b5a/close` → **200**

```json
{
  "command_id": "b00520e6-b20e-4552-89f9-38e708ea3235",
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
  "session_id": "a728d740-f585-45c9-a2be-c80649cb10e4",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDczNDYsImlhdCI6MTc5MzM0NjQ0NiwianRpIjoiMWI3ZmZlYzYtMTFjNC00YmE3LWEwZjYtZTkzY2VlMTFjNWUyIiwic2lkIjoiYTcyOGQ3NDAtZjU4NS00NWM5LWEyYmUtYzgwNjQ5Y2IxMGU0In0.eNplbyWe-8izPzViM6HP70kWCRK44v2W9IUW3gX5H3A",
  "access_expires_at": "2026-10-30T08:02:26.456695574Z",
  "refresh_token": "tdr7oxkXU24Wx7HQc5ts6jY0rfN0ycLIp5Fz2jPA3as",
  "refresh_expires_at": "2026-10-30T19:47:26.455685577Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "1871195a-276f-4970-adea-d972e94f1cba",
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
  "id": "cf2579ad-0e7a-4c58-a6ab-a63e5bb91f5f",
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
  "created_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
  "created_at": "2026-10-30T07:47:26.747622Z",
  "updated_at": "2026-10-30T07:47:26.747622Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631958534",
  "device_ref": "sandbox-23909"
}
```

```json
{
  "challenge_id": "6da02d51-348a-4280-96fa-96c347965d99",
  "expires_at": "2026-10-30T07:52:27.059888784Z",
  "resend_available_at": "2026-10-30T07:47:28.059888784Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631958534` → **200**

```json
{
  "phone": "+380631958534",
  "audience": "CLIENT",
  "code": "764499",
  "sent_at": "2026-10-30T07:47:27.064608684Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6da02d51-348a-4280-96fa-96c347965d99",
  "code": "764499",
  "device_ref": "sandbox-23909"
}
```

```json
{
  "session_id": "3c0a109b-ce2f-4359-9354-48afdf3d21d1",
  "subject": {
    "type": "CLIENT",
    "id": "4a07c7fc-0ac6-49f2-b842-d4b5c005522e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTA3YzdmYy0wYWM2LTQ5ZjItYjg0Mi1kNGI1YzAwNTUyMmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ3MzQ3LCJpYXQiOjE3OTMzNDY0NDcsImp0aSI6ImY5NjY2ZjI0LTU0YjgtNGI4Yi05ZTcwLWQ1NzhmZDk5ZDY2OSIsInNpZCI6IjNjMGExMDliLWNlMmYtNDM1OS05MzU0LTQ4YWZkZjNkMjFkMSJ9.l6Mum_BwUnq9m35NQJDrCQHfBXrbLdoeeGGrQN7NSEo",
  "access_expires_at": "2026-10-30T08:02:27.3646028Z",
  "refresh_token": "JtDtcrZkOVBqZFhvEPP1oeuL46hVi-WUAyAb6dsOPy8",
  "refresh_expires_at": "2026-11-29T07:47:27.363684989Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380631958534` → **200**

```json
{
  "client_id": "4a07c7fc-0ac6-49f2-b842-d4b5c005522e"
}
```

`POST /api/admin/v1/rider-wallets/4a07c7fc-0ac6-49f2-b842-d4b5c005522e/top-ups` → **201**

```json
{
  "command_id": "0d3f47d4-daa9-439d-915c-c4c1d687b28a",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "4a07c7fc-0ac6-49f2-b842-d4b5c005522e",
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
      "id": "c97203e5-e9c1-4dc2-a59d-1c619a89a12d",
      "at": "2026-10-30T07:47:27.927703Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e72a0099-0680-46dd-9ec2-670a72e54279",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "260c2449-2659-418d-9ad9-7c71b248981d",
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
  "id": "9fba294f-5e17-4ca8-b7ea-73312741cfd2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:52:28.229264Z",
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
      "id": "cf2579ad-0e7a-4c58-a6ab-a63e5bb91f5f",
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
  "device_ref": "sandbox-28490"
}
```

```json
{
  "challenge_id": "327b3e9f-0420-4896-b658-fc435cf8369a",
  "expires_at": "2026-10-30T07:52:28.520539483Z",
  "resend_available_at": "2026-10-30T07:47:29.520539483Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "683379",
  "sent_at": "2026-10-30T07:47:28.524665341Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "327b3e9f-0420-4896-b658-fc435cf8369a",
  "code": "683379",
  "device_ref": "sandbox-28490"
}
```

```json
{
  "session_id": "b0d618d2-6c3b-4c6a-8395-b02c59271c23",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NzM0OCwiaWF0IjoxNzkzMzQ2NDQ4LCJqdGkiOiIyYWI4YTQwZC0zMjE1LTRlOTAtYWE1Ni01ODU2ZWZlODUwMDMiLCJzaWQiOiJiMGQ2MThkMi02YzNiLTRjNmEtODM5NS1iMDJjNTkyNzFjMjMifQ.lMZaHTIO8hamqZ2uJ7E5uxFt78l9hZN6i1TSe7cvHvQ",
  "access_expires_at": "2026-10-30T08:02:28.822637972Z",
  "refresh_token": "6Wp3VZuLxQFBWzmFKsG7ZGwHiu8bpqty4x2-KdPT_FY",
  "refresh_expires_at": "2026-11-29T07:47:28.821891433Z",
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
  "command_id": "4df670f7-fdc1-47e9-acf5-6163c2276f8f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:47:29Z",
    "sequence": 1793346449362
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "10d6417b-a7ac-4e2f-8e28-c741f49ce1a0",
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
  "last_heartbeat_at": "2026-10-30T07:47:29.382393Z",
  "last_location_at": "2026-10-30T07:47:29.382393Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "b581fc78-7cf1-4f2b-b6ed-d26d3467c100",
  "quote_id": "9fba294f-5e17-4ca8-b7ea-73312741cfd2",
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
  "id": "1793592a-3d2d-423a-bbe2-dee779a3a806",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4a07c7fc-0ac6-49f2-b842-d4b5c005522e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T07:47:29.67629Z",
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
  "client_id": "4a07c7fc-0ac6-49f2-b842-d4b5c005522e",
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
      "id": "c97203e5-e9c1-4dc2-a59d-1c619a89a12d",
      "at": "2026-10-30T07:47:27.927703Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e72a0099-0680-46dd-9ec2-670a72e54279",
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
    "id": "febb9662-6c0d-4725-8926-e337d7b3ccaf",
    "order_id": "1793592a-3d2d-423a-bbe2-dee779a3a806",
    "expires_at": "2026-10-30T07:47:44.687273Z",
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

`POST /api/driver/v1/offers/febb9662-6c0d-4725-8926-e337d7b3ccaf/accept` → **200**

```json
{
  "command_id": "0a37fddb-2bf7-4e59-a0bd-06076970134c"
}
```

```json
{
  "id": "649e64f5-3f32-4dbd-8b15-03654afcd90d",
  "order_id": "1793592a-3d2d-423a-bbe2-dee779a3a806",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3b699128-fe94-4b79-8dc3-64cc76cf7c0e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3b699128-fe94-4b79-8dc3-64cc76cf7c0e",
  "order_id": "1793592a-3d2d-423a-bbe2-dee779a3a806",
  "assignment_id": "649e64f5-3f32-4dbd-8b15-03654afcd90d",
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

`POST /api/driver/v1/work-sessions/10d6417b-a7ac-4e2f-8e28-c741f49ce1a0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:47:33Z",
    "sequence": 1793346453147
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "10d6417b-a7ac-4e2f-8e28-c741f49ce1a0",
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
  "last_heartbeat_at": "2026-10-30T07:47:33.166887Z",
  "last_location_at": "2026-10-30T07:47:33.166887Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/3b699128-fe94-4b79-8dc3-64cc76cf7c0e/arrive` → **200**

```json
{
  "command_id": "2eb5d46f-0ef4-49e9-85b6-3c899307c2d1",
  "expected_version": 0
}
```

```json
{
  "id": "3b699128-fe94-4b79-8dc3-64cc76cf7c0e",
  "order_id": "1793592a-3d2d-423a-bbe2-dee779a3a806",
  "assignment_id": "649e64f5-3f32-4dbd-8b15-03654afcd90d",
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
  "arrived_at": "2026-10-30T07:47:33.456356Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3b699128-fe94-4b79-8dc3-64cc76cf7c0e/start` → **200**

```json
{
  "command_id": "10c079c3-dd33-498a-b160-0900c56c5c92",
  "expected_version": 1
}
```

```json
{
  "id": "3b699128-fe94-4b79-8dc3-64cc76cf7c0e",
  "order_id": "1793592a-3d2d-423a-bbe2-dee779a3a806",
  "assignment_id": "649e64f5-3f32-4dbd-8b15-03654afcd90d",
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
  "arrived_at": "2026-10-30T07:47:33.456356Z",
  "started_at": "2026-10-30T07:47:33.774834Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/3b699128-fe94-4b79-8dc3-64cc76cf7c0e/complete` → **200**

```json
{
  "command_id": "b1fdec20-5d1e-4894-a4c2-db46e0a7b092",
  "expected_version": 2,
  "reported_at": "2026-10-30T07:47:34Z",
  "cash_received": true
}
```

```json
{
  "id": "3b699128-fe94-4b79-8dc3-64cc76cf7c0e",
  "order_id": "1793592a-3d2d-423a-bbe2-dee779a3a806",
  "assignment_id": "649e64f5-3f32-4dbd-8b15-03654afcd90d",
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
  "arrived_at": "2026-10-30T07:47:33.456356Z",
  "started_at": "2026-10-30T07:47:33.774834Z",
  "completed_at": "2026-10-30T07:47:34.092312Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "4a07c7fc-0ac6-49f2-b842-d4b5c005522e",
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
      "id": "ca22ff6b-5436-4508-80c1-ce389b36a039",
      "at": "2026-10-30T07:47:34.800277Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "1793592a-3d2d-423a-bbe2-dee779a3a806"
    },
    {
      "id": "c97203e5-e9c1-4dc2-a59d-1c619a89a12d",
      "at": "2026-10-30T07:47:27.927703Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e72a0099-0680-46dd-9ec2-670a72e54279",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/cf2579ad-0e7a-4c58-a6ab-a63e5bb91f5f/archive` → **200**

```json
{
  "command_id": "a98a2ab6-9909-4c52-9cea-00f8f366ca2e",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "cf2579ad-0e7a-4c58-a6ab-a63e5bb91f5f",
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
  "created_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
  "created_at": "2026-10-30T07:47:26.747622Z",
  "updated_at": "2026-10-30T07:47:37.693444Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "10d6417b-a7ac-4e2f-8e28-c741f49ce1a0",
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
  "last_heartbeat_at": "2026-10-30T07:47:33.166887Z",
  "last_location_at": "2026-10-30T07:47:33.166887Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/10d6417b-a7ac-4e2f-8e28-c741f49ce1a0/close` → **200**

```json
{
  "command_id": "426d1704-5857-4985-a05d-da9cb111ea1d",
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

Done: order 1793592a-3d2d-423a-bbe2-dee779a3a806.

# Scenario: broadcast-abuse

## Anna goes online in Warsaw

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-16408"
}
```

```json
{
  "challenge_id": "fa2163a6-f9fa-4ee7-bbe2-e160b92cc1de",
  "expires_at": "2026-10-30T07:52:38.551392176Z",
  "resend_available_at": "2026-10-30T07:47:39.551392176Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "244849",
  "sent_at": "2026-10-30T07:47:38.554895185Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fa2163a6-f9fa-4ee7-bbe2-e160b92cc1de",
  "code": "244849",
  "device_ref": "sandbox-16408"
}
```

```json
{
  "session_id": "1abcfdd5-d0c0-4bef-b0a3-497d32e218c1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NzM1OCwiaWF0IjoxNzkzMzQ2NDU4LCJqdGkiOiIyNTU5MjViYi1kNDE3LTQ0MmUtOTYxMy03NDg4NGM0ZTBjMWIiLCJzaWQiOiIxYWJjZmRkNS1kMGMwLTRiZWYtYjBhMy00OTdkMzJlMjE4YzEifQ._oz87sRQK6hEpz-KLm2vwn1TnN1BREe02XM-4iIGzAw",
  "access_expires_at": "2026-10-30T08:02:38.850805685Z",
  "refresh_token": "ufm5XmkmBAFocyT1fgIM967JpqgTUKVS315e1BNgjAQ",
  "refresh_expires_at": "2026-11-29T07:47:38.849796268Z",
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
  "command_id": "d6c09084-adb1-4ccf-ae15-cd20adeead03",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:47:39Z",
    "sequence": 1793346459660
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "481142f1-cf76-437e-8eba-220c289549ba",
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
  "last_heartbeat_at": "2026-10-30T07:47:39.680561Z",
  "last_location_at": "2026-10-30T07:47:39.680561Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## 5 seconds later her phone reports Lviv: not taken as her position

`POST /api/driver/v1/work-sessions/481142f1-cf76-437e-8eba-220c289549ba/heartbeat` → **200**

```json
{
  "location": {
    "lat": 49.8397,
    "lon": 24.0297,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:47:44Z",
    "sequence": 1793346464953
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "481142f1-cf76-437e-8eba-220c289549ba",
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
  "last_heartbeat_at": "2026-10-30T07:47:44.97518Z",
  "last_location_at": "2026-10-30T07:47:39.680561Z",
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
  "session_id": "89e7493b-2323-4e71-8bc8-5a16156df250",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDczNjUsImlhdCI6MTc5MzM0NjQ2NSwianRpIjoiMWZjNzZiNDItOWY2Mi00MGQ4LWI3OTctNTVjMTIzNGNiYTE3Iiwic2lkIjoiODllNzQ5M2ItMjMyMy00ZTcxLThiYzgtNWExNjE1NmRmMjUwIn0.kViCjIbIkMy-mzbTAtPQ97DklT0BVJXDFr6AMObfH4Y",
  "access_expires_at": "2026-10-30T08:02:45.582266782Z",
  "refresh_token": "IAuyHlZc8OOEWQtYqlefJOe2mP-dxwqkcMNcWKw7RHQ",
  "refresh_expires_at": "2026-10-30T19:47:45.581715066Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "at": "2026-10-30T07:47:45.84583112Z",
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
      "last_location_at": "2026-10-30T07:47:39.680561Z",
      "order_id": null
    }
  ]
}
```

## A fix next to the last accepted one is taken again

`POST /api/driver/v1/work-sessions/481142f1-cf76-437e-8eba-220c289549ba/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2299,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:47:46Z",
    "sequence": 1793346466131
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "481142f1-cf76-437e-8eba-220c289549ba",
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
  "last_heartbeat_at": "2026-10-30T07:47:46.150379Z",
  "last_location_at": "2026-10-30T07:47:46.150379Z",
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
  "session_id": "481142f1-cf76-437e-8eba-220c289549ba",
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
  "last_heartbeat_at": "2026-10-30T07:47:46.150379Z",
  "last_location_at": "2026-10-30T07:47:46.150379Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/481142f1-cf76-437e-8eba-220c289549ba/close` → **200**

```json
{
  "command_id": "d740c516-5f37-46a3-a62f-41faed97ebcc",
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
  "session_id": "c9287cc9-b4c8-4570-bf30-1130cc3afdfa",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDczNjcsImlhdCI6MTc5MzM0NjQ2NywianRpIjoiYmIyZTMzZWUtODI2ZC00NDQ1LTg5ZTYtZGU4MmVlNTQ2MTQ1Iiwic2lkIjoiYzkyODdjYzktYjRjOC00NTcwLWJmMzAtMTEzMGNjM2FmZGZhIn0.vdS2Y_QUmgMRDpymLLF5T5JXXMhoHJzetsb1MIz_GcI",
  "access_expires_at": "2026-10-30T08:02:47.323260277Z",
  "refresh_token": "nxzf6-CBU4nxL_l5odxSyY7g9xvrWIAW5m5OStCuT3I",
  "refresh_expires_at": "2026-10-30T19:47:47.322363295Z",
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
  "command_id": "a318be31-7739-48a2-833d-1d8053fe45c6",
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
  "session_id": "c6676826-8614-4852-80aa-30cfe2b1ba00",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDczNjgsImlhdCI6MTc5MzM0NjQ2OCwianRpIjoiZTdhMWI4YmUtMjFiNS00NjgzLTliOWItYThiYjUyZTJjMDc5Iiwic2lkIjoiYzY2NzY4MjYtODYxNC00ODUyLTgwYWEtMzBjZmUyYjFiYTAwIn0.TGZTSopw_uTcOcvUt9FEVvbv3gyZ1k_spd54ITRJcow",
  "access_expires_at": "2026-10-30T08:02:48.481187906Z",
  "refresh_token": "_Yg7Q2gc-vzxsG-A8oc455lDQv32brz1iUUTaWsuUTE",
  "refresh_expires_at": "2026-10-30T19:47:48.480540621Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.832721593",
    "linkedid": "1730052700.832721593",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672565865"
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
    "id": "1730052700.832721593",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "29c3e9de-2a8a-4323-b7f4-81e41196ef88",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380672565865",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T07:47:48.761352Z",
      "answered_at": null,
      "ended_at": "2026-10-30T07:47:48.78532Z",
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
    "id": "1730052600.2151831371",
    "linkedid": "1730052600.2151831371",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672565865"
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
      "id": "f3de0de8-88ba-482b-ac11-a0a1c024d122",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672565865",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T07:47:49.113605Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/f3de0de8-88ba-482b-ac11-a0a1c024d122/answer` → **200**

```json
{
  "command_id": "c5f17271-6549-4dfd-aaef-962ad2aa02bb"
}
```

```json
{
  "id": "f3de0de8-88ba-482b-ac11-a0a1c024d122",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672565865",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
  "order_ids": [],
  "started_at": "2026-10-30T07:47:49.113605Z",
  "answered_at": "2026-10-30T07:47:49.444296Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2151831371",
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
    "id": "1730052600.2151831371",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "f3de0de8-88ba-482b-ac11-a0a1c024d122",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672565865",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
      "order_ids": [],
      "started_at": "2026-10-30T07:47:49.113605Z",
      "answered_at": "2026-10-30T07:47:49.444296Z",
      "ended_at": "2026-10-30T07:47:49.748314Z",
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
      "id": "f3de0de8-88ba-482b-ac11-a0a1c024d122",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672565865",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
      "order_ids": [],
      "started_at": "2026-10-30T07:47:49.113605Z",
      "answered_at": "2026-10-30T07:47:49.444296Z",
      "ended_at": "2026-10-30T07:47:49.748314Z",
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
      "id": "f3de0de8-88ba-482b-ac11-a0a1c024d122",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672565865",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
      "order_ids": [],
      "started_at": "2026-10-30T07:47:49.113605Z",
      "answered_at": "2026-10-30T07:47:49.444296Z",
      "ended_at": "2026-10-30T07:47:49.748314Z",
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
      "id": "f3de0de8-88ba-482b-ac11-a0a1c024d122",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672565865",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
      "order_ids": [],
      "started_at": "2026-10-30T07:47:49.113605Z",
      "answered_at": "2026-10-30T07:47:49.444296Z",
      "ended_at": "2026-10-30T07:47:49.748314Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T07:47:55.34099Z"
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
      "id": "f3de0de8-88ba-482b-ac11-a0a1c024d122",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672565865",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
      "order_ids": [],
      "started_at": "2026-10-30T07:47:49.113605Z",
      "answered_at": "2026-10-30T07:47:49.444296Z",
      "ended_at": "2026-10-30T07:47:49.748314Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T07:47:55.34099Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/f3de0de8-88ba-482b-ac11-a0a1c024d122/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/f3de0de8-88ba-482b-ac11-a0a1c024d122/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=f3de0de8-88ba-482b-ac11-a0a1c024d122` → **200**

```json
{
  "changes": [
    {
      "id": "cb5b57df-fbbe-4686-ad48-733cda1e4a51",
      "occurred_at": "2026-10-30T07:47:57.228136Z",
      "actor_type": "STAFF",
      "actor_id": "e72a0099-0680-46dd-9ec2-670a72e54279",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "f3de0de8-88ba-482b-ac11-a0a1c024d122",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"1da0afa2-98ed-43a3-90fa-8ae0f80f95e2\", \"order_ids\": []}",
      "correlation_id": "523b04b9-ba1e-4d1e-b183-523a9b0d4270"
    },
    {
      "id": "6c4c52cc-ef02-48bb-9d79-4ff3fc963b26",
      "occurred_at": "2026-10-30T07:47:57.195675Z",
      "actor_type": "STAFF",
      "actor_id": "e72a0099-0680-46dd-9ec2-670a72e54279",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "f3de0de8-88ba-482b-ac11-a0a1c024d122",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"1da0afa2-98ed-43a3-90fa-8ae0f80f95e2\", \"order_ids\": []}",
      "correlation_id": "e8a34c5f-c545-432b-930e-7a3e4b4e65de"
    }
  ]
}
```

Done: call f3de0de8-88ba-482b-ac11-a0a1c024d122 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-4136"
}
```

```json
{
  "challenge_id": "2165cc86-ff8a-46a6-b1b6-4445e2d1725a",
  "expires_at": "2026-10-30T07:52:57.54434333Z",
  "resend_available_at": "2026-10-30T07:47:58.54434333Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "664037",
  "sent_at": "2026-10-30T07:47:57.550709653Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2165cc86-ff8a-46a6-b1b6-4445e2d1725a",
  "code": "664037",
  "device_ref": "sandbox-4136"
}
```

```json
{
  "session_id": "50390ece-44a0-4125-a790-c39d551f415f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NzM3NywiaWF0IjoxNzkzMzQ2NDc3LCJqdGkiOiIwYjU1NDBmNy0wMjViLTQ0NWEtODZiZS1hYjNjZTBmYmE0YjUiLCJzaWQiOiI1MDM5MGVjZS00NGEwLTQxMjUtYTc5MC1jMzlkNTUxZjQxNWYifQ.9WUNDLxqGU-wPbFTuT4GPL5AzXZ2balziRyJVQWeeWw",
  "access_expires_at": "2026-10-30T08:02:57.854717632Z",
  "refresh_token": "73S3w5vQNk5dQccuc41QW8_MbEY4QNl5jfO78Snw9b8",
  "refresh_expires_at": "2026-11-29T07:47:57.854093796Z",
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
  "command_id": "874200c6-bc22-4bd4-b64e-9e1294ff0520",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:47:58Z",
    "sequence": 1793346478411
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ef3929f1-fbd4-4fdb-b76e-d6d5dd723458",
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
  "last_heartbeat_at": "2026-10-30T07:47:58.431068Z",
  "last_location_at": "2026-10-30T07:47:58.431068Z",
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
  "session_id": "5432faa2-b512-49fd-9ab7-b12d0ead5ce1",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDczNzksImlhdCI6MTc5MzM0NjQ3OSwianRpIjoiYjliM2Y2ZWQtNTRlOC00ZDUwLTk3NWEtNGFiZTJjODRmYWViIiwic2lkIjoiNTQzMmZhYTItYjUxMi00OWZkLTlhYjctYjEyZDBlYWQ1Y2UxIn0.KU-037_yLw4PvaOpC8Sp5eYUy2RNgiubsdJQcs1G90o",
  "access_expires_at": "2026-10-30T08:02:59.023949584Z",
  "refresh_token": "rs57jQIcUlnjp3DmOrpsi8w_7urQwMQJKkqrhu177Xg",
  "refresh_expires_at": "2026-10-30T19:47:59.023200736Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "527e91e8-6361-44be-8973-914cfd1835f0",
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
  "id": "8f2822f6-c51c-44b9-a79b-34690e5def24",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:52:59.304605Z",
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
  "command_id": "b44b0f0c-b202-4380-b09a-9e4b5a304266",
  "quote_id": "8f2822f6-c51c-44b9-a79b-34690e5def24",
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
    "phone": "+380672051058"
  }
}
```

```json
{
  "id": "3c5e008c-dc35-4f8c-baee-5d018c63d4ad",
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
  "created_at": "2026-10-30T07:47:59.607687Z",
  "caller": {
    "name": "Олена",
    "phone": "+380672051058"
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
    "id": "7c053de5-a2ac-48e7-ad25-170f5e64f2c0",
    "order_id": "3c5e008c-dc35-4f8c-baee-5d018c63d4ad",
    "expires_at": "2026-10-30T07:48:14.614476Z",
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

`POST /api/driver/v1/offers/7c053de5-a2ac-48e7-ad25-170f5e64f2c0/accept` → **200**

```json
{
  "command_id": "b2436085-d14b-463c-9500-5cb26274a12d"
}
```

```json
{
  "id": "1f413982-88e8-4be8-bf7f-1a3f7f6f2c00",
  "order_id": "3c5e008c-dc35-4f8c-baee-5d018c63d4ad",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0fc496f9-d883-4461-b94a-237f411edecd",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380672051058` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380672051058` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380672051058` → **200**

```json
[
  {
    "phone": "+380672051058",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T07:48:01.841052628Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380672051058` → **200**

```json
[
  {
    "phone": "+380672051058",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T07:48:01.841052628Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380672051058` → **200**

```json
[
  {
    "phone": "+380672051058",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T07:48:01.841052628Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0fc496f9-d883-4461-b94a-237f411edecd",
  "order_id": "3c5e008c-dc35-4f8c-baee-5d018c63d4ad",
  "assignment_id": "1f413982-88e8-4be8-bf7f-1a3f7f6f2c00",
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
    "phone": "+380672051058"
  }
}
```

`POST /api/driver/v1/work-sessions/ef3929f1-fbd4-4fdb-b76e-d6d5dd723458/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:48:02Z",
    "sequence": 1793346482892
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ef3929f1-fbd4-4fdb-b76e-d6d5dd723458",
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
  "last_heartbeat_at": "2026-10-30T07:48:02.911464Z",
  "last_location_at": "2026-10-30T07:48:02.911464Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/0fc496f9-d883-4461-b94a-237f411edecd/arrive` → **200**

```json
{
  "command_id": "28a1b6df-c79d-4db0-ad78-e39cde1431eb",
  "expected_version": 0
}
```

```json
{
  "id": "0fc496f9-d883-4461-b94a-237f411edecd",
  "order_id": "3c5e008c-dc35-4f8c-baee-5d018c63d4ad",
  "assignment_id": "1f413982-88e8-4be8-bf7f-1a3f7f6f2c00",
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
  "arrived_at": "2026-10-30T07:48:03.191552Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380672051058"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380672051058` → **200**

```json
[
  {
    "phone": "+380672051058",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T07:48:01.841052628Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380672051058` → **200**

```json
[
  {
    "phone": "+380672051058",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T07:48:01.841052628Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380672051058` → **200**

```json
[
  {
    "phone": "+380672051058",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T07:48:01.841052628Z"
  },
  {
    "phone": "+380672051058",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T07:48:04.854898106Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380672051058` → **200**

```json
[
  {
    "phone": "+380672051058",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T07:48:01.841052628Z"
  },
  {
    "phone": "+380672051058",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T07:48:04.854898106Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380672051058` → **200**

```json
[
  {
    "phone": "+380672051058",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T07:48:01.841052628Z"
  },
  {
    "phone": "+380672051058",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T07:48:04.854898106Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/0fc496f9-d883-4461-b94a-237f411edecd/start` → **200**

```json
{
  "command_id": "bce66788-fc9e-4ac0-a828-cf859bda0e23",
  "expected_version": 1
}
```

```json
{
  "id": "0fc496f9-d883-4461-b94a-237f411edecd",
  "order_id": "3c5e008c-dc35-4f8c-baee-5d018c63d4ad",
  "assignment_id": "1f413982-88e8-4be8-bf7f-1a3f7f6f2c00",
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
  "arrived_at": "2026-10-30T07:48:03.191552Z",
  "started_at": "2026-10-30T07:48:05.61779Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380672051058"
  }
}
```

`POST /api/driver/v1/trips/0fc496f9-d883-4461-b94a-237f411edecd/complete` → **200**

```json
{
  "command_id": "10ec7a29-86ad-4b53-8cb2-818c7a66d6d7",
  "expected_version": 2,
  "reported_at": "2026-10-30T07:48:05Z",
  "cash_received": true
}
```

```json
{
  "id": "0fc496f9-d883-4461-b94a-237f411edecd",
  "order_id": "3c5e008c-dc35-4f8c-baee-5d018c63d4ad",
  "assignment_id": "1f413982-88e8-4be8-bf7f-1a3f7f6f2c00",
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
  "arrived_at": "2026-10-30T07:48:03.191552Z",
  "started_at": "2026-10-30T07:48:05.61779Z",
  "completed_at": "2026-10-30T07:48:05.912643Z",
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
  "session_id": "ef3929f1-fbd4-4fdb-b76e-d6d5dd723458",
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
  "last_heartbeat_at": "2026-10-30T07:48:02.911464Z",
  "last_location_at": "2026-10-30T07:48:02.911464Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ef3929f1-fbd4-4fdb-b76e-d6d5dd723458/close` → **200**

```json
{
  "command_id": "202edb6d-79bb-4b42-bbfd-6e86f7a390ae",
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
  "phone": "+380638784928",
  "device_ref": "sandbox-26353"
}
```

```json
{
  "challenge_id": "45298bcb-5122-412d-8d75-c4d59a4d445b",
  "expires_at": "2026-10-30T07:53:06.765600253Z",
  "resend_available_at": "2026-10-30T07:48:07.765600253Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638784928` → **200**

```json
{
  "phone": "+380638784928",
  "audience": "CLIENT",
  "code": "756805",
  "sent_at": "2026-10-30T07:48:06.769628227Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "45298bcb-5122-412d-8d75-c4d59a4d445b",
  "code": "756805",
  "device_ref": "sandbox-26353"
}
```

```json
{
  "session_id": "c926bdd0-2386-444b-9279-02b1ec60d463",
  "subject": {
    "type": "CLIENT",
    "id": "9bf29284-0112-4354-b8c8-0f27d3d45893"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmYyOTI4NC0wMTEyLTQzNTQtYjhjOC0wZjI3ZDNkNDU4OTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ3Mzg3LCJpYXQiOjE3OTMzNDY0ODcsImp0aSI6IjRiZGExMDNjLTQ1M2QtNDI2Yi04MjdkLTYzZjNlMGJiYTZmZiIsInNpZCI6ImM5MjZiZGQwLTIzODYtNDQ0Yi05Mjc5LTAyYjFlYzYwZDQ2MyJ9.fqKtrqDgivGUfASJyROr_ddudRjsZ3MBNDCE8uhADrk",
  "access_expires_at": "2026-10-30T08:03:07.062391256Z",
  "refresh_token": "w90xPWdMDBjP8e0WjKjE15y3PZSzNm6hsNu0kBQeOos",
  "refresh_expires_at": "2026-11-29T07:48:07.061863914Z",
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
  "device_ref": "sandbox-20973"
}
```

```json
{
  "challenge_id": "b36b2ca8-9a9e-4180-a350-c07527b65526",
  "expires_at": "2026-10-30T07:53:07.609492415Z",
  "resend_available_at": "2026-10-30T07:48:08.609492415Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "994786",
  "sent_at": "2026-10-30T07:48:07.612861906Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b36b2ca8-9a9e-4180-a350-c07527b65526",
  "code": "994786",
  "device_ref": "sandbox-20973"
}
```

```json
{
  "session_id": "e7899ed2-4f71-4a40-a051-be08cc1bb253",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NzM4NywiaWF0IjoxNzkzMzQ2NDg3LCJqdGkiOiI3ZWRhZTBlNi02Yzg4LTRkOTktOTc0Zi03ZDk4ZTU5YjAwMjQiLCJzaWQiOiJlNzg5OWVkMi00ZjcxLTRhNDAtYTA1MS1iZTA4Y2MxYmIyNTMifQ.awBecdtNZCMZ84Ur2iZnVKcTjV7lzhDyBEGzMcdY-d8",
  "access_expires_at": "2026-10-30T08:03:07.911976273Z",
  "refresh_token": "U-Hh_CB2yUil1BtP5qzaJ1uTzVZWHRshJ3S3JuHZBOc",
  "refresh_expires_at": "2026-11-29T07:48:07.911140264Z",
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
  "session_id": "0079f512-ed17-4dfd-aa9c-d01d534bccc1",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDczODgsImlhdCI6MTc5MzM0NjQ4OCwianRpIjoiZmRlNjM0MGItOGMzOS00OTQxLWEwODUtN2ZmY2I3YmQ2MTEyIiwic2lkIjoiMDA3OWY1MTItZWQxNy00ZGZkLWFhOWMtZDAxZDUzNGJjY2MxIn0.UWguYWnX-jAOVVeHezUA7xjW9NdiDTOPPJdEb29_Me4",
  "access_expires_at": "2026-10-30T08:03:08.810158266Z",
  "refresh_token": "yMW2E6xCq4RbmvYElUBX-OxrclyeY0YhNPuq7Ax4Kok",
  "refresh_expires_at": "2026-10-30T19:48:08.809552699Z",
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
  "session_id": "e2fb6df9-a856-4686-a541-e4b9b10f1a9d",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDczODksImlhdCI6MTc5MzM0NjQ4OSwianRpIjoiZGIyYTRhMGItZjc3ZC00OWRiLTgzZWEtYWE2ZjhjMzEyNTg4Iiwic2lkIjoiZTJmYjZkZjktYTg1Ni00Njg2LWE1NDEtZTRiOWIxMGYxYTlkIn0.Enk3M1QOhKGAYAOmsWDN273poHGLutpL5r1C6Yuim4o",
  "access_expires_at": "2026-10-30T08:03:09.393991068Z",
  "refresh_token": "9-3zTveMqi-NQrQTnSCFQmTEsA2vd9xBT-M-D8CpeQI",
  "refresh_expires_at": "2026-10-30T19:48:09.393446318Z",
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
  "command_id": "6aa1b187-0a11-4d68-933c-3deb575c407e",
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
  "id": "303e585d-b982-45b3-980f-1ebf9847e41f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:53:09.933287Z",
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
  "command_id": "c0803820-4f13-45c2-b162-9becc1b7a2fd",
  "quote_id": "303e585d-b982-45b3-980f-1ebf9847e41f",
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
  "id": "5c05b463-3d40-4d51-9a23-111a26149cd8",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9bf29284-0112-4354-b8c8-0f27d3d45893",
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
  "created_at": "2026-10-30T07:48:10.213189Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5c05b463-3d40-4d51-9a23-111a26149cd8` → **200**

```json
{
  "id": "5c05b463-3d40-4d51-9a23-111a26149cd8",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9bf29284-0112-4354-b8c8-0f27d3d45893",
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
  "created_at": "2026-10-30T07:48:10.213189Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5c05b463-3d40-4d51-9a23-111a26149cd8/cancel` → **200**

```json
{
  "command_id": "e1b43ee6-8549-46a4-a5cd-967e2a7fac1a",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "5c05b463-3d40-4d51-9a23-111a26149cd8",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9bf29284-0112-4354-b8c8-0f27d3d45893",
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
  "created_at": "2026-10-30T07:48:10.213189Z",
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
  "command_id": "3cb2823a-56ea-4c88-8519-79410a208255",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:48:11Z",
    "sequence": 1793346491415
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "2e76fe33-72a9-4ddb-a025-e4f295fc7b19",
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
  "last_heartbeat_at": "2026-10-30T07:48:11.434162Z",
  "last_location_at": "2026-10-30T07:48:11.434162Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-28178"
}
```

```json
{
  "challenge_id": "28211951-8e92-423c-b1a7-32320862c223",
  "expires_at": "2026-10-30T07:53:11.725182549Z",
  "resend_available_at": "2026-10-30T07:48:12.725182549Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "645899",
  "sent_at": "2026-10-30T07:48:11.728650344Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "28211951-8e92-423c-b1a7-32320862c223",
  "code": "645899",
  "device_ref": "sandbox-28178"
}
```

```json
{
  "session_id": "6c0918ad-10af-4f21-878a-3521a2896407",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NzM5MiwiaWF0IjoxNzkzMzQ2NDkyLCJqdGkiOiIwZDNjOWM3ZC05M2UyLTRkNGItODc3ZS1lNzE3YWM0ODUzN2EiLCJzaWQiOiI2YzA5MThhZC0xMGFmLTRmMjEtODc4YS0zNTIxYTI4OTY0MDcifQ.5AQWrSZfiq4LURiO0Aq_3zFuVmAbd42gsdVqlmApum8",
  "access_expires_at": "2026-10-30T08:03:12.022179812Z",
  "refresh_token": "3QP9e5pub91DNM8vXIIgJ8qTgKXUek2wWFuSON5Kzc0",
  "refresh_expires_at": "2026-11-29T07:48:12.021419161Z",
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
  "command_id": "e7a149c4-5406-47f1-a646-65d1576dfaa8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:48:12Z",
    "sequence": 1793346492565
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c5dbae19-410d-497c-92ea-92bc981d6cbd",
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
  "last_heartbeat_at": "2026-10-30T07:48:12.585105Z",
  "last_location_at": "2026-10-30T07:48:12.585105Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "914f1314-e863-431d-a0c4-df4f4604800b",
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
  "id": "0640459a-118b-4b4d-a1fe-fe2c6646e0a0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:53:12.870483Z",
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
  "command_id": "02f13c80-1fa4-486c-8903-a95282f5a659",
  "quote_id": "0640459a-118b-4b4d-a1fe-fe2c6646e0a0",
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
  "id": "718dbe3b-7ae1-49cd-bb88-51686ac9042f",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9bf29284-0112-4354-b8c8-0f27d3d45893",
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
  "created_at": "2026-10-30T07:48:13.152599Z",
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
    "id": "1f46f624-e866-4283-8f13-1daadf311aa3",
    "order_id": "718dbe3b-7ae1-49cd-bb88-51686ac9042f",
    "expires_at": "2026-10-30T07:48:28.156443Z",
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

`POST /api/driver/v1/offers/1f46f624-e866-4283-8f13-1daadf311aa3/accept` → **200**

```json
{
  "command_id": "4c133983-fca2-4a6f-89cd-cb78b32a27cb"
}
```

```json
{
  "id": "6dc5a295-a497-4946-94bf-ed3c7a51e364",
  "order_id": "718dbe3b-7ae1-49cd-bb88-51686ac9042f",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6d0fc409-a63b-4b65-99fc-28003edf1f01",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6d0fc409-a63b-4b65-99fc-28003edf1f01",
  "order_id": "718dbe3b-7ae1-49cd-bb88-51686ac9042f",
  "assignment_id": "6dc5a295-a497-4946-94bf-ed3c7a51e364",
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

`POST /api/driver/v1/trips/6d0fc409-a63b-4b65-99fc-28003edf1f01/cancel` → **200**

```json
{
  "command_id": "c0b93e8a-444b-438a-9440-dd02dfeeffea",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "6d0fc409-a63b-4b65-99fc-28003edf1f01",
  "order_id": "718dbe3b-7ae1-49cd-bb88-51686ac9042f",
  "assignment_id": "6dc5a295-a497-4946-94bf-ed3c7a51e364",
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

`GET /api/rider/v1/orders/718dbe3b-7ae1-49cd-bb88-51686ac9042f` → **200**

```json
{
  "id": "718dbe3b-7ae1-49cd-bb88-51686ac9042f",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "9bf29284-0112-4354-b8c8-0f27d3d45893",
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
    "id": "6dc5a295-a497-4946-94bf-ed3c7a51e364",
    "order_id": "718dbe3b-7ae1-49cd-bb88-51686ac9042f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "6d0fc409-a63b-4b65-99fc-28003edf1f01",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T07:48:13.152599Z",
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
    "id": "b4c924c0-d568-4e5c-9031-06d27219127b",
    "order_id": "718dbe3b-7ae1-49cd-bb88-51686ac9042f",
    "expires_at": "2026-10-30T07:48:29.290928Z",
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

`POST /api/driver/v1/offers/b4c924c0-d568-4e5c-9031-06d27219127b/accept` → **200**

```json
{
  "command_id": "e04bdf6e-81e2-4a5c-b429-42b11fcdb5b7"
}
```

```json
{
  "id": "20092363-bd7f-4eb2-aa1a-7b8553e4d399",
  "order_id": "718dbe3b-7ae1-49cd-bb88-51686ac9042f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "42fdccb9-fbbf-458f-b317-00137fb620e9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "42fdccb9-fbbf-458f-b317-00137fb620e9",
  "order_id": "718dbe3b-7ae1-49cd-bb88-51686ac9042f",
  "assignment_id": "20092363-bd7f-4eb2-aa1a-7b8553e4d399",
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

`POST /api/driver/v1/trips/42fdccb9-fbbf-458f-b317-00137fb620e9/cancel` → **200**

```json
{
  "command_id": "0f33df7c-7240-4016-bc5e-182bde75d1d3",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "42fdccb9-fbbf-458f-b317-00137fb620e9",
  "order_id": "718dbe3b-7ae1-49cd-bb88-51686ac9042f",
  "assignment_id": "20092363-bd7f-4eb2-aa1a-7b8553e4d399",
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
    "id": "718dbe3b-7ae1-49cd-bb88-51686ac9042f",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T07:48:13.152599Z",
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
    "id": "5c05b463-3d40-4d51-9a23-111a26149cd8",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-30T07:48:10.213189Z",
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

`GET /api/operator/v1/orders/718dbe3b-7ae1-49cd-bb88-51686ac9042f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T07:48:13.153337Z",
      "actor": {
        "type": "CLIENT",
        "id": "9bf29284-0112-4354-b8c8-0f27d3d45893",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "718dbe3b-7ae1-49cd-bb88-51686ac9042f",
        "quote_id": "0640459a-118b-4b4d-a1fe-fe2c6646e0a0",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "1225a968-2d13-4d65-89ed-893fd009ed4a"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T07:48:13.155537Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "718dbe3b-7ae1-49cd-bb88-51686ac9042f",
        "attempt_id": "5b071ea5-a538-4842-aef6-76d1b6787681",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "1225a968-2d13-4d65-89ed-893fd009ed4a"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T07:48:13.162707Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1f46f624-e866-4283-8f13-1daadf311aa3",
        "order_id": "718dbe3b-7ae1-49cd-bb88-51686ac9042f",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "1225a968-2d13-4d65-89ed-893fd009ed4a"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T07:48:13.728875Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "1f46f624-e866-4283-8f13-1daadf311aa3",
        "order_id": "718dbe3b-7ae1-49cd-bb88-51686ac9042f",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "6dc5a295-a497-4946-94bf-ed3c7a51e364"
      },
      "correlation_id": "0a0d6e14-0e88-4d23-94fb-8641d6ec2643"
```

Done: orders 5c05b463-3d40-4d51-9a23-111a26149cd8, 718dbe3b-7ae1-49cd-bb88-51686ac9042f.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738710223",
  "device_ref": "sandbox-20112"
}
```

```json
{
  "challenge_id": "f6a7f1fc-9f61-45c9-8e06-954ffb134c47",
  "expires_at": "2026-10-30T07:53:16.538082084Z",
  "resend_available_at": "2026-10-30T07:48:17.538082084Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738710223` → **200**

```json
{
  "phone": "+380738710223",
  "audience": "CLIENT",
  "code": "459101",
  "sent_at": "2026-10-30T07:48:16.540967179Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f6a7f1fc-9f61-45c9-8e06-954ffb134c47",
  "code": "459101",
  "device_ref": "sandbox-20112"
}
```

```json
{
  "session_id": "b4da9715-10e2-47d3-bc7e-998befb4bbb2",
  "subject": {
    "type": "CLIENT",
    "id": "36aad06f-73ba-44b2-95ca-ba19ccd53687"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNmFhZDA2Zi03M2JhLTQ0YjItOTVjYS1iYTE5Y2NkNTM2ODciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ3Mzk2LCJpYXQiOjE3OTMzNDY0OTYsImp0aSI6IjJjMWE2YzZmLTMyZDQtNGNjZi1iNmQwLWE1MGI2N2UxNzdkNiIsInNpZCI6ImI0ZGE5NzE1LTEwZTItNDdkMy1iYzdlLTk5OGJlZmI0YmJiMiJ9.p_vPhSl5IaV3aW8TmE3y651CyoDtBYdTool6GirfUAM",
  "access_expires_at": "2026-10-30T08:03:16.837671684Z",
  "refresh_token": "9XpdbLkGCJbPoZB_LW7GrP5GOgZR_Bybwjh8ZlIIgVc",
  "refresh_expires_at": "2026-11-29T07:48:16.837129652Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "c5e8630a-1e6b-450b-95db-8ef112fe81b5",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "a61b0ab7-7744-4445-a3bc-229cb66696f0",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-a61b0ab7-7744-4445-a3bc-229cb66696f0",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "141232a6e06e771a0517cf842f166d55",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=a61b0ab7-7744-4445-a3bc-229cb66696f0",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738710223"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=a61b0ab7-7744-4445-a3bc-229cb66696f0",
  "expires_at": "2026-10-30T08:18:17.122054Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/a61b0ab7-7744-4445-a3bc-229cb66696f0` → **200**

```json
{
  "id": "a61b0ab7-7744-4445-a3bc-229cb66696f0",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T08:18:17.122054Z",
  "card": {
    "id": "b4b24977-b6a7-4ef1-a478-714a0fb52824",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****9372",
    "card_type": "Visa",
    "created_at": "2026-10-30T07:48:17.419678Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "b4b24977-b6a7-4ef1-a478-714a0fb52824",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****9372",
      "card_type": "Visa",
      "created_at": "2026-10-30T07:48:17.419678Z"
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
  "device_ref": "sandbox-23268"
}
```

```json
{
  "challenge_id": "8d0df61e-125e-48fa-a85e-f1093273f758",
  "expires_at": "2026-10-30T07:53:17.984944518Z",
  "resend_available_at": "2026-10-30T07:48:18.984944518Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "500073",
  "sent_at": "2026-10-30T07:48:17.98819253Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8d0df61e-125e-48fa-a85e-f1093273f758",
  "code": "500073",
  "device_ref": "sandbox-23268"
}
```

```json
{
  "session_id": "ee0f8695-e4f2-4ea8-946d-5d9948f12073",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NzM5OCwiaWF0IjoxNzkzMzQ2NDk4LCJqdGkiOiJjNjUyZmYwZC1mNmJkLTQyZWItOTc3MS05YjhiZTUyZGNhZWMiLCJzaWQiOiJlZTBmODY5NS1lNGYyLTRlYTgtOTQ2ZC01ZDk5NDhmMTIwNzMifQ.tU8z71Pm7T9psb6tYauMeFQUcXXaNWWuYVdBzY_qooc",
  "access_expires_at": "2026-10-30T08:03:18.286487225Z",
  "refresh_token": "x1jzY0dJqJqbwIkE5bniBCFtfSPUa0DLdsV2-oP-rOs",
  "refresh_expires_at": "2026-11-29T07:48:18.285858551Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c5dbae19-410d-497c-92ea-92bc981d6cbd",
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
  "last_heartbeat_at": "2026-10-30T07:48:12.585105Z",
  "last_location_at": "2026-10-30T07:48:12.585105Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c5dbae19-410d-497c-92ea-92bc981d6cbd/handover` → **200**

```json
{
  "command_id": "81b6fc95-7aaf-486a-9b80-041f85235749",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c5dbae19-410d-497c-92ea-92bc981d6cbd",
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
  "last_heartbeat_at": "2026-10-30T07:48:12.585105Z",
  "last_location_at": "2026-10-30T07:48:12.585105Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 42 s to the next point)

`POST /api/driver/v1/work-sessions/c5dbae19-410d-497c-92ea-92bc981d6cbd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:49:01Z",
    "sequence": 1793346541122
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c5dbae19-410d-497c-92ea-92bc981d6cbd",
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
  "last_heartbeat_at": "2026-10-30T07:49:01.14197Z",
  "last_location_at": "2026-10-30T07:49:01.14197Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8df3d2cf-bf65-4f18-bd9d-8a4978086c2a",
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
  "id": "3d356a1f-33ad-4716-ab1f-417a5e2d68c8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:54:01.422578Z",
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
  "command_id": "6ad18dbf-a91d-461a-9ece-700e682a67da",
  "quote_id": "3d356a1f-33ad-4716-ab1f-417a5e2d68c8",
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
  "id": "7657a368-6b36-4d03-9220-78b64de885a2",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "36aad06f-73ba-44b2-95ca-ba19ccd53687",
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
  "created_at": "2026-10-30T07:49:01.721001Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7657a368-6b36-4d03-9220-78b64de885a2` → **200**

```json
{
  "id": "7657a368-6b36-4d03-9220-78b64de885a2",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "36aad06f-73ba-44b2-95ca-ba19ccd53687",
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
  "created_at": "2026-10-30T07:49:01.721001Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7657a368-6b36-4d03-9220-78b64de885a2` → **200**

```json
{
  "id": "7657a368-6b36-4d03-9220-78b64de885a2",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "36aad06f-73ba-44b2-95ca-ba19ccd53687",
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
  "created_at": "2026-10-30T07:49:01.721001Z",
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
    "id": "1f053c5a-2568-4c39-9097-22bb0b9125f9",
    "order_id": "7657a368-6b36-4d03-9220-78b64de885a2",
    "expires_at": "2026-10-30T07:49:17.21778Z",
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

`POST /api/driver/v1/offers/1f053c5a-2568-4c39-9097-22bb0b9125f9/accept` → **200**

```json
{
  "command_id": "779fec6f-2441-4d3e-a865-84c301210ce1"
}
```

```json
{
  "id": "0f5920ab-115e-46a5-a78b-2940a7fab824",
  "order_id": "7657a368-6b36-4d03-9220-78b64de885a2",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2b7782d4-eb69-461c-b38e-b10fd28f20a0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2b7782d4-eb69-461c-b38e-b10fd28f20a0",
  "order_id": "7657a368-6b36-4d03-9220-78b64de885a2",
  "assignment_id": "0f5920ab-115e-46a5-a78b-2940a7fab824",
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

`POST /api/driver/v1/work-sessions/c5dbae19-410d-497c-92ea-92bc981d6cbd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:49:10Z",
    "sequence": 1793346550407
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c5dbae19-410d-497c-92ea-92bc981d6cbd",
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
  "last_heartbeat_at": "2026-10-30T07:49:10.426169Z",
  "last_location_at": "2026-10-30T07:49:10.426169Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/2b7782d4-eb69-461c-b38e-b10fd28f20a0/arrive` → **200**

```json
{
  "command_id": "e3e235e9-ffb8-42be-9b8a-dc478931c5af",
  "expected_version": 0
}
```

```json
{
  "id": "2b7782d4-eb69-461c-b38e-b10fd28f20a0",
  "order_id": "7657a368-6b36-4d03-9220-78b64de885a2",
  "assignment_id": "0f5920ab-115e-46a5-a78b-2940a7fab824",
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
  "arrived_at": "2026-10-30T07:49:10.710691Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2b7782d4-eb69-461c-b38e-b10fd28f20a0/start` → **200**

```json
{
  "command_id": "a92bdbe6-1a48-457e-b77e-e681bdd4f9a5",
  "expected_version": 1
}
```

```json
{
  "id": "2b7782d4-eb69-461c-b38e-b10fd28f20a0",
  "order_id": "7657a368-6b36-4d03-9220-78b64de885a2",
  "assignment_id": "0f5920ab-115e-46a5-a78b-2940a7fab824",
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
  "arrived_at": "2026-10-30T07:49:10.710691Z",
  "started_at": "2026-10-30T07:49:11.002777Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2b7782d4-eb69-461c-b38e-b10fd28f20a0/complete` → **200**

```json
{
  "command_id": "fe799e6e-4dca-470c-b435-7f95835680fb",
  "expected_version": 2,
  "reported_at": "2026-10-30T07:49:11Z",
  "cash_received": true
}
```

```json
{
  "id": "2b7782d4-eb69-461c-b38e-b10fd28f20a0",
  "order_id": "7657a368-6b36-4d03-9220-78b64de885a2",
  "assignment_id": "0f5920ab-115e-46a5-a78b-2940a7fab824",
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
  "arrived_at": "2026-10-30T07:49:10.710691Z",
  "started_at": "2026-10-30T07:49:11.002777Z",
  "completed_at": "2026-10-30T07:49:11.294993Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/7657a368-6b36-4d03-9220-78b64de885a2` → **200**

```json
{
  "id": "7657a368-6b36-4d03-9220-78b64de885a2",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "36aad06f-73ba-44b2-95ca-ba19ccd53687",
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
    "id": "0f5920ab-115e-46a5-a78b-2940a7fab824",
    "order_id": "7657a368-6b36-4d03-9220-78b64de885a2",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2b7782d4-eb69-461c-b38e-b10fd28f20a0",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T07:49:01.721001Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7657a368-6b36-4d03-9220-78b64de885a2` → **200**

```json
{
  "id": "7657a368-6b36-4d03-9220-78b64de885a2",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "36aad06f-73ba-44b2-95ca-ba19ccd53687",
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
    "id": "0f5920ab-115e-46a5-a78b-2940a7fab824",
    "order_id": "7657a368-6b36-4d03-9220-78b64de885a2",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2b7782d4-eb69-461c-b38e-b10fd28f20a0",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T07:49:01.721001Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7657a368-6b36-4d03-9220-78b64de885a2` → **200**

```json
{
  "id": "7657a368-6b36-4d03-9220-78b64de885a2",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "36aad06f-73ba-44b2-95ca-ba19ccd53687",
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
    "id": "0f5920ab-115e-46a5-a78b-2940a7fab824",
    "order_id": "7657a368-6b36-4d03-9220-78b64de885a2",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2b7782d4-eb69-461c-b38e-b10fd28f20a0",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T07:49:01.721001Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7657a368-6b36-4d03-9220-78b64de885a2` → **200**

```json
{
  "id": "7657a368-6b36-4d03-9220-78b64de885a2",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "36aad06f-73ba-44b2-95ca-ba19ccd53687",
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
    "id": "0f5920ab-115e-46a5-a78b-2940a7fab824",
    "order_id": "7657a368-6b36-4d03-9220-78b64de885a2",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2b7782d4-eb69-461c-b38e-b10fd28f20a0",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T07:49:01.721001Z",
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

`GET /api/rider/v1/orders/7657a368-6b36-4d03-9220-78b64de885a2/tip` → **200**

```json
{
  "order_id": "7657a368-6b36-4d03-9220-78b64de885a2",
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
  "available_until": "2026-10-31T07:49:11.294993Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/7657a368-6b36-4d03-9220-78b64de885a2/tip` → **201**

```json
{
  "command_id": "530dea5a-26c0-417b-b9de-137e1b97a9d6",
  "amount_minor": 2500
}
```

```json
{
  "id": "5e07c662-dd71-44f8-837c-b571a7819d5c",
  "order_id": "7657a368-6b36-4d03-9220-78b64de885a2",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T07:49:16.271458Z"
}
```

`GET /api/rider/v1/orders/7657a368-6b36-4d03-9220-78b64de885a2/tip` → **200**

```json
{
  "order_id": "7657a368-6b36-4d03-9220-78b64de885a2",
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
  "available_until": "2026-10-31T07:49:11.294993Z",
  "open": false,
  "tip": {
    "id": "5e07c662-dd71-44f8-837c-b571a7819d5c",
    "order_id": "7657a368-6b36-4d03-9220-78b64de885a2",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T07:49:16.271458Z"
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
      "id": "ab788fc3-83be-422c-9381-4cdac6ef161e",
      "at": "2026-10-30T07:49:12.309291Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7657a368-6b36-4d03-9220-78b64de885a2",
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
      "id": "e1ef64e8-5706-4c54-9f53-66510ce9c7cd",
      "at": "2026-10-30T07:49:17.376738Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7657a368-6b36-4d03-9220-78b64de885a2",
      "counterpart_id": null
    },
    {
      "id": "ab788fc3-83be-422c-9381-4cdac6ef161e",
      "at": "2026-10-30T07:49:12.309291Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7657a368-6b36-4d03-9220-78b64de885a2",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "dd2c09f0-821d-4821-be0a-0a9b091ab94b",
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
  "id": "0331c010-5168-418a-9c25-879fc64677d9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:54:18.375960Z",
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
  "session_id": "a00249e9-2adc-4f5f-9650-ec01ffa1faca",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDc0NTgsImlhdCI6MTc5MzM0NjU1OCwianRpIjoiZDFlNmVkNGMtODAwMi00YzgxLWIxNjEtOTY0ZWUxMmM2MGMyIiwic2lkIjoiYTAwMjQ5ZTktMmFkYy00ZjVmLTk2NTAtZWMwMWZmYTFmYWNhIn0.zFhADGN4v5fpBKGH_ED7VoFIiO9m9T4-kBoWbLeNoJ8",
  "access_expires_at": "2026-10-30T08:04:18.972430587Z",
  "refresh_token": "q6TeaYYc3xcaGEb6UwcrF7s1hddj01l9meLgMu30Xy4",
  "refresh_expires_at": "2026-10-30T19:49:18.97192407Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380738710223` → **200**

```json
{
  "client_id": "36aad06f-73ba-44b2-95ca-ba19ccd53687"
}
```

`POST /api/admin/v1/rider-wallets/36aad06f-73ba-44b2-95ca-ba19ccd53687/top-ups` → **201**

```json
{
  "command_id": "a3d18ec9-648a-496c-b2e6-51c26346cbc4",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "36aad06f-73ba-44b2-95ca-ba19ccd53687",
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
      "id": "b02ba28b-a15c-4ef6-b6a0-fef1e3f83678",
      "at": "2026-10-30T07:49:19.513199Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "e72a0099-0680-46dd-9ec2-670a72e54279",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d3667e89-cb64-4126-8b61-9d8ef12c3c54",
  "quote_id": "0331c010-5168-418a-9c25-879fc64677d9",
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
  "id": "c576cb48-7f54-4dbd-bea6-16a6ef420818",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "36aad06f-73ba-44b2-95ca-ba19ccd53687",
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
  "created_at": "2026-10-30T07:49:19.800368Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c576cb48-7f54-4dbd-bea6-16a6ef420818` → **200**

```json
{
  "id": "c576cb48-7f54-4dbd-bea6-16a6ef420818",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "36aad06f-73ba-44b2-95ca-ba19ccd53687",
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
  "created_at": "2026-10-30T07:49:19.800368Z",
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
    "id": "afc06e83-7546-4f3f-a874-0d0936976078",
    "order_id": "c576cb48-7f54-4dbd-bea6-16a6ef420818",
    "expires_at": "2026-10-30T07:49:34.805262Z",
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

`POST /api/driver/v1/offers/afc06e83-7546-4f3f-a874-0d0936976078/accept` → **200**

```json
{
  "command_id": "ba9bc71b-63a7-41c2-8d50-ac14c6af04c9"
}
```

```json
{
  "id": "d0e0512b-26cd-4a4f-85d1-f098bef1a835",
  "order_id": "c576cb48-7f54-4dbd-bea6-16a6ef420818",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b4a95616-7d2c-474d-b2c8-64ebd2ba5260",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b4a95616-7d2c-474d-b2c8-64ebd2ba5260",
  "order_id": "c576cb48-7f54-4dbd-bea6-16a6ef420818",
  "assignment_id": "d0e0512b-26cd-4a4f-85d1-f098bef1a835",
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

`POST /api/driver/v1/work-sessions/c5dbae19-410d-497c-92ea-92bc981d6cbd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:49:21Z",
    "sequence": 1793346561189
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c5dbae19-410d-497c-92ea-92bc981d6cbd",
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
  "last_heartbeat_at": "2026-10-30T07:49:21.208476Z",
  "last_location_at": "2026-10-30T07:49:21.208476Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/b4a95616-7d2c-474d-b2c8-64ebd2ba5260/arrive` → **200**

```json
{
  "command_id": "f3d907ab-2b80-436a-aa2e-4b723b88a071",
  "expected_version": 0
}
```

```json
{
  "id": "b4a95616-7d2c-474d-b2c8-64ebd2ba5260",
  "order_id": "c576cb48-7f54-4dbd-bea6-16a6ef420818",
  "assignment_id": "d0e0512b-26cd-4a4f-85d1-f098bef1a835",
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
  "arrived_at": "2026-10-30T07:49:21.491235Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b4a95616-7d2c-474d-b2c8-64ebd2ba5260/start` → **200**

```json
{
  "command_id": "d2f0f9a9-7877-43f4-b330-7d1135a97417",
  "expected_version": 1
}
```

```json
{
  "id": "b4a95616-7d2c-474d-b2c8-64ebd2ba5260",
  "order_id": "c576cb48-7f54-4dbd-bea6-16a6ef420818",
  "assignment_id": "d0e0512b-26cd-4a4f-85d1-f098bef1a835",
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
  "arrived_at": "2026-10-30T07:49:21.491235Z",
  "started_at": "2026-10-30T07:49:21.774802Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b4a95616-7d2c-474d-b2c8-64ebd2ba5260/complete` → **200**

```json
{
  "command_id": "16f73991-aa50-4eb7-a875-97cc2d5f7646",
  "expected_version": 2,
  "reported_at": "2026-10-30T07:49:22Z",
  "cash_received": true
}
```

```json
{
  "id": "b4a95616-7d2c-474d-b2c8-64ebd2ba5260",
  "order_id": "c576cb48-7f54-4dbd-bea6-16a6ef420818",
  "assignment_id": "d0e0512b-26cd-4a4f-85d1-f098bef1a835",
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
  "arrived_at": "2026-10-30T07:49:21.491235Z",
  "started_at": "2026-10-30T07:49:21.774802Z",
  "completed_at": "2026-10-30T07:49:22.063045Z",
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
  "client_id": "36aad06f-73ba-44b2-95ca-ba19ccd53687",
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
      "id": "b02ba28b-a15c-4ef6-b6a0-fef1e3f83678",
      "at": "2026-10-30T07:49:19.513199Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "e72a0099-0680-46dd-9ec2-670a72e54279",
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

`GET /api/rider/v1/orders/c576cb48-7f54-4dbd-bea6-16a6ef420818/tip` → **200**

```json
{
  "order_id": "c576cb48-7f54-4dbd-bea6-16a6ef420818",
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
  "available_until": "2026-10-31T07:49:22.063045Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/c576cb48-7f54-4dbd-bea6-16a6ef420818/tip` → **201**

```json
{
  "command_id": "470506df-f1e9-47e9-9d7e-c72de2f2b669",
  "amount_minor": 2500
}
```

```json
{
  "id": "39018303-51cc-4bd5-909b-732a1a5d577d",
  "order_id": "c576cb48-7f54-4dbd-bea6-16a6ef420818",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T07:49:23.14942Z"
}
```

`GET /api/rider/v1/orders/c576cb48-7f54-4dbd-bea6-16a6ef420818/tip` → **200**

```json
{
  "order_id": "c576cb48-7f54-4dbd-bea6-16a6ef420818",
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
  "available_until": "2026-10-31T07:49:22.063045Z",
  "open": false,
  "tip": {
    "id": "39018303-51cc-4bd5-909b-732a1a5d577d",
    "order_id": "c576cb48-7f54-4dbd-bea6-16a6ef420818",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T07:49:23.14942Z"
  }
}
```

`GET /api/rider/v1/orders/c576cb48-7f54-4dbd-bea6-16a6ef420818/tip` → **200**

```json
{
  "order_id": "c576cb48-7f54-4dbd-bea6-16a6ef420818",
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
  "available_until": "2026-10-31T07:49:22.063045Z",
  "open": false,
  "tip": {
    "id": "39018303-51cc-4bd5-909b-732a1a5d577d",
    "order_id": "c576cb48-7f54-4dbd-bea6-16a6ef420818",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T07:49:23.14942Z"
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
      "id": "e2bbc0e9-96ea-48a0-a5a1-29597817e4ed",
      "at": "2026-10-30T07:49:24.452395Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c576cb48-7f54-4dbd-bea6-16a6ef420818",
      "counterpart_id": null
    },
    {
      "id": "05aa9572-5dd3-49a4-a163-f675ea4691fb",
      "at": "2026-10-30T07:49:22.426554Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c576cb48-7f54-4dbd-bea6-16a6ef420818",
      "counterpart_id": null
    },
    {
      "id": "e1ef64e8-5706-4c54-9f53-66510ce9c7cd",
      "at": "2026-10-30T07:49:17.376738Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7657a368-6b36-4d03-9220-78b64de885a2",
      "counterpart_id": null
    },
    {
      "id": "ab788fc3-83be-422c-9381-4cdac6ef161e",
      "at": "2026-10-30T07:49:12.309291Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7657a368-6b36-4d03-9220-78b64de885a2",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c5dbae19-410d-497c-92ea-92bc981d6cbd",
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
  "last_heartbeat_at": "2026-10-30T07:49:21.208476Z",
  "last_location_at": "2026-10-30T07:49:21.208476Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c5dbae19-410d-497c-92ea-92bc981d6cbd/close` → **200**

```json
{
  "command_id": "93ebe035-8c14-424e-a535-8cf297849213",
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

Done: card order c576cb48-7f54-4dbd-bea6-16a6ef420818.

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
  "phone": "+380736774221",
  "device_ref": "sandbox-10306"
}
```

```json
{
  "challenge_id": "c63e4b78-60d3-4098-a108-d90881f834dd",
  "expires_at": "2026-10-30T07:54:26.046176466Z",
  "resend_available_at": "2026-10-30T07:49:27.046176466Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380736774221` → **200**

```json
{
  "phone": "+380736774221",
  "audience": "CLIENT",
  "code": "491011",
  "sent_at": "2026-10-30T07:49:26.049039833Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c63e4b78-60d3-4098-a108-d90881f834dd",
  "code": "491011",
  "device_ref": "sandbox-10306"
}
```

```json
{
  "session_id": "0daec497-c044-4b06-bbcc-4f8d3f401ecd",
  "subject": {
    "type": "CLIENT",
    "id": "129d38f9-a13e-48de-a769-66538e8ee391"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMjlkMzhmOS1hMTNlLTQ4ZGUtYTc2OS02NjUzOGU4ZWUzOTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ3NDY2LCJpYXQiOjE3OTMzNDY1NjYsImp0aSI6ImExMzAxOWNhLTBlNWEtNDUxMS05NTUwLWRiN2JiZjNlNGU1MyIsInNpZCI6IjBkYWVjNDk3LWMwNDQtNGIwNi1iYmNjLTRmOGQzZjQwMWVjZCJ9.2TZUTEmPE4HQrh-32CF2if1LzvEkN6XcpxjRRemWdOA",
  "access_expires_at": "2026-10-30T08:04:26.334776371Z",
  "refresh_token": "6SOreXEZ7TnBuUCRolHRP2IPd2YjoFoQ7Ngo59PdHGg",
  "refresh_expires_at": "2026-11-29T07:49:26.334201584Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "778d9260-5476-455c-bcd9-872cfab5ff1e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "c2ee0654-78f2-4028-bc8f-c4031949572a",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-c2ee0654-78f2-4028-bc8f-c4031949572a",
    "orderDate": "1793346566",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "795fe0ee4ff3558306c7586e815ea6bc",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=c2ee0654-78f2-4028-bc8f-c4031949572a",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736774221"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=c2ee0654-78f2-4028-bc8f-c4031949572a",
  "created_at": "2026-10-30T07:49:26.6075Z",
  "expires_at": "2026-10-30T08:19:26.6075Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/c2ee0654-78f2-4028-bc8f-c4031949572a` → **200**

```json
{
  "id": "c2ee0654-78f2-4028-bc8f-c4031949572a",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T07:49:26.6075Z",
  "expires_at": "2026-10-30T08:19:26.6075Z",
  "completed_at": "2026-10-30T07:49:26.883129Z",
  "masked_pan": "41****4073",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "129d38f9-a13e-48de-a769-66538e8ee391",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "129d38f9-a13e-48de-a769-66538e8ee391",
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
      "id": "24d9581f-b0e3-4d62-a883-f4a7b9b560e1",
      "at": "2026-10-30T07:49:27.475158Z",
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
  "client_id": "129d38f9-a13e-48de-a769-66538e8ee391",
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
      "id": "24d9581f-b0e3-4d62-a883-f4a7b9b560e1",
      "at": "2026-10-30T07:49:27.475158Z",
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
  "device_ref": "sandbox-172"
}
```

```json
{
  "challenge_id": "3dfe51ff-134f-44d8-854c-442b0914708e",
  "expires_at": "2026-10-30T07:54:28.977438741Z",
  "resend_available_at": "2026-10-30T07:49:29.977438741Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "815548",
  "sent_at": "2026-10-30T07:49:28.980063286Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3dfe51ff-134f-44d8-854c-442b0914708e",
  "code": "815548",
  "device_ref": "sandbox-172"
}
```

```json
{
  "session_id": "6f04bab0-76c8-4ed3-9bed-a8823263c82e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NzQ2OSwiaWF0IjoxNzkzMzQ2NTY5LCJqdGkiOiI5ZGY4ZmE4My1kYTFhLTQ2MTEtYjAwNS0yYjc1MDE0OWFjOGYiLCJzaWQiOiI2ZjA0YmFiMC03NmM4LTRlZDMtOWJlZC1hODgyMzI2M2M4MmUifQ.1e33_p2AxSY-xka-lUzzjvAh21iEmGDYF2QpZTjq8OU",
  "access_expires_at": "2026-10-30T08:04:29.269274395Z",
  "refresh_token": "xSs41zpBZ5LfQ_8Y2XySHqGgfs6Je6-5vAt4mnV2-bE",
  "refresh_expires_at": "2026-11-29T07:49:29.268463526Z",
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
  "command_id": "58c2d1a0-94d3-4f0d-aa3c-ff3e20d0150c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "b43f3e39-a3b7-4347-8da1-c02017a2a73f",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-b43f3e39-a3b7-4347-8da1-c02017a2a73f",
    "orderDate": "1793346569",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "41893613f841a0f33ed5a6b93d5ff1f5",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=b43f3e39-a3b7-4347-8da1-c02017a2a73f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=b43f3e39-a3b7-4347-8da1-c02017a2a73f",
  "created_at": "2026-10-30T07:49:29.810185Z",
  "expires_at": "2026-10-30T08:19:29.810185Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/b43f3e39-a3b7-4347-8da1-c02017a2a73f` → **200**

```json
{
  "id": "b43f3e39-a3b7-4347-8da1-c02017a2a73f",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T07:49:29.810185Z",
  "expires_at": "2026-10-30T08:19:29.810185Z",
  "completed_at": "2026-10-30T07:49:30.077871Z",
  "masked_pan": "41****7364",
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
      "id": "c76069d9-c181-43cc-bf4d-6a0e0f03d562",
      "at": "2026-10-30T07:49:30.484916Z",
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
  "command_id": "eb6c07a3-b49f-43ee-b536-3a4a44722eac",
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
  "correlation_id": "c3f01673-7748-43a9-8946-1f817542c32e"
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
  "device_ref": "sandbox-20810"
}
```

```json
{
  "challenge_id": "55d4be75-9edc-4a71-87dc-6a08bc8de183",
  "expires_at": "2026-10-30T07:54:32.19614268Z",
  "resend_available_at": "2026-10-30T07:49:33.19614268Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "147054",
  "sent_at": "2026-10-30T07:49:32.199038981Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "55d4be75-9edc-4a71-87dc-6a08bc8de183",
  "code": "147054",
  "device_ref": "sandbox-20810"
}
```

```json
{
  "session_id": "edd6940f-e07c-4342-a468-505c2cbec0d2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NzQ3MiwiaWF0IjoxNzkzMzQ2NTcyLCJqdGkiOiJkN2QzZDg1OC0zM2ZmLTRiNGQtOTBiZS00Njk5YzUzYmQ3MDAiLCJzaWQiOiJlZGQ2OTQwZi1lMDdjLTQzNDItYTQ2OC01MDVjMmNiZWMwZDIifQ.gcFqORykrPLG_0As22eXssDIF2p3K2Znq4B71c7o5Mo",
  "access_expires_at": "2026-10-30T08:04:32.492396903Z",
  "refresh_token": "3mG575vZtH8Sq71gWZn7OQ7ultP7VtG0MSJ_6INNlLU",
  "refresh_expires_at": "2026-11-29T07:49:32.491764139Z",
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
  "command_id": "18798b74-5258-4d55-9e01-2031db268b2a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:49:33Z",
    "sequence": 1793346573307
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "748126c3-ed1c-4169-b353-811efe5a0596",
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
  "last_heartbeat_at": "2026-10-30T07:49:33.048437Z",
  "last_location_at": "2026-10-30T07:49:33.048437Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630630343",
  "device_ref": "sandbox-179"
}
```

```json
{
  "challenge_id": "79a41d77-16b9-4152-8032-4aeaa44a1d2a",
  "expires_at": "2026-10-30T07:54:33.316896045Z",
  "resend_available_at": "2026-10-30T07:49:34.316896045Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630630343` → **200**

```json
{
  "phone": "+380630630343",
  "audience": "CLIENT",
  "code": "594632",
  "sent_at": "2026-10-30T07:49:33.319442239Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "79a41d77-16b9-4152-8032-4aeaa44a1d2a",
  "code": "594632",
  "device_ref": "sandbox-179"
}
```

```json
{
  "session_id": "bb075483-ffb7-4f87-8c8c-b925e6310ce0",
  "subject": {
    "type": "CLIENT",
    "id": "50745cb5-8bc7-4cdb-bc18-1a1779e3bb11"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MDc0NWNiNS04YmM3LTRjZGItYmMxOC0xYTE3NzllM2JiMTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ3NDczLCJpYXQiOjE3OTMzNDY1NzMsImp0aSI6ImM1ZDMyZTBiLTBjNjgtNDdkYS04MzQ1LTNkMDJmMzBkOWJmZiIsInNpZCI6ImJiMDc1NDgzLWZmYjctNGY4Ny04YzhjLWI5MjVlNjMxMGNlMCJ9.MIboq_hYSXg4la010dXnXwGYBCq0t5YZI6d9p9tbHZU",
  "access_expires_at": "2026-10-30T08:04:33.611844279Z",
  "refresh_token": "nH3M_QA2HuuyfqV1nEG7wzmi1DrkP4DWNCAMjQYMLqA",
  "refresh_expires_at": "2026-11-29T07:49:33.61134433Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a5c32a6f-e6f8-4c86-b53f-d6169c40deb1",
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
  "id": "50998d1a-5b0f-42d8-87af-730449a42dcc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:54:33.890420Z",
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
  "command_id": "a2fa9db3-a1d7-4cf8-a491-8458ad38c6bc",
  "quote_id": "50998d1a-5b0f-42d8-87af-730449a42dcc",
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
  "id": "8ce058ab-9651-4f18-a531-db0443d47210",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "50745cb5-8bc7-4cdb-bc18-1a1779e3bb11",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T07:49:34.166581Z",
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
    "id": "778eb151-aec7-4949-a5e3-4aec6ccbc30f",
    "order_id": "8ce058ab-9651-4f18-a531-db0443d47210",
    "expires_at": "2026-10-30T07:49:49.170084Z",
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

`POST /api/driver/v1/offers/778eb151-aec7-4949-a5e3-4aec6ccbc30f/accept` → **200**

```json
{
  "command_id": "4079e8fa-d925-4fb9-a1a8-8d74cc66e57d"
}
```

```json
{
  "id": "729265c8-6acf-4b54-b23b-62a4aca8e4b3",
  "order_id": "8ce058ab-9651-4f18-a531-db0443d47210",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4bfc701f-d920-4b74-8cac-fd88cbeabacd",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4bfc701f-d920-4b74-8cac-fd88cbeabacd",
  "order_id": "8ce058ab-9651-4f18-a531-db0443d47210",
  "assignment_id": "729265c8-6acf-4b54-b23b-62a4aca8e4b3",
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

`POST /api/driver/v1/work-sessions/748126c3-ed1c-4169-b353-811efe5a0596/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:49:35Z",
    "sequence": 1793346575279
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "748126c3-ed1c-4169-b353-811efe5a0596",
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
  "last_heartbeat_at": "2026-10-30T07:49:35.297652Z",
  "last_location_at": "2026-10-30T07:49:35.297652Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/4bfc701f-d920-4b74-8cac-fd88cbeabacd/arrive` → **200**

```json
{
  "command_id": "c1ad0e2f-bb57-4921-a98f-5abbef64dcc6",
  "expected_version": 0
}
```

```json
{
  "id": "4bfc701f-d920-4b74-8cac-fd88cbeabacd",
  "order_id": "8ce058ab-9651-4f18-a531-db0443d47210",
  "assignment_id": "729265c8-6acf-4b54-b23b-62a4aca8e4b3",
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
  "arrived_at": "2026-10-30T07:49:35.579521Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4bfc701f-d920-4b74-8cac-fd88cbeabacd/start` → **200**

```json
{
  "command_id": "b752e993-22eb-46b1-9f22-8e1f4e9c7d53",
  "expected_version": 1
}
```

```json
{
  "id": "4bfc701f-d920-4b74-8cac-fd88cbeabacd",
  "order_id": "8ce058ab-9651-4f18-a531-db0443d47210",
  "assignment_id": "729265c8-6acf-4b54-b23b-62a4aca8e4b3",
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
  "arrived_at": "2026-10-30T07:49:35.579521Z",
  "started_at": "2026-10-30T07:49:35.863944Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4bfc701f-d920-4b74-8cac-fd88cbeabacd/complete` → **200**

```json
{
  "command_id": "a2c2bbba-4f93-470f-9ae3-65b367495404",
  "expected_version": 2,
  "reported_at": "2026-10-30T07:49:36Z",
  "cash_received": false
}
```

```json
{
  "id": "4bfc701f-d920-4b74-8cac-fd88cbeabacd",
  "order_id": "8ce058ab-9651-4f18-a531-db0443d47210",
  "assignment_id": "729265c8-6acf-4b54-b23b-62a4aca8e4b3",
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
  "arrived_at": "2026-10-30T07:49:35.579521Z",
  "started_at": "2026-10-30T07:49:35.863944Z",
  "completed_at": "2026-10-30T07:49:36.146648Z",
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
  "session_id": "cf86677e-7a0e-4ed3-a53e-a665de6a20da",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDc0NzYsImlhdCI6MTc5MzM0NjU3NiwianRpIjoiZDUwYWFlOGEtMTczNy00ZWNhLWFkMzMtNjk1NTY2NGE3NGZjIiwic2lkIjoiY2Y4NjY3N2UtN2EwZS00ZWQzLWE1M2UtYTY2NWRlNmEyMGRhIn0.Z_bYk43BUeCYFpEQ8rkL99VLetKzU0DoIGhpFq09tQ0",
  "access_expires_at": "2026-10-30T08:04:36.753129551Z",
  "refresh_token": "DscxlHDG-fw0EjA5YryCmy6SKULe9oakm_K35E182vw",
  "refresh_expires_at": "2026-10-30T19:49:36.752598499Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/8ce058ab-9651-4f18-a531-db0443d47210/cash-dispute` → **200**

```json
{
  "order_id": "8ce058ab-9651-4f18-a531-db0443d47210",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "50745cb5-8bc7-4cdb-bc18-1a1779e3bb11",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T07:49:36.550896Z",
  "decide_by": "2026-11-13T07:49:36.550896Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T07:49:36.550896Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "8ce058ab-9651-4f18-a531-db0443d47210",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "50745cb5-8bc7-4cdb-bc18-1a1779e3bb11",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T07:49:36.550896Z",
      "decide_by": "2026-11-13T07:49:36.550896Z",
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

`POST /api/admin/v1/orders/8ce058ab-9651-4f18-a531-db0443d47210/cash-dispute/decide` → **400**

```json
{
  "command_id": "90bc868f-56cb-4f5c-9224-6780381555a3",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/8ce058ab-9651-4f18-a531-db0443d47210/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "57b00967-89ad-4de1-bea4-479ffb79344a",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/8ce058ab-9651-4f18-a531-db0443d47210/cash-dispute/decide` → **200**

```json
{
  "command_id": "e3e6cc79-e40c-45f9-8729-deee6c67d0c4",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "8ce058ab-9651-4f18-a531-db0443d47210",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "50745cb5-8bc7-4cdb-bc18-1a1779e3bb11",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T07:49:36.550896Z",
  "decide_by": "2026-11-13T07:49:36.550896Z",
  "decision": "PAY_DRIVER",
  "decided_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T07:49:37.898092Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/8ce058ab-9651-4f18-a531-db0443d47210/cash-dispute/decide` → **409**

```json
{
  "command_id": "34dc26bb-f4c9-4fed-b611-bc0bda769d38",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/8ce058ab-9651-4f18-a531-db0443d47210/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6f560059-ddc4-48a2-9e7f-dc7c22d1b434"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "748126c3-ed1c-4169-b353-811efe5a0596",
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
  "last_heartbeat_at": "2026-10-30T07:49:35.297652Z",
  "last_location_at": "2026-10-30T07:49:35.297652Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/748126c3-ed1c-4169-b353-811efe5a0596/close` → **200**

```json
{
  "command_id": "42aa0eee-045b-4e4d-835b-476d3075c209",
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
  "phone": "+380730318476",
  "device_ref": "sandbox-28908"
}
```

```json
{
  "challenge_id": "76989f34-0e08-454d-9d26-ebc8b060c2c0",
  "expires_at": "2026-10-30T07:54:39.022184568Z",
  "resend_available_at": "2026-10-30T07:49:40.022184568Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380730318476` → **200**

```json
{
  "phone": "+380730318476",
  "audience": "CLIENT",
  "code": "533918",
  "sent_at": "2026-10-30T07:49:39.024763617Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "76989f34-0e08-454d-9d26-ebc8b060c2c0",
  "code": "533918",
  "device_ref": "sandbox-28908"
}
```

```json
{
  "session_id": "5b1247ca-e0bf-4582-b9dc-99de9ff656a6",
  "subject": {
    "type": "CLIENT",
    "id": "56850424-c57b-4c76-b704-603ea4cf01dd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1Njg1MDQyNC1jNTdiLTRjNzYtYjcwNC02MDNlYTRjZjAxZGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ3NDc5LCJpYXQiOjE3OTMzNDY1NzksImp0aSI6ImEzNzJiZmU2LTFlMDktNDgwNy1iZmMzLTA3YTU2ZDYzMjY3MSIsInNpZCI6IjViMTI0N2NhLWUwYmYtNDU4Mi1iOWRjLTk5ZGU5ZmY2NTZhNiJ9.Pda-MeAxBtpWeuzuHkuHoPZyDS5cvwrdHuFap93PSEg",
  "access_expires_at": "2026-10-30T08:04:39.316845154Z",
  "refresh_token": "w4nOqYhVXyBNK582NsDGk0A751A_Q2XCugtRdHiU9Fg",
  "refresh_expires_at": "2026-11-29T07:49:39.316281758Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "9a63bd5c-f0e9-4205-b716-a2d7290160f2",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "3bc17f50-8a4c-4bc7-aab6-e006fe5cc5a6",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-3bc17f50-8a4c-4bc7-aab6-e006fe5cc5a6",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "26ef192363e11ded30a6121f46250e77",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=3bc17f50-8a4c-4bc7-aab6-e006fe5cc5a6",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730318476"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=3bc17f50-8a4c-4bc7-aab6-e006fe5cc5a6",
  "expires_at": "2026-10-30T08:19:39.591523Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/3bc17f50-8a4c-4bc7-aab6-e006fe5cc5a6` → **200**

```json
{
  "id": "3bc17f50-8a4c-4bc7-aab6-e006fe5cc5a6",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T08:19:39.591523Z",
  "card": {
    "id": "a5403748-2f4d-44de-b45f-e5cb1b292b5b",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2927",
    "card_type": "Visa",
    "created_at": "2026-10-30T07:49:39.867938Z"
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
  "device_ref": "sandbox-2448"
}
```

```json
{
  "challenge_id": "d014013f-0adf-4068-8d47-3819eaeb8331",
  "expires_at": "2026-10-30T07:54:40.161582035Z",
  "resend_available_at": "2026-10-30T07:49:41.161582035Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "899135",
  "sent_at": "2026-10-30T07:49:40.164093159Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d014013f-0adf-4068-8d47-3819eaeb8331",
  "code": "899135",
  "device_ref": "sandbox-2448"
}
```

```json
{
  "session_id": "324d20b1-778d-485f-94fc-f4861da5a973",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NzQ4MCwiaWF0IjoxNzkzMzQ2NTgwLCJqdGkiOiIwMDM1NTEyNy1mNDBkLTQyZDEtOWFiNy04ZTAzMTJjMThkZWUiLCJzaWQiOiIzMjRkMjBiMS03NzhkLTQ4NWYtOTRmYy1mNDg2MWRhNWE5NzMifQ.ln3TTJy2KlR1M7F71hqRr7-sVJBXj5-dIXVWgRfQUNM",
  "access_expires_at": "2026-10-30T08:04:40.460637181Z",
  "refresh_token": "y-QuzIWQNlT_YPCkKfOiQ-7vqctfpRsR-3MOXoEsGq4",
  "refresh_expires_at": "2026-11-29T07:49:40.460168396Z",
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
  "command_id": "bf81c337-ebbc-4297-a3f4-7656d7871c2a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:49:41Z",
    "sequence": 1793346581145
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "851cb256-6074-4c3a-aa38-3fa4a6b48be2",
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
  "last_heartbeat_at": "2026-10-30T07:49:41.032234Z",
  "last_location_at": "2026-10-30T07:49:41.032234Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a3dcf306-b14a-425c-a591-fa3429c2f31f",
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
  "id": "ab95823e-429e-45cf-bec9-d76a6c2f8696",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:54:41.319703Z",
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
  "command_id": "38cceeab-c40c-44a9-bc93-3fddc0b49eeb",
  "quote_id": "ab95823e-429e-45cf-bec9-d76a6c2f8696",
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
  "id": "c927c85f-01df-4b5c-9ad8-c03fefa9665b",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "56850424-c57b-4c76-b704-603ea4cf01dd",
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
  "created_at": "2026-10-30T07:49:41.612245Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c927c85f-01df-4b5c-9ad8-c03fefa9665b` → **200**

```json
{
  "id": "c927c85f-01df-4b5c-9ad8-c03fefa9665b",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "56850424-c57b-4c76-b704-603ea4cf01dd",
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
  "created_at": "2026-10-30T07:49:41.612245Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c927c85f-01df-4b5c-9ad8-c03fefa9665b` → **200**

```json
{
  "id": "c927c85f-01df-4b5c-9ad8-c03fefa9665b",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "56850424-c57b-4c76-b704-603ea4cf01dd",
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
  "created_at": "2026-10-30T07:49:41.612245Z",
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
    "id": "e89069b6-c31d-485c-a567-df56c4552ead",
    "order_id": "c927c85f-01df-4b5c-9ad8-c03fefa9665b",
    "expires_at": "2026-10-30T07:49:57.596282Z",
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

`POST /api/driver/v1/offers/e89069b6-c31d-485c-a567-df56c4552ead/accept` → **200**

```json
{
  "command_id": "2b910824-0b38-4b5d-a18b-f9c060de9a41"
}
```

```json
{
  "id": "c578e2f9-a3c0-469a-8646-8615ebe1a90e",
  "order_id": "c927c85f-01df-4b5c-9ad8-c03fefa9665b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8e8873f7-cb70-46d6-8b74-534d74484e94",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8e8873f7-cb70-46d6-8b74-534d74484e94",
  "order_id": "c927c85f-01df-4b5c-9ad8-c03fefa9665b",
  "assignment_id": "c578e2f9-a3c0-469a-8646-8615ebe1a90e",
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

`POST /api/rider/v1/orders/c927c85f-01df-4b5c-9ad8-c03fefa9665b/messages` → **201**

```json
{
  "command_id": "1c3918d5-04f9-42e9-8c32-b05fddd953ea",
  "body": "Я біля входу, мій номер +380730318476, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "7913d9f0-685b-44e7-914c-60f4d8a4d3fc",
  "order_id": "c927c85f-01df-4b5c-9ad8-c03fefa9665b",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380730318476, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T07:49:44.284252597Z"
}
```

`POST /api/driver/v1/trips/8e8873f7-cb70-46d6-8b74-534d74484e94/messages` → **201**

```json
{
  "command_id": "2168824f-4725-4d11-a3d6-b38910b6eccb",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "01c32a9e-f28e-4ffc-9a69-10e8541576c5",
  "order_id": "c927c85f-01df-4b5c-9ad8-c03fefa9665b",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T07:49:44.568606598Z"
}
```

(the car drives 6 s to the next point)

`POST /api/driver/v1/work-sessions/851cb256-6074-4c3a-aa38-3fa4a6b48be2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:49:50Z",
    "sequence": 1793346590869
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "851cb256-6074-4c3a-aa38-3fa4a6b48be2",
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
  "last_heartbeat_at": "2026-10-30T07:49:50.887892Z",
  "last_location_at": "2026-10-30T07:49:50.887892Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/8e8873f7-cb70-46d6-8b74-534d74484e94/arrive` → **200**

```json
{
  "command_id": "3ee317e1-d5a7-4f35-948d-002593bc8d6e",
  "expected_version": 0
}
```

```json
{
  "id": "8e8873f7-cb70-46d6-8b74-534d74484e94",
  "order_id": "c927c85f-01df-4b5c-9ad8-c03fefa9665b",
  "assignment_id": "c578e2f9-a3c0-469a-8646-8615ebe1a90e",
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
  "arrived_at": "2026-10-30T07:49:51.17259Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8e8873f7-cb70-46d6-8b74-534d74484e94/start` → **200**

```json
{
  "command_id": "6aa56741-da85-4139-a0d3-a6e8fe7b8bd9",
  "expected_version": 1
}
```

```json
{
  "id": "8e8873f7-cb70-46d6-8b74-534d74484e94",
  "order_id": "c927c85f-01df-4b5c-9ad8-c03fefa9665b",
  "assignment_id": "c578e2f9-a3c0-469a-8646-8615ebe1a90e",
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
  "arrived_at": "2026-10-30T07:49:51.17259Z",
  "started_at": "2026-10-30T07:49:51.457466Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 90 s to the next point)

`POST /api/driver/v1/work-sessions/851cb256-6074-4c3a-aa38-3fa4a6b48be2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:51:21Z",
    "sequence": 1793346681747
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "851cb256-6074-4c3a-aa38-3fa4a6b48be2",
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
  "last_heartbeat_at": "2026-10-30T07:51:21.766035Z",
  "last_location_at": "2026-10-30T07:51:21.766035Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/8e8873f7-cb70-46d6-8b74-534d74484e94/complete` → **200**

```json
{
  "command_id": "137a4f95-6930-45a1-8478-10d50e402a16",
  "expected_version": 2,
  "reported_at": "2026-10-30T07:51:22Z",
  "cash_received": false
}
```

```json
{
  "id": "8e8873f7-cb70-46d6-8b74-534d74484e94",
  "order_id": "c927c85f-01df-4b5c-9ad8-c03fefa9665b",
  "assignment_id": "c578e2f9-a3c0-469a-8646-8615ebe1a90e",
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
  "arrived_at": "2026-10-30T07:49:51.17259Z",
  "started_at": "2026-10-30T07:49:51.457466Z",
  "completed_at": "2026-10-30T07:51:22.051804Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/c927c85f-01df-4b5c-9ad8-c03fefa9665b` → **200**

```json
{
  "id": "c927c85f-01df-4b5c-9ad8-c03fefa9665b",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "56850424-c57b-4c76-b704-603ea4cf01dd",
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
    "id": "c578e2f9-a3c0-469a-8646-8615ebe1a90e",
    "order_id": "c927c85f-01df-4b5c-9ad8-c03fefa9665b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "8e8873f7-cb70-46d6-8b74-534d74484e94",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T07:49:41.612245Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c927c85f-01df-4b5c-9ad8-c03fefa9665b` → **200**

```json
{
  "id": "c927c85f-01df-4b5c-9ad8-c03fefa9665b",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "56850424-c57b-4c76-b704-603ea4cf01dd",
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
    "id": "c578e2f9-a3c0-469a-8646-8615ebe1a90e",
    "order_id": "c927c85f-01df-4b5c-9ad8-c03fefa9665b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "8e8873f7-cb70-46d6-8b74-534d74484e94",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T07:49:41.612245Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c927c85f-01df-4b5c-9ad8-c03fefa9665b` → **200**

```json
{
  "id": "c927c85f-01df-4b5c-9ad8-c03fefa9665b",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "56850424-c57b-4c76-b704-603ea4cf01dd",
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
    "id": "c578e2f9-a3c0-469a-8646-8615ebe1a90e",
    "order_id": "c927c85f-01df-4b5c-9ad8-c03fefa9665b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "8e8873f7-cb70-46d6-8b74-534d74484e94",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T07:49:41.612245Z",
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
  "session_id": "851cb256-6074-4c3a-aa38-3fa4a6b48be2",
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
  "last_heartbeat_at": "2026-10-30T07:51:21.766035Z",
  "last_location_at": "2026-10-30T07:51:21.766035Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/851cb256-6074-4c3a-aa38-3fa4a6b48be2/close` → **200**

```json
{
  "command_id": "2b80a1bc-9c77-478e-aad0-c10a23736639",
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
  "session_id": "5ea8ea1e-31ff-4efb-8dc0-f4a05c22d664",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDc1ODYsImlhdCI6MTc5MzM0NjY4NiwianRpIjoiYzhjMGFiOTAtMjE0MC00ODQ2LWIyY2ItNDFlYjY4MWE4MTljIiwic2lkIjoiNWVhOGVhMWUtMzFmZi00ZWZiLThkYzAtZjRhMDVjMjJkNjY0In0._kRjFawrlDX2box_3Wy00yCtA3fiQt4kGQSSu7VA-B4",
  "access_expires_at": "2026-10-30T08:06:26.044273438Z",
  "refresh_token": "56KKTeiFEjifhkhl81ptSClAgcB-YR-JUUOj11LRyvA",
  "refresh_expires_at": "2026-10-30T19:51:26.043739131Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/c927c85f-01df-4b5c-9ad8-c03fefa9665b/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/c927c85f-01df-4b5c-9ad8-c03fefa9665b/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "9d5f79fa-7d53-4fb9-84d8-794b8f6b807d"
}
```

`GET /api/admin/v1/orders/c927c85f-01df-4b5c-9ad8-c03fefa9665b/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T07:51:26.585231251Z",
  "order": {
    "id": "c927c85f-01df-4b5c-9ad8-c03fefa9665b",
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
    "created_at": "2026-10-30T07:49:41.612245Z",
    "assigned_at": "2026-10-30T07:49:43.740974Z",
    "arrived_at": "2026-10-30T07:49:51.17259Z",
    "started_at": "2026-10-30T07:49:51.457466Z",
    "completed_at": "2026-10-30T07:51:22.051804Z"
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
    "id": "56850424-c57b-4c76-b704-603ea4cf01dd",
    "registered_at": "2026-10-30T07:49:39.314189Z",
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
      "created_at": "2026-10-30T07:49:41.614994Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T07:51:22.791065Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/c927c85f-01df-4b5c-9ad8-c03fefa9665b/chargebacks` → **422**

```json
{
  "command_id": "04ec0d13-362a-4f2f-ad86-1d9dfb9f74f4",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/c927c85f-01df-4b5c-9ad8-c03fefa9665b/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "c3a5a601-c807-466e-80a8-37d609eae15e"
}
```

`POST /api/admin/v1/orders/c927c85f-01df-4b5c-9ad8-c03fefa9665b/chargebacks` → **201**

```json
{
  "command_id": "ce504d1e-6bc9-458b-8774-4e3c71e37faa",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "d544f4b9-3785-410d-8969-1571255592d6",
  "order_id": "c927c85f-01df-4b5c-9ad8-c03fefa9665b",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T07:51:27.267252Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/c927c85f-01df-4b5c-9ad8-c03fefa9665b/chargebacks` → **201**

```json
{
  "command_id": "ce504d1e-6bc9-458b-8774-4e3c71e37faa",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "d544f4b9-3785-410d-8969-1571255592d6",
  "order_id": "c927c85f-01df-4b5c-9ad8-c03fefa9665b",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T07:51:27.267252Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/56850424-c57b-4c76-b704-603ea4cf01dd` → **200**

```json
{
  "client": {
    "id": "56850424-c57b-4c76-b704-603ea4cf01dd",
    "phone": "+380730318476",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T07:49:39.314189Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "c927c85f-01df-4b5c-9ad8-c03fefa9665b",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T07:49:41.612245Z",
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

`POST /api/admin/v1/orders/c927c85f-01df-4b5c-9ad8-c03fefa9665b/chargebacks/d544f4b9-3785-410d-8969-1571255592d6/resolve` → **200**

```json
{
  "command_id": "b38c7fc1-3ba4-4cb6-ab91-5ef87d21937b",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "d544f4b9-3785-410d-8969-1571255592d6",
  "order_id": "c927c85f-01df-4b5c-9ad8-c03fefa9665b",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T07:51:27.267252Z",
  "resolved_at": "2026-10-30T07:51:28.17372Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/56850424-c57b-4c76-b704-603ea4cf01dd` → **200**

```json
{
  "client": {
    "id": "56850424-c57b-4c76-b704-603ea4cf01dd",
    "phone": "+380730318476",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T07:49:39.314189Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "c927c85f-01df-4b5c-9ad8-c03fefa9665b",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T07:49:41.612245Z",
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

`GET /api/admin/v1/clients/56850424-c57b-4c76-b704-603ea4cf01dd` → **200**

```json
{
  "client": {
    "id": "56850424-c57b-4c76-b704-603ea4cf01dd",
    "phone": "+380730318476",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T07:49:39.314189Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "c927c85f-01df-4b5c-9ad8-c03fefa9665b",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T07:49:41.612245Z",
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

`POST /api/admin/v1/orders/c927c85f-01df-4b5c-9ad8-c03fefa9665b/chargebacks/d544f4b9-3785-410d-8969-1571255592d6/resolve` → **409**

```json
{
  "command_id": "d86ca848-1257-4a2a-98e5-5048a5dfd81e",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/c927c85f-01df-4b5c-9ad8-c03fefa9665b/chargebacks/d544f4b9-3785-410d-8969-1571255592d6/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4f26250a-5002-4765-ad33-9429f9edf59c"
}
```

`GET /api/admin/v1/orders/c927c85f-01df-4b5c-9ad8-c03fefa9665b/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "d544f4b9-3785-410d-8969-1571255592d6",
      "order_id": "c927c85f-01df-4b5c-9ad8-c03fefa9665b",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T07:51:27.267252Z",
      "resolved_at": "2026-10-30T07:51:28.17372Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order c927c85f-01df-4b5c-9ad8-c03fefa9665b without phone or card digits; chargeback d544f4b9-3785-410d-8969-1571255592d6 recorded and won.

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
  "session_id": "492b1c1f-dcf0-4487-bd58-331cb13a6d02",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDc1OTEsImlhdCI6MTc5MzM0NjY5MSwianRpIjoiNDBmY2ZjNGQtNDNkMC00ODM3LWExMDYtOTFiNjRhYTZkZWQ0Iiwic2lkIjoiNDkyYjFjMWYtZGNmMC00NDg3LWJkNTgtMzMxY2IxM2E2ZDAyIn0.v4t_Byka-fHoznHNPvvEDcX4zSGl4wPecd8_RWRRhhs",
  "access_expires_at": "2026-10-30T08:06:31.236255259Z",
  "refresh_token": "iMN2_9k8eBh1u7zdF8s98Xfkh5ezKeJKnuCZaAQ0rZ0",
  "refresh_expires_at": "2026-10-30T19:51:31.235780381Z",
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
  "phone": "+48600915918",
  "device_ref": "sandbox-25057"
}
```

```json
{
  "challenge_id": "a1ea1684-f1b0-4c2b-afb7-82e2460bd1dd",
  "expires_at": "2026-10-30T07:56:32.084107437Z",
  "resend_available_at": "2026-10-30T07:51:33.084107437Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600915918` → **200**

```json
{
  "phone": "+48600915918",
  "audience": "CLIENT",
  "code": "903872",
  "sent_at": "2026-10-30T07:51:32.086856777Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a1ea1684-f1b0-4c2b-afb7-82e2460bd1dd",
  "code": "903872",
  "device_ref": "sandbox-25057"
}
```

```json
{
  "session_id": "6a6b2112-4661-4515-973c-9f30e345676c",
  "subject": {
    "type": "CLIENT",
    "id": "8602d673-cb8a-415d-8b34-827b7814f6d3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjAyZDY3My1jYjhhLTQxNWQtOGIzNC04MjdiNzgxNGY2ZDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ3NTkyLCJpYXQiOjE3OTMzNDY2OTIsImp0aSI6IjJiNzA4MmY4LTEwZWMtNDFjNS05YjRhLTFhNWFhNzg0OTcwNSIsInNpZCI6IjZhNmIyMTEyLTQ2NjEtNDUxNS05NzNjLTlmMzBlMzQ1Njc2YyJ9.dNJZ1IsZ7N-yMax9iLe_Jry8D4wTsswNz64D6HNxkto",
  "access_expires_at": "2026-10-30T08:06:32.38713363Z",
  "refresh_token": "sfUxgCRcHsOB6SQqvo8OH8q0apGQEQ77Pw5gmtsd6kk",
  "refresh_expires_at": "2026-11-29T07:51:32.386578104Z",
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
  "command_id": "acb990cb-c82c-4e51-a37e-375e07ed8dd9",
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
  "correlation_id": "34a66ce5-0241-49e7-8874-342a2e191c92",
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
  "command_id": "3581294d-c085-4287-aa09-7ca86f815c37",
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
  "paused_at": "2026-10-30T07:51:33.490590189Z",
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
  "command_id": "1c26d8cd-6871-4ab1-af9c-c3ec95911aba",
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
  "id": "f5bda1c0-39ac-43a8-9092-31cbc8f2e4d3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:56:34.061868Z",
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
  "command_id": "2affacad-4ee5-4bd7-9587-4ba83ea8de91",
  "quote_id": "f5bda1c0-39ac-43a8-9092-31cbc8f2e4d3",
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
  "correlation_id": "12e84be5-ec40-4c79-ae49-ffb77087d3dc"
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
  "paused_at": "2026-10-30T07:51:33.49059Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "cbf95723-b36b-42f5-ac4c-86730fb04feb",
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
  "command_id": "b9097d6b-58db-4a7f-b0d0-66db2ae5db45",
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
  "command_id": "7952ae2b-893e-4439-b2b4-79b3d97abb07",
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
  "id": "4a1bb447-4458-44b4-8baa-2f56e8c55d47",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:56:35.740419Z",
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
  "command_id": "b7cd89bf-0695-4d4c-83f6-4056c5afea25",
  "quote_id": "4a1bb447-4458-44b4-8baa-2f56e8c55d47",
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
  "correlation_id": "cd1ddb0e-8178-4465-95b0-33de35d556cb"
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
  "command_id": "770bced7-7c74-4aa0-a301-5d65812c7d4c",
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
  "command_id": "fda9982e-46e2-438f-afe0-0169822a19f5",
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
  "id": "b4a94332-9b5d-4c3f-8569-df6202884cb7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:56:36.852735Z",
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
  "command_id": "624b5c29-f0dc-4781-8a7f-e6d7b73cc445",
  "quote_id": "b4a94332-9b5d-4c3f-8569-df6202884cb7",
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
  "correlation_id": "758565eb-7bf6-4aa8-9245-aa6c7e8b0fe2"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "5e1cc36e-9ade-4712-94bd-bfcf721e5ee6",
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
  "correlation_id": "3bcba365-6ccb-4473-a35e-37881833f948"
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
  "command_id": "84fda49d-9b89-4ed9-85a6-37e56290623b",
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
  "phone": "+380673778687",
  "device_ref": "sandbox-2744"
}
```

```json
{
  "challenge_id": "6c13b716-9b50-44e7-b3b8-102d69ae4096",
  "expires_at": "2026-10-30T07:56:38.284561442Z",
  "resend_available_at": "2026-10-30T07:51:39.284561442Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673778687` → **200**

```json
{
  "phone": "+380673778687",
  "audience": "CLIENT",
  "code": "136498",
  "sent_at": "2026-10-30T07:51:38.287146219Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6c13b716-9b50-44e7-b3b8-102d69ae4096",
  "code": "136498",
  "device_ref": "sandbox-2744"
}
```

```json
{
  "session_id": "3feeef7a-1a87-4403-8ae2-bfe673611cd6",
  "subject": {
    "type": "CLIENT",
    "id": "9ff47607-c97b-4235-907c-7d89c2a8d171"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmY0NzYwNy1jOTdiLTQyMzUtOTA3Yy03ZDg5YzJhOGQxNzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ3NTk4LCJpYXQiOjE3OTMzNDY2OTgsImp0aSI6IjlmZjUzNDhlLTgzODMtNDk5My1hYmE4LWZjYjY1NTVhYWEyNiIsInNpZCI6IjNmZWVlZjdhLTFhODctNDQwMy04YWUyLWJmZTY3MzYxMWNkNiJ9.FvLJ_PYS4ZcY4kkzCWCgljZkmLVdfYziheo3QFZoQlQ",
  "access_expires_at": "2026-10-30T08:06:38.575872353Z",
  "refresh_token": "b2NGMx5-izmzBG7MDpzoFyEG_DNlJLkjTbix8Mdv3Cg",
  "refresh_expires_at": "2026-11-29T07:51:38.575316409Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9ff47607-c97b-4235-907c-7d89c2a8d171",
  "session_id": "3feeef7a-1a87-4403-8ae2-bfe673611cd6",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ad0be3e7-12f2-4c81-816a-cd086b1df6cd",
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
  "id": "f0aee340-95e5-4f5e-9f23-c48bb56e2044",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:56:39.112390Z",
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
  "challenge_id": "0ad254dc-4b6d-42ff-bfaa-5eb7620ff1e0",
  "expires_at": "2026-10-30T07:56:41.394973149Z",
  "resend_available_at": "2026-10-30T07:51:42.394973149Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673778687` → **200**

```json
{
  "phone": "+380673778687",
  "audience": "CLIENT",
  "code": "816017",
  "sent_at": "2026-10-30T07:51:41.397538684Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "66acde6a-b567-4845-9568-5fab44c8cb25",
  "challenge_id": "0ad254dc-4b6d-42ff-bfaa-5eb7620ff1e0",
  "otp_code": "816017"
}
```

```json
{
  "client_id": "9ff47607-c97b-4235-907c-7d89c2a8d171",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T07:51:41.715087298Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "47763910-2747-4ca2-85fe-50b8fc54e5fd",
  "quote_id": "f0aee340-95e5-4f5e-9f23-c48bb56e2044",
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
  "correlation_id": "48f2b559-5ba5-4bb4-830c-310f1eb7e2ca"
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
  "session_id": "b36d7887-dc71-4793-a901-54f8235de4d1",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDc2MDIsImlhdCI6MTc5MzM0NjcwMiwianRpIjoiYzQ2ZjJmMDktMzIwNS00ZDkxLTk4YzQtODI2OTUwNWZmNGFlIiwic2lkIjoiYjM2ZDc4ODctZGM3MS00NzkzLWE5MDEtNTRmODIzNWRlNGQxIn0.Y60-W2LG71RQaKJnDKeANwUA2wkbqGXM5OF2hBjLo2s",
  "access_expires_at": "2026-10-30T08:06:42.5914107Z",
  "refresh_token": "klRsPTQ3jGGWyy3sOueEBWl0qmUUt-6_imljhyLtntU",
  "refresh_expires_at": "2026-10-30T19:51:42.590914434Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "9ff47607-c97b-4235-907c-7d89c2a8d171",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T07:51:41.715087Z",
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

`POST /api/admin/v1/client-deletions/9ff47607-c97b-4235-907c-7d89c2a8d171/complete` → **200**

```json
{
  "command_id": "6fa9259a-8c3a-40c5-a0fd-0d50ea731fa4",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "9ff47607-c97b-4235-907c-7d89c2a8d171",
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
  "correlation_id": "2a516115-9379-454c-9536-cd302342103d"
}
```

Done: client 9ff47607-c97b-4235-907c-7d89c2a8d171 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663217015",
  "device_ref": "sandbox-14632"
}
```

```json
{
  "challenge_id": "f498f3ef-4121-424d-83d1-22ff9c19c609",
  "expires_at": "2026-10-30T07:56:43.704823765Z",
  "resend_available_at": "2026-10-30T07:51:44.704823765Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663217015` → **200**

```json
{
  "phone": "+380663217015",
  "audience": "CLIENT",
  "code": "878212",
  "sent_at": "2026-10-30T07:51:43.707623907Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f498f3ef-4121-424d-83d1-22ff9c19c609",
  "code": "878212",
  "device_ref": "sandbox-14632"
}
```

```json
{
  "session_id": "352d4a43-4f59-4ae6-8e25-13f9665ffb72",
  "subject": {
    "type": "CLIENT",
    "id": "5f399d22-89e3-4420-ab66-93fc873577f5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZjM5OWQyMi04OWUzLTQ0MjAtYWI2Ni05M2ZjODczNTc3ZjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ3NjA0LCJpYXQiOjE3OTMzNDY3MDQsImp0aSI6ImM5MTRiNWMxLTNjMzQtNGM3MC1iMzlmLTk1ZGVhYzA5MmQ0ZCIsInNpZCI6IjM1MmQ0YTQzLTRmNTktNGFlNi04ZTI1LTEzZjk2NjVmZmI3MiJ9.qNkBs6D9ADGWyxLxERNfapfjil5FXEIDfoEW2eaBp3o",
  "access_expires_at": "2026-10-30T08:06:44.008930758Z",
  "refresh_token": "cQCRnoNZvw91P90EkhqB1NOPOI2xbEA2pXHzSY1uKFk",
  "refresh_expires_at": "2026-11-29T07:51:44.008470667Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "5f399d22-89e3-4420-ab66-93fc873577f5",
  "session_id": "352d4a43-4f59-4ae6-8e25-13f9665ffb72",
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
  "session_id": "5bc28755-cded-4c35-9897-d5e0bf81766c",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDc2MDQsImlhdCI6MTc5MzM0NjcwNCwianRpIjoiZmY3MmM3NzAtODJmNS00N2EzLWE0YjMtMTA0NWU3ZDYxY2RiIiwic2lkIjoiNWJjMjg3NTUtY2RlZC00YzM1LTk4OTctZDVlMGJmODE3NjZjIn0.YW5qZE_1SSoi_vf7ACPFJZp3LPUBcRh_87N80tlT1L0",
  "access_expires_at": "2026-10-30T08:06:44.870608247Z",
  "refresh_token": "31sEGTkMIoC2AZ6RaNgCps4QaxeDEk2tUBiq3XJRVxE",
  "refresh_expires_at": "2026-10-30T19:51:44.870211086Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=3217015&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "5f399d22-89e3-4420-ab66-93fc873577f5",
      "phone": "+380663217015",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T07:51:44.006585Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/5f399d22-89e3-4420-ab66-93fc873577f5` → **200**

```json
{
  "client": {
    "id": "5f399d22-89e3-4420-ab66-93fc873577f5",
    "phone": "+380663217015",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T07:51:44.006585Z",
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

`POST /api/admin/v1/clients/5f399d22-89e3-4420-ab66-93fc873577f5/block` → **400**

```json
{
  "command_id": "1f442638-04c3-4ba9-8bfc-d1e3e7e2a2f6",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/5f399d22-89e3-4420-ab66-93fc873577f5/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "a69fb1c1-d3a8-4506-8c1f-cfd0a929a8be",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/5f399d22-89e3-4420-ab66-93fc873577f5/block` → **200**

```json
{
  "command_id": "a994203d-2155-4eda-9aa4-3630ac65cc29",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "5f399d22-89e3-4420-ab66-93fc873577f5",
  "phone": "+380663217015",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T07:51:44.006585Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T07:51:46.022045Z",
    "by": "e72a0099-0680-46dd-9ec2-670a72e54279"
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
  "correlation_id": "8b18ca61-4b91-40b8-b00a-cfcc8aed2bcb"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663217015",
  "device_ref": "sandbox-29375"
}
```

```json
{
  "challenge_id": "e5c80123-5e44-4042-8df1-9846898ed0e5",
  "expires_at": "2026-10-30T07:56:48.584602311Z",
  "resend_available_at": "2026-10-30T07:51:49.584602311Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663217015` → **200**

```json
{
  "phone": "+380663217015",
  "audience": "CLIENT",
  "code": "934626",
  "sent_at": "2026-10-30T07:51:48.587102528Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "e5c80123-5e44-4042-8df1-9846898ed0e5",
  "code": "934626",
  "device_ref": "sandbox-29375"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "6845523b-5009-4410-b90b-db7ca6955551"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/5f399d22-89e3-4420-ab66-93fc873577f5` → **200**

```json
{
  "client": {
    "id": "5f399d22-89e3-4420-ab66-93fc873577f5",
    "phone": "+380663217015",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T07:51:44.006585Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T07:51:46.022045Z",
      "by": "e72a0099-0680-46dd-9ec2-670a72e54279"
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

`POST /api/admin/v1/clients/5f399d22-89e3-4420-ab66-93fc873577f5/unblock` → **200**

```json
{
  "command_id": "1ceb90e2-fbff-45eb-880e-2a6e33fdcef3",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "5f399d22-89e3-4420-ab66-93fc873577f5",
  "phone": "+380663217015",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T07:51:44.006585Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663217015",
  "device_ref": "sandbox-7223"
}
```

```json
{
  "challenge_id": "41cbceb0-77b5-4928-842e-e814364d8fe0",
  "expires_at": "2026-10-30T07:56:51.751586783Z",
  "resend_available_at": "2026-10-30T07:51:52.751586783Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663217015` → **200**

```json
{
  "phone": "+380663217015",
  "audience": "CLIENT",
  "code": "096991",
  "sent_at": "2026-10-30T07:51:51.754024801Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "41cbceb0-77b5-4928-842e-e814364d8fe0",
  "code": "096991",
  "device_ref": "sandbox-7223"
}
```

```json
{
  "session_id": "389270ba-32fd-48ed-aeed-2bcbf440e877",
  "subject": {
    "type": "CLIENT",
    "id": "5f399d22-89e3-4420-ab66-93fc873577f5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZjM5OWQyMi04OWUzLTQ0MjAtYWI2Ni05M2ZjODczNTc3ZjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ3NjEyLCJpYXQiOjE3OTMzNDY3MTIsImp0aSI6ImM1N2M2ZmQ5LTMzYzgtNDljNy1hYTNmLWI4OTViOTdhZjMxZSIsInNpZCI6IjM4OTI3MGJhLTMyZmQtNDhlZC1hZWVkLTJiY2JmNDQwZTg3NyJ9.301Bqbvwlagybc2AWEg9F_2ax6jIidHzqY1iDdnSbZ8",
  "access_expires_at": "2026-10-30T08:06:52.057345658Z",
  "refresh_token": "fIPUqmo63cEES6gOugwuqmv5Fn9xKeQBTuL9534i95I",
  "refresh_expires_at": "2026-11-29T07:51:52.056832405Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "5f399d22-89e3-4420-ab66-93fc873577f5",
  "session_id": "389270ba-32fd-48ed-aeed-2bcbf440e877",
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
  "phone": "+380662815435",
  "device_ref": "sandbox-19556"
}
```

```json
{
  "challenge_id": "f9b5c06c-b58b-4614-8f72-1290070ebaac",
  "expires_at": "2026-10-30T07:56:52.606725231Z",
  "resend_available_at": "2026-10-30T07:51:53.606725231Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662815435` → **200**

```json
{
  "phone": "+380662815435",
  "audience": "CLIENT",
  "code": "321444",
  "sent_at": "2026-10-30T07:51:52.609124468Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f9b5c06c-b58b-4614-8f72-1290070ebaac",
  "code": "321444",
  "device_ref": "sandbox-19556"
}
```

```json
{
  "session_id": "10793eac-bced-401b-ae9f-fc6b69aae1f8",
  "subject": {
    "type": "CLIENT",
    "id": "db6024a4-d9dc-44a2-b160-9258d39b6a76"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjYwMjRhNC1kOWRjLTQ0YTItYjE2MC05MjU4ZDM5YjZhNzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ3NjEyLCJpYXQiOjE3OTMzNDY3MTIsImp0aSI6IjkzNGM5MWQ1LTY1MzQtNDQ5ZC1iOWFlLTU2OGViNzUwNDRiNyIsInNpZCI6IjEwNzkzZWFjLWJjZWQtNDAxYi1hZTlmLWZjNmI2OWFhZTFmOCJ9.BLVGUHF_C-ow6wzc4qwzcwMeWmotAedWr-aM9MA1y4U",
  "access_expires_at": "2026-10-30T08:06:52.908774257Z",
  "refresh_token": "s6NkwsfqRnwARJbpI3b8yTP_-iaXg4G24UXxghJVmOk",
  "refresh_expires_at": "2026-11-29T07:51:52.908274037Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b4a0fa84-a087-4b7f-a5f2-e023a8ed2c02",
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
  "id": "d3e054dd-6e2d-4217-b1cb-7a91f0bf8c4b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:56:53.191370Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: cca5ad15-1f84-4afa-9739-d619579d81ff) → **201**

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
  "session_id": "1f3baa01-9ae4-48ad-b2bc-7b0b390c6a4b",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDc2MTMsImlhdCI6MTc5MzM0NjcxMywianRpIjoiMDgyOTY4ODctYjdhMy00YzQ0LWEzMTEtOGUzZWM1ZjIzMTI5Iiwic2lkIjoiMWYzYmFhMDEtOWFlNC00OGFkLWIyYmMtN2IwYjM5MGM2YTRiIn0.qTxvczqX0mRSjOWoaThVQcJI12y6XUr0uOSyE3rDdxA",
  "access_expires_at": "2026-10-30T08:06:53.833426356Z",
  "refresh_token": "_soDwnPs2cspmKYDBcbKxf0-zK2SNxyVc8eIVuAHsig",
  "refresh_expires_at": "2026-10-30T19:51:53.832824822Z",
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
  "session_id": "c340d483-b606-4aeb-9892-d781aabac006",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDc2MTQsImlhdCI6MTc5MzM0NjcxNCwianRpIjoiZTA2MmM0ZWItYmYyOS00NzMwLWIzZTYtZWI3NGJlODliZGEwIiwic2lkIjoiYzM0MGQ0ODMtYjYwNi00YWViLTk4OTItZDc4MWFhYmFjMDA2In0.X28TJ1NcF03iSyDu1ZAhoqPP1TvWEs-ZpWgyK2Ch4hM",
  "access_expires_at": "2026-10-30T08:06:54.418345898Z",
  "refresh_token": "nXA9KTLb-nQP4bdcIWCWLUESwEhgC46PdMMPKooxK08",
  "refresh_expires_at": "2026-10-30T19:51:54.417896112Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/3dad9d8c-e6d5-4a3f-ba10-e247e20eddf3/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T07:51:53.481028Z",
      "actor": {
        "type": "CLIENT",
        "id": "db6024a4-d9dc-44a2-b160-9258d39b6a76",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "3dad9d8c-e6d5-4a3f-ba10-e247e20eddf3",
        "quote_id": "d3e054dd-6e2d-4217-b1cb-7a91f0bf8c4b",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "cca5ad15-1f84-4afa-9739-d619579d81ff"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T07:51:53.482684Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3dad9d8c-e6d5-4a3f-ba10-e247e20eddf3",
        "attempt_id": "ed5240de-c17d-4ad3-b980-4bbb51cf1a1f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "cca5ad15-1f84-4afa-9739-d619579d81ff"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T07:51:53.489685Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3dad9d8c-e6d5-4a3f-ba10-e247e20eddf3",
        "attempt_id": "ed5240de-c17d-4ad3-b980-4bbb51cf1a1f"
      },
      "correlation_id": "cca5ad15-1f84-4afa-9739-d619579d81ff"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "ed5240de-c17d-4ad3-b980-4bbb51cf1a1f",
        "generation": 1,
        "started_at": "2026-10-30T07:51:53.481899Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T07:51:53.489685Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T07:51:53.483352Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/cca5ad15-1f84-4afa-9739-d619579d81ff` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "3dad9d8c-e6d5-4a3f-ba10-e247e20eddf3:0",
      "order_id": "3dad9d8c-e6d5-4a3f-ba10-e247e20eddf3",
      "at": "2026-10-30T07:51:53.481028Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "3dad9d8c-e6d5-4a3f-ba10-e247e20eddf3:1",
      "order_id": "3dad9d8c-e6d5-4a3f-ba10-e247e20eddf3",
      "at": "2026-10-30T07:51:53.482684Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "3dad9d8c-e6d5-4a3f-ba10-e247e20eddf3:2",
      "order_id": "3dad9d8c-e6d5-4a3f-ba10-e247e20eddf3",
      "at": "2026-10-30T07:51:53.489685Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/f9797d5b-f775-4eb5-add9-4c690929e16f` → **200**

```json
{
  "found": []
}
```

Done: request cca5ad15-1f84-4afa-9739-d619579d81ff — order 3dad9d8c-e6d5-4a3f-ba10-e247e20eddf3 found by its id.

`GET /api/rider/v1/orders/3dad9d8c-e6d5-4a3f-ba10-e247e20eddf3` → **200**

```json
{
  "id": "3dad9d8c-e6d5-4a3f-ba10-e247e20eddf3",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "db6024a4-d9dc-44a2-b160-9258d39b6a76",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:51:53.480439Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3dad9d8c-e6d5-4a3f-ba10-e247e20eddf3/cancel` → **200**

```json
{
  "command_id": "e5c673b6-65c5-4420-a672-15a4d69ed811",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3dad9d8c-e6d5-4a3f-ba10-e247e20eddf3",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "db6024a4-d9dc-44a2-b160-9258d39b6a76",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T07:51:53.480439Z",
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
  "phone": "+380632839622",
  "device_ref": "sandbox-18300"
}
```

```json
{
  "challenge_id": "7f4462b5-335e-4321-a3a8-c7830d44835e",
  "expires_at": "2026-10-30T07:56:56.105692845Z",
  "resend_available_at": "2026-10-30T07:51:57.105692845Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632839622` → **200**

```json
{
  "phone": "+380632839622",
  "audience": "CLIENT",
  "code": "875658",
  "sent_at": "2026-10-30T07:51:56.108417051Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7f4462b5-335e-4321-a3a8-c7830d44835e",
  "code": "875658",
  "device_ref": "sandbox-18300"
}
```

```json
{
  "session_id": "b6e9a8ca-ee61-4c43-982a-328504cad534",
  "subject": {
    "type": "CLIENT",
    "id": "3a73fdc9-5a38-4ea9-9f58-d122eef942b4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTczZmRjOS01YTM4LTRlYTktOWY1OC1kMTIyZWVmOTQyYjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ3NjE2LCJpYXQiOjE3OTMzNDY3MTYsImp0aSI6IjBjMmZmZGYzLTdiYmQtNDRiZC1iYjVhLWMwZjhjMmYxOWU5YyIsInNpZCI6ImI2ZTlhOGNhLWVlNjEtNGM0My05ODJhLTMyODUwNGNhZDUzNCJ9.4ZMTF6KqwqiE9xfV3A1-Fl2Whmlqega7bK3dvUqXhz8",
  "access_expires_at": "2026-10-30T08:06:56.427987009Z",
  "refresh_token": "wf8DXjscEqAO53ZSXYWD0Fgzv23PMNZSh8CsT2O3SRo",
  "refresh_expires_at": "2026-11-29T07:51:56.427308921Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "bc864a81-7efb-4106-bda3-29d2cd75b76a",
  "expires_at": "2026-10-30T07:56:58.704241449Z",
  "resend_available_at": "2026-10-30T07:51:59.704241449Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632839622` → **200**

```json
{
  "phone": "+380632839622",
  "audience": "CLIENT",
  "code": "704440",
  "sent_at": "2026-10-30T07:51:58.706540297Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "f6c7ff51-7a13-4871-8906-46dffe8808fc",
  "challenge_id": "bc864a81-7efb-4106-bda3-29d2cd75b76a",
  "otp_code": "704440"
}
```

```json
{
  "id": "6ff8b8fd-f7c5-4a42-a72a-af11194ba3a4",
  "state": "PENDING",
  "created_at": "2026-10-30T07:51:59.007912Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/6ff8b8fd-f7c5-4a42-a72a-af11194ba3a4` → **200**

```json
{
  "id": "6ff8b8fd-f7c5-4a42-a72a-af11194ba3a4",
  "state": "PENDING",
  "created_at": "2026-10-30T07:51:59.007912Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/6ff8b8fd-f7c5-4a42-a72a-af11194ba3a4` → **200**

```json
{
  "id": "6ff8b8fd-f7c5-4a42-a72a-af11194ba3a4",
  "state": "PENDING",
  "created_at": "2026-10-30T07:51:59.007912Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/6ff8b8fd-f7c5-4a42-a72a-af11194ba3a4` → **200**

```json
{
  "id": "6ff8b8fd-f7c5-4a42-a72a-af11194ba3a4",
  "state": "PENDING",
  "created_at": "2026-10-30T07:51:59.007912Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/6ff8b8fd-f7c5-4a42-a72a-af11194ba3a4` → **200**

```json
{
  "id": "6ff8b8fd-f7c5-4a42-a72a-af11194ba3a4",
  "state": "PENDING",
  "created_at": "2026-10-30T07:51:59.007912Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/6ff8b8fd-f7c5-4a42-a72a-af11194ba3a4` → **200**

```json
{
  "id": "6ff8b8fd-f7c5-4a42-a72a-af11194ba3a4",
  "state": "PENDING",
  "created_at": "2026-10-30T07:51:59.007912Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/6ff8b8fd-f7c5-4a42-a72a-af11194ba3a4` → **200**

```json
{
  "id": "6ff8b8fd-f7c5-4a42-a72a-af11194ba3a4",
  "state": "READY",
  "created_at": "2026-10-30T07:51:59.007912Z",
  "ready_at": "2026-10-30T07:52:05.404534Z",
  "expires_at": "2026-11-06T07:52:05.404534Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/6ff8b8fd-f7c5-4a42-a72a-af11194ba3a4/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636718865",
  "device_ref": "sandbox-9770"
}
```

```json
{
  "challenge_id": "785f822d-d53e-49c4-b990-aa0e8b7e473f",
  "expires_at": "2026-10-30T07:57:05.938586258Z",
  "resend_available_at": "2026-10-30T07:52:06.938586258Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636718865` → **200**

```json
{
  "phone": "+380636718865",
  "audience": "CLIENT",
  "code": "450563",
  "sent_at": "2026-10-30T07:52:05.94243275Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "785f822d-d53e-49c4-b990-aa0e8b7e473f",
  "code": "450563",
  "device_ref": "sandbox-9770"
}
```

```json
{
  "session_id": "cbaa98bd-ec66-466c-a830-77024f3d3b58",
  "subject": {
    "type": "CLIENT",
    "id": "615811db-496c-45c9-8994-9304cd7f134d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTU4MTFkYi00OTZjLTQ1YzktODk5NC05MzA0Y2Q3ZjEzNGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ3NjI2LCJpYXQiOjE3OTMzNDY3MjYsImp0aSI6ImNiZmJhMDRiLTI3NzktNDJlMi04MjRmLTAyZjI3ZTBhODc1YiIsInNpZCI6ImNiYWE5OGJkLWVjNjYtNDY2Yy1hODMwLTc3MDI0ZjNkM2I1OCJ9.xQH6zGsDGJZe6Wu_dJsJmF3tNVlTJ6SNsYhe5tXmuPE",
  "access_expires_at": "2026-10-30T08:07:06.244198509Z",
  "refresh_token": "4je1jwc2K7Oh55MkIivHkDv3K-sHqq-WY65c38zmLXw",
  "refresh_expires_at": "2026-11-29T07:52:06.243748967Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/6ff8b8fd-f7c5-4a42-a72a-af11194ba3a4/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/6ff8b8fd-f7c5-4a42-a72a-af11194ba3a4/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e8189d93-a9b0-483e-91ef-221167f2e7a0"
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
  "session_id": "b61a2760-030c-4fa4-9b39-051a203ac6a6",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDc2MjcsImlhdCI6MTc5MzM0NjcyNywianRpIjoiNTc4ZjdlNGItMTA4Yi00M2ZmLWJkNWUtNTM5NDljZjAwZjFmIiwic2lkIjoiYjYxYTI3NjAtMDMwYy00ZmE0LTliMzktMDUxYTIwM2FjNmE2In0.ThFxoKrH0udJmjmBO28iFMsl0gR_W0khW973TR_FxUg",
  "access_expires_at": "2026-10-30T08:07:07.131579128Z",
  "refresh_token": "6n5vo64qVNMPnQKW-YUJ2wIYvPJ8K8hpAinHQqS8uKo",
  "refresh_expires_at": "2026-10-30T19:52:07.130941585Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3a73fdc9-5a38-4ea9-9f58-d122eef942b4",
  "session_id": "b6e9a8ca-ee61-4c43-982a-328504cad534",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/3a73fdc9-5a38-4ea9-9f58-d122eef942b4/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "6ff8b8fd-f7c5-4a42-a72a-af11194ba3a4",
      "state": "READY",
      "created_at": "2026-10-30T07:51:59.007912Z",
      "ready_at": "2026-10-30T07:52:05.404534Z",
      "expires_at": "2026-11-06T07:52:05.404534Z",
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
  "device_ref": "sandbox-18582"
}
```

```json
{
  "challenge_id": "0a4b5d37-b631-4f75-932c-f5f37e621ddc",
  "expires_at": "2026-10-30T07:57:07.948368796Z",
  "resend_available_at": "2026-10-30T07:52:08.948368796Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "892238",
  "sent_at": "2026-10-30T07:52:07.950823271Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0a4b5d37-b631-4f75-932c-f5f37e621ddc",
  "code": "892238",
  "device_ref": "sandbox-18582"
}
```

```json
{
  "session_id": "75e86a39-0441-47e3-9ddc-922e0b97ed73",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NzYyOCwiaWF0IjoxNzkzMzQ2NzI4LCJqdGkiOiJhN2ZhMmYyZi1hMDIwLTRiYTEtYWMyMC0yMDcwZDg3MjM3ZTgiLCJzaWQiOiI3NWU4NmEzOS0wNDQxLTQ3ZTMtOWRkYy05MjJlMGI5N2VkNzMifQ.TZoKAsip9BeLb-mJKjEAKzgHdHJEVA0PUg7euE7lVys",
  "access_expires_at": "2026-10-30T08:07:08.248368761Z",
  "refresh_token": "q07rSYRkThNPYQkodnyXmdRnfKj-kPBiadY7vilCVnU",
  "refresh_expires_at": "2026-11-29T07:52:08.247912986Z",
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
  "device_ref": "sandbox-5235"
}
```

```json
{
  "challenge_id": "48acd8c0-0cff-4408-ba15-70b2e50134a3",
  "expires_at": "2026-10-30T07:57:08.785685097Z",
  "resend_available_at": "2026-10-30T07:52:09.785685097Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "054564",
  "sent_at": "2026-10-30T07:52:08.788703128Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "48acd8c0-0cff-4408-ba15-70b2e50134a3",
  "code": "054564",
  "device_ref": "sandbox-5235"
}
```

```json
{
  "session_id": "9e68f374-4ee4-4b17-a60a-239b790cb885",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NzYyOSwiaWF0IjoxNzkzMzQ2NzI5LCJqdGkiOiJmYjQyYjQ3ZS1iNjViLTRjN2ItYjBkNy1hNzg5NmE3YTY0ZDAiLCJzaWQiOiI5ZTY4ZjM3NC00ZWU0LTRiMTctYTYwYS0yMzliNzkwY2I4ODUifQ.jwQopdBsAMIHV_djADsuB-tdJlq7ZiccVZyr6lJFA7M",
  "access_expires_at": "2026-10-30T08:07:09.082479357Z",
  "refresh_token": "KaRNbCLCrzvZbjTiN-1-17sc2CTQRQy23ba8C4EulRo",
  "refresh_expires_at": "2026-11-29T07:52:09.082041631Z",
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
  "command_id": "febe1624-68bf-4eaf-a7f0-671d19c4ed3a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:52:09Z",
    "sequence": 1793346729647
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4d83ffbf-cd7b-4aa4-b35c-db7a0613d503",
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
  "last_heartbeat_at": "2026-10-30T07:52:09.664121Z",
  "last_location_at": "2026-10-30T07:52:09.664121Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-15189"
}
```

```json
{
  "challenge_id": "a8689bd5-8283-40eb-8c59-ba46e33079f4",
  "expires_at": "2026-10-30T07:57:09.941275086Z",
  "resend_available_at": "2026-10-30T07:52:10.941275086Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "353103",
  "sent_at": "2026-10-30T07:52:09.953007972Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a8689bd5-8283-40eb-8c59-ba46e33079f4",
  "code": "353103",
  "device_ref": "sandbox-15189"
}
```

```json
{
  "session_id": "f5960339-f880-4b03-935e-ab6c8fd0b12b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NzYzMCwiaWF0IjoxNzkzMzQ2NzMwLCJqdGkiOiI4MDU0MzljOS0wMGQxLTQ5MjktOTkxZi0yODdlZDMyYWM0NDYiLCJzaWQiOiJmNTk2MDMzOS1mODgwLTRiMDMtOTM1ZS1hYjZjOGZkMGIxMmIifQ.LQZ--aEJkQJMyZ-QmYL7rnSSEujlZZy8upEzB_BWn5A",
  "access_expires_at": "2026-10-30T08:07:10.269939509Z",
  "refresh_token": "fo2fsXEovmmogy555IxXcA-jlqTrzAJgovu4CDaj31Q",
  "refresh_expires_at": "2026-11-29T07:52:10.269496154Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "2e76fe33-72a9-4ddb-a025-e4f295fc7b19",
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
  "last_heartbeat_at": "2026-10-30T07:48:11.434162Z",
  "last_location_at": "2026-10-30T07:48:11.434162Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/2e76fe33-72a9-4ddb-a025-e4f295fc7b19/handover` → **200**

```json
{
  "command_id": "10bfa825-e884-4299-8a26-cac34a06d039",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "2e76fe33-72a9-4ddb-a025-e4f295fc7b19",
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
  "last_heartbeat_at": "2026-10-30T07:48:11.434162Z",
  "last_location_at": "2026-10-30T07:48:11.434162Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/2e76fe33-72a9-4ddb-a025-e4f295fc7b19/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:52:11Z",
    "sequence": 1793346731177
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "2e76fe33-72a9-4ddb-a025-e4f295fc7b19",
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
  "last_heartbeat_at": "2026-10-30T07:52:11.196135Z",
  "last_location_at": "2026-10-30T07:52:11.196135Z",
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
  "session_id": "604b0f5a-ec14-411e-8087-436678b7785a",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDc2MzEsImlhdCI6MTc5MzM0NjczMSwianRpIjoiMzAxOTU0ZDEtMmU3Mi00YzEzLWFkNTktYTc4OTAzMDIzY2YwIiwic2lkIjoiNjA0YjBmNWEtZWMxNC00MTFlLTgwODctNDM2Njc4Yjc3ODVhIn0.DxmynKvVro3wPhjal7xSx8OytrReQasGds87nDXbZ8s",
  "access_expires_at": "2026-10-30T08:07:11.807336083Z",
  "refresh_token": "pOsYwcnAT9bLveL7OEQhxGXVBY-QqpyaorKyBfZ0qCI",
  "refresh_expires_at": "2026-10-30T19:52:11.80681532Z",
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
  "session_id": "d4138689-cac2-49f7-bf90-26529f0a7d01",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDc2MzIsImlhdCI6MTc5MzM0NjczMiwianRpIjoiNTgzMzY5OTYtMjhjNy00NTA3LTg2MDktYjNhNjU2OWNkYWIxIiwic2lkIjoiZDQxMzg2ODktY2FjMi00OWY3LWJmOTAtMjY1MjlmMGE3ZDAxIn0.15CQDjozRFEIu46GrqzyViUf9JJPz_89ND1zP6iRGtA",
  "access_expires_at": "2026-10-30T08:07:12.415231513Z",
  "refresh_token": "5wjZd_jitdHQJVN0hRl1sjaZsklz6vvUJhm9R0g9Cm0",
  "refresh_expires_at": "2026-10-30T19:52:12.414720248Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380689695027",
  "device_ref": "sandbox-1452"
}
```

```json
{
  "challenge_id": "e1f9c4f7-b927-43d5-9923-f56b323f08ac",
  "expires_at": "2026-10-30T07:57:12.684044907Z",
  "resend_available_at": "2026-10-30T07:52:13.684044907Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380689695027` → **200**

```json
{
  "phone": "+380689695027",
  "audience": "CLIENT",
  "code": "748174",
  "sent_at": "2026-10-30T07:52:12.768626825Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e1f9c4f7-b927-43d5-9923-f56b323f08ac",
  "code": "748174",
  "device_ref": "sandbox-1452"
}
```

```json
{
  "session_id": "6b92b365-2a50-4ab0-9388-87b0a15c3c32",
  "subject": {
    "type": "CLIENT",
    "id": "c82b0d8c-1568-4a80-bafd-0d89f031c766"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODJiMGQ4Yy0xNTY4LTRhODAtYmFmZC0wZDg5ZjAzMWM3NjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ3NjMzLCJpYXQiOjE3OTMzNDY3MzMsImp0aSI6ImQ4MmQyM2ExLWM3MzgtNDJlYy04NjE1LTlkZDE2NzM2NGRkZiIsInNpZCI6IjZiOTJiMzY1LTJhNTAtNGFiMC05Mzg4LTg3YjBhMTVjM2MzMiJ9.AxLaZZdwikvrrj8iIEo7sBhqM6VRA-hcf8rP7gRHWvc",
  "access_expires_at": "2026-10-30T08:07:13.088223389Z",
  "refresh_token": "X9W_WeMThHySfLSblS7KOebxejoE0gzspZQrQsRtnM4",
  "refresh_expires_at": "2026-11-29T07:52:13.087741794Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3ba564ef-06db-44fd-8797-0dc9e7868218",
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
  "id": "27dd71be-9d72-4e9a-9ed7-7db4e5a71c69",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:57:13.365706Z",
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
  "command_id": "e22232b9-5437-434c-adb2-5172541675c9",
  "quote_id": "27dd71be-9d72-4e9a-9ed7-7db4e5a71c69",
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
  "id": "e8067020-74db-4e95-8f3d-dfaef8b6724c",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c82b0d8c-1568-4a80-bafd-0d89f031c766",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T07:52:13.653787Z",
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
    "id": "255aed52-c7e1-4b15-bea3-424992de7b73",
    "order_id": "e8067020-74db-4e95-8f3d-dfaef8b6724c",
    "expires_at": "2026-10-30T07:52:28.656966Z",
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

`POST /api/driver/v1/offers/255aed52-c7e1-4b15-bea3-424992de7b73/reject` → **204**

```json
{
  "command_id": "0fd8f549-be8d-4c97-bdbd-e47c2367b7d1"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "b6baa575-4519-4af7-803f-5c35e544fb83",
    "order_id": "e8067020-74db-4e95-8f3d-dfaef8b6724c",
    "expires_at": "2026-10-30T07:52:29.221928Z",
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

`POST /api/driver/v1/offers/b6baa575-4519-4af7-803f-5c35e544fb83/accept` → **200**

```json
{
  "command_id": "5916d9fd-c41c-4c46-999a-a641b8074a1d"
}
```

```json
{
  "id": "e7dfb57e-b389-47d5-b4b0-a65f64740483",
  "order_id": "e8067020-74db-4e95-8f3d-dfaef8b6724c",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "90d46c4b-e668-4889-bb4e-7cf1a658b4a8",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/e8067020-74db-4e95-8f3d-dfaef8b6724c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T07:52:13.654304Z",
      "actor": {
        "type": "CLIENT",
        "id": "c82b0d8c-1568-4a80-bafd-0d89f031c766",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e8067020-74db-4e95-8f3d-dfaef8b6724c",
        "quote_id": "27dd71be-9d72-4e9a-9ed7-7db4e5a71c69",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "050a7336-699a-405d-b145-5bf2fff9d75e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T07:52:13.656238Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e8067020-74db-4e95-8f3d-dfaef8b6724c",
        "attempt_id": "e3ce4926-bc41-4577-86c5-fd1a4974da6b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "050a7336-699a-405d-b145-5bf2fff9d75e"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T07:52:13.659885Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "255aed52-c7e1-4b15-bea3-424992de7b73",
        "order_id": "e8067020-74db-4e95-8f3d-dfaef8b6724c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "050a7336-699a-405d-b145-5bf2fff9d75e"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T07:52:14.221111Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "255aed52-c7e1-4b15-bea3-424992de7b73",
        "order_id": "e8067020-74db-4e95-8f3d-dfaef8b6724c"
      },
      "correlation_id": "66b3995e-1307-44a9-8c55-24483a2ad583"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order e8067020-74db-4e95-8f3d-dfaef8b6724c — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/e8067020-74db-4e95-8f3d-dfaef8b6724c` → **200**

```json
{
  "id": "e8067020-74db-4e95-8f3d-dfaef8b6724c",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "c82b0d8c-1568-4a80-bafd-0d89f031c766",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "e7dfb57e-b389-47d5-b4b0-a65f64740483",
    "order_id": "e8067020-74db-4e95-8f3d-dfaef8b6724c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "90d46c4b-e668-4889-bb4e-7cf1a658b4a8",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T07:52:13.653787Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e8067020-74db-4e95-8f3d-dfaef8b6724c/cancel` → **200**

```json
{
  "command_id": "d12007df-e022-4867-8534-5919ba5155d8",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "e8067020-74db-4e95-8f3d-dfaef8b6724c",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "c82b0d8c-1568-4a80-bafd-0d89f031c766",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "e7dfb57e-b389-47d5-b4b0-a65f64740483",
    "order_id": "e8067020-74db-4e95-8f3d-dfaef8b6724c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "90d46c4b-e668-4889-bb4e-7cf1a658b4a8",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T07:52:13.653787Z",
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
  "session_id": "4d83ffbf-cd7b-4aa4-b35c-db7a0613d503",
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
  "last_heartbeat_at": "2026-10-30T07:52:09.664121Z",
  "last_location_at": "2026-10-30T07:52:09.664121Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4d83ffbf-cd7b-4aa4-b35c-db7a0613d503/close` → **200**

```json
{
  "command_id": "e640008c-ee7d-404b-8b2d-14ab11262b89",
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
  "session_id": "2e76fe33-72a9-4ddb-a025-e4f295fc7b19",
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
  "last_heartbeat_at": "2026-10-30T07:52:11.196135Z",
  "last_location_at": "2026-10-30T07:52:11.196135Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2e76fe33-72a9-4ddb-a025-e4f295fc7b19/close` → **200**

```json
{
  "command_id": "79622dbb-d3c0-477b-98d5-9f56e1a38945",
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
  "session_id": "5b660d2e-0484-4abf-82d6-991fc48659ad",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDc2MzcsImlhdCI6MTc5MzM0NjczNywianRpIjoiMDFkNzBhMjItNmQxOC00YTUzLTgwNDctNzY3ZWQ5MzgwYTYyIiwic2lkIjoiNWI2NjBkMmUtMDQ4NC00YWJmLTgyZDYtOTkxZmM0ODY1OWFkIn0.LgGwVssJP6tKvv6bgefsM4nYaNfWZDwiAHYOiZaeQCo",
  "access_expires_at": "2026-10-30T08:07:17.150861996Z",
  "refresh_token": "zLAoYwThOCyaU7EqMBWvSS3DiuZ3MJpMBo8RSQ8N9dw",
  "refresh_expires_at": "2026-10-30T19:52:17.150398169Z",
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
  "command_id": "76674d0b-ba4a-4b8d-ad71-13379e3bc79c",
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
  "changed_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T07:52:17.708743Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "7f6d66a5-d6c5-4c9c-b4b9-f2fc8dbc6e81",
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
  "correlation_id": "bf6e5286-4a6d-401e-b625-4f91cced4fd9"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "e901eb91-81fe-451a-be94-c6fbccdaf777",
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
  "correlation_id": "02318d02-cf8a-4db6-a683-250efe576e1f"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632761311",
  "device_ref": "sandbox-31354"
}
```

```json
{
  "challenge_id": "efed7a2b-f637-4537-be1c-1fa02b8eb682",
  "expires_at": "2026-10-30T07:57:18.538993345Z",
  "resend_available_at": "2026-10-30T07:52:19.538993345Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632761311` → **200**

```json
{
  "phone": "+380632761311",
  "audience": "CLIENT",
  "code": "574424",
  "sent_at": "2026-10-30T07:52:18.542438255Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "efed7a2b-f637-4537-be1c-1fa02b8eb682",
  "code": "574424",
  "device_ref": "sandbox-31354"
}
```

```json
{
  "session_id": "4dba5c82-42ec-4c59-9072-372caa2ca65c",
  "subject": {
    "type": "CLIENT",
    "id": "79fec00d-5402-4c98-a01b-88ab1fa6642b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3OWZlYzAwZC01NDAyLTRjOTgtYTAxYi04OGFiMWZhNjY0MmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ3NjM4LCJpYXQiOjE3OTMzNDY3MzgsImp0aSI6IjFkNzZlMGVjLTcxYTUtNGI2Ni1iYjEyLTVjMWNjN2Q0ODVmOCIsInNpZCI6IjRkYmE1YzgyLTQyZWMtNGM1OS05MDcyLTM3MmNhYTJjYTY1YyJ9.s6p6xTRscoChni8Cnd4NKiFWoYONdW0RTe6KO6FG5JU",
  "access_expires_at": "2026-10-30T08:07:18.857959129Z",
  "refresh_token": "O5aMMuaNvnYqGDi_86mz6EN5P6tgD5ryNh5PLbvG1u0",
  "refresh_expires_at": "2026-11-29T07:52:18.857384039Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7300ca52-a367-4331-92e3-b4bca378b67f",
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
  "id": "c638f0cf-ef78-4403-95f3-a4080c5dfa47",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:57:19.146272Z",
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
  "command_id": "c2d0c7bc-3e6f-4d1b-b9f2-39cb30fa95ac",
  "quote_id": "c638f0cf-ef78-4403-95f3-a4080c5dfa47",
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
  "correlation_id": "5723d6e1-d550-4264-8c1e-5491fab0d040"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d3e1c9cc-fe4c-444a-9dd7-53e3b66241fd",
  "quote_id": "c638f0cf-ef78-4403-95f3-a4080c5dfa47",
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
  "id": "5029d36c-6a24-4464-9ad8-dfa3e276e926",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "79fec00d-5402-4c98-a01b-88ab1fa6642b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:52:19.738166Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5029d36c-6a24-4464-9ad8-dfa3e276e926/cancel` → **200**

```json
{
  "command_id": "6123db4c-56eb-46b6-9740-bad5b8ef0c97",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5029d36c-6a24-4464-9ad8-dfa3e276e926",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "79fec00d-5402-4c98-a01b-88ab1fa6642b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T07:52:19.738166Z",
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
  "command_id": "526fb2a0-5f29-4442-9380-360550b061ae",
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
  "changed_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T07:52:20.3432Z"
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
      "changed_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T07:52:20.3432Z"
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
  "device_ref": "sandbox-3701"
}
```

```json
{
  "challenge_id": "5cdd7b12-94a5-4392-b611-d9926763f403",
  "expires_at": "2026-10-30T07:57:21.205425234Z",
  "resend_available_at": "2026-10-30T07:52:22.205425234Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "340476",
  "sent_at": "2026-10-30T07:52:21.221857176Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5cdd7b12-94a5-4392-b611-d9926763f403",
  "code": "340476",
  "device_ref": "sandbox-3701"
}
```

```json
{
  "session_id": "743742e1-7c16-4b52-9e1d-d119c16c3f3b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NzY0MSwiaWF0IjoxNzkzMzQ2NzQxLCJqdGkiOiIwNzg1ODE2Yy0yMzRhLTRhZjEtYWQwOC1iMjUzNDQxODg1MmUiLCJzaWQiOiI3NDM3NDJlMS03YzE2LTRiNTItOWUxZC1kMTE5YzE2YzNmM2IifQ.VrcglspzHGA9Fji1qD82mjq70AU8vwXcaxFFjlWo3vQ",
  "access_expires_at": "2026-10-30T08:07:21.521537208Z",
  "refresh_token": "RrkYMX8f9YAneXT5K0xojIs-a_oBPQvOwcl__suXLl4",
  "refresh_expires_at": "2026-11-29T07:52:21.521068742Z",
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
  "command_id": "cae6492c-3663-4653-a31d-65f92aa1c3fe",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:52:22Z",
    "sequence": 1793346742887
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a9942eee-d086-46da-b2ab-f47aca4cda6b",
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
  "last_heartbeat_at": "2026-10-30T07:52:22.106148Z",
  "last_location_at": "2026-10-30T07:52:22.106148Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674297563",
  "device_ref": "sandbox-760"
}
```

```json
{
  "challenge_id": "7ce1c32c-256c-4818-ac02-0e49eef9abec",
  "expires_at": "2026-10-30T07:57:22.380855932Z",
  "resend_available_at": "2026-10-30T07:52:23.380855932Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674297563` → **200**

```json
{
  "phone": "+380674297563",
  "audience": "CLIENT",
  "code": "427980",
  "sent_at": "2026-10-30T07:52:22.450187264Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7ce1c32c-256c-4818-ac02-0e49eef9abec",
  "code": "427980",
  "device_ref": "sandbox-760"
}
```

```json
{
  "session_id": "d68325e5-f282-4e50-a6ee-29c2946fa8ff",
  "subject": {
    "type": "CLIENT",
    "id": "b618b959-4821-4df9-a626-03f454b685c2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNjE4Yjk1OS00ODIxLTRkZjktYTYyNi0wM2Y0NTRiNjg1YzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ3NjQyLCJpYXQiOjE3OTMzNDY3NDIsImp0aSI6ImYzODZmOTI2LTI5MmMtNDA0MC1iNDU5LTlmZDBiM2RmZDI3NSIsInNpZCI6ImQ2ODMyNWU1LWYyODItNGU1MC1hNmVlLTI5YzI5NDZmYThmZiJ9.w-fhN6K06PdOmmbqmaKhrcWSIEN0-NUTt5hio23Bygg",
  "access_expires_at": "2026-10-30T08:07:22.755862015Z",
  "refresh_token": "umUdp6c1c1KaIilsTKOsxdbejseGvJFn07c7FXrPVPw",
  "refresh_expires_at": "2026-11-29T07:52:22.75510102Z",
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
  "command_id": "19e0f1d5-a726-43be-9b39-b3edb785ee19",
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
  "id": "24c73f67-dfa4-4d88-96fb-8a84cce7dbf2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:57:23.312714Z",
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
  "command_id": "a8ff48db-1bd6-4300-8eaf-3729da3bbdb6",
  "platform": "ANDROID",
  "token": "sandbox-driver-952cdd28-4b93-4b5e-ab17-a3c10c0c16c8"
}
```

```json
{
  "id": "239be006-7fe5-44ff-8c55-bf7f470bbdef",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T07:52:23.608492Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "663b56e4-1e97-41bc-9eea-6bbfae8b4855",
  "platform": "ANDROID",
  "token": "sandbox-rider-d8fc2bbf-223d-4324-a6d6-a638a6a412da"
}
```

```json
{
  "id": "5c583362-478e-4ff6-bfcf-b15a32919120",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T07:52:23.883149Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3c5bac57-3a45-45ba-b918-a91941d3f8d8",
  "quote_id": "24c73f67-dfa4-4d88-96fb-8a84cce7dbf2",
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
  "id": "521b66b3-582c-46df-9146-f7352290dd1b",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b618b959-4821-4df9-a626-03f454b685c2",
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
  "created_at": "2026-10-30T07:52:24.172608Z",
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
    "id": "fca4fe86-71ea-4e2b-8628-874f0ea995c0",
    "order_id": "521b66b3-582c-46df-9146-f7352290dd1b",
    "expires_at": "2026-10-30T07:52:39.176057Z",
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

`POST /api/driver/v1/offers/fca4fe86-71ea-4e2b-8628-874f0ea995c0/accept` → **200**

```json
{
  "command_id": "862a58ba-6140-4ffc-ba25-aa352643488a"
}
```

```json
{
  "id": "d467717a-0afa-4ac0-8e8c-c84fd4395cbf",
  "order_id": "521b66b3-582c-46df-9146-f7352290dd1b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "268d2ad2-7745-4697-8492-b30efb37286a",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T07:52:24.148Z` → **200**

```json
[
  {
    "at": "2026-10-30T07:52:24.434138559Z",
    "token_suffix": "0c16c8",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "ae7bf603-78d0-46b4-bea7-daff084158ed",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "521b66b3-582c-46df-9146-f7352290dd1b",
      "order_version": "2"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380674297563&after=2026-10-30T07:52:24.148Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380674297563&after=2026-10-30T07:52:24.148Z` → **200**

```json
[
  {
    "at": "2026-10-30T07:52:25.439318923Z",
    "token_suffix": "a412da",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "0aa6e919-5793-41b8-b1cf-608c60ad09be",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "521b66b3-582c-46df-9146-f7352290dd1b",
      "order_version": "3"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/521b66b3-582c-46df-9146-f7352290dd1b/messages` → **201**

```json
{
  "command_id": "f1d1e17e-9816-4f0d-b880-0a5e75fb4695",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "d80775d7-4a2d-47e3-a8fe-8f2ffdca883c",
  "order_id": "521b66b3-582c-46df-9146-f7352290dd1b",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T07:52:26.102449002Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "268d2ad2-7745-4697-8492-b30efb37286a",
  "order_id": "521b66b3-582c-46df-9146-f7352290dd1b",
  "assignment_id": "d467717a-0afa-4ac0-8e8c-c84fd4395cbf",
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

`POST /api/driver/v1/trips/268d2ad2-7745-4697-8492-b30efb37286a/messages` → **201**

```json
{
  "command_id": "f9c3ae18-6c6f-43c4-980b-01600b9c57d2",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "067ea3df-b764-4efa-ad9a-54525b8ed3f5",
  "order_id": "521b66b3-582c-46df-9146-f7352290dd1b",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T07:52:26.650890764Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/521b66b3-582c-46df-9146-f7352290dd1b/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/268d2ad2-7745-4697-8492-b30efb37286a/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380674297563"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/a9942eee-d086-46da-b2ab-f47aca4cda6b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:52:27Z",
    "sequence": 1793346747495
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a9942eee-d086-46da-b2ab-f47aca4cda6b",
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
  "last_heartbeat_at": "2026-10-30T07:52:27.512919Z",
  "last_location_at": "2026-10-30T07:52:27.512919Z",
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
  "id": "268d2ad2-7745-4697-8492-b30efb37286a",
  "order_id": "521b66b3-582c-46df-9146-f7352290dd1b",
  "assignment_id": "d467717a-0afa-4ac0-8e8c-c84fd4395cbf",
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

`POST /api/driver/v1/trips/268d2ad2-7745-4697-8492-b30efb37286a/arrive` → **200**

```json
{
  "command_id": "8ff7d4d8-24b7-4eb5-9283-a13f52dd9ad8",
  "expected_version": 0
}
```

```json
{
  "id": "268d2ad2-7745-4697-8492-b30efb37286a",
  "order_id": "521b66b3-582c-46df-9146-f7352290dd1b",
  "assignment_id": "d467717a-0afa-4ac0-8e8c-c84fd4395cbf",
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
  "arrived_at": "2026-10-30T07:52:28.051833Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/268d2ad2-7745-4697-8492-b30efb37286a/start` → **200**

```json
{
  "command_id": "76e9dd00-d5db-4fe9-be0b-8cb5329fb7c8",
  "expected_version": 1
}
```

```json
{
  "id": "268d2ad2-7745-4697-8492-b30efb37286a",
  "order_id": "521b66b3-582c-46df-9146-f7352290dd1b",
  "assignment_id": "d467717a-0afa-4ac0-8e8c-c84fd4395cbf",
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
  "arrived_at": "2026-10-30T07:52:28.051833Z",
  "started_at": "2026-10-30T07:52:28.330724Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/a9942eee-d086-46da-b2ab-f47aca4cda6b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:53:16Z",
    "sequence": 1793346796626
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a9942eee-d086-46da-b2ab-f47aca4cda6b",
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
  "last_heartbeat_at": "2026-10-30T07:53:16.644546Z",
  "last_location_at": "2026-10-30T07:53:16.644546Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/268d2ad2-7745-4697-8492-b30efb37286a/complete` → **200**

```json
{
  "command_id": "a8693b2e-7339-4abc-8dda-3d68bea70c6d",
  "expected_version": 2,
  "reported_at": "2026-10-30T07:53:16Z",
  "cash_received": true
}
```

```json
{
  "id": "268d2ad2-7745-4697-8492-b30efb37286a",
  "order_id": "521b66b3-582c-46df-9146-f7352290dd1b",
  "assignment_id": "d467717a-0afa-4ac0-8e8c-c84fd4395cbf",
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
  "arrived_at": "2026-10-30T07:52:28.051833Z",
  "started_at": "2026-10-30T07:52:28.330724Z",
  "completed_at": "2026-10-30T07:53:16.928571Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/521b66b3-582c-46df-9146-f7352290dd1b` → **200**

```json
{
  "id": "521b66b3-582c-46df-9146-f7352290dd1b",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "b618b959-4821-4df9-a626-03f454b685c2",
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
    "id": "d467717a-0afa-4ac0-8e8c-c84fd4395cbf",
    "order_id": "521b66b3-582c-46df-9146-f7352290dd1b",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "268d2ad2-7745-4697-8492-b30efb37286a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T07:52:24.172608Z",
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
    "id": "521b66b3-582c-46df-9146-f7352290dd1b",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-30T07:52:24.172608Z",
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
    "id": "268d2ad2-7745-4697-8492-b30efb37286a",
    "order_id": "521b66b3-582c-46df-9146-f7352290dd1b",
    "order_short_number": 13,
    "created_at": "2026-10-30T07:52:24.741483Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "4bfc701f-d920-4b74-8cac-fd88cbeabacd",
    "order_id": "8ce058ab-9651-4f18-a531-db0443d47210",
    "order_short_number": 8,
    "created_at": "2026-10-30T07:49:34.747717Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "0fc496f9-d883-4461-b94a-237f411edecd",
    "order_id": "3c5e008c-dc35-4f8c-baee-5d018c63d4ad",
    "order_short_number": 3,
    "created_at": "2026-10-30T07:48:00.204855Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "3b699128-fe94-4b79-8dc3-64cc76cf7c0e",
    "order_id": "1793592a-3d2d-423a-bbe2-dee779a3a806",
    "order_short_number": 2,
    "created_at": "2026-10-30T07:47:30.574485Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "399f2a71-5218-46ec-bfb2-b2bda0fcddb9",
    "order_id": "1037fb1f-477e-4b7a-b95f-013e38e9b491",
    "order_short_number": 1,
    "created_at": "2026-10-30T07:47:21.013067Z",
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

`GET /api/rider/v1/orders/521b66b3-582c-46df-9146-f7352290dd1b/tip` → **200**

```json
{
  "order_id": "521b66b3-582c-46df-9146-f7352290dd1b",
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
  "available_until": "2026-10-31T07:53:16.928571Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/521b66b3-582c-46df-9146-f7352290dd1b/tip` → **201**

```json
{
  "command_id": "5cd0acca-0a0f-4a70-9571-2175397c84e4",
  "amount_minor": 1100
}
```

```json
{
  "id": "e1b029ac-2a07-4bcd-b2f9-a7265ec9b7ca",
  "order_id": "521b66b3-582c-46df-9146-f7352290dd1b",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T07:53:21.896357Z"
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
  "session_id": "96f5dafb-8de1-4fe7-ad9f-7bdffea43ec9",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDc3MDIsImlhdCI6MTc5MzM0NjgwMiwianRpIjoiZTY3ZjZmNTAtMDEzYi00MmZkLWI2OWQtYmZiYzM1Y2MzYjNiIiwic2lkIjoiOTZmNWRhZmItOGRlMS00ZmU3LWFkOWYtN2JkZmZlYTQzZWM5In0.XSp8FnU88i3IpXsB4ZxRtDoGEm6eiefol5hWVsF7w_c",
  "access_expires_at": "2026-10-30T08:08:22.488000929Z",
  "refresh_token": "ps13xpAGRJ8Os3pbhoW5kQVWdUBzWvpLAOD-oQ8ECq0",
  "refresh_expires_at": "2026-10-30T19:53:22.487122362Z",
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
  "generated_at": "2026-10-30T07:53:22.75761932Z"
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
  "generated_at": "2026-10-30T07:53:23.036600945Z"
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
  "session_id": "aa3e4f02-afd0-48a6-973d-2565a0f11144",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDc3MDMsImlhdCI6MTc5MzM0NjgwMywianRpIjoiYTRkNWE5NzYtN2RkOS00OWJkLWJlODUtMTQ1YWY1NzJjMTBkIiwic2lkIjoiYWEzZTRmMDItYWZkMC00OGE2LTk3M2QtMjU2NWEwZjExMTQ0In0.gtbXZnv4MLtxA10CuFkzW6r7dqUGQIJGcGePRTiitNc",
  "access_expires_at": "2026-10-30T08:08:23.627537844Z",
  "refresh_token": "iS3wSG5ur4t2v5Na_Y4vVrxrc_F_sIMMynXKjdPqrg8",
  "refresh_expires_at": "2026-10-30T19:53:23.626976616Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/521b66b3-582c-46df-9146-f7352290dd1b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T07:52:24.173247Z",
      "actor": {
        "type": "CLIENT",
        "id": "b618b959-4821-4df9-a626-03f454b685c2",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "521b66b3-582c-46df-9146-f7352290dd1b",
        "quote_id": "24c73f67-dfa4-4d88-96fb-8a84cce7dbf2",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "6de07a6f-eba9-4ebd-8a66-902a6df7ca17"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T07:52:24.175333Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "521b66b3-582c-46df-9146-f7352290dd1b",
        "attempt_id": "bdf21e3a-cb17-483a-8398-4e469563c16a",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "6de07a6f-eba9-4ebd-8a66-902a6df7ca17"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T07:52:24.177678Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "fca4fe86-71ea-4e2b-8628-874f0ea995c0",
        "order_id": "521b66b3-582c-46df-9146-f7352290dd1b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "6de07a6f-eba9-4ebd-8a66-902a6df7ca17"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T07:52:24.742908Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "fca4fe86-71ea-4e2b-8628-874f0ea995c0",
        "order_id": "521b66b3-582c-46df-9146-f7352290dd1b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "d467717a-0afa-4ac0-8e8c-c84fd4395cbf"
      },
      "correlation_id": "7350788b-6f37-4a1a-ab97-246701275fc8"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T07:53:24.170533903Z",
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
      "last_location_at": "2026-10-30T07:53:16.644546Z",
      "order_id": null
    }
  ]
}
```

Done: order 521b66b3-582c-46df-9146-f7352290dd1b.

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
  "session_id": "bb431e53-2c04-4c20-9a2a-1ea2bc004766",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDc3MDQsImlhdCI6MTc5MzM0NjgwNCwianRpIjoiZjA5YTk3OWYtYTI5MS00ODU0LTg2YjUtYTViMjNjMTA1YjFkIiwic2lkIjoiYmI0MzFlNTMtMmMwNC00YzIwLTlhMmEtMWVhMmJjMDA0NzY2In0.34P1yndt0fWnQkJj20fyhC-FTvZGr4FJUaN3yOUUi2Q",
  "access_expires_at": "2026-10-30T08:08:24.777364266Z",
  "refresh_token": "JcsyE2_4Ra3csqxNhS9gvdqI_XjIkBbk-itvg1Fehs8",
  "refresh_expires_at": "2026-10-30T19:53:24.776869076Z",
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
  "command_id": "725ada98-1760-4f9d-8af5-c289424b8bf6",
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
  "timestamp": "2026-10-30T07:53:25.000+0000",
  "channel": {
    "id": "1730052000.126451049",
    "linkedid": "1730052000.126451049",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678686517"
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
  "timestamp": "2026-10-30T07:53:25.000+0000",
  "channel": {
    "id": "1730052000.126451049",
    "linkedid": "1730052000.126451049",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678686517"
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
  "session_id": "6615f50e-32e0-4bc2-86cc-5baa71864d71",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDc3MDUsImlhdCI6MTc5MzM0NjgwNSwianRpIjoiY2Q3OGQzZWMtYTQwOS00MzQzLWJmYWEtNWZlMDIyOTNiYTBhIiwic2lkIjoiNjYxNWY1MGUtMzJlMC00YmMyLTg2Y2MtNWJhYTcxODY0ZDcxIn0.jVTHv2o98cEYeUqutVD6hYM8He9-UrxP413nTP_fFn4",
  "access_expires_at": "2026-10-30T08:08:25.950107788Z",
  "refresh_token": "xiydZRXo3VN_n347uNggqwRDl805RvIx5QpdCio96q0",
  "refresh_expires_at": "2026-10-30T19:53:25.949475694Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "271b2c4f-829d-42d2-bbcc-f894b19a7524",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380678686517",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T07:53:25Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/271b2c4f-829d-42d2-bbcc-f894b19a7524/answer` → **200**

```json
{
  "command_id": "9ddac88e-fc92-48a3-91b3-4e37045553f6"
}
```

```json
{
  "id": "271b2c4f-829d-42d2-bbcc-f894b19a7524",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380678686517",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
  "order_ids": [],
  "started_at": "2026-10-30T07:53:25Z",
  "answered_at": "2026-10-30T07:53:26.511961Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.126451049",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "08870421-3432-49b5-96d8-85a158aeec4e",
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
  "id": "ac03c77b-e878-4645-a53f-9c1c981a2a91",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:58:26.813833Z",
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
  "command_id": "21ea6fe7-365a-4360-937a-b6a49e0bea87",
  "quote_id": "ac03c77b-e878-4645-a53f-9c1c981a2a91",
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
    "phone": "+380678686517"
  },
  "call_id": "271b2c4f-829d-42d2-bbcc-f894b19a7524"
}
```

```json
{
  "id": "d60a521d-a083-46a6-b6e7-0ec1b4a80425",
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
  "created_at": "2026-10-30T07:53:27.103672Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678686517"
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
    "id": "1730052000.126451049",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "271b2c4f-829d-42d2-bbcc-f894b19a7524",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678686517",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
      "order_ids": [
        "d60a521d-a083-46a6-b6e7-0ec1b4a80425"
      ],
      "started_at": "2026-10-30T07:53:25Z",
      "answered_at": "2026-10-30T07:53:26.511961Z",
      "ended_at": "2026-10-30T07:53:27.418142Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "f3de0de8-88ba-482b-ac11-a0a1c024d122",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672565865",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
      "order_ids": [],
      "started_at": "2026-10-30T07:47:49.113605Z",
      "answered_at": "2026-10-30T07:47:49.444296Z",
      "ended_at": "2026-10-30T07:47:49.748314Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T07:47:55.34099Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/d60a521d-a083-46a6-b6e7-0ec1b4a80425` → **200**

```json
{
  "id": "d60a521d-a083-46a6-b6e7-0ec1b4a80425",
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
  "created_at": "2026-10-30T07:53:27.103672Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678686517"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/d60a521d-a083-46a6-b6e7-0ec1b4a80425` → **200**

```json
{
  "id": "d60a521d-a083-46a6-b6e7-0ec1b4a80425",
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
  "created_at": "2026-10-30T07:53:27.103672Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678686517"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d60a521d-a083-46a6-b6e7-0ec1b4a80425/cancel` → **200**

```json
{
  "command_id": "6ef4cf52-f69b-4151-b6f6-6770b8f762c1",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "d60a521d-a083-46a6-b6e7-0ec1b4a80425",
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
  "created_at": "2026-10-30T07:53:27.103672Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678686517"
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

Done: call 271b2c4f-829d-42d2-bbcc-f894b19a7524 with order d60a521d-a083-46a6-b6e7-0ec1b4a80425.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-23487"
}
```

```json
{
  "challenge_id": "90b2a7e7-b1eb-451c-941d-b03f562d38ff",
  "expires_at": "2026-10-30T07:58:28.627872741Z",
  "resend_available_at": "2026-10-30T07:53:29.627872741Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "168542",
  "sent_at": "2026-10-30T07:53:28.630485245Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "90b2a7e7-b1eb-451c-941d-b03f562d38ff",
  "code": "168542",
  "device_ref": "sandbox-23487"
}
```

```json
{
  "session_id": "a9b1eccf-ddde-40f3-8151-8d29fa7cf582",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NzcwOCwiaWF0IjoxNzkzMzQ2ODA4LCJqdGkiOiJlYzQyOTNiYS05ZjRhLTQ5MzAtOGIzYS04MDM4ZmY5MWE0NTEiLCJzaWQiOiJhOWIxZWNjZi1kZGRlLTQwZjMtODE1MS04ZDI5ZmE3Y2Y1ODIifQ.3BCjuw97BALw2JeCbUInALxUiqvjFyaeCVHaoSOsnpc",
  "access_expires_at": "2026-10-30T08:08:28.919739889Z",
  "refresh_token": "kcrqMR-psqIKXCOq1j-sYEXOt0LU6k9BEAc8-e-kMYI",
  "refresh_expires_at": "2026-11-29T07:53:28.919187988Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a9942eee-d086-46da-b2ab-f47aca4cda6b",
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
  "last_heartbeat_at": "2026-10-30T07:53:16.644546Z",
  "last_location_at": "2026-10-30T07:53:16.644546Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a9942eee-d086-46da-b2ab-f47aca4cda6b/handover` → **200**

```json
{
  "command_id": "e13a0346-ff0d-44bd-8c9f-3fb19e87cc7e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a9942eee-d086-46da-b2ab-f47aca4cda6b",
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
  "last_heartbeat_at": "2026-10-30T07:53:16.644546Z",
  "last_location_at": "2026-10-30T07:53:16.644546Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 86 s to the next point)

`POST /api/driver/v1/work-sessions/a9942eee-d086-46da-b2ab-f47aca4cda6b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:54:55Z",
    "sequence": 1793346895761
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a9942eee-d086-46da-b2ab-f47aca4cda6b",
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
  "last_heartbeat_at": "2026-10-30T07:54:55.779467Z",
  "last_location_at": "2026-10-30T07:54:55.779467Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665406236",
  "device_ref": "sandbox-16514"
}
```

```json
{
  "challenge_id": "6eebae10-fe5b-4757-a799-3fa2eaa1614f",
  "expires_at": "2026-10-30T07:59:56.047513519Z",
  "resend_available_at": "2026-10-30T07:54:57.047513519Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380665406236` → **200**

```json
{
  "phone": "+380665406236",
  "audience": "CLIENT",
  "code": "539010",
  "sent_at": "2026-10-30T07:54:56.050178166Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6eebae10-fe5b-4757-a799-3fa2eaa1614f",
  "code": "539010",
  "device_ref": "sandbox-16514"
}
```

```json
{
  "session_id": "32425eb0-e9ce-4026-98ef-817748c87c06",
  "subject": {
    "type": "CLIENT",
    "id": "e536558d-40c8-469f-ba9d-67c6713ce72b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNTM2NTU4ZC00MGM4LTQ2OWYtYmE5ZC02N2M2NzEzY2U3MmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ3Nzk2LCJpYXQiOjE3OTMzNDY4OTYsImp0aSI6IjViYmNkY2Q0LTZjZjQtNGRhZi1iZDNhLWNhZTIxNzZjM2RkYiIsInNpZCI6IjMyNDI1ZWIwLWU5Y2UtNDAyNi05OGVmLTgxNzc0OGM4N2MwNiJ9.slBUynF-BOXHZ1nn57xyy2BbYuFEEHvI3-X5E6tLs0U",
  "access_expires_at": "2026-10-30T08:09:56.350199544Z",
  "refresh_token": "l0ZnqYhJHzA34TrNTxpRTOfh2lNKZOv-F3YRnz59z-U",
  "refresh_expires_at": "2026-11-29T07:54:56.349620802Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "86608baa-0125-4cd9-a5e7-be4269747f69",
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
  "id": "1e707bde-f0b9-4cd9-8c9f-005d43db807b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:59:56.624715Z",
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
  "command_id": "2331e5c9-81e9-494e-ac32-0e861eca3c9c",
  "quote_id": "1e707bde-f0b9-4cd9-8c9f-005d43db807b",
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
  "id": "2e0b380a-b97e-4d5e-8da5-528cb6158742",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e536558d-40c8-469f-ba9d-67c6713ce72b",
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
  "created_at": "2026-10-30T07:54:56.909921Z",
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
    "id": "ce4103ea-bb1a-41f9-bf4c-4b990fa4828d",
    "order_id": "2e0b380a-b97e-4d5e-8da5-528cb6158742",
    "expires_at": "2026-10-30T07:55:11.912776Z",
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

`POST /api/driver/v1/offers/ce4103ea-bb1a-41f9-bf4c-4b990fa4828d/accept` → **200**

```json
{
  "command_id": "49ce52c5-5c0b-4944-b45d-76a9174b56a7"
}
```

```json
{
  "id": "2ff55a69-f729-4e7e-aaf8-4a7238693b1a",
  "order_id": "2e0b380a-b97e-4d5e-8da5-528cb6158742",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6de9564c-0267-437c-86ed-e17cdddb761f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6de9564c-0267-437c-86ed-e17cdddb761f",
  "order_id": "2e0b380a-b97e-4d5e-8da5-528cb6158742",
  "assignment_id": "2ff55a69-f729-4e7e-aaf8-4a7238693b1a",
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

`POST /api/driver/v1/work-sessions/a9942eee-d086-46da-b2ab-f47aca4cda6b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:54:58Z",
    "sequence": 1793346898433
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a9942eee-d086-46da-b2ab-f47aca4cda6b",
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
  "last_heartbeat_at": "2026-10-30T07:54:58.060738Z",
  "last_location_at": "2026-10-30T07:54:58.060738Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/6de9564c-0267-437c-86ed-e17cdddb761f/arrive` → **200**

```json
{
  "command_id": "b9d30a0d-c0cd-4617-a0b5-b93d5463ee68",
  "expected_version": 0
}
```

```json
{
  "id": "6de9564c-0267-437c-86ed-e17cdddb761f",
  "order_id": "2e0b380a-b97e-4d5e-8da5-528cb6158742",
  "assignment_id": "2ff55a69-f729-4e7e-aaf8-4a7238693b1a",
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
  "arrived_at": "2026-10-30T07:54:58.364113Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6de9564c-0267-437c-86ed-e17cdddb761f/start` → **200**

```json
{
  "command_id": "afa71571-2421-4654-a970-e93823741ed1",
  "expected_version": 1
}
```

```json
{
  "id": "6de9564c-0267-437c-86ed-e17cdddb761f",
  "order_id": "2e0b380a-b97e-4d5e-8da5-528cb6158742",
  "assignment_id": "2ff55a69-f729-4e7e-aaf8-4a7238693b1a",
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
  "arrived_at": "2026-10-30T07:54:58.364113Z",
  "started_at": "2026-10-30T07:54:58.660124Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

(the car drives 60 s to the next point)

`POST /api/driver/v1/work-sessions/a9942eee-d086-46da-b2ab-f47aca4cda6b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:55:58Z",
    "sequence": 1793346958957
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a9942eee-d086-46da-b2ab-f47aca4cda6b",
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
  "last_heartbeat_at": "2026-10-30T07:55:58.974744Z",
  "last_location_at": "2026-10-30T07:55:58.974744Z",
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
  "device_ref": "sandbox-32127"
}
```

```json
{
  "challenge_id": "3bf699f6-96f2-4fd4-be70-fe5bcc574fa9",
  "expires_at": "2026-10-30T08:00:59.247811842Z",
  "resend_available_at": "2026-10-30T07:56:00.247811842Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "387380",
  "sent_at": "2026-10-30T07:55:59.250438932Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3bf699f6-96f2-4fd4-be70-fe5bcc574fa9",
  "code": "387380",
  "device_ref": "sandbox-32127"
}
```

```json
{
  "session_id": "06de8072-544a-4264-b7ab-6427bace0964",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0Nzg1OSwiaWF0IjoxNzkzMzQ2OTU5LCJqdGkiOiIwY2M2OThjYS01ODQ3LTQzYTAtYWY5Ni00ZTE5ODU4ZWExZWYiLCJzaWQiOiIwNmRlODA3Mi01NDRhLTQyNjQtYjdhYi02NDI3YmFjZTA5NjQifQ.jTjo0N6HPFs_JbDfQFKAdJ1cJ2urQNABrqbK7XFjd1o",
  "access_expires_at": "2026-10-30T08:10:59.562429752Z",
  "refresh_token": "786wOrG30RkoTI-40HedGQElmYrRjGFUq3tt7x1s28E",
  "refresh_expires_at": "2026-11-29T07:55:59.561665513Z",
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
  "command_id": "d8e70e48-e8b8-4ab2-a486-6e590b9a80ad",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:56:00Z",
    "sequence": 1793346960119
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8e143f86-ecac-4a70-9008-a75c92157f0b",
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
  "last_heartbeat_at": "2026-10-30T07:56:00.136913Z",
  "last_location_at": "2026-10-30T07:56:00.136913Z",
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
  "session_id": "c067ddcc-5be9-4701-8634-153099982ada",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDc4NjAsImlhdCI6MTc5MzM0Njk2MCwianRpIjoiNWQ1ZTJjMzAtNzgyZC00MWM0LTk4YjgtNWRjNDVhOTNmNTlkIiwic2lkIjoiYzA2N2RkY2MtNWJlOS00NzAxLTg2MzQtMTUzMDk5OTgyYWRhIn0.4Nrs1RAbG96429pw_l1AOoIiq7jZ3Cs2PhpyMnUGtiI",
  "access_expires_at": "2026-10-30T08:11:00.729234977Z",
  "refresh_token": "5bV5US1Wpc1_DoiSeJLVctx345nCqY6uPXk1ylgATys",
  "refresh_expires_at": "2026-10-30T19:56:00.728678316Z",
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
  "session_id": "acfb84f6-8aa8-4abb-aab1-f10c9ab957dd",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDc4NjEsImlhdCI6MTc5MzM0Njk2MSwianRpIjoiM2JmYWVkMzAtYTVmMi00MmRmLWI1OTYtNWZjOGIyMDA1YzE1Iiwic2lkIjoiYWNmYjg0ZjYtOGFhOC00YWJiLWFhYjEtZjEwYzlhYjk1N2RkIn0.HmyStoOAbuGDxrSIYG5WRPzfNJ4cWyzPqhLEtrTWDR4",
  "access_expires_at": "2026-10-30T08:11:01.32235447Z",
  "refresh_token": "QfjeC3Bb9TvU0xup7t-hOHOqgIN9gQYPtHx6QI5UDQs",
  "refresh_expires_at": "2026-10-30T19:56:01.321775121Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/2e0b380a-b97e-4d5e-8da5-528cb6158742` → **200**

```json
{
  "id": "2e0b380a-b97e-4d5e-8da5-528cb6158742",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "e536558d-40c8-469f-ba9d-67c6713ce72b",
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
    "id": "2ff55a69-f729-4e7e-aaf8-4a7238693b1a",
    "order_id": "2e0b380a-b97e-4d5e-8da5-528cb6158742",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "6de9564c-0267-437c-86ed-e17cdddb761f",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T07:54:56.909921Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/2e0b380a-b97e-4d5e-8da5-528cb6158742/interrupt` → **200**

```json
{
  "command_id": "3fcc75a7-7743-4be7-9f01-1eeef1ae1dfc",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "2e0b380a-b97e-4d5e-8da5-528cb6158742",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "e536558d-40c8-469f-ba9d-67c6713ce72b",
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
      "id": "2ff55a69-f729-4e7e-aaf8-4a7238693b1a",
      "order_id": "2e0b380a-b97e-4d5e-8da5-528cb6158742",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "6de9564c-0267-437c-86ed-e17cdddb761f",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T07:54:56.909921Z",
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
    "id": "4eca3013-fef2-4261-a665-07871a718168",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "e536558d-40c8-469f-ba9d-67c6713ce72b",
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
    "id": "428ced3a-1afc-48af-9dc0-bc03b01959cf",
    "order_id": "4eca3013-fef2-4261-a665-07871a718168",
    "expires_at": "2026-10-30T07:56:16.926671Z",
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

`POST /api/driver/v1/offers/428ced3a-1afc-48af-9dc0-bc03b01959cf/accept` → **200**

```json
{
  "command_id": "3339ebeb-7ff9-4775-adf4-36f08e07d027"
}
```

```json
{
  "id": "0ff15da1-fb3f-494c-8e96-789f4105ed4f",
  "order_id": "4eca3013-fef2-4261-a665-07871a718168",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e1076750-c321-4b8d-9c37-65d8d6d56bd2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e1076750-c321-4b8d-9c37-65d8d6d56bd2",
  "order_id": "4eca3013-fef2-4261-a665-07871a718168",
  "assignment_id": "0ff15da1-fb3f-494c-8e96-789f4105ed4f",
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
  "session_id": "8e143f86-ecac-4a70-9008-a75c92157f0b",
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
  "last_heartbeat_at": "2026-10-30T07:56:00.136913Z",
  "last_location_at": "2026-10-30T07:56:00.136913Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/8e143f86-ecac-4a70-9008-a75c92157f0b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:56:03Z",
    "sequence": 1793346963361
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8e143f86-ecac-4a70-9008-a75c92157f0b",
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
  "last_heartbeat_at": "2026-10-30T07:56:03.378858Z",
  "last_location_at": "2026-10-30T07:56:03.378858Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/e1076750-c321-4b8d-9c37-65d8d6d56bd2/arrive` → **200**

```json
{
  "command_id": "e37e6a47-d515-469a-83bd-0fc097d31db2",
  "expected_version": 0
}
```

```json
{
  "id": "e1076750-c321-4b8d-9c37-65d8d6d56bd2",
  "order_id": "4eca3013-fef2-4261-a665-07871a718168",
  "assignment_id": "0ff15da1-fb3f-494c-8e96-789f4105ed4f",
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
  "arrived_at": "2026-10-30T07:56:03.660741Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e1076750-c321-4b8d-9c37-65d8d6d56bd2/start` → **200**

```json
{
  "command_id": "7f33ffff-99d6-4c2a-8ea3-354dcc83fa85",
  "expected_version": 1
}
```

```json
{
  "id": "e1076750-c321-4b8d-9c37-65d8d6d56bd2",
  "order_id": "4eca3013-fef2-4261-a665-07871a718168",
  "assignment_id": "0ff15da1-fb3f-494c-8e96-789f4105ed4f",
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
  "arrived_at": "2026-10-30T07:56:03.660741Z",
  "started_at": "2026-10-30T07:56:03.948743Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e1076750-c321-4b8d-9c37-65d8d6d56bd2/complete` → **200**

```json
{
  "command_id": "87cbf4f9-ec98-4314-83f9-6770dcf5a87c",
  "expected_version": 2,
  "reported_at": "2026-10-30T07:56:04Z"
}
```

```json
{
  "id": "e1076750-c321-4b8d-9c37-65d8d6d56bd2",
  "order_id": "4eca3013-fef2-4261-a665-07871a718168",
  "assignment_id": "0ff15da1-fb3f-494c-8e96-789f4105ed4f",
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
  "arrived_at": "2026-10-30T07:56:03.660741Z",
  "started_at": "2026-10-30T07:56:03.948743Z",
  "completed_at": "2026-10-30T07:56:04.240847Z",
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
    "id": "4eca3013-fef2-4261-a665-07871a718168",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-30T07:56:01.91581Z",
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
    "id": "2e0b380a-b97e-4d5e-8da5-528cb6158742",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-30T07:54:56.909921Z",
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

`GET /api/operator/v1/orders/2e0b380a-b97e-4d5e-8da5-528cb6158742/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T07:54:56.910445Z",
      "actor": {
        "type": "CLIENT",
        "id": "e536558d-40c8-469f-ba9d-67c6713ce72b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2e0b380a-b97e-4d5e-8da5-528cb6158742",
        "quote_id": "1e707bde-f0b9-4cd9-8c9f-005d43db807b",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "ff3c51b0-bb60-4c6b-96b0-a9b55f3b8cb8"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T07:54:56.912116Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2e0b380a-b97e-4d5e-8da5-528cb6158742",
        "attempt_id": "4be797be-50b5-4f0f-950a-fa4606202876",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "ff3c51b0-bb60-4c6b-96b0-a9b55f3b8cb8"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T07:54:56.918491Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ce4103ea-bb1a-41f9-bf4c-4b990fa4828d",
        "order_id": "2e0b380a-b97e-4d5e-8da5-528cb6158742",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "ff3c51b0-bb60-4c6b-96b0-a9b55f3b8cb8"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T07:54:57.505023Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "ce4103ea-bb1a-41f9-bf4c-4b990fa4828d",
        "order_id": "2e0b380a-b97e-4d5e-8da5-528cb6158742",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "2ff55a69-f729-4e7e-aaf8-4a7238693b1a"
      },
      "correlation_id": "fd9b43c1-9b5a-48ec-bb03-a9221abce67a"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/4eca3013-fef2-4261-a665-07871a718168/tip` → **200**

```json
{
  "order_id": "4eca3013-fef2-4261-a665-07871a718168",
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
  "available_until": "2026-10-31T07:56:04.240847Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/4eca3013-fef2-4261-a665-07871a718168/tip` → **409**

```json
{
  "command_id": "b1f262b2-4e3e-4352-ac4e-e6e7b39a31fe",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/4eca3013-fef2-4261-a665-07871a718168/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "9209ac9c-2af1-4bba-8b3a-6c9d46d63972"
}
```

Done: interrupted 2e0b380a-b97e-4d5e-8da5-528cb6158742, follow-up 4eca3013-fef2-4261-a665-07871a718168.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a9942eee-d086-46da-b2ab-f47aca4cda6b",
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
  "last_heartbeat_at": "2026-10-30T07:55:58.974744Z",
  "last_location_at": "2026-10-30T07:55:58.974744Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a9942eee-d086-46da-b2ab-f47aca4cda6b/close` → **200**

```json
{
  "command_id": "c5b884f7-da3b-4757-9d2b-738f3088ffb4",
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
  "session_id": "8e143f86-ecac-4a70-9008-a75c92157f0b",
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
  "last_heartbeat_at": "2026-10-30T07:56:03.378858Z",
  "last_location_at": "2026-10-30T07:56:03.378858Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8e143f86-ecac-4a70-9008-a75c92157f0b/close` → **200**

```json
{
  "command_id": "4e6ab118-9061-4324-8a58-779e5dc37b5e",
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
  "session_id": "0c363a74-a53e-459d-aa84-97aa90c070af",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDc4NzAsImlhdCI6MTc5MzM0Njk3MCwianRpIjoiYWEwNTI2NDItM2I3NS00OGE2LTk2YmYtNGIxMDU3YzVhNDgyIiwic2lkIjoiMGMzNjNhNzQtYTUzZS00NTlkLWFhODQtOTdhYTkwYzA3MGFmIn0.IkGRJ7TUO0hvUn4YyUDWSwZZTtjGo7Gje8zYyucoJtE",
  "access_expires_at": "2026-10-30T08:11:10.411368452Z",
  "refresh_token": "322gNL_Ar_Ho0jYKfdNJXVWS2kwzP7dBoWZZMdTIr9Q",
  "refresh_expires_at": "2026-10-30T19:56:10.410616856Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "090cb41a-f982-4f95-b8b2-ed853484f3d2",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T07:56:10Z"
}
```

```json
{
  "id": "832ff77a-599c-4f20-9e22-74bc83327641",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T07:56:10Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/832ff77a-599c-4f20-9e22-74bc83327641/publish` → **200**

```json
{
  "command_id": "bb0598b9-cd54-4321-a9d5-f9f86b8efabe",
  "expected_version": 0
}
```

```json
{
  "id": "832ff77a-599c-4f20-9e22-74bc83327641",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T07:56:10.989297Z",
  "published_at": "2026-10-30T07:56:10.989297Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "832ff77a-599c-4f20-9e22-74bc83327641",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T07:56:10.989297Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632684286",
  "device_ref": "sandbox-28176"
}
```

```json
{
  "challenge_id": "86ef8369-9717-461d-a8c7-28d181691880",
  "expires_at": "2026-10-30T08:01:11.532861123Z",
  "resend_available_at": "2026-10-30T07:56:12.532861123Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632684286` → **200**

```json
{
  "phone": "+380632684286",
  "audience": "CLIENT",
  "code": "610024",
  "sent_at": "2026-10-30T07:56:11.535557812Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "86ef8369-9717-461d-a8c7-28d181691880",
  "code": "610024",
  "device_ref": "sandbox-28176"
}
```

```json
{
  "session_id": "3e87b0e8-fffe-4bfe-b841-ba4cb8d2f5e3",
  "subject": {
    "type": "CLIENT",
    "id": "70df5b03-4c32-4c1f-a8dc-a9c6b1e8e544"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MGRmNWIwMy00YzMyLTRjMWYtYThkYy1hOWM2YjFlOGU1NDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ3ODcxLCJpYXQiOjE3OTMzNDY5NzEsImp0aSI6Ijg1NmFhYjkzLTRkNWMtNGM5OS1hMTBhLThjZDFlNWRjN2QwZSIsInNpZCI6IjNlODdiMGU4LWZmZmUtNGJmZS1iODQxLWJhNGNiOGQyZjVlMyJ9.0oWEs3cEqKhi_-MenBonVVFnYDscmixUyQ5QT0sMEwY",
  "access_expires_at": "2026-10-30T08:11:11.829592857Z",
  "refresh_token": "2AFifE15xv36nBKnFoeyIQ0Mra-p0LFRus8Vb0wyvv4",
  "refresh_expires_at": "2026-11-29T07:56:11.829156848Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "832ff77a-599c-4f20-9e22-74bc83327641",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T07:56:10.989297Z",
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
  "command_id": "e6b55f72-f38d-442e-8217-cd879f8572aa",
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
  "id": "be4f1433-b79f-4429-814f-ae0e63ebde40",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:01:12.367501Z",
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
  "command_id": "74d65895-d6df-4720-93c3-724429144030",
  "quote_id": "be4f1433-b79f-4429-814f-ae0e63ebde40",
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
  "correlation_id": "50a113d5-9869-4292-b338-eaf2bc026193"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "871baea4-c673-47d5-b38d-cf686b6e3dff",
  "version_id": "832ff77a-599c-4f20-9e22-74bc83327641",
  "language": "uk"
}
```

```json
{
  "version_id": "832ff77a-599c-4f20-9e22-74bc83327641",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T07:56:12.933623Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "10d5f371-465b-433f-be54-1f7286d8bd3e",
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
  "id": "09845ba3-a235-4097-b579-6d506688cee6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:01:13.211839Z",
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
  "command_id": "b1e0e993-0ee6-472e-9670-fed81fe8428e",
  "quote_id": "09845ba3-a235-4097-b579-6d506688cee6",
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
  "id": "12b94d9e-b87c-4b55-9f06-5933ce117918",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "70df5b03-4c32-4c1f-a8dc-a9c6b1e8e544",
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
  "created_at": "2026-10-30T07:56:13.49769Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/12b94d9e-b87c-4b55-9f06-5933ce117918` → **200**

```json
{
  "id": "12b94d9e-b87c-4b55-9f06-5933ce117918",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "70df5b03-4c32-4c1f-a8dc-a9c6b1e8e544",
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
  "created_at": "2026-10-30T07:56:13.49769Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/12b94d9e-b87c-4b55-9f06-5933ce117918/cancel` → **200**

```json
{
  "command_id": "5b9513ac-63d3-4ff6-9a7e-36c08df87121",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "12b94d9e-b87c-4b55-9f06-5933ce117918",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "70df5b03-4c32-4c1f-a8dc-a9c6b1e8e544",
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
  "created_at": "2026-10-30T07:56:13.49769Z",
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

`POST /api/admin/v1/legal-documents/832ff77a-599c-4f20-9e22-74bc83327641` → **409**

```json
{
  "command_id": "5bc869c0-ab12-4a90-ac44-8312cc22cb3a",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T07:56:14Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/832ff77a-599c-4f20-9e22-74bc83327641",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "60bb4bc3-1cb1-426f-bfd1-266f689ea7ad"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "9984e6ec-8545-48aa-9c4a-1aff05e10ef3",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T07:56:14Z"
}
```

```json
{
  "id": "23d84d2a-59b0-4d91-a8bc-46493dc03e73",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T07:56:14Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/23d84d2a-59b0-4d91-a8bc-46493dc03e73/publish` → **200**

```json
{
  "command_id": "4a1dc4d1-3799-487a-9667-5a7c69cdb078",
  "expected_version": 0
}
```

```json
{
  "id": "23d84d2a-59b0-4d91-a8bc-46493dc03e73",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T07:56:14.954213Z",
  "published_at": "2026-10-30T07:56:14.954213Z",
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
  "device_ref": "sandbox-31548"
}
```

```json
{
  "challenge_id": "85203f04-c5b6-47b7-8c37-ee4cac8e0ca9",
  "expires_at": "2026-10-30T08:01:15.240151394Z",
  "resend_available_at": "2026-10-30T07:56:16.240151394Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "502740",
  "sent_at": "2026-10-30T07:56:15.242778151Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "85203f04-c5b6-47b7-8c37-ee4cac8e0ca9",
  "code": "502740",
  "device_ref": "sandbox-31548"
}
```

```json
{
  "session_id": "2239e53a-bc2c-4a63-943b-d0fcd6a3bb61",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0Nzg3NSwiaWF0IjoxNzkzMzQ2OTc1LCJqdGkiOiIzYzYzNGNmMC1iY2NiLTQyYjUtYTRhOC0yYzYzNDdmNzFiNmMiLCJzaWQiOiIyMjM5ZTUzYS1iYzJjLTRhNjMtOTQzYi1kMGZjZDZhM2JiNjEifQ.rYP0KLfyEGNralD73SjCFwqMrWmVEeptnNRBr_J3cFc",
  "access_expires_at": "2026-10-30T08:11:15.544931332Z",
  "refresh_token": "XhsQFWVUMi2Ldb9zAtQY3K0MhZvOeaSZb_Xa_beb0pY",
  "refresh_expires_at": "2026-11-29T07:56:15.544395727Z",
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
  "command_id": "57487fd1-d4b5-41ea-abdb-f96a42444b43",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:57:27Z",
    "sequence": 1793347047107
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b924465a-d687-4f77-83ae-c6c24494d3b4",
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
  "last_heartbeat_at": "2026-10-30T07:57:27.125551Z",
  "last_location_at": "2026-10-30T07:57:27.125551Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671335575",
  "device_ref": "sandbox-13658"
}
```

```json
{
  "challenge_id": "4869bfa0-aa10-47af-bb92-a928a58ec1dd",
  "expires_at": "2026-10-30T08:02:27.402541212Z",
  "resend_available_at": "2026-10-30T07:57:28.402541212Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671335575` → **200**

```json
{
  "phone": "+380671335575",
  "audience": "CLIENT",
  "code": "385452",
  "sent_at": "2026-10-30T07:57:27.405089576Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4869bfa0-aa10-47af-bb92-a928a58ec1dd",
  "code": "385452",
  "device_ref": "sandbox-13658"
}
```

```json
{
  "session_id": "864c7483-8606-4550-8df1-ab86ebfcab3a",
  "subject": {
    "type": "CLIENT",
    "id": "2c431ef7-6b97-48e2-be61-349e878b5f5a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzQzMWVmNy02Yjk3LTQ4ZTItYmU2MS0zNDllODc4YjVmNWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ3OTQ3LCJpYXQiOjE3OTMzNDcwNDcsImp0aSI6IjY2YzM3NDJjLWQwODctNDVhYi1iY2EwLWFlMTgxYWRiODE3YSIsInNpZCI6Ijg2NGM3NDgzLTg2MDYtNDU1MC04ZGYxLWFiODZlYmZjYWIzYSJ9.9P6rjuluVKt92FnJ6PHkegMHNnU4eDZRhhKW5hEeLDo",
  "access_expires_at": "2026-10-30T08:12:27.700478223Z",
  "refresh_token": "zRe9EwIoAHp30EONIFdxs5WXpgEjXd5sAXSBiuMOo0Y",
  "refresh_expires_at": "2026-11-29T07:57:27.699891309Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7f0d525f-e71e-42fe-8e89-648d881b5766",
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
  "id": "0d9e7a76-3a38-44f1-91f9-c220bd2e8a1a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:02:27.978245Z",
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
  "command_id": "0dcae37e-7d90-4418-82c6-6c65cb1ed3af",
  "quote_id": "0d9e7a76-3a38-44f1-91f9-c220bd2e8a1a",
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
    "phone": "+380672437408"
  }
}
```

```json
{
  "id": "7ee2f53e-4428-45ea-924e-1455a2a969a6",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c431ef7-6b97-48e2-be61-349e878b5f5a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T07:57:28.265535Z",
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
    "id": "e6c90104-18d3-4d63-9e7a-8a7edf89ca7d",
    "order_id": "7ee2f53e-4428-45ea-924e-1455a2a969a6",
    "expires_at": "2026-10-30T07:57:43.269472Z",
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

`POST /api/driver/v1/offers/e6c90104-18d3-4d63-9e7a-8a7edf89ca7d/accept` → **200**

```json
{
  "command_id": "e39e84a5-095f-419a-beba-8729dd3a2c86"
}
```

```json
{
  "id": "260335f8-626c-472e-baf2-3bfc4af5c409",
  "order_id": "7ee2f53e-4428-45ea-924e-1455a2a969a6",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3fe69f4c-d58e-4173-ab5e-37c2ddf5b114",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3fe69f4c-d58e-4173-ab5e-37c2ddf5b114",
  "order_id": "7ee2f53e-4428-45ea-924e-1455a2a969a6",
  "assignment_id": "260335f8-626c-472e-baf2-3bfc4af5c409",
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
    "phone": "+380672437408"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "03955261-300a-45d8-bf28-8f216de188ea",
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
  "id": "53d7ff5e-0822-44c3-b8fe-aa4fdc31869e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:02:29.381639Z",
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
  "command_id": "3d8f4825-02c4-4d57-9cb1-bc8ca8d0ba64",
  "quote_id": "53d7ff5e-0822-44c3-b8fe-aa4fdc31869e",
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
  "id": "d64c8864-1792-4344-831c-cc8bfa6c7e60",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c431ef7-6b97-48e2-be61-349e878b5f5a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:57:29.665903Z",
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
  "command_id": "77e39b45-17f3-44c5-86f5-f58a23472fcc",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T10:57:29Z"
}
```

```json
{
  "id": "160fe0e1-f59a-4d6d-a983-dac3e6d6b0b8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:02:29.961357Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T10:57:29Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "dd065761-570f-4b1c-8bb4-32652eb8284e",
  "quote_id": "160fe0e1-f59a-4d6d-a983-dac3e6d6b0b8",
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
  "pickup_at": "2026-10-30T10:57:29Z"
}
```

```json
{
  "id": "59a52bdb-f6db-40f1-9513-8ec698bc9547",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "2c431ef7-6b97-48e2-be61-349e878b5f5a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T07:57:30.249204Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T10:57:29Z",
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
  "command_id": "055a17d4-6df2-4c6f-8c14-db82db70a4c1",
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
  "id": "eb6ebd4e-d72b-4dff-9222-29ceeaf76319",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:02:30.565921Z",
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
  "command_id": "31dfb4d3-41b4-4d3b-b288-cd50e6eda161",
  "quote_id": "eb6ebd4e-d72b-4dff-9222-29ceeaf76319",
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
  "correlation_id": "1dbef0d4-1e91-4ceb-86d9-d56b11951775"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "59a52bdb-f6db-40f1-9513-8ec698bc9547",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "2c431ef7-6b97-48e2-be61-349e878b5f5a",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T07:57:30.249204Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T10:57:29Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "d64c8864-1792-4344-831c-cc8bfa6c7e60",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "2c431ef7-6b97-48e2-be61-349e878b5f5a",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T07:57:29.665903Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "7ee2f53e-4428-45ea-924e-1455a2a969a6",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "d64c8864-1792-4344-831c-cc8bfa6c7e60",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c431ef7-6b97-48e2-be61-349e878b5f5a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:57:29.665903Z",
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

`GET /api/rider/v1/orders/7ee2f53e-4428-45ea-924e-1455a2a969a6` → **200**

```json
{
  "id": "7ee2f53e-4428-45ea-924e-1455a2a969a6",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2c431ef7-6b97-48e2-be61-349e878b5f5a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "260335f8-626c-472e-baf2-3bfc4af5c409",
    "order_id": "7ee2f53e-4428-45ea-924e-1455a2a969a6",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "3fe69f4c-d58e-4173-ab5e-37c2ddf5b114",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T07:57:28.265535Z",
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
    "location_at": "2026-10-30T07:57:27.125551Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/7ee2f53e-4428-45ea-924e-1455a2a969a6/cancel` → **200**

```json
{
  "command_id": "a4689816-599f-40b6-a534-82f5456b60ee",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "7ee2f53e-4428-45ea-924e-1455a2a969a6",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "2c431ef7-6b97-48e2-be61-349e878b5f5a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "260335f8-626c-472e-baf2-3bfc4af5c409",
    "order_id": "7ee2f53e-4428-45ea-924e-1455a2a969a6",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "3fe69f4c-d58e-4173-ab5e-37c2ddf5b114",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T07:57:28.265535Z",
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

`GET /api/rider/v1/orders/d64c8864-1792-4344-831c-cc8bfa6c7e60` → **200**

```json
{
  "id": "d64c8864-1792-4344-831c-cc8bfa6c7e60",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c431ef7-6b97-48e2-be61-349e878b5f5a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:57:29.665903Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d64c8864-1792-4344-831c-cc8bfa6c7e60/cancel` → **200**

```json
{
  "command_id": "a8038002-ef8f-47ed-8e15-a9b0c530ab6d",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d64c8864-1792-4344-831c-cc8bfa6c7e60",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2c431ef7-6b97-48e2-be61-349e878b5f5a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T07:57:29.665903Z",
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

`GET /api/rider/v1/orders/59a52bdb-f6db-40f1-9513-8ec698bc9547` → **200**

```json
{
  "id": "59a52bdb-f6db-40f1-9513-8ec698bc9547",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "2c431ef7-6b97-48e2-be61-349e878b5f5a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T07:57:30.249204Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T10:57:29Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/59a52bdb-f6db-40f1-9513-8ec698bc9547/cancel` → **200**

```json
{
  "command_id": "c5ac5825-8b2f-46fb-9472-ba3dcdb1c906",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "59a52bdb-f6db-40f1-9513-8ec698bc9547",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "2c431ef7-6b97-48e2-be61-349e878b5f5a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T07:57:30.249204Z",
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
  "pickup_at": "2026-10-30T10:57:29Z",
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
  "session_id": "b924465a-d687-4f77-83ae-c6c24494d3b4",
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
  "last_heartbeat_at": "2026-10-30T07:57:27.125551Z",
  "last_location_at": "2026-10-30T07:57:27.125551Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b924465a-d687-4f77-83ae-c6c24494d3b4/close` → **200**

```json
{
  "command_id": "7c6a3644-fa7c-4530-b297-de4afc579ea4",
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

Done: orders 7ee2f53e-4428-45ea-924e-1455a2a969a6, d64c8864-1792-4344-831c-cc8bfa6c7e60, 59a52bdb-f6db-40f1-9513-8ec698bc9547.

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
  "session_id": "76ce945c-bf69-4c9a-92ab-3853b21806cf",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDc5NTQsImlhdCI6MTc5MzM0NzA1NCwianRpIjoiZmUyMWYwYWUtZjg0OS00ZDhiLTljYzYtZDBkMjFlMTM1OWI2Iiwic2lkIjoiNzZjZTk0NWMtYmY2OS00YzlhLTkyYWItMzg1M2IyMTgwNmNmIn0.VDwf-8kYJFRE4gSdveFG0dWByEGlFhMLIgiPPgveDuA",
  "access_expires_at": "2026-10-30T08:12:34.271197273Z",
  "refresh_token": "Gp5Evo3MO8kn9InCPZMgo7TUp6qo3v9QxDyMof9Bvyo",
  "refresh_expires_at": "2026-10-30T19:57:34.270702159Z",
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
  "session_id": "4e7295ee-be13-4099-ae02-4069c7d2fbeb",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDc5NTQsImlhdCI6MTc5MzM0NzA1NCwianRpIjoiMWNiN2E3YTYtNmVjNy00ZDEzLTlhNWEtMGQ5ZmEzMjY4YjFhIiwic2lkIjoiNGU3Mjk1ZWUtYmUxMy00MDk5LWFlMDItNDA2OWM3ZDJmYmViIn0.0JpqcQ4Lj2wpwIlYnz52hVPUZi0ESlSjyg2uIo0lRKY",
  "access_expires_at": "2026-10-30T08:12:34.860412653Z",
  "refresh_token": "tGt0a2qPk7nk7omr1_vh8cHtil99DVUKY9UzL9kwxYs",
  "refresh_expires_at": "2026-10-30T19:57:34.859965127Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-19042"
}
```

```json
{
  "challenge_id": "58e3ab91-9a9c-4369-9b1d-16522fcabb0d",
  "expires_at": "2026-10-30T08:02:35.125310044Z",
  "resend_available_at": "2026-10-30T07:57:36.125310044Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "419018",
  "sent_at": "2026-10-30T07:57:35.127704126Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "58e3ab91-9a9c-4369-9b1d-16522fcabb0d",
  "code": "419018",
  "device_ref": "sandbox-19042"
}
```

```json
{
  "session_id": "b0335d93-6033-4837-8124-60ff9f6b2c12",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0Nzk1NSwiaWF0IjoxNzkzMzQ3MDU1LCJqdGkiOiJkNWI2OTk5Yy1mM2E1LTQ2MDktYTAyMS0xMjMzNDU1YjI0YTEiLCJzaWQiOiJiMDMzNWQ5My02MDMzLTQ4MzctODEyNC02MGZmOWY2YjJjMTIifQ.Jdh-HgqvZPB6r3t_S6LuI6Z8_useknLaMh8d88CNSV4",
  "access_expires_at": "2026-10-30T08:12:35.416354959Z",
  "refresh_token": "vK2F13nonJn2Ddu7X7x-alOUsOU9TmrL91avAWR-TQY",
  "refresh_expires_at": "2026-11-29T07:57:35.415668759Z",
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
  "command_id": "ea24f978-b42d-4937-bf3c-44bef5b31ee2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:57:35Z",
    "sequence": 1793347055978
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "47d9db6a-a5a9-4ec0-988a-243af7877385",
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
  "last_heartbeat_at": "2026-10-30T07:57:35.996351Z",
  "last_location_at": "2026-10-30T07:57:35.996351Z",
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
  "command_id": "5171fcba-6064-40f3-a875-e22dc97fa963",
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
  "effective_at": "2026-10-30T07:57:36.547794Z",
  "changed_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "e72a0099-0680-46dd-9ec2-670a72e54279",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T07:48:05.917799Z",
  "last_entries": [
    {
      "order_id": "3c5e008c-dc35-4f8c-baee-5d018c63d4ad",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T07:48:05.917799Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "dc334a8c-be3f-4d02-b4e3-c821185eb6d8",
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
  "id": "ad7cad60-b096-45e2-bb2f-e104367a3ef5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:02:37.098705Z",
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
  "command_id": "16b9ad1f-cfd7-4cc9-a106-7515180ef56d",
  "quote_id": "ad7cad60-b096-45e2-bb2f-e104367a3ef5",
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
    "phone": "+3806711110739"
  }
}
```

```json
{
  "id": "191e1812-af24-4ac1-954c-c1960f55f2a7",
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
  "created_at": "2026-10-30T07:57:37.377855Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711110739"
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
    "id": "650a9848-a3d3-4786-8074-03ed999eae42",
    "order_id": "191e1812-af24-4ac1-954c-c1960f55f2a7",
    "expires_at": "2026-10-30T07:57:52.381253Z",
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

`POST /api/driver/v1/offers/650a9848-a3d3-4786-8074-03ed999eae42/accept` → **200**

```json
{
  "command_id": "e0f73f16-4199-40ab-b9af-6a03319a7d03"
}
```

```json
{
  "id": "ef1d5892-4214-4994-8280-76bbbe33a170",
  "order_id": "191e1812-af24-4ac1-954c-c1960f55f2a7",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9e0f5936-11e3-452e-a5e6-260cbad0de99",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9e0f5936-11e3-452e-a5e6-260cbad0de99",
  "order_id": "191e1812-af24-4ac1-954c-c1960f55f2a7",
  "assignment_id": "ef1d5892-4214-4994-8280-76bbbe33a170",
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
    "phone": "+3806711110739"
  }
}
```

`POST /api/driver/v1/work-sessions/47d9db6a-a5a9-4ec0-988a-243af7877385/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:57:38Z",
    "sequence": 1793347058481
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "47d9db6a-a5a9-4ec0-988a-243af7877385",
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
  "last_heartbeat_at": "2026-10-30T07:57:38.497543Z",
  "last_location_at": "2026-10-30T07:57:38.497543Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/9e0f5936-11e3-452e-a5e6-260cbad0de99/arrive` → **200**

```json
{
  "command_id": "4727eb1b-1349-4fb2-a152-b7b38f1bb7e5",
  "expected_version": 0
}
```

```json
{
  "id": "9e0f5936-11e3-452e-a5e6-260cbad0de99",
  "order_id": "191e1812-af24-4ac1-954c-c1960f55f2a7",
  "assignment_id": "ef1d5892-4214-4994-8280-76bbbe33a170",
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
  "arrived_at": "2026-10-30T07:57:38.774114Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711110739"
  }
}
```

`POST /api/driver/v1/trips/9e0f5936-11e3-452e-a5e6-260cbad0de99/start` → **200**

```json
{
  "command_id": "7c150194-b036-4cee-b878-ea8bcd077d75",
  "expected_version": 1
}
```

```json
{
  "id": "9e0f5936-11e3-452e-a5e6-260cbad0de99",
  "order_id": "191e1812-af24-4ac1-954c-c1960f55f2a7",
  "assignment_id": "ef1d5892-4214-4994-8280-76bbbe33a170",
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
  "arrived_at": "2026-10-30T07:57:38.774114Z",
  "started_at": "2026-10-30T07:57:39.064822Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711110739"
  }
}
```

`POST /api/driver/v1/trips/9e0f5936-11e3-452e-a5e6-260cbad0de99/complete` → **200**

```json
{
  "command_id": "75a1639e-4e95-41be-b1ef-0169acea976b",
  "expected_version": 2,
  "reported_at": "2026-10-30T07:57:39Z",
  "cash_received": true
}
```

```json
{
  "id": "9e0f5936-11e3-452e-a5e6-260cbad0de99",
  "order_id": "191e1812-af24-4ac1-954c-c1960f55f2a7",
  "assignment_id": "ef1d5892-4214-4994-8280-76bbbe33a170",
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
  "arrived_at": "2026-10-30T07:57:38.774114Z",
  "started_at": "2026-10-30T07:57:39.064822Z",
  "completed_at": "2026-10-30T07:57:39.356557Z",
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
  "command_id": "c4aa45a1-d0d3-446f-a9c0-469d226822b2",
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
  "id": "84b5f8c3-1ac0-402a-947d-1cf73347708a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:02:39.640571Z",
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
  "command_id": "ee9d1d77-da72-4328-bff3-2a22d9621eca",
  "quote_id": "84b5f8c3-1ac0-402a-947d-1cf73347708a",
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
    "phone": "+3806711121078"
  }
}
```

```json
{
  "id": "76cb7984-8bd0-4d1f-a546-586828a9017e",
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
  "created_at": "2026-10-30T07:57:39.924888Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121078"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/76cb7984-8bd0-4d1f-a546-586828a9017e` → **200**

```json
{
  "id": "76cb7984-8bd0-4d1f-a546-586828a9017e",
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
  "created_at": "2026-10-30T07:57:39.924888Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121078"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/76cb7984-8bd0-4d1f-a546-586828a9017e/cancel` → **200**

```json
{
  "command_id": "609a3e3f-a7de-4afb-8023-f775a5c37dec",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "76cb7984-8bd0-4d1f-a546-586828a9017e",
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
  "created_at": "2026-10-30T07:57:39.924888Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121078"
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
  "staff_id": "e72a0099-0680-46dd-9ec2-670a72e54279",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T07:48:05.917799Z",
  "last_entries": [
    {
      "order_id": "76cb7984-8bd0-4d1f-a546-586828a9017e",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T07:57:40.501486Z"
    },
    {
      "order_id": "191e1812-af24-4ac1-954c-c1960f55f2a7",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T07:57:39.361975Z"
    },
    {
      "order_id": "3c5e008c-dc35-4f8c-baee-5d018c63d4ad",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T07:48:05.917799Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "47d9db6a-a5a9-4ec0-988a-243af7877385",
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
  "last_heartbeat_at": "2026-10-30T07:57:38.497543Z",
  "last_location_at": "2026-10-30T07:57:38.497543Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/47d9db6a-a5a9-4ec0-988a-243af7877385/close` → **200**

```json
{
  "command_id": "071d3375-4161-4721-96fe-f138a91be1c7",
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

Done: operator bonus for fulfilled 191e1812-af24-4ac1-954c-c1960f55f2a7 and operator-fault cancellation 76cb7984-8bd0-4d1f-a546-586828a9017e.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675543735",
  "device_ref": "sandbox-30164"
}
```

```json
{
  "challenge_id": "b5bc9e57-cb28-4a03-adb3-4a5b86408fe3",
  "expires_at": "2026-10-30T08:02:44.843377387Z",
  "resend_available_at": "2026-10-30T07:57:45.843377387Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675543735` → **200**

```json
{
  "phone": "+380675543735",
  "audience": "CLIENT",
  "code": "642809",
  "sent_at": "2026-10-30T07:57:44.845918424Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676229236",
  "device_ref": "sandbox-8693",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "aa4dd688-ca84-4135-ae9c-7990aa612e84",
  "expires_at": "2026-10-30T08:02:46.333732195Z",
  "resend_available_at": "2026-10-30T07:57:47.333732195Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676229236` → **200**

```json
{
  "phone": "+380676229236",
  "audience": "CLIENT",
  "code": "511643",
  "sent_at": "2026-10-30T07:57:46.337287701Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676229236",
  "device_ref": "sandbox-4632",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "7b909487-9d4d-4dbf-ae66-20a3fe3a5af0",
  "expires_at": "2026-10-30T08:02:47.824361477Z",
  "resend_available_at": "2026-10-30T07:57:48.824361477Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380676229236` → **200**

```json
{
  "phone": "+380676229236",
  "audience": "CLIENT",
  "code": "467553",
  "sent_at": "2026-10-30T07:57:47.827180524Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677180000",
  "device_ref": "sandbox-21296"
}
```

```json
{
  "challenge_id": "e60f80ba-52e2-428b-bac3-4bf29868fc6d",
  "expires_at": "2026-10-30T08:02:49.316314597Z",
  "resend_available_at": "2026-10-30T07:57:50.316314597Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677180000",
  "device_ref": "sandbox-13368"
}
```

```json
{
  "challenge_id": "420348de-0569-4d12-a85c-ecfba444e909",
  "expires_at": "2026-10-30T08:02:50.787337169Z",
  "resend_available_at": "2026-10-30T07:57:51.787337169Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677180000` → **200**

```json
{
  "phone": "+380677180000",
  "audience": "CLIENT",
  "code": "588658",
  "sent_at": "2026-10-30T07:57:50.791140089Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677180000",
  "device_ref": "sandbox-5144",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "9a312d8d-0e40-42e0-ad41-ecceef34ec75",
  "expires_at": "2026-10-30T08:02:52.299258672Z",
  "resend_available_at": "2026-10-30T07:57:53.299258672Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677180000` → **200**

```json
{
  "phone": "+380677180000",
  "audience": "CLIENT",
  "code": "247751",
  "sent_at": "2026-10-30T07:57:52.301704547Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380677180000",
  "device_ref": "sandbox-21852",
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
  "correlation_id": "4fdeaa53-51ee-42d7-9a13-41211cdab2f7",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000004405"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "91e7aa95-bd32-44df-88b0-f242f143a87a"
}
```

`GET /sandbox/v1/otp?phone=%2B442000004405` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120030083"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "bac1016d-466e-49a3-816c-2806308716ce"
}
```

`GET /sandbox/v1/otp?phone=%2B37120030083` → **404**

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
  "session_id": "cbf9562f-cdc3-45f3-af64-c50342993f71",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDc5NzQsImlhdCI6MTc5MzM0NzA3NCwianRpIjoiNjc1ZTdjMjEtYWNlOS00MDQ5LWIzYmMtYWNlY2U1ZmU3ZGE3Iiwic2lkIjoiY2JmOTU2MmYtY2RjMy00NWYzLWFmNjQtYzUwMzQyOTkzZjcxIn0.Sswidhom3-fsA5OD_kUCibNT1FcMwPnnKTqEi419QKA",
  "access_expires_at": "2026-10-30T08:12:54.982724587Z",
  "refresh_token": "aySRH3swBWL6Cm6vtrdyoBN3EWKvRGIlTie_RlAhLV8",
  "refresh_expires_at": "2026-10-30T19:57:54.982327648Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677180000` → **200**

```json
{
  "deliveries": [
    {
      "id": "5895993f-6045-4f5a-b583-69da7062aa32",
      "challenge_id": "9a312d8d-0e40-42e0-ad41-ecceef34ec75",
      "phone": "+380677180000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-254c71ac-2891-403b-a193-539b15037edd",
      "error": null,
      "attempted_at": "2026-10-30T07:57:52.302032Z"
    },
    {
      "id": "743cd8c9-e6e7-4e48-8d79-fbd05a331e0a",
      "challenge_id": "420348de-0569-4d12-a85c-ecfba444e909",
      "phone": "+380677180000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-a2faea82-e27d-4f30-b8d0-be20162bf678",
      "error": null,
      "attempted_at": "2026-10-30T07:57:50.791579Z"
    },
    {
      "id": "10cd213b-65c6-4c88-80de-729eb732fa5d",
      "challenge_id": "e60f80ba-52e2-428b-bac3-4bf29868fc6d",
      "phone": "+380677180000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T07:57:49.318833Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380677180000` → **200**

```json
{
  "phone": "+380677180000",
  "audience": "CLIENT",
  "code": "247751",
  "sent_at": "2026-10-30T07:57:52.301704547Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676229236` → **200**

```json
{
  "deliveries": [
    {
      "id": "45cb21b0-5310-47cd-975c-56539e261e00",
      "challenge_id": "7b909487-9d4d-4dbf-ae66-20a3fe3a5af0",
      "phone": "+380676229236",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-d28114c9-0e1f-42c0-a08a-c6ad5081562d",
      "error": null,
      "attempted_at": "2026-10-30T07:57:47.827744Z"
    },
    {
      "id": "03f8ee24-c303-465d-baad-17fd2ba2ff5f",
      "challenge_id": "aa4dd688-ca84-4135-ae9c-7990aa612e84",
      "phone": "+380676229236",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-70b5f6e7-2b2f-407e-8c06-4a04db943a95",
      "error": null,
      "attempted_at": "2026-10-30T07:57:46.337802Z"
    }
  ]
}
```

Done: SMS to +380675543735; SMS then a call to +380676229236; a failed SMS, two calls and a refused third to +380677180000; +44 and +371 refused.

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
  "session_id": "5feddf29-7758-42d0-9129-b7e1447ee814",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDc5NzYsImlhdCI6MTc5MzM0NzA3NiwianRpIjoiMjdiZjA4ZjEtYTk1My00ZmFkLTk4ZTgtZWZhMDk3NzBjZjlkIiwic2lkIjoiNWZlZGRmMjktNzc1OC00MmQwLTkxMjktYjdlMTQ0N2VlODE0In0.Alda5-49HJdUw9d3bi-sAYRkPbJz_69pvVKCzKs59Z4",
  "access_expires_at": "2026-10-30T08:12:56.15208098Z",
  "refresh_token": "hfKcvMAXf57qqNVfYemL_1VWkPqblbK_9p7r6iQdDd0",
  "refresh_expires_at": "2026-10-30T19:57:56.151622272Z",
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
  "session_id": "c59b3625-6800-4b41-bca6-25ef3c5ec3f0",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDc5NzYsImlhdCI6MTc5MzM0NzA3NiwianRpIjoiZWMwMzZmOTMtYzI5ZC00MDhkLWFmZjYtNjFmMzdmNjUyNzgwIiwic2lkIjoiYzU5YjM2MjUtNjgwMC00YjQxLWJjYTYtMjVlZjNjNWVjM2YwIn0.5u599pzjXCo5Jy59rnngVouoWbSB0GPXuDM0eFKQgS8",
  "access_expires_at": "2026-10-30T08:12:56.739447042Z",
  "refresh_token": "nXYuOwBpMeDXEThbqjxXfd_bK4Wmj-FPnmbEsRmif6o",
  "refresh_expires_at": "2026-10-30T19:57:56.739060636Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279",
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

`POST /api/admin/v1/staff-extensions/e72a0099-0680-46dd-9ec2-670a72e54279` → **200**

```json
{
  "command_id": "24778041-1d9d-4720-a205-79f8ddf36ba6",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "e72a0099-0680-46dd-9ec2-670a72e54279",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "5b3e72a1-d28c-4518-b665-6f25f88d5e86",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T07:57:57.839579Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T07:57:57.839579Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "6e43cbc2-88e2-43f9-9f87-ec3ee47dcde4",
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
  "id": "80674b87-9a20-40f7-8bf2-f0e443ebb13c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:02:58.382515Z",
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
  "command_id": "b3a5fadf-6c6b-455b-9d56-c15f0f84f9a3",
  "quote_id": "80674b87-9a20-40f7-8bf2-f0e443ebb13c",
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
    "phone": "+380675126131"
  }
}
```

```json
{
  "id": "63ee4bb6-8671-4222-b601-19ccfe693302",
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
  "created_at": "2026-10-30T07:57:58.669835Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675126131"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/63ee4bb6-8671-4222-b601-19ccfe693302/calls` → **201**

```json
{
  "command_id": "c1a6380e-e952-45e0-8027-19cb765d8c90",
  "to": "CALLER"
}
```

```json
{
  "id": "251f1705-e810-4b6b-8333-1aa999b4eccf",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
  "order_ids": [
    "63ee4bb6-8671-4222-b601-19ccfe693302"
  ],
  "started_at": "2026-10-30T07:57:58.97393Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/63ee4bb6-8671-4222-b601-19ccfe693302/calls` → **201**

```json
{
  "command_id": "c1a6380e-e952-45e0-8027-19cb765d8c90",
  "to": "CALLER"
}
```

```json
{
  "id": "251f1705-e810-4b6b-8333-1aa999b4eccf",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
  "order_ids": [
    "63ee4bb6-8671-4222-b601-19ccfe693302"
  ],
  "started_at": "2026-10-30T07:57:58.97393Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "251f1705-e810-4b6b-8333-1aa999b4eccf",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380675126131",
    "at": "2026-10-30T07:57:58.976386782Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "251f1705-e810-4b6b-8333-1aa999b4eccf",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.2239",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "251f1705-e810-4b6b-8333-1aa999b4eccf"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "251f1705-e810-4b6b-8333-1aa999b4eccf",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=63ee4bb6-8671-4222-b601-19ccfe693302` → **200**

```json
{
  "calls": [
    {
      "id": "251f1705-e810-4b6b-8333-1aa999b4eccf",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
      "order_ids": [
        "63ee4bb6-8671-4222-b601-19ccfe693302"
      ],
      "started_at": "2026-10-30T07:57:58.97393Z",
      "answered_at": "2026-10-30T07:57:59.595364Z",
      "ended_at": "2026-10-30T07:57:59.614635Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=63ee4bb6-8671-4222-b601-19ccfe693302` → **200**

```json
{
  "calls": [
    {
      "id": "251f1705-e810-4b6b-8333-1aa999b4eccf",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
      "order_ids": [
        "63ee4bb6-8671-4222-b601-19ccfe693302"
      ],
      "started_at": "2026-10-30T07:57:58.97393Z",
      "answered_at": "2026-10-30T07:57:59.595364Z",
      "ended_at": "2026-10-30T07:57:59.614635Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=63ee4bb6-8671-4222-b601-19ccfe693302` → **200**

```json
{
  "calls": [
    {
      "id": "251f1705-e810-4b6b-8333-1aa999b4eccf",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
      "order_ids": [
        "63ee4bb6-8671-4222-b601-19ccfe693302"
      ],
      "started_at": "2026-10-30T07:57:58.97393Z",
      "answered_at": "2026-10-30T07:57:59.595364Z",
      "ended_at": "2026-10-30T07:57:59.614635Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=63ee4bb6-8671-4222-b601-19ccfe693302` → **200**

```json
{
  "calls": [
    {
      "id": "251f1705-e810-4b6b-8333-1aa999b4eccf",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
      "order_ids": [
        "63ee4bb6-8671-4222-b601-19ccfe693302"
      ],
      "started_at": "2026-10-30T07:57:58.97393Z",
      "answered_at": "2026-10-30T07:57:59.595364Z",
      "ended_at": "2026-10-30T07:57:59.614635Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T07:58:05.448098Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/63ee4bb6-8671-4222-b601-19ccfe693302` → **200**

```json
{
  "id": "63ee4bb6-8671-4222-b601-19ccfe693302",
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
  "created_at": "2026-10-30T07:57:58.669835Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675126131"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/63ee4bb6-8671-4222-b601-19ccfe693302/cancel` → **200**

```json
{
  "command_id": "8ca3eb7f-7acb-4926-98e1-d198da57e4fd",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "63ee4bb6-8671-4222-b601-19ccfe693302",
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
  "created_at": "2026-10-30T07:57:58.669835Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675126131"
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
  "command_id": "35623235-7e1a-40a2-894a-c55050649da9",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T07:58:07.352183Z",
  "extension": "101"
}
```

Done: outgoing call 251f1705-e810-4b6b-8333-1aa999b4eccf from order 63ee4bb6-8671-4222-b601-19ccfe693302, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636808675",
  "device_ref": "sandbox-14776"
}
```

```json
{
  "challenge_id": "c78ed158-a63e-4127-8f82-9e6bd7f6773b",
  "expires_at": "2026-10-30T08:03:07.626483976Z",
  "resend_available_at": "2026-10-30T07:58:08.626483976Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636808675` → **200**

```json
{
  "phone": "+380636808675",
  "audience": "CLIENT",
  "code": "614345",
  "sent_at": "2026-10-30T07:58:07.629422881Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c78ed158-a63e-4127-8f82-9e6bd7f6773b",
  "code": "614345",
  "device_ref": "sandbox-14776"
}
```

```json
{
  "session_id": "8f69057f-17ba-4b87-8648-3741a6bd40e7",
  "subject": {
    "type": "CLIENT",
    "id": "c2d05f64-fc25-48ef-a4a3-e1b9e88fed41"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmQwNWY2NC1mYzI1LTQ4ZWYtYTRhMy1lMWI5ZTg4ZmVkNDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ3OTg3LCJpYXQiOjE3OTMzNDcwODcsImp0aSI6IjE0MTJiYTM2LTNlZmItNDVkOC05Y2JkLTk1MDgzYTdjYmY2NCIsInNpZCI6IjhmNjkwNTdmLTE3YmEtNGI4Ny04NjQ4LTM3NDFhNmJkNDBlNyJ9.89n_gloc3HKBfvV2E7JXsJod3DFtxFbsyB6BVzXBWyk",
  "access_expires_at": "2026-10-30T08:13:07.919881959Z",
  "refresh_token": "FI1Y2tj6VyOCFf08O9npuJpqrEOgwkHA8d2DyTaCbMQ",
  "refresh_expires_at": "2026-11-29T07:58:07.919287557Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c2d05f64-fc25-48ef-a4a3-e1b9e88fed41",
  "session_id": "8f69057f-17ba-4b87-8648-3741a6bd40e7",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636808675",
  "device_ref": "sandbox-9981"
}
```

```json
{
  "challenge_id": "0d67f34d-3bb4-4467-ad1e-1ff1389b679d",
  "expires_at": "2026-10-30T08:03:10.509686127Z",
  "resend_available_at": "2026-10-30T07:58:11.509686127Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636808675` → **200**

```json
{
  "phone": "+380636808675",
  "audience": "CLIENT",
  "code": "703431",
  "sent_at": "2026-10-30T07:58:10.511854363Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0d67f34d-3bb4-4467-ad1e-1ff1389b679d",
  "code": "703431",
  "device_ref": "sandbox-9981"
}
```

```json
{
  "session_id": "d504b2ee-2b37-48b6-aa14-607f9aac78ac",
  "subject": {
    "type": "CLIENT",
    "id": "c2d05f64-fc25-48ef-a4a3-e1b9e88fed41"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmQwNWY2NC1mYzI1LTQ4ZWYtYTRhMy1lMWI5ZTg4ZmVkNDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ3OTkwLCJpYXQiOjE3OTMzNDcwOTAsImp0aSI6ImVlODI4OTQyLTYwMTMtNDY5OC04ODRmLTRiMTFjODdiZjczZSIsInNpZCI6ImQ1MDRiMmVlLTJiMzctNDhiNi1hYTE0LTYwN2Y5YWFjNzhhYyJ9.jrbQ2LkpGElSJ2XXXh_q9f6dOp8k3XwFp0b5t9kPfpA",
  "access_expires_at": "2026-10-30T08:13:10.807963131Z",
  "refresh_token": "YIsLfZhXG4mzSTGYCbVAHWLBUYD20_JBor5JyOT47ys",
  "refresh_expires_at": "2026-11-29T07:58:10.807550752Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "9dd4b52a-7e2a-4065-a95f-971b5450148a",
  "expires_at": "2026-10-30T08:03:13.088469763Z",
  "resend_available_at": "2026-10-30T07:58:14.088469763Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636808675` → **200**

```json
{
  "phone": "+380636808675",
  "audience": "CLIENT",
  "code": "320311",
  "sent_at": "2026-10-30T07:58:13.091468125Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380634854797"
}
```

```json
{
  "challenge_id": "7d7bc166-37de-4e12-9755-bd2ab6793cb8",
  "expires_at": "2026-10-30T08:03:13.385133242Z",
  "resend_available_at": "2026-10-30T07:58:14.385133242Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634854797` → **200**

```json
{
  "phone": "+380634854797",
  "audience": "CLIENT",
  "code": "842718",
  "sent_at": "2026-10-30T07:58:13.387176768Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "5f71d5bb-3375-4863-acb5-4d66e76de386",
  "current_challenge_id": "9dd4b52a-7e2a-4065-a95f-971b5450148a",
  "current_code": "000000",
  "new_challenge_id": "7d7bc166-37de-4e12-9755-bd2ab6793cb8",
  "new_code": "842718"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "46f88644-0b7b-4449-a673-794113630d02"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "463a1825-39d1-4457-81d7-7fcf3b03efe6",
  "current_challenge_id": "9dd4b52a-7e2a-4065-a95f-971b5450148a",
  "current_code": "320311",
  "new_challenge_id": "7d7bc166-37de-4e12-9755-bd2ab6793cb8",
  "new_code": "842718"
}
```

```json
{
  "subject_id": "c2d05f64-fc25-48ef-a4a3-e1b9e88fed41",
  "phone": "+380634854797",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c2d05f64-fc25-48ef-a4a3-e1b9e88fed41",
  "session_id": "8f69057f-17ba-4b87-8648-3741a6bd40e7",
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
  "correlation_id": "3046ba09-0868-41b1-9c13-927e591ba009"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634854797",
  "device_ref": "sandbox-150"
}
```

```json
{
  "challenge_id": "07a80a5e-1d7b-45e8-90f1-5be1518d936f",
  "expires_at": "2026-10-30T08:03:16.798672633Z",
  "resend_available_at": "2026-10-30T07:58:17.798672633Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634854797` → **200**

```json
{
  "phone": "+380634854797",
  "audience": "CLIENT",
  "code": "080172",
  "sent_at": "2026-10-30T07:58:16.801606856Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "07a80a5e-1d7b-45e8-90f1-5be1518d936f",
  "code": "080172",
  "device_ref": "sandbox-150"
}
```

```json
{
  "session_id": "ba038f85-45a3-43f3-bc7a-12ef9103d7c7",
  "subject": {
    "type": "CLIENT",
    "id": "c2d05f64-fc25-48ef-a4a3-e1b9e88fed41"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmQwNWY2NC1mYzI1LTQ4ZWYtYTRhMy1lMWI5ZTg4ZmVkNDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ3OTk3LCJpYXQiOjE3OTMzNDcwOTcsImp0aSI6ImQ2ZjcyZWQwLTAzMzktNDIzNy1iY2FkLTI0OTk0OWY1MTRjNSIsInNpZCI6ImJhMDM4Zjg1LTQ1YTMtNDNmMy1iYzdhLTEyZWY5MTAzZDdjNyJ9.hUVxdNX6JQ1yKVuMiESRMMVk5Ch1PpBx2-KxtkswnSI",
  "access_expires_at": "2026-10-30T08:13:17.093420706Z",
  "refresh_token": "uhrNwUyWHCVGlgvmaGWn3ov5j5-TFBJYdrHFO9aWOhE",
  "refresh_expires_at": "2026-11-29T07:58:17.092889994Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c2d05f64-fc25-48ef-a4a3-e1b9e88fed41",
  "session_id": "ba038f85-45a3-43f3-bc7a-12ef9103d7c7",
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
  "session_id": "7587ff7f-252f-4110-94a4-7a5474b2c74b",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDc5OTcsImlhdCI6MTc5MzM0NzA5NywianRpIjoiNmY2ZjNmYmMtMGI2ZC00ZDg0LTg5NDAtZGE3MDc2Njg4YmVjIiwic2lkIjoiNzU4N2ZmN2YtMjUyZi00MTEwLTk0YTQtN2E1NDc0YjJjNzRiIn0.12wKLpjZnKV8S8xvdkCXEFSILB9XxqPcvvDNdSWu6lI",
  "access_expires_at": "2026-10-30T08:13:17.930390694Z",
  "refresh_token": "5Gxx3Cx9KYG2n0O6JmxJlpX_hzxYyVj1i-rXhdtWfTs",
  "refresh_expires_at": "2026-10-30T19:58:17.929798982Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/c2d05f64-fc25-48ef-a4a3-e1b9e88fed41` → **200**

```json
{
  "client": {
    "id": "c2d05f64-fc25-48ef-a4a3-e1b9e88fed41",
    "phone": "+380634854797",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T07:58:07.917759Z",
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

`POST /api/admin/v1/clients/c2d05f64-fc25-48ef-a4a3-e1b9e88fed41/phone/new-code` → **201**

```json
{
  "phone": "+380635765530"
}
```

```json
{
  "challenge_id": "e82a51db-b313-45ae-94f3-d8cbf01c13af",
  "expires_at": "2026-10-30T08:03:18.494582519Z",
  "resend_available_at": "2026-10-30T07:58:19.494582519Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635765530` → **200**

```json
{
  "phone": "+380635765530",
  "audience": "CLIENT",
  "code": "382042",
  "sent_at": "2026-10-30T07:58:18.496850668Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/c2d05f64-fc25-48ef-a4a3-e1b9e88fed41/phone` → **422**

```json
{
  "command_id": "9353c922-a64e-41cd-895c-1ace91ef5783",
  "expected_version": 3,
  "new_challenge_id": "e82a51db-b313-45ae-94f3-d8cbf01c13af",
  "new_code": "382043",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/c2d05f64-fc25-48ef-a4a3-e1b9e88fed41/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "b0f7abbe-a3fd-46ee-8074-30f9415dd7b9"
}
```

`POST /api/admin/v1/clients/c2d05f64-fc25-48ef-a4a3-e1b9e88fed41/phone` → **400**

```json
{
  "command_id": "8d4dc099-af54-4b54-9017-a802e48ed356",
  "expected_version": 3,
  "new_challenge_id": "e82a51db-b313-45ae-94f3-d8cbf01c13af",
  "new_code": "382042",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/c2d05f64-fc25-48ef-a4a3-e1b9e88fed41/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "d8df0867-9042-4388-9256-726ada6a0772",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/c2d05f64-fc25-48ef-a4a3-e1b9e88fed41/phone` → **200**

```json
{
  "command_id": "34935577-483d-4097-b8b3-e800f1103d5b",
  "expected_version": 3,
  "new_challenge_id": "e82a51db-b313-45ae-94f3-d8cbf01c13af",
  "new_code": "382042",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "c2d05f64-fc25-48ef-a4a3-e1b9e88fed41",
  "phone": "+380635765530",
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
  "correlation_id": "2f70198a-91e9-4cef-97fe-70abb7ea8825"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635765530",
  "device_ref": "sandbox-30915"
}
```

```json
{
  "challenge_id": "24f8b0b9-9a43-440a-bb4b-3d66d4b89306",
  "expires_at": "2026-10-30T08:03:19.861265273Z",
  "resend_available_at": "2026-10-30T07:58:20.861265273Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635765530` → **200**

```json
{
  "phone": "+380635765530",
  "audience": "CLIENT",
  "code": "175442",
  "sent_at": "2026-10-30T07:58:19.86385842Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "24f8b0b9-9a43-440a-bb4b-3d66d4b89306",
  "code": "175442",
  "device_ref": "sandbox-30915"
}
```

```json
{
  "session_id": "901f23e2-98b4-4924-94d3-6adfd3461918",
  "subject": {
    "type": "CLIENT",
    "id": "c2d05f64-fc25-48ef-a4a3-e1b9e88fed41"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmQwNWY2NC1mYzI1LTQ4ZWYtYTRhMy1lMWI5ZTg4ZmVkNDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MDAwLCJpYXQiOjE3OTMzNDcxMDAsImp0aSI6IjY4M2MxYmJmLWEwZWEtNDNjMy1iMjlmLWU4NGNlODQ2OGY2YyIsInNpZCI6IjkwMWYyM2UyLTk4YjQtNDkyNC05NGQzLTZhZGZkMzQ2MTkxOCJ9.Y8rcPfhTrGTBKHJRUBIoCV-p2evxrNqYgfb8y2fZX8A",
  "access_expires_at": "2026-10-30T08:13:20.155256025Z",
  "refresh_token": "6L7J1Ww5lcuv6pDJeCq21Ml63bUOENNlHo8gi0dcQUI",
  "refresh_expires_at": "2026-11-29T07:58:20.154675529Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c2d05f64-fc25-48ef-a4a3-e1b9e88fed41",
  "session_id": "901f23e2-98b4-4924-94d3-6adfd3461918",
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
  "phone": "+380638522776",
  "device_ref": "sandbox-23489"
}
```

```json
{
  "challenge_id": "2e5cfbdf-84fe-4e32-b319-7742ca33ed13",
  "expires_at": "2026-10-30T08:03:20.693173776Z",
  "resend_available_at": "2026-10-30T07:58:21.693173776Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638522776` → **200**

```json
{
  "phone": "+380638522776",
  "audience": "CLIENT",
  "code": "771930",
  "sent_at": "2026-10-30T07:58:20.698219505Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2e5cfbdf-84fe-4e32-b319-7742ca33ed13",
  "code": "771930",
  "device_ref": "sandbox-23489"
}
```

```json
{
  "session_id": "dd430a42-d3e4-4120-9f51-1f4f01fc5ed5",
  "subject": {
    "type": "CLIENT",
    "id": "e4e6c144-1534-4e35-8911-888e68537be1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGU2YzE0NC0xNTM0LTRlMzUtODkxMS04ODhlNjg1MzdiZTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MDAwLCJpYXQiOjE3OTMzNDcxMDAsImp0aSI6ImNiZjgzNzBjLTkxMjgtNDM3Ni1iMzMxLTAwYjQyMmU5ZWQxMyIsInNpZCI6ImRkNDMwYTQyLWQzZTQtNDEyMC05ZjUxLTFmNGYwMWZjNWVkNSJ9.WkwB8E6CCQCFzVYcy-9w66KHy4mOCsGGSz9mY94l0fk",
  "access_expires_at": "2026-10-30T08:13:20.994137226Z",
  "refresh_token": "FOw7fhxMtebuHaFGqaquRyBpFCA9HCFfcWUkw9i8nkM",
  "refresh_expires_at": "2026-11-29T07:58:20.993640062Z",
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
  "session_id": "f978e01b-2d89-4906-ba27-1bec7041395b",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgwMDIsImlhdCI6MTc5MzM0NzEwMiwianRpIjoiYzc4Yjg2ZGQtODI1Ny00NTJiLTg1MjgtODU5MmQ2YzA1NjY0Iiwic2lkIjoiZjk3OGUwMWItMmQ4OS00OTA2LWJhMjctMWJlYzcwNDEzOTViIn0.v9MUpnDa3JD_cXtahQjaSetgL1MbxTNzZ2yWUxWoQwQ",
  "access_expires_at": "2026-10-30T08:13:22.145337111Z",
  "refresh_token": "F5aVEBabl0PJgAOjlmHYxLRxYMEQhwGQrqT2GvQ4SmE",
  "refresh_expires_at": "2026-10-30T19:58:22.14478951Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380638522776` → **200**

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
  "correlation_id": "84abb434-3ce2-4775-8b77-61781703dd1e"
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
  "session_id": "c18ac3d2-c0d6-487a-a1e0-76db7bbc1a9f",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgwMDMsImlhdCI6MTc5MzM0NzEwMywianRpIjoiMzU4Y2Y4YjgtMjZjYS00ODJlLWI2ZTQtODBjMjZjYTgyYmMxIiwic2lkIjoiYzE4YWMzZDItYzBkNi00ODdhLWExZTAtNzZkYjdiYmMxYTlmIn0.5UuYmvjOvUvMlhBaJ8XluZnk0GIl8FCdz9oSSXtYFmQ",
  "access_expires_at": "2026-10-30T08:13:23.288688799Z",
  "refresh_token": "CSQcyN_P97yRIgzUSmWQUoLio9ZnjNl2CYJTpiUmnWI",
  "refresh_expires_at": "2026-10-30T19:58:23.288061445Z",
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
  "changed_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T07:47:25.284612Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "bcfefaea-1825-4de9-a231-555d58342abf",
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
  "changed_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T07:58:23.83920592Z"
}
```

## The rider books the airport for 2026-10-30T10:58:22Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600123449",
  "device_ref": "sandbox-25410"
}
```

```json
{
  "challenge_id": "beeee04b-d9a1-4d3e-bb3e-440323c29ab2",
  "expires_at": "2026-10-30T08:03:24.129327155Z",
  "resend_available_at": "2026-10-30T07:58:25.129327155Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600123449` → **200**

```json
{
  "phone": "+48600123449",
  "audience": "CLIENT",
  "code": "882270",
  "sent_at": "2026-10-30T07:58:24.132174829Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "beeee04b-d9a1-4d3e-bb3e-440323c29ab2",
  "code": "882270",
  "device_ref": "sandbox-25410"
}
```

```json
{
  "session_id": "bc7380ff-b4c3-4fad-93ff-97c220c62225",
  "subject": {
    "type": "CLIENT",
    "id": "821693fd-35f2-4867-ad55-6e283e73d5ea"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MjE2OTNmZC0zNWYyLTQ4NjctYWQ1NS02ZTI4M2U3M2Q1ZWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MDA0LCJpYXQiOjE3OTMzNDcxMDQsImp0aSI6ImU2ZjA1MTE5LWEzODQtNGFhNi1iNTAzLTIxYjdiMDBmNzM0ZCIsInNpZCI6ImJjNzM4MGZmLWI0YzMtNGZhZC05M2ZmLTk3YzIyMGM2MjIyNSJ9.NWXxrJpmhHuw8PNfjqbSS_-fpWLOwmbluf7LgERDfCM",
  "access_expires_at": "2026-10-30T08:13:24.422530285Z",
  "refresh_token": "mOFxfiCdbma-Y_QNbb9WbtcMSjbzfb0VVNQPCd9EMlk",
  "refresh_expires_at": "2026-11-29T07:58:24.42213663Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9d4569f5-f6a7-46a4-83d7-561dc9019de4",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T10:58:22Z"
}
```

```json
{
  "id": "0e27e1b7-0f09-41b8-a088-85b6dd56e536",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:03:24.691103Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T10:58:22Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "205d357c-4784-4c55-9c74-2eb07b732bdb",
  "quote_id": "0e27e1b7-0f09-41b8-a088-85b6dd56e536",
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
  "pickup_at": "2026-10-30T10:58:22Z"
}
```

```json
{
  "id": "8042c837-45b0-49dc-b338-cb6a49446296",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "821693fd-35f2-4867-ad55-6e283e73d5ea",
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
  "created_at": "2026-10-30T07:58:24.976095Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T10:58:22Z",
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
  "device_ref": "sandbox-12929"
}
```

```json
{
  "challenge_id": "bcfb3e4f-6708-45e4-9416-d07cb722a8d9",
  "expires_at": "2026-10-30T08:03:25.253057355Z",
  "resend_available_at": "2026-10-30T07:58:26.253057355Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "901361",
  "sent_at": "2026-10-30T07:58:25.255304814Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bcfb3e4f-6708-45e4-9416-d07cb722a8d9",
  "code": "901361",
  "device_ref": "sandbox-12929"
}
```

```json
{
  "session_id": "a146088d-5909-4532-9393-a83fa9f6e7d8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODAwNSwiaWF0IjoxNzkzMzQ3MTA1LCJqdGkiOiJhYzUyNTRjNi00ZDQxLTQ2ODMtYmViMS04OTEwY2MwNjNhNjIiLCJzaWQiOiJhMTQ2MDg4ZC01OTA5LTQ1MzItOTM5My1hODNmYTlmNmU3ZDgifQ.HSg3-aPLp4E2ndLFdHk8oknPfIAKEvpvp_wyZdGllw4",
  "access_expires_at": "2026-10-30T08:13:25.548138593Z",
  "refresh_token": "_dmudmtngJw7a8vb2i8FNUJnoLdlutWJpH_4XaTzNUw",
  "refresh_expires_at": "2026-11-29T07:58:25.547625628Z",
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
  "command_id": "0ce898d8-58da-43ba-af87-5ba560dab16b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:58:26Z",
    "sequence": 1793347106970
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "1d2a5008-99f4-4ea2-ada8-2ea7d4fdb0d4",
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
  "last_heartbeat_at": "2026-10-30T07:58:26.114659Z",
  "last_location_at": "2026-10-30T07:58:26.114659Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "8042c837-45b0-49dc-b338-cb6a49446296",
      "short_number": 24,
      "pickup_at": "2026-10-30T10:58:22Z",
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

`POST /api/driver/v1/preorders/8042c837-45b0-49dc-b338-cb6a49446296/reserve` → **200**

```json
{
  "command_id": "849c1aca-d816-4cb4-9617-4f26d119b925"
}
```

```json
{
  "id": "25ecbf14-0515-4a79-85f1-70cfa110616e",
  "state": "RESERVED",
  "order": {
    "order_id": "8042c837-45b0-49dc-b338-cb6a49446296",
    "short_number": 24,
    "pickup_at": "2026-10-30T10:58:22Z",
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
  "reserved_at": "2026-10-30T07:58:26.677158Z",
  "confirm_from": "2026-10-30T10:28:22Z",
  "confirm_until": "2026-10-30T10:38:22Z",
  "drop_until": "2026-10-30T09:58:22Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "25ecbf14-0515-4a79-85f1-70cfa110616e",
      "state": "RESERVED",
      "order": {
        "order_id": "8042c837-45b0-49dc-b338-cb6a49446296",
        "short_number": 24,
        "pickup_at": "2026-10-30T10:58:22Z",
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
      "reserved_at": "2026-10-30T07:58:26.677158Z",
      "confirm_from": "2026-10-30T10:28:22Z",
      "confirm_until": "2026-10-30T10:38:22Z",
      "drop_until": "2026-10-30T09:58:22Z"
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
      "id": "25ecbf14-0515-4a79-85f1-70cfa110616e",
      "state": "RESERVED",
      "order": {
        "order_id": "8042c837-45b0-49dc-b338-cb6a49446296",
        "short_number": 24,
        "pickup_at": "2026-10-30T10:58:22Z",
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
      "reserved_at": "2026-10-30T07:58:26.677158Z",
      "confirm_from": "2026-10-30T10:28:22Z",
      "confirm_until": "2026-10-30T10:38:22Z",
      "drop_until": "2026-10-30T09:58:22Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/25ecbf14-0515-4a79-85f1-70cfa110616e/confirm` → **409**

```json
{
  "command_id": "c2fa8100-eff0-4099-8f26-ab489f04090a"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/25ecbf14-0515-4a79-85f1-70cfa110616e/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "9f1539bc-2267-44a2-b154-71f8a33f72ad"
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
  "session_id": "91b744f6-ab17-419d-bcd4-9180ecceeb0f",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgwMDgsImlhdCI6MTc5MzM0NzEwOCwianRpIjoiNmU1OGZlNDktYzQ0Ni00YzRlLWFhYzQtM2Q0ZjU2MTdkMWY1Iiwic2lkIjoiOTFiNzQ0ZjYtYWIxNy00MTlkLWJjZDQtOTE4MGVjY2VlYjBmIn0.Vk3A1B8Au8Y8kpJ01-PN3gORQ9s1ghFwio4-Uiqm5Yg",
  "access_expires_at": "2026-10-30T08:13:28.09122334Z",
  "refresh_token": "IflFwnu3HjhTpZWMFTpXaU16TT5jzr3veXsjraeIA8w",
  "refresh_expires_at": "2026-10-30T19:58:28.090492317Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/8042c837-45b0-49dc-b338-cb6a49446296` → **200**

```json
{
  "id": "8042c837-45b0-49dc-b338-cb6a49446296",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "821693fd-35f2-4867-ad55-6e283e73d5ea",
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
  "created_at": "2026-10-30T07:58:24.976095Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T10:58:22Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "25ecbf14-0515-4a79-85f1-70cfa110616e",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T07:58:26.677158Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/8042c837-45b0-49dc-b338-cb6a49446296/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T07:58:24.977132Z",
      "actor": {
        "type": "CLIENT",
        "id": "821693fd-35f2-4867-ad55-6e283e73d5ea",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "8042c837-45b0-49dc-b338-cb6a49446296",
        "preorder": true,
        "quote_id": "0e27e1b7-0f09-41b8-a088-85b6dd56e536",
        "pickup_at": "2026-10-30T10:58:22Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "b45b90d0-2f8d-46ca-a707-2a9173745bed"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T07:58:26.678438Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8042c837-45b0-49dc-b338-cb6a49446296",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "25ecbf14-0515-4a79-85f1-70cfa110616e"
      },
      "correlation_id": "47415565-17e8-4d3f-8db1-db5a5d31c685"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 8042c837-45b0-49dc-b338-cb6a49446296, reservation 25ecbf14-0515-4a79-85f1-70cfa110616e.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-19733"
}
```

```json
{
  "challenge_id": "d1439224-eff6-42d0-adc8-b2b22d490808",
  "expires_at": "2026-10-30T08:03:28.927925178Z",
  "resend_available_at": "2026-10-30T07:58:29.927925178Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "755979",
  "sent_at": "2026-10-30T07:58:28.930673816Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d1439224-eff6-42d0-adc8-b2b22d490808",
  "code": "755979",
  "device_ref": "sandbox-19733"
}
```

```json
{
  "session_id": "d7610b13-c8d4-48cc-b0a6-4aeb46ba0969",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODAwOSwiaWF0IjoxNzkzMzQ3MTA5LCJqdGkiOiIzYjUyNGRlOS0wMmM3LTQxZmItYjFkMy02YzJjNmVhZWJmMDYiLCJzaWQiOiJkNzYxMGIxMy1jOGQ0LTQ4Y2MtYjBhNi00YWViNDZiYTA5NjkifQ.fpKLjgfOFiI6IQF7sw-LtcFnVh_k1ABHJderEkSDaQE",
  "access_expires_at": "2026-10-30T08:13:29.220862693Z",
  "refresh_token": "iR8dKCv-YkGqrMGfW8tNPnhAgqsacwKESbc3XxPAf9E",
  "refresh_expires_at": "2026-11-29T07:58:29.220379483Z",
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
  "command_id": "fb282d24-96a5-4e92-9444-17a5c3c1c474",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:58:29Z",
    "sequence": 1793347109761
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d5bb200f-a44f-4ffa-b842-f9de13f963cb",
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
  "last_heartbeat_at": "2026-10-30T07:58:29.778263Z",
  "last_location_at": "2026-10-30T07:58:29.778263Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671699345",
  "device_ref": "sandbox-21271"
}
```

```json
{
  "challenge_id": "04125bcd-14a3-4b19-93e4-478e8db97ef3",
  "expires_at": "2026-10-30T08:03:30.040825656Z",
  "resend_available_at": "2026-10-30T07:58:31.040825656Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671699345` → **200**

```json
{
  "phone": "+380671699345",
  "audience": "CLIENT",
  "code": "726199",
  "sent_at": "2026-10-30T07:58:30.043501045Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "04125bcd-14a3-4b19-93e4-478e8db97ef3",
  "code": "726199",
  "device_ref": "sandbox-21271"
}
```

```json
{
  "session_id": "b11db6f4-a748-4ca4-92f8-5d589eb5168e",
  "subject": {
    "type": "CLIENT",
    "id": "40ac7a30-6b78-4543-93d0-75b6c494bdb0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MGFjN2EzMC02Yjc4LTQ1NDMtOTNkMC03NWI2YzQ5NGJkYjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MDEwLCJpYXQiOjE3OTMzNDcxMTAsImp0aSI6Ijg1ZTM1YjNkLTM5NDYtNGY5Yi1hNDE5LWFjM2FjYjA2ZjYyYiIsInNpZCI6ImIxMWRiNmY0LWE3NDgtNGNhNC05MmY4LTVkNTg5ZWI1MTY4ZSJ9.NLNONFbQfqPfQEc9W5p4NCLXvczoldquNq7oPeOpFCU",
  "access_expires_at": "2026-10-30T08:13:30.335613861Z",
  "refresh_token": "tNhPYfRiJvO7mWmoYUkt0bG7rBCtsf8XrEfTzUk0NJk",
  "refresh_expires_at": "2026-11-29T07:58:30.335194505Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2602e957-b252-43c4-bfca-e6230ec2dca9",
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
  "id": "ffb4252e-0011-463e-b5a7-e3006a0c738d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:03:30.613102Z",
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
  "command_id": "5a31a90b-d44e-4ecb-bc45-452ffc29b204",
  "quote_id": "ffb4252e-0011-463e-b5a7-e3006a0c738d",
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
  "id": "0d88e9d7-c3dc-45c4-abe1-cb978336b86b",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "40ac7a30-6b78-4543-93d0-75b6c494bdb0",
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
  "created_at": "2026-10-30T07:58:30.89558Z",
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
    "id": "b2a23c20-300e-4c6c-9bd6-eaae97306d58",
    "order_id": "0d88e9d7-c3dc-45c4-abe1-cb978336b86b",
    "expires_at": "2026-10-30T07:58:45.899124Z",
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

`POST /api/driver/v1/offers/b2a23c20-300e-4c6c-9bd6-eaae97306d58/accept` → **200**

```json
{
  "command_id": "99f5ac04-4ce0-4585-8fae-8d185832a279"
}
```

```json
{
  "id": "76f6d29e-b68d-4ec4-9021-3c374d29deb2",
  "order_id": "0d88e9d7-c3dc-45c4-abe1-cb978336b86b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "053c70ea-41a6-4bb0-97ce-7a749f901df8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "053c70ea-41a6-4bb0-97ce-7a749f901df8",
  "order_id": "0d88e9d7-c3dc-45c4-abe1-cb978336b86b",
  "assignment_id": "76f6d29e-b68d-4ec4-9021-3c374d29deb2",
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

`POST /api/driver/v1/work-sessions/d5bb200f-a44f-4ffa-b842-f9de13f963cb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:58:32Z",
    "sequence": 1793347112237
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d5bb200f-a44f-4ffa-b842-f9de13f963cb",
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
  "last_heartbeat_at": "2026-10-30T07:58:32.040789Z",
  "last_location_at": "2026-10-30T07:58:32.040789Z",
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
  "id": "053c70ea-41a6-4bb0-97ce-7a749f901df8",
  "order_id": "0d88e9d7-c3dc-45c4-abe1-cb978336b86b",
  "assignment_id": "76f6d29e-b68d-4ec4-9021-3c374d29deb2",
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

`POST /api/driver/v1/trips/053c70ea-41a6-4bb0-97ce-7a749f901df8/arrive` → **200**

```json
{
  "command_id": "484e05a5-3a9d-4cd9-8ee4-a1afb6a45435",
  "expected_version": 0
}
```

```json
{
  "id": "053c70ea-41a6-4bb0-97ce-7a749f901df8",
  "order_id": "0d88e9d7-c3dc-45c4-abe1-cb978336b86b",
  "assignment_id": "76f6d29e-b68d-4ec4-9021-3c374d29deb2",
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
  "arrived_at": "2026-10-30T07:58:32.57214Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/053c70ea-41a6-4bb0-97ce-7a749f901df8/start` → **200**

```json
{
  "command_id": "2427cc8f-28c5-4e34-a419-065c03c9747e",
  "expected_version": 1
}
```

```json
{
  "id": "053c70ea-41a6-4bb0-97ce-7a749f901df8",
  "order_id": "0d88e9d7-c3dc-45c4-abe1-cb978336b86b",
  "assignment_id": "76f6d29e-b68d-4ec4-9021-3c374d29deb2",
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
  "arrived_at": "2026-10-30T07:58:32.57214Z",
  "started_at": "2026-10-30T07:58:32.846835Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/d5bb200f-a44f-4ffa-b842-f9de13f963cb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:59:21Z",
    "sequence": 1793347161138
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d5bb200f-a44f-4ffa-b842-f9de13f963cb",
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
  "last_heartbeat_at": "2026-10-30T07:59:21.15612Z",
  "last_location_at": "2026-10-30T07:59:21.15612Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/053c70ea-41a6-4bb0-97ce-7a749f901df8/complete` → **200**

```json
{
  "command_id": "e9bf1fab-d5a5-43d3-9c5d-572a0f115b6b",
  "expected_version": 2,
  "reported_at": "2026-10-30T07:59:21Z",
  "cash_received": true
}
```

```json
{
  "id": "053c70ea-41a6-4bb0-97ce-7a749f901df8",
  "order_id": "0d88e9d7-c3dc-45c4-abe1-cb978336b86b",
  "assignment_id": "76f6d29e-b68d-4ec4-9021-3c374d29deb2",
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
  "arrived_at": "2026-10-30T07:58:32.57214Z",
  "started_at": "2026-10-30T07:58:32.846835Z",
  "completed_at": "2026-10-30T07:59:21.434791Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/0d88e9d7-c3dc-45c4-abe1-cb978336b86b/rating` → **200**

```json
{
  "command_id": "80903b1e-3533-45a1-8e0e-f023a9ac4f6d",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "0d88e9d7-c3dc-45c4-abe1-cb978336b86b",
  "score": 5,
  "created_at": "2026-10-30T07:59:21.726117271Z"
}
```

`POST /api/driver/v1/orders/0d88e9d7-c3dc-45c4-abe1-cb978336b86b/rating` → **200**

```json
{
  "command_id": "b0ac5b96-f4e0-4112-83d0-c188ff4fcde9",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "0d88e9d7-c3dc-45c4-abe1-cb978336b86b",
  "score": 4,
  "created_at": "2026-10-30T07:59:22.007974529Z"
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
  "session_id": "83e6653c-2b74-44be-a071-bfe935a8cdd8",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgwNjIsImlhdCI6MTc5MzM0NzE2MiwianRpIjoiYzc4M2I2YmQtNjBjYS00YjVmLTllYTMtYmM5ZWMzMjk1ZGYwIiwic2lkIjoiODNlNjY1M2MtMmI3NC00NGJlLWEwNzEtYmZlOTM1YThjZGQ4In0.6baYRqA1W4zshCwfqnKlT2QrC45SpV3H3mWVZ1AXltk",
  "access_expires_at": "2026-10-30T08:14:22.870162443Z",
  "refresh_token": "Z8nlK8rcfPQ_RroLh2Z5JTVzxx00K3wD32RBQ2K3Xms",
  "refresh_expires_at": "2026-10-30T19:59:22.86964426Z",
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
  "session_id": "4a23846a-08b5-4cff-876d-424f9a8bf3b0",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgwNjMsImlhdCI6MTc5MzM0NzE2MywianRpIjoiODVkNWMzN2EtMTZkZi00YTY1LTg5YjItZWU0NGNiMjgzMTM1Iiwic2lkIjoiNGEyMzg0NmEtMDhiNS00Y2ZmLTg3NmQtNDI0ZjlhOGJmM2IwIn0.ASuf1K6uJybZONWcaGuMVxCDwhme-u036ZvwHzGtOM8",
  "access_expires_at": "2026-10-30T08:14:23.456925886Z",
  "refresh_token": "ekz6m1MoP_OeSGEeXKd5leoiiP3K6xTfu1MpAjpx3Ho",
  "refresh_expires_at": "2026-10-30T19:59:23.456465136Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/0d88e9d7-c3dc-45c4-abe1-cb978336b86b/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "0d88e9d7-c3dc-45c4-abe1-cb978336b86b",
      "author_type": "RIDER",
      "author_id": "40ac7a30-6b78-4543-93d0-75b6c494bdb0",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T07:59:21.726117Z"
    },
    {
      "order_id": "0d88e9d7-c3dc-45c4-abe1-cb978336b86b",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "40ac7a30-6b78-4543-93d0-75b6c494bdb0",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T07:59:22.007975Z"
    }
  ]
}
```

Done: ratings for order 0d88e9d7-c3dc-45c4-abe1-cb978336b86b.

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
  "session_id": "3bf13e48-b4da-41d9-a4d4-c098b3204dd8",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgwNjQsImlhdCI6MTc5MzM0NzE2NCwianRpIjoiYmJmZTI0NjYtOTZhYy00ZDU3LWI0NWItNjI5MWQ2YTZmMTA4Iiwic2lkIjoiM2JmMTNlNDgtYjRkYS00MWQ5LWE0ZDQtYzA5OGIzMjA0ZGQ4In0.8B-GlJ2xeGC0MFgenkmisLrePSDdIrJDnPbtPm5CqHk",
  "access_expires_at": "2026-10-30T08:14:24.336698515Z",
  "refresh_token": "_1suFiVA2w0600h5lLOw6DSL3YfhCee764xIrwwzD0k",
  "refresh_expires_at": "2026-10-30T19:59:24.336223033Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "e56c902c-a417-4679-bf8b-452b932e604c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "160febee-54f7-4929-97e7-aa1e7a593e31",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T07:59:24.609849Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/160febee-54f7-4929-97e7-aa1e7a593e31` → **200**

```json
{
  "id": "160febee-54f7-4929-97e7-aa1e7a593e31",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T07:59:24.609849Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/160febee-54f7-4929-97e7-aa1e7a593e31` → **200**

```json
{
  "id": "160febee-54f7-4929-97e7-aa1e7a593e31",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T07:59:24.609849Z",
  "ready_at": "2026-10-30T07:59:25.564738Z",
  "expires_at": "2026-10-31T07:59:25.564738Z"
}
```

`GET /api/admin/v1/reports/exports/160febee-54f7-4929-97e7-aa1e7a593e31/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "a39c3840-7fad-48f5-b7ab-313f53a62d5f",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "3789c721-715d-45f8-a6b7-8b69276df771",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T07:59:26.464198Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3789c721-715d-45f8-a6b7-8b69276df771` → **200**

```json
{
  "id": "3789c721-715d-45f8-a6b7-8b69276df771",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T07:59:26.464198Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3789c721-715d-45f8-a6b7-8b69276df771` → **200**

```json
{
  "id": "3789c721-715d-45f8-a6b7-8b69276df771",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T07:59:26.464198Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3789c721-715d-45f8-a6b7-8b69276df771` → **200**

```json
{
  "id": "3789c721-715d-45f8-a6b7-8b69276df771",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T07:59:26.464198Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3789c721-715d-45f8-a6b7-8b69276df771` → **200**

```json
{
  "id": "3789c721-715d-45f8-a6b7-8b69276df771",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T07:59:26.464198Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3789c721-715d-45f8-a6b7-8b69276df771` → **200**

```json
{
  "id": "3789c721-715d-45f8-a6b7-8b69276df771",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T07:59:26.464198Z",
  "ready_at": "2026-10-30T07:59:30.572669Z",
  "expires_at": "2026-10-31T07:59:30.572669Z"
}
```

`GET /api/admin/v1/reports/exports/3789c721-715d-45f8-a6b7-8b69276df771/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/ed2ce273-2788-4f1b-99f0-f5b96bb4d426` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/ed2ce273-2788-4f1b-99f0-f5b96bb4d426",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d4005a2e-3fa3-4d45-b79a-9e4067f0745e"
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
  "device_ref": "sandbox-28221"
}
```

```json
{
  "challenge_id": "d742853d-fc2e-4ae8-8bda-875560fea833",
  "expires_at": "2026-10-30T08:04:32.410194727Z",
  "resend_available_at": "2026-10-30T07:59:33.410194727Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "988050",
  "sent_at": "2026-10-30T07:59:32.413765114Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d742853d-fc2e-4ae8-8bda-875560fea833",
  "code": "988050",
  "device_ref": "sandbox-28221"
}
```

```json
{
  "session_id": "48791e69-d62b-4672-8025-adaa781d9687",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODA3MiwiaWF0IjoxNzkzMzQ3MTcyLCJqdGkiOiI2N2EyMDZjZC0wODA3LTQ4ZGUtYTEzOC1jMzEzNDUzOTljZmYiLCJzaWQiOiI0ODc5MWU2OS1kNjJiLTQ2NzItODAyNS1hZGFhNzgxZDk2ODcifQ.8CjljBom-y4elOlDhugEhU6MCNLJiDBmZaO_aNTvTwQ",
  "access_expires_at": "2026-10-30T08:14:32.697145851Z",
  "refresh_token": "c4DS3KP_DiVWiRDupFAUjiFa5Ebeww0j5L-j5GI8wGs",
  "refresh_expires_at": "2026-11-29T07:59:32.696714655Z",
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
  "command_id": "077fcdd7-6268-4e7a-b195-9f1a87fb12e5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:59:33Z",
    "sequence": 1793347173493
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "66da788b-db86-4744-9790-9f27653aa9d3",
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
  "last_heartbeat_at": "2026-10-30T07:59:33.509137Z",
  "last_location_at": "2026-10-30T07:59:33.509137Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "4b6cf513-5e24-4ab5-bf23-4ae3cb6bcbcc",
  "points": [
    {
      "sequence": 1793347175784,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T07:58:35Z"
    },
    {
      "sequence": 1793347175791,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T07:59:35Z"
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
  "session_id": "cc678c93-c7da-4ae4-8266-46eb4bddebe9",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgwNzYsImlhdCI6MTc5MzM0NzE3NiwianRpIjoiMjA0MmRlYjAtNmY2NC00MTkyLWExZDItM2U1MmVhYzIwMWJjIiwic2lkIjoiY2M2NzhjOTMtYzdkYS00YWU0LTgyNjYtNDZlYjRiZGRlYmU5In0.kv_YcB1rjnhW4gsP3ZLI1g7ehlZYGCLtpBjxRMqlmow",
  "access_expires_at": "2026-10-30T08:14:36.429127615Z",
  "refresh_token": "Xar89kghrDeoo88ALZQAF0xis_2BlA3YRrZigdnyWAU",
  "refresh_expires_at": "2026-10-30T19:59:36.42842308Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "af4b50a8-19c2-450a-abb0-229c61bba29b",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T07:59:35Z",
        "track_point_id": "6465a0b8-f601-48aa-86c8-3ef745e07b58",
        "work_session_id": "66da788b-db86-4744-9790-9f27653aa9d3"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T07:59:35Z",
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

`POST /api/admin/v1/driver-risk-flags/af4b50a8-19c2-450a-abb0-229c61bba29b/confirm` → **200**

```json
{
  "command_id": "5fde5888-21ad-48bc-9277-f88fd69d4fe6",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "af4b50a8-19c2-450a-abb0-229c61bba29b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T07:59:35Z",
    "track_point_id": "6465a0b8-f601-48aa-86c8-3ef745e07b58",
    "work_session_id": "66da788b-db86-4744-9790-9f27653aa9d3"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T07:59:35Z",
  "reason": null,
  "reviewed_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
  "reviewed_at": "2026-10-30T07:59:37.307292Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/af4b50a8-19c2-450a-abb0-229c61bba29b/dismiss` → **409**

```json
{
  "command_id": "e9dab19c-a8ed-4c23-b193-ea7171e3d3b7",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/af4b50a8-19c2-450a-abb0-229c61bba29b/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "7f7cc236-be41-41f1-98b5-92c54b699a74"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "01e3fb81-ce83-4a82-951d-379b7efc2043",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "54160ade-8fc1-4a80-bc7c-6820eb98bbaa",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
  "raised_at": "2026-10-30T07:59:37.874428Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/54160ade-8fc1-4a80-bc7c-6820eb98bbaa/dismiss` → **200**

```json
{
  "command_id": "8b473ed7-6dc8-4155-862e-64eb94063914",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "54160ade-8fc1-4a80-bc7c-6820eb98bbaa",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
  "raised_at": "2026-10-30T07:59:37.874428Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
  "reviewed_at": "2026-10-30T07:59:38.15249Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "c8450184-f706-4ee8-9ea7-21a89569b7b7",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "af4b50a8-19c2-450a-abb0-229c61bba29b"
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
      "actor_id": "e72a0099-0680-46dd-9ec2-670a72e54279",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T07:59:38.444951Z"
    }
  ]
}
```

Done: flag af4b50a8-19c2-450a-abb0-229c61bba29b confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "ef6ef2e2-597a-468f-857c-911bd8be8073",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgwNzksImlhdCI6MTc5MzM0NzE3OSwianRpIjoiMzkwMTQ2OWEtZDc2ZC00Y2IwLWE3MmYtY2FjNzhjOTVkZTYwIiwic2lkIjoiZWY2ZWYyZTItNTk3YS00NjhmLTg1N2MtOTExYmQ4YmU4MDczIn0.eGe0-xWo9_QvmzfuqcRW8RuvIajo39AVm-tIgI-xisU",
  "access_expires_at": "2026-10-30T08:14:39.313989776Z",
  "refresh_token": "LHVSaEhS3nmSNUvMqtgzpr_WOQ0XwMmTCj1g3k5XjEc",
  "refresh_expires_at": "2026-10-30T19:59:39.313538204Z",
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
      "actor_id": "e72a0099-0680-46dd-9ec2-670a72e54279",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T07:59:38.444951Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "0fce3f34-322d-449f-974b-ab5bbf0754b7",
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
  "session_id": "66da788b-db86-4744-9790-9f27653aa9d3",
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
  "last_heartbeat_at": "2026-10-30T07:59:33.509137Z",
  "last_location_at": "2026-10-30T07:59:33.509137Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/66da788b-db86-4744-9790-9f27653aa9d3/close` → **200**

```json
{
  "command_id": "0a3ea073-0702-431a-9163-9dd8ac49df79",
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
  "session_id": "e243ea53-5507-4d10-aa99-b5f4dbba240b",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgwODEsImlhdCI6MTc5MzM0NzE4MSwianRpIjoiZGNjYjk1Y2MtOWZkZS00NjZiLWJmYmUtN2RkODU2ZTUwMzQ5Iiwic2lkIjoiZTI0M2VhNTMtNTUwNy00ZDEwLWFhOTktYjVmNGRiYmEyNDBiIn0.-DQNxJBHnFJfPc0Y_6wl8bvXW_SLjAktUwfyZQry3u0",
  "access_expires_at": "2026-10-30T08:14:41.011375759Z",
  "refresh_token": "UnMJ_smyLbKoWEFu7gbfLSPSwHSoBBJ7QkxZ11MDxfs",
  "refresh_expires_at": "2026-10-30T19:59:41.010921977Z",
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
  "command_id": "633f8816-f31b-4a89-bb89-74cb31d7cd7e",
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
  "changed_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T07:59:41.566617Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "633f8816-f31b-4a89-bb89-74cb31d7cd7e",
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
  "changed_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T07:59:41.566617Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48868822125",
  "device_ref": "sandbox-7436"
}
```

```json
{
  "challenge_id": "6f3968e7-b26f-473b-9678-1ef347589f42",
  "expires_at": "2026-10-30T08:04:42.123311286Z",
  "resend_available_at": "2026-10-30T07:59:43.123311286Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48868822125` → **200**

```json
{
  "phone": "+48868822125",
  "audience": "CLIENT",
  "code": "866232",
  "sent_at": "2026-10-30T07:59:42.125858406Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6f3968e7-b26f-473b-9678-1ef347589f42",
  "code": "866232",
  "device_ref": "sandbox-7436"
}
```

```json
{
  "session_id": "2e25cc96-dea1-4fa9-9464-04cf8028961e",
  "subject": {
    "type": "CLIENT",
    "id": "a0c5169e-4291-434a-900a-333dd79892b6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMGM1MTY5ZS00MjkxLTQzNGEtOTAwYS0zMzNkZDc5ODkyYjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MDgyLCJpYXQiOjE3OTMzNDcxODIsImp0aSI6ImVmODg2ZDQzLWRlOGUtNDBiMS05NjAwLTQ2MzM3NzU4MWE2MSIsInNpZCI6IjJlMjVjYzk2LWRlYTEtNGZhOS05NDY0LTA0Y2Y4MDI4OTYxZSJ9.1R6W8a3edWKvcrXCBm0STX_ZUiceX2pdNGoNeCq2veM",
  "access_expires_at": "2026-10-30T08:14:42.419715532Z",
  "refresh_token": "-0Nz2cVZay-3Wy8eV7GoQcwoYy5nhBnXkH-KixFEQVE",
  "refresh_expires_at": "2026-11-29T07:59:42.418949076Z",
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
  "correlation_id": "9ccfe92d-f360-4200-8789-255a24578c52"
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
  "device_ref": "sandbox-8511"
}
```

```json
{
  "challenge_id": "272aff6d-8089-4202-bea5-4d1eec42ef02",
  "expires_at": "2026-10-30T08:04:43.224901349Z",
  "resend_available_at": "2026-10-30T07:59:44.224901349Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "491416",
  "sent_at": "2026-10-30T07:59:43.227074464Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "272aff6d-8089-4202-bea5-4d1eec42ef02",
  "code": "491416",
  "device_ref": "sandbox-8511"
}
```

```json
{
  "session_id": "33eb3212-0c34-4c8e-98a2-fed38230777a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODA4MywiaWF0IjoxNzkzMzQ3MTgzLCJqdGkiOiI1MDZiYjQ3OS1kYmE1LTQxNTAtODAxMi1kOTA0OGVhNTM5ODQiLCJzaWQiOiIzM2ViMzIxMi0wYzM0LTRjOGUtOThhMi1mZWQzODIzMDc3N2EifQ.KHnfOT4SZeQ2csOsiQHu2Qv2pZMkLu9kRmyBDfywoQY",
  "access_expires_at": "2026-10-30T08:14:43.518499959Z",
  "refresh_token": "2GQi7z7E5UOrLt7vVio7YwXCllFpgAGvl8JXiPEhTB8",
  "refresh_expires_at": "2026-11-29T07:59:43.517965713Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "1d2a5008-99f4-4ea2-ada8-2ea7d4fdb0d4",
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
  "last_heartbeat_at": "2026-10-30T07:58:26.114659Z",
  "last_location_at": "2026-10-30T07:58:26.114659Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/1d2a5008-99f4-4ea2-ada8-2ea7d4fdb0d4/handover` → **200**

```json
{
  "command_id": "357c8daa-31f6-480b-958d-a88ba14d7804",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "1d2a5008-99f4-4ea2-ada8-2ea7d4fdb0d4",
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
  "last_heartbeat_at": "2026-10-30T07:58:26.114659Z",
  "last_location_at": "2026-10-30T07:58:26.114659Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/1d2a5008-99f4-4ea2-ada8-2ea7d4fdb0d4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:59:44Z",
    "sequence": 1793347184351
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "1d2a5008-99f4-4ea2-ada8-2ea7d4fdb0d4",
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
  "last_heartbeat_at": "2026-10-30T07:59:44.367193Z",
  "last_location_at": "2026-10-30T07:59:44.367193Z",
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
  "session_id": "1d2a5008-99f4-4ea2-ada8-2ea7d4fdb0d4",
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
  "last_heartbeat_at": "2026-10-30T07:59:44.367193Z",
  "last_location_at": "2026-10-30T07:59:44.367193Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1d2a5008-99f4-4ea2-ada8-2ea7d4fdb0d4/close` → **200**

```json
{
  "command_id": "2e614b89-938e-490f-8abe-3ac43b72811e",
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
  "correlation_id": "669a32d3-1587-4a9d-ae87-10858dc935fc"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670647012",
  "device_ref": "sandbox-14932"
}
```

```json
{
  "challenge_id": "60d88b47-2e1f-41fc-9def-849836978600",
  "expires_at": "2026-10-30T08:04:45.73693096Z",
  "resend_available_at": "2026-10-30T07:59:46.73693096Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670647012` → **200**

```json
{
  "phone": "+380670647012",
  "audience": "CLIENT",
  "code": "868924",
  "sent_at": "2026-10-30T07:59:45.7392511Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "60d88b47-2e1f-41fc-9def-849836978600",
  "code": "868924",
  "device_ref": "sandbox-14932"
}
```

```json
{
  "session_id": "6f2e4f07-2c1e-470a-a0e8-806badc17378",
  "subject": {
    "type": "CLIENT",
    "id": "fe742d68-329b-4dd1-926e-caaf48d802cc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZTc0MmQ2OC0zMjliLTRkZDEtOTI2ZS1jYWFmNDhkODAyY2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MDg2LCJpYXQiOjE3OTMzNDcxODYsImp0aSI6IjQ1ZDdmZjQ1LTkxYzYtNDFkNS1hZWJkLTIxNWJlMWJiYTE3MCIsInNpZCI6IjZmMmU0ZjA3LTJjMWUtNDcwYS1hMGU4LTgwNmJhZGMxNzM3OCJ9.z0dSwKfAMbCzdtodD1UMcr0N_XgloZmzq2htWJhpEF8",
  "access_expires_at": "2026-10-30T08:14:46.02765537Z",
  "refresh_token": "0x6NtOa9oTNMr1U9SKbkpnmCJIXOWUrWx0AHHZf_8hY",
  "refresh_expires_at": "2026-11-29T07:59:46.027260552Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "bedbfd8d-5f07-4051-b6bf-ebc7a8aa7fcb",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "510d8970-b466-4e24-946c-149c59d58d49",
  "upload_path": "/api/rider/v1/uploads/510d8970-b466-4e24-946c-149c59d58d49",
  "expires_at": "2026-10-30T08:14:46.302370165Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/510d8970-b466-4e24-946c-149c59d58d49` → **200**

```json
{
  "file_id": "510d8970-b466-4e24-946c-149c59d58d49",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "fa127668-145d-4f3a-9c0a-ae96696a9e7b",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "510d8970-b466-4e24-946c-149c59d58d49"
  ]
}
```

```json
{
  "id": "1317b061-88f3-4125-82ac-37913d0c80c0",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "fe742d68-329b-4dd1-926e-caaf48d802cc",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T07:59:46.606449Z",
  "updated_at": "2026-10-30T07:59:46.606449Z",
  "respond_by": "2026-10-30T11:59:46.606449Z",
  "messages": [
    {
      "id": "c4c17307-9482-4bfa-90a3-931859dce8bb",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "fe742d68-329b-4dd1-926e-caaf48d802cc",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T07:59:46.607848Z",
      "attachments": [
        {
          "file_id": "510d8970-b466-4e24-946c-149c59d58d49",
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
  "session_id": "679d55dd-c9f5-482b-adbc-a9f5e9fa4649",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgwODcsImlhdCI6MTc5MzM0NzE4NywianRpIjoiNjJjZDEzYjItM2JkZi00NjBjLWFkNTUtZmU0ZGFlOTNkODMzIiwic2lkIjoiNjc5ZDU1ZGQtYzlmNS00ODJiLWFkYmMtYTlmNWU5ZmE0NjQ5In0.qqta3oUcgXRl8rRQENsgBqrED7fX-u9_eI81b99HInM",
  "access_expires_at": "2026-10-30T08:14:47.221662383Z",
  "refresh_token": "L6ef_kzhV1ZOJJOADTJZHGwjoC9joig6AX3F7Hx2RpA",
  "refresh_expires_at": "2026-10-30T19:59:47.221071114Z",
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
  "session_id": "27604f17-4298-488c-a077-e7959bb7d5e0",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgwODcsImlhdCI6MTc5MzM0NzE4NywianRpIjoiNmY3YWQ5ZWEtYjZkNS00NjI4LTlhMWMtY2EyNjY3NjI0ZjBkIiwic2lkIjoiMjc2MDRmMTctNDI5OC00ODhjLWEwNzctZTc5NTliYjdkNWUwIn0._TKIDf5l9c1wi8WxZJ7F4y1c8qIgsLXp0GXfJJVJy5U",
  "access_expires_at": "2026-10-30T08:14:47.812232464Z",
  "refresh_token": "PmgFRgyhvh-upKi6GFw3GrIHMtWYFPds9VXowCpaKHw",
  "refresh_expires_at": "2026-10-30T19:59:47.811809564Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/1317b061-88f3-4125-82ac-37913d0c80c0/attachments/510d8970-b466-4e24-946c-149c59d58d49` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "4e079f6b-3119-4595-b235-f97a05597eb6",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "99d0f403-f484-4493-9c49-50b2a65f616d",
  "upload_path": "/api/operator/v1/uploads/99d0f403-f484-4493-9c49-50b2a65f616d",
  "expires_at": "2026-10-30T08:14:48.100795855Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/99d0f403-f484-4493-9c49-50b2a65f616d` → **200**

```json
{
  "file_id": "99d0f403-f484-4493-9c49-50b2a65f616d",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/1317b061-88f3-4125-82ac-37913d0c80c0` → **200**

```json
{
  "id": "1317b061-88f3-4125-82ac-37913d0c80c0",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "fe742d68-329b-4dd1-926e-caaf48d802cc",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T07:59:46.606449Z",
  "updated_at": "2026-10-30T07:59:46.606449Z",
  "respond_by": "2026-10-30T11:59:46.606449Z",
  "messages": [
    {
      "id": "c4c17307-9482-4bfa-90a3-931859dce8bb",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "fe742d68-329b-4dd1-926e-caaf48d802cc",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T07:59:46.607848Z",
      "attachments": [
        {
          "file_id": "510d8970-b466-4e24-946c-149c59d58d49",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/1317b061-88f3-4125-82ac-37913d0c80c0/comments` → **200**

```json
{
  "command_id": "0e347d55-a2a9-44fb-a9bb-73fe628d8911",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "99d0f403-f484-4493-9c49-50b2a65f616d"
  ]
}
```

```json
{
  "id": "1317b061-88f3-4125-82ac-37913d0c80c0",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "fe742d68-329b-4dd1-926e-caaf48d802cc",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T07:59:46.606449Z",
  "updated_at": "2026-10-30T07:59:48.695819Z",
  "respond_by": "2026-10-30T11:59:46.606449Z",
  "messages": [
    {
      "id": "c4c17307-9482-4bfa-90a3-931859dce8bb",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "fe742d68-329b-4dd1-926e-caaf48d802cc",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T07:59:46.607848Z",
      "attachments": [
        {
          "file_id": "510d8970-b466-4e24-946c-149c59d58d49",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "8aec7789-df65-48bc-87f4-f080c61c6ec3",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "e72a0099-0680-46dd-9ec2-670a72e54279",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T07:59:48.695339Z",
      "attachments": [
        {
          "file_id": "99d0f403-f484-4493-9c49-50b2a65f616d",
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

`GET /api/rider/v1/support/cases/1317b061-88f3-4125-82ac-37913d0c80c0` → **200**

```json
{
  "id": "1317b061-88f3-4125-82ac-37913d0c80c0",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "fe742d68-329b-4dd1-926e-caaf48d802cc",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T07:59:46.606449Z",
  "updated_at": "2026-10-30T07:59:48.695819Z",
  "respond_by": "2026-10-30T11:59:46.606449Z",
  "messages": [
    {
      "id": "c4c17307-9482-4bfa-90a3-931859dce8bb",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "fe742d68-329b-4dd1-926e-caaf48d802cc",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T07:59:46.607848Z",
      "attachments": [
        {
          "file_id": "510d8970-b466-4e24-946c-149c59d58d49",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "8aec7789-df65-48bc-87f4-f080c61c6ec3",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T07:59:48.695339Z",
      "attachments": [
        {
          "file_id": "99d0f403-f484-4493-9c49-50b2a65f616d",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/1317b061-88f3-4125-82ac-37913d0c80c0/attachments/99d0f403-f484-4493-9c49-50b2a65f616d` → **200**

Done: support case 1317b061-88f3-4125-82ac-37913d0c80c0, rider attachment 510d8970-b466-4e24-946c-149c59d58d49, operator attachment 99d0f403-f484-4493-9c49-50b2a65f616d.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733023717",
  "device_ref": "sandbox-28814"
}
```

```json
{
  "challenge_id": "64070bc6-17da-426f-9e50-0f1d8de690b8",
  "expires_at": "2026-10-30T08:04:49.28493288Z",
  "resend_available_at": "2026-10-30T07:59:50.28493288Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380733023717` → **200**

```json
{
  "phone": "+380733023717",
  "audience": "CLIENT",
  "code": "433451",
  "sent_at": "2026-10-30T07:59:49.288277937Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "64070bc6-17da-426f-9e50-0f1d8de690b8",
  "code": "433451",
  "device_ref": "sandbox-28814"
}
```

```json
{
  "session_id": "e473e6f2-c66b-483a-bb41-af8d027279dd",
  "subject": {
    "type": "CLIENT",
    "id": "db72da50-e255-445d-ac0c-8dbbf35ddd79"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjcyZGE1MC1lMjU1LTQ0NWQtYWMwYy04ZGJiZjM1ZGRkNzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MDg5LCJpYXQiOjE3OTMzNDcxODksImp0aSI6ImNhZjFjMzNmLTdjMzItNDA4YS04Y2M4LWNlYWQ4MWVmODI1NyIsInNpZCI6ImU0NzNlNmYyLWM2NmItNDgzYS1iYjQxLWFmOGQwMjcyNzlkZCJ9.rgVmwjSB1_zJJMusK0bLj17ZbrzomGj5Q8U-M2zgB4s",
  "access_expires_at": "2026-10-30T08:14:49.580414712Z",
  "refresh_token": "MDlRD3ovy2WJ1e_Ac8BUwZdvl2whlrpZrkWQ8l18EtA",
  "refresh_expires_at": "2026-11-29T07:59:49.579788851Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "293b8cd1-e2b0-40e8-82e2-b58978e5d461",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "30750364-7a18-463c-973e-c4f1ab04b657",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-30750364-7a18-463c-973e-c4f1ab04b657",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "134804674627968c9408dd8625bb17bd",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=30750364-7a18-463c-973e-c4f1ab04b657",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733023717"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=30750364-7a18-463c-973e-c4f1ab04b657",
  "expires_at": "2026-10-30T08:29:49.853857Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/30750364-7a18-463c-973e-c4f1ab04b657` → **200**

```json
{
  "id": "30750364-7a18-463c-973e-c4f1ab04b657",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T08:29:49.853857Z",
  "card": {
    "id": "d68273e0-20e6-44c4-bbe6-2e89d8183db3",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3313",
    "card_type": "Visa",
    "created_at": "2026-10-30T07:59:50.132585Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "17625527-daab-4c8b-ae88-5c6dc961a70e",
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
  "id": "0a416581-98e6-42af-925d-4f9861b129c5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:04:50.427755Z",
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
  "command_id": "aaacddb3-0183-424e-8a06-cbe7e0387bd5",
  "quote_id": "0a416581-98e6-42af-925d-4f9861b129c5",
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
  "id": "cc070d47-d5bf-48ed-b31d-7c6435288fd7",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "db72da50-e255-445d-ac0c-8dbbf35ddd79",
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
  "created_at": "2026-10-30T07:59:50.713911Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cc070d47-d5bf-48ed-b31d-7c6435288fd7` → **200**

```json
{
  "id": "cc070d47-d5bf-48ed-b31d-7c6435288fd7",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "db72da50-e255-445d-ac0c-8dbbf35ddd79",
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
  "created_at": "2026-10-30T07:59:50.713911Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cc070d47-d5bf-48ed-b31d-7c6435288fd7` → **200**

```json
{
  "id": "cc070d47-d5bf-48ed-b31d-7c6435288fd7",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "db72da50-e255-445d-ac0c-8dbbf35ddd79",
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
  "created_at": "2026-10-30T07:59:50.713911Z",
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

`GET /api/rider/v1/orders/cc070d47-d5bf-48ed-b31d-7c6435288fd7` → **200**

```json
{
  "id": "cc070d47-d5bf-48ed-b31d-7c6435288fd7",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "db72da50-e255-445d-ac0c-8dbbf35ddd79",
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
  "created_at": "2026-10-30T07:59:50.713911Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/cc070d47-d5bf-48ed-b31d-7c6435288fd7/switch-to-cash` → **200**

```json
{
  "command_id": "be2dbf7d-cf16-4653-b091-9be3966ec1e7",
  "expected_version": 3
}
```

```json
{
  "id": "cc070d47-d5bf-48ed-b31d-7c6435288fd7",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "db72da50-e255-445d-ac0c-8dbbf35ddd79",
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
  "created_at": "2026-10-30T07:59:50.713911Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/cc070d47-d5bf-48ed-b31d-7c6435288fd7/switch-to-cash` → **409**

```json
{
  "command_id": "6226e74e-9885-4e69-94cc-8e9a2dcd2e65",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/cc070d47-d5bf-48ed-b31d-7c6435288fd7/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e9b7420c-93b3-42fb-bfba-d24215d6a4fd"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/cc070d47-d5bf-48ed-b31d-7c6435288fd7` → **200**

```json
{
  "id": "cc070d47-d5bf-48ed-b31d-7c6435288fd7",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "db72da50-e255-445d-ac0c-8dbbf35ddd79",
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
  "created_at": "2026-10-30T07:59:50.713911Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/cc070d47-d5bf-48ed-b31d-7c6435288fd7/cancel` → **200**

```json
{
  "command_id": "fc4542f0-87fb-4cde-91a2-450573bca634",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "cc070d47-d5bf-48ed-b31d-7c6435288fd7",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "db72da50-e255-445d-ac0c-8dbbf35ddd79",
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
  "created_at": "2026-10-30T07:59:50.713911Z",
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
  "session_id": "692bd732-d152-46d9-ad5b-991739c3ea12",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgwOTQsImlhdCI6MTc5MzM0NzE5NCwianRpIjoiMzBiNjRmYmEtOGFkNS00MjRiLWExMzktZjNhNmRjZThmODJkIiwic2lkIjoiNjkyYmQ3MzItZDE1Mi00NmQ5LWFkNWItOTkxNzM5YzNlYTEyIn0.vpTsol2q1a_QXzAxXSlrqpGhd8JE_4V8489jd9KmLUA",
  "access_expires_at": "2026-10-30T08:14:54.357416133Z",
  "refresh_token": "oeSSkxsFUaSHwjHmxuFDnld-zMpx68h8xj5wznEIuyc",
  "refresh_expires_at": "2026-10-30T19:59:54.356940846Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-17728"
}
```

```json
{
  "challenge_id": "deb1fec8-291f-4058-9f27-7457c177fef2",
  "expires_at": "2026-10-30T08:04:54.622836262Z",
  "resend_available_at": "2026-10-30T07:59:55.622836262Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "540084",
  "sent_at": "2026-10-30T07:59:54.625342341Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "deb1fec8-291f-4058-9f27-7457c177fef2",
  "code": "540084",
  "device_ref": "sandbox-17728"
}
```

```json
{
  "session_id": "9d11d186-13a9-4d11-bb62-af5c82004163",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODA5NCwiaWF0IjoxNzkzMzQ3MTk0LCJqdGkiOiI3MmFkNWQ4MC03YThhLTRjZGYtOTk1ZC00NDlhYjM3ZjY3MTgiLCJzaWQiOiI5ZDExZDE4Ni0xM2E5LTRkMTEtYmI2Mi1hZjVjODIwMDQxNjMifQ.m0yrg1HLIRGD26phFvjtA594tOBx2052aFE0zSM9sRw",
  "access_expires_at": "2026-10-30T08:14:54.919708641Z",
  "refresh_token": "FABH4DnocsBSrMjXblD5gbsYTCI-OE5z1U-fljq-wq8",
  "refresh_expires_at": "2026-11-29T07:59:54.919177446Z",
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
      "actor_id": "e72a0099-0680-46dd-9ec2-670a72e54279",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T07:59:38.444951Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "e72a0099-0680-46dd-9ec2-670a72e54279",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T07:59:39.864154Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "b9717f99-df18-4b8b-9b9f-2727c1202baf",
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
  "device_ref": "sandbox-16569"
}
```

```json
{
  "challenge_id": "b78556fb-1e1c-4e1b-826a-4fb20e1fea2a",
  "expires_at": "2026-10-30T08:04:56.014963904Z",
  "resend_available_at": "2026-10-30T07:59:57.014963904Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "091137",
  "sent_at": "2026-10-30T07:59:56.017308093Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b78556fb-1e1c-4e1b-826a-4fb20e1fea2a",
  "code": "091137",
  "device_ref": "sandbox-16569"
}
```

```json
{
  "session_id": "3793b734-1614-4432-aede-d969f24646c5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODA5NiwiaWF0IjoxNzkzMzQ3MTk2LCJqdGkiOiIyYWQxMjU0Ni1jOTg0LTQ2ZDgtYTYyYy0wMmM1ZGJlZjE5MzEiLCJzaWQiOiIzNzkzYjczNC0xNjE0LTQ0MzItYWVkZS1kOTY5ZjI0NjQ2YzUifQ.BNH5uRMOSTWwLt03CfUefojQL3tCGIdvsPTiOxYcIjs",
  "access_expires_at": "2026-10-30T08:14:56.311804964Z",
  "refresh_token": "PIl3wnsl__3DZr-iAUoPoWI4kWWIkLzYjwfczwsIxyE",
  "refresh_expires_at": "2026-11-29T07:59:56.311280006Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d5bb200f-a44f-4ffa-b842-f9de13f963cb",
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
  "last_heartbeat_at": "2026-10-30T07:59:21.15612Z",
  "last_location_at": "2026-10-30T07:59:21.15612Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/d5bb200f-a44f-4ffa-b842-f9de13f963cb/handover` → **200**

```json
{
  "command_id": "ebf34574-7158-422c-be21-25d9fa2962e7",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d5bb200f-a44f-4ffa-b842-f9de13f963cb",
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
  "last_heartbeat_at": "2026-10-30T07:59:21.15612Z",
  "last_location_at": "2026-10-30T07:59:21.15612Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

(the car drives 13 s to the next point)

`POST /api/driver/v1/work-sessions/d5bb200f-a44f-4ffa-b842-f9de13f963cb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:00:10Z",
    "sequence": 1793347210152
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d5bb200f-a44f-4ffa-b842-f9de13f963cb",
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
  "last_heartbeat_at": "2026-10-30T08:00:10.169389Z",
  "last_location_at": "2026-10-30T08:00:10.169389Z",
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
  "command_id": "ebab32e3-df05-41e4-8bc7-03b85eb1901d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:00:10Z",
    "sequence": 1793347210734
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8c21e2d9-b2ff-49ca-b10c-ed62e66c42a5",
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
  "last_heartbeat_at": "2026-10-30T08:00:10.751534Z",
  "last_location_at": "2026-10-30T08:00:10.751534Z",
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
  "session_id": "7941ebee-8a55-4d32-a323-adf72b27d932",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgxMTEsImlhdCI6MTc5MzM0NzIxMSwianRpIjoiNGM0MzZjZjItZTZhZS00YzlmLTk2MGMtYThkNDA2MmU4NzQ5Iiwic2lkIjoiNzk0MWViZWUtOGE1NS00ZDMyLWEzMjMtYWRmNzJiMjdkOTMyIn0.4Bm0k_z1js3HE9OCV0eAAFkx0Yp3OGDoIIqYhi2-ysg",
  "access_expires_at": "2026-10-30T08:15:11.359621349Z",
  "refresh_token": "uG-8dhJIOALGAwuAqnCPdPnbHQTPSWEU0rKrYWIjM7E",
  "refresh_expires_at": "2026-10-30T20:00:11.358824836Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "af8f6436-ef04-4497-aae6-a0476ca6a447",
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
  "id": "2cea6984-8678-4404-b1d0-19514e183f63",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:05:11.642895Z",
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
  "command_id": "5261f20b-0b40-4c98-b076-c55ba47683fa",
  "quote_id": "2cea6984-8678-4404-b1d0-19514e183f63",
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
  "id": "97379971-108c-4daf-bfc3-34f0dd4e1f66",
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
  "created_at": "2026-10-30T08:00:11.936077Z",
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
    "id": "3a0378f0-748c-46a1-943d-73ad4fc3cb83",
    "order_id": "97379971-108c-4daf-bfc3-34f0dd4e1f66",
    "expires_at": "2026-10-30T08:00:26.940334Z",
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

`POST /api/driver/v1/offers/3a0378f0-748c-46a1-943d-73ad4fc3cb83/accept` → **200**

```json
{
  "command_id": "17b5b408-5388-49f8-819a-db2f86a32347"
}
```

```json
{
  "id": "309f511b-50c6-4612-86ca-3399e2e08997",
  "order_id": "97379971-108c-4daf-bfc3-34f0dd4e1f66",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d5a6b2ff-c85c-4f2e-b598-d0fc0101d5c7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d5a6b2ff-c85c-4f2e-b598-d0fc0101d5c7",
  "order_id": "97379971-108c-4daf-bfc3-34f0dd4e1f66",
  "assignment_id": "309f511b-50c6-4612-86ca-3399e2e08997",
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

`POST /api/driver/v1/work-sessions/8c21e2d9-b2ff-49ca-b10c-ed62e66c42a5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:00:22Z",
    "sequence": 1793347222347
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8c21e2d9-b2ff-49ca-b10c-ed62e66c42a5",
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
  "last_heartbeat_at": "2026-10-30T08:00:22.379946Z",
  "last_location_at": "2026-10-30T08:00:22.379946Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/d5a6b2ff-c85c-4f2e-b598-d0fc0101d5c7/arrive` → **200**

```json
{
  "command_id": "488f04e9-092f-47f2-aac2-5fa591bb452d",
  "expected_version": 0
}
```

```json
{
  "id": "d5a6b2ff-c85c-4f2e-b598-d0fc0101d5c7",
  "order_id": "97379971-108c-4daf-bfc3-34f0dd4e1f66",
  "assignment_id": "309f511b-50c6-4612-86ca-3399e2e08997",
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
  "arrived_at": "2026-10-30T08:00:22.672155Z",
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

`POST /api/driver/v1/trips/d5a6b2ff-c85c-4f2e-b598-d0fc0101d5c7/start` → **200**

```json
{
  "command_id": "dba97e3d-5ca1-4e8f-adaa-6422e66e0c1b",
  "expected_version": 1
}
```

```json
{
  "id": "d5a6b2ff-c85c-4f2e-b598-d0fc0101d5c7",
  "order_id": "97379971-108c-4daf-bfc3-34f0dd4e1f66",
  "assignment_id": "309f511b-50c6-4612-86ca-3399e2e08997",
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
  "arrived_at": "2026-10-30T08:00:22.672155Z",
  "started_at": "2026-10-30T08:00:22.96203Z",
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

`POST /api/driver/v1/trips/d5a6b2ff-c85c-4f2e-b598-d0fc0101d5c7/complete` → **200**

```json
{
  "command_id": "fca29fec-2e7d-4c9b-90b0-dced68e91300",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:00:23Z",
  "cash_received": true
}
```

```json
{
  "id": "d5a6b2ff-c85c-4f2e-b598-d0fc0101d5c7",
  "order_id": "97379971-108c-4daf-bfc3-34f0dd4e1f66",
  "assignment_id": "309f511b-50c6-4612-86ca-3399e2e08997",
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
  "arrived_at": "2026-10-30T08:00:22.672155Z",
  "started_at": "2026-10-30T08:00:22.96203Z",
  "completed_at": "2026-10-30T08:00:23.255874Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/97379971-108c-4daf-bfc3-34f0dd4e1f66` → **200**

```json
{
  "id": "97379971-108c-4daf-bfc3-34f0dd4e1f66",
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
    "id": "309f511b-50c6-4612-86ca-3399e2e08997",
    "order_id": "97379971-108c-4daf-bfc3-34f0dd4e1f66",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d5a6b2ff-c85c-4f2e-b598-d0fc0101d5c7",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:00:11.936077Z",
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
  "session_id": "d5bb200f-a44f-4ffa-b842-f9de13f963cb",
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
  "last_heartbeat_at": "2026-10-30T08:00:10.169389Z",
  "last_location_at": "2026-10-30T08:00:10.169389Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/d5bb200f-a44f-4ffa-b842-f9de13f963cb/close` → **200**

```json
{
  "command_id": "65b203ad-c0c6-40e1-8279-8ec2b5587a18",
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
  "session_id": "8c21e2d9-b2ff-49ca-b10c-ed62e66c42a5",
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
  "last_heartbeat_at": "2026-10-30T08:00:22.379946Z",
  "last_location_at": "2026-10-30T08:00:22.379946Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8c21e2d9-b2ff-49ca-b10c-ed62e66c42a5/close` → **200**

```json
{
  "command_id": "ed99f225-528d-425c-b7e1-7c92df30df85",
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

Done: terminal order 97379971-108c-4daf-bfc3-34f0dd4e1f66 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-37"
}
```

```json
{
  "challenge_id": "e3ddd211-6e48-4885-b020-ba94eef9902e",
  "expires_at": "2026-10-30T08:05:28.198159655Z",
  "resend_available_at": "2026-10-30T08:00:29.198159655Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "863322",
  "sent_at": "2026-10-30T08:00:28.201668715Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e3ddd211-6e48-4885-b020-ba94eef9902e",
  "code": "863322",
  "device_ref": "sandbox-37"
}
```

```json
{
  "session_id": "71bc57dd-d662-4f02-84b8-afc4fe5335e4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODEyOCwiaWF0IjoxNzkzMzQ3MjI4LCJqdGkiOiI5OTEzNTYzYS03NGU2LTQ3ZjktYmFiMi0xZDZiMTc2ZmMzZjUiLCJzaWQiOiI3MWJjNTdkZC1kNjYyLTRmMDItODRiOC1hZmM0ZmU1MzM1ZTQifQ.NsEFwaD2t8MqeGSJb_HhCJfI3hDaA6kKbNT5FN_aSpU",
  "access_expires_at": "2026-10-30T08:15:28.495902665Z",
  "refresh_token": "lha8QgfO5k5ySXaDAuWvckziiTDm72r5XkmPRKIgi8g",
  "refresh_expires_at": "2026-11-29T08:00:28.495472232Z",
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
  "device_ref": "sandbox-12799"
}
```

```json
{
  "challenge_id": "a1cf47d2-a0fa-4807-854c-96af636ba085",
  "expires_at": "2026-10-30T08:05:29.02879186Z",
  "resend_available_at": "2026-10-30T08:00:30.02879186Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "783554",
  "sent_at": "2026-10-30T08:00:29.031189969Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a1cf47d2-a0fa-4807-854c-96af636ba085",
  "code": "783554",
  "device_ref": "sandbox-12799"
}
```

```json
{
  "session_id": "eef99fbc-dd3d-4f76-9a00-4ae4a33fa061",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODEyOSwiaWF0IjoxNzkzMzQ3MjI5LCJqdGkiOiI0ODhhNDZmNy02MzQ0LTQyYTEtYTk5ZS1kZWM2OTI2ODAxZmQiLCJzaWQiOiJlZWY5OWZiYy1kZDNkLTRmNzYtOWEwMC00YWU0YTMzZmEwNjEifQ.5o_EYVxFaTNx5HKp33Xf_I2f27n1nzRCZFD2IL87C24",
  "access_expires_at": "2026-10-30T08:15:29.323614343Z",
  "refresh_token": "w4R15PZoszgrJij7YopkOKjnfm-HA88T_Bgj0PAvC90",
  "refresh_expires_at": "2026-11-29T08:00:29.322683505Z",
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
  "device_ref": "sandbox-20592"
}
```

```json
{
  "challenge_id": "5ea29d70-614c-4850-8f70-06a1219417b0",
  "expires_at": "2026-10-30T08:05:29.858894702Z",
  "resend_available_at": "2026-10-30T08:00:30.858894702Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "613971",
  "sent_at": "2026-10-30T08:00:29.861305613Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5ea29d70-614c-4850-8f70-06a1219417b0",
  "code": "613971",
  "device_ref": "sandbox-20592"
}
```

```json
{
  "session_id": "b485050a-4404-4f9e-9b1c-d54d39ccc2a9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODEzMCwiaWF0IjoxNzkzMzQ3MjMwLCJqdGkiOiI1ZTgzYWFjNi0wZTAwLTQ2YTktYTFiMy0wNTgzZGFkZmU0ZmUiLCJzaWQiOiJiNDg1MDUwYS00NDA0LTRmOWUtOWIxYy1kNTRkMzljY2MyYTkifQ.tlSO-vHZnob3RZ6z7g--HREuZQ4HYlMsatv1ZPwRzi4",
  "access_expires_at": "2026-10-30T08:15:30.155760654Z",
  "refresh_token": "gBNWaUF55XNoZjgQxNS4DMRUAayHv1Mm9Bek-nJoFpA",
  "refresh_expires_at": "2026-11-29T08:00:30.155225376Z",
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
  "phone": "+380697343712",
  "device_ref": "sandbox-6528"
}
```

```json
{
  "challenge_id": "bbaa5885-e79c-4c3d-bda3-8dc9855c1870",
  "expires_at": "2026-10-30T08:05:30.692212947Z",
  "resend_available_at": "2026-10-30T08:00:31.692212947Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380697343712` → **200**

```json
{
  "phone": "+380697343712",
  "audience": "CLIENT",
  "code": "894590",
  "sent_at": "2026-10-30T08:00:30.69454831Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bbaa5885-e79c-4c3d-bda3-8dc9855c1870",
  "code": "894590",
  "device_ref": "sandbox-6528"
}
```

```json
{
  "session_id": "c972f023-0089-4d50-adc9-2ff7be6a13c0",
  "subject": {
    "type": "CLIENT",
    "id": "e040be81-28fc-4b69-bad7-efb070cb7196"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDQwYmU4MS0yOGZjLTRiNjktYmFkNy1lZmIwNzBjYjcxOTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MTMwLCJpYXQiOjE3OTMzNDcyMzAsImp0aSI6IjRjMzI0YzVmLTIyZjUtNGM4Mi1iN2ExLWIyNjBmNzJlMDkwZiIsInNpZCI6ImM5NzJmMDIzLTAwODktNGQ1MC1hZGM5LTJmZjdiZTZhMTNjMCJ9.PMC96qKd9MM1QHviEa0gcvwCZaGpxE_AX2LUJnoQqmc",
  "access_expires_at": "2026-10-30T08:15:30.992596319Z",
  "refresh_token": "ttEgOvXTLSdEryFv_tpw584Km6zK0G9Sy6078coHfC4",
  "refresh_expires_at": "2026-11-29T08:00:30.992139946Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d029649a-b728-4335-9ef4-31d7e2652331",
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
  "id": "13fca266-1736-4c87-a46c-8fbfd59e355e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:05:31.283395Z",
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
  "command_id": "09a200d9-17eb-4c07-8148-00b74e841796",
  "quote_id": "13fca266-1736-4c87-a46c-8fbfd59e355e",
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
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:00:31.581175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:00:31.581175Z",
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
  "blizz_dispatch_excluded_total": 11,
  "blizz_sms_sent_total": 73
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 17
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 14.132948546
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 6.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.202395036
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
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 66.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/f1e985d7-7360-4839-8614-87855f644c77` → **200**

```json
{
  "id": "f1e985d7-7360-4839-8614-87855f644c77",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e040be81-28fc-4b69-bad7-efb070cb7196",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:00:31.581175Z",
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
  "session_id": "9ac42bad-00d2-4a97-b0b4-81d609618bd1",
  "subject": {
    "type": "STAFF",
    "id": "e72a0099-0680-46dd-9ec2-670a72e54279"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzJhMDA5OS0wNjgwLTQ2ZGQtOWVjMi02NzBhNzJlNTQyNzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgzMTgsImlhdCI6MTc5MzM0NzQxOCwianRpIjoiODgyNTI1ZTEtYWJiZS00ZWUxLTljZGItYzExNDM5N2I3YzBhIiwic2lkIjoiOWFjNDJiYWQtMDBkMi00YTk3LWIwYjQtODFkNjA5NjE4YmQxIn0.ThpiZ1D2b3X8OYdJsiXxKI7A5A7gi6TIN9fE2xcrt1c",
  "access_expires_at": "2026-10-30T08:18:38.142320289Z",
  "refresh_token": "uhMoGG5T3_3ziHEfQjAcyGZ4VScsCf_RKf4UmP0V-kY",
  "refresh_expires_at": "2026-10-30T20:03:38.141679068Z",
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
  "id": "a14fcbf5-3b68-4d53-8d9c-6c4540404c49",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:03:38.441465Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:03:38.441532Z",
  "updated_at": "2026-10-30T08:03:38.460533Z",
  "finished_at": "2026-10-30T08:03:38.460533Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/a14fcbf5-3b68-4d53-8d9c-6c4540404c49` → **200**

```json
{
  "run": {
    "id": "a14fcbf5-3b68-4d53-8d9c-6c4540404c49",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T08:03:38.441465Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T08:03:38.441532Z",
    "updated_at": "2026-10-30T08:03:38.460533Z",
    "finished_at": "2026-10-30T08:03:38.460533Z",
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
  "id": "a14fcbf5-3b68-4d53-8d9c-6c4540404c49",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:03:38.441465Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:03:38.441532Z",
  "updated_at": "2026-10-30T08:03:38.460533Z",
  "finished_at": "2026-10-30T08:03:38.460533Z",
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
  "id": "a14fcbf5-3b68-4d53-8d9c-6c4540404c49",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:03:38.441465Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:03:38.441532Z",
  "updated_at": "2026-10-30T08:03:38.460533Z",
  "finished_at": "2026-10-30T08:03:38.460533Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/2d5d0c32-9650-4d0d-a0dd-d733737e14fe` → **204**

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
  "id": "319878ac-0cc3-44e3-83c8-5e592e12aa3e",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:03:38.975466Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:03:38.975524Z",
  "updated_at": "2026-10-30T08:03:38.983785Z",
  "finished_at": "2026-10-30T08:03:38.983785Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/319878ac-0cc3-44e3-83c8-5e592e12aa3e` → **200**

```json
{
  "run": {
    "id": "319878ac-0cc3-44e3-83c8-5e592e12aa3e",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T08:03:38.975466Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T08:03:38.975524Z",
    "updated_at": "2026-10-30T08:03:38.983785Z",
    "finished_at": "2026-10-30T08:03:38.983785Z",
    "version": 1
  },
  "items": [
    {
      "id": "43e54016-c0a4-4bc5-9afe-b1de709b331f",
      "run_id": "319878ac-0cc3-44e3-83c8-5e592e12aa3e",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "db8163f3eac2fb56732164f32ad74b7c07b272548ba872b4cc1a56757f6e5839",
      "reference_display": "sandbox-reconciliation-2d5d0c32-9650-4d0d-a0dd-d#####e14fe",
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
      "provider_at": "2026-10-30T08:03:38Z",
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
  "id": "319878ac-0cc3-44e3-83c8-5e592e12aa3e",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:03:38.975466Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:03:38.975524Z",
  "updated_at": "2026-10-30T08:03:38.983785Z",
  "finished_at": "2026-10-30T08:03:38.983785Z",
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
  "id": "319878ac-0cc3-44e3-83c8-5e592e12aa3e",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:03:38.975466Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:03:38.975524Z",
  "updated_at": "2026-10-30T08:03:38.983785Z",
  "finished_at": "2026-10-30T08:03:38.983785Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/43e54016-c0a4-4bc5-9afe-b1de709b331f/resolve` → **200**

```json
{
  "command_id": "ad041cb5-9e3b-4322-98d7-8e6e2cdd1324",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "43e54016-c0a4-4bc5-9afe-b1de709b331f",
  "run_id": "319878ac-0cc3-44e3-83c8-5e592e12aa3e",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "db8163f3eac2fb56732164f32ad74b7c07b272548ba872b4cc1a56757f6e5839",
  "reference_display": "sandbox-reconciliation-2d5d0c32-9650-4d0d-a0dd-d#####e14fe",
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
  "provider_at": "2026-10-30T08:03:38Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
  "resolved_at": "2026-10-30T08:03:39.385105Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/43e54016-c0a4-4bc5-9afe-b1de709b331f/resolve` → **200**

```json
{
  "command_id": "ad041cb5-9e3b-4322-98d7-8e6e2cdd1324",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "43e54016-c0a4-4bc5-9afe-b1de709b331f",
  "run_id": "319878ac-0cc3-44e3-83c8-5e592e12aa3e",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "db8163f3eac2fb56732164f32ad74b7c07b272548ba872b4cc1a56757f6e5839",
  "reference_display": "sandbox-reconciliation-2d5d0c32-9650-4d0d-a0dd-d#####e14fe",
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
  "provider_at": "2026-10-30T08:03:38Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
  "resolved_at": "2026-10-30T08:03:39.385105Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/43e54016-c0a4-4bc5-9afe-b1de709b331f/resolve` → **409**

```json
{
  "command_id": "f5cd8047-2d03-49ea-80f0-7ff8fd07847e",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/43e54016-c0a4-4bc5-9afe-b1de709b331f/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "722c5379-fdf8-4baf-8cbc-722e31392acf"
}
```

`GET /api/admin/v1/payment-reconciliations/319878ac-0cc3-44e3-83c8-5e592e12aa3e` → **200**

```json
{
  "run": {
    "id": "319878ac-0cc3-44e3-83c8-5e592e12aa3e",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T08:03:38.975466Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T08:03:38.975524Z",
    "updated_at": "2026-10-30T08:03:39.385105Z",
    "finished_at": "2026-10-30T08:03:38.983785Z",
    "version": 2
  },
  "items": [
    {
      "id": "43e54016-c0a4-4bc5-9afe-b1de709b331f",
      "run_id": "319878ac-0cc3-44e3-83c8-5e592e12aa3e",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "db8163f3eac2fb56732164f32ad74b7c07b272548ba872b4cc1a56757f6e5839",
      "reference_display": "sandbox-reconciliation-2d5d0c32-9650-4d0d-a0dd-d#####e14fe",
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
      "provider_at": "2026-10-30T08:03:38Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "e72a0099-0680-46dd-9ec2-670a72e54279",
      "resolved_at": "2026-10-30T08:03:39.385105Z",
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
      "id": "319878ac-0cc3-44e3-83c8-5e592e12aa3e",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T08:03:38.975466Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T08:03:38.975524Z",
      "updated_at": "2026-10-30T08:03:39.385105Z",
      "finished_at": "2026-10-30T08:03:38.983785Z",
      "version": 2
    },
    {
      "id": "5c93f992-4bbd-4682-85ba-304e82aa0e32",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T07:47:35.344892Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T07:47:35.345059Z",
      "updated_at": "2026-10-30T07:47:35.353857Z",
      "finished_at": "2026-10-30T07:47:35.353857Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/2d5d0c32-9650-4d0d-a0dd-d733737e14fe` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "319878ac-0cc3-44e3-83c8-5e592e12aa3e",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:03:38.975466Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:03:38.975524Z",
  "updated_at": "2026-10-30T08:03:39.385105Z",
  "finished_at": "2026-10-30T08:03:38.983785Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793347545658E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793347546026E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793347546026E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793347545658E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793347546027E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
