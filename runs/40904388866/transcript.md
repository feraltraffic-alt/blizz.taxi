# Sandbox transcript (2026-10-29T15:44:08Z, aeb7a39)

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
  "correlation_id": "f1266b2c-8901-482e-b384-68c7b9e77fe2"
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
  "session_id": "5203f0fb-5ca2-44d0-99b5-124704d00870",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk1NTgsImlhdCI6MTc5MzI4ODY1OCwianRpIjoiMGFkOTExMTMtOWUyNy00OTJiLThkZTQtM2FjYzlhMmJkNDQzIiwic2lkIjoiNTIwM2YwZmItNWNhMi00NGQwLTk5YjUtMTI0NzA0ZDAwODcwIn0.c5INU6YYsuEXY7GYDc7sujEsbisrJRU0PJ9Dma5wOIM",
  "access_expires_at": "2026-10-29T15:59:18.958312794Z",
  "refresh_token": "_KJ_JhfQ0zofj3i6xbt3HzzB9G5u5cEj_0feDk_xj_Y",
  "refresh_expires_at": "2026-10-30T03:44:18.955874175Z",
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
  "session_id": "937d7ab8-d95c-422e-97a1-ac6ef9e4d611",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk1NjAsImlhdCI6MTc5MzI4ODY2MCwianRpIjoiNGI0OGM4YWEtMTQ5YS00ZmEyLWI3ZmYtY2I3Mzg5NzBhN2M1Iiwic2lkIjoiOTM3ZDdhYjgtZDk1Yy00MjJlLTk3YTEtYWM2ZWY5ZTRkNjExIn0.-sRjbaIXgN6Qkt3iblS2Er8OmovK2cEqlA7yFXekTFY",
  "access_expires_at": "2026-10-29T15:59:20.82581089Z",
  "refresh_token": "Z68cU9O3yJXne9iWX_bdztZ4VCVgDYrApYkVva7meTs",
  "refresh_expires_at": "2026-10-30T03:44:20.824667705Z",
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
  "device_ref": "sandbox-24391"
}
```

```json
{
  "challenge_id": "6316619d-e86f-47e7-b792-f7ec456cc79f",
  "expires_at": "2026-10-29T15:49:21.415659155Z",
  "resend_available_at": "2026-10-29T15:44:22.415659155Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "629812",
  "sent_at": "2026-10-29T15:44:21.4291462Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6316619d-e86f-47e7-b792-f7ec456cc79f",
  "code": "629812",
  "device_ref": "sandbox-24391"
}
```

```json
{
  "session_id": "cca9251c-649c-43e2-be1f-b93f3dbac4b3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTU2MSwiaWF0IjoxNzkzMjg4NjYxLCJqdGkiOiI2YjBlNWRmMi1jNDE2LTRjY2UtOWNjYS1mODE1ZTFkYzkxNWEiLCJzaWQiOiJjY2E5MjUxYy02NDljLTQzZTItYmUxZi1iOTNmM2RiYWM0YjMifQ.QwqrKvzLzegPDuzbPGvsEL7EYaZrlAV-6iCq3U2wkfw",
  "access_expires_at": "2026-10-29T15:59:21.770372225Z",
  "refresh_token": "kF59pxkn5MVuLI-_GP9c6Y6IFQBvr2pOgzyT8uGym9s",
  "refresh_expires_at": "2026-11-28T15:44:21.769056343Z",
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
  "command_id": "e6adf4be-0e67-42c8-93c8-f980c9670da8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:44:22Z",
    "sequence": 1793288662366
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4a6eed34-9d83-4016-9818-541da7e78619",
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
  "last_heartbeat_at": "2026-10-29T15:44:22.466395Z",
  "last_location_at": "2026-10-29T15:44:22.466395Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639548952",
  "device_ref": "sandbox-27098"
}
```

```json
{
  "challenge_id": "116b51d1-a8c4-46ac-88a5-e8adff725fb2",
  "expires_at": "2026-10-29T15:49:22.814659646Z",
  "resend_available_at": "2026-10-29T15:44:23.814659646Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639548952` → **200**

```json
{
  "phone": "+380639548952",
  "audience": "CLIENT",
  "code": "720341",
  "sent_at": "2026-10-29T15:44:22.821157097Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "116b51d1-a8c4-46ac-88a5-e8adff725fb2",
  "code": "720341",
  "device_ref": "sandbox-27098"
}
```

```json
{
  "session_id": "53fea341-c2e1-42da-b150-b037c9327942",
  "subject": {
    "type": "CLIENT",
    "id": "610aafb5-cd0b-45f0-8a90-35071303bdf5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTBhYWZiNS1jZDBiLTQ1ZjAtOGE5MC0zNTA3MTMwM2JkZjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NTYzLCJpYXQiOjE3OTMyODg2NjMsImp0aSI6IjQwYTM1YTI1LTQ3ZWItNGJmZS04ZjdhLTQ2MmVhYWRmNzlkMCIsInNpZCI6IjUzZmVhMzQxLWMyZTEtNDJkYS1iMTUwLWIwMzdjOTMyNzk0MiJ9.EWnRaXPwwMUNbET8yJviRoVozyd3X-VYmo67_dzxspA",
  "access_expires_at": "2026-10-29T15:59:23.133623618Z",
  "refresh_token": "M__PRoo8XpQr-oBlUCXKGFR2sayTatmpxogrNFMhfQQ",
  "refresh_expires_at": "2026-11-28T15:44:23.132759776Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1f3e4437-9acf-47f8-9a50-e8374e171503",
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
  "id": "9ac8cc01-86ce-4df8-90e1-27a61d449e53",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:49:23.445028Z",
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
  "command_id": "eea77c46-ebd2-4f41-b249-e37c71ca9c4b",
  "quote_id": "9ac8cc01-86ce-4df8-90e1-27a61d449e53",
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
  "id": "f1c234ec-2212-4df0-a4be-9ae2bf57cd64",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "610aafb5-cd0b-45f0-8a90-35071303bdf5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:44:23.832569Z",
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
    "id": "b5efe679-3046-4394-a74f-715fb7d1e154",
    "order_id": "f1c234ec-2212-4df0-a4be-9ae2bf57cd64",
    "expires_at": "2026-10-29T15:44:38.846523Z",
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

`POST /api/driver/v1/offers/b5efe679-3046-4394-a74f-715fb7d1e154/accept` → **200**

```json
{
  "command_id": "9bab567f-dc97-4239-bf6b-8a424979c0c4"
}
```

```json
{
  "id": "dbf3fbc0-40f4-4ec6-9351-df429a1abbad",
  "order_id": "f1c234ec-2212-4df0-a4be-9ae2bf57cd64",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "425f5fbc-ecb9-4c81-a51d-e73660e7d973",
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
  "command_id": "2975fc30-cbf8-49eb-8b5a-8fe5e32e1d88",
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
  "changed_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T15:44:25.185398902Z"
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
  "id": "425f5fbc-ecb9-4c81-a51d-e73660e7d973",
  "order_id": "f1c234ec-2212-4df0-a4be-9ae2bf57cd64",
  "assignment_id": "dbf3fbc0-40f4-4ec6-9351-df429a1abbad",
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

`POST /api/driver/v1/work-sessions/4a6eed34-9d83-4016-9818-541da7e78619/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:44:26Z",
    "sequence": 1793288666764
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4a6eed34-9d83-4016-9818-541da7e78619",
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
  "last_heartbeat_at": "2026-10-29T15:44:26.103371Z",
  "last_location_at": "2026-10-29T15:44:26.103371Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/425f5fbc-ecb9-4c81-a51d-e73660e7d973/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "07ce5b24-7a6f-4024-b858-b05804d990b4",
  "expected_version": 0
}
```

```json
{
  "id": "425f5fbc-ecb9-4c81-a51d-e73660e7d973",
  "order_id": "f1c234ec-2212-4df0-a4be-9ae2bf57cd64",
  "assignment_id": "dbf3fbc0-40f4-4ec6-9351-df429a1abbad",
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
  "arrived_at": "2026-10-29T15:44:26.422842Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/425f5fbc-ecb9-4c81-a51d-e73660e7d973/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "9f8dbdc4-6aa8-4d76-a130-4a2b2ec8e8ed",
  "expected_version": 1
}
```

```json
{
  "id": "425f5fbc-ecb9-4c81-a51d-e73660e7d973",
  "order_id": "f1c234ec-2212-4df0-a4be-9ae2bf57cd64",
  "assignment_id": "dbf3fbc0-40f4-4ec6-9351-df429a1abbad",
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
  "arrived_at": "2026-10-29T15:44:26.422842Z",
  "started_at": "2026-10-29T15:44:26.72008Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/425f5fbc-ecb9-4c81-a51d-e73660e7d973/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "4d7b733c-63a6-478f-abb5-84da914aa165",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:44:27Z",
  "cash_received": true
}
```

```json
{
  "id": "425f5fbc-ecb9-4c81-a51d-e73660e7d973",
  "order_id": "f1c234ec-2212-4df0-a4be-9ae2bf57cd64",
  "assignment_id": "dbf3fbc0-40f4-4ec6-9351-df429a1abbad",
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
  "arrived_at": "2026-10-29T15:44:26.422842Z",
  "started_at": "2026-10-29T15:44:26.72008Z",
  "completed_at": "2026-10-29T15:44:27.056076Z",
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
  "session_id": "4a6eed34-9d83-4016-9818-541da7e78619",
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
  "last_heartbeat_at": "2026-10-29T15:44:26.103371Z",
  "last_location_at": "2026-10-29T15:44:26.103371Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4a6eed34-9d83-4016-9818-541da7e78619/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "ab028499-59c0-4982-a13c-9856327acb8d",
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
  "command_id": "3fd1185d-32ac-42ee-8650-5e4cdbcfa08a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:44:27Z",
    "sequence": 1793288667949
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
  "correlation_id": "612485b6-f4d8-40b9-883b-88441600e7ed",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "c5b37e5f-45cd-4dd0-8ef3-ec299cd2c6c6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:44:28Z",
    "sequence": 1793288668251
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "729af891-d159-4b6f-99be-ef12532eae2f",
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
  "last_heartbeat_at": "2026-10-29T15:44:28.273345Z",
  "last_location_at": "2026-10-29T15:44:28.273345Z",
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
  "changed_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T15:44:25.185399Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "ed556771-aa17-4cd1-add0-7d383d50ff57",
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
  "changed_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T15:44:28.845178063Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "729af891-d159-4b6f-99be-ef12532eae2f",
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
  "last_heartbeat_at": "2026-10-29T15:44:28.273345Z",
  "last_location_at": "2026-10-29T15:44:28.273345Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/729af891-d159-4b6f-99be-ef12532eae2f/close` → **200**

```json
{
  "command_id": "e1aa61c5-5b59-4f0b-a598-3190196e74d8",
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
  "session_id": "f9585f4e-e7f2-48dd-a863-063fe04badf6",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk1NzAsImlhdCI6MTc5MzI4ODY3MCwianRpIjoiMzI0ZGQ1ZmYtZGM1NS00NGVjLWI3ZmMtYzFkMGE1OWNmNDIwIiwic2lkIjoiZjk1ODVmNGUtZTdmMi00OGRkLWE4NjMtMDYzZmUwNGJhZGY2In0.gTIRZPSI1tlizn115IJBzJAzU-ysPGf7ImgkRxRMhLg",
  "access_expires_at": "2026-10-29T15:59:30.033169985Z",
  "refresh_token": "4ona_9quHS58T06Of0GCCHZ9Ejzcknnumushzrf5Jjk",
  "refresh_expires_at": "2026-10-30T03:44:30.032296276Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "0467c820-9adf-4695-8991-c5fbd6761833",
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
  "id": "6e0052a3-3c8c-4439-ba32-7bbc4529bed4",
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
  "created_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
  "created_at": "2026-10-29T15:44:30.325831Z",
  "updated_at": "2026-10-29T15:44:30.325831Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637376197",
  "device_ref": "sandbox-21001"
}
```

```json
{
  "challenge_id": "32a115f7-e86c-4667-b8f6-4eca185e744f",
  "expires_at": "2026-10-29T15:49:30.618462551Z",
  "resend_available_at": "2026-10-29T15:44:31.618462551Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637376197` → **200**

```json
{
  "phone": "+380637376197",
  "audience": "CLIENT",
  "code": "442535",
  "sent_at": "2026-10-29T15:44:30.62258052Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "32a115f7-e86c-4667-b8f6-4eca185e744f",
  "code": "442535",
  "device_ref": "sandbox-21001"
}
```

```json
{
  "session_id": "0be51f92-3b99-48d0-97d6-0c9ee8805e9c",
  "subject": {
    "type": "CLIENT",
    "id": "d10a8a77-cb8f-432b-b26e-a6b4a5c59b8e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTBhOGE3Ny1jYjhmLTQzMmItYjI2ZS1hNmI0YTVjNTliOGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NTcwLCJpYXQiOjE3OTMyODg2NzAsImp0aSI6Ijk3MzY0ZDFmLTk2ZmEtNDQ4Mi1hYzVjLWE4M2RhZTc0NzA2MCIsInNpZCI6IjBiZTUxZjkyLTNiOTktNDhkMC05N2Q2LTBjOWVlODgwNWU5YyJ9.FLZMiSYdRSbzu6ouS5ZlWi-GL6NTeC-YFqyLK85N6qg",
  "access_expires_at": "2026-10-29T15:59:30.931309853Z",
  "refresh_token": "923rKJKwzZKVWAT9zWIRD_htcfnANc-bZvPBcN4NgX8",
  "refresh_expires_at": "2026-11-28T15:44:30.930351025Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380637376197` → **200**

```json
{
  "client_id": "d10a8a77-cb8f-432b-b26e-a6b4a5c59b8e"
}
```

`POST /api/admin/v1/rider-wallets/d10a8a77-cb8f-432b-b26e-a6b4a5c59b8e/top-ups` → **201**

```json
{
  "command_id": "1118c0cc-b7a4-427e-a200-70dcaaa5741a",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "d10a8a77-cb8f-432b-b26e-a6b4a5c59b8e",
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
      "id": "a1b8225d-24c2-4025-9b0b-f0c9f2f73969",
      "at": "2026-10-29T15:44:31.486675Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ee49e082-7e54-4e0e-a0ef-e56dc938be7f",
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
  "id": "cf2a4153-7989-4afa-8595-849fc401e02e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:49:31.788217Z",
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
      "id": "6e0052a3-3c8c-4439-ba32-7bbc4529bed4",
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
  "device_ref": "sandbox-8797"
}
```

```json
{
  "challenge_id": "25561f96-ddf1-415b-8f28-078b0cb20b0c",
  "expires_at": "2026-10-29T15:49:32.079217627Z",
  "resend_available_at": "2026-10-29T15:44:33.079217627Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "055484",
  "sent_at": "2026-10-29T15:44:32.083114175Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "25561f96-ddf1-415b-8f28-078b0cb20b0c",
  "code": "055484",
  "device_ref": "sandbox-8797"
}
```

```json
{
  "session_id": "4ac8a001-214a-434a-b65f-8fdede42b150",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTU3MiwiaWF0IjoxNzkzMjg4NjcyLCJqdGkiOiIxYzFmODI5ZC1mNTlmLTRkMTQtODJiZi1jNGU5NGQ0ZGMzNjgiLCJzaWQiOiI0YWM4YTAwMS0yMTRhLTQzNGEtYjY1Zi04ZmRlZGU0MmIxNTAifQ.z5XcNVOltLm_pIeld4J_bIU56cofgWgcyJsjqi9cfIM",
  "access_expires_at": "2026-10-29T15:59:32.380196177Z",
  "refresh_token": "14AVAPj9ApGudoWCJn29oWOlkrUPqzForqMXkCwBeBk",
  "refresh_expires_at": "2026-11-28T15:44:32.379529834Z",
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
  "command_id": "8fbe2c65-5468-4bcf-860c-18ed9a25b6e8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:44:32Z",
    "sequence": 1793288672938
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "654680e4-4a17-491f-8bdb-65084b44b053",
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
  "last_heartbeat_at": "2026-10-29T15:44:32.959776Z",
  "last_location_at": "2026-10-29T15:44:32.959776Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "37f7daa7-0dd8-438e-97ae-429b626edc71",
  "quote_id": "cf2a4153-7989-4afa-8595-849fc401e02e",
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
  "id": "eaebb15b-63b6-42c2-84a9-bd35c7463b37",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d10a8a77-cb8f-432b-b26e-a6b4a5c59b8e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:44:33.25792Z",
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
  "client_id": "d10a8a77-cb8f-432b-b26e-a6b4a5c59b8e",
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
      "id": "a1b8225d-24c2-4025-9b0b-f0c9f2f73969",
      "at": "2026-10-29T15:44:31.486675Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
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
    "id": "f291346b-60fb-41e5-8e6e-8bd3064facd9",
    "order_id": "eaebb15b-63b6-42c2-84a9-bd35c7463b37",
    "expires_at": "2026-10-29T15:44:48.266166Z",
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

`POST /api/driver/v1/offers/f291346b-60fb-41e5-8e6e-8bd3064facd9/accept` → **200**

```json
{
  "command_id": "fbb4f2a2-37d4-4459-853e-ec5d42df44ae"
}
```

```json
{
  "id": "9d96bd31-b3ba-4ec3-ab93-ac3e5c467ff2",
  "order_id": "eaebb15b-63b6-42c2-84a9-bd35c7463b37",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "45651710-4783-43bb-bb6a-81a5e92ca12b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "45651710-4783-43bb-bb6a-81a5e92ca12b",
  "order_id": "eaebb15b-63b6-42c2-84a9-bd35c7463b37",
  "assignment_id": "9d96bd31-b3ba-4ec3-ab93-ac3e5c467ff2",
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

`POST /api/driver/v1/work-sessions/654680e4-4a17-491f-8bdb-65084b44b053/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:44:34Z",
    "sequence": 1793288674695
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "654680e4-4a17-491f-8bdb-65084b44b053",
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
  "last_heartbeat_at": "2026-10-29T15:44:34.71484Z",
  "last_location_at": "2026-10-29T15:44:34.71484Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/45651710-4783-43bb-bb6a-81a5e92ca12b/arrive` → **200**

```json
{
  "command_id": "e703868b-227d-4f55-9a21-9e0fae66c652",
  "expected_version": 0
}
```

```json
{
  "id": "45651710-4783-43bb-bb6a-81a5e92ca12b",
  "order_id": "eaebb15b-63b6-42c2-84a9-bd35c7463b37",
  "assignment_id": "9d96bd31-b3ba-4ec3-ab93-ac3e5c467ff2",
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
  "arrived_at": "2026-10-29T15:44:35.00943Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/45651710-4783-43bb-bb6a-81a5e92ca12b/start` → **200**

```json
{
  "command_id": "b563b6e8-2c8b-4d4d-825b-d0acb99dcab6",
  "expected_version": 1
}
```

```json
{
  "id": "45651710-4783-43bb-bb6a-81a5e92ca12b",
  "order_id": "eaebb15b-63b6-42c2-84a9-bd35c7463b37",
  "assignment_id": "9d96bd31-b3ba-4ec3-ab93-ac3e5c467ff2",
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
  "arrived_at": "2026-10-29T15:44:35.00943Z",
  "started_at": "2026-10-29T15:44:35.310425Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/45651710-4783-43bb-bb6a-81a5e92ca12b/complete` → **200**

```json
{
  "command_id": "501cab55-3b62-4797-af82-65279ec5e7d7",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:44:35Z",
  "cash_received": true
}
```

```json
{
  "id": "45651710-4783-43bb-bb6a-81a5e92ca12b",
  "order_id": "eaebb15b-63b6-42c2-84a9-bd35c7463b37",
  "assignment_id": "9d96bd31-b3ba-4ec3-ab93-ac3e5c467ff2",
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
  "arrived_at": "2026-10-29T15:44:35.00943Z",
  "started_at": "2026-10-29T15:44:35.310425Z",
  "completed_at": "2026-10-29T15:44:35.611532Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "d10a8a77-cb8f-432b-b26e-a6b4a5c59b8e",
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
      "id": "d9e955e2-2f19-4482-994f-1947a235a372",
      "at": "2026-10-29T15:44:36.050819Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "eaebb15b-63b6-42c2-84a9-bd35c7463b37"
    },
    {
      "id": "a1b8225d-24c2-4025-9b0b-f0c9f2f73969",
      "at": "2026-10-29T15:44:31.486675Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/6e0052a3-3c8c-4439-ba32-7bbc4529bed4/archive` → **200**

```json
{
  "command_id": "eba6f575-8246-4f71-99d2-620b54f1acab",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "6e0052a3-3c8c-4439-ba32-7bbc4529bed4",
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
  "created_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
  "created_at": "2026-10-29T15:44:30.325831Z",
  "updated_at": "2026-10-29T15:44:39.202563Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "654680e4-4a17-491f-8bdb-65084b44b053",
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
  "last_heartbeat_at": "2026-10-29T15:44:34.71484Z",
  "last_location_at": "2026-10-29T15:44:34.71484Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/654680e4-4a17-491f-8bdb-65084b44b053/close` → **200**

```json
{
  "command_id": "3919a247-5b49-45eb-840a-cb39fb9ef736",
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

Done: order eaebb15b-63b6-42c2-84a9-bd35c7463b37.

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
  "session_id": "6db56db6-c62f-4587-b0e9-b49a2bec546a",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk1ODAsImlhdCI6MTc5MzI4ODY4MCwianRpIjoiYTVjOWNiZWMtMjU1Zi00YmQ4LTlkOWItODM2MzQ3MDNiMjI2Iiwic2lkIjoiNmRiNTZkYjYtYzYyZi00NTg3LWIwZTktYjQ5YTJiZWM1NDZhIn0.UX9-zT_HyFIXyJfi8PzU0_6FZFtHURqIm9WyyYPZvY0",
  "access_expires_at": "2026-10-29T15:59:40.375007001Z",
  "refresh_token": "x6Uof7G6rOwKQ8cMq4ijmvv01woeuZy1ZgzDHnHfa2Y",
  "refresh_expires_at": "2026-10-30T03:44:40.3743187Z",
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
  "command_id": "b87850fd-1f30-4b5e-b2e1-444c8dedcd13",
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
  "session_id": "1be4fa0d-2e59-4dcf-919c-5004833ec801",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk1ODEsImlhdCI6MTc5MzI4ODY4MSwianRpIjoiNDg1ZGEwZTQtYTI0ZS00OTNjLWI5MmQtMWYxNDEwYTc5MGIwIiwic2lkIjoiMWJlNGZhMGQtMmU1OS00ZGNmLTkxOWMtNTAwNDgzM2VjODAxIn0.AoBnR28HlJ5ygw4ghmutmavRMjWJKhBUlMUD9NtiTaA",
  "access_expires_at": "2026-10-29T15:59:41.518784656Z",
  "refresh_token": "FYAqKswL64V3nGQ6SQbwhmPrIYGfRLb3JA1YhvL2HxQ",
  "refresh_expires_at": "2026-10-30T03:44:41.517908137Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.340424663",
    "linkedid": "1730052700.340424663",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677273748"
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
    "id": "1730052700.340424663",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "f2372dc9-1364-49c1-affe-96b5a9370366",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380677273748",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T15:44:41.793065Z",
      "answered_at": null,
      "ended_at": "2026-10-29T15:44:41.81805Z",
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
    "id": "1730052600.1564124534",
    "linkedid": "1730052600.1564124534",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677273748"
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
      "id": "f561ba10-a17f-486e-8a12-de271577b188",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677273748",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T15:44:42.133359Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/f561ba10-a17f-486e-8a12-de271577b188/answer` → **200**

```json
{
  "command_id": "f4b93d53-aee2-47f9-a2db-d84977f1ceab"
}
```

```json
{
  "id": "f561ba10-a17f-486e-8a12-de271577b188",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677273748",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
  "order_ids": [],
  "started_at": "2026-10-29T15:44:42.133359Z",
  "answered_at": "2026-10-29T15:44:42.455894Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1564124534",
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
    "id": "1730052600.1564124534",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "f561ba10-a17f-486e-8a12-de271577b188",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677273748",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
      "order_ids": [],
      "started_at": "2026-10-29T15:44:42.133359Z",
      "answered_at": "2026-10-29T15:44:42.455894Z",
      "ended_at": "2026-10-29T15:44:42.761581Z",
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
      "id": "f561ba10-a17f-486e-8a12-de271577b188",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677273748",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
      "order_ids": [],
      "started_at": "2026-10-29T15:44:42.133359Z",
      "answered_at": "2026-10-29T15:44:42.455894Z",
      "ended_at": "2026-10-29T15:44:42.761581Z",
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
      "id": "f561ba10-a17f-486e-8a12-de271577b188",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677273748",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
      "order_ids": [],
      "started_at": "2026-10-29T15:44:42.133359Z",
      "answered_at": "2026-10-29T15:44:42.455894Z",
      "ended_at": "2026-10-29T15:44:42.761581Z",
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
      "id": "f561ba10-a17f-486e-8a12-de271577b188",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677273748",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
      "order_ids": [],
      "started_at": "2026-10-29T15:44:42.133359Z",
      "answered_at": "2026-10-29T15:44:42.455894Z",
      "ended_at": "2026-10-29T15:44:42.761581Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T15:44:47.735594Z"
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
      "id": "f561ba10-a17f-486e-8a12-de271577b188",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677273748",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
      "order_ids": [],
      "started_at": "2026-10-29T15:44:42.133359Z",
      "answered_at": "2026-10-29T15:44:42.455894Z",
      "ended_at": "2026-10-29T15:44:42.761581Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T15:44:47.735594Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/f561ba10-a17f-486e-8a12-de271577b188/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/f561ba10-a17f-486e-8a12-de271577b188/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=f561ba10-a17f-486e-8a12-de271577b188` → **200**

```json
{
  "changes": [
    {
      "id": "49591dcc-1b17-4ad0-905b-bf1bffb903a0",
      "occurred_at": "2026-10-29T15:44:50.257612Z",
      "actor_type": "STAFF",
      "actor_id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "f561ba10-a17f-486e-8a12-de271577b188",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"346f58ba-f62c-4683-ad30-51678156fa21\", \"order_ids\": []}",
      "correlation_id": "193e8b87-ff3d-4cce-a8ad-4411a26a4ecf"
    },
    {
      "id": "773f881a-ec84-42c8-b455-43ca5a4985f6",
      "occurred_at": "2026-10-29T15:44:50.213678Z",
      "actor_type": "STAFF",
      "actor_id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "f561ba10-a17f-486e-8a12-de271577b188",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"346f58ba-f62c-4683-ad30-51678156fa21\", \"order_ids\": []}",
      "correlation_id": "3d92dc9d-18ac-475a-82b2-934cbdec4cbc"
    }
  ]
}
```

Done: call f561ba10-a17f-486e-8a12-de271577b188 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12045"
}
```

```json
{
  "challenge_id": "32caa83e-a1c3-4aaf-940e-731fd468cb0a",
  "expires_at": "2026-10-29T15:49:50.599591251Z",
  "resend_available_at": "2026-10-29T15:44:51.599591251Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "717929",
  "sent_at": "2026-10-29T15:44:50.604380742Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "32caa83e-a1c3-4aaf-940e-731fd468cb0a",
  "code": "717929",
  "device_ref": "sandbox-12045"
}
```

```json
{
  "session_id": "e87d6712-d929-47db-801c-c8cd736283c7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTU5MCwiaWF0IjoxNzkzMjg4NjkwLCJqdGkiOiIwOTZlN2NiZS04Njc3LTQxOGYtODc0MS1jNjgxMTYxMzU2NGEiLCJzaWQiOiJlODdkNjcxMi1kOTI5LTQ3ZGItODAxYy1jOGNkNzM2MjgzYzcifQ.Rsh0BEgGyXoAVLSJgmffFw4CkHdxTbw6Yl0e3tUGLjE",
  "access_expires_at": "2026-10-29T15:59:50.90209981Z",
  "refresh_token": "k4GH6PWhwHCeXXATJt9WQnnPjtRspMvSR1VEbIxCNIw",
  "refresh_expires_at": "2026-11-28T15:44:50.901412982Z",
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
  "command_id": "568ebd48-9dcb-46b2-aa3b-1c3f0810e84e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:44:51Z",
    "sequence": 1793288691448
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ef62a984-8e44-4f9a-8e3f-79bfd3af480e",
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
  "last_heartbeat_at": "2026-10-29T15:44:51.469727Z",
  "last_location_at": "2026-10-29T15:44:51.469727Z",
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
  "session_id": "0b9ee394-e0a2-4d4c-81d5-0cbb4647a87c",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk1OTIsImlhdCI6MTc5MzI4ODY5MiwianRpIjoiMDIyYjM3ZmEtMjM0MS00NTU0LThiMjctYTMwNGZmZGU3NWVmIiwic2lkIjoiMGI5ZWUzOTQtZTBhMi00ZDRjLTgxZDUtMGNiYjQ2NDdhODdjIn0.1XoURY9dStLMQR2a48U_ga4Bx5_WWX-Qt2qJEmKYkFo",
  "access_expires_at": "2026-10-29T15:59:52.050544358Z",
  "refresh_token": "s2eSI24OC5ieq0kKzyjqGQ1eDJCAj0HURsIQwz1xves",
  "refresh_expires_at": "2026-10-30T03:44:52.049855123Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "41c3ff23-b4f6-4c93-a2af-3373d83d48c7",
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
  "id": "e6401435-59b7-4e05-9971-7f9f8795bcd9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:49:52.340975Z",
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
  "command_id": "4316ffb4-ef5e-42c5-b18c-ce41655b3f7f",
  "quote_id": "e6401435-59b7-4e05-9971-7f9f8795bcd9",
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
    "phone": "+380675175759"
  }
}
```

```json
{
  "id": "5ba2eae1-51f5-47f4-a055-37b6c0729c03",
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
  "created_at": "2026-10-29T15:44:52.648678Z",
  "caller": {
    "name": "Олена",
    "phone": "+380675175759"
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
    "id": "ad1c4cd9-3e91-45da-89f9-66b921220191",
    "order_id": "5ba2eae1-51f5-47f4-a055-37b6c0729c03",
    "expires_at": "2026-10-29T15:45:07.654047Z",
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

`POST /api/driver/v1/offers/ad1c4cd9-3e91-45da-89f9-66b921220191/accept` → **200**

```json
{
  "command_id": "daa423a6-5550-450c-8993-327689c07148"
}
```

```json
{
  "id": "db29a122-eae6-4bb0-b81b-d28a74a0cdfa",
  "order_id": "5ba2eae1-51f5-47f4-a055-37b6c0729c03",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8855fcf7-264e-41b5-8e8d-4c701a134515",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380675175759` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380675175759` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380675175759` → **200**

```json
[
  {
    "phone": "+380675175759",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:44:54.984027732Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675175759` → **200**

```json
[
  {
    "phone": "+380675175759",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:44:54.984027732Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675175759` → **200**

```json
[
  {
    "phone": "+380675175759",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:44:54.984027732Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8855fcf7-264e-41b5-8e8d-4c701a134515",
  "order_id": "5ba2eae1-51f5-47f4-a055-37b6c0729c03",
  "assignment_id": "db29a122-eae6-4bb0-b81b-d28a74a0cdfa",
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
    "phone": "+380675175759"
  }
}
```

`POST /api/driver/v1/work-sessions/ef62a984-8e44-4f9a-8e3f-79bfd3af480e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:44:55Z",
    "sequence": 1793288695938
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ef62a984-8e44-4f9a-8e3f-79bfd3af480e",
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
  "last_heartbeat_at": "2026-10-29T15:44:55.958188Z",
  "last_location_at": "2026-10-29T15:44:55.958188Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8855fcf7-264e-41b5-8e8d-4c701a134515/arrive` → **200**

```json
{
  "command_id": "64ccf194-271a-481e-a1a7-33e734b27aff",
  "expected_version": 0
}
```

```json
{
  "id": "8855fcf7-264e-41b5-8e8d-4c701a134515",
  "order_id": "5ba2eae1-51f5-47f4-a055-37b6c0729c03",
  "assignment_id": "db29a122-eae6-4bb0-b81b-d28a74a0cdfa",
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
  "arrived_at": "2026-10-29T15:44:56.249274Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675175759"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380675175759` → **200**

```json
[
  {
    "phone": "+380675175759",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:44:54.984027732Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675175759` → **200**

```json
[
  {
    "phone": "+380675175759",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:44:54.984027732Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675175759` → **200**

```json
[
  {
    "phone": "+380675175759",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:44:54.984027732Z"
  },
  {
    "phone": "+380675175759",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T15:44:57.994256067Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675175759` → **200**

```json
[
  {
    "phone": "+380675175759",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:44:54.984027732Z"
  },
  {
    "phone": "+380675175759",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T15:44:57.994256067Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675175759` → **200**

```json
[
  {
    "phone": "+380675175759",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:44:54.984027732Z"
  },
  {
    "phone": "+380675175759",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T15:44:57.994256067Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/8855fcf7-264e-41b5-8e8d-4c701a134515/start` → **200**

```json
{
  "command_id": "15ec8145-6d0d-4a44-a0aa-b981f1990999",
  "expected_version": 1
}
```

```json
{
  "id": "8855fcf7-264e-41b5-8e8d-4c701a134515",
  "order_id": "5ba2eae1-51f5-47f4-a055-37b6c0729c03",
  "assignment_id": "db29a122-eae6-4bb0-b81b-d28a74a0cdfa",
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
  "arrived_at": "2026-10-29T15:44:56.249274Z",
  "started_at": "2026-10-29T15:44:58.668209Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675175759"
  }
}
```

`POST /api/driver/v1/trips/8855fcf7-264e-41b5-8e8d-4c701a134515/complete` → **200**

```json
{
  "command_id": "a4f52660-5b0c-449b-abb7-ce4b2037c6c4",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:44:58Z",
  "cash_received": true
}
```

```json
{
  "id": "8855fcf7-264e-41b5-8e8d-4c701a134515",
  "order_id": "5ba2eae1-51f5-47f4-a055-37b6c0729c03",
  "assignment_id": "db29a122-eae6-4bb0-b81b-d28a74a0cdfa",
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
  "arrived_at": "2026-10-29T15:44:56.249274Z",
  "started_at": "2026-10-29T15:44:58.668209Z",
  "completed_at": "2026-10-29T15:44:58.961575Z",
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
  "session_id": "ef62a984-8e44-4f9a-8e3f-79bfd3af480e",
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
  "last_heartbeat_at": "2026-10-29T15:44:55.958188Z",
  "last_location_at": "2026-10-29T15:44:55.958188Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ef62a984-8e44-4f9a-8e3f-79bfd3af480e/close` → **200**

```json
{
  "command_id": "245ed605-a33f-4002-9fe8-799fb1cb1a00",
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
  "phone": "+380633367990",
  "device_ref": "sandbox-28004"
}
```

```json
{
  "challenge_id": "fa108d5e-66c9-42ed-a4f0-4e28e1116b81",
  "expires_at": "2026-10-29T15:49:59.85035876Z",
  "resend_available_at": "2026-10-29T15:45:00.85035876Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633367990` → **200**

```json
{
  "phone": "+380633367990",
  "audience": "CLIENT",
  "code": "931322",
  "sent_at": "2026-10-29T15:44:59.854178357Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fa108d5e-66c9-42ed-a4f0-4e28e1116b81",
  "code": "931322",
  "device_ref": "sandbox-28004"
}
```

```json
{
  "session_id": "b2db8a52-e80f-4225-ac4c-f75ca51c6866",
  "subject": {
    "type": "CLIENT",
    "id": "d83b0181-895b-41cf-b5c4-1d26ddbd6a3b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODNiMDE4MS04OTViLTQxY2YtYjVjNC0xZDI2ZGRiZDZhM2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NjAwLCJpYXQiOjE3OTMyODg3MDAsImp0aSI6IjBhMTE2MmVkLTYwMzEtNDBmOS1hMWMxLTlkY2ViMDgyOWQzOCIsInNpZCI6ImIyZGI4YTUyLWU4MGYtNDIyNS1hYzRjLWY3NWNhNTFjNjg2NiJ9.7usOCCxx2zVQZDZ3SnLTLR_BWZalyE-Pk2QN0ZllUDs",
  "access_expires_at": "2026-10-29T16:00:00.160054066Z",
  "refresh_token": "ZMV0Bk8BnBPDt4vJztH4t7kHHnIxtnrIkkGKJHA8s9Q",
  "refresh_expires_at": "2026-11-28T15:45:00.159358627Z",
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
  "device_ref": "sandbox-14438"
}
```

```json
{
  "challenge_id": "ff02f99f-54d3-43b0-bcaf-9fe6e45591de",
  "expires_at": "2026-10-29T15:50:00.718057078Z",
  "resend_available_at": "2026-10-29T15:45:01.718057078Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "555344",
  "sent_at": "2026-10-29T15:45:00.721438486Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ff02f99f-54d3-43b0-bcaf-9fe6e45591de",
  "code": "555344",
  "device_ref": "sandbox-14438"
}
```

```json
{
  "session_id": "38390b3e-1839-4dcb-968e-af224bdbb98e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTYwMSwiaWF0IjoxNzkzMjg4NzAxLCJqdGkiOiJhMTQ3MTFmNS0xZTllLTRiOTYtYWMwYy0zM2NkN2IyZGUyNjgiLCJzaWQiOiIzODM5MGIzZS0xODM5LTRkY2ItOTY4ZS1hZjIyNGJkYmI5OGUifQ.5RCc27Amin5koC6cHhJYWmuAfDv8gv-z7GEpzxtXjBQ",
  "access_expires_at": "2026-10-29T16:00:01.024591947Z",
  "refresh_token": "zQIwA-guMO8EBoPF8TDvl1une37cCFMTq9xYXIiw-_g",
  "refresh_expires_at": "2026-11-28T15:45:01.023936374Z",
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
  "session_id": "523a0aff-0c8b-4914-9789-d1c97ab3151d",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk2MDEsImlhdCI6MTc5MzI4ODcwMSwianRpIjoiNDRmNjI0ZjAtNTkzZS00YTYxLWIzZWItNTU5MTI3NTYxMjhlIiwic2lkIjoiNTIzYTBhZmYtMGM4Yi00OTE0LTk3ODktZDFjOTdhYjMxNTFkIn0.k_JAh7W2W6OTGj4I2xH3yc6XAFOyPLVOZFe_B7YWZHE",
  "access_expires_at": "2026-10-29T16:00:01.89539105Z",
  "refresh_token": "JxIYRUUsxkhH4hyC4QE4d_MMl134y3KH7PCrhnAyTjs",
  "refresh_expires_at": "2026-10-30T03:45:01.894633339Z",
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
  "session_id": "b30e731a-dfa7-46a0-89a0-c74acf127484",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk2MDIsImlhdCI6MTc5MzI4ODcwMiwianRpIjoiMzY1OTNiOWUtZjZjYy00Y2QxLWIxNjQtY2VkZjRiMWQyNDQxIiwic2lkIjoiYjMwZTczMWEtZGZhNy00NmEwLTg5YTAtYzc0YWNmMTI3NDg0In0.e8EKG5Ak1OIr9iInCiVnYL1JRLBG05pHNV4zVGusW-Q",
  "access_expires_at": "2026-10-29T16:00:02.466071307Z",
  "refresh_token": "03X11UapvIKSGoNyVcLS0jkFO2j8RLkbJj-h4YmV7yE",
  "refresh_expires_at": "2026-10-30T03:45:02.465422208Z",
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
  "command_id": "407f5ec8-c393-4339-9d7e-9eddad32affe",
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
  "id": "454965f3-101b-4802-b085-e8165a04499a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:50:03.037709Z",
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
  "command_id": "8073f1e9-ea26-4b6a-b4bd-5397f62ae642",
  "quote_id": "454965f3-101b-4802-b085-e8165a04499a",
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
  "id": "c89e77dd-6b24-48a5-ae39-64a53c98ba2f",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d83b0181-895b-41cf-b5c4-1d26ddbd6a3b",
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
  "created_at": "2026-10-29T15:45:03.333845Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c89e77dd-6b24-48a5-ae39-64a53c98ba2f` → **200**

```json
{
  "id": "c89e77dd-6b24-48a5-ae39-64a53c98ba2f",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d83b0181-895b-41cf-b5c4-1d26ddbd6a3b",
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
  "created_at": "2026-10-29T15:45:03.333845Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c89e77dd-6b24-48a5-ae39-64a53c98ba2f/cancel` → **200**

```json
{
  "command_id": "19ae35ef-5fff-4dc2-a540-6bb10275159d",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "c89e77dd-6b24-48a5-ae39-64a53c98ba2f",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d83b0181-895b-41cf-b5c4-1d26ddbd6a3b",
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
  "created_at": "2026-10-29T15:45:03.333845Z",
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
  "command_id": "20d8ccce-8df4-41d3-987b-06c0dfaee862",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:45:04Z",
    "sequence": 1793288704526
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b816927b-6b8e-40b8-aa9b-b6af57dfba87",
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
  "last_heartbeat_at": "2026-10-29T15:45:04.54588Z",
  "last_location_at": "2026-10-29T15:45:04.54588Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-17865"
}
```

```json
{
  "challenge_id": "ab8d6435-04e4-4066-8bdf-b9d773cd8518",
  "expires_at": "2026-10-29T15:50:04.824835552Z",
  "resend_available_at": "2026-10-29T15:45:05.824835552Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "115635",
  "sent_at": "2026-10-29T15:45:04.828657658Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ab8d6435-04e4-4066-8bdf-b9d773cd8518",
  "code": "115635",
  "device_ref": "sandbox-17865"
}
```

```json
{
  "session_id": "af6f9257-c44e-451d-b8a8-a707edc44bbe",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTYwNSwiaWF0IjoxNzkzMjg4NzA1LCJqdGkiOiI0YTFjMDg4NS02Y2UwLTQ0YzQtYmY3Yy1iNWJkNGNkNDhlOGYiLCJzaWQiOiJhZjZmOTI1Ny1jNDRlLTQ1MWQtYjhhOC1hNzA3ZWRjNDRiYmUifQ.2WNCpq-ECBCHclubj6RjfJDKhI0CYJwK8EH8raA70Bo",
  "access_expires_at": "2026-10-29T16:00:05.136975789Z",
  "refresh_token": "Lcusm2DGBFiBsYN5CyKJ4byyZNMbxUcb3X1qLhdcYoU",
  "refresh_expires_at": "2026-11-28T15:45:05.136352071Z",
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
  "command_id": "ee37f482-ff49-431c-9e98-c98df7c8fbb3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:45:05Z",
    "sequence": 1793288705689
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "51a3c23d-1b71-4a44-ba32-3e3d190c6eed",
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
  "last_heartbeat_at": "2026-10-29T15:45:05.708673Z",
  "last_location_at": "2026-10-29T15:45:05.708673Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "de4b2238-542b-4e0d-8026-5ef167662fd9",
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
  "id": "834d7109-cb6e-4414-bc92-262764862cad",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:50:05.997274Z",
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
  "command_id": "7d630e37-6909-49a6-a099-a3f41842383f",
  "quote_id": "834d7109-cb6e-4414-bc92-262764862cad",
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
  "id": "de5cf653-f8e3-4a86-823d-e9ec60de8cfc",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d83b0181-895b-41cf-b5c4-1d26ddbd6a3b",
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
  "created_at": "2026-10-29T15:45:06.303838Z",
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
    "id": "0fbc11f2-c0ca-4196-8e20-9b6f500cb0b9",
    "order_id": "de5cf653-f8e3-4a86-823d-e9ec60de8cfc",
    "expires_at": "2026-10-29T15:45:21.307599Z",
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

`POST /api/driver/v1/offers/0fbc11f2-c0ca-4196-8e20-9b6f500cb0b9/accept` → **200**

```json
{
  "command_id": "1acde2e6-7e45-4b1a-a264-813481742f05"
}
```

```json
{
  "id": "f1621727-f622-46b8-b1bc-5fde20179668",
  "order_id": "de5cf653-f8e3-4a86-823d-e9ec60de8cfc",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "84e38daf-c580-40c4-89c7-6a47b129f4cf",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "84e38daf-c580-40c4-89c7-6a47b129f4cf",
  "order_id": "de5cf653-f8e3-4a86-823d-e9ec60de8cfc",
  "assignment_id": "f1621727-f622-46b8-b1bc-5fde20179668",
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

`POST /api/driver/v1/trips/84e38daf-c580-40c4-89c7-6a47b129f4cf/cancel` → **200**

```json
{
  "command_id": "75188c7d-7b74-452a-a2d6-40bd7103dcff",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "84e38daf-c580-40c4-89c7-6a47b129f4cf",
  "order_id": "de5cf653-f8e3-4a86-823d-e9ec60de8cfc",
  "assignment_id": "f1621727-f622-46b8-b1bc-5fde20179668",
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

`GET /api/rider/v1/orders/de5cf653-f8e3-4a86-823d-e9ec60de8cfc` → **200**

```json
{
  "id": "de5cf653-f8e3-4a86-823d-e9ec60de8cfc",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "d83b0181-895b-41cf-b5c4-1d26ddbd6a3b",
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
    "id": "f1621727-f622-46b8-b1bc-5fde20179668",
    "order_id": "de5cf653-f8e3-4a86-823d-e9ec60de8cfc",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "84e38daf-c580-40c4-89c7-6a47b129f4cf",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T15:45:06.303838Z",
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
    "id": "79d30a1a-0046-4bda-85f7-0e7df3d179e7",
    "order_id": "de5cf653-f8e3-4a86-823d-e9ec60de8cfc",
    "expires_at": "2026-10-29T15:45:22.468835Z",
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

`POST /api/driver/v1/offers/79d30a1a-0046-4bda-85f7-0e7df3d179e7/accept` → **200**

```json
{
  "command_id": "e0787735-8e37-465b-8683-cea423f69afa"
}
```

```json
{
  "id": "b32e3277-3640-4948-82dd-e755a17165e6",
  "order_id": "de5cf653-f8e3-4a86-823d-e9ec60de8cfc",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "648ed52a-22e1-405a-8882-38ae0ebb0bdc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "648ed52a-22e1-405a-8882-38ae0ebb0bdc",
  "order_id": "de5cf653-f8e3-4a86-823d-e9ec60de8cfc",
  "assignment_id": "b32e3277-3640-4948-82dd-e755a17165e6",
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

`POST /api/driver/v1/trips/648ed52a-22e1-405a-8882-38ae0ebb0bdc/cancel` → **200**

```json
{
  "command_id": "ad66e4db-83f4-475d-8c26-143fcdeaafa8",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "648ed52a-22e1-405a-8882-38ae0ebb0bdc",
  "order_id": "de5cf653-f8e3-4a86-823d-e9ec60de8cfc",
  "assignment_id": "b32e3277-3640-4948-82dd-e755a17165e6",
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
    "id": "de5cf653-f8e3-4a86-823d-e9ec60de8cfc",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T15:45:06.303838Z",
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
    "id": "c89e77dd-6b24-48a5-ae39-64a53c98ba2f",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T15:45:03.333845Z",
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

`GET /api/operator/v1/orders/de5cf653-f8e3-4a86-823d-e9ec60de8cfc/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:45:06.304481Z",
      "actor": {
        "type": "CLIENT",
        "id": "d83b0181-895b-41cf-b5c4-1d26ddbd6a3b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "de5cf653-f8e3-4a86-823d-e9ec60de8cfc",
        "quote_id": "834d7109-cb6e-4414-bc92-262764862cad",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "8b484323-b910-4e33-a649-baee7662fa54"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:45:06.306697Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "de5cf653-f8e3-4a86-823d-e9ec60de8cfc",
        "attempt_id": "cbac765d-b20d-4778-b066-e7034867e79f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "8b484323-b910-4e33-a649-baee7662fa54"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T15:45:06.313758Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "0fbc11f2-c0ca-4196-8e20-9b6f500cb0b9",
        "order_id": "de5cf653-f8e3-4a86-823d-e9ec60de8cfc",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "8b484323-b910-4e33-a649-baee7662fa54"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T15:45:06.887847Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "0fbc11f2-c0ca-4196-8e20-9b6f500cb0b9",
        "order_id": "de5cf653-f8e3-4a86-823d-e9ec60de8cfc",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "f1621727-f622-46b8-b1bc-5fde20179668"
      },
      "correlation_id": "1812b067-d9a5-4ded-8155-2902bdb42d15"
```

Done: orders c89e77dd-6b24-48a5-ae39-64a53c98ba2f, de5cf653-f8e3-4a86-823d-e9ec60de8cfc.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735491083",
  "device_ref": "sandbox-10239"
}
```

```json
{
  "challenge_id": "ad8f828a-90c4-47ff-9ddf-1c80aabc6ba7",
  "expires_at": "2026-10-29T15:50:09.789306239Z",
  "resend_available_at": "2026-10-29T15:45:10.789306239Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735491083` → **200**

```json
{
  "phone": "+380735491083",
  "audience": "CLIENT",
  "code": "469581",
  "sent_at": "2026-10-29T15:45:09.792687683Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ad8f828a-90c4-47ff-9ddf-1c80aabc6ba7",
  "code": "469581",
  "device_ref": "sandbox-10239"
}
```

```json
{
  "session_id": "6e40dee6-711f-4607-97e4-99215a965a80",
  "subject": {
    "type": "CLIENT",
    "id": "0377de0a-af51-4b92-bf57-d9ddafc53081"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzc3ZGUwYS1hZjUxLTRiOTItYmY1Ny1kOWRkYWZjNTMwODEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NjEwLCJpYXQiOjE3OTMyODg3MTAsImp0aSI6IjRjMTljYjRiLTgwM2UtNDBkMy1iNDZkLWU1YTVjODZkZDYxMSIsInNpZCI6IjZlNDBkZWU2LTcxMWYtNDYwNy05N2U0LTk5MjE1YTk2NWE4MCJ9.iEBRrjZNUIhvqdwD4hJ_ltCaEbAY7D4eoYXgXZem2aY",
  "access_expires_at": "2026-10-29T16:00:10.117159741Z",
  "refresh_token": "dpFGRPWiqMLILHvlJOG6WIF69B2Ymgp5AL8i5fP8aqI",
  "refresh_expires_at": "2026-11-28T15:45:10.116494299Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "9f708bbc-5eb4-4c6d-84c1-10a636d2f3c8",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "51be14f9-e212-4427-9501-2c488f850a68",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-51be14f9-e212-4427-9501-2c488f850a68",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "a07f49ffaa4ec49b1fca837a7cb63e54",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=51be14f9-e212-4427-9501-2c488f850a68",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735491083"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=51be14f9-e212-4427-9501-2c488f850a68",
  "expires_at": "2026-10-29T16:15:10.393011Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/51be14f9-e212-4427-9501-2c488f850a68` → **200**

```json
{
  "id": "51be14f9-e212-4427-9501-2c488f850a68",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T16:15:10.393011Z",
  "card": {
    "id": "8cc4b229-5b61-4478-a1bb-69d1350de4f0",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3503",
    "card_type": "Visa",
    "created_at": "2026-10-29T15:45:10.689728Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "8cc4b229-5b61-4478-a1bb-69d1350de4f0",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****3503",
      "card_type": "Visa",
      "created_at": "2026-10-29T15:45:10.689728Z"
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
  "device_ref": "sandbox-22035"
}
```

```json
{
  "challenge_id": "952f618b-1a69-43e0-b0c2-0b668c4b9002",
  "expires_at": "2026-10-29T15:50:11.274437222Z",
  "resend_available_at": "2026-10-29T15:45:12.274437222Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "106527",
  "sent_at": "2026-10-29T15:45:11.278565149Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "952f618b-1a69-43e0-b0c2-0b668c4b9002",
  "code": "106527",
  "device_ref": "sandbox-22035"
}
```

```json
{
  "session_id": "d4f856d5-ada3-4bdb-a9b1-cdab5f8e963c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTYxMSwiaWF0IjoxNzkzMjg4NzExLCJqdGkiOiI2MGEzNjgyYi01ZDEwLTQyOTItOGIxMy00ZDlmN2QwZjNhNzUiLCJzaWQiOiJkNGY4NTZkNS1hZGEzLTRiZGItYTliMS1jZGFiNWY4ZTk2M2MifQ.5XmVo4deVsJSSUGYmELCk_RvmDuYBu8M5AL61Zy9D88",
  "access_expires_at": "2026-10-29T16:00:11.582688347Z",
  "refresh_token": "-SsbnPfOyVp8yJjRjfqM_i-L5i6nPtpHYBZx0KGE-ag",
  "refresh_expires_at": "2026-11-28T15:45:11.581953716Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "51a3c23d-1b71-4a44-ba32-3e3d190c6eed",
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
  "last_heartbeat_at": "2026-10-29T15:45:05.708673Z",
  "last_location_at": "2026-10-29T15:45:05.708673Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/51a3c23d-1b71-4a44-ba32-3e3d190c6eed/handover` → **200**

```json
{
  "command_id": "4b2fa0fa-a5d6-442c-ae3a-24c2467c00d1",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "51a3c23d-1b71-4a44-ba32-3e3d190c6eed",
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
  "last_heartbeat_at": "2026-10-29T15:45:05.708673Z",
  "last_location_at": "2026-10-29T15:45:05.708673Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/51a3c23d-1b71-4a44-ba32-3e3d190c6eed/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:45:12Z",
    "sequence": 1793288712428
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "51a3c23d-1b71-4a44-ba32-3e3d190c6eed",
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
  "last_heartbeat_at": "2026-10-29T15:45:12.449176Z",
  "last_location_at": "2026-10-29T15:45:12.449176Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "eacb86f2-e987-41dc-81ad-5fdb5e6f0fa3",
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
  "id": "53d4ee90-b90b-4616-904f-945c33634ef0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:50:12.732850Z",
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
  "command_id": "b474a49a-7508-4a64-908b-33a74dfb7dc5",
  "quote_id": "53d4ee90-b90b-4616-904f-945c33634ef0",
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
  "id": "b8520e81-87d7-4f28-b44a-416359bb0772",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0377de0a-af51-4b92-bf57-d9ddafc53081",
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
  "created_at": "2026-10-29T15:45:13.04999Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b8520e81-87d7-4f28-b44a-416359bb0772` → **200**

```json
{
  "id": "b8520e81-87d7-4f28-b44a-416359bb0772",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0377de0a-af51-4b92-bf57-d9ddafc53081",
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
  "created_at": "2026-10-29T15:45:13.04999Z",
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
    "id": "192f0325-dd37-45fb-a1fd-524ee627fde9",
    "order_id": "b8520e81-87d7-4f28-b44a-416359bb0772",
    "expires_at": "2026-10-29T15:45:28.316516Z",
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

`POST /api/driver/v1/offers/192f0325-dd37-45fb-a1fd-524ee627fde9/accept` → **200**

```json
{
  "command_id": "45ca6752-e0a4-4ca9-a255-baa403c74462"
}
```

```json
{
  "id": "a7fae729-4f14-4a1a-a2f1-525142a1b0b3",
  "order_id": "b8520e81-87d7-4f28-b44a-416359bb0772",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "58d15d15-5870-4e42-a12e-19addc434d05",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "58d15d15-5870-4e42-a12e-19addc434d05",
  "order_id": "b8520e81-87d7-4f28-b44a-416359bb0772",
  "assignment_id": "a7fae729-4f14-4a1a-a2f1-525142a1b0b3",
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

`POST /api/driver/v1/work-sessions/51a3c23d-1b71-4a44-ba32-3e3d190c6eed/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:45:14Z",
    "sequence": 1793288714495
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "51a3c23d-1b71-4a44-ba32-3e3d190c6eed",
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
  "last_heartbeat_at": "2026-10-29T15:45:14.515136Z",
  "last_location_at": "2026-10-29T15:45:14.515136Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/58d15d15-5870-4e42-a12e-19addc434d05/arrive` → **200**

```json
{
  "command_id": "6b530abc-28ca-43bb-8c2e-bb46880be433",
  "expected_version": 0
}
```

```json
{
  "id": "58d15d15-5870-4e42-a12e-19addc434d05",
  "order_id": "b8520e81-87d7-4f28-b44a-416359bb0772",
  "assignment_id": "a7fae729-4f14-4a1a-a2f1-525142a1b0b3",
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
  "arrived_at": "2026-10-29T15:45:14.798719Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/58d15d15-5870-4e42-a12e-19addc434d05/start` → **200**

```json
{
  "command_id": "3610e76d-ce65-42f2-b2ad-1f744096d3e5",
  "expected_version": 1
}
```

```json
{
  "id": "58d15d15-5870-4e42-a12e-19addc434d05",
  "order_id": "b8520e81-87d7-4f28-b44a-416359bb0772",
  "assignment_id": "a7fae729-4f14-4a1a-a2f1-525142a1b0b3",
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
  "arrived_at": "2026-10-29T15:45:14.798719Z",
  "started_at": "2026-10-29T15:45:15.112963Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/58d15d15-5870-4e42-a12e-19addc434d05/complete` → **200**

```json
{
  "command_id": "108f9987-8ed8-452f-b2fd-d146f385e484",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:45:15Z",
  "cash_received": true
}
```

```json
{
  "id": "58d15d15-5870-4e42-a12e-19addc434d05",
  "order_id": "b8520e81-87d7-4f28-b44a-416359bb0772",
  "assignment_id": "a7fae729-4f14-4a1a-a2f1-525142a1b0b3",
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
  "arrived_at": "2026-10-29T15:45:14.798719Z",
  "started_at": "2026-10-29T15:45:15.112963Z",
  "completed_at": "2026-10-29T15:45:15.428164Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/b8520e81-87d7-4f28-b44a-416359bb0772` → **200**

```json
{
  "id": "b8520e81-87d7-4f28-b44a-416359bb0772",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "0377de0a-af51-4b92-bf57-d9ddafc53081",
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
    "id": "a7fae729-4f14-4a1a-a2f1-525142a1b0b3",
    "order_id": "b8520e81-87d7-4f28-b44a-416359bb0772",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "58d15d15-5870-4e42-a12e-19addc434d05",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:45:13.04999Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b8520e81-87d7-4f28-b44a-416359bb0772` → **200**

```json
{
  "id": "b8520e81-87d7-4f28-b44a-416359bb0772",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "0377de0a-af51-4b92-bf57-d9ddafc53081",
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
    "id": "a7fae729-4f14-4a1a-a2f1-525142a1b0b3",
    "order_id": "b8520e81-87d7-4f28-b44a-416359bb0772",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "58d15d15-5870-4e42-a12e-19addc434d05",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:45:13.04999Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b8520e81-87d7-4f28-b44a-416359bb0772` → **200**

```json
{
  "id": "b8520e81-87d7-4f28-b44a-416359bb0772",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "0377de0a-af51-4b92-bf57-d9ddafc53081",
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
    "id": "a7fae729-4f14-4a1a-a2f1-525142a1b0b3",
    "order_id": "b8520e81-87d7-4f28-b44a-416359bb0772",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "58d15d15-5870-4e42-a12e-19addc434d05",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:45:13.04999Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b8520e81-87d7-4f28-b44a-416359bb0772` → **200**

```json
{
  "id": "b8520e81-87d7-4f28-b44a-416359bb0772",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "0377de0a-af51-4b92-bf57-d9ddafc53081",
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
    "id": "a7fae729-4f14-4a1a-a2f1-525142a1b0b3",
    "order_id": "b8520e81-87d7-4f28-b44a-416359bb0772",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "58d15d15-5870-4e42-a12e-19addc434d05",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:45:13.04999Z",
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

`GET /api/rider/v1/orders/b8520e81-87d7-4f28-b44a-416359bb0772/tip` → **200**

```json
{
  "order_id": "b8520e81-87d7-4f28-b44a-416359bb0772",
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
  "available_until": "2026-10-30T15:45:15.428164Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/b8520e81-87d7-4f28-b44a-416359bb0772/tip` → **201**

```json
{
  "command_id": "e29e60f2-e1dc-4869-8432-9bfa30b36721",
  "amount_minor": 2500
}
```

```json
{
  "id": "dfdd0f5e-753e-48c0-bc59-9cbe3affdb24",
  "order_id": "b8520e81-87d7-4f28-b44a-416359bb0772",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T15:45:20.458067Z"
}
```

`GET /api/rider/v1/orders/b8520e81-87d7-4f28-b44a-416359bb0772/tip` → **200**

```json
{
  "order_id": "b8520e81-87d7-4f28-b44a-416359bb0772",
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
  "available_until": "2026-10-30T15:45:15.428164Z",
  "open": false,
  "tip": {
    "id": "dfdd0f5e-753e-48c0-bc59-9cbe3affdb24",
    "order_id": "b8520e81-87d7-4f28-b44a-416359bb0772",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T15:45:20.458067Z"
  }
}
```

`GET /api/rider/v1/orders/b8520e81-87d7-4f28-b44a-416359bb0772/tip` → **200**

```json
{
  "order_id": "b8520e81-87d7-4f28-b44a-416359bb0772",
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
  "available_until": "2026-10-30T15:45:15.428164Z",
  "open": false,
  "tip": {
    "id": "dfdd0f5e-753e-48c0-bc59-9cbe3affdb24",
    "order_id": "b8520e81-87d7-4f28-b44a-416359bb0772",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T15:45:20.458067Z"
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
      "id": "32ebcfa5-c3a6-4721-9908-1c0b3e696a74",
      "at": "2026-10-29T15:45:16.406821Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "b8520e81-87d7-4f28-b44a-416359bb0772",
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
      "id": "c9b76291-7f14-4a72-8fb4-5c9741b861b8",
      "at": "2026-10-29T15:45:22.468476Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "b8520e81-87d7-4f28-b44a-416359bb0772",
      "counterpart_id": null
    },
    {
      "id": "32ebcfa5-c3a6-4721-9908-1c0b3e696a74",
      "at": "2026-10-29T15:45:16.406821Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "b8520e81-87d7-4f28-b44a-416359bb0772",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1e9f998c-f70b-43cd-9f84-683cb203a932",
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
  "id": "318dc89a-d2f0-406d-8c98-283e53985b65",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:50:23.875431Z",
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
  "session_id": "c72b60e7-b08d-49b8-8ae3-cf0b613b3b00",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk2MjQsImlhdCI6MTc5MzI4ODcyNCwianRpIjoiZTkwNmQ3NzYtMmJmNi00NDBmLTg5OTItNzg2MWFhYmVjNjE4Iiwic2lkIjoiYzcyYjYwZTctYjA4ZC00OWI4LThhZTMtY2YwYjYxM2IzYjAwIn0.PaquRNR8hAPPlkHqqUk7FmlrxIRLMp5X-vhSoCnJGu0",
  "access_expires_at": "2026-10-29T16:00:24.457617633Z",
  "refresh_token": "5ydEnF4S8bcnrQjrsrAyz5Rp_kwSSEmmzsAx3ZXf16I",
  "refresh_expires_at": "2026-10-30T03:45:24.456957117Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380735491083` → **200**

```json
{
  "client_id": "0377de0a-af51-4b92-bf57-d9ddafc53081"
}
```

`POST /api/admin/v1/rider-wallets/0377de0a-af51-4b92-bf57-d9ddafc53081/top-ups` → **201**

```json
{
  "command_id": "1ddacdfb-997e-461c-a839-1704fbbd0e5b",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "0377de0a-af51-4b92-bf57-d9ddafc53081",
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
      "id": "d8aa9485-76f7-497f-b5ac-d15df6f30d3a",
      "at": "2026-10-29T15:45:24.992838Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8bf41337-6e84-4573-9c47-33f4e498de26",
  "quote_id": "318dc89a-d2f0-406d-8c98-283e53985b65",
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
  "id": "a0581a49-1615-43f1-9a57-db01d0cd88bf",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0377de0a-af51-4b92-bf57-d9ddafc53081",
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
  "created_at": "2026-10-29T15:45:25.304575Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a0581a49-1615-43f1-9a57-db01d0cd88bf` → **200**

```json
{
  "id": "a0581a49-1615-43f1-9a57-db01d0cd88bf",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0377de0a-af51-4b92-bf57-d9ddafc53081",
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
  "created_at": "2026-10-29T15:45:25.304575Z",
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
    "id": "196432cc-cc04-42b3-a7dd-ba6f4f100261",
    "order_id": "a0581a49-1615-43f1-9a57-db01d0cd88bf",
    "expires_at": "2026-10-29T15:45:40.309763Z",
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

`POST /api/driver/v1/offers/196432cc-cc04-42b3-a7dd-ba6f4f100261/accept` → **200**

```json
{
  "command_id": "87f0277e-526b-4eba-8133-028f9d0bcc50"
}
```

```json
{
  "id": "89a1fa83-1ae5-4d5e-9a2a-0e8ffc43649f",
  "order_id": "a0581a49-1615-43f1-9a57-db01d0cd88bf",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d14fdfa8-04b2-498a-b79f-8b2a1b746ee3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d14fdfa8-04b2-498a-b79f-8b2a1b746ee3",
  "order_id": "a0581a49-1615-43f1-9a57-db01d0cd88bf",
  "assignment_id": "89a1fa83-1ae5-4d5e-9a2a-0e8ffc43649f",
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

`POST /api/driver/v1/work-sessions/51a3c23d-1b71-4a44-ba32-3e3d190c6eed/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:45:26Z",
    "sequence": 1793288726745
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "51a3c23d-1b71-4a44-ba32-3e3d190c6eed",
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
  "last_heartbeat_at": "2026-10-29T15:45:26.76496Z",
  "last_location_at": "2026-10-29T15:45:26.76496Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d14fdfa8-04b2-498a-b79f-8b2a1b746ee3/arrive` → **200**

```json
{
  "command_id": "c723ce68-3d8e-45c5-9ab6-446dca2a0111",
  "expected_version": 0
}
```

```json
{
  "id": "d14fdfa8-04b2-498a-b79f-8b2a1b746ee3",
  "order_id": "a0581a49-1615-43f1-9a57-db01d0cd88bf",
  "assignment_id": "89a1fa83-1ae5-4d5e-9a2a-0e8ffc43649f",
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
  "arrived_at": "2026-10-29T15:45:27.047695Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d14fdfa8-04b2-498a-b79f-8b2a1b746ee3/start` → **200**

```json
{
  "command_id": "b7eaef4d-79d1-4489-83e6-c61ce9ea6a6f",
  "expected_version": 1
}
```

```json
{
  "id": "d14fdfa8-04b2-498a-b79f-8b2a1b746ee3",
  "order_id": "a0581a49-1615-43f1-9a57-db01d0cd88bf",
  "assignment_id": "89a1fa83-1ae5-4d5e-9a2a-0e8ffc43649f",
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
  "arrived_at": "2026-10-29T15:45:27.047695Z",
  "started_at": "2026-10-29T15:45:27.341804Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d14fdfa8-04b2-498a-b79f-8b2a1b746ee3/complete` → **200**

```json
{
  "command_id": "46fffe16-f621-42c0-9d9f-18d1210602aa",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:45:27Z",
  "cash_received": true
}
```

```json
{
  "id": "d14fdfa8-04b2-498a-b79f-8b2a1b746ee3",
  "order_id": "a0581a49-1615-43f1-9a57-db01d0cd88bf",
  "assignment_id": "89a1fa83-1ae5-4d5e-9a2a-0e8ffc43649f",
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
  "arrived_at": "2026-10-29T15:45:27.047695Z",
  "started_at": "2026-10-29T15:45:27.341804Z",
  "completed_at": "2026-10-29T15:45:27.646401Z",
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
  "client_id": "0377de0a-af51-4b92-bf57-d9ddafc53081",
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
      "id": "d8aa9485-76f7-497f-b5ac-d15df6f30d3a",
      "at": "2026-10-29T15:45:24.992838Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
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

`GET /api/rider/v1/orders/a0581a49-1615-43f1-9a57-db01d0cd88bf/tip` → **200**

```json
{
  "order_id": "a0581a49-1615-43f1-9a57-db01d0cd88bf",
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
  "available_until": "2026-10-30T15:45:27.646401Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/a0581a49-1615-43f1-9a57-db01d0cd88bf/tip` → **201**

```json
{
  "command_id": "c52f63fa-2661-42b4-bea9-6bc5a5644ab1",
  "amount_minor": 2500
}
```

```json
{
  "id": "0bf4f830-dd1f-4991-9ac1-f1575edd90d4",
  "order_id": "a0581a49-1615-43f1-9a57-db01d0cd88bf",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T15:45:28.819856Z"
}
```

`GET /api/rider/v1/orders/a0581a49-1615-43f1-9a57-db01d0cd88bf/tip` → **200**

```json
{
  "order_id": "a0581a49-1615-43f1-9a57-db01d0cd88bf",
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
  "available_until": "2026-10-30T15:45:27.646401Z",
  "open": false,
  "tip": {
    "id": "0bf4f830-dd1f-4991-9ac1-f1575edd90d4",
    "order_id": "a0581a49-1615-43f1-9a57-db01d0cd88bf",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T15:45:28.819856Z"
  }
}
```

`GET /api/rider/v1/orders/a0581a49-1615-43f1-9a57-db01d0cd88bf/tip` → **200**

```json
{
  "order_id": "a0581a49-1615-43f1-9a57-db01d0cd88bf",
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
  "available_until": "2026-10-30T15:45:27.646401Z",
  "open": false,
  "tip": {
    "id": "0bf4f830-dd1f-4991-9ac1-f1575edd90d4",
    "order_id": "a0581a49-1615-43f1-9a57-db01d0cd88bf",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T15:45:28.819856Z"
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
      "id": "6cd56ef5-acb4-4e37-9072-e51c44532391",
      "at": "2026-10-29T15:45:30.545633Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "a0581a49-1615-43f1-9a57-db01d0cd88bf",
      "counterpart_id": null
    },
    {
      "id": "7a288a4f-d9f7-4f7e-8b92-35858837021e",
      "at": "2026-10-29T15:45:28.517183Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "a0581a49-1615-43f1-9a57-db01d0cd88bf",
      "counterpart_id": null
    },
    {
      "id": "c9b76291-7f14-4a72-8fb4-5c9741b861b8",
      "at": "2026-10-29T15:45:22.468476Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "b8520e81-87d7-4f28-b44a-416359bb0772",
      "counterpart_id": null
    },
    {
      "id": "32ebcfa5-c3a6-4721-9908-1c0b3e696a74",
      "at": "2026-10-29T15:45:16.406821Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "b8520e81-87d7-4f28-b44a-416359bb0772",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "51a3c23d-1b71-4a44-ba32-3e3d190c6eed",
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
  "last_heartbeat_at": "2026-10-29T15:45:26.76496Z",
  "last_location_at": "2026-10-29T15:45:26.76496Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/51a3c23d-1b71-4a44-ba32-3e3d190c6eed/close` → **200**

```json
{
  "command_id": "20f421b4-1aa4-4b37-9cd6-dda3e01de905",
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

Done: card order a0581a49-1615-43f1-9a57-db01d0cd88bf.

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
  "phone": "+380732944341",
  "device_ref": "sandbox-1665"
}
```

```json
{
  "challenge_id": "700c460a-54df-4944-9c57-3ce292415122",
  "expires_at": "2026-10-29T15:50:31.797572722Z",
  "resend_available_at": "2026-10-29T15:45:32.797572722Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380732944341` → **200**

```json
{
  "phone": "+380732944341",
  "audience": "CLIENT",
  "code": "444469",
  "sent_at": "2026-10-29T15:45:31.801286564Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "700c460a-54df-4944-9c57-3ce292415122",
  "code": "444469",
  "device_ref": "sandbox-1665"
}
```

```json
{
  "session_id": "e5478605-03d6-4eb5-bbd4-749c4a1189e3",
  "subject": {
    "type": "CLIENT",
    "id": "92bf84b0-290f-4009-9c43-79a57dd4c713"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MmJmODRiMC0yOTBmLTQwMDktOWM0My03OWE1N2RkNGM3MTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NjMyLCJpYXQiOjE3OTMyODg3MzIsImp0aSI6IjQzMTE1NDQwLTc2YzMtNGUxNS1hY2UzLWJmOTQ5OTc5ZTc1OCIsInNpZCI6ImU1NDc4NjA1LTAzZDYtNGViNS1iYmQ0LTc0OWM0YTExODllMyJ9.D7C1KnXFLAD08DSBKNag9pajjM21zBKfasAuA_g6a4E",
  "access_expires_at": "2026-10-29T16:00:32.106056918Z",
  "refresh_token": "aWSjFZvu5rCJ5lC_J9srA4thbAOiiFfI9ODebce8siA",
  "refresh_expires_at": "2026-11-28T15:45:32.105378471Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "508b336c-9cea-4d74-98c4-158ba8e52ea3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "84a1df99-caec-41bb-b9da-df047c2c748b",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-84a1df99-caec-41bb-b9da-df047c2c748b",
    "orderDate": "1793288732",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "c567bda7d11de8bea226c70158cd01ba",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=84a1df99-caec-41bb-b9da-df047c2c748b",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732944341"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=84a1df99-caec-41bb-b9da-df047c2c748b",
  "created_at": "2026-10-29T15:45:32.398418Z",
  "expires_at": "2026-10-29T16:15:32.398418Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/84a1df99-caec-41bb-b9da-df047c2c748b` → **200**

```json
{
  "id": "84a1df99-caec-41bb-b9da-df047c2c748b",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T15:45:32.398418Z",
  "expires_at": "2026-10-29T16:15:32.398418Z",
  "completed_at": "2026-10-29T15:45:32.691159Z",
  "masked_pan": "41****2178",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "92bf84b0-290f-4009-9c43-79a57dd4c713",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "92bf84b0-290f-4009-9c43-79a57dd4c713",
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
      "id": "5d1231ef-0fac-4701-9eb8-01c4391f25d6",
      "at": "2026-10-29T15:45:33.562083Z",
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
  "client_id": "92bf84b0-290f-4009-9c43-79a57dd4c713",
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
      "id": "5d1231ef-0fac-4701-9eb8-01c4391f25d6",
      "at": "2026-10-29T15:45:33.562083Z",
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
  "device_ref": "sandbox-1034"
}
```

```json
{
  "challenge_id": "38a4b9ad-90c0-49b3-89ee-38fe0d622ef7",
  "expires_at": "2026-10-29T15:50:34.835137451Z",
  "resend_available_at": "2026-10-29T15:45:35.835137451Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "609527",
  "sent_at": "2026-10-29T15:45:34.838416395Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "38a4b9ad-90c0-49b3-89ee-38fe0d622ef7",
  "code": "609527",
  "device_ref": "sandbox-1034"
}
```

```json
{
  "session_id": "70fa7048-e991-4e87-a346-a8d5eae23031",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTYzNSwiaWF0IjoxNzkzMjg4NzM1LCJqdGkiOiI0ZDQ5MzQ2ZC03M2M2LTQ5MzUtOTVkYS02YjFiMmRiMjEwOTAiLCJzaWQiOiI3MGZhNzA0OC1lOTkxLTRlODctYTM0Ni1hOGQ1ZWFlMjMwMzEifQ.qvnyvLzKFVuWaiA05C6ilht_HbPdur0lPJD8FSqwab4",
  "access_expires_at": "2026-10-29T16:00:35.13546679Z",
  "refresh_token": "d_ZncZoCkQvGVx0cnnJ9Dn_0NhroZo6oZJusBm-_7Gk",
  "refresh_expires_at": "2026-11-28T15:45:35.134884133Z",
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
  "command_id": "293eeb3a-10b1-4136-8f4f-6e141b578de1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "07233400-6ab0-4b87-8428-7696ca91979a",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-07233400-6ab0-4b87-8428-7696ca91979a",
    "orderDate": "1793288735",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "789fe1b1239e6a7bb04692d3f79e813f",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=07233400-6ab0-4b87-8428-7696ca91979a",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=07233400-6ab0-4b87-8428-7696ca91979a",
  "created_at": "2026-10-29T15:45:35.705079Z",
  "expires_at": "2026-10-29T16:15:35.705079Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/07233400-6ab0-4b87-8428-7696ca91979a` → **200**

```json
{
  "id": "07233400-6ab0-4b87-8428-7696ca91979a",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T15:45:35.705079Z",
  "expires_at": "2026-10-29T16:15:35.705079Z",
  "completed_at": "2026-10-29T15:45:35.985039Z",
  "masked_pan": "41****1424",
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
      "id": "02a512cc-510f-4022-8bc2-7c1107367756",
      "at": "2026-10-29T15:45:36.569787Z",
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
  "command_id": "087136cc-cf00-41ee-aad6-c949eb0d36d7",
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
  "correlation_id": "6dd18059-a532-42e4-ae3c-1953eff12511"
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
  "device_ref": "sandbox-30769"
}
```

```json
{
  "challenge_id": "c6e8d675-fd8e-4447-9ed3-8ba44e3d7994",
  "expires_at": "2026-10-29T15:50:38.138861392Z",
  "resend_available_at": "2026-10-29T15:45:39.138861392Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "114538",
  "sent_at": "2026-10-29T15:45:38.142009632Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c6e8d675-fd8e-4447-9ed3-8ba44e3d7994",
  "code": "114538",
  "device_ref": "sandbox-30769"
}
```

```json
{
  "session_id": "88d44a96-5aaf-471e-aa85-526a5740b9c5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTYzOCwiaWF0IjoxNzkzMjg4NzM4LCJqdGkiOiI5YjZhYjJjMy1iY2UwLTRjMzktYWYxYi02NzdlNDNhZmJmYWMiLCJzaWQiOiI4OGQ0NGE5Ni01YWFmLTQ3MWUtYWE4NS01MjZhNTc0MGI5YzUifQ.DBsaJGhu6yne4cMW1idMjrpmVPKeFOCoNzfINsNIvpY",
  "access_expires_at": "2026-10-29T16:00:38.44614294Z",
  "refresh_token": "39vZPSQahKxrhJU0_Mvp9UQFnmej_52MSjlOQb_kwlM",
  "refresh_expires_at": "2026-11-28T15:45:38.445621348Z",
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
  "command_id": "62ca8698-5518-4de6-bb35-2c1e377324f9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:45:38Z",
    "sequence": 1793288738974
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2a3828ea-f16f-42dc-ac83-3ac5e975c506",
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
  "last_heartbeat_at": "2026-10-29T15:45:38.992448Z",
  "last_location_at": "2026-10-29T15:45:38.992448Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637340562",
  "device_ref": "sandbox-7858"
}
```

```json
{
  "challenge_id": "d1dc03e9-5775-4eeb-a92c-57b22e88371c",
  "expires_at": "2026-10-29T15:50:39.283991978Z",
  "resend_available_at": "2026-10-29T15:45:40.283991978Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637340562` → **200**

```json
{
  "phone": "+380637340562",
  "audience": "CLIENT",
  "code": "646483",
  "sent_at": "2026-10-29T15:45:39.286773133Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d1dc03e9-5775-4eeb-a92c-57b22e88371c",
  "code": "646483",
  "device_ref": "sandbox-7858"
}
```

```json
{
  "session_id": "aafb610b-8e45-4717-a450-28ce8fa7a4c0",
  "subject": {
    "type": "CLIENT",
    "id": "a765c49a-6640-4455-bf88-c1fc34c84fd7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNzY1YzQ5YS02NjQwLTQ0NTUtYmY4OC1jMWZjMzRjODRmZDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NjM5LCJpYXQiOjE3OTMyODg3MzksImp0aSI6ImNmZjNkZWMzLTlkZTktNGJiOS1hMjRiLThjZDU4OTY0MzU5MCIsInNpZCI6ImFhZmI2MTBiLThlNDUtNDcxNy1hNDUwLTI4Y2U4ZmE3YTRjMCJ9.NCG2-lz0zKvO81TikIowX6x5_Fu0IJH32wHGKf09Q_A",
  "access_expires_at": "2026-10-29T16:00:39.588743111Z",
  "refresh_token": "cfXBz8HVrQiJ0ezm6gwlqZXWsJ4A3bnVf0orlWNk7LE",
  "refresh_expires_at": "2026-11-28T15:45:39.588209987Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "53d7b6c8-9583-401d-bacd-f4666191f9ea",
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
  "id": "ae75e2bb-400e-4688-8403-2bedb684ce2c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:50:39.878955Z",
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
  "command_id": "7758b5e0-f64a-469a-9285-4f8c5f54f3b7",
  "quote_id": "ae75e2bb-400e-4688-8403-2bedb684ce2c",
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
  "id": "a716eb6c-3360-4c32-9c59-0d9e43404644",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a765c49a-6640-4455-bf88-c1fc34c84fd7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:45:40.1695Z",
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
    "id": "867a5ace-f90b-4c71-9afc-df8f68bbedca",
    "order_id": "a716eb6c-3360-4c32-9c59-0d9e43404644",
    "expires_at": "2026-10-29T15:45:55.172601Z",
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

`POST /api/driver/v1/offers/867a5ace-f90b-4c71-9afc-df8f68bbedca/accept` → **200**

```json
{
  "command_id": "6222dace-0be3-486b-8fc4-4e0b8b589537"
}
```

```json
{
  "id": "a85aa7da-38bc-44b1-b9f8-2042942cfeca",
  "order_id": "a716eb6c-3360-4c32-9c59-0d9e43404644",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "304ce038-9fdf-4096-8fe4-acc42efcf7d7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "304ce038-9fdf-4096-8fe4-acc42efcf7d7",
  "order_id": "a716eb6c-3360-4c32-9c59-0d9e43404644",
  "assignment_id": "a85aa7da-38bc-44b1-b9f8-2042942cfeca",
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

`POST /api/driver/v1/work-sessions/2a3828ea-f16f-42dc-ac83-3ac5e975c506/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:45:41Z",
    "sequence": 1793288741329
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2a3828ea-f16f-42dc-ac83-3ac5e975c506",
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
  "last_heartbeat_at": "2026-10-29T15:45:41.347658Z",
  "last_location_at": "2026-10-29T15:45:41.347658Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/304ce038-9fdf-4096-8fe4-acc42efcf7d7/arrive` → **200**

```json
{
  "command_id": "d04ad96a-bbcc-4a8e-955c-7fb0a6042a78",
  "expected_version": 0
}
```

```json
{
  "id": "304ce038-9fdf-4096-8fe4-acc42efcf7d7",
  "order_id": "a716eb6c-3360-4c32-9c59-0d9e43404644",
  "assignment_id": "a85aa7da-38bc-44b1-b9f8-2042942cfeca",
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
  "arrived_at": "2026-10-29T15:45:41.631642Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/304ce038-9fdf-4096-8fe4-acc42efcf7d7/start` → **200**

```json
{
  "command_id": "c4638200-7be8-4a61-a84f-22a9e828e404",
  "expected_version": 1
}
```

```json
{
  "id": "304ce038-9fdf-4096-8fe4-acc42efcf7d7",
  "order_id": "a716eb6c-3360-4c32-9c59-0d9e43404644",
  "assignment_id": "a85aa7da-38bc-44b1-b9f8-2042942cfeca",
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
  "arrived_at": "2026-10-29T15:45:41.631642Z",
  "started_at": "2026-10-29T15:45:41.923101Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/304ce038-9fdf-4096-8fe4-acc42efcf7d7/complete` → **200**

```json
{
  "command_id": "55d1b580-c16d-46fa-9e23-1c79049cf4fe",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:45:42Z",
  "cash_received": false
}
```

```json
{
  "id": "304ce038-9fdf-4096-8fe4-acc42efcf7d7",
  "order_id": "a716eb6c-3360-4c32-9c59-0d9e43404644",
  "assignment_id": "a85aa7da-38bc-44b1-b9f8-2042942cfeca",
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
  "arrived_at": "2026-10-29T15:45:41.631642Z",
  "started_at": "2026-10-29T15:45:41.923101Z",
  "completed_at": "2026-10-29T15:45:42.219836Z",
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
  "session_id": "a623b362-9db8-4119-8fea-79bfee713ddd",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk2NDIsImlhdCI6MTc5MzI4ODc0MiwianRpIjoiYmQwOGIzYzItYzhmZC00MWVkLTk4MzktYmE0YjdkYmM3MTYyIiwic2lkIjoiYTYyM2IzNjItOWRiOC00MTE5LThmZWEtNzliZmVlNzEzZGRkIn0.6SaTLoycO-xWWyXDnHqc-c-70TUYJW3patMBVNi-P8w",
  "access_expires_at": "2026-10-29T16:00:42.802788891Z",
  "refresh_token": "aGI0yuXlmsaRZhlKbIMY90ucKF3wu0qqcMR2f_xn5fE",
  "refresh_expires_at": "2026-10-30T03:45:42.802277828Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/a716eb6c-3360-4c32-9c59-0d9e43404644/cash-dispute` → **200**

```json
{
  "order_id": "a716eb6c-3360-4c32-9c59-0d9e43404644",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "a765c49a-6640-4455-bf88-c1fc34c84fd7",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T15:45:42.614789Z",
  "decide_by": "2026-11-12T15:45:42.614789Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T15:45:42.614789Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "a716eb6c-3360-4c32-9c59-0d9e43404644",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "a765c49a-6640-4455-bf88-c1fc34c84fd7",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T15:45:42.614789Z",
      "decide_by": "2026-11-12T15:45:42.614789Z",
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

`POST /api/admin/v1/orders/a716eb6c-3360-4c32-9c59-0d9e43404644/cash-dispute/decide` → **400**

```json
{
  "command_id": "8689e0ce-f334-478c-96a4-d38bf39ec07a",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/a716eb6c-3360-4c32-9c59-0d9e43404644/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "66e73274-7ef0-44a3-903c-70f6e1502c39",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/a716eb6c-3360-4c32-9c59-0d9e43404644/cash-dispute/decide` → **200**

```json
{
  "command_id": "8043d18f-9646-4428-ace4-a983ff8250f0",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "a716eb6c-3360-4c32-9c59-0d9e43404644",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "a765c49a-6640-4455-bf88-c1fc34c84fd7",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T15:45:42.614789Z",
  "decide_by": "2026-11-12T15:45:42.614789Z",
  "decision": "PAY_DRIVER",
  "decided_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T15:45:43.973481Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/a716eb6c-3360-4c32-9c59-0d9e43404644/cash-dispute/decide` → **409**

```json
{
  "command_id": "e6b0db82-ad3e-4a63-9e1b-9dd3ac986d34",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/a716eb6c-3360-4c32-9c59-0d9e43404644/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e2231d64-8238-492c-9d96-bd4bb3a9f326"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2a3828ea-f16f-42dc-ac83-3ac5e975c506",
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
  "last_heartbeat_at": "2026-10-29T15:45:41.347658Z",
  "last_location_at": "2026-10-29T15:45:41.347658Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2a3828ea-f16f-42dc-ac83-3ac5e975c506/close` → **200**

```json
{
  "command_id": "2c9524e2-9896-4ddd-8b14-006d8f92a7be",
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
  "phone": "+380732910419",
  "device_ref": "sandbox-1438"
}
```

```json
{
  "challenge_id": "4f63deea-3120-4a7f-b42d-772e01be1404",
  "expires_at": "2026-10-29T15:50:45.11801202Z",
  "resend_available_at": "2026-10-29T15:45:46.11801202Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380732910419` → **200**

```json
{
  "phone": "+380732910419",
  "audience": "CLIENT",
  "code": "445936",
  "sent_at": "2026-10-29T15:45:45.121077505Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4f63deea-3120-4a7f-b42d-772e01be1404",
  "code": "445936",
  "device_ref": "sandbox-1438"
}
```

```json
{
  "session_id": "f637ad12-cf7e-4b4c-989b-f3274eb09da5",
  "subject": {
    "type": "CLIENT",
    "id": "f4e17067-b6ca-44c5-8a51-812e81620278"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNGUxNzA2Ny1iNmNhLTQ0YzUtOGE1MS04MTJlODE2MjAyNzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NjQ1LCJpYXQiOjE3OTMyODg3NDUsImp0aSI6IjNmMGQ3MWI0LWU2NDEtNDI2Ny05NDkzLWY5MTc2NDZlYjlhNiIsInNpZCI6ImY2MzdhZDEyLWNmN2UtNGI0Yy05ODliLWYzMjc0ZWIwOWRhNSJ9.a7yBO0QaAFc4nI4kSMbJvTLG7g9XSd7xgDRnTtOWmq0",
  "access_expires_at": "2026-10-29T16:00:45.433444955Z",
  "refresh_token": "5_O-DkEHXJhvOxWAvl8X3D6f9Jzz_iXtLIw2ascDrJg",
  "refresh_expires_at": "2026-11-28T15:45:45.432832933Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "a656751b-06d2-424f-b3d2-4abf9398875d",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "484fe58c-83cf-4f6a-bae1-378ab8eccab0",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-484fe58c-83cf-4f6a-bae1-378ab8eccab0",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "ec5f34704c53578d40ab67c9990421e4",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=484fe58c-83cf-4f6a-bae1-378ab8eccab0",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732910419"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=484fe58c-83cf-4f6a-bae1-378ab8eccab0",
  "expires_at": "2026-10-29T16:15:45.72756Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/484fe58c-83cf-4f6a-bae1-378ab8eccab0` → **200**

```json
{
  "id": "484fe58c-83cf-4f6a-bae1-378ab8eccab0",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T16:15:45.72756Z",
  "card": {
    "id": "13d784ca-b6db-4bd7-99e8-472259a7f4ec",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6335",
    "card_type": "Visa",
    "created_at": "2026-10-29T15:45:46.004989Z"
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
  "device_ref": "sandbox-30368"
}
```

```json
{
  "challenge_id": "28116fbd-fb0b-4061-b507-ce183ef2d815",
  "expires_at": "2026-10-29T15:50:46.306834499Z",
  "resend_available_at": "2026-10-29T15:45:47.306834499Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "825415",
  "sent_at": "2026-10-29T15:45:46.309687937Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "28116fbd-fb0b-4061-b507-ce183ef2d815",
  "code": "825415",
  "device_ref": "sandbox-30368"
}
```

```json
{
  "session_id": "b49d53ea-37b8-4c2c-b976-7c4bc4e674a2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTY0NiwiaWF0IjoxNzkzMjg4NzQ2LCJqdGkiOiI5YTA5MDIyOS0zYmVkLTQyYjktYTkzYi0wNWVhOTU2YzYxMTQiLCJzaWQiOiJiNDlkNTNlYS0zN2I4LTRjMmMtYjk3Ni03YzRiYzRlNjc0YTIifQ.P9dkwFC2cTzo21En19Mk6otp-_ufhsFhMmKYLt99MbQ",
  "access_expires_at": "2026-10-29T16:00:46.606908393Z",
  "refresh_token": "vRKkwmmTICjLkyd6DW7RU6QrwJzNKQMIPLkXf775GpA",
  "refresh_expires_at": "2026-11-28T15:45:46.606383924Z",
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
  "command_id": "16e29223-d7d1-49ec-b550-99a68389c536",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:45:47Z",
    "sequence": 1793288747173
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9923c930-4f4e-4c9d-9cf2-14ca0fc30336",
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
  "last_heartbeat_at": "2026-10-29T15:45:47.19227Z",
  "last_location_at": "2026-10-29T15:45:47.19227Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d0cbe1b9-ff9d-48b4-9f36-9dfa8941ae54",
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
  "id": "97838519-790d-451e-bfdc-a1d6be63b38c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:50:47.477333Z",
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
  "command_id": "d6272bbe-f84c-4399-8127-5e15ac92a403",
  "quote_id": "97838519-790d-451e-bfdc-a1d6be63b38c",
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
  "id": "0064c69c-4dc1-4e39-957b-2b36ae1d43b6",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f4e17067-b6ca-44c5-8a51-812e81620278",
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
  "created_at": "2026-10-29T15:45:47.772824Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0064c69c-4dc1-4e39-957b-2b36ae1d43b6` → **200**

```json
{
  "id": "0064c69c-4dc1-4e39-957b-2b36ae1d43b6",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f4e17067-b6ca-44c5-8a51-812e81620278",
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
  "created_at": "2026-10-29T15:45:47.772824Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0064c69c-4dc1-4e39-957b-2b36ae1d43b6` → **200**

```json
{
  "id": "0064c69c-4dc1-4e39-957b-2b36ae1d43b6",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f4e17067-b6ca-44c5-8a51-812e81620278",
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
  "created_at": "2026-10-29T15:45:47.772824Z",
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
    "id": "31bea496-303b-4c1f-854c-c576245c833b",
    "order_id": "0064c69c-4dc1-4e39-957b-2b36ae1d43b6",
    "expires_at": "2026-10-29T15:46:03.664695Z",
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

`POST /api/driver/v1/offers/31bea496-303b-4c1f-854c-c576245c833b/accept` → **200**

```json
{
  "command_id": "a3170f46-0374-4436-a733-b5390e8b4bed"
}
```

```json
{
  "id": "b7cd8957-08f9-4648-aed1-0ce86beb4de2",
  "order_id": "0064c69c-4dc1-4e39-957b-2b36ae1d43b6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cbc83aa7-6574-469d-9be4-64af6738766a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cbc83aa7-6574-469d-9be4-64af6738766a",
  "order_id": "0064c69c-4dc1-4e39-957b-2b36ae1d43b6",
  "assignment_id": "b7cd8957-08f9-4648-aed1-0ce86beb4de2",
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

`POST /api/rider/v1/orders/0064c69c-4dc1-4e39-957b-2b36ae1d43b6/messages` → **201**

```json
{
  "command_id": "aa8b1364-abcf-4c40-8169-5dab3e30f112",
  "body": "Я біля входу, мій номер +380732910419, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "3349bb00-de13-4c34-a32f-c74a130a0e01",
  "order_id": "0064c69c-4dc1-4e39-957b-2b36ae1d43b6",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380732910419, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-29T15:45:50.506129015Z"
}
```

`POST /api/driver/v1/trips/cbc83aa7-6574-469d-9be4-64af6738766a/messages` → **201**

```json
{
  "command_id": "8709bb4a-5983-41b4-a182-fa22b35ee09f",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "57432a00-4e83-4465-9ff6-953572125964",
  "order_id": "0064c69c-4dc1-4e39-957b-2b36ae1d43b6",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-29T15:45:50.800967209Z"
}
```

`POST /api/driver/v1/work-sessions/9923c930-4f4e-4c9d-9cf2-14ca0fc30336/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:45:51Z",
    "sequence": 1793288751741
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9923c930-4f4e-4c9d-9cf2-14ca0fc30336",
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
  "last_heartbeat_at": "2026-10-29T15:45:51.092931Z",
  "last_location_at": "2026-10-29T15:45:51.092931Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/cbc83aa7-6574-469d-9be4-64af6738766a/arrive` → **200**

```json
{
  "command_id": "4b20914e-009d-40ea-9384-3484062e6375",
  "expected_version": 0
}
```

```json
{
  "id": "cbc83aa7-6574-469d-9be4-64af6738766a",
  "order_id": "0064c69c-4dc1-4e39-957b-2b36ae1d43b6",
  "assignment_id": "b7cd8957-08f9-4648-aed1-0ce86beb4de2",
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
  "arrived_at": "2026-10-29T15:45:51.384448Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cbc83aa7-6574-469d-9be4-64af6738766a/start` → **200**

```json
{
  "command_id": "98f882ac-fe17-45a6-a936-4e1a447036e6",
  "expected_version": 1
}
```

```json
{
  "id": "cbc83aa7-6574-469d-9be4-64af6738766a",
  "order_id": "0064c69c-4dc1-4e39-957b-2b36ae1d43b6",
  "assignment_id": "b7cd8957-08f9-4648-aed1-0ce86beb4de2",
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
  "arrived_at": "2026-10-29T15:45:51.384448Z",
  "started_at": "2026-10-29T15:45:51.675805Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/9923c930-4f4e-4c9d-9cf2-14ca0fc30336/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:45:51Z",
    "sequence": 1793288751956
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9923c930-4f4e-4c9d-9cf2-14ca0fc30336",
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
  "last_heartbeat_at": "2026-10-29T15:45:51.975151Z",
  "last_location_at": "2026-10-29T15:45:51.975151Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/cbc83aa7-6574-469d-9be4-64af6738766a/complete` → **200**

```json
{
  "command_id": "7ef3ba7d-cf2c-4345-9616-1d6265dcbf42",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:45:52Z",
  "cash_received": false
}
```

```json
{
  "id": "cbc83aa7-6574-469d-9be4-64af6738766a",
  "order_id": "0064c69c-4dc1-4e39-957b-2b36ae1d43b6",
  "assignment_id": "b7cd8957-08f9-4648-aed1-0ce86beb4de2",
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
  "arrived_at": "2026-10-29T15:45:51.384448Z",
  "started_at": "2026-10-29T15:45:51.675805Z",
  "completed_at": "2026-10-29T15:45:52.270501Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/0064c69c-4dc1-4e39-957b-2b36ae1d43b6` → **200**

```json
{
  "id": "0064c69c-4dc1-4e39-957b-2b36ae1d43b6",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "f4e17067-b6ca-44c5-8a51-812e81620278",
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
    "id": "b7cd8957-08f9-4648-aed1-0ce86beb4de2",
    "order_id": "0064c69c-4dc1-4e39-957b-2b36ae1d43b6",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cbc83aa7-6574-469d-9be4-64af6738766a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:45:47.772824Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0064c69c-4dc1-4e39-957b-2b36ae1d43b6` → **200**

```json
{
  "id": "0064c69c-4dc1-4e39-957b-2b36ae1d43b6",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "f4e17067-b6ca-44c5-8a51-812e81620278",
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
    "id": "b7cd8957-08f9-4648-aed1-0ce86beb4de2",
    "order_id": "0064c69c-4dc1-4e39-957b-2b36ae1d43b6",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cbc83aa7-6574-469d-9be4-64af6738766a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:45:47.772824Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0064c69c-4dc1-4e39-957b-2b36ae1d43b6` → **200**

```json
{
  "id": "0064c69c-4dc1-4e39-957b-2b36ae1d43b6",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "f4e17067-b6ca-44c5-8a51-812e81620278",
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
    "id": "b7cd8957-08f9-4648-aed1-0ce86beb4de2",
    "order_id": "0064c69c-4dc1-4e39-957b-2b36ae1d43b6",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cbc83aa7-6574-469d-9be4-64af6738766a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:45:47.772824Z",
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
  "session_id": "9923c930-4f4e-4c9d-9cf2-14ca0fc30336",
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
  "last_heartbeat_at": "2026-10-29T15:45:51.975151Z",
  "last_location_at": "2026-10-29T15:45:51.975151Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9923c930-4f4e-4c9d-9cf2-14ca0fc30336/close` → **200**

```json
{
  "command_id": "79ef910d-4909-4c51-9273-eff572bdfa0b",
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
  "session_id": "8e57f9f5-7089-41ab-88c7-7a67372c02c2",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk2NTYsImlhdCI6MTc5MzI4ODc1NiwianRpIjoiY2YyMmNiYTQtYTMxYS00NWZkLTg5Y2YtZTQwNmI2NTEwMzkxIiwic2lkIjoiOGU1N2Y5ZjUtNzA4OS00MWFiLTg4YzctN2E2NzM3MmMwMmMyIn0.AuZlFgYX1L2Mo2W4WagmDBVQZnmnBEaIVdZVLnuHa6c",
  "access_expires_at": "2026-10-29T16:00:56.335021406Z",
  "refresh_token": "37GyhYGeOCWwQmZzt_CgQqp7-ITiQgGpnL4zH7I3rIk",
  "refresh_expires_at": "2026-10-30T03:45:56.334409813Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/0064c69c-4dc1-4e39-957b-2b36ae1d43b6/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/0064c69c-4dc1-4e39-957b-2b36ae1d43b6/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "641051bd-f2c2-44eb-ad36-564d5f6f7f67"
}
```

`GET /api/admin/v1/orders/0064c69c-4dc1-4e39-957b-2b36ae1d43b6/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-29T15:45:56.884987109Z",
  "order": {
    "id": "0064c69c-4dc1-4e39-957b-2b36ae1d43b6",
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
    "created_at": "2026-10-29T15:45:47.772824Z",
    "assigned_at": "2026-10-29T15:45:49.930391Z",
    "arrived_at": "2026-10-29T15:45:51.384448Z",
    "started_at": "2026-10-29T15:45:51.675805Z",
    "completed_at": "2026-10-29T15:45:52.270501Z"
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
    "id": "f4e17067-b6ca-44c5-8a51-812e81620278",
    "registered_at": "2026-10-29T15:45:45.43079Z",
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
      "created_at": "2026-10-29T15:45:47.776558Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-29T15:45:52.739103Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/0064c69c-4dc1-4e39-957b-2b36ae1d43b6/chargebacks` → **422**

```json
{
  "command_id": "7260a9b2-4393-4b69-badd-ff84a0a6a994",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "instance": "/api/admin/v1/orders/0064c69c-4dc1-4e39-957b-2b36ae1d43b6/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "ef998f0d-f281-406f-a1c8-75c11b1e5391"
}
```

`POST /api/admin/v1/orders/0064c69c-4dc1-4e39-957b-2b36ae1d43b6/chargebacks` → **201**

```json
{
  "command_id": "301f6d1b-5504-4aa2-9fc1-d492a1764929",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "efd5ee41-97a8-43a6-b7ee-71a4137c7072",
  "order_id": "0064c69c-4dc1-4e39-957b-2b36ae1d43b6",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T15:45:57.580366Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/0064c69c-4dc1-4e39-957b-2b36ae1d43b6/chargebacks` → **201**

```json
{
  "command_id": "301f6d1b-5504-4aa2-9fc1-d492a1764929",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "efd5ee41-97a8-43a6-b7ee-71a4137c7072",
  "order_id": "0064c69c-4dc1-4e39-957b-2b36ae1d43b6",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T15:45:57.580366Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/f4e17067-b6ca-44c5-8a51-812e81620278` → **200**

```json
{
  "client": {
    "id": "f4e17067-b6ca-44c5-8a51-812e81620278",
    "phone": "+380732910419",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T15:45:45.43079Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "0064c69c-4dc1-4e39-957b-2b36ae1d43b6",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T15:45:47.772824Z",
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

`POST /api/admin/v1/orders/0064c69c-4dc1-4e39-957b-2b36ae1d43b6/chargebacks/efd5ee41-97a8-43a6-b7ee-71a4137c7072/resolve` → **200**

```json
{
  "command_id": "458967b8-b546-4709-9201-939cdd003846",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "efd5ee41-97a8-43a6-b7ee-71a4137c7072",
  "order_id": "0064c69c-4dc1-4e39-957b-2b36ae1d43b6",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-29T15:45:57.580366Z",
  "resolved_at": "2026-10-29T15:45:58.535328Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/f4e17067-b6ca-44c5-8a51-812e81620278` → **200**

```json
{
  "client": {
    "id": "f4e17067-b6ca-44c5-8a51-812e81620278",
    "phone": "+380732910419",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T15:45:45.43079Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "0064c69c-4dc1-4e39-957b-2b36ae1d43b6",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T15:45:47.772824Z",
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

`POST /api/admin/v1/orders/0064c69c-4dc1-4e39-957b-2b36ae1d43b6/chargebacks/efd5ee41-97a8-43a6-b7ee-71a4137c7072/resolve` → **409**

```json
{
  "command_id": "0264fa9a-2341-4537-8106-4a05d70a6587",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/0064c69c-4dc1-4e39-957b-2b36ae1d43b6/chargebacks/efd5ee41-97a8-43a6-b7ee-71a4137c7072/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "2ec8daec-52a9-49c5-b299-a78fc2cf4bcf"
}
```

`GET /api/admin/v1/orders/0064c69c-4dc1-4e39-957b-2b36ae1d43b6/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "efd5ee41-97a8-43a6-b7ee-71a4137c7072",
      "order_id": "0064c69c-4dc1-4e39-957b-2b36ae1d43b6",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-28",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-29T15:45:57.580366Z",
      "resolved_at": "2026-10-29T15:45:58.535328Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 0064c69c-4dc1-4e39-957b-2b36ae1d43b6 without phone or card digits; chargeback efd5ee41-97a8-43a6-b7ee-71a4137c7072 recorded and won.

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
  "session_id": "8968eb17-4dac-45d0-a0dc-8ca3d6a48115",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk2NjAsImlhdCI6MTc5MzI4ODc2MCwianRpIjoiZDg0YTkyZmUtM2M1MS00YTIzLWFkMmItYzRkZjM3Njg1NGZjIiwic2lkIjoiODk2OGViMTctNGRhYy00NWQwLWEwZGMtOGNhM2Q2YTQ4MTE1In0.bqMr58shYoLPHZ9PxZX0yJK98itxzZ9NMd4M456nF8g",
  "access_expires_at": "2026-10-29T16:01:00.296050738Z",
  "refresh_token": "V2zJ5sui30-prOZK5YqnDaIgWMIYH-WWq35EC3rpArk",
  "refresh_expires_at": "2026-10-30T03:46:00.295446832Z",
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
  "phone": "+48600212128",
  "device_ref": "sandbox-7870"
}
```

```json
{
  "challenge_id": "d4e3eb60-f325-4cff-ada2-39dd6bf72c7c",
  "expires_at": "2026-10-29T15:51:01.184549851Z",
  "resend_available_at": "2026-10-29T15:46:02.184549851Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600212128` → **200**

```json
{
  "phone": "+48600212128",
  "audience": "CLIENT",
  "code": "071785",
  "sent_at": "2026-10-29T15:46:01.186923943Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d4e3eb60-f325-4cff-ada2-39dd6bf72c7c",
  "code": "071785",
  "device_ref": "sandbox-7870"
}
```

```json
{
  "session_id": "53b0714a-0762-48f2-adee-2065e089a9ab",
  "subject": {
    "type": "CLIENT",
    "id": "553860bb-4f02-44c2-bf53-c8443e88b40d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NTM4NjBiYi00ZjAyLTQ0YzItYmY1My1jODQ0M2U4OGI0MGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NjYxLCJpYXQiOjE3OTMyODg3NjEsImp0aSI6IjVlYmJlMDVmLTdkNDgtNDljZC1hOWEyLTcyYTAzYmQwNWQ3ZCIsInNpZCI6IjUzYjA3MTRhLTA3NjItNDhmMi1hZGVlLTIwNjVlMDg5YTlhYiJ9.h4e0nHnSot3yWpzr20Fs1OL3XMTJyd8WyLpiQlKbmz8",
  "access_expires_at": "2026-10-29T16:01:01.494264488Z",
  "refresh_token": "ZHKYG0LRGfLtahwrn7ae8IxQRwYmddj97812dkYY48c",
  "refresh_expires_at": "2026-11-28T15:46:01.493717118Z",
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
  "command_id": "ea3f8b50-6415-400a-bad8-10fd560eb621",
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
  "correlation_id": "18f75559-2fa3-4253-b026-546ec935c77c",
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
  "command_id": "aba78c9f-7ab1-400f-bb6c-20a81a32333e",
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
  "paused_at": "2026-10-29T15:46:02.626521035Z",
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
  "command_id": "0e17cfe0-46c6-4c27-b67f-24d0b66dfb69",
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
  "id": "425fa4b0-5978-4377-ace0-f78def8a9971",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:51:03.229438Z",
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
  "command_id": "7c5913b8-2ab4-4c52-97ee-27512790244a",
  "quote_id": "425fa4b0-5978-4377-ace0-f78def8a9971",
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
  "correlation_id": "5e5e7776-083a-4951-b829-d7b473e227ce"
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
  "paused_at": "2026-10-29T15:46:02.626521Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "c23f5229-0800-434f-a8d6-9293dcbba1bf",
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
  "command_id": "d14aff7e-0229-47ca-a3a8-5e11c24df665",
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
  "command_id": "51ed4f63-cad3-4507-b796-d0360daba6bc",
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
  "id": "5c0e2857-920b-4fef-996a-178d2f00ffda",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:51:04.955885Z",
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
  "command_id": "d67c5d3a-912b-451a-b779-e39f11b43007",
  "quote_id": "5c0e2857-920b-4fef-996a-178d2f00ffda",
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
  "correlation_id": "4a6f2fde-8968-4f8e-9d18-6963b2a4a836"
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
  "command_id": "e19662ac-d8b9-476d-abb2-2dc6052b797d",
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
      "from": "18:00",
      "to": "19:00"
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
      "from": "18:00",
      "to": "19:00"
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
  "command_id": "9409a094-5dd9-4e7a-b492-8e36d998366f",
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
  "id": "c0e2fdbc-ea74-468c-976d-0e3dbce85714",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:51:06.133736Z",
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
  "command_id": "74bd4781-2ce4-4649-b248-349d43a38515",
  "quote_id": "c0e2fdbc-ea74-468c-976d-0e3dbce85714",
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
  "correlation_id": "38439d13-a0e6-4f4e-b168-78fda1afe7bb"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "63e53bfe-3b43-4499-a94b-a51a2b9618a3",
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
  "correlation_id": "2466b319-7895-4b2b-a7f8-1de83cd02921"
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
      "from": "18:00",
      "to": "19:00"
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
  "command_id": "76e13e41-d3d3-494a-bc40-fa4bcf380f01",
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
  "phone": "+380677045887",
  "device_ref": "sandbox-17124"
}
```

```json
{
  "challenge_id": "8f6c999a-c755-4f08-bff4-10687952d8a7",
  "expires_at": "2026-10-29T15:51:07.628751308Z",
  "resend_available_at": "2026-10-29T15:46:08.628751308Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677045887` → **200**

```json
{
  "phone": "+380677045887",
  "audience": "CLIENT",
  "code": "560024",
  "sent_at": "2026-10-29T15:46:07.631423Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8f6c999a-c755-4f08-bff4-10687952d8a7",
  "code": "560024",
  "device_ref": "sandbox-17124"
}
```

```json
{
  "session_id": "ffe61aec-5486-4723-9e29-ad5c82ce0c5b",
  "subject": {
    "type": "CLIENT",
    "id": "3422d88f-1ec3-4717-97a2-46f26c4a3e66"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNDIyZDg4Zi0xZWMzLTQ3MTctOTdhMi00NmYyNmM0YTNlNjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NjY3LCJpYXQiOjE3OTMyODg3NjcsImp0aSI6IjNlYmUyMTFjLTVjNGEtNDlhZi1hZWVhLWI4ZjYwM2FmMWUzOCIsInNpZCI6ImZmZTYxYWVjLTU0ODYtNDcyMy05ZTI5LWFkNWM4MmNlMGM1YiJ9.JSt2MRyiP-RYgTHjMihkAAFmW3qxTHRgoXwt32Ys1xQ",
  "access_expires_at": "2026-10-29T16:01:07.945103439Z",
  "refresh_token": "jg72IvijMh_zualLK9JXK_V0h1Zu5t8WO4YX9BLPC2g",
  "refresh_expires_at": "2026-11-28T15:46:07.944601332Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3422d88f-1ec3-4717-97a2-46f26c4a3e66",
  "session_id": "ffe61aec-5486-4723-9e29-ad5c82ce0c5b",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a76507c8-5df7-4e40-9184-b3fe7c30f5ae",
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
  "id": "f2a7d37b-765b-4346-935d-14e44086991a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:51:08.504143Z",
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
  "challenge_id": "6b73f65c-1019-4c30-8b59-e9ea702f9ea5",
  "expires_at": "2026-10-29T15:51:10.805885525Z",
  "resend_available_at": "2026-10-29T15:46:11.805885525Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677045887` → **200**

```json
{
  "phone": "+380677045887",
  "audience": "CLIENT",
  "code": "218199",
  "sent_at": "2026-10-29T15:46:10.808566694Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "2f3e39b3-872e-4471-a4ff-b85897e79613",
  "challenge_id": "6b73f65c-1019-4c30-8b59-e9ea702f9ea5",
  "otp_code": "218199"
}
```

```json
{
  "client_id": "3422d88f-1ec3-4717-97a2-46f26c4a3e66",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T15:46:11.131265895Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "ba968ab1-c64c-4db5-8d55-6c264ff8fa30",
  "quote_id": "f2a7d37b-765b-4346-935d-14e44086991a",
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
  "correlation_id": "2cc7c6fa-93b2-4bff-aed8-aa860b90789f"
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
  "session_id": "69c4ac53-2f12-461e-acd6-6f85832eb4cb",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk2NzIsImlhdCI6MTc5MzI4ODc3MiwianRpIjoiNDA1NTJlN2QtMWQxYi00NjBhLWE1YWMtYjk2YzBmMjYyMjkxIiwic2lkIjoiNjljNGFjNTMtMmYxMi00NjFlLWFjZDYtNmY4NTgzMmViNGNiIn0.4VPrT1-ru5kLiy75AlOxovdnA1oerVdmlDaur4jXV3U",
  "access_expires_at": "2026-10-29T16:01:12.010787826Z",
  "refresh_token": "hurmKgs_4BG3lMmwJoHZQ-x2djCDJmp2vGUYyP5-PC0",
  "refresh_expires_at": "2026-10-30T03:46:12.010211041Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "3422d88f-1ec3-4717-97a2-46f26c4a3e66",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T15:46:11.131266Z",
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

`POST /api/admin/v1/client-deletions/3422d88f-1ec3-4717-97a2-46f26c4a3e66/complete` → **200**

```json
{
  "command_id": "6fe7d289-e662-4988-8afe-caf3622fa51a",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "3422d88f-1ec3-4717-97a2-46f26c4a3e66",
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
  "correlation_id": "cae797fc-adef-49b9-8098-98cdded2dae9"
}
```

Done: client 3422d88f-1ec3-4717-97a2-46f26c4a3e66 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664913946",
  "device_ref": "sandbox-26029"
}
```

```json
{
  "challenge_id": "57d0ea1a-d67d-43c9-b538-e01369a070f1",
  "expires_at": "2026-10-29T15:51:13.191344528Z",
  "resend_available_at": "2026-10-29T15:46:14.191344528Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664913946` → **200**

```json
{
  "phone": "+380664913946",
  "audience": "CLIENT",
  "code": "923708",
  "sent_at": "2026-10-29T15:46:13.194335034Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "57d0ea1a-d67d-43c9-b538-e01369a070f1",
  "code": "923708",
  "device_ref": "sandbox-26029"
}
```

```json
{
  "session_id": "c602fd0d-a503-43cd-9da7-3fad8ffe0cb2",
  "subject": {
    "type": "CLIENT",
    "id": "7c1e7776-7ac4-435f-a49a-0ba3e4093da2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzFlNzc3Ni03YWM0LTQzNWYtYTQ5YS0wYmEzZTQwOTNkYTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NjczLCJpYXQiOjE3OTMyODg3NzMsImp0aSI6IjEwYmE3NTA2LTUzZmYtNDQ3Yi1iN2I1LTAwMzU1MzY3OGJlOSIsInNpZCI6ImM2MDJmZDBkLWE1MDMtNDNjZC05ZGE3LTNmYWQ4ZmZlMGNiMiJ9.-yvna6ke_UXehQMP3g7kjgUAtAhbo7EwpZ300ws-Do0",
  "access_expires_at": "2026-10-29T16:01:13.492743266Z",
  "refresh_token": "bmkKoM0cUVtxihrhUqR2zZenh2dWMzm06Xu0B3WeC4w",
  "refresh_expires_at": "2026-11-28T15:46:13.492188441Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7c1e7776-7ac4-435f-a49a-0ba3e4093da2",
  "session_id": "c602fd0d-a503-43cd-9da7-3fad8ffe0cb2",
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
  "session_id": "a768ba67-f792-4e62-97ac-21e5fc2a204a",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk2NzQsImlhdCI6MTc5MzI4ODc3NCwianRpIjoiMzk4ZjExNDEtZjIzZi00MGQ3LWFhNDYtYTBjMGEwMjkzM2NkIiwic2lkIjoiYTc2OGJhNjctZjc5Mi00ZTYyLTk3YWMtMjFlNWZjMmEyMDRhIn0.WRKnGo35KGA-gL8mbM4aBuFfdQnN62JMUWlLp8Y0c6s",
  "access_expires_at": "2026-10-29T16:01:14.342630331Z",
  "refresh_token": "tU7mRnlgWUtg3GWLhHo-PnkuFj6gPZb3xSG1WUT1SvY",
  "refresh_expires_at": "2026-10-30T03:46:14.342049819Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=4913946&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "7c1e7776-7ac4-435f-a49a-0ba3e4093da2",
      "phone": "+380664913946",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T15:46:13.490347Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/7c1e7776-7ac4-435f-a49a-0ba3e4093da2` → **200**

```json
{
  "client": {
    "id": "7c1e7776-7ac4-435f-a49a-0ba3e4093da2",
    "phone": "+380664913946",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T15:46:13.490347Z",
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

`POST /api/admin/v1/clients/7c1e7776-7ac4-435f-a49a-0ba3e4093da2/block` → **400**

```json
{
  "command_id": "49e89195-db0a-4e35-9472-e9c3c4c182d8",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/7c1e7776-7ac4-435f-a49a-0ba3e4093da2/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "015fb52b-a867-446b-b24d-55b3e2f470a8",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/7c1e7776-7ac4-435f-a49a-0ba3e4093da2/block` → **200**

```json
{
  "command_id": "7c9c0e09-0142-416d-b695-1192c0f98862",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "7c1e7776-7ac4-435f-a49a-0ba3e4093da2",
  "phone": "+380664913946",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T15:46:13.490347Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T15:46:15.544135Z",
    "by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
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
  "correlation_id": "8fe51456-879c-4554-aeda-a0e133385e3b"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664913946",
  "device_ref": "sandbox-19072"
}
```

```json
{
  "challenge_id": "c903c724-232f-4b37-88f9-bfc06710e137",
  "expires_at": "2026-10-29T15:51:18.138360725Z",
  "resend_available_at": "2026-10-29T15:46:19.138360725Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664913946` → **200**

```json
{
  "phone": "+380664913946",
  "audience": "CLIENT",
  "code": "112563",
  "sent_at": "2026-10-29T15:46:18.14110937Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "c903c724-232f-4b37-88f9-bfc06710e137",
  "code": "112563",
  "device_ref": "sandbox-19072"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "adc03d98-090b-4ca2-a809-3e02b89b0414"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/7c1e7776-7ac4-435f-a49a-0ba3e4093da2` → **200**

```json
{
  "client": {
    "id": "7c1e7776-7ac4-435f-a49a-0ba3e4093da2",
    "phone": "+380664913946",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T15:46:13.490347Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T15:46:15.544135Z",
      "by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
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

`POST /api/admin/v1/clients/7c1e7776-7ac4-435f-a49a-0ba3e4093da2/unblock` → **200**

```json
{
  "command_id": "836e54f8-b972-45dc-ba12-aa012e6e889d",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "7c1e7776-7ac4-435f-a49a-0ba3e4093da2",
  "phone": "+380664913946",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T15:46:13.490347Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664913946",
  "device_ref": "sandbox-29378"
}
```

```json
{
  "challenge_id": "e6a9215d-706a-4ca4-9085-78f1647db2d7",
  "expires_at": "2026-10-29T15:51:21.345327092Z",
  "resend_available_at": "2026-10-29T15:46:22.345327092Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664913946` → **200**

```json
{
  "phone": "+380664913946",
  "audience": "CLIENT",
  "code": "746152",
  "sent_at": "2026-10-29T15:46:21.348004543Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e6a9215d-706a-4ca4-9085-78f1647db2d7",
  "code": "746152",
  "device_ref": "sandbox-29378"
}
```

```json
{
  "session_id": "3ea49b14-5c1e-4d45-9d3b-82d5d9e37358",
  "subject": {
    "type": "CLIENT",
    "id": "7c1e7776-7ac4-435f-a49a-0ba3e4093da2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzFlNzc3Ni03YWM0LTQzNWYtYTQ5YS0wYmEzZTQwOTNkYTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NjgxLCJpYXQiOjE3OTMyODg3ODEsImp0aSI6Ijg4YzA1NWI0LTZmM2UtNDIwMC05NGZkLTdiNTNkNjQxMTMwZSIsInNpZCI6IjNlYTQ5YjE0LTVjMWUtNGQ0NS05ZDNiLTgyZDVkOWUzNzM1OCJ9.UUIme656BTrLWgVrNf-KcwPPVcPjAeiQxwn53lay1LQ",
  "access_expires_at": "2026-10-29T16:01:21.649255319Z",
  "refresh_token": "dYnyJRVTJc697fWwiQE-bYwuhDc9qbzvzZVuQSxY_OE",
  "refresh_expires_at": "2026-11-28T15:46:21.64864977Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7c1e7776-7ac4-435f-a49a-0ba3e4093da2",
  "session_id": "3ea49b14-5c1e-4d45-9d3b-82d5d9e37358",
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
  "phone": "+380664772923",
  "device_ref": "sandbox-20926"
}
```

```json
{
  "challenge_id": "08ad4e11-c015-413a-8ac7-bcc792132a1b",
  "expires_at": "2026-10-29T15:51:22.205613082Z",
  "resend_available_at": "2026-10-29T15:46:23.205613082Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664772923` → **200**

```json
{
  "phone": "+380664772923",
  "audience": "CLIENT",
  "code": "674029",
  "sent_at": "2026-10-29T15:46:22.208621912Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "08ad4e11-c015-413a-8ac7-bcc792132a1b",
  "code": "674029",
  "device_ref": "sandbox-20926"
}
```

```json
{
  "session_id": "20bc0e27-73fd-4e3e-847d-0ea9c53ac4a3",
  "subject": {
    "type": "CLIENT",
    "id": "887c5bf7-b4fd-46ae-8a9a-e74065d36129"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODdjNWJmNy1iNGZkLTQ2YWUtOGE5YS1lNzQwNjVkMzYxMjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NjgyLCJpYXQiOjE3OTMyODg3ODIsImp0aSI6IjliMDk1NDFlLWRiNzUtNDExMi1hYjUyLWRlYzQ3MWVhOTQyYiIsInNpZCI6IjIwYmMwZTI3LTczZmQtNGUzZS04NDdkLTBlYTljNTNhYzRhMyJ9.ASHZpowTVKm079FqrMoq4xkoAI2ew4VvIZY3HhHKKf4",
  "access_expires_at": "2026-10-29T16:01:22.506947242Z",
  "refresh_token": "oLrE2iMY5eO0eyuqEL7UG-HLsCgJdOed7BJNv4rfs5w",
  "refresh_expires_at": "2026-11-28T15:46:22.506412916Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8dcd0eba-64e2-45cc-aed7-93aec05f9b86",
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
  "id": "e52885ba-980c-4950-a61e-9686be35f2c1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:51:22.786428Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 1d54e8e5-a9a5-418c-a936-14fbe7cd7a1a) → **201**

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
  "session_id": "83f9c8e9-c3ce-4f6d-ba0c-d29f05caee12",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk2ODMsImlhdCI6MTc5MzI4ODc4MywianRpIjoiNjA3NGZjOTUtODgwOS00MWYyLWIxNDktNzMwNDg0OTJlNWNhIiwic2lkIjoiODNmOWM4ZTktYzNjZS00ZjZkLWJhMGMtZDI5ZjA1Y2FlZTEyIn0.60DTiUJEHBAZLRGE8WbzSESvV5r1RJEz0bk50FJKYuY",
  "access_expires_at": "2026-10-29T16:01:23.426538879Z",
  "refresh_token": "qRWRaiAHvhewBH7NDXo0WilAxthFaNnOvD-JzHyYnL4",
  "refresh_expires_at": "2026-10-30T03:46:23.42594962Z",
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
  "session_id": "be7079f8-938d-4cc6-93d8-4a39b34a74db",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk2ODMsImlhdCI6MTc5MzI4ODc4MywianRpIjoiZDVkMWUxNTYtNjdhNy00ZjQ3LTg5YjEtZWMxZDIyNTlmNDk0Iiwic2lkIjoiYmU3MDc5ZjgtOTM4ZC00Y2M2LTkzZDgtNGEzOWIzNGE3NGRiIn0.Jj-SJeng2CjDTI0eQf8TCQWOLmBXLx8jknR43MAVXuQ",
  "access_expires_at": "2026-10-29T16:01:23.988416521Z",
  "refresh_token": "g8DF_f87_rLcQPPWpOk9Xsnmfc035PmGo5aWMHdwZpI",
  "refresh_expires_at": "2026-10-30T03:46:23.987866946Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/091a90de-51e5-426c-82d0-875d8bacdd4f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:46:23.094995Z",
      "actor": {
        "type": "CLIENT",
        "id": "887c5bf7-b4fd-46ae-8a9a-e74065d36129",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "091a90de-51e5-426c-82d0-875d8bacdd4f",
        "quote_id": "e52885ba-980c-4950-a61e-9686be35f2c1",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "1d54e8e5-a9a5-418c-a936-14fbe7cd7a1a"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:46:23.097432Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "091a90de-51e5-426c-82d0-875d8bacdd4f",
        "attempt_id": "0406b526-fffd-4b28-93c3-7057113bfed7",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "1d54e8e5-a9a5-418c-a936-14fbe7cd7a1a"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T15:46:23.10719Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "091a90de-51e5-426c-82d0-875d8bacdd4f",
        "attempt_id": "0406b526-fffd-4b28-93c3-7057113bfed7"
      },
      "correlation_id": "1d54e8e5-a9a5-418c-a936-14fbe7cd7a1a"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "0406b526-fffd-4b28-93c3-7057113bfed7",
        "generation": 1,
        "started_at": "2026-10-29T15:46:23.096362Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T15:46:23.10719Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T15:46:23.098203Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/1d54e8e5-a9a5-418c-a936-14fbe7cd7a1a` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "091a90de-51e5-426c-82d0-875d8bacdd4f:0",
      "order_id": "091a90de-51e5-426c-82d0-875d8bacdd4f",
      "at": "2026-10-29T15:46:23.094995Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "091a90de-51e5-426c-82d0-875d8bacdd4f:1",
      "order_id": "091a90de-51e5-426c-82d0-875d8bacdd4f",
      "at": "2026-10-29T15:46:23.097432Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "091a90de-51e5-426c-82d0-875d8bacdd4f:2",
      "order_id": "091a90de-51e5-426c-82d0-875d8bacdd4f",
      "at": "2026-10-29T15:46:23.10719Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/dec7c1ba-d241-4ec3-b81c-f40972203942` → **200**

```json
{
  "found": []
}
```

Done: request 1d54e8e5-a9a5-418c-a936-14fbe7cd7a1a — order 091a90de-51e5-426c-82d0-875d8bacdd4f found by its id.

`GET /api/rider/v1/orders/091a90de-51e5-426c-82d0-875d8bacdd4f` → **200**

```json
{
  "id": "091a90de-51e5-426c-82d0-875d8bacdd4f",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "887c5bf7-b4fd-46ae-8a9a-e74065d36129",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:46:23.094421Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/091a90de-51e5-426c-82d0-875d8bacdd4f/cancel` → **200**

```json
{
  "command_id": "cd2e184f-5066-4354-8a26-d74a9a0d84f7",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "091a90de-51e5-426c-82d0-875d8bacdd4f",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "887c5bf7-b4fd-46ae-8a9a-e74065d36129",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:46:23.094421Z",
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
  "phone": "+380638312055",
  "device_ref": "sandbox-7722"
}
```

```json
{
  "challenge_id": "091b0289-e65e-4da2-b027-63d612ada012",
  "expires_at": "2026-10-29T15:51:25.708377028Z",
  "resend_available_at": "2026-10-29T15:46:26.708377028Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638312055` → **200**

```json
{
  "phone": "+380638312055",
  "audience": "CLIENT",
  "code": "674924",
  "sent_at": "2026-10-29T15:46:25.71105419Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "091b0289-e65e-4da2-b027-63d612ada012",
  "code": "674924",
  "device_ref": "sandbox-7722"
}
```

```json
{
  "session_id": "9d480ff0-4766-4275-80fc-df9749670376",
  "subject": {
    "type": "CLIENT",
    "id": "0add5d47-55db-4b72-bf43-42904c6fc5e5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYWRkNWQ0Ny01NWRiLTRiNzItYmY0My00MjkwNGM2ZmM1ZTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5Njg2LCJpYXQiOjE3OTMyODg3ODYsImp0aSI6IjI4NjdkYWUxLWUxNjQtNDA2ZS1iN2I2LTVkZTI3NTE3M2FmNSIsInNpZCI6IjlkNDgwZmYwLTQ3NjYtNDI3NS04MGZjLWRmOTc0OTY3MDM3NiJ9.328Z09SqNYfSJwdtNBEIWFVOLlqa1V3nekJfObO81ac",
  "access_expires_at": "2026-10-29T16:01:26.004815715Z",
  "refresh_token": "vkD6ZJFuWj65yoiJGIYP5sZwvZ7lHqdjaSOLM7Dv8zY",
  "refresh_expires_at": "2026-11-28T15:46:26.00432479Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "5e36c66c-7db5-46a0-8217-281e314cc6a0",
  "expires_at": "2026-10-29T15:51:28.294302666Z",
  "resend_available_at": "2026-10-29T15:46:29.294302666Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638312055` → **200**

```json
{
  "phone": "+380638312055",
  "audience": "CLIENT",
  "code": "611836",
  "sent_at": "2026-10-29T15:46:28.297480444Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "d921d0fa-6f24-4fab-ad4d-dfc540bebef7",
  "challenge_id": "5e36c66c-7db5-46a0-8217-281e314cc6a0",
  "otp_code": "611836"
}
```

```json
{
  "id": "690fc588-6b17-4919-8e4f-db55b998cfe4",
  "state": "PENDING",
  "created_at": "2026-10-29T15:46:28.607839Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/690fc588-6b17-4919-8e4f-db55b998cfe4` → **200**

```json
{
  "id": "690fc588-6b17-4919-8e4f-db55b998cfe4",
  "state": "PENDING",
  "created_at": "2026-10-29T15:46:28.607839Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/690fc588-6b17-4919-8e4f-db55b998cfe4` → **200**

```json
{
  "id": "690fc588-6b17-4919-8e4f-db55b998cfe4",
  "state": "PENDING",
  "created_at": "2026-10-29T15:46:28.607839Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/690fc588-6b17-4919-8e4f-db55b998cfe4` → **200**

```json
{
  "id": "690fc588-6b17-4919-8e4f-db55b998cfe4",
  "state": "PENDING",
  "created_at": "2026-10-29T15:46:28.607839Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/690fc588-6b17-4919-8e4f-db55b998cfe4` → **200**

```json
{
  "id": "690fc588-6b17-4919-8e4f-db55b998cfe4",
  "state": "PENDING",
  "created_at": "2026-10-29T15:46:28.607839Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/690fc588-6b17-4919-8e4f-db55b998cfe4` → **200**

```json
{
  "id": "690fc588-6b17-4919-8e4f-db55b998cfe4",
  "state": "PENDING",
  "created_at": "2026-10-29T15:46:28.607839Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/690fc588-6b17-4919-8e4f-db55b998cfe4` → **200**

```json
{
  "id": "690fc588-6b17-4919-8e4f-db55b998cfe4",
  "state": "PENDING",
  "created_at": "2026-10-29T15:46:28.607839Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/690fc588-6b17-4919-8e4f-db55b998cfe4` → **200**

```json
{
  "id": "690fc588-6b17-4919-8e4f-db55b998cfe4",
  "state": "PENDING",
  "created_at": "2026-10-29T15:46:28.607839Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/690fc588-6b17-4919-8e4f-db55b998cfe4` → **200**

```json
{
  "id": "690fc588-6b17-4919-8e4f-db55b998cfe4",
  "state": "READY",
  "created_at": "2026-10-29T15:46:28.607839Z",
  "ready_at": "2026-10-29T15:46:37.774271Z",
  "expires_at": "2026-11-05T15:46:37.774271Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/690fc588-6b17-4919-8e4f-db55b998cfe4/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639865735",
  "device_ref": "sandbox-12137"
}
```

```json
{
  "challenge_id": "d792f233-947c-43e5-bb24-b6e47d3619e5",
  "expires_at": "2026-10-29T15:51:38.087066486Z",
  "resend_available_at": "2026-10-29T15:46:39.087066486Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639865735` → **200**

```json
{
  "phone": "+380639865735",
  "audience": "CLIENT",
  "code": "524520",
  "sent_at": "2026-10-29T15:46:38.089809694Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d792f233-947c-43e5-bb24-b6e47d3619e5",
  "code": "524520",
  "device_ref": "sandbox-12137"
}
```

```json
{
  "session_id": "47472982-499b-4af6-a090-0b339979ac2a",
  "subject": {
    "type": "CLIENT",
    "id": "b4ac8e60-31cd-4c55-875d-e5988c16cd5a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNGFjOGU2MC0zMWNkLTRjNTUtODc1ZC1lNTk4OGMxNmNkNWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5Njk4LCJpYXQiOjE3OTMyODg3OTgsImp0aSI6IjdkZDFjMGE5LWY2NmUtNDUwYS1hNjAwLTRiZDBiYjBmYTFkMCIsInNpZCI6IjQ3NDcyOTgyLTQ5OWItNGFmNi1hMDkwLTBiMzM5OTc5YWMyYSJ9.n-67XJLAUYCuIN-CsOlkFwAculT7lF24X8ywCwvYVYI",
  "access_expires_at": "2026-10-29T16:01:38.395380055Z",
  "refresh_token": "o6Da3FKhIbuDVG6hXEbA1hIif9u5eb4HHnBD3Ybcg84",
  "refresh_expires_at": "2026-11-28T15:46:38.394868391Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/690fc588-6b17-4919-8e4f-db55b998cfe4/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/690fc588-6b17-4919-8e4f-db55b998cfe4/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "442acc14-5828-4779-bd61-95e5181062c1"
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
  "session_id": "8871072a-f49e-458b-bd95-fb5809c51308",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk2OTksImlhdCI6MTc5MzI4ODc5OSwianRpIjoiOWFjNjMxNjktMzI4OS00MTZmLWFmYTAtNDRjZTU0YzYxOWEwIiwic2lkIjoiODg3MTA3MmEtZjQ5ZS00NThiLWJkOTUtZmI1ODA5YzUxMzA4In0.6rF03LVaMgySOzmouGt4AKYh_Eyv_ZdVcAOXyIrDz6E",
  "access_expires_at": "2026-10-29T16:01:39.243836151Z",
  "refresh_token": "NOAFf_ePDMLx6bj8icjZySuvLDqfzIcgDMuonjyhyoQ",
  "refresh_expires_at": "2026-10-30T03:46:39.243345646Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0add5d47-55db-4b72-bf43-42904c6fc5e5",
  "session_id": "9d480ff0-4766-4275-80fc-df9749670376",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/0add5d47-55db-4b72-bf43-42904c6fc5e5/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "690fc588-6b17-4919-8e4f-db55b998cfe4",
      "state": "READY",
      "created_at": "2026-10-29T15:46:28.607839Z",
      "ready_at": "2026-10-29T15:46:37.774271Z",
      "expires_at": "2026-11-05T15:46:37.774271Z",
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
  "device_ref": "sandbox-249"
}
```

```json
{
  "challenge_id": "40cfbac1-da96-4552-ae07-1694489d0de2",
  "expires_at": "2026-10-29T15:51:40.07133451Z",
  "resend_available_at": "2026-10-29T15:46:41.07133451Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "330658",
  "sent_at": "2026-10-29T15:46:40.073767073Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "40cfbac1-da96-4552-ae07-1694489d0de2",
  "code": "330658",
  "device_ref": "sandbox-249"
}
```

```json
{
  "session_id": "ee2eab94-ef9d-4d1b-a4e8-683a7d43dae4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTcwMCwiaWF0IjoxNzkzMjg4ODAwLCJqdGkiOiIxMjA5M2U0Ni00OTNiLTRmNzMtOGZiYy0yNzYwM2RhMjg2NjIiLCJzaWQiOiJlZTJlYWI5NC1lZjlkLTRkMWItYTRlOC02ODNhN2Q0M2RhZTQifQ.Gp4kPxYRmB39JfJZQHB8gpFmOMWy5JPNAIVSgZdjLxQ",
  "access_expires_at": "2026-10-29T16:01:40.384297642Z",
  "refresh_token": "_SwJ7-zf_u0IqTP2JdFPhFxtyBBn9x0sD3X4p84_2ig",
  "refresh_expires_at": "2026-11-28T15:46:40.383766321Z",
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
  "device_ref": "sandbox-13608"
}
```

```json
{
  "challenge_id": "7149191c-9ae6-4bfa-a947-627d7abd7fba",
  "expires_at": "2026-10-29T15:51:40.921326875Z",
  "resend_available_at": "2026-10-29T15:46:41.921326875Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "199412",
  "sent_at": "2026-10-29T15:46:40.923981415Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7149191c-9ae6-4bfa-a947-627d7abd7fba",
  "code": "199412",
  "device_ref": "sandbox-13608"
}
```

```json
{
  "session_id": "721b9935-a233-444a-80f4-80fb3b7cb346",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTcwMSwiaWF0IjoxNzkzMjg4ODAxLCJqdGkiOiIyZTBmZDBhZS05ZDY4LTRlYTItYmVhMS1kMjQ2OWE4MjBjNzciLCJzaWQiOiI3MjFiOTkzNS1hMjMzLTQ0NGEtODBmNC04MGZiM2I3Y2IzNDYifQ.3eJJ0Py-4HYWFcqRWm2vhBZusQ4pDLPq_YIUNBqH-KI",
  "access_expires_at": "2026-10-29T16:01:41.244136549Z",
  "refresh_token": "nMuaU7hqFm-AfTemd8MtpTIDAhnz1viQC1AJaQKrK6s",
  "refresh_expires_at": "2026-11-28T15:46:41.243605879Z",
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
  "command_id": "8cc7672b-1bae-4ea5-b174-107e67593098",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:46:41Z",
    "sequence": 1793288801797
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2467a1db-bedc-4c3a-9530-8de3143f94d5",
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
  "last_heartbeat_at": "2026-10-29T15:46:41.815667Z",
  "last_location_at": "2026-10-29T15:46:41.815667Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-30994"
}
```

```json
{
  "challenge_id": "721af976-d3b8-4dc5-aa48-a93717ce92e6",
  "expires_at": "2026-10-29T15:51:42.098067398Z",
  "resend_available_at": "2026-10-29T15:46:43.098067398Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "870370",
  "sent_at": "2026-10-29T15:46:42.101106666Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "721af976-d3b8-4dc5-aa48-a93717ce92e6",
  "code": "870370",
  "device_ref": "sandbox-30994"
}
```

```json
{
  "session_id": "a4ed3f82-e44f-4ae8-9667-d81d0fd388de",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTcwMiwiaWF0IjoxNzkzMjg4ODAyLCJqdGkiOiJmZjI4MzE4Yi01YTg3LTQwMjgtODcwMi02YTRhMmNhNDRiMjkiLCJzaWQiOiJhNGVkM2Y4Mi1lNDRmLTRhZTgtOTY2Ny1kODFkMGZkMzg4ZGUifQ.fi2A-l7aYuZB7nmXaTGpJV_7TDW0oiKJk1l4_SJc_qQ",
  "access_expires_at": "2026-10-29T16:01:42.397049067Z",
  "refresh_token": "g50Nq3bSLMkiZ4gnlgrOWkZ3CmndvQJsxB0bgumWR40",
  "refresh_expires_at": "2026-11-28T15:46:42.396563842Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b816927b-6b8e-40b8-aa9b-b6af57dfba87",
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
  "last_heartbeat_at": "2026-10-29T15:45:04.54588Z",
  "last_location_at": "2026-10-29T15:45:04.54588Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b816927b-6b8e-40b8-aa9b-b6af57dfba87/handover` → **200**

```json
{
  "command_id": "475d1597-9b1c-4b09-9e80-ac453e582198",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b816927b-6b8e-40b8-aa9b-b6af57dfba87",
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
  "last_heartbeat_at": "2026-10-29T15:45:04.54588Z",
  "last_location_at": "2026-10-29T15:45:04.54588Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b816927b-6b8e-40b8-aa9b-b6af57dfba87/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:46:43Z",
    "sequence": 1793288803223
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b816927b-6b8e-40b8-aa9b-b6af57dfba87",
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
  "last_heartbeat_at": "2026-10-29T15:46:43.241629Z",
  "last_location_at": "2026-10-29T15:46:43.241629Z",
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
  "session_id": "026401d8-b5b3-4b3a-8f70-082068ce518f",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk3MDMsImlhdCI6MTc5MzI4ODgwMywianRpIjoiYjRlMjI1ZWUtNmM3Yi00Njk1LTkyOWYtMzA4OTZhMDg1NzMzIiwic2lkIjoiMDI2NDAxZDgtYjViMy00YjNhLThmNzAtMDgyMDY4Y2U1MThmIn0.iqTGMD7G6E8mLV263y1CjYgLNq2w_x5xPxhDhtmB4Ig",
  "access_expires_at": "2026-10-29T16:01:43.814958878Z",
  "refresh_token": "jehku8987MeM17ewjAqCBwEW7FQOqvKPdPCtofgS3nw",
  "refresh_expires_at": "2026-10-30T03:46:43.814427966Z",
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
  "session_id": "82a353d9-5916-496b-8a3a-a6b881fa023c",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk3MDQsImlhdCI6MTc5MzI4ODgwNCwianRpIjoiOWJiNjgxYTEtYzRkNC00MTI5LWEwODQtNjMwNTA2YzI5NzY3Iiwic2lkIjoiODJhMzUzZDktNTkxNi00OTZiLThhM2EtYTZiODgxZmEwMjNjIn0.M8Gh1oGuhCUDjVbqCni5CTKY_Xzh7fCoUbaBg3rPafw",
  "access_expires_at": "2026-10-29T16:01:44.390516625Z",
  "refresh_token": "ZNxtNy8BCr4LfMaRz8bA0E-eEXDHONetjttZt67IkAM",
  "refresh_expires_at": "2026-10-30T03:46:44.3899505Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380686325687",
  "device_ref": "sandbox-24832"
}
```

```json
{
  "challenge_id": "37d78534-6b00-41eb-8592-8f9131504942",
  "expires_at": "2026-10-29T15:51:44.669493136Z",
  "resend_available_at": "2026-10-29T15:46:45.669493136Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380686325687` → **200**

```json
{
  "phone": "+380686325687",
  "audience": "CLIENT",
  "code": "238945",
  "sent_at": "2026-10-29T15:46:44.672282418Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "37d78534-6b00-41eb-8592-8f9131504942",
  "code": "238945",
  "device_ref": "sandbox-24832"
}
```

```json
{
  "session_id": "765a8062-6b68-4e88-a393-2ad70f1a1138",
  "subject": {
    "type": "CLIENT",
    "id": "0b3f1ec8-33c9-4ca0-b4fa-3dee3856723e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYjNmMWVjOC0zM2M5LTRjYTAtYjRmYS0zZGVlMzg1NjcyM2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NzA0LCJpYXQiOjE3OTMyODg4MDQsImp0aSI6IjZiOWE2ZWE1LTYxZDAtNGU3Mi04ZDJkLTg3NmM3YzBjNzlmYSIsInNpZCI6Ijc2NWE4MDYyLTZiNjgtNGU4OC1hMzkzLTJhZDcwZjFhMTEzOCJ9.Wwh_Dy3Yh_A0_90FcDbGEyvHAKdFw-F7PTZsNXFLGQI",
  "access_expires_at": "2026-10-29T16:01:44.967223783Z",
  "refresh_token": "IX3ivuJWCRPjDIKV3z0mMCbrEoEGIm8Wznlmq_iZEbQ",
  "refresh_expires_at": "2026-11-28T15:46:44.96673916Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0e901e6a-a3e9-4b1a-8959-9fe28d6b6acf",
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
  "id": "2d145c7b-2739-4532-bfce-794dce1f9b7b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:51:45.253362Z",
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
  "command_id": "6f5f820b-3c72-4bfe-9220-5a507ca7234f",
  "quote_id": "2d145c7b-2739-4532-bfce-794dce1f9b7b",
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
  "id": "dd38e65c-b889-4cdb-a990-e3e82767aa27",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0b3f1ec8-33c9-4ca0-b4fa-3dee3856723e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:46:45.551531Z",
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
    "id": "0c72aaff-b7b1-4950-a5ab-85e9a9b6b41a",
    "order_id": "dd38e65c-b889-4cdb-a990-e3e82767aa27",
    "expires_at": "2026-10-29T15:47:00.554768Z",
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

`POST /api/driver/v1/offers/0c72aaff-b7b1-4950-a5ab-85e9a9b6b41a/reject` → **204**

```json
{
  "command_id": "798313ec-98ac-48a5-9fdb-47f44e31125c"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "535b5556-6fd1-4618-9fb8-59905981ad26",
    "order_id": "dd38e65c-b889-4cdb-a990-e3e82767aa27",
    "expires_at": "2026-10-29T15:47:01.127992Z",
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

`POST /api/driver/v1/offers/535b5556-6fd1-4618-9fb8-59905981ad26/accept` → **200**

```json
{
  "command_id": "a0095f99-3129-4e72-99fd-1ea9ff8fe178"
}
```

```json
{
  "id": "b35f234d-4c62-4c0c-9893-caab098519f0",
  "order_id": "dd38e65c-b889-4cdb-a990-e3e82767aa27",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "34f832ae-59b6-4ea1-8620-71bc966e9f3c",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/dd38e65c-b889-4cdb-a990-e3e82767aa27/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:46:45.551989Z",
      "actor": {
        "type": "CLIENT",
        "id": "0b3f1ec8-33c9-4ca0-b4fa-3dee3856723e",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "dd38e65c-b889-4cdb-a990-e3e82767aa27",
        "quote_id": "2d145c7b-2739-4532-bfce-794dce1f9b7b",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "b43c06fe-b928-4b20-b0a5-3d008bbfa6ac"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:46:45.55397Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "dd38e65c-b889-4cdb-a990-e3e82767aa27",
        "attempt_id": "4890e01c-c809-4ab8-a778-146137434210",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b43c06fe-b928-4b20-b0a5-3d008bbfa6ac"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T15:46:45.560163Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "0c72aaff-b7b1-4950-a5ab-85e9a9b6b41a",
        "order_id": "dd38e65c-b889-4cdb-a990-e3e82767aa27",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "b43c06fe-b928-4b20-b0a5-3d008bbfa6ac"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T15:46:46.127001Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "0c72aaff-b7b1-4950-a5ab-85e9a9b6b41a",
        "order_id": "dd38e65c-b889-4cdb-a990-e3e82767aa27"
      },
      "correlation_id": "608f3ef3-fdd7-47fe-bd93-ac1e49ce8774"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order dd38e65c-b889-4cdb-a990-e3e82767aa27 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/dd38e65c-b889-4cdb-a990-e3e82767aa27` → **200**

```json
{
  "id": "dd38e65c-b889-4cdb-a990-e3e82767aa27",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "0b3f1ec8-33c9-4ca0-b4fa-3dee3856723e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "b35f234d-4c62-4c0c-9893-caab098519f0",
    "order_id": "dd38e65c-b889-4cdb-a990-e3e82767aa27",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "34f832ae-59b6-4ea1-8620-71bc966e9f3c",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T15:46:45.551531Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/dd38e65c-b889-4cdb-a990-e3e82767aa27/cancel` → **200**

```json
{
  "command_id": "2bd9a55b-8675-4978-a275-675fa02b7123",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "dd38e65c-b889-4cdb-a990-e3e82767aa27",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "0b3f1ec8-33c9-4ca0-b4fa-3dee3856723e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "b35f234d-4c62-4c0c-9893-caab098519f0",
    "order_id": "dd38e65c-b889-4cdb-a990-e3e82767aa27",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "34f832ae-59b6-4ea1-8620-71bc966e9f3c",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T15:46:45.551531Z",
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
  "session_id": "2467a1db-bedc-4c3a-9530-8de3143f94d5",
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
  "last_heartbeat_at": "2026-10-29T15:46:41.815667Z",
  "last_location_at": "2026-10-29T15:46:41.815667Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2467a1db-bedc-4c3a-9530-8de3143f94d5/close` → **200**

```json
{
  "command_id": "2edca093-c130-4515-b512-aba2883bc95c",
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
  "session_id": "b816927b-6b8e-40b8-aa9b-b6af57dfba87",
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
  "last_heartbeat_at": "2026-10-29T15:46:43.241629Z",
  "last_location_at": "2026-10-29T15:46:43.241629Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b816927b-6b8e-40b8-aa9b-b6af57dfba87/close` → **200**

```json
{
  "command_id": "ef3a8edd-bb52-479b-b4b3-d4d78559f9c4",
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
  "session_id": "0d5e1b06-6dc1-4a0b-bb7f-13ea835950eb",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk3MDksImlhdCI6MTc5MzI4ODgwOSwianRpIjoiYmIyNTY1NTUtMTI4Mi00ODlmLTgyYTQtNTY1MTQwNjNlNWM1Iiwic2lkIjoiMGQ1ZTFiMDYtNmRjMS00YTBiLWJiN2YtMTNlYTgzNTk1MGViIn0.GK_ya8dBVCeqdJDqi00MRXgjEqJIlIppVN48qJc4Ggc",
  "access_expires_at": "2026-10-29T16:01:49.109504415Z",
  "refresh_token": "ih0jGDVdBDMiKiFzSz4970Gvt7VClqw8aO5m0Ad-Sx8",
  "refresh_expires_at": "2026-10-30T03:46:49.10893348Z",
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
  "command_id": "58b6b554-a839-47d1-a8c3-364846fca56d",
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
  "changed_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T15:46:49.683898Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "412dec86-dc7d-4cfa-9feb-88948d54ed53",
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
  "correlation_id": "b8e682bf-f917-4f78-8919-46dfccc54e79"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "b24d0792-046b-4467-80a4-0ecdb5491d00",
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
  "correlation_id": "471ac04b-7978-4b8d-a3ad-3677c624dba9"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633645894",
  "device_ref": "sandbox-11717"
}
```

```json
{
  "challenge_id": "58d84d75-6f61-4039-af28-5ec903fdb02e",
  "expires_at": "2026-10-29T15:51:50.525483426Z",
  "resend_available_at": "2026-10-29T15:46:51.525483426Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633645894` → **200**

```json
{
  "phone": "+380633645894",
  "audience": "CLIENT",
  "code": "987602",
  "sent_at": "2026-10-29T15:46:50.528048569Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "58d84d75-6f61-4039-af28-5ec903fdb02e",
  "code": "987602",
  "device_ref": "sandbox-11717"
}
```

```json
{
  "session_id": "9f4b325a-14e5-4ff8-98ce-8768df9b779d",
  "subject": {
    "type": "CLIENT",
    "id": "b3fb704a-c3cd-407e-8533-656e84e98f31"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiM2ZiNzA0YS1jM2NkLTQwN2UtODUzMy02NTZlODRlOThmMzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NzEwLCJpYXQiOjE3OTMyODg4MTAsImp0aSI6IjkxN2I2Njk2LWNmNzMtNDRkNC1hOGExLWFjZTIyZTA0NzA1MCIsInNpZCI6IjlmNGIzMjVhLTE0ZTUtNGZmOC05OGNlLTg3NjhkZjliNzc5ZCJ9.1QqPwaFZ-ozTX-_nuJXWulq721EPrEikjjjfMgHiBMo",
  "access_expires_at": "2026-10-29T16:01:50.825505151Z",
  "refresh_token": "NfmLj-NxHSRJepojeu2RT3oJT-4j0OsJ04EJwpZm5m4",
  "refresh_expires_at": "2026-11-28T15:46:50.824887907Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "22f2e77a-b70a-4098-bc13-17a86154e645",
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
  "id": "783b8b8c-2aa2-4eb3-af5e-08f62813e0c7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:51:51.104707Z",
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
  "command_id": "b56ba69a-a997-4d3f-9e96-7b6857c268a6",
  "quote_id": "783b8b8c-2aa2-4eb3-af5e-08f62813e0c7",
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
  "correlation_id": "277970c8-5a80-4341-becd-37d55812ca1f"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "2fd90ff1-a5f9-4fad-818d-1a749edb88dd",
  "quote_id": "783b8b8c-2aa2-4eb3-af5e-08f62813e0c7",
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
  "id": "3b31e4de-1f66-427a-a641-8a6c7b24d37e",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b3fb704a-c3cd-407e-8533-656e84e98f31",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:46:51.694813Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3b31e4de-1f66-427a-a641-8a6c7b24d37e/cancel` → **200**

```json
{
  "command_id": "cfb7d1d3-a167-42b2-9cc0-1f2bfe156fca",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3b31e4de-1f66-427a-a641-8a6c7b24d37e",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b3fb704a-c3cd-407e-8533-656e84e98f31",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:46:51.694813Z",
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
  "command_id": "5558a49c-fe9c-4955-8ff1-7f1e8ef85ee9",
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
  "changed_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T15:46:52.318288Z"
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
      "changed_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T15:46:52.318288Z"
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
  "device_ref": "sandbox-14518"
}
```

```json
{
  "challenge_id": "fa843a5d-2449-4f16-8df2-b0cdf9ca7535",
  "expires_at": "2026-10-29T15:51:53.173783271Z",
  "resend_available_at": "2026-10-29T15:46:54.173783271Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "359882",
  "sent_at": "2026-10-29T15:46:53.176538809Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fa843a5d-2449-4f16-8df2-b0cdf9ca7535",
  "code": "359882",
  "device_ref": "sandbox-14518"
}
```

```json
{
  "session_id": "a25c851a-5ea1-45ee-92ec-653ab840a106",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTcxMywiaWF0IjoxNzkzMjg4ODEzLCJqdGkiOiJjMGFlYjZhOS04OGIzLTRhNWUtOTZlMC04NmQxMjAxNjA4MTkiLCJzaWQiOiJhMjVjODUxYS01ZWExLTQ1ZWUtOTJlYy02NTNhYjg0MGExMDYifQ.vtUMe7GVBauDA6WvxEPqvpcYdnyiAGRN-UFInVNiJAc",
  "access_expires_at": "2026-10-29T16:01:53.471368766Z",
  "refresh_token": "b8muF3eCfauwFmmcm3XYbVc_uKyWm3NMSdOefmgurtI",
  "refresh_expires_at": "2026-11-28T15:46:53.470793644Z",
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
  "command_id": "76d8984e-69d4-46ed-9f8d-deaad1ac709c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:46:54Z",
    "sequence": 1793288814258
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "86499646-4c02-4cec-8387-cd4f95a517e8",
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
  "last_heartbeat_at": "2026-10-29T15:46:54.043617Z",
  "last_location_at": "2026-10-29T15:46:54.043617Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679390202",
  "device_ref": "sandbox-2543"
}
```

```json
{
  "challenge_id": "1c9c7da2-eb81-4ea3-8fc9-f3c9f95ee82f",
  "expires_at": "2026-10-29T15:51:54.321844579Z",
  "resend_available_at": "2026-10-29T15:46:55.321844579Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679390202` → **200**

```json
{
  "phone": "+380679390202",
  "audience": "CLIENT",
  "code": "060309",
  "sent_at": "2026-10-29T15:46:54.324738595Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1c9c7da2-eb81-4ea3-8fc9-f3c9f95ee82f",
  "code": "060309",
  "device_ref": "sandbox-2543"
}
```

```json
{
  "session_id": "752c9d4b-30c6-4860-a061-234752bae735",
  "subject": {
    "type": "CLIENT",
    "id": "40378a85-2568-4db5-88df-6328adab20ef"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MDM3OGE4NS0yNTY4LTRkYjUtODhkZi02MzI4YWRhYjIwZWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NzE0LCJpYXQiOjE3OTMyODg4MTQsImp0aSI6ImYwM2Y4NTI2LWRiOWEtNDk4YS1iYzM2LTMxMzlmOGZjNmI0ZSIsInNpZCI6Ijc1MmM5ZDRiLTMwYzYtNDg2MC1hMDYxLTIzNDc1MmJhZTczNSJ9._EECOQJvcXRy3eZSYju9tJqx6BwPix8DPuvyBKRoUhc",
  "access_expires_at": "2026-10-29T16:01:54.625259135Z",
  "refresh_token": "y_IDpFW7bHfNv973hs20hpLP7FAu0ElSvKqW-WmIN78",
  "refresh_expires_at": "2026-11-28T15:46:54.624765244Z",
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
  "command_id": "1ba9d416-3647-4dda-9d40-1b6a2c45fe81",
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
  "id": "43228084-32fb-45a7-bae0-3c3214e052c7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:51:55.191994Z",
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
  "command_id": "9f27a22b-9ad9-4d59-a8f1-ece7748c41da",
  "platform": "ANDROID",
  "token": "sandbox-driver-06bfdb72-689a-4328-809b-68c4179a5457"
}
```

```json
{
  "id": "272a9bfc-a9d9-4d4c-9bcd-146642b30536",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T15:46:55.489985Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "d8503151-265a-4c82-8814-560f8bdf0a3e",
  "platform": "ANDROID",
  "token": "sandbox-rider-8eafabdc-a2e7-47c8-b0be-a0e33255ff02"
}
```

```json
{
  "id": "70e0abf6-6ab6-44ea-9b9e-118d52c13a6e",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T15:46:55.779032Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "1c567c3a-c59f-44fa-9dfa-cbc454387a73",
  "quote_id": "43228084-32fb-45a7-bae0-3c3214e052c7",
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
  "id": "0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "40378a85-2568-4db5-88df-6328adab20ef",
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
  "created_at": "2026-10-29T15:46:56.075329Z",
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
    "id": "7cb00736-0f3b-4868-990d-a87376808890",
    "order_id": "0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790",
    "expires_at": "2026-10-29T15:47:11.078485Z",
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

`POST /api/driver/v1/offers/7cb00736-0f3b-4868-990d-a87376808890/accept` → **200**

```json
{
  "command_id": "3db8ae02-3799-4c83-afd7-4d17f631f063"
}
```

```json
{
  "id": "8ed3c8ad-59d4-4b0c-9fb6-56d2096cfd79",
  "order_id": "0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "632b8afa-9b5b-4fd0-a60c-cfa4716901af",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T15:46:56.514Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T15:46:56.514Z` → **200**

```json
[
  {
    "at": "2026-10-29T15:46:57.332939171Z",
    "token_suffix": "9a5457",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790",
      "order_version": "2",
      "event_id": "414170f2-ce3c-4e6b-8750-ccc86202c59a"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380679390202&after=2026-10-29T15:46:56.514Z` → **200**

```json
[
  {
    "at": "2026-10-29T15:46:57.330200455Z",
    "token_suffix": "55ff02",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790",
      "order_version": "3",
      "event_id": "188749d5-c532-45ac-8010-6ef620a60b4a"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790/messages` → **201**

```json
{
  "command_id": "22249e37-fe67-4356-b60a-e98d8cbf48d2",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "fd068073-58ae-431d-84f5-c1071bfbaba9",
  "order_id": "0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T15:46:58.06045836Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "632b8afa-9b5b-4fd0-a60c-cfa4716901af",
  "order_id": "0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790",
  "assignment_id": "8ed3c8ad-59d4-4b0c-9fb6-56d2096cfd79",
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

`POST /api/driver/v1/trips/632b8afa-9b5b-4fd0-a60c-cfa4716901af/messages` → **201**

```json
{
  "command_id": "46b6bf73-b28e-4c75-ad37-e9efafe7b36f",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "97bb0013-895c-4806-b1f4-e90c95fe12ca",
  "order_id": "0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T15:46:58.618925209Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/632b8afa-9b5b-4fd0-a60c-cfa4716901af/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380679390202"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/86499646-4c02-4cec-8387-cd4f95a517e8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:46:59Z",
    "sequence": 1793288819429
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "86499646-4c02-4cec-8387-cd4f95a517e8",
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
  "last_heartbeat_at": "2026-10-29T15:46:59.447199Z",
  "last_location_at": "2026-10-29T15:46:59.447199Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "632b8afa-9b5b-4fd0-a60c-cfa4716901af",
  "order_id": "0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790",
  "assignment_id": "8ed3c8ad-59d4-4b0c-9fb6-56d2096cfd79",
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

`POST /api/driver/v1/trips/632b8afa-9b5b-4fd0-a60c-cfa4716901af/arrive` → **200**

```json
{
  "command_id": "bea9c4e6-a7aa-4f3f-9a66-51dad3dcfcbd",
  "expected_version": 0
}
```

```json
{
  "id": "632b8afa-9b5b-4fd0-a60c-cfa4716901af",
  "order_id": "0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790",
  "assignment_id": "8ed3c8ad-59d4-4b0c-9fb6-56d2096cfd79",
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
  "arrived_at": "2026-10-29T15:46:59.990106Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/632b8afa-9b5b-4fd0-a60c-cfa4716901af/start` → **200**

```json
{
  "command_id": "68ca60c8-8db1-4b28-b89f-395ec24b72ee",
  "expected_version": 1
}
```

```json
{
  "id": "632b8afa-9b5b-4fd0-a60c-cfa4716901af",
  "order_id": "0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790",
  "assignment_id": "8ed3c8ad-59d4-4b0c-9fb6-56d2096cfd79",
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
  "arrived_at": "2026-10-29T15:46:59.990106Z",
  "started_at": "2026-10-29T15:47:00.27947Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/86499646-4c02-4cec-8387-cd4f95a517e8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:47:00Z",
    "sequence": 1793288820559
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "86499646-4c02-4cec-8387-cd4f95a517e8",
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
  "last_heartbeat_at": "2026-10-29T15:47:00.577668Z",
  "last_location_at": "2026-10-29T15:47:00.577668Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/632b8afa-9b5b-4fd0-a60c-cfa4716901af/complete` → **200**

```json
{
  "command_id": "1b9057d4-1ff7-4a15-a5eb-57b9ebbab04b",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:47:00Z",
  "cash_received": true
}
```

```json
{
  "id": "632b8afa-9b5b-4fd0-a60c-cfa4716901af",
  "order_id": "0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790",
  "assignment_id": "8ed3c8ad-59d4-4b0c-9fb6-56d2096cfd79",
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
  "arrived_at": "2026-10-29T15:46:59.990106Z",
  "started_at": "2026-10-29T15:47:00.27947Z",
  "completed_at": "2026-10-29T15:47:00.864137Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790` → **200**

```json
{
  "id": "0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "40378a85-2568-4db5-88df-6328adab20ef",
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
    "id": "8ed3c8ad-59d4-4b0c-9fb6-56d2096cfd79",
    "order_id": "0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "632b8afa-9b5b-4fd0-a60c-cfa4716901af",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:46:56.075329Z",
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
    "id": "0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-29T15:46:56.075329Z",
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
    "id": "632b8afa-9b5b-4fd0-a60c-cfa4716901af",
    "order_id": "0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790",
    "order_short_number": 13,
    "created_at": "2026-10-29T15:46:56.680051Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "304ce038-9fdf-4096-8fe4-acc42efcf7d7",
    "order_id": "a716eb6c-3360-4c32-9c59-0d9e43404644",
    "order_short_number": 8,
    "created_at": "2026-10-29T15:45:40.779933Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "8855fcf7-264e-41b5-8e8d-4c701a134515",
    "order_id": "5ba2eae1-51f5-47f4-a055-37b6c0729c03",
    "order_short_number": 3,
    "created_at": "2026-10-29T15:44:53.262567Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "45651710-4783-43bb-bb6a-81a5e92ca12b",
    "order_id": "eaebb15b-63b6-42c2-84a9-bd35c7463b37",
    "order_short_number": 2,
    "created_at": "2026-10-29T15:44:34.137343Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "425f5fbc-ecb9-4c81-a51d-e73660e7d973",
    "order_id": "f1c234ec-2212-4df0-a4be-9ae2bf57cd64",
    "order_short_number": 1,
    "created_at": "2026-10-29T15:44:24.541759Z",
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

`GET /api/rider/v1/orders/0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790/tip` → **200**

```json
{
  "order_id": "0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790",
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
  "available_until": "2026-10-30T15:47:00.864137Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790/tip` → **201**

```json
{
  "command_id": "df1d7ef6-cdd7-484a-aa88-a30d4a7949a4",
  "amount_minor": 1100
}
```

```json
{
  "id": "b59a0caa-7aba-4e86-abd3-527887e95ecd",
  "order_id": "0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T15:47:05.889502Z"
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
  "session_id": "db614845-1e4c-4c6d-99d5-8ae272bb2cf7",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk3MjYsImlhdCI6MTc5MzI4ODgyNiwianRpIjoiNGU2MDZiNzYtZDY0Yy00MmRkLWE2YzctOTI1MGI4MjlhYmI1Iiwic2lkIjoiZGI2MTQ4NDUtMWU0Yy00YzZkLTk5ZDUtOGFlMjcyYmIyY2Y3In0.SwTps0rPicba6ldzStxW2dDlYGd-FHROe_6uhrgGwDE",
  "access_expires_at": "2026-10-29T16:02:06.461941134Z",
  "refresh_token": "c2uClVh31ZRi8nub-6vfusLX1ciHtxNKOMyoZPo1Bgw",
  "refresh_expires_at": "2026-10-30T03:47:06.461417377Z",
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
      "APP": 12,
      "PHONE": 1
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
  "generated_at": "2026-10-29T15:47:06.754161752Z"
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
  "generated_at": "2026-10-29T15:47:07.032846865Z"
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
  "session_id": "e19571c8-afd6-46c5-800e-4abe00c0d480",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk3MjcsImlhdCI6MTc5MzI4ODgyNywianRpIjoiNjAzZDQ1NjMtNTc0Mi00OTJlLTg0Y2ItOWVhNTU3N2MyNmU2Iiwic2lkIjoiZTE5NTcxYzgtYWZkNi00NmM1LTgwMGUtNGFiZTAwYzBkNDgwIn0.p_lgEPPH-UgyNczovSRMQUPXOncBxUJ67iBzanM9fh8",
  "access_expires_at": "2026-10-29T16:02:07.614443323Z",
  "refresh_token": "DckdvBH0J1_uNArev4C6bOma1VhAzzXURoWGh0YWB2s",
  "refresh_expires_at": "2026-10-30T03:47:07.613877608Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:46:56.075782Z",
      "actor": {
        "type": "CLIENT",
        "id": "40378a85-2568-4db5-88df-6328adab20ef",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790",
        "quote_id": "43228084-32fb-45a7-bae0-3c3214e052c7",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "07f7d6b1-f92a-4a2b-a4c4-165f92f9edc5"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:46:56.077761Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790",
        "attempt_id": "87fe292f-c857-4b61-91bb-236fc7b44df3",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "07f7d6b1-f92a-4a2b-a4c4-165f92f9edc5"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T15:46:56.08058Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "7cb00736-0f3b-4868-990d-a87376808890",
        "order_id": "0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "07f7d6b1-f92a-4a2b-a4c4-165f92f9edc5"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T15:46:56.681689Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "7cb00736-0f3b-4868-990d-a87376808890",
        "order_id": "0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "8ed3c8ad-59d4-4b0c-9fb6-56d2096cfd79"
      },
      "correlation_id": "db8cb316-e13c-478c-95ec-26cfb8b9b555"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T15:47:08.197508873Z",
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
      "last_location_at": "2026-10-29T15:47:00.577668Z",
      "order_id": null
    }
  ]
}
```

Done: order 0cd6d2bd-bf75-40f8-957d-5eb0bbfe0790.

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
  "session_id": "6eb50c97-b974-4bbd-931d-9f9f163c1e8e",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk3MjgsImlhdCI6MTc5MzI4ODgyOCwianRpIjoiNjRlY2ZiYjctMDM4Zi00MzI1LWIxMjQtMDhiNGVhNzc4MDViIiwic2lkIjoiNmViNTBjOTctYjk3NC00YmJkLTkzMWQtOWY5ZjE2M2MxZThlIn0.0nLPjtszqCRwYppCuk-YCpfZq8e2d3kn8V35_tHRrsM",
  "access_expires_at": "2026-10-29T16:02:08.788071707Z",
  "refresh_token": "maroWhsfksYx1ibJle98oTB4U5ZTzxXWLzEYPdTEPUc",
  "refresh_expires_at": "2026-10-30T03:47:08.787543935Z",
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
  "command_id": "c1262221-1a31-45d5-980a-b80f8e4d5153",
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
  "timestamp": "2026-10-29T15:47:09.000+0000",
  "channel": {
    "id": "1730052000.74172712",
    "linkedid": "1730052000.74172712",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670561409"
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
  "timestamp": "2026-10-29T15:47:09.000+0000",
  "channel": {
    "id": "1730052000.74172712",
    "linkedid": "1730052000.74172712",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670561409"
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
  "session_id": "31376763-44ff-4858-a317-b93a2861824a",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk3MjksImlhdCI6MTc5MzI4ODgyOSwianRpIjoiZjUyOWRiYjQtZWViNy00ZWU5LWI4ZWMtMzhkZjg5YmQ2MTYyIiwic2lkIjoiMzEzNzY3NjMtNDRmZi00ODU4LWEzMTctYjkzYTI4NjE4MjRhIn0.X8drNfJrKR7xCkAcvA6yLch-1pxCqlU6M2LbRL3SDY4",
  "access_expires_at": "2026-10-29T16:02:09.965722911Z",
  "refresh_token": "fOT5WaFZKcyuq_isc59YBCR12EpR79sy_50DcvSd8nc",
  "refresh_expires_at": "2026-10-30T03:47:09.965198163Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "893cbfa7-4a39-42bb-8a9e-d6858c818821",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670561409",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T15:47:09Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/893cbfa7-4a39-42bb-8a9e-d6858c818821/answer` → **200**

```json
{
  "command_id": "f8d7fcc8-74e0-4ed2-93f6-ebd50d66a965"
}
```

```json
{
  "id": "893cbfa7-4a39-42bb-8a9e-d6858c818821",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670561409",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
  "order_ids": [],
  "started_at": "2026-10-29T15:47:09Z",
  "answered_at": "2026-10-29T15:47:10.531757Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.74172712",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "cb8ba014-3adf-4de1-94cd-5942360a3afe",
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
  "id": "f77b970d-0aa4-4812-9261-658868b14946",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:52:10.843753Z",
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
  "command_id": "fb57056a-1697-43c9-ac80-0aaa340ceba4",
  "quote_id": "f77b970d-0aa4-4812-9261-658868b14946",
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
    "phone": "+380670561409"
  },
  "call_id": "893cbfa7-4a39-42bb-8a9e-d6858c818821"
}
```

```json
{
  "id": "f8a5460f-0aa6-4184-91ba-b0beeaf196a3",
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
  "created_at": "2026-10-29T15:47:11.140606Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670561409"
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
    "id": "1730052000.74172712",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "893cbfa7-4a39-42bb-8a9e-d6858c818821",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670561409",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
      "order_ids": [
        "f8a5460f-0aa6-4184-91ba-b0beeaf196a3"
      ],
      "started_at": "2026-10-29T15:47:09Z",
      "answered_at": "2026-10-29T15:47:10.531757Z",
      "ended_at": "2026-10-29T15:47:11.454502Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "f561ba10-a17f-486e-8a12-de271577b188",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677273748",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
      "order_ids": [],
      "started_at": "2026-10-29T15:44:42.133359Z",
      "answered_at": "2026-10-29T15:44:42.455894Z",
      "ended_at": "2026-10-29T15:44:42.761581Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T15:44:47.735594Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/f8a5460f-0aa6-4184-91ba-b0beeaf196a3` → **200**

```json
{
  "id": "f8a5460f-0aa6-4184-91ba-b0beeaf196a3",
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
  "created_at": "2026-10-29T15:47:11.140606Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670561409"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/f8a5460f-0aa6-4184-91ba-b0beeaf196a3` → **200**

```json
{
  "id": "f8a5460f-0aa6-4184-91ba-b0beeaf196a3",
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
  "created_at": "2026-10-29T15:47:11.140606Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670561409"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/f8a5460f-0aa6-4184-91ba-b0beeaf196a3/cancel` → **200**

```json
{
  "command_id": "e8f2cbef-d02e-498a-8fb7-7345cdcf6830",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "f8a5460f-0aa6-4184-91ba-b0beeaf196a3",
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
  "created_at": "2026-10-29T15:47:11.140606Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670561409"
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

Done: call 893cbfa7-4a39-42bb-8a9e-d6858c818821 with order f8a5460f-0aa6-4184-91ba-b0beeaf196a3.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29548"
}
```

```json
{
  "challenge_id": "75fd5026-ad91-4a37-923e-42a97bd65f9a",
  "expires_at": "2026-10-29T15:52:12.703600914Z",
  "resend_available_at": "2026-10-29T15:47:13.703600914Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "777546",
  "sent_at": "2026-10-29T15:47:12.707261001Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "75fd5026-ad91-4a37-923e-42a97bd65f9a",
  "code": "777546",
  "device_ref": "sandbox-29548"
}
```

```json
{
  "session_id": "71bf8cd9-ca85-4037-b689-33c8a3aa346d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTczMywiaWF0IjoxNzkzMjg4ODMzLCJqdGkiOiJlNDM3MzQ1ZC0zN2NjLTQ1NWUtOGJlMy03ZmVkM2IyMmVlMGYiLCJzaWQiOiI3MWJmOGNkOS1jYTg1LTQwMzctYjY4OS0zM2M4YTNhYTM0NmQifQ.3_8Pd1AAbYG8YZHUHwSEXB5ye4q1ki0DU56mQJhZbDY",
  "access_expires_at": "2026-10-29T16:02:13.012590111Z",
  "refresh_token": "DICJPzSBIOEWYfpszoJOBuoIF8EpBoVw_EVhsVStx8k",
  "refresh_expires_at": "2026-11-28T15:47:13.011776394Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "86499646-4c02-4cec-8387-cd4f95a517e8",
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
  "last_heartbeat_at": "2026-10-29T15:47:00.577668Z",
  "last_location_at": "2026-10-29T15:47:00.577668Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/86499646-4c02-4cec-8387-cd4f95a517e8/handover` → **200**

```json
{
  "command_id": "587d8451-3e95-44f6-a0ed-f656c21e4bcd",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "86499646-4c02-4cec-8387-cd4f95a517e8",
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
  "last_heartbeat_at": "2026-10-29T15:47:00.577668Z",
  "last_location_at": "2026-10-29T15:47:00.577668Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/86499646-4c02-4cec-8387-cd4f95a517e8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:47:13Z",
    "sequence": 1793288833849
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "86499646-4c02-4cec-8387-cd4f95a517e8",
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
  "last_heartbeat_at": "2026-10-29T15:47:13.866805Z",
  "last_location_at": "2026-10-29T15:47:13.866805Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660951805",
  "device_ref": "sandbox-2205"
}
```

```json
{
  "challenge_id": "cdbf6137-6ea0-47fd-af75-83b47f5d1f93",
  "expires_at": "2026-10-29T15:52:14.1431221Z",
  "resend_available_at": "2026-10-29T15:47:15.1431221Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660951805` → **200**

```json
{
  "phone": "+380660951805",
  "audience": "CLIENT",
  "code": "700807",
  "sent_at": "2026-10-29T15:47:14.145504252Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cdbf6137-6ea0-47fd-af75-83b47f5d1f93",
  "code": "700807",
  "device_ref": "sandbox-2205"
}
```

```json
{
  "session_id": "9def31ab-7ee0-45ea-8f95-a35a46c7015c",
  "subject": {
    "type": "CLIENT",
    "id": "13133330-e27e-4d49-9386-af540d1be810"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzEzMzMzMC1lMjdlLTRkNDktOTM4Ni1hZjU0MGQxYmU4MTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NzM0LCJpYXQiOjE3OTMyODg4MzQsImp0aSI6IjYzYzRhZWZjLTczOTYtNGU0Yy05NWE0LWRhMDljMjk3NGU1ZSIsInNpZCI6IjlkZWYzMWFiLTdlZTAtNDVlYS04Zjk1LWEzNWE0NmM3MDE1YyJ9.-BuOUFcdgBapeRrhM3Jl4exFlo-XJY0d_HiE1R4yy1M",
  "access_expires_at": "2026-10-29T16:02:14.448836361Z",
  "refresh_token": "w4bohuZNN-fMo9y-PQvRSGRjgPZHS72UyOijWf43uhE",
  "refresh_expires_at": "2026-11-28T15:47:14.448222767Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9320c481-c2d6-420d-859d-a98e9f3aea79",
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
  "id": "a3cc5ef9-766f-4fd9-9629-2ab2ed2dbd5a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:52:14.730144Z",
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
  "command_id": "0c5931b1-165f-4dca-890b-6ce60232520b",
  "quote_id": "a3cc5ef9-766f-4fd9-9629-2ab2ed2dbd5a",
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
  "id": "b45f559c-cc95-4a07-aac9-36eed401253f",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13133330-e27e-4d49-9386-af540d1be810",
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
  "created_at": "2026-10-29T15:47:15.026409Z",
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
    "id": "557da100-cba7-4bd6-beda-0f8f8225a6e3",
    "order_id": "b45f559c-cc95-4a07-aac9-36eed401253f",
    "expires_at": "2026-10-29T15:47:30.02927Z",
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

`POST /api/driver/v1/offers/557da100-cba7-4bd6-beda-0f8f8225a6e3/accept` → **200**

```json
{
  "command_id": "f1bcc4ad-4fe4-445b-921f-f4d8295fdaa7"
}
```

```json
{
  "id": "b4180d91-2683-4e5f-a881-57a1ed4ff19b",
  "order_id": "b45f559c-cc95-4a07-aac9-36eed401253f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "36385700-a13c-4740-b0d7-c0e3c77876ac",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "36385700-a13c-4740-b0d7-c0e3c77876ac",
  "order_id": "b45f559c-cc95-4a07-aac9-36eed401253f",
  "assignment_id": "b4180d91-2683-4e5f-a881-57a1ed4ff19b",
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

`POST /api/driver/v1/work-sessions/86499646-4c02-4cec-8387-cd4f95a517e8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:47:16Z",
    "sequence": 1793288836151
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "86499646-4c02-4cec-8387-cd4f95a517e8",
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
  "last_heartbeat_at": "2026-10-29T15:47:16.168892Z",
  "last_location_at": "2026-10-29T15:47:16.168892Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/36385700-a13c-4740-b0d7-c0e3c77876ac/arrive` → **200**

```json
{
  "command_id": "b3eff2ce-6b90-4b2e-95d9-31dc3e3a118b",
  "expected_version": 0
}
```

```json
{
  "id": "36385700-a13c-4740-b0d7-c0e3c77876ac",
  "order_id": "b45f559c-cc95-4a07-aac9-36eed401253f",
  "assignment_id": "b4180d91-2683-4e5f-a881-57a1ed4ff19b",
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
  "arrived_at": "2026-10-29T15:47:16.445523Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/36385700-a13c-4740-b0d7-c0e3c77876ac/start` → **200**

```json
{
  "command_id": "1116027e-f692-422e-873e-0cb3149113ca",
  "expected_version": 1
}
```

```json
{
  "id": "36385700-a13c-4740-b0d7-c0e3c77876ac",
  "order_id": "b45f559c-cc95-4a07-aac9-36eed401253f",
  "assignment_id": "b4180d91-2683-4e5f-a881-57a1ed4ff19b",
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
  "arrived_at": "2026-10-29T15:47:16.445523Z",
  "started_at": "2026-10-29T15:47:16.733895Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/86499646-4c02-4cec-8387-cd4f95a517e8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:47:17Z",
    "sequence": 1793288837130
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "86499646-4c02-4cec-8387-cd4f95a517e8",
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
  "last_heartbeat_at": "2026-10-29T15:47:17.030449Z",
  "last_location_at": "2026-10-29T15:47:17.030449Z",
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
  "device_ref": "sandbox-27159"
}
```

```json
{
  "challenge_id": "303c7022-c0ff-4aae-bbee-78cfad3af788",
  "expires_at": "2026-10-29T15:52:17.302560333Z",
  "resend_available_at": "2026-10-29T15:47:18.302560333Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "954818",
  "sent_at": "2026-10-29T15:47:17.30517576Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "303c7022-c0ff-4aae-bbee-78cfad3af788",
  "code": "954818",
  "device_ref": "sandbox-27159"
}
```

```json
{
  "session_id": "db973051-2a03-48b8-9db0-6696fa1fc8cf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTczNywiaWF0IjoxNzkzMjg4ODM3LCJqdGkiOiI1NWE2OGEyOS1jM2I2LTRkYWEtOWI0ZS0wNTU3NDkyYTViZjQiLCJzaWQiOiJkYjk3MzA1MS0yYTAzLTQ4YjgtOWRiMC02Njk2ZmExZmM4Y2YifQ.glfaYXgSGwzT0H6GMsfECziAkGVtlXvEVzN3SJDqYrU",
  "access_expires_at": "2026-10-29T16:02:17.604486188Z",
  "refresh_token": "ZjauOyykyB_19wxxNk8oWGHHacFI_ZfurTnCSRmFO_Q",
  "refresh_expires_at": "2026-11-28T15:47:17.60382256Z",
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
  "command_id": "89476ec0-6c17-4aa9-a141-880dc4ac488b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:47:18Z",
    "sequence": 1793288838157
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "72960a25-6b27-4fe2-bf3a-3054b2cf2ef9",
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
  "last_heartbeat_at": "2026-10-29T15:47:18.175408Z",
  "last_location_at": "2026-10-29T15:47:18.175408Z",
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
  "session_id": "70d31849-b23d-4b99-a237-5db8e117776d",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk3MzgsImlhdCI6MTc5MzI4ODgzOCwianRpIjoiYjhiNjExMTYtZWIyNy00YjE2LWI2MmQtYTcyY2ZhMzM4NTVhIiwic2lkIjoiNzBkMzE4NDktYjIzZC00Yjk5LWEyMzctNWRiOGUxMTc3NzZkIn0.9tQ43xNX-mhtt9PT4aUYZR-Sdqw-RLHB-tZVBfejnZc",
  "access_expires_at": "2026-10-29T16:02:18.752609575Z",
  "refresh_token": "dIouXFHN2lMSOCBUFnWOtJVgbTxwriycnntpIoyIE1c",
  "refresh_expires_at": "2026-10-30T03:47:18.751889563Z",
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
  "session_id": "e9d3e819-d4cb-42fe-b048-f7d66b869983",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk3MzksImlhdCI6MTc5MzI4ODgzOSwianRpIjoiODAyYzBjODktNDM4MS00YjE0LWI0MTUtNDU2ZTEyM2I1MjExIiwic2lkIjoiZTlkM2U4MTktZDRjYi00MmZlLWIwNDgtZjdkNjZiODY5OTgzIn0.fFZ8mfjcAXMw-ZqJZ25ZDk9u_FxxhiFge869hzo9DIs",
  "access_expires_at": "2026-10-29T16:02:19.309492547Z",
  "refresh_token": "fqNppZIWhDyQ7bpNGqO77c3cVtJ5BS5oGY3ujEEvQvc",
  "refresh_expires_at": "2026-10-30T03:47:19.308862473Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b45f559c-cc95-4a07-aac9-36eed401253f` → **200**

```json
{
  "id": "b45f559c-cc95-4a07-aac9-36eed401253f",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "13133330-e27e-4d49-9386-af540d1be810",
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
    "id": "b4180d91-2683-4e5f-a881-57a1ed4ff19b",
    "order_id": "b45f559c-cc95-4a07-aac9-36eed401253f",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "36385700-a13c-4740-b0d7-c0e3c77876ac",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T15:47:15.026409Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b45f559c-cc95-4a07-aac9-36eed401253f/interrupt` → **200**

```json
{
  "command_id": "0d67f12b-ebc0-4310-b8f0-199f07a619e2",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "b45f559c-cc95-4a07-aac9-36eed401253f",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "13133330-e27e-4d49-9386-af540d1be810",
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
      "id": "b4180d91-2683-4e5f-a881-57a1ed4ff19b",
      "order_id": "b45f559c-cc95-4a07-aac9-36eed401253f",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "36385700-a13c-4740-b0d7-c0e3c77876ac",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T15:47:15.026409Z",
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
    "id": "3366f0ce-98c0-4523-84fc-322198ad5ce0",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "13133330-e27e-4d49-9386-af540d1be810",
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
    "id": "20b79cca-a1c8-4296-b5fc-9304a79912f4",
    "order_id": "3366f0ce-98c0-4523-84fc-322198ad5ce0",
    "expires_at": "2026-10-29T15:47:34.902288Z",
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

`POST /api/driver/v1/offers/20b79cca-a1c8-4296-b5fc-9304a79912f4/accept` → **200**

```json
{
  "command_id": "04625822-8153-41a3-b87d-1b227dcc0078"
}
```

```json
{
  "id": "98deff09-0042-4a6e-b14e-23bb5193b9f2",
  "order_id": "3366f0ce-98c0-4523-84fc-322198ad5ce0",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4ff92fd2-4be7-4133-9a2d-6309d1ea68d7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4ff92fd2-4be7-4133-9a2d-6309d1ea68d7",
  "order_id": "3366f0ce-98c0-4523-84fc-322198ad5ce0",
  "assignment_id": "98deff09-0042-4a6e-b14e-23bb5193b9f2",
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
  "session_id": "72960a25-6b27-4fe2-bf3a-3054b2cf2ef9",
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
  "last_heartbeat_at": "2026-10-29T15:47:18.175408Z",
  "last_location_at": "2026-10-29T15:47:18.175408Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/72960a25-6b27-4fe2-bf3a-3054b2cf2ef9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:47:21Z",
    "sequence": 1793288841340
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "72960a25-6b27-4fe2-bf3a-3054b2cf2ef9",
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
  "last_heartbeat_at": "2026-10-29T15:47:21.359121Z",
  "last_location_at": "2026-10-29T15:47:21.359121Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4ff92fd2-4be7-4133-9a2d-6309d1ea68d7/arrive` → **200**

```json
{
  "command_id": "03e29689-f01e-4554-a0e2-66cafdafc9cd",
  "expected_version": 0
}
```

```json
{
  "id": "4ff92fd2-4be7-4133-9a2d-6309d1ea68d7",
  "order_id": "3366f0ce-98c0-4523-84fc-322198ad5ce0",
  "assignment_id": "98deff09-0042-4a6e-b14e-23bb5193b9f2",
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
  "arrived_at": "2026-10-29T15:47:21.647803Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4ff92fd2-4be7-4133-9a2d-6309d1ea68d7/start` → **200**

```json
{
  "command_id": "d5d191ec-4d78-4bba-b68a-b91c0203514c",
  "expected_version": 1
}
```

```json
{
  "id": "4ff92fd2-4be7-4133-9a2d-6309d1ea68d7",
  "order_id": "3366f0ce-98c0-4523-84fc-322198ad5ce0",
  "assignment_id": "98deff09-0042-4a6e-b14e-23bb5193b9f2",
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
  "arrived_at": "2026-10-29T15:47:21.647803Z",
  "started_at": "2026-10-29T15:47:21.963842Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4ff92fd2-4be7-4133-9a2d-6309d1ea68d7/complete` → **200**

```json
{
  "command_id": "50f9d791-0c43-4a74-9d67-2ca72e7927db",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:47:22Z"
}
```

```json
{
  "id": "4ff92fd2-4be7-4133-9a2d-6309d1ea68d7",
  "order_id": "3366f0ce-98c0-4523-84fc-322198ad5ce0",
  "assignment_id": "98deff09-0042-4a6e-b14e-23bb5193b9f2",
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
  "arrived_at": "2026-10-29T15:47:21.647803Z",
  "started_at": "2026-10-29T15:47:21.963842Z",
  "completed_at": "2026-10-29T15:47:22.261475Z",
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
    "id": "3366f0ce-98c0-4523-84fc-322198ad5ce0",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-29T15:47:19.893049Z",
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
    "id": "b45f559c-cc95-4a07-aac9-36eed401253f",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-29T15:47:15.026409Z",
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

`GET /api/operator/v1/orders/b45f559c-cc95-4a07-aac9-36eed401253f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:47:15.026902Z",
      "actor": {
        "type": "CLIENT",
        "id": "13133330-e27e-4d49-9386-af540d1be810",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b45f559c-cc95-4a07-aac9-36eed401253f",
        "quote_id": "a3cc5ef9-766f-4fd9-9629-2ab2ed2dbd5a",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "e6f45081-7979-45c9-90c2-63544e029615"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:47:15.028634Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b45f559c-cc95-4a07-aac9-36eed401253f",
        "attempt_id": "6ed0459b-7394-4499-bd3a-15b02e930ea4",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "e6f45081-7979-45c9-90c2-63544e029615"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T15:47:15.031109Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "557da100-cba7-4bd6-beda-0f8f8225a6e3",
        "order_id": "b45f559c-cc95-4a07-aac9-36eed401253f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "e6f45081-7979-45c9-90c2-63544e029615"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T15:47:15.612616Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "557da100-cba7-4bd6-beda-0f8f8225a6e3",
        "order_id": "b45f559c-cc95-4a07-aac9-36eed401253f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "b4180d91-2683-4e5f-a881-57a1ed4ff19b"
      },
      "correlation_id": "8564092c-b61f-4416-ae2d-138d60d22b67"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/3366f0ce-98c0-4523-84fc-322198ad5ce0/tip` → **200**

```json
{
  "order_id": "3366f0ce-98c0-4523-84fc-322198ad5ce0",
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
  "available_until": "2026-10-30T15:47:22.261475Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/3366f0ce-98c0-4523-84fc-322198ad5ce0/tip` → **409**

```json
{
  "command_id": "4f9dbdd1-8520-4d1d-bee0-d838c14fb4ce",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/3366f0ce-98c0-4523-84fc-322198ad5ce0/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "9af14eff-8b16-4e78-863f-d67eca3a7476"
}
```

Done: interrupted b45f559c-cc95-4a07-aac9-36eed401253f, follow-up 3366f0ce-98c0-4523-84fc-322198ad5ce0.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "86499646-4c02-4cec-8387-cd4f95a517e8",
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
  "last_heartbeat_at": "2026-10-29T15:47:17.030449Z",
  "last_location_at": "2026-10-29T15:47:17.030449Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/86499646-4c02-4cec-8387-cd4f95a517e8/close` → **200**

```json
{
  "command_id": "f04c01e4-85d0-46a4-a1f2-3cad586f4871",
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
  "session_id": "72960a25-6b27-4fe2-bf3a-3054b2cf2ef9",
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
  "last_heartbeat_at": "2026-10-29T15:47:21.359121Z",
  "last_location_at": "2026-10-29T15:47:21.359121Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/72960a25-6b27-4fe2-bf3a-3054b2cf2ef9/close` → **200**

```json
{
  "command_id": "cbf8b3ef-a70d-4d8d-9342-870d7e178ea5",
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
  "session_id": "3852052c-dc87-44ad-a86b-d08e8814caac",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk3NDgsImlhdCI6MTc5MzI4ODg0OCwianRpIjoiMzY2ZTkwNTctODQwZC00YTcwLWI5NzEtN2E1ODgzN2M5MmU5Iiwic2lkIjoiMzg1MjA1MmMtZGM4Ny00NGFkLWE4NmItZDA4ZTg4MTRjYWFjIn0.BH48l8z48a3bK0mowPUbdDcCF7v7MIpMlwjcg4nLMMw",
  "access_expires_at": "2026-10-29T16:02:28.398744681Z",
  "refresh_token": "OudjBCzYxgeWBxOrBVr7hHYorokBA4LF7BpmFqhwCV8",
  "refresh_expires_at": "2026-10-30T03:47:28.398065605Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "07a49db8-9b73-42b9-ab6e-eb54df9d8c65",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T15:47:28Z"
}
```

```json
{
  "id": "e8e1b75c-2c05-4390-9d4f-00ed1a59cbd7",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T15:47:28Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/e8e1b75c-2c05-4390-9d4f-00ed1a59cbd7/publish` → **200**

```json
{
  "command_id": "a5c47312-da92-4779-a0d6-13e73857e8b6",
  "expected_version": 0
}
```

```json
{
  "id": "e8e1b75c-2c05-4390-9d4f-00ed1a59cbd7",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T15:47:28.984212Z",
  "published_at": "2026-10-29T15:47:28.984212Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "e8e1b75c-2c05-4390-9d4f-00ed1a59cbd7",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T15:47:28.984212Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638989260",
  "device_ref": "sandbox-24563"
}
```

```json
{
  "challenge_id": "2af44aea-0dbf-40df-af40-d10aa6030611",
  "expires_at": "2026-10-29T15:52:29.534827184Z",
  "resend_available_at": "2026-10-29T15:47:30.534827184Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638989260` → **200**

```json
{
  "phone": "+380638989260",
  "audience": "CLIENT",
  "code": "471309",
  "sent_at": "2026-10-29T15:47:29.537460997Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2af44aea-0dbf-40df-af40-d10aa6030611",
  "code": "471309",
  "device_ref": "sandbox-24563"
}
```

```json
{
  "session_id": "6d0729f3-87ec-435c-b680-d37965128ed7",
  "subject": {
    "type": "CLIENT",
    "id": "85406b4b-47d8-42c7-a568-1d6cd0fde241"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTQwNmI0Yi00N2Q4LTQyYzctYTU2OC0xZDZjZDBmZGUyNDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NzQ5LCJpYXQiOjE3OTMyODg4NDksImp0aSI6ImE2Y2NiNWM0LThiNGYtNDNlYS1hNTRmLTcxNTI2MzcwODQ3MyIsInNpZCI6IjZkMDcyOWYzLTg3ZWMtNDM1Yy1iNjgwLWQzNzk2NTEyOGVkNyJ9.LI-RfRhLm2PKf68VwatUouD21AJvTsroxFKIzTwX05Q",
  "access_expires_at": "2026-10-29T16:02:29.839281854Z",
  "refresh_token": "1LW6KwBC_0U7-g5ilpnQANQ84vGlueYVx0AJJW79Oy0",
  "refresh_expires_at": "2026-11-28T15:47:29.838733627Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "e8e1b75c-2c05-4390-9d4f-00ed1a59cbd7",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T15:47:28.984212Z",
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
  "command_id": "3daf4896-b034-4c2f-88de-f4ecef8df241",
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
  "id": "b4dedc12-a2f0-4e8b-9d71-113c53d5e26e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:52:30.393812Z",
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
  "command_id": "e3274f02-23a9-43c8-83fa-522f37bc95d0",
  "quote_id": "b4dedc12-a2f0-4e8b-9d71-113c53d5e26e",
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
  "correlation_id": "6f58e35e-763b-4766-8142-da8b0dd0489d"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "1562fed7-4c17-4338-96b5-0a2783c8b70d",
  "version_id": "e8e1b75c-2c05-4390-9d4f-00ed1a59cbd7",
  "language": "uk"
}
```

```json
{
  "version_id": "e8e1b75c-2c05-4390-9d4f-00ed1a59cbd7",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T15:47:30.955266Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "528b92a8-5606-4be9-9d78-2b4cb24e9f08",
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
  "id": "f118b0f7-d545-4bcd-a13d-f48f9559287e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:52:31.235666Z",
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
  "command_id": "186ba312-6a05-4b32-9bc8-35bfd8995af9",
  "quote_id": "f118b0f7-d545-4bcd-a13d-f48f9559287e",
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
  "id": "a90e066c-a144-4cae-8cbd-269e37fe111c",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85406b4b-47d8-42c7-a568-1d6cd0fde241",
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
  "created_at": "2026-10-29T15:47:31.526195Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a90e066c-a144-4cae-8cbd-269e37fe111c` → **200**

```json
{
  "id": "a90e066c-a144-4cae-8cbd-269e37fe111c",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85406b4b-47d8-42c7-a568-1d6cd0fde241",
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
  "created_at": "2026-10-29T15:47:31.526195Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a90e066c-a144-4cae-8cbd-269e37fe111c/cancel` → **200**

```json
{
  "command_id": "e2689c49-4c19-49bb-b4c0-df1601ab4607",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a90e066c-a144-4cae-8cbd-269e37fe111c",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "85406b4b-47d8-42c7-a568-1d6cd0fde241",
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
  "created_at": "2026-10-29T15:47:31.526195Z",
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

`POST /api/admin/v1/legal-documents/e8e1b75c-2c05-4390-9d4f-00ed1a59cbd7` → **409**

```json
{
  "command_id": "e626a743-7040-4ce5-8205-6b57963f437a",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T15:47:32Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/e8e1b75c-2c05-4390-9d4f-00ed1a59cbd7",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "113f7369-5d5a-4c11-bae4-eacd504756fe"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "5da32f7d-dbee-41e5-8458-f67c35e2d792",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T15:47:32Z"
}
```

```json
{
  "id": "5fbaae89-931d-4218-80d8-cc50882aa8a6",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T15:47:32Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/5fbaae89-931d-4218-80d8-cc50882aa8a6/publish` → **200**

```json
{
  "command_id": "b66e8236-2990-4257-ae4a-c2069814c77e",
  "expected_version": 0
}
```

```json
{
  "id": "5fbaae89-931d-4218-80d8-cc50882aa8a6",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T15:47:32.988788Z",
  "published_at": "2026-10-29T15:47:32.988788Z",
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
  "device_ref": "sandbox-17557"
}
```

```json
{
  "challenge_id": "2266804a-27c1-48ce-8278-55ce29a6d127",
  "expires_at": "2026-10-29T15:52:33.281800704Z",
  "resend_available_at": "2026-10-29T15:47:34.281800704Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "831647",
  "sent_at": "2026-10-29T15:47:33.284499005Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2266804a-27c1-48ce-8278-55ce29a6d127",
  "code": "831647",
  "device_ref": "sandbox-17557"
}
```

```json
{
  "session_id": "0910e95c-3a75-4910-a430-757135ff06e1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTc1MywiaWF0IjoxNzkzMjg4ODUzLCJqdGkiOiIwOTk0NmZjMC00YmZiLTQ1ZjMtYjViNC0yZGMyN2I4Y2IyYzAiLCJzaWQiOiIwOTEwZTk1Yy0zYTc1LTQ5MTAtYTQzMC03NTcxMzVmZjA2ZTEifQ.dJiKlC327lDogHLYI4w3z4tOJL24a0XwRUEzq5pChpk",
  "access_expires_at": "2026-10-29T16:02:33.593808883Z",
  "refresh_token": "6Xs967xAh8JgHw_DaowMfirzVjrOnIePwolbf_jJdtg",
  "refresh_expires_at": "2026-11-28T15:47:33.593196612Z",
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
  "command_id": "e5eafa79-6309-4c2e-8844-f93a3bc92549",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:47:34Z",
    "sequence": 1793288854134
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "62002b04-9e87-4b79-b551-9c0e79266f61",
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
  "last_heartbeat_at": "2026-10-29T15:47:34.152423Z",
  "last_location_at": "2026-10-29T15:47:34.152423Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678206339",
  "device_ref": "sandbox-27813"
}
```

```json
{
  "challenge_id": "d63b4cc4-8454-4f22-b817-f4b6c8c25b91",
  "expires_at": "2026-10-29T15:52:34.434839579Z",
  "resend_available_at": "2026-10-29T15:47:35.434839579Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678206339` → **200**

```json
{
  "phone": "+380678206339",
  "audience": "CLIENT",
  "code": "085238",
  "sent_at": "2026-10-29T15:47:34.437206102Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d63b4cc4-8454-4f22-b817-f4b6c8c25b91",
  "code": "085238",
  "device_ref": "sandbox-27813"
}
```

```json
{
  "session_id": "abd09456-9487-43bc-a790-512b5db02ced",
  "subject": {
    "type": "CLIENT",
    "id": "91390046-7db2-4cf4-9b65-a6fa910713d7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTM5MDA0Ni03ZGIyLTRjZjQtOWI2NS1hNmZhOTEwNzEzZDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NzU0LCJpYXQiOjE3OTMyODg4NTQsImp0aSI6ImJhOWE0OTUzLWYxZWMtNDNlZS1hYzc3LTMxMDhiNTQ1NjkzMCIsInNpZCI6ImFiZDA5NDU2LTk0ODctNDNiYy1hNzkwLTUxMmI1ZGIwMmNlZCJ9.z55lliCY_lCiJDrZUgyTOaPWUdJ-aCXC1c6WoEwOmOM",
  "access_expires_at": "2026-10-29T16:02:34.735977813Z",
  "refresh_token": "-COGEwHFCIJxVZULRBmH0HJdFkWM0CS_ss640P80u58",
  "refresh_expires_at": "2026-11-28T15:47:34.735473262Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "925d7a53-8c36-4bd6-95be-56bcaac54543",
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
  "id": "65fa6579-4caa-4de1-b139-d704e3d3d778",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:52:35.018268Z",
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
  "command_id": "dcf2ebb3-b622-4772-a225-ca6a6fcb979a",
  "quote_id": "65fa6579-4caa-4de1-b139-d704e3d3d778",
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
    "phone": "+380675198481"
  }
}
```

```json
{
  "id": "942e3eab-6924-4a08-9ed5-b485bfecdff4",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "91390046-7db2-4cf4-9b65-a6fa910713d7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:47:35.311772Z",
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
    "id": "e3c5884b-9237-4965-9130-5ddc1ecca6d5",
    "order_id": "942e3eab-6924-4a08-9ed5-b485bfecdff4",
    "expires_at": "2026-10-29T15:47:50.315126Z",
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

`POST /api/driver/v1/offers/e3c5884b-9237-4965-9130-5ddc1ecca6d5/accept` → **200**

```json
{
  "command_id": "935ea2b6-4c83-408f-9ee0-ec57a4f46533"
}
```

```json
{
  "id": "ed651461-d087-4c3b-b141-0be298364e4c",
  "order_id": "942e3eab-6924-4a08-9ed5-b485bfecdff4",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "89186c2b-4cc0-4e2a-8352-3be31010e6bb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "89186c2b-4cc0-4e2a-8352-3be31010e6bb",
  "order_id": "942e3eab-6924-4a08-9ed5-b485bfecdff4",
  "assignment_id": "ed651461-d087-4c3b-b141-0be298364e4c",
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
    "phone": "+380675198481"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "15cd36ac-8b8e-4468-b556-393dff4fb022",
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
  "id": "dc08b721-0682-4942-8846-49bfba556926",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:52:36.488703Z",
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
  "command_id": "cab8aa8e-1f0e-4b21-b967-5e3acbcc50d5",
  "quote_id": "dc08b721-0682-4942-8846-49bfba556926",
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
  "id": "ffcf4ed2-6702-49dc-b835-14beb27206ef",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "91390046-7db2-4cf4-9b65-a6fa910713d7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:47:36.785897Z",
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
  "command_id": "de488789-cbd7-49e8-8ff5-1032011c9405",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T18:47:37Z"
}
```

```json
{
  "id": "abcc522f-5ff6-4c7f-a173-ec23ab4a6099",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:52:37.109499Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T18:47:37Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "230439f8-6a89-4249-9be0-a65475fa1d11",
  "quote_id": "abcc522f-5ff6-4c7f-a173-ec23ab4a6099",
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
  "pickup_at": "2026-10-29T18:47:37Z"
}
```

```json
{
  "id": "25692251-6f6b-40d9-bf0f-423c96583be8",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "91390046-7db2-4cf4-9b65-a6fa910713d7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T15:47:37.409113Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T18:47:37Z",
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
  "command_id": "dd6d1b72-6e25-4d52-9a43-f52d8eba41a4",
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
  "id": "934ac7d0-5382-48a1-8b28-137aa9cebd9a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:52:37.707332Z",
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
  "command_id": "11b3efc4-5c24-450f-8e57-2a07910ad31c",
  "quote_id": "934ac7d0-5382-48a1-8b28-137aa9cebd9a",
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
  "correlation_id": "71261a63-2f38-4bb3-b756-03704e8811ef"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "25692251-6f6b-40d9-bf0f-423c96583be8",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "91390046-7db2-4cf4-9b65-a6fa910713d7",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-29T15:47:37.409113Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T18:47:37Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "ffcf4ed2-6702-49dc-b835-14beb27206ef",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "91390046-7db2-4cf4-9b65-a6fa910713d7",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-29T15:47:36.785897Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "942e3eab-6924-4a08-9ed5-b485bfecdff4",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "ffcf4ed2-6702-49dc-b835-14beb27206ef",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "91390046-7db2-4cf4-9b65-a6fa910713d7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:47:36.785897Z",
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

`GET /api/rider/v1/orders/942e3eab-6924-4a08-9ed5-b485bfecdff4` → **200**

```json
{
  "id": "942e3eab-6924-4a08-9ed5-b485bfecdff4",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "91390046-7db2-4cf4-9b65-a6fa910713d7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "ed651461-d087-4c3b-b141-0be298364e4c",
    "order_id": "942e3eab-6924-4a08-9ed5-b485bfecdff4",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "89186c2b-4cc0-4e2a-8352-3be31010e6bb",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T15:47:35.311772Z",
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
    "location_at": "2026-10-29T15:47:34.152423Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/942e3eab-6924-4a08-9ed5-b485bfecdff4/cancel` → **200**

```json
{
  "command_id": "b3b8fe05-bcf5-44e6-bd61-993eaa84995d",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "942e3eab-6924-4a08-9ed5-b485bfecdff4",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "91390046-7db2-4cf4-9b65-a6fa910713d7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "ed651461-d087-4c3b-b141-0be298364e4c",
    "order_id": "942e3eab-6924-4a08-9ed5-b485bfecdff4",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "89186c2b-4cc0-4e2a-8352-3be31010e6bb",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T15:47:35.311772Z",
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

`GET /api/rider/v1/orders/ffcf4ed2-6702-49dc-b835-14beb27206ef` → **200**

```json
{
  "id": "ffcf4ed2-6702-49dc-b835-14beb27206ef",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "91390046-7db2-4cf4-9b65-a6fa910713d7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:47:36.785897Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ffcf4ed2-6702-49dc-b835-14beb27206ef/cancel` → **200**

```json
{
  "command_id": "85ada58f-97db-413a-bff0-de5ff209e550",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ffcf4ed2-6702-49dc-b835-14beb27206ef",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "91390046-7db2-4cf4-9b65-a6fa910713d7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:47:36.785897Z",
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

`GET /api/rider/v1/orders/25692251-6f6b-40d9-bf0f-423c96583be8` → **200**

```json
{
  "id": "25692251-6f6b-40d9-bf0f-423c96583be8",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "91390046-7db2-4cf4-9b65-a6fa910713d7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T15:47:37.409113Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T18:47:37Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/25692251-6f6b-40d9-bf0f-423c96583be8/cancel` → **200**

```json
{
  "command_id": "51070c60-2c17-43f8-aab8-11104c088945",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "25692251-6f6b-40d9-bf0f-423c96583be8",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "91390046-7db2-4cf4-9b65-a6fa910713d7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T15:47:37.409113Z",
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
  "pickup_at": "2026-10-29T18:47:37Z",
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
  "session_id": "62002b04-9e87-4b79-b551-9c0e79266f61",
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
  "last_heartbeat_at": "2026-10-29T15:47:34.152423Z",
  "last_location_at": "2026-10-29T15:47:34.152423Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/62002b04-9e87-4b79-b551-9c0e79266f61/close` → **200**

```json
{
  "command_id": "2c10bae4-c014-45c3-b88c-1d5d7ec15f38",
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

Done: orders 942e3eab-6924-4a08-9ed5-b485bfecdff4, ffcf4ed2-6702-49dc-b835-14beb27206ef, 25692251-6f6b-40d9-bf0f-423c96583be8.

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
  "session_id": "7f18e7cc-e55a-4310-9cec-f69063959b17",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk3NjEsImlhdCI6MTc5MzI4ODg2MSwianRpIjoiODQ5YTg3ODUtMjU3Yi00ZGFjLThjZjYtMWYxYmFiMTM3ZjQwIiwic2lkIjoiN2YxOGU3Y2MtZTU1YS00MzEwLTljZWMtZjY5MDYzOTU5YjE3In0.KmHEtPUXdcx0V0qopK8Zcpw4UcxC1NkoqJg32ipdL-k",
  "access_expires_at": "2026-10-29T16:02:41.477441408Z",
  "refresh_token": "ibZ6LUxh6hX-ICFQgudz1UiHVUBqC_y2dN5MoyAhU1M",
  "refresh_expires_at": "2026-10-30T03:47:41.476887395Z",
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
  "session_id": "e08c371e-818b-4b33-9927-afdc0b88deb1",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk3NjIsImlhdCI6MTc5MzI4ODg2MiwianRpIjoiYjA2MGE0YTgtODJjMS00ZTJiLWE3ZDAtZTk4Yjk5ZDRiZjhlIiwic2lkIjoiZTA4YzM3MWUtODE4Yi00YjMzLTk5MjctYWZkYzBiODhkZWIxIn0.c8KnVvxBpnm-N5r4bMKdHq63npntV3ZWbc_anGgkOLo",
  "access_expires_at": "2026-10-29T16:02:42.047523183Z",
  "refresh_token": "PzEI3cnQXQvcNvP4TSjdub3Ugt9AO-Hj0YtuFHARCrE",
  "refresh_expires_at": "2026-10-30T03:47:42.04696938Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-924"
}
```

```json
{
  "challenge_id": "5109de71-4bc5-4f7c-90d9-c3cb32b00129",
  "expires_at": "2026-10-29T15:52:42.329272082Z",
  "resend_available_at": "2026-10-29T15:47:43.329272082Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "540649",
  "sent_at": "2026-10-29T15:47:42.332152523Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5109de71-4bc5-4f7c-90d9-c3cb32b00129",
  "code": "540649",
  "device_ref": "sandbox-924"
}
```

```json
{
  "session_id": "39e613c9-aaef-4c86-9460-c80ed0aba6b1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTc2MiwiaWF0IjoxNzkzMjg4ODYyLCJqdGkiOiJmMDc1YzcwZC1hODA5LTQ1MDktYWQxOC05ZDgzMDg4OTM3YjEiLCJzaWQiOiIzOWU2MTNjOS1hYWVmLTRjODYtOTQ2MC1jODBlZDBhYmE2YjEifQ.okT3eeAysPkkkJTgA8hoyBB_Q9L7m49ltC7RtOJiFas",
  "access_expires_at": "2026-10-29T16:02:42.626459162Z",
  "refresh_token": "FQ0j23FuxGButLGWdqtqEjGyRaglEH3pq4MWdmf4Oro",
  "refresh_expires_at": "2026-11-28T15:47:42.625814963Z",
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
  "command_id": "0c8b5dd4-509a-4703-93e0-6ea0ad8730ec",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:47:43Z",
    "sequence": 1793288863187
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a050197f-7750-4ac8-8323-7f6c4a8b2e0c",
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
  "last_heartbeat_at": "2026-10-29T15:47:43.205351Z",
  "last_location_at": "2026-10-29T15:47:43.205351Z",
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
  "command_id": "ec51d151-acee-4203-b3ae-21fd9f810932",
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
  "effective_at": "2026-10-29T15:47:43.785979Z",
  "changed_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T15:44:58.968396Z",
  "last_entries": [
    {
      "order_id": "5ba2eae1-51f5-47f4-a055-37b6c0729c03",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T15:44:58.968396Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "85c7d4cb-c764-4eb1-bf61-258b5f5314eb",
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
  "id": "a4bbf774-2c24-460f-83bc-b138397cc0d5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:52:44.358325Z",
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
  "command_id": "10643785-a29c-4527-943d-0627bce6ff68",
  "quote_id": "a4bbf774-2c24-460f-83bc-b138397cc0d5",
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
    "phone": "+3806711122211"
  }
}
```

```json
{
  "id": "1d2e6188-3828-40a1-b5cc-c780d2860ce0",
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
  "created_at": "2026-10-29T15:47:44.646565Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711122211"
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
    "id": "1b1d9c97-e1d5-4fad-ae24-0679d24ca132",
    "order_id": "1d2e6188-3828-40a1-b5cc-c780d2860ce0",
    "expires_at": "2026-10-29T15:47:59.650221Z",
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

`POST /api/driver/v1/offers/1b1d9c97-e1d5-4fad-ae24-0679d24ca132/accept` → **200**

```json
{
  "command_id": "f85d5bc6-ae14-48af-afea-072e2a18a722"
}
```

```json
{
  "id": "03ee42af-937a-49b8-a4bd-7003f5c21c66",
  "order_id": "1d2e6188-3828-40a1-b5cc-c780d2860ce0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d630a701-574a-4aff-b4fa-183bddd049bd",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d630a701-574a-4aff-b4fa-183bddd049bd",
  "order_id": "1d2e6188-3828-40a1-b5cc-c780d2860ce0",
  "assignment_id": "03ee42af-937a-49b8-a4bd-7003f5c21c66",
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
    "phone": "+3806711122211"
  }
}
```

`POST /api/driver/v1/work-sessions/a050197f-7750-4ac8-8323-7f6c4a8b2e0c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:47:45Z",
    "sequence": 1793288865782
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a050197f-7750-4ac8-8323-7f6c4a8b2e0c",
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
  "last_heartbeat_at": "2026-10-29T15:47:45.799784Z",
  "last_location_at": "2026-10-29T15:47:45.799784Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d630a701-574a-4aff-b4fa-183bddd049bd/arrive` → **200**

```json
{
  "command_id": "3252aa3b-2ea6-4ed4-a82f-86f85b09bbc6",
  "expected_version": 0
}
```

```json
{
  "id": "d630a701-574a-4aff-b4fa-183bddd049bd",
  "order_id": "1d2e6188-3828-40a1-b5cc-c780d2860ce0",
  "assignment_id": "03ee42af-937a-49b8-a4bd-7003f5c21c66",
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
  "arrived_at": "2026-10-29T15:47:46.093219Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711122211"
  }
}
```

`POST /api/driver/v1/trips/d630a701-574a-4aff-b4fa-183bddd049bd/start` → **200**

```json
{
  "command_id": "0a91b6b8-2ec1-49bd-bd05-7a4bed41873c",
  "expected_version": 1
}
```

```json
{
  "id": "d630a701-574a-4aff-b4fa-183bddd049bd",
  "order_id": "1d2e6188-3828-40a1-b5cc-c780d2860ce0",
  "assignment_id": "03ee42af-937a-49b8-a4bd-7003f5c21c66",
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
  "arrived_at": "2026-10-29T15:47:46.093219Z",
  "started_at": "2026-10-29T15:47:46.390249Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711122211"
  }
}
```

`POST /api/driver/v1/trips/d630a701-574a-4aff-b4fa-183bddd049bd/complete` → **200**

```json
{
  "command_id": "a35acccd-c67b-479a-99f1-8acee63bed25",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:47:46Z",
  "cash_received": true
}
```

```json
{
  "id": "d630a701-574a-4aff-b4fa-183bddd049bd",
  "order_id": "1d2e6188-3828-40a1-b5cc-c780d2860ce0",
  "assignment_id": "03ee42af-937a-49b8-a4bd-7003f5c21c66",
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
  "arrived_at": "2026-10-29T15:47:46.093219Z",
  "started_at": "2026-10-29T15:47:46.390249Z",
  "completed_at": "2026-10-29T15:47:46.673604Z",
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
  "command_id": "ca41a9d0-08d0-46f6-8799-ce6a0afb7c9c",
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
  "id": "3e627205-fa3c-4501-b7fb-a07245625aa2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:52:46.968208Z",
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
  "command_id": "03486c4a-830c-4a4c-a251-a492de90329d",
  "quote_id": "3e627205-fa3c-4501-b7fb-a07245625aa2",
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
    "phone": "+3806711121611"
  }
}
```

```json
{
  "id": "f50e3f3e-df80-4f25-8c1b-abb41d57a365",
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
  "created_at": "2026-10-29T15:47:47.27368Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121611"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/f50e3f3e-df80-4f25-8c1b-abb41d57a365` → **200**

```json
{
  "id": "f50e3f3e-df80-4f25-8c1b-abb41d57a365",
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
  "created_at": "2026-10-29T15:47:47.27368Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121611"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/f50e3f3e-df80-4f25-8c1b-abb41d57a365/cancel` → **200**

```json
{
  "command_id": "1ab5ce86-84a8-47ac-b345-279f0354217e",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "f50e3f3e-df80-4f25-8c1b-abb41d57a365",
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
  "created_at": "2026-10-29T15:47:47.27368Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121611"
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
  "staff_id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-29T15:44:58.968396Z",
  "last_entries": [
    {
      "order_id": "f50e3f3e-df80-4f25-8c1b-abb41d57a365",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-29T15:47:47.886838Z"
    },
    {
      "order_id": "1d2e6188-3828-40a1-b5cc-c780d2860ce0",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-29T15:47:46.678635Z"
    },
    {
      "order_id": "5ba2eae1-51f5-47f4-a055-37b6c0729c03",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T15:44:58.968396Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a050197f-7750-4ac8-8323-7f6c4a8b2e0c",
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
  "last_heartbeat_at": "2026-10-29T15:47:45.799784Z",
  "last_location_at": "2026-10-29T15:47:45.799784Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a050197f-7750-4ac8-8323-7f6c4a8b2e0c/close` → **200**

```json
{
  "command_id": "d759592f-b8af-4678-85db-759306774934",
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

Done: operator bonus for fulfilled 1d2e6188-3828-40a1-b5cc-c780d2860ce0 and operator-fault cancellation f50e3f3e-df80-4f25-8c1b-abb41d57a365.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674867185",
  "device_ref": "sandbox-26547"
}
```

```json
{
  "challenge_id": "f8785ac4-ebe2-4dac-90b5-e8b2d36271d4",
  "expires_at": "2026-10-29T15:52:52.256843212Z",
  "resend_available_at": "2026-10-29T15:47:53.256843212Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674867185` → **200**

```json
{
  "phone": "+380674867185",
  "audience": "CLIENT",
  "code": "852814",
  "sent_at": "2026-10-29T15:47:52.259458338Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677033860",
  "device_ref": "sandbox-2025",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "68e544a9-80ad-4682-874d-366aa4227bc5",
  "expires_at": "2026-10-29T15:52:53.776186652Z",
  "resend_available_at": "2026-10-29T15:47:54.776186652Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677033860` → **200**

```json
{
  "phone": "+380677033860",
  "audience": "CLIENT",
  "code": "747261",
  "sent_at": "2026-10-29T15:47:53.779469102Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677033860",
  "device_ref": "sandbox-2187",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "511cafe4-a9fa-4ce4-ae44-a25a96fda1df",
  "expires_at": "2026-10-29T15:52:55.273156913Z",
  "resend_available_at": "2026-10-29T15:47:56.273156913Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677033860` → **200**

```json
{
  "phone": "+380677033860",
  "audience": "CLIENT",
  "code": "998698",
  "sent_at": "2026-10-29T15:47:55.275965602Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675880000",
  "device_ref": "sandbox-9235"
}
```

```json
{
  "challenge_id": "3a18bbe7-ff7c-43e1-b2ec-5ef2b9a9cb30",
  "expires_at": "2026-10-29T15:52:56.782301042Z",
  "resend_available_at": "2026-10-29T15:47:57.782301042Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675880000",
  "device_ref": "sandbox-18899"
}
```

```json
{
  "challenge_id": "fe4706ad-2014-4494-a79a-a4d3df76eb66",
  "expires_at": "2026-10-29T15:52:58.278032523Z",
  "resend_available_at": "2026-10-29T15:47:59.278032523Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675880000` → **200**

```json
{
  "phone": "+380675880000",
  "audience": "CLIENT",
  "code": "118073",
  "sent_at": "2026-10-29T15:47:58.281480019Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675880000",
  "device_ref": "sandbox-30353",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "0a69c34d-a92c-488c-80bc-fe480f7ba9be",
  "expires_at": "2026-10-29T15:52:59.777566693Z",
  "resend_available_at": "2026-10-29T15:48:00.777566693Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675880000` → **200**

```json
{
  "phone": "+380675880000",
  "audience": "CLIENT",
  "code": "545490",
  "sent_at": "2026-10-29T15:47:59.780376401Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380675880000",
  "device_ref": "sandbox-28451",
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
  "correlation_id": "cc337dda-983f-4133-86f6-d256a9dfe6f3",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000007663"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "e2d0263d-286e-45ec-a1f7-98413d3395f8"
}
```

`GET /sandbox/v1/otp?phone=%2B442000007663` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120011514"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "0b78344e-6172-42d3-ae40-13e6823732c3"
}
```

`GET /sandbox/v1/otp?phone=%2B37120011514` → **404**

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
  "session_id": "677dadf7-f1b6-4938-88cb-68535d65af59",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk3ODIsImlhdCI6MTc5MzI4ODg4MiwianRpIjoiNzAzMmEzZGQtYjBkNy00ZDhjLWI3ZmYtM2JlNDMyZTUwZjU0Iiwic2lkIjoiNjc3ZGFkZjctZjFiNi00OTM4LTg4Y2ItNjg1MzVkNjVhZjU5In0.IUXP3NCOgemNalofifuq1fQ-tM-qw_h_PCD95K_jzS4",
  "access_expires_at": "2026-10-29T16:03:02.456060885Z",
  "refresh_token": "eDJ_r7iJv-kM4hn-iKABpS5Jo43-PYFaqYtJXw4AQUg",
  "refresh_expires_at": "2026-10-30T03:48:02.455441971Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675880000` → **200**

```json
{
  "deliveries": [
    {
      "id": "51e7b2be-6e1d-47e1-b585-ee9a1a9c943f",
      "challenge_id": "0a69c34d-a92c-488c-80bc-fe480f7ba9be",
      "phone": "+380675880000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-0750ff46-2a65-4dc9-a8a7-f15876864422",
      "error": null,
      "attempted_at": "2026-10-29T15:47:59.780618Z"
    },
    {
      "id": "8e8d2b5d-40b3-4efd-ae5c-029bccbd4fed",
      "challenge_id": "fe4706ad-2014-4494-a79a-a4d3df76eb66",
      "phone": "+380675880000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-e913de08-3cd8-420b-b583-f688f4e2cb08",
      "error": null,
      "attempted_at": "2026-10-29T15:47:58.281724Z"
    },
    {
      "id": "6ec08c71-6111-4df1-b970-2e621f8c68a2",
      "challenge_id": "3a18bbe7-ff7c-43e1-b2ec-5ef2b9a9cb30",
      "phone": "+380675880000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-29T15:47:56.784741Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380675880000` → **200**

```json
{
  "phone": "+380675880000",
  "audience": "CLIENT",
  "code": "545490",
  "sent_at": "2026-10-29T15:47:59.780376401Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677033860` → **200**

```json
{
  "deliveries": [
    {
      "id": "40af14dd-b6c2-4c6f-bc2f-0c26aee59e3e",
      "challenge_id": "511cafe4-a9fa-4ce4-ae44-a25a96fda1df",
      "phone": "+380677033860",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-027d5bf2-3604-4ac1-89b6-f519960a34a6",
      "error": null,
      "attempted_at": "2026-10-29T15:47:55.27629Z"
    },
    {
      "id": "800f331a-845d-4fd8-8ffd-6af436fd7e21",
      "challenge_id": "68e544a9-80ad-4682-874d-366aa4227bc5",
      "phone": "+380677033860",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-59b565bb-af35-40c3-9449-c66b9af71cbb",
      "error": null,
      "attempted_at": "2026-10-29T15:47:53.779891Z"
    }
  ]
}
```

Done: SMS to +380674867185; SMS then a call to +380677033860; a failed SMS, two calls and a refused third to +380675880000; +44 and +371 refused.

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
  "session_id": "67c257d0-d711-4357-9c53-e43c46f56119",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk3ODMsImlhdCI6MTc5MzI4ODg4MywianRpIjoiMGY1NTA1ZGQtYmI0NC00OWNkLTk0OWEtOWM3NmE0NWNjZmVhIiwic2lkIjoiNjdjMjU3ZDAtZDcxMS00MzU3LTljNTMtZTQzYzQ2ZjU2MTE5In0.h2F3Kb_RycKAuELhmiSwoaAU8jypOdNeIQ5GhL2RdXg",
  "access_expires_at": "2026-10-29T16:03:03.658358295Z",
  "refresh_token": "QW9X_D3RWmdBwZcaxH-_1sZomSXhFTQO2wajEz66lAs",
  "refresh_expires_at": "2026-10-30T03:48:03.657587037Z",
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
  "session_id": "643c5a6a-9519-46d8-b31c-5bed84a09baf",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk3ODQsImlhdCI6MTc5MzI4ODg4NCwianRpIjoiMTUyNTY1NTYtZDgyZC00MmIyLWE5NjgtZTgwYjVjM2JmMGI0Iiwic2lkIjoiNjQzYzVhNmEtOTUxOS00NmQ4LWIzMWMtNWJlZDg0YTA5YmFmIn0.mX4RVlGNzi8CtnR3JxeitDlQxddY6-bnfAJI_DwdwMc",
  "access_expires_at": "2026-10-29T16:03:04.230393426Z",
  "refresh_token": "OZQbJFn-4CsJqUwX_MKUy62vXibur6sALjOQJvocjZA",
  "refresh_expires_at": "2026-10-30T03:48:04.229762086Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
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

`POST /api/admin/v1/staff-extensions/a6054afe-c79b-4c0e-8599-cb7f7935f22d` → **200**

```json
{
  "command_id": "4c987d85-a03e-41af-af09-5977dba192d4",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "990cd70b-87b4-4d75-bd98-0aaef48e1c2c",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T15:48:05.352773Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T15:48:05.352773Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "20656868-32ff-4961-b601-ba64472f4769",
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
  "id": "7cefb6ac-ab57-4b2f-a164-6761863cc003",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:53:05.905710Z",
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
  "command_id": "17775128-13fd-40c3-9436-4ea1e80f12a2",
  "quote_id": "7cefb6ac-ab57-4b2f-a164-6761863cc003",
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
    "phone": "+380678032763"
  }
}
```

```json
{
  "id": "a41c2d9b-5449-456d-b7be-219183dbff8a",
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
  "created_at": "2026-10-29T15:48:06.201172Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678032763"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/a41c2d9b-5449-456d-b7be-219183dbff8a/calls` → **201**

```json
{
  "command_id": "99a1fdae-3fa9-4c9c-b0ad-a9869a24532f",
  "to": "CALLER"
}
```

```json
{
  "id": "b9d721b6-e515-489a-aec2-2242b3570b39",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
  "order_ids": [
    "a41c2d9b-5449-456d-b7be-219183dbff8a"
  ],
  "started_at": "2026-10-29T15:48:06.511874Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/a41c2d9b-5449-456d-b7be-219183dbff8a/calls` → **201**

```json
{
  "command_id": "99a1fdae-3fa9-4c9c-b0ad-a9869a24532f",
  "to": "CALLER"
}
```

```json
{
  "id": "b9d721b6-e515-489a-aec2-2242b3570b39",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
  "order_ids": [
    "a41c2d9b-5449-456d-b7be-219183dbff8a"
  ],
  "started_at": "2026-10-29T15:48:06.511874Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "b9d721b6-e515-489a-aec2-2242b3570b39",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380678032763",
    "at": "2026-10-29T15:48:06.514130728Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "b9d721b6-e515-489a-aec2-2242b3570b39",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.18078",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "b9d721b6-e515-489a-aec2-2242b3570b39"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "b9d721b6-e515-489a-aec2-2242b3570b39",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=a41c2d9b-5449-456d-b7be-219183dbff8a` → **200**

```json
{
  "calls": [
    {
      "id": "b9d721b6-e515-489a-aec2-2242b3570b39",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
      "order_ids": [
        "a41c2d9b-5449-456d-b7be-219183dbff8a"
      ],
      "started_at": "2026-10-29T15:48:06.511874Z",
      "answered_at": "2026-10-29T15:48:07.148276Z",
      "ended_at": "2026-10-29T15:48:07.169076Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=a41c2d9b-5449-456d-b7be-219183dbff8a` → **200**

```json
{
  "calls": [
    {
      "id": "b9d721b6-e515-489a-aec2-2242b3570b39",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
      "order_ids": [
        "a41c2d9b-5449-456d-b7be-219183dbff8a"
      ],
      "started_at": "2026-10-29T15:48:06.511874Z",
      "answered_at": "2026-10-29T15:48:07.148276Z",
      "ended_at": "2026-10-29T15:48:07.169076Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T15:48:07.780753Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/a41c2d9b-5449-456d-b7be-219183dbff8a` → **200**

```json
{
  "id": "a41c2d9b-5449-456d-b7be-219183dbff8a",
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
  "created_at": "2026-10-29T15:48:06.201172Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678032763"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a41c2d9b-5449-456d-b7be-219183dbff8a/cancel` → **200**

```json
{
  "command_id": "af0c03ea-3ebf-4954-9514-466c2de58711",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "a41c2d9b-5449-456d-b7be-219183dbff8a",
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
  "created_at": "2026-10-29T15:48:06.201172Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678032763"
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
  "command_id": "265045e3-dc50-4598-a391-68129e86c991",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-29T15:48:10.431122Z",
  "extension": "101"
}
```

Done: outgoing call b9d721b6-e515-489a-aec2-2242b3570b39 from order a41c2d9b-5449-456d-b7be-219183dbff8a, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636641825",
  "device_ref": "sandbox-12316"
}
```

```json
{
  "challenge_id": "5d04a732-324b-4aa0-acd6-6367fec5dd07",
  "expires_at": "2026-10-29T15:53:10.713180725Z",
  "resend_available_at": "2026-10-29T15:48:11.713180725Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636641825` → **200**

```json
{
  "phone": "+380636641825",
  "audience": "CLIENT",
  "code": "812015",
  "sent_at": "2026-10-29T15:48:10.71562953Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5d04a732-324b-4aa0-acd6-6367fec5dd07",
  "code": "812015",
  "device_ref": "sandbox-12316"
}
```

```json
{
  "session_id": "24782c8c-8a33-4685-9909-1b14888201e1",
  "subject": {
    "type": "CLIENT",
    "id": "766de122-ed77-4340-bf9b-70a1df94f391"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NjZkZTEyMi1lZDc3LTQzNDAtYmY5Yi03MGExZGY5NGYzOTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NzkxLCJpYXQiOjE3OTMyODg4OTEsImp0aSI6IjVjZTNmN2VmLWMzOTEtNDYxYS1iOWE3LTliMzlhNzIxM2ViMSIsInNpZCI6IjI0NzgyYzhjLThhMzMtNDY4NS05OTA5LTFiMTQ4ODgyMDFlMSJ9.8jRLFfy99t8oaRGFUJnNZ2GrCBp_Q5XccIhmGvYBYdM",
  "access_expires_at": "2026-10-29T16:03:11.020993194Z",
  "refresh_token": "y09xKn_TIuSk-UFBXrmJYt8-HygS2o8wEsCPO67etlQ",
  "refresh_expires_at": "2026-11-28T15:48:11.020214272Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "766de122-ed77-4340-bf9b-70a1df94f391",
  "session_id": "24782c8c-8a33-4685-9909-1b14888201e1",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636641825",
  "device_ref": "sandbox-9767"
}
```

```json
{
  "challenge_id": "e02aa779-de33-407f-b14a-e94554e7a603",
  "expires_at": "2026-10-29T15:53:13.558390627Z",
  "resend_available_at": "2026-10-29T15:48:14.558390627Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636641825` → **200**

```json
{
  "phone": "+380636641825",
  "audience": "CLIENT",
  "code": "314348",
  "sent_at": "2026-10-29T15:48:13.561022253Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e02aa779-de33-407f-b14a-e94554e7a603",
  "code": "314348",
  "device_ref": "sandbox-9767"
}
```

```json
{
  "session_id": "9583daf7-c777-4c85-aa11-b3c2fc12bf20",
  "subject": {
    "type": "CLIENT",
    "id": "766de122-ed77-4340-bf9b-70a1df94f391"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NjZkZTEyMi1lZDc3LTQzNDAtYmY5Yi03MGExZGY5NGYzOTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NzkzLCJpYXQiOjE3OTMyODg4OTMsImp0aSI6IjE2YjBjYmMyLWIwZTItNGU1Ny05YTFjLTBiODg3MjVjNGU2YiIsInNpZCI6Ijk1ODNkYWY3LWM3NzctNGM4NS1hYTExLWIzYzJmYzEyYmYyMCJ9.ucbSklovHddM7dtC58A6pVjwRbQvVq-WrZMi-PK5SRI",
  "access_expires_at": "2026-10-29T16:03:13.867662734Z",
  "refresh_token": "qMiDzJi-cpR34q0xjUo4cto0mMHAfahZzOKBMrs0CXI",
  "refresh_expires_at": "2026-11-28T15:48:13.867133097Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "948f22cf-fb01-4d4f-b231-dda69770bb56",
  "expires_at": "2026-10-29T15:53:16.157599366Z",
  "resend_available_at": "2026-10-29T15:48:17.157599366Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636641825` → **200**

```json
{
  "phone": "+380636641825",
  "audience": "CLIENT",
  "code": "083487",
  "sent_at": "2026-10-29T15:48:16.16001478Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380638691901"
}
```

```json
{
  "challenge_id": "fc7f094b-697a-45ed-94c0-6881fa14eb3b",
  "expires_at": "2026-10-29T15:53:16.454592526Z",
  "resend_available_at": "2026-10-29T15:48:17.454592526Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638691901` → **200**

```json
{
  "phone": "+380638691901",
  "audience": "CLIENT",
  "code": "644363",
  "sent_at": "2026-10-29T15:48:16.456757846Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "b629f887-e1dc-4944-9ce9-561ea6ce15c1",
  "current_challenge_id": "948f22cf-fb01-4d4f-b231-dda69770bb56",
  "current_code": "000000",
  "new_challenge_id": "fc7f094b-697a-45ed-94c0-6881fa14eb3b",
  "new_code": "644363"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "7eb61aae-83c7-4cd1-80a9-b0dafec32680"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "23aac28f-b348-431c-aa81-23c760d149b7",
  "current_challenge_id": "948f22cf-fb01-4d4f-b231-dda69770bb56",
  "current_code": "083487",
  "new_challenge_id": "fc7f094b-697a-45ed-94c0-6881fa14eb3b",
  "new_code": "644363"
}
```

```json
{
  "subject_id": "766de122-ed77-4340-bf9b-70a1df94f391",
  "phone": "+380638691901",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "766de122-ed77-4340-bf9b-70a1df94f391",
  "session_id": "24782c8c-8a33-4685-9909-1b14888201e1",
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
  "correlation_id": "c6e0b02c-0cd1-4ebf-8ec4-c758514fc56c"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638691901",
  "device_ref": "sandbox-5941"
}
```

```json
{
  "challenge_id": "2dee7f62-132b-4bdf-bf37-cd4f63860bb3",
  "expires_at": "2026-10-29T15:53:19.89492624Z",
  "resend_available_at": "2026-10-29T15:48:20.89492624Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638691901` → **200**

```json
{
  "phone": "+380638691901",
  "audience": "CLIENT",
  "code": "559936",
  "sent_at": "2026-10-29T15:48:19.897766669Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2dee7f62-132b-4bdf-bf37-cd4f63860bb3",
  "code": "559936",
  "device_ref": "sandbox-5941"
}
```

```json
{
  "session_id": "d9c1c308-9e4c-4292-b00f-f7154c9548f5",
  "subject": {
    "type": "CLIENT",
    "id": "766de122-ed77-4340-bf9b-70a1df94f391"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NjZkZTEyMi1lZDc3LTQzNDAtYmY5Yi03MGExZGY5NGYzOTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5ODAwLCJpYXQiOjE3OTMyODg5MDAsImp0aSI6ImQ4NzQ0Zjc5LThlMTYtNGUzNC04MTNjLTJhZDJhNjU0NDJiYiIsInNpZCI6ImQ5YzFjMzA4LTllNGMtNDI5Mi1iMDBmLWY3MTU0Yzk1NDhmNSJ9.zgeXZXLb-rHD2RH2KRumLmQOAjuqvTB5upR7bA-cPt8",
  "access_expires_at": "2026-10-29T16:03:20.212810234Z",
  "refresh_token": "XqB0hbZn2ZlNEfn0BSuQ3HDHDoajljeOmujYEb46AXo",
  "refresh_expires_at": "2026-11-28T15:48:20.212255374Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "766de122-ed77-4340-bf9b-70a1df94f391",
  "session_id": "d9c1c308-9e4c-4292-b00f-f7154c9548f5",
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
  "session_id": "f6bf37ca-11ed-4392-8e24-07becc91335b",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4MDEsImlhdCI6MTc5MzI4ODkwMSwianRpIjoiYzFmMDlmMTEtMzVjNC00ODQ4LTkzN2EtMTVjOWZlMTliNmE4Iiwic2lkIjoiZjZiZjM3Y2EtMTFlZC00MzkyLThlMjQtMDdiZWNjOTEzMzViIn0.jMMAHc0p9FFcM1AGF5l-VLVmr9sysBtMdzWppw8JYsE",
  "access_expires_at": "2026-10-29T16:03:21.033010678Z",
  "refresh_token": "sEDlBOpVAYuXR6mtnm-ZEs1hdRh1LMBavJDHPNd5-cg",
  "refresh_expires_at": "2026-10-30T03:48:21.032404527Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/766de122-ed77-4340-bf9b-70a1df94f391` → **200**

```json
{
  "client": {
    "id": "766de122-ed77-4340-bf9b-70a1df94f391",
    "phone": "+380638691901",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T15:48:11.017948Z",
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

`POST /api/admin/v1/clients/766de122-ed77-4340-bf9b-70a1df94f391/phone/new-code` → **201**

```json
{
  "phone": "+380634614709"
}
```

```json
{
  "challenge_id": "d4200ac9-8b87-4a02-9bb7-85e99d35d0c4",
  "expires_at": "2026-10-29T15:53:21.628905533Z",
  "resend_available_at": "2026-10-29T15:48:22.628905533Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634614709` → **200**

```json
{
  "phone": "+380634614709",
  "audience": "CLIENT",
  "code": "080433",
  "sent_at": "2026-10-29T15:48:21.63134455Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/766de122-ed77-4340-bf9b-70a1df94f391/phone` → **422**

```json
{
  "command_id": "4b7557f1-4cfb-4d6b-b7a9-d8af43f174c8",
  "expected_version": 3,
  "new_challenge_id": "d4200ac9-8b87-4a02-9bb7-85e99d35d0c4",
  "new_code": "080434",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/766de122-ed77-4340-bf9b-70a1df94f391/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "7ff65c4b-eab5-4720-8cf1-ec54129d7aff"
}
```

`POST /api/admin/v1/clients/766de122-ed77-4340-bf9b-70a1df94f391/phone` → **400**

```json
{
  "command_id": "3f11357a-64a8-4c13-9527-ed5c4db8d3e7",
  "expected_version": 3,
  "new_challenge_id": "d4200ac9-8b87-4a02-9bb7-85e99d35d0c4",
  "new_code": "080433",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/766de122-ed77-4340-bf9b-70a1df94f391/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "a8a7621d-0ef5-4634-83dc-11a4ed791977",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/766de122-ed77-4340-bf9b-70a1df94f391/phone` → **200**

```json
{
  "command_id": "121ebbac-055a-4388-af81-4d66f07edb60",
  "expected_version": 3,
  "new_challenge_id": "d4200ac9-8b87-4a02-9bb7-85e99d35d0c4",
  "new_code": "080433",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "766de122-ed77-4340-bf9b-70a1df94f391",
  "phone": "+380634614709",
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
  "correlation_id": "0de02eba-ae3a-49a0-bbde-bb3c259dab3f"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634614709",
  "device_ref": "sandbox-14528"
}
```

```json
{
  "challenge_id": "f8fb762e-1c73-44c0-bcac-249c1899a01d",
  "expires_at": "2026-10-29T15:53:23.072674868Z",
  "resend_available_at": "2026-10-29T15:48:24.072674868Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634614709` → **200**

```json
{
  "phone": "+380634614709",
  "audience": "CLIENT",
  "code": "193364",
  "sent_at": "2026-10-29T15:48:23.075731627Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f8fb762e-1c73-44c0-bcac-249c1899a01d",
  "code": "193364",
  "device_ref": "sandbox-14528"
}
```

```json
{
  "session_id": "729cf4ef-2b0b-4fc6-ae94-e36dacd35ffb",
  "subject": {
    "type": "CLIENT",
    "id": "766de122-ed77-4340-bf9b-70a1df94f391"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NjZkZTEyMi1lZDc3LTQzNDAtYmY5Yi03MGExZGY5NGYzOTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5ODAzLCJpYXQiOjE3OTMyODg5MDMsImp0aSI6ImI4OWUxNmQwLTlhYTEtNGQxZS04ZTBhLTlhNTJmMDA0MjYyNiIsInNpZCI6IjcyOWNmNGVmLTJiMGItNGZjNi1hZTk0LWUzNmRhY2QzNWZmYiJ9.tep4-T4aGpfWSzgYHSqyXlTqAlu7T5g_nat61HoGc90",
  "access_expires_at": "2026-10-29T16:03:23.375810793Z",
  "refresh_token": "lzfceyEW_4S-ieE8Nyd-Mj8V37BaJr_wZunbD2uAYME",
  "refresh_expires_at": "2026-11-28T15:48:23.375177185Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "766de122-ed77-4340-bf9b-70a1df94f391",
  "session_id": "729cf4ef-2b0b-4fc6-ae94-e36dacd35ffb",
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
  "phone": "+380635766873",
  "device_ref": "sandbox-16589"
}
```

```json
{
  "challenge_id": "9b076139-7199-4247-8fdf-d47f978e2fec",
  "expires_at": "2026-10-29T15:53:23.926360922Z",
  "resend_available_at": "2026-10-29T15:48:24.926360922Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635766873` → **200**

```json
{
  "phone": "+380635766873",
  "audience": "CLIENT",
  "code": "128570",
  "sent_at": "2026-10-29T15:48:23.928815749Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9b076139-7199-4247-8fdf-d47f978e2fec",
  "code": "128570",
  "device_ref": "sandbox-16589"
}
```

```json
{
  "session_id": "6e8530a6-317f-4130-b9e2-d1f31c77a33b",
  "subject": {
    "type": "CLIENT",
    "id": "b258dc70-1b67-4c27-a368-c8759b10ad90"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMjU4ZGM3MC0xYjY3LTRjMjctYTM2OC1jODc1OWIxMGFkOTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5ODA0LCJpYXQiOjE3OTMyODg5MDQsImp0aSI6ImNmZTlhMzNlLTJhNGEtNGE2OC05Y2Y5LTQ0NTgwNjM1YTFlMyIsInNpZCI6IjZlODUzMGE2LTMxN2YtNDEzMC1iOWUyLWQxZjMxYzc3YTMzYiJ9.AFWfHPXO7jPdjLiVnkJ-8O2I0zU1-jeg5RWDDM-ut90",
  "access_expires_at": "2026-10-29T16:03:24.22205144Z",
  "refresh_token": "LMIl1wwMuGplhzuNLmdoAajoiJ-dtmWDkpYZNg8Z_Gs",
  "refresh_expires_at": "2026-11-28T15:48:24.221528575Z",
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
  "session_id": "c85ba67c-1937-4bbe-8e7c-2818972bbd61",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4MDUsImlhdCI6MTc5MzI4ODkwNSwianRpIjoiM2Q1NmQ5NzktODZjYS00NmI0LWI3NzQtZmY1NmNjYjY2MWY5Iiwic2lkIjoiYzg1YmE2N2MtMTkzNy00YmJlLThlN2MtMjgxODk3MmJiZDYxIn0.42hCWCtibKrQKD3kZAFwZzCvVh6huPKzpFHsDlqSjhI",
  "access_expires_at": "2026-10-29T16:03:25.376728728Z",
  "refresh_token": "bvMA6UH2ji54Uvozi7LO6ODyHD_U_nmokbfThmd_ll0",
  "refresh_expires_at": "2026-10-30T03:48:25.376186807Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380635766873` → **200**

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
  "correlation_id": "782dcb9b-ee8f-41c2-adfb-7d545d99c0cd"
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
  "session_id": "e954f8e0-b7d2-4d9c-9a5c-6a5ccb02c3b1",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4MDYsImlhdCI6MTc5MzI4ODkwNiwianRpIjoiMTFjZDM4NDItYjI3NS00NmUwLThhYTMtMGJiODU4ZWU3NDdlIiwic2lkIjoiZTk1NGY4ZTAtYjdkMi00ZDljLTlhNWMtNmE1Y2NiMDJjM2IxIn0.QyV73oAZUjuRkJ3xDv4tkCsrgCudigqACBbxQ3tTGWg",
  "access_expires_at": "2026-10-29T16:03:26.519270549Z",
  "refresh_token": "p3699svt9xUPArM9OgYR7-8rT3hSthVi176MQovqI1g",
  "refresh_expires_at": "2026-10-30T03:48:26.518684086Z",
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
  "changed_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T15:44:28.845178Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "69a42146-7ca3-4ffd-a3f8-d6b4e9a53fa7",
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
  "changed_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-29T15:48:27.077709875Z"
}
```

## The rider books the airport for 2026-10-29T18:48:26Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600116353",
  "device_ref": "sandbox-25002"
}
```

```json
{
  "challenge_id": "f096a79d-4c64-42aa-ae45-ce97a64272e2",
  "expires_at": "2026-10-29T15:53:27.369028583Z",
  "resend_available_at": "2026-10-29T15:48:28.369028583Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600116353` → **200**

```json
{
  "phone": "+48600116353",
  "audience": "CLIENT",
  "code": "051745",
  "sent_at": "2026-10-29T15:48:27.3718822Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f096a79d-4c64-42aa-ae45-ce97a64272e2",
  "code": "051745",
  "device_ref": "sandbox-25002"
}
```

```json
{
  "session_id": "9726fa39-ef03-449c-94ee-eb84abf09ed7",
  "subject": {
    "type": "CLIENT",
    "id": "6e83290c-3485-469a-9d50-41cc22db2af4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTgzMjkwYy0zNDg1LTQ2OWEtOWQ1MC00MWNjMjJkYjJhZjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5ODA3LCJpYXQiOjE3OTMyODg5MDcsImp0aSI6IjAwODJmM2NiLTlkODItNDY2Yi1hMjc1LWJiMTE4ZGYzNjk4OCIsInNpZCI6Ijk3MjZmYTM5LWVmMDMtNDQ5Yy05NGVlLWViODRhYmYwOWVkNyJ9.uMdmp8ajm3iZGdeObFw3UGpe7aAO3Ox93zcvgoubfgY",
  "access_expires_at": "2026-10-29T16:03:27.676731234Z",
  "refresh_token": "LPs-ZA1sCK2BPK_xpn8KfWOdzQh70ppcBmJhoVQR6ec",
  "refresh_expires_at": "2026-11-28T15:48:27.676136256Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6a45c489-67c9-4cd4-8e5c-d2ceaeef8601",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-29T18:48:26Z"
}
```

```json
{
  "id": "fa52007b-1620-4a33-bcd3-e518da1334ca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:53:27.987087Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T18:48:26Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "fe7aad20-a0c3-4d0a-9b18-ad22aff04101",
  "quote_id": "fa52007b-1620-4a33-bcd3-e518da1334ca",
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
  "pickup_at": "2026-10-29T18:48:26Z"
}
```

```json
{
  "id": "c21705c8-2d5b-4888-815a-bb6e9005550f",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "6e83290c-3485-469a-9d50-41cc22db2af4",
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
  "created_at": "2026-10-29T15:48:28.290801Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T18:48:26Z",
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
  "device_ref": "sandbox-6130"
}
```

```json
{
  "challenge_id": "117062b9-a3e8-494d-b55d-69df284d0d56",
  "expires_at": "2026-10-29T15:53:28.582476331Z",
  "resend_available_at": "2026-10-29T15:48:29.582476331Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "405426",
  "sent_at": "2026-10-29T15:48:28.585151989Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "117062b9-a3e8-494d-b55d-69df284d0d56",
  "code": "405426",
  "device_ref": "sandbox-6130"
}
```

```json
{
  "session_id": "941c4ccb-9c8a-40e4-ba88-14ddae78a217",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTgwOCwiaWF0IjoxNzkzMjg4OTA4LCJqdGkiOiJhNjhhMTViNC1hNmExLTQzOTAtYmJlYy0yM2NiN2VkNTY4YmEiLCJzaWQiOiI5NDFjNGNjYi05YzhhLTQwZTQtYmE4OC0xNGRkYWU3OGEyMTcifQ.CvQdLkDDGnE-WUjn47lW_RbdYXdNHZY_GDd5EiMIsTU",
  "access_expires_at": "2026-10-29T16:03:28.882161668Z",
  "refresh_token": "fuAMNrtgp6gaR8WGhlm72zU_UFORiKqMW-7t16KAWbc",
  "refresh_expires_at": "2026-11-28T15:48:28.881616141Z",
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
  "command_id": "26c75440-b54b-446e-9b8d-a0a57b311e90",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:48:29Z",
    "sequence": 1793288909432
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4e801175-11ba-43c8-9370-c32c140f920d",
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
  "last_heartbeat_at": "2026-10-29T15:48:29.449764Z",
  "last_location_at": "2026-10-29T15:48:29.449764Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "c21705c8-2d5b-4888-815a-bb6e9005550f",
      "short_number": 24,
      "pickup_at": "2026-10-29T18:48:26Z",
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

`POST /api/driver/v1/preorders/c21705c8-2d5b-4888-815a-bb6e9005550f/reserve` → **200**

```json
{
  "command_id": "8b7700d7-1a32-4a81-bfba-3780c48a572d"
}
```

```json
{
  "id": "0bf29406-ad80-47f4-b057-3cf15e824bbe",
  "state": "RESERVED",
  "order": {
    "order_id": "c21705c8-2d5b-4888-815a-bb6e9005550f",
    "short_number": 24,
    "pickup_at": "2026-10-29T18:48:26Z",
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
  "reserved_at": "2026-10-29T15:48:30.035614Z",
  "confirm_from": "2026-10-29T18:18:26Z",
  "confirm_until": "2026-10-29T18:28:26Z",
  "drop_until": "2026-10-29T17:48:26Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "0bf29406-ad80-47f4-b057-3cf15e824bbe",
      "state": "RESERVED",
      "order": {
        "order_id": "c21705c8-2d5b-4888-815a-bb6e9005550f",
        "short_number": 24,
        "pickup_at": "2026-10-29T18:48:26Z",
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
      "reserved_at": "2026-10-29T15:48:30.035614Z",
      "confirm_from": "2026-10-29T18:18:26Z",
      "confirm_until": "2026-10-29T18:28:26Z",
      "drop_until": "2026-10-29T17:48:26Z"
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
      "id": "0bf29406-ad80-47f4-b057-3cf15e824bbe",
      "state": "RESERVED",
      "order": {
        "order_id": "c21705c8-2d5b-4888-815a-bb6e9005550f",
        "short_number": 24,
        "pickup_at": "2026-10-29T18:48:26Z",
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
      "reserved_at": "2026-10-29T15:48:30.035614Z",
      "confirm_from": "2026-10-29T18:18:26Z",
      "confirm_until": "2026-10-29T18:28:26Z",
      "drop_until": "2026-10-29T17:48:26Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/0bf29406-ad80-47f4-b057-3cf15e824bbe/confirm` → **409**

```json
{
  "command_id": "6d2865fd-6483-49f5-b3b6-939370a583f0"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/0bf29406-ad80-47f4-b057-3cf15e824bbe/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "17e62a16-539c-4122-a8d0-3ee2a21b3363"
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
  "session_id": "e2d91f69-0430-463c-8d7a-928d6a4f6186",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4MTEsImlhdCI6MTc5MzI4ODkxMSwianRpIjoiNzhmMzliNWQtMjNhYi00NzcyLTkxYmUtNmY2MmJkZmNjNWQzIiwic2lkIjoiZTJkOTFmNjktMDQzMC00NjNjLThkN2EtOTI4ZDZhNGY2MTg2In0.YUg8wsU8ZgXNsa-3oLNUtSNfeeTBHF0PX3jbOa-S-8Q",
  "access_expires_at": "2026-10-29T16:03:31.436117181Z",
  "refresh_token": "iX3FfvP_h4hL3ojRFl0HGqhy1fHUmAbrZNLd0aij6Ng",
  "refresh_expires_at": "2026-10-30T03:48:31.435640232Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c21705c8-2d5b-4888-815a-bb6e9005550f` → **200**

```json
{
  "id": "c21705c8-2d5b-4888-815a-bb6e9005550f",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "6e83290c-3485-469a-9d50-41cc22db2af4",
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
  "created_at": "2026-10-29T15:48:28.290801Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-29T18:48:26Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "0bf29406-ad80-47f4-b057-3cf15e824bbe",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-29T15:48:30.035614Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/c21705c8-2d5b-4888-815a-bb6e9005550f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-29T15:48:28.292014Z",
      "actor": {
        "type": "CLIENT",
        "id": "6e83290c-3485-469a-9d50-41cc22db2af4",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "c21705c8-2d5b-4888-815a-bb6e9005550f",
        "preorder": true,
        "quote_id": "fa52007b-1620-4a33-bcd3-e518da1334ca",
        "pickup_at": "2026-10-29T18:48:26Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "df1316b7-ec36-459d-9fe5-9906ec6d66ef"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-29T15:48:30.036707Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c21705c8-2d5b-4888-815a-bb6e9005550f",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "0bf29406-ad80-47f4-b057-3cf15e824bbe"
      },
      "correlation_id": "c438f488-e7f3-404d-99c0-07957025eb3a"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order c21705c8-2d5b-4888-815a-bb6e9005550f, reservation 0bf29406-ad80-47f4-b057-3cf15e824bbe.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-17123"
}
```

```json
{
  "challenge_id": "5af7ba02-b9dc-46f5-9112-c2cb2cd0bbf6",
  "expires_at": "2026-10-29T15:53:32.292096524Z",
  "resend_available_at": "2026-10-29T15:48:33.292096524Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "846370",
  "sent_at": "2026-10-29T15:48:32.294653772Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5af7ba02-b9dc-46f5-9112-c2cb2cd0bbf6",
  "code": "846370",
  "device_ref": "sandbox-17123"
}
```

```json
{
  "session_id": "d26674a4-eeb8-4171-b8c3-239cb3ce071e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTgxMiwiaWF0IjoxNzkzMjg4OTEyLCJqdGkiOiJmNWQzMTg5ZS05ODczLTQ4ZTYtYTZjOC1kNjVmZmYzMWI5NWIiLCJzaWQiOiJkMjY2NzRhNC1lZWI4LTQxNzEtYjhjMy0yMzljYjNjZTA3MWUifQ._Mzp8RlB08JkvkmllmYhUePgmFuZWwAoJonkBh1lDOg",
  "access_expires_at": "2026-10-29T16:03:32.595924198Z",
  "refresh_token": "QnZYwCPkvgnM5Ptj7NIrcZUb2sPMkKzlobP4fLLiZhM",
  "refresh_expires_at": "2026-11-28T15:48:32.595415309Z",
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
  "command_id": "4cf050d3-c9c8-45ef-bfd4-ffe38c735154",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:48:33Z",
    "sequence": 1793288913154
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d2af2caa-1cec-4277-b57a-04c750317dfd",
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
  "last_heartbeat_at": "2026-10-29T15:48:33.172524Z",
  "last_location_at": "2026-10-29T15:48:33.172524Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672806347",
  "device_ref": "sandbox-29052"
}
```

```json
{
  "challenge_id": "6b20b322-b86f-4de4-be86-f9865c2393f6",
  "expires_at": "2026-10-29T15:53:33.461269579Z",
  "resend_available_at": "2026-10-29T15:48:34.461269579Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672806347` → **200**

```json
{
  "phone": "+380672806347",
  "audience": "CLIENT",
  "code": "733570",
  "sent_at": "2026-10-29T15:48:33.465308487Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6b20b322-b86f-4de4-be86-f9865c2393f6",
  "code": "733570",
  "device_ref": "sandbox-29052"
}
```

```json
{
  "session_id": "82589185-d747-466d-a122-cb02308a5b78",
  "subject": {
    "type": "CLIENT",
    "id": "c30e5a06-0121-42e1-8148-3ef494d80116"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMzBlNWEwNi0wMTIxLTQyZTEtODE0OC0zZWY0OTRkODAxMTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5ODEzLCJpYXQiOjE3OTMyODg5MTMsImp0aSI6IjFiOTQ2ODhlLWRiYmEtNDhkYy04Mjg2LWJkYjJmNjNiNWQ2MCIsInNpZCI6IjgyNTg5MTg1LWQ3NDctNDY2ZC1hMTIyLWNiMDIzMDhhNWI3OCJ9.I-b621kwix_OkoOnyTTjhSwA3nfb_wDKmWgB3DRGoVo",
  "access_expires_at": "2026-10-29T16:03:33.764708645Z",
  "refresh_token": "40tm1xu3KeQZipivWUeHnePYI40abnZD5iuBr2iD9kM",
  "refresh_expires_at": "2026-11-28T15:48:33.764009712Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bcf763b8-95e7-4e04-a42c-03f5c690e483",
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
  "id": "9daa3555-f299-48a6-95c5-4625f8d123cd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:53:34.053658Z",
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
  "command_id": "35a0e0b5-0221-4e67-acc2-3003bc291cec",
  "quote_id": "9daa3555-f299-48a6-95c5-4625f8d123cd",
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
  "id": "5e9ac202-9a24-4d3a-93d8-bdbe4c4d8658",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c30e5a06-0121-42e1-8148-3ef494d80116",
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
  "created_at": "2026-10-29T15:48:34.343252Z",
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
    "id": "5ddeebef-19cc-4370-a08e-b960e75f2fe7",
    "order_id": "5e9ac202-9a24-4d3a-93d8-bdbe4c4d8658",
    "expires_at": "2026-10-29T15:48:49.346738Z",
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

`POST /api/driver/v1/offers/5ddeebef-19cc-4370-a08e-b960e75f2fe7/accept` → **200**

```json
{
  "command_id": "0252370f-5d65-4549-9201-50128023372b"
}
```

```json
{
  "id": "3fc7d7d3-0059-4660-94ff-662fa1c5c699",
  "order_id": "5e9ac202-9a24-4d3a-93d8-bdbe4c4d8658",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b483657b-1569-4d6e-a6e1-5da624f74ca9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b483657b-1569-4d6e-a6e1-5da624f74ca9",
  "order_id": "5e9ac202-9a24-4d3a-93d8-bdbe4c4d8658",
  "assignment_id": "3fc7d7d3-0059-4660-94ff-662fa1c5c699",
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

`POST /api/driver/v1/work-sessions/d2af2caa-1cec-4277-b57a-04c750317dfd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:48:35Z",
    "sequence": 1793288915490
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d2af2caa-1cec-4277-b57a-04c750317dfd",
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
  "last_heartbeat_at": "2026-10-29T15:48:35.50817Z",
  "last_location_at": "2026-10-29T15:48:35.50817Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b483657b-1569-4d6e-a6e1-5da624f74ca9",
  "order_id": "5e9ac202-9a24-4d3a-93d8-bdbe4c4d8658",
  "assignment_id": "3fc7d7d3-0059-4660-94ff-662fa1c5c699",
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

`POST /api/driver/v1/trips/b483657b-1569-4d6e-a6e1-5da624f74ca9/arrive` → **200**

```json
{
  "command_id": "861f9d53-d090-4fbc-afd4-f544f57f490d",
  "expected_version": 0
}
```

```json
{
  "id": "b483657b-1569-4d6e-a6e1-5da624f74ca9",
  "order_id": "5e9ac202-9a24-4d3a-93d8-bdbe4c4d8658",
  "assignment_id": "3fc7d7d3-0059-4660-94ff-662fa1c5c699",
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
  "arrived_at": "2026-10-29T15:48:36.05661Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b483657b-1569-4d6e-a6e1-5da624f74ca9/start` → **200**

```json
{
  "command_id": "e66c307b-ebdf-4387-b929-0b84ed6f308b",
  "expected_version": 1
}
```

```json
{
  "id": "b483657b-1569-4d6e-a6e1-5da624f74ca9",
  "order_id": "5e9ac202-9a24-4d3a-93d8-bdbe4c4d8658",
  "assignment_id": "3fc7d7d3-0059-4660-94ff-662fa1c5c699",
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
  "arrived_at": "2026-10-29T15:48:36.05661Z",
  "started_at": "2026-10-29T15:48:36.351558Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/d2af2caa-1cec-4277-b57a-04c750317dfd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:48:36Z",
    "sequence": 1793288916630
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d2af2caa-1cec-4277-b57a-04c750317dfd",
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
  "last_heartbeat_at": "2026-10-29T15:48:36.647698Z",
  "last_location_at": "2026-10-29T15:48:36.647698Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/b483657b-1569-4d6e-a6e1-5da624f74ca9/complete` → **200**

```json
{
  "command_id": "232054ed-7fc3-4533-82ff-0d8b33e645b4",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:48:36Z",
  "cash_received": true
}
```

```json
{
  "id": "b483657b-1569-4d6e-a6e1-5da624f74ca9",
  "order_id": "5e9ac202-9a24-4d3a-93d8-bdbe4c4d8658",
  "assignment_id": "3fc7d7d3-0059-4660-94ff-662fa1c5c699",
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
  "arrived_at": "2026-10-29T15:48:36.05661Z",
  "started_at": "2026-10-29T15:48:36.351558Z",
  "completed_at": "2026-10-29T15:48:36.936693Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/5e9ac202-9a24-4d3a-93d8-bdbe4c4d8658/rating` → **200**

```json
{
  "command_id": "d9d52154-d5eb-446e-a4b3-768ead9d979c",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "5e9ac202-9a24-4d3a-93d8-bdbe4c4d8658",
  "score": 5,
  "created_at": "2026-10-29T15:48:37.230844399Z"
}
```

`POST /api/driver/v1/orders/5e9ac202-9a24-4d3a-93d8-bdbe4c4d8658/rating` → **200**

```json
{
  "command_id": "b1fba7cb-946e-4969-8dbc-c6e67879de6d",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "5e9ac202-9a24-4d3a-93d8-bdbe4c4d8658",
  "score": 4,
  "created_at": "2026-10-29T15:48:37.516544677Z"
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
  "session_id": "15b46ce1-d3c1-4d4a-b96d-ea1f581896fa",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4MTgsImlhdCI6MTc5MzI4ODkxOCwianRpIjoiZmNjYjcyMWItNjI0ZC00ZTg5LThhZDgtNjg2OTA2ZDhlMDdmIiwic2lkIjoiMTViNDZjZTEtZDNjMS00ZDRhLWI5NmQtZWExZjU4MTg5NmZhIn0.74nVOxx-qbpGZnF2A0E2QZBuVbCHQopNsbvAJVERpRc",
  "access_expires_at": "2026-10-29T16:03:38.377075747Z",
  "refresh_token": "7ZIzZzb_DQGrVwYdPVzBqUd9VOEPzAq3fRh8Nuurnoo",
  "refresh_expires_at": "2026-10-30T03:48:38.376591809Z",
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
  "session_id": "64ff7a0b-ed01-41ae-a4f4-73c0c41cef0a",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4MTgsImlhdCI6MTc5MzI4ODkxOCwianRpIjoiOThmZGYxY2YtMDNkOS00MWFjLTgwMTEtODJlNTY3NGU2MzllIiwic2lkIjoiNjRmZjdhMGItZWQwMS00MWFlLWE0ZjQtNzNjMGM0MWNlZjBhIn0.hx4MaO2ey9MgyKrBC8A2yLKQocHZRpdOY-CNByAc-Ho",
  "access_expires_at": "2026-10-29T16:03:38.945123292Z",
  "refresh_token": "CwQ8JrjpCXanrfj2pZqqqXfi_3EYBTP9xUUvM8jD1co",
  "refresh_expires_at": "2026-10-30T03:48:38.944449696Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5e9ac202-9a24-4d3a-93d8-bdbe4c4d8658/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "5e9ac202-9a24-4d3a-93d8-bdbe4c4d8658",
      "author_type": "RIDER",
      "author_id": "c30e5a06-0121-42e1-8148-3ef494d80116",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-29T15:48:37.230844Z"
    },
    {
      "order_id": "5e9ac202-9a24-4d3a-93d8-bdbe4c4d8658",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "c30e5a06-0121-42e1-8148-3ef494d80116",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-29T15:48:37.516545Z"
    }
  ]
}
```

Done: ratings for order 5e9ac202-9a24-4d3a-93d8-bdbe4c4d8658.

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
  "session_id": "e06d366b-f7ec-42f3-9e45-28668b655fe9",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4MTksImlhdCI6MTc5MzI4ODkxOSwianRpIjoiNDQzOTVjYjUtMGI1Zi00NDM1LTg0OGUtYjQwZDdhMWFmOGU2Iiwic2lkIjoiZTA2ZDM2NmItZjdlYy00MmYzLTllNDUtMjg2NjhiNjU1ZmU5In0.V_N_b7p8z6-eQIRM1c8QRR3oJa7kbqYkTIFjDbwtSh0",
  "access_expires_at": "2026-10-29T16:03:39.799053214Z",
  "refresh_token": "Hdljv8NP9TGqJywD7QD_9HK9Owd6GB9jA0AjHWbv7bA",
  "refresh_expires_at": "2026-10-30T03:48:39.79856322Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "eefa08be-a275-40c2-8834-9e72d5cfd0e5",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "9c708d30-19a5-454c-a402-dbc803c67c02",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:48:40.082936Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/9c708d30-19a5-454c-a402-dbc803c67c02` → **200**

```json
{
  "id": "9c708d30-19a5-454c-a402-dbc803c67c02",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:48:40.082936Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/9c708d30-19a5-454c-a402-dbc803c67c02` → **200**

```json
{
  "id": "9c708d30-19a5-454c-a402-dbc803c67c02",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:48:40.082936Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/9c708d30-19a5-454c-a402-dbc803c67c02` → **200**

```json
{
  "id": "9c708d30-19a5-454c-a402-dbc803c67c02",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T15:48:40.082936Z",
  "ready_at": "2026-10-29T15:48:42.863876Z",
  "expires_at": "2026-10-30T15:48:42.863876Z"
}
```

`GET /api/admin/v1/reports/exports/9c708d30-19a5-454c-a402-dbc803c67c02/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-29,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "b0e585f3-bfd4-4482-af00-7a9d0fec686f",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "501b4cc9-16a2-4bbf-9eb1-cbdabc385f8e",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:48:43.25163Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/501b4cc9-16a2-4bbf-9eb1-cbdabc385f8e` → **200**

```json
{
  "id": "501b4cc9-16a2-4bbf-9eb1-cbdabc385f8e",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:48:43.25163Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/501b4cc9-16a2-4bbf-9eb1-cbdabc385f8e` → **200**

```json
{
  "id": "501b4cc9-16a2-4bbf-9eb1-cbdabc385f8e",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:48:43.25163Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/501b4cc9-16a2-4bbf-9eb1-cbdabc385f8e` → **200**

```json
{
  "id": "501b4cc9-16a2-4bbf-9eb1-cbdabc385f8e",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:48:43.25163Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/501b4cc9-16a2-4bbf-9eb1-cbdabc385f8e` → **200**

```json
{
  "id": "501b4cc9-16a2-4bbf-9eb1-cbdabc385f8e",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:48:43.25163Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/501b4cc9-16a2-4bbf-9eb1-cbdabc385f8e` → **200**

```json
{
  "id": "501b4cc9-16a2-4bbf-9eb1-cbdabc385f8e",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T15:48:43.25163Z",
  "ready_at": "2026-10-29T15:48:47.870527Z",
  "expires_at": "2026-10-30T15:48:47.870527Z"
}
```

`GET /api/admin/v1/reports/exports/501b4cc9-16a2-4bbf-9eb1-cbdabc385f8e/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-29,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/681ef070-23d8-4764-a32c-4e65f8c4d873` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/681ef070-23d8-4764-a32c-4e65f8c4d873",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8e34af81-1c7b-40e3-abff-155d0c9ff94d"
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
  "device_ref": "sandbox-21703"
}
```

```json
{
  "challenge_id": "a0fa5885-3859-45e9-8e62-7a736426577d",
  "expires_at": "2026-10-29T15:53:49.241200977Z",
  "resend_available_at": "2026-10-29T15:48:50.241200977Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "856631",
  "sent_at": "2026-10-29T15:48:49.24369701Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a0fa5885-3859-45e9-8e62-7a736426577d",
  "code": "856631",
  "device_ref": "sandbox-21703"
}
```

```json
{
  "session_id": "766c8acf-faa6-4159-8cad-f2de59cebba3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTgyOSwiaWF0IjoxNzkzMjg4OTI5LCJqdGkiOiIwZDMzMThkMy1mNmE3LTRjZTgtYWJkMy1hYzYxMDljZjczNzAiLCJzaWQiOiI3NjZjOGFjZi1mYWE2LTQxNTktOGNhZC1mMmRlNTljZWJiYTMifQ.vA5Mo8OkRikloK23yo6lVP7TP4S-Dxlfu_0npf50cxM",
  "access_expires_at": "2026-10-29T16:03:49.547209928Z",
  "refresh_token": "PqUF5vf7y7sT6ktWH6Q8ackEMsus5qDJ0rNbxNsuN8E",
  "refresh_expires_at": "2026-11-28T15:48:49.546687975Z",
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
  "command_id": "78e6e8b5-4225-476d-aa38-26868468fdea",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:48:50Z",
    "sequence": 1793288930350
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f18d0566-b367-4362-9031-42b48b398482",
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
  "last_heartbeat_at": "2026-10-29T15:48:50.368521Z",
  "last_location_at": "2026-10-29T15:48:50.368521Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "2239c0bb-d43a-4c8a-8873-0014f4931925",
  "points": [
    {
      "sequence": 1793288932658,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T15:47:52Z"
    },
    {
      "sequence": 1793288932665,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T15:48:52Z"
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
  "session_id": "c729bf73-30c6-4af1-aa35-a7c53d91255c",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4MzMsImlhdCI6MTc5MzI4ODkzMywianRpIjoiNzViMzQwYjAtODczZS00NGM3LWJhOTEtYTkzMDE0MGIyYjFlIiwic2lkIjoiYzcyOWJmNzMtMzBjNi00YWYxLWFhMzUtYTdjNTNkOTEyNTVjIn0.x0LDZAP86n_tbhmxWraweEcc0w9NtE4fG8ZtUu3P6C8",
  "access_expires_at": "2026-10-29T16:03:53.278570411Z",
  "refresh_token": "WN7ib74GyZXhcMlfCM25CLsTj8bFtcGtVFD1O9cDXbc",
  "refresh_expires_at": "2026-10-30T03:48:53.278013624Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "349e6aa6-f956-4706-9dba-e4b083bfdca9",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-29T15:48:52Z",
        "track_point_id": "86b912fe-6244-4590-8155-3989ef603a18",
        "work_session_id": "f18d0566-b367-4362-9031-42b48b398482"
      },
      "raised_by": null,
      "raised_at": "2026-10-29T15:48:52Z",
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

`POST /api/admin/v1/driver-risk-flags/349e6aa6-f956-4706-9dba-e4b083bfdca9/confirm` → **200**

```json
{
  "command_id": "5861feb1-3b3d-4007-95a4-24fe8299e783",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "349e6aa6-f956-4706-9dba-e4b083bfdca9",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-29T15:48:52Z",
    "track_point_id": "86b912fe-6244-4590-8155-3989ef603a18",
    "work_session_id": "f18d0566-b367-4362-9031-42b48b398482"
  },
  "raised_by": null,
  "raised_at": "2026-10-29T15:48:52Z",
  "reason": null,
  "reviewed_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
  "reviewed_at": "2026-10-29T15:48:54.161025Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/349e6aa6-f956-4706-9dba-e4b083bfdca9/dismiss` → **409**

```json
{
  "command_id": "16e2424a-f836-42b3-b93d-004a39b2cf2c",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/349e6aa6-f956-4706-9dba-e4b083bfdca9/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "39d6fd71-b673-4fed-b7de-8d2a4417892c"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "86c27d58-465a-44e4-ab0d-75e74f35041e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "add8b824-ec41-4bb2-95c2-e1bfc028cfff",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
  "raised_at": "2026-10-29T15:48:54.737415Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/add8b824-ec41-4bb2-95c2-e1bfc028cfff/dismiss` → **200**

```json
{
  "command_id": "9589009e-7e9e-4ed7-825d-20175646c772",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "add8b824-ec41-4bb2-95c2-e1bfc028cfff",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
  "raised_at": "2026-10-29T15:48:54.737415Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
  "reviewed_at": "2026-10-29T15:48:55.03311Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "9782b1fa-26b1-438d-abc4-1cbb50f009ae",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "349e6aa6-f956-4706-9dba-e4b083bfdca9"
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
      "actor_id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T15:48:55.321411Z"
    }
  ]
}
```

Done: flag 349e6aa6-f956-4706-9dba-e4b083bfdca9 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "2c02bba0-bf67-498d-8467-79ea98171155",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4MzYsImlhdCI6MTc5MzI4ODkzNiwianRpIjoiMjdiNDIyOGMtNWVmOS00OGY2LWJlZTAtZTQ5MDRlNTA1OGNhIiwic2lkIjoiMmMwMmJiYTAtYmY2Ny00OThkLTg0NjctNzllYTk4MTcxMTU1In0.dKdP5vvJ7JXPnCffeziF1DRZTFEPgaoUqsJIzONdswM",
  "access_expires_at": "2026-10-29T16:03:56.181873429Z",
  "refresh_token": "OBRc2D9ZClcRAT_uZCHZqDTV3B2JVuZQ3b4RrLjWih8",
  "refresh_expires_at": "2026-10-30T03:48:56.181330116Z",
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
      "actor_id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T15:48:55.321411Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "ed848273-639f-40df-abae-d2d7a0b56f8f",
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
  "session_id": "f18d0566-b367-4362-9031-42b48b398482",
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
  "last_heartbeat_at": "2026-10-29T15:48:50.368521Z",
  "last_location_at": "2026-10-29T15:48:50.368521Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f18d0566-b367-4362-9031-42b48b398482/close` → **200**

```json
{
  "command_id": "7a3aa966-0933-4b1b-a062-b4f47269d78c",
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
  "session_id": "5a13c1a7-9971-4bae-a5ce-a06f45c75305",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4MzcsImlhdCI6MTc5MzI4ODkzNywianRpIjoiMjA3MzlkNjItY2VhZC00ZDA1LTkzMGQtOGUzZTk5NDAzMzBmIiwic2lkIjoiNWExM2MxYTctOTk3MS00YmFlLWE1Y2UtYTA2ZjQ1Yzc1MzA1In0.BUGKgyzpVahZrtBYplCqeScZWlizP2uw0ljwrMmFBkA",
  "access_expires_at": "2026-10-29T16:03:57.961563871Z",
  "refresh_token": "5E7O3bFghSQfFEpM6H0JGGpujLlgDpX2G-rvRGeXIx8",
  "refresh_expires_at": "2026-10-30T03:48:57.960579719Z",
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
  "command_id": "22312e40-339a-4ee9-a80f-5300a662eebf",
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
  "changed_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T15:48:58.54116Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "22312e40-339a-4ee9-a80f-5300a662eebf",
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
  "changed_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T15:48:58.54116Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48970609595",
  "device_ref": "sandbox-19424"
}
```

```json
{
  "challenge_id": "07e1ffe2-377c-417b-b691-275300340510",
  "expires_at": "2026-10-29T15:53:59.111408896Z",
  "resend_available_at": "2026-10-29T15:49:00.111408896Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48970609595` → **200**

```json
{
  "phone": "+48970609595",
  "audience": "CLIENT",
  "code": "549814",
  "sent_at": "2026-10-29T15:48:59.113863823Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "07e1ffe2-377c-417b-b691-275300340510",
  "code": "549814",
  "device_ref": "sandbox-19424"
}
```

```json
{
  "session_id": "0de8ba13-c59a-4606-a033-9693caef605b",
  "subject": {
    "type": "CLIENT",
    "id": "f86d9a70-b47f-4ce6-925b-df60186704ce"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODZkOWE3MC1iNDdmLTRjZTYtOTI1Yi1kZjYwMTg2NzA0Y2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5ODM5LCJpYXQiOjE3OTMyODg5MzksImp0aSI6ImE0ZjRmZGU1LTgwMDYtNDRhNC04OTMxLTUxNzEyNzQ3NDg3MyIsInNpZCI6IjBkZThiYTEzLWM1OWEtNDYwNi1hMDMzLTk2OTNjYWVmNjA1YiJ9.-kamA5Gnqw3wl2SODB0AIt2cEHQsHdFyAYQyTd5_t-I",
  "access_expires_at": "2026-10-29T16:03:59.411017164Z",
  "refresh_token": "a649Y5FLp2kQgjEhmQ9043-wSzHERQuXJQgPwkPP5ks",
  "refresh_expires_at": "2026-11-28T15:48:59.410358426Z",
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
  "correlation_id": "90050a10-1115-49b2-8829-79811bbc6824"
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
  "device_ref": "sandbox-3491"
}
```

```json
{
  "challenge_id": "92abb67d-fd9f-48f9-8cff-ebc669f50b86",
  "expires_at": "2026-10-29T15:54:00.249209682Z",
  "resend_available_at": "2026-10-29T15:49:01.249209682Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "348611",
  "sent_at": "2026-10-29T15:49:00.251479154Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "92abb67d-fd9f-48f9-8cff-ebc669f50b86",
  "code": "348611",
  "device_ref": "sandbox-3491"
}
```

```json
{
  "session_id": "ac287496-5ebb-43f0-9653-81c48cb545e5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTg0MCwiaWF0IjoxNzkzMjg4OTQwLCJqdGkiOiJkYzllYzk2NC0zYzMwLTQzMzYtODJmNi03ZjU1OTMxMDY3ODciLCJzaWQiOiJhYzI4NzQ5Ni01ZWJiLTQzZjAtOTY1My04MWM0OGNiNTQ1ZTUifQ.qorkoD_GW-hz8n5v7fSN6jw5Q3zZ9dEoBt3_by3ESgg",
  "access_expires_at": "2026-10-29T16:04:00.547944784Z",
  "refresh_token": "Ycl247YeOfFUtt5L9_0PkdNSfu7_gf-KLHvy7hdvJxE",
  "refresh_expires_at": "2026-11-28T15:49:00.547412341Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4e801175-11ba-43c8-9370-c32c140f920d",
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
  "last_heartbeat_at": "2026-10-29T15:48:29.449764Z",
  "last_location_at": "2026-10-29T15:48:29.449764Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4e801175-11ba-43c8-9370-c32c140f920d/handover` → **200**

```json
{
  "command_id": "fe160a1d-7756-4b96-98d4-f703fcc5de98",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4e801175-11ba-43c8-9370-c32c140f920d",
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
  "last_heartbeat_at": "2026-10-29T15:48:29.449764Z",
  "last_location_at": "2026-10-29T15:48:29.449764Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4e801175-11ba-43c8-9370-c32c140f920d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:49:01Z",
    "sequence": 1793288941399
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4e801175-11ba-43c8-9370-c32c140f920d",
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
  "last_heartbeat_at": "2026-10-29T15:49:01.417063Z",
  "last_location_at": "2026-10-29T15:49:01.417063Z",
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
  "session_id": "4e801175-11ba-43c8-9370-c32c140f920d",
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
  "last_heartbeat_at": "2026-10-29T15:49:01.417063Z",
  "last_location_at": "2026-10-29T15:49:01.417063Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4e801175-11ba-43c8-9370-c32c140f920d/close` → **200**

```json
{
  "command_id": "26fa1837-080c-44a3-b4cf-2edd0a991669",
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
  "correlation_id": "a6d13af9-7862-4ac7-a566-82c6b63d7391"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679675969",
  "device_ref": "sandbox-1998"
}
```

```json
{
  "challenge_id": "664315ac-a5dc-4ed2-86ba-9badb1b069ff",
  "expires_at": "2026-10-29T15:54:02.869908908Z",
  "resend_available_at": "2026-10-29T15:49:03.869908908Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679675969` → **200**

```json
{
  "phone": "+380679675969",
  "audience": "CLIENT",
  "code": "603432",
  "sent_at": "2026-10-29T15:49:02.87226467Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "664315ac-a5dc-4ed2-86ba-9badb1b069ff",
  "code": "603432",
  "device_ref": "sandbox-1998"
}
```

```json
{
  "session_id": "ffb35cba-b5c8-4792-ba92-091ee067a39b",
  "subject": {
    "type": "CLIENT",
    "id": "7fcb2c14-aa4a-469d-81be-a1cb99983615"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZmNiMmMxNC1hYTRhLTQ2OWQtODFiZS1hMWNiOTk5ODM2MTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5ODQzLCJpYXQiOjE3OTMyODg5NDMsImp0aSI6IjMwZGQ2ZjBkLWVmNjYtNDMwYy1hNjBlLWRjYjMxNTc4NWE4OSIsInNpZCI6ImZmYjM1Y2JhLWI1YzgtNDc5Mi1iYTkyLTA5MWVlMDY3YTM5YiJ9.IXeqHBJSSSDNdfkWs8Uyq75bSW2ruH-sIiDOh9WAUhQ",
  "access_expires_at": "2026-10-29T16:04:03.176626987Z",
  "refresh_token": "5zrxSwpIux2ECsnhKuJuKRhMu9bIM_OOB_tbaJTnxZ0",
  "refresh_expires_at": "2026-11-28T15:49:03.176096618Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "b8ef4bf9-1461-4b43-9d89-dfe9fb363f33",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "57c6788c-c8b6-47cd-80b9-20bb02c42546",
  "upload_path": "/api/rider/v1/uploads/57c6788c-c8b6-47cd-80b9-20bb02c42546",
  "expires_at": "2026-10-29T16:04:03.482528195Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/57c6788c-c8b6-47cd-80b9-20bb02c42546` → **200**

```json
{
  "file_id": "57c6788c-c8b6-47cd-80b9-20bb02c42546",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "282c4a67-138b-42e1-b394-a5c1441553b8",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "57c6788c-c8b6-47cd-80b9-20bb02c42546"
  ]
}
```

```json
{
  "id": "bec8e1dd-2b19-47b0-bcff-6d51aa4b7e01",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "7fcb2c14-aa4a-469d-81be-a1cb99983615",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T15:49:03.791033Z",
  "updated_at": "2026-10-29T15:49:03.791033Z",
  "respond_by": "2026-10-29T19:49:03.791033Z",
  "messages": [
    {
      "id": "60e41425-7575-4091-ae4c-d2db3852bdfe",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "7fcb2c14-aa4a-469d-81be-a1cb99983615",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T15:49:03.791768Z",
      "attachments": [
        {
          "file_id": "57c6788c-c8b6-47cd-80b9-20bb02c42546",
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
  "session_id": "be0994e9-f7d0-4736-a5c6-e97fcc8b5808",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4NDQsImlhdCI6MTc5MzI4ODk0NCwianRpIjoiNDQ5ZDYxMDEtNTUxMi00YmNmLWEzYjQtMGI3MmMwNGFmYmEzIiwic2lkIjoiYmUwOTk0ZTktZjdkMC00NzM2LWE1YzYtZTk3ZmNjOGI1ODA4In0.urEw5FzmG7sWa0HEZISvdSxjcITfFs-Fm8809F0_HTM",
  "access_expires_at": "2026-10-29T16:04:04.419748592Z",
  "refresh_token": "x2pdXDz1hGZAwlBj0vFC6iRFZZ8KxDVKqJyd336ejg4",
  "refresh_expires_at": "2026-10-30T03:49:04.419131381Z",
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
  "session_id": "4fda71ff-d140-4dff-864a-d3260c9b3281",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4NDQsImlhdCI6MTc5MzI4ODk0NCwianRpIjoiZTdhMzY0ZjktYjUxZi00NjI1LTk3MTQtNTBmYjc2NmI3ZTBhIiwic2lkIjoiNGZkYTcxZmYtZDE0MC00ZGZmLTg2NGEtZDMyNjBjOWIzMjgxIn0.xOXdGYHNsh4wrG3XFY3hnVneiIEx8h5NRiCz-gSLnuw",
  "access_expires_at": "2026-10-29T16:04:04.978760679Z",
  "refresh_token": "KJbZd70G-DOVitv-JRcY6GjBJ3BcL5zWdd0tuKNcx5Y",
  "refresh_expires_at": "2026-10-30T03:49:04.978166912Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/bec8e1dd-2b19-47b0-bcff-6d51aa4b7e01/attachments/57c6788c-c8b6-47cd-80b9-20bb02c42546` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "a76e65a5-a390-4d90-af0b-a19628c7703f",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "58f2fbe3-579c-4e24-8185-e2c8ca5cca2b",
  "upload_path": "/api/operator/v1/uploads/58f2fbe3-579c-4e24-8185-e2c8ca5cca2b",
  "expires_at": "2026-10-29T16:04:05.274097691Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/58f2fbe3-579c-4e24-8185-e2c8ca5cca2b` → **200**

```json
{
  "file_id": "58f2fbe3-579c-4e24-8185-e2c8ca5cca2b",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/bec8e1dd-2b19-47b0-bcff-6d51aa4b7e01` → **200**

```json
{
  "id": "bec8e1dd-2b19-47b0-bcff-6d51aa4b7e01",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "7fcb2c14-aa4a-469d-81be-a1cb99983615",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T15:49:03.791033Z",
  "updated_at": "2026-10-29T15:49:03.791033Z",
  "respond_by": "2026-10-29T19:49:03.791033Z",
  "messages": [
    {
      "id": "60e41425-7575-4091-ae4c-d2db3852bdfe",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "7fcb2c14-aa4a-469d-81be-a1cb99983615",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T15:49:03.791768Z",
      "attachments": [
        {
          "file_id": "57c6788c-c8b6-47cd-80b9-20bb02c42546",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/bec8e1dd-2b19-47b0-bcff-6d51aa4b7e01/comments` → **200**

```json
{
  "command_id": "f0c20b79-7c04-475e-afb4-fb710102b4d0",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "58f2fbe3-579c-4e24-8185-e2c8ca5cca2b"
  ]
}
```

```json
{
  "id": "bec8e1dd-2b19-47b0-bcff-6d51aa4b7e01",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "7fcb2c14-aa4a-469d-81be-a1cb99983615",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T15:49:03.791033Z",
  "updated_at": "2026-10-29T15:49:05.876582Z",
  "respond_by": "2026-10-29T19:49:03.791033Z",
  "messages": [
    {
      "id": "60e41425-7575-4091-ae4c-d2db3852bdfe",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "7fcb2c14-aa4a-469d-81be-a1cb99983615",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T15:49:03.791768Z",
      "attachments": [
        {
          "file_id": "57c6788c-c8b6-47cd-80b9-20bb02c42546",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "ff21f224-f161-441e-a80a-504b17fa13c9",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T15:49:05.876107Z",
      "attachments": [
        {
          "file_id": "58f2fbe3-579c-4e24-8185-e2c8ca5cca2b",
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

`GET /api/rider/v1/support/cases/bec8e1dd-2b19-47b0-bcff-6d51aa4b7e01` → **200**

```json
{
  "id": "bec8e1dd-2b19-47b0-bcff-6d51aa4b7e01",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "7fcb2c14-aa4a-469d-81be-a1cb99983615",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T15:49:03.791033Z",
  "updated_at": "2026-10-29T15:49:05.876582Z",
  "respond_by": "2026-10-29T19:49:03.791033Z",
  "messages": [
    {
      "id": "60e41425-7575-4091-ae4c-d2db3852bdfe",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "7fcb2c14-aa4a-469d-81be-a1cb99983615",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T15:49:03.791768Z",
      "attachments": [
        {
          "file_id": "57c6788c-c8b6-47cd-80b9-20bb02c42546",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "ff21f224-f161-441e-a80a-504b17fa13c9",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T15:49:05.876107Z",
      "attachments": [
        {
          "file_id": "58f2fbe3-579c-4e24-8185-e2c8ca5cca2b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/bec8e1dd-2b19-47b0-bcff-6d51aa4b7e01/attachments/58f2fbe3-579c-4e24-8185-e2c8ca5cca2b` → **200**

Done: support case bec8e1dd-2b19-47b0-bcff-6d51aa4b7e01, rider attachment 57c6788c-c8b6-47cd-80b9-20bb02c42546, operator attachment 58f2fbe3-579c-4e24-8185-e2c8ca5cca2b.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732743051",
  "device_ref": "sandbox-3490"
}
```

```json
{
  "challenge_id": "cd691439-2a77-4fc3-994b-aca166a060e7",
  "expires_at": "2026-10-29T15:54:06.485154649Z",
  "resend_available_at": "2026-10-29T15:49:07.485154649Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380732743051` → **200**

```json
{
  "phone": "+380732743051",
  "audience": "CLIENT",
  "code": "611848",
  "sent_at": "2026-10-29T15:49:06.487934309Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd691439-2a77-4fc3-994b-aca166a060e7",
  "code": "611848",
  "device_ref": "sandbox-3490"
}
```

```json
{
  "session_id": "11f2c0ff-1115-405e-9efe-cafd23e1c17f",
  "subject": {
    "type": "CLIENT",
    "id": "746fa221-9120-40dc-8d1d-409f540ae056"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NDZmYTIyMS05MTIwLTQwZGMtOGQxZC00MDlmNTQwYWUwNTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5ODQ2LCJpYXQiOjE3OTMyODg5NDYsImp0aSI6IjA3MmJiMTBiLThlZDUtNDg0Yi1iODM5LWI4MzI5MzRmNWJiOCIsInNpZCI6IjExZjJjMGZmLTExMTUtNDA1ZS05ZWZlLWNhZmQyM2UxYzE3ZiJ9.GRlrxT-gIKyOu3WNdeDIGOJfpkSv6r63pkTNL28zI9U",
  "access_expires_at": "2026-10-29T16:04:06.786650383Z",
  "refresh_token": "YmojPyfba2nYyYlGMOznldBP2zarm5trRua2bpmPGoI",
  "refresh_expires_at": "2026-11-28T15:49:06.786136013Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "b1aef877-52a0-4327-817a-912ab9d22436",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "70bf220a-5c3d-484e-8819-8ba256e7cb67",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-70bf220a-5c3d-484e-8819-8ba256e7cb67",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "643a66c2936a907e571eb731a32ee1a2",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=70bf220a-5c3d-484e-8819-8ba256e7cb67",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732743051"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=70bf220a-5c3d-484e-8819-8ba256e7cb67",
  "expires_at": "2026-10-29T16:19:07.060623Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/70bf220a-5c3d-484e-8819-8ba256e7cb67` → **200**

```json
{
  "id": "70bf220a-5c3d-484e-8819-8ba256e7cb67",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T16:19:07.060623Z",
  "card": {
    "id": "65b96b81-1f6a-43ef-9b04-bbf8ecc544b8",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5767",
    "card_type": "Visa",
    "created_at": "2026-10-29T15:49:07.342037Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5d4f3e2c-6dd1-494b-b975-47738ca551a7",
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
  "id": "367ee354-6e4b-48e7-9db9-ec213824db4b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:54:07.652878Z",
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
  "command_id": "935b1638-9ec1-4b1c-8add-8265f1bc280c",
  "quote_id": "367ee354-6e4b-48e7-9db9-ec213824db4b",
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
  "id": "eac940e2-8d95-460c-873c-d9c3d451778b",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "746fa221-9120-40dc-8d1d-409f540ae056",
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
  "created_at": "2026-10-29T15:49:07.96355Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/eac940e2-8d95-460c-873c-d9c3d451778b` → **200**

```json
{
  "id": "eac940e2-8d95-460c-873c-d9c3d451778b",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "746fa221-9120-40dc-8d1d-409f540ae056",
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
  "created_at": "2026-10-29T15:49:07.96355Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/eac940e2-8d95-460c-873c-d9c3d451778b` → **200**

```json
{
  "id": "eac940e2-8d95-460c-873c-d9c3d451778b",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "746fa221-9120-40dc-8d1d-409f540ae056",
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
  "created_at": "2026-10-29T15:49:07.96355Z",
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

`GET /api/rider/v1/orders/eac940e2-8d95-460c-873c-d9c3d451778b` → **200**

```json
{
  "id": "eac940e2-8d95-460c-873c-d9c3d451778b",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "746fa221-9120-40dc-8d1d-409f540ae056",
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
  "created_at": "2026-10-29T15:49:07.96355Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/eac940e2-8d95-460c-873c-d9c3d451778b/switch-to-cash` → **200**

```json
{
  "command_id": "bfa8f86e-ede4-47bc-9b20-3238bbfb0a34",
  "expected_version": 3
}
```

```json
{
  "id": "eac940e2-8d95-460c-873c-d9c3d451778b",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "746fa221-9120-40dc-8d1d-409f540ae056",
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
  "created_at": "2026-10-29T15:49:07.96355Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/eac940e2-8d95-460c-873c-d9c3d451778b/switch-to-cash` → **409**

```json
{
  "command_id": "0ae8d760-2e6f-4b97-9145-05df395db125",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/eac940e2-8d95-460c-873c-d9c3d451778b/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "38fdd94f-1cf4-4d0d-b4c8-a15b630310e0"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/eac940e2-8d95-460c-873c-d9c3d451778b` → **200**

```json
{
  "id": "eac940e2-8d95-460c-873c-d9c3d451778b",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "746fa221-9120-40dc-8d1d-409f540ae056",
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
  "created_at": "2026-10-29T15:49:07.96355Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/eac940e2-8d95-460c-873c-d9c3d451778b/cancel` → **200**

```json
{
  "command_id": "d952157a-7b44-4b2c-a085-89d45009fe9a",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "eac940e2-8d95-460c-873c-d9c3d451778b",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "746fa221-9120-40dc-8d1d-409f540ae056",
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
  "created_at": "2026-10-29T15:49:07.96355Z",
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
  "session_id": "7d130ca0-a6d0-40d5-bfbf-8c4ad64967d3",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4NTEsImlhdCI6MTc5MzI4ODk1MSwianRpIjoiYWNhNWYyOGQtNGI2NC00MjZhLWFhODQtNGYwYmM1N2QwZWQxIiwic2lkIjoiN2QxMzBjYTAtYTZkMC00MGQ1LWJmYmYtOGM0YWQ2NDk2N2QzIn0._1AbFsHj-Gdzz-etT-rdceS3b9SvjcDwyb49IAMnJms",
  "access_expires_at": "2026-10-29T16:04:11.640918109Z",
  "refresh_token": "uq0cBaw5CD5lS6K9G_pq1QmshBPV4ygG7mHF7jf8yy8",
  "refresh_expires_at": "2026-10-30T03:49:11.640398641Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-2701"
}
```

```json
{
  "challenge_id": "044e0bff-5e75-4fb9-b789-58230a4ebd07",
  "expires_at": "2026-10-29T15:54:11.918862808Z",
  "resend_available_at": "2026-10-29T15:49:12.918862808Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "565545",
  "sent_at": "2026-10-29T15:49:11.922585825Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "044e0bff-5e75-4fb9-b789-58230a4ebd07",
  "code": "565545",
  "device_ref": "sandbox-2701"
}
```

```json
{
  "session_id": "5e56ade9-afd9-4396-9783-b5163cea14bf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTg1MiwiaWF0IjoxNzkzMjg4OTUyLCJqdGkiOiI4NGFlMDA0Ny03ODgxLTQ2MjItOGRmOC02NzI4NmNlMDRiM2EiLCJzaWQiOiI1ZTU2YWRlOS1hZmQ5LTQzOTYtOTc4My1iNTE2M2NlYTE0YmYifQ.MAGGm58ietJjWJZmgG6Jw52KtJTgHsmk8-8veBYUF0M",
  "access_expires_at": "2026-10-29T16:04:12.221174554Z",
  "refresh_token": "4-WKXT9dlvwESS5E1y3s1J-O-OYifX8tJqnNetW9-0o",
  "refresh_expires_at": "2026-11-28T15:49:12.220705995Z",
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
      "actor_id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T15:48:55.321411Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
      "reason": "Sandbox clean-up",
      "at": "2026-10-29T15:48:56.754312Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "3506ea97-ea90-4eb0-a413-1e9b2fbb6d02",
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
  "device_ref": "sandbox-9858"
}
```

```json
{
  "challenge_id": "49b56113-8ef8-490b-81f3-0e8b07e7670c",
  "expires_at": "2026-10-29T15:54:13.343102037Z",
  "resend_available_at": "2026-10-29T15:49:14.343102037Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "140515",
  "sent_at": "2026-10-29T15:49:13.346290071Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "49b56113-8ef8-490b-81f3-0e8b07e7670c",
  "code": "140515",
  "device_ref": "sandbox-9858"
}
```

```json
{
  "session_id": "fac6f3f7-ba4f-4028-bcc9-37aa1abb79de",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTg1MywiaWF0IjoxNzkzMjg4OTUzLCJqdGkiOiIxNDI4YTU3Yi02ODEwLTQ0NmItOTU3Ny02MmYzZTkyZWFhZWQiLCJzaWQiOiJmYWM2ZjNmNy1iYTRmLTQwMjgtYmNjOS0zN2FhMWFiYjc5ZGUifQ.5oK5Nvtad6rmOVstpMbNrZQG77giKS4WBsS1XDW4kK8",
  "access_expires_at": "2026-10-29T16:04:13.661669943Z",
  "refresh_token": "aQSIKVpIT2AOBygF2Iubq6ymdbxdNvtDsBVK2kXAd9Y",
  "refresh_expires_at": "2026-11-28T15:49:13.661158219Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d2af2caa-1cec-4277-b57a-04c750317dfd",
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
  "last_heartbeat_at": "2026-10-29T15:48:36.647698Z",
  "last_location_at": "2026-10-29T15:48:36.647698Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/d2af2caa-1cec-4277-b57a-04c750317dfd/handover` → **200**

```json
{
  "command_id": "b0c9cbaf-233f-4910-9f18-5233318da685",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d2af2caa-1cec-4277-b57a-04c750317dfd",
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
  "last_heartbeat_at": "2026-10-29T15:48:36.647698Z",
  "last_location_at": "2026-10-29T15:48:36.647698Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/d2af2caa-1cec-4277-b57a-04c750317dfd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:49:14Z",
    "sequence": 1793288954498
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d2af2caa-1cec-4277-b57a-04c750317dfd",
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
  "last_heartbeat_at": "2026-10-29T15:49:14.516027Z",
  "last_location_at": "2026-10-29T15:49:14.516027Z",
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
  "command_id": "38013e9a-51fb-477a-b36e-b710c1186fbf",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:49:15Z",
    "sequence": 1793288955562
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a8b81804-c06c-44bc-a825-80180ec9a250",
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
  "last_heartbeat_at": "2026-10-29T15:49:15.0747Z",
  "last_location_at": "2026-10-29T15:49:15.0747Z",
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
  "session_id": "96f6c227-8225-479e-bf98-56d0c11a5ff2",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4NTUsImlhdCI6MTc5MzI4ODk1NSwianRpIjoiZTY1NTM0YTktMWUxNy00YWY5LThkNDctYTRmMzAyYjliZDQ4Iiwic2lkIjoiOTZmNmMyMjctODIyNS00NzllLWJmOTgtNTZkMGMxMWE1ZmYyIn0.8GlOmWFc7Mx5yaEIv1Msutbj1hx077hYmexqvVHIMcQ",
  "access_expires_at": "2026-10-29T16:04:15.646559468Z",
  "refresh_token": "zkB2lKoUiL02IsTwtt9yVuYUY61qtAjR-DFTaYaXOXs",
  "refresh_expires_at": "2026-10-30T03:49:15.645965661Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7f16e750-e5ed-47d5-951e-ef8c91cccc6d",
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
  "id": "72af28bd-cb42-4f01-bbba-9fb0fe3fc11c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:54:15.927080Z",
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
  "command_id": "d45c43bc-e7a0-4489-9739-64ef3f91685e",
  "quote_id": "72af28bd-cb42-4f01-bbba-9fb0fe3fc11c",
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
  "id": "f2ecac97-77b8-473c-aeb1-644341693403",
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
  "created_at": "2026-10-29T15:49:16.215626Z",
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
    "id": "52d2fe55-f43b-4133-8cf0-5818d7bc649e",
    "order_id": "f2ecac97-77b8-473c-aeb1-644341693403",
    "expires_at": "2026-10-29T15:49:31.219765Z",
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

`POST /api/driver/v1/offers/52d2fe55-f43b-4133-8cf0-5818d7bc649e/accept` → **200**

```json
{
  "command_id": "e72f3d87-05a3-425e-8c8d-32e2501ea04b"
}
```

```json
{
  "id": "31f38d73-bf42-415d-bfcf-098e1daba587",
  "order_id": "f2ecac97-77b8-473c-aeb1-644341693403",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3e66ca19-69d1-4b9e-a66e-662e180bf8ad",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3e66ca19-69d1-4b9e-a66e-662e180bf8ad",
  "order_id": "f2ecac97-77b8-473c-aeb1-644341693403",
  "assignment_id": "31f38d73-bf42-415d-bfcf-098e1daba587",
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

`POST /api/driver/v1/work-sessions/a8b81804-c06c-44bc-a825-80180ec9a250/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:49:17Z",
    "sequence": 1793288957639
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a8b81804-c06c-44bc-a825-80180ec9a250",
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
  "last_heartbeat_at": "2026-10-29T15:49:17.658322Z",
  "last_location_at": "2026-10-29T15:49:17.658322Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3e66ca19-69d1-4b9e-a66e-662e180bf8ad/arrive` → **200**

```json
{
  "command_id": "1f8373ba-18f9-4736-9a51-93583a84e7e7",
  "expected_version": 0
}
```

```json
{
  "id": "3e66ca19-69d1-4b9e-a66e-662e180bf8ad",
  "order_id": "f2ecac97-77b8-473c-aeb1-644341693403",
  "assignment_id": "31f38d73-bf42-415d-bfcf-098e1daba587",
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
  "arrived_at": "2026-10-29T15:49:17.943478Z",
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

`POST /api/driver/v1/trips/3e66ca19-69d1-4b9e-a66e-662e180bf8ad/start` → **200**

```json
{
  "command_id": "b92d5eba-a0ea-4284-afa1-e33d9ac35747",
  "expected_version": 1
}
```

```json
{
  "id": "3e66ca19-69d1-4b9e-a66e-662e180bf8ad",
  "order_id": "f2ecac97-77b8-473c-aeb1-644341693403",
  "assignment_id": "31f38d73-bf42-415d-bfcf-098e1daba587",
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
  "arrived_at": "2026-10-29T15:49:17.943478Z",
  "started_at": "2026-10-29T15:49:18.235774Z",
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

`POST /api/driver/v1/trips/3e66ca19-69d1-4b9e-a66e-662e180bf8ad/complete` → **200**

```json
{
  "command_id": "217856b2-4ee7-4b51-8faf-a2132ee05234",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:49:18Z",
  "cash_received": true
}
```

```json
{
  "id": "3e66ca19-69d1-4b9e-a66e-662e180bf8ad",
  "order_id": "f2ecac97-77b8-473c-aeb1-644341693403",
  "assignment_id": "31f38d73-bf42-415d-bfcf-098e1daba587",
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
  "arrived_at": "2026-10-29T15:49:17.943478Z",
  "started_at": "2026-10-29T15:49:18.235774Z",
  "completed_at": "2026-10-29T15:49:18.529692Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/f2ecac97-77b8-473c-aeb1-644341693403` → **200**

```json
{
  "id": "f2ecac97-77b8-473c-aeb1-644341693403",
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
    "id": "31f38d73-bf42-415d-bfcf-098e1daba587",
    "order_id": "f2ecac97-77b8-473c-aeb1-644341693403",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3e66ca19-69d1-4b9e-a66e-662e180bf8ad",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:49:16.215626Z",
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
  "session_id": "d2af2caa-1cec-4277-b57a-04c750317dfd",
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
  "last_heartbeat_at": "2026-10-29T15:49:14.516027Z",
  "last_location_at": "2026-10-29T15:49:14.516027Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d2af2caa-1cec-4277-b57a-04c750317dfd/close` → **200**

```json
{
  "command_id": "ebd7f1a4-fa22-4eb0-88e4-99e1b43a292e",
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
  "session_id": "a8b81804-c06c-44bc-a825-80180ec9a250",
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
  "last_heartbeat_at": "2026-10-29T15:49:17.658322Z",
  "last_location_at": "2026-10-29T15:49:17.658322Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a8b81804-c06c-44bc-a825-80180ec9a250/close` → **200**

```json
{
  "command_id": "ea8414e1-8f1e-4aa1-965b-d8d9cdea9073",
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

Done: terminal order f2ecac97-77b8-473c-aeb1-644341693403 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-7147"
}
```

```json
{
  "challenge_id": "3b81ba9a-7584-4fa4-ba38-2c96047d7934",
  "expires_at": "2026-10-29T15:54:23.554997329Z",
  "resend_available_at": "2026-10-29T15:49:24.554997329Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "743365",
  "sent_at": "2026-10-29T15:49:23.557580187Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3b81ba9a-7584-4fa4-ba38-2c96047d7934",
  "code": "743365",
  "device_ref": "sandbox-7147"
}
```

```json
{
  "session_id": "b0daa8a6-613e-4665-b6df-6087e03631a7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTg2MywiaWF0IjoxNzkzMjg4OTYzLCJqdGkiOiJkYTRlNDlmYy1hODg2LTQzZWEtOTMzNy05YzI2ZTA5YWNkMzQiLCJzaWQiOiJiMGRhYThhNi02MTNlLTQ2NjUtYjZkZi02MDg3ZTAzNjMxYTcifQ.MnKpIFlX5Ahkii5z5ZqVCk1AYgHIDBMeGwu3geMab8o",
  "access_expires_at": "2026-10-29T16:04:23.875362573Z",
  "refresh_token": "sddWLtDlAxL4L3UhCiJnw23BSVUFzlXuPKKlGO5m6AE",
  "refresh_expires_at": "2026-11-28T15:49:23.87485687Z",
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
  "device_ref": "sandbox-12117"
}
```

```json
{
  "challenge_id": "6ef1639d-bc59-47c7-9df9-a7e45cdbd94c",
  "expires_at": "2026-10-29T15:54:24.423318586Z",
  "resend_available_at": "2026-10-29T15:49:25.423318586Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "888522",
  "sent_at": "2026-10-29T15:49:24.425593768Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6ef1639d-bc59-47c7-9df9-a7e45cdbd94c",
  "code": "888522",
  "device_ref": "sandbox-12117"
}
```

```json
{
  "session_id": "a1e96762-6600-4670-874a-7961124700ec",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTg2NCwiaWF0IjoxNzkzMjg4OTY0LCJqdGkiOiI5YzlkYjMyMS04MWUxLTQ5MWItYTk2ZS1hMzViYTU2MjUyYWIiLCJzaWQiOiJhMWU5Njc2Mi02NjAwLTQ2NzAtODc0YS03OTYxMTI0NzAwZWMifQ.yF5bDavnosqrbY6UuZ6Zy5JBObRRQ7CvPFxz7lW93n4",
  "access_expires_at": "2026-10-29T16:04:24.719439375Z",
  "refresh_token": "1mbqQKtys5TplpSE2dzZxqQeNCk6xDUYjollhtL2qms",
  "refresh_expires_at": "2026-11-28T15:49:24.71891109Z",
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
  "device_ref": "sandbox-3753"
}
```

```json
{
  "challenge_id": "445186a6-e778-4f02-9aa1-6b6805906775",
  "expires_at": "2026-10-29T15:54:25.254692584Z",
  "resend_available_at": "2026-10-29T15:49:26.254692584Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "984384",
  "sent_at": "2026-10-29T15:49:25.257193066Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "445186a6-e778-4f02-9aa1-6b6805906775",
  "code": "984384",
  "device_ref": "sandbox-3753"
}
```

```json
{
  "session_id": "5258c2d0-3d44-4297-ba33-b2cdc02b6295",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTg2NSwiaWF0IjoxNzkzMjg4OTY1LCJqdGkiOiI4ZDRjMTZmYi03NTU2LTQxZGMtOGVmYy1lMmY0M2U1ODk5MjkiLCJzaWQiOiI1MjU4YzJkMC0zZDQ0LTQyOTctYmEzMy1iMmNkYzAyYjYyOTUifQ.xBR44REqTvx4vUxu6gQeP7P-d4y3wS8Ah_D0fNjEWRk",
  "access_expires_at": "2026-10-29T16:04:25.552423535Z",
  "refresh_token": "dMcIqmF2qGH1rN6bVj3HvBZ2DYFaiTypu5NtJbN0tQE",
  "refresh_expires_at": "2026-11-28T15:49:25.551885244Z",
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
  "phone": "+380694113857",
  "device_ref": "sandbox-3210"
}
```

```json
{
  "challenge_id": "a9ab4167-3af7-44bd-a705-193e03468c4b",
  "expires_at": "2026-10-29T15:54:26.09911611Z",
  "resend_available_at": "2026-10-29T15:49:27.09911611Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380694113857` → **200**

```json
{
  "phone": "+380694113857",
  "audience": "CLIENT",
  "code": "555498",
  "sent_at": "2026-10-29T15:49:26.101553635Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a9ab4167-3af7-44bd-a705-193e03468c4b",
  "code": "555498",
  "device_ref": "sandbox-3210"
}
```

```json
{
  "session_id": "24c90a12-f7d9-4537-ab93-21898c87c41a",
  "subject": {
    "type": "CLIENT",
    "id": "d787653e-2626-449d-bceb-6485bb91cdf6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNzg3NjUzZS0yNjI2LTQ0OWQtYmNlYi02NDg1YmI5MWNkZjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5ODY2LCJpYXQiOjE3OTMyODg5NjYsImp0aSI6ImRiMDUzNjgzLTczNGYtNDEwMi04NDZiLWM5MDdmNzJjNmZmNCIsInNpZCI6IjI0YzkwYTEyLWY3ZDktNDUzNy1hYjkzLTIxODk4Yzg3YzQxYSJ9.kkJjSosA6KpVj7LnEhwe39YZ58jd8pIj6IUq6OXFQ1M",
  "access_expires_at": "2026-10-29T16:04:26.410884607Z",
  "refresh_token": "qc7O61B3qVVuhF8jMRN6qImMsbfMupoZYbtlrL7LTXs",
  "refresh_expires_at": "2026-11-28T15:49:26.410417438Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1be0b071-f0c0-4941-84ac-8b0658905f3d",
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
  "id": "2450de74-17b1-44fe-b5d5-40191263f4f1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:54:26.691875Z",
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
  "command_id": "f62469a2-ae44-4fab-9ce6-04ca6496d660",
  "quote_id": "2450de74-17b1-44fe-b5d5-40191263f4f1",
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
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:26.989805Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:49:26.989805Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 13.607102743
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.175234242
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

`GET /api/rider/v1/orders/a2bf1bd2-4afb-4170-b432-9a0d8cf31512` → **200**

```json
{
  "id": "a2bf1bd2-4afb-4170-b432-9a0d8cf31512",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d787653e-2626-449d-bceb-6485bb91cdf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:49:26.989805Z",
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
  "session_id": "7776cd85-9deb-46b0-a170-60957f6a385a",
  "subject": {
    "type": "STAFF",
    "id": "a6054afe-c79b-4c0e-8599-cb7f7935f22d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjA1NGFmZS1jNzliLTRjMGUtODU5OS1jYjdmNzkzNWYyMmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwNTMsImlhdCI6MTc5MzI4OTE1MywianRpIjoiM2E0YzEyNTItZmEzNS00ZjlkLTk5NmYtNDk1N2VhOTJhY2ZiIiwic2lkIjoiNzc3NmNkODUtOWRlYi00NmIwLWExNzAtNjA5NTdmNmEzODVhIn0.F23eMU-_EXA22epCbKtC3K8FCs9pmVdO4Y28ER4reTo",
  "access_expires_at": "2026-10-29T16:07:33.761553875Z",
  "refresh_token": "0OOG-jrFptJbIZJQBNRKaTpv0x8kVk_Nd3BRc3ryOwU",
  "refresh_expires_at": "2026-10-30T03:52:33.761009791Z",
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
  "id": "7a36e756-6a9d-46be-a3b0-c4022e30754d",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:52:34.052825Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:52:34.052868Z",
  "updated_at": "2026-10-29T15:52:34.070022Z",
  "finished_at": "2026-10-29T15:52:34.070022Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/7a36e756-6a9d-46be-a3b0-c4022e30754d` → **200**

```json
{
  "run": {
    "id": "7a36e756-6a9d-46be-a3b0-c4022e30754d",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T15:52:34.052825Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T15:52:34.052868Z",
    "updated_at": "2026-10-29T15:52:34.070022Z",
    "finished_at": "2026-10-29T15:52:34.070022Z",
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
  "id": "7a36e756-6a9d-46be-a3b0-c4022e30754d",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:52:34.052825Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:52:34.052868Z",
  "updated_at": "2026-10-29T15:52:34.070022Z",
  "finished_at": "2026-10-29T15:52:34.070022Z",
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
  "id": "7a36e756-6a9d-46be-a3b0-c4022e30754d",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:52:34.052825Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:52:34.052868Z",
  "updated_at": "2026-10-29T15:52:34.070022Z",
  "finished_at": "2026-10-29T15:52:34.070022Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/b0a7663f-b58c-4f0e-aa1b-3ef4eb759bab` → **204**

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
  "id": "d5d5b778-aafd-4e98-b5a4-993a14d1477a",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:52:34.500645Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:52:34.500686Z",
  "updated_at": "2026-10-29T15:52:34.507813Z",
  "finished_at": "2026-10-29T15:52:34.507813Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/d5d5b778-aafd-4e98-b5a4-993a14d1477a` → **200**

```json
{
  "run": {
    "id": "d5d5b778-aafd-4e98-b5a4-993a14d1477a",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T15:52:34.500645Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T15:52:34.500686Z",
    "updated_at": "2026-10-29T15:52:34.507813Z",
    "finished_at": "2026-10-29T15:52:34.507813Z",
    "version": 1
  },
  "items": [
    {
      "id": "6c1409b3-6705-4d11-a68d-417524c567fb",
      "run_id": "d5d5b778-aafd-4e98-b5a4-993a14d1477a",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "5baed64e5fb223f02b459c73608a93f7da4c0f22cc6bb271d9d403736604f9b8",
      "reference_display": "sandbox-reconciliation-b0a7663f-b58c-4f0e-aa1b-3ef4eb759bab",
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
      "provider_at": "2026-10-29T15:52:34Z",
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
  "id": "d5d5b778-aafd-4e98-b5a4-993a14d1477a",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:52:34.500645Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:52:34.500686Z",
  "updated_at": "2026-10-29T15:52:34.507813Z",
  "finished_at": "2026-10-29T15:52:34.507813Z",
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
  "id": "d5d5b778-aafd-4e98-b5a4-993a14d1477a",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:52:34.500645Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:52:34.500686Z",
  "updated_at": "2026-10-29T15:52:34.507813Z",
  "finished_at": "2026-10-29T15:52:34.507813Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/6c1409b3-6705-4d11-a68d-417524c567fb/resolve` → **200**

```json
{
  "command_id": "f9a5405b-0147-4477-923f-2eae09b3738d",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "6c1409b3-6705-4d11-a68d-417524c567fb",
  "run_id": "d5d5b778-aafd-4e98-b5a4-993a14d1477a",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "5baed64e5fb223f02b459c73608a93f7da4c0f22cc6bb271d9d403736604f9b8",
  "reference_display": "sandbox-reconciliation-b0a7663f-b58c-4f0e-aa1b-3ef4eb759bab",
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
  "provider_at": "2026-10-29T15:52:34Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
  "resolved_at": "2026-10-29T15:52:34.915841Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/6c1409b3-6705-4d11-a68d-417524c567fb/resolve` → **200**

```json
{
  "command_id": "f9a5405b-0147-4477-923f-2eae09b3738d",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "6c1409b3-6705-4d11-a68d-417524c567fb",
  "run_id": "d5d5b778-aafd-4e98-b5a4-993a14d1477a",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "5baed64e5fb223f02b459c73608a93f7da4c0f22cc6bb271d9d403736604f9b8",
  "reference_display": "sandbox-reconciliation-b0a7663f-b58c-4f0e-aa1b-3ef4eb759bab",
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
  "provider_at": "2026-10-29T15:52:34Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
  "resolved_at": "2026-10-29T15:52:34.915841Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/6c1409b3-6705-4d11-a68d-417524c567fb/resolve` → **409**

```json
{
  "command_id": "7522392c-888a-46e9-8183-7e88f92df095",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/6c1409b3-6705-4d11-a68d-417524c567fb/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "9df84fef-0dfd-4459-a590-5e2d993ed839"
}
```

`GET /api/admin/v1/payment-reconciliations/d5d5b778-aafd-4e98-b5a4-993a14d1477a` → **200**

```json
{
  "run": {
    "id": "d5d5b778-aafd-4e98-b5a4-993a14d1477a",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T15:52:34.500645Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T15:52:34.500686Z",
    "updated_at": "2026-10-29T15:52:34.915841Z",
    "finished_at": "2026-10-29T15:52:34.507813Z",
    "version": 2
  },
  "items": [
    {
      "id": "6c1409b3-6705-4d11-a68d-417524c567fb",
      "run_id": "d5d5b778-aafd-4e98-b5a4-993a14d1477a",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "5baed64e5fb223f02b459c73608a93f7da4c0f22cc6bb271d9d403736604f9b8",
      "reference_display": "sandbox-reconciliation-b0a7663f-b58c-4f0e-aa1b-3ef4eb759bab",
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
      "provider_at": "2026-10-29T15:52:34Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "a6054afe-c79b-4c0e-8599-cb7f7935f22d",
      "resolved_at": "2026-10-29T15:52:34.915841Z",
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
      "id": "d5d5b778-aafd-4e98-b5a4-993a14d1477a",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-29T15:52:34.500645Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T15:52:34.500686Z",
      "updated_at": "2026-10-29T15:52:34.915841Z",
      "finished_at": "2026-10-29T15:52:34.507813Z",
      "version": 2
    },
    {
      "id": "ff6884b4-2419-498f-b3c7-258f078dce47",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-28",
      "period_from": "2026-10-27T22:00:00Z",
      "period_to": "2026-10-29T02:00:00Z",
      "observed_until": "2026-10-29T15:44:37.73031Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T15:44:37.73038Z",
      "updated_at": "2026-10-29T15:44:37.734901Z",
      "finished_at": "2026-10-29T15:44:37.734901Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/b0a7663f-b58c-4f0e-aa1b-3ef4eb759bab` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29"
}
```

```json
{
  "id": "d5d5b778-aafd-4e98-b5a4-993a14d1477a",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:52:34.500645Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:52:34.500686Z",
  "updated_at": "2026-10-29T15:52:34.915841Z",
  "finished_at": "2026-10-29T15:52:34.507813Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793289277912E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793289278199E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793289278199E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793289277961E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.7932892782E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
