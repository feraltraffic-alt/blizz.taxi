# Sandbox transcript (2026-10-30T08:00:40Z, d7bc2bd)

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
  "correlation_id": "452b3eb8-c61b-43f8-af34-e672e70d1794"
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
  "session_id": "802ca345-94ba-4894-aa81-2a2b3f443de9",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgxNDcsImlhdCI6MTc5MzM0NzI0NywianRpIjoiOWM3YTFiMGYtYmM0OS00NzdlLTk2MzUtYWZkNTMxNjAzMWFmIiwic2lkIjoiODAyY2EzNDUtOTRiYS00ODk0LWFhODEtMmEyYjNmNDQzZGU5In0.MyHq02RX86aZyDyiA79Dv_UxEiHqMHmBgnEWHH-QmnU",
  "access_expires_at": "2026-10-30T08:15:47.88861963Z",
  "refresh_token": "yEQgbWJOZihzq6LTLWybA5wlrD9r1vTkK8T-_ZGmpqA",
  "refresh_expires_at": "2026-10-30T20:00:47.886826598Z",
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
  "session_id": "c84e3256-0f0f-45e0-9572-e21dd73e1b94",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgxNDksImlhdCI6MTc5MzM0NzI0OSwianRpIjoiOTc2MGVlNmMtZDViMC00NmJlLWIzYTAtN2I0MDYwMTJiZTczIiwic2lkIjoiYzg0ZTMyNTYtMGYwZi00NWUwLTk1NzItZTIxZGQ3M2UxYjk0In0.O0ivo7usNcvdUd8NwQrXfK390ByB0gBok7mfP5bXExg",
  "access_expires_at": "2026-10-30T08:15:49.486354837Z",
  "refresh_token": "iszqwpii7jNqebt90oMTKejYQw9P2yoE0DK4qqHT1eA",
  "refresh_expires_at": "2026-10-30T20:00:49.485518264Z",
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
  "device_ref": "sandbox-5784"
}
```

```json
{
  "challenge_id": "7a88f287-b9f2-4c44-9f34-2ae46674419b",
  "expires_at": "2026-10-30T08:05:49.981346777Z",
  "resend_available_at": "2026-10-30T08:00:50.981346777Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "592524",
  "sent_at": "2026-10-30T08:00:49.991219135Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7a88f287-b9f2-4c44-9f34-2ae46674419b",
  "code": "592524",
  "device_ref": "sandbox-5784"
}
```

```json
{
  "session_id": "b5756c86-802b-42f9-b7fe-0ac746a6c516",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODE1MCwiaWF0IjoxNzkzMzQ3MjUwLCJqdGkiOiJjOWE4NjNlMC1kYjYwLTQxYjItOWVjMi03YzRkZmQ1YmNhZGYiLCJzaWQiOiJiNTc1NmM4Ni04MDJiLTQyZjktYjdmZS0wYWM3NDZhNmM1MTYifQ.ku8mRebOeXizhfS8aDXr-hNJgDoJNWtBCWXtu6YePp4",
  "access_expires_at": "2026-10-30T08:15:50.270357527Z",
  "refresh_token": "upriCK1bSIeQ5Gd0pP3Vp4L09tGlOOMxCN93SLkryTs",
  "refresh_expires_at": "2026-11-29T08:00:50.269388229Z",
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
  "command_id": "b3d3222f-743d-48d9-82ae-aeeb91da4e79",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:00:50Z",
    "sequence": 1793347250728
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ae913212-2e34-4b9e-9e5b-f2ae09c24774",
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
  "last_heartbeat_at": "2026-10-30T08:00:50.815585Z",
  "last_location_at": "2026-10-30T08:00:50.815585Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631052305",
  "device_ref": "sandbox-3881"
}
```

```json
{
  "challenge_id": "92d8668a-3bc7-4548-9713-ce12d05eeb80",
  "expires_at": "2026-10-30T08:05:51.083428745Z",
  "resend_available_at": "2026-10-30T08:00:52.083428745Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631052305` → **200**

```json
{
  "phone": "+380631052305",
  "audience": "CLIENT",
  "code": "924055",
  "sent_at": "2026-10-30T08:00:51.087542978Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "92d8668a-3bc7-4548-9713-ce12d05eeb80",
  "code": "924055",
  "device_ref": "sandbox-3881"
}
```

```json
{
  "session_id": "fdf49d74-ff5c-42ac-b7b3-cfa3ecfdf50c",
  "subject": {
    "type": "CLIENT",
    "id": "b288141d-88a8-4ab3-b9d9-39d32ec6b637"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMjg4MTQxZC04OGE4LTRhYjMtYjlkOS0zOWQzMmVjNmI2MzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MTUxLCJpYXQiOjE3OTMzNDcyNTEsImp0aSI6IjQxMTRkZDk1LWQyNGUtNDhhNi1iNzcwLThlY2M1MzhiYmZmMCIsInNpZCI6ImZkZjQ5ZDc0LWZmNWMtNDJhYy1iN2IzLWNmYTNlY2ZkZjUwYyJ9.EldZqvl6L_EEBAu5NDbwSpaEukkwrhBM44p6CGiDidw",
  "access_expires_at": "2026-10-30T08:15:51.364056237Z",
  "refresh_token": "sokLXMkhD6QcLPE9vyqgjHL-DBAnxQHaNdmiDN8Lxho",
  "refresh_expires_at": "2026-11-29T08:00:51.363370787Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1fe7bff8-5f6c-4fb5-b554-70f8ca1d9dc8",
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
  "id": "4fffa0dc-245f-41e9-bd55-54ab12ea4f24",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:05:51.633488Z",
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
  "command_id": "60d9a802-3f79-4b65-a714-eab9fbaa3ebb",
  "quote_id": "4fffa0dc-245f-41e9-bd55-54ab12ea4f24",
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
  "id": "d46ef90c-23ab-4196-9908-b2085571b502",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b288141d-88a8-4ab3-b9d9-39d32ec6b637",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:00:51.953763Z",
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
    "id": "ecbeca6b-a7e7-44a3-b759-1f6e42b9454c",
    "order_id": "d46ef90c-23ab-4196-9908-b2085571b502",
    "expires_at": "2026-10-30T08:01:06.963063Z",
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

`POST /api/driver/v1/offers/ecbeca6b-a7e7-44a3-b759-1f6e42b9454c/accept` → **200**

```json
{
  "command_id": "eedf61bc-77a7-4399-b698-fd7cdb74fb3c"
}
```

```json
{
  "id": "d23696e6-1aa4-421a-bb96-ca893254dde2",
  "order_id": "d46ef90c-23ab-4196-9908-b2085571b502",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "11f424e4-b369-4c12-a883-0ceeea21ef7f",
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
  "command_id": "6c9edf31-7f7d-4a67-b352-750005e77891",
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
  "changed_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T08:00:52.984600142Z"
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
  "id": "11f424e4-b369-4c12-a883-0ceeea21ef7f",
  "order_id": "d46ef90c-23ab-4196-9908-b2085571b502",
  "assignment_id": "d23696e6-1aa4-421a-bb96-ca893254dde2",
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

`POST /api/driver/v1/work-sessions/ae913212-2e34-4b9e-9e5b-f2ae09c24774/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:00:53Z",
    "sequence": 1793347253695
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ae913212-2e34-4b9e-9e5b-f2ae09c24774",
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
  "last_heartbeat_at": "2026-10-30T08:00:53.718236Z",
  "last_location_at": "2026-10-30T08:00:53.718236Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/11f424e4-b369-4c12-a883-0ceeea21ef7f/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "95b8c1a8-2148-4689-bad1-5511fd367111",
  "expected_version": 0
}
```

```json
{
  "id": "11f424e4-b369-4c12-a883-0ceeea21ef7f",
  "order_id": "d46ef90c-23ab-4196-9908-b2085571b502",
  "assignment_id": "d23696e6-1aa4-421a-bb96-ca893254dde2",
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
  "arrived_at": "2026-10-30T08:00:53.958477Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/11f424e4-b369-4c12-a883-0ceeea21ef7f/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "bf3225d4-b444-4393-891d-d35874bc91d5",
  "expected_version": 1
}
```

```json
{
  "id": "11f424e4-b369-4c12-a883-0ceeea21ef7f",
  "order_id": "d46ef90c-23ab-4196-9908-b2085571b502",
  "assignment_id": "d23696e6-1aa4-421a-bb96-ca893254dde2",
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
  "arrived_at": "2026-10-30T08:00:53.958477Z",
  "started_at": "2026-10-30T08:00:54.205453Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/11f424e4-b369-4c12-a883-0ceeea21ef7f/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "801bf6f7-aa8a-4fa9-ad15-7249b325ea67",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:00:54Z",
  "cash_received": true
}
```

```json
{
  "id": "11f424e4-b369-4c12-a883-0ceeea21ef7f",
  "order_id": "d46ef90c-23ab-4196-9908-b2085571b502",
  "assignment_id": "d23696e6-1aa4-421a-bb96-ca893254dde2",
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
  "arrived_at": "2026-10-30T08:00:53.958477Z",
  "started_at": "2026-10-30T08:00:54.205453Z",
  "completed_at": "2026-10-30T08:00:54.468331Z",
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
  "session_id": "ae913212-2e34-4b9e-9e5b-f2ae09c24774",
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
  "last_heartbeat_at": "2026-10-30T08:00:53.718236Z",
  "last_location_at": "2026-10-30T08:00:53.718236Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ae913212-2e34-4b9e-9e5b-f2ae09c24774/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "90d7373e-81f9-41f2-a8cc-617637cdd7b8",
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
  "command_id": "fd379d51-5dc0-407a-8bf9-d165483fc6da",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:00:55Z",
    "sequence": 1793347255163
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
  "correlation_id": "f9ec356b-2234-4f72-8d70-198900106bb2",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "8dafad17-6bec-497e-b66f-1651226d7f52",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:00:55Z",
    "sequence": 1793347255424
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8c89cedc-3bdf-41b8-ace8-0805a7fc4a2f",
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
  "last_heartbeat_at": "2026-10-30T08:00:55.443722Z",
  "last_location_at": "2026-10-30T08:00:55.443722Z",
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
  "changed_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T08:00:52.9846Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "4da84096-c457-4125-a1fb-a59bb761701e",
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
  "changed_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T08:00:55.915953517Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8c89cedc-3bdf-41b8-ace8-0805a7fc4a2f",
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
  "last_heartbeat_at": "2026-10-30T08:00:55.443722Z",
  "last_location_at": "2026-10-30T08:00:55.443722Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8c89cedc-3bdf-41b8-ace8-0805a7fc4a2f/close` → **200**

```json
{
  "command_id": "d607262b-59a0-433a-a3f3-815cb578c750",
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
  "session_id": "e290d626-f756-457e-9ce9-0b8554b16b0c",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgxNTYsImlhdCI6MTc5MzM0NzI1NiwianRpIjoiN2JhZjQ0YmMtODYwMi00ZmM5LWFjYmYtZDk4MzAzODJmZmQ1Iiwic2lkIjoiZTI5MGQ2MjYtZjc1Ni00NTdlLTljZTktMGI4NTU0YjE2YjBjIn0.60-LDm7eOec9wI6HDkq9l0Xey1snlw-HabpZK_t0rv0",
  "access_expires_at": "2026-10-30T08:15:56.882443312Z",
  "refresh_token": "owSnQiGO6f9tVnRqUs5kOxteljNN03awwTb_67GdQh8",
  "refresh_expires_at": "2026-10-30T20:00:56.881650685Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "0414274b-ffca-4a19-ab7f-01cd0b6848f8",
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
  "id": "ac5cba15-00d6-4289-8f56-41718a554289",
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
  "created_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "created_at": "2026-10-30T08:00:57.124003Z",
  "updated_at": "2026-10-30T08:00:57.124003Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632872336",
  "device_ref": "sandbox-3058"
}
```

```json
{
  "challenge_id": "fa3fd313-8e5b-494d-aed5-85bce72ace51",
  "expires_at": "2026-10-30T08:05:57.359316253Z",
  "resend_available_at": "2026-10-30T08:00:58.359316253Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632872336` → **200**

```json
{
  "phone": "+380632872336",
  "audience": "CLIENT",
  "code": "865444",
  "sent_at": "2026-10-30T08:00:57.362791269Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fa3fd313-8e5b-494d-aed5-85bce72ace51",
  "code": "865444",
  "device_ref": "sandbox-3058"
}
```

```json
{
  "session_id": "a81594ed-2318-4f89-ae3c-26b429e71841",
  "subject": {
    "type": "CLIENT",
    "id": "2582b9bb-9bc2-4e62-91c6-7a62bd1c0e16"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNTgyYjliYi05YmMyLTRlNjItOTFjNi03YTYyYmQxYzBlMTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MTU3LCJpYXQiOjE3OTMzNDcyNTcsImp0aSI6IjkwODVmMGI5LTNiM2MtNGExNi1iNGVjLWVlMTczZTkzMDkzMiIsInNpZCI6ImE4MTU5NGVkLTIzMTgtNGY4OS1hZTNjLTI2YjQyOWU3MTg0MSJ9.AS2WhjO_ZbYWwyrlF_RjpYCo_L17V_PhwxLVMEMymIg",
  "access_expires_at": "2026-10-30T08:15:57.620674951Z",
  "refresh_token": "8BUHriln4nkWoQrxxLDbMPmQDkZHeDShyLcmpGkvjWA",
  "refresh_expires_at": "2026-11-29T08:00:57.620013801Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380632872336` → **200**

```json
{
  "client_id": "2582b9bb-9bc2-4e62-91c6-7a62bd1c0e16"
}
```

`POST /api/admin/v1/rider-wallets/2582b9bb-9bc2-4e62-91c6-7a62bd1c0e16/top-ups` → **201**

```json
{
  "command_id": "e5b75323-05b0-47a1-9deb-87e43100ae1b",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "2582b9bb-9bc2-4e62-91c6-7a62bd1c0e16",
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
      "id": "ddfa3d56-3fc6-4ddb-aec0-0d175041001c",
      "at": "2026-10-30T08:00:58.074507Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "db8502d0-b190-4276-94c9-6cc44299e7b3",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0999b0e3-c359-4a78-8f52-82672edaeb55",
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
  "id": "e33cc0ba-ad07-4fca-a746-65ea0c947691",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:05:58.315500Z",
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
      "id": "ac5cba15-00d6-4289-8f56-41718a554289",
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
  "device_ref": "sandbox-2430"
}
```

```json
{
  "challenge_id": "df6eae47-e1f5-4c2d-8040-415730d67151",
  "expires_at": "2026-10-30T08:05:58.569851729Z",
  "resend_available_at": "2026-10-30T08:00:59.569851729Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "412050",
  "sent_at": "2026-10-30T08:00:58.573310531Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "df6eae47-e1f5-4c2d-8040-415730d67151",
  "code": "412050",
  "device_ref": "sandbox-2430"
}
```

```json
{
  "session_id": "ab86472f-d27f-4185-bd5e-6a43ba45b6cf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODE1OCwiaWF0IjoxNzkzMzQ3MjU4LCJqdGkiOiI5MDI5ZTk0MC1kMDIxLTQ1NDEtODliZS1hMGQxZjQ0ZTMzOTYiLCJzaWQiOiJhYjg2NDcyZi1kMjdmLTQxODUtYmQ1ZS02YTQzYmE0NWI2Y2YifQ.qY5fzvzcPmiB5bg3gjEAf4WPMR7i5MwAdiHtw9gNEDQ",
  "access_expires_at": "2026-10-30T08:15:58.877485316Z",
  "refresh_token": "6VQeHBmsOLEwdzrja5P2mCPKtLvnqGH0jenzcpnyhQs",
  "refresh_expires_at": "2026-11-29T08:00:58.876924865Z",
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
  "command_id": "38362641-e58b-4813-a627-e494ec8a33d4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:00:59Z",
    "sequence": 1793347259343
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6860d4d9-8d12-4fc6-9479-528b586a9689",
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
  "last_heartbeat_at": "2026-10-30T08:00:59.362491Z",
  "last_location_at": "2026-10-30T08:00:59.362491Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "6fdfc33e-32a1-475a-bc93-4a1e3b42ae65",
  "quote_id": "e33cc0ba-ad07-4fca-a746-65ea0c947691",
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
  "id": "e3b91a1b-3aef-4d82-8342-441716261011",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2582b9bb-9bc2-4e62-91c6-7a62bd1c0e16",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:00:59.606159Z",
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
  "client_id": "2582b9bb-9bc2-4e62-91c6-7a62bd1c0e16",
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
      "id": "ddfa3d56-3fc6-4ddb-aec0-0d175041001c",
      "at": "2026-10-30T08:00:58.074507Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "db8502d0-b190-4276-94c9-6cc44299e7b3",
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
    "id": "1f11d139-a98e-45eb-8076-8b57d6275a9e",
    "order_id": "e3b91a1b-3aef-4d82-8342-441716261011",
    "expires_at": "2026-10-30T08:01:14.614369Z",
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

`POST /api/driver/v1/offers/1f11d139-a98e-45eb-8076-8b57d6275a9e/accept` → **200**

```json
{
  "command_id": "48416afa-7ae8-47ea-9d61-6339b9638eb4"
}
```

```json
{
  "id": "f36d5d54-6936-4fcb-9756-c11166462c93",
  "order_id": "e3b91a1b-3aef-4d82-8342-441716261011",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7bab5981-bad7-44a4-8155-8cdc718638b1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7bab5981-bad7-44a4-8155-8cdc718638b1",
  "order_id": "e3b91a1b-3aef-4d82-8342-441716261011",
  "assignment_id": "f36d5d54-6936-4fcb-9756-c11166462c93",
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

`POST /api/driver/v1/work-sessions/6860d4d9-8d12-4fc6-9479-528b586a9689/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:01:00Z",
    "sequence": 1793347260781
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6860d4d9-8d12-4fc6-9479-528b586a9689",
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
  "last_heartbeat_at": "2026-10-30T08:01:00.803419Z",
  "last_location_at": "2026-10-30T08:01:00.803419Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7bab5981-bad7-44a4-8155-8cdc718638b1/arrive` → **200**

```json
{
  "command_id": "5ca59255-3039-4129-8909-943707f45ab4",
  "expected_version": 0
}
```

```json
{
  "id": "7bab5981-bad7-44a4-8155-8cdc718638b1",
  "order_id": "e3b91a1b-3aef-4d82-8342-441716261011",
  "assignment_id": "f36d5d54-6936-4fcb-9756-c11166462c93",
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
  "arrived_at": "2026-10-30T08:01:01.176187Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7bab5981-bad7-44a4-8155-8cdc718638b1/start` → **200**

```json
{
  "command_id": "a813dd31-13c3-4ce1-8193-42ab2ac66a13",
  "expected_version": 1
}
```

```json
{
  "id": "7bab5981-bad7-44a4-8155-8cdc718638b1",
  "order_id": "e3b91a1b-3aef-4d82-8342-441716261011",
  "assignment_id": "f36d5d54-6936-4fcb-9756-c11166462c93",
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
  "arrived_at": "2026-10-30T08:01:01.176187Z",
  "started_at": "2026-10-30T08:01:01.427687Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/7bab5981-bad7-44a4-8155-8cdc718638b1/complete` → **200**

```json
{
  "command_id": "b4ef3402-0196-4105-bef5-91dcde883103",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:01:01Z",
  "cash_received": true
}
```

```json
{
  "id": "7bab5981-bad7-44a4-8155-8cdc718638b1",
  "order_id": "e3b91a1b-3aef-4d82-8342-441716261011",
  "assignment_id": "f36d5d54-6936-4fcb-9756-c11166462c93",
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
  "arrived_at": "2026-10-30T08:01:01.176187Z",
  "started_at": "2026-10-30T08:01:01.427687Z",
  "completed_at": "2026-10-30T08:01:01.690995Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "2582b9bb-9bc2-4e62-91c6-7a62bd1c0e16",
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
      "id": "c3670220-108d-4c3c-9e80-46dfef45f94f",
      "at": "2026-10-30T08:01:02.458856Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "e3b91a1b-3aef-4d82-8342-441716261011"
    },
    {
      "id": "ddfa3d56-3fc6-4ddb-aec0-0d175041001c",
      "at": "2026-10-30T08:00:58.074507Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "db8502d0-b190-4276-94c9-6cc44299e7b3",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/ac5cba15-00d6-4289-8f56-41718a554289/archive` → **200**

```json
{
  "command_id": "3c49d4d1-a850-4fab-972c-db15823e3db0",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "ac5cba15-00d6-4289-8f56-41718a554289",
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
  "created_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "created_at": "2026-10-30T08:00:57.124003Z",
  "updated_at": "2026-10-30T08:01:05.169324Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6860d4d9-8d12-4fc6-9479-528b586a9689",
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
  "last_heartbeat_at": "2026-10-30T08:01:00.803419Z",
  "last_location_at": "2026-10-30T08:01:00.803419Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6860d4d9-8d12-4fc6-9479-528b586a9689/close` → **200**

```json
{
  "command_id": "abe7924e-177d-4a7b-9966-7f4315610b8b",
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

Done: order e3b91a1b-3aef-4d82-8342-441716261011.

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
  "session_id": "2b1ad4d6-c26a-4dad-b23c-2833ea09cea3",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgxNjYsImlhdCI6MTc5MzM0NzI2NiwianRpIjoiMjk1NTkzMDgtOGI3My00YzdjLWFkYzItMzEyNWY4ZTZiYTYwIiwic2lkIjoiMmIxYWQ0ZDYtYzI2YS00ZGFkLWIyM2MtMjgzM2VhMDljZWEzIn0.CEP-k-cD7_q7C4qnt64c3W9hsP_o70mJgwSSViWCr2I",
  "access_expires_at": "2026-10-30T08:16:06.127206718Z",
  "refresh_token": "xxnsZ5CL2FOm50p8D5gnvAm_FteZk9Qr6sLEdyiIU_E",
  "refresh_expires_at": "2026-10-30T20:01:06.126632982Z",
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
  "command_id": "9f3bb1c5-6726-431c-9200-78cfd8c2749b",
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
  "session_id": "c9af857a-be6e-49a8-bcce-4421f97da0b5",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgxNjcsImlhdCI6MTc5MzM0NzI2NywianRpIjoiZjZjZjVkODMtYmEzYS00ZjlkLTkwYTAtZDJlOTYzMDczZjU2Iiwic2lkIjoiYzlhZjg1N2EtYmU2ZS00OWE4LWJjY2UtNDQyMWY5N2RhMGI1In0.856Yi1YHqK95UPyNKymirKqdYSc7JXbES67QLRIud2I",
  "access_expires_at": "2026-10-30T08:16:07.075297283Z",
  "refresh_token": "6U7yph0rhFMg4-1IlEbXXGHI7Rd_fY04T97V5OuXVdE",
  "refresh_expires_at": "2026-10-30T20:01:07.074734143Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.387816677",
    "linkedid": "1730052700.387816677",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677937125"
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
    "id": "1730052700.387816677",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "69207fc0-e579-4e09-95fe-9da11eba6ad2",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380677937125",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T08:01:07.295347Z",
      "answered_at": null,
      "ended_at": "2026-10-30T08:01:07.317497Z",
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
    "id": "1730052600.146718549",
    "linkedid": "1730052600.146718549",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677937125"
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
      "id": "d102b3de-8fd8-4b2a-b0e6-2df8e0263178",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677937125",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T08:01:07.577461Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/d102b3de-8fd8-4b2a-b0e6-2df8e0263178/answer` → **200**

```json
{
  "command_id": "5bb5fe7a-41f9-4afc-941f-c6f01f6d876c"
}
```

```json
{
  "id": "d102b3de-8fd8-4b2a-b0e6-2df8e0263178",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677937125",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "order_ids": [],
  "started_at": "2026-10-30T08:01:07.577461Z",
  "answered_at": "2026-10-30T08:01:07.831061Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.146718549",
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
    "id": "1730052600.146718549",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "d102b3de-8fd8-4b2a-b0e6-2df8e0263178",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677937125",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
      "order_ids": [],
      "started_at": "2026-10-30T08:01:07.577461Z",
      "answered_at": "2026-10-30T08:01:07.831061Z",
      "ended_at": "2026-10-30T08:01:08.085591Z",
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
      "id": "d102b3de-8fd8-4b2a-b0e6-2df8e0263178",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677937125",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
      "order_ids": [],
      "started_at": "2026-10-30T08:01:07.577461Z",
      "answered_at": "2026-10-30T08:01:07.831061Z",
      "ended_at": "2026-10-30T08:01:08.085591Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T08:01:09.029947Z"
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
      "id": "d102b3de-8fd8-4b2a-b0e6-2df8e0263178",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677937125",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
      "order_ids": [],
      "started_at": "2026-10-30T08:01:07.577461Z",
      "answered_at": "2026-10-30T08:01:07.831061Z",
      "ended_at": "2026-10-30T08:01:08.085591Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T08:01:09.029947Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/d102b3de-8fd8-4b2a-b0e6-2df8e0263178/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/d102b3de-8fd8-4b2a-b0e6-2df8e0263178/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=d102b3de-8fd8-4b2a-b0e6-2df8e0263178` → **200**

```json
{
  "changes": [
    {
      "id": "b797369a-ba7c-493d-be71-1d000f84538e",
      "occurred_at": "2026-10-30T08:01:10.840003Z",
      "actor_type": "STAFF",
      "actor_id": "db8502d0-b190-4276-94c9-6cc44299e7b3",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "d102b3de-8fd8-4b2a-b0e6-2df8e0263178",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"a89135ec-07ba-4c66-bd8c-62316f6053d2\", \"order_ids\": []}",
      "correlation_id": "656c180c-a1ac-40fb-9ebf-4d432a89e76a"
    },
    {
      "id": "0a0ebdae-5acb-4454-9791-94ba894869b4",
      "occurred_at": "2026-10-30T08:01:10.809377Z",
      "actor_type": "STAFF",
      "actor_id": "db8502d0-b190-4276-94c9-6cc44299e7b3",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "d102b3de-8fd8-4b2a-b0e6-2df8e0263178",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"a89135ec-07ba-4c66-bd8c-62316f6053d2\", \"order_ids\": []}",
      "correlation_id": "56646a83-26e2-46f4-8b64-9b740f0336bc"
    }
  ]
}
```

Done: call d102b3de-8fd8-4b2a-b0e6-2df8e0263178 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-27855"
}
```

```json
{
  "challenge_id": "83bc8a5b-85f5-4e67-a741-912816a276e5",
  "expires_at": "2026-10-30T08:06:11.107394487Z",
  "resend_available_at": "2026-10-30T08:01:12.107394487Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "356921",
  "sent_at": "2026-10-30T08:01:11.110753573Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "83bc8a5b-85f5-4e67-a741-912816a276e5",
  "code": "356921",
  "device_ref": "sandbox-27855"
}
```

```json
{
  "session_id": "a92d1ec0-f8a5-4ad2-a977-f69a5ea29db2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODE3MSwiaWF0IjoxNzkzMzQ3MjcxLCJqdGkiOiIwYWExNDQ0My05MTI0LTQxZjgtODhlNi0zODc4MmNlZmZlOTYiLCJzaWQiOiJhOTJkMWVjMC1mOGE1LTRhZDItYTk3Ny1mNjlhNWVhMjlkYjIifQ.DXEd1b0i0lloD6t7b5yHHAj3YNRHAwz0yaFgI61Ft-M",
  "access_expires_at": "2026-10-30T08:16:11.359349882Z",
  "refresh_token": "gqvCjLDNzv6v6McBZdcr4LPaRVfYVA_Rg7GwKfuWGd0",
  "refresh_expires_at": "2026-11-29T08:01:11.3587447Z",
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
  "command_id": "85baf64c-6180-48c3-aa52-16383792fc02",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:01:11Z",
    "sequence": 1793347271801
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "06d2a698-bcd4-4af3-b400-bf181bf4630c",
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
  "last_heartbeat_at": "2026-10-30T08:01:11.819141Z",
  "last_location_at": "2026-10-30T08:01:11.819141Z",
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
  "session_id": "f751c846-2463-4424-9af2-6dd8ecfdd701",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgxNzIsImlhdCI6MTc5MzM0NzI3MiwianRpIjoiODY4NDZhZWUtMWUxZi00ZjgzLTkwNmQtY2Q3MmU5YmU3NWMyIiwic2lkIjoiZjc1MWM4NDYtMjQ2My00NDI0LTlhZjItNmRkOGVjZmRkNzAxIn0.m_C5TT2uzOovdRq6lYFe3u0o6vOsgGCWTXjgRU75aAo",
  "access_expires_at": "2026-10-30T08:16:12.311051067Z",
  "refresh_token": "BfAI_KHu0tUdtW_jozx8Xu2tkj3ANaphHwvulRlcLH4",
  "refresh_expires_at": "2026-10-30T20:01:12.310510516Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "098e7d69-f314-429b-94ea-4c858c65e0dd",
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
  "id": "f7300e14-a06d-47f7-be35-d6466120d475",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:06:12.540241Z",
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
  "command_id": "4c412a07-3cf8-4299-bc13-b16d6cc7e6b6",
  "quote_id": "f7300e14-a06d-47f7-be35-d6466120d475",
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
    "phone": "+380678494114"
  }
}
```

```json
{
  "id": "a34ff315-6b44-4b74-95bd-236632b36d2a",
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
  "created_at": "2026-10-30T08:01:12.789932Z",
  "caller": {
    "name": "Олена",
    "phone": "+380678494114"
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
    "id": "0ca524b3-f3f7-4a48-bcdc-e88b16114a47",
    "order_id": "a34ff315-6b44-4b74-95bd-236632b36d2a",
    "expires_at": "2026-10-30T08:01:27.794452Z",
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

`POST /api/driver/v1/offers/0ca524b3-f3f7-4a48-bcdc-e88b16114a47/accept` → **200**

```json
{
  "command_id": "7b176499-a255-48ce-902f-40472e7b3698"
}
```

```json
{
  "id": "6221d4c0-cc25-4fbc-b481-5a3be1c3e6b3",
  "order_id": "a34ff315-6b44-4b74-95bd-236632b36d2a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "851869e3-cb42-416e-bb67-21e85a42b2a4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380678494114` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380678494114` → **200**

```json
[
  {
    "phone": "+380678494114",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:01:14.259403261Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678494114` → **200**

```json
[
  {
    "phone": "+380678494114",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:01:14.259403261Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678494114` → **200**

```json
[
  {
    "phone": "+380678494114",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:01:14.259403261Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "851869e3-cb42-416e-bb67-21e85a42b2a4",
  "order_id": "a34ff315-6b44-4b74-95bd-236632b36d2a",
  "assignment_id": "6221d4c0-cc25-4fbc-b481-5a3be1c3e6b3",
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
    "phone": "+380678494114"
  }
}
```

`POST /api/driver/v1/work-sessions/06d2a698-bcd4-4af3-b400-bf181bf4630c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:01:14Z",
    "sequence": 1793347274930
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "06d2a698-bcd4-4af3-b400-bf181bf4630c",
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
  "last_heartbeat_at": "2026-10-30T08:01:14.947776Z",
  "last_location_at": "2026-10-30T08:01:14.947776Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/851869e3-cb42-416e-bb67-21e85a42b2a4/arrive` → **200**

```json
{
  "command_id": "72186b91-13c8-4d0f-a832-fdbfd82b165f",
  "expected_version": 0
}
```

```json
{
  "id": "851869e3-cb42-416e-bb67-21e85a42b2a4",
  "order_id": "a34ff315-6b44-4b74-95bd-236632b36d2a",
  "assignment_id": "6221d4c0-cc25-4fbc-b481-5a3be1c3e6b3",
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
  "arrived_at": "2026-10-30T08:01:15.18737Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678494114"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380678494114` → **200**

```json
[
  {
    "phone": "+380678494114",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:01:14.259403261Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678494114` → **200**

```json
[
  {
    "phone": "+380678494114",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:01:14.259403261Z"
  },
  {
    "phone": "+380678494114",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T08:01:16.268773793Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678494114` → **200**

```json
[
  {
    "phone": "+380678494114",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:01:14.259403261Z"
  },
  {
    "phone": "+380678494114",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T08:01:16.268773793Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678494114` → **200**

```json
[
  {
    "phone": "+380678494114",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:01:14.259403261Z"
  },
  {
    "phone": "+380678494114",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T08:01:16.268773793Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/851869e3-cb42-416e-bb67-21e85a42b2a4/start` → **200**

```json
{
  "command_id": "8977d836-cca2-4cc6-b045-a617b3ed8ffb",
  "expected_version": 1
}
```

```json
{
  "id": "851869e3-cb42-416e-bb67-21e85a42b2a4",
  "order_id": "a34ff315-6b44-4b74-95bd-236632b36d2a",
  "assignment_id": "6221d4c0-cc25-4fbc-b481-5a3be1c3e6b3",
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
  "arrived_at": "2026-10-30T08:01:15.18737Z",
  "started_at": "2026-10-30T08:01:16.512014Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678494114"
  }
}
```

`POST /api/driver/v1/trips/851869e3-cb42-416e-bb67-21e85a42b2a4/complete` → **200**

```json
{
  "command_id": "1c68badd-0e16-4d6a-941a-d4db5b4cd20c",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:01:16Z",
  "cash_received": true
}
```

```json
{
  "id": "851869e3-cb42-416e-bb67-21e85a42b2a4",
  "order_id": "a34ff315-6b44-4b74-95bd-236632b36d2a",
  "assignment_id": "6221d4c0-cc25-4fbc-b481-5a3be1c3e6b3",
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
  "arrived_at": "2026-10-30T08:01:15.18737Z",
  "started_at": "2026-10-30T08:01:16.512014Z",
  "completed_at": "2026-10-30T08:01:16.755717Z",
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
  "session_id": "06d2a698-bcd4-4af3-b400-bf181bf4630c",
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
  "last_heartbeat_at": "2026-10-30T08:01:14.947776Z",
  "last_location_at": "2026-10-30T08:01:14.947776Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/06d2a698-bcd4-4af3-b400-bf181bf4630c/close` → **200**

```json
{
  "command_id": "6a521063-f6bc-4ba6-9ca4-059ef78b13d9",
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
  "phone": "+380637235272",
  "device_ref": "sandbox-16503"
}
```

```json
{
  "challenge_id": "0e88bc73-e6fc-411d-a721-c571b935788f",
  "expires_at": "2026-10-30T08:06:17.453502536Z",
  "resend_available_at": "2026-10-30T08:01:18.453502536Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637235272` → **200**

```json
{
  "phone": "+380637235272",
  "audience": "CLIENT",
  "code": "163997",
  "sent_at": "2026-10-30T08:01:17.457128028Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0e88bc73-e6fc-411d-a721-c571b935788f",
  "code": "163997",
  "device_ref": "sandbox-16503"
}
```

```json
{
  "session_id": "84baa41c-5f4a-4735-bbc9-33adfa74de17",
  "subject": {
    "type": "CLIENT",
    "id": "e2280c06-7f0d-414f-b08f-dbabd4f78f87"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMjI4MGMwNi03ZjBkLTQxNGYtYjA4Zi1kYmFiZDRmNzhmODciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MTc3LCJpYXQiOjE3OTMzNDcyNzcsImp0aSI6IjkxZThmOTI2LThlZjQtNGNlYy05M2M3LWQ3NjFkMTMyMzc1MyIsInNpZCI6Ijg0YmFhNDFjLTVmNGEtNDczNS1iYmM5LTMzYWRmYTc0ZGUxNyJ9.LZIg_hpRTP-uVv70eGQCPQbOGXsKAIfsiR-hy3r6IP4",
  "access_expires_at": "2026-10-30T08:16:17.720681574Z",
  "refresh_token": "ji-E9Z2SDDUWEFf3-lLEZJj6grLqwoWKxRyFQ_KaSV8",
  "refresh_expires_at": "2026-11-29T08:01:17.720136126Z",
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
  "device_ref": "sandbox-30867"
}
```

```json
{
  "challenge_id": "788c4905-6147-4966-a8f0-6005a3abfbda",
  "expires_at": "2026-10-30T08:06:18.169260897Z",
  "resend_available_at": "2026-10-30T08:01:19.169260897Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "742270",
  "sent_at": "2026-10-30T08:01:18.219231808Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "788c4905-6147-4966-a8f0-6005a3abfbda",
  "code": "742270",
  "device_ref": "sandbox-30867"
}
```

```json
{
  "session_id": "770466ca-c751-4720-b7e0-1be3813f53e1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODE3OCwiaWF0IjoxNzkzMzQ3Mjc4LCJqdGkiOiI5ZjUxMWI5NS04NzQzLTRiZDYtYWJkZi1hNmVlYWFkNzNlMDciLCJzaWQiOiI3NzA0NjZjYS1jNzUxLTQ3MjAtYjdlMC0xYmUzODEzZjUzZTEifQ.bvO8FesGJw8dUIVhaO7z6TqR_PSLgnq9mkiOdRBkfoY",
  "access_expires_at": "2026-10-30T08:16:18.542138516Z",
  "refresh_token": "En824cIFszBZgqPJRet-kuo4F1w5Zv523rKx2rvytGs",
  "refresh_expires_at": "2026-11-29T08:01:18.541613743Z",
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
  "session_id": "28b3ab77-a186-40d3-ba3c-0cbaefcf21b0",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgxNzksImlhdCI6MTc5MzM0NzI3OSwianRpIjoiYmUyNTlkYWYtMzRlNS00OGViLWJjYzctMjFhOWE5NWNlMWI5Iiwic2lkIjoiMjhiM2FiNzctYTE4Ni00MGQzLWJhM2MtMGNiYWVmY2YyMWIwIn0.x3Hf4a5OeNQrukGEaro9T3RaDZt4J1jfLKaU9c606Bs",
  "access_expires_at": "2026-10-30T08:16:19.318426879Z",
  "refresh_token": "-vyX7yYxCLuDEFcpugb7KriOnWppk0EeqcU-bRFPFUs",
  "refresh_expires_at": "2026-10-30T20:01:19.317893303Z",
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
  "session_id": "e66121c6-6065-4e2e-aebb-83cbd91fe1f4",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgxNzksImlhdCI6MTc5MzM0NzI3OSwianRpIjoiMTJjMjFkNzYtNWEyMS00ZTZhLThlYjUtYzdkYTU2YjVjMDY1Iiwic2lkIjoiZTY2MTIxYzYtNjA2NS00ZTJlLWFlYmItODNjYmQ5MWZlMWY0In0.D2zM6etooQz2so-Wbd0kPejxHkb-LCuR_XKFkqP-s14",
  "access_expires_at": "2026-10-30T08:16:19.804356972Z",
  "refresh_token": "L2aCOaBWrA5MoKYuVYYwbPW0Vw67SkdX4m-qArjkbaA",
  "refresh_expires_at": "2026-10-30T20:01:19.803799661Z",
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
  "command_id": "3017a461-2558-47cb-a5ba-b499872782e1",
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
  "id": "f03ebbb1-69ee-438c-8eb1-285618646171",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:06:20.335914Z",
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
  "command_id": "155d4566-61d9-4e6a-897c-4e43e8a6e960",
  "quote_id": "f03ebbb1-69ee-438c-8eb1-285618646171",
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
  "id": "228138e7-0483-4513-bb2c-87f14dea754a",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e2280c06-7f0d-414f-b08f-dbabd4f78f87",
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
  "created_at": "2026-10-30T08:01:20.577304Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/228138e7-0483-4513-bb2c-87f14dea754a` → **200**

```json
{
  "id": "228138e7-0483-4513-bb2c-87f14dea754a",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e2280c06-7f0d-414f-b08f-dbabd4f78f87",
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
  "created_at": "2026-10-30T08:01:20.577304Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/228138e7-0483-4513-bb2c-87f14dea754a/cancel` → **200**

```json
{
  "command_id": "993ffab7-2c09-4ceb-9dc6-7e360bd57420",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "228138e7-0483-4513-bb2c-87f14dea754a",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e2280c06-7f0d-414f-b08f-dbabd4f78f87",
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
  "created_at": "2026-10-30T08:01:20.577304Z",
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
  "command_id": "540aabd3-a305-4ed4-ac2a-31b373a701ae",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:01:21Z",
    "sequence": 1793347281521
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c6e21b4e-5aaf-4e5e-9a80-c30430cdf9db",
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
  "last_heartbeat_at": "2026-10-30T08:01:21.539537Z",
  "last_location_at": "2026-10-30T08:01:21.539537Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-24923"
}
```

```json
{
  "challenge_id": "bf45a814-d7ba-41ed-b86f-845a34a745c3",
  "expires_at": "2026-10-30T08:06:21.769344815Z",
  "resend_available_at": "2026-10-30T08:01:22.769344815Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "970664",
  "sent_at": "2026-10-30T08:01:21.771954454Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bf45a814-d7ba-41ed-b86f-845a34a745c3",
  "code": "970664",
  "device_ref": "sandbox-24923"
}
```

```json
{
  "session_id": "ad9dd12a-3433-4f70-bc0e-789c691e328e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODE4MiwiaWF0IjoxNzkzMzQ3MjgyLCJqdGkiOiJkYzI2NmZkMi05MzM4LTRmNGUtYjU1Yi1kMGUzMGM1MjMxYzUiLCJzaWQiOiJhZDlkZDEyYS0zNDMzLTRmNzAtYmMwZS03ODljNjkxZTMyOGUifQ.p3zUBVRHVmmamta9lSKUbAmn5NhbfDA_0-uj-ZpKOgU",
  "access_expires_at": "2026-10-30T08:16:22.023553198Z",
  "refresh_token": "Mc3DtoQh6akfFQNOK3MMnViJ3fYx221so0ugH9B2Fuw",
  "refresh_expires_at": "2026-11-29T08:01:22.023072009Z",
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
  "command_id": "18772ba0-6b2e-4292-b0c8-9fa5cd216e2c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:01:22Z",
    "sequence": 1793347282478
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "093c2b9c-604b-4261-8e10-82ebd299cd54",
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
  "last_heartbeat_at": "2026-10-30T08:01:22.496486Z",
  "last_location_at": "2026-10-30T08:01:22.496486Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e30e770a-47b2-4ec3-93c6-21f33e464eb7",
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
  "id": "cd392d6f-883a-447e-8b32-5bcc913cb956",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:06:22.730978Z",
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
  "command_id": "13ce0c39-4ebd-402d-a016-3576fda14c9b",
  "quote_id": "cd392d6f-883a-447e-8b32-5bcc913cb956",
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
  "id": "4b6639b9-b977-4a18-8b85-16e221f6d68d",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e2280c06-7f0d-414f-b08f-dbabd4f78f87",
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
  "created_at": "2026-10-30T08:01:22.964835Z",
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
    "id": "8d63ce69-3713-405b-b583-7605ea206483",
    "order_id": "4b6639b9-b977-4a18-8b85-16e221f6d68d",
    "expires_at": "2026-10-30T08:01:37.968174Z",
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

`POST /api/driver/v1/offers/8d63ce69-3713-405b-b583-7605ea206483/accept` → **200**

```json
{
  "command_id": "82b60c3d-0723-4d4a-a8f6-d4565f8967cf"
}
```

```json
{
  "id": "4c1c4cb2-af75-4333-883a-47b8bde6b845",
  "order_id": "4b6639b9-b977-4a18-8b85-16e221f6d68d",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2426d3cc-00ff-4578-97dc-c747b849fbb5",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2426d3cc-00ff-4578-97dc-c747b849fbb5",
  "order_id": "4b6639b9-b977-4a18-8b85-16e221f6d68d",
  "assignment_id": "4c1c4cb2-af75-4333-883a-47b8bde6b845",
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

`POST /api/driver/v1/trips/2426d3cc-00ff-4578-97dc-c747b849fbb5/cancel` → **200**

```json
{
  "command_id": "e1eac1db-d3ce-4113-81c5-bd3dd4aff8a5",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "2426d3cc-00ff-4578-97dc-c747b849fbb5",
  "order_id": "4b6639b9-b977-4a18-8b85-16e221f6d68d",
  "assignment_id": "4c1c4cb2-af75-4333-883a-47b8bde6b845",
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

`GET /api/rider/v1/orders/4b6639b9-b977-4a18-8b85-16e221f6d68d` → **200**

```json
{
  "id": "4b6639b9-b977-4a18-8b85-16e221f6d68d",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "e2280c06-7f0d-414f-b08f-dbabd4f78f87",
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
    "id": "4c1c4cb2-af75-4333-883a-47b8bde6b845",
    "order_id": "4b6639b9-b977-4a18-8b85-16e221f6d68d",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "2426d3cc-00ff-4578-97dc-c747b849fbb5",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T08:01:22.964835Z",
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
    "id": "b8b224a9-bfd8-4af8-beef-33f6ae58586d",
    "order_id": "4b6639b9-b977-4a18-8b85-16e221f6d68d",
    "expires_at": "2026-10-30T08:01:38.93253Z",
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

`POST /api/driver/v1/offers/b8b224a9-bfd8-4af8-beef-33f6ae58586d/accept` → **200**

```json
{
  "command_id": "ad3d8774-869b-4cdd-abe2-4ee02bc00239"
}
```

```json
{
  "id": "f2c1f86b-610d-4905-bad2-22907cc03ce2",
  "order_id": "4b6639b9-b977-4a18-8b85-16e221f6d68d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "858629bb-26d0-42eb-8dd8-49bbe688d038",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "858629bb-26d0-42eb-8dd8-49bbe688d038",
  "order_id": "4b6639b9-b977-4a18-8b85-16e221f6d68d",
  "assignment_id": "f2c1f86b-610d-4905-bad2-22907cc03ce2",
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

`POST /api/driver/v1/trips/858629bb-26d0-42eb-8dd8-49bbe688d038/cancel` → **200**

```json
{
  "command_id": "499a4204-ca1f-4804-96dc-7bd343f02586",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "858629bb-26d0-42eb-8dd8-49bbe688d038",
  "order_id": "4b6639b9-b977-4a18-8b85-16e221f6d68d",
  "assignment_id": "f2c1f86b-610d-4905-bad2-22907cc03ce2",
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
    "id": "4b6639b9-b977-4a18-8b85-16e221f6d68d",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T08:01:22.964835Z",
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
    "id": "228138e7-0483-4513-bb2c-87f14dea754a",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-30T08:01:20.577304Z",
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

`GET /api/operator/v1/orders/4b6639b9-b977-4a18-8b85-16e221f6d68d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:01:22.965441Z",
      "actor": {
        "type": "CLIENT",
        "id": "e2280c06-7f0d-414f-b08f-dbabd4f78f87",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4b6639b9-b977-4a18-8b85-16e221f6d68d",
        "quote_id": "cd392d6f-883a-447e-8b32-5bcc913cb956",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "7a446e1f-389b-4d0c-aaad-0dfcd2182b60"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:01:22.967404Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4b6639b9-b977-4a18-8b85-16e221f6d68d",
        "attempt_id": "42a7bb99-2725-4211-8b88-998625ece9ae",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "7a446e1f-389b-4d0c-aaad-0dfcd2182b60"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T08:01:22.973269Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "8d63ce69-3713-405b-b583-7605ea206483",
        "order_id": "4b6639b9-b977-4a18-8b85-16e221f6d68d",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "7a446e1f-389b-4d0c-aaad-0dfcd2182b60"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T08:01:23.437151Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "8d63ce69-3713-405b-b583-7605ea206483",
        "order_id": "4b6639b9-b977-4a18-8b85-16e221f6d68d",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "4c1c4cb2-af75-4333-883a-47b8bde6b845"
      },
      "correlation_id": "48cb7269-23ce-453f-955e-ab4d3016bbb0"
```

Done: orders 228138e7-0483-4513-bb2c-87f14dea754a, 4b6639b9-b977-4a18-8b85-16e221f6d68d.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734790413",
  "device_ref": "sandbox-2178"
}
```

```json
{
  "challenge_id": "1bba533e-3666-4ae5-a2cd-b8b1a0e4b323",
  "expires_at": "2026-10-30T08:06:25.860686966Z",
  "resend_available_at": "2026-10-30T08:01:26.860686966Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734790413` → **200**

```json
{
  "phone": "+380734790413",
  "audience": "CLIENT",
  "code": "673924",
  "sent_at": "2026-10-30T08:01:25.863684567Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1bba533e-3666-4ae5-a2cd-b8b1a0e4b323",
  "code": "673924",
  "device_ref": "sandbox-2178"
}
```

```json
{
  "session_id": "b8e7c7b1-2f66-4a67-9dab-9771b02abb06",
  "subject": {
    "type": "CLIENT",
    "id": "eb31b225-c6f9-4b90-a794-7dc50b6b2029"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYjMxYjIyNS1jNmY5LTRiOTAtYTc5NC03ZGM1MGI2YjIwMjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MTg2LCJpYXQiOjE3OTMzNDcyODYsImp0aSI6IjVhYWYyYzVlLTc2ZmYtNDlhMi1iOTdkLTU3YTEwZjUzZDhhNiIsInNpZCI6ImI4ZTdjN2IxLTJmNjYtNGE2Ny05ZGFiLTk3NzFiMDJhYmIwNiJ9.4hNI0lS0uqTcoEn3bYMG4czG2ohAkJLB3G-H84cVCME",
  "access_expires_at": "2026-10-30T08:16:26.113930218Z",
  "refresh_token": "iAFMv1xXDgVywkMtNuCdJxbzkeVkv1X5hsrXDLKDT-I",
  "refresh_expires_at": "2026-11-29T08:01:26.113491462Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "245a5e48-4e17-4bfd-a0ec-9292b8122bba",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "49100ff3-601d-40cf-a966-8753cd0124c4",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-49100ff3-601d-40cf-a966-8753cd0124c4",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "38207c942eef917964f392114920d9b7",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=49100ff3-601d-40cf-a966-8753cd0124c4",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734790413"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=49100ff3-601d-40cf-a966-8753cd0124c4",
  "expires_at": "2026-10-30T08:31:26.344021Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/49100ff3-601d-40cf-a966-8753cd0124c4` → **200**

```json
{
  "id": "49100ff3-601d-40cf-a966-8753cd0124c4",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T08:31:26.344021Z",
  "card": {
    "id": "6afb06c3-ce36-47c9-b660-4967a446f6aa",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3824",
    "card_type": "Visa",
    "created_at": "2026-10-30T08:01:26.58317Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "6afb06c3-ce36-47c9-b660-4967a446f6aa",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****3824",
      "card_type": "Visa",
      "created_at": "2026-10-30T08:01:26.58317Z"
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
  "device_ref": "sandbox-12147"
}
```

```json
{
  "challenge_id": "0b97052f-24a5-41ae-8c13-a110506802aa",
  "expires_at": "2026-10-30T08:06:27.062790668Z",
  "resend_available_at": "2026-10-30T08:01:28.062790668Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "606252",
  "sent_at": "2026-10-30T08:01:27.065688938Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0b97052f-24a5-41ae-8c13-a110506802aa",
  "code": "606252",
  "device_ref": "sandbox-12147"
}
```

```json
{
  "session_id": "06d26bc0-a20c-4f25-8934-fd6fda05cbac",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODE4NywiaWF0IjoxNzkzMzQ3Mjg3LCJqdGkiOiIwZDNmNjEyNi04MGQ2LTQzNTMtOGVjMi0yNGYxODk4ZjFiMjQiLCJzaWQiOiIwNmQyNmJjMC1hMjBjLTRmMjUtODkzNC1mZDZmZGEwNWNiYWMifQ.Ld8ft2GSvHoAyYoMfMsJL3uo2lg6NkF5wYyIgxmO1zY",
  "access_expires_at": "2026-10-30T08:16:27.342860145Z",
  "refresh_token": "eqUxDydwkhW7Je9m9WXEFw_aalFcoCbpTj9meLr46hA",
  "refresh_expires_at": "2026-11-29T08:01:27.3415129Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "093c2b9c-604b-4261-8e10-82ebd299cd54",
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
  "last_heartbeat_at": "2026-10-30T08:01:22.496486Z",
  "last_location_at": "2026-10-30T08:01:22.496486Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/093c2b9c-604b-4261-8e10-82ebd299cd54/handover` → **200**

```json
{
  "command_id": "358f1085-14ea-4fd9-8e4a-90c6814942c0",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "093c2b9c-604b-4261-8e10-82ebd299cd54",
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
  "last_heartbeat_at": "2026-10-30T08:01:22.496486Z",
  "last_location_at": "2026-10-30T08:01:22.496486Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/093c2b9c-604b-4261-8e10-82ebd299cd54/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:01:28Z",
    "sequence": 1793347288363
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "093c2b9c-604b-4261-8e10-82ebd299cd54",
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
  "last_heartbeat_at": "2026-10-30T08:01:28.053385Z",
  "last_location_at": "2026-10-30T08:01:28.053385Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e2d72873-67c4-4d51-b0b0-fbf6389d1ba6",
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
  "id": "1cceaa3b-c037-48ab-be54-eb243c089ede",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:06:28.287232Z",
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
  "command_id": "72a48488-a42b-4c3d-b0c7-092f487cff72",
  "quote_id": "1cceaa3b-c037-48ab-be54-eb243c089ede",
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
  "id": "3d621719-c307-4f03-afd2-ac08bf5ee375",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "eb31b225-c6f9-4b90-a794-7dc50b6b2029",
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
  "created_at": "2026-10-30T08:01:28.530479Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d621719-c307-4f03-afd2-ac08bf5ee375` → **200**

```json
{
  "id": "3d621719-c307-4f03-afd2-ac08bf5ee375",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "eb31b225-c6f9-4b90-a794-7dc50b6b2029",
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
  "created_at": "2026-10-30T08:01:28.530479Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d621719-c307-4f03-afd2-ac08bf5ee375` → **200**

```json
{
  "id": "3d621719-c307-4f03-afd2-ac08bf5ee375",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "eb31b225-c6f9-4b90-a794-7dc50b6b2029",
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
  "created_at": "2026-10-30T08:01:28.530479Z",
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
    "id": "a50ef8f6-57a2-4f97-b30e-840635d995c3",
    "order_id": "3d621719-c307-4f03-afd2-ac08bf5ee375",
    "expires_at": "2026-10-30T08:01:43.839743Z",
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

`POST /api/driver/v1/offers/a50ef8f6-57a2-4f97-b30e-840635d995c3/accept` → **200**

```json
{
  "command_id": "29026150-1602-4db1-b9f5-8f316ca9c571"
}
```

```json
{
  "id": "e8360895-c261-48fb-873b-445755913353",
  "order_id": "3d621719-c307-4f03-afd2-ac08bf5ee375",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "57b85854-90a4-497a-8e7c-ec51fa257133",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "57b85854-90a4-497a-8e7c-ec51fa257133",
  "order_id": "3d621719-c307-4f03-afd2-ac08bf5ee375",
  "assignment_id": "e8360895-c261-48fb-873b-445755913353",
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

`POST /api/driver/v1/work-sessions/093c2b9c-604b-4261-8e10-82ebd299cd54/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:01:30Z",
    "sequence": 1793347290947
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "093c2b9c-604b-4261-8e10-82ebd299cd54",
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
  "last_heartbeat_at": "2026-10-30T08:01:30.964782Z",
  "last_location_at": "2026-10-30T08:01:30.964782Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/57b85854-90a4-497a-8e7c-ec51fa257133/arrive` → **200**

```json
{
  "command_id": "a8ab6f54-e65e-4a75-89ef-12a9fdc1f556",
  "expected_version": 0
}
```

```json
{
  "id": "57b85854-90a4-497a-8e7c-ec51fa257133",
  "order_id": "3d621719-c307-4f03-afd2-ac08bf5ee375",
  "assignment_id": "e8360895-c261-48fb-873b-445755913353",
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
  "arrived_at": "2026-10-30T08:01:31.194766Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/57b85854-90a4-497a-8e7c-ec51fa257133/start` → **200**

```json
{
  "command_id": "104a550a-70f3-4a9a-a6e6-860896ba71b1",
  "expected_version": 1
}
```

```json
{
  "id": "57b85854-90a4-497a-8e7c-ec51fa257133",
  "order_id": "3d621719-c307-4f03-afd2-ac08bf5ee375",
  "assignment_id": "e8360895-c261-48fb-873b-445755913353",
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
  "arrived_at": "2026-10-30T08:01:31.194766Z",
  "started_at": "2026-10-30T08:01:31.429953Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/57b85854-90a4-497a-8e7c-ec51fa257133/complete` → **200**

```json
{
  "command_id": "731e47c5-9b71-4236-a2fa-d8300637922b",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:01:31Z",
  "cash_received": true
}
```

```json
{
  "id": "57b85854-90a4-497a-8e7c-ec51fa257133",
  "order_id": "3d621719-c307-4f03-afd2-ac08bf5ee375",
  "assignment_id": "e8360895-c261-48fb-873b-445755913353",
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
  "arrived_at": "2026-10-30T08:01:31.194766Z",
  "started_at": "2026-10-30T08:01:31.429953Z",
  "completed_at": "2026-10-30T08:01:31.665008Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/3d621719-c307-4f03-afd2-ac08bf5ee375` → **200**

```json
{
  "id": "3d621719-c307-4f03-afd2-ac08bf5ee375",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "eb31b225-c6f9-4b90-a794-7dc50b6b2029",
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
    "id": "e8360895-c261-48fb-873b-445755913353",
    "order_id": "3d621719-c307-4f03-afd2-ac08bf5ee375",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "57b85854-90a4-497a-8e7c-ec51fa257133",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:01:28.530479Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d621719-c307-4f03-afd2-ac08bf5ee375` → **200**

```json
{
  "id": "3d621719-c307-4f03-afd2-ac08bf5ee375",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "eb31b225-c6f9-4b90-a794-7dc50b6b2029",
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
    "id": "e8360895-c261-48fb-873b-445755913353",
    "order_id": "3d621719-c307-4f03-afd2-ac08bf5ee375",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "57b85854-90a4-497a-8e7c-ec51fa257133",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:01:28.530479Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d621719-c307-4f03-afd2-ac08bf5ee375` → **200**

```json
{
  "id": "3d621719-c307-4f03-afd2-ac08bf5ee375",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "eb31b225-c6f9-4b90-a794-7dc50b6b2029",
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
    "id": "e8360895-c261-48fb-873b-445755913353",
    "order_id": "3d621719-c307-4f03-afd2-ac08bf5ee375",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "57b85854-90a4-497a-8e7c-ec51fa257133",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:01:28.530479Z",
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

`GET /api/rider/v1/orders/3d621719-c307-4f03-afd2-ac08bf5ee375/tip` → **200**

```json
{
  "order_id": "3d621719-c307-4f03-afd2-ac08bf5ee375",
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
  "available_until": "2026-10-31T08:01:31.665008Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/3d621719-c307-4f03-afd2-ac08bf5ee375/tip` → **201**

```json
{
  "command_id": "7cc99bf0-11d4-4704-bfc7-1359ff4624c1",
  "amount_minor": 2500
}
```

```json
{
  "id": "3e3496dc-2114-4b4e-bb34-c11d65487bd6",
  "order_id": "3d621719-c307-4f03-afd2-ac08bf5ee375",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T08:01:35.056248Z"
}
```

`GET /api/rider/v1/orders/3d621719-c307-4f03-afd2-ac08bf5ee375/tip` → **200**

```json
{
  "order_id": "3d621719-c307-4f03-afd2-ac08bf5ee375",
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
  "available_until": "2026-10-31T08:01:31.665008Z",
  "open": false,
  "tip": {
    "id": "3e3496dc-2114-4b4e-bb34-c11d65487bd6",
    "order_id": "3d621719-c307-4f03-afd2-ac08bf5ee375",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T08:01:35.056248Z"
  }
}
```

`GET /api/rider/v1/orders/3d621719-c307-4f03-afd2-ac08bf5ee375/tip` → **200**

```json
{
  "order_id": "3d621719-c307-4f03-afd2-ac08bf5ee375",
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
  "available_until": "2026-10-31T08:01:31.665008Z",
  "open": false,
  "tip": {
    "id": "3e3496dc-2114-4b4e-bb34-c11d65487bd6",
    "order_id": "3d621719-c307-4f03-afd2-ac08bf5ee375",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T08:01:35.056248Z"
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
      "id": "4a7df05b-a34e-445b-9005-069ac015e740",
      "at": "2026-10-30T08:01:31.927913Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3d621719-c307-4f03-afd2-ac08bf5ee375",
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
      "id": "4953298d-f9da-4baf-92da-a0d06ee44aa8",
      "at": "2026-10-30T08:01:37.037192Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3d621719-c307-4f03-afd2-ac08bf5ee375",
      "counterpart_id": null
    },
    {
      "id": "4a7df05b-a34e-445b-9005-069ac015e740",
      "at": "2026-10-30T08:01:31.927913Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3d621719-c307-4f03-afd2-ac08bf5ee375",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "55776923-fffa-42ef-81c9-9a6dd882d310",
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
  "id": "79e71fab-55cb-465b-b5ae-7c51d4f383e6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:06:38.217890Z",
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
  "session_id": "53d4a489-2396-4ea0-9b07-d8b9fc4c5a69",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgxOTgsImlhdCI6MTc5MzM0NzI5OCwianRpIjoiNjU1MDIzZDUtNmUzNS00MjFiLTk2MWYtZGQ1Nzk2OTI2OTcxIiwic2lkIjoiNTNkNGE0ODktMjM5Ni00ZWEwLTliMDctZDhiOWZjNGM1YTY5In0.s6Dxy2fitqR-r0SNASuo2qDU7raHui4VvYMdkw6PakA",
  "access_expires_at": "2026-10-30T08:16:38.717396946Z",
  "refresh_token": "trMRxRKMR2fiN4TA_8yRBltlfs0vMVl0ds76aNHQpw8",
  "refresh_expires_at": "2026-10-30T20:01:38.716888857Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380734790413` → **200**

```json
{
  "client_id": "eb31b225-c6f9-4b90-a794-7dc50b6b2029"
}
```

`POST /api/admin/v1/rider-wallets/eb31b225-c6f9-4b90-a794-7dc50b6b2029/top-ups` → **201**

```json
{
  "command_id": "c8003052-e510-4dd3-9257-62b3128033dd",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "eb31b225-c6f9-4b90-a794-7dc50b6b2029",
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
      "id": "e4c3c4f3-5dc6-4997-9b6a-3cfed8bdfc7a",
      "at": "2026-10-30T08:01:39.182658Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "db8502d0-b190-4276-94c9-6cc44299e7b3",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "2827bad1-2fb2-4fdd-bf39-08c18a8d6d48",
  "quote_id": "79e71fab-55cb-465b-b5ae-7c51d4f383e6",
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
  "id": "f294c00e-3e94-4a30-a2e7-8703fce581d8",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "eb31b225-c6f9-4b90-a794-7dc50b6b2029",
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
  "created_at": "2026-10-30T08:01:39.427276Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f294c00e-3e94-4a30-a2e7-8703fce581d8` → **200**

```json
{
  "id": "f294c00e-3e94-4a30-a2e7-8703fce581d8",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "eb31b225-c6f9-4b90-a794-7dc50b6b2029",
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
  "created_at": "2026-10-30T08:01:39.427276Z",
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
    "id": "1d6826e0-f24b-431b-8810-28ff26e9a101",
    "order_id": "f294c00e-3e94-4a30-a2e7-8703fce581d8",
    "expires_at": "2026-10-30T08:01:54.43103Z",
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

`POST /api/driver/v1/offers/1d6826e0-f24b-431b-8810-28ff26e9a101/accept` → **200**

```json
{
  "command_id": "821d0a6f-1ff8-4d4f-b0bd-940e57312e50"
}
```

```json
{
  "id": "49a860ed-721b-47bf-be75-0be5dc4e9f7d",
  "order_id": "f294c00e-3e94-4a30-a2e7-8703fce581d8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "28f0893a-684d-4da0-98a8-5c12cd7f3a53",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "28f0893a-684d-4da0-98a8-5c12cd7f3a53",
  "order_id": "f294c00e-3e94-4a30-a2e7-8703fce581d8",
  "assignment_id": "49a860ed-721b-47bf-be75-0be5dc4e9f7d",
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

`POST /api/driver/v1/work-sessions/093c2b9c-604b-4261-8e10-82ebd299cd54/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:01:40Z",
    "sequence": 1793347300582
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "093c2b9c-604b-4261-8e10-82ebd299cd54",
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
  "last_heartbeat_at": "2026-10-30T08:01:40.599692Z",
  "last_location_at": "2026-10-30T08:01:40.599692Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/28f0893a-684d-4da0-98a8-5c12cd7f3a53/arrive` → **200**

```json
{
  "command_id": "72ffeeb7-90fb-492d-87b3-ae2f70f74708",
  "expected_version": 0
}
```

```json
{
  "id": "28f0893a-684d-4da0-98a8-5c12cd7f3a53",
  "order_id": "f294c00e-3e94-4a30-a2e7-8703fce581d8",
  "assignment_id": "49a860ed-721b-47bf-be75-0be5dc4e9f7d",
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
  "arrived_at": "2026-10-30T08:01:40.886923Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/28f0893a-684d-4da0-98a8-5c12cd7f3a53/start` → **200**

```json
{
  "command_id": "e62548e4-5748-4edc-a7ce-bf817f7d8e8f",
  "expected_version": 1
}
```

```json
{
  "id": "28f0893a-684d-4da0-98a8-5c12cd7f3a53",
  "order_id": "f294c00e-3e94-4a30-a2e7-8703fce581d8",
  "assignment_id": "49a860ed-721b-47bf-be75-0be5dc4e9f7d",
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
  "arrived_at": "2026-10-30T08:01:40.886923Z",
  "started_at": "2026-10-30T08:01:41.154739Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/28f0893a-684d-4da0-98a8-5c12cd7f3a53/complete` → **200**

```json
{
  "command_id": "e4b4bc28-4c94-4858-8d0c-8ac3baa3ad6c",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:01:41Z",
  "cash_received": true
}
```

```json
{
  "id": "28f0893a-684d-4da0-98a8-5c12cd7f3a53",
  "order_id": "f294c00e-3e94-4a30-a2e7-8703fce581d8",
  "assignment_id": "49a860ed-721b-47bf-be75-0be5dc4e9f7d",
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
  "arrived_at": "2026-10-30T08:01:40.886923Z",
  "started_at": "2026-10-30T08:01:41.154739Z",
  "completed_at": "2026-10-30T08:01:41.396072Z",
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
  "client_id": "eb31b225-c6f9-4b90-a794-7dc50b6b2029",
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
      "id": "e4c3c4f3-5dc6-4997-9b6a-3cfed8bdfc7a",
      "at": "2026-10-30T08:01:39.182658Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "db8502d0-b190-4276-94c9-6cc44299e7b3",
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

`GET /api/rider/v1/orders/f294c00e-3e94-4a30-a2e7-8703fce581d8/tip` → **200**

```json
{
  "order_id": "f294c00e-3e94-4a30-a2e7-8703fce581d8",
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
  "available_until": "2026-10-31T08:01:41.396072Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/f294c00e-3e94-4a30-a2e7-8703fce581d8/tip` → **201**

```json
{
  "command_id": "0877a00f-4a92-42cc-86eb-0bc60147e38c",
  "amount_minor": 2500
}
```

```json
{
  "id": "3bc7afb2-5b2d-476b-b557-208b9c5eb0f9",
  "order_id": "f294c00e-3e94-4a30-a2e7-8703fce581d8",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T08:01:42.315527Z"
}
```

`GET /api/rider/v1/orders/f294c00e-3e94-4a30-a2e7-8703fce581d8/tip` → **200**

```json
{
  "order_id": "f294c00e-3e94-4a30-a2e7-8703fce581d8",
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
  "available_until": "2026-10-31T08:01:41.396072Z",
  "open": false,
  "tip": {
    "id": "3bc7afb2-5b2d-476b-b557-208b9c5eb0f9",
    "order_id": "f294c00e-3e94-4a30-a2e7-8703fce581d8",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T08:01:42.315527Z"
  }
}
```

`GET /api/rider/v1/orders/f294c00e-3e94-4a30-a2e7-8703fce581d8/tip` → **200**

```json
{
  "order_id": "f294c00e-3e94-4a30-a2e7-8703fce581d8",
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
  "available_until": "2026-10-31T08:01:41.396072Z",
  "open": false,
  "tip": {
    "id": "3bc7afb2-5b2d-476b-b557-208b9c5eb0f9",
    "order_id": "f294c00e-3e94-4a30-a2e7-8703fce581d8",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T08:01:42.315527Z"
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
      "id": "0c02a797-d25b-4633-9b5a-5c7eaa70b228",
      "at": "2026-10-30T08:01:42.084279Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f294c00e-3e94-4a30-a2e7-8703fce581d8",
      "counterpart_id": null
    },
    {
      "id": "4953298d-f9da-4baf-92da-a0d06ee44aa8",
      "at": "2026-10-30T08:01:37.037192Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3d621719-c307-4f03-afd2-ac08bf5ee375",
      "counterpart_id": null
    },
    {
      "id": "4a7df05b-a34e-445b-9005-069ac015e740",
      "at": "2026-10-30T08:01:31.927913Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3d621719-c307-4f03-afd2-ac08bf5ee375",
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
      "id": "931ccb0f-02bd-4b50-b140-73d31797af4e",
      "at": "2026-10-30T08:01:44.133157Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f294c00e-3e94-4a30-a2e7-8703fce581d8",
      "counterpart_id": null
    },
    {
      "id": "0c02a797-d25b-4633-9b5a-5c7eaa70b228",
      "at": "2026-10-30T08:01:42.084279Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f294c00e-3e94-4a30-a2e7-8703fce581d8",
      "counterpart_id": null
    },
    {
      "id": "4953298d-f9da-4baf-92da-a0d06ee44aa8",
      "at": "2026-10-30T08:01:37.037192Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3d621719-c307-4f03-afd2-ac08bf5ee375",
      "counterpart_id": null
    },
    {
      "id": "4a7df05b-a34e-445b-9005-069ac015e740",
      "at": "2026-10-30T08:01:31.927913Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3d621719-c307-4f03-afd2-ac08bf5ee375",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "093c2b9c-604b-4261-8e10-82ebd299cd54",
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
  "last_heartbeat_at": "2026-10-30T08:01:40.599692Z",
  "last_location_at": "2026-10-30T08:01:40.599692Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/093c2b9c-604b-4261-8e10-82ebd299cd54/close` → **200**

```json
{
  "command_id": "f5f282c6-ec57-414d-a7d6-ea286b16dd2a",
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

Done: card order f294c00e-3e94-4a30-a2e7-8703fce581d8.

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
  "phone": "+380735780982",
  "device_ref": "sandbox-23876"
}
```

```json
{
  "challenge_id": "32a2a716-142a-449a-8737-4b8ac01fb55e",
  "expires_at": "2026-10-30T08:06:46.124578655Z",
  "resend_available_at": "2026-10-30T08:01:47.124578655Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735780982` → **200**

```json
{
  "phone": "+380735780982",
  "audience": "CLIENT",
  "code": "915932",
  "sent_at": "2026-10-30T08:01:46.126762062Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "32a2a716-142a-449a-8737-4b8ac01fb55e",
  "code": "915932",
  "device_ref": "sandbox-23876"
}
```

```json
{
  "session_id": "913783d2-8059-46c2-9a51-5348aaf27042",
  "subject": {
    "type": "CLIENT",
    "id": "5ab106cd-a786-4f3c-b921-7bc012da84c5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWIxMDZjZC1hNzg2LTRmM2MtYjkyMS03YmMwMTJkYTg0YzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MjA2LCJpYXQiOjE3OTMzNDczMDYsImp0aSI6IjMwZjc2OTI1LTJiYmYtNDEyOC04NWE0LWI4NjliZTY3NmE4ZCIsInNpZCI6IjkxMzc4M2QyLTgwNTktNDZjMi05YTUxLTUzNDhhYWYyNzA0MiJ9.e_iDIu0PvmYCGJJX_SDeglArYk4Qu74yJuSeP8Jq0gg",
  "access_expires_at": "2026-10-30T08:16:46.44047187Z",
  "refresh_token": "ftPjoyHNakiyGAPiCqz1sQ_h0CEYj41BBssxKig3f7I",
  "refresh_expires_at": "2026-11-29T08:01:46.439990204Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "e981c587-43b0-4348-94ab-8c74d3a88e4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "9e992af7-bf8b-4954-bd1e-0555bd86a609",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-9e992af7-bf8b-4954-bd1e-0555bd86a609",
    "orderDate": "1793347306",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "a83579d0bdad41d46e79098689d8beaf",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=9e992af7-bf8b-4954-bd1e-0555bd86a609",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735780982"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=9e992af7-bf8b-4954-bd1e-0555bd86a609",
  "created_at": "2026-10-30T08:01:46.666547Z",
  "expires_at": "2026-10-30T08:31:46.666547Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/9e992af7-bf8b-4954-bd1e-0555bd86a609` → **200**

```json
{
  "id": "9e992af7-bf8b-4954-bd1e-0555bd86a609",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T08:01:46.666547Z",
  "expires_at": "2026-10-30T08:31:46.666547Z",
  "completed_at": "2026-10-30T08:01:46.917256Z",
  "masked_pan": "41****6556",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "5ab106cd-a786-4f3c-b921-7bc012da84c5",
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
      "id": "6eaf0294-4999-451b-b6c4-4e0881a2659f",
      "at": "2026-10-30T08:01:47.148765Z",
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
  "client_id": "5ab106cd-a786-4f3c-b921-7bc012da84c5",
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
      "id": "6eaf0294-4999-451b-b6c4-4e0881a2659f",
      "at": "2026-10-30T08:01:47.148765Z",
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
  "device_ref": "sandbox-4081"
}
```

```json
{
  "challenge_id": "dd630e08-0867-47e2-9035-fd02ebf702bd",
  "expires_at": "2026-10-30T08:06:47.595504736Z",
  "resend_available_at": "2026-10-30T08:01:48.595504736Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "791061",
  "sent_at": "2026-10-30T08:01:47.597769828Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dd630e08-0867-47e2-9035-fd02ebf702bd",
  "code": "791061",
  "device_ref": "sandbox-4081"
}
```

```json
{
  "session_id": "6b2f42c9-bf46-4e1c-a97d-59be8b5c3f99",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODIwNywiaWF0IjoxNzkzMzQ3MzA3LCJqdGkiOiI3MmVlZjYwZC01N2Y0LTQ5MGEtYjlhZi05NjBiMzdmNGRjNTEiLCJzaWQiOiI2YjJmNDJjOS1iZjQ2LTRlMWMtYTk3ZC01OWJlOGI1YzNmOTkifQ.mZ9PxsYkdC2FDKJ4EZ3MfiQ2iacTlgVhlgiBikVbeGE",
  "access_expires_at": "2026-10-30T08:16:47.836672274Z",
  "refresh_token": "ymPBAhzqxYvfOgeEIYEF3Q3yZ7VgOdSITktk6t9cgrk",
  "refresh_expires_at": "2026-11-29T08:01:47.83619712Z",
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
  "command_id": "f0a78181-f0bc-4b72-9f7f-c7919011e752",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "bd966ece-69b5-4b52-af53-c1ce3450ceec",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-bd966ece-69b5-4b52-af53-c1ce3450ceec",
    "orderDate": "1793347308",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "0c2899787072186cce920e8909ffe6ae",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=bd966ece-69b5-4b52-af53-c1ce3450ceec",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=bd966ece-69b5-4b52-af53-c1ce3450ceec",
  "created_at": "2026-10-30T08:01:48.280365Z",
  "expires_at": "2026-10-30T08:31:48.280365Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/bd966ece-69b5-4b52-af53-c1ce3450ceec` → **200**

```json
{
  "id": "bd966ece-69b5-4b52-af53-c1ce3450ceec",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T08:01:48.280365Z",
  "expires_at": "2026-10-30T08:31:48.280365Z",
  "completed_at": "2026-10-30T08:01:48.507651Z",
  "masked_pan": "41****1083",
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
      "id": "dd916b27-96d1-4e72-82bd-b203a7ac10bd",
      "at": "2026-10-30T08:01:49.156139Z",
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
  "command_id": "ac963cf1-5903-4350-b0e0-e2af635fe13a",
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
  "correlation_id": "0e4b71bb-a475-4e26-863d-98cf647ec5b0"
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
  "device_ref": "sandbox-16529"
}
```

```json
{
  "challenge_id": "ad3b313c-1110-433f-9d11-02267a2d2520",
  "expires_at": "2026-10-30T08:06:50.4513381Z",
  "resend_available_at": "2026-10-30T08:01:51.4513381Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "216432",
  "sent_at": "2026-10-30T08:01:50.454642569Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ad3b313c-1110-433f-9d11-02267a2d2520",
  "code": "216432",
  "device_ref": "sandbox-16529"
}
```

```json
{
  "session_id": "19c5f008-60f1-443e-91d5-2a83a42d12be",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODIxMCwiaWF0IjoxNzkzMzQ3MzEwLCJqdGkiOiJlNTM2ZDY2Ny01NmJlLTQ3ODctODNjYS1jN2VhYjhkODU0YTciLCJzaWQiOiIxOWM1ZjAwOC02MGYxLTQ0M2UtOTFkNS0yYTgzYTQyZDEyYmUifQ.h7e-m8qvGfc4mVqMcCFeqs3B5h8CiiO5MWJRjCnBNeg",
  "access_expires_at": "2026-10-30T08:16:50.778866801Z",
  "refresh_token": "exw0oPPfrTSscuiK3YxhMGO-Li803LdPcFhYqw6XCYI",
  "refresh_expires_at": "2026-11-29T08:01:50.778069206Z",
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
  "command_id": "ae0e3d97-b529-496e-ac14-9351990a8aa2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:01:51Z",
    "sequence": 1793347311225
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bc858679-68b5-4376-8111-071de7718d6b",
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
  "last_heartbeat_at": "2026-10-30T08:01:51.242382Z",
  "last_location_at": "2026-10-30T08:01:51.242382Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636579821",
  "device_ref": "sandbox-11281"
}
```

```json
{
  "challenge_id": "59f2a3b0-78ac-4cf6-ae6e-ebd4e0a7ce36",
  "expires_at": "2026-10-30T08:06:51.467688016Z",
  "resend_available_at": "2026-10-30T08:01:52.467688016Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636579821` → **200**

```json
{
  "phone": "+380636579821",
  "audience": "CLIENT",
  "code": "202425",
  "sent_at": "2026-10-30T08:01:51.530515939Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "59f2a3b0-78ac-4cf6-ae6e-ebd4e0a7ce36",
  "code": "202425",
  "device_ref": "sandbox-11281"
}
```

```json
{
  "session_id": "f92dbad7-dfa3-49c6-86c2-288a9eb7ce55",
  "subject": {
    "type": "CLIENT",
    "id": "41cf3107-c88f-4d84-accc-a3e1fc0a59f8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWNmMzEwNy1jODhmLTRkODQtYWNjYy1hM2UxZmMwYTU5ZjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MjExLCJpYXQiOjE3OTMzNDczMTEsImp0aSI6IjNlMWUzYzkyLWEyYTgtNDJiZC1iNzU2LWM0ZWMxNmJjNTViOSIsInNpZCI6ImY5MmRiYWQ3LWRmYTMtNDljNi04NmMyLTI4OGE5ZWI3Y2U1NSJ9.FXuOPLQVBfQdkrzKxqiWtJch1gJJKL1xeoPvii06qoQ",
  "access_expires_at": "2026-10-30T08:16:51.774473647Z",
  "refresh_token": "O0ruYOAJYiGIgculpc7YVQAX0vYi3ZkdWY8ITmWuWjU",
  "refresh_expires_at": "2026-11-29T08:01:51.773983806Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9eec18ab-fd9a-4140-865d-9316c3926d8e",
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
  "id": "43adf4cc-8063-4fb1-8444-87eeb4fcf55a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:06:52.000150Z",
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
  "command_id": "81924484-1532-46c6-badf-5f9ac3d08a65",
  "quote_id": "43adf4cc-8063-4fb1-8444-87eeb4fcf55a",
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
  "id": "3a54d31a-67bf-4c96-8319-6122d280eef8",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "41cf3107-c88f-4d84-accc-a3e1fc0a59f8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:01:52.240922Z",
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
    "id": "b5e58d13-cb53-4d10-998d-baccb30dd28b",
    "order_id": "3a54d31a-67bf-4c96-8319-6122d280eef8",
    "expires_at": "2026-10-30T08:02:07.243653Z",
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

`POST /api/driver/v1/offers/b5e58d13-cb53-4d10-998d-baccb30dd28b/accept` → **200**

```json
{
  "command_id": "06be158c-a073-408c-ab49-1d6acf82a341"
}
```

```json
{
  "id": "d31f55ea-c8ed-47a5-b8f9-c83ec08ff0d3",
  "order_id": "3a54d31a-67bf-4c96-8319-6122d280eef8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "34288792-8916-49a1-89d7-1f28a10259e7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "34288792-8916-49a1-89d7-1f28a10259e7",
  "order_id": "3a54d31a-67bf-4c96-8319-6122d280eef8",
  "assignment_id": "d31f55ea-c8ed-47a5-b8f9-c83ec08ff0d3",
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

`POST /api/driver/v1/work-sessions/bc858679-68b5-4376-8111-071de7718d6b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:01:53Z",
    "sequence": 1793347313126
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bc858679-68b5-4376-8111-071de7718d6b",
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
  "last_heartbeat_at": "2026-10-30T08:01:53.143879Z",
  "last_location_at": "2026-10-30T08:01:53.143879Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/34288792-8916-49a1-89d7-1f28a10259e7/arrive` → **200**

```json
{
  "command_id": "4d307b44-3f7a-4cd8-9de2-9e329c6aec43",
  "expected_version": 0
}
```

```json
{
  "id": "34288792-8916-49a1-89d7-1f28a10259e7",
  "order_id": "3a54d31a-67bf-4c96-8319-6122d280eef8",
  "assignment_id": "d31f55ea-c8ed-47a5-b8f9-c83ec08ff0d3",
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
  "arrived_at": "2026-10-30T08:01:53.378662Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/34288792-8916-49a1-89d7-1f28a10259e7/start` → **200**

```json
{
  "command_id": "97b4512d-a4d2-40bd-943e-6f4981a543b8",
  "expected_version": 1
}
```

```json
{
  "id": "34288792-8916-49a1-89d7-1f28a10259e7",
  "order_id": "3a54d31a-67bf-4c96-8319-6122d280eef8",
  "assignment_id": "d31f55ea-c8ed-47a5-b8f9-c83ec08ff0d3",
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
  "arrived_at": "2026-10-30T08:01:53.378662Z",
  "started_at": "2026-10-30T08:01:53.620773Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/34288792-8916-49a1-89d7-1f28a10259e7/complete` → **200**

```json
{
  "command_id": "4beca103-7c3c-4711-b9b0-717579be67fd",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:01:53Z",
  "cash_received": false
}
```

```json
{
  "id": "34288792-8916-49a1-89d7-1f28a10259e7",
  "order_id": "3a54d31a-67bf-4c96-8319-6122d280eef8",
  "assignment_id": "d31f55ea-c8ed-47a5-b8f9-c83ec08ff0d3",
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
  "arrived_at": "2026-10-30T08:01:53.378662Z",
  "started_at": "2026-10-30T08:01:53.620773Z",
  "completed_at": "2026-10-30T08:01:53.862458Z",
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
  "session_id": "b3298470-96be-4e17-a7ac-8eee191eee97",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgyMTQsImlhdCI6MTc5MzM0NzMxNCwianRpIjoiNTdkOGIyMDItZDNhNC00NTRkLWExODYtZGViNWY0NGEzMGMxIiwic2lkIjoiYjMyOTg0NzAtOTZiZS00ZTE3LWE3YWMtOGVlZTE5MWVlZTk3In0.W6CWQ9yXjTZo-kjry_jtQu0bOdNoi1SCysExkRNjWLE",
  "access_expires_at": "2026-10-30T08:16:54.361169691Z",
  "refresh_token": "wYXfwH_8S8llrKLBvJe45rBZ9lRJ8P2kxpzxdxZUWLo",
  "refresh_expires_at": "2026-10-30T20:01:54.360649334Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/3a54d31a-67bf-4c96-8319-6122d280eef8/cash-dispute` → **200**

```json
{
  "order_id": "3a54d31a-67bf-4c96-8319-6122d280eef8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "41cf3107-c88f-4d84-accc-a3e1fc0a59f8",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T08:01:54.194995Z",
  "decide_by": "2026-11-13T08:01:54.194995Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T08:01:54.194995Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "3a54d31a-67bf-4c96-8319-6122d280eef8",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "41cf3107-c88f-4d84-accc-a3e1fc0a59f8",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T08:01:54.194995Z",
      "decide_by": "2026-11-13T08:01:54.194995Z",
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

`POST /api/admin/v1/orders/3a54d31a-67bf-4c96-8319-6122d280eef8/cash-dispute/decide` → **400**

```json
{
  "command_id": "a47284ef-bbda-4927-ba88-95f178aec323",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/3a54d31a-67bf-4c96-8319-6122d280eef8/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "a1585c90-0a4e-41b1-9b8c-79e99e151cc2",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/3a54d31a-67bf-4c96-8319-6122d280eef8/cash-dispute/decide` → **200**

```json
{
  "command_id": "8a942c46-c01f-4307-9d32-9622362c95da",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "3a54d31a-67bf-4c96-8319-6122d280eef8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "41cf3107-c88f-4d84-accc-a3e1fc0a59f8",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T08:01:54.194995Z",
  "decide_by": "2026-11-13T08:01:54.194995Z",
  "decision": "PAY_DRIVER",
  "decided_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T08:01:55.333411Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/3a54d31a-67bf-4c96-8319-6122d280eef8/cash-dispute/decide` → **409**

```json
{
  "command_id": "ccdd6fc9-6f26-4565-a44f-35e702c4ab24",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/3a54d31a-67bf-4c96-8319-6122d280eef8/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4b54ba7b-81e4-4027-870e-860b83c6a099"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bc858679-68b5-4376-8111-071de7718d6b",
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
  "last_heartbeat_at": "2026-10-30T08:01:53.143879Z",
  "last_location_at": "2026-10-30T08:01:53.143879Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bc858679-68b5-4376-8111-071de7718d6b/close` → **200**

```json
{
  "command_id": "775f28e2-63fc-4fbd-bd41-ecfdaaf89358",
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
  "phone": "+380730623269",
  "device_ref": "sandbox-23332"
}
```

```json
{
  "challenge_id": "029d4c3c-4987-4ca6-ad77-cde9731396a1",
  "expires_at": "2026-10-30T08:06:56.263168264Z",
  "resend_available_at": "2026-10-30T08:01:57.263168264Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380730623269` → **200**

```json
{
  "phone": "+380730623269",
  "audience": "CLIENT",
  "code": "111028",
  "sent_at": "2026-10-30T08:01:56.265394094Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "029d4c3c-4987-4ca6-ad77-cde9731396a1",
  "code": "111028",
  "device_ref": "sandbox-23332"
}
```

```json
{
  "session_id": "b6a64e94-a9a8-4384-ade6-12bee5a68bd9",
  "subject": {
    "type": "CLIENT",
    "id": "710b5382-541e-47cc-8c92-68fbe2eaec01"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTBiNTM4Mi01NDFlLTQ3Y2MtOGM5Mi02OGZiZTJlYWVjMDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MjE2LCJpYXQiOjE3OTMzNDczMTYsImp0aSI6IjdjNzdmYzA0LTI4ZTItNDY5MS1hYzRjLTUwYjhjY2Q5YzEzNiIsInNpZCI6ImI2YTY0ZTk0LWE5YTgtNDM4NC1hZGU2LTEyYmVlNWE2OGJkOSJ9.pqgw48yT-mcGg4y-KQjxYLiRqAzpxzUgk8Agkpnc62M",
  "access_expires_at": "2026-10-30T08:16:56.512211529Z",
  "refresh_token": "LkrP4lyVTKgYG6rC9hijnTh7Id2UsabIuxpR9TzU3PM",
  "refresh_expires_at": "2026-11-29T08:01:56.511674523Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "9ec43e5e-3310-459b-b95b-0a23293bd103",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "02a457ec-d9c9-45fc-94df-654d0ce3a3a0",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-02a457ec-d9c9-45fc-94df-654d0ce3a3a0",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "613fa7bebeeda5c60f270c6c808cc958",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=02a457ec-d9c9-45fc-94df-654d0ce3a3a0",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730623269"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=02a457ec-d9c9-45fc-94df-654d0ce3a3a0",
  "expires_at": "2026-10-30T08:31:56.732139Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/02a457ec-d9c9-45fc-94df-654d0ce3a3a0` → **200**

```json
{
  "id": "02a457ec-d9c9-45fc-94df-654d0ce3a3a0",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T08:31:56.732139Z",
  "card": {
    "id": "d90d271c-87d8-4571-8ea3-f26f75cdd31c",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2585",
    "card_type": "Visa",
    "created_at": "2026-10-30T08:01:56.961471Z"
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
  "device_ref": "sandbox-1743"
}
```

```json
{
  "challenge_id": "2330a8da-6d12-4a6c-9032-a759d956261a",
  "expires_at": "2026-10-30T08:06:57.204498831Z",
  "resend_available_at": "2026-10-30T08:01:58.204498831Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "048491",
  "sent_at": "2026-10-30T08:01:57.206812716Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2330a8da-6d12-4a6c-9032-a759d956261a",
  "code": "048491",
  "device_ref": "sandbox-1743"
}
```

```json
{
  "session_id": "b28e3a3c-f8a8-40ee-a5c6-cbc5054ffe5a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODIxNywiaWF0IjoxNzkzMzQ3MzE3LCJqdGkiOiJhNGYxY2RmZC1mYWY1LTRiYTEtYjQ2Yy0yYWVkODlhNzFmNmEiLCJzaWQiOiJiMjhlM2EzYy1mOGE4LTQwZWUtYTVjNi1jYmM1MDU0ZmZlNWEifQ.7auQRi7D756ObSTjBfqcr1BGybAZJllZxxlIS1V1_a4",
  "access_expires_at": "2026-10-30T08:16:57.451444455Z",
  "refresh_token": "YivWFkFF0bOzpWsONW_yiaAHDKYXNhmqON6ckkTLrbo",
  "refresh_expires_at": "2026-11-29T08:01:57.450974172Z",
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
  "command_id": "db707af5-3433-4445-a42c-42d6276879d7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:01:57Z",
    "sequence": 1793347317898
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "377ed62c-a895-4a27-a35a-b50843803499",
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
  "last_heartbeat_at": "2026-10-30T08:01:57.914974Z",
  "last_location_at": "2026-10-30T08:01:57.914974Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "51075893-b136-4e27-8626-5f74cd5bd91c",
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
  "id": "d310939f-91fc-4a79-bcd9-beefa6ebbfbd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:06:58.146774Z",
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
  "command_id": "d0bb3a0d-833b-4ae3-bb90-ede5717719ac",
  "quote_id": "d310939f-91fc-4a79-bcd9-beefa6ebbfbd",
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
  "id": "80e2d8bd-8eab-4fb1-91c5-0297601caa67",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "710b5382-541e-47cc-8c92-68fbe2eaec01",
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
  "created_at": "2026-10-30T08:01:58.388185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80e2d8bd-8eab-4fb1-91c5-0297601caa67` → **200**

```json
{
  "id": "80e2d8bd-8eab-4fb1-91c5-0297601caa67",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "710b5382-541e-47cc-8c92-68fbe2eaec01",
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
  "created_at": "2026-10-30T08:01:58.388185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80e2d8bd-8eab-4fb1-91c5-0297601caa67` → **200**

```json
{
  "id": "80e2d8bd-8eab-4fb1-91c5-0297601caa67",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "710b5382-541e-47cc-8c92-68fbe2eaec01",
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
  "created_at": "2026-10-30T08:01:58.388185Z",
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
    "id": "4d88ed5d-2c33-4589-a5e8-e075dbe52fe0",
    "order_id": "80e2d8bd-8eab-4fb1-91c5-0297601caa67",
    "expires_at": "2026-10-30T08:02:14.227823Z",
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

`POST /api/driver/v1/offers/4d88ed5d-2c33-4589-a5e8-e075dbe52fe0/accept` → **200**

```json
{
  "command_id": "04fcff5c-106e-4557-8e55-45208b9d930d"
}
```

```json
{
  "id": "5c0d6107-6d9a-42d9-a1c5-492b6b4f12cc",
  "order_id": "80e2d8bd-8eab-4fb1-91c5-0297601caa67",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "368b82c4-9f32-4617-9a0c-48ac0fcffd1f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "368b82c4-9f32-4617-9a0c-48ac0fcffd1f",
  "order_id": "80e2d8bd-8eab-4fb1-91c5-0297601caa67",
  "assignment_id": "5c0d6107-6d9a-42d9-a1c5-492b6b4f12cc",
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

`POST /api/rider/v1/orders/80e2d8bd-8eab-4fb1-91c5-0297601caa67/messages` → **201**

```json
{
  "command_id": "09bf38cf-7fe7-4edd-8de0-0f7493df74d9",
  "body": "Я біля входу, мій номер +380730623269, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "bbd72f66-2d02-4687-8c47-2f195033cf3b",
  "order_id": "80e2d8bd-8eab-4fb1-91c5-0297601caa67",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380730623269, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T08:02:00.768576508Z"
}
```

`POST /api/driver/v1/trips/368b82c4-9f32-4617-9a0c-48ac0fcffd1f/messages` → **201**

```json
{
  "command_id": "98215565-ed05-41bf-8481-5a9c94516186",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "2a527932-b61c-469f-8aeb-97d8c709a68c",
  "order_id": "80e2d8bd-8eab-4fb1-91c5-0297601caa67",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T08:02:00.998115452Z"
}
```

`POST /api/driver/v1/work-sessions/377ed62c-a895-4a27-a35a-b50843803499/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:02:01Z",
    "sequence": 1793347321220
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "377ed62c-a895-4a27-a35a-b50843803499",
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
  "last_heartbeat_at": "2026-10-30T08:02:01.237185Z",
  "last_location_at": "2026-10-30T08:02:01.237185Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/368b82c4-9f32-4617-9a0c-48ac0fcffd1f/arrive` → **200**

```json
{
  "command_id": "4353d0df-3455-4aac-9176-afabfaa90379",
  "expected_version": 0
}
```

```json
{
  "id": "368b82c4-9f32-4617-9a0c-48ac0fcffd1f",
  "order_id": "80e2d8bd-8eab-4fb1-91c5-0297601caa67",
  "assignment_id": "5c0d6107-6d9a-42d9-a1c5-492b6b4f12cc",
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
  "arrived_at": "2026-10-30T08:02:01.471932Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/368b82c4-9f32-4617-9a0c-48ac0fcffd1f/start` → **200**

```json
{
  "command_id": "ad62eaff-53d2-4e58-80ec-c7074eb560fb",
  "expected_version": 1
}
```

```json
{
  "id": "368b82c4-9f32-4617-9a0c-48ac0fcffd1f",
  "order_id": "80e2d8bd-8eab-4fb1-91c5-0297601caa67",
  "assignment_id": "5c0d6107-6d9a-42d9-a1c5-492b6b4f12cc",
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
  "arrived_at": "2026-10-30T08:02:01.471932Z",
  "started_at": "2026-10-30T08:02:01.705686Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/377ed62c-a895-4a27-a35a-b50843803499/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:02:01Z",
    "sequence": 1793347321925
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "377ed62c-a895-4a27-a35a-b50843803499",
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
  "last_heartbeat_at": "2026-10-30T08:02:01.942343Z",
  "last_location_at": "2026-10-30T08:02:01.942343Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/368b82c4-9f32-4617-9a0c-48ac0fcffd1f/complete` → **200**

```json
{
  "command_id": "118c81ac-f7cd-492c-b7ba-104620d756c2",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:02:02Z",
  "cash_received": false
}
```

```json
{
  "id": "368b82c4-9f32-4617-9a0c-48ac0fcffd1f",
  "order_id": "80e2d8bd-8eab-4fb1-91c5-0297601caa67",
  "assignment_id": "5c0d6107-6d9a-42d9-a1c5-492b6b4f12cc",
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
  "arrived_at": "2026-10-30T08:02:01.471932Z",
  "started_at": "2026-10-30T08:02:01.705686Z",
  "completed_at": "2026-10-30T08:02:02.177775Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/80e2d8bd-8eab-4fb1-91c5-0297601caa67` → **200**

```json
{
  "id": "80e2d8bd-8eab-4fb1-91c5-0297601caa67",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "710b5382-541e-47cc-8c92-68fbe2eaec01",
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
    "id": "5c0d6107-6d9a-42d9-a1c5-492b6b4f12cc",
    "order_id": "80e2d8bd-8eab-4fb1-91c5-0297601caa67",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "368b82c4-9f32-4617-9a0c-48ac0fcffd1f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:01:58.388185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80e2d8bd-8eab-4fb1-91c5-0297601caa67` → **200**

```json
{
  "id": "80e2d8bd-8eab-4fb1-91c5-0297601caa67",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "710b5382-541e-47cc-8c92-68fbe2eaec01",
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
    "id": "5c0d6107-6d9a-42d9-a1c5-492b6b4f12cc",
    "order_id": "80e2d8bd-8eab-4fb1-91c5-0297601caa67",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "368b82c4-9f32-4617-9a0c-48ac0fcffd1f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:01:58.388185Z",
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
  "session_id": "377ed62c-a895-4a27-a35a-b50843803499",
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
  "last_heartbeat_at": "2026-10-30T08:02:01.942343Z",
  "last_location_at": "2026-10-30T08:02:01.942343Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/377ed62c-a895-4a27-a35a-b50843803499/close` → **200**

```json
{
  "command_id": "8f6a681a-3f2e-4e6b-912a-55adf3de64ef",
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
  "session_id": "1be6ce39-5447-4f0e-9974-d2a62c8b44b2",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgyMjQsImlhdCI6MTc5MzM0NzMyNCwianRpIjoiYzA3YjZiNDQtMDI1Ny00YmY4LWI3YjItOTY5OTdlNzYwZTg1Iiwic2lkIjoiMWJlNmNlMzktNTQ0Ny00ZjBlLTk5NzQtZDJhNjJjOGI0NGIyIn0.ZihofT2d-22P7uXamhxI853VidDwQmjdS5sA8-4TFYE",
  "access_expires_at": "2026-10-30T08:17:04.635659907Z",
  "refresh_token": "BJMucf_uurZOXeRvbkLh85y5UEwNxfsY2CFLd00Xde0",
  "refresh_expires_at": "2026-10-30T20:02:04.635167592Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/80e2d8bd-8eab-4fb1-91c5-0297601caa67/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/80e2d8bd-8eab-4fb1-91c5-0297601caa67/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "de38aeb3-b395-4e9e-97d2-1e670059c223"
}
```

`GET /api/admin/v1/orders/80e2d8bd-8eab-4fb1-91c5-0297601caa67/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T08:02:05.097455258Z",
  "order": {
    "id": "80e2d8bd-8eab-4fb1-91c5-0297601caa67",
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
    "created_at": "2026-10-30T08:01:58.388185Z",
    "assigned_at": "2026-10-30T08:02:00.319192Z",
    "arrived_at": "2026-10-30T08:02:01.471932Z",
    "started_at": "2026-10-30T08:02:01.705686Z",
    "completed_at": "2026-10-30T08:02:02.177775Z"
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
    "id": "710b5382-541e-47cc-8c92-68fbe2eaec01",
    "registered_at": "2026-10-30T08:01:56.509679Z",
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
      "created_at": "2026-10-30T08:01:58.390086Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T08:02:02.288739Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/80e2d8bd-8eab-4fb1-91c5-0297601caa67/chargebacks` → **422**

```json
{
  "command_id": "635181d0-c175-430d-9d67-2c93f0197633",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/80e2d8bd-8eab-4fb1-91c5-0297601caa67/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "98d56a4e-b1db-48c5-aac5-84cf61f485fc"
}
```

`POST /api/admin/v1/orders/80e2d8bd-8eab-4fb1-91c5-0297601caa67/chargebacks` → **201**

```json
{
  "command_id": "1a7be7b8-95ae-4c23-a530-db773f7bf991",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "60ef6dba-b70a-4e7f-847e-6c39b6aa161c",
  "order_id": "80e2d8bd-8eab-4fb1-91c5-0297601caa67",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T08:02:05.62518Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/80e2d8bd-8eab-4fb1-91c5-0297601caa67/chargebacks` → **201**

```json
{
  "command_id": "1a7be7b8-95ae-4c23-a530-db773f7bf991",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "60ef6dba-b70a-4e7f-847e-6c39b6aa161c",
  "order_id": "80e2d8bd-8eab-4fb1-91c5-0297601caa67",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T08:02:05.62518Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/710b5382-541e-47cc-8c92-68fbe2eaec01` → **200**

```json
{
  "client": {
    "id": "710b5382-541e-47cc-8c92-68fbe2eaec01",
    "phone": "+380730623269",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:01:56.509679Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "80e2d8bd-8eab-4fb1-91c5-0297601caa67",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T08:01:58.388185Z",
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

`GET /api/admin/v1/clients/710b5382-541e-47cc-8c92-68fbe2eaec01` → **200**

```json
{
  "client": {
    "id": "710b5382-541e-47cc-8c92-68fbe2eaec01",
    "phone": "+380730623269",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:01:56.509679Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "80e2d8bd-8eab-4fb1-91c5-0297601caa67",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T08:01:58.388185Z",
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

`POST /api/admin/v1/orders/80e2d8bd-8eab-4fb1-91c5-0297601caa67/chargebacks/60ef6dba-b70a-4e7f-847e-6c39b6aa161c/resolve` → **200**

```json
{
  "command_id": "53bffd3e-035f-427d-9ff1-d25b6786399d",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "60ef6dba-b70a-4e7f-847e-6c39b6aa161c",
  "order_id": "80e2d8bd-8eab-4fb1-91c5-0297601caa67",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T08:02:05.62518Z",
  "resolved_at": "2026-10-30T08:02:07.635567Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/710b5382-541e-47cc-8c92-68fbe2eaec01` → **200**

```json
{
  "client": {
    "id": "710b5382-541e-47cc-8c92-68fbe2eaec01",
    "phone": "+380730623269",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:01:56.509679Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "80e2d8bd-8eab-4fb1-91c5-0297601caa67",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T08:01:58.388185Z",
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

`GET /api/admin/v1/clients/710b5382-541e-47cc-8c92-68fbe2eaec01` → **200**

```json
{
  "client": {
    "id": "710b5382-541e-47cc-8c92-68fbe2eaec01",
    "phone": "+380730623269",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:01:56.509679Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "80e2d8bd-8eab-4fb1-91c5-0297601caa67",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T08:01:58.388185Z",
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

`POST /api/admin/v1/orders/80e2d8bd-8eab-4fb1-91c5-0297601caa67/chargebacks/60ef6dba-b70a-4e7f-847e-6c39b6aa161c/resolve` → **409**

```json
{
  "command_id": "249cc4b4-f1fb-48cd-890d-ca0b34dcb3d9",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/80e2d8bd-8eab-4fb1-91c5-0297601caa67/chargebacks/60ef6dba-b70a-4e7f-847e-6c39b6aa161c/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "81ddac67-958e-491f-aafd-00b239e22557"
}
```

`GET /api/admin/v1/orders/80e2d8bd-8eab-4fb1-91c5-0297601caa67/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "60ef6dba-b70a-4e7f-847e-6c39b6aa161c",
      "order_id": "80e2d8bd-8eab-4fb1-91c5-0297601caa67",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T08:02:05.62518Z",
      "resolved_at": "2026-10-30T08:02:07.635567Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 80e2d8bd-8eab-4fb1-91c5-0297601caa67 without phone or card digits; chargeback 60ef6dba-b70a-4e7f-847e-6c39b6aa161c recorded and won.

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
  "session_id": "6b476dc8-d5d1-48d4-8e0c-69b7ea63b492",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgyMzAsImlhdCI6MTc5MzM0NzMzMCwianRpIjoiMmY5ZTg5OTUtNzY5Mi00MjM3LWExYzItMmIzNmU5ZjNjNjliIiwic2lkIjoiNmI0NzZkYzgtZDVkMS00OGQ0LThlMGMtNjliN2VhNjNiNDkyIn0.WjLpREu90dNjt-jfROOXsvYtFmgWM0cTMhSQ_P9_v1g",
  "access_expires_at": "2026-10-30T08:17:10.340738887Z",
  "refresh_token": "7Cnfk-jLvMNF5fjTx4n0NWeG1LQA1a9SoQ1VLs8h1og",
  "refresh_expires_at": "2026-10-30T20:02:10.340285278Z",
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
  "phone": "+48600194464",
  "device_ref": "sandbox-15759"
}
```

```json
{
  "challenge_id": "1f16425c-987b-49c0-b81c-daaea531f920",
  "expires_at": "2026-10-30T08:07:11.011305366Z",
  "resend_available_at": "2026-10-30T08:02:12.011305366Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600194464` → **200**

```json
{
  "phone": "+48600194464",
  "audience": "CLIENT",
  "code": "416763",
  "sent_at": "2026-10-30T08:02:11.013462194Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1f16425c-987b-49c0-b81c-daaea531f920",
  "code": "416763",
  "device_ref": "sandbox-15759"
}
```

```json
{
  "session_id": "b57038d4-fc90-4ce2-9aa6-4b090ab10c25",
  "subject": {
    "type": "CLIENT",
    "id": "208503e0-1875-4ef3-9681-fa31913fa821"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDg1MDNlMC0xODc1LTRlZjMtOTY4MS1mYTMxOTEzZmE4MjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MjMxLCJpYXQiOjE3OTMzNDczMzEsImp0aSI6IjVjMTI5NDIwLWY0NzMtNGM2Yy05OGRlLWUzMjE1ZDAzNzRkNyIsInNpZCI6ImI1NzAzOGQ0LWZjOTAtNGNlMi05YWE2LTRiMDkwYWIxMGMyNSJ9.mkWLH2iwe7eiVGfkq4nm2vIp61pJDkwayfukc_VnrW0",
  "access_expires_at": "2026-10-30T08:17:11.256616289Z",
  "refresh_token": "H69h79moWPRbnx19XGr2-IXdU0JdtLBlSSRI11EXt4U",
  "refresh_expires_at": "2026-11-29T08:02:11.256190516Z",
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
  "command_id": "d5242eab-ff99-4bd3-9e44-1e17e6170eda",
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
  "correlation_id": "05a9bc66-0367-497e-83a1-fa66e1a3089e",
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
  "command_id": "613f566a-5144-4af5-9d49-44009fdf7d4c",
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
  "paused_at": "2026-10-30T08:02:12.165414644Z",
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
  "command_id": "537e9de5-707b-4f80-80aa-33bc9667d24b",
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
  "id": "f2c3d401-bb57-4b84-b4d5-c7ce14d5cf14",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:07:12.695935Z",
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
  "command_id": "02572a95-9055-4ca9-af59-72d24d560741",
  "quote_id": "f2c3d401-bb57-4b84-b4d5-c7ce14d5cf14",
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
  "correlation_id": "475de70d-5172-41ca-a06e-24014f8e1dc3"
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
  "paused_at": "2026-10-30T08:02:12.165415Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "9d061ee5-d690-4e5f-b61b-428fddb6f789",
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
  "command_id": "99e954c6-b132-40c3-b2d6-0d6ce79af3ef",
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
  "command_id": "cc0a8d98-548a-430e-a7d8-2617b482f80d",
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
  "id": "16b4b092-bdad-4334-a63d-0aba2251ae68",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:07:14.090331Z",
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
  "command_id": "3f06336f-56c7-4722-9859-2f5f42361563",
  "quote_id": "16b4b092-bdad-4334-a63d-0aba2251ae68",
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
  "correlation_id": "f53c5880-2a37-4a0c-a3c0-6c38394c0abf"
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
  "command_id": "81212ac4-54b7-4c5c-a472-914145e163c1",
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
  "command_id": "3149c7f7-8c9d-4ed8-9eec-c5b8dc9fca78",
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
  "id": "4693c45b-cb18-4275-9f60-0f42a5b8b166",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:07:15.008035Z",
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
  "command_id": "72c6a25c-0a56-42ed-8755-2ec5eb83d833",
  "quote_id": "4693c45b-cb18-4275-9f60-0f42a5b8b166",
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
  "correlation_id": "8a21b093-a34a-465f-bff4-4d76d831fb3d"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "224df455-767a-4b8d-a87d-23a690673f53",
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
  "correlation_id": "5a9832e0-7273-4320-bb32-4bc84a03181c"
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
  "command_id": "904f88e5-8c0a-4c26-bf2a-a7e0fcde8592",
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
  "phone": "+380677575868",
  "device_ref": "sandbox-15058"
}
```

```json
{
  "challenge_id": "eab040cf-21dd-4b51-8999-4b58b83d89ba",
  "expires_at": "2026-10-30T08:07:16.187811307Z",
  "resend_available_at": "2026-10-30T08:02:17.187811307Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677575868` → **200**

```json
{
  "phone": "+380677575868",
  "audience": "CLIENT",
  "code": "618651",
  "sent_at": "2026-10-30T08:02:16.189969567Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eab040cf-21dd-4b51-8999-4b58b83d89ba",
  "code": "618651",
  "device_ref": "sandbox-15058"
}
```

```json
{
  "session_id": "0010ccd9-859d-4d89-a84e-1641710e968c",
  "subject": {
    "type": "CLIENT",
    "id": "818f4e57-525c-4b1b-b64b-28155924806a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MThmNGU1Ny01MjVjLTRiMWItYjY0Yi0yODE1NTkyNDgwNmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MjM2LCJpYXQiOjE3OTMzNDczMzYsImp0aSI6IjU0Y2JmNTdlLWI4YTMtNDQwMC1hNmU2LWQwZjgwMTg2YmIwZCIsInNpZCI6IjAwMTBjY2Q5LTg1OWQtNGQ4OS1hODRlLTE2NDE3MTBlOTY4YyJ9.-2YeVoZhOScbi7iveUBKhksDeS5kPZyn_wm2yuQBQT4",
  "access_expires_at": "2026-10-30T08:17:16.462345782Z",
  "refresh_token": "EcOlesIvzxc0I0CmHQdgozwYWQdpVERk1pwhad_VzCg",
  "refresh_expires_at": "2026-11-29T08:02:16.461837333Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "818f4e57-525c-4b1b-b64b-28155924806a",
  "session_id": "0010ccd9-859d-4d89-a84e-1641710e968c",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7e4d774c-ebe7-4575-9f33-d5c5bf0ff034",
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
  "id": "9472fb5a-5847-4a50-93b9-625a1a01562d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:07:16.914943Z",
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
  "challenge_id": "4b02fc0d-2992-46b8-8b61-e2e808529a9c",
  "expires_at": "2026-10-30T08:07:19.147499094Z",
  "resend_available_at": "2026-10-30T08:02:20.147499094Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677575868` → **200**

```json
{
  "phone": "+380677575868",
  "audience": "CLIENT",
  "code": "898523",
  "sent_at": "2026-10-30T08:02:19.149260509Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "86eaff38-1bb9-40e4-8913-000e87836049",
  "challenge_id": "4b02fc0d-2992-46b8-8b61-e2e808529a9c",
  "otp_code": "898523"
}
```

```json
{
  "client_id": "818f4e57-525c-4b1b-b64b-28155924806a",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T08:02:19.399939722Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "658fdd5c-e7b1-4de0-9114-17422c4db87a",
  "quote_id": "9472fb5a-5847-4a50-93b9-625a1a01562d",
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
  "correlation_id": "c0c2a74d-9693-4cc5-a508-651d07ba73f2"
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
  "session_id": "6a034403-2397-4311-a153-b14c7a8000be",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgyNDAsImlhdCI6MTc5MzM0NzM0MCwianRpIjoiMDU1NmYxNzYtNWVmZS00NzE2LWJhMGQtNzQxNjQ5ZDM5ZWRmIiwic2lkIjoiNmEwMzQ0MDMtMjM5Ny00MzExLWExNTMtYjE0YzdhODAwMGJlIn0.o9Knrf2UG_sv_owzorgBoDh-684VfTy4H3uk_TVN_aw",
  "access_expires_at": "2026-10-30T08:17:20.122456893Z",
  "refresh_token": "lFySIiSSr7PkTSVQP4QDShhWeqnxpSaLN4kqS7a13Hs",
  "refresh_expires_at": "2026-10-30T20:02:20.122001773Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "818f4e57-525c-4b1b-b64b-28155924806a",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T08:02:19.39994Z",
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

`POST /api/admin/v1/client-deletions/818f4e57-525c-4b1b-b64b-28155924806a/complete` → **200**

```json
{
  "command_id": "670dda12-9961-4a21-b38e-519f18222944",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "818f4e57-525c-4b1b-b64b-28155924806a",
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
  "correlation_id": "857703bb-cd23-455b-9257-9e15ec97f44b"
}
```

Done: client 818f4e57-525c-4b1b-b64b-28155924806a anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660514903",
  "device_ref": "sandbox-12479"
}
```

```json
{
  "challenge_id": "f052bc6c-8fb4-481b-8a1e-52fcf28c218a",
  "expires_at": "2026-10-30T08:07:21.050673176Z",
  "resend_available_at": "2026-10-30T08:02:22.050673176Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660514903` → **200**

```json
{
  "phone": "+380660514903",
  "audience": "CLIENT",
  "code": "462224",
  "sent_at": "2026-10-30T08:02:21.055790247Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f052bc6c-8fb4-481b-8a1e-52fcf28c218a",
  "code": "462224",
  "device_ref": "sandbox-12479"
}
```

```json
{
  "session_id": "485b859a-7328-48bc-8d7c-b0cfa55b8c56",
  "subject": {
    "type": "CLIENT",
    "id": "2610c36d-56ee-4af7-baa1-b9fba72c3143"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNjEwYzM2ZC01NmVlLTRhZjctYmFhMS1iOWZiYTcyYzMxNDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MjQxLCJpYXQiOjE3OTMzNDczNDEsImp0aSI6IjBlNzcyYjUzLWUyMzItNDFkNi05M2MwLTYxOTU5NzRhZmY3MyIsInNpZCI6IjQ4NWI4NTlhLTczMjgtNDhiYy04ZDdjLWIwY2ZhNTViOGM1NiJ9.w9WRHof9hyOAOvaLssmO7eaOuFshfCI5uWxe86z_1ho",
  "access_expires_at": "2026-10-30T08:17:21.295525136Z",
  "refresh_token": "heXMTE7XPx4S7Eb3R3pbfvna4lRmGK8yjZ4Vt0Dtnlc",
  "refresh_expires_at": "2026-11-29T08:02:21.295075704Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "2610c36d-56ee-4af7-baa1-b9fba72c3143",
  "session_id": "485b859a-7328-48bc-8d7c-b0cfa55b8c56",
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
  "session_id": "5c14b89d-45cb-4833-814d-f124636631d8",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgyNDEsImlhdCI6MTc5MzM0NzM0MSwianRpIjoiYTU2YTE1Y2YtYWJlMC00ZTNhLThmMTMtZTE0ZGZlMzRiOTMyIiwic2lkIjoiNWMxNGI4OWQtNDVjYi00ODMzLTgxNGQtZjEyNDYzNjYzMWQ4In0.BPTo_onf7rDUPP5_P3HL2KFlBHm-N2gcwX7sBzyGPzw",
  "access_expires_at": "2026-10-30T08:17:21.993436097Z",
  "refresh_token": "DYgkcVu_AFsM7rXApWRs1vmo-pQVgw2Yq2B1i2xEjLE",
  "refresh_expires_at": "2026-10-30T20:02:21.992864991Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=0514903&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "2610c36d-56ee-4af7-baa1-b9fba72c3143",
      "phone": "+380660514903",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T08:02:21.293607Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/2610c36d-56ee-4af7-baa1-b9fba72c3143` → **200**

```json
{
  "client": {
    "id": "2610c36d-56ee-4af7-baa1-b9fba72c3143",
    "phone": "+380660514903",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:02:21.293607Z",
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

`POST /api/admin/v1/clients/2610c36d-56ee-4af7-baa1-b9fba72c3143/block` → **400**

```json
{
  "command_id": "2d23dbb8-4518-40e5-9f7b-e1d9319dd410",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/2610c36d-56ee-4af7-baa1-b9fba72c3143/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "41c4d48b-e615-4123-bd1a-37ece59b6694",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/2610c36d-56ee-4af7-baa1-b9fba72c3143/block` → **200**

```json
{
  "command_id": "c16a975e-efc9-4033-9fff-106a49742ffc",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "2610c36d-56ee-4af7-baa1-b9fba72c3143",
  "phone": "+380660514903",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T08:02:21.293607Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T08:02:22.938741Z",
    "by": "db8502d0-b190-4276-94c9-6cc44299e7b3"
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
  "correlation_id": "7b2a825c-a21c-4bad-b7c8-e68017a77aac"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660514903",
  "device_ref": "sandbox-30060"
}
```

```json
{
  "challenge_id": "a2ad6e34-af60-4c39-a6a2-467d3f3aa080",
  "expires_at": "2026-10-30T08:07:25.38981474Z",
  "resend_available_at": "2026-10-30T08:02:26.38981474Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660514903` → **200**

```json
{
  "phone": "+380660514903",
  "audience": "CLIENT",
  "code": "362146",
  "sent_at": "2026-10-30T08:02:25.396984653Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "a2ad6e34-af60-4c39-a6a2-467d3f3aa080",
  "code": "362146",
  "device_ref": "sandbox-30060"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "37166e74-2696-4425-83e1-e8ced5856058"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/2610c36d-56ee-4af7-baa1-b9fba72c3143` → **200**

```json
{
  "client": {
    "id": "2610c36d-56ee-4af7-baa1-b9fba72c3143",
    "phone": "+380660514903",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T08:02:21.293607Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T08:02:22.938741Z",
      "by": "db8502d0-b190-4276-94c9-6cc44299e7b3"
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

`POST /api/admin/v1/clients/2610c36d-56ee-4af7-baa1-b9fba72c3143/unblock` → **200**

```json
{
  "command_id": "55859689-8bba-4173-945e-20249dd0f5dc",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "2610c36d-56ee-4af7-baa1-b9fba72c3143",
  "phone": "+380660514903",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T08:02:21.293607Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660514903",
  "device_ref": "sandbox-30756"
}
```

```json
{
  "challenge_id": "fec1b8b4-02e1-41f3-a976-fc084bd94165",
  "expires_at": "2026-10-30T08:07:28.350754178Z",
  "resend_available_at": "2026-10-30T08:02:29.350754178Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660514903` → **200**

```json
{
  "phone": "+380660514903",
  "audience": "CLIENT",
  "code": "277161",
  "sent_at": "2026-10-30T08:02:28.352789327Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fec1b8b4-02e1-41f3-a976-fc084bd94165",
  "code": "277161",
  "device_ref": "sandbox-30756"
}
```

```json
{
  "session_id": "c2c49d05-7881-435f-b99a-a948773b67d7",
  "subject": {
    "type": "CLIENT",
    "id": "2610c36d-56ee-4af7-baa1-b9fba72c3143"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNjEwYzM2ZC01NmVlLTRhZjctYmFhMS1iOWZiYTcyYzMxNDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MjQ4LCJpYXQiOjE3OTMzNDczNDgsImp0aSI6IjlkZGFhYTE3LTAyZDktNDNiZS1hNjBkLWFhY2Q1NjI3M2U1YiIsInNpZCI6ImMyYzQ5ZDA1LTc4ODEtNDM1Zi1iOTlhLWE5NDg3NzNiNjdkNyJ9.7C1OVG2fq7w_pSsi6iKf-J7gc4cd-ZzvrKvFQxaXvwo",
  "access_expires_at": "2026-10-30T08:17:28.597192195Z",
  "refresh_token": "D-zLb_nB754ldSBW6oaV18U5tX3wPPK-3Ubmb6qxWk4",
  "refresh_expires_at": "2026-11-29T08:02:28.596666536Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "2610c36d-56ee-4af7-baa1-b9fba72c3143",
  "session_id": "c2c49d05-7881-435f-b99a-a948773b67d7",
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
  "phone": "+380667228015",
  "device_ref": "sandbox-1197"
}
```

```json
{
  "challenge_id": "e0a2d14c-e59a-4451-ae37-f49e9fe81ff6",
  "expires_at": "2026-10-30T08:07:29.047462498Z",
  "resend_available_at": "2026-10-30T08:02:30.047462498Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667228015` → **200**

```json
{
  "phone": "+380667228015",
  "audience": "CLIENT",
  "code": "676075",
  "sent_at": "2026-10-30T08:02:29.079888966Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e0a2d14c-e59a-4451-ae37-f49e9fe81ff6",
  "code": "676075",
  "device_ref": "sandbox-1197"
}
```

```json
{
  "session_id": "5069ccd4-1443-4633-922e-571c9ccff4b8",
  "subject": {
    "type": "CLIENT",
    "id": "e42c1c18-6242-4df8-a0d8-002dc861b60e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNDJjMWMxOC02MjQyLTRkZjgtYTBkOC0wMDJkYzg2MWI2MGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MjQ5LCJpYXQiOjE3OTMzNDczNDksImp0aSI6IjIyYjZhNTNkLWM2ZDgtNDMwOC04MDBhLTRkNmZhYTk0YzVjYiIsInNpZCI6IjUwNjljY2Q0LTE0NDMtNDYzMy05MjJlLTU3MWM5Y2NmZjRiOCJ9.PWnltuGD9NFrgUNqFNLU9KgNV_6uleVNDNki3cWDelw",
  "access_expires_at": "2026-10-30T08:17:29.327657052Z",
  "refresh_token": "iJOURO3hT4zIXSEqaZUxZalBri-1Kpm1SFt3zHpBDYg",
  "refresh_expires_at": "2026-11-29T08:02:29.327250583Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c53a59c5-5383-4302-a95f-477b97752275",
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
  "id": "f8040094-d4cc-4e19-b6ae-45980e76ed9d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:07:29.560597Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 9f2f7873-7578-469c-8134-472e7d2892ac) → **201**

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
  "session_id": "ffcae08e-b6f6-47e3-95ee-32592e51c1f8",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgyNTAsImlhdCI6MTc5MzM0NzM1MCwianRpIjoiODhkNGZkN2EtYTc5Mi00M2E3LWFlZjktYzYwYjM0OGVhYWE1Iiwic2lkIjoiZmZjYWUwOGUtYjZmNi00N2UzLTk1ZWUtMzI1OTJlNTFjMWY4In0.reNwR4i3G3m8CGrumpjunfrz62c6NIUdtZb6Us_f91Y",
  "access_expires_at": "2026-10-30T08:17:30.086820533Z",
  "refresh_token": "dgcdR23Y3Jp5qGe1j-_ddMAl-36kROjXwOZIsSNSwVA",
  "refresh_expires_at": "2026-10-30T20:02:30.086391751Z",
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
  "session_id": "05d8f47e-2014-47bf-9072-e9a077734a87",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgyNTAsImlhdCI6MTc5MzM0NzM1MCwianRpIjoiOTY3ZDc1ZjUtNzRkOC00YzNmLWIzODYtOWU4Mzk3N2Y4YmRkIiwic2lkIjoiMDVkOGY0N2UtMjAxNC00N2JmLTkwNzItZTlhMDc3NzM0YTg3In0.3Ms4MoWrDRtcl249szHUKUWQjIgY9gqnHkEYRJJfMoA",
  "access_expires_at": "2026-10-30T08:17:30.571845579Z",
  "refresh_token": "VPIYf8Hll4JNHKQI0kgjACBHBhjOskBBuAnhFEVzsyg",
  "refresh_expires_at": "2026-10-30T20:02:30.571338884Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a5236f4e-2273-4f2d-bd2e-8d538297c718/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:02:29.795614Z",
      "actor": {
        "type": "CLIENT",
        "id": "e42c1c18-6242-4df8-a0d8-002dc861b60e",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a5236f4e-2273-4f2d-bd2e-8d538297c718",
        "quote_id": "f8040094-d4cc-4e19-b6ae-45980e76ed9d",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "9f2f7873-7578-469c-8134-472e7d2892ac"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:02:29.7973Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a5236f4e-2273-4f2d-bd2e-8d538297c718",
        "attempt_id": "fe59d64d-a183-4252-a1ea-08fc4b869b33",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "9f2f7873-7578-469c-8134-472e7d2892ac"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T08:02:29.805084Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a5236f4e-2273-4f2d-bd2e-8d538297c718",
        "attempt_id": "fe59d64d-a183-4252-a1ea-08fc4b869b33"
      },
      "correlation_id": "9f2f7873-7578-469c-8134-472e7d2892ac"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "fe59d64d-a183-4252-a1ea-08fc4b869b33",
        "generation": 1,
        "started_at": "2026-10-30T08:02:29.796467Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T08:02:29.805084Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T08:02:29.797914Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/9f2f7873-7578-469c-8134-472e7d2892ac` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "a5236f4e-2273-4f2d-bd2e-8d538297c718:0",
      "order_id": "a5236f4e-2273-4f2d-bd2e-8d538297c718",
      "at": "2026-10-30T08:02:29.795614Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "a5236f4e-2273-4f2d-bd2e-8d538297c718:1",
      "order_id": "a5236f4e-2273-4f2d-bd2e-8d538297c718",
      "at": "2026-10-30T08:02:29.7973Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "a5236f4e-2273-4f2d-bd2e-8d538297c718:2",
      "order_id": "a5236f4e-2273-4f2d-bd2e-8d538297c718",
      "at": "2026-10-30T08:02:29.805084Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/e06f1024-d227-4f80-90f7-43de12c3ccb4` → **200**

```json
{
  "found": []
}
```

Done: request 9f2f7873-7578-469c-8134-472e7d2892ac — order a5236f4e-2273-4f2d-bd2e-8d538297c718 found by its id.

`GET /api/rider/v1/orders/a5236f4e-2273-4f2d-bd2e-8d538297c718` → **200**

```json
{
  "id": "a5236f4e-2273-4f2d-bd2e-8d538297c718",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e42c1c18-6242-4df8-a0d8-002dc861b60e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:02:29.795074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a5236f4e-2273-4f2d-bd2e-8d538297c718/cancel` → **200**

```json
{
  "command_id": "7de8d3c9-8845-4c87-a06e-dc57bb826210",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a5236f4e-2273-4f2d-bd2e-8d538297c718",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e42c1c18-6242-4df8-a0d8-002dc861b60e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:02:29.795074Z",
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
  "phone": "+380639388890",
  "device_ref": "sandbox-29208"
}
```

```json
{
  "challenge_id": "f1be485c-0ed7-4a26-bc15-e7b7567e0d3d",
  "expires_at": "2026-10-30T08:07:31.988771345Z",
  "resend_available_at": "2026-10-30T08:02:32.988771345Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639388890` → **200**

```json
{
  "phone": "+380639388890",
  "audience": "CLIENT",
  "code": "319645",
  "sent_at": "2026-10-30T08:02:31.990902008Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f1be485c-0ed7-4a26-bc15-e7b7567e0d3d",
  "code": "319645",
  "device_ref": "sandbox-29208"
}
```

```json
{
  "session_id": "41e8c3ca-3856-429f-b36a-d1998fb0e50e",
  "subject": {
    "type": "CLIENT",
    "id": "8ce30fbb-55f9-497c-8f31-06979509a040"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Y2UzMGZiYi01NWY5LTQ5N2MtOGYzMS0wNjk3OTUwOWEwNDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MjUyLCJpYXQiOjE3OTMzNDczNTIsImp0aSI6Ijk3Y2NkZWRkLTE1Y2YtNGI5Ni1hODBlLWUwMmI3NGUwYjM3MyIsInNpZCI6IjQxZThjM2NhLTM4NTYtNDI5Zi1iMzZhLWQxOTk4ZmIwZTUwZSJ9.Bv_vVl6RmwzHKVs2J-eRlEJQ31ZlAitUOgYs-Uzuako",
  "access_expires_at": "2026-10-30T08:17:32.235927303Z",
  "refresh_token": "IgOcRdyNYv21-feHD0AULZ1o5CvLfoLKLDyEbR0XEjY",
  "refresh_expires_at": "2026-11-29T08:02:32.235362878Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "ad15e589-1a2d-4bf2-b6c7-7ed855d8a5a9",
  "expires_at": "2026-10-30T08:07:34.457302312Z",
  "resend_available_at": "2026-10-30T08:02:35.457302312Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639388890` → **200**

```json
{
  "phone": "+380639388890",
  "audience": "CLIENT",
  "code": "639870",
  "sent_at": "2026-10-30T08:02:34.459446306Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "b9eb1c5a-6416-4715-a86a-0017abb6cd7b",
  "challenge_id": "ad15e589-1a2d-4bf2-b6c7-7ed855d8a5a9",
  "otp_code": "639870"
}
```

```json
{
  "id": "aa5fd02b-4a4a-4c1e-9456-b7e23fb7f1f9",
  "state": "PENDING",
  "created_at": "2026-10-30T08:02:34.723249Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/aa5fd02b-4a4a-4c1e-9456-b7e23fb7f1f9` → **200**

```json
{
  "id": "aa5fd02b-4a4a-4c1e-9456-b7e23fb7f1f9",
  "state": "PENDING",
  "created_at": "2026-10-30T08:02:34.723249Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/aa5fd02b-4a4a-4c1e-9456-b7e23fb7f1f9` → **200**

```json
{
  "id": "aa5fd02b-4a4a-4c1e-9456-b7e23fb7f1f9",
  "state": "PENDING",
  "created_at": "2026-10-30T08:02:34.723249Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/aa5fd02b-4a4a-4c1e-9456-b7e23fb7f1f9` → **200**

```json
{
  "id": "aa5fd02b-4a4a-4c1e-9456-b7e23fb7f1f9",
  "state": "PENDING",
  "created_at": "2026-10-30T08:02:34.723249Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/aa5fd02b-4a4a-4c1e-9456-b7e23fb7f1f9` → **200**

```json
{
  "id": "aa5fd02b-4a4a-4c1e-9456-b7e23fb7f1f9",
  "state": "PENDING",
  "created_at": "2026-10-30T08:02:34.723249Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/aa5fd02b-4a4a-4c1e-9456-b7e23fb7f1f9` → **200**

```json
{
  "id": "aa5fd02b-4a4a-4c1e-9456-b7e23fb7f1f9",
  "state": "READY",
  "created_at": "2026-10-30T08:02:34.723249Z",
  "ready_at": "2026-10-30T08:02:39.048161Z",
  "expires_at": "2026-11-06T08:02:39.048161Z",
  "size_bytes": 1030
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/aa5fd02b-4a4a-4c1e-9456-b7e23fb7f1f9/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637266523",
  "device_ref": "sandbox-24797"
}
```

```json
{
  "challenge_id": "4fba23c8-fce1-46a1-90e5-39e78a213897",
  "expires_at": "2026-10-30T08:07:40.057376167Z",
  "resend_available_at": "2026-10-30T08:02:41.057376167Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637266523` → **200**

```json
{
  "phone": "+380637266523",
  "audience": "CLIENT",
  "code": "213519",
  "sent_at": "2026-10-30T08:02:40.060123034Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4fba23c8-fce1-46a1-90e5-39e78a213897",
  "code": "213519",
  "device_ref": "sandbox-24797"
}
```

```json
{
  "session_id": "f2c9e297-e553-4c58-858d-616d795507a9",
  "subject": {
    "type": "CLIENT",
    "id": "e927bba6-9d0a-4ded-a733-5f353856c6c1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTI3YmJhNi05ZDBhLTRkZWQtYTczMy01ZjM1Mzg1NmM2YzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MjYwLCJpYXQiOjE3OTMzNDczNjAsImp0aSI6ImRkNWI5MGE3LTNmNWQtNDBiYS05YmEwLTE3YzZiZTdjZjJjNSIsInNpZCI6ImYyYzllMjk3LWU1NTMtNGM1OC04NThkLTYxNmQ3OTU1MDdhOSJ9.JMIx49bjSEKRgyR7r_sQLLHhFHiEUl9j9GUf341KXfk",
  "access_expires_at": "2026-10-30T08:17:40.307446527Z",
  "refresh_token": "fiZg-s6gsk_Al2lxIev8VrzdP0jSneHrcFZ1Y62Ahqw",
  "refresh_expires_at": "2026-11-29T08:02:40.307022522Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/aa5fd02b-4a4a-4c1e-9456-b7e23fb7f1f9/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/aa5fd02b-4a4a-4c1e-9456-b7e23fb7f1f9/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f6b450ce-231f-46c0-8375-124746bd5361"
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
  "session_id": "bf3a3b7b-b5e6-40a9-96a8-e7610e335a0b",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgyNjEsImlhdCI6MTc5MzM0NzM2MSwianRpIjoiNWE5MTRkZDMtNjVkNS00NGJiLTg3ZjUtYTg2NzQ5ZmFlZGM0Iiwic2lkIjoiYmYzYTNiN2ItYjVlNi00MGE5LTk2YTgtZTc2MTBlMzM1YTBiIn0.FgqRVO3EMcSYrqbyWWXRSiJy1ejR3EGzNyCk6G8-mIg",
  "access_expires_at": "2026-10-30T08:17:41.0193052Z",
  "refresh_token": "LknUxKVwQnOJcbR9OvCxFBq77VjaDnzCCym0aBQ8hls",
  "refresh_expires_at": "2026-10-30T20:02:41.018852984Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8ce30fbb-55f9-497c-8f31-06979509a040",
  "session_id": "41e8c3ca-3856-429f-b36a-d1998fb0e50e",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/8ce30fbb-55f9-497c-8f31-06979509a040/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "aa5fd02b-4a4a-4c1e-9456-b7e23fb7f1f9",
      "state": "READY",
      "created_at": "2026-10-30T08:02:34.723249Z",
      "ready_at": "2026-10-30T08:02:39.048161Z",
      "expires_at": "2026-11-06T08:02:39.048161Z",
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
  "device_ref": "sandbox-4957"
}
```

```json
{
  "challenge_id": "8428af39-cfb0-4844-a2ba-200a5e07830f",
  "expires_at": "2026-10-30T08:07:41.697983172Z",
  "resend_available_at": "2026-10-30T08:02:42.697983172Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "507429",
  "sent_at": "2026-10-30T08:02:41.700243883Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8428af39-cfb0-4844-a2ba-200a5e07830f",
  "code": "507429",
  "device_ref": "sandbox-4957"
}
```

```json
{
  "session_id": "88f70f42-10c8-4268-b62a-bf786152af06",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODI2MSwiaWF0IjoxNzkzMzQ3MzYxLCJqdGkiOiJlYTJkZWJmNy02NDIyLTQxYmEtYmVjNC1hNmEyODc5YWJlYzYiLCJzaWQiOiI4OGY3MGY0Mi0xMGM4LTQyNjgtYjYyYS1iZjc4NjE1MmFmMDYifQ.ACJSxmvHNRb0HyiGTxoKwNaptlvX0PmevaM4rGx6W5Q",
  "access_expires_at": "2026-10-30T08:17:41.943348734Z",
  "refresh_token": "MVW5OjbjpWbR61oETrMoKj-r2jc39cwy0W5PiIDkVZs",
  "refresh_expires_at": "2026-11-29T08:02:41.942825203Z",
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
  "device_ref": "sandbox-20394"
}
```

```json
{
  "challenge_id": "3834f483-05bf-4902-8c34-169a98ba2b3c",
  "expires_at": "2026-10-30T08:07:42.373952312Z",
  "resend_available_at": "2026-10-30T08:02:43.373952312Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "935112",
  "sent_at": "2026-10-30T08:02:42.376105746Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3834f483-05bf-4902-8c34-169a98ba2b3c",
  "code": "935112",
  "device_ref": "sandbox-20394"
}
```

```json
{
  "session_id": "c47f4ffb-5f82-4790-8657-8af6c072f715",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODI2MiwiaWF0IjoxNzkzMzQ3MzYyLCJqdGkiOiI1NzU2MTQ4NC1iMzMyLTQ4MWQtOWZhYS0wNzQ3OTQxOWNhNDkiLCJzaWQiOiJjNDdmNGZmYi01ZjgyLTQ3OTAtODY1Ny04YWY2YzA3MmY3MTUifQ.XXKy99K0zshkGpvyKFDGbksRA1nMzqa8ksQOT27pMSk",
  "access_expires_at": "2026-10-30T08:17:42.61542576Z",
  "refresh_token": "ShlRkcQ9ddr7t3rsrua4j5lgJdlQJ_d9-ZhnHYQcQY0",
  "refresh_expires_at": "2026-11-29T08:02:42.614944476Z",
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
  "command_id": "c19f64a7-87da-41b4-a8fb-f4bbbf8032e6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:02:43Z",
    "sequence": 1793347363502
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9f07a63a-f25b-4554-b5b7-35757013c45b",
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
  "last_heartbeat_at": "2026-10-30T08:02:43.066196Z",
  "last_location_at": "2026-10-30T08:02:43.066196Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-9410"
}
```

```json
{
  "challenge_id": "42ec36da-f0c6-4569-8bbc-bda9d3dd92f4",
  "expires_at": "2026-10-30T08:07:43.288026918Z",
  "resend_available_at": "2026-10-30T08:02:44.288026918Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "692857",
  "sent_at": "2026-10-30T08:02:43.290250805Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "42ec36da-f0c6-4569-8bbc-bda9d3dd92f4",
  "code": "692857",
  "device_ref": "sandbox-9410"
}
```

```json
{
  "session_id": "9726cebd-f483-47db-bbc0-bfb57502b4ca",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODI2MywiaWF0IjoxNzkzMzQ3MzYzLCJqdGkiOiIyNDhjZjdhOC02ZjgwLTRjMzQtYWU4NC1jMGE1ZDRiZjIyMTAiLCJzaWQiOiI5NzI2Y2ViZC1mNDgzLTQ3ZGItYmJjMC1iZmI1NzUwMmI0Y2EifQ.LxW48IdPWgIcEbFxe9xanTGWrJlr2omyby_-_k_2BOk",
  "access_expires_at": "2026-10-30T08:17:43.53544113Z",
  "refresh_token": "lOEjCW9JyWm4e3yoZuP_OBnlde6iGPGRhaFDIjvUAQI",
  "refresh_expires_at": "2026-11-29T08:02:43.534865581Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c6e21b4e-5aaf-4e5e-9a80-c30430cdf9db",
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
  "last_heartbeat_at": "2026-10-30T08:01:21.539537Z",
  "last_location_at": "2026-10-30T08:01:21.539537Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c6e21b4e-5aaf-4e5e-9a80-c30430cdf9db/handover` → **200**

```json
{
  "command_id": "90ffb729-67cb-490d-9570-10d812b6c133",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c6e21b4e-5aaf-4e5e-9a80-c30430cdf9db",
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
  "last_heartbeat_at": "2026-10-30T08:01:21.539537Z",
  "last_location_at": "2026-10-30T08:01:21.539537Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c6e21b4e-5aaf-4e5e-9a80-c30430cdf9db/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:02:44Z",
    "sequence": 1793347364223
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c6e21b4e-5aaf-4e5e-9a80-c30430cdf9db",
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
  "last_heartbeat_at": "2026-10-30T08:02:44.239709Z",
  "last_location_at": "2026-10-30T08:02:44.239709Z",
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
  "session_id": "f4845abb-1dbd-4e74-82d0-a864b8dbf55e",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgyNjQsImlhdCI6MTc5MzM0NzM2NCwianRpIjoiMzA5NWE3MDktOWQ0YS00Mjg4LTk5YzktMTZkNmYwYWQ5MDEzIiwic2lkIjoiZjQ4NDVhYmItMWRiZC00ZTc0LTgyZDAtYTg2NGI4ZGJmNTVlIn0.3bfH_0SQjl7nCdVhcP_D_-wDbhECLTO7OYI3BEvfyzA",
  "access_expires_at": "2026-10-30T08:17:44.722698888Z",
  "refresh_token": "V2rgvMKdJfAADHxclqtzF_y2F12NXBlp_u8mON-V0dA",
  "refresh_expires_at": "2026-10-30T20:02:44.722236376Z",
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
  "session_id": "e286c767-c76d-4947-b336-625a5f3ad6f2",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgyNjUsImlhdCI6MTc5MzM0NzM2NSwianRpIjoiOGM5N2ZjNTctZmU5ZS00NjFlLWE0OWMtNjkyY2Q4Mzk2ZGJiIiwic2lkIjoiZTI4NmM3NjctYzc2ZC00OTQ3LWIzMzYtNjI1YTVmM2FkNmYyIn0.jDS_2chTl7qrsB1pSquqHdRMzb7Zi1UOfUAA7KJ4Jdk",
  "access_expires_at": "2026-10-30T08:17:45.217591559Z",
  "refresh_token": "s6ccPiRfbKTtFxGhvKGgD_FP-v6wldwCzCIVDxS7txw",
  "refresh_expires_at": "2026-10-30T20:02:45.217129518Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380685812059",
  "device_ref": "sandbox-1095"
}
```

```json
{
  "challenge_id": "808f5d23-4508-4908-ad94-f651c5d748a1",
  "expires_at": "2026-10-30T08:07:45.440412633Z",
  "resend_available_at": "2026-10-30T08:02:46.440412633Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380685812059` → **200**

```json
{
  "phone": "+380685812059",
  "audience": "CLIENT",
  "code": "195557",
  "sent_at": "2026-10-30T08:02:45.442511445Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "808f5d23-4508-4908-ad94-f651c5d748a1",
  "code": "195557",
  "device_ref": "sandbox-1095"
}
```

```json
{
  "session_id": "94387ea2-113f-4b0c-ae9f-3210e00650d7",
  "subject": {
    "type": "CLIENT",
    "id": "70411e4c-8413-4f6c-bb19-62cc33bae662"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MDQxMWU0Yy04NDEzLTRmNmMtYmIxOS02MmNjMzNiYWU2NjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MjY1LCJpYXQiOjE3OTMzNDczNjUsImp0aSI6IjVlMjQ2NGJmLTc1ZTgtNDJiYS05ZGJmLTRmOGUzNGFmNzk5MiIsInNpZCI6Ijk0Mzg3ZWEyLTExM2YtNGIwYy1hZTlmLTMyMTBlMDA2NTBkNyJ9.hSelFark8m4qZlN1AqL8kjEhZE_oa-yLKKgG7YBdGxI",
  "access_expires_at": "2026-10-30T08:17:45.693061152Z",
  "refresh_token": "qZXdyni-MM3rjJ_ftK7Ph-UrRxukvG_KKghSo0RSOCs",
  "refresh_expires_at": "2026-11-29T08:02:45.692656225Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "efb50d24-e349-4da7-b64c-20c39193440c",
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
  "id": "c4b75615-ae8d-4703-aabb-d2978ed73537",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:07:45.915177Z",
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
  "command_id": "8ced19e5-8889-412b-b626-d98708088e60",
  "quote_id": "c4b75615-ae8d-4703-aabb-d2978ed73537",
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
  "id": "6f8e904f-4bfd-49e9-8f92-93e0598fc98c",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "70411e4c-8413-4f6c-bb19-62cc33bae662",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:02:46.142855Z",
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
    "id": "3a5e7c95-4db0-4057-9042-4c25ee2eb504",
    "order_id": "6f8e904f-4bfd-49e9-8f92-93e0598fc98c",
    "expires_at": "2026-10-30T08:03:01.145338Z",
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

`POST /api/driver/v1/offers/3a5e7c95-4db0-4057-9042-4c25ee2eb504/reject` → **204**

```json
{
  "command_id": "1d6d91b8-d531-4730-b76d-91b1c3a0bf04"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "ce6dc971-2ff3-4f04-9aa8-28125efaf291",
    "order_id": "6f8e904f-4bfd-49e9-8f92-93e0598fc98c",
    "expires_at": "2026-10-30T08:03:01.621199Z",
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

`POST /api/driver/v1/offers/ce6dc971-2ff3-4f04-9aa8-28125efaf291/accept` → **200**

```json
{
  "command_id": "d86c4fc0-c2a0-4cbf-b160-2fce195c6a6b"
}
```

```json
{
  "id": "15a3087b-11c9-42f4-9835-3839964f7cd1",
  "order_id": "6f8e904f-4bfd-49e9-8f92-93e0598fc98c",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "df2771b8-0620-42aa-a3f9-6e8d8104c43a",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/6f8e904f-4bfd-49e9-8f92-93e0598fc98c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:02:46.143246Z",
      "actor": {
        "type": "CLIENT",
        "id": "70411e4c-8413-4f6c-bb19-62cc33bae662",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "6f8e904f-4bfd-49e9-8f92-93e0598fc98c",
        "quote_id": "c4b75615-ae8d-4703-aabb-d2978ed73537",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "49548608-e2d8-4730-a945-0b5159dff446"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:02:46.144795Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6f8e904f-4bfd-49e9-8f92-93e0598fc98c",
        "attempt_id": "3cc2e141-a80c-44aa-ae6d-6c8ea0603581",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "49548608-e2d8-4730-a945-0b5159dff446"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T08:02:46.149275Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "3a5e7c95-4db0-4057-9042-4c25ee2eb504",
        "order_id": "6f8e904f-4bfd-49e9-8f92-93e0598fc98c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "49548608-e2d8-4730-a945-0b5159dff446"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T08:02:46.62032Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "3a5e7c95-4db0-4057-9042-4c25ee2eb504",
        "order_id": "6f8e904f-4bfd-49e9-8f92-93e0598fc98c"
      },
      "correlation_id": "f12f1201-cafd-4e53-87a0-02e17787790b"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 6f8e904f-4bfd-49e9-8f92-93e0598fc98c — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/6f8e904f-4bfd-49e9-8f92-93e0598fc98c` → **200**

```json
{
  "id": "6f8e904f-4bfd-49e9-8f92-93e0598fc98c",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "70411e4c-8413-4f6c-bb19-62cc33bae662",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "15a3087b-11c9-42f4-9835-3839964f7cd1",
    "order_id": "6f8e904f-4bfd-49e9-8f92-93e0598fc98c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "df2771b8-0620-42aa-a3f9-6e8d8104c43a",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T08:02:46.142855Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/6f8e904f-4bfd-49e9-8f92-93e0598fc98c/cancel` → **200**

```json
{
  "command_id": "11066096-6302-4868-bb2e-4c9e02c26e7e",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "6f8e904f-4bfd-49e9-8f92-93e0598fc98c",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "70411e4c-8413-4f6c-bb19-62cc33bae662",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "15a3087b-11c9-42f4-9835-3839964f7cd1",
    "order_id": "6f8e904f-4bfd-49e9-8f92-93e0598fc98c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "df2771b8-0620-42aa-a3f9-6e8d8104c43a",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T08:02:46.142855Z",
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
  "session_id": "9f07a63a-f25b-4554-b5b7-35757013c45b",
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
  "last_heartbeat_at": "2026-10-30T08:02:43.066196Z",
  "last_location_at": "2026-10-30T08:02:43.066196Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9f07a63a-f25b-4554-b5b7-35757013c45b/close` → **200**

```json
{
  "command_id": "55e03013-b30d-4010-91b2-0e9c416f9df5",
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
  "session_id": "c6e21b4e-5aaf-4e5e-9a80-c30430cdf9db",
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
  "last_heartbeat_at": "2026-10-30T08:02:44.239709Z",
  "last_location_at": "2026-10-30T08:02:44.239709Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c6e21b4e-5aaf-4e5e-9a80-c30430cdf9db/close` → **200**

```json
{
  "command_id": "7c0e82dd-6c31-4a62-ae00-8e5a03229aa0",
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
  "session_id": "5f66e348-18a5-4877-b172-2a6f654f1758",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgyNjksImlhdCI6MTc5MzM0NzM2OSwianRpIjoiMmFhZTExZWQtMjhlYy00NWU5LTllMjUtNjcwNDEzYjgxNDVmIiwic2lkIjoiNWY2NmUzNDgtMThhNS00ODc3LWIxNzItMmE2ZjY1NGYxNzU4In0.yNfJMPvDson7NftT2LVCivorPSTOhceY-URV01-BdX0",
  "access_expires_at": "2026-10-30T08:17:49.055621376Z",
  "refresh_token": "YIV8O3vQ0wgnrbFI6aPinBc1SRYjgT-hGq0eldmKa78",
  "refresh_expires_at": "2026-10-30T20:02:49.055077815Z",
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
  "command_id": "bcbdf1df-8221-498f-b338-bef464a9a112",
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
  "changed_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T08:02:49.525809Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "e00e89aa-5b65-4d12-a365-cc2972c29d88",
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
  "correlation_id": "eddf2ccb-a709-44c4-8557-c193f022639c"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "a1e6cd39-30e0-4c75-8dcc-9c448f9a7d2c",
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
  "correlation_id": "fcf1a5fe-a0d1-44c5-bcc6-c999a6b00f71"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630904249",
  "device_ref": "sandbox-9048"
}
```

```json
{
  "challenge_id": "eadc7d16-7d05-4da3-92ab-9952a03c42c9",
  "expires_at": "2026-10-30T08:07:50.239616469Z",
  "resend_available_at": "2026-10-30T08:02:51.239616469Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630904249` → **200**

```json
{
  "phone": "+380630904249",
  "audience": "CLIENT",
  "code": "835104",
  "sent_at": "2026-10-30T08:02:50.242034862Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eadc7d16-7d05-4da3-92ab-9952a03c42c9",
  "code": "835104",
  "device_ref": "sandbox-9048"
}
```

```json
{
  "session_id": "03d85795-edb8-4739-aa99-2bd36670f1b5",
  "subject": {
    "type": "CLIENT",
    "id": "cdf8ec18-c677-4046-8d23-32b8d160f052"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZGY4ZWMxOC1jNjc3LTQwNDYtOGQyMy0zMmI4ZDE2MGYwNTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MjcwLCJpYXQiOjE3OTMzNDczNzAsImp0aSI6IjY4NjVjZTdkLTIyMmMtNGMwNi05NWM5LWEyMjg1OTkzOTY5ZCIsInNpZCI6IjAzZDg1Nzk1LWVkYjgtNDczOS1hYTk5LTJiZDM2NjcwZjFiNSJ9.gu1gPJZjj8cyyUiZOtUiyCLrNGN9BrPV9C6VcavWxqw",
  "access_expires_at": "2026-10-30T08:17:50.49842421Z",
  "refresh_token": "FRvpM_-e_N81SfYL5qJrBZy1Ti0lhxar3-HTRzUGWoQ",
  "refresh_expires_at": "2026-11-29T08:02:50.497985924Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c141eca8-d252-4bec-953e-945fc54b3f1f",
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
  "id": "22f169f7-bf77-45f9-b3c6-6a2ede192ec0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:07:50.729551Z",
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
  "command_id": "dbf2acc4-91e8-4988-9cd4-5a6e3e1dd99c",
  "quote_id": "22f169f7-bf77-45f9-b3c6-6a2ede192ec0",
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
  "correlation_id": "75c402e8-34f9-4e3b-9f63-6cf02a8c9b5c"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "5f703d06-6314-428e-b778-d21fffeb1e5c",
  "quote_id": "22f169f7-bf77-45f9-b3c6-6a2ede192ec0",
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
  "id": "034a0044-4866-4c00-981d-c45c0240932c",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cdf8ec18-c677-4046-8d23-32b8d160f052",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:02:51.196387Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/034a0044-4866-4c00-981d-c45c0240932c/cancel` → **200**

```json
{
  "command_id": "07abdfcc-230b-4b94-b1c9-595971520180",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "034a0044-4866-4c00-981d-c45c0240932c",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "cdf8ec18-c677-4046-8d23-32b8d160f052",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:02:51.196387Z",
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
  "command_id": "6b1abba9-851d-47b5-99e0-0b5347ffc778",
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
  "changed_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T08:02:51.686807Z"
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
      "changed_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T08:02:51.686807Z"
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
  "device_ref": "sandbox-6978"
}
```

```json
{
  "challenge_id": "9045a424-a393-476d-af42-fc244be4282f",
  "expires_at": "2026-10-30T08:07:52.476396167Z",
  "resend_available_at": "2026-10-30T08:02:53.476396167Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "993436",
  "sent_at": "2026-10-30T08:02:52.479427699Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9045a424-a393-476d-af42-fc244be4282f",
  "code": "993436",
  "device_ref": "sandbox-6978"
}
```

```json
{
  "session_id": "46393121-0afa-48cf-9825-a50f2f4a08da",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODI3MiwiaWF0IjoxNzkzMzQ3MzcyLCJqdGkiOiJhOGU2NGI2OS0xNDdlLTQ0NTgtODk2Mi0xNzBhYTM0ZWE1M2IiLCJzaWQiOiI0NjM5MzEyMS0wYWZhLTQ4Y2YtOTgyNS1hNTBmMmY0YTA4ZGEifQ.XOLzdydCTE-n5jkzhdFhu90lhz5QFkr17oJtbFbcQtQ",
  "access_expires_at": "2026-10-30T08:17:52.7255869Z",
  "refresh_token": "6hBrQdwbrFIaPBQET8fE5hjPqywZYMdEvdOLPKPjgh0",
  "refresh_expires_at": "2026-11-29T08:02:52.725084289Z",
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
  "command_id": "d7a4c743-76c9-4dd5-a31a-10c3c9f74f1e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:02:53Z",
    "sequence": 1793347373187
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34e98546-eede-4612-9639-c94ed70ce422",
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
  "last_heartbeat_at": "2026-10-30T08:02:53.20302Z",
  "last_location_at": "2026-10-30T08:02:53.20302Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679736115",
  "device_ref": "sandbox-25568"
}
```

```json
{
  "challenge_id": "7365ffb5-f974-48ab-b031-e94cc13eda70",
  "expires_at": "2026-10-30T08:07:53.426321713Z",
  "resend_available_at": "2026-10-30T08:02:54.426321713Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679736115` → **200**

```json
{
  "phone": "+380679736115",
  "audience": "CLIENT",
  "code": "278077",
  "sent_at": "2026-10-30T08:02:53.428250019Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7365ffb5-f974-48ab-b031-e94cc13eda70",
  "code": "278077",
  "device_ref": "sandbox-25568"
}
```

```json
{
  "session_id": "0774c519-c29f-44dd-b506-a31ccc846202",
  "subject": {
    "type": "CLIENT",
    "id": "0ffc4846-7985-4112-9178-a70516fcb162"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZmZjNDg0Ni03OTg1LTQxMTItOTE3OC1hNzA1MTZmY2IxNjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MjczLCJpYXQiOjE3OTMzNDczNzMsImp0aSI6ImUwYTU4YzIzLTIwNmQtNGY0Yi1iNjNhLTU4ZGE2MTY5MTNhMSIsInNpZCI6IjA3NzRjNTE5LWMyOWYtNDRkZC1iNTA2LWEzMWNjYzg0NjIwMiJ9.z7sNkI1OAkIeAGx91opA4D3LHxew069n64G2fgPkcSY",
  "access_expires_at": "2026-10-30T08:17:53.675313121Z",
  "refresh_token": "malC7kIgh--cxAxXf8VHGec7__W7rm8bb3Pnz8lKsYc",
  "refresh_expires_at": "2026-11-29T08:02:53.674892562Z",
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
  "command_id": "d080fd1d-1a3c-471d-a2c2-3ebfa9099be2",
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
  "id": "0ba6f666-49da-48ef-a80e-9b0bd1d89f4a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:07:54.113576Z",
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
  "command_id": "dfc24dd8-ea92-468b-a2bf-b304e1b07f81",
  "platform": "ANDROID",
  "token": "sandbox-driver-4a43b05d-de7c-451a-9513-32c63e5fcecc"
}
```

```json
{
  "id": "253424f9-0100-49ce-a5e7-4c725e817457",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T08:02:54.352076Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "b086fc44-68ba-4711-a2f0-100f7a92f2fd",
  "platform": "ANDROID",
  "token": "sandbox-rider-d1e43216-2bf7-4188-965e-86b9d0c5a759"
}
```

```json
{
  "id": "a972c983-1947-4c53-9b84-28cd94a7d0bf",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T08:02:54.575475Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8aa66360-c73d-4edb-84f3-023b1b9a5186",
  "quote_id": "0ba6f666-49da-48ef-a80e-9b0bd1d89f4a",
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
  "id": "ec27ee61-e3ec-45c2-a5fc-be335f364952",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0ffc4846-7985-4112-9178-a70516fcb162",
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
  "created_at": "2026-10-30T08:02:54.821981Z",
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
    "id": "a067a694-4d32-4e49-8940-84101bdcc951",
    "order_id": "ec27ee61-e3ec-45c2-a5fc-be335f364952",
    "expires_at": "2026-10-30T08:03:09.824291Z",
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

`POST /api/driver/v1/offers/a067a694-4d32-4e49-8940-84101bdcc951/accept` → **200**

```json
{
  "command_id": "93d6bc0a-b7d2-4ada-878e-74bb688a9c49"
}
```

```json
{
  "id": "ec705339-d080-4c84-8ad1-b3c8e6513dca",
  "order_id": "ec27ee61-e3ec-45c2-a5fc-be335f364952",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "56ba3911-a285-4c5e-8464-2cde04a9d35a",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T08:02:54.800Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T08:02:54.800Z` → **200**

```json
[
  {
    "at": "2026-10-30T08:02:55.852160323Z",
    "token_suffix": "5fcecc",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_version": "2",
      "order_id": "ec27ee61-e3ec-45c2-a5fc-be335f364952",
      "type": "driver.offer",
      "event_type": "OfferMade",
      "event_id": "f1e1b973-5ddd-4219-b5a3-de5f672f19c1"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380679736115&after=2026-10-30T08:02:54.800Z` → **200**

```json
[
  {
    "at": "2026-10-30T08:02:55.912579428Z",
    "token_suffix": "c5a759",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_version": "3",
      "order_id": "ec27ee61-e3ec-45c2-a5fc-be335f364952",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted",
      "event_id": "be8738f6-9661-4c76-be06-725d33501936"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/ec27ee61-e3ec-45c2-a5fc-be335f364952/messages` → **201**

```json
{
  "command_id": "0570ae5c-e541-433b-bde0-074688b6c80f",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "7ebd5b68-d36b-479f-b6c1-b2b233e1dedd",
  "order_id": "ec27ee61-e3ec-45c2-a5fc-be335f364952",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T08:02:56.600620382Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "56ba3911-a285-4c5e-8464-2cde04a9d35a",
  "order_id": "ec27ee61-e3ec-45c2-a5fc-be335f364952",
  "assignment_id": "ec705339-d080-4c84-8ad1-b3c8e6513dca",
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

`POST /api/driver/v1/trips/56ba3911-a285-4c5e-8464-2cde04a9d35a/messages` → **201**

```json
{
  "command_id": "624a3039-c0b9-493b-bf22-552f98b306ea",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "d3b191d8-5b6f-425b-9dec-6001763d7259",
  "order_id": "ec27ee61-e3ec-45c2-a5fc-be335f364952",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T08:02:57.034719244Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/ec27ee61-e3ec-45c2-a5fc-be335f364952/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/56ba3911-a285-4c5e-8464-2cde04a9d35a/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380679736115"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/34e98546-eede-4612-9639-c94ed70ce422/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:02:57Z",
    "sequence": 1793347377690
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34e98546-eede-4612-9639-c94ed70ce422",
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
  "last_heartbeat_at": "2026-10-30T08:02:57.706839Z",
  "last_location_at": "2026-10-30T08:02:57.706839Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "56ba3911-a285-4c5e-8464-2cde04a9d35a",
  "order_id": "ec27ee61-e3ec-45c2-a5fc-be335f364952",
  "assignment_id": "ec705339-d080-4c84-8ad1-b3c8e6513dca",
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

`POST /api/driver/v1/trips/56ba3911-a285-4c5e-8464-2cde04a9d35a/arrive` → **200**

```json
{
  "command_id": "d41ab339-a2fd-48e5-ae54-e430d7b42c63",
  "expected_version": 0
}
```

```json
{
  "id": "56ba3911-a285-4c5e-8464-2cde04a9d35a",
  "order_id": "ec27ee61-e3ec-45c2-a5fc-be335f364952",
  "assignment_id": "ec705339-d080-4c84-8ad1-b3c8e6513dca",
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
  "arrived_at": "2026-10-30T08:02:58.154931Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/56ba3911-a285-4c5e-8464-2cde04a9d35a/start` → **200**

```json
{
  "command_id": "6ae98a5e-54b9-4340-aad7-1d9394c2445e",
  "expected_version": 1
}
```

```json
{
  "id": "56ba3911-a285-4c5e-8464-2cde04a9d35a",
  "order_id": "ec27ee61-e3ec-45c2-a5fc-be335f364952",
  "assignment_id": "ec705339-d080-4c84-8ad1-b3c8e6513dca",
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
  "arrived_at": "2026-10-30T08:02:58.154931Z",
  "started_at": "2026-10-30T08:02:58.386995Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/34e98546-eede-4612-9639-c94ed70ce422/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:02:58Z",
    "sequence": 1793347378606
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34e98546-eede-4612-9639-c94ed70ce422",
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
  "last_heartbeat_at": "2026-10-30T08:02:58.622948Z",
  "last_location_at": "2026-10-30T08:02:58.622948Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/56ba3911-a285-4c5e-8464-2cde04a9d35a/complete` → **200**

```json
{
  "command_id": "555c02f1-8d2c-475c-9536-9836d0f97261",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:02:58Z",
  "cash_received": true
}
```

```json
{
  "id": "56ba3911-a285-4c5e-8464-2cde04a9d35a",
  "order_id": "ec27ee61-e3ec-45c2-a5fc-be335f364952",
  "assignment_id": "ec705339-d080-4c84-8ad1-b3c8e6513dca",
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
  "arrived_at": "2026-10-30T08:02:58.154931Z",
  "started_at": "2026-10-30T08:02:58.386995Z",
  "completed_at": "2026-10-30T08:02:58.861224Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/ec27ee61-e3ec-45c2-a5fc-be335f364952` → **200**

```json
{
  "id": "ec27ee61-e3ec-45c2-a5fc-be335f364952",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "0ffc4846-7985-4112-9178-a70516fcb162",
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
    "id": "ec705339-d080-4c84-8ad1-b3c8e6513dca",
    "order_id": "ec27ee61-e3ec-45c2-a5fc-be335f364952",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "56ba3911-a285-4c5e-8464-2cde04a9d35a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:02:54.821981Z",
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
    "id": "ec27ee61-e3ec-45c2-a5fc-be335f364952",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-30T08:02:54.821981Z",
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
    "id": "56ba3911-a285-4c5e-8464-2cde04a9d35a",
    "order_id": "ec27ee61-e3ec-45c2-a5fc-be335f364952",
    "order_short_number": 13,
    "created_at": "2026-10-30T08:02:55.291306Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "34288792-8916-49a1-89d7-1f28a10259e7",
    "order_id": "3a54d31a-67bf-4c96-8319-6122d280eef8",
    "order_short_number": 8,
    "created_at": "2026-10-30T08:01:52.69936Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "851869e3-cb42-416e-bb67-21e85a42b2a4",
    "order_id": "a34ff315-6b44-4b74-95bd-236632b36d2a",
    "order_short_number": 3,
    "created_at": "2026-10-30T08:01:13.28966Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "7bab5981-bad7-44a4-8155-8cdc718638b1",
    "order_id": "e3b91a1b-3aef-4d82-8342-441716261011",
    "order_short_number": 2,
    "created_at": "2026-10-30T08:01:00.330108Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "11f424e4-b369-4c12-a883-0ceeea21ef7f",
    "order_id": "d46ef90c-23ab-4196-9908-b2085571b502",
    "order_short_number": 1,
    "created_at": "2026-10-30T08:00:52.502284Z",
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

`GET /api/rider/v1/orders/ec27ee61-e3ec-45c2-a5fc-be335f364952/tip` → **200**

```json
{
  "order_id": "ec27ee61-e3ec-45c2-a5fc-be335f364952",
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
  "available_until": "2026-10-31T08:02:58.861224Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/ec27ee61-e3ec-45c2-a5fc-be335f364952/tip` → **201**

```json
{
  "command_id": "df4e05f3-9d04-4323-b95d-cd310645d2ab",
  "amount_minor": 1100
}
```

```json
{
  "id": "f931cbb3-2b0b-4527-a5ed-5c9d5c06e5d3",
  "order_id": "ec27ee61-e3ec-45c2-a5fc-be335f364952",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T08:03:03.552209Z"
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
  "session_id": "dd00342e-1b45-4dcc-a604-2e2186b3f931",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgyODQsImlhdCI6MTc5MzM0NzM4NCwianRpIjoiMGJmYWI3YjgtN2ZjMi00ZTYwLWIwYjItZjk1ODcwZWUyMzM4Iiwic2lkIjoiZGQwMDM0MmUtMWI0NS00ZGNjLWE2MDQtMmUyMTg2YjNmOTMxIn0.7PCvRjks1OHgzJ9CX4cT0BaeRrBIsZG9ZtljKNM0oKM",
  "access_expires_at": "2026-10-30T08:18:04.0369155Z",
  "refresh_token": "hxmr_FFKRKNmENRYAAFwbI63mdtKq0kwpUjKheS1RRY",
  "refresh_expires_at": "2026-10-30T20:03:04.036448542Z",
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
          "CARD": 2,
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
      "CARD": 2,
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
  "generated_at": "2026-10-30T08:03:04.263666322Z"
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
  "generated_at": "2026-10-30T08:03:04.487324778Z"
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
  "session_id": "847500eb-4c15-4e09-b279-6fb46121afaf",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgyODQsImlhdCI6MTc5MzM0NzM4NCwianRpIjoiY2Y3N2MyNzUtMjY0MS00ZTQ4LWE4NmItYmRjODRmNTU3NTIwIiwic2lkIjoiODQ3NTAwZWItNGMxNS00ZTA5LWIyNzktNmZiNDYxMjFhZmFmIn0.spIY2waZ9xMYtqh54jCcaTAMJANDdDYuj3IYKDXtBMA",
  "access_expires_at": "2026-10-30T08:18:04.98033197Z",
  "refresh_token": "z4GTeZMIMwbm6ob7f0hN8FvX4gIWJWJb-us8I3rVC58",
  "refresh_expires_at": "2026-10-30T20:03:04.977193085Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/ec27ee61-e3ec-45c2-a5fc-be335f364952/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:02:54.822384Z",
      "actor": {
        "type": "CLIENT",
        "id": "0ffc4846-7985-4112-9178-a70516fcb162",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "ec27ee61-e3ec-45c2-a5fc-be335f364952",
        "quote_id": "0ba6f666-49da-48ef-a80e-9b0bd1d89f4a",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "6c874de4-f3a9-45a1-bd67-674f62ab7bb7"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:02:54.823762Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ec27ee61-e3ec-45c2-a5fc-be335f364952",
        "attempt_id": "9a4267fc-1c6a-421c-9adc-9a1991c492a6",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "6c874de4-f3a9-45a1-bd67-674f62ab7bb7"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T08:02:54.825852Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a067a694-4d32-4e49-8940-84101bdcc951",
        "order_id": "ec27ee61-e3ec-45c2-a5fc-be335f364952",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "6c874de4-f3a9-45a1-bd67-674f62ab7bb7"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T08:02:55.292583Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "a067a694-4d32-4e49-8940-84101bdcc951",
        "order_id": "ec27ee61-e3ec-45c2-a5fc-be335f364952",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "ec705339-d080-4c84-8ad1-b3c8e6513dca"
      },
      "correlation_id": "126bb637-3ef1-43c9-8579-002cb555546a"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T08:03:05.434527656Z",
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
      "last_location_at": "2026-10-30T08:02:58.622948Z",
      "order_id": null
    }
  ]
}
```

Done: order ec27ee61-e3ec-45c2-a5fc-be335f364952.

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
  "session_id": "21c98534-235a-4c35-b0a9-f4d700c7b9b1",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgyODUsImlhdCI6MTc5MzM0NzM4NSwianRpIjoiN2E2OTYxYmEtOGFhZS00YmU2LWFjNDYtYjIyMGZhYWNhOGViIiwic2lkIjoiMjFjOTg1MzQtMjM1YS00YzM1LWIwYTktZjRkNzAwYzdiOWIxIn0.mX1gvTehsRGjwLVXngFdTtjNySx_wjqUMoBVCh9yLNY",
  "access_expires_at": "2026-10-30T08:18:05.936439854Z",
  "refresh_token": "ETMbPDgwHwYrzK3qXLd2ygIiUM1N3pRJIA-iFpR6dyA",
  "refresh_expires_at": "2026-10-30T20:03:05.935973627Z",
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
  "command_id": "45046219-e2c1-4088-bf83-be799b84ce5c",
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
  "timestamp": "2026-10-30T08:03:06.000+0000",
  "channel": {
    "id": "1730052000.2790026656",
    "linkedid": "1730052000.2790026656",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674285311"
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
  "timestamp": "2026-10-30T08:03:06.000+0000",
  "channel": {
    "id": "1730052000.2790026656",
    "linkedid": "1730052000.2790026656",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674285311"
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
  "session_id": "c3bb3d6f-0443-4e83-b28e-14541364c0ec",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgyODYsImlhdCI6MTc5MzM0NzM4NiwianRpIjoiZDYzYWU3MzctMTRjYi00ODczLWFmM2EtMmExOTlkOTA2ZTljIiwic2lkIjoiYzNiYjNkNmYtMDQ0My00ZTgzLWIyOGUtMTQ1NDEzNjRjMGVjIn0.itjsvnNT-cPl68ZV2gKiVRMmeRaJBHyAmdsJVqpLuyE",
  "access_expires_at": "2026-10-30T08:18:06.904420552Z",
  "refresh_token": "tdIgbtQxrnp2skQRCoDyNcpdqPMIkOaJIQFFHMW82sk",
  "refresh_expires_at": "2026-10-30T20:03:06.903960384Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "0b0adbba-4ef5-4ff5-84a0-2af26ef341b8",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380674285311",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T08:03:06Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/0b0adbba-4ef5-4ff5-84a0-2af26ef341b8/answer` → **200**

```json
{
  "command_id": "680c36cd-a6ab-4e2a-876a-0591c088a817"
}
```

```json
{
  "id": "0b0adbba-4ef5-4ff5-84a0-2af26ef341b8",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380674285311",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "order_ids": [],
  "started_at": "2026-10-30T08:03:06Z",
  "answered_at": "2026-10-30T08:03:07.372643Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2790026656",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "4f3bea58-1e8d-41c4-9d7a-dea45c77f359",
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
  "id": "fc12e9aa-a0d9-439c-bb63-2fa9a952a998",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:08:07.626725Z",
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
  "command_id": "525bbc26-ce19-45a1-9297-89a87836fa11",
  "quote_id": "fc12e9aa-a0d9-439c-bb63-2fa9a952a998",
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
    "phone": "+380674285311"
  },
  "call_id": "0b0adbba-4ef5-4ff5-84a0-2af26ef341b8"
}
```

```json
{
  "id": "d918d63b-1cc5-40f5-8e37-d0441ed8690f",
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
  "created_at": "2026-10-30T08:03:07.865977Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674285311"
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
    "id": "1730052000.2790026656",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "0b0adbba-4ef5-4ff5-84a0-2af26ef341b8",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674285311",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
      "order_ids": [
        "d918d63b-1cc5-40f5-8e37-d0441ed8690f"
      ],
      "started_at": "2026-10-30T08:03:06Z",
      "answered_at": "2026-10-30T08:03:07.372643Z",
      "ended_at": "2026-10-30T08:03:08.119707Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "d102b3de-8fd8-4b2a-b0e6-2df8e0263178",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677937125",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
      "order_ids": [],
      "started_at": "2026-10-30T08:01:07.577461Z",
      "answered_at": "2026-10-30T08:01:07.831061Z",
      "ended_at": "2026-10-30T08:01:08.085591Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T08:01:09.029947Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/d918d63b-1cc5-40f5-8e37-d0441ed8690f` → **200**

```json
{
  "id": "d918d63b-1cc5-40f5-8e37-d0441ed8690f",
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
  "created_at": "2026-10-30T08:03:07.865977Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674285311"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/d918d63b-1cc5-40f5-8e37-d0441ed8690f` → **200**

```json
{
  "id": "d918d63b-1cc5-40f5-8e37-d0441ed8690f",
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
  "created_at": "2026-10-30T08:03:07.865977Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674285311"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d918d63b-1cc5-40f5-8e37-d0441ed8690f/cancel` → **200**

```json
{
  "command_id": "e37c43f6-235f-4f6e-8e81-00a2077574ac",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "d918d63b-1cc5-40f5-8e37-d0441ed8690f",
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
  "created_at": "2026-10-30T08:03:07.865977Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674285311"
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

Done: call 0b0adbba-4ef5-4ff5-84a0-2af26ef341b8 with order d918d63b-1cc5-40f5-8e37-d0441ed8690f.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-24467"
}
```

```json
{
  "challenge_id": "19a06939-e688-49f2-a716-2963d4936d52",
  "expires_at": "2026-10-30T08:08:09.117995837Z",
  "resend_available_at": "2026-10-30T08:03:10.117995837Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "462071",
  "sent_at": "2026-10-30T08:03:09.120326651Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "19a06939-e688-49f2-a716-2963d4936d52",
  "code": "462071",
  "device_ref": "sandbox-24467"
}
```

```json
{
  "session_id": "1017a5a1-4f66-48e3-b7fd-98b692623332",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODI4OSwiaWF0IjoxNzkzMzQ3Mzg5LCJqdGkiOiI2ZjViNjAxNC05YWRhLTQ4NDctOWYwNi0xMjc0OGIwNWFlOTciLCJzaWQiOiIxMDE3YTVhMS00ZjY2LTQ4ZTMtYjdmZC05OGI2OTI2MjMzMzIifQ.7hoa99tOzyl9m5gLSI7Pg7ek35mkFtRf0MejPInc324",
  "access_expires_at": "2026-10-30T08:18:09.361915984Z",
  "refresh_token": "XVUZ5-1wJhu6m7YIDABY0XEhO9lCDT_jREmkFGohq_k",
  "refresh_expires_at": "2026-11-29T08:03:09.361453192Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34e98546-eede-4612-9639-c94ed70ce422",
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
  "last_heartbeat_at": "2026-10-30T08:02:58.622948Z",
  "last_location_at": "2026-10-30T08:02:58.622948Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/34e98546-eede-4612-9639-c94ed70ce422/handover` → **200**

```json
{
  "command_id": "33390072-5d2d-4e90-8896-31e39526fb6f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34e98546-eede-4612-9639-c94ed70ce422",
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
  "last_heartbeat_at": "2026-10-30T08:02:58.622948Z",
  "last_location_at": "2026-10-30T08:02:58.622948Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/34e98546-eede-4612-9639-c94ed70ce422/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:03:10Z",
    "sequence": 1793347390306
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34e98546-eede-4612-9639-c94ed70ce422",
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
  "last_heartbeat_at": "2026-10-30T08:03:10.048184Z",
  "last_location_at": "2026-10-30T08:03:10.048184Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662450257",
  "device_ref": "sandbox-21905"
}
```

```json
{
  "challenge_id": "516b98ae-dd1b-4016-95e4-e2b439a97e38",
  "expires_at": "2026-10-30T08:08:10.264655367Z",
  "resend_available_at": "2026-10-30T08:03:11.264655367Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662450257` → **200**

```json
{
  "phone": "+380662450257",
  "audience": "CLIENT",
  "code": "666781",
  "sent_at": "2026-10-30T08:03:10.26677863Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "516b98ae-dd1b-4016-95e4-e2b439a97e38",
  "code": "666781",
  "device_ref": "sandbox-21905"
}
```

```json
{
  "session_id": "d49a5e35-bdca-4f4b-96db-8b062c5bbda6",
  "subject": {
    "type": "CLIENT",
    "id": "adcf92ca-61df-4608-8461-b24cb54f8c7e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZGNmOTJjYS02MWRmLTQ2MDgtODQ2MS1iMjRjYjU0ZjhjN2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MjkwLCJpYXQiOjE3OTMzNDczOTAsImp0aSI6Ijg1ZTlmYjgyLWEyOTEtNDU2Yy04MmM0LTk4MWU3MWI4YWFiZSIsInNpZCI6ImQ0OWE1ZTM1LWJkY2EtNGY0Yi05NmRiLThiMDYyYzViYmRhNiJ9.A2t-mGe8Qsy6_Vp3YXdWr_noUnhskCCVwEFg0oi2aoI",
  "access_expires_at": "2026-10-30T08:18:10.682864131Z",
  "refresh_token": "mFY9iFybI1MVeuCsarxNFC73I8dIDTtq5v47fUXtkzc",
  "refresh_expires_at": "2026-11-29T08:03:10.682179642Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c2f72a76-6ea5-492f-8485-038e9912343d",
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
  "id": "be083971-9ed8-43e4-b5aa-177bcea6faea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:08:10.915788Z",
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
  "command_id": "4bd95558-b8db-47ba-92ff-e6eacac70b86",
  "quote_id": "be083971-9ed8-43e4-b5aa-177bcea6faea",
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
  "id": "2145a7bf-55e2-4843-a51f-0dbd280b84bc",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "adcf92ca-61df-4608-8461-b24cb54f8c7e",
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
  "created_at": "2026-10-30T08:03:11.154819Z",
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
    "id": "20d67294-8023-4119-93c6-ce6aef79c67c",
    "order_id": "2145a7bf-55e2-4843-a51f-0dbd280b84bc",
    "expires_at": "2026-10-30T08:03:26.157192Z",
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

`POST /api/driver/v1/offers/20d67294-8023-4119-93c6-ce6aef79c67c/accept` → **200**

```json
{
  "command_id": "2fdd7548-237b-4507-88fc-b57a5945429f"
}
```

```json
{
  "id": "0544bd67-ad6f-43d7-b9f9-303236b1dd9f",
  "order_id": "2145a7bf-55e2-4843-a51f-0dbd280b84bc",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a1b89701-e179-4daf-9673-4a9a13b8d1e1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a1b89701-e179-4daf-9673-4a9a13b8d1e1",
  "order_id": "2145a7bf-55e2-4843-a51f-0dbd280b84bc",
  "assignment_id": "0544bd67-ad6f-43d7-b9f9-303236b1dd9f",
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

`POST /api/driver/v1/work-sessions/34e98546-eede-4612-9639-c94ed70ce422/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:03:12Z",
    "sequence": 1793347392547
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34e98546-eede-4612-9639-c94ed70ce422",
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
  "last_heartbeat_at": "2026-10-30T08:03:12.07047Z",
  "last_location_at": "2026-10-30T08:03:12.07047Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a1b89701-e179-4daf-9673-4a9a13b8d1e1/arrive` → **200**

```json
{
  "command_id": "4a5929d3-7ac3-4614-b8bb-d3cb8ec3f6dd",
  "expected_version": 0
}
```

```json
{
  "id": "a1b89701-e179-4daf-9673-4a9a13b8d1e1",
  "order_id": "2145a7bf-55e2-4843-a51f-0dbd280b84bc",
  "assignment_id": "0544bd67-ad6f-43d7-b9f9-303236b1dd9f",
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
  "arrived_at": "2026-10-30T08:03:12.294029Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a1b89701-e179-4daf-9673-4a9a13b8d1e1/start` → **200**

```json
{
  "command_id": "709ab5cb-4f92-429d-b4e5-f5e1e58528c1",
  "expected_version": 1
}
```

```json
{
  "id": "a1b89701-e179-4daf-9673-4a9a13b8d1e1",
  "order_id": "2145a7bf-55e2-4843-a51f-0dbd280b84bc",
  "assignment_id": "0544bd67-ad6f-43d7-b9f9-303236b1dd9f",
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
  "arrived_at": "2026-10-30T08:03:12.294029Z",
  "started_at": "2026-10-30T08:03:12.666539Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/34e98546-eede-4612-9639-c94ed70ce422/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:03:12Z",
    "sequence": 1793347392968
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34e98546-eede-4612-9639-c94ed70ce422",
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
  "last_heartbeat_at": "2026-10-30T08:03:12.984703Z",
  "last_location_at": "2026-10-30T08:03:12.984703Z",
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
  "device_ref": "sandbox-26470"
}
```

```json
{
  "challenge_id": "3a6ac305-7d91-4e06-865d-a818bbc52e64",
  "expires_at": "2026-10-30T08:08:13.315780813Z",
  "resend_available_at": "2026-10-30T08:03:14.315780813Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "094642",
  "sent_at": "2026-10-30T08:03:13.317928517Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3a6ac305-7d91-4e06-865d-a818bbc52e64",
  "code": "094642",
  "device_ref": "sandbox-26470"
}
```

```json
{
  "session_id": "1be59cfd-e54f-4a65-9bf3-06896e0825d9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODI5MywiaWF0IjoxNzkzMzQ3MzkzLCJqdGkiOiJhNmY1MTA1Ni0zYjE5LTRlN2UtOTc2Ni1kMWMyYTllMmFhZDgiLCJzaWQiOiIxYmU1OWNmZC1lNTRmLTRhNjUtOWJmMy0wNjg5NmUwODI1ZDkifQ.g72o2xk6vPlWSkVV3Ebe0qQ4y15IXjnca0bujDFVYhg",
  "access_expires_at": "2026-10-30T08:18:13.565408696Z",
  "refresh_token": "dPlt0ayi9BRBOw79KOKlIcDxVbOdQsOdGOwUkda0Dv0",
  "refresh_expires_at": "2026-11-29T08:03:13.564859131Z",
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
  "command_id": "8211cf61-e54b-4071-8f62-f6dff68dfb43",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:03:14Z",
    "sequence": 1793347394171
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b0e2c3cb-0f8c-44f6-bc52-8d6a3ea9aa86",
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
  "last_heartbeat_at": "2026-10-30T08:03:14.033317Z",
  "last_location_at": "2026-10-30T08:03:14.033317Z",
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
  "session_id": "61aca6fa-67a0-4ce4-9d94-1c559b96c75a",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgyOTQsImlhdCI6MTc5MzM0NzM5NCwianRpIjoiOWZmODUyMjEtNzEwOS00ODFjLTgxNDctZDUxYTZhOTQ5MmY2Iiwic2lkIjoiNjFhY2E2ZmEtNjdhMC00Y2U0LTlkOTQtMWM1NTliOTZjNzVhIn0.K9ZXa5z4VzC4fueXU8-1WmEVKKs-Catpo34SZUr56H8",
  "access_expires_at": "2026-10-30T08:18:14.5176038Z",
  "refresh_token": "siHPtH_DBvi8mKh5_YKb2eYUpNSW0wpK8nHx7hN_VJY",
  "refresh_expires_at": "2026-10-30T20:03:14.517058397Z",
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
  "session_id": "afcf1d88-bf6f-457e-9bec-e41c26fd366e",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgyOTQsImlhdCI6MTc5MzM0NzM5NCwianRpIjoiM2NlZDhkZDUtYTc3OS00YjhiLTgyNjctNGQ0ZmJlM2I2MDUzIiwic2lkIjoiYWZjZjFkODgtYmY2Zi00NTdlLTliZWMtZTQxYzI2ZmQzNjZlIn0.foWWRNYbL8xxu1ZbUNeTTsGUKcDV2TozMeU2XKyUMeQ",
  "access_expires_at": "2026-10-30T08:18:14.997082612Z",
  "refresh_token": "dcgemoIJhDVdSNiSw-rSibE0iI4tGMRQF_QUz5vtPuk",
  "refresh_expires_at": "2026-10-30T20:03:14.996597907Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/2145a7bf-55e2-4843-a51f-0dbd280b84bc` → **200**

```json
{
  "id": "2145a7bf-55e2-4843-a51f-0dbd280b84bc",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "adcf92ca-61df-4608-8461-b24cb54f8c7e",
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
    "id": "0544bd67-ad6f-43d7-b9f9-303236b1dd9f",
    "order_id": "2145a7bf-55e2-4843-a51f-0dbd280b84bc",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "a1b89701-e179-4daf-9673-4a9a13b8d1e1",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T08:03:11.154819Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/2145a7bf-55e2-4843-a51f-0dbd280b84bc/interrupt` → **200**

```json
{
  "command_id": "b87b0764-429d-4aa3-b278-c535830d4793",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "2145a7bf-55e2-4843-a51f-0dbd280b84bc",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "adcf92ca-61df-4608-8461-b24cb54f8c7e",
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
      "id": "0544bd67-ad6f-43d7-b9f9-303236b1dd9f",
      "order_id": "2145a7bf-55e2-4843-a51f-0dbd280b84bc",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "a1b89701-e179-4daf-9673-4a9a13b8d1e1",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T08:03:11.154819Z",
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
    "id": "e7b8fb26-5156-49b5-bf1d-cf717927a3f9",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "adcf92ca-61df-4608-8461-b24cb54f8c7e",
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
    "id": "fee9cddc-b67a-44c7-9c65-9171919e789d",
    "order_id": "e7b8fb26-5156-49b5-bf1d-cf717927a3f9",
    "expires_at": "2026-10-30T08:03:30.47521Z",
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

`POST /api/driver/v1/offers/fee9cddc-b67a-44c7-9c65-9171919e789d/accept` → **200**

```json
{
  "command_id": "d202f0c6-2e0f-44ea-a807-5cec0a7f0d33"
}
```

```json
{
  "id": "7fa4e7e7-053e-4097-ac89-746bad5b2f02",
  "order_id": "e7b8fb26-5156-49b5-bf1d-cf717927a3f9",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "039388b7-eb42-40e9-ac2a-5d7c60d3a54a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "039388b7-eb42-40e9-ac2a-5d7c60d3a54a",
  "order_id": "e7b8fb26-5156-49b5-bf1d-cf717927a3f9",
  "assignment_id": "7fa4e7e7-053e-4097-ac89-746bad5b2f02",
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
  "session_id": "b0e2c3cb-0f8c-44f6-bc52-8d6a3ea9aa86",
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
  "last_heartbeat_at": "2026-10-30T08:03:14.033317Z",
  "last_location_at": "2026-10-30T08:03:14.033317Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/b0e2c3cb-0f8c-44f6-bc52-8d6a3ea9aa86/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:03:16Z",
    "sequence": 1793347396628
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b0e2c3cb-0f8c-44f6-bc52-8d6a3ea9aa86",
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
  "last_heartbeat_at": "2026-10-30T08:03:16.644247Z",
  "last_location_at": "2026-10-30T08:03:16.644247Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/039388b7-eb42-40e9-ac2a-5d7c60d3a54a/arrive` → **200**

```json
{
  "command_id": "92f710c1-19b4-41a6-b216-ba8e814b1b66",
  "expected_version": 0
}
```

```json
{
  "id": "039388b7-eb42-40e9-ac2a-5d7c60d3a54a",
  "order_id": "e7b8fb26-5156-49b5-bf1d-cf717927a3f9",
  "assignment_id": "7fa4e7e7-053e-4097-ac89-746bad5b2f02",
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
  "arrived_at": "2026-10-30T08:03:16.875124Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/039388b7-eb42-40e9-ac2a-5d7c60d3a54a/start` → **200**

```json
{
  "command_id": "6c5aea0b-aa47-4eff-aefd-3d7e33a3192e",
  "expected_version": 1
}
```

```json
{
  "id": "039388b7-eb42-40e9-ac2a-5d7c60d3a54a",
  "order_id": "e7b8fb26-5156-49b5-bf1d-cf717927a3f9",
  "assignment_id": "7fa4e7e7-053e-4097-ac89-746bad5b2f02",
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
  "arrived_at": "2026-10-30T08:03:16.875124Z",
  "started_at": "2026-10-30T08:03:17.110281Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/039388b7-eb42-40e9-ac2a-5d7c60d3a54a/complete` → **200**

```json
{
  "command_id": "06da2bf2-ebc0-426e-9126-28defa357ebd",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:03:17Z"
}
```

```json
{
  "id": "039388b7-eb42-40e9-ac2a-5d7c60d3a54a",
  "order_id": "e7b8fb26-5156-49b5-bf1d-cf717927a3f9",
  "assignment_id": "7fa4e7e7-053e-4097-ac89-746bad5b2f02",
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
  "arrived_at": "2026-10-30T08:03:16.875124Z",
  "started_at": "2026-10-30T08:03:17.110281Z",
  "completed_at": "2026-10-30T08:03:17.368243Z",
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
    "id": "e7b8fb26-5156-49b5-bf1d-cf717927a3f9",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-30T08:03:15.467124Z",
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
    "id": "2145a7bf-55e2-4843-a51f-0dbd280b84bc",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-30T08:03:11.154819Z",
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

`GET /api/operator/v1/orders/2145a7bf-55e2-4843-a51f-0dbd280b84bc/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:03:11.155247Z",
      "actor": {
        "type": "CLIENT",
        "id": "adcf92ca-61df-4608-8461-b24cb54f8c7e",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2145a7bf-55e2-4843-a51f-0dbd280b84bc",
        "quote_id": "be083971-9ed8-43e4-b5aa-177bcea6faea",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "f4467e5d-80a4-4843-a47e-faee5dc64539"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:03:11.156652Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2145a7bf-55e2-4843-a51f-0dbd280b84bc",
        "attempt_id": "04f81f9c-2481-4b13-b362-e875bd3a72c2",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f4467e5d-80a4-4843-a47e-faee5dc64539"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T08:03:11.158632Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "20d67294-8023-4119-93c6-ce6aef79c67c",
        "order_id": "2145a7bf-55e2-4843-a51f-0dbd280b84bc",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "f4467e5d-80a4-4843-a47e-faee5dc64539"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T08:03:11.612815Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "20d67294-8023-4119-93c6-ce6aef79c67c",
        "order_id": "2145a7bf-55e2-4843-a51f-0dbd280b84bc",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "0544bd67-ad6f-43d7-b9f9-303236b1dd9f"
      },
      "correlation_id": "7d92d0ea-10f5-46dc-a633-cc8c0d692770"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/e7b8fb26-5156-49b5-bf1d-cf717927a3f9/tip` → **200**

```json
{
  "order_id": "e7b8fb26-5156-49b5-bf1d-cf717927a3f9",
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
  "available_until": "2026-10-31T08:03:17.368243Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/e7b8fb26-5156-49b5-bf1d-cf717927a3f9/tip` → **409**

```json
{
  "command_id": "71409ac8-f091-4d08-9aec-4b186b231e54",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/e7b8fb26-5156-49b5-bf1d-cf717927a3f9/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "8956eac3-5532-404e-b59a-2a438cdd1f37"
}
```

Done: interrupted 2145a7bf-55e2-4843-a51f-0dbd280b84bc, follow-up e7b8fb26-5156-49b5-bf1d-cf717927a3f9.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34e98546-eede-4612-9639-c94ed70ce422",
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
  "last_heartbeat_at": "2026-10-30T08:03:12.984703Z",
  "last_location_at": "2026-10-30T08:03:12.984703Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/34e98546-eede-4612-9639-c94ed70ce422/close` → **200**

```json
{
  "command_id": "e429171b-723a-40a0-93df-dab77e9551be",
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
  "session_id": "b0e2c3cb-0f8c-44f6-bc52-8d6a3ea9aa86",
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
  "last_heartbeat_at": "2026-10-30T08:03:16.644247Z",
  "last_location_at": "2026-10-30T08:03:16.644247Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b0e2c3cb-0f8c-44f6-bc52-8d6a3ea9aa86/close` → **200**

```json
{
  "command_id": "b1faa78a-0a6f-4f4e-a48b-0b4cd2d67d34",
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
  "session_id": "5a2000e0-0d27-40cb-84f5-694551295541",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgzMDMsImlhdCI6MTc5MzM0NzQwMywianRpIjoiZTFjNWYxNzAtYTlhZS00ODI1LThhYWEtMWZiNTZkMjUxZDk3Iiwic2lkIjoiNWEyMDAwZTAtMGQyNy00MGNiLTg0ZjUtNjk0NTUxMjk1NTQxIn0.OKDjqNzoZGQ_EIIL9PNLMU076vwmYAWkEWx13pKKR14",
  "access_expires_at": "2026-10-30T08:18:23.037779201Z",
  "refresh_token": "7RYz9XGyML_CHiaSQkvD8VBTphvkAxKPajc8pVnnaFY",
  "refresh_expires_at": "2026-10-30T20:03:23.037197925Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "c0b009e4-bb58-4c71-bdb6-a275ec9aae2c",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T08:03:23Z"
}
```

```json
{
  "id": "a94cb234-4e32-4fde-a7b1-58cf9a45d8ec",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T08:03:23Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/a94cb234-4e32-4fde-a7b1-58cf9a45d8ec/publish` → **200**

```json
{
  "command_id": "ea4a7913-b3fd-4dad-a1f3-57a20fe153c4",
  "expected_version": 0
}
```

```json
{
  "id": "a94cb234-4e32-4fde-a7b1-58cf9a45d8ec",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T08:03:23.553018Z",
  "published_at": "2026-10-30T08:03:23.553018Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "a94cb234-4e32-4fde-a7b1-58cf9a45d8ec",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T08:03:23.553018Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631176021",
  "device_ref": "sandbox-1994"
}
```

```json
{
  "challenge_id": "ce8a1758-2b1c-4744-84e4-1353e4a84bd4",
  "expires_at": "2026-10-30T08:08:24.004985552Z",
  "resend_available_at": "2026-10-30T08:03:25.004985552Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631176021` → **200**

```json
{
  "phone": "+380631176021",
  "audience": "CLIENT",
  "code": "837496",
  "sent_at": "2026-10-30T08:03:24.006981583Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ce8a1758-2b1c-4744-84e4-1353e4a84bd4",
  "code": "837496",
  "device_ref": "sandbox-1994"
}
```

```json
{
  "session_id": "9b669637-1dd9-41d4-a6af-f48c061a322b",
  "subject": {
    "type": "CLIENT",
    "id": "fe1fb9b3-4b59-476c-8725-b808a716db96"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZTFmYjliMy00YjU5LTQ3NmMtODcyNS1iODA4YTcxNmRiOTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MzA0LCJpYXQiOjE3OTMzNDc0MDQsImp0aSI6ImYxOTUxYzMxLTUzYTUtNGI4Yi05M2M0LWMwMDBiNjU2ZWI2OCIsInNpZCI6IjliNjY5NjM3LTFkZDktNDFkNC1hNmFmLWY0OGMwNjFhMzIyYiJ9.fnAd_SIn7rHSryimpxBBXTvJxR09d2ZZRuX-TzvIRyc",
  "access_expires_at": "2026-10-30T08:18:24.335003181Z",
  "refresh_token": "vlGUmS8AcIG6CTbHdY8ORmZ_LLbZjTrIVTC93wLKuuA",
  "refresh_expires_at": "2026-11-29T08:03:24.334563668Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "a94cb234-4e32-4fde-a7b1-58cf9a45d8ec",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T08:03:23.553018Z",
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
  "command_id": "212e86aa-1c9e-41a6-b9c5-0c74aef4bd69",
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
  "id": "5b320128-9759-4b24-aaf1-f92130e7fb2f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:08:24.781340Z",
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
  "command_id": "2ff2938a-3dcd-4a9c-a9dc-4db97652c741",
  "quote_id": "5b320128-9759-4b24-aaf1-f92130e7fb2f",
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
  "correlation_id": "1a368f84-f940-4e47-b85f-e992719a2ac8"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "af985df5-2766-4e98-b6fd-22fad6f5503d",
  "version_id": "a94cb234-4e32-4fde-a7b1-58cf9a45d8ec",
  "language": "uk"
}
```

```json
{
  "version_id": "a94cb234-4e32-4fde-a7b1-58cf9a45d8ec",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T08:03:25.284589Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "36afceee-e600-4117-9d7e-82bedbd578c6",
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
  "id": "ea9198b6-2591-4a17-ac31-fac0695a734d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:08:25.518085Z",
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
  "command_id": "4b731cd1-58e6-42ba-88e6-2e8a9a3ebac8",
  "quote_id": "ea9198b6-2591-4a17-ac31-fac0695a734d",
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
  "id": "f7f80124-2875-4038-823a-e16486514b8d",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fe1fb9b3-4b59-476c-8725-b808a716db96",
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
  "created_at": "2026-10-30T08:03:25.753892Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7f80124-2875-4038-823a-e16486514b8d` → **200**

```json
{
  "id": "f7f80124-2875-4038-823a-e16486514b8d",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fe1fb9b3-4b59-476c-8725-b808a716db96",
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
  "created_at": "2026-10-30T08:03:25.753892Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f7f80124-2875-4038-823a-e16486514b8d/cancel` → **200**

```json
{
  "command_id": "93a8f665-344e-4995-b290-8934ba27b9ba",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f7f80124-2875-4038-823a-e16486514b8d",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fe1fb9b3-4b59-476c-8725-b808a716db96",
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
  "created_at": "2026-10-30T08:03:25.753892Z",
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

`POST /api/admin/v1/legal-documents/a94cb234-4e32-4fde-a7b1-58cf9a45d8ec` → **409**

```json
{
  "command_id": "28149335-febf-4d41-9a3e-d00b4d077b8c",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T08:03:26Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/a94cb234-4e32-4fde-a7b1-58cf9a45d8ec",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "bd3deae0-643e-43b2-ab24-397711091c0e"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "5902ff25-f0a1-4f78-a7b5-7cd8e3127b15",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T08:03:26Z"
}
```

```json
{
  "id": "c8b11abc-f5ad-4aa2-b183-f51f41b74db7",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T08:03:26Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/c8b11abc-f5ad-4aa2-b183-f51f41b74db7/publish` → **200**

```json
{
  "command_id": "a80f6498-21ae-4281-9aaa-42d311731c21",
  "expected_version": 0
}
```

```json
{
  "id": "c8b11abc-f5ad-4aa2-b183-f51f41b74db7",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T08:03:26.948023Z",
  "published_at": "2026-10-30T08:03:26.948023Z",
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
  "device_ref": "sandbox-14238"
}
```

```json
{
  "challenge_id": "781255a1-d840-446c-9060-e764c4f2de16",
  "expires_at": "2026-10-30T08:08:27.175999119Z",
  "resend_available_at": "2026-10-30T08:03:28.175999119Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "472060",
  "sent_at": "2026-10-30T08:03:27.178134366Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "781255a1-d840-446c-9060-e764c4f2de16",
  "code": "472060",
  "device_ref": "sandbox-14238"
}
```

```json
{
  "session_id": "32fdf7b7-4343-44dd-a1c7-1ec0519d7a41",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODMwNywiaWF0IjoxNzkzMzQ3NDA3LCJqdGkiOiIwNjI2MzMwNy1jN2JkLTQyNDItODU1NS0xZjMwYzkwYTUyYzMiLCJzaWQiOiIzMmZkZjdiNy00MzQzLTQ0ZGQtYTFjNy0xZWMwNTE5ZDdhNDEifQ.JDTSamB39HYbGaz4lMX3-bysA0XX4zTXv3rvjVcRuok",
  "access_expires_at": "2026-10-30T08:18:27.421289221Z",
  "refresh_token": "sb2uiQ871GmLdN6ZTaAUyC__kO_YEDbo8e8qYIbOHh4",
  "refresh_expires_at": "2026-11-29T08:03:27.420780375Z",
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
  "command_id": "36297e1a-e02f-4c94-b313-c00d3da470b1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:03:27Z",
    "sequence": 1793347407856
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5926471f-fe55-43be-9b85-06023997223c",
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
  "last_heartbeat_at": "2026-10-30T08:03:27.87282Z",
  "last_location_at": "2026-10-30T08:03:27.87282Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672991577",
  "device_ref": "sandbox-1387"
}
```

```json
{
  "challenge_id": "33c9095b-3f1c-4d02-be7c-527c449f7589",
  "expires_at": "2026-10-30T08:08:28.093456965Z",
  "resend_available_at": "2026-10-30T08:03:29.093456965Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672991577` → **200**

```json
{
  "phone": "+380672991577",
  "audience": "CLIENT",
  "code": "884264",
  "sent_at": "2026-10-30T08:03:28.095520726Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "33c9095b-3f1c-4d02-be7c-527c449f7589",
  "code": "884264",
  "device_ref": "sandbox-1387"
}
```

```json
{
  "session_id": "702ad724-2ce1-4eec-8e7c-4a9556d5c17f",
  "subject": {
    "type": "CLIENT",
    "id": "b021af32-26cb-4046-a1da-a84bd00b4134"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMDIxYWYzMi0yNmNiLTQwNDYtYTFkYS1hODRiZDAwYjQxMzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MzA4LCJpYXQiOjE3OTMzNDc0MDgsImp0aSI6IjQwMWE4MTFlLTFlOGEtNDhmNC1iYzkxLWQwYTkwNjY0MWFkNSIsInNpZCI6IjcwMmFkNzI0LTJjZTEtNGVlYy04ZTdjLTRhOTU1NmQ1YzE3ZiJ9.Ya3hG1OAA1gE2uZV6nIC1hOCgeJfygyBLWlrgQ4Y1og",
  "access_expires_at": "2026-10-30T08:18:28.346934265Z",
  "refresh_token": "p_XHc3vxN0EohFR_rU1V8xTruSkEeXoUj2rPWbJEtUk",
  "refresh_expires_at": "2026-11-29T08:03:28.346517611Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9b976930-0e97-4b53-a7a1-3a29573a2276",
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
  "id": "4169def7-e717-4753-a8a1-4202d26f0f12",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:08:28.575292Z",
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
  "command_id": "c52ba8b5-0683-469f-aaa4-5b30c8a92de8",
  "quote_id": "4169def7-e717-4753-a8a1-4202d26f0f12",
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
    "phone": "+380678561784"
  }
}
```

```json
{
  "id": "bdce0c4c-9d6d-4626-b099-f378275e706a",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b021af32-26cb-4046-a1da-a84bd00b4134",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:03:28.877945Z",
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
    "id": "02e2f79e-c4f2-4093-ab98-0dfa53b888ae",
    "order_id": "bdce0c4c-9d6d-4626-b099-f378275e706a",
    "expires_at": "2026-10-30T08:03:43.880221Z",
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

`POST /api/driver/v1/offers/02e2f79e-c4f2-4093-ab98-0dfa53b888ae/accept` → **200**

```json
{
  "command_id": "c735b1be-84ca-4e6c-9ce4-f95fe641154a"
}
```

```json
{
  "id": "96ba499f-72f1-4ddf-85f2-4357a82d6a0a",
  "order_id": "bdce0c4c-9d6d-4626-b099-f378275e706a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e0040676-8ddc-4e56-94f4-555cfdb671b9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e0040676-8ddc-4e56-94f4-555cfdb671b9",
  "order_id": "bdce0c4c-9d6d-4626-b099-f378275e706a",
  "assignment_id": "96ba499f-72f1-4ddf-85f2-4357a82d6a0a",
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
    "phone": "+380678561784"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0905d4b8-b34d-4bda-ba82-8bee60ba3251",
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
  "id": "206db0b7-5810-4fdf-9718-dec3e20c1281",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:08:30.089396Z",
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
  "command_id": "53b48688-becf-4a11-8b0d-a01e53e65054",
  "quote_id": "206db0b7-5810-4fdf-9718-dec3e20c1281",
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
  "id": "75448313-8c5d-4253-9b15-f1c51626a8c8",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b021af32-26cb-4046-a1da-a84bd00b4134",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:03:30.510507Z",
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
  "command_id": "d9ca8154-5137-4a2f-b7b5-09c602884a2f",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T11:03:30Z"
}
```

```json
{
  "id": "ade788e0-4080-4d54-a961-5829947d472c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:08:30.823941Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T11:03:30Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8c545112-b0aa-47fd-bef0-e8321769c9e8",
  "quote_id": "ade788e0-4080-4d54-a961-5829947d472c",
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
  "pickup_at": "2026-10-30T11:03:30Z"
}
```

```json
{
  "id": "d0bef373-e8e3-4b63-82cc-c15ead78b0d1",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b021af32-26cb-4046-a1da-a84bd00b4134",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T08:03:31.051823Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T11:03:30Z",
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
  "command_id": "20a4f14a-18b7-456b-97f8-be3b2a5ef9ee",
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
  "id": "cbbf9f01-27a7-4073-93a2-4df4a442d568",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:08:31.295537Z",
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
  "command_id": "580a76c3-40c5-45fd-bbca-edc5ee5af172",
  "quote_id": "cbbf9f01-27a7-4073-93a2-4df4a442d568",
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
  "correlation_id": "75b479e1-33b8-4e97-a2f1-01b70d378655"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "d0bef373-e8e3-4b63-82cc-c15ead78b0d1",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "b021af32-26cb-4046-a1da-a84bd00b4134",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T08:03:31.051823Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T11:03:30Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "75448313-8c5d-4253-9b15-f1c51626a8c8",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "b021af32-26cb-4046-a1da-a84bd00b4134",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T08:03:30.510507Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "bdce0c4c-9d6d-4626-b099-f378275e706a",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "75448313-8c5d-4253-9b15-f1c51626a8c8",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b021af32-26cb-4046-a1da-a84bd00b4134",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:03:30.510507Z",
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

`GET /api/rider/v1/orders/bdce0c4c-9d6d-4626-b099-f378275e706a` → **200**

```json
{
  "id": "bdce0c4c-9d6d-4626-b099-f378275e706a",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b021af32-26cb-4046-a1da-a84bd00b4134",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "96ba499f-72f1-4ddf-85f2-4357a82d6a0a",
    "order_id": "bdce0c4c-9d6d-4626-b099-f378275e706a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "e0040676-8ddc-4e56-94f4-555cfdb671b9",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T08:03:28.877945Z",
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
    "location_at": "2026-10-30T08:03:27.87282Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/bdce0c4c-9d6d-4626-b099-f378275e706a/cancel` → **200**

```json
{
  "command_id": "fd5daaa1-03a0-4117-a6e6-9c5b400fe614",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "bdce0c4c-9d6d-4626-b099-f378275e706a",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "b021af32-26cb-4046-a1da-a84bd00b4134",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "96ba499f-72f1-4ddf-85f2-4357a82d6a0a",
    "order_id": "bdce0c4c-9d6d-4626-b099-f378275e706a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "e0040676-8ddc-4e56-94f4-555cfdb671b9",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T08:03:28.877945Z",
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

`GET /api/rider/v1/orders/75448313-8c5d-4253-9b15-f1c51626a8c8` → **200**

```json
{
  "id": "75448313-8c5d-4253-9b15-f1c51626a8c8",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b021af32-26cb-4046-a1da-a84bd00b4134",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:03:30.510507Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/75448313-8c5d-4253-9b15-f1c51626a8c8/cancel` → **200**

```json
{
  "command_id": "5d5b11ec-fc1d-4b08-8b14-d4cc4d1679a4",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "75448313-8c5d-4253-9b15-f1c51626a8c8",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b021af32-26cb-4046-a1da-a84bd00b4134",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:03:30.510507Z",
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

`GET /api/rider/v1/orders/d0bef373-e8e3-4b63-82cc-c15ead78b0d1` → **200**

```json
{
  "id": "d0bef373-e8e3-4b63-82cc-c15ead78b0d1",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b021af32-26cb-4046-a1da-a84bd00b4134",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T08:03:31.051823Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T11:03:30Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d0bef373-e8e3-4b63-82cc-c15ead78b0d1/cancel` → **200**

```json
{
  "command_id": "dca02071-80b6-4eb5-a31e-1730b53f6106",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d0bef373-e8e3-4b63-82cc-c15ead78b0d1",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "b021af32-26cb-4046-a1da-a84bd00b4134",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T08:03:31.051823Z",
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
  "pickup_at": "2026-10-30T11:03:30Z",
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
  "session_id": "5926471f-fe55-43be-9b85-06023997223c",
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
  "last_heartbeat_at": "2026-10-30T08:03:27.87282Z",
  "last_location_at": "2026-10-30T08:03:27.87282Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5926471f-fe55-43be-9b85-06023997223c/close` → **200**

```json
{
  "command_id": "fd088cd9-d185-4c0c-a308-97c5297d2e85",
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

Done: orders bdce0c4c-9d6d-4626-b099-f378275e706a, 75448313-8c5d-4253-9b15-f1c51626a8c8, d0bef373-e8e3-4b63-82cc-c15ead78b0d1.

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
  "session_id": "dc918b53-6178-404b-8ce3-81ffc33aaaff",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgzMTQsImlhdCI6MTc5MzM0NzQxNCwianRpIjoiODA3YWM3YzUtMGE0Ny00NDAxLWE4MzMtMjU2NDQ2ZGY3NTEzIiwic2lkIjoiZGM5MThiNTMtNjE3OC00MDRiLThjZTMtODFmZmMzM2FhYWZmIn0.hTxE0apfJ-JHyrf-FVzORj8hxJg5wB-WbrGznwFyc8c",
  "access_expires_at": "2026-10-30T08:18:34.347945071Z",
  "refresh_token": "lxftc_qAoF2DlPPRjJiUXKewCZrg00LjDCWqBF2QvGw",
  "refresh_expires_at": "2026-10-30T20:03:34.347460397Z",
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
  "session_id": "df78f9ae-45b2-4d80-b99f-e458569d70b5",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgzMTQsImlhdCI6MTc5MzM0NzQxNCwianRpIjoiMGRiNjlhZGEtNTJhNy00YTRlLWFlOGYtMGFhZWZiY2VlNTNiIiwic2lkIjoiZGY3OGY5YWUtNDViMi00ZDgwLWI5OWYtZTQ1ODU2OWQ3MGI1In0.XV0fYLnwXyip2WmvircjR3-ZZHALtEJl-EkPPr4KejU",
  "access_expires_at": "2026-10-30T08:18:34.825176871Z",
  "refresh_token": "K8SgIWKuNzucs-NeQj1nZ87ZaXOCYNAYpmxqlccA4IM",
  "refresh_expires_at": "2026-10-30T20:03:34.824703022Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-23653"
}
```

```json
{
  "challenge_id": "49d07191-d3ed-4bf2-b159-36874d35f1c4",
  "expires_at": "2026-10-30T08:08:35.040538662Z",
  "resend_available_at": "2026-10-30T08:03:36.040538662Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "402442",
  "sent_at": "2026-10-30T08:03:35.042474624Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "49d07191-d3ed-4bf2-b159-36874d35f1c4",
  "code": "402442",
  "device_ref": "sandbox-23653"
}
```

```json
{
  "session_id": "b6fe6c9d-fab6-4eb3-b034-15263b424cbe",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODMxNSwiaWF0IjoxNzkzMzQ3NDE1LCJqdGkiOiI0OTczZjU0Ni1kMjg4LTRhNjAtOWVmMy1hNzEyNmMyOTUyYTgiLCJzaWQiOiJiNmZlNmM5ZC1mYWI2LTRlYjMtYjAzNC0xNTI2M2I0MjRjYmUifQ.zrgRoCSKvkTfCKnfX_9TJZ4UEm4ta_SbtkcP0edaSdA",
  "access_expires_at": "2026-10-30T08:18:35.280416169Z",
  "refresh_token": "GN1mEMrcVogHadjusLph-hx6DyQspvozyCkkC3aDiR4",
  "refresh_expires_at": "2026-11-29T08:03:35.279873283Z",
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
  "command_id": "6ede0dba-0dda-4a6f-b53d-b4795d8426c4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:03:35Z",
    "sequence": 1793347415733
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "63e1d7b7-c2b3-4e78-806a-9fbfb2f7801c",
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
  "last_heartbeat_at": "2026-10-30T08:03:35.748985Z",
  "last_location_at": "2026-10-30T08:03:35.748985Z",
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
  "command_id": "1a2253f0-9266-4d3b-8b5d-097f24031371",
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
  "effective_at": "2026-10-30T08:03:36.207302Z",
  "changed_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T08:01:16.761323Z",
  "last_entries": [
    {
      "order_id": "a34ff315-6b44-4b74-95bd-236632b36d2a",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T08:01:16.761323Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "360a6c89-263a-4d03-8303-baf68644e873",
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
  "id": "5999eecd-d6c9-4a1b-853d-ee2c624bf351",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:08:36.663895Z",
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
  "command_id": "e6be3531-a816-4fdc-b43c-d0670a73d93a",
  "quote_id": "5999eecd-d6c9-4a1b-853d-ee2c624bf351",
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
    "phone": "+380671118211"
  }
}
```

```json
{
  "id": "f1ccb7ae-8b94-44a0-a289-6bfb3f585b78",
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
  "created_at": "2026-10-30T08:03:36.896306Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118211"
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
    "id": "ad8c4676-adee-46e4-92ef-4de58fa6e553",
    "order_id": "f1ccb7ae-8b94-44a0-a289-6bfb3f585b78",
    "expires_at": "2026-10-30T08:03:51.89918Z",
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

`POST /api/driver/v1/offers/ad8c4676-adee-46e4-92ef-4de58fa6e553/accept` → **200**

```json
{
  "command_id": "641c88b9-ceab-4209-ab39-6a28ae64c705"
}
```

```json
{
  "id": "1ab2a9b8-0a47-4d57-9b6f-647955353811",
  "order_id": "f1ccb7ae-8b94-44a0-a289-6bfb3f585b78",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "511d989e-0940-4398-9df7-64dbb959cada",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "511d989e-0940-4398-9df7-64dbb959cada",
  "order_id": "f1ccb7ae-8b94-44a0-a289-6bfb3f585b78",
  "assignment_id": "1ab2a9b8-0a47-4d57-9b6f-647955353811",
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
    "phone": "+380671118211"
  }
}
```

`POST /api/driver/v1/work-sessions/63e1d7b7-c2b3-4e78-806a-9fbfb2f7801c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:03:37Z",
    "sequence": 1793347417832
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "63e1d7b7-c2b3-4e78-806a-9fbfb2f7801c",
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
  "last_heartbeat_at": "2026-10-30T08:03:37.848643Z",
  "last_location_at": "2026-10-30T08:03:37.848643Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/511d989e-0940-4398-9df7-64dbb959cada/arrive` → **200**

```json
{
  "command_id": "af4789e8-1d68-48e2-abf8-2afca9f62252",
  "expected_version": 0
}
```

```json
{
  "id": "511d989e-0940-4398-9df7-64dbb959cada",
  "order_id": "f1ccb7ae-8b94-44a0-a289-6bfb3f585b78",
  "assignment_id": "1ab2a9b8-0a47-4d57-9b6f-647955353811",
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
  "arrived_at": "2026-10-30T08:03:38.080991Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671118211"
  }
}
```

`POST /api/driver/v1/trips/511d989e-0940-4398-9df7-64dbb959cada/start` → **200**

```json
{
  "command_id": "ff00f13a-1f13-4c87-bd6e-6643c79e4ae3",
  "expected_version": 1
}
```

```json
{
  "id": "511d989e-0940-4398-9df7-64dbb959cada",
  "order_id": "f1ccb7ae-8b94-44a0-a289-6bfb3f585b78",
  "assignment_id": "1ab2a9b8-0a47-4d57-9b6f-647955353811",
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
  "arrived_at": "2026-10-30T08:03:38.080991Z",
  "started_at": "2026-10-30T08:03:38.323309Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671118211"
  }
}
```

`POST /api/driver/v1/trips/511d989e-0940-4398-9df7-64dbb959cada/complete` → **200**

```json
{
  "command_id": "92d5a598-0759-4bc1-abb9-b7cfc8b46858",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:03:38Z",
  "cash_received": true
}
```

```json
{
  "id": "511d989e-0940-4398-9df7-64dbb959cada",
  "order_id": "f1ccb7ae-8b94-44a0-a289-6bfb3f585b78",
  "assignment_id": "1ab2a9b8-0a47-4d57-9b6f-647955353811",
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
  "arrived_at": "2026-10-30T08:03:38.080991Z",
  "started_at": "2026-10-30T08:03:38.323309Z",
  "completed_at": "2026-10-30T08:03:38.557852Z",
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
  "command_id": "08edc833-8adc-4975-bc3b-4410e0be45d0",
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
  "id": "98284700-af64-4aab-a0da-366429a72220",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:08:38.790984Z",
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
  "command_id": "c302743e-9db1-4f7e-9ec4-151096c95087",
  "quote_id": "98284700-af64-4aab-a0da-366429a72220",
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
    "phone": "+3806711124059"
  }
}
```

```json
{
  "id": "6306dd74-dafe-42cd-a3b0-5402c1281121",
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
  "created_at": "2026-10-30T08:03:39.025212Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711124059"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/6306dd74-dafe-42cd-a3b0-5402c1281121` → **200**

```json
{
  "id": "6306dd74-dafe-42cd-a3b0-5402c1281121",
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
  "created_at": "2026-10-30T08:03:39.025212Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711124059"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/6306dd74-dafe-42cd-a3b0-5402c1281121/cancel` → **200**

```json
{
  "command_id": "a7fa99f8-06c7-4338-a32f-f2b3ae54d88e",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "6306dd74-dafe-42cd-a3b0-5402c1281121",
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
  "created_at": "2026-10-30T08:03:39.025212Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711124059"
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
  "staff_id": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T08:01:16.761323Z",
  "last_entries": [
    {
      "order_id": "6306dd74-dafe-42cd-a3b0-5402c1281121",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T08:03:39.511822Z"
    },
    {
      "order_id": "f1ccb7ae-8b94-44a0-a289-6bfb3f585b78",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T08:03:38.561159Z"
    },
    {
      "order_id": "a34ff315-6b44-4b74-95bd-236632b36d2a",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T08:01:16.761323Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "63e1d7b7-c2b3-4e78-806a-9fbfb2f7801c",
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
  "last_heartbeat_at": "2026-10-30T08:03:37.848643Z",
  "last_location_at": "2026-10-30T08:03:37.848643Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/63e1d7b7-c2b3-4e78-806a-9fbfb2f7801c/close` → **200**

```json
{
  "command_id": "d4e8c7bd-b1d5-4b68-a801-e9f7b6d45de4",
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

Done: operator bonus for fulfilled f1ccb7ae-8b94-44a0-a289-6bfb3f585b78 and operator-fault cancellation 6306dd74-dafe-42cd-a3b0-5402c1281121.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674099257",
  "device_ref": "sandbox-23610"
}
```

```json
{
  "challenge_id": "50571d7c-45b2-4072-a173-c52698f7d795",
  "expires_at": "2026-10-30T08:08:43.673083623Z",
  "resend_available_at": "2026-10-30T08:03:44.673083623Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674099257` → **200**

```json
{
  "phone": "+380674099257",
  "audience": "CLIENT",
  "code": "766922",
  "sent_at": "2026-10-30T08:03:43.674995746Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673785874",
  "device_ref": "sandbox-28304",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "b913744b-5722-49b4-95bd-fa16a931bb07",
  "expires_at": "2026-10-30T08:08:45.12994338Z",
  "resend_available_at": "2026-10-30T08:03:46.12994338Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673785874` → **200**

```json
{
  "phone": "+380673785874",
  "audience": "CLIENT",
  "code": "796787",
  "sent_at": "2026-10-30T08:03:45.131570373Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673785874",
  "device_ref": "sandbox-30276",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "3140a496-2706-492c-b95f-551e53fc4af5",
  "expires_at": "2026-10-30T08:08:46.577672076Z",
  "resend_available_at": "2026-10-30T08:03:47.577672076Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380673785874` → **200**

```json
{
  "phone": "+380673785874",
  "audience": "CLIENT",
  "code": "392920",
  "sent_at": "2026-10-30T08:03:46.579907801Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670900000",
  "device_ref": "sandbox-10875"
}
```

```json
{
  "challenge_id": "1a093731-c4b9-4ce2-b1cf-1b32067ff1a5",
  "expires_at": "2026-10-30T08:08:48.035197304Z",
  "resend_available_at": "2026-10-30T08:03:49.035197304Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670900000",
  "device_ref": "sandbox-10272"
}
```

```json
{
  "challenge_id": "1228e692-8164-4659-b9ff-be9f1d1e4af6",
  "expires_at": "2026-10-30T08:08:49.46734754Z",
  "resend_available_at": "2026-10-30T08:03:50.46734754Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380670900000` → **200**

```json
{
  "phone": "+380670900000",
  "audience": "CLIENT",
  "code": "537411",
  "sent_at": "2026-10-30T08:03:49.469515665Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670900000",
  "device_ref": "sandbox-15162",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "ae78edea-fea7-4869-aa32-133181233853",
  "expires_at": "2026-10-30T08:08:50.921083583Z",
  "resend_available_at": "2026-10-30T08:03:51.921083583Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380670900000` → **200**

```json
{
  "phone": "+380670900000",
  "audience": "CLIENT",
  "code": "386066",
  "sent_at": "2026-10-30T08:03:50.923059535Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380670900000",
  "device_ref": "sandbox-22159",
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
  "correlation_id": "7428b26a-d9a0-4e24-ba7b-a4fe1e99ce96",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000020265"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "34eb78fd-0bb6-4187-a587-9e8a4b9ff720"
}
```

`GET /sandbox/v1/otp?phone=%2B442000020265` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120001674"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "939435a9-249d-4a58-bc79-4538c94300ab"
}
```

`GET /sandbox/v1/otp?phone=%2B37120001674` → **404**

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
  "session_id": "4c313502-902f-41d8-a172-174ba01b37e3",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgzMzMsImlhdCI6MTc5MzM0NzQzMywianRpIjoiNzc2MjJhMzgtYmNkYy00YWEwLWJiMjEtMzFmY2M0ZWU1MWM4Iiwic2lkIjoiNGMzMTM1MDItOTAyZi00MWQ4LWExNzItMTc0YmEwMWIzN2UzIn0.q7ev-E7h4rOi7WsrERKEroMEmZuZBFwfIiVcdKNVKkM",
  "access_expires_at": "2026-10-30T08:18:53.385124357Z",
  "refresh_token": "zbgLgPr482I6WbPVWCDVNHZ6T7ABbnFoFVpFDdOW46A",
  "refresh_expires_at": "2026-10-30T20:03:53.384306541Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380670900000` → **200**

```json
{
  "deliveries": [
    {
      "id": "b48253a0-53a6-4b3f-b8e4-9167902f8449",
      "challenge_id": "ae78edea-fea7-4869-aa32-133181233853",
      "phone": "+380670900000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-a1618b4b-889e-4827-9332-a2e29ae47faa",
      "error": null,
      "attempted_at": "2026-10-30T08:03:50.923777Z"
    },
    {
      "id": "913e571e-4735-4f68-849d-b1c50d036d91",
      "challenge_id": "1228e692-8164-4659-b9ff-be9f1d1e4af6",
      "phone": "+380670900000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-88713a52-c6e6-4713-934e-9e6fedcacf7d",
      "error": null,
      "attempted_at": "2026-10-30T08:03:49.469779Z"
    },
    {
      "id": "ed9b25a5-27c6-4489-978c-7fc8cc71d36d",
      "challenge_id": "1a093731-c4b9-4ce2-b1cf-1b32067ff1a5",
      "phone": "+380670900000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T08:03:48.037288Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380670900000` → **200**

```json
{
  "phone": "+380670900000",
  "audience": "CLIENT",
  "code": "386066",
  "sent_at": "2026-10-30T08:03:50.923059535Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380673785874` → **200**

```json
{
  "deliveries": [
    {
      "id": "1f0147d8-2912-4ebb-90aa-ccba7ebccbdd",
      "challenge_id": "3140a496-2706-492c-b95f-551e53fc4af5",
      "phone": "+380673785874",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-7a9b5e66-4ed1-45e2-a5d9-ba0468b0fea1",
      "error": null,
      "attempted_at": "2026-10-30T08:03:46.580197Z"
    },
    {
      "id": "94f964e7-73ee-40cf-b5a0-1e8772999784",
      "challenge_id": "b913744b-5722-49b4-95bd-fa16a931bb07",
      "phone": "+380673785874",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-bc1d2c13-e244-4d48-8997-56124e46477a",
      "error": null,
      "attempted_at": "2026-10-30T08:03:45.13196Z"
    }
  ]
}
```

Done: SMS to +380674099257; SMS then a call to +380673785874; a failed SMS, two calls and a refused third to +380670900000; +44 and +371 refused.

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
  "session_id": "bb24dd99-ff7c-4053-b8bb-b18c6aa2ea08",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgzMzQsImlhdCI6MTc5MzM0NzQzNCwianRpIjoiZDgwZGU3NWMtYTg1YS00ZTA2LWI4NzMtODZlMjk0NzAxMjBjIiwic2lkIjoiYmIyNGRkOTktZmY3Yy00MDUzLWI4YmItYjE4YzZhYTJlYTA4In0.o5RTq_5BrkMhzzGyqnz3k0AMh9ftbXVQvgb9YBflKKw",
  "access_expires_at": "2026-10-30T08:18:54.490331073Z",
  "refresh_token": "sMJm_06c6WqCFAlu8no1t_k3LXfjlMXECBs9_MbzGq8",
  "refresh_expires_at": "2026-10-30T20:03:54.489614928Z",
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
  "session_id": "117f430c-a9e6-490e-81eb-98a7582809de",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgzMzQsImlhdCI6MTc5MzM0NzQzNCwianRpIjoiN2E0MGU0YjEtNDRhMi00YTg0LTlhMmItNjJjYWI5OWM0YmRlIiwic2lkIjoiMTE3ZjQzMGMtYTllNi00OTBlLTgxZWItOThhNzU4MjgwOWRlIn0.Ak8h71hn2hM3krG0YyJkjcvKEpe1qShIMhjca1jRt80",
  "access_expires_at": "2026-10-30T08:18:54.976516883Z",
  "refresh_token": "3H6mKleI8t61V4e563eCm-0D09UvnBuzGgmGNB5xKrU",
  "refresh_expires_at": "2026-10-30T20:03:54.976024528Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3",
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

`POST /api/admin/v1/staff-extensions/db8502d0-b190-4276-94c9-6cc44299e7b3` → **200**

```json
{
  "command_id": "d371a062-3cdf-460c-9696-1e613d9f61ec",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "e5f20995-99e2-4ddf-a87b-282db78b0d24",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T08:03:55.928403Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T08:03:55.928403Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "29548ed2-3895-4fbd-b936-d3a16c176b61",
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
  "id": "bbb8a7f3-7f86-4b02-b776-f29f21568cf3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:08:56.395510Z",
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
  "command_id": "b2cd9384-a010-42fd-994c-ab770f5590a7",
  "quote_id": "bbb8a7f3-7f86-4b02-b776-f29f21568cf3",
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
    "phone": "+380671256374"
  }
}
```

```json
{
  "id": "0ca519cd-4c28-4b9f-877d-79d0c5f01c1e",
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
  "created_at": "2026-10-30T08:03:56.642823Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671256374"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/0ca519cd-4c28-4b9f-877d-79d0c5f01c1e/calls` → **201**

```json
{
  "command_id": "8808c081-9b74-42e3-8ef6-993b4e8d16fc",
  "to": "CALLER"
}
```

```json
{
  "id": "d3709e46-015b-4fa2-ae31-0b0f4394daa8",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "order_ids": [
    "0ca519cd-4c28-4b9f-877d-79d0c5f01c1e"
  ],
  "started_at": "2026-10-30T08:03:56.916658Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/0ca519cd-4c28-4b9f-877d-79d0c5f01c1e/calls` → **201**

```json
{
  "command_id": "8808c081-9b74-42e3-8ef6-993b4e8d16fc",
  "to": "CALLER"
}
```

```json
{
  "id": "d3709e46-015b-4fa2-ae31-0b0f4394daa8",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "order_ids": [
    "0ca519cd-4c28-4b9f-877d-79d0c5f01c1e"
  ],
  "started_at": "2026-10-30T08:03:56.916658Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "d3709e46-015b-4fa2-ae31-0b0f4394daa8",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380671256374",
    "at": "2026-10-30T08:03:56.918712609Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "d3709e46-015b-4fa2-ae31-0b0f4394daa8",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.17544",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "d3709e46-015b-4fa2-ae31-0b0f4394daa8"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "d3709e46-015b-4fa2-ae31-0b0f4394daa8",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=0ca519cd-4c28-4b9f-877d-79d0c5f01c1e` → **200**

```json
{
  "calls": [
    {
      "id": "d3709e46-015b-4fa2-ae31-0b0f4394daa8",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
      "order_ids": [
        "0ca519cd-4c28-4b9f-877d-79d0c5f01c1e"
      ],
      "started_at": "2026-10-30T08:03:56.916658Z",
      "answered_at": "2026-10-30T08:03:57.458284Z",
      "ended_at": "2026-10-30T08:03:57.478595Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=0ca519cd-4c28-4b9f-877d-79d0c5f01c1e` → **200**

```json
{
  "calls": [
    {
      "id": "d3709e46-015b-4fa2-ae31-0b0f4394daa8",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
      "order_ids": [
        "0ca519cd-4c28-4b9f-877d-79d0c5f01c1e"
      ],
      "started_at": "2026-10-30T08:03:56.916658Z",
      "answered_at": "2026-10-30T08:03:57.458284Z",
      "ended_at": "2026-10-30T08:03:57.478595Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T08:03:59.13328Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/0ca519cd-4c28-4b9f-877d-79d0c5f01c1e` → **200**

```json
{
  "id": "0ca519cd-4c28-4b9f-877d-79d0c5f01c1e",
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
  "created_at": "2026-10-30T08:03:56.642823Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671256374"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/0ca519cd-4c28-4b9f-877d-79d0c5f01c1e/cancel` → **200**

```json
{
  "command_id": "fdb3daf4-8e28-4a3b-8a58-832f4036551c",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "0ca519cd-4c28-4b9f-877d-79d0c5f01c1e",
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
  "created_at": "2026-10-30T08:03:56.642823Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671256374"
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
  "command_id": "8b554ec8-f2fe-441c-b7c1-6414a684ba84",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T08:04:00.508723Z",
  "extension": "101"
}
```

Done: outgoing call d3709e46-015b-4fa2-ae31-0b0f4394daa8 from order 0ca519cd-4c28-4b9f-877d-79d0c5f01c1e, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635338968",
  "device_ref": "sandbox-7467"
}
```

```json
{
  "challenge_id": "f5852ca6-f3ce-40f2-8545-191adaa058d9",
  "expires_at": "2026-10-30T08:09:00.768216908Z",
  "resend_available_at": "2026-10-30T08:04:01.768216908Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635338968` → **200**

```json
{
  "phone": "+380635338968",
  "audience": "CLIENT",
  "code": "997031",
  "sent_at": "2026-10-30T08:04:00.771143907Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f5852ca6-f3ce-40f2-8545-191adaa058d9",
  "code": "997031",
  "device_ref": "sandbox-7467"
}
```

```json
{
  "session_id": "52671f4f-40e5-4e1b-9a6c-6076ac97877d",
  "subject": {
    "type": "CLIENT",
    "id": "4b274cdb-eb98-45b5-a1e9-5ea0911e1ce0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YjI3NGNkYi1lYjk4LTQ1YjUtYTFlOS01ZWEwOTExZTFjZTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MzQxLCJpYXQiOjE3OTMzNDc0NDEsImp0aSI6IjUxNTJmZWYyLWQ3ZjAtNDM2My05MjBkLTBjMGEwZDU1OTdjZSIsInNpZCI6IjUyNjcxZjRmLTQwZTUtNGUxYi05YTZjLTYwNzZhYzk3ODc3ZCJ9.KkOpYGk5q-HI3ZzRCvm4MMwn0rdeomEJorzsgTt_ZfQ",
  "access_expires_at": "2026-10-30T08:19:01.024971573Z",
  "refresh_token": "pK6qGkzQEzIqMuumdhiyqjNzThcnKKzhivyrxO4bm2U",
  "refresh_expires_at": "2026-11-29T08:04:01.024462983Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "4b274cdb-eb98-45b5-a1e9-5ea0911e1ce0",
  "session_id": "52671f4f-40e5-4e1b-9a6c-6076ac97877d",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635338968",
  "device_ref": "sandbox-8456"
}
```

```json
{
  "challenge_id": "ca32a3da-b1e6-4a44-9de4-95e435dedd51",
  "expires_at": "2026-10-30T08:09:03.481013438Z",
  "resend_available_at": "2026-10-30T08:04:04.481013438Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635338968` → **200**

```json
{
  "phone": "+380635338968",
  "audience": "CLIENT",
  "code": "901881",
  "sent_at": "2026-10-30T08:04:03.483287829Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ca32a3da-b1e6-4a44-9de4-95e435dedd51",
  "code": "901881",
  "device_ref": "sandbox-8456"
}
```

```json
{
  "session_id": "cc18f1e2-1a87-4645-a9e7-4c114aaf912d",
  "subject": {
    "type": "CLIENT",
    "id": "4b274cdb-eb98-45b5-a1e9-5ea0911e1ce0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YjI3NGNkYi1lYjk4LTQ1YjUtYTFlOS01ZWEwOTExZTFjZTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MzQzLCJpYXQiOjE3OTMzNDc0NDMsImp0aSI6Ijc3M2RlM2I5LTczMTAtNGM2NS1iNDUxLWFmZWFjNDZmYjcyOSIsInNpZCI6ImNjMThmMWUyLTFhODctNDY0NS1hOWU3LTRjMTE0YWFmOTEyZCJ9.GVSB4gTvEXtGFwkZQUx86g9dA3YvaTIhf3kGyE46MXA",
  "access_expires_at": "2026-10-30T08:19:03.737656309Z",
  "refresh_token": "qp_tn2T1AC-n632kMoy4VKd4At0T58Q8Y0e37f4Frbs",
  "refresh_expires_at": "2026-11-29T08:04:03.737147755Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "e22cce0a-144f-44a0-a277-737c230e8eb0",
  "expires_at": "2026-10-30T08:09:05.97360495Z",
  "resend_available_at": "2026-10-30T08:04:06.97360495Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635338968` → **200**

```json
{
  "phone": "+380635338968",
  "audience": "CLIENT",
  "code": "375074",
  "sent_at": "2026-10-30T08:04:05.975278987Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380632884073"
}
```

```json
{
  "challenge_id": "20dace17-9ae6-4831-a4ee-284afc7a2ac1",
  "expires_at": "2026-10-30T08:09:06.224625268Z",
  "resend_available_at": "2026-10-30T08:04:07.224625268Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632884073` → **200**

```json
{
  "phone": "+380632884073",
  "audience": "CLIENT",
  "code": "248584",
  "sent_at": "2026-10-30T08:04:06.226433768Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "f68ab404-5c8f-4695-b524-3898b2ba8248",
  "current_challenge_id": "e22cce0a-144f-44a0-a277-737c230e8eb0",
  "current_code": "000000",
  "new_challenge_id": "20dace17-9ae6-4831-a4ee-284afc7a2ac1",
  "new_code": "248584"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "1372a0a6-cbfe-489f-a341-abdcf1b872d0"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "b4e1bb6c-39e0-4f10-bbdb-fcb2348f972a",
  "current_challenge_id": "e22cce0a-144f-44a0-a277-737c230e8eb0",
  "current_code": "375074",
  "new_challenge_id": "20dace17-9ae6-4831-a4ee-284afc7a2ac1",
  "new_code": "248584"
}
```

```json
{
  "subject_id": "4b274cdb-eb98-45b5-a1e9-5ea0911e1ce0",
  "phone": "+380632884073",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "4b274cdb-eb98-45b5-a1e9-5ea0911e1ce0",
  "session_id": "52671f4f-40e5-4e1b-9a6c-6076ac97877d",
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
  "correlation_id": "017ec487-ed55-4bff-afda-f4fd151e980b"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632884073",
  "device_ref": "sandbox-20146"
}
```

```json
{
  "challenge_id": "1fc52f51-e7f1-43a8-b0f7-c2bfa2d21ca7",
  "expires_at": "2026-10-30T08:09:09.435035739Z",
  "resend_available_at": "2026-10-30T08:04:10.435035739Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632884073` → **200**

```json
{
  "phone": "+380632884073",
  "audience": "CLIENT",
  "code": "115463",
  "sent_at": "2026-10-30T08:04:09.437489786Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1fc52f51-e7f1-43a8-b0f7-c2bfa2d21ca7",
  "code": "115463",
  "device_ref": "sandbox-20146"
}
```

```json
{
  "session_id": "aa994b10-bdac-49d2-8a3b-617e74ac9568",
  "subject": {
    "type": "CLIENT",
    "id": "4b274cdb-eb98-45b5-a1e9-5ea0911e1ce0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YjI3NGNkYi1lYjk4LTQ1YjUtYTFlOS01ZWEwOTExZTFjZTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MzQ5LCJpYXQiOjE3OTMzNDc0NDksImp0aSI6ImVmMTVlYWE1LTUyMmMtNDkxZi1iMmRjLTQwNWFlY2JlMTJhZSIsInNpZCI6ImFhOTk0YjEwLWJkYWMtNDlkMi04YTNiLTYxN2U3NGFjOTU2OCJ9.oEfhMBMW9-6TqNgm6LFw--84aRNQaqp1aCvga-R-2eM",
  "access_expires_at": "2026-10-30T08:19:09.696071645Z",
  "refresh_token": "vIe-7W4g2IBAd0VH5KYO_BDWSsEwDXSGHRmN0nP0Dbo",
  "refresh_expires_at": "2026-11-29T08:04:09.695612408Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "4b274cdb-eb98-45b5-a1e9-5ea0911e1ce0",
  "session_id": "aa994b10-bdac-49d2-8a3b-617e74ac9568",
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
  "session_id": "01ce13bf-dd22-4993-a069-9e907bf2b000",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgzNTAsImlhdCI6MTc5MzM0NzQ1MCwianRpIjoiZThkZDhjM2ItMTBkOC00ODFiLWE1NTEtYmJkOTE0Y2VlNzVmIiwic2lkIjoiMDFjZTEzYmYtZGQyMi00OTkzLWEwNjktOWU5MDdiZjJiMDAwIn0.gwxOH-_JF5He6sOiml2cQ1K7RI_6aOjjvBKfuriesCw",
  "access_expires_at": "2026-10-30T08:19:10.408069254Z",
  "refresh_token": "_ZNsyGtGdNsHvB0AEDx3HK3CXmdGdnHi588BRMHauVA",
  "refresh_expires_at": "2026-10-30T20:04:10.407612852Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/4b274cdb-eb98-45b5-a1e9-5ea0911e1ce0` → **200**

```json
{
  "client": {
    "id": "4b274cdb-eb98-45b5-a1e9-5ea0911e1ce0",
    "phone": "+380632884073",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:04:01.023378Z",
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

`POST /api/admin/v1/clients/4b274cdb-eb98-45b5-a1e9-5ea0911e1ce0/phone/new-code` → **201**

```json
{
  "phone": "+380630407263"
}
```

```json
{
  "challenge_id": "f7c3615f-fd97-4a4f-9a89-694856e3dc19",
  "expires_at": "2026-10-30T08:09:10.908645775Z",
  "resend_available_at": "2026-10-30T08:04:11.908645775Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630407263` → **200**

```json
{
  "phone": "+380630407263",
  "audience": "CLIENT",
  "code": "521861",
  "sent_at": "2026-10-30T08:04:10.910248917Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/4b274cdb-eb98-45b5-a1e9-5ea0911e1ce0/phone` → **422**

```json
{
  "command_id": "92914548-e858-4845-9040-c935de3ace4e",
  "expected_version": 3,
  "new_challenge_id": "f7c3615f-fd97-4a4f-9a89-694856e3dc19",
  "new_code": "521862",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/4b274cdb-eb98-45b5-a1e9-5ea0911e1ce0/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "e5943b93-23dd-4345-ab6c-c9d5071de019"
}
```

`POST /api/admin/v1/clients/4b274cdb-eb98-45b5-a1e9-5ea0911e1ce0/phone` → **400**

```json
{
  "command_id": "7ee010c2-b248-4204-bfd3-da2fa07c7ead",
  "expected_version": 3,
  "new_challenge_id": "f7c3615f-fd97-4a4f-9a89-694856e3dc19",
  "new_code": "521861",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/4b274cdb-eb98-45b5-a1e9-5ea0911e1ce0/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "f38250c7-ff9f-45f6-8d78-5af4f62c6669",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/4b274cdb-eb98-45b5-a1e9-5ea0911e1ce0/phone` → **200**

```json
{
  "command_id": "b89e5473-f0d4-4511-83da-f0c3e593d7cb",
  "expected_version": 3,
  "new_challenge_id": "f7c3615f-fd97-4a4f-9a89-694856e3dc19",
  "new_code": "521861",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "4b274cdb-eb98-45b5-a1e9-5ea0911e1ce0",
  "phone": "+380630407263",
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
  "correlation_id": "9b6a1f35-4973-46fb-b2dc-ee29cfc190a0"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630407263",
  "device_ref": "sandbox-28500"
}
```

```json
{
  "challenge_id": "3e58ff62-6f8f-4749-a9a9-50c352d41ad0",
  "expires_at": "2026-10-30T08:09:12.106036902Z",
  "resend_available_at": "2026-10-30T08:04:13.106036902Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630407263` → **200**

```json
{
  "phone": "+380630407263",
  "audience": "CLIENT",
  "code": "343352",
  "sent_at": "2026-10-30T08:04:12.108035007Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3e58ff62-6f8f-4749-a9a9-50c352d41ad0",
  "code": "343352",
  "device_ref": "sandbox-28500"
}
```

```json
{
  "session_id": "a0922ef5-95d5-4174-8362-eba3c1ac5a72",
  "subject": {
    "type": "CLIENT",
    "id": "4b274cdb-eb98-45b5-a1e9-5ea0911e1ce0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YjI3NGNkYi1lYjk4LTQ1YjUtYTFlOS01ZWEwOTExZTFjZTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MzUyLCJpYXQiOjE3OTMzNDc0NTIsImp0aSI6ImM0NDg2NzZlLWQ0NTItNGQ5MS05ODcwLTYwOTlkZTgwODJlZiIsInNpZCI6ImEwOTIyZWY1LTk1ZDUtNDE3NC04MzYyLWViYTNjMWFjNWE3MiJ9.ZCaV7_ROOrgSmrkmweh0hxJ5xDTjgl9ZD33VT-ODe0Y",
  "access_expires_at": "2026-10-30T08:19:12.365187935Z",
  "refresh_token": "iDdySuPgC_XbaE8nJPdQL26eKRPU3D1r8xQTjUTPc5w",
  "refresh_expires_at": "2026-11-29T08:04:12.364432637Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "4b274cdb-eb98-45b5-a1e9-5ea0911e1ce0",
  "session_id": "a0922ef5-95d5-4174-8362-eba3c1ac5a72",
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
  "phone": "+380635115172",
  "device_ref": "sandbox-6022"
}
```

```json
{
  "challenge_id": "972e24cb-1854-4875-a65b-aed0299b45a5",
  "expires_at": "2026-10-30T08:09:12.830835926Z",
  "resend_available_at": "2026-10-30T08:04:13.830835926Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635115172` → **200**

```json
{
  "phone": "+380635115172",
  "audience": "CLIENT",
  "code": "135091",
  "sent_at": "2026-10-30T08:04:12.833563936Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "972e24cb-1854-4875-a65b-aed0299b45a5",
  "code": "135091",
  "device_ref": "sandbox-6022"
}
```

```json
{
  "session_id": "fa7b0075-fe59-45df-999f-8dcc0a70102e",
  "subject": {
    "type": "CLIENT",
    "id": "820cc22c-7cf7-411c-9ba8-a16dcd7ff122"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MjBjYzIyYy03Y2Y3LTQxMWMtOWJhOC1hMTZkY2Q3ZmYxMjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MzUzLCJpYXQiOjE3OTMzNDc0NTMsImp0aSI6ImMwYTg2NzQ0LTVhMjctNDcyZi1hYjhjLTdlNWY0OTJkOThkYiIsInNpZCI6ImZhN2IwMDc1LWZlNTktNDVkZi05OTlmLThkY2MwYTcwMTAyZSJ9.Ezto4D78PyyBz--MecwcMwUHkf0cbF39bfJyw5hOktg",
  "access_expires_at": "2026-10-30T08:19:13.092296237Z",
  "refresh_token": "e9fr3CtOEKzxiQmvbBorWc4MoSTE4OSJWgZjGlDB1ew",
  "refresh_expires_at": "2026-11-29T08:04:13.091841146Z",
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
  "session_id": "d060a775-70a3-4ead-9a8d-74bbbe82f977",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgzNTQsImlhdCI6MTc5MzM0NzQ1NCwianRpIjoiNzRhMmVjZjUtMmM0NS00ZjA0LThhNTgtNzgxNDM4YzA5OGE5Iiwic2lkIjoiZDA2MGE3NzUtNzBhMy00ZWFkLTlhOGQtNzRiYmJlODJmOTc3In0.5mfwkZegIaEIyixQoPYZeCwV7ZCwg_Et2ppx9wkENUs",
  "access_expires_at": "2026-10-30T08:19:14.069533867Z",
  "refresh_token": "ws8TZeT-9JJ2L2dZyKK8Yw-iIWmkVaF82MRFE4L-BQY",
  "refresh_expires_at": "2026-10-30T20:04:14.068807436Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380635115172` → **200**

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
  "correlation_id": "431d47da-d8ff-4d62-8d62-1af53341852d"
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
  "session_id": "176adfa0-7f73-4239-83cc-f0bb619593c0",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgzNTUsImlhdCI6MTc5MzM0NzQ1NSwianRpIjoiZTFhZWUyZjUtNGQ5Yy00Y2M5LWEzMmItMGVhNDhjOTI0YTM3Iiwic2lkIjoiMTc2YWRmYTAtN2Y3My00MjM5LTgzY2MtZjBiYjYxOTU5M2MwIn0.ypUIxsF9I6FIwXd_RRVg_LIsgzdDhdsiXXY3q97PM2Y",
  "access_expires_at": "2026-10-30T08:19:15.030671693Z",
  "refresh_token": "io-UHpqzfPp0PFbc4QiuITA67xE1cLi9fQt2gmws9Fc",
  "refresh_expires_at": "2026-10-30T20:04:15.030026146Z",
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
  "changed_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T08:00:55.915954Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "c71f9fc7-9bf6-4d2a-9ff9-1a63cb56606f",
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
  "changed_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T08:04:15.5077244Z"
}
```

## The rider books the airport for 2026-10-30T11:04:14Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600109231",
  "device_ref": "sandbox-15878"
}
```

```json
{
  "challenge_id": "225dc074-1ba0-4349-9110-d6d8926c2850",
  "expires_at": "2026-10-30T08:09:15.760923131Z",
  "resend_available_at": "2026-10-30T08:04:16.760923131Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600109231` → **200**

```json
{
  "phone": "+48600109231",
  "audience": "CLIENT",
  "code": "933887",
  "sent_at": "2026-10-30T08:04:15.763123309Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "225dc074-1ba0-4349-9110-d6d8926c2850",
  "code": "933887",
  "device_ref": "sandbox-15878"
}
```

```json
{
  "session_id": "8caf731b-b49c-408d-8984-03c842ca1a26",
  "subject": {
    "type": "CLIENT",
    "id": "227684cf-a08f-4dd0-8ff5-634f26159691"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMjc2ODRjZi1hMDhmLTRkZDAtOGZmNS02MzRmMjYxNTk2OTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MzU2LCJpYXQiOjE3OTMzNDc0NTYsImp0aSI6ImZlYzJiZjhkLWI4OWUtNGZmNS1iNDZhLTAwMzUwMjI2OTEyYSIsInNpZCI6IjhjYWY3MzFiLWI0OWMtNDA4ZC04OTg0LTAzYzg0MmNhMWEyNiJ9.13G-lp02c7TJsPQaTaJtHe2dNSSeRarEgfE5IawEbIk",
  "access_expires_at": "2026-10-30T08:19:16.027963659Z",
  "refresh_token": "P5L6KImta-ZST9MJv4A34dc4_HgQ5FrSc5xteCRoJ4w",
  "refresh_expires_at": "2026-11-29T08:04:16.027499055Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "72d7359b-2824-4dd2-bbfd-6624e7478eeb",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T11:04:14Z"
}
```

```json
{
  "id": "50265e31-cbf2-4fa9-91e2-f5318577d165",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:09:16.270830Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T11:04:14Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "70c0d14c-95ad-442e-b065-5c293523bccc",
  "quote_id": "50265e31-cbf2-4fa9-91e2-f5318577d165",
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
  "pickup_at": "2026-10-30T11:04:14Z"
}
```

```json
{
  "id": "33014058-7e6d-4c89-b167-91cb782c0da5",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "227684cf-a08f-4dd0-8ff5-634f26159691",
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
  "created_at": "2026-10-30T08:04:16.520917Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T11:04:14Z",
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
  "device_ref": "sandbox-13678"
}
```

```json
{
  "challenge_id": "84063247-646f-4b20-b13e-8bc86007ac4f",
  "expires_at": "2026-10-30T08:09:16.765556156Z",
  "resend_available_at": "2026-10-30T08:04:17.765556156Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "945842",
  "sent_at": "2026-10-30T08:04:16.767569487Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "84063247-646f-4b20-b13e-8bc86007ac4f",
  "code": "945842",
  "device_ref": "sandbox-13678"
}
```

```json
{
  "session_id": "8aa2f892-fbdb-43dd-846f-3188279d9f80",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODM1NywiaWF0IjoxNzkzMzQ3NDU3LCJqdGkiOiI2MDI2Y2VmYy1hMDcyLTQyYjAtYWQ5My03ODE5NjZiZDQyMGEiLCJzaWQiOiI4YWEyZjg5Mi1mYmRiLTQzZGQtODQ2Zi0zMTg4Mjc5ZDlmODAifQ.jswqvrcxT0YOPdmUAywCb1y0kO68G-vGy7s0L9vNSG0",
  "access_expires_at": "2026-10-30T08:19:17.03050341Z",
  "refresh_token": "pdikfDBGO162_ZfB1osg0phGfocmxgXsGKvO33PYxSM",
  "refresh_expires_at": "2026-11-29T08:04:17.029965582Z",
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
  "command_id": "70766f98-5e29-42db-9330-ee9d24491e6d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:04:17Z",
    "sequence": 1793347457488
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "02ed6394-2965-4e62-b185-7e31dfdc3c2e",
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
  "last_heartbeat_at": "2026-10-30T08:04:17.506032Z",
  "last_location_at": "2026-10-30T08:04:17.506032Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "33014058-7e6d-4c89-b167-91cb782c0da5",
      "short_number": 24,
      "pickup_at": "2026-10-30T11:04:14Z",
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

`POST /api/driver/v1/preorders/33014058-7e6d-4c89-b167-91cb782c0da5/reserve` → **200**

```json
{
  "command_id": "8d56cbfd-4f05-4e1b-9493-d100959fd109"
}
```

```json
{
  "id": "99152915-1246-4920-a59a-e564dae50fb1",
  "state": "RESERVED",
  "order": {
    "order_id": "33014058-7e6d-4c89-b167-91cb782c0da5",
    "short_number": 24,
    "pickup_at": "2026-10-30T11:04:14Z",
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
  "reserved_at": "2026-10-30T08:04:17.973874Z",
  "confirm_from": "2026-10-30T10:34:14Z",
  "confirm_until": "2026-10-30T10:44:14Z",
  "drop_until": "2026-10-30T10:04:14Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "99152915-1246-4920-a59a-e564dae50fb1",
      "state": "RESERVED",
      "order": {
        "order_id": "33014058-7e6d-4c89-b167-91cb782c0da5",
        "short_number": 24,
        "pickup_at": "2026-10-30T11:04:14Z",
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
      "reserved_at": "2026-10-30T08:04:17.973874Z",
      "confirm_from": "2026-10-30T10:34:14Z",
      "confirm_until": "2026-10-30T10:44:14Z",
      "drop_until": "2026-10-30T10:04:14Z"
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
      "id": "99152915-1246-4920-a59a-e564dae50fb1",
      "state": "RESERVED",
      "order": {
        "order_id": "33014058-7e6d-4c89-b167-91cb782c0da5",
        "short_number": 24,
        "pickup_at": "2026-10-30T11:04:14Z",
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
      "reserved_at": "2026-10-30T08:04:17.973874Z",
      "confirm_from": "2026-10-30T10:34:14Z",
      "confirm_until": "2026-10-30T10:44:14Z",
      "drop_until": "2026-10-30T10:04:14Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/99152915-1246-4920-a59a-e564dae50fb1/confirm` → **409**

```json
{
  "command_id": "f5a4695c-9d22-4fc4-bb96-a454b029a693"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/99152915-1246-4920-a59a-e564dae50fb1/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "fc0fda85-33cd-4022-b32d-57b2d7b4d5a5"
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
  "session_id": "f845ed00-46ef-4c58-a89c-575fd68e5822",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgzNTksImlhdCI6MTc5MzM0NzQ1OSwianRpIjoiOGM1NDU5YjQtMjM4ZC00NzViLThjOTItNzA3MWNiMWViNzJhIiwic2lkIjoiZjg0NWVkMDAtNDZlZi00YzU4LWE4OWMtNTc1ZmQ2OGU1ODIyIn0.WU7MDQpQg9je-52wv-BWZk_l4VdIKTLnHt4f4qLu5mY",
  "access_expires_at": "2026-10-30T08:19:19.18014137Z",
  "refresh_token": "HKYkXU6Dy5Z5acRW0yCrgqkTFGMJeUAXQq9VoD1hdiA",
  "refresh_expires_at": "2026-10-30T20:04:19.179668333Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/33014058-7e6d-4c89-b167-91cb782c0da5` → **200**

```json
{
  "id": "33014058-7e6d-4c89-b167-91cb782c0da5",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "227684cf-a08f-4dd0-8ff5-634f26159691",
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
  "created_at": "2026-10-30T08:04:16.520917Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T11:04:14Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "99152915-1246-4920-a59a-e564dae50fb1",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T08:04:17.973874Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/33014058-7e6d-4c89-b167-91cb782c0da5/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T08:04:16.522059Z",
      "actor": {
        "type": "CLIENT",
        "id": "227684cf-a08f-4dd0-8ff5-634f26159691",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "33014058-7e6d-4c89-b167-91cb782c0da5",
        "preorder": true,
        "quote_id": "50265e31-cbf2-4fa9-91e2-f5318577d165",
        "pickup_at": "2026-10-30T11:04:14Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "7c81132b-9091-4f14-b37a-b9964c814d9b"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T08:04:17.974824Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "33014058-7e6d-4c89-b167-91cb782c0da5",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "99152915-1246-4920-a59a-e564dae50fb1"
      },
      "correlation_id": "168aae75-3814-4016-b198-2fc66d3a3e23"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 33014058-7e6d-4c89-b167-91cb782c0da5, reservation 99152915-1246-4920-a59a-e564dae50fb1.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-18012"
}
```

```json
{
  "challenge_id": "df5d0c12-1fc5-4708-83f1-009f78c83cf2",
  "expires_at": "2026-10-30T08:09:19.902240819Z",
  "resend_available_at": "2026-10-30T08:04:20.902240819Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "970994",
  "sent_at": "2026-10-30T08:04:19.904246099Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "df5d0c12-1fc5-4708-83f1-009f78c83cf2",
  "code": "970994",
  "device_ref": "sandbox-18012"
}
```

```json
{
  "session_id": "a7617e25-4a4c-4adf-850e-2e540f36c4b4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODM2MCwiaWF0IjoxNzkzMzQ3NDYwLCJqdGkiOiI0NWI2MjQ5MS03MWYxLTQzZDItOWFkNS0xMjg3ODgwYWM3OGIiLCJzaWQiOiJhNzYxN2UyNS00YTRjLTRhZGYtODUwZS0yZTU0MGYzNmM0YjQifQ.IeV13Q2M05iDChO-2sOobVY6YOGLwlsa2WMBrm4oKh4",
  "access_expires_at": "2026-10-30T08:19:20.153306029Z",
  "refresh_token": "a2zRe65ACzD7alszGunx8EiUEX1Tv-M1N8cNkm893Js",
  "refresh_expires_at": "2026-11-29T08:04:20.152853813Z",
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
  "command_id": "c68b8371-20dc-4b71-84d8-23cadca316b1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:04:20Z",
    "sequence": 1793347460611
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1a421ab4-d91a-4c41-8bf7-5a3c9d9022ca",
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
  "last_heartbeat_at": "2026-10-30T08:04:20.628545Z",
  "last_location_at": "2026-10-30T08:04:20.628545Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676041649",
  "device_ref": "sandbox-23350"
}
```

```json
{
  "challenge_id": "9389ae4a-0df1-4bba-8d3a-086911f10cb1",
  "expires_at": "2026-10-30T08:09:20.864905663Z",
  "resend_available_at": "2026-10-30T08:04:21.864905663Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676041649` → **200**

```json
{
  "phone": "+380676041649",
  "audience": "CLIENT",
  "code": "788034",
  "sent_at": "2026-10-30T08:04:20.86736337Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9389ae4a-0df1-4bba-8d3a-086911f10cb1",
  "code": "788034",
  "device_ref": "sandbox-23350"
}
```

```json
{
  "session_id": "db0f76a2-635e-4e55-b73b-3ec2eee50db0",
  "subject": {
    "type": "CLIENT",
    "id": "6a073def-abf2-4076-b5b8-08a928e25b57"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YTA3M2RlZi1hYmYyLTQwNzYtYjViOC0wOGE5MjhlMjViNTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MzYxLCJpYXQiOjE3OTMzNDc0NjEsImp0aSI6IjgxOTBlZTY2LTAxNTctNDk2YS05MjcwLWY5MGZiMmY0ZjM3MSIsInNpZCI6ImRiMGY3NmEyLTYzNWUtNGU1NS1iNzNiLTNlYzJlZWU1MGRiMCJ9.qVZ3aj3dIBqIGQ92HsWA8z6D4LbDAFAEjTYf2eKtc3U",
  "access_expires_at": "2026-10-30T08:19:21.132328828Z",
  "refresh_token": "oWExAmDVFcBnR8ysDAC0I67a-F-xfSriIBBNwY9NsVM",
  "refresh_expires_at": "2026-11-29T08:04:21.131861569Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2cff872d-b5cd-4e82-9ed2-a2d5e4c7f9a7",
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
  "id": "71f37057-bc34-4cce-8e03-60344b1cb5d8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:09:21.372512Z",
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
  "command_id": "85f3693a-2d35-4daa-99a0-5251dbc0ded2",
  "quote_id": "71f37057-bc34-4cce-8e03-60344b1cb5d8",
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
  "id": "b7901ac2-2a3d-45cd-b60d-34020c383ab5",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6a073def-abf2-4076-b5b8-08a928e25b57",
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
  "created_at": "2026-10-30T08:04:21.688181Z",
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
    "id": "7a9191d2-412a-42e0-b9c7-4b5d0c2ac750",
    "order_id": "b7901ac2-2a3d-45cd-b60d-34020c383ab5",
    "expires_at": "2026-10-30T08:04:36.690477Z",
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

`POST /api/driver/v1/offers/7a9191d2-412a-42e0-b9c7-4b5d0c2ac750/accept` → **200**

```json
{
  "command_id": "f8cad242-f521-4e4d-8b3d-309ebe283b0c"
}
```

```json
{
  "id": "09d2031e-3606-4568-b293-8fd3d09838ce",
  "order_id": "b7901ac2-2a3d-45cd-b60d-34020c383ab5",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0638629b-879d-42b5-bc1e-633b6ee0a302",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0638629b-879d-42b5-bc1e-633b6ee0a302",
  "order_id": "b7901ac2-2a3d-45cd-b60d-34020c383ab5",
  "assignment_id": "09d2031e-3606-4568-b293-8fd3d09838ce",
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

`POST /api/driver/v1/work-sessions/1a421ab4-d91a-4c41-8bf7-5a3c9d9022ca/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:04:22Z",
    "sequence": 1793347462632
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1a421ab4-d91a-4c41-8bf7-5a3c9d9022ca",
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
  "last_heartbeat_at": "2026-10-30T08:04:22.649742Z",
  "last_location_at": "2026-10-30T08:04:22.649742Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0638629b-879d-42b5-bc1e-633b6ee0a302",
  "order_id": "b7901ac2-2a3d-45cd-b60d-34020c383ab5",
  "assignment_id": "09d2031e-3606-4568-b293-8fd3d09838ce",
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

`POST /api/driver/v1/trips/0638629b-879d-42b5-bc1e-633b6ee0a302/arrive` → **200**

```json
{
  "command_id": "45f88654-a2d4-42d7-92d3-61d3dbf9522b",
  "expected_version": 0
}
```

```json
{
  "id": "0638629b-879d-42b5-bc1e-633b6ee0a302",
  "order_id": "b7901ac2-2a3d-45cd-b60d-34020c383ab5",
  "assignment_id": "09d2031e-3606-4568-b293-8fd3d09838ce",
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
  "arrived_at": "2026-10-30T08:04:23.118119Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0638629b-879d-42b5-bc1e-633b6ee0a302/start` → **200**

```json
{
  "command_id": "dd89c5e7-0268-43af-b95d-5fee6770e330",
  "expected_version": 1
}
```

```json
{
  "id": "0638629b-879d-42b5-bc1e-633b6ee0a302",
  "order_id": "b7901ac2-2a3d-45cd-b60d-34020c383ab5",
  "assignment_id": "09d2031e-3606-4568-b293-8fd3d09838ce",
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
  "arrived_at": "2026-10-30T08:04:23.118119Z",
  "started_at": "2026-10-30T08:04:23.361213Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/1a421ab4-d91a-4c41-8bf7-5a3c9d9022ca/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:04:23Z",
    "sequence": 1793347463591
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1a421ab4-d91a-4c41-8bf7-5a3c9d9022ca",
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
  "last_heartbeat_at": "2026-10-30T08:04:23.608355Z",
  "last_location_at": "2026-10-30T08:04:23.608355Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/0638629b-879d-42b5-bc1e-633b6ee0a302/complete` → **200**

```json
{
  "command_id": "e1f66323-8548-424f-867f-0c29c1dcf5ff",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:04:23Z",
  "cash_received": true
}
```

```json
{
  "id": "0638629b-879d-42b5-bc1e-633b6ee0a302",
  "order_id": "b7901ac2-2a3d-45cd-b60d-34020c383ab5",
  "assignment_id": "09d2031e-3606-4568-b293-8fd3d09838ce",
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
  "arrived_at": "2026-10-30T08:04:23.118119Z",
  "started_at": "2026-10-30T08:04:23.361213Z",
  "completed_at": "2026-10-30T08:04:23.848783Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/b7901ac2-2a3d-45cd-b60d-34020c383ab5/rating` → **200**

```json
{
  "command_id": "29bdb441-7b79-4f95-b05c-82c4ba25f92f",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "b7901ac2-2a3d-45cd-b60d-34020c383ab5",
  "score": 5,
  "created_at": "2026-10-30T08:04:24.102363018Z"
}
```

`POST /api/driver/v1/orders/b7901ac2-2a3d-45cd-b60d-34020c383ab5/rating` → **200**

```json
{
  "command_id": "718e16e2-f0e0-41c6-af50-3dcf9d37cb48",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "b7901ac2-2a3d-45cd-b60d-34020c383ab5",
  "score": 4,
  "created_at": "2026-10-30T08:04:24.436300223Z"
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
  "session_id": "f98cc72a-1f52-40ea-9dbc-9d81aed511eb",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgzNjUsImlhdCI6MTc5MzM0NzQ2NSwianRpIjoiNzAzNzE5MjMtNTFjYi00NWQ0LWFkNmUtYTFiMjg3MmMwZTBjIiwic2lkIjoiZjk4Y2M3MmEtMWY1Mi00MGVhLTlkYmMtOWQ4MWFlZDUxMWViIn0.RIa6Lpzu5tTgjgEuMeSHJChimUHDIGEla8HqgbBi-z0",
  "access_expires_at": "2026-10-30T08:19:25.301963353Z",
  "refresh_token": "aKMAMAI6Dfa9gIGPM5Pt-ywSEvaseELLMtuBLqm1aqk",
  "refresh_expires_at": "2026-10-30T20:04:25.301436086Z",
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
  "session_id": "de1e3a12-6142-4b3d-814a-bef7bfdc304e",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgzNjUsImlhdCI6MTc5MzM0NzQ2NSwianRpIjoiZWNmYmY5OTAtMWNhNS00YWI5LTlkNmItMDY3MWMyZmZhYmQwIiwic2lkIjoiZGUxZTNhMTItNjE0Mi00YjNkLTgxNGEtYmVmN2JmZGMzMDRlIn0.RyHVr64e7HfUgzTT1qGpbdMvWyHS9DRjZysgAqH0iQ8",
  "access_expires_at": "2026-10-30T08:19:25.788122239Z",
  "refresh_token": "wqjmNkK4mAEuFlVumHx6lVsRCCJFrkKXW7yCo9Cu-Do",
  "refresh_expires_at": "2026-10-30T20:04:25.787632798Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b7901ac2-2a3d-45cd-b60d-34020c383ab5/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "b7901ac2-2a3d-45cd-b60d-34020c383ab5",
      "author_type": "RIDER",
      "author_id": "6a073def-abf2-4076-b5b8-08a928e25b57",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T08:04:24.102363Z"
    },
    {
      "order_id": "b7901ac2-2a3d-45cd-b60d-34020c383ab5",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "6a073def-abf2-4076-b5b8-08a928e25b57",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T08:04:24.4363Z"
    }
  ]
}
```

Done: ratings for order b7901ac2-2a3d-45cd-b60d-34020c383ab5.

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
  "session_id": "e08cef26-0ca0-45a6-bc5c-f265cf295b36",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgzNjYsImlhdCI6MTc5MzM0NzQ2NiwianRpIjoiNWU4NmNhMzAtYWY3Zi00Y2U3LTk3M2EtYmY1ZWZkY2E3ZDU5Iiwic2lkIjoiZTA4Y2VmMjYtMGNhMC00NWE2LWJjNWMtZjI2NWNmMjk1YjM2In0.h0FdsEZQzSlBvMDMRA-13aQ4O3TUpF7aG70FX0IuORs",
  "access_expires_at": "2026-10-30T08:19:26.543988851Z",
  "refresh_token": "wH-rWeJkT3Xmab-O0rNkohCiKPGYJUOmWeENsPFXOYQ",
  "refresh_expires_at": "2026-10-30T20:04:26.543538487Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "b7425c8a-8702-4551-8522-2797400f2524",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "0e354e4d-bbfe-4dac-a9ec-35798c9b8bf7",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:04:26.793367Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0e354e4d-bbfe-4dac-a9ec-35798c9b8bf7` → **200**

```json
{
  "id": "0e354e4d-bbfe-4dac-a9ec-35798c9b8bf7",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:04:26.793367Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0e354e4d-bbfe-4dac-a9ec-35798c9b8bf7` → **200**

```json
{
  "id": "0e354e4d-bbfe-4dac-a9ec-35798c9b8bf7",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:04:26.793367Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0e354e4d-bbfe-4dac-a9ec-35798c9b8bf7` → **200**

```json
{
  "id": "0e354e4d-bbfe-4dac-a9ec-35798c9b8bf7",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T08:04:26.793367Z",
  "ready_at": "2026-10-30T08:04:29.106005Z",
  "expires_at": "2026-10-31T08:04:29.106005Z"
}
```

`GET /api/admin/v1/reports/exports/0e354e4d-bbfe-4dac-a9ec-35798c9b8bf7/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "8399b7ec-b965-44d6-90ee-833dc54c5882",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "a6d4e55d-d434-48c6-9c44-89bf66f7ac19",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:04:29.767764Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a6d4e55d-d434-48c6-9c44-89bf66f7ac19` → **200**

```json
{
  "id": "a6d4e55d-d434-48c6-9c44-89bf66f7ac19",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:04:29.767764Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a6d4e55d-d434-48c6-9c44-89bf66f7ac19` → **200**

```json
{
  "id": "a6d4e55d-d434-48c6-9c44-89bf66f7ac19",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:04:29.767764Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a6d4e55d-d434-48c6-9c44-89bf66f7ac19` → **200**

```json
{
  "id": "a6d4e55d-d434-48c6-9c44-89bf66f7ac19",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:04:29.767764Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a6d4e55d-d434-48c6-9c44-89bf66f7ac19` → **200**

```json
{
  "id": "a6d4e55d-d434-48c6-9c44-89bf66f7ac19",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:04:29.767764Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a6d4e55d-d434-48c6-9c44-89bf66f7ac19` → **200**

```json
{
  "id": "a6d4e55d-d434-48c6-9c44-89bf66f7ac19",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T08:04:29.767764Z",
  "ready_at": "2026-10-30T08:04:34.112811Z",
  "expires_at": "2026-10-31T08:04:34.112811Z"
}
```

`GET /api/admin/v1/reports/exports/a6d4e55d-d434-48c6-9c44-89bf66f7ac19/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/cffe5677-e996-42c5-a23f-95f842abbf3d` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/cffe5677-e996-42c5-a23f-95f842abbf3d",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5fd469e1-f5c7-470f-a8e0-03fc6a43f1db"
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
  "session_id": "6b886e11-9660-4ff6-be4c-08db4063a467",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgzNzUsImlhdCI6MTc5MzM0NzQ3NSwianRpIjoiNzZkZWI4YjctMjFlMy00OGUyLWIxNzEtMzE1MjljYzM2MDE5Iiwic2lkIjoiNmI4ODZlMTEtOTY2MC00ZmY2LWJlNGMtMDhkYjQwNjNhNDY3In0.fl_rOKGjFT9Fp-UkpqGUN7GPHTb75M3AByMTUQyoPt8",
  "access_expires_at": "2026-10-30T08:19:35.757372069Z",
  "refresh_token": "Xd9taVt99d3MmAbhrK1WibhIRDEnUFu_RA9GzD5jkNE",
  "refresh_expires_at": "2026-10-30T20:04:35.756880305Z",
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
  "command_id": "a07f2cd9-4f74-47b6-a618-47d7ca610474",
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
  "changed_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T08:04:36.237006892Z"
}
```

`POST /sandbox/v1/retention/fixtures/7033a305-8927-4807-a60a-3a6aeaab0fcc` → **200**

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

`GET /sandbox/v1/retention/fixtures/7033a305-8927-4807-a60a-3a6aeaab0fcc` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/7033a305-8927-4807-a60a-3a6aeaab0fcc` → **204**

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
  "changed_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T08:04:36.237007Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "9a08a9e7-edfc-48a4-90cb-9d8d2d169b2a",
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
  "changed_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-30T08:04:36.805736529Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-6280"
}
```

```json
{
  "challenge_id": "b90e7c86-8ed2-4cf5-931d-d6752798e80f",
  "expires_at": "2026-10-30T08:09:37.045348009Z",
  "resend_available_at": "2026-10-30T08:04:38.045348009Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "046603",
  "sent_at": "2026-10-30T08:04:37.047373539Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b90e7c86-8ed2-4cf5-931d-d6752798e80f",
  "code": "046603",
  "device_ref": "sandbox-6280"
}
```

```json
{
  "session_id": "4a1458a7-5c99-4297-8ded-ee7b3734b644",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODM3NywiaWF0IjoxNzkzMzQ3NDc3LCJqdGkiOiJlMGM3MmU1Yi00YWFiLTRhOTktOWU3YS05MTZlNzg1YWFhZDQiLCJzaWQiOiI0YTE0NThhNy01Yzk5LTQyOTctOGRlZC1lZTdiMzczNGI2NDQifQ.LcnuDSESz7ff9a3t8-HDnb6Loba4h_IqtmTHQQwODRE",
  "access_expires_at": "2026-10-30T08:19:37.29738578Z",
  "refresh_token": "SI0yDsrSMikN62YUI0GCFhOrsGQmykFUlyu96_H24MY",
  "refresh_expires_at": "2026-11-29T08:04:37.296921496Z",
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
  "command_id": "b132f441-5e6a-4018-ad04-f2cef244aaa8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:04:37Z",
    "sequence": 1793347477974
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9a96a04c-a875-422c-b7ba-2a4cb3bbc040",
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
  "last_heartbeat_at": "2026-10-30T08:04:37.991648Z",
  "last_location_at": "2026-10-30T08:04:37.991648Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "da5cb397-3a1c-4b34-b072-1a1a3b2e5acd",
  "points": [
    {
      "sequence": 1793347480228,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T08:03:40Z"
    },
    {
      "sequence": 1793347480234,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T08:04:40Z"
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
  "session_id": "f242f3ec-0312-4e61-9c7c-4292f27887f4",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgzODAsImlhdCI6MTc5MzM0NzQ4MCwianRpIjoiMzUwMDliNDAtY2Q5NS00NzBlLWI0ZDgtNWRkZWE5ZmIzOGViIiwic2lkIjoiZjI0MmYzZWMtMDMxMi00ZTYxLTljN2MtNDI5MmYyNzg4N2Y0In0.NrRY7lcSudJy4j-E6n3duDfjCUeDBua_YWepsMRRPx8",
  "access_expires_at": "2026-10-30T08:19:40.759072975Z",
  "refresh_token": "F7i8oS_RUbYw366rNM-FIr-peOHJuSgM5MSnGDXZjj8",
  "refresh_expires_at": "2026-10-30T20:04:40.75860108Z",
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
      "id": "46c4a9ae-e818-47a9-919f-bbd5fd6627ca",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T08:04:40Z",
        "track_point_id": "23760711-0551-4992-a04e-7c882e490c03",
        "work_session_id": "9a96a04c-a875-422c-b7ba-2a4cb3bbc040"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T08:04:40Z",
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

`POST /api/admin/v1/driver-risk-flags/46c4a9ae-e818-47a9-919f-bbd5fd6627ca/confirm` → **200**

```json
{
  "command_id": "3d81e13f-8c37-4fba-93f2-375e35643341",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "46c4a9ae-e818-47a9-919f-bbd5fd6627ca",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T08:04:40Z",
    "track_point_id": "23760711-0551-4992-a04e-7c882e490c03",
    "work_session_id": "9a96a04c-a875-422c-b7ba-2a4cb3bbc040"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T08:04:40Z",
  "reason": null,
  "reviewed_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "reviewed_at": "2026-10-30T08:04:42.733552Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/46c4a9ae-e818-47a9-919f-bbd5fd6627ca/dismiss` → **409**

```json
{
  "command_id": "58c1de9a-ba26-4f7d-98c0-2e7bd9128ade",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/46c4a9ae-e818-47a9-919f-bbd5fd6627ca/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "be51972e-da60-424a-bb41-8536a830cf3f"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "1b0c6621-12aa-4310-b237-b4efaf5ba2f0",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "542b1e2c-080e-40fa-8fcc-2659604ece44",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "raised_at": "2026-10-30T08:04:43.248966Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/542b1e2c-080e-40fa-8fcc-2659604ece44/dismiss` → **200**

```json
{
  "command_id": "04c16f95-2766-406a-b6cd-89f3e840e62a",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "542b1e2c-080e-40fa-8fcc-2659604ece44",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "raised_at": "2026-10-30T08:04:43.248966Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "reviewed_at": "2026-10-30T08:04:43.495976Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "dacac31e-f891-4be5-a09b-ebdd2b41014b",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "46c4a9ae-e818-47a9-919f-bbd5fd6627ca"
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
      "actor_id": "db8502d0-b190-4276-94c9-6cc44299e7b3",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T08:04:43.743324Z"
    }
  ]
}
```

Done: flag 46c4a9ae-e818-47a9-919f-bbd5fd6627ca confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "63bfdce8-e166-4972-90a0-09ac2ee71cfa",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgzODQsImlhdCI6MTc5MzM0NzQ4NCwianRpIjoiM2QzZmQxMTctODFjZC00YzM2LWIzMjktZTlhNzZmYjAzMDVlIiwic2lkIjoiNjNiZmRjZTgtZTE2Ni00OTcyLTkwYTAtMDlhYzJlZTcxY2ZhIn0.AKJ6zCwzqqBWH91qKHfO5c3HI93PPIPYBZCSyB38bfY",
  "access_expires_at": "2026-10-30T08:19:44.550952161Z",
  "refresh_token": "-GB-9ED4Ed5Ta9ia8Fn19hJpB98MbZKr_-qq5ZXBANU",
  "refresh_expires_at": "2026-10-30T20:04:44.550412256Z",
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
      "actor_id": "db8502d0-b190-4276-94c9-6cc44299e7b3",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T08:04:43.743324Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "8a011c1d-2d42-4021-81b1-a4f3dabd9eab",
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
  "session_id": "9a96a04c-a875-422c-b7ba-2a4cb3bbc040",
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
  "last_heartbeat_at": "2026-10-30T08:04:37.991648Z",
  "last_location_at": "2026-10-30T08:04:37.991648Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9a96a04c-a875-422c-b7ba-2a4cb3bbc040/close` → **200**

```json
{
  "command_id": "a6b9dc17-03f2-4be4-badb-83947eae37fc",
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
  "session_id": "8abf62c2-cd16-4bff-8e83-a63b61d40177",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgzODUsImlhdCI6MTc5MzM0NzQ4NSwianRpIjoiYzM3NmNmMWQtZmVhMC00MTE1LTljOTEtYjU3YWE3ZjdkMzJiIiwic2lkIjoiOGFiZjYyYzItY2QxNi00YmZmLThlODMtYTYzYjYxZDQwMTc3In0.GQFEM2__GeceKO5C7UQ1aeBqg5JdJLhyCOh_RWm83Po",
  "access_expires_at": "2026-10-30T08:19:45.996347463Z",
  "refresh_token": "JeQ-UlnX6Kf1c3-Av6i_Lo9QqzUA2k3f2sFQxfnIXKQ",
  "refresh_expires_at": "2026-10-30T20:04:45.995884942Z",
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
  "command_id": "cae8920b-cd78-4ae1-986b-3cfc6f3d2c37",
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
  "changed_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T08:04:46.471494Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "cae8920b-cd78-4ae1-986b-3cfc6f3d2c37",
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
  "changed_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T08:04:46.471494Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48270290143",
  "device_ref": "sandbox-16089"
}
```

```json
{
  "challenge_id": "524c19d1-e1fd-4b20-b344-d581782c51a1",
  "expires_at": "2026-10-30T08:09:46.945803775Z",
  "resend_available_at": "2026-10-30T08:04:47.945803775Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48270290143` → **200**

```json
{
  "phone": "+48270290143",
  "audience": "CLIENT",
  "code": "996380",
  "sent_at": "2026-10-30T08:04:46.947990688Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "524c19d1-e1fd-4b20-b344-d581782c51a1",
  "code": "996380",
  "device_ref": "sandbox-16089"
}
```

```json
{
  "session_id": "eaa69859-b1f1-4672-aeec-0a6b3459c121",
  "subject": {
    "type": "CLIENT",
    "id": "5d76b509-0961-4eec-a614-c0f02d9461eb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDc2YjUwOS0wOTYxLTRlZWMtYTYxNC1jMGYwMmQ5NDYxZWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4Mzg3LCJpYXQiOjE3OTMzNDc0ODcsImp0aSI6IjNmZDJmNjE4LThhMTItNDRjOC05NjQzLWRmZGZiNDdjZjhjNyIsInNpZCI6ImVhYTY5ODU5LWIxZjEtNDY3Mi1hZWVjLTBhNmIzNDU5YzEyMSJ9.YQmAxk6FKck8iVOrUra8DkAphu0wRpt3tet4deZRDdc",
  "access_expires_at": "2026-10-30T08:19:47.19991513Z",
  "refresh_token": "XutNnuX6ItoLtIUYGJOxeACOz-FJhOSxz0tMoRfa9os",
  "refresh_expires_at": "2026-11-29T08:04:47.199370187Z",
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
  "correlation_id": "f627ed3f-012a-4b01-b142-96f214e18b45"
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
  "device_ref": "sandbox-12129"
}
```

```json
{
  "challenge_id": "530f8961-9654-44ad-bf8b-b7f97ae50cc3",
  "expires_at": "2026-10-30T08:09:47.893624537Z",
  "resend_available_at": "2026-10-30T08:04:48.893624537Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "422116",
  "sent_at": "2026-10-30T08:04:47.958768113Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "530f8961-9654-44ad-bf8b-b7f97ae50cc3",
  "code": "422116",
  "device_ref": "sandbox-12129"
}
```

```json
{
  "session_id": "e92b9340-2f3f-461c-b448-dbda3a76e49f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODM4OCwiaWF0IjoxNzkzMzQ3NDg4LCJqdGkiOiJjZTU0ZGUxNS0zMjcxLTRjOTUtOWMyYy00YTY3OTg2OTlkY2UiLCJzaWQiOiJlOTJiOTM0MC0yZjNmLTQ2MWMtYjQ0OC1kYmRhM2E3NmU0OWYifQ.-r9j8T1O498Wt0GyqYwS_imQUTY3ElQX1zWxXHWT5AM",
  "access_expires_at": "2026-10-30T08:19:48.211956778Z",
  "refresh_token": "41EkTQl3TeUYhN17QjSKFeyiM4icdIOI_jh8uoJMw2o",
  "refresh_expires_at": "2026-11-29T08:04:48.211514847Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "02ed6394-2965-4e62-b185-7e31dfdc3c2e",
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
  "last_heartbeat_at": "2026-10-30T08:04:17.506032Z",
  "last_location_at": "2026-10-30T08:04:17.506032Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/02ed6394-2965-4e62-b185-7e31dfdc3c2e/handover` → **200**

```json
{
  "command_id": "30533c74-e175-48cb-80c3-e75f215f269f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "02ed6394-2965-4e62-b185-7e31dfdc3c2e",
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
  "last_heartbeat_at": "2026-10-30T08:04:17.506032Z",
  "last_location_at": "2026-10-30T08:04:17.506032Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/02ed6394-2965-4e62-b185-7e31dfdc3c2e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:04:48Z",
    "sequence": 1793347488883
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "02ed6394-2965-4e62-b185-7e31dfdc3c2e",
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
  "last_heartbeat_at": "2026-10-30T08:04:48.900387Z",
  "last_location_at": "2026-10-30T08:04:48.900387Z",
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
  "session_id": "02ed6394-2965-4e62-b185-7e31dfdc3c2e",
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
  "last_heartbeat_at": "2026-10-30T08:04:48.900387Z",
  "last_location_at": "2026-10-30T08:04:48.900387Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/02ed6394-2965-4e62-b185-7e31dfdc3c2e/close` → **200**

```json
{
  "command_id": "60a5cdc7-5d17-4b66-9b53-c7d02030d545",
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
  "correlation_id": "843ee704-9b31-42f6-b859-0daa3c194d97"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676649403",
  "device_ref": "sandbox-15727"
}
```

```json
{
  "challenge_id": "3d184e7e-d7d2-41ce-b736-7a0ec25e78ee",
  "expires_at": "2026-10-30T08:09:50.087544478Z",
  "resend_available_at": "2026-10-30T08:04:51.087544478Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676649403` → **200**

```json
{
  "phone": "+380676649403",
  "audience": "CLIENT",
  "code": "505638",
  "sent_at": "2026-10-30T08:04:50.089660005Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3d184e7e-d7d2-41ce-b736-7a0ec25e78ee",
  "code": "505638",
  "device_ref": "sandbox-15727"
}
```

```json
{
  "session_id": "e52cc7ba-3dda-42c8-a444-4ce34162779b",
  "subject": {
    "type": "CLIENT",
    "id": "f9209e72-1a97-4ba2-997e-97d993e0b89e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmOTIwOWU3Mi0xYTk3LTRiYTItOTk3ZS05N2Q5OTNlMGI4OWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MzkwLCJpYXQiOjE3OTMzNDc0OTAsImp0aSI6IjU3ZjY4ZDFhLWYzOTEtNGQ4MS1hOWQ1LTk5NDE1MDVjYzM3MiIsInNpZCI6ImU1MmNjN2JhLTNkZGEtNDJjOC1hNDQ0LTRjZTM0MTYyNzc5YiJ9.PublJ5M7vHZqvmcmIdnW6mh9eKvuVXPcOmh66X0d_O0",
  "access_expires_at": "2026-10-30T08:19:50.341478427Z",
  "refresh_token": "sh-g2aIDjMBMaaV2urbLOPzLin2JGlU_rXM0Ozy05YE",
  "refresh_expires_at": "2026-11-29T08:04:50.341050727Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "1b35f340-e01c-4c8a-aa2f-72501d6db57a",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "361d6e57-0481-470a-afbd-76615120b8c8",
  "upload_path": "/api/rider/v1/uploads/361d6e57-0481-470a-afbd-76615120b8c8",
  "expires_at": "2026-10-30T08:19:50.581192948Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/361d6e57-0481-470a-afbd-76615120b8c8` → **200**

```json
{
  "file_id": "361d6e57-0481-470a-afbd-76615120b8c8",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "78bb77e0-672e-4c2c-af55-b29c291bde8b",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "361d6e57-0481-470a-afbd-76615120b8c8"
  ]
}
```

```json
{
  "id": "d11144c4-7413-4572-981b-6a3f4dfc2baa",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f9209e72-1a97-4ba2-997e-97d993e0b89e",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T08:04:50.842004Z",
  "updated_at": "2026-10-30T08:04:50.842004Z",
  "respond_by": "2026-10-30T12:04:50.842004Z",
  "messages": [
    {
      "id": "d644cc3a-8d56-4c2f-9304-1236342ba403",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f9209e72-1a97-4ba2-997e-97d993e0b89e",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T08:04:50.842732Z",
      "attachments": [
        {
          "file_id": "361d6e57-0481-470a-afbd-76615120b8c8",
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
  "session_id": "a8185ceb-8fa9-429b-9a6e-5fdc2ff3d931",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgzOTEsImlhdCI6MTc5MzM0NzQ5MSwianRpIjoiZjM3NDNlZDYtNmVmZC00ZGFjLTkxZjktZDFiZmU4ODA3OGUwIiwic2lkIjoiYTgxODVjZWItOGZhOS00MjliLTlhNmUtNWZkYzJmZjNkOTMxIn0.tAbk_16ec6t5NIQkIKkjk8_L_BwLEzjR0Yr-HJ99ZiE",
  "access_expires_at": "2026-10-30T08:19:51.35158541Z",
  "refresh_token": "ehpFViAP64N51-2se6JJSMiAxwy9RfF29O0CkWCs658",
  "refresh_expires_at": "2026-10-30T20:04:51.351136238Z",
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
  "session_id": "c96919c7-c293-432d-8698-f3fa0627c2e6",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgzOTEsImlhdCI6MTc5MzM0NzQ5MSwianRpIjoiNTJmYTU5ZjAtNDY4Mi00YThiLThlZjMtYzIzMWJkZDBlZmY1Iiwic2lkIjoiYzk2OTE5YzctYzI5My00MzJkLTg2OTgtZjNmYTA2MjdjMmU2In0.I_pvKQ8PGGTAuboHM9Th0t9XRN7b3ckBjKsE7DdX3OQ",
  "access_expires_at": "2026-10-30T08:19:51.834061572Z",
  "refresh_token": "iHqm_l4VUb3YVu2MjzLdni-6KIcwtZkISLxcAVdBwg4",
  "refresh_expires_at": "2026-10-30T20:04:51.833635985Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/d11144c4-7413-4572-981b-6a3f4dfc2baa/attachments/361d6e57-0481-470a-afbd-76615120b8c8` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "869c872f-86f6-4d5f-aecc-d553c98b0639",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "54bf0a88-c891-48cd-a3a7-94dab8908241",
  "upload_path": "/api/operator/v1/uploads/54bf0a88-c891-48cd-a3a7-94dab8908241",
  "expires_at": "2026-10-30T08:19:52.078792791Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/54bf0a88-c891-48cd-a3a7-94dab8908241` → **200**

```json
{
  "file_id": "54bf0a88-c891-48cd-a3a7-94dab8908241",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/d11144c4-7413-4572-981b-6a3f4dfc2baa` → **200**

```json
{
  "id": "d11144c4-7413-4572-981b-6a3f4dfc2baa",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f9209e72-1a97-4ba2-997e-97d993e0b89e",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T08:04:50.842004Z",
  "updated_at": "2026-10-30T08:04:50.842004Z",
  "respond_by": "2026-10-30T12:04:50.842004Z",
  "messages": [
    {
      "id": "d644cc3a-8d56-4c2f-9304-1236342ba403",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f9209e72-1a97-4ba2-997e-97d993e0b89e",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T08:04:50.842732Z",
      "attachments": [
        {
          "file_id": "361d6e57-0481-470a-afbd-76615120b8c8",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/d11144c4-7413-4572-981b-6a3f4dfc2baa/comments` → **200**

```json
{
  "command_id": "4ca35abe-6d13-4af5-a39d-1367e6748c8c",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "54bf0a88-c891-48cd-a3a7-94dab8908241"
  ]
}
```

```json
{
  "id": "d11144c4-7413-4572-981b-6a3f4dfc2baa",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f9209e72-1a97-4ba2-997e-97d993e0b89e",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T08:04:50.842004Z",
  "updated_at": "2026-10-30T08:04:52.578491Z",
  "respond_by": "2026-10-30T12:04:50.842004Z",
  "messages": [
    {
      "id": "d644cc3a-8d56-4c2f-9304-1236342ba403",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f9209e72-1a97-4ba2-997e-97d993e0b89e",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T08:04:50.842732Z",
      "attachments": [
        {
          "file_id": "361d6e57-0481-470a-afbd-76615120b8c8",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "cc970e85-f110-4705-aec7-bddc4e01d7c9",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "db8502d0-b190-4276-94c9-6cc44299e7b3",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T08:04:52.578075Z",
      "attachments": [
        {
          "file_id": "54bf0a88-c891-48cd-a3a7-94dab8908241",
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

`GET /api/rider/v1/support/cases/d11144c4-7413-4572-981b-6a3f4dfc2baa` → **200**

```json
{
  "id": "d11144c4-7413-4572-981b-6a3f4dfc2baa",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f9209e72-1a97-4ba2-997e-97d993e0b89e",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T08:04:50.842004Z",
  "updated_at": "2026-10-30T08:04:52.578491Z",
  "respond_by": "2026-10-30T12:04:50.842004Z",
  "messages": [
    {
      "id": "d644cc3a-8d56-4c2f-9304-1236342ba403",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f9209e72-1a97-4ba2-997e-97d993e0b89e",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T08:04:50.842732Z",
      "attachments": [
        {
          "file_id": "361d6e57-0481-470a-afbd-76615120b8c8",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "cc970e85-f110-4705-aec7-bddc4e01d7c9",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T08:04:52.578075Z",
      "attachments": [
        {
          "file_id": "54bf0a88-c891-48cd-a3a7-94dab8908241",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/d11144c4-7413-4572-981b-6a3f4dfc2baa/attachments/54bf0a88-c891-48cd-a3a7-94dab8908241` → **200**

Done: support case d11144c4-7413-4572-981b-6a3f4dfc2baa, rider attachment 361d6e57-0481-470a-afbd-76615120b8c8, operator attachment 54bf0a88-c891-48cd-a3a7-94dab8908241.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734378924",
  "device_ref": "sandbox-12669"
}
```

```json
{
  "challenge_id": "78c55ac5-e7f6-4c69-b419-07e555110c38",
  "expires_at": "2026-10-30T08:09:53.080179183Z",
  "resend_available_at": "2026-10-30T08:04:54.080179183Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734378924` → **200**

```json
{
  "phone": "+380734378924",
  "audience": "CLIENT",
  "code": "743485",
  "sent_at": "2026-10-30T08:04:53.083141353Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "78c55ac5-e7f6-4c69-b419-07e555110c38",
  "code": "743485",
  "device_ref": "sandbox-12669"
}
```

```json
{
  "session_id": "6949f5b1-7f60-47ad-b523-69b9a5ea0bcd",
  "subject": {
    "type": "CLIENT",
    "id": "1f44091f-d43d-43ea-b60e-7d32b382c79b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjQ0MDkxZi1kNDNkLTQzZWEtYjYwZS03ZDMyYjM4MmM3OWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4MzkzLCJpYXQiOjE3OTMzNDc0OTMsImp0aSI6IjQxM2EwYWMyLThlN2QtNDNlOS1iNzNmLTQyOTViNzA4MDlmMCIsInNpZCI6IjY5NDlmNWIxLTdmNjAtNDdhZC1iNTIzLTY5YjlhNWVhMGJjZCJ9.IzLe8kYAAzSBP9PCjua6cPHJgExg37HsmjcY2eMSQy0",
  "access_expires_at": "2026-10-30T08:19:53.336664432Z",
  "refresh_token": "YJ8bKp5wvAQs0RHLIIdFf4Srr5gHffYB6gAchCV7UsI",
  "refresh_expires_at": "2026-11-29T08:04:53.336257052Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "ccb490cb-6d57-487f-8688-e8bb3dd2acb8",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "fa216ee7-dfa8-47ed-af2d-22cec6a618cc",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-fa216ee7-dfa8-47ed-af2d-22cec6a618cc",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "bb7ec204f567629b06854a4e158141a2",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=fa216ee7-dfa8-47ed-af2d-22cec6a618cc",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734378924"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=fa216ee7-dfa8-47ed-af2d-22cec6a618cc",
  "expires_at": "2026-10-30T08:34:53.569666Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/fa216ee7-dfa8-47ed-af2d-22cec6a618cc` → **200**

```json
{
  "id": "fa216ee7-dfa8-47ed-af2d-22cec6a618cc",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T08:34:53.569666Z",
  "card": {
    "id": "8e6ced8f-77f8-4653-9608-60bc361a7e1b",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8875",
    "card_type": "Visa",
    "created_at": "2026-10-30T08:04:53.801657Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f7c47e4f-b1fc-4cb4-865b-af1e42a2339d",
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
  "id": "d06b351a-0f6f-4422-9f3f-7fcfe898b3b7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:09:54.051446Z",
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
  "command_id": "b7c3f2f1-4e42-4d95-acf3-78e2e3949574",
  "quote_id": "d06b351a-0f6f-4422-9f3f-7fcfe898b3b7",
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
  "id": "5fca2eb1-4513-4b34-b978-ebaafa519fe2",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1f44091f-d43d-43ea-b60e-7d32b382c79b",
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
  "created_at": "2026-10-30T08:04:54.298699Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5fca2eb1-4513-4b34-b978-ebaafa519fe2` → **200**

```json
{
  "id": "5fca2eb1-4513-4b34-b978-ebaafa519fe2",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1f44091f-d43d-43ea-b60e-7d32b382c79b",
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
  "created_at": "2026-10-30T08:04:54.298699Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5fca2eb1-4513-4b34-b978-ebaafa519fe2` → **200**

```json
{
  "id": "5fca2eb1-4513-4b34-b978-ebaafa519fe2",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1f44091f-d43d-43ea-b60e-7d32b382c79b",
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
  "created_at": "2026-10-30T08:04:54.298699Z",
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

`GET /api/rider/v1/orders/5fca2eb1-4513-4b34-b978-ebaafa519fe2` → **200**

```json
{
  "id": "5fca2eb1-4513-4b34-b978-ebaafa519fe2",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1f44091f-d43d-43ea-b60e-7d32b382c79b",
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
  "created_at": "2026-10-30T08:04:54.298699Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5fca2eb1-4513-4b34-b978-ebaafa519fe2/switch-to-cash` → **200**

```json
{
  "command_id": "5ccc674a-5cde-4e64-91cf-a18a231ea98e",
  "expected_version": 3
}
```

```json
{
  "id": "5fca2eb1-4513-4b34-b978-ebaafa519fe2",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "1f44091f-d43d-43ea-b60e-7d32b382c79b",
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
  "created_at": "2026-10-30T08:04:54.298699Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5fca2eb1-4513-4b34-b978-ebaafa519fe2/switch-to-cash` → **409**

```json
{
  "command_id": "a63937e6-0305-4e36-9204-7bae61e8fc96",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/5fca2eb1-4513-4b34-b978-ebaafa519fe2/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "baadf9c2-bce2-42a8-a51f-4710c4461f54"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/5fca2eb1-4513-4b34-b978-ebaafa519fe2` → **200**

```json
{
  "id": "5fca2eb1-4513-4b34-b978-ebaafa519fe2",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "1f44091f-d43d-43ea-b60e-7d32b382c79b",
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
  "created_at": "2026-10-30T08:04:54.298699Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5fca2eb1-4513-4b34-b978-ebaafa519fe2/cancel` → **200**

```json
{
  "command_id": "76b02db9-88d3-41da-92e9-6d3d2c53548f",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5fca2eb1-4513-4b34-b978-ebaafa519fe2",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "1f44091f-d43d-43ea-b60e-7d32b382c79b",
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
  "created_at": "2026-10-30T08:04:54.298699Z",
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
  "session_id": "fe169314-c8ee-428e-8215-f3f75d2ae85b",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDgzOTcsImlhdCI6MTc5MzM0NzQ5NywianRpIjoiZjQ3NDAzOWYtNDNlMC00ZTQ1LWFmMzgtMDY3OTc0MDc3MDFmIiwic2lkIjoiZmUxNjkzMTQtYzhlZS00MjhlLTgyMTUtZjNmNzVkMmFlODViIn0.kbBvSRsQ2KKjJ-95usaI3ezAc-yYfnPuxOOAugvWDJ4",
  "access_expires_at": "2026-10-30T08:19:57.750696434Z",
  "refresh_token": "LCv1cLK5PIAA5OtwezupC0Onz9iCRb2_rBShemFUP68",
  "refresh_expires_at": "2026-10-30T20:04:57.750154386Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-20506"
}
```

```json
{
  "challenge_id": "7e7b54ee-6d58-4ae4-ac68-9ac02bf52657",
  "expires_at": "2026-10-30T08:09:57.976947703Z",
  "resend_available_at": "2026-10-30T08:04:58.976947703Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "096486",
  "sent_at": "2026-10-30T08:04:57.97973129Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7e7b54ee-6d58-4ae4-ac68-9ac02bf52657",
  "code": "096486",
  "device_ref": "sandbox-20506"
}
```

```json
{
  "session_id": "b5ffeed5-8207-45d7-a612-df87299d5293",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODM5OCwiaWF0IjoxNzkzMzQ3NDk4LCJqdGkiOiI4YzIxZDM5OC1mNTljLTRhNmQtYTZlYy1hNTg2ZDc0MjYzMzUiLCJzaWQiOiJiNWZmZWVkNS04MjA3LTQ1ZDctYTYxMi1kZjg3Mjk5ZDUyOTMifQ.Qjez9Nt6LOSfiDro3n1Ru1p3a_SIgq64oq8J8GHax3k",
  "access_expires_at": "2026-10-30T08:19:58.238076487Z",
  "refresh_token": "I7FLMMvJKTeg0FDmqecva7Afz-9f9j1dmhygiSFz1yg",
  "refresh_expires_at": "2026-11-29T08:04:58.237623554Z",
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
      "actor_id": "db8502d0-b190-4276-94c9-6cc44299e7b3",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T08:04:43.743324Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "db8502d0-b190-4276-94c9-6cc44299e7b3",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T08:04:45.023144Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "f2f89f88-15cc-44d0-b786-36195c88c157",
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
  "device_ref": "sandbox-4291"
}
```

```json
{
  "challenge_id": "b9561a35-d443-4ac7-8cc9-5322fefb3e2d",
  "expires_at": "2026-10-30T08:09:59.165262967Z",
  "resend_available_at": "2026-10-30T08:05:00.165262967Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "217760",
  "sent_at": "2026-10-30T08:04:59.16731775Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b9561a35-d443-4ac7-8cc9-5322fefb3e2d",
  "code": "217760",
  "device_ref": "sandbox-4291"
}
```

```json
{
  "session_id": "066ea210-e7db-43ca-85bc-3d30bf269cbd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODM5OSwiaWF0IjoxNzkzMzQ3NDk5LCJqdGkiOiI4NDJjNTE1Yi1mZmI2LTQzM2ItYTExNy00YzI3OThjOWFmMWIiLCJzaWQiOiIwNjZlYTIxMC1lN2RiLTQzY2EtODViYy0zZDMwYmYyNjljYmQifQ.CH_346YnEVZMn-RgNvls-YagOtJOqbqhrrQ7-SAO-hs",
  "access_expires_at": "2026-10-30T08:19:59.417625213Z",
  "refresh_token": "MORPtBARwckR_Ux2be7r5M00DGk7gXsid_H9h8Wjbqo",
  "refresh_expires_at": "2026-11-29T08:04:59.417170733Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1a421ab4-d91a-4c41-8bf7-5a3c9d9022ca",
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
  "last_heartbeat_at": "2026-10-30T08:04:23.608355Z",
  "last_location_at": "2026-10-30T08:04:23.608355Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/1a421ab4-d91a-4c41-8bf7-5a3c9d9022ca/handover` → **200**

```json
{
  "command_id": "df5c618e-c5a7-41ce-9c6b-44a22d544cd6",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1a421ab4-d91a-4c41-8bf7-5a3c9d9022ca",
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
  "last_heartbeat_at": "2026-10-30T08:04:23.608355Z",
  "last_location_at": "2026-10-30T08:04:23.608355Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/1a421ab4-d91a-4c41-8bf7-5a3c9d9022ca/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:05:00Z",
    "sequence": 1793347500926
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1a421ab4-d91a-4c41-8bf7-5a3c9d9022ca",
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
  "last_heartbeat_at": "2026-10-30T08:05:00.108399Z",
  "last_location_at": "2026-10-30T08:05:00.108399Z",
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
  "command_id": "e94ba012-7a15-4ead-b43c-5b5a012609b7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:05:00Z",
    "sequence": 1793347500927
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "dc1032f4-5a2e-419e-a638-11595de0ee47",
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
  "last_heartbeat_at": "2026-10-30T08:05:00.573168Z",
  "last_location_at": "2026-10-30T08:05:00.573168Z",
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
  "session_id": "89e1e551-4f92-4b22-857b-90e4222e1a07",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg0MDEsImlhdCI6MTc5MzM0NzUwMSwianRpIjoiOWEwMjY0MDUtMmMwMy00MmQ1LWJhNmUtYWM1MGIxODZmZjNmIiwic2lkIjoiODllMWU1NTEtNGY5Mi00YjIyLTg1N2ItOTBlNDIyMmUxYTA3In0.cBG_HERND6ERbMZcvxwizyFnl4t4HzIx3NuK4peBktk",
  "access_expires_at": "2026-10-30T08:20:01.065538555Z",
  "refresh_token": "8WNOmFMzrv3g0k3U3DLH4IEh3ZNCNQWx5ugS10VrL9k",
  "refresh_expires_at": "2026-10-30T20:05:01.06499841Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "71b2a6a9-467f-430f-8af4-dd01437cb528",
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
  "id": "492653fa-aa44-41be-9263-609637aa95ca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:10:01.293318Z",
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
  "command_id": "4ca2ad55-89a5-45dd-8aef-d1e85861b447",
  "quote_id": "492653fa-aa44-41be-9263-609637aa95ca",
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
  "id": "d8d291c8-7eb8-4a58-bbd7-5063a2c80d93",
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
  "created_at": "2026-10-30T08:05:01.542579Z",
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
    "id": "83f1217d-e52d-456d-b5a0-84232b6a2aa4",
    "order_id": "d8d291c8-7eb8-4a58-bbd7-5063a2c80d93",
    "expires_at": "2026-10-30T08:05:16.545665Z",
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

`POST /api/driver/v1/offers/83f1217d-e52d-456d-b5a0-84232b6a2aa4/accept` → **200**

```json
{
  "command_id": "ebcdf44f-557a-4140-8798-37188fa18476"
}
```

```json
{
  "id": "04f5c9d3-5973-4b06-995f-0389f2e993a7",
  "order_id": "d8d291c8-7eb8-4a58-bbd7-5063a2c80d93",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a9bb1e5f-8040-4888-8a91-d0cd19da639d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a9bb1e5f-8040-4888-8a91-d0cd19da639d",
  "order_id": "d8d291c8-7eb8-4a58-bbd7-5063a2c80d93",
  "assignment_id": "04f5c9d3-5973-4b06-995f-0389f2e993a7",
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

`POST /api/driver/v1/work-sessions/dc1032f4-5a2e-419e-a638-11595de0ee47/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:05:02Z",
    "sequence": 1793347502698
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "dc1032f4-5a2e-419e-a638-11595de0ee47",
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
  "last_heartbeat_at": "2026-10-30T08:05:02.714023Z",
  "last_location_at": "2026-10-30T08:05:02.714023Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a9bb1e5f-8040-4888-8a91-d0cd19da639d/arrive` → **200**

```json
{
  "command_id": "154776c2-1ee9-4389-a0d7-84dc42c02b05",
  "expected_version": 0
}
```

```json
{
  "id": "a9bb1e5f-8040-4888-8a91-d0cd19da639d",
  "order_id": "d8d291c8-7eb8-4a58-bbd7-5063a2c80d93",
  "assignment_id": "04f5c9d3-5973-4b06-995f-0389f2e993a7",
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
  "arrived_at": "2026-10-30T08:05:02.949005Z",
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

`POST /api/driver/v1/trips/a9bb1e5f-8040-4888-8a91-d0cd19da639d/start` → **200**

```json
{
  "command_id": "071b8ca7-6831-48d8-8461-629bcaeff58b",
  "expected_version": 1
}
```

```json
{
  "id": "a9bb1e5f-8040-4888-8a91-d0cd19da639d",
  "order_id": "d8d291c8-7eb8-4a58-bbd7-5063a2c80d93",
  "assignment_id": "04f5c9d3-5973-4b06-995f-0389f2e993a7",
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
  "arrived_at": "2026-10-30T08:05:02.949005Z",
  "started_at": "2026-10-30T08:05:03.191802Z",
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

`POST /api/driver/v1/trips/a9bb1e5f-8040-4888-8a91-d0cd19da639d/complete` → **200**

```json
{
  "command_id": "96195c47-14fc-4467-a1b5-4f2248bf56fe",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:05:03Z",
  "cash_received": true
}
```

```json
{
  "id": "a9bb1e5f-8040-4888-8a91-d0cd19da639d",
  "order_id": "d8d291c8-7eb8-4a58-bbd7-5063a2c80d93",
  "assignment_id": "04f5c9d3-5973-4b06-995f-0389f2e993a7",
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
  "arrived_at": "2026-10-30T08:05:02.949005Z",
  "started_at": "2026-10-30T08:05:03.191802Z",
  "completed_at": "2026-10-30T08:05:03.453894Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/d8d291c8-7eb8-4a58-bbd7-5063a2c80d93` → **200**

```json
{
  "id": "d8d291c8-7eb8-4a58-bbd7-5063a2c80d93",
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
    "id": "04f5c9d3-5973-4b06-995f-0389f2e993a7",
    "order_id": "d8d291c8-7eb8-4a58-bbd7-5063a2c80d93",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a9bb1e5f-8040-4888-8a91-d0cd19da639d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:05:01.542579Z",
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
  "session_id": "1a421ab4-d91a-4c41-8bf7-5a3c9d9022ca",
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
  "last_heartbeat_at": "2026-10-30T08:05:00.108399Z",
  "last_location_at": "2026-10-30T08:05:00.108399Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1a421ab4-d91a-4c41-8bf7-5a3c9d9022ca/close` → **200**

```json
{
  "command_id": "c4bfc453-b3fb-4bf7-b72a-68427ebad5a1",
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
  "session_id": "dc1032f4-5a2e-419e-a638-11595de0ee47",
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
  "last_heartbeat_at": "2026-10-30T08:05:02.714023Z",
  "last_location_at": "2026-10-30T08:05:02.714023Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dc1032f4-5a2e-419e-a638-11595de0ee47/close` → **200**

```json
{
  "command_id": "589517c3-ffc0-4969-a5fc-19732e8a1d99",
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

Done: terminal order d8d291c8-7eb8-4a58-bbd7-5063a2c80d93 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2254"
}
```

```json
{
  "challenge_id": "1656f622-a2e8-4549-a4cd-9a1493bd11c9",
  "expires_at": "2026-10-30T08:10:08.142641683Z",
  "resend_available_at": "2026-10-30T08:05:09.142641683Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "474287",
  "sent_at": "2026-10-30T08:05:08.144718022Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1656f622-a2e8-4549-a4cd-9a1493bd11c9",
  "code": "474287",
  "device_ref": "sandbox-2254"
}
```

```json
{
  "session_id": "fe5f200a-9054-4222-bf62-6af184be09c2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODQwOCwiaWF0IjoxNzkzMzQ3NTA4LCJqdGkiOiI0NTEzZGU1NS0yN2EyLTRjYmEtYjdkMC1lMzA1MzhmNDMwNTMiLCJzaWQiOiJmZTVmMjAwYS05MDU0LTQyMjItYmY2Mi02YWYxODRiZTA5YzIifQ.18vPV6rSAuzwfal1WPqZT3_Mj_8Rb_fmJaJH4sDMAlE",
  "access_expires_at": "2026-10-30T08:20:08.397010958Z",
  "refresh_token": "Zp-CL7csY_Nf1cZkJJfexiNqDLPUZl5EixTlhE4pZYA",
  "refresh_expires_at": "2026-11-29T08:05:08.396557479Z",
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
  "device_ref": "sandbox-27310"
}
```

```json
{
  "challenge_id": "eb73b26a-d61f-4917-87ba-ac4163beba7f",
  "expires_at": "2026-10-30T08:10:08.851422095Z",
  "resend_available_at": "2026-10-30T08:05:09.851422095Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "130257",
  "sent_at": "2026-10-30T08:05:08.853479637Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eb73b26a-d61f-4917-87ba-ac4163beba7f",
  "code": "130257",
  "device_ref": "sandbox-27310"
}
```

```json
{
  "session_id": "e049152b-d8f2-497f-9a5c-3af38a0c5191",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODQwOSwiaWF0IjoxNzkzMzQ3NTA5LCJqdGkiOiI4ZDYxNjE4OC00NmI5LTQ1YTQtYjJjNi0wNmUwMmY2OWM2MWIiLCJzaWQiOiJlMDQ5MTUyYi1kOGYyLTQ5N2YtOWE1Yy0zYWYzOGEwYzUxOTEifQ.bqEK_pgaGIg2c2IUbhn6Kag0ZESXec6-nVoxMRMhBCs",
  "access_expires_at": "2026-10-30T08:20:09.103571895Z",
  "refresh_token": "M__3kVT7gRocrwpqLTnVzvRUqFGjvXg1qQaQl_PIe_M",
  "refresh_expires_at": "2026-11-29T08:05:09.103152226Z",
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
  "device_ref": "sandbox-27339"
}
```

```json
{
  "challenge_id": "4fbe076a-be25-42ab-8b95-7ec4b7fc0cb1",
  "expires_at": "2026-10-30T08:10:09.555566491Z",
  "resend_available_at": "2026-10-30T08:05:10.555566491Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "134405",
  "sent_at": "2026-10-30T08:05:09.558507926Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4fbe076a-be25-42ab-8b95-7ec4b7fc0cb1",
  "code": "134405",
  "device_ref": "sandbox-27339"
}
```

```json
{
  "session_id": "cbd1bf83-8d66-44b3-a0a5-1e4aea0b0a1c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODQwOSwiaWF0IjoxNzkzMzQ3NTA5LCJqdGkiOiIyYTcxMGFhNy1mZTA3LTRmZGQtYTg1Zi0yNjc5MDJmNDU0MjgiLCJzaWQiOiJjYmQxYmY4My04ZDY2LTQ0YjMtYTBhNS0xZTRhZWEwYjBhMWMifQ.v_nNw6sv5LH5c8vtWkvO_I6ycw219YQ-qv6SQMthOwc",
  "access_expires_at": "2026-10-30T08:20:09.811593874Z",
  "refresh_token": "v4IHKk7Ts67ONxgsBzVKDNT8fME_zfGtIxW6MEJGDEo",
  "refresh_expires_at": "2026-11-29T08:05:09.811122715Z",
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
  "phone": "+380696874640",
  "device_ref": "sandbox-12283"
}
```

```json
{
  "challenge_id": "da70fc14-4cc8-4ec4-a3f6-22eb1fb02329",
  "expires_at": "2026-10-30T08:10:10.268076725Z",
  "resend_available_at": "2026-10-30T08:05:11.268076725Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380696874640` → **200**

```json
{
  "phone": "+380696874640",
  "audience": "CLIENT",
  "code": "417551",
  "sent_at": "2026-10-30T08:05:10.270020249Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "da70fc14-4cc8-4ec4-a3f6-22eb1fb02329",
  "code": "417551",
  "device_ref": "sandbox-12283"
}
```

```json
{
  "session_id": "c8edaa0f-a3db-4f54-a6f4-e162f68b85b4",
  "subject": {
    "type": "CLIENT",
    "id": "58c6592a-844c-481a-8d9a-90f00b84e05c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OGM2NTkyYS04NDRjLTQ4MWEtOGQ5YS05MGYwMGI4NGUwNWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NDEwLCJpYXQiOjE3OTMzNDc1MTAsImp0aSI6IjliYzM3NmNmLWFjZWUtNDNjMS04ZGNlLTY1ODdmZTRmZTUxZCIsInNpZCI6ImM4ZWRhYTBmLWEzZGItNGY1NC1hNmY0LWUxNjJmNjhiODViNCJ9.sN1YD6obIt9O3OtNW_VdnhNw6q8umaWy64eEvK0PB64",
  "access_expires_at": "2026-10-30T08:20:10.522802775Z",
  "refresh_token": "1OYOmVSq0-IPb_CGeaZR6zts68Zwf-RgzQ6z-htAKaY",
  "refresh_expires_at": "2026-11-29T08:05:10.522328847Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "133b330d-3fde-4ffa-b835-372275956761",
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
  "id": "dbe9bc77-c43c-4d6d-bcca-f43e0c1b816a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:10:10.759152Z",
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
  "command_id": "b6167639-8523-458d-8040-dde39e2bd490",
  "quote_id": "dbe9bc77-c43c-4d6d-bcca-f43e0c1b816a",
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
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:05:11.003471Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:05:11.003471Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 12.205506934
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.154971417
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

`GET /api/rider/v1/orders/0eac447d-f0f7-463a-83ac-e0aec241d4f9` → **200**

```json
{
  "id": "0eac447d-f0f7-463a-83ac-e0aec241d4f9",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "58c6592a-844c-481a-8d9a-90f00b84e05c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:05:11.003471Z",
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
  "session_id": "e3d01a99-9f0d-4fd2-be56-ac45f16734cb",
  "subject": {
    "type": "STAFF",
    "id": "db8502d0-b190-4276-94c9-6cc44299e7b3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjg1MDJkMC1iMTkwLTQyNzYtOTRjOS02Y2M0NDI5OWU3YjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg1OTUsImlhdCI6MTc5MzM0NzY5NSwianRpIjoiZjM3MTJiNWYtZjMzMS00NzEyLTg4NTgtNGM4MmRhNDQ5ZGY0Iiwic2lkIjoiZTNkMDFhOTktOWYwZC00ZmQyLWJlNTYtYWM0NWYxNjczNGNiIn0.JIvgJGJJ5Oc2OQ_OlvPeIPo1LPj7iuPQb_9U7mlN4II",
  "access_expires_at": "2026-10-30T08:23:15.552893729Z",
  "refresh_token": "Gh7nlTk0mf3AaNHvInIzhygv63VpG_93jtcuuoNjzfA",
  "refresh_expires_at": "2026-10-30T20:08:15.552381003Z",
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
  "id": "a315b362-ccb0-45fb-87fd-0e95c7e88866",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:08:15.79206Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:08:15.792146Z",
  "updated_at": "2026-10-30T08:08:15.804681Z",
  "finished_at": "2026-10-30T08:08:15.804681Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/a315b362-ccb0-45fb-87fd-0e95c7e88866` → **200**

```json
{
  "run": {
    "id": "a315b362-ccb0-45fb-87fd-0e95c7e88866",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T08:08:15.79206Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T08:08:15.792146Z",
    "updated_at": "2026-10-30T08:08:15.804681Z",
    "finished_at": "2026-10-30T08:08:15.804681Z",
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
  "id": "a315b362-ccb0-45fb-87fd-0e95c7e88866",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:08:15.79206Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:08:15.792146Z",
  "updated_at": "2026-10-30T08:08:15.804681Z",
  "finished_at": "2026-10-30T08:08:15.804681Z",
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
  "id": "a315b362-ccb0-45fb-87fd-0e95c7e88866",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:08:15.79206Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:08:15.792146Z",
  "updated_at": "2026-10-30T08:08:15.804681Z",
  "finished_at": "2026-10-30T08:08:15.804681Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/a75d5b48-df5d-44dd-9c41-ae4b232ee35a` → **204**

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
  "id": "4eb036ad-be67-4d4c-b061-e1f79e8088cc",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:08:16.158048Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:08:16.158131Z",
  "updated_at": "2026-10-30T08:08:16.165298Z",
  "finished_at": "2026-10-30T08:08:16.165298Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/4eb036ad-be67-4d4c-b061-e1f79e8088cc` → **200**

```json
{
  "run": {
    "id": "4eb036ad-be67-4d4c-b061-e1f79e8088cc",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T08:08:16.158048Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T08:08:16.158131Z",
    "updated_at": "2026-10-30T08:08:16.165298Z",
    "finished_at": "2026-10-30T08:08:16.165298Z",
    "version": 1
  },
  "items": [
    {
      "id": "78109cd1-6d0c-4026-8c31-afa4450972f9",
      "run_id": "4eb036ad-be67-4d4c-b061-e1f79e8088cc",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "59c49175a9c15c34a41225691659e24b020c7d7955dee3364dc90a89df470c84",
      "reference_display": "sandbox-reconciliation-a75d5b48-df5d-44dd-9c41-ae4b232ee35a",
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
      "provider_at": "2026-10-30T08:08:16Z",
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
  "id": "4eb036ad-be67-4d4c-b061-e1f79e8088cc",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:08:16.158048Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:08:16.158131Z",
  "updated_at": "2026-10-30T08:08:16.165298Z",
  "finished_at": "2026-10-30T08:08:16.165298Z",
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
  "id": "4eb036ad-be67-4d4c-b061-e1f79e8088cc",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:08:16.158048Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:08:16.158131Z",
  "updated_at": "2026-10-30T08:08:16.165298Z",
  "finished_at": "2026-10-30T08:08:16.165298Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/78109cd1-6d0c-4026-8c31-afa4450972f9/resolve` → **200**

```json
{
  "command_id": "f35069b3-eb60-45c8-8442-28c2da6cb38b",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "78109cd1-6d0c-4026-8c31-afa4450972f9",
  "run_id": "4eb036ad-be67-4d4c-b061-e1f79e8088cc",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "59c49175a9c15c34a41225691659e24b020c7d7955dee3364dc90a89df470c84",
  "reference_display": "sandbox-reconciliation-a75d5b48-df5d-44dd-9c41-ae4b232ee35a",
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
  "provider_at": "2026-10-30T08:08:16Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "resolved_at": "2026-10-30T08:08:16.512401Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/78109cd1-6d0c-4026-8c31-afa4450972f9/resolve` → **200**

```json
{
  "command_id": "f35069b3-eb60-45c8-8442-28c2da6cb38b",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "78109cd1-6d0c-4026-8c31-afa4450972f9",
  "run_id": "4eb036ad-be67-4d4c-b061-e1f79e8088cc",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "59c49175a9c15c34a41225691659e24b020c7d7955dee3364dc90a89df470c84",
  "reference_display": "sandbox-reconciliation-a75d5b48-df5d-44dd-9c41-ae4b232ee35a",
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
  "provider_at": "2026-10-30T08:08:16Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
  "resolved_at": "2026-10-30T08:08:16.512401Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/78109cd1-6d0c-4026-8c31-afa4450972f9/resolve` → **409**

```json
{
  "command_id": "0b7e884a-7a7e-41ca-a59c-d37a8d3ddc0c",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/78109cd1-6d0c-4026-8c31-afa4450972f9/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "573770c8-55d0-4eaf-aa2a-dc4f80ebd53d"
}
```

`GET /api/admin/v1/payment-reconciliations/4eb036ad-be67-4d4c-b061-e1f79e8088cc` → **200**

```json
{
  "run": {
    "id": "4eb036ad-be67-4d4c-b061-e1f79e8088cc",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T08:08:16.158048Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T08:08:16.158131Z",
    "updated_at": "2026-10-30T08:08:16.512401Z",
    "finished_at": "2026-10-30T08:08:16.165298Z",
    "version": 2
  },
  "items": [
    {
      "id": "78109cd1-6d0c-4026-8c31-afa4450972f9",
      "run_id": "4eb036ad-be67-4d4c-b061-e1f79e8088cc",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "59c49175a9c15c34a41225691659e24b020c7d7955dee3364dc90a89df470c84",
      "reference_display": "sandbox-reconciliation-a75d5b48-df5d-44dd-9c41-ae4b232ee35a",
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
      "provider_at": "2026-10-30T08:08:16Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "db8502d0-b190-4276-94c9-6cc44299e7b3",
      "resolved_at": "2026-10-30T08:08:16.512401Z",
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
      "id": "4eb036ad-be67-4d4c-b061-e1f79e8088cc",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T08:08:16.158048Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T08:08:16.158131Z",
      "updated_at": "2026-10-30T08:08:16.512401Z",
      "finished_at": "2026-10-30T08:08:16.165298Z",
      "version": 2
    },
    {
      "id": "22818b77-a302-404d-b88b-63695941cb16",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T08:01:09.038799Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T08:01:09.038892Z",
      "updated_at": "2026-10-30T08:01:09.043743Z",
      "finished_at": "2026-10-30T08:01:09.043743Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/a75d5b48-df5d-44dd-9c41-ae4b232ee35a` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "4eb036ad-be67-4d4c-b061-e1f79e8088cc",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:08:16.158048Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:08:16.158131Z",
  "updated_at": "2026-10-30T08:08:16.512401Z",
  "finished_at": "2026-10-30T08:08:16.165298Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793347824181E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.79334781937E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793347819371E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793347824204E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793347819371E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
