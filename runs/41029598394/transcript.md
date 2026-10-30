# Sandbox transcript (2026-10-30T08:55:23Z, 26c7c84)

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
  "correlation_id": "517def29-222e-4fed-bdb1-1ef5a58823a3"
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
  "session_id": "3d9b79be-4572-4d8f-a3fe-60fca544701f",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE0MzAsImlhdCI6MTc5MzM1MDUzMCwianRpIjoiNTFkNGE3MzEtMzI1ZS00MjdlLWIxNTgtNGMyYWIwYTU0Mzc1Iiwic2lkIjoiM2Q5Yjc5YmUtNDU3Mi00ZDhmLWEzZmUtNjBmY2E1NDQ3MDFmIn0.cRZXWWGrtWqHU2ovb29tuIOqh5_Pd4AnccjIXXBFSBc",
  "access_expires_at": "2026-10-30T09:10:30.938517791Z",
  "refresh_token": "SqWBLqrjp_pLnmCAyxWn30th5nF2ksowxvbMfrZgGX8",
  "refresh_expires_at": "2026-10-30T20:55:30.936953123Z",
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
  "session_id": "214241b8-e9f1-48b9-81d0-ff1bc4a424aa",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE0MzIsImlhdCI6MTc5MzM1MDUzMiwianRpIjoiNDgyNTVmYmUtMmUzMC00ZjVmLThhNDctOGQ4NjA4M2NjOTkzIiwic2lkIjoiMjE0MjQxYjgtZTlmMS00OGI5LTgxZDAtZmYxYmM0YTQyNGFhIn0.HvQ_i2Qh7JUDnT4tl43qatBv78fJwl18PFKIGgjb0k8",
  "access_expires_at": "2026-10-30T09:10:32.544790744Z",
  "refresh_token": "NoWizznBSjqDqtefgBaeCuRmUbelMbxid4Mmm2CQivU",
  "refresh_expires_at": "2026-10-30T20:55:32.544118845Z",
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
  "device_ref": "sandbox-25711"
}
```

```json
{
  "challenge_id": "95ba8539-b9a1-4a8b-8617-de6d1525c1ba",
  "expires_at": "2026-10-30T09:00:33.018679449Z",
  "resend_available_at": "2026-10-30T08:55:34.018679449Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "379457",
  "sent_at": "2026-10-30T08:55:33.029645426Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "95ba8539-b9a1-4a8b-8617-de6d1525c1ba",
  "code": "379457",
  "device_ref": "sandbox-25711"
}
```

```json
{
  "session_id": "641e9c22-079a-4233-99d2-bcefaaa314f3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTQzMywiaWF0IjoxNzkzMzUwNTMzLCJqdGkiOiIzY2M5OThhYy0yOTMwLTRlNTgtYWViMC0yZDdjNjRlNDE3YWIiLCJzaWQiOiI2NDFlOWMyMi0wNzlhLTQyMzMtOTlkMi1iY2VmYWFhMzE0ZjMifQ.hMa9Nwa4RxRjNzXH2VhgHm13HoTaIs8cumSz3zUfong",
  "access_expires_at": "2026-10-30T09:10:33.309517928Z",
  "refresh_token": "TdfDdgLbqD4RhFIMOP-yM_mbdk-lH0MLr5P2h9dmNhI",
  "refresh_expires_at": "2026-11-29T08:55:33.308709775Z",
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
  "command_id": "b8d40a79-580b-4ff8-aedd-8b0e7ff72820",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:55:33Z",
    "sequence": 1793350533756
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "988244d3-aa76-4579-9372-a78ae8318012",
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
  "last_heartbeat_at": "2026-10-30T08:55:33.88844Z",
  "last_location_at": "2026-10-30T08:55:33.88844Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633082041",
  "device_ref": "sandbox-15782"
}
```

```json
{
  "challenge_id": "83393e2f-b002-483d-a6c6-ce57593c991a",
  "expires_at": "2026-10-30T09:00:34.121174625Z",
  "resend_available_at": "2026-10-30T08:55:35.121174625Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633082041` → **200**

```json
{
  "phone": "+380633082041",
  "audience": "CLIENT",
  "code": "222140",
  "sent_at": "2026-10-30T08:55:34.125081884Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "83393e2f-b002-483d-a6c6-ce57593c991a",
  "code": "222140",
  "device_ref": "sandbox-15782"
}
```

```json
{
  "session_id": "b413ce5d-5146-42c0-9aed-db0fb17370ff",
  "subject": {
    "type": "CLIENT",
    "id": "fe3e3a41-e27f-4d8f-9fcb-0d3b73c68676"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZTNlM2E0MS1lMjdmLTRkOGYtOWZjYi0wZDNiNzNjNjg2NzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNDM0LCJpYXQiOjE3OTMzNTA1MzQsImp0aSI6IjgzZTMxMTM2LTQxODctNDEzNy05YTE1LWYzNjI5NzZiNzQ2YSIsInNpZCI6ImI0MTNjZTVkLTUxNDYtNDJjMC05YWVkLWRiMGZiMTczNzBmZiJ9.8OH7rOCZTcU0W72wsDfR_qdOdxKwNopAbIdx_qNv6bM",
  "access_expires_at": "2026-10-30T09:10:34.367879772Z",
  "refresh_token": "bvSitAbl5CvVY5wH7PEjnUI-YSrlbqSnqTXFFSggc20",
  "refresh_expires_at": "2026-11-29T08:55:34.367126591Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ad5b0f02-406b-432d-bb2a-890c29ba2940",
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
  "id": "5f8b1904-404a-4475-ab4f-a6e5ab9b1780",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:00:34.625765Z",
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
  "command_id": "d55a8c08-ac2d-4ad1-bf29-7a51c96ab84a",
  "quote_id": "5f8b1904-404a-4475-ab4f-a6e5ab9b1780",
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
  "id": "8d3a6e09-cff5-4a76-958a-75623b5e22d7",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fe3e3a41-e27f-4d8f-9fcb-0d3b73c68676",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:55:34.918394Z",
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
    "id": "402ae0ec-851f-4175-9186-638492c5d084",
    "order_id": "8d3a6e09-cff5-4a76-958a-75623b5e22d7",
    "expires_at": "2026-10-30T08:55:49.92694Z",
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

`POST /api/driver/v1/offers/402ae0ec-851f-4175-9186-638492c5d084/accept` → **200**

```json
{
  "command_id": "e2c9e67c-3310-484a-857d-4a39cf905abe"
}
```

```json
{
  "id": "60a5064c-f656-4c76-a786-62ef2d9b5a0d",
  "order_id": "8d3a6e09-cff5-4a76-958a-75623b5e22d7",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fc06f856-41ae-4302-9e13-73b4718275e8",
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
  "command_id": "43d4b885-b7e6-40ca-9765-43d1d37c1288",
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
  "changed_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T08:55:35.916183744Z"
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
  "id": "fc06f856-41ae-4302-9e13-73b4718275e8",
  "order_id": "8d3a6e09-cff5-4a76-958a-75623b5e22d7",
  "assignment_id": "60a5064c-f656-4c76-a786-62ef2d9b5a0d",
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

`POST /api/driver/v1/work-sessions/988244d3-aa76-4579-9372-a78ae8318012/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:55:36Z",
    "sequence": 1793350536623
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "988244d3-aa76-4579-9372-a78ae8318012",
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
  "last_heartbeat_at": "2026-10-30T08:55:36.645282Z",
  "last_location_at": "2026-10-30T08:55:36.645282Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/fc06f856-41ae-4302-9e13-73b4718275e8/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "c5bdb862-11b9-4744-be2a-b27eac20e1ad",
  "expected_version": 0
}
```

```json
{
  "id": "fc06f856-41ae-4302-9e13-73b4718275e8",
  "order_id": "8d3a6e09-cff5-4a76-958a-75623b5e22d7",
  "assignment_id": "60a5064c-f656-4c76-a786-62ef2d9b5a0d",
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
  "arrived_at": "2026-10-30T08:55:36.88418Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fc06f856-41ae-4302-9e13-73b4718275e8/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "57a9e72d-bb52-4602-84da-4d1371b2e3c4",
  "expected_version": 1
}
```

```json
{
  "id": "fc06f856-41ae-4302-9e13-73b4718275e8",
  "order_id": "8d3a6e09-cff5-4a76-958a-75623b5e22d7",
  "assignment_id": "60a5064c-f656-4c76-a786-62ef2d9b5a0d",
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
  "arrived_at": "2026-10-30T08:55:36.88418Z",
  "started_at": "2026-10-30T08:55:37.114766Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fc06f856-41ae-4302-9e13-73b4718275e8/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "7ad792f9-c718-4f34-a0e8-828ead9229d9",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:55:37Z",
  "cash_received": true
}
```

```json
{
  "id": "fc06f856-41ae-4302-9e13-73b4718275e8",
  "order_id": "8d3a6e09-cff5-4a76-958a-75623b5e22d7",
  "assignment_id": "60a5064c-f656-4c76-a786-62ef2d9b5a0d",
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
  "arrived_at": "2026-10-30T08:55:36.88418Z",
  "started_at": "2026-10-30T08:55:37.114766Z",
  "completed_at": "2026-10-30T08:55:37.357381Z",
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
  "session_id": "988244d3-aa76-4579-9372-a78ae8318012",
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
  "last_heartbeat_at": "2026-10-30T08:55:36.645282Z",
  "last_location_at": "2026-10-30T08:55:36.645282Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/988244d3-aa76-4579-9372-a78ae8318012/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "08975bf0-ae82-4f8f-87ac-7609c8b22aa0",
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
  "command_id": "be41adb3-026f-4502-a1f4-e8f43b208d51",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:55:38Z",
    "sequence": 1793350538729
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
  "correlation_id": "f853b83e-f924-41c8-8123-e5fe8d4d12d8",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "10dc243d-68b9-4b36-9ad6-e1bfe9e718f8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:55:38Z",
    "sequence": 1793350538730
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "85f62a5e-3798-4dd3-8da9-b1658a3bf347",
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
  "last_heartbeat_at": "2026-10-30T08:55:38.340448Z",
  "last_location_at": "2026-10-30T08:55:38.340448Z",
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
  "changed_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T08:55:35.916184Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "b3f6d856-4abb-40f8-bbd2-c2ac720ba812",
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
  "changed_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T08:55:38.796841225Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "85f62a5e-3798-4dd3-8da9-b1658a3bf347",
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
  "last_heartbeat_at": "2026-10-30T08:55:38.340448Z",
  "last_location_at": "2026-10-30T08:55:38.340448Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/85f62a5e-3798-4dd3-8da9-b1658a3bf347/close` → **200**

```json
{
  "command_id": "f3c0c0a0-58b4-4ae1-932a-2ce11d749b6d",
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
  "session_id": "4b653369-eaee-437b-954c-70d1e5a39a94",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE0MzksImlhdCI6MTc5MzM1MDUzOSwianRpIjoiMjdkOGYzYjYtOWFmMi00NDRmLWEwMmYtZWMyMzI2MWEwMDM1Iiwic2lkIjoiNGI2NTMzNjktZWFlZS00MzdiLTk1NGMtNzBkMWU1YTM5YTk0In0.99L7B66fL0j84OibwPOZkBtAbfUZjlOKtKUW8bClCiY",
  "access_expires_at": "2026-10-30T09:10:39.741976843Z",
  "refresh_token": "AMFLhttCK-pR7K3osKfELHIai154rutAKixcXFESjao",
  "refresh_expires_at": "2026-10-30T20:55:39.741398445Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "226688d8-e2f2-4665-a5b6-adf392a4423e",
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
  "id": "f8aff4a2-f1c4-434a-9ff9-db3589ba39e5",
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
  "created_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
  "created_at": "2026-10-30T08:55:39.972379Z",
  "updated_at": "2026-10-30T08:55:39.972379Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636473624",
  "device_ref": "sandbox-7354"
}
```

```json
{
  "challenge_id": "242fae99-9049-4ff6-b54f-06aac3d0ba27",
  "expires_at": "2026-10-30T09:00:40.200803871Z",
  "resend_available_at": "2026-10-30T08:55:41.200803871Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636473624` → **200**

```json
{
  "phone": "+380636473624",
  "audience": "CLIENT",
  "code": "215678",
  "sent_at": "2026-10-30T08:55:40.204827895Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "242fae99-9049-4ff6-b54f-06aac3d0ba27",
  "code": "215678",
  "device_ref": "sandbox-7354"
}
```

```json
{
  "session_id": "86e2d551-1c2b-4d33-abce-2df96d5f0215",
  "subject": {
    "type": "CLIENT",
    "id": "48e79e73-f70e-480e-b17d-538d04105c1e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OGU3OWU3My1mNzBlLTQ4MGUtYjE3ZC01MzhkMDQxMDVjMWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNDQwLCJpYXQiOjE3OTMzNTA1NDAsImp0aSI6ImIyM2RkOTlhLTNkZTgtNDA3ZC05YTA3LTQ1NDZhOWQ3Zjc5MyIsInNpZCI6Ijg2ZTJkNTUxLTFjMmItNGQzMy1hYmNlLTJkZjk2ZDVmMDIxNSJ9.vny6wGjuvEbNaX1MPKsu-dQav9V74B67H92yK2zAuKM",
  "access_expires_at": "2026-10-30T09:10:40.450365409Z",
  "refresh_token": "iaXJobxGIcOLcZoUcHHE84RMwI23RvFB6VQfitry8FM",
  "refresh_expires_at": "2026-11-29T08:55:40.449769625Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380636473624` → **200**

```json
{
  "client_id": "48e79e73-f70e-480e-b17d-538d04105c1e"
}
```

`POST /api/admin/v1/rider-wallets/48e79e73-f70e-480e-b17d-538d04105c1e/top-ups` → **201**

```json
{
  "command_id": "c8fcd68a-e918-470f-8022-5bdfbbed5805",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "48e79e73-f70e-480e-b17d-538d04105c1e",
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
      "id": "ca130d12-d3fa-4717-9070-13fb8bcf4e4d",
      "at": "2026-10-30T08:55:40.909782Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "31a00219-70fd-4586-82bb-ecb321d1f902",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6c25ebfa-b6e8-4f9d-9313-96f2cb9d498f",
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
  "id": "af68699d-44a0-4396-943a-7ccea0bd7641",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:00:41.174418Z",
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
      "id": "f8aff4a2-f1c4-434a-9ff9-db3589ba39e5",
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
  "device_ref": "sandbox-20938"
}
```

```json
{
  "challenge_id": "4cf0ba34-13fe-441e-a078-bf6713e8d3df",
  "expires_at": "2026-10-30T09:00:41.410769621Z",
  "resend_available_at": "2026-10-30T08:55:42.410769621Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "572366",
  "sent_at": "2026-10-30T08:55:41.414509643Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4cf0ba34-13fe-441e-a078-bf6713e8d3df",
  "code": "572366",
  "device_ref": "sandbox-20938"
}
```

```json
{
  "session_id": "8afca323-ecc0-4eff-9017-095d7a35ce7a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTQ0MSwiaWF0IjoxNzkzMzUwNTQxLCJqdGkiOiJjMTA2NDMzYy0xOThmLTQ5NGYtYTYyOS05MjNhMTE2NzNkMWYiLCJzaWQiOiI4YWZjYTMyMy1lY2MwLTRlZmYtOTAxNy0wOTVkN2EzNWNlN2EifQ.3PYpM_Qlv7BxdM8p6BU3eOkclj8HPy9mFkltLgpu0Bw",
  "access_expires_at": "2026-10-30T09:10:41.660413076Z",
  "refresh_token": "_TpuTVbuIiErH9psOQZDg2wBvsdh8rHxLeswhBwU1dY",
  "refresh_expires_at": "2026-11-29T08:55:41.65985621Z",
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
  "command_id": "4f352e48-22d0-48b5-8ef5-da110f987e58",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:55:42Z",
    "sequence": 1793350542980
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "adeeb356-f0f3-4d0f-988d-cd18415dd27e",
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
  "last_heartbeat_at": "2026-10-30T08:55:42.117264Z",
  "last_location_at": "2026-10-30T08:55:42.117264Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "130a52f1-f2a9-4cca-9f05-fd1614e747f2",
  "quote_id": "af68699d-44a0-4396-943a-7ccea0bd7641",
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
  "id": "0ede66f3-7569-41eb-a31e-2418e8a758d8",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "48e79e73-f70e-480e-b17d-538d04105c1e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:55:42.351746Z",
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
  "client_id": "48e79e73-f70e-480e-b17d-538d04105c1e",
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
      "id": "ca130d12-d3fa-4717-9070-13fb8bcf4e4d",
      "at": "2026-10-30T08:55:40.909782Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "31a00219-70fd-4586-82bb-ecb321d1f902",
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
    "id": "965edc41-6faf-48e9-9a5b-861bbaa1a44b",
    "order_id": "0ede66f3-7569-41eb-a31e-2418e8a758d8",
    "expires_at": "2026-10-30T08:55:57.357968Z",
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

`POST /api/driver/v1/offers/965edc41-6faf-48e9-9a5b-861bbaa1a44b/accept` → **200**

```json
{
  "command_id": "6d93d55c-a857-4c3d-8296-dd084ee7b0aa"
}
```

```json
{
  "id": "23c36fb2-1717-4323-ab87-ba7d4a93e771",
  "order_id": "0ede66f3-7569-41eb-a31e-2418e8a758d8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d1bd8fec-b659-4cab-b904-615f46bd58c3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d1bd8fec-b659-4cab-b904-615f46bd58c3",
  "order_id": "0ede66f3-7569-41eb-a31e-2418e8a758d8",
  "assignment_id": "23c36fb2-1717-4323-ab87-ba7d4a93e771",
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

`POST /api/driver/v1/work-sessions/adeeb356-f0f3-4d0f-988d-cd18415dd27e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:55:43Z",
    "sequence": 1793350543503
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "adeeb356-f0f3-4d0f-988d-cd18415dd27e",
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
  "last_heartbeat_at": "2026-10-30T08:55:43.521243Z",
  "last_location_at": "2026-10-30T08:55:43.521243Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d1bd8fec-b659-4cab-b904-615f46bd58c3/arrive` → **200**

```json
{
  "command_id": "1d7a4d0f-519c-4031-922e-6ee7c9102044",
  "expected_version": 0
}
```

```json
{
  "id": "d1bd8fec-b659-4cab-b904-615f46bd58c3",
  "order_id": "0ede66f3-7569-41eb-a31e-2418e8a758d8",
  "assignment_id": "23c36fb2-1717-4323-ab87-ba7d4a93e771",
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
  "arrived_at": "2026-10-30T08:55:43.757944Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d1bd8fec-b659-4cab-b904-615f46bd58c3/start` → **200**

```json
{
  "command_id": "9a364e51-0484-4d68-918d-28ed2dd0c922",
  "expected_version": 1
}
```

```json
{
  "id": "d1bd8fec-b659-4cab-b904-615f46bd58c3",
  "order_id": "0ede66f3-7569-41eb-a31e-2418e8a758d8",
  "assignment_id": "23c36fb2-1717-4323-ab87-ba7d4a93e771",
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
  "arrived_at": "2026-10-30T08:55:43.757944Z",
  "started_at": "2026-10-30T08:55:43.993424Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/d1bd8fec-b659-4cab-b904-615f46bd58c3/complete` → **200**

```json
{
  "command_id": "dd652e10-4ae0-4712-af2d-83fd0b8101d5",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:55:44Z",
  "cash_received": true
}
```

```json
{
  "id": "d1bd8fec-b659-4cab-b904-615f46bd58c3",
  "order_id": "0ede66f3-7569-41eb-a31e-2418e8a758d8",
  "assignment_id": "23c36fb2-1717-4323-ab87-ba7d4a93e771",
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
  "arrived_at": "2026-10-30T08:55:43.757944Z",
  "started_at": "2026-10-30T08:55:43.993424Z",
  "completed_at": "2026-10-30T08:55:44.232497Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "48e79e73-f70e-480e-b17d-538d04105c1e",
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
      "id": "6695e880-6e7a-4c65-a7c9-80b8ec05844d",
      "at": "2026-10-30T08:55:44.831182Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "0ede66f3-7569-41eb-a31e-2418e8a758d8"
    },
    {
      "id": "ca130d12-d3fa-4717-9070-13fb8bcf4e4d",
      "at": "2026-10-30T08:55:40.909782Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "31a00219-70fd-4586-82bb-ecb321d1f902",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/f8aff4a2-f1c4-434a-9ff9-db3589ba39e5/archive` → **200**

```json
{
  "command_id": "7ee4b7d2-a613-4681-9574-64d5a0ec3719",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "f8aff4a2-f1c4-434a-9ff9-db3589ba39e5",
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
  "created_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
  "created_at": "2026-10-30T08:55:39.972379Z",
  "updated_at": "2026-10-30T08:55:47.695115Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "adeeb356-f0f3-4d0f-988d-cd18415dd27e",
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
  "last_heartbeat_at": "2026-10-30T08:55:43.521243Z",
  "last_location_at": "2026-10-30T08:55:43.521243Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/adeeb356-f0f3-4d0f-988d-cd18415dd27e/close` → **200**

```json
{
  "command_id": "79f60657-2a5f-4c26-94be-27aa485505ef",
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

Done: order 0ede66f3-7569-41eb-a31e-2418e8a758d8.

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
  "session_id": "253dc162-ae4b-4a30-96e2-2454e7b02535",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE0NDgsImlhdCI6MTc5MzM1MDU0OCwianRpIjoiM2RmYzJiOTAtNGZkOC00NmE4LThjNjYtNDJhYjdhMDRhZTRlIiwic2lkIjoiMjUzZGMxNjItYWU0Yi00YTMwLTk2ZTItMjQ1NGU3YjAyNTM1In0.Sghektt4LlfXUtCdA0QV8lSYd7YFjRXLNWJxDyooKu4",
  "access_expires_at": "2026-10-30T09:10:48.64504595Z",
  "refresh_token": "XHa5KH-IdDFUWE8q0hJOh8TPQUiNC8D42fID2zpojOg",
  "refresh_expires_at": "2026-10-30T20:55:48.644454251Z",
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
  "command_id": "5d367343-d47b-427a-8811-829ac064d721",
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
  "session_id": "1d1a3f4d-60e9-4d16-92b7-7a4ce5feca70",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE0NDksImlhdCI6MTc5MzM1MDU0OSwianRpIjoiOTI1ZTRkM2QtYWNkNi00OGIzLWE4YTItOGEwMDRmYTFiZDU5Iiwic2lkIjoiMWQxYTNmNGQtNjBlOS00ZDE2LTkyYjctN2E0Y2U1ZmVjYTcwIn0.lfIJf5BMMwMZoF-4Fp7gy-NAvLTgIERzW7mT0Tor7KQ",
  "access_expires_at": "2026-10-30T09:10:49.577945193Z",
  "refresh_token": "W_R1fkxmkP_rLUmLS90QCiTJM3c_dk6PAnODqOwlEKA",
  "refresh_expires_at": "2026-10-30T20:55:49.57738399Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.1497416946",
    "linkedid": "1730052700.1497416946",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679540302"
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
    "id": "1730052700.1497416946",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "c5adc021-66c6-4a01-96ee-c641c9b07dfe",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380679540302",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T08:55:49.800485Z",
      "answered_at": null,
      "ended_at": "2026-10-30T08:55:49.823192Z",
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
    "id": "1730052600.260802761",
    "linkedid": "1730052600.260802761",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679540302"
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
      "id": "a73c9ad0-5191-445c-8f6a-54fb72c7d453",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679540302",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T08:55:50.087623Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/a73c9ad0-5191-445c-8f6a-54fb72c7d453/answer` → **200**

```json
{
  "command_id": "cb8a6108-7fe9-4bb2-9b8b-8dc7c4f2f8e3"
}
```

```json
{
  "id": "a73c9ad0-5191-445c-8f6a-54fb72c7d453",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679540302",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
  "order_ids": [],
  "started_at": "2026-10-30T08:55:50.087623Z",
  "answered_at": "2026-10-30T08:55:50.338946Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.260802761",
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
    "id": "1730052600.260802761",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "a73c9ad0-5191-445c-8f6a-54fb72c7d453",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679540302",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
      "order_ids": [],
      "started_at": "2026-10-30T08:55:50.087623Z",
      "answered_at": "2026-10-30T08:55:50.338946Z",
      "ended_at": "2026-10-30T08:55:50.578064Z",
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
      "id": "a73c9ad0-5191-445c-8f6a-54fb72c7d453",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679540302",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
      "order_ids": [],
      "started_at": "2026-10-30T08:55:50.087623Z",
      "answered_at": "2026-10-30T08:55:50.338946Z",
      "ended_at": "2026-10-30T08:55:50.578064Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T08:55:52.457001Z"
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
      "id": "a73c9ad0-5191-445c-8f6a-54fb72c7d453",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679540302",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
      "order_ids": [],
      "started_at": "2026-10-30T08:55:50.087623Z",
      "answered_at": "2026-10-30T08:55:50.338946Z",
      "ended_at": "2026-10-30T08:55:50.578064Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T08:55:52.457001Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/a73c9ad0-5191-445c-8f6a-54fb72c7d453/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/a73c9ad0-5191-445c-8f6a-54fb72c7d453/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=a73c9ad0-5191-445c-8f6a-54fb72c7d453` → **200**

```json
{
  "changes": [
    {
      "id": "a7eacb72-6830-4ddf-ae53-ce120be1588d",
      "occurred_at": "2026-10-30T08:55:53.321744Z",
      "actor_type": "STAFF",
      "actor_id": "31a00219-70fd-4586-82bb-ecb321d1f902",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "a73c9ad0-5191-445c-8f6a-54fb72c7d453",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"b725da7c-8f8c-4b84-af8f-26fb86719f4c\", \"order_ids\": []}",
      "correlation_id": "c3171a5e-f179-4aa2-8b36-472659b313fc"
    },
    {
      "id": "ec1c22f6-024e-45fe-b60f-8a6b72fa129f",
      "occurred_at": "2026-10-30T08:55:53.289976Z",
      "actor_type": "STAFF",
      "actor_id": "31a00219-70fd-4586-82bb-ecb321d1f902",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "a73c9ad0-5191-445c-8f6a-54fb72c7d453",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"b725da7c-8f8c-4b84-af8f-26fb86719f4c\", \"order_ids\": []}",
      "correlation_id": "056ca7bf-21ab-4f34-b086-9c5a7df8dfb9"
    }
  ]
}
```

Done: call a73c9ad0-5191-445c-8f6a-54fb72c7d453 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-1729"
}
```

```json
{
  "challenge_id": "a24779d8-c0d9-4ac9-87dc-4047d8e3bbe6",
  "expires_at": "2026-10-30T09:00:53.587672437Z",
  "resend_available_at": "2026-10-30T08:55:54.587672437Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "889595",
  "sent_at": "2026-10-30T08:55:53.591388888Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a24779d8-c0d9-4ac9-87dc-4047d8e3bbe6",
  "code": "889595",
  "device_ref": "sandbox-1729"
}
```

```json
{
  "session_id": "3202144e-2df2-4b1c-8ac0-65e33e22a0d8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTQ1MywiaWF0IjoxNzkzMzUwNTUzLCJqdGkiOiIwZDkxMDBmMC1mNWRlLTQ2YjctYWQwYi02OWQ2OWZhOGY4MjkiLCJzaWQiOiIzMjAyMTQ0ZS0yZGYyLTRiMWMtOGFjMC02NWUzM2UyMmEwZDgifQ.vqprIqbS_NReqhdmByST0S5lrzZcyIjPyIwEkX6LhD4",
  "access_expires_at": "2026-10-30T09:10:53.840501696Z",
  "refresh_token": "ll_8KEh1MXFU3CnBKhRS925Zg8ig19vkWZEAUqWJb_k",
  "refresh_expires_at": "2026-11-29T08:55:53.839876067Z",
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
  "command_id": "1c90a358-6a08-42d5-bfb6-e1042a6c413b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:55:54Z",
    "sequence": 1793350554287
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9ac5e1fd-6897-4f9a-90df-1480596a32c1",
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
  "last_heartbeat_at": "2026-10-30T08:55:54.305876Z",
  "last_location_at": "2026-10-30T08:55:54.305876Z",
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
  "session_id": "c96a8135-7c68-4ada-8d5e-38a306e7c95b",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE0NTQsImlhdCI6MTc5MzM1MDU1NCwianRpIjoiODY0MTQ5MzctYWVjNy00N2U2LTlmZGYtMDdmMjg4YTI2YzdlIiwic2lkIjoiYzk2YTgxMzUtN2M2OC00YWRhLThkNWUtMzhhMzA2ZTdjOTViIn0.der2ghwID407mequqex9oyo9QxsKpRFHKaSMEai2LXY",
  "access_expires_at": "2026-10-30T09:10:54.796388645Z",
  "refresh_token": "L9HBFLIoAevF7Ahswpz7ywZIysma1P6jsWbXjwPI2kQ",
  "refresh_expires_at": "2026-10-30T20:55:54.795951258Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "59adeca5-b333-4919-a579-2d0830ff0b9f",
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
  "id": "d6a77928-b10f-4dc9-bfe9-7f7741416719",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:00:55.027162Z",
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
  "command_id": "4300771e-b49a-4c26-a9cd-084cf4013709",
  "quote_id": "d6a77928-b10f-4dc9-bfe9-7f7741416719",
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
    "phone": "+380676283628"
  }
}
```

```json
{
  "id": "4f49bb8d-cc62-469b-9af0-cf9c9f5b112c",
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
  "created_at": "2026-10-30T08:55:55.272835Z",
  "caller": {
    "name": "Олена",
    "phone": "+380676283628"
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
    "id": "df454dac-5ff5-4781-bcfb-98dd52a82a83",
    "order_id": "4f49bb8d-cc62-469b-9af0-cf9c9f5b112c",
    "expires_at": "2026-10-30T08:56:10.277825Z",
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

`POST /api/driver/v1/offers/df454dac-5ff5-4781-bcfb-98dd52a82a83/accept` → **200**

```json
{
  "command_id": "a14c4ce6-9a43-4a9e-b854-e5b15e3dd852"
}
```

```json
{
  "id": "982df5ad-5577-41d5-92b1-6b35d49d580b",
  "order_id": "4f49bb8d-cc62-469b-9af0-cf9c9f5b112c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "af345991-cc8d-4435-8afc-68f5e0de6031",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380676283628` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380676283628` → **200**

```json
[
  {
    "phone": "+380676283628",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:55:56.840404529Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676283628` → **200**

```json
[
  {
    "phone": "+380676283628",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:55:56.840404529Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380676283628` → **200**

```json
[
  {
    "phone": "+380676283628",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:55:56.840404529Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "af345991-cc8d-4435-8afc-68f5e0de6031",
  "order_id": "4f49bb8d-cc62-469b-9af0-cf9c9f5b112c",
  "assignment_id": "982df5ad-5577-41d5-92b1-6b35d49d580b",
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
    "phone": "+380676283628"
  }
}
```

`POST /api/driver/v1/work-sessions/9ac5e1fd-6897-4f9a-90df-1480596a32c1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:55:57Z",
    "sequence": 1793350557286
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9ac5e1fd-6897-4f9a-90df-1480596a32c1",
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
  "last_heartbeat_at": "2026-10-30T08:55:57.304201Z",
  "last_location_at": "2026-10-30T08:55:57.304201Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/af345991-cc8d-4435-8afc-68f5e0de6031/arrive` → **200**

```json
{
  "command_id": "75b8df39-1f8a-4362-92f2-ec8dddd44448",
  "expected_version": 0
}
```

```json
{
  "id": "af345991-cc8d-4435-8afc-68f5e0de6031",
  "order_id": "4f49bb8d-cc62-469b-9af0-cf9c9f5b112c",
  "assignment_id": "982df5ad-5577-41d5-92b1-6b35d49d580b",
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
  "arrived_at": "2026-10-30T08:55:57.539399Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380676283628"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380676283628` → **200**

```json
[
  {
    "phone": "+380676283628",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:55:56.840404529Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676283628` → **200**

```json
[
  {
    "phone": "+380676283628",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:55:56.840404529Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676283628` → **200**

```json
[
  {
    "phone": "+380676283628",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:55:56.840404529Z"
  },
  {
    "phone": "+380676283628",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T08:55:58.855519989Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676283628` → **200**

```json
[
  {
    "phone": "+380676283628",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:55:56.840404529Z"
  },
  {
    "phone": "+380676283628",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T08:55:58.855519989Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380676283628` → **200**

```json
[
  {
    "phone": "+380676283628",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:55:56.840404529Z"
  },
  {
    "phone": "+380676283628",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T08:55:58.855519989Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/af345991-cc8d-4435-8afc-68f5e0de6031/start` → **200**

```json
{
  "command_id": "95aba3f9-4ac9-4d5e-8bff-fb8e8586acd5",
  "expected_version": 1
}
```

```json
{
  "id": "af345991-cc8d-4435-8afc-68f5e0de6031",
  "order_id": "4f49bb8d-cc62-469b-9af0-cf9c9f5b112c",
  "assignment_id": "982df5ad-5577-41d5-92b1-6b35d49d580b",
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
  "arrived_at": "2026-10-30T08:55:57.539399Z",
  "started_at": "2026-10-30T08:55:59.889404Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380676283628"
  }
}
```

`POST /api/driver/v1/trips/af345991-cc8d-4435-8afc-68f5e0de6031/complete` → **200**

```json
{
  "command_id": "5c07c13d-132b-48cc-a662-136bc96cde40",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:56:00Z",
  "cash_received": true
}
```

```json
{
  "id": "af345991-cc8d-4435-8afc-68f5e0de6031",
  "order_id": "4f49bb8d-cc62-469b-9af0-cf9c9f5b112c",
  "assignment_id": "982df5ad-5577-41d5-92b1-6b35d49d580b",
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
  "arrived_at": "2026-10-30T08:55:57.539399Z",
  "started_at": "2026-10-30T08:55:59.889404Z",
  "completed_at": "2026-10-30T08:56:00.12597Z",
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
  "session_id": "9ac5e1fd-6897-4f9a-90df-1480596a32c1",
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
  "last_heartbeat_at": "2026-10-30T08:55:57.304201Z",
  "last_location_at": "2026-10-30T08:55:57.304201Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9ac5e1fd-6897-4f9a-90df-1480596a32c1/close` → **200**

```json
{
  "command_id": "e13d82f7-0006-455f-be47-bab7f7d470a2",
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
  "phone": "+380636881686",
  "device_ref": "sandbox-25353"
}
```

```json
{
  "challenge_id": "d5e15a0c-78e0-4983-81e7-b02186ebdc0b",
  "expires_at": "2026-10-30T09:01:00.810087276Z",
  "resend_available_at": "2026-10-30T08:56:01.810087276Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636881686` → **200**

```json
{
  "phone": "+380636881686",
  "audience": "CLIENT",
  "code": "726063",
  "sent_at": "2026-10-30T08:56:00.813283362Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d5e15a0c-78e0-4983-81e7-b02186ebdc0b",
  "code": "726063",
  "device_ref": "sandbox-25353"
}
```

```json
{
  "session_id": "7a5cf4ce-29cf-40fe-ad69-d3aa6faeec84",
  "subject": {
    "type": "CLIENT",
    "id": "42cede04-c113-4260-8246-a84a1c529340"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmNlZGUwNC1jMTEzLTQyNjAtODI0Ni1hODRhMWM1MjkzNDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNDYxLCJpYXQiOjE3OTMzNTA1NjEsImp0aSI6IjcyNmJjM2UwLTA3ZjItNGNmYy05YmQ4LTNkYjI5MmIyOWY5OSIsInNpZCI6IjdhNWNmNGNlLTI5Y2YtNDBmZS1hZDY5LWQzYWE2ZmFlZWM4NCJ9.CiRz6Ua7Z-c-_mRBdWxiR7SuX9OGfKaVdw3jC3bAdlk",
  "access_expires_at": "2026-10-30T09:11:01.063227727Z",
  "refresh_token": "730fka6_0E8brjJ-9x2tzwlIpnJ_NZWouta7ppaua8A",
  "refresh_expires_at": "2026-11-29T08:56:01.062669679Z",
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
        "ru": "Передумал ехать",
        "pl": "Zmiana planów",
        "uk": "Передумав їхати",
        "en": "Changed my mind"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто",
        "en": "The wait is too long"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "ru": "Ошибся адресом",
        "pl": "Błędny adres",
        "uk": "Помилився адресою",
        "en": "Wrong address"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "ru": "Уеду на другом транспорте",
        "pl": "Inny transport",
        "uk": "Поїду іншим транспортом",
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
  "device_ref": "sandbox-5945"
}
```

```json
{
  "challenge_id": "87f578f8-76b2-4aa0-b586-9c7a5d2b0b2b",
  "expires_at": "2026-10-30T09:01:01.496526158Z",
  "resend_available_at": "2026-10-30T08:56:02.496526158Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "952582",
  "sent_at": "2026-10-30T08:56:01.499614027Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "87f578f8-76b2-4aa0-b586-9c7a5d2b0b2b",
  "code": "952582",
  "device_ref": "sandbox-5945"
}
```

```json
{
  "session_id": "7a832c34-5a8d-4607-b709-ebe18dbe3e2b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTQ2MSwiaWF0IjoxNzkzMzUwNTYxLCJqdGkiOiJjMWYxNTk5NC01NGUzLTQ1YmEtOGU5NC03OGU0NGQ2MWMyYzAiLCJzaWQiOiI3YTgzMmMzNC01YThkLTQ2MDctYjcwOS1lYmUxOGRiZTNlMmIifQ.AsBX7lpj7MRYJnlfoRcbj1ugfKLbKhOs9FWQ6hLRBZw",
  "access_expires_at": "2026-10-30T09:11:01.745195352Z",
  "refresh_token": "BBLqBxcqayo4T6UsqB_Cz12ZDB7MC92izVsqdaRjl0s",
  "refresh_expires_at": "2026-11-29T08:56:01.744763263Z",
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
        "ru": "Пассажир не вышел",
        "pl": "Pasażer nie przyszedł",
        "uk": "Пасажир не вийшов",
        "en": "Passenger did not show up"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "ru": "Неисправность автомобиля",
        "pl": "Awaria samochodu",
        "uk": "Несправність автомобіля",
        "en": "Vehicle problem"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "ru": "Не могу подъехать",
        "pl": "Nie mogę dojechać",
        "uk": "Не можу під'їхати",
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
  "session_id": "b55174e0-f72a-424d-9584-8efb5b6ece7d",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE0NjIsImlhdCI6MTc5MzM1MDU2MiwianRpIjoiMjAzYTA0OTktYjA1NC00NGEwLWI2ZWMtNzBmZTJkMTY2Nzc4Iiwic2lkIjoiYjU1MTc0ZTAtZjcyYS00MjRkLTk1ODQtOGVmYjViNmVjZTdkIn0.yX4TAcKiXfK6LTvjnBSFByLxzhjBRkEo1sGfBRzS5fw",
  "access_expires_at": "2026-10-30T09:11:02.439786111Z",
  "refresh_token": "NvwPmPjGac_7CDFVOmDoYAqMU3HFccLrKNl1RhElosc",
  "refresh_expires_at": "2026-10-30T20:56:02.439092569Z",
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
  "session_id": "5650a7d6-36bb-4adb-9294-aff6a8180dfb",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE0NjIsImlhdCI6MTc5MzM1MDU2MiwianRpIjoiNDljNmIwZTQtYWE4Zi00YmIyLWEwOGMtYzdjY2U0NGEzNGU3Iiwic2lkIjoiNTY1MGE3ZDYtMzZiYi00YWRiLTkyOTQtYWZmNmE4MTgwZGZiIn0.gldGzxM5d1IeMR1CU4c32NzCrI_RaqT4RNU8HVwMalg",
  "access_expires_at": "2026-10-30T09:11:02.922454067Z",
  "refresh_token": "1aEHnADEZ-imUevVHQbvMsVzZfZ5_6roogOI2GEKp6c",
  "refresh_expires_at": "2026-10-30T20:56:02.921961643Z",
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
        "ru": "Пассажир попросил",
        "pl": "Na prośbę pasażera",
        "uk": "Пасажир попросив",
        "en": "Passenger asked"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "ru": "Дубль заказа",
        "pl": "Duplikat zamówienia",
        "uk": "Дубль замовлення",
        "en": "Duplicate order"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "ru": "Нет свободных машин",
        "pl": "Brak wolnych aut",
        "uk": "Немає вільних авто",
        "en": "No cars available"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "ru": "Тестовый заказ",
        "pl": "Zamówienie testowe",
        "uk": "Тестове замовлення",
        "en": "Test order"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "ru": "Ошибка оператора",
        "pl": "Błąd operatora",
        "uk": "Помилка оператора",
        "en": "Operator error"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "ru": "ДТП",
        "pl": "Wypadek",
        "uk": "ДТП",
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
  "command_id": "95768834-090c-470d-9ff7-a7eb9876b930",
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
  "id": "e316ca52-7ef8-4b3f-9b06-bc36ecb1e903",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:01:03.369548Z",
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
  "command_id": "03e356d1-c118-4783-b9a6-3c111fdca342",
  "quote_id": "e316ca52-7ef8-4b3f-9b06-bc36ecb1e903",
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
  "id": "33f43fa8-5783-4225-8756-0883425ee656",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "42cede04-c113-4260-8246-a84a1c529340",
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
  "created_at": "2026-10-30T08:56:03.609705Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/33f43fa8-5783-4225-8756-0883425ee656` → **200**

```json
{
  "id": "33f43fa8-5783-4225-8756-0883425ee656",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "42cede04-c113-4260-8246-a84a1c529340",
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
  "created_at": "2026-10-30T08:56:03.609705Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/33f43fa8-5783-4225-8756-0883425ee656/cancel` → **200**

```json
{
  "command_id": "012f674f-286b-429d-8110-cea35a90915d",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "33f43fa8-5783-4225-8756-0883425ee656",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "42cede04-c113-4260-8246-a84a1c529340",
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
  "created_at": "2026-10-30T08:56:03.609705Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "ru": "Долго ждать машину",
      "pl": "Zbyt długie oczekiwanie",
      "uk": "Довго чекати авто",
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
  "command_id": "62cdc72e-8e48-408d-b142-bbab86237452",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:56:04Z",
    "sequence": 1793350564576
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "cebd3856-33b9-40e2-8e1b-89f97882430e",
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
  "last_heartbeat_at": "2026-10-30T08:56:04.594396Z",
  "last_location_at": "2026-10-30T08:56:04.594396Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-12780"
}
```

```json
{
  "challenge_id": "f649033c-5843-4ccf-bda3-370d659f5fbc",
  "expires_at": "2026-10-30T09:01:04.812797781Z",
  "resend_available_at": "2026-10-30T08:56:05.812797781Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "031163",
  "sent_at": "2026-10-30T08:56:04.815800141Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f649033c-5843-4ccf-bda3-370d659f5fbc",
  "code": "031163",
  "device_ref": "sandbox-12780"
}
```

```json
{
  "session_id": "2cfb4393-418b-4935-a309-5809dfd1739e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTQ2NSwiaWF0IjoxNzkzMzUwNTY1LCJqdGkiOiI5MTY3NjRlYS1kOTc1LTQzZWYtOTgxOS1mYWY3ZmY1NjMxMjQiLCJzaWQiOiIyY2ZiNDM5My00MThiLTQ5MzUtYTMwOS01ODA5ZGZkMTczOWUifQ.2srAlHFtd37OVTB1MeXy2Cf_x2VSSKk4IGrowbJRJBA",
  "access_expires_at": "2026-10-30T09:11:05.059759655Z",
  "refresh_token": "FY7qFLPTwqwvtv5T8T6JxumwJVehKPh_EBhDp1r--jc",
  "refresh_expires_at": "2026-11-29T08:56:05.059211162Z",
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
  "command_id": "a743ab2e-83f3-4455-bbae-6279e0408049",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:56:05Z",
    "sequence": 1793350565502
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "acc11632-ccbc-4e8f-b528-43d1ac126fd3",
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
  "last_heartbeat_at": "2026-10-30T08:56:05.519944Z",
  "last_location_at": "2026-10-30T08:56:05.519944Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fe3fea24-df97-4710-b629-473f96c2933c",
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
  "id": "335b8a48-87c3-4b0a-b065-ba6cff326139",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:01:05.745587Z",
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
  "command_id": "db72ec71-9dc0-4a33-94e1-8f18f22d3bd7",
  "quote_id": "335b8a48-87c3-4b0a-b065-ba6cff326139",
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
  "id": "332df42b-ab9f-4fc4-9d40-234bd89100e5",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "42cede04-c113-4260-8246-a84a1c529340",
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
  "created_at": "2026-10-30T08:56:05.982599Z",
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
    "id": "4e9a162e-98e3-466c-a43c-8908beca18d2",
    "order_id": "332df42b-ab9f-4fc4-9d40-234bd89100e5",
    "expires_at": "2026-10-30T08:56:20.98704Z",
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

`POST /api/driver/v1/offers/4e9a162e-98e3-466c-a43c-8908beca18d2/accept` → **200**

```json
{
  "command_id": "c7eeeaac-e852-4ea6-bab0-2fed34a66cf3"
}
```

```json
{
  "id": "6098df6c-ee73-42fd-8321-9b1ec850420d",
  "order_id": "332df42b-ab9f-4fc4-9d40-234bd89100e5",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "575a8edf-bec5-43cd-a26a-5bdb2677d66a",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "575a8edf-bec5-43cd-a26a-5bdb2677d66a",
  "order_id": "332df42b-ab9f-4fc4-9d40-234bd89100e5",
  "assignment_id": "6098df6c-ee73-42fd-8321-9b1ec850420d",
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

`POST /api/driver/v1/trips/575a8edf-bec5-43cd-a26a-5bdb2677d66a/cancel` → **200**

```json
{
  "command_id": "626ebf3c-2a1c-41dd-8c2f-30fe95581a46",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "575a8edf-bec5-43cd-a26a-5bdb2677d66a",
  "order_id": "332df42b-ab9f-4fc4-9d40-234bd89100e5",
  "assignment_id": "6098df6c-ee73-42fd-8321-9b1ec850420d",
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

`GET /api/rider/v1/orders/332df42b-ab9f-4fc4-9d40-234bd89100e5` → **200**

```json
{
  "id": "332df42b-ab9f-4fc4-9d40-234bd89100e5",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "42cede04-c113-4260-8246-a84a1c529340",
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
    "id": "6098df6c-ee73-42fd-8321-9b1ec850420d",
    "order_id": "332df42b-ab9f-4fc4-9d40-234bd89100e5",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "575a8edf-bec5-43cd-a26a-5bdb2677d66a",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T08:56:05.982599Z",
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
    "id": "e2dabd64-0b5b-4539-830c-6888df5f86cc",
    "order_id": "332df42b-ab9f-4fc4-9d40-234bd89100e5",
    "expires_at": "2026-10-30T08:56:21.903038Z",
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

`POST /api/driver/v1/offers/e2dabd64-0b5b-4539-830c-6888df5f86cc/accept` → **200**

```json
{
  "command_id": "98499f6d-7e98-4686-8fb7-34beab5e5cad"
}
```

```json
{
  "id": "bdcc3fdb-05e6-42ee-927c-7ae67edc25e6",
  "order_id": "332df42b-ab9f-4fc4-9d40-234bd89100e5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "934635df-3b26-4b41-bcd2-739d3b1d465d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "934635df-3b26-4b41-bcd2-739d3b1d465d",
  "order_id": "332df42b-ab9f-4fc4-9d40-234bd89100e5",
  "assignment_id": "bdcc3fdb-05e6-42ee-927c-7ae67edc25e6",
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

`POST /api/driver/v1/trips/934635df-3b26-4b41-bcd2-739d3b1d465d/cancel` → **200**

```json
{
  "command_id": "42b0937c-3cf7-4963-8392-17ce4e681450",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "934635df-3b26-4b41-bcd2-739d3b1d465d",
  "order_id": "332df42b-ab9f-4fc4-9d40-234bd89100e5",
  "assignment_id": "bdcc3fdb-05e6-42ee-927c-7ae67edc25e6",
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
    "id": "332df42b-ab9f-4fc4-9d40-234bd89100e5",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T08:56:05.982599Z",
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
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel"
      }
    },
    "pickup_at": null
  },
  {
    "id": "33f43fa8-5783-4225-8756-0883425ee656",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-30T08:56:03.609705Z",
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
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто",
        "en": "The wait is too long"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/332df42b-ab9f-4fc4-9d40-234bd89100e5/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:56:05.983336Z",
      "actor": {
        "type": "CLIENT",
        "id": "42cede04-c113-4260-8246-a84a1c529340",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "332df42b-ab9f-4fc4-9d40-234bd89100e5",
        "quote_id": "335b8a48-87c3-4b0a-b065-ba6cff326139",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "019b3c88-8c83-4074-b7a2-2a4f2ea5e606"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:56:05.986057Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "332df42b-ab9f-4fc4-9d40-234bd89100e5",
        "attempt_id": "09ac7af3-09bf-4fb4-a044-c97ae3da792d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "019b3c88-8c83-4074-b7a2-2a4f2ea5e606"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T08:56:05.992911Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "4e9a162e-98e3-466c-a43c-8908beca18d2",
        "order_id": "332df42b-ab9f-4fc4-9d40-234bd89100e5",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "019b3c88-8c83-4074-b7a2-2a4f2ea5e606"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T08:56:06.446871Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "4e9a162e-98e3-466c-a43c-8908beca18d2",
        "order_id": "332df42b-ab9f-4fc4-9d40-234bd89100e5",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "6098df6c-ee73-42fd-8321-9b1ec850420d"
      },
      "correlation_id": "0ce5e434-7322-4c8f-9f9d-22360d16d453"
```

Done: orders 33f43fa8-5783-4225-8756-0883425ee656, 332df42b-ab9f-4fc4-9d40-234bd89100e5.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734608402",
  "device_ref": "sandbox-4293"
}
```

```json
{
  "challenge_id": "7085e086-42cd-4937-ba8c-1281f4dcbefc",
  "expires_at": "2026-10-30T09:01:08.78032911Z",
  "resend_available_at": "2026-10-30T08:56:09.78032911Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734608402` → **200**

```json
{
  "phone": "+380734608402",
  "audience": "CLIENT",
  "code": "136468",
  "sent_at": "2026-10-30T08:56:08.783154095Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7085e086-42cd-4937-ba8c-1281f4dcbefc",
  "code": "136468",
  "device_ref": "sandbox-4293"
}
```

```json
{
  "session_id": "2ce1acec-336f-4a0d-8e3f-adf646db3e5a",
  "subject": {
    "type": "CLIENT",
    "id": "a50b46ed-e0cd-4258-bd04-631f076dd372"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTBiNDZlZC1lMGNkLTQyNTgtYmQwNC02MzFmMDc2ZGQzNzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNDY5LCJpYXQiOjE3OTMzNTA1NjksImp0aSI6ImY5NjFmZjY2LTY1YmItNDFmNS1iYzY0LTA3MDZkN2ZiZDRiZCIsInNpZCI6IjJjZTFhY2VjLTMzNmYtNGEwZC04ZTNmLWFkZjY0NmRiM2U1YSJ9.lSxlopjqb2t_wQTt88pe67bRQKvD2_yhXmCAl_ekioE",
  "access_expires_at": "2026-10-30T09:11:09.035110573Z",
  "refresh_token": "cbODnN5A3UPtCUui93_vVzWPVWV_XWLADwKXT98Adx0",
  "refresh_expires_at": "2026-11-29T08:56:09.03448246Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "874aed60-ae11-489b-bfae-b8b4326fa178",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "4a06993d-886f-4b31-9941-ba58807e1362",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-4a06993d-886f-4b31-9941-ba58807e1362",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "9656cdfd127f7e69744872307c11af48",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=4a06993d-886f-4b31-9941-ba58807e1362",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734608402"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=4a06993d-886f-4b31-9941-ba58807e1362",
  "expires_at": "2026-10-30T09:26:09.265256Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/4a06993d-886f-4b31-9941-ba58807e1362` → **200**

```json
{
  "id": "4a06993d-886f-4b31-9941-ba58807e1362",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T09:26:09.265256Z",
  "card": {
    "id": "6c648a71-3940-4b2f-9f47-875b5afe727d",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0758",
    "card_type": "Visa",
    "created_at": "2026-10-30T08:56:09.499624Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "6c648a71-3940-4b2f-9f47-875b5afe727d",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****0758",
      "card_type": "Visa",
      "created_at": "2026-10-30T08:56:09.499624Z"
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
  "device_ref": "sandbox-12284"
}
```

```json
{
  "challenge_id": "ed85efa9-6674-42b2-8043-8129aeff2be1",
  "expires_at": "2026-10-30T09:01:09.961886953Z",
  "resend_available_at": "2026-10-30T08:56:10.961886953Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "171059",
  "sent_at": "2026-10-30T08:56:09.964763535Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ed85efa9-6674-42b2-8043-8129aeff2be1",
  "code": "171059",
  "device_ref": "sandbox-12284"
}
```

```json
{
  "session_id": "d43671a0-7933-4760-97a4-f5eabe80e8ea",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTQ3MCwiaWF0IjoxNzkzMzUwNTcwLCJqdGkiOiJhYjZhMDVmMC02ZDQzLTQzZDgtOGUzZC00YWNkNDEzM2VhMDIiLCJzaWQiOiJkNDM2NzFhMC03OTMzLTQ3NjAtOTdhNC1mNWVhYmU4MGU4ZWEifQ.jBd8gbxnGq1U8N8WBeeLUEhBZ6EiNW55hFTI3HxGnkk",
  "access_expires_at": "2026-10-30T09:11:10.212256722Z",
  "refresh_token": "CUtuylwW3QP5JumbDwDuzBTuBqaIAeVJ7AVyuK-PRxw",
  "refresh_expires_at": "2026-11-29T08:56:10.211776215Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "acc11632-ccbc-4e8f-b528-43d1ac126fd3",
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
  "last_heartbeat_at": "2026-10-30T08:56:05.519944Z",
  "last_location_at": "2026-10-30T08:56:05.519944Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/acc11632-ccbc-4e8f-b528-43d1ac126fd3/handover` → **200**

```json
{
  "command_id": "bc2cbec3-4ab7-4d07-91ba-5d68b9a64b0f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "acc11632-ccbc-4e8f-b528-43d1ac126fd3",
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
  "last_heartbeat_at": "2026-10-30T08:56:05.519944Z",
  "last_location_at": "2026-10-30T08:56:05.519944Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/acc11632-ccbc-4e8f-b528-43d1ac126fd3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:56:10Z",
    "sequence": 1793350570892
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "acc11632-ccbc-4e8f-b528-43d1ac126fd3",
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
  "last_heartbeat_at": "2026-10-30T08:56:10.90915Z",
  "last_location_at": "2026-10-30T08:56:10.90915Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1c80949d-47a7-46ae-895e-d9593eddfb51",
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
  "id": "41162d07-952a-476c-8a89-527c41399feb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:01:11.136404Z",
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
  "command_id": "58de822c-0811-4fcf-ada8-721a6a4863e2",
  "quote_id": "41162d07-952a-476c-8a89-527c41399feb",
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
  "id": "fd2ee1e0-9fa8-4576-8841-022afd3c1612",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a50b46ed-e0cd-4258-bd04-631f076dd372",
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
  "created_at": "2026-10-30T08:56:11.383017Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fd2ee1e0-9fa8-4576-8841-022afd3c1612` → **200**

```json
{
  "id": "fd2ee1e0-9fa8-4576-8841-022afd3c1612",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a50b46ed-e0cd-4258-bd04-631f076dd372",
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
  "created_at": "2026-10-30T08:56:11.383017Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fd2ee1e0-9fa8-4576-8841-022afd3c1612` → **200**

```json
{
  "id": "fd2ee1e0-9fa8-4576-8841-022afd3c1612",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a50b46ed-e0cd-4258-bd04-631f076dd372",
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
  "created_at": "2026-10-30T08:56:11.383017Z",
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
    "id": "27d7c2ee-d3a0-4b07-8bbf-d387cc481417",
    "order_id": "fd2ee1e0-9fa8-4576-8841-022afd3c1612",
    "expires_at": "2026-10-30T08:56:27.051126Z",
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

`POST /api/driver/v1/offers/27d7c2ee-d3a0-4b07-8bbf-d387cc481417/accept` → **200**

```json
{
  "command_id": "03c1e058-1789-4a38-9ac5-1cad2ca505ee"
}
```

```json
{
  "id": "ff0070e4-a950-447c-8aa6-a1513193b55f",
  "order_id": "fd2ee1e0-9fa8-4576-8841-022afd3c1612",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a1528388-da0e-4a10-9088-e19eb24ec297",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a1528388-da0e-4a10-9088-e19eb24ec297",
  "order_id": "fd2ee1e0-9fa8-4576-8841-022afd3c1612",
  "assignment_id": "ff0070e4-a950-447c-8aa6-a1513193b55f",
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

`POST /api/driver/v1/work-sessions/acc11632-ccbc-4e8f-b528-43d1ac126fd3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:56:13Z",
    "sequence": 1793350573742
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "acc11632-ccbc-4e8f-b528-43d1ac126fd3",
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
  "last_heartbeat_at": "2026-10-30T08:56:13.759546Z",
  "last_location_at": "2026-10-30T08:56:13.759546Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a1528388-da0e-4a10-9088-e19eb24ec297/arrive` → **200**

```json
{
  "command_id": "fbcbe7a5-4549-4c00-9980-23cc91237665",
  "expected_version": 0
}
```

```json
{
  "id": "a1528388-da0e-4a10-9088-e19eb24ec297",
  "order_id": "fd2ee1e0-9fa8-4576-8841-022afd3c1612",
  "assignment_id": "ff0070e4-a950-447c-8aa6-a1513193b55f",
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
  "arrived_at": "2026-10-30T08:56:13.988813Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a1528388-da0e-4a10-9088-e19eb24ec297/start` → **200**

```json
{
  "command_id": "c6e481b8-4134-4136-912d-2b3382f36968",
  "expected_version": 1
}
```

```json
{
  "id": "a1528388-da0e-4a10-9088-e19eb24ec297",
  "order_id": "fd2ee1e0-9fa8-4576-8841-022afd3c1612",
  "assignment_id": "ff0070e4-a950-447c-8aa6-a1513193b55f",
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
  "arrived_at": "2026-10-30T08:56:13.988813Z",
  "started_at": "2026-10-30T08:56:14.22381Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a1528388-da0e-4a10-9088-e19eb24ec297/complete` → **200**

```json
{
  "command_id": "7e90a619-9d50-475f-96d9-b5a9a57d42b7",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:56:14Z",
  "cash_received": true
}
```

```json
{
  "id": "a1528388-da0e-4a10-9088-e19eb24ec297",
  "order_id": "fd2ee1e0-9fa8-4576-8841-022afd3c1612",
  "assignment_id": "ff0070e4-a950-447c-8aa6-a1513193b55f",
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
  "arrived_at": "2026-10-30T08:56:13.988813Z",
  "started_at": "2026-10-30T08:56:14.22381Z",
  "completed_at": "2026-10-30T08:56:14.462039Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/fd2ee1e0-9fa8-4576-8841-022afd3c1612` → **200**

```json
{
  "id": "fd2ee1e0-9fa8-4576-8841-022afd3c1612",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "a50b46ed-e0cd-4258-bd04-631f076dd372",
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
    "id": "ff0070e4-a950-447c-8aa6-a1513193b55f",
    "order_id": "fd2ee1e0-9fa8-4576-8841-022afd3c1612",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a1528388-da0e-4a10-9088-e19eb24ec297",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:56:11.383017Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fd2ee1e0-9fa8-4576-8841-022afd3c1612` → **200**

```json
{
  "id": "fd2ee1e0-9fa8-4576-8841-022afd3c1612",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "a50b46ed-e0cd-4258-bd04-631f076dd372",
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
    "id": "ff0070e4-a950-447c-8aa6-a1513193b55f",
    "order_id": "fd2ee1e0-9fa8-4576-8841-022afd3c1612",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a1528388-da0e-4a10-9088-e19eb24ec297",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:56:11.383017Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fd2ee1e0-9fa8-4576-8841-022afd3c1612` → **200**

```json
{
  "id": "fd2ee1e0-9fa8-4576-8841-022afd3c1612",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "a50b46ed-e0cd-4258-bd04-631f076dd372",
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
    "id": "ff0070e4-a950-447c-8aa6-a1513193b55f",
    "order_id": "fd2ee1e0-9fa8-4576-8841-022afd3c1612",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a1528388-da0e-4a10-9088-e19eb24ec297",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:56:11.383017Z",
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

`GET /api/rider/v1/orders/fd2ee1e0-9fa8-4576-8841-022afd3c1612/tip` → **200**

```json
{
  "order_id": "fd2ee1e0-9fa8-4576-8841-022afd3c1612",
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
  "available_until": "2026-10-31T08:56:14.462039Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/fd2ee1e0-9fa8-4576-8841-022afd3c1612/tip` → **201**

```json
{
  "command_id": "e36f3a95-f88f-489d-bcf3-40cd8269da02",
  "amount_minor": 2500
}
```

```json
{
  "id": "1cd6dd2c-5701-4139-af08-aa30abad6280",
  "order_id": "fd2ee1e0-9fa8-4576-8841-022afd3c1612",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T08:56:17.850479Z"
}
```

`GET /api/rider/v1/orders/fd2ee1e0-9fa8-4576-8841-022afd3c1612/tip` → **200**

```json
{
  "order_id": "fd2ee1e0-9fa8-4576-8841-022afd3c1612",
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
  "available_until": "2026-10-31T08:56:14.462039Z",
  "open": false,
  "tip": {
    "id": "1cd6dd2c-5701-4139-af08-aa30abad6280",
    "order_id": "fd2ee1e0-9fa8-4576-8841-022afd3c1612",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T08:56:17.850479Z"
  }
}
```

`GET /api/rider/v1/orders/fd2ee1e0-9fa8-4576-8841-022afd3c1612/tip` → **200**

```json
{
  "order_id": "fd2ee1e0-9fa8-4576-8841-022afd3c1612",
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
  "available_until": "2026-10-31T08:56:14.462039Z",
  "open": false,
  "tip": {
    "id": "1cd6dd2c-5701-4139-af08-aa30abad6280",
    "order_id": "fd2ee1e0-9fa8-4576-8841-022afd3c1612",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T08:56:17.850479Z"
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
      "id": "b94ed38b-615a-4a45-a16d-c06665aed9ad",
      "at": "2026-10-30T08:56:19.143973Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "fd2ee1e0-9fa8-4576-8841-022afd3c1612",
      "counterpart_id": null
    },
    {
      "id": "a6e09499-6c83-43c2-9ee0-c3eda997a915",
      "at": "2026-10-30T08:56:15.096716Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "fd2ee1e0-9fa8-4576-8841-022afd3c1612",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "90395697-f76d-4c38-a9a2-4bb5f0d30b16",
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
  "id": "1f968c88-fce6-446e-9f24-ddec83ae934f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:01:19.781063Z",
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
  "session_id": "ef4d420d-4482-4acf-bf6e-2f63f8672560",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE0ODAsImlhdCI6MTc5MzM1MDU4MCwianRpIjoiMWQwNmEyZDUtYmU0Yy00NjIwLWFiMTgtODZkN2I1YjljMjkyIiwic2lkIjoiZWY0ZDQyMGQtNDQ4Mi00YWNmLWJmNmUtMmY2M2Y4NjcyNTYwIn0.dnDENAbrYW3Eds4FZD7PXLficL3R41VwjQrXncPMKbQ",
  "access_expires_at": "2026-10-30T09:11:20.274192803Z",
  "refresh_token": "byQ1jvZvN5HaR4wg3nWktVvbfP_zO3m8RzMaU0f_6ts",
  "refresh_expires_at": "2026-10-30T20:56:20.273690644Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380734608402` → **200**

```json
{
  "client_id": "a50b46ed-e0cd-4258-bd04-631f076dd372"
}
```

`POST /api/admin/v1/rider-wallets/a50b46ed-e0cd-4258-bd04-631f076dd372/top-ups` → **201**

```json
{
  "command_id": "23ece176-fd3b-4290-beb9-44975724f9dc",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "a50b46ed-e0cd-4258-bd04-631f076dd372",
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
      "id": "8d45ac0b-9700-4e7c-804f-53f61dbd10ef",
      "at": "2026-10-30T08:56:20.716899Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "31a00219-70fd-4586-82bb-ecb321d1f902",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "e4f51686-19cc-4893-8175-8176014435d7",
  "quote_id": "1f968c88-fce6-446e-9f24-ddec83ae934f",
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
  "id": "0e9de961-1c3e-4fd7-b109-150e6963367d",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a50b46ed-e0cd-4258-bd04-631f076dd372",
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
  "created_at": "2026-10-30T08:56:20.955391Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0e9de961-1c3e-4fd7-b109-150e6963367d` → **200**

```json
{
  "id": "0e9de961-1c3e-4fd7-b109-150e6963367d",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a50b46ed-e0cd-4258-bd04-631f076dd372",
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
  "created_at": "2026-10-30T08:56:20.955391Z",
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
    "id": "d65e86cf-9ce1-4df5-a871-da5912b296ed",
    "order_id": "0e9de961-1c3e-4fd7-b109-150e6963367d",
    "expires_at": "2026-10-30T08:56:35.961475Z",
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

`POST /api/driver/v1/offers/d65e86cf-9ce1-4df5-a871-da5912b296ed/accept` → **200**

```json
{
  "command_id": "26a91ba8-e4e3-4424-834a-18228db59ad0"
}
```

```json
{
  "id": "77d5f22a-9eda-4fa0-a9ea-2e0e1d50ac48",
  "order_id": "0e9de961-1c3e-4fd7-b109-150e6963367d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "679c5faa-0152-40bf-b14f-9f72cbef9a12",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "679c5faa-0152-40bf-b14f-9f72cbef9a12",
  "order_id": "0e9de961-1c3e-4fd7-b109-150e6963367d",
  "assignment_id": "77d5f22a-9eda-4fa0-a9ea-2e0e1d50ac48",
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

`POST /api/driver/v1/work-sessions/acc11632-ccbc-4e8f-b528-43d1ac126fd3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:56:22Z",
    "sequence": 1793350582829
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "acc11632-ccbc-4e8f-b528-43d1ac126fd3",
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
  "last_heartbeat_at": "2026-10-30T08:56:22.099903Z",
  "last_location_at": "2026-10-30T08:56:22.099903Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/679c5faa-0152-40bf-b14f-9f72cbef9a12/arrive` → **200**

```json
{
  "command_id": "30b138ea-b2e1-4c12-9a8a-f879e8c43b0e",
  "expected_version": 0
}
```

```json
{
  "id": "679c5faa-0152-40bf-b14f-9f72cbef9a12",
  "order_id": "0e9de961-1c3e-4fd7-b109-150e6963367d",
  "assignment_id": "77d5f22a-9eda-4fa0-a9ea-2e0e1d50ac48",
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
  "arrived_at": "2026-10-30T08:56:22.329148Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/679c5faa-0152-40bf-b14f-9f72cbef9a12/start` → **200**

```json
{
  "command_id": "336e5130-b7bc-4762-8cfd-55e6382c8eae",
  "expected_version": 1
}
```

```json
{
  "id": "679c5faa-0152-40bf-b14f-9f72cbef9a12",
  "order_id": "0e9de961-1c3e-4fd7-b109-150e6963367d",
  "assignment_id": "77d5f22a-9eda-4fa0-a9ea-2e0e1d50ac48",
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
  "arrived_at": "2026-10-30T08:56:22.329148Z",
  "started_at": "2026-10-30T08:56:22.566316Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/679c5faa-0152-40bf-b14f-9f72cbef9a12/complete` → **200**

```json
{
  "command_id": "c07325bb-690e-43b7-b657-e0fddadb2055",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:56:22Z",
  "cash_received": true
}
```

```json
{
  "id": "679c5faa-0152-40bf-b14f-9f72cbef9a12",
  "order_id": "0e9de961-1c3e-4fd7-b109-150e6963367d",
  "assignment_id": "77d5f22a-9eda-4fa0-a9ea-2e0e1d50ac48",
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
  "arrived_at": "2026-10-30T08:56:22.329148Z",
  "started_at": "2026-10-30T08:56:22.566316Z",
  "completed_at": "2026-10-30T08:56:22.804831Z",
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
  "client_id": "a50b46ed-e0cd-4258-bd04-631f076dd372",
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
      "id": "8d45ac0b-9700-4e7c-804f-53f61dbd10ef",
      "at": "2026-10-30T08:56:20.716899Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "31a00219-70fd-4586-82bb-ecb321d1f902",
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

`GET /api/rider/v1/orders/0e9de961-1c3e-4fd7-b109-150e6963367d/tip` → **200**

```json
{
  "order_id": "0e9de961-1c3e-4fd7-b109-150e6963367d",
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
  "available_until": "2026-10-31T08:56:22.804831Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/0e9de961-1c3e-4fd7-b109-150e6963367d/tip` → **201**

```json
{
  "command_id": "c93a318a-fbc5-4f56-8119-b6e9b307f71c",
  "amount_minor": 2500
}
```

```json
{
  "id": "98c50cc3-9a14-42de-a052-76b8181579db",
  "order_id": "0e9de961-1c3e-4fd7-b109-150e6963367d",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T08:56:23.717068Z"
}
```

`GET /api/rider/v1/orders/0e9de961-1c3e-4fd7-b109-150e6963367d/tip` → **200**

```json
{
  "order_id": "0e9de961-1c3e-4fd7-b109-150e6963367d",
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
  "available_until": "2026-10-31T08:56:22.804831Z",
  "open": false,
  "tip": {
    "id": "98c50cc3-9a14-42de-a052-76b8181579db",
    "order_id": "0e9de961-1c3e-4fd7-b109-150e6963367d",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T08:56:23.717068Z"
  }
}
```

`GET /api/rider/v1/orders/0e9de961-1c3e-4fd7-b109-150e6963367d/tip` → **200**

```json
{
  "order_id": "0e9de961-1c3e-4fd7-b109-150e6963367d",
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
  "available_until": "2026-10-31T08:56:22.804831Z",
  "open": false,
  "tip": {
    "id": "98c50cc3-9a14-42de-a052-76b8181579db",
    "order_id": "0e9de961-1c3e-4fd7-b109-150e6963367d",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T08:56:23.717068Z"
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
      "id": "56c5798b-ed7f-4653-b922-df80611640de",
      "at": "2026-10-30T08:56:25.206856Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "0e9de961-1c3e-4fd7-b109-150e6963367d",
      "counterpart_id": null
    },
    {
      "id": "20cf7bd4-300d-4526-861e-84003887edcb",
      "at": "2026-10-30T08:56:23.173513Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0e9de961-1c3e-4fd7-b109-150e6963367d",
      "counterpart_id": null
    },
    {
      "id": "b94ed38b-615a-4a45-a16d-c06665aed9ad",
      "at": "2026-10-30T08:56:19.143973Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "fd2ee1e0-9fa8-4576-8841-022afd3c1612",
      "counterpart_id": null
    },
    {
      "id": "a6e09499-6c83-43c2-9ee0-c3eda997a915",
      "at": "2026-10-30T08:56:15.096716Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "fd2ee1e0-9fa8-4576-8841-022afd3c1612",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "acc11632-ccbc-4e8f-b528-43d1ac126fd3",
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
  "last_heartbeat_at": "2026-10-30T08:56:22.099903Z",
  "last_location_at": "2026-10-30T08:56:22.099903Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/acc11632-ccbc-4e8f-b528-43d1ac126fd3/close` → **200**

```json
{
  "command_id": "4eabefbc-bdc7-4599-94d6-b118210abd25",
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

Done: card order 0e9de961-1c3e-4fd7-b109-150e6963367d.

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
  "phone": "+380732479640",
  "device_ref": "sandbox-4460"
}
```

```json
{
  "challenge_id": "5018b322-c5d3-4612-a7c5-3a336827495e",
  "expires_at": "2026-10-30T09:01:26.266259418Z",
  "resend_available_at": "2026-10-30T08:56:27.266259418Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380732479640` → **200**

```json
{
  "phone": "+380732479640",
  "audience": "CLIENT",
  "code": "083306",
  "sent_at": "2026-10-30T08:56:26.268776119Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5018b322-c5d3-4612-a7c5-3a336827495e",
  "code": "083306",
  "device_ref": "sandbox-4460"
}
```

```json
{
  "session_id": "fac0f04c-5c45-4d0b-b120-2531a8098037",
  "subject": {
    "type": "CLIENT",
    "id": "0eda032b-8522-4bb8-8336-641382f227c7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZWRhMDMyYi04NTIyLTRiYjgtODMzNi02NDEzODJmMjI3YzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNDg2LCJpYXQiOjE3OTMzNTA1ODYsImp0aSI6IjdiMGY0ZTkxLTRmYTMtNDhlOS1hYmNjLTU1ZDJjNWU0NjEyOSIsInNpZCI6ImZhYzBmMDRjLTVjNDUtNGQwYi1iMTIwLTI1MzFhODA5ODAzNyJ9.zEWRVgOluUZAVmVtuDjGXmIyeO-TyN7uYM-SAC9mHs0",
  "access_expires_at": "2026-10-30T09:11:26.508910945Z",
  "refresh_token": "VEkVov1mLNq9CX07fOmqPu443mGG09foW-BOwbDdlag",
  "refresh_expires_at": "2026-11-29T08:56:26.508414772Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "22c29182-a584-4492-8f9c-73c293fe0e6c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "099c2fe4-7255-473f-90e2-fdffd55562ae",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-099c2fe4-7255-473f-90e2-fdffd55562ae",
    "orderDate": "1793350586",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "42b85aa4c7a361ce5dfaeab2fa7c87de",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=099c2fe4-7255-473f-90e2-fdffd55562ae",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732479640"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=099c2fe4-7255-473f-90e2-fdffd55562ae",
  "created_at": "2026-10-30T08:56:26.736814Z",
  "expires_at": "2026-10-30T09:26:26.736814Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/099c2fe4-7255-473f-90e2-fdffd55562ae` → **200**

```json
{
  "id": "099c2fe4-7255-473f-90e2-fdffd55562ae",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T08:56:26.736814Z",
  "expires_at": "2026-10-30T09:26:26.736814Z",
  "completed_at": "2026-10-30T08:56:26.961173Z",
  "masked_pan": "41****9929",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "0eda032b-8522-4bb8-8336-641382f227c7",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "0eda032b-8522-4bb8-8336-641382f227c7",
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
      "id": "e3759af9-b360-4914-bb9c-e740e59b5839",
      "at": "2026-10-30T08:56:27.218967Z",
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
  "client_id": "0eda032b-8522-4bb8-8336-641382f227c7",
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
      "id": "e3759af9-b360-4914-bb9c-e740e59b5839",
      "at": "2026-10-30T08:56:27.218967Z",
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
  "device_ref": "sandbox-420"
}
```

```json
{
  "challenge_id": "e9161ae9-10b1-4e41-bcc4-6d6df9577175",
  "expires_at": "2026-10-30T09:01:28.887222098Z",
  "resend_available_at": "2026-10-30T08:56:29.887222098Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "586394",
  "sent_at": "2026-10-30T08:56:28.890062666Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9161ae9-10b1-4e41-bcc4-6d6df9577175",
  "code": "586394",
  "device_ref": "sandbox-420"
}
```

```json
{
  "session_id": "e1698880-f6a2-42e9-955f-5f42476fc0f4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTQ4OSwiaWF0IjoxNzkzMzUwNTg5LCJqdGkiOiJhOWE3MTI5NC1mZjBiLTRhOTQtOTQxNS02MjllMWNhYjc5Y2IiLCJzaWQiOiJlMTY5ODg4MC1mNmEyLTQyZTktOTU1Zi01ZjQyNDc2ZmMwZjQifQ.NARQaoTDb3QCjYDVHOtgkWal1HjoMy_paJIc2AKdUqE",
  "access_expires_at": "2026-10-30T09:11:29.136587238Z",
  "refresh_token": "-MM22KTfT-G61ZdP7wQ-_ZiTznjljU-VYgPXLu3iXyU",
  "refresh_expires_at": "2026-11-29T08:56:29.135982886Z",
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
  "command_id": "db1a93b6-946e-4d76-a525-96aa375a4a1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "e9da8bae-571f-4925-b641-961460169a27",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-e9da8bae-571f-4925-b641-961460169a27",
    "orderDate": "1793350589",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "9f7d7575a52aa156a85f4c09321d1210",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=e9da8bae-571f-4925-b641-961460169a27",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=e9da8bae-571f-4925-b641-961460169a27",
  "created_at": "2026-10-30T08:56:29.59065Z",
  "expires_at": "2026-10-30T09:26:29.59065Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/e9da8bae-571f-4925-b641-961460169a27` → **200**

```json
{
  "id": "e9da8bae-571f-4925-b641-961460169a27",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T08:56:29.59065Z",
  "expires_at": "2026-10-30T09:26:29.59065Z",
  "completed_at": "2026-10-30T08:56:29.817839Z",
  "masked_pan": "41****5896",
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
      "id": "31edf03f-b9cb-4e90-b257-c7496f0a25a4",
      "at": "2026-10-30T08:56:30.226032Z",
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
  "command_id": "1d7d24b7-5ab6-457c-b8fa-e8690b645ade",
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
  "correlation_id": "c854dcf0-91df-4081-9d3d-6c48ee1f4c9b"
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
  "device_ref": "sandbox-19277"
}
```

```json
{
  "challenge_id": "1dfbe2c8-680c-4c45-aa79-e9eee58c1255",
  "expires_at": "2026-10-30T09:01:31.733070314Z",
  "resend_available_at": "2026-10-30T08:56:32.733070314Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "883057",
  "sent_at": "2026-10-30T08:56:31.736302455Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1dfbe2c8-680c-4c45-aa79-e9eee58c1255",
  "code": "883057",
  "device_ref": "sandbox-19277"
}
```

```json
{
  "session_id": "f87e694e-aacb-46e8-9bcc-991577381597",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTQ5MSwiaWF0IjoxNzkzMzUwNTkxLCJqdGkiOiJhNTliNzMzYS0yODhiLTRiN2EtODFhYi1hZjJkZGRkYTNiN2IiLCJzaWQiOiJmODdlNjk0ZS1hYWNiLTQ2ZTgtOWJjYy05OTE1NzczODE1OTcifQ.XiB-9K0Vk_x_H3z0cBV2UVMTo71j5TemMz3RjXc5fJA",
  "access_expires_at": "2026-10-30T09:11:31.975370993Z",
  "refresh_token": "SiRAoHGooF4GZTJjeUhWAH5MLa8DQ6R9RV5uwcMDwm4",
  "refresh_expires_at": "2026-11-29T08:56:31.974862412Z",
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
  "command_id": "b8d9335f-35dc-4095-a032-4ad106adcf7b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:56:32Z",
    "sequence": 1793350592411
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9a656e78-80db-4bb8-9e1d-f57536e42ab5",
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
  "last_heartbeat_at": "2026-10-30T08:56:32.428583Z",
  "last_location_at": "2026-10-30T08:56:32.428583Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631686146",
  "device_ref": "sandbox-12152"
}
```

```json
{
  "challenge_id": "386b2217-781e-464e-aa95-948aa5139aaf",
  "expires_at": "2026-10-30T09:01:32.658647875Z",
  "resend_available_at": "2026-10-30T08:56:33.658647875Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631686146` → **200**

```json
{
  "phone": "+380631686146",
  "audience": "CLIENT",
  "code": "608798",
  "sent_at": "2026-10-30T08:56:32.661232996Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "386b2217-781e-464e-aa95-948aa5139aaf",
  "code": "608798",
  "device_ref": "sandbox-12152"
}
```

```json
{
  "session_id": "39f02565-30ed-425d-a31d-72457f5509a4",
  "subject": {
    "type": "CLIENT",
    "id": "131ca535-0bdb-48da-a625-e18c250c023c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzFjYTUzNS0wYmRiLTQ4ZGEtYTYyNS1lMThjMjUwYzAyM2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNDkyLCJpYXQiOjE3OTMzNTA1OTIsImp0aSI6ImViYWJlZWNiLTMyMTItNGFjOS05ZjlhLTFiZDkxY2MwMDI2NyIsInNpZCI6IjM5ZjAyNTY1LTMwZWQtNDI1ZC1hMzFkLTcyNDU3ZjU1MDlhNCJ9.UUH1VvN8-cxBl4302k1XjFKKXGcEyYAHQjHdVoVNdXQ",
  "access_expires_at": "2026-10-30T09:11:32.908003539Z",
  "refresh_token": "qeq8VJga0ryBOnbeqtSH2bkd8fwKM-awYjI4wCD7Mgk",
  "refresh_expires_at": "2026-11-29T08:56:32.907502419Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "779b3aca-f90f-4a29-b8f5-73a95da8cea4",
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
  "id": "c51e310f-01bb-4549-b1eb-0f0e4f64cd80",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:01:33.131029Z",
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
  "command_id": "11f770b8-f804-4d09-bfae-3921f0c55be2",
  "quote_id": "c51e310f-01bb-4549-b1eb-0f0e4f64cd80",
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
  "id": "5842df53-9451-40fa-a310-dcbce157b1dc",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "131ca535-0bdb-48da-a625-e18c250c023c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:56:33.368463Z",
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
    "id": "36addbcb-06f5-4778-8958-72cae20e0ef9",
    "order_id": "5842df53-9451-40fa-a310-dcbce157b1dc",
    "expires_at": "2026-10-30T08:56:48.371314Z",
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

`POST /api/driver/v1/offers/36addbcb-06f5-4778-8958-72cae20e0ef9/accept` → **200**

```json
{
  "command_id": "cc0a7259-f6d7-4d0f-a431-df83df30412a"
}
```

```json
{
  "id": "cf50c8e5-73e6-4c64-9d28-27648c617962",
  "order_id": "5842df53-9451-40fa-a310-dcbce157b1dc",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "108882b7-0fcf-4450-abbd-06ec1fa5f40a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "108882b7-0fcf-4450-abbd-06ec1fa5f40a",
  "order_id": "5842df53-9451-40fa-a310-dcbce157b1dc",
  "assignment_id": "cf50c8e5-73e6-4c64-9d28-27648c617962",
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

`POST /api/driver/v1/work-sessions/9a656e78-80db-4bb8-9e1d-f57536e42ab5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:56:34Z",
    "sequence": 1793350594282
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9a656e78-80db-4bb8-9e1d-f57536e42ab5",
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
  "last_heartbeat_at": "2026-10-30T08:56:34.29917Z",
  "last_location_at": "2026-10-30T08:56:34.29917Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/108882b7-0fcf-4450-abbd-06ec1fa5f40a/arrive` → **200**

```json
{
  "command_id": "f92c89e3-5c38-4aaa-b80c-6fa394e77fda",
  "expected_version": 0
}
```

```json
{
  "id": "108882b7-0fcf-4450-abbd-06ec1fa5f40a",
  "order_id": "5842df53-9451-40fa-a310-dcbce157b1dc",
  "assignment_id": "cf50c8e5-73e6-4c64-9d28-27648c617962",
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
  "arrived_at": "2026-10-30T08:56:34.52536Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/108882b7-0fcf-4450-abbd-06ec1fa5f40a/start` → **200**

```json
{
  "command_id": "c86da667-b957-4804-b17c-9c1051effcd4",
  "expected_version": 1
}
```

```json
{
  "id": "108882b7-0fcf-4450-abbd-06ec1fa5f40a",
  "order_id": "5842df53-9451-40fa-a310-dcbce157b1dc",
  "assignment_id": "cf50c8e5-73e6-4c64-9d28-27648c617962",
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
  "arrived_at": "2026-10-30T08:56:34.52536Z",
  "started_at": "2026-10-30T08:56:34.757415Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/108882b7-0fcf-4450-abbd-06ec1fa5f40a/complete` → **200**

```json
{
  "command_id": "c6b91337-c3ce-4461-821b-c1641b1a245b",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:56:34Z",
  "cash_received": false
}
```

```json
{
  "id": "108882b7-0fcf-4450-abbd-06ec1fa5f40a",
  "order_id": "5842df53-9451-40fa-a310-dcbce157b1dc",
  "assignment_id": "cf50c8e5-73e6-4c64-9d28-27648c617962",
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
  "arrived_at": "2026-10-30T08:56:34.52536Z",
  "started_at": "2026-10-30T08:56:34.757415Z",
  "completed_at": "2026-10-30T08:56:34.990884Z",
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
  "session_id": "174e7bdc-36f6-4237-8e95-c32eae872c9f",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE0OTUsImlhdCI6MTc5MzM1MDU5NSwianRpIjoiMzY3YThiZTMtYmM5NS00Mzg2LThjZmMtZDE1NjkzNjZlNzI0Iiwic2lkIjoiMTc0ZTdiZGMtMzZmNi00MjM3LThlOTUtYzMyZWFlODcyYzlmIn0.qxbHSs6FVutozB0EoqyUevGPcxW_gDnOiCFJxvlsmKQ",
  "access_expires_at": "2026-10-30T09:11:35.474731674Z",
  "refresh_token": "twnjcND7-JCkLUZ7uOX-CxKek1jifmsaAkO6xQtk-70",
  "refresh_expires_at": "2026-10-30T20:56:35.474220759Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/5842df53-9451-40fa-a310-dcbce157b1dc/cash-dispute` → **200**

```json
{
  "order_id": "5842df53-9451-40fa-a310-dcbce157b1dc",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "131ca535-0bdb-48da-a625-e18c250c023c",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T08:56:35.27212Z",
  "decide_by": "2026-11-13T08:56:35.27212Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T08:56:35.27212Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "5842df53-9451-40fa-a310-dcbce157b1dc",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "131ca535-0bdb-48da-a625-e18c250c023c",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T08:56:35.27212Z",
      "decide_by": "2026-11-13T08:56:35.27212Z",
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

`POST /api/admin/v1/orders/5842df53-9451-40fa-a310-dcbce157b1dc/cash-dispute/decide` → **400**

```json
{
  "command_id": "73571c80-4758-4763-8f06-428970315e35",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/5842df53-9451-40fa-a310-dcbce157b1dc/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "c5744ff2-306e-4e05-9ca3-859a4037f2b0",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/5842df53-9451-40fa-a310-dcbce157b1dc/cash-dispute/decide` → **200**

```json
{
  "command_id": "c2bad6af-adaa-4f6c-b3b6-d602f55cacd3",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "5842df53-9451-40fa-a310-dcbce157b1dc",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "131ca535-0bdb-48da-a625-e18c250c023c",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T08:56:35.27212Z",
  "decide_by": "2026-11-13T08:56:35.27212Z",
  "decision": "PAY_DRIVER",
  "decided_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T08:56:36.413462Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/5842df53-9451-40fa-a310-dcbce157b1dc/cash-dispute/decide` → **409**

```json
{
  "command_id": "89d08185-2756-4739-a0a7-5f88d2a8f607",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/5842df53-9451-40fa-a310-dcbce157b1dc/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "58ed10dd-553b-4953-9bbf-c02850d47268"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9a656e78-80db-4bb8-9e1d-f57536e42ab5",
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
  "last_heartbeat_at": "2026-10-30T08:56:34.29917Z",
  "last_location_at": "2026-10-30T08:56:34.29917Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9a656e78-80db-4bb8-9e1d-f57536e42ab5/close` → **200**

```json
{
  "command_id": "de0bb803-35af-47c6-81b6-fee38bf3faab",
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
  "phone": "+380731890443",
  "device_ref": "sandbox-17789"
}
```

```json
{
  "challenge_id": "bb7c8d89-a38d-462f-8261-317627dd1226",
  "expires_at": "2026-10-30T09:01:37.33190201Z",
  "resend_available_at": "2026-10-30T08:56:38.33190201Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380731890443` → **200**

```json
{
  "phone": "+380731890443",
  "audience": "CLIENT",
  "code": "039451",
  "sent_at": "2026-10-30T08:56:37.33436779Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bb7c8d89-a38d-462f-8261-317627dd1226",
  "code": "039451",
  "device_ref": "sandbox-17789"
}
```

```json
{
  "session_id": "3f175dd8-1606-40f1-a1ea-c72ae834ba56",
  "subject": {
    "type": "CLIENT",
    "id": "48603da9-7c06-417a-9a7e-8ee3947afe30"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ODYwM2RhOS03YzA2LTQxN2EtOWE3ZS04ZWUzOTQ3YWZlMzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNDk3LCJpYXQiOjE3OTMzNTA1OTcsImp0aSI6IjA3ZGZlZjBkLWNkZjctNGZlZC1iZTBhLTIyYWQ1YzZkMTc2YiIsInNpZCI6IjNmMTc1ZGQ4LTE2MDYtNDBmMS1hMWVhLWM3MmFlODM0YmE1NiJ9.KRD6d_lLw47kUb8ERQPntpAsbXbj8hRmv1nvfYk8wBM",
  "access_expires_at": "2026-10-30T09:11:37.577104195Z",
  "refresh_token": "p05goXXN7prL0m2Q_jaD1E_Aey5m8PjqeBcLeoiwdAQ",
  "refresh_expires_at": "2026-11-29T08:56:37.576689235Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "29853578-b544-4857-9531-0051062b9b78",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "be1e2d9c-e252-4e85-a8e0-c9596a2235a2",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-be1e2d9c-e252-4e85-a8e0-c9596a2235a2",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "0f99da7c882a4f6c2453ecc6cc863d54",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=be1e2d9c-e252-4e85-a8e0-c9596a2235a2",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731890443"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=be1e2d9c-e252-4e85-a8e0-c9596a2235a2",
  "expires_at": "2026-10-30T09:26:37.793929Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/be1e2d9c-e252-4e85-a8e0-c9596a2235a2` → **200**

```json
{
  "id": "be1e2d9c-e252-4e85-a8e0-c9596a2235a2",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T09:26:37.793929Z",
  "card": {
    "id": "6db69f65-0db3-4e3a-9fed-61b1e1752a15",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****9434",
    "card_type": "Visa",
    "created_at": "2026-10-30T08:56:38.017579Z"
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
  "device_ref": "sandbox-11846"
}
```

```json
{
  "challenge_id": "c2621f39-e5f8-41cc-8643-4ab94428fbd1",
  "expires_at": "2026-10-30T09:01:38.247747957Z",
  "resend_available_at": "2026-10-30T08:56:39.247747957Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "246036",
  "sent_at": "2026-10-30T08:56:38.250078692Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c2621f39-e5f8-41cc-8643-4ab94428fbd1",
  "code": "246036",
  "device_ref": "sandbox-11846"
}
```

```json
{
  "session_id": "24de54e8-d863-4cee-af30-0745492ab882",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTQ5OCwiaWF0IjoxNzkzMzUwNTk4LCJqdGkiOiI4N2UwY2I4OC03NDkzLTRkZmItOTlmYy0xMTBmYzIxODczN2YiLCJzaWQiOiIyNGRlNTRlOC1kODYzLTRjZWUtYWYzMC0wNzQ1NDkyYWI4ODIifQ.CVBv01Rbzez1HyDqIcgj06zeF_iv3TutvROsAc2cUgY",
  "access_expires_at": "2026-10-30T09:11:38.489022891Z",
  "refresh_token": "dFsNsajlBLwQIrPhw8AxRreagwkZLb3xh_zDWD_s62U",
  "refresh_expires_at": "2026-11-29T08:56:38.488604997Z",
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
  "command_id": "82189e0c-ce81-4cd3-9126-00a772c8cb49",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:56:38Z",
    "sequence": 1793350598932
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0857283a-53fe-4563-8cb3-141e3546afb1",
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
  "last_heartbeat_at": "2026-10-30T08:56:38.94914Z",
  "last_location_at": "2026-10-30T08:56:38.94914Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4a3d4d69-86c0-4be0-9791-c935ef660f55",
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
  "id": "6b279f48-1743-41f1-b057-9733a4618ac8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:01:39.173711Z",
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
  "command_id": "f302b93a-34d3-47c4-8b9b-6d67421940a7",
  "quote_id": "6b279f48-1743-41f1-b057-9733a4618ac8",
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
  "id": "582a4439-1bc5-4215-87aa-5634b2a910e9",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "48603da9-7c06-417a-9a7e-8ee3947afe30",
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
  "created_at": "2026-10-30T08:56:39.405493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/582a4439-1bc5-4215-87aa-5634b2a910e9` → **200**

```json
{
  "id": "582a4439-1bc5-4215-87aa-5634b2a910e9",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "48603da9-7c06-417a-9a7e-8ee3947afe30",
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
  "created_at": "2026-10-30T08:56:39.405493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/582a4439-1bc5-4215-87aa-5634b2a910e9` → **200**

```json
{
  "id": "582a4439-1bc5-4215-87aa-5634b2a910e9",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "48603da9-7c06-417a-9a7e-8ee3947afe30",
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
  "created_at": "2026-10-30T08:56:39.405493Z",
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
    "id": "b611ffb8-4c56-400f-86be-cc13a64d27d9",
    "order_id": "582a4439-1bc5-4215-87aa-5634b2a910e9",
    "expires_at": "2026-10-30T08:56:55.305626Z",
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

`POST /api/driver/v1/offers/b611ffb8-4c56-400f-86be-cc13a64d27d9/accept` → **200**

```json
{
  "command_id": "ff9e233f-c4db-4d69-8223-2dba29b1c99c"
}
```

```json
{
  "id": "46f0a607-5a26-4a31-ac1c-c9dcf48e734e",
  "order_id": "582a4439-1bc5-4215-87aa-5634b2a910e9",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fa1edba2-28b9-4f23-b45a-6924ab86e96a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fa1edba2-28b9-4f23-b45a-6924ab86e96a",
  "order_id": "582a4439-1bc5-4215-87aa-5634b2a910e9",
  "assignment_id": "46f0a607-5a26-4a31-ac1c-c9dcf48e734e",
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

`POST /api/rider/v1/orders/582a4439-1bc5-4215-87aa-5634b2a910e9/messages` → **201**

```json
{
  "command_id": "3d9d9574-bc13-42db-a622-351d46bec08c",
  "body": "Я біля входу, мій номер +380731890443, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "8a8cc1b3-2f6a-4226-b54d-474fcf7678f3",
  "order_id": "582a4439-1bc5-4215-87aa-5634b2a910e9",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380731890443, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T08:56:41.767146677Z"
}
```

`POST /api/driver/v1/trips/fa1edba2-28b9-4f23-b45a-6924ab86e96a/messages` → **201**

```json
{
  "command_id": "e46c123b-22fc-435d-9774-767e88f6c4a4",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "396cbeeb-ab31-4d1c-a114-ea6a555e1488",
  "order_id": "582a4439-1bc5-4215-87aa-5634b2a910e9",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T08:56:41.993817202Z"
}
```

`POST /api/driver/v1/work-sessions/0857283a-53fe-4563-8cb3-141e3546afb1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:56:42Z",
    "sequence": 1793350602207
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0857283a-53fe-4563-8cb3-141e3546afb1",
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
  "last_heartbeat_at": "2026-10-30T08:56:42.224632Z",
  "last_location_at": "2026-10-30T08:56:42.224632Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/fa1edba2-28b9-4f23-b45a-6924ab86e96a/arrive` → **200**

```json
{
  "command_id": "63c9b62f-0ece-417d-8e87-fa4713e134b4",
  "expected_version": 0
}
```

```json
{
  "id": "fa1edba2-28b9-4f23-b45a-6924ab86e96a",
  "order_id": "582a4439-1bc5-4215-87aa-5634b2a910e9",
  "assignment_id": "46f0a607-5a26-4a31-ac1c-c9dcf48e734e",
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
  "arrived_at": "2026-10-30T08:56:42.453943Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fa1edba2-28b9-4f23-b45a-6924ab86e96a/start` → **200**

```json
{
  "command_id": "72311ce5-3596-41dd-aeb0-83a270b7a0d9",
  "expected_version": 1
}
```

```json
{
  "id": "fa1edba2-28b9-4f23-b45a-6924ab86e96a",
  "order_id": "582a4439-1bc5-4215-87aa-5634b2a910e9",
  "assignment_id": "46f0a607-5a26-4a31-ac1c-c9dcf48e734e",
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
  "arrived_at": "2026-10-30T08:56:42.453943Z",
  "started_at": "2026-10-30T08:56:42.693471Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/0857283a-53fe-4563-8cb3-141e3546afb1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:56:42Z",
    "sequence": 1793350602910
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0857283a-53fe-4563-8cb3-141e3546afb1",
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
  "last_heartbeat_at": "2026-10-30T08:56:42.926645Z",
  "last_location_at": "2026-10-30T08:56:42.926645Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/fa1edba2-28b9-4f23-b45a-6924ab86e96a/complete` → **200**

```json
{
  "command_id": "88f04b35-8a30-41be-9185-b52b9094e137",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:56:43Z",
  "cash_received": false
}
```

```json
{
  "id": "fa1edba2-28b9-4f23-b45a-6924ab86e96a",
  "order_id": "582a4439-1bc5-4215-87aa-5634b2a910e9",
  "assignment_id": "46f0a607-5a26-4a31-ac1c-c9dcf48e734e",
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
  "arrived_at": "2026-10-30T08:56:42.453943Z",
  "started_at": "2026-10-30T08:56:42.693471Z",
  "completed_at": "2026-10-30T08:56:43.153949Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/582a4439-1bc5-4215-87aa-5634b2a910e9` → **200**

```json
{
  "id": "582a4439-1bc5-4215-87aa-5634b2a910e9",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "48603da9-7c06-417a-9a7e-8ee3947afe30",
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
    "id": "46f0a607-5a26-4a31-ac1c-c9dcf48e734e",
    "order_id": "582a4439-1bc5-4215-87aa-5634b2a910e9",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "fa1edba2-28b9-4f23-b45a-6924ab86e96a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:56:39.405493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/582a4439-1bc5-4215-87aa-5634b2a910e9` → **200**

```json
{
  "id": "582a4439-1bc5-4215-87aa-5634b2a910e9",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "48603da9-7c06-417a-9a7e-8ee3947afe30",
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
    "id": "46f0a607-5a26-4a31-ac1c-c9dcf48e734e",
    "order_id": "582a4439-1bc5-4215-87aa-5634b2a910e9",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "fa1edba2-28b9-4f23-b45a-6924ab86e96a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:56:39.405493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/582a4439-1bc5-4215-87aa-5634b2a910e9` → **200**

```json
{
  "id": "582a4439-1bc5-4215-87aa-5634b2a910e9",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "48603da9-7c06-417a-9a7e-8ee3947afe30",
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
    "id": "46f0a607-5a26-4a31-ac1c-c9dcf48e734e",
    "order_id": "582a4439-1bc5-4215-87aa-5634b2a910e9",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "fa1edba2-28b9-4f23-b45a-6924ab86e96a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:56:39.405493Z",
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
  "session_id": "0857283a-53fe-4563-8cb3-141e3546afb1",
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
  "last_heartbeat_at": "2026-10-30T08:56:42.926645Z",
  "last_location_at": "2026-10-30T08:56:42.926645Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0857283a-53fe-4563-8cb3-141e3546afb1/close` → **200**

```json
{
  "command_id": "0d16d611-91b6-4720-87af-9ca7ae9ae1cc",
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
  "session_id": "f242a54a-6cca-45b1-87d6-fa616ac2be69",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE1MDYsImlhdCI6MTc5MzM1MDYwNiwianRpIjoiZWE5NzY0NjEtYzNjZC00MWJlLWFjOTItZDg3YTY3NjZhZDQ0Iiwic2lkIjoiZjI0MmE1NGEtNmNjYS00NWIxLTg3ZDYtZmE2MTZhYzJiZTY5In0.MniaJ8723Ndat_shGgFDF-7YBDany0wA27J8Q7raRHI",
  "access_expires_at": "2026-10-30T09:11:46.78683294Z",
  "refresh_token": "OIq-VHy5i5Lmy7wWFca6A3YG5yZakaXToPeCuUAhNN8",
  "refresh_expires_at": "2026-10-30T20:56:46.78640341Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/582a4439-1bc5-4215-87aa-5634b2a910e9/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/582a4439-1bc5-4215-87aa-5634b2a910e9/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "094f3ec8-f1c7-4db8-aa53-721a2bae83ec"
}
```

`GET /api/admin/v1/orders/582a4439-1bc5-4215-87aa-5634b2a910e9/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T08:56:47.233462011Z",
  "order": {
    "id": "582a4439-1bc5-4215-87aa-5634b2a910e9",
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
    "created_at": "2026-10-30T08:56:39.405493Z",
    "assigned_at": "2026-10-30T08:56:41.322006Z",
    "arrived_at": "2026-10-30T08:56:42.453943Z",
    "started_at": "2026-10-30T08:56:42.693471Z",
    "completed_at": "2026-10-30T08:56:43.153949Z"
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
    "id": "48603da9-7c06-417a-9a7e-8ee3947afe30",
    "registered_at": "2026-10-30T08:56:37.574969Z",
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
      "created_at": "2026-10-30T08:56:39.407366Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T08:56:43.361899Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/582a4439-1bc5-4215-87aa-5634b2a910e9/chargebacks` → **422**

```json
{
  "command_id": "66c3002d-2422-45a2-a89f-ebe56cb36139",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/582a4439-1bc5-4215-87aa-5634b2a910e9/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "5ed9d89a-96c0-4553-b24b-6bef97d50465"
}
```

`POST /api/admin/v1/orders/582a4439-1bc5-4215-87aa-5634b2a910e9/chargebacks` → **201**

```json
{
  "command_id": "8d545a97-5913-42f5-aee0-f5a049068276",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "e6ddfd20-4023-445a-9118-b8e789f99e3c",
  "order_id": "582a4439-1bc5-4215-87aa-5634b2a910e9",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T08:56:47.74402Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/582a4439-1bc5-4215-87aa-5634b2a910e9/chargebacks` → **201**

```json
{
  "command_id": "8d545a97-5913-42f5-aee0-f5a049068276",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "e6ddfd20-4023-445a-9118-b8e789f99e3c",
  "order_id": "582a4439-1bc5-4215-87aa-5634b2a910e9",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T08:56:47.74402Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/48603da9-7c06-417a-9a7e-8ee3947afe30` → **200**

```json
{
  "client": {
    "id": "48603da9-7c06-417a-9a7e-8ee3947afe30",
    "phone": "+380731890443",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:56:37.574969Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "582a4439-1bc5-4215-87aa-5634b2a910e9",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T08:56:39.405493Z",
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

`GET /api/admin/v1/clients/48603da9-7c06-417a-9a7e-8ee3947afe30` → **200**

```json
{
  "client": {
    "id": "48603da9-7c06-417a-9a7e-8ee3947afe30",
    "phone": "+380731890443",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:56:37.574969Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "582a4439-1bc5-4215-87aa-5634b2a910e9",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T08:56:39.405493Z",
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

`POST /api/admin/v1/orders/582a4439-1bc5-4215-87aa-5634b2a910e9/chargebacks/e6ddfd20-4023-445a-9118-b8e789f99e3c/resolve` → **200**

```json
{
  "command_id": "ac3fe563-a087-4e6e-9b8c-07b509f251fb",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "e6ddfd20-4023-445a-9118-b8e789f99e3c",
  "order_id": "582a4439-1bc5-4215-87aa-5634b2a910e9",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T08:56:47.74402Z",
  "resolved_at": "2026-10-30T08:56:49.729914Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/48603da9-7c06-417a-9a7e-8ee3947afe30` → **200**

```json
{
  "client": {
    "id": "48603da9-7c06-417a-9a7e-8ee3947afe30",
    "phone": "+380731890443",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:56:37.574969Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "582a4439-1bc5-4215-87aa-5634b2a910e9",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T08:56:39.405493Z",
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

`GET /api/admin/v1/clients/48603da9-7c06-417a-9a7e-8ee3947afe30` → **200**

```json
{
  "client": {
    "id": "48603da9-7c06-417a-9a7e-8ee3947afe30",
    "phone": "+380731890443",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:56:37.574969Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "582a4439-1bc5-4215-87aa-5634b2a910e9",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T08:56:39.405493Z",
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

`POST /api/admin/v1/orders/582a4439-1bc5-4215-87aa-5634b2a910e9/chargebacks/e6ddfd20-4023-445a-9118-b8e789f99e3c/resolve` → **409**

```json
{
  "command_id": "a67e8013-ab11-4302-9420-5c88074d8296",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/582a4439-1bc5-4215-87aa-5634b2a910e9/chargebacks/e6ddfd20-4023-445a-9118-b8e789f99e3c/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "85661070-df0d-4638-851f-9939d01b9cfb"
}
```

`GET /api/admin/v1/orders/582a4439-1bc5-4215-87aa-5634b2a910e9/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "e6ddfd20-4023-445a-9118-b8e789f99e3c",
      "order_id": "582a4439-1bc5-4215-87aa-5634b2a910e9",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T08:56:47.74402Z",
      "resolved_at": "2026-10-30T08:56:49.729914Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 582a4439-1bc5-4215-87aa-5634b2a910e9 without phone or card digits; chargeback e6ddfd20-4023-445a-9118-b8e789f99e3c recorded and won.

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
  "session_id": "2ae83f3e-1189-422b-937d-7b13b02a8438",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE1MTIsImlhdCI6MTc5MzM1MDYxMiwianRpIjoiODQ0M2NkZDctZmVmZC00ZjhhLWJmZTAtN2QyMWVkMmE0MGFkIiwic2lkIjoiMmFlODNmM2UtMTE4OS00MjJiLTkzN2QtN2IxM2IwMmE4NDM4In0.sAKfOTMnWJdP3TDLmYoUMCa7aliY_9_eG-BovM5962Y",
  "access_expires_at": "2026-10-30T09:11:52.403729678Z",
  "refresh_token": "1_ft_KKhx1UAOE54hC-_nKojtys_J4Om_GVPcdQ6-uc",
  "refresh_expires_at": "2026-10-30T20:56:52.403293778Z",
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
  "phone": "+48600237372",
  "device_ref": "sandbox-3623"
}
```

```json
{
  "challenge_id": "291bdd03-16ad-4ab9-85ce-c9b926f0648e",
  "expires_at": "2026-10-30T09:01:53.078007947Z",
  "resend_available_at": "2026-10-30T08:56:54.078007947Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600237372` → **200**

```json
{
  "phone": "+48600237372",
  "audience": "CLIENT",
  "code": "416645",
  "sent_at": "2026-10-30T08:56:53.080175336Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "291bdd03-16ad-4ab9-85ce-c9b926f0648e",
  "code": "416645",
  "device_ref": "sandbox-3623"
}
```

```json
{
  "session_id": "b0c3cd88-6259-4081-8c61-c937382de1e9",
  "subject": {
    "type": "CLIENT",
    "id": "d59fe5fe-db26-4a26-aab1-4f92231f72d8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNTlmZTVmZS1kYjI2LTRhMjYtYWFiMS00ZjkyMjMxZjcyZDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNTEzLCJpYXQiOjE3OTMzNTA2MTMsImp0aSI6ImRlMmI1OGUxLWIxZTUtNDUxNy1iMjYzLWIxMTQ4NzNjNTVlMCIsInNpZCI6ImIwYzNjZDg4LTYyNTktNDA4MS04YzYxLWM5MzczODJkZTFlOSJ9.tM3AVziXI-FnAgDbIQUaDhdd9GuhwMSIKM7m0IzLYwg",
  "access_expires_at": "2026-10-30T09:11:53.329948714Z",
  "refresh_token": "APV1X0sj_NZ-hFam57mLCOWU7-TWXsntyI3Qrqg3nYg",
  "refresh_expires_at": "2026-11-29T08:56:53.329574076Z",
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
  "command_id": "91a7daab-9c49-4ace-9644-a31485297f33",
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
  "correlation_id": "4320fbed-81c4-495b-9f4d-94b85584aa27",
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
  "command_id": "037b54d0-58eb-40a8-a182-b9f2f5d0109c",
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
  "paused_at": "2026-10-30T08:56:54.216501481Z",
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
  "command_id": "434bf135-76ea-403c-bbfa-cd36080931aa",
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
  "id": "ba91f3b8-2086-4608-81fb-72df98dab393",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:01:54.672821Z",
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
  "command_id": "cc26026f-600c-4be5-8b63-478ceb5206f9",
  "quote_id": "ba91f3b8-2086-4608-81fb-72df98dab393",
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
  "correlation_id": "a50e986c-31ac-4842-9534-369cdb28c744"
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
  "paused_at": "2026-10-30T08:56:54.216501Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "5c748929-726d-44a7-ba3a-0676a9745f69",
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
  "command_id": "1a5ef96e-b3a7-43ad-82e4-edb3be859b73",
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
  "command_id": "9ea507ab-dd29-42b9-a084-66fd79040348",
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
  "id": "5f74307f-68fb-45d5-a62b-998f870e05c7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:01:56.115992Z",
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
  "command_id": "474c4a8e-f72d-4429-b511-11071a72b915",
  "quote_id": "5f74307f-68fb-45d5-a62b-998f870e05c7",
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
  "correlation_id": "4a24d55b-74e8-4fd0-9fee-a0d81455997a"
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
  "command_id": "ffd6a469-7ddd-416e-8e15-9b1d19e554cc",
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
  "command_id": "bf98d254-688f-40cb-a59b-00eae47bb4cb",
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
  "id": "9ac9b5df-4a73-4976-9dff-0b9658860b5d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:01:57.045653Z",
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
  "command_id": "9df1193f-0ea7-4a6b-b6cc-132a953555e4",
  "quote_id": "9ac9b5df-4a73-4976-9dff-0b9658860b5d",
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
  "correlation_id": "c362455a-945e-4794-90a8-f5cc5f1c991b"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "851968f6-788f-4df4-9837-2202f2bacb09",
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
  "correlation_id": "34632111-4f97-40a4-a3e6-0a6431ca0ba4"
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
  "command_id": "288bec17-0bec-418e-99ce-943421a15b82",
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
  "phone": "+380671689476",
  "device_ref": "sandbox-20629"
}
```

```json
{
  "challenge_id": "79a0f721-afbf-44fe-a72d-9cba12069ab1",
  "expires_at": "2026-10-30T09:01:58.219990452Z",
  "resend_available_at": "2026-10-30T08:56:59.219990452Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671689476` → **200**

```json
{
  "phone": "+380671689476",
  "audience": "CLIENT",
  "code": "588568",
  "sent_at": "2026-10-30T08:56:58.222645553Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "79a0f721-afbf-44fe-a72d-9cba12069ab1",
  "code": "588568",
  "device_ref": "sandbox-20629"
}
```

```json
{
  "session_id": "1d0232d9-7c37-4d91-bf6b-cd5eecb6ece5",
  "subject": {
    "type": "CLIENT",
    "id": "1c39b6b4-a178-4256-8f1f-0504a0e79aa2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYzM5YjZiNC1hMTc4LTQyNTYtOGYxZi0wNTA0YTBlNzlhYTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNTE4LCJpYXQiOjE3OTMzNTA2MTgsImp0aSI6IjNjNWYxZTA2LWFiNmQtNGQ5OS1iMjJkLTRlMDc4ZTc3NzYwZSIsInNpZCI6IjFkMDIzMmQ5LTdjMzctNGQ5MS1iZjZiLWNkNWVlY2I2ZWNlNSJ9.ahca5RJ3d_XZT_61MV4yf5dhyBFqoHdacZfpdSHLEmk",
  "access_expires_at": "2026-10-30T09:11:58.478313747Z",
  "refresh_token": "3tdO8KPntClb7Vl8HP2E-nFqWOz4eyj5Gi9nhFTDbr4",
  "refresh_expires_at": "2026-11-29T08:56:58.477901717Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1c39b6b4-a178-4256-8f1f-0504a0e79aa2",
  "session_id": "1d0232d9-7c37-4d91-bf6b-cd5eecb6ece5",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6cc1bb93-5c03-466a-8c04-adc43095e796",
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
  "id": "0ab763f9-e767-4ebd-adc5-e70e37db4753",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:01:58.930155Z",
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
  "challenge_id": "3028afed-7ca6-4c07-900e-6c45e48438d5",
  "expires_at": "2026-10-30T09:02:01.182986787Z",
  "resend_available_at": "2026-10-30T08:57:02.182986787Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671689476` → **200**

```json
{
  "phone": "+380671689476",
  "audience": "CLIENT",
  "code": "163156",
  "sent_at": "2026-10-30T08:57:01.185258106Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "26a949c1-c160-443b-9644-207efdaca378",
  "challenge_id": "3028afed-7ca6-4c07-900e-6c45e48438d5",
  "otp_code": "163156"
}
```

```json
{
  "client_id": "1c39b6b4-a178-4256-8f1f-0504a0e79aa2",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T08:57:01.43629685Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "e74bf602-8904-489b-bf3f-513ce12beea7",
  "quote_id": "0ab763f9-e767-4ebd-adc5-e70e37db4753",
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
  "correlation_id": "dcadf8fb-bc34-428c-bcfc-3e461a2fab72"
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
  "session_id": "d3a42df7-3cfa-4daa-b824-2acc6a137849",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE1MjIsImlhdCI6MTc5MzM1MDYyMiwianRpIjoiM2UwM2M5ZmItODE3OC00Yzk4LTg3NTktY2ZjYTRkZDM2OGM1Iiwic2lkIjoiZDNhNDJkZjctM2NmYS00ZGFhLWI4MjQtMmFjYzZhMTM3ODQ5In0.DHgyU4boI4KEBQdtVHl5Xa15wQPysT3Eap_EgbVTMCg",
  "access_expires_at": "2026-10-30T09:12:02.150356319Z",
  "refresh_token": "F5C9T7rZV2yAIYv4ymIdTn3tDckcSNXyjypgjjqmJKM",
  "refresh_expires_at": "2026-10-30T20:57:02.149953648Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "1c39b6b4-a178-4256-8f1f-0504a0e79aa2",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T08:57:01.436297Z",
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

`POST /api/admin/v1/client-deletions/1c39b6b4-a178-4256-8f1f-0504a0e79aa2/complete` → **200**

```json
{
  "command_id": "20299f0b-96fa-43f5-8a10-71e259954131",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "1c39b6b4-a178-4256-8f1f-0504a0e79aa2",
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
  "correlation_id": "ddb0810b-d533-4b7e-b373-49215597ede7"
}
```

Done: client 1c39b6b4-a178-4256-8f1f-0504a0e79aa2 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660697780",
  "device_ref": "sandbox-23772"
}
```

```json
{
  "challenge_id": "bc05f259-b433-416b-af50-ce31c7b0a4cd",
  "expires_at": "2026-10-30T09:02:03.19367031Z",
  "resend_available_at": "2026-10-30T08:57:04.19367031Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660697780` → **200**

```json
{
  "phone": "+380660697780",
  "audience": "CLIENT",
  "code": "841215",
  "sent_at": "2026-10-30T08:57:03.195593671Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc05f259-b433-416b-af50-ce31c7b0a4cd",
  "code": "841215",
  "device_ref": "sandbox-23772"
}
```

```json
{
  "session_id": "29bd2956-628c-4a6e-8faa-c9fcac62cc11",
  "subject": {
    "type": "CLIENT",
    "id": "6fcd605d-8573-4db4-be73-4ffa8946677a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmNkNjA1ZC04NTczLTRkYjQtYmU3My00ZmZhODk0NjY3N2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNTIzLCJpYXQiOjE3OTMzNTA2MjMsImp0aSI6ImRmNDk1Y2Y4LTUzNWEtNGUzNC1iNzU4LTBkNDUxNmJiM2YzMiIsInNpZCI6IjI5YmQyOTU2LTYyOGMtNGE2ZS04ZmFhLWM5ZmNhYzYyY2MxMSJ9.QS6K6R-iaiZqV4XJxrPrdaJOcDhOD_LOiYOytSi6XQg",
  "access_expires_at": "2026-10-30T09:12:03.433915324Z",
  "refresh_token": "Leb6amdDkyROQGQBCh1GOo9aHLGccSTqaC5i47TyLXE",
  "refresh_expires_at": "2026-11-29T08:57:03.433422198Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6fcd605d-8573-4db4-be73-4ffa8946677a",
  "session_id": "29bd2956-628c-4a6e-8faa-c9fcac62cc11",
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
  "session_id": "124bd24e-9bb0-47b9-85a4-d512408c1db9",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE1MjQsImlhdCI6MTc5MzM1MDYyNCwianRpIjoiMjA2YWNhZDAtYjkwYS00MmRiLWFiNTctYWNlZWE1NGJhNzA4Iiwic2lkIjoiMTI0YmQyNGUtOWJiMC00N2I5LTg1YTQtZDUxMjQwOGMxZGI5In0.xcbHShBj5po0TgZc_KqOUkbwXyzgkV0GjSEh5uS7iEc",
  "access_expires_at": "2026-10-30T09:12:04.192574693Z",
  "refresh_token": "JULq7ZsfGmqaYAThcFYLVBoW0bwlTHjDCJYrN3-lv8s",
  "refresh_expires_at": "2026-10-30T20:57:04.192058612Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=0697780&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "6fcd605d-8573-4db4-be73-4ffa8946677a",
      "phone": "+380660697780",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T08:57:03.431766Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/6fcd605d-8573-4db4-be73-4ffa8946677a` → **200**

```json
{
  "client": {
    "id": "6fcd605d-8573-4db4-be73-4ffa8946677a",
    "phone": "+380660697780",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:57:03.431766Z",
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

`POST /api/admin/v1/clients/6fcd605d-8573-4db4-be73-4ffa8946677a/block` → **400**

```json
{
  "command_id": "540e64a2-a3d6-4506-a833-1b695dca8b59",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/6fcd605d-8573-4db4-be73-4ffa8946677a/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "e10bf2d3-163a-48d1-8e6c-81e84f41c6a5",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/6fcd605d-8573-4db4-be73-4ffa8946677a/block` → **200**

```json
{
  "command_id": "c76f18b2-d525-47f4-a803-a0f196dc70da",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "6fcd605d-8573-4db4-be73-4ffa8946677a",
  "phone": "+380660697780",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T08:57:03.431766Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T08:57:05.13817Z",
    "by": "31a00219-70fd-4586-82bb-ecb321d1f902"
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
  "correlation_id": "c97beb01-5376-4d13-ad5a-fe111c3d62af"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660697780",
  "device_ref": "sandbox-24296"
}
```

```json
{
  "challenge_id": "d452ba73-eed4-4501-899f-457c63ddc0a0",
  "expires_at": "2026-10-30T09:02:07.594870967Z",
  "resend_available_at": "2026-10-30T08:57:08.594870967Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660697780` → **200**

```json
{
  "phone": "+380660697780",
  "audience": "CLIENT",
  "code": "723853",
  "sent_at": "2026-10-30T08:57:07.596843358Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "d452ba73-eed4-4501-899f-457c63ddc0a0",
  "code": "723853",
  "device_ref": "sandbox-24296"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "f205c195-b18a-44b3-9299-c84abbba1df0"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/6fcd605d-8573-4db4-be73-4ffa8946677a` → **200**

```json
{
  "client": {
    "id": "6fcd605d-8573-4db4-be73-4ffa8946677a",
    "phone": "+380660697780",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T08:57:03.431766Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T08:57:05.13817Z",
      "by": "31a00219-70fd-4586-82bb-ecb321d1f902"
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

`POST /api/admin/v1/clients/6fcd605d-8573-4db4-be73-4ffa8946677a/unblock` → **200**

```json
{
  "command_id": "c5d30255-fba0-4e48-b527-05a9bd2ad099",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "6fcd605d-8573-4db4-be73-4ffa8946677a",
  "phone": "+380660697780",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T08:57:03.431766Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660697780",
  "device_ref": "sandbox-26029"
}
```

```json
{
  "challenge_id": "60a56707-c90b-4f55-8699-faed684222cf",
  "expires_at": "2026-10-30T09:02:10.592573964Z",
  "resend_available_at": "2026-10-30T08:57:11.592573964Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660697780` → **200**

```json
{
  "phone": "+380660697780",
  "audience": "CLIENT",
  "code": "619497",
  "sent_at": "2026-10-30T08:57:10.594465111Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "60a56707-c90b-4f55-8699-faed684222cf",
  "code": "619497",
  "device_ref": "sandbox-26029"
}
```

```json
{
  "session_id": "123415e4-fb3d-42cb-9879-df0e3fd85ab4",
  "subject": {
    "type": "CLIENT",
    "id": "6fcd605d-8573-4db4-be73-4ffa8946677a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmNkNjA1ZC04NTczLTRkYjQtYmU3My00ZmZhODk0NjY3N2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNTMwLCJpYXQiOjE3OTMzNTA2MzAsImp0aSI6IjdlMjgzMzc0LTAzZjAtNGYyNC1hZDQ2LThhMTI0ZjY0NjE4YiIsInNpZCI6IjEyMzQxNWU0LWZiM2QtNDJjYi05ODc5LWRmMGUzZmQ4NWFiNCJ9.Dmamn7Qfa5pYngJu4U4l_LR7VB0qEzn3aW7jKTNkLVg",
  "access_expires_at": "2026-10-30T09:12:10.836983937Z",
  "refresh_token": "Hq5v_T7XWndYNrQziN3tp0st44zakTr-L1BDVE3kt0I",
  "refresh_expires_at": "2026-11-29T08:57:10.836578973Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6fcd605d-8573-4db4-be73-4ffa8946677a",
  "session_id": "123415e4-fb3d-42cb-9879-df0e3fd85ab4",
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
  "phone": "+380665409968",
  "device_ref": "sandbox-23517"
}
```

```json
{
  "challenge_id": "a4add212-a6fa-4e55-99f9-d921c0a8e4a3",
  "expires_at": "2026-10-30T09:02:11.279047362Z",
  "resend_available_at": "2026-10-30T08:57:12.279047362Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380665409968` → **200**

```json
{
  "phone": "+380665409968",
  "audience": "CLIENT",
  "code": "932591",
  "sent_at": "2026-10-30T08:57:11.281713071Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a4add212-a6fa-4e55-99f9-d921c0a8e4a3",
  "code": "932591",
  "device_ref": "sandbox-23517"
}
```

```json
{
  "session_id": "24d28bf5-e124-4aae-aff6-3cf297eacc19",
  "subject": {
    "type": "CLIENT",
    "id": "933746f5-b882-4363-8ccc-c2227d6706bc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MzM3NDZmNS1iODgyLTQzNjMtOGNjYy1jMjIyN2Q2NzA2YmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNTMxLCJpYXQiOjE3OTMzNTA2MzEsImp0aSI6ImExMmUyY2RkLWNlMjgtNDc1MC1iZTBlLTQyYTg4OWNmMTkwZCIsInNpZCI6IjI0ZDI4YmY1LWUxMjQtNGFhZS1hZmY2LTNjZjI5N2VhY2MxOSJ9.Wzbr9ytCZTee2IqYUoXTecc8YROoGHmf3hC2mFQhn5o",
  "access_expires_at": "2026-10-30T09:12:11.525807058Z",
  "refresh_token": "twGIGn1udIWEPiOiBZOYT5J028lyX7JLK4eKVk1yxDw",
  "refresh_expires_at": "2026-11-29T08:57:11.525374392Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8b0fefde-bb36-43ed-a216-317fd8c98649",
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
  "id": "e0f7ee23-a622-47c7-a1c1-1f03b3920ba3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:02:11.752522Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: a5daea6d-3b1d-4e4a-8135-0d64ce1544ba) → **201**

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
  "session_id": "9ac76153-7d89-428a-bba4-1b78443ca4a2",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE1MzIsImlhdCI6MTc5MzM1MDYzMiwianRpIjoiNDUxNjJhMDQtNTAyNy00N2RkLWFlMmItOGIyMmQyODY5YmJlIiwic2lkIjoiOWFjNzYxNTMtN2Q4OS00MjhhLWJiYTQtMWI3ODQ0M2NhNGEyIn0.LJT-3zjLecEpoCQaUNj3iNxEjNfWdTIzwXGiW3vGQLw",
  "access_expires_at": "2026-10-30T09:12:12.273514194Z",
  "refresh_token": "yCw6abW2GnjYm4_4_ShlwHuJx-0Nm0kNza_aQvoCqf8",
  "refresh_expires_at": "2026-10-30T20:57:12.273103152Z",
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
  "session_id": "24949668-4fe4-401c-8cdb-b4b1386539af",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE1MzIsImlhdCI6MTc5MzM1MDYzMiwianRpIjoiNDk3MDk3ZDgtY2ZkYS00YmEyLWJiMTAtODY3OTI5MTNmYjA5Iiwic2lkIjoiMjQ5NDk2NjgtNGZlNC00MDFjLThjZGItYjRiMTM4NjUzOWFmIn0.Exq5OxYS5jjJXTVNlkAcUmqaiWrkRYZScwUUDgq65BI",
  "access_expires_at": "2026-10-30T09:12:12.758245325Z",
  "refresh_token": "aHtyfi-YNUkIWmRNozEd93_SgoBKmBDkt0y5jQq6eQM",
  "refresh_expires_at": "2026-10-30T20:57:12.757787752Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/477e2346-fc66-4169-b7a5-5ab6977ce616/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:57:11.985215Z",
      "actor": {
        "type": "CLIENT",
        "id": "933746f5-b882-4363-8ccc-c2227d6706bc",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "477e2346-fc66-4169-b7a5-5ab6977ce616",
        "quote_id": "e0f7ee23-a622-47c7-a1c1-1f03b3920ba3",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "a5daea6d-3b1d-4e4a-8135-0d64ce1544ba"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:57:11.986555Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "477e2346-fc66-4169-b7a5-5ab6977ce616",
        "attempt_id": "759e1335-297f-4aaf-b6e6-e345f1ae7401",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "a5daea6d-3b1d-4e4a-8135-0d64ce1544ba"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T08:57:11.993489Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "477e2346-fc66-4169-b7a5-5ab6977ce616",
        "attempt_id": "759e1335-297f-4aaf-b6e6-e345f1ae7401"
      },
      "correlation_id": "a5daea6d-3b1d-4e4a-8135-0d64ce1544ba"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "759e1335-297f-4aaf-b6e6-e345f1ae7401",
        "generation": 1,
        "started_at": "2026-10-30T08:57:11.985889Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T08:57:11.993489Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T08:57:11.987051Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/a5daea6d-3b1d-4e4a-8135-0d64ce1544ba` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "477e2346-fc66-4169-b7a5-5ab6977ce616:0",
      "order_id": "477e2346-fc66-4169-b7a5-5ab6977ce616",
      "at": "2026-10-30T08:57:11.985215Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "477e2346-fc66-4169-b7a5-5ab6977ce616:1",
      "order_id": "477e2346-fc66-4169-b7a5-5ab6977ce616",
      "at": "2026-10-30T08:57:11.986555Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "477e2346-fc66-4169-b7a5-5ab6977ce616:2",
      "order_id": "477e2346-fc66-4169-b7a5-5ab6977ce616",
      "at": "2026-10-30T08:57:11.993489Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/a64425cd-34d5-451e-bf76-38d0001ae9d8` → **200**

```json
{
  "found": []
}
```

Done: request a5daea6d-3b1d-4e4a-8135-0d64ce1544ba — order 477e2346-fc66-4169-b7a5-5ab6977ce616 found by its id.

`GET /api/rider/v1/orders/477e2346-fc66-4169-b7a5-5ab6977ce616` → **200**

```json
{
  "id": "477e2346-fc66-4169-b7a5-5ab6977ce616",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "933746f5-b882-4363-8ccc-c2227d6706bc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:57:11.984845Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/477e2346-fc66-4169-b7a5-5ab6977ce616/cancel` → **200**

```json
{
  "command_id": "be79401f-283d-4a96-9ae2-59d31c7b46d7",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "477e2346-fc66-4169-b7a5-5ab6977ce616",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "933746f5-b882-4363-8ccc-c2227d6706bc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:57:11.984845Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
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
  "phone": "+380639591349",
  "device_ref": "sandbox-30693"
}
```

```json
{
  "challenge_id": "1711d9fe-98eb-4e2b-8e4a-74e097c69613",
  "expires_at": "2026-10-30T09:02:14.12989146Z",
  "resend_available_at": "2026-10-30T08:57:15.12989146Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639591349` → **200**

```json
{
  "phone": "+380639591349",
  "audience": "CLIENT",
  "code": "986559",
  "sent_at": "2026-10-30T08:57:14.133101394Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1711d9fe-98eb-4e2b-8e4a-74e097c69613",
  "code": "986559",
  "device_ref": "sandbox-30693"
}
```

```json
{
  "session_id": "9f064cd4-b9c4-4469-9b81-33daf12cca3a",
  "subject": {
    "type": "CLIENT",
    "id": "69335d88-8390-48cf-b9ca-12fd8e5e41e5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTMzNWQ4OC04MzkwLTQ4Y2YtYjljYS0xMmZkOGU1ZTQxZTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNTM0LCJpYXQiOjE3OTMzNTA2MzQsImp0aSI6IjhmMzk1OTE0LTBmMTQtNDc0Yy04ZGI5LTA5YmQ2MTdlMzZiNCIsInNpZCI6IjlmMDY0Y2Q0LWI5YzQtNDQ2OS05YjgxLTMzZGFmMTJjY2EzYSJ9.zrMwh7-qUMRXqdVW53wgGyW-3BwkVLv-XSdtrRtkdOA",
  "access_expires_at": "2026-10-30T09:12:14.379734578Z",
  "refresh_token": "teHLQA0nq7bMAhysLgj9J6PtcZOCV23Btv3E45gPUpI",
  "refresh_expires_at": "2026-11-29T08:57:14.379342363Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "385d62c9-923d-4986-9c35-fd9cc0098806",
  "expires_at": "2026-10-30T09:02:16.605114377Z",
  "resend_available_at": "2026-10-30T08:57:17.605114377Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639591349` → **200**

```json
{
  "phone": "+380639591349",
  "audience": "CLIENT",
  "code": "768392",
  "sent_at": "2026-10-30T08:57:16.607220558Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "8721bca2-7911-4e74-9354-79e9d2954fa0",
  "challenge_id": "385d62c9-923d-4986-9c35-fd9cc0098806",
  "otp_code": "768392"
}
```

```json
{
  "id": "a6fde918-fb32-43e8-80a5-2dd20d4e073b",
  "state": "PENDING",
  "created_at": "2026-10-30T08:57:16.861494Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/a6fde918-fb32-43e8-80a5-2dd20d4e073b` → **200**

```json
{
  "id": "a6fde918-fb32-43e8-80a5-2dd20d4e073b",
  "state": "PENDING",
  "created_at": "2026-10-30T08:57:16.861494Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a6fde918-fb32-43e8-80a5-2dd20d4e073b` → **200**

```json
{
  "id": "a6fde918-fb32-43e8-80a5-2dd20d4e073b",
  "state": "PENDING",
  "created_at": "2026-10-30T08:57:16.861494Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a6fde918-fb32-43e8-80a5-2dd20d4e073b` → **200**

```json
{
  "id": "a6fde918-fb32-43e8-80a5-2dd20d4e073b",
  "state": "PENDING",
  "created_at": "2026-10-30T08:57:16.861494Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a6fde918-fb32-43e8-80a5-2dd20d4e073b` → **200**

```json
{
  "id": "a6fde918-fb32-43e8-80a5-2dd20d4e073b",
  "state": "PENDING",
  "created_at": "2026-10-30T08:57:16.861494Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a6fde918-fb32-43e8-80a5-2dd20d4e073b` → **200**

```json
{
  "id": "a6fde918-fb32-43e8-80a5-2dd20d4e073b",
  "state": "PENDING",
  "created_at": "2026-10-30T08:57:16.861494Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a6fde918-fb32-43e8-80a5-2dd20d4e073b` → **200**

```json
{
  "id": "a6fde918-fb32-43e8-80a5-2dd20d4e073b",
  "state": "READY",
  "created_at": "2026-10-30T08:57:16.861494Z",
  "ready_at": "2026-10-30T08:57:22.474396Z",
  "expires_at": "2026-11-06T08:57:22.474396Z",
  "size_bytes": 1030
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/a6fde918-fb32-43e8-80a5-2dd20d4e073b/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633545760",
  "device_ref": "sandbox-23745"
}
```

```json
{
  "challenge_id": "90d89db0-b078-4d0c-a2d3-57ee5f3c1e08",
  "expires_at": "2026-10-30T09:02:23.399129043Z",
  "resend_available_at": "2026-10-30T08:57:24.399129043Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633545760` → **200**

```json
{
  "phone": "+380633545760",
  "audience": "CLIENT",
  "code": "483142",
  "sent_at": "2026-10-30T08:57:23.423646768Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "90d89db0-b078-4d0c-a2d3-57ee5f3c1e08",
  "code": "483142",
  "device_ref": "sandbox-23745"
}
```

```json
{
  "session_id": "f86555ef-4bf5-4093-badb-de03900b98a3",
  "subject": {
    "type": "CLIENT",
    "id": "a40b9700-23c1-4195-89dd-e65141b86e9b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDBiOTcwMC0yM2MxLTQxOTUtODlkZC1lNjUxNDFiODZlOWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNTQzLCJpYXQiOjE3OTMzNTA2NDMsImp0aSI6IjRkNTM4ZTIxLTc0MTItNGY2NC05OTE0LTg3OGY3MzhiOGU2ZSIsInNpZCI6ImY4NjU1NWVmLTRiZjUtNDA5My1iYWRiLWRlMDM5MDBiOThhMyJ9.gsRp7FAbrIo63OXiW7st3T1Ht-UKiYIoVxMBM9EDdyU",
  "access_expires_at": "2026-10-30T09:12:23.666933246Z",
  "refresh_token": "kgq1n3mSp-09MG2atmA2rdix1740evBQ50iQ2yvuBaI",
  "refresh_expires_at": "2026-11-29T08:57:23.666570597Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/a6fde918-fb32-43e8-80a5-2dd20d4e073b/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/a6fde918-fb32-43e8-80a5-2dd20d4e073b/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e85029be-c30b-4270-a4c0-c3c192c237f4"
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
  "session_id": "0973741d-87e9-4c62-be61-5941d513899a",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE1NDQsImlhdCI6MTc5MzM1MDY0NCwianRpIjoiN2IxMjJjOWMtMDZkZS00NjE4LTlkMzgtMGIzZWQxZDUyNTkxIiwic2lkIjoiMDk3Mzc0MWQtODdlOS00YzYyLWJlNjEtNTk0MWQ1MTM4OTlhIn0.9CaEAW6vwYaQetRe0Sp_c1pV5D1D65qDDVCieyFK32k",
  "access_expires_at": "2026-10-30T09:12:24.40084376Z",
  "refresh_token": "iLA1oNPYE28-vCTm573Y48ywvLnE3_34AwMaCC7Ohic",
  "refresh_expires_at": "2026-10-30T20:57:24.400423084Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "69335d88-8390-48cf-b9ca-12fd8e5e41e5",
  "session_id": "9f064cd4-b9c4-4469-9b81-33daf12cca3a",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/69335d88-8390-48cf-b9ca-12fd8e5e41e5/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "a6fde918-fb32-43e8-80a5-2dd20d4e073b",
      "state": "READY",
      "created_at": "2026-10-30T08:57:16.861494Z",
      "ready_at": "2026-10-30T08:57:22.474396Z",
      "expires_at": "2026-11-06T08:57:22.474396Z",
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
  "device_ref": "sandbox-6957"
}
```

```json
{
  "challenge_id": "b6ae5881-14c4-402a-bf23-aaaa25ac3041",
  "expires_at": "2026-10-30T09:02:25.067927331Z",
  "resend_available_at": "2026-10-30T08:57:26.067927331Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "451861",
  "sent_at": "2026-10-30T08:57:25.069869494Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b6ae5881-14c4-402a-bf23-aaaa25ac3041",
  "code": "451861",
  "device_ref": "sandbox-6957"
}
```

```json
{
  "session_id": "c8395143-2440-473f-bbfb-360ba908fedf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTU0NSwiaWF0IjoxNzkzMzUwNjQ1LCJqdGkiOiJlYjZlNjE2ZS1kN2UyLTQwOTktOTEwMS1jMTlmYmQ3YmFlOWUiLCJzaWQiOiJjODM5NTE0My0yNDQwLTQ3M2YtYmJmYi0zNjBiYTkwOGZlZGYifQ.tfrPSy3TI0C9GbEUBIYm3LUB8I9NXrM8cI6IXRTLu7o",
  "access_expires_at": "2026-10-30T09:12:25.400658469Z",
  "refresh_token": "d6Q6mCTlfu-HHnGCq2EWn1SNaZ9iTgXumH4kQ9sD8Mw",
  "refresh_expires_at": "2026-11-29T08:57:25.40020294Z",
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
  "device_ref": "sandbox-7675"
}
```

```json
{
  "challenge_id": "4ae98557-c1f8-4719-ade7-3552c0cde26a",
  "expires_at": "2026-10-30T09:02:25.833821199Z",
  "resend_available_at": "2026-10-30T08:57:26.833821199Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "772506",
  "sent_at": "2026-10-30T08:57:25.836005293Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4ae98557-c1f8-4719-ade7-3552c0cde26a",
  "code": "772506",
  "device_ref": "sandbox-7675"
}
```

```json
{
  "session_id": "f1de3965-8882-4a0b-8f76-7e2155ef2445",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTU0NiwiaWF0IjoxNzkzMzUwNjQ2LCJqdGkiOiJiYTQwYWE3Yy00NTAzLTQ4MTgtOTEyOC1mMDAyZThhMDU3ZjgiLCJzaWQiOiJmMWRlMzk2NS04ODgyLTRhMGItOGY3Ni03ZTIxNTVlZjI0NDUifQ.041-Js0X5odp5_RNPTtRF6yV_jkYy4NOXuyFHGXgkqg",
  "access_expires_at": "2026-10-30T09:12:26.07845116Z",
  "refresh_token": "2b75DUws-9-d6gOB7JU0bv314iDKBney-npj-D_Wo7o",
  "refresh_expires_at": "2026-11-29T08:57:26.078036652Z",
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
  "command_id": "d0140d65-4cf6-4b19-8e4d-0e5916d43518",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:57:26Z",
    "sequence": 1793350646514
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "07973ef8-d389-49f0-bf53-73f0df995ee0",
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
  "last_heartbeat_at": "2026-10-30T08:57:26.530663Z",
  "last_location_at": "2026-10-30T08:57:26.530663Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-32226"
}
```

```json
{
  "challenge_id": "31ffc2b2-6f7e-4067-90a0-27b828f557d0",
  "expires_at": "2026-10-30T09:02:26.748801737Z",
  "resend_available_at": "2026-10-30T08:57:27.748801737Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "645206",
  "sent_at": "2026-10-30T08:57:26.750849126Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "31ffc2b2-6f7e-4067-90a0-27b828f557d0",
  "code": "645206",
  "device_ref": "sandbox-32226"
}
```

```json
{
  "session_id": "b6b9068d-7288-4ef3-9a2c-693f0be5fe60",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTU0NiwiaWF0IjoxNzkzMzUwNjQ2LCJqdGkiOiIwZDM2MzMxMS1mMTMyLTQ3NzAtODE3MC1mY2UyYTBmZDcxOTQiLCJzaWQiOiJiNmI5MDY4ZC03Mjg4LTRlZjMtOWEyYy02OTNmMGJlNWZlNjAifQ.rtoZo5akpGDjRKmjxPMG1TfCYlxiVNZmjWHCN89PUNs",
  "access_expires_at": "2026-10-30T09:12:26.988786028Z",
  "refresh_token": "K1ESS6mO9d99pYsyABkWGLueudTaYWQKC707rAiODJY",
  "refresh_expires_at": "2026-11-29T08:57:26.988359693Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "cebd3856-33b9-40e2-8e1b-89f97882430e",
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
  "last_heartbeat_at": "2026-10-30T08:56:04.594396Z",
  "last_location_at": "2026-10-30T08:56:04.594396Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/cebd3856-33b9-40e2-8e1b-89f97882430e/handover` → **200**

```json
{
  "command_id": "1d69e7a0-6d31-4b07-820b-c27d89395c51",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "cebd3856-33b9-40e2-8e1b-89f97882430e",
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
  "last_heartbeat_at": "2026-10-30T08:56:04.594396Z",
  "last_location_at": "2026-10-30T08:56:04.594396Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/cebd3856-33b9-40e2-8e1b-89f97882430e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:57:27Z",
    "sequence": 1793350647656
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "cebd3856-33b9-40e2-8e1b-89f97882430e",
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
  "last_heartbeat_at": "2026-10-30T08:57:27.672816Z",
  "last_location_at": "2026-10-30T08:57:27.672816Z",
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
  "session_id": "386c908b-ea11-4a59-a338-d69752e0bdc3",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE1NDgsImlhdCI6MTc5MzM1MDY0OCwianRpIjoiYjk3MDY2ZDktZjJlZi00YjczLWJlM2QtOTk3ZjVmZDQ2NTJlIiwic2lkIjoiMzg2YzkwOGItZWExMS00YTU5LWEzMzgtZDY5NzUyZTBiZGMzIn0.CspPQTit0VTFRU3IlC9VDeVTl4TBpMbydI_g3p9-NHw",
  "access_expires_at": "2026-10-30T09:12:28.148859926Z",
  "refresh_token": "nFCVsCK70sZzFkMLOls33H2os5XUVzkjkMHzJsf1G6A",
  "refresh_expires_at": "2026-10-30T20:57:28.148449715Z",
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
  "session_id": "0f91bcf5-9e7d-40f0-9088-bb076a08a7da",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE1NDgsImlhdCI6MTc5MzM1MDY0OCwianRpIjoiY2ZjMGYzZWYtOTViNi00NzJjLWE3MjMtODBiYzcyYjk0OGFmIiwic2lkIjoiMGY5MWJjZjUtOWU3ZC00MGYwLTkwODgtYmIwNzZhMDhhN2RhIn0.mUf08Aa6eaMAN8TEUpWrRL2Djgm4SCoZpK6r7m1Nr-k",
  "access_expires_at": "2026-10-30T09:12:28.62369792Z",
  "refresh_token": "uvRhObVKJmRtlz897Y50dQPPNgp7cELnboEavftW02c",
  "refresh_expires_at": "2026-10-30T20:57:28.623270873Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380683002717",
  "device_ref": "sandbox-8907"
}
```

```json
{
  "challenge_id": "51511ea2-f239-4db7-be61-16e07d61f64f",
  "expires_at": "2026-10-30T09:02:28.852750763Z",
  "resend_available_at": "2026-10-30T08:57:29.852750763Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380683002717` → **200**

```json
{
  "phone": "+380683002717",
  "audience": "CLIENT",
  "code": "827184",
  "sent_at": "2026-10-30T08:57:28.855541469Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "51511ea2-f239-4db7-be61-16e07d61f64f",
  "code": "827184",
  "device_ref": "sandbox-8907"
}
```

```json
{
  "session_id": "8a13497f-cab6-4e76-a9c1-e16ab0ed044e",
  "subject": {
    "type": "CLIENT",
    "id": "cea706c0-4d25-4b6c-b2ec-3e1bd5575eef"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZWE3MDZjMC00ZDI1LTRiNmMtYjJlYy0zZTFiZDU1NzVlZWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNTQ5LCJpYXQiOjE3OTMzNTA2NDksImp0aSI6IjNjNWYyYzU5LTlhOWMtNDk5Yi1hZjI4LWVkNjgzYzZjMDI2NSIsInNpZCI6IjhhMTM0OTdmLWNhYjYtNGU3Ni1hOWMxLWUxNmFiMGVkMDQ0ZSJ9.U6fybu3li_lQbDuJmeeVY9_NxS1AmJ_CqwhJqc8fxCc",
  "access_expires_at": "2026-10-30T09:12:29.097710591Z",
  "refresh_token": "0zrP9--8cQObs6EQkQw5OUBcMRxssGxg0UkUY2_AkTU",
  "refresh_expires_at": "2026-11-29T08:57:29.097239748Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3a100c3e-8505-45b6-a01f-b29c00cef6d5",
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
  "id": "6bbf9341-0b93-4cd2-b3a4-985676fa42b9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:02:29.321071Z",
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
  "command_id": "8ea5129b-4bb3-49b3-bc14-8c927bda5584",
  "quote_id": "6bbf9341-0b93-4cd2-b3a4-985676fa42b9",
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
  "id": "6da29914-04ec-4445-97fe-5c407d64ac0e",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cea706c0-4d25-4b6c-b2ec-3e1bd5575eef",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:57:29.569139Z",
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
    "id": "1ae8afc2-fff7-4487-8de1-070b1042b973",
    "order_id": "6da29914-04ec-4445-97fe-5c407d64ac0e",
    "expires_at": "2026-10-30T08:57:44.571452Z",
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

`POST /api/driver/v1/offers/1ae8afc2-fff7-4487-8de1-070b1042b973/reject` → **204**

```json
{
  "command_id": "dbd1fea2-9833-41a6-8fa4-a393472db742"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "fa987d0f-bfb0-4978-a430-f1199696cfc1",
    "order_id": "6da29914-04ec-4445-97fe-5c407d64ac0e",
    "expires_at": "2026-10-30T08:57:45.029228Z",
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

`POST /api/driver/v1/offers/fa987d0f-bfb0-4978-a430-f1199696cfc1/accept` → **200**

```json
{
  "command_id": "f9cc486d-9a0d-437c-aeb9-b0266e006797"
}
```

```json
{
  "id": "561fe974-21cf-4f56-8ab7-6f986172f1ad",
  "order_id": "6da29914-04ec-4445-97fe-5c407d64ac0e",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "455ae1e4-e764-4c8a-8d49-2384e71993ca",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/6da29914-04ec-4445-97fe-5c407d64ac0e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:57:29.569491Z",
      "actor": {
        "type": "CLIENT",
        "id": "cea706c0-4d25-4b6c-b2ec-3e1bd5575eef",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "6da29914-04ec-4445-97fe-5c407d64ac0e",
        "quote_id": "6bbf9341-0b93-4cd2-b3a4-985676fa42b9",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "327dbfab-1ad4-4265-b898-297356093c38"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:57:29.570952Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6da29914-04ec-4445-97fe-5c407d64ac0e",
        "attempt_id": "998239ef-3a55-41a6-acb7-25f9532267c9",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "327dbfab-1ad4-4265-b898-297356093c38"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T08:57:29.573565Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1ae8afc2-fff7-4487-8de1-070b1042b973",
        "order_id": "6da29914-04ec-4445-97fe-5c407d64ac0e",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "327dbfab-1ad4-4265-b898-297356093c38"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T08:57:30.028375Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1ae8afc2-fff7-4487-8de1-070b1042b973",
        "order_id": "6da29914-04ec-4445-97fe-5c407d64ac0e"
      },
      "correlation_id": "f70b0f04-2abb-49cc-901b-8ebf8ac78137"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 6da29914-04ec-4445-97fe-5c407d64ac0e — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/6da29914-04ec-4445-97fe-5c407d64ac0e` → **200**

```json
{
  "id": "6da29914-04ec-4445-97fe-5c407d64ac0e",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "cea706c0-4d25-4b6c-b2ec-3e1bd5575eef",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "561fe974-21cf-4f56-8ab7-6f986172f1ad",
    "order_id": "6da29914-04ec-4445-97fe-5c407d64ac0e",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "455ae1e4-e764-4c8a-8d49-2384e71993ca",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T08:57:29.569139Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/6da29914-04ec-4445-97fe-5c407d64ac0e/cancel` → **200**

```json
{
  "command_id": "ea95c18f-383d-49f9-bf86-9b0e0b84ab15",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "6da29914-04ec-4445-97fe-5c407d64ac0e",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "cea706c0-4d25-4b6c-b2ec-3e1bd5575eef",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "561fe974-21cf-4f56-8ab7-6f986172f1ad",
    "order_id": "6da29914-04ec-4445-97fe-5c407d64ac0e",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "455ae1e4-e764-4c8a-8d49-2384e71993ca",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T08:57:29.569139Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
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
  "session_id": "07973ef8-d389-49f0-bf53-73f0df995ee0",
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
  "last_heartbeat_at": "2026-10-30T08:57:26.530663Z",
  "last_location_at": "2026-10-30T08:57:26.530663Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/07973ef8-d389-49f0-bf53-73f0df995ee0/close` → **200**

```json
{
  "command_id": "22075b4e-f754-4f94-afb7-8024e6b51de6",
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
  "session_id": "cebd3856-33b9-40e2-8e1b-89f97882430e",
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
  "last_heartbeat_at": "2026-10-30T08:57:27.672816Z",
  "last_location_at": "2026-10-30T08:57:27.672816Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cebd3856-33b9-40e2-8e1b-89f97882430e/close` → **200**

```json
{
  "command_id": "4503e90c-dea8-45d8-9c1c-62cc560a0a0b",
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
  "session_id": "bab1d15e-1815-40b3-a334-4ccb5fe1510d",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE1NTIsImlhdCI6MTc5MzM1MDY1MiwianRpIjoiZmU0YWExMjUtZDI0MS00ZjdhLWFlOTAtMDFkMDdkOWQ0M2Q4Iiwic2lkIjoiYmFiMWQxNWUtMTgxNS00MGIzLWEzMzQtNGNjYjVmZTE1MTBkIn0.sQ1MXDtfbBTeSucgYHxE9EK8oTZgSl4_53O56Byi2Bs",
  "access_expires_at": "2026-10-30T09:12:32.416957101Z",
  "refresh_token": "gmDuMbkDWYMviGmQvIA9oyZ4xLYGqQ-1DXfRWvtqjY4",
  "refresh_expires_at": "2026-10-30T20:57:32.416565117Z",
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
  "command_id": "cd2d8b59-d176-4e59-ac93-b94609e0a0c0",
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
  "changed_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T08:57:32.87681Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "3a7b7967-ce6a-4e32-bba4-6768d3f074a8",
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
  "correlation_id": "67b3092c-946b-43c3-954c-d2c96ce89214"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "e21da391-6ca1-4fd1-b4d1-6de313d9f593",
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
  "correlation_id": "90bd06db-d63b-4024-919f-296a31afe53b"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631400214",
  "device_ref": "sandbox-18627"
}
```

```json
{
  "challenge_id": "f784c5a4-4248-4e44-baf8-704d3c2f34c5",
  "expires_at": "2026-10-30T09:02:33.546865045Z",
  "resend_available_at": "2026-10-30T08:57:34.546865045Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631400214` → **200**

```json
{
  "phone": "+380631400214",
  "audience": "CLIENT",
  "code": "809575",
  "sent_at": "2026-10-30T08:57:33.654999749Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f784c5a4-4248-4e44-baf8-704d3c2f34c5",
  "code": "809575",
  "device_ref": "sandbox-18627"
}
```

```json
{
  "session_id": "77fd7890-a643-4753-9950-4d5c868aa007",
  "subject": {
    "type": "CLIENT",
    "id": "c9733954-d2a0-4755-af60-911ad26d13df"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOTczMzk1NC1kMmEwLTQ3NTUtYWY2MC05MTFhZDI2ZDEzZGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNTUzLCJpYXQiOjE3OTMzNTA2NTMsImp0aSI6IjVkNmQ1ZjYwLWI4ZWMtNGMwOC04MjZkLThjOWVkZDgxZGVmNSIsInNpZCI6Ijc3ZmQ3ODkwLWE2NDMtNDc1My05OTUwLTRkNWM4NjhhYTAwNyJ9.D15zmwq4ZfzEl-BHyJwCYXkKoHS50pxkhiWvMpTu02o",
  "access_expires_at": "2026-10-30T09:12:33.900034271Z",
  "refresh_token": "W7XpF2MVwNZtrQXu2mixyHL1yAsXBaXJye9ROECNcXE",
  "refresh_expires_at": "2026-11-29T08:57:33.899635542Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c6bd58df-36f7-4fe7-8c9e-3cc2d0033972",
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
  "id": "53019774-aa35-4c28-8d83-9e1ed30d8662",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:02:34.126130Z",
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
  "command_id": "2ef1d8ba-5a61-49af-8096-d4d86fa5d790",
  "quote_id": "53019774-aa35-4c28-8d83-9e1ed30d8662",
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
  "correlation_id": "ac07b7e8-00a8-4ac0-865b-e94f5a1cbc40"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "581348bf-4297-4ca7-adfa-ed88b1cae38a",
  "quote_id": "53019774-aa35-4c28-8d83-9e1ed30d8662",
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
  "id": "010c21c4-d4b4-44b3-9f27-7972fe1c38bf",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c9733954-d2a0-4755-af60-911ad26d13df",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:57:34.598696Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/010c21c4-d4b4-44b3-9f27-7972fe1c38bf/cancel` → **200**

```json
{
  "command_id": "f838e5b2-a7d6-43fc-a27d-1394d6072fdf",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "010c21c4-d4b4-44b3-9f27-7972fe1c38bf",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c9733954-d2a0-4755-af60-911ad26d13df",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:57:34.598696Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
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
  "command_id": "b5881739-0c06-480f-af3f-75e3e91e9150",
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
  "changed_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T08:57:35.078284Z"
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
      "changed_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T08:57:35.078284Z"
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
  "device_ref": "sandbox-7803"
}
```

```json
{
  "challenge_id": "5a0a207e-554d-4fa3-b34e-40d38f2f2270",
  "expires_at": "2026-10-30T09:02:35.757020448Z",
  "resend_available_at": "2026-10-30T08:57:36.757020448Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "772136",
  "sent_at": "2026-10-30T08:57:35.759061287Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5a0a207e-554d-4fa3-b34e-40d38f2f2270",
  "code": "772136",
  "device_ref": "sandbox-7803"
}
```

```json
{
  "session_id": "e9cc3201-b22e-40fe-a7ae-7928962829ba",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTU1NiwiaWF0IjoxNzkzMzUwNjU2LCJqdGkiOiI3ZmIyMDNjMC02NzE0LTQwOWItYTYzOS00MWY0OTBmNWQ1MjQiLCJzaWQiOiJlOWNjMzIwMS1iMjJlLTQwZmUtYTdhZS03OTI4OTYyODI5YmEifQ.jfRK3OeBRcN63U-P32m7ijP8Go5t670oVTDb63a72Yg",
  "access_expires_at": "2026-10-30T09:12:36.000177078Z",
  "refresh_token": "zNtxCrpYKsqnIVpvnOIhbFzOYNAd5UhlYwJpcbakLt0",
  "refresh_expires_at": "2026-11-29T08:57:35.999781834Z",
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
  "command_id": "5a263c56-fc2a-4e26-adad-10d50f37b499",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:57:36Z",
    "sequence": 1793350656427
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4f09a41a-291f-46c6-b370-40d363d7bc86",
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
  "last_heartbeat_at": "2026-10-30T08:57:36.443764Z",
  "last_location_at": "2026-10-30T08:57:36.443764Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678552562",
  "device_ref": "sandbox-5435"
}
```

```json
{
  "challenge_id": "277ed733-5b78-4a31-bd89-4dba35f44b5d",
  "expires_at": "2026-10-30T09:02:36.662584396Z",
  "resend_available_at": "2026-10-30T08:57:37.662584396Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678552562` → **200**

```json
{
  "phone": "+380678552562",
  "audience": "CLIENT",
  "code": "740205",
  "sent_at": "2026-10-30T08:57:36.664707164Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "277ed733-5b78-4a31-bd89-4dba35f44b5d",
  "code": "740205",
  "device_ref": "sandbox-5435"
}
```

```json
{
  "session_id": "b1706b6a-a0f2-4db8-865d-3fc97af76fe7",
  "subject": {
    "type": "CLIENT",
    "id": "a19ad606-9be3-4e81-b6b5-7bb5fee38b47"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMTlhZDYwNi05YmUzLTRlODEtYjZiNS03YmI1ZmVlMzhiNDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNTU2LCJpYXQiOjE3OTMzNTA2NTYsImp0aSI6IjgzZGZiNzMzLTI0ZDMtNGE4NS04YWRlLWY5ZTA5MjJhNmNkZiIsInNpZCI6ImIxNzA2YjZhLWEwZjItNGRiOC04NjVkLTNmYzk3YWY3NmZlNyJ9.a_Ti7Y3TFrVkZRSsCH7GcI9NJX-40bXOlI9u2gNtNuE",
  "access_expires_at": "2026-10-30T09:12:36.907092442Z",
  "refresh_token": "xATG39tWr_lL36orxlHgrcwt73Upvm1eTnhZ4OLV58I",
  "refresh_expires_at": "2026-11-29T08:57:36.90672108Z",
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
  "command_id": "5591fef1-99db-46de-b52e-24062036cded",
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
  "id": "947ad339-eafd-4e0b-8f02-3b0bc70adab2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:02:37.347575Z",
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
  "command_id": "0d69c625-93a8-49fc-a056-f1cdbbf14baa",
  "platform": "ANDROID",
  "token": "sandbox-driver-a9682a9e-6514-4da3-8c9c-65b519c3876d"
}
```

```json
{
  "id": "eccbe57b-3c18-449c-8a9b-01f9e8a9b5e5",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T08:57:37.589147Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "294b5598-b1f4-42a5-9eb4-993144807ff0",
  "platform": "ANDROID",
  "token": "sandbox-rider-9c50863c-73d3-45c1-ac78-aca336c778d7"
}
```

```json
{
  "id": "16549558-941b-415e-b2f8-8248d4da0fc8",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T08:57:37.819717Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "6a9a5b45-6632-4330-b911-082115fc0411",
  "quote_id": "947ad339-eafd-4e0b-8f02-3b0bc70adab2",
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
  "id": "4a0be8de-30ed-466e-bde8-dfdea9ca32f0",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a19ad606-9be3-4e81-b6b5-7bb5fee38b47",
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
  "created_at": "2026-10-30T08:57:38.049163Z",
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
    "id": "a45eacd9-b725-4c5f-9364-1169ff72f341",
    "order_id": "4a0be8de-30ed-466e-bde8-dfdea9ca32f0",
    "expires_at": "2026-10-30T08:57:53.051228Z",
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

`POST /api/driver/v1/offers/a45eacd9-b725-4c5f-9364-1169ff72f341/accept` → **200**

```json
{
  "command_id": "02411cf0-45d5-494a-95a2-370dfc76b3ff"
}
```

```json
{
  "id": "dc402d35-2645-452a-bdbb-980fd8745e25",
  "order_id": "4a0be8de-30ed-466e-bde8-dfdea9ca32f0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9fa3db9a-dfa4-4b18-a521-a640b3f38c4b",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T08:57:38.286Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T08:57:38.286Z` → **200**

```json
[
  {
    "at": "2026-10-30T08:57:39.205470564Z",
    "token_suffix": "c3876d",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_version": "2",
      "event_id": "7521ff7a-e97a-4328-aa88-1a512b7cd8cb",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "4a0be8de-30ed-466e-bde8-dfdea9ca32f0"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380678552562&after=2026-10-30T08:57:38.286Z` → **200**

```json
[
  {
    "at": "2026-10-30T08:57:39.203230934Z",
    "token_suffix": "c778d7",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_version": "3",
      "event_id": "495348f1-e1a7-4aa4-a942-6b7a3e4876f0",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "4a0be8de-30ed-466e-bde8-dfdea9ca32f0"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/4a0be8de-30ed-466e-bde8-dfdea9ca32f0/messages` → **201**

```json
{
  "command_id": "33cf4ca0-3d8b-4d88-8d3e-7d082fcf1916",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "4641918c-93f9-4504-a282-00d34fcd2347",
  "order_id": "4a0be8de-30ed-466e-bde8-dfdea9ca32f0",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T08:57:39.812657247Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9fa3db9a-dfa4-4b18-a521-a640b3f38c4b",
  "order_id": "4a0be8de-30ed-466e-bde8-dfdea9ca32f0",
  "assignment_id": "dc402d35-2645-452a-bdbb-980fd8745e25",
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

`POST /api/driver/v1/trips/9fa3db9a-dfa4-4b18-a521-a640b3f38c4b/messages` → **201**

```json
{
  "command_id": "b77b23f2-884e-45c0-8f69-f734bda4fe26",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "5f1398eb-0c5f-40c4-96d9-375d2b4c21bf",
  "order_id": "4a0be8de-30ed-466e-bde8-dfdea9ca32f0",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T08:57:40.249956368Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/4a0be8de-30ed-466e-bde8-dfdea9ca32f0/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/9fa3db9a-dfa4-4b18-a521-a640b3f38c4b/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380678552562"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/4f09a41a-291f-46c6-b370-40d363d7bc86/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:57:40Z",
    "sequence": 1793350660901
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4f09a41a-291f-46c6-b370-40d363d7bc86",
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
  "last_heartbeat_at": "2026-10-30T08:57:40.917371Z",
  "last_location_at": "2026-10-30T08:57:40.917371Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9fa3db9a-dfa4-4b18-a521-a640b3f38c4b",
  "order_id": "4a0be8de-30ed-466e-bde8-dfdea9ca32f0",
  "assignment_id": "dc402d35-2645-452a-bdbb-980fd8745e25",
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

`POST /api/driver/v1/trips/9fa3db9a-dfa4-4b18-a521-a640b3f38c4b/arrive` → **200**

```json
{
  "command_id": "e2443a0f-9f68-44a3-a612-e2e8d0e59f20",
  "expected_version": 0
}
```

```json
{
  "id": "9fa3db9a-dfa4-4b18-a521-a640b3f38c4b",
  "order_id": "4a0be8de-30ed-466e-bde8-dfdea9ca32f0",
  "assignment_id": "dc402d35-2645-452a-bdbb-980fd8745e25",
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
  "arrived_at": "2026-10-30T08:57:41.355758Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9fa3db9a-dfa4-4b18-a521-a640b3f38c4b/start` → **200**

```json
{
  "command_id": "a3f1a052-a205-4132-81af-614cc1c26d19",
  "expected_version": 1
}
```

```json
{
  "id": "9fa3db9a-dfa4-4b18-a521-a640b3f38c4b",
  "order_id": "4a0be8de-30ed-466e-bde8-dfdea9ca32f0",
  "assignment_id": "dc402d35-2645-452a-bdbb-980fd8745e25",
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
  "arrived_at": "2026-10-30T08:57:41.355758Z",
  "started_at": "2026-10-30T08:57:41.584249Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/4f09a41a-291f-46c6-b370-40d363d7bc86/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:57:41Z",
    "sequence": 1793350661813
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4f09a41a-291f-46c6-b370-40d363d7bc86",
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
  "last_heartbeat_at": "2026-10-30T08:57:41.829812Z",
  "last_location_at": "2026-10-30T08:57:41.829812Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/9fa3db9a-dfa4-4b18-a521-a640b3f38c4b/complete` → **200**

```json
{
  "command_id": "6f2038c7-f8d6-481d-9567-64b13df3b113",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:57:42Z",
  "cash_received": true
}
```

```json
{
  "id": "9fa3db9a-dfa4-4b18-a521-a640b3f38c4b",
  "order_id": "4a0be8de-30ed-466e-bde8-dfdea9ca32f0",
  "assignment_id": "dc402d35-2645-452a-bdbb-980fd8745e25",
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
  "arrived_at": "2026-10-30T08:57:41.355758Z",
  "started_at": "2026-10-30T08:57:41.584249Z",
  "completed_at": "2026-10-30T08:57:42.064783Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/4a0be8de-30ed-466e-bde8-dfdea9ca32f0` → **200**

```json
{
  "id": "4a0be8de-30ed-466e-bde8-dfdea9ca32f0",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "a19ad606-9be3-4e81-b6b5-7bb5fee38b47",
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
    "id": "dc402d35-2645-452a-bdbb-980fd8745e25",
    "order_id": "4a0be8de-30ed-466e-bde8-dfdea9ca32f0",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9fa3db9a-dfa4-4b18-a521-a640b3f38c4b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:57:38.049163Z",
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
    "id": "4a0be8de-30ed-466e-bde8-dfdea9ca32f0",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-30T08:57:38.049163Z",
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
    "id": "9fa3db9a-dfa4-4b18-a521-a640b3f38c4b",
    "order_id": "4a0be8de-30ed-466e-bde8-dfdea9ca32f0",
    "order_short_number": 13,
    "created_at": "2026-10-30T08:57:38.506906Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "108882b7-0fcf-4450-abbd-06ec1fa5f40a",
    "order_id": "5842df53-9451-40fa-a310-dcbce157b1dc",
    "order_short_number": 8,
    "created_at": "2026-10-30T08:56:33.839098Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "af345991-cc8d-4435-8afc-68f5e0de6031",
    "order_id": "4f49bb8d-cc62-469b-9af0-cf9c9f5b112c",
    "order_short_number": 3,
    "created_at": "2026-10-30T08:55:55.751178Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "d1bd8fec-b659-4cab-b904-615f46bd58c3",
    "order_id": "0ede66f3-7569-41eb-a31e-2418e8a758d8",
    "order_short_number": 2,
    "created_at": "2026-10-30T08:55:43.062373Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "fc06f856-41ae-4302-9e13-73b4718275e8",
    "order_id": "8d3a6e09-cff5-4a76-958a-75623b5e22d7",
    "order_short_number": 1,
    "created_at": "2026-10-30T08:55:35.410029Z",
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

`GET /api/rider/v1/orders/4a0be8de-30ed-466e-bde8-dfdea9ca32f0/tip` → **200**

```json
{
  "order_id": "4a0be8de-30ed-466e-bde8-dfdea9ca32f0",
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
  "available_until": "2026-10-31T08:57:42.064783Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/4a0be8de-30ed-466e-bde8-dfdea9ca32f0/tip` → **201**

```json
{
  "command_id": "b6a4fba2-f8e9-459a-8279-a80be2f387ab",
  "amount_minor": 1100
}
```

```json
{
  "id": "b992276e-a2e6-4802-8419-f19f6ce760be",
  "order_id": "4a0be8de-30ed-466e-bde8-dfdea9ca32f0",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T08:57:46.664266Z"
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
  "session_id": "0166f740-69cc-4c1d-9921-8612fa282c8e",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE1NjcsImlhdCI6MTc5MzM1MDY2NywianRpIjoiNzc0OTRlYTEtZjBlZS00ZDAxLWJjYzgtMzhkMTdlZGRhODg4Iiwic2lkIjoiMDE2NmY3NDAtNjljYy00YzFkLTk5MjEtODYxMmZhMjgyYzhlIn0.aZRN6-c_QhBUmikh_xZT_fjP10cBNzItRwG96XnSNIQ",
  "access_expires_at": "2026-10-30T09:12:47.147991433Z",
  "refresh_token": "oOXh7eWccIZGHmQahEgc8GVh6M8kbResPlwtzbGwoaU",
  "refresh_expires_at": "2026-10-30T20:57:47.147592339Z",
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
          "APP": 12,
          "PHONE": 1
        },
        "by_payment": {
          "CASH": 11,
          "CARD": 2
        },
        "cancelled_by": {
          "RIDER": 3,
          "DRIVER": 1,
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
      "APP": 12,
      "PHONE": 1
    },
    "by_payment": {
      "CASH": 11,
      "CARD": 2
    },
    "cancelled_by": {
      "RIDER": 3,
      "DRIVER": 1,
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
  "generated_at": "2026-10-30T08:57:47.368821549Z"
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
  "generated_at": "2026-10-30T08:57:47.597327999Z"
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
  "session_id": "077bafb9-c6dc-4eea-a7d1-328be465d348",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE1NjgsImlhdCI6MTc5MzM1MDY2OCwianRpIjoiMTk2ZGZmNGEtMGUwYy00NWVhLTlkNGQtZmRlOGMzMzc2ZjNkIiwic2lkIjoiMDc3YmFmYjktYzZkYy00ZWVhLWE3ZDEtMzI4YmU0NjVkMzQ4In0.JKqTfSMVlrcrSuJ6ijtsKuo90pRfiADBS2UJ3Rp978c",
  "access_expires_at": "2026-10-30T09:12:48.082837439Z",
  "refresh_token": "ogprjGU5JCL228-nMS7RKeE1YkLVPtP4bwrMDzergTI",
  "refresh_expires_at": "2026-10-30T20:57:48.082374869Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4a0be8de-30ed-466e-bde8-dfdea9ca32f0/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:57:38.049514Z",
      "actor": {
        "type": "CLIENT",
        "id": "a19ad606-9be3-4e81-b6b5-7bb5fee38b47",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4a0be8de-30ed-466e-bde8-dfdea9ca32f0",
        "quote_id": "947ad339-eafd-4e0b-8f02-3b0bc70adab2",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "7f5f705d-914a-43a4-94fd-e1fa861ac801"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:57:38.050771Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4a0be8de-30ed-466e-bde8-dfdea9ca32f0",
        "attempt_id": "1a7047a4-9f43-4635-8722-ed044f467706",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "7f5f705d-914a-43a4-94fd-e1fa861ac801"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T08:57:38.052928Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a45eacd9-b725-4c5f-9364-1169ff72f341",
        "order_id": "4a0be8de-30ed-466e-bde8-dfdea9ca32f0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "7f5f705d-914a-43a4-94fd-e1fa861ac801"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T08:57:38.508609Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "a45eacd9-b725-4c5f-9364-1169ff72f341",
        "order_id": "4a0be8de-30ed-466e-bde8-dfdea9ca32f0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "dc402d35-2645-452a-bdbb-980fd8745e25"
      },
      "correlation_id": "377670ea-fb24-4745-8118-18cb6ec5726e"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T08:57:48.524474185Z",
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
      "last_location_at": "2026-10-30T08:57:41.829812Z",
      "order_id": null
    }
  ]
}
```

Done: order 4a0be8de-30ed-466e-bde8-dfdea9ca32f0.

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
  "session_id": "851cb240-ddd7-4e60-967b-316bcebc8db3",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE1NjksImlhdCI6MTc5MzM1MDY2OSwianRpIjoiMzdhZjA5OTAtNzlhMC00MTAxLWEwYWMtMDg5YzU0MDlhNmE4Iiwic2lkIjoiODUxY2IyNDAtZGRkNy00ZTYwLTk2N2ItMzE2YmNlYmM4ZGIzIn0.il9ttiuM3LAsqaXQ3fkem2m0H7ADQu_O7MuqoDVXKIY",
  "access_expires_at": "2026-10-30T09:12:49.046821652Z",
  "refresh_token": "3yLZtRdfDXnWeCThc8EAOeO3U0j7tKrbtONth8q0u-M",
  "refresh_expires_at": "2026-10-30T20:57:49.046248084Z",
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
  "command_id": "510541fe-5b03-4ffc-936e-0aa7d3340e08",
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
  "timestamp": "2026-10-30T08:57:49.000+0000",
  "channel": {
    "id": "1730052000.236328010",
    "linkedid": "1730052000.236328010",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673261859"
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
  "timestamp": "2026-10-30T08:57:49.000+0000",
  "channel": {
    "id": "1730052000.236328010",
    "linkedid": "1730052000.236328010",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673261859"
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
  "session_id": "4c752be9-7cf7-4a01-b56d-35b0d542aa29",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE1NzAsImlhdCI6MTc5MzM1MDY3MCwianRpIjoiMGQ1MTRkZjYtYTM2MC00ZWNjLTgwNTgtNThkY2U1ZmRjNzE3Iiwic2lkIjoiNGM3NTJiZTktN2NmNy00YTAxLWI1NmQtMzViMGQ1NDJhYTI5In0.ReONQRn3gbm4VwE4y_q11PnFD3GvdoJrr7zyvKlkoho",
  "access_expires_at": "2026-10-30T09:12:50.029280553Z",
  "refresh_token": "8yuNjO3rkH0jupqLP3Z48FIza3h8fQuSdKWMg_D_2jc",
  "refresh_expires_at": "2026-10-30T20:57:50.028854247Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "1278f3d4-71a4-4f26-90f3-0b5101f7e346",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673261859",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T08:57:49Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/1278f3d4-71a4-4f26-90f3-0b5101f7e346/answer` → **200**

```json
{
  "command_id": "86232e0d-9308-4933-898b-010a27bb20aa"
}
```

```json
{
  "id": "1278f3d4-71a4-4f26-90f3-0b5101f7e346",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673261859",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
  "order_ids": [],
  "started_at": "2026-10-30T08:57:49Z",
  "answered_at": "2026-10-30T08:57:50.481308Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.236328010",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "1b516348-da33-4398-84cc-9f8dac2aa876",
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
  "id": "eda52772-cdb7-4af6-98c7-01ddb02e7e4e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:02:50.729222Z",
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
  "command_id": "8f41ec3f-b222-4222-a788-e378aefc4648",
  "quote_id": "eda52772-cdb7-4af6-98c7-01ddb02e7e4e",
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
    "phone": "+380673261859"
  },
  "call_id": "1278f3d4-71a4-4f26-90f3-0b5101f7e346"
}
```

```json
{
  "id": "aad11b15-e7fa-4bea-b56a-4723aa97d759",
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
  "created_at": "2026-10-30T08:57:50.963617Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673261859"
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
    "id": "1730052000.236328010",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "1278f3d4-71a4-4f26-90f3-0b5101f7e346",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673261859",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
      "order_ids": [
        "aad11b15-e7fa-4bea-b56a-4723aa97d759"
      ],
      "started_at": "2026-10-30T08:57:49Z",
      "answered_at": "2026-10-30T08:57:50.481308Z",
      "ended_at": "2026-10-30T08:57:51.210235Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "a73c9ad0-5191-445c-8f6a-54fb72c7d453",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679540302",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
      "order_ids": [],
      "started_at": "2026-10-30T08:55:50.087623Z",
      "answered_at": "2026-10-30T08:55:50.338946Z",
      "ended_at": "2026-10-30T08:55:50.578064Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T08:55:52.457001Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/aad11b15-e7fa-4bea-b56a-4723aa97d759` → **200**

```json
{
  "id": "aad11b15-e7fa-4bea-b56a-4723aa97d759",
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
  "created_at": "2026-10-30T08:57:50.963617Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673261859"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/aad11b15-e7fa-4bea-b56a-4723aa97d759` → **200**

```json
{
  "id": "aad11b15-e7fa-4bea-b56a-4723aa97d759",
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
  "created_at": "2026-10-30T08:57:50.963617Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673261859"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/aad11b15-e7fa-4bea-b56a-4723aa97d759/cancel` → **200**

```json
{
  "command_id": "583ca8b7-c813-4b0a-88ce-990d5258ae95",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "aad11b15-e7fa-4bea-b56a-4723aa97d759",
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
  "created_at": "2026-10-30T08:57:50.963617Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673261859"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 1278f3d4-71a4-4f26-90f3-0b5101f7e346 with order aad11b15-e7fa-4bea-b56a-4723aa97d759.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-7764"
}
```

```json
{
  "challenge_id": "ac1ba932-0ae8-4de4-8a7a-0ca87bb5e24d",
  "expires_at": "2026-10-30T09:02:52.174035865Z",
  "resend_available_at": "2026-10-30T08:57:53.174035865Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "397787",
  "sent_at": "2026-10-30T08:57:52.176949084Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ac1ba932-0ae8-4de4-8a7a-0ca87bb5e24d",
  "code": "397787",
  "device_ref": "sandbox-7764"
}
```

```json
{
  "session_id": "e5ec3273-c0d2-4365-b9ee-ba70082c2e49",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTU3MiwiaWF0IjoxNzkzMzUwNjcyLCJqdGkiOiJkMGNjMDExYy02ZGQwLTQ2ODktODhmNS03MTQyMGRiZTQ4NzEiLCJzaWQiOiJlNWVjMzI3My1jMGQyLTQzNjUtYjllZS1iYTcwMDgyYzJlNDkifQ.BOQSbgrMEA4GqlAykp3LlhVuitxrugmFt-4FcH2pEjs",
  "access_expires_at": "2026-10-30T09:12:52.42426873Z",
  "refresh_token": "HtlQwQrXyeVAy1ghLlJwB95_DrrTGmOFWIJTelSMhac",
  "refresh_expires_at": "2026-11-29T08:57:52.423837507Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4f09a41a-291f-46c6-b370-40d363d7bc86",
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
  "last_heartbeat_at": "2026-10-30T08:57:41.829812Z",
  "last_location_at": "2026-10-30T08:57:41.829812Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4f09a41a-291f-46c6-b370-40d363d7bc86/handover` → **200**

```json
{
  "command_id": "288363fb-347a-4d0f-a734-b3243ebcaa77",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4f09a41a-291f-46c6-b370-40d363d7bc86",
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
  "last_heartbeat_at": "2026-10-30T08:57:41.829812Z",
  "last_location_at": "2026-10-30T08:57:41.829812Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4f09a41a-291f-46c6-b370-40d363d7bc86/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:57:53Z",
    "sequence": 1793350673109
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4f09a41a-291f-46c6-b370-40d363d7bc86",
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
  "last_heartbeat_at": "2026-10-30T08:57:53.125552Z",
  "last_location_at": "2026-10-30T08:57:53.125552Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667508102",
  "device_ref": "sandbox-25108"
}
```

```json
{
  "challenge_id": "f221a8ad-4546-4a22-823e-58f14b00d953",
  "expires_at": "2026-10-30T09:02:53.345136539Z",
  "resend_available_at": "2026-10-30T08:57:54.345136539Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667508102` → **200**

```json
{
  "phone": "+380667508102",
  "audience": "CLIENT",
  "code": "386433",
  "sent_at": "2026-10-30T08:57:53.347177418Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f221a8ad-4546-4a22-823e-58f14b00d953",
  "code": "386433",
  "device_ref": "sandbox-25108"
}
```

```json
{
  "session_id": "3ac8416b-573d-42aa-ac74-9a9911ae9e8b",
  "subject": {
    "type": "CLIENT",
    "id": "18a4c82e-72fc-4eff-b0ae-a75bc4765ab6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOGE0YzgyZS03MmZjLTRlZmYtYjBhZS1hNzViYzQ3NjVhYjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNTczLCJpYXQiOjE3OTMzNTA2NzMsImp0aSI6ImQwMjBmNGMzLTkyZjgtNDdjYS1hZDY4LTFiYjBjZTNjOGVkMCIsInNpZCI6IjNhYzg0MTZiLTU3M2QtNDJhYS1hYzc0LTlhOTkxMWFlOWU4YiJ9.zZD6Tce-jX-B52EEyMaX5wZp2Y5taVwiW6-fokMhRbE",
  "access_expires_at": "2026-10-30T09:12:53.591826722Z",
  "refresh_token": "nHTnjj0g7EwJ1quiGVFEzW2B23sKE8jMDF2wU7QyyvA",
  "refresh_expires_at": "2026-11-29T08:57:53.591372715Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5c6c3302-80e7-4a03-b3f6-5ed4d5effe73",
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
  "id": "a3f4f5f9-498d-42c7-a35f-32cb0471a0ed",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:02:53.813579Z",
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
  "command_id": "1d9e8da9-a9e7-449b-93aa-81b0f0c292f3",
  "quote_id": "a3f4f5f9-498d-42c7-a35f-32cb0471a0ed",
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
  "id": "c99a943d-ca48-4601-afe7-5fe14217297b",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "18a4c82e-72fc-4eff-b0ae-a75bc4765ab6",
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
  "created_at": "2026-10-30T08:57:54.04126Z",
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
    "id": "9bd8a9c0-35b5-4bb1-8f42-2112c1c4a54e",
    "order_id": "c99a943d-ca48-4601-afe7-5fe14217297b",
    "expires_at": "2026-10-30T08:58:09.044124Z",
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

`POST /api/driver/v1/offers/9bd8a9c0-35b5-4bb1-8f42-2112c1c4a54e/accept` → **200**

```json
{
  "command_id": "a22dee63-091f-4aab-b427-308ebb57a94c"
}
```

```json
{
  "id": "9d5ea571-51b0-482b-9630-afd3386182e1",
  "order_id": "c99a943d-ca48-4601-afe7-5fe14217297b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dedfbbf9-6127-4577-99d7-5b6cf94ad88b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dedfbbf9-6127-4577-99d7-5b6cf94ad88b",
  "order_id": "c99a943d-ca48-4601-afe7-5fe14217297b",
  "assignment_id": "9d5ea571-51b0-482b-9630-afd3386182e1",
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

`POST /api/driver/v1/work-sessions/4f09a41a-291f-46c6-b370-40d363d7bc86/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:57:54Z",
    "sequence": 1793350674923
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4f09a41a-291f-46c6-b370-40d363d7bc86",
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
  "last_heartbeat_at": "2026-10-30T08:57:54.939364Z",
  "last_location_at": "2026-10-30T08:57:54.939364Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/dedfbbf9-6127-4577-99d7-5b6cf94ad88b/arrive` → **200**

```json
{
  "command_id": "23ec5878-ef80-49d0-aef6-5603a232d2a3",
  "expected_version": 0
}
```

```json
{
  "id": "dedfbbf9-6127-4577-99d7-5b6cf94ad88b",
  "order_id": "c99a943d-ca48-4601-afe7-5fe14217297b",
  "assignment_id": "9d5ea571-51b0-482b-9630-afd3386182e1",
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
  "arrived_at": "2026-10-30T08:57:55.164628Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/dedfbbf9-6127-4577-99d7-5b6cf94ad88b/start` → **200**

```json
{
  "command_id": "f370fc00-bbfc-43e2-bcef-a247769689c0",
  "expected_version": 1
}
```

```json
{
  "id": "dedfbbf9-6127-4577-99d7-5b6cf94ad88b",
  "order_id": "c99a943d-ca48-4601-afe7-5fe14217297b",
  "assignment_id": "9d5ea571-51b0-482b-9630-afd3386182e1",
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
  "arrived_at": "2026-10-30T08:57:55.164628Z",
  "started_at": "2026-10-30T08:57:55.393745Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/4f09a41a-291f-46c6-b370-40d363d7bc86/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:57:55Z",
    "sequence": 1793350675611
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4f09a41a-291f-46c6-b370-40d363d7bc86",
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
  "last_heartbeat_at": "2026-10-30T08:57:55.627654Z",
  "last_location_at": "2026-10-30T08:57:55.627654Z",
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
  "device_ref": "sandbox-28155"
}
```

```json
{
  "challenge_id": "95e3e788-c34f-4bac-90be-b7f9b85b83b0",
  "expires_at": "2026-10-30T09:02:55.85358825Z",
  "resend_available_at": "2026-10-30T08:57:56.85358825Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "101795",
  "sent_at": "2026-10-30T08:57:55.855488947Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "95e3e788-c34f-4bac-90be-b7f9b85b83b0",
  "code": "101795",
  "device_ref": "sandbox-28155"
}
```

```json
{
  "session_id": "1b5adcbf-be94-4302-b4e6-f610768d31aa",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTU3NiwiaWF0IjoxNzkzMzUwNjc2LCJqdGkiOiJhOGUyNTdmOC05NzdjLTRkMzYtYTE1Yi1mZmZmMGIxZWNjNTkiLCJzaWQiOiIxYjVhZGNiZi1iZTk0LTQzMDItYjRlNi1mNjEwNzY4ZDMxYWEifQ.JLQGKEl-CK0sLqNzE7-ci_8HAlRfj4SxRAAYwvxNWLU",
  "access_expires_at": "2026-10-30T09:12:56.126759204Z",
  "refresh_token": "_UmFzqodTLRdczMkPDtCjKBcl2DmXcHmxPO_3k7oyS8",
  "refresh_expires_at": "2026-11-29T08:57:56.126286839Z",
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
  "command_id": "75d1c652-c8ef-4b9b-b258-7369b3c8df80",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:57:56Z",
    "sequence": 1793350676553
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "3e50d0b3-5d4b-4de7-9c78-287ec5658ab0",
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
  "last_heartbeat_at": "2026-10-30T08:57:56.569486Z",
  "last_location_at": "2026-10-30T08:57:56.569486Z",
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
  "session_id": "b4b309cc-2cf5-4dbb-a15e-c21fea7469fe",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE1NzcsImlhdCI6MTc5MzM1MDY3NywianRpIjoiZDQ5OTdmMjQtOGEwYy00YTVmLWJkMmItNjA3YjYzN2IxYzIyIiwic2lkIjoiYjRiMzA5Y2MtMmNmNS00ZGJiLWExNWUtYzIxZmVhNzQ2OWZlIn0.6qXOzmrXwMz-SZ-1Vu3IXAQqK53bIsuQ-et5xuskOng",
  "access_expires_at": "2026-10-30T09:12:57.056544601Z",
  "refresh_token": "vjZR4llfG-pNCbWXOkEjhTNqJUzjP8TBIVV5x9lPmFw",
  "refresh_expires_at": "2026-10-30T20:57:57.056109492Z",
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
  "session_id": "b51024ce-59e1-4436-ad61-544cc1587c7c",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE1NzcsImlhdCI6MTc5MzM1MDY3NywianRpIjoiNGQ3NWFjZWUtNTFhOC00NWIzLWE2NWMtN2I3ZGE5MDMwZmUwIiwic2lkIjoiYjUxMDI0Y2UtNTllMS00NDM2LWFkNjEtNTQ0Y2MxNTg3YzdjIn0.0QVB7yFvVWgZczX1ORrLZAgIKtNpU6UZvz3UUnQKFE0",
  "access_expires_at": "2026-10-30T09:12:57.530059925Z",
  "refresh_token": "Z9kNAorKViH8vmP3lQxspKfWHwNJmlzOJloXYFAusLs",
  "refresh_expires_at": "2026-10-30T20:57:57.529667041Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c99a943d-ca48-4601-afe7-5fe14217297b` → **200**

```json
{
  "id": "c99a943d-ca48-4601-afe7-5fe14217297b",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "18a4c82e-72fc-4eff-b0ae-a75bc4765ab6",
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
    "id": "9d5ea571-51b0-482b-9630-afd3386182e1",
    "order_id": "c99a943d-ca48-4601-afe7-5fe14217297b",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "dedfbbf9-6127-4577-99d7-5b6cf94ad88b",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T08:57:54.04126Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/c99a943d-ca48-4601-afe7-5fe14217297b/interrupt` → **200**

```json
{
  "command_id": "554775ad-7584-47ee-b20b-33dd88ccf180",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "c99a943d-ca48-4601-afe7-5fe14217297b",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "18a4c82e-72fc-4eff-b0ae-a75bc4765ab6",
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
      "id": "9d5ea571-51b0-482b-9630-afd3386182e1",
      "order_id": "c99a943d-ca48-4601-afe7-5fe14217297b",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "dedfbbf9-6127-4577-99d7-5b6cf94ad88b",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T08:57:54.04126Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "a323904a-e614-4ee1-9c07-c27f3dd90a60",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "18a4c82e-72fc-4eff-b0ae-a75bc4765ab6",
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
    "id": "81b41d5c-3cd7-459a-a8bd-1b49dfe0b32a",
    "order_id": "a323904a-e614-4ee1-9c07-c27f3dd90a60",
    "expires_at": "2026-10-30T08:58:13.001382Z",
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

`POST /api/driver/v1/offers/81b41d5c-3cd7-459a-a8bd-1b49dfe0b32a/accept` → **200**

```json
{
  "command_id": "5fc1bb64-f673-4555-8fb9-968943b2c2ae"
}
```

```json
{
  "id": "429973dd-5bdf-452a-a324-c7027d28be79",
  "order_id": "a323904a-e614-4ee1-9c07-c27f3dd90a60",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "61dd86c1-7fdb-429c-905c-20649511991c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "61dd86c1-7fdb-429c-905c-20649511991c",
  "order_id": "a323904a-e614-4ee1-9c07-c27f3dd90a60",
  "assignment_id": "429973dd-5bdf-452a-a324-c7027d28be79",
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
  "session_id": "3e50d0b3-5d4b-4de7-9c78-287ec5658ab0",
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
  "last_heartbeat_at": "2026-10-30T08:57:56.569486Z",
  "last_location_at": "2026-10-30T08:57:56.569486Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/3e50d0b3-5d4b-4de7-9c78-287ec5658ab0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:57:59Z",
    "sequence": 1793350679123
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "3e50d0b3-5d4b-4de7-9c78-287ec5658ab0",
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
  "last_heartbeat_at": "2026-10-30T08:57:59.139019Z",
  "last_location_at": "2026-10-30T08:57:59.139019Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/61dd86c1-7fdb-429c-905c-20649511991c/arrive` → **200**

```json
{
  "command_id": "79db17db-c14c-41fb-8cd9-814f37941af1",
  "expected_version": 0
}
```

```json
{
  "id": "61dd86c1-7fdb-429c-905c-20649511991c",
  "order_id": "a323904a-e614-4ee1-9c07-c27f3dd90a60",
  "assignment_id": "429973dd-5bdf-452a-a324-c7027d28be79",
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
  "arrived_at": "2026-10-30T08:57:59.36673Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/61dd86c1-7fdb-429c-905c-20649511991c/start` → **200**

```json
{
  "command_id": "a98637dc-7ff0-45d8-abcf-bbdc586b2fdc",
  "expected_version": 1
}
```

```json
{
  "id": "61dd86c1-7fdb-429c-905c-20649511991c",
  "order_id": "a323904a-e614-4ee1-9c07-c27f3dd90a60",
  "assignment_id": "429973dd-5bdf-452a-a324-c7027d28be79",
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
  "arrived_at": "2026-10-30T08:57:59.36673Z",
  "started_at": "2026-10-30T08:57:59.604411Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/61dd86c1-7fdb-429c-905c-20649511991c/complete` → **200**

```json
{
  "command_id": "e93fe215-975c-4829-86a6-ae8e5ad44ef8",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:57:59Z"
}
```

```json
{
  "id": "61dd86c1-7fdb-429c-905c-20649511991c",
  "order_id": "a323904a-e614-4ee1-9c07-c27f3dd90a60",
  "assignment_id": "429973dd-5bdf-452a-a324-c7027d28be79",
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
  "arrived_at": "2026-10-30T08:57:59.36673Z",
  "started_at": "2026-10-30T08:57:59.604411Z",
  "completed_at": "2026-10-30T08:57:59.863251Z",
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
    "id": "a323904a-e614-4ee1-9c07-c27f3dd90a60",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-30T08:57:57.993988Z",
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
    "id": "c99a943d-ca48-4601-afe7-5fe14217297b",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-30T08:57:54.04126Z",
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
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
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

`GET /api/operator/v1/orders/c99a943d-ca48-4601-afe7-5fe14217297b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:57:54.041756Z",
      "actor": {
        "type": "CLIENT",
        "id": "18a4c82e-72fc-4eff-b0ae-a75bc4765ab6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "c99a943d-ca48-4601-afe7-5fe14217297b",
        "quote_id": "a3f4f5f9-498d-42c7-a35f-32cb0471a0ed",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "e8ece8e4-fc7e-441c-af08-f6afced1a551"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:57:54.043439Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c99a943d-ca48-4601-afe7-5fe14217297b",
        "attempt_id": "5126506f-7360-4ba4-81e2-dcf1532ceb97",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "e8ece8e4-fc7e-441c-af08-f6afced1a551"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T08:57:54.049379Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "9bd8a9c0-35b5-4bb1-8f42-2112c1c4a54e",
        "order_id": "c99a943d-ca48-4601-afe7-5fe14217297b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "e8ece8e4-fc7e-441c-af08-f6afced1a551"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T08:57:54.494634Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "9bd8a9c0-35b5-4bb1-8f42-2112c1c4a54e",
        "order_id": "c99a943d-ca48-4601-afe7-5fe14217297b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "9d5ea571-51b0-482b-9630-afd3386182e1"
      },
      "correlation_id": "97a10f6f-cd6f-4b4a-940e-ada19288dfe0"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/a323904a-e614-4ee1-9c07-c27f3dd90a60/tip` → **200**

```json
{
  "order_id": "a323904a-e614-4ee1-9c07-c27f3dd90a60",
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
  "available_until": "2026-10-31T08:57:59.863251Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/a323904a-e614-4ee1-9c07-c27f3dd90a60/tip` → **409**

```json
{
  "command_id": "b70be0e1-0c4a-4604-b90d-bc6e3fe3e21c",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/a323904a-e614-4ee1-9c07-c27f3dd90a60/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ab236e36-55a4-4755-ae23-7580ca9d2e58"
}
```

Done: interrupted c99a943d-ca48-4601-afe7-5fe14217297b, follow-up a323904a-e614-4ee1-9c07-c27f3dd90a60.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4f09a41a-291f-46c6-b370-40d363d7bc86",
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
  "last_heartbeat_at": "2026-10-30T08:57:55.627654Z",
  "last_location_at": "2026-10-30T08:57:55.627654Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4f09a41a-291f-46c6-b370-40d363d7bc86/close` → **200**

```json
{
  "command_id": "89920027-b263-4438-add0-1ebeeaa9332c",
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
  "session_id": "3e50d0b3-5d4b-4de7-9c78-287ec5658ab0",
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
  "last_heartbeat_at": "2026-10-30T08:57:59.139019Z",
  "last_location_at": "2026-10-30T08:57:59.139019Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3e50d0b3-5d4b-4de7-9c78-287ec5658ab0/close` → **200**

```json
{
  "command_id": "70f3f405-e654-40e7-a75e-50725078c4bb",
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
  "session_id": "844ef5de-85a8-4970-b918-22972999f52b",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE1ODUsImlhdCI6MTc5MzM1MDY4NSwianRpIjoiZGVjOGZhNDItYTI5OC00NGRhLTk2YTItZThmYjQ5ZTgwMjliIiwic2lkIjoiODQ0ZWY1ZGUtODVhOC00OTcwLWI5MTgtMjI5NzI5OTlmNTJiIn0.A66Ks-DHfIbZqgSoLrrxB9tsAe9CyrGkRUNp86rpcL0",
  "access_expires_at": "2026-10-30T09:13:05.390889206Z",
  "refresh_token": "iubh8NyAZLHp7zXD71EaJ9_INlGUR9YsOOrFc5xW2j8",
  "refresh_expires_at": "2026-10-30T20:58:05.390402169Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "a339cf00-9e39-4c1a-82b1-3b1f7929b560",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T08:58:05Z"
}
```

```json
{
  "id": "8c7134fa-7513-4139-921e-94872d2697ef",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T08:58:05Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/8c7134fa-7513-4139-921e-94872d2697ef/publish` → **200**

```json
{
  "command_id": "be1fd69d-b59c-41d4-8b83-ba6944ce6186",
  "expected_version": 0
}
```

```json
{
  "id": "8c7134fa-7513-4139-921e-94872d2697ef",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T08:58:05.862487Z",
  "published_at": "2026-10-30T08:58:05.862487Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "8c7134fa-7513-4139-921e-94872d2697ef",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T08:58:05.862487Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631113532",
  "device_ref": "sandbox-14145"
}
```

```json
{
  "challenge_id": "7b694645-0c89-47ad-916e-be0db9edcd94",
  "expires_at": "2026-10-30T09:03:06.302505202Z",
  "resend_available_at": "2026-10-30T08:58:07.302505202Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631113532` → **200**

```json
{
  "phone": "+380631113532",
  "audience": "CLIENT",
  "code": "626874",
  "sent_at": "2026-10-30T08:58:06.30461875Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7b694645-0c89-47ad-916e-be0db9edcd94",
  "code": "626874",
  "device_ref": "sandbox-14145"
}
```

```json
{
  "session_id": "fc24c922-1f40-4911-9446-00aeba7c5a28",
  "subject": {
    "type": "CLIENT",
    "id": "8604fdc5-42a1-478a-bb9c-f9a5c718dbfc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjA0ZmRjNS00MmExLTQ3OGEtYmI5Yy1mOWE1YzcxOGRiZmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNTg2LCJpYXQiOjE3OTMzNTA2ODYsImp0aSI6IjM1ZmJjMjczLWQ1M2YtNGM4OS04ZmVkLTk4OTE0MTAzMzdiYiIsInNpZCI6ImZjMjRjOTIyLTFmNDAtNDkxMS05NDQ2LTAwYWViYTdjNWEyOCJ9.cUs1O0SLg1rwviyQ7UWuZBMAy391-vpnDyRpRoY0IWA",
  "access_expires_at": "2026-10-30T09:13:06.543826607Z",
  "refresh_token": "r97btbR-ESdOnP6YMBbDEtiZA2s_K00F-ryW6TMbqcs",
  "refresh_expires_at": "2026-11-29T08:58:06.543340011Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "8c7134fa-7513-4139-921e-94872d2697ef",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T08:58:05.862487Z",
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
  "command_id": "f2370037-93ff-495e-9ec0-320ca395384b",
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
  "id": "202b76ad-ba5f-497c-938b-a1e0a973b26f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:03:06.991546Z",
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
  "command_id": "68702436-eeae-4e2c-a88e-8fc96fffad9f",
  "quote_id": "202b76ad-ba5f-497c-938b-a1e0a973b26f",
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
  "correlation_id": "04503566-02d7-4d2f-8b92-35afe9be918e"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "112536f1-6755-4085-9a9d-b424d43e2fd4",
  "version_id": "8c7134fa-7513-4139-921e-94872d2697ef",
  "language": "uk"
}
```

```json
{
  "version_id": "8c7134fa-7513-4139-921e-94872d2697ef",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T08:58:07.446283Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e4b41bef-3365-4429-b28e-64cee782968d",
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
  "id": "55b6206a-b0e9-47b0-8ddb-4af7164571cf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:03:07.667866Z",
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
  "command_id": "b8145f10-cbe3-47be-8124-8ea1586dd31e",
  "quote_id": "55b6206a-b0e9-47b0-8ddb-4af7164571cf",
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
  "id": "1c55a063-5d70-4546-b0d6-ac0f5bdbac53",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8604fdc5-42a1-478a-bb9c-f9a5c718dbfc",
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
  "created_at": "2026-10-30T08:58:07.895606Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1c55a063-5d70-4546-b0d6-ac0f5bdbac53` → **200**

```json
{
  "id": "1c55a063-5d70-4546-b0d6-ac0f5bdbac53",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8604fdc5-42a1-478a-bb9c-f9a5c718dbfc",
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
  "created_at": "2026-10-30T08:58:07.895606Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/1c55a063-5d70-4546-b0d6-ac0f5bdbac53/cancel` → **200**

```json
{
  "command_id": "a5b39c14-9778-4589-b28d-62c838b91d10",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "1c55a063-5d70-4546-b0d6-ac0f5bdbac53",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8604fdc5-42a1-478a-bb9c-f9a5c718dbfc",
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
  "created_at": "2026-10-30T08:58:07.895606Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
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

`POST /api/admin/v1/legal-documents/8c7134fa-7513-4139-921e-94872d2697ef` → **409**

```json
{
  "command_id": "1e4c56af-1b30-420a-b24e-5eced0feb921",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T08:58:08Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/8c7134fa-7513-4139-921e-94872d2697ef",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "98b414a7-6927-404a-a1b4-d0f14d80f9a7"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "d425a99f-0828-4483-bbb6-741c9e78fc55",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T08:58:08Z"
}
```

```json
{
  "id": "bce29a77-048e-418a-b46c-e75c9bcdcf15",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T08:58:08Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/bce29a77-048e-418a-b46c-e75c9bcdcf15/publish` → **200**

```json
{
  "command_id": "24313e97-5c2d-4c42-ab3c-2360d474fa4b",
  "expected_version": 0
}
```

```json
{
  "id": "bce29a77-048e-418a-b46c-e75c9bcdcf15",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T08:58:09.058469Z",
  "published_at": "2026-10-30T08:58:09.058469Z",
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
  "device_ref": "sandbox-19909"
}
```

```json
{
  "challenge_id": "5d197708-ae82-49cf-9e90-b4dc5b7ba400",
  "expires_at": "2026-10-30T09:03:09.285678016Z",
  "resend_available_at": "2026-10-30T08:58:10.285678016Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "963272",
  "sent_at": "2026-10-30T08:58:09.287691115Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5d197708-ae82-49cf-9e90-b4dc5b7ba400",
  "code": "963272",
  "device_ref": "sandbox-19909"
}
```

```json
{
  "session_id": "2c9e5ec5-afdf-495e-8258-c30beb619268",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTU4OSwiaWF0IjoxNzkzMzUwNjg5LCJqdGkiOiI2YzA1MzIzNi0zOTdkLTRhOTEtODc5Ni1jM2M3ODYzZTlkMzYiLCJzaWQiOiIyYzllNWVjNS1hZmRmLTQ5NWUtODI1OC1jMzBiZWI2MTkyNjgifQ.7Ik_0MXGxukHAbu95eqLlzNifg98YTG369-l3ntmJMo",
  "access_expires_at": "2026-10-30T09:13:09.539822495Z",
  "refresh_token": "jjpPC9x0zp0GGZ9IRjwtKLUo4AN7aUf9Z5K1icN881Q",
  "refresh_expires_at": "2026-11-29T08:58:09.539282964Z",
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
  "command_id": "6d243939-df37-473e-a3a6-086d9dd265ce",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:58:09Z",
    "sequence": 1793350689986
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d2ed5913-80c0-49f1-91ab-a5b2dff0b920",
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
  "last_heartbeat_at": "2026-10-30T08:58:10.002501Z",
  "last_location_at": "2026-10-30T08:58:10.002501Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678916016",
  "device_ref": "sandbox-17761"
}
```

```json
{
  "challenge_id": "03f5584d-cb36-4795-a4e8-a1198edb00d9",
  "expires_at": "2026-10-30T09:03:10.226669654Z",
  "resend_available_at": "2026-10-30T08:58:11.226669654Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678916016` → **200**

```json
{
  "phone": "+380678916016",
  "audience": "CLIENT",
  "code": "522398",
  "sent_at": "2026-10-30T08:58:10.228711959Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "03f5584d-cb36-4795-a4e8-a1198edb00d9",
  "code": "522398",
  "device_ref": "sandbox-17761"
}
```

```json
{
  "session_id": "dd8f529b-ab20-4760-90cc-b717b61192af",
  "subject": {
    "type": "CLIENT",
    "id": "d38ddcd9-e66b-4635-a45c-113a8f61ce22"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzhkZGNkOS1lNjZiLTQ2MzUtYTQ1Yy0xMTNhOGY2MWNlMjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNTkwLCJpYXQiOjE3OTMzNTA2OTAsImp0aSI6IjMxNDUwZDE1LTg2MWQtNDdmNy05ZGE2LWZhOGJkNGJlYmRjMCIsInNpZCI6ImRkOGY1MjliLWFiMjAtNDc2MC05MGNjLWI3MTdiNjExOTJhZiJ9.ha30iUBZV5i0NWxYeXBzPuALmeIkzbBSpiTWk_NdTlk",
  "access_expires_at": "2026-10-30T09:13:10.473927686Z",
  "refresh_token": "g0XhaiwZsE8v-e-CsgaSFvnjCq5KntzdxsXn3WS4SJs",
  "refresh_expires_at": "2026-11-29T08:58:10.473518542Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9796768c-4aff-43f9-a60a-24f754daa608",
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
  "id": "dc492ba4-e75d-44ce-b550-66ab686a8958",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:03:10.699206Z",
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
  "command_id": "10f31dac-e746-47de-8465-34117dd50b9a",
  "quote_id": "dc492ba4-e75d-44ce-b550-66ab686a8958",
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
    "phone": "+380673139746"
  }
}
```

```json
{
  "id": "e38a1070-3b3a-452c-8856-d942cc8f273e",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d38ddcd9-e66b-4635-a45c-113a8f61ce22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:58:10.938196Z",
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
    "id": "8af94dee-1cca-463e-841e-5d2cf2392042",
    "order_id": "e38a1070-3b3a-452c-8856-d942cc8f273e",
    "expires_at": "2026-10-30T08:58:25.94046Z",
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

`POST /api/driver/v1/offers/8af94dee-1cca-463e-841e-5d2cf2392042/accept` → **200**

```json
{
  "command_id": "758f212a-8383-4569-b3a8-6ae2a6979c73"
}
```

```json
{
  "id": "8a988b3e-18bf-48e6-a73d-1ee248abb84c",
  "order_id": "e38a1070-3b3a-452c-8856-d942cc8f273e",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "15b4f2fe-77db-4f42-bcb1-8114c92787da",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "15b4f2fe-77db-4f42-bcb1-8114c92787da",
  "order_id": "e38a1070-3b3a-452c-8856-d942cc8f273e",
  "assignment_id": "8a988b3e-18bf-48e6-a73d-1ee248abb84c",
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
    "phone": "+380673139746"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c67ae4d7-9662-4485-b2e6-b1d267572c8a",
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
  "id": "b499e3d5-af0f-40d6-8561-c936f504ed1f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:03:11.863568Z",
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
  "command_id": "c239a1f4-e993-45e5-a523-7960f9ea4362",
  "quote_id": "b499e3d5-af0f-40d6-8561-c936f504ed1f",
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
  "id": "9db00291-927a-4ea3-8016-803e115a07ce",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d38ddcd9-e66b-4635-a45c-113a8f61ce22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:58:12.097375Z",
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
  "command_id": "70d46ccd-81b1-45f1-9ee9-a71fd652d054",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T11:58:12Z"
}
```

```json
{
  "id": "b635a4b8-1afd-4e13-a829-e485405d942c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:03:12.357543Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T11:58:12Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "b6a9b26b-eb89-44d3-a27e-5e351cac3af6",
  "quote_id": "b635a4b8-1afd-4e13-a829-e485405d942c",
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
  "pickup_at": "2026-10-30T11:58:12Z"
}
```

```json
{
  "id": "f77beff9-f6e9-48a7-9767-b305d7791e24",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "d38ddcd9-e66b-4635-a45c-113a8f61ce22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T08:58:12.594746Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T11:58:12Z",
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
  "command_id": "65a121d9-3ff1-4446-90c3-12e91d8e296f",
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
  "id": "c085e3af-8063-4bb7-8d3b-38d2d5ceb55a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:03:12.833304Z",
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
  "command_id": "4fdc49b6-8660-4281-8207-35fd393c151d",
  "quote_id": "c085e3af-8063-4bb7-8d3b-38d2d5ceb55a",
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
  "correlation_id": "3ea35198-2502-44e9-9631-e14e0f8b99d0"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "f77beff9-f6e9-48a7-9767-b305d7791e24",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "d38ddcd9-e66b-4635-a45c-113a8f61ce22",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T08:58:12.594746Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T11:58:12Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "9db00291-927a-4ea3-8016-803e115a07ce",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "d38ddcd9-e66b-4635-a45c-113a8f61ce22",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T08:58:12.097375Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "e38a1070-3b3a-452c-8856-d942cc8f273e",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "9db00291-927a-4ea3-8016-803e115a07ce",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d38ddcd9-e66b-4635-a45c-113a8f61ce22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:58:12.097375Z",
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

`GET /api/rider/v1/orders/e38a1070-3b3a-452c-8856-d942cc8f273e` → **200**

```json
{
  "id": "e38a1070-3b3a-452c-8856-d942cc8f273e",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d38ddcd9-e66b-4635-a45c-113a8f61ce22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "8a988b3e-18bf-48e6-a73d-1ee248abb84c",
    "order_id": "e38a1070-3b3a-452c-8856-d942cc8f273e",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "15b4f2fe-77db-4f42-bcb1-8114c92787da",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T08:58:10.938196Z",
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
    "location_at": "2026-10-30T08:58:10.002501Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/e38a1070-3b3a-452c-8856-d942cc8f273e/cancel` → **200**

```json
{
  "command_id": "c1bdcc24-540e-4c00-b4d1-0ea034fec5ea",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e38a1070-3b3a-452c-8856-d942cc8f273e",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "d38ddcd9-e66b-4635-a45c-113a8f61ce22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "8a988b3e-18bf-48e6-a73d-1ee248abb84c",
    "order_id": "e38a1070-3b3a-452c-8856-d942cc8f273e",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "15b4f2fe-77db-4f42-bcb1-8114c92787da",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T08:58:10.938196Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
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

`GET /api/rider/v1/orders/9db00291-927a-4ea3-8016-803e115a07ce` → **200**

```json
{
  "id": "9db00291-927a-4ea3-8016-803e115a07ce",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d38ddcd9-e66b-4635-a45c-113a8f61ce22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:58:12.097375Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/9db00291-927a-4ea3-8016-803e115a07ce/cancel` → **200**

```json
{
  "command_id": "1ba07f98-24a1-4433-9eaf-53e08386f2d5",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "9db00291-927a-4ea3-8016-803e115a07ce",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d38ddcd9-e66b-4635-a45c-113a8f61ce22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:58:12.097375Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
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

`GET /api/rider/v1/orders/f77beff9-f6e9-48a7-9767-b305d7791e24` → **200**

```json
{
  "id": "f77beff9-f6e9-48a7-9767-b305d7791e24",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "d38ddcd9-e66b-4635-a45c-113a8f61ce22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T08:58:12.594746Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T11:58:12Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f77beff9-f6e9-48a7-9767-b305d7791e24/cancel` → **200**

```json
{
  "command_id": "03e0bf5d-0c3a-43f5-80b5-fcae1afc031d",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f77beff9-f6e9-48a7-9767-b305d7791e24",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "d38ddcd9-e66b-4635-a45c-113a8f61ce22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T08:58:12.594746Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
    }
  },
  "pickup_at": "2026-10-30T11:58:12Z",
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
  "session_id": "d2ed5913-80c0-49f1-91ab-a5b2dff0b920",
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
  "last_heartbeat_at": "2026-10-30T08:58:10.002501Z",
  "last_location_at": "2026-10-30T08:58:10.002501Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d2ed5913-80c0-49f1-91ab-a5b2dff0b920/close` → **200**

```json
{
  "command_id": "5ea664f1-dea8-4615-85df-093cb8bf75ac",
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

Done: orders e38a1070-3b3a-452c-8856-d942cc8f273e, 9db00291-927a-4ea3-8016-803e115a07ce, f77beff9-f6e9-48a7-9767-b305d7791e24.

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
  "session_id": "9d9448df-3a65-4f10-80e4-1be23f666b07",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE1OTUsImlhdCI6MTc5MzM1MDY5NSwianRpIjoiZDVjNTEyZjEtMTI5MS00ZWYxLTg5NGMtYzJjZGRkYmMxMzViIiwic2lkIjoiOWQ5NDQ4ZGYtM2E2NS00ZjEwLTgwZTQtMWJlMjNmNjY2YjA3In0.5ZlqAiT9e7FjVlCqJssKucAS5tfZZx9U-c727qSQ_Ak",
  "access_expires_at": "2026-10-30T09:13:15.856659592Z",
  "refresh_token": "gkv4uPo5xlAlA8nTCT7cCIQZ4zLYYf4QSroETbuvims",
  "refresh_expires_at": "2026-10-30T20:58:15.856234429Z",
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
  "session_id": "95315fb4-a5dd-49f3-afc2-bbdaf8733139",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE1OTYsImlhdCI6MTc5MzM1MDY5NiwianRpIjoiNzdmYTA4M2UtMTE5OC00OTAyLWJlOTYtMzgxNWYxNDRiNTdiIiwic2lkIjoiOTUzMTVmYjQtYTVkZC00OWYzLWFmYzItYmJkYWY4NzMzMTM5In0.beQBJAqQhTOYk3zoug8zjMqSavXmoH92ivdb_teItbI",
  "access_expires_at": "2026-10-30T09:13:16.336004832Z",
  "refresh_token": "kPI4jzjiJoRfm295boqdWo4bNfKjBi7e1wXfF3vUzI0",
  "refresh_expires_at": "2026-10-30T20:58:16.335629464Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26081"
}
```

```json
{
  "challenge_id": "94d0661d-0b4a-418a-a6e6-b3cb310deb05",
  "expires_at": "2026-10-30T09:03:16.55004979Z",
  "resend_available_at": "2026-10-30T08:58:17.55004979Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "262078",
  "sent_at": "2026-10-30T08:58:16.552031696Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "94d0661d-0b4a-418a-a6e6-b3cb310deb05",
  "code": "262078",
  "device_ref": "sandbox-26081"
}
```

```json
{
  "session_id": "f1b8e2b1-6938-4e19-bd6a-4c5fb82dc1fb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTU5NiwiaWF0IjoxNzkzMzUwNjk2LCJqdGkiOiJmNWJhZjk4ZC0xYmFlLTRlYzYtOTAwMi1lYzE4MTYxNWVlMzEiLCJzaWQiOiJmMWI4ZTJiMS02OTM4LTRlMTktYmQ2YS00YzVmYjgyZGMxZmIifQ.FANdoewpYkDUYwDUTjZLC8obF2KDN5yYhkIDZu7F-Nw",
  "access_expires_at": "2026-10-30T09:13:16.793047101Z",
  "refresh_token": "9jFGhqs-PpTPzJtmfkEm08iDEzjto2lHpng0SeMdNBg",
  "refresh_expires_at": "2026-11-29T08:58:16.792672185Z",
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
  "command_id": "f6f3ddf5-3a1f-4269-bdcd-a5a17715297c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:58:17Z",
    "sequence": 1793350697226
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "387c7e52-2391-4248-8cd9-e5d640291e19",
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
  "last_heartbeat_at": "2026-10-30T08:58:17.241613Z",
  "last_location_at": "2026-10-30T08:58:17.241613Z",
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
  "command_id": "0db0ffa2-9cc2-4c3c-8c5f-e3323fe3c13a",
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
  "effective_at": "2026-10-30T08:58:17.699875Z",
  "changed_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "31a00219-70fd-4586-82bb-ecb321d1f902",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T08:56:00.130906Z",
  "last_entries": [
    {
      "order_id": "4f49bb8d-cc62-469b-9af0-cf9c9f5b112c",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T08:56:00.130906Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2c7deefe-933d-4a07-9543-e6a9e52406b2",
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
  "id": "690f04da-1fa3-4450-995c-6660f7f0c5a6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:03:18.155659Z",
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
  "command_id": "b2453ac7-4116-49c8-bdfc-9b93033ec29f",
  "quote_id": "690f04da-1fa3-4450-995c-6660f7f0c5a6",
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
    "phone": "+3806711121333"
  }
}
```

```json
{
  "id": "82a508e8-a93c-41e6-a63c-729dcbcaacfc",
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
  "created_at": "2026-10-30T08:58:18.386806Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121333"
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
    "id": "4462a24b-a430-4fc4-8a38-3b5b49a18947",
    "order_id": "82a508e8-a93c-41e6-a63c-729dcbcaacfc",
    "expires_at": "2026-10-30T08:58:33.389645Z",
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

`POST /api/driver/v1/offers/4462a24b-a430-4fc4-8a38-3b5b49a18947/accept` → **200**

```json
{
  "command_id": "5d17c655-5e6d-4fda-982a-a2e95c425319"
}
```

```json
{
  "id": "e03e1832-9460-4d22-8116-f786c60d81e3",
  "order_id": "82a508e8-a93c-41e6-a63c-729dcbcaacfc",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "01fb712e-db5f-43f0-91a8-8e3b93acbd3a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "01fb712e-db5f-43f0-91a8-8e3b93acbd3a",
  "order_id": "82a508e8-a93c-41e6-a63c-729dcbcaacfc",
  "assignment_id": "e03e1832-9460-4d22-8116-f786c60d81e3",
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
    "phone": "+3806711121333"
  }
}
```

`POST /api/driver/v1/work-sessions/387c7e52-2391-4248-8cd9-e5d640291e19/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:58:19Z",
    "sequence": 1793350699274
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "387c7e52-2391-4248-8cd9-e5d640291e19",
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
  "last_heartbeat_at": "2026-10-30T08:58:19.290472Z",
  "last_location_at": "2026-10-30T08:58:19.290472Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/01fb712e-db5f-43f0-91a8-8e3b93acbd3a/arrive` → **200**

```json
{
  "command_id": "ebeb5682-5700-4e84-ba44-fc47170c4fab",
  "expected_version": 0
}
```

```json
{
  "id": "01fb712e-db5f-43f0-91a8-8e3b93acbd3a",
  "order_id": "82a508e8-a93c-41e6-a63c-729dcbcaacfc",
  "assignment_id": "e03e1832-9460-4d22-8116-f786c60d81e3",
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
  "arrived_at": "2026-10-30T08:58:19.514118Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711121333"
  }
}
```

`POST /api/driver/v1/trips/01fb712e-db5f-43f0-91a8-8e3b93acbd3a/start` → **200**

```json
{
  "command_id": "142a82ad-044b-46c7-ac4a-566bd3a46fd8",
  "expected_version": 1
}
```

```json
{
  "id": "01fb712e-db5f-43f0-91a8-8e3b93acbd3a",
  "order_id": "82a508e8-a93c-41e6-a63c-729dcbcaacfc",
  "assignment_id": "e03e1832-9460-4d22-8116-f786c60d81e3",
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
  "arrived_at": "2026-10-30T08:58:19.514118Z",
  "started_at": "2026-10-30T08:58:19.74483Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711121333"
  }
}
```

`POST /api/driver/v1/trips/01fb712e-db5f-43f0-91a8-8e3b93acbd3a/complete` → **200**

```json
{
  "command_id": "57012ed8-f99a-4fa9-a58f-0eb13a1292fa",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:58:19Z",
  "cash_received": true
}
```

```json
{
  "id": "01fb712e-db5f-43f0-91a8-8e3b93acbd3a",
  "order_id": "82a508e8-a93c-41e6-a63c-729dcbcaacfc",
  "assignment_id": "e03e1832-9460-4d22-8116-f786c60d81e3",
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
  "arrived_at": "2026-10-30T08:58:19.514118Z",
  "started_at": "2026-10-30T08:58:19.74483Z",
  "completed_at": "2026-10-30T08:58:19.975461Z",
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
  "command_id": "fd8565ad-cd07-4228-a41a-5a3f73558781",
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
  "id": "c087affb-1ba6-46d2-ba94-b08d93d61483",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:03:20.220611Z",
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
  "command_id": "ffcf38f9-87d9-4ca9-b35a-3c214c2c1c68",
  "quote_id": "c087affb-1ba6-46d2-ba94-b08d93d61483",
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
    "phone": "+3806711120103"
  }
}
```

```json
{
  "id": "91d686fe-1169-425d-a9d1-b659974997bb",
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
  "created_at": "2026-10-30T08:58:20.454042Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711120103"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/91d686fe-1169-425d-a9d1-b659974997bb` → **200**

```json
{
  "id": "91d686fe-1169-425d-a9d1-b659974997bb",
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
  "created_at": "2026-10-30T08:58:20.454042Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711120103"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/91d686fe-1169-425d-a9d1-b659974997bb/cancel` → **200**

```json
{
  "command_id": "9b141b4a-68d1-4600-9e98-34febf60e38a",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "91d686fe-1169-425d-a9d1-b659974997bb",
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
  "created_at": "2026-10-30T08:58:20.454042Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711120103"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "ru": "Ошибка оператора",
      "pl": "Błąd operatora",
      "uk": "Помилка оператора",
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
  "staff_id": "31a00219-70fd-4586-82bb-ecb321d1f902",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T08:56:00.130906Z",
  "last_entries": [
    {
      "order_id": "91d686fe-1169-425d-a9d1-b659974997bb",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T08:58:20.923178Z"
    },
    {
      "order_id": "82a508e8-a93c-41e6-a63c-729dcbcaacfc",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T08:58:19.979119Z"
    },
    {
      "order_id": "4f49bb8d-cc62-469b-9af0-cf9c9f5b112c",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T08:56:00.130906Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "387c7e52-2391-4248-8cd9-e5d640291e19",
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
  "last_heartbeat_at": "2026-10-30T08:58:19.290472Z",
  "last_location_at": "2026-10-30T08:58:19.290472Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/387c7e52-2391-4248-8cd9-e5d640291e19/close` → **200**

```json
{
  "command_id": "cd098126-a22f-4ff6-91c9-d635fed10360",
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

Done: operator bonus for fulfilled 82a508e8-a93c-41e6-a63c-729dcbcaacfc and operator-fault cancellation 91d686fe-1169-425d-a9d1-b659974997bb.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673460789",
  "device_ref": "sandbox-9617"
}
```

```json
{
  "challenge_id": "6d56f29c-f83e-48d1-841d-36e24b9617f3",
  "expires_at": "2026-10-30T09:03:25.053436409Z",
  "resend_available_at": "2026-10-30T08:58:26.053436409Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673460789` → **200**

```json
{
  "phone": "+380673460789",
  "audience": "CLIENT",
  "code": "759385",
  "sent_at": "2026-10-30T08:58:25.05549777Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670658551",
  "device_ref": "sandbox-6122",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "a9cb61e2-b4e7-475c-89be-fe8b43512d39",
  "expires_at": "2026-10-30T09:03:26.515845128Z",
  "resend_available_at": "2026-10-30T08:58:27.515845128Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670658551` → **200**

```json
{
  "phone": "+380670658551",
  "audience": "CLIENT",
  "code": "213594",
  "sent_at": "2026-10-30T08:58:26.517591474Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670658551",
  "device_ref": "sandbox-26046",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "002382df-c0f5-455f-b083-7ab8778bc03a",
  "expires_at": "2026-10-30T09:03:27.964246932Z",
  "resend_available_at": "2026-10-30T08:58:28.964246932Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380670658551` → **200**

```json
{
  "phone": "+380670658551",
  "audience": "CLIENT",
  "code": "860698",
  "sent_at": "2026-10-30T08:58:27.966701865Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676450000",
  "device_ref": "sandbox-22697"
}
```

```json
{
  "challenge_id": "6b71927a-511b-4fcc-b521-6406fd7ccbfb",
  "expires_at": "2026-10-30T09:03:29.415132103Z",
  "resend_available_at": "2026-10-30T08:58:30.415132103Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676450000",
  "device_ref": "sandbox-7992"
}
```

```json
{
  "challenge_id": "3549d1d5-2a47-4685-8d94-900dad35491d",
  "expires_at": "2026-10-30T09:03:30.847033267Z",
  "resend_available_at": "2026-10-30T08:58:31.847033267Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380676450000` → **200**

```json
{
  "phone": "+380676450000",
  "audience": "CLIENT",
  "code": "672202",
  "sent_at": "2026-10-30T08:58:30.84932136Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676450000",
  "device_ref": "sandbox-28218",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "7e7025d0-7603-4a3a-9e38-ae91752e5cda",
  "expires_at": "2026-10-30T09:03:32.301929725Z",
  "resend_available_at": "2026-10-30T08:58:33.301929725Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380676450000` → **200**

```json
{
  "phone": "+380676450000",
  "audience": "CLIENT",
  "code": "198460",
  "sent_at": "2026-10-30T08:58:32.303931325Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380676450000",
  "device_ref": "sandbox-7329",
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
  "correlation_id": "853c30b4-920e-4f21-9e91-f9f44a43c268",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000022612"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "537c6d05-1f57-46b4-a407-389807c24f9f"
}
```

`GET /sandbox/v1/otp?phone=%2B442000022612` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120008444"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "caca0c57-272c-4afc-a96d-c41136473534"
}
```

`GET /sandbox/v1/otp?phone=%2B37120008444` → **404**

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
  "session_id": "2ed92f73-1e7b-4026-b101-c40c8169a893",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE2MTQsImlhdCI6MTc5MzM1MDcxNCwianRpIjoiZjE5NTY3MGQtOThmZS00NTIyLWIyOTktMmYzYmMwMjUzNGI5Iiwic2lkIjoiMmVkOTJmNzMtMWU3Yi00MDI2LWIxMDEtYzQwYzgxNjlhODkzIn0.f89A5ttNJwmxc43_ENy0Qtjmeo1DrsqIjvQju5pIPXs",
  "access_expires_at": "2026-10-30T09:13:34.733963513Z",
  "refresh_token": "EAN9lBEbECGkyvevaE8MRzShPP3HZl9vTrktwtMHzio",
  "refresh_expires_at": "2026-10-30T20:58:34.733252388Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676450000` → **200**

```json
{
  "deliveries": [
    {
      "id": "b454195e-78e8-41f1-b6e1-9bdb04b48063",
      "challenge_id": "7e7025d0-7603-4a3a-9e38-ae91752e5cda",
      "phone": "+380676450000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-6ca12f8e-ef85-4cb8-b8b4-125e3462a5f9",
      "error": null,
      "attempted_at": "2026-10-30T08:58:32.304373Z"
    },
    {
      "id": "a9a72fe5-6cd1-48b9-b088-55963452099c",
      "challenge_id": "3549d1d5-2a47-4685-8d94-900dad35491d",
      "phone": "+380676450000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-5bb72657-8944-43cc-ab12-9430c9f5bb00",
      "error": null,
      "attempted_at": "2026-10-30T08:58:30.850063Z"
    },
    {
      "id": "9af300a3-aade-488c-af9c-a20d520d7379",
      "challenge_id": "6b71927a-511b-4fcc-b521-6406fd7ccbfb",
      "phone": "+380676450000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T08:58:29.41743Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380676450000` → **200**

```json
{
  "phone": "+380676450000",
  "audience": "CLIENT",
  "code": "198460",
  "sent_at": "2026-10-30T08:58:32.303931325Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380670658551` → **200**

```json
{
  "deliveries": [
    {
      "id": "3c8d41f5-e32f-4d3f-ab0a-f00cc8cbb899",
      "challenge_id": "002382df-c0f5-455f-b083-7ab8778bc03a",
      "phone": "+380670658551",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-b7e79c88-a4b1-4878-bbc9-0a86770f0362",
      "error": null,
      "attempted_at": "2026-10-30T08:58:27.966963Z"
    },
    {
      "id": "3edc7d03-dcbc-44d7-803a-1d2f7b657abe",
      "challenge_id": "a9cb61e2-b4e7-475c-89be-fe8b43512d39",
      "phone": "+380670658551",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-b886ccdc-b4db-4ca8-b52f-f4f478a38f3e",
      "error": null,
      "attempted_at": "2026-10-30T08:58:26.517828Z"
    }
  ]
}
```

Done: SMS to +380673460789; SMS then a call to +380670658551; a failed SMS, two calls and a refused third to +380676450000; +44 and +371 refused.

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
  "session_id": "444e74d9-db4e-4276-a23f-764e87972a9d",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE2MTUsImlhdCI6MTc5MzM1MDcxNSwianRpIjoiZmU2NGYxMWEtMmU3Ny00MmE4LWJjMGEtYzdiZjMwYjE4MjgxIiwic2lkIjoiNDQ0ZTc0ZDktZGI0ZS00Mjc2LWEyM2YtNzY0ZTg3OTcyYTlkIn0.Oy8zoVzYhPmQiZa1EH_M48fFfc1wnhm99OVJO_P4qLI",
  "access_expires_at": "2026-10-30T09:13:35.721398128Z",
  "refresh_token": "hikO32JtVrpkyy1bkUndGUGsPJi4JdnpBrNcczIS7MU",
  "refresh_expires_at": "2026-10-30T20:58:35.720661234Z",
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
  "session_id": "706f314e-4ccd-4162-a4b4-01d304f2b902",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE2MTYsImlhdCI6MTc5MzM1MDcxNiwianRpIjoiNTgwYzI1OTctZGRlZi00OThjLWI2NTQtNmQ5ZTQ4MWVlZWY5Iiwic2lkIjoiNzA2ZjMxNGUtNGNjZC00MTYyLWE0YjQtMDFkMzA0ZjJiOTAyIn0.gQ3h-UQnuFBJ_2gz8NzK3nnugZhTCfrS0CuW-QqCez0",
  "access_expires_at": "2026-10-30T09:13:36.205572526Z",
  "refresh_token": "0OptSJsGz--dSGO8mVcdqwIUvNyXvh-oFy6CVn7wqN4",
  "refresh_expires_at": "2026-10-30T20:58:36.205124509Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902",
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

`POST /api/admin/v1/staff-extensions/31a00219-70fd-4586-82bb-ecb321d1f902` → **200**

```json
{
  "command_id": "2df28d0f-6fb9-4b82-ac5b-8264544b5a84",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "31a00219-70fd-4586-82bb-ecb321d1f902",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "f1b3ee58-5a23-482e-8936-9e1d89590a06",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T08:58:37.11243Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T08:58:37.11243Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d9e4a6a3-0f44-4194-a409-e6beb26b1452",
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
  "id": "2f5713e1-325c-4d9f-9296-84653bf480e9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:03:37.565991Z",
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
  "command_id": "5c5a8d8d-239d-4746-a6ec-1e705309b68d",
  "quote_id": "2f5713e1-325c-4d9f-9296-84653bf480e9",
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
    "phone": "+380671327917"
  }
}
```

```json
{
  "id": "cba8eb69-39d8-4481-873f-5389612fcf08",
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
  "created_at": "2026-10-30T08:58:37.813252Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671327917"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/cba8eb69-39d8-4481-873f-5389612fcf08/calls` → **201**

```json
{
  "command_id": "8a909cb0-de5b-4ee7-93a3-59a33a963c81",
  "to": "CALLER"
}
```

```json
{
  "id": "e6295be8-444e-43ca-93ce-9a8c04d4a15a",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
  "order_ids": [
    "cba8eb69-39d8-4481-873f-5389612fcf08"
  ],
  "started_at": "2026-10-30T08:58:38.067854Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/cba8eb69-39d8-4481-873f-5389612fcf08/calls` → **201**

```json
{
  "command_id": "8a909cb0-de5b-4ee7-93a3-59a33a963c81",
  "to": "CALLER"
}
```

```json
{
  "id": "e6295be8-444e-43ca-93ce-9a8c04d4a15a",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
  "order_ids": [
    "cba8eb69-39d8-4481-873f-5389612fcf08"
  ],
  "started_at": "2026-10-30T08:58:38.067854Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "e6295be8-444e-43ca-93ce-9a8c04d4a15a",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380671327917",
    "at": "2026-10-30T08:58:38.06980972Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "e6295be8-444e-43ca-93ce-9a8c04d4a15a",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.1849",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "e6295be8-444e-43ca-93ce-9a8c04d4a15a"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "e6295be8-444e-43ca-93ce-9a8c04d4a15a",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=cba8eb69-39d8-4481-873f-5389612fcf08` → **200**

```json
{
  "calls": [
    {
      "id": "e6295be8-444e-43ca-93ce-9a8c04d4a15a",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
      "order_ids": [
        "cba8eb69-39d8-4481-873f-5389612fcf08"
      ],
      "started_at": "2026-10-30T08:58:38.067854Z",
      "answered_at": "2026-10-30T08:58:38.591579Z",
      "ended_at": "2026-10-30T08:58:38.609825Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=cba8eb69-39d8-4481-873f-5389612fcf08` → **200**

```json
{
  "calls": [
    {
      "id": "e6295be8-444e-43ca-93ce-9a8c04d4a15a",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
      "order_ids": [
        "cba8eb69-39d8-4481-873f-5389612fcf08"
      ],
      "started_at": "2026-10-30T08:58:38.067854Z",
      "answered_at": "2026-10-30T08:58:38.591579Z",
      "ended_at": "2026-10-30T08:58:38.609825Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=cba8eb69-39d8-4481-873f-5389612fcf08` → **200**

```json
{
  "calls": [
    {
      "id": "e6295be8-444e-43ca-93ce-9a8c04d4a15a",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
      "order_ids": [
        "cba8eb69-39d8-4481-873f-5389612fcf08"
      ],
      "started_at": "2026-10-30T08:58:38.067854Z",
      "answered_at": "2026-10-30T08:58:38.591579Z",
      "ended_at": "2026-10-30T08:58:38.609825Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T08:58:42.492168Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/cba8eb69-39d8-4481-873f-5389612fcf08` → **200**

```json
{
  "id": "cba8eb69-39d8-4481-873f-5389612fcf08",
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
  "created_at": "2026-10-30T08:58:37.813252Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671327917"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/cba8eb69-39d8-4481-873f-5389612fcf08/cancel` → **200**

```json
{
  "command_id": "67286572-14d9-47cb-9817-9ae27d633481",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "cba8eb69-39d8-4481-873f-5389612fcf08",
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
  "created_at": "2026-10-30T08:58:37.813252Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671327917"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
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
  "command_id": "76503963-00f9-401c-a19b-56e736b532f0",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T08:58:43.811205Z",
  "extension": "101"
}
```

Done: outgoing call e6295be8-444e-43ca-93ce-9a8c04d4a15a from order cba8eb69-39d8-4481-873f-5389612fcf08, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631783579",
  "device_ref": "sandbox-28463"
}
```

```json
{
  "challenge_id": "1e17f84d-db9a-41e1-84b5-47bd8600f08a",
  "expires_at": "2026-10-30T09:03:44.053043879Z",
  "resend_available_at": "2026-10-30T08:58:45.053043879Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631783579` → **200**

```json
{
  "phone": "+380631783579",
  "audience": "CLIENT",
  "code": "650518",
  "sent_at": "2026-10-30T08:58:44.055025401Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1e17f84d-db9a-41e1-84b5-47bd8600f08a",
  "code": "650518",
  "device_ref": "sandbox-28463"
}
```

```json
{
  "session_id": "b388656c-4b7d-4945-b60a-ce0b22914f06",
  "subject": {
    "type": "CLIENT",
    "id": "77e33e79-acdf-43de-b621-82e317b0aae0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3N2UzM2U3OS1hY2RmLTQzZGUtYjYyMS04MmUzMTdiMGFhZTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNjI0LCJpYXQiOjE3OTMzNTA3MjQsImp0aSI6IjViMTNhMjY1LTMzNGEtNGI3OS1hZmU1LWE5NTk1NWU0NjMxYyIsInNpZCI6ImIzODg2NTZjLTRiN2QtNDk0NS1iNjBhLWNlMGIyMjkxNGYwNiJ9.GhnVIYpZwbpgYiPamkgSYzbobgfkNFwOog3fv6gU_AM",
  "access_expires_at": "2026-10-30T09:13:44.298437445Z",
  "refresh_token": "B8rJ6cZnM90F_6XYL4PvUkPy_IrGCSHXHzWh7E3fwmA",
  "refresh_expires_at": "2026-11-29T08:58:44.297726301Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "77e33e79-acdf-43de-b621-82e317b0aae0",
  "session_id": "b388656c-4b7d-4945-b60a-ce0b22914f06",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631783579",
  "device_ref": "sandbox-31058"
}
```

```json
{
  "challenge_id": "7495a929-182c-4a49-b403-cb98fc749957",
  "expires_at": "2026-10-30T09:03:46.736254057Z",
  "resend_available_at": "2026-10-30T08:58:47.736254057Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631783579` → **200**

```json
{
  "phone": "+380631783579",
  "audience": "CLIENT",
  "code": "011359",
  "sent_at": "2026-10-30T08:58:46.738283472Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7495a929-182c-4a49-b403-cb98fc749957",
  "code": "011359",
  "device_ref": "sandbox-31058"
}
```

```json
{
  "session_id": "7681ec26-f474-4982-84c9-33d7b5960e29",
  "subject": {
    "type": "CLIENT",
    "id": "77e33e79-acdf-43de-b621-82e317b0aae0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3N2UzM2U3OS1hY2RmLTQzZGUtYjYyMS04MmUzMTdiMGFhZTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNjI2LCJpYXQiOjE3OTMzNTA3MjYsImp0aSI6ImNiYWRlNGExLThjMDgtNDAzMC1hNDJjLWIzMjc5YTM1ZGYwMyIsInNpZCI6Ijc2ODFlYzI2LWY0NzQtNDk4Mi04NGM5LTMzZDdiNTk2MGUyOSJ9.kVcjpoer8j9nE16-tTWWJcmK5NwLbckwx8ykxPVVCMs",
  "access_expires_at": "2026-10-30T09:13:46.985253447Z",
  "refresh_token": "_N8XF1yhSpdoMt5YX5iVonNlBzcTa4nkIz94o7fPbZA",
  "refresh_expires_at": "2026-11-29T08:58:46.984738835Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "6be0360e-3acf-4533-bdea-aa42e2f96a40",
  "expires_at": "2026-10-30T09:03:49.212415219Z",
  "resend_available_at": "2026-10-30T08:58:50.212415219Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631783579` → **200**

```json
{
  "phone": "+380631783579",
  "audience": "CLIENT",
  "code": "774045",
  "sent_at": "2026-10-30T08:58:49.215008709Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380637051417"
}
```

```json
{
  "challenge_id": "7f8a9d83-d20a-4890-b07c-9ce78802d9e0",
  "expires_at": "2026-10-30T09:03:49.460954696Z",
  "resend_available_at": "2026-10-30T08:58:50.460954696Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637051417` → **200**

```json
{
  "phone": "+380637051417",
  "audience": "CLIENT",
  "code": "785315",
  "sent_at": "2026-10-30T08:58:49.462682952Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "f39609a5-f0fe-4521-a519-ffb5c6a9afe4",
  "current_challenge_id": "6be0360e-3acf-4533-bdea-aa42e2f96a40",
  "current_code": "000000",
  "new_challenge_id": "7f8a9d83-d20a-4890-b07c-9ce78802d9e0",
  "new_code": "785315"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "d5030281-68e3-4362-8d82-ac527e9d5af1"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "6cfe96e0-4d6b-418b-acf1-14a79d524106",
  "current_challenge_id": "6be0360e-3acf-4533-bdea-aa42e2f96a40",
  "current_code": "774045",
  "new_challenge_id": "7f8a9d83-d20a-4890-b07c-9ce78802d9e0",
  "new_code": "785315"
}
```

```json
{
  "subject_id": "77e33e79-acdf-43de-b621-82e317b0aae0",
  "phone": "+380637051417",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "77e33e79-acdf-43de-b621-82e317b0aae0",
  "session_id": "b388656c-4b7d-4945-b60a-ce0b22914f06",
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
  "correlation_id": "0a2a30ef-8fdd-4de1-8d08-25825d834df9"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637051417",
  "device_ref": "sandbox-4630"
}
```

```json
{
  "challenge_id": "c4ec1a8a-021e-4223-a96f-08a9108426f5",
  "expires_at": "2026-10-30T09:03:52.615605178Z",
  "resend_available_at": "2026-10-30T08:58:53.615605178Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637051417` → **200**

```json
{
  "phone": "+380637051417",
  "audience": "CLIENT",
  "code": "236271",
  "sent_at": "2026-10-30T08:58:52.618344852Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c4ec1a8a-021e-4223-a96f-08a9108426f5",
  "code": "236271",
  "device_ref": "sandbox-4630"
}
```

```json
{
  "session_id": "595b2dd4-f4cf-4d00-9d07-287954ec6be4",
  "subject": {
    "type": "CLIENT",
    "id": "77e33e79-acdf-43de-b621-82e317b0aae0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3N2UzM2U3OS1hY2RmLTQzZGUtYjYyMS04MmUzMTdiMGFhZTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNjMyLCJpYXQiOjE3OTMzNTA3MzIsImp0aSI6IjBlYTZlMDE2LWM4ZGItNDRiZC04YTNjLWM3ZTY2Njg3MjdkYSIsInNpZCI6IjU5NWIyZGQ0LWY0Y2YtNGQwMC05ZDA3LTI4Nzk1NGVjNmJlNCJ9.Dx1VrEoPAFkVu2D3nRlUURzISf_SmHuNVqIlXgdXdQU",
  "access_expires_at": "2026-10-30T09:13:52.866120598Z",
  "refresh_token": "h8CAllUyae_NxosDXP_8NJY5L1uMRX134OqTjnhsfWE",
  "refresh_expires_at": "2026-11-29T08:58:52.865708295Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "77e33e79-acdf-43de-b621-82e317b0aae0",
  "session_id": "595b2dd4-f4cf-4d00-9d07-287954ec6be4",
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
  "session_id": "2785f3d5-66b5-420b-9474-7eb0ed3fd441",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE2MzMsImlhdCI6MTc5MzM1MDczMywianRpIjoiYzJjNTU5MTgtMGI2NC00OTJiLTgyMzUtZWQwNTIyOTlmMTQ4Iiwic2lkIjoiMjc4NWYzZDUtNjZiNS00MjBiLTk0NzQtN2ViMGVkM2ZkNDQxIn0.JymdCej_PlLe9yn4Az9p3Mo2A5Htj7mnes0TOJHnrYA",
  "access_expires_at": "2026-10-30T09:13:53.560546899Z",
  "refresh_token": "Ewf00yqJDFVCe0DDPcpeotgVnTca2nenAYkH3aBJIAQ",
  "refresh_expires_at": "2026-10-30T20:58:53.560025982Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/77e33e79-acdf-43de-b621-82e317b0aae0` → **200**

```json
{
  "client": {
    "id": "77e33e79-acdf-43de-b621-82e317b0aae0",
    "phone": "+380637051417",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:58:44.296256Z",
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

`POST /api/admin/v1/clients/77e33e79-acdf-43de-b621-82e317b0aae0/phone/new-code` → **201**

```json
{
  "phone": "+380630539930"
}
```

```json
{
  "challenge_id": "e1c20dbe-4999-4b07-bdd5-7f4d62105732",
  "expires_at": "2026-10-30T09:03:54.050939132Z",
  "resend_available_at": "2026-10-30T08:58:55.050939132Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630539930` → **200**

```json
{
  "phone": "+380630539930",
  "audience": "CLIENT",
  "code": "207874",
  "sent_at": "2026-10-30T08:58:54.052674444Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/77e33e79-acdf-43de-b621-82e317b0aae0/phone` → **422**

```json
{
  "command_id": "8ebd0c66-f048-448f-82e7-dd30ef93a7bb",
  "expected_version": 3,
  "new_challenge_id": "e1c20dbe-4999-4b07-bdd5-7f4d62105732",
  "new_code": "207875",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/77e33e79-acdf-43de-b621-82e317b0aae0/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "99fd5e8a-eca1-4086-8c26-5d7693a6008d"
}
```

`POST /api/admin/v1/clients/77e33e79-acdf-43de-b621-82e317b0aae0/phone` → **400**

```json
{
  "command_id": "a3b33821-79e3-4309-a101-9582b49f8b84",
  "expected_version": 3,
  "new_challenge_id": "e1c20dbe-4999-4b07-bdd5-7f4d62105732",
  "new_code": "207874",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/77e33e79-acdf-43de-b621-82e317b0aae0/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "3b33176c-f895-4efa-81cd-28c7b8b95f3f",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/77e33e79-acdf-43de-b621-82e317b0aae0/phone` → **200**

```json
{
  "command_id": "6af05bec-c869-432e-a3c3-8e0a6d8bf5b1",
  "expected_version": 3,
  "new_challenge_id": "e1c20dbe-4999-4b07-bdd5-7f4d62105732",
  "new_code": "207874",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "77e33e79-acdf-43de-b621-82e317b0aae0",
  "phone": "+380630539930",
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
  "correlation_id": "6d296bca-89d5-4192-9c09-deb4e33aac37"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630539930",
  "device_ref": "sandbox-8945"
}
```

```json
{
  "challenge_id": "323bb31a-541e-4cd0-ad66-340fd21a03e9",
  "expires_at": "2026-10-30T09:03:55.215800478Z",
  "resend_available_at": "2026-10-30T08:58:56.215800478Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630539930` → **200**

```json
{
  "phone": "+380630539930",
  "audience": "CLIENT",
  "code": "261393",
  "sent_at": "2026-10-30T08:58:55.218000261Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "323bb31a-541e-4cd0-ad66-340fd21a03e9",
  "code": "261393",
  "device_ref": "sandbox-8945"
}
```

```json
{
  "session_id": "d0299836-4f08-48f7-82ab-a80f4cb14321",
  "subject": {
    "type": "CLIENT",
    "id": "77e33e79-acdf-43de-b621-82e317b0aae0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3N2UzM2U3OS1hY2RmLTQzZGUtYjYyMS04MmUzMTdiMGFhZTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNjM1LCJpYXQiOjE3OTMzNTA3MzUsImp0aSI6IjIyZjg3ZjhlLTRhZDgtNDgzNS1iMDFhLWY4OTFjMmU1ZjY3OCIsInNpZCI6ImQwMjk5ODM2LTRmMDgtNDhmNy04MmFiLWE4MGY0Y2IxNDMyMSJ9.Xiye5oh_0o08B-VwfGDtx8T5fZ8z4ZMgwa8ffRtW_Ic",
  "access_expires_at": "2026-10-30T09:13:55.472128114Z",
  "refresh_token": "w37eZdaaWh3SqBHXHITRhBz6g7XmSg360j-MVxmJ8Jc",
  "refresh_expires_at": "2026-11-29T08:58:55.471585506Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "77e33e79-acdf-43de-b621-82e317b0aae0",
  "session_id": "d0299836-4f08-48f7-82ab-a80f4cb14321",
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
  "phone": "+380633777062",
  "device_ref": "sandbox-4379"
}
```

```json
{
  "challenge_id": "f7a624d1-243b-4f54-a567-baf907d6a411",
  "expires_at": "2026-10-30T09:03:55.913426778Z",
  "resend_available_at": "2026-10-30T08:58:56.913426778Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633777062` → **200**

```json
{
  "phone": "+380633777062",
  "audience": "CLIENT",
  "code": "761470",
  "sent_at": "2026-10-30T08:58:55.915304986Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f7a624d1-243b-4f54-a567-baf907d6a411",
  "code": "761470",
  "device_ref": "sandbox-4379"
}
```

```json
{
  "session_id": "948b5593-f249-4641-a2a5-535c9f3a62b2",
  "subject": {
    "type": "CLIENT",
    "id": "b7ee50ab-0f70-4dc5-bbe5-87397d35bd0e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiN2VlNTBhYi0wZjcwLTRkYzUtYmJlNS04NzM5N2QzNWJkMGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNjM2LCJpYXQiOjE3OTMzNTA3MzYsImp0aSI6Ijk4ODhlNzZmLWVjNDgtNGNiYi1iMzcxLTM2MjJkZDI1YWM0MSIsInNpZCI6Ijk0OGI1NTkzLWYyNDktNDY0MS1hMmE1LTUzNWM5ZjNhNjJiMiJ9.ek_wRSGoePIVsPNQdc-rlE4djgMsB1ugXdZNCM1ATAs",
  "access_expires_at": "2026-10-30T09:13:56.161872495Z",
  "refresh_token": "XbUHRPNrbP60mPANJGy4NoCA_hZmOcwAYBna-wP4Ssc",
  "refresh_expires_at": "2026-11-29T08:58:56.161427825Z",
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
  "session_id": "3a191376-3d28-40be-8329-cc20ee60b264",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE2MzcsImlhdCI6MTc5MzM1MDczNywianRpIjoiODg0MDAyYTktYTJhNy00NWVjLTg3NDctMjdjMzAzZTgxYjQ1Iiwic2lkIjoiM2ExOTEzNzYtM2QyOC00MGJlLTgzMjktY2MyMGVlNjBiMjY0In0.K84AyelcU33vEIctBi_NAErkZ2i_mN0b52TbmwFXozI",
  "access_expires_at": "2026-10-30T09:13:57.111495649Z",
  "refresh_token": "R279RJB9HF0jVSlaXndGqaYczgVHy4m3jBLR7mKfrfk",
  "refresh_expires_at": "2026-10-30T20:58:57.111062395Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380633777062` → **200**

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
  "correlation_id": "991deb01-f66e-4c43-a91e-846d50235670"
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
  "session_id": "6c1fe6eb-c5e1-41ae-9a82-9c1d540436a9",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE2MzgsImlhdCI6MTc5MzM1MDczOCwianRpIjoiNzdiNDY4ODgtMjNiNC00YjQwLThkNWUtNTFjZDc2NjljM2NiIiwic2lkIjoiNmMxZmU2ZWItYzVlMS00MWFlLTlhODItOWMxZDU0MDQzNmE5In0.b99_k9le3sI8QdWNSME7D_dj3RZPwx7amoDbxUS55Ho",
  "access_expires_at": "2026-10-30T09:13:58.061992099Z",
  "refresh_token": "K-wC1YuHA4aIDFRKZyJZvTm2hLeozNhhj94i8fV86jU",
  "refresh_expires_at": "2026-10-30T20:58:58.061518865Z",
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
  "changed_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T08:55:38.796841Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "c2986fea-61c1-486b-8a62-2f4a7960334e",
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
  "changed_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T08:58:58.52310535Z"
}
```

## The rider books the airport for 2026-10-30T11:58:57Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600243501",
  "device_ref": "sandbox-24222"
}
```

```json
{
  "challenge_id": "df10ead4-9bd1-48f9-b959-dabb7e4d1cfe",
  "expires_at": "2026-10-30T09:03:58.758453106Z",
  "resend_available_at": "2026-10-30T08:58:59.758453106Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600243501` → **200**

```json
{
  "phone": "+48600243501",
  "audience": "CLIENT",
  "code": "694162",
  "sent_at": "2026-10-30T08:58:58.760594746Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "df10ead4-9bd1-48f9-b959-dabb7e4d1cfe",
  "code": "694162",
  "device_ref": "sandbox-24222"
}
```

```json
{
  "session_id": "726622c9-91f9-4619-9b3c-5ecf454fbe9c",
  "subject": {
    "type": "CLIENT",
    "id": "d296f0f1-02f6-4365-8643-282821cd8077"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMjk2ZjBmMS0wMmY2LTQzNjUtODY0My0yODI4MjFjZDgwNzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNjM5LCJpYXQiOjE3OTMzNTA3MzksImp0aSI6ImUxODAxMWE3LTNjNzUtNGM0YS04YTlkLWJjNTk1NDk3ZDRmMiIsInNpZCI6IjcyNjYyMmM5LTkxZjktNDYxOS05YjNjLTVlY2Y0NTRmYmU5YyJ9.eL61y_Db3M4nhJVnfSsPRILxK4SnOLgZdeiAeIPWsys",
  "access_expires_at": "2026-10-30T09:13:59.005871118Z",
  "refresh_token": "q6QjC-VgFLTcDFzFBcsBiybVd5u4NqbbxS8bUO4XSHw",
  "refresh_expires_at": "2026-11-29T08:58:59.005439978Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "237418b6-1f06-4b84-ac48-2bff3b8b6675",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T11:58:57Z"
}
```

```json
{
  "id": "019ebe63-3ae8-48b5-afa5-e97ec047cf81",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:03:59.234002Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T11:58:57Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "6e267a90-1248-4a50-9dd8-6f49b0c4048a",
  "quote_id": "019ebe63-3ae8-48b5-afa5-e97ec047cf81",
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
  "pickup_at": "2026-10-30T11:58:57Z"
}
```

```json
{
  "id": "aa136ee4-6fb9-4b7a-9a86-216a0633178a",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "d296f0f1-02f6-4365-8643-282821cd8077",
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
  "created_at": "2026-10-30T08:58:59.466422Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T11:58:57Z",
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
  "device_ref": "sandbox-14793"
}
```

```json
{
  "challenge_id": "c4a9025c-d2a3-4b9b-a507-67067ae18aea",
  "expires_at": "2026-10-30T09:03:59.706507733Z",
  "resend_available_at": "2026-10-30T08:59:00.706507733Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "010376",
  "sent_at": "2026-10-30T08:58:59.708678668Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c4a9025c-d2a3-4b9b-a507-67067ae18aea",
  "code": "010376",
  "device_ref": "sandbox-14793"
}
```

```json
{
  "session_id": "dc16b021-fe6d-4d62-8539-660018cd7d88",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTYzOSwiaWF0IjoxNzkzMzUwNzM5LCJqdGkiOiJmY2Y0ZGViNS0wY2RkLTQ0ZWEtYmViMC0wNWI0NGNlNGRhN2YiLCJzaWQiOiJkYzE2YjAyMS1mZTZkLTRkNjItODUzOS02NjAwMThjZDdkODgifQ.8LyJ3oBl3u6QJtCBiUusOBEbVcytlrs0cdcGfqaxBUk",
  "access_expires_at": "2026-10-30T09:13:59.953100421Z",
  "refresh_token": "aX2ZtpP9VAAlDY6QugfFHB0gcJ__FD9JLo8gCXwlYsA",
  "refresh_expires_at": "2026-11-29T08:58:59.952670602Z",
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
  "command_id": "6bdf0ea6-5325-4f00-8ea7-6c58ae0987fd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:59:00Z",
    "sequence": 1793350740391
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "7c7ab488-41c4-4836-b1f6-2690834e168c",
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
  "last_heartbeat_at": "2026-10-30T08:59:00.407897Z",
  "last_location_at": "2026-10-30T08:59:00.407897Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "aa136ee4-6fb9-4b7a-9a86-216a0633178a",
      "short_number": 24,
      "pickup_at": "2026-10-30T11:58:57Z",
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

`POST /api/driver/v1/preorders/aa136ee4-6fb9-4b7a-9a86-216a0633178a/reserve` → **200**

```json
{
  "command_id": "147a7002-a9e8-4c0b-8a17-76b82be86680"
}
```

```json
{
  "id": "f4ee4a94-c89c-441c-8666-f79be2518bc3",
  "state": "RESERVED",
  "order": {
    "order_id": "aa136ee4-6fb9-4b7a-9a86-216a0633178a",
    "short_number": 24,
    "pickup_at": "2026-10-30T11:58:57Z",
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
  "reserved_at": "2026-10-30T08:59:00.868848Z",
  "confirm_from": "2026-10-30T11:28:57Z",
  "confirm_until": "2026-10-30T11:38:57Z",
  "drop_until": "2026-10-30T10:58:57Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "f4ee4a94-c89c-441c-8666-f79be2518bc3",
      "state": "RESERVED",
      "order": {
        "order_id": "aa136ee4-6fb9-4b7a-9a86-216a0633178a",
        "short_number": 24,
        "pickup_at": "2026-10-30T11:58:57Z",
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
      "reserved_at": "2026-10-30T08:59:00.868848Z",
      "confirm_from": "2026-10-30T11:28:57Z",
      "confirm_until": "2026-10-30T11:38:57Z",
      "drop_until": "2026-10-30T10:58:57Z"
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
      "id": "f4ee4a94-c89c-441c-8666-f79be2518bc3",
      "state": "RESERVED",
      "order": {
        "order_id": "aa136ee4-6fb9-4b7a-9a86-216a0633178a",
        "short_number": 24,
        "pickup_at": "2026-10-30T11:58:57Z",
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
      "reserved_at": "2026-10-30T08:59:00.868848Z",
      "confirm_from": "2026-10-30T11:28:57Z",
      "confirm_until": "2026-10-30T11:38:57Z",
      "drop_until": "2026-10-30T10:58:57Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/f4ee4a94-c89c-441c-8666-f79be2518bc3/confirm` → **409**

```json
{
  "command_id": "dc2a62e1-0730-410a-a24a-f32c6ac277e1"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/f4ee4a94-c89c-441c-8666-f79be2518bc3/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "54297670-0e1c-4934-b0df-ed8981f92972"
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
  "session_id": "88995833-bcdb-4e1a-8ed8-abab5a967517",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE2NDIsImlhdCI6MTc5MzM1MDc0MiwianRpIjoiODE3ZjUzYzgtMjE3Mi00Y2FkLWI2NzgtZWFkMTgyNWNkZjQyIiwic2lkIjoiODg5OTU4MzMtYmNkYi00ZTFhLThlZDgtYWJhYjVhOTY3NTE3In0.9AHTsWXkEqTTgE7H78D3IrqYgF_OwSCmExHx_urZB4g",
  "access_expires_at": "2026-10-30T09:14:02.019696057Z",
  "refresh_token": "t6mQMyLKEDXBs8W3Qs-ZmonT8fp9jxynatbi0MjlbLY",
  "refresh_expires_at": "2026-10-30T20:59:02.019266718Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/aa136ee4-6fb9-4b7a-9a86-216a0633178a` → **200**

```json
{
  "id": "aa136ee4-6fb9-4b7a-9a86-216a0633178a",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "d296f0f1-02f6-4365-8643-282821cd8077",
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
  "created_at": "2026-10-30T08:58:59.466422Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T11:58:57Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "f4ee4a94-c89c-441c-8666-f79be2518bc3",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T08:59:00.868848Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/aa136ee4-6fb9-4b7a-9a86-216a0633178a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T08:58:59.467408Z",
      "actor": {
        "type": "CLIENT",
        "id": "d296f0f1-02f6-4365-8643-282821cd8077",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "aa136ee4-6fb9-4b7a-9a86-216a0633178a",
        "preorder": true,
        "quote_id": "019ebe63-3ae8-48b5-afa5-e97ec047cf81",
        "pickup_at": "2026-10-30T11:58:57Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "16d2d89b-87ce-491c-8504-79d3867df553"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T08:59:00.869778Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "aa136ee4-6fb9-4b7a-9a86-216a0633178a",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "f4ee4a94-c89c-441c-8666-f79be2518bc3"
      },
      "correlation_id": "1c73c6f2-7a95-4a15-b889-0b39f607beeb"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order aa136ee4-6fb9-4b7a-9a86-216a0633178a, reservation f4ee4a94-c89c-441c-8666-f79be2518bc3.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-4979"
}
```

```json
{
  "challenge_id": "1cf25b75-2ed0-40b3-b62d-eccd05de186a",
  "expires_at": "2026-10-30T09:04:02.700181947Z",
  "resend_available_at": "2026-10-30T08:59:03.700181947Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "887462",
  "sent_at": "2026-10-30T08:59:02.702278534Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1cf25b75-2ed0-40b3-b62d-eccd05de186a",
  "code": "887462",
  "device_ref": "sandbox-4979"
}
```

```json
{
  "session_id": "bfa20d87-47e5-458f-9e78-d689dd15f706",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTY0MiwiaWF0IjoxNzkzMzUwNzQyLCJqdGkiOiJiYjBjYmU4ZC03YjRjLTRkMTAtYjkzNy0zY2EwMGE2ZmUxODAiLCJzaWQiOiJiZmEyMGQ4Ny00N2U1LTQ1OGYtOWU3OC1kNjg5ZGQxNWY3MDYifQ.XYj8R9fIkf6KRteZq10PEjyIxDrVhg80l47r___r8kQ",
  "access_expires_at": "2026-10-30T09:14:02.940169526Z",
  "refresh_token": "GQVWHm-dvD177iL0Tcayk6qa-mOZ2SjlKLTeNO7E6ic",
  "refresh_expires_at": "2026-11-29T08:59:02.9397537Z",
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
  "command_id": "5ec369a9-c3ff-406e-a0d2-e214b436e64d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:59:03Z",
    "sequence": 1793350743372
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9525fffa-9ac6-483c-b0a3-af66260502e6",
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
  "last_heartbeat_at": "2026-10-30T08:59:03.388633Z",
  "last_location_at": "2026-10-30T08:59:03.388633Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671224884",
  "device_ref": "sandbox-5846"
}
```

```json
{
  "challenge_id": "78ca236e-99f9-49f5-9830-1a7394821c6d",
  "expires_at": "2026-10-30T09:04:03.606903527Z",
  "resend_available_at": "2026-10-30T08:59:04.606903527Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671224884` → **200**

```json
{
  "phone": "+380671224884",
  "audience": "CLIENT",
  "code": "050742",
  "sent_at": "2026-10-30T08:59:03.608834011Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "78ca236e-99f9-49f5-9830-1a7394821c6d",
  "code": "050742",
  "device_ref": "sandbox-5846"
}
```

```json
{
  "session_id": "42b26929-1fe7-49cf-8b46-ec3e92c4e1a4",
  "subject": {
    "type": "CLIENT",
    "id": "786ebddf-330e-4fd2-ae61-92a831221166"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ODZlYmRkZi0zMzBlLTRmZDItYWU2MS05MmE4MzEyMjExNjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNjQzLCJpYXQiOjE3OTMzNTA3NDMsImp0aSI6ImNkZWYzMGYyLTA3NDYtNDUyZC1hZjc5LWI1YjNiMjM2YTI1ZSIsInNpZCI6IjQyYjI2OTI5LTFmZTctNDljZi04YjQ2LWVjM2U5MmM0ZTFhNCJ9.Q2CvA70Gsvmj1kackNMcx5Udexp_Qg_bN3EVQS8kME0",
  "access_expires_at": "2026-10-30T09:14:03.858857454Z",
  "refresh_token": "Ma-EeBUhaSxoJ9IjzOr0USC30qh9zwbvJgIhAVDtias",
  "refresh_expires_at": "2026-11-29T08:59:03.858255091Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d4611ad1-f5a1-4b91-b9a4-969ce73a0314",
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
  "id": "16ac02c4-015f-485a-b54f-d1bb447e80f0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:04:04.085626Z",
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
  "command_id": "9e11ad71-e8a5-47d7-b4f2-b8b0c44f7668",
  "quote_id": "16ac02c4-015f-485a-b54f-d1bb447e80f0",
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
  "id": "0c2d089d-4b3a-4eb8-96c4-7463bb4908ae",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "786ebddf-330e-4fd2-ae61-92a831221166",
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
  "created_at": "2026-10-30T08:59:04.321645Z",
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
    "id": "8530dcf5-4af3-4f35-8567-127acc27e7da",
    "order_id": "0c2d089d-4b3a-4eb8-96c4-7463bb4908ae",
    "expires_at": "2026-10-30T08:59:19.324474Z",
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

`POST /api/driver/v1/offers/8530dcf5-4af3-4f35-8567-127acc27e7da/accept` → **200**

```json
{
  "command_id": "7a25f0d8-0d45-491f-bc61-1642ba86f187"
}
```

```json
{
  "id": "d831becc-69c4-4e11-ab6b-94eaed4a6b05",
  "order_id": "0c2d089d-4b3a-4eb8-96c4-7463bb4908ae",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ea23bfff-0c4f-4a4c-9c1e-b5f1e8b62ebc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ea23bfff-0c4f-4a4c-9c1e-b5f1e8b62ebc",
  "order_id": "0c2d089d-4b3a-4eb8-96c4-7463bb4908ae",
  "assignment_id": "d831becc-69c4-4e11-ab6b-94eaed4a6b05",
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

`POST /api/driver/v1/work-sessions/9525fffa-9ac6-483c-b0a3-af66260502e6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:59:05Z",
    "sequence": 1793350745229
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9525fffa-9ac6-483c-b0a3-af66260502e6",
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
  "last_heartbeat_at": "2026-10-30T08:59:05.245926Z",
  "last_location_at": "2026-10-30T08:59:05.245926Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ea23bfff-0c4f-4a4c-9c1e-b5f1e8b62ebc",
  "order_id": "0c2d089d-4b3a-4eb8-96c4-7463bb4908ae",
  "assignment_id": "d831becc-69c4-4e11-ab6b-94eaed4a6b05",
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

`POST /api/driver/v1/trips/ea23bfff-0c4f-4a4c-9c1e-b5f1e8b62ebc/arrive` → **200**

```json
{
  "command_id": "c9d6d05a-4975-4816-8a3e-aa00cd49b675",
  "expected_version": 0
}
```

```json
{
  "id": "ea23bfff-0c4f-4a4c-9c1e-b5f1e8b62ebc",
  "order_id": "0c2d089d-4b3a-4eb8-96c4-7463bb4908ae",
  "assignment_id": "d831becc-69c4-4e11-ab6b-94eaed4a6b05",
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
  "arrived_at": "2026-10-30T08:59:05.696489Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ea23bfff-0c4f-4a4c-9c1e-b5f1e8b62ebc/start` → **200**

```json
{
  "command_id": "dd10473d-3290-4f4b-b44e-660e703e6cf4",
  "expected_version": 1
}
```

```json
{
  "id": "ea23bfff-0c4f-4a4c-9c1e-b5f1e8b62ebc",
  "order_id": "0c2d089d-4b3a-4eb8-96c4-7463bb4908ae",
  "assignment_id": "d831becc-69c4-4e11-ab6b-94eaed4a6b05",
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
  "arrived_at": "2026-10-30T08:59:05.696489Z",
  "started_at": "2026-10-30T08:59:05.924672Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/9525fffa-9ac6-483c-b0a3-af66260502e6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:59:06Z",
    "sequence": 1793350746145
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9525fffa-9ac6-483c-b0a3-af66260502e6",
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
  "last_heartbeat_at": "2026-10-30T08:59:06.161335Z",
  "last_location_at": "2026-10-30T08:59:06.161335Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/ea23bfff-0c4f-4a4c-9c1e-b5f1e8b62ebc/complete` → **200**

```json
{
  "command_id": "a1595523-550e-4577-b064-df5796409cfb",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:59:06Z",
  "cash_received": true
}
```

```json
{
  "id": "ea23bfff-0c4f-4a4c-9c1e-b5f1e8b62ebc",
  "order_id": "0c2d089d-4b3a-4eb8-96c4-7463bb4908ae",
  "assignment_id": "d831becc-69c4-4e11-ab6b-94eaed4a6b05",
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
  "arrived_at": "2026-10-30T08:59:05.696489Z",
  "started_at": "2026-10-30T08:59:05.924672Z",
  "completed_at": "2026-10-30T08:59:06.392694Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/0c2d089d-4b3a-4eb8-96c4-7463bb4908ae/rating` → **200**

```json
{
  "command_id": "413b2e8e-1b4a-4c83-aa9a-1e6be70639b5",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "0c2d089d-4b3a-4eb8-96c4-7463bb4908ae",
  "score": 5,
  "created_at": "2026-10-30T08:59:06.632127655Z"
}
```

`POST /api/driver/v1/orders/0c2d089d-4b3a-4eb8-96c4-7463bb4908ae/rating` → **200**

```json
{
  "command_id": "d01e5bcb-d3d4-4fa8-af57-0de302f1b845",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "0c2d089d-4b3a-4eb8-96c4-7463bb4908ae",
  "score": 4,
  "created_at": "2026-10-30T08:59:06.859383734Z"
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
  "session_id": "b323dec2-0733-42d8-bffa-28db1ffaa572",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE2NDcsImlhdCI6MTc5MzM1MDc0NywianRpIjoiNGFhYWIzNDEtNDViOC00NWQ3LTljNjktYTk0N2Y0MjMwZjE3Iiwic2lkIjoiYjMyM2RlYzItMDczMy00MmQ4LWJmZmEtMjhkYjFmZmFhNTcyIn0.mOCk0fcjX1drv7IKNXCV004HtUfi2imvyQ5D98dAjL0",
  "access_expires_at": "2026-10-30T09:14:07.594583934Z",
  "refresh_token": "-58fgXRlACak6HG0FDDaN7orpxWXuXHukZ8VAVcOQbk",
  "refresh_expires_at": "2026-10-30T20:59:07.594138983Z",
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
  "session_id": "9c4b25cf-c576-412c-b4bf-d6a2d70ec08b",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE2NDgsImlhdCI6MTc5MzM1MDc0OCwianRpIjoiODZkNzhiOTktODVjNC00MjRlLTg1YzktYTRlNWVhYjk3MzE0Iiwic2lkIjoiOWM0YjI1Y2YtYzU3Ni00MTJjLWI0YmYtZDZhMmQ3MGVjMDhiIn0.ZMEoKWtqPn5ywnLAwuYvR12PxMaathBiM6Y7Q_WAasI",
  "access_expires_at": "2026-10-30T09:14:08.072308807Z",
  "refresh_token": "2LSVrtfijcC9gjEErDgFuV5fS2hUaN0-_gJ0bUgntOQ",
  "refresh_expires_at": "2026-10-30T20:59:08.071909604Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/0c2d089d-4b3a-4eb8-96c4-7463bb4908ae/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "0c2d089d-4b3a-4eb8-96c4-7463bb4908ae",
      "author_type": "RIDER",
      "author_id": "786ebddf-330e-4fd2-ae61-92a831221166",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T08:59:06.632128Z"
    },
    {
      "order_id": "0c2d089d-4b3a-4eb8-96c4-7463bb4908ae",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "786ebddf-330e-4fd2-ae61-92a831221166",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T08:59:06.859384Z"
    }
  ]
}
```

Done: ratings for order 0c2d089d-4b3a-4eb8-96c4-7463bb4908ae.

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
  "session_id": "d41f9574-0ac6-46bb-9fe7-4b5055cde443",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE2NDgsImlhdCI6MTc5MzM1MDc0OCwianRpIjoiZTVjMDhmNjktOTUwYS00ODU5LWFhMzgtZWQ5MTRlNGY5NGI5Iiwic2lkIjoiZDQxZjk1NzQtMGFjNi00NmJiLTlmZTctNGI1MDU1Y2RlNDQzIn0.kjEPByC4i62GTP4-h4uknJP2PDluvB3y6zISqPU0pu8",
  "access_expires_at": "2026-10-30T09:14:08.802212217Z",
  "refresh_token": "tK4ABztz-Sz2wPTzTRfEL9o1CNMslvFczbwEzkvc2RY",
  "refresh_expires_at": "2026-10-30T20:59:08.801816189Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "b6558c41-4bd7-4a0b-9818-4c5f4f91d1a0",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "d44edc18-846b-40ac-9350-9cb1de36d12c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:59:09.030211Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d44edc18-846b-40ac-9350-9cb1de36d12c` → **200**

```json
{
  "id": "d44edc18-846b-40ac-9350-9cb1de36d12c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:59:09.030211Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d44edc18-846b-40ac-9350-9cb1de36d12c` → **200**

```json
{
  "id": "d44edc18-846b-40ac-9350-9cb1de36d12c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:59:09.030211Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d44edc18-846b-40ac-9350-9cb1de36d12c` → **200**

```json
{
  "id": "d44edc18-846b-40ac-9350-9cb1de36d12c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:59:09.030211Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d44edc18-846b-40ac-9350-9cb1de36d12c` → **200**

```json
{
  "id": "d44edc18-846b-40ac-9350-9cb1de36d12c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T08:59:09.030211Z",
  "ready_at": "2026-10-30T08:59:12.509633Z",
  "expires_at": "2026-10-31T08:59:12.509633Z"
}
```

`GET /api/admin/v1/reports/exports/d44edc18-846b-40ac-9350-9cb1de36d12c/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "ef0e626e-1fa9-46c2-a7a4-ecf112bc752d",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "8bd36512-35ba-4de2-af2e-1f1e3d8530bf",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:59:13.226369Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8bd36512-35ba-4de2-af2e-1f1e3d8530bf` → **200**

```json
{
  "id": "8bd36512-35ba-4de2-af2e-1f1e3d8530bf",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:59:13.226369Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8bd36512-35ba-4de2-af2e-1f1e3d8530bf` → **200**

```json
{
  "id": "8bd36512-35ba-4de2-af2e-1f1e3d8530bf",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:59:13.226369Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8bd36512-35ba-4de2-af2e-1f1e3d8530bf` → **200**

```json
{
  "id": "8bd36512-35ba-4de2-af2e-1f1e3d8530bf",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:59:13.226369Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8bd36512-35ba-4de2-af2e-1f1e3d8530bf` → **200**

```json
{
  "id": "8bd36512-35ba-4de2-af2e-1f1e3d8530bf",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:59:13.226369Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8bd36512-35ba-4de2-af2e-1f1e3d8530bf` → **200**

```json
{
  "id": "8bd36512-35ba-4de2-af2e-1f1e3d8530bf",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T08:59:13.226369Z",
  "ready_at": "2026-10-30T08:59:17.515619Z",
  "expires_at": "2026-10-31T08:59:17.515619Z"
}
```

`GET /api/admin/v1/reports/exports/8bd36512-35ba-4de2-af2e-1f1e3d8530bf/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/9e7d3b5a-390a-433e-9f72-a9a4d8dea2a7` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/9e7d3b5a-390a-433e-9f72-a9a4d8dea2a7",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8d09b2c0-fc75-443f-8cdc-218e8fdaf77a"
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
  "device_ref": "sandbox-25796"
}
```

```json
{
  "challenge_id": "257d781d-5244-43d2-82de-51ba3db6249f",
  "expires_at": "2026-10-30T09:04:18.855354915Z",
  "resend_available_at": "2026-10-30T08:59:19.855354915Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "505395",
  "sent_at": "2026-10-30T08:59:18.858148547Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "257d781d-5244-43d2-82de-51ba3db6249f",
  "code": "505395",
  "device_ref": "sandbox-25796"
}
```

```json
{
  "session_id": "27815abe-6313-4beb-a974-687ab3f98c88",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTY1OSwiaWF0IjoxNzkzMzUwNzU5LCJqdGkiOiIyNmM2MjUwYS00Y2FhLTQ0Y2EtOWJlMC04YWQ5YWJhNTU2YWIiLCJzaWQiOiIyNzgxNWFiZS02MzEzLTRiZWItYTk3NC02ODdhYjNmOThjODgifQ.WMMCjpptwY7Ra7WYwlUmXv8CzyWwbt-JOQYnEalLR5A",
  "access_expires_at": "2026-10-30T09:14:19.102659182Z",
  "refresh_token": "OYVkbGwS4SuPsdEaMWW_Gn1c__SOu1AcbZOLowb-ncE",
  "refresh_expires_at": "2026-11-29T08:59:19.102233941Z",
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
  "command_id": "a814f504-c966-48f4-843e-6f14f6c9d190",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:59:19Z",
    "sequence": 1793350759765
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "aced4e1b-eb9f-4fe9-b82f-3bb9daa2d22f",
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
  "last_heartbeat_at": "2026-10-30T08:59:19.781164Z",
  "last_location_at": "2026-10-30T08:59:19.781164Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "4d968e68-0d46-4fc5-8b94-c3206f29d9b6",
  "points": [
    {
      "sequence": 1793350762704,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T08:58:22Z"
    },
    {
      "sequence": 1793350762705,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T08:59:22Z"
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
  "session_id": "8826da07-b653-4f9c-b0e0-8a366805989e",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE2NjIsImlhdCI6MTc5MzM1MDc2MiwianRpIjoiZjNhYzkwN2EtMTg4ZS00YzM4LTk2MTEtZmJhM2RkY2Q0ODYxIiwic2lkIjoiODgyNmRhMDctYjY1My00ZjljLWIwZTAtOGEzNjY4MDU5ODllIn0.OxopLsm-AORWvl2AXQtshvWnG5E5wK2qa3eyJimlkyg",
  "access_expires_at": "2026-10-30T09:14:22.546728813Z",
  "refresh_token": "F4UVSkIJo1CSQmrGOiz0GnzM_IWUO4jF_yjbGN09yX0",
  "refresh_expires_at": "2026-10-30T20:59:22.546231303Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "a8a194fc-5ee3-4ed6-b787-ca5ca96f1673",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T08:59:22Z",
        "track_point_id": "3fa7a2ae-9231-4f36-a236-18d20ca77271",
        "work_session_id": "aced4e1b-eb9f-4fe9-b82f-3bb9daa2d22f"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T08:59:22Z",
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

`POST /api/admin/v1/driver-risk-flags/a8a194fc-5ee3-4ed6-b787-ca5ca96f1673/confirm` → **200**

```json
{
  "command_id": "521ad8b6-085b-44f2-8462-b522a9cd648c",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "a8a194fc-5ee3-4ed6-b787-ca5ca96f1673",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T08:59:22Z",
    "track_point_id": "3fa7a2ae-9231-4f36-a236-18d20ca77271",
    "work_session_id": "aced4e1b-eb9f-4fe9-b82f-3bb9daa2d22f"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T08:59:22Z",
  "reason": null,
  "reviewed_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
  "reviewed_at": "2026-10-30T08:59:23.261442Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/a8a194fc-5ee3-4ed6-b787-ca5ca96f1673/dismiss` → **409**

```json
{
  "command_id": "fd8eeb99-fc57-4b5a-827e-2f4cf8be1eb0",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/a8a194fc-5ee3-4ed6-b787-ca5ca96f1673/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "89252ac7-caaf-4ab8-93b1-bc3a396489be"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "f0086a51-07c3-4d1f-bf6a-9261cd6a10cf",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "afb9ee1c-d69e-4f83-bd90-b716f6db0ebb",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
  "raised_at": "2026-10-30T08:59:23.729448Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/afb9ee1c-d69e-4f83-bd90-b716f6db0ebb/dismiss` → **200**

```json
{
  "command_id": "a3a6cdf0-c5bf-4697-9538-c66b1b922667",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "afb9ee1c-d69e-4f83-bd90-b716f6db0ebb",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
  "raised_at": "2026-10-30T08:59:23.729448Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
  "reviewed_at": "2026-10-30T08:59:23.966308Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "552b6adb-9b6c-48cb-80a6-69a26b477610",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "a8a194fc-5ee3-4ed6-b787-ca5ca96f1673"
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
      "actor_id": "31a00219-70fd-4586-82bb-ecb321d1f902",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T08:59:24.203581Z"
    }
  ]
}
```

Done: flag a8a194fc-5ee3-4ed6-b787-ca5ca96f1673 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "560a943c-a96b-4904-9d2f-ccac21d54870",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE2NjQsImlhdCI6MTc5MzM1MDc2NCwianRpIjoiY2Q1YmRmOGEtNTQwMy00MmEyLWEwYTYtYjkyNTZhZDk0MWEzIiwic2lkIjoiNTYwYTk0M2MtYTk2Yi00OTA0LTlkMmYtY2NhYzIxZDU0ODcwIn0.svlFhXW7qw0_3wYHLya3UeWjTGGUdMDe6irJntMVT4g",
  "access_expires_at": "2026-10-30T09:14:24.908751203Z",
  "refresh_token": "6gM5RWcyTq0XZ3GnOmlaaDMQ0eJBppHswMbRTi1-h_Q",
  "refresh_expires_at": "2026-10-30T20:59:24.908275365Z",
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
      "actor_id": "31a00219-70fd-4586-82bb-ecb321d1f902",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T08:59:24.203581Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "393e8a97-0896-4721-a892-fb137619b236",
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
  "session_id": "aced4e1b-eb9f-4fe9-b82f-3bb9daa2d22f",
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
  "last_heartbeat_at": "2026-10-30T08:59:19.781164Z",
  "last_location_at": "2026-10-30T08:59:19.781164Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aced4e1b-eb9f-4fe9-b82f-3bb9daa2d22f/close` → **200**

```json
{
  "command_id": "d9647612-fd3e-483e-83a0-bb8aa196def6",
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
  "session_id": "3f54e80a-e2c5-411d-aec8-a6c4799e5365",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE2NjYsImlhdCI6MTc5MzM1MDc2NiwianRpIjoiNjBjYjAyZTItMGU1OC00MGZjLWE0OGItZjM5OWM3NTQxYTU1Iiwic2lkIjoiM2Y1NGU4MGEtZTJjNS00MTFkLWFlYzgtYTZjNDc5OWU1MzY1In0.UTJq9lfAv217iw19LFr-xPkcxX8lhGl7qoPT2tCpBKM",
  "access_expires_at": "2026-10-30T09:14:26.301948769Z",
  "refresh_token": "keN5zFl7EZT-UPnQHH1AjkUCks_dk4VX2RGSzMUuJz8",
  "refresh_expires_at": "2026-10-30T20:59:26.301556487Z",
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
  "command_id": "f54322ad-24eb-4cea-a12b-6518a757463a",
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
  "changed_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T08:59:26.751003Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "f54322ad-24eb-4cea-a12b-6518a757463a",
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
  "changed_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T08:59:26.751003Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48762067919",
  "device_ref": "sandbox-914"
}
```

```json
{
  "challenge_id": "be91a975-4e06-4302-a36e-6670e7bdd967",
  "expires_at": "2026-10-30T09:04:27.201487578Z",
  "resend_available_at": "2026-10-30T08:59:28.201487578Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48762067919` → **200**

```json
{
  "phone": "+48762067919",
  "audience": "CLIENT",
  "code": "091585",
  "sent_at": "2026-10-30T08:59:27.203861901Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "be91a975-4e06-4302-a36e-6670e7bdd967",
  "code": "091585",
  "device_ref": "sandbox-914"
}
```

```json
{
  "session_id": "fb27dbb8-31ff-44e2-ad5e-aae3e6c63eaa",
  "subject": {
    "type": "CLIENT",
    "id": "60de0143-93ee-4e29-870c-9a906e2205f3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MGRlMDE0My05M2VlLTRlMjktODcwYy05YTkwNmUyMjA1ZjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNjY3LCJpYXQiOjE3OTMzNTA3NjcsImp0aSI6ImIyMDVmOGUzLWQ3ZGUtNDcyYS1hMTAxLThlYjhhMzQ3YjZlNyIsInNpZCI6ImZiMjdkYmI4LTMxZmYtNDRlMi1hZDVlLWFhZTNlNmM2M2VhYSJ9.0Jsll5B8iIFbz8c5V1oLbAVsql0DCAEWe5AbzDzdR9c",
  "access_expires_at": "2026-10-30T09:14:27.443336584Z",
  "refresh_token": "2SjSRNYdgjtfwy1Yv7fVWS5QdmhQ_8kBwSY0S4AvyX4",
  "refresh_expires_at": "2026-11-29T08:59:27.442981318Z",
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
  "correlation_id": "3d31dd8e-b46d-4312-9fac-2b28e730faf8"
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
  "device_ref": "sandbox-4183"
}
```

```json
{
  "challenge_id": "80ae4f6e-6b32-4c4e-9444-2b2fde8700b5",
  "expires_at": "2026-10-30T09:04:28.104861372Z",
  "resend_available_at": "2026-10-30T08:59:29.104861372Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "542725",
  "sent_at": "2026-10-30T08:59:28.107164723Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "80ae4f6e-6b32-4c4e-9444-2b2fde8700b5",
  "code": "542725",
  "device_ref": "sandbox-4183"
}
```

```json
{
  "session_id": "9798c4eb-7609-439a-be95-0a0161b985b7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTY2OCwiaWF0IjoxNzkzMzUwNzY4LCJqdGkiOiI2NzBjZmRkYy1iNzE5LTQ0MTQtOWRlOC1hMzdmMmI5MTNiNWEiLCJzaWQiOiI5Nzk4YzRlYi03NjA5LTQzOWEtYmU5NS0wYTAxNjFiOTg1YjcifQ._RS1gSv_gRoPuiHr0v-BR17RR745Xi3EjJD7nk5Rfzc",
  "access_expires_at": "2026-10-30T09:14:28.354751977Z",
  "refresh_token": "MK-I4s_YzCcngn4Vte5AKsIzHVQR4FdSPhjXgisTKuI",
  "refresh_expires_at": "2026-11-29T08:59:28.354302218Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "7c7ab488-41c4-4836-b1f6-2690834e168c",
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
  "last_heartbeat_at": "2026-10-30T08:59:00.407897Z",
  "last_location_at": "2026-10-30T08:59:00.407897Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7c7ab488-41c4-4836-b1f6-2690834e168c/handover` → **200**

```json
{
  "command_id": "45db4ea0-6084-4182-ac41-c41923fccd78",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "7c7ab488-41c4-4836-b1f6-2690834e168c",
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
  "last_heartbeat_at": "2026-10-30T08:59:00.407897Z",
  "last_location_at": "2026-10-30T08:59:00.407897Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7c7ab488-41c4-4836-b1f6-2690834e168c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:59:29Z",
    "sequence": 1793350769252
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "7c7ab488-41c4-4836-b1f6-2690834e168c",
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
  "last_heartbeat_at": "2026-10-30T08:59:29.040596Z",
  "last_location_at": "2026-10-30T08:59:29.040596Z",
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
  "session_id": "7c7ab488-41c4-4836-b1f6-2690834e168c",
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
  "last_heartbeat_at": "2026-10-30T08:59:29.040596Z",
  "last_location_at": "2026-10-30T08:59:29.040596Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7c7ab488-41c4-4836-b1f6-2690834e168c/close` → **200**

```json
{
  "command_id": "73147250-3af9-4312-8a76-24450d93d3de",
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
  "correlation_id": "49e3734c-eaeb-484c-b807-a460c4f5aa2d"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677335453",
  "device_ref": "sandbox-31889"
}
```

```json
{
  "challenge_id": "4e8d5051-ab89-4826-a4c1-6d2be3a44516",
  "expires_at": "2026-10-30T09:04:30.18742162Z",
  "resend_available_at": "2026-10-30T08:59:31.18742162Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677335453` → **200**

```json
{
  "phone": "+380677335453",
  "audience": "CLIENT",
  "code": "256304",
  "sent_at": "2026-10-30T08:59:30.189274717Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4e8d5051-ab89-4826-a4c1-6d2be3a44516",
  "code": "256304",
  "device_ref": "sandbox-31889"
}
```

```json
{
  "session_id": "6edcbde0-8d9d-48b4-a1a3-3c37c324a8b6",
  "subject": {
    "type": "CLIENT",
    "id": "33039e7b-3808-48a4-84d7-5ae00806b453"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMzAzOWU3Yi0zODA4LTQ4YTQtODRkNy01YWUwMDgwNmI0NTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNjcwLCJpYXQiOjE3OTMzNTA3NzAsImp0aSI6IjllNzUwODU0LTU5ODktNGQwOS1iMWM5LTQzN2E4NTk1OWExYiIsInNpZCI6IjZlZGNiZGUwLThkOWQtNDhiNC1hMWEzLTNjMzdjMzI0YThiNiJ9.LsHHbPQhavMr9EqUYPEoSeq3cpKYgH-GmzacxjG6zFI",
  "access_expires_at": "2026-10-30T09:14:30.430818571Z",
  "refresh_token": "aZ02nh8CgOqIlPvrkqKv3O-iKKI91pym4hHWwZNNav0",
  "refresh_expires_at": "2026-11-29T08:59:30.430376114Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "aec4fb78-43e1-4b7d-8d5e-bd83aaa9ac30",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "5ab8cfa5-0616-45d3-9c2e-4b09f3a66f37",
  "upload_path": "/api/rider/v1/uploads/5ab8cfa5-0616-45d3-9c2e-4b09f3a66f37",
  "expires_at": "2026-10-30T09:14:30.66452432Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/5ab8cfa5-0616-45d3-9c2e-4b09f3a66f37` → **200**

```json
{
  "file_id": "5ab8cfa5-0616-45d3-9c2e-4b09f3a66f37",
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
  "command_id": "e8dc1aba-18f9-4293-b80c-f99054202064",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "0c6adc33-b5e4-42d5-bdb4-893a760af0be",
  "upload_path": "/api/rider/v1/uploads/0c6adc33-b5e4-42d5-bdb4-893a760af0be",
  "expires_at": "2026-10-30T09:14:30.929579111Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/0c6adc33-b5e4-42d5-bdb4-893a760af0be` → **200**

```json
{
  "file_id": "0c6adc33-b5e4-42d5-bdb4-893a760af0be",
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
  "command_id": "0ec35717-9ac9-46bd-a76e-d34a8daaf769",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "c8c9aa92-7c30-4035-a051-7015960ff75c",
  "upload_path": "/api/rider/v1/uploads/c8c9aa92-7c30-4035-a051-7015960ff75c",
  "expires_at": "2026-10-30T09:14:31.177266135Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/c8c9aa92-7c30-4035-a051-7015960ff75c` → **200**

```json
{
  "file_id": "c8c9aa92-7c30-4035-a051-7015960ff75c",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "2b12274e-a8f7-480c-a007-4ba29669af26",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "c8c9aa92-7c30-4035-a051-7015960ff75c"
  ]
}
```

```json
{
  "id": "294aea60-b5c3-4ba3-9a9a-fc7ceb9d9007",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "33039e7b-3808-48a4-84d7-5ae00806b453",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T08:59:31.434414Z",
  "updated_at": "2026-10-30T08:59:31.434414Z",
  "respond_by": "2026-10-30T12:59:31.434414Z",
  "messages": [
    {
      "id": "9b681198-8b9c-4625-b8ab-a5e1db02bd37",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "33039e7b-3808-48a4-84d7-5ae00806b453",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T08:59:31.435312Z",
      "attachments": [
        {
          "file_id": "c8c9aa92-7c30-4035-a051-7015960ff75c",
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
  "session_id": "b6166700-67cc-450a-9d6e-505dd7d38d29",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE2NzEsImlhdCI6MTc5MzM1MDc3MSwianRpIjoiN2E0NTY3OWQtM2Y5NC00MjdkLTg0NDctNWQ4YTRmODBjMzFkIiwic2lkIjoiYjYxNjY3MDAtNjdjYy00NTBhLTlkNmUtNTA1ZGQ3ZDM4ZDI5In0.HZ1p3h8yVXS3gKvM6oqOnP4aoO1AFpcSF61f2ARWPPI",
  "access_expires_at": "2026-10-30T09:14:31.934086606Z",
  "refresh_token": "RySSJt43Epv2NoHSATtb-YCBaWWqOjknXqMPIR9UPOM",
  "refresh_expires_at": "2026-10-30T20:59:31.933700253Z",
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
  "session_id": "df00e566-d018-4439-9132-e9d4120e0908",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE2NzIsImlhdCI6MTc5MzM1MDc3MiwianRpIjoiZDM2MDg1MTgtM2MxNS00NzJmLWI3NGQtYjA1Nzg0M2U4NjEwIiwic2lkIjoiZGYwMGU1NjYtZDAxOC00NDM5LTkxMzItZTlkNDEyMGUwOTA4In0.ezv9IoZAnQNOf-DibRC7K-WYDek0p8-OZRILtAmd754",
  "access_expires_at": "2026-10-30T09:14:32.410630643Z",
  "refresh_token": "oJhn6b0gqtaMknJUdBIyy2kYw7_J9EADErfmmUPbUlQ",
  "refresh_expires_at": "2026-10-30T20:59:32.410220243Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/294aea60-b5c3-4ba3-9a9a-fc7ceb9d9007/attachments/c8c9aa92-7c30-4035-a051-7015960ff75c` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "9cf42886-12df-4edd-8ef6-f81d6ba9f09d",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "54781bd7-fd25-49ed-bbd8-16a24a9dafd6",
  "upload_path": "/api/operator/v1/uploads/54781bd7-fd25-49ed-bbd8-16a24a9dafd6",
  "expires_at": "2026-10-30T09:14:32.658960562Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/54781bd7-fd25-49ed-bbd8-16a24a9dafd6` → **200**

```json
{
  "file_id": "54781bd7-fd25-49ed-bbd8-16a24a9dafd6",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/294aea60-b5c3-4ba3-9a9a-fc7ceb9d9007` → **200**

```json
{
  "id": "294aea60-b5c3-4ba3-9a9a-fc7ceb9d9007",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "33039e7b-3808-48a4-84d7-5ae00806b453",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T08:59:31.434414Z",
  "updated_at": "2026-10-30T08:59:31.434414Z",
  "respond_by": "2026-10-30T12:59:31.434414Z",
  "messages": [
    {
      "id": "9b681198-8b9c-4625-b8ab-a5e1db02bd37",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "33039e7b-3808-48a4-84d7-5ae00806b453",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T08:59:31.435312Z",
      "attachments": [
        {
          "file_id": "c8c9aa92-7c30-4035-a051-7015960ff75c",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/294aea60-b5c3-4ba3-9a9a-fc7ceb9d9007/comments` → **200**

```json
{
  "command_id": "8acc70e2-dd94-4936-95b6-2e1c86a73f23",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "54781bd7-fd25-49ed-bbd8-16a24a9dafd6"
  ]
}
```

```json
{
  "id": "294aea60-b5c3-4ba3-9a9a-fc7ceb9d9007",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "33039e7b-3808-48a4-84d7-5ae00806b453",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T08:59:31.434414Z",
  "updated_at": "2026-10-30T08:59:33.149795Z",
  "respond_by": "2026-10-30T12:59:31.434414Z",
  "messages": [
    {
      "id": "9b681198-8b9c-4625-b8ab-a5e1db02bd37",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "33039e7b-3808-48a4-84d7-5ae00806b453",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T08:59:31.435312Z",
      "attachments": [
        {
          "file_id": "c8c9aa92-7c30-4035-a051-7015960ff75c",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "f5a03de1-e473-43e6-bf99-cf849cdc0e28",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "31a00219-70fd-4586-82bb-ecb321d1f902",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T08:59:33.149446Z",
      "attachments": [
        {
          "file_id": "54781bd7-fd25-49ed-bbd8-16a24a9dafd6",
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

`GET /api/rider/v1/support/cases/294aea60-b5c3-4ba3-9a9a-fc7ceb9d9007` → **200**

```json
{
  "id": "294aea60-b5c3-4ba3-9a9a-fc7ceb9d9007",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "33039e7b-3808-48a4-84d7-5ae00806b453",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T08:59:31.434414Z",
  "updated_at": "2026-10-30T08:59:33.149795Z",
  "respond_by": "2026-10-30T12:59:31.434414Z",
  "messages": [
    {
      "id": "9b681198-8b9c-4625-b8ab-a5e1db02bd37",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "33039e7b-3808-48a4-84d7-5ae00806b453",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T08:59:31.435312Z",
      "attachments": [
        {
          "file_id": "c8c9aa92-7c30-4035-a051-7015960ff75c",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "f5a03de1-e473-43e6-bf99-cf849cdc0e28",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T08:59:33.149446Z",
      "attachments": [
        {
          "file_id": "54781bd7-fd25-49ed-bbd8-16a24a9dafd6",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/294aea60-b5c3-4ba3-9a9a-fc7ceb9d9007/attachments/54781bd7-fd25-49ed-bbd8-16a24a9dafd6` → **200**

Done: support case 294aea60-b5c3-4ba3-9a9a-fc7ceb9d9007, rider attachment c8c9aa92-7c30-4035-a051-7015960ff75c, operator attachment 54781bd7-fd25-49ed-bbd8-16a24a9dafd6.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731281380",
  "device_ref": "sandbox-23398"
}
```

```json
{
  "challenge_id": "6f739026-c9b2-4680-b59a-c57e6cad9a65",
  "expires_at": "2026-10-30T09:04:33.635275703Z",
  "resend_available_at": "2026-10-30T08:59:34.635275703Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380731281380` → **200**

```json
{
  "phone": "+380731281380",
  "audience": "CLIENT",
  "code": "912921",
  "sent_at": "2026-10-30T08:59:33.638456898Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6f739026-c9b2-4680-b59a-c57e6cad9a65",
  "code": "912921",
  "device_ref": "sandbox-23398"
}
```

```json
{
  "session_id": "fc41d763-b62f-4932-a604-08614653c636",
  "subject": {
    "type": "CLIENT",
    "id": "387a09a2-0203-4b98-98c3-c08d6e2ca316"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzODdhMDlhMi0wMjAzLTRiOTgtOThjMy1jMDhkNmUyY2EzMTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNjczLCJpYXQiOjE3OTMzNTA3NzMsImp0aSI6Ijg0MDZhNjQzLTFiN2QtNDVkNy1hNzdjLTdmNGM0OGI2YTc3NCIsInNpZCI6ImZjNDFkNzYzLWI2MmYtNDkzMi1hNjA0LTA4NjE0NjUzYzYzNiJ9.uWMqC8sOKdjWdbtjkQx0dhqSxZMVvQzvbiHPKOxACls",
  "access_expires_at": "2026-10-30T09:14:33.896053791Z",
  "refresh_token": "teBQs1qNoMvt3_MTMO99pjrjwTehLRHSTfgmYoWY0Uc",
  "refresh_expires_at": "2026-11-29T08:59:33.895668334Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "c4f349c2-2596-4dbf-a416-c5a0b803bc80",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b2009be7-0e13-4ad3-b21e-4add9b2e5961",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b2009be7-0e13-4ad3-b21e-4add9b2e5961",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "39403da5d18c6850be44d01f9851d47a",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b2009be7-0e13-4ad3-b21e-4add9b2e5961",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731281380"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b2009be7-0e13-4ad3-b21e-4add9b2e5961",
  "expires_at": "2026-10-30T09:29:34.121116Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/b2009be7-0e13-4ad3-b21e-4add9b2e5961` → **200**

```json
{
  "id": "b2009be7-0e13-4ad3-b21e-4add9b2e5961",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T09:29:34.121116Z",
  "card": {
    "id": "77c51fb4-6aed-4796-b458-3f109261dd58",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****9249",
    "card_type": "Visa",
    "created_at": "2026-10-30T08:59:34.34796Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "dcc8e0e9-745e-4378-85e1-52374888af8f",
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
  "id": "8c17e90f-94b8-449d-9fdb-8bced5d56541",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:04:34.595644Z",
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
  "command_id": "d4798284-6f07-46eb-a6b1-02c9663305d5",
  "quote_id": "8c17e90f-94b8-449d-9fdb-8bced5d56541",
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
  "id": "e4426ddc-b7cb-4a1c-9a2e-6397634b2c62",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "387a09a2-0203-4b98-98c3-c08d6e2ca316",
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
  "created_at": "2026-10-30T08:59:34.834882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4426ddc-b7cb-4a1c-9a2e-6397634b2c62` → **200**

```json
{
  "id": "e4426ddc-b7cb-4a1c-9a2e-6397634b2c62",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "387a09a2-0203-4b98-98c3-c08d6e2ca316",
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
  "created_at": "2026-10-30T08:59:34.834882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4426ddc-b7cb-4a1c-9a2e-6397634b2c62` → **200**

```json
{
  "id": "e4426ddc-b7cb-4a1c-9a2e-6397634b2c62",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "387a09a2-0203-4b98-98c3-c08d6e2ca316",
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
  "created_at": "2026-10-30T08:59:34.834882Z",
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

`GET /api/rider/v1/orders/e4426ddc-b7cb-4a1c-9a2e-6397634b2c62` → **200**

```json
{
  "id": "e4426ddc-b7cb-4a1c-9a2e-6397634b2c62",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "387a09a2-0203-4b98-98c3-c08d6e2ca316",
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
  "created_at": "2026-10-30T08:59:34.834882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e4426ddc-b7cb-4a1c-9a2e-6397634b2c62/switch-to-cash` → **200**

```json
{
  "command_id": "75b7f3d2-160c-40c0-8bc2-4ec5c8353f69",
  "expected_version": 3
}
```

```json
{
  "id": "e4426ddc-b7cb-4a1c-9a2e-6397634b2c62",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "387a09a2-0203-4b98-98c3-c08d6e2ca316",
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
  "created_at": "2026-10-30T08:59:34.834882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e4426ddc-b7cb-4a1c-9a2e-6397634b2c62/switch-to-cash` → **409**

```json
{
  "command_id": "f99b9ab1-8823-4f5b-b14a-348e93c36152",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/e4426ddc-b7cb-4a1c-9a2e-6397634b2c62/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b8b48b71-2de8-403b-a963-8b979aa5ec40"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/e4426ddc-b7cb-4a1c-9a2e-6397634b2c62` → **200**

```json
{
  "id": "e4426ddc-b7cb-4a1c-9a2e-6397634b2c62",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "387a09a2-0203-4b98-98c3-c08d6e2ca316",
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
  "created_at": "2026-10-30T08:59:34.834882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e4426ddc-b7cb-4a1c-9a2e-6397634b2c62/cancel` → **200**

```json
{
  "command_id": "0cd7e368-9e1a-4f51-bfac-d88a5b44b637",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e4426ddc-b7cb-4a1c-9a2e-6397634b2c62",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "387a09a2-0203-4b98-98c3-c08d6e2ca316",
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
  "created_at": "2026-10-30T08:59:34.834882Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
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
  "session_id": "a4357b62-e014-4d68-b470-b6a421d14b0b",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE2NzcsImlhdCI6MTc5MzM1MDc3NywianRpIjoiM2U0Zjg5MDMtM2YwNy00ODAxLWE5ZjItNWE5MTM1Y2QxYjhmIiwic2lkIjoiYTQzNTdiNjItZTAxNC00ZDY4LWI0NzAtYjZhNDIxZDE0YjBiIn0.sQIn2AMS5hAnkq4NkAuT0beCST-yiPfN8f3hyTuPBCQ",
  "access_expires_at": "2026-10-30T09:14:37.992957521Z",
  "refresh_token": "1Pef1jzRdQNOvgginpL9IY4Dx3CKcbQERTcVlgNyL8Q",
  "refresh_expires_at": "2026-10-30T20:59:37.992558529Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-13579"
}
```

```json
{
  "challenge_id": "1b945904-8bf9-4142-a08b-00ca9428673a",
  "expires_at": "2026-10-30T09:04:38.212954029Z",
  "resend_available_at": "2026-10-30T08:59:39.212954029Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "281333",
  "sent_at": "2026-10-30T08:59:38.215851932Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1b945904-8bf9-4142-a08b-00ca9428673a",
  "code": "281333",
  "device_ref": "sandbox-13579"
}
```

```json
{
  "session_id": "d7bb4d1c-d869-4962-b258-b0b2d814af63",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTY3OCwiaWF0IjoxNzkzMzUwNzc4LCJqdGkiOiI1YTQ4NDJlYy01ZjEwLTQ0NzgtYTMwYS1hOGE5MTEyYzNjOGMiLCJzaWQiOiJkN2JiNGQxYy1kODY5LTQ5NjItYjI1OC1iMGIyZDgxNGFmNjMifQ.eV8qJSJk6uSYiJhD2O5xAbBii8248Rc5lVM9_70TwU8",
  "access_expires_at": "2026-10-30T09:14:38.46108497Z",
  "refresh_token": "_GAGPcii3V5G7OBkoysRVbr07GPp-hXnUsQ6ZzoFtPg",
  "refresh_expires_at": "2026-11-29T08:59:38.460677955Z",
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
      "actor_id": "31a00219-70fd-4586-82bb-ecb321d1f902",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T08:59:24.203581Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "31a00219-70fd-4586-82bb-ecb321d1f902",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T08:59:25.358541Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "67183942-7c65-422d-99b1-6a4bf8834fb3",
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
  "device_ref": "sandbox-29360"
}
```

```json
{
  "challenge_id": "2a554d0e-18ee-4954-bc19-7b4445eb9fef",
  "expires_at": "2026-10-30T09:04:39.374963722Z",
  "resend_available_at": "2026-10-30T08:59:40.374963722Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "181382",
  "sent_at": "2026-10-30T08:59:39.37719533Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2a554d0e-18ee-4954-bc19-7b4445eb9fef",
  "code": "181382",
  "device_ref": "sandbox-29360"
}
```

```json
{
  "session_id": "2f7a806c-f928-47ff-835b-760a13342c36",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTY3OSwiaWF0IjoxNzkzMzUwNzc5LCJqdGkiOiJiYzA4ODQ2Ny1iZjE0LTQ1YzEtOTFjOC1mZmJlNmQxMjg5M2MiLCJzaWQiOiIyZjdhODA2Yy1mOTI4LTQ3ZmYtODM1Yi03NjBhMTMzNDJjMzYifQ.LxdQ6-xqe1UQsA_ZhYoKfgzwyzNUPFnsSv-0v4ykN7Q",
  "access_expires_at": "2026-10-30T09:14:39.625973797Z",
  "refresh_token": "3gJb3mos1lN0GTL5yptaf17H4kLxeFNjWX-4Oe8os_c",
  "refresh_expires_at": "2026-11-29T08:59:39.625608916Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9525fffa-9ac6-483c-b0a3-af66260502e6",
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
  "last_heartbeat_at": "2026-10-30T08:59:06.161335Z",
  "last_location_at": "2026-10-30T08:59:06.161335Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/9525fffa-9ac6-483c-b0a3-af66260502e6/handover` → **200**

```json
{
  "command_id": "5f39c36e-0270-4f65-ae81-64cf76c9b04b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9525fffa-9ac6-483c-b0a3-af66260502e6",
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
  "last_heartbeat_at": "2026-10-30T08:59:06.161335Z",
  "last_location_at": "2026-10-30T08:59:06.161335Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/9525fffa-9ac6-483c-b0a3-af66260502e6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:59:40Z",
    "sequence": 1793350780299
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9525fffa-9ac6-483c-b0a3-af66260502e6",
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
  "last_heartbeat_at": "2026-10-30T08:59:40.314929Z",
  "last_location_at": "2026-10-30T08:59:40.314929Z",
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
  "command_id": "0a032860-bc99-4d32-9f3b-f22c23858169",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:59:40Z",
    "sequence": 1793350780753
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7d1e9418-d425-4930-a1ed-caa3ac394b4e",
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
  "last_heartbeat_at": "2026-10-30T08:59:40.769344Z",
  "last_location_at": "2026-10-30T08:59:40.769344Z",
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
  "session_id": "8c48c162-b1a8-4553-8f19-753ca899d163",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE2ODEsImlhdCI6MTc5MzM1MDc4MSwianRpIjoiNDZkYjkwZmMtOTJlOS00MTY5LWEzODMtYTZiYzdlNmY1M2NhIiwic2lkIjoiOGM0OGMxNjItYjFhOC00NTUzLThmMTktNzUzY2E4OTlkMTYzIn0.Ec55CNfxXdqy6x4m8X6-kCmoUjsZTSl2Ot6sxxZ0m0A",
  "access_expires_at": "2026-10-30T09:14:41.258214288Z",
  "refresh_token": "b2G2Yy3sTCdw2KZvlPF9G-q5T9Nyvc59oi8aHmOL3wM",
  "refresh_expires_at": "2026-10-30T20:59:41.257808195Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2776e996-fd33-49d9-9397-8c5cc66f9abd",
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
  "id": "ea8b54c7-c2e1-43c5-bfe4-bc09d462971c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:04:41.486002Z",
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
  "command_id": "5b5590e8-63a1-4f31-8aab-e0728e78bfa8",
  "quote_id": "ea8b54c7-c2e1-43c5-bfe4-bc09d462971c",
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
  "id": "15c7883a-a399-4da1-831b-c95d92f23746",
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
  "created_at": "2026-10-30T08:59:41.718691Z",
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
    "id": "cadb589d-bc23-4224-a9c8-1b527e43bb64",
    "order_id": "15c7883a-a399-4da1-831b-c95d92f23746",
    "expires_at": "2026-10-30T08:59:56.7217Z",
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

`POST /api/driver/v1/offers/cadb589d-bc23-4224-a9c8-1b527e43bb64/accept` → **200**

```json
{
  "command_id": "c7a92b68-0580-4df4-9f26-4baab8e24dbf"
}
```

```json
{
  "id": "28b24fb2-d1da-4433-b5dc-203a4218ac29",
  "order_id": "15c7883a-a399-4da1-831b-c95d92f23746",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "816767af-8739-4417-bcdb-0b529dcebee4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "816767af-8739-4417-bcdb-0b529dcebee4",
  "order_id": "15c7883a-a399-4da1-831b-c95d92f23746",
  "assignment_id": "28b24fb2-d1da-4433-b5dc-203a4218ac29",
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

`POST /api/driver/v1/work-sessions/7d1e9418-d425-4930-a1ed-caa3ac394b4e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:59:42Z",
    "sequence": 1793350782873
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7d1e9418-d425-4930-a1ed-caa3ac394b4e",
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
  "last_heartbeat_at": "2026-10-30T08:59:42.889239Z",
  "last_location_at": "2026-10-30T08:59:42.889239Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/816767af-8739-4417-bcdb-0b529dcebee4/arrive` → **200**

```json
{
  "command_id": "b687e5dd-4a20-4f15-a3a5-f8e2c2bf610a",
  "expected_version": 0
}
```

```json
{
  "id": "816767af-8739-4417-bcdb-0b529dcebee4",
  "order_id": "15c7883a-a399-4da1-831b-c95d92f23746",
  "assignment_id": "28b24fb2-d1da-4433-b5dc-203a4218ac29",
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
  "arrived_at": "2026-10-30T08:59:43.124815Z",
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

`POST /api/driver/v1/trips/816767af-8739-4417-bcdb-0b529dcebee4/start` → **200**

```json
{
  "command_id": "9a6a51bf-d4da-41e0-a87e-3887efe1e69f",
  "expected_version": 1
}
```

```json
{
  "id": "816767af-8739-4417-bcdb-0b529dcebee4",
  "order_id": "15c7883a-a399-4da1-831b-c95d92f23746",
  "assignment_id": "28b24fb2-d1da-4433-b5dc-203a4218ac29",
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
  "arrived_at": "2026-10-30T08:59:43.124815Z",
  "started_at": "2026-10-30T08:59:43.359858Z",
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

`POST /api/driver/v1/trips/816767af-8739-4417-bcdb-0b529dcebee4/complete` → **200**

```json
{
  "command_id": "577012a0-c5d2-421c-8f88-bac129dbd4ae",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:59:43Z",
  "cash_received": true
}
```

```json
{
  "id": "816767af-8739-4417-bcdb-0b529dcebee4",
  "order_id": "15c7883a-a399-4da1-831b-c95d92f23746",
  "assignment_id": "28b24fb2-d1da-4433-b5dc-203a4218ac29",
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
  "arrived_at": "2026-10-30T08:59:43.124815Z",
  "started_at": "2026-10-30T08:59:43.359858Z",
  "completed_at": "2026-10-30T08:59:43.597879Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/15c7883a-a399-4da1-831b-c95d92f23746` → **200**

```json
{
  "id": "15c7883a-a399-4da1-831b-c95d92f23746",
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
    "id": "28b24fb2-d1da-4433-b5dc-203a4218ac29",
    "order_id": "15c7883a-a399-4da1-831b-c95d92f23746",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "816767af-8739-4417-bcdb-0b529dcebee4",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:59:41.718691Z",
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
  "session_id": "9525fffa-9ac6-483c-b0a3-af66260502e6",
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
  "last_heartbeat_at": "2026-10-30T08:59:40.314929Z",
  "last_location_at": "2026-10-30T08:59:40.314929Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9525fffa-9ac6-483c-b0a3-af66260502e6/close` → **200**

```json
{
  "command_id": "93dceff2-9563-42bb-b6d2-11e2680d78cb",
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
  "session_id": "7d1e9418-d425-4930-a1ed-caa3ac394b4e",
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
  "last_heartbeat_at": "2026-10-30T08:59:42.889239Z",
  "last_location_at": "2026-10-30T08:59:42.889239Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7d1e9418-d425-4930-a1ed-caa3ac394b4e/close` → **200**

```json
{
  "command_id": "1da104e9-3eee-46a0-be6e-35cb2a5f7a4b",
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

Done: terminal order 15c7883a-a399-4da1-831b-c95d92f23746 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-16684"
}
```

```json
{
  "challenge_id": "4d74c34a-6771-43c1-98cf-52d9abc7a69f",
  "expires_at": "2026-10-30T09:04:48.189173466Z",
  "resend_available_at": "2026-10-30T08:59:49.189173466Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "120236",
  "sent_at": "2026-10-30T08:59:48.19125002Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4d74c34a-6771-43c1-98cf-52d9abc7a69f",
  "code": "120236",
  "device_ref": "sandbox-16684"
}
```

```json
{
  "session_id": "cc507137-93ef-45ec-8e71-137ac5cbf0cf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTY4OCwiaWF0IjoxNzkzMzUwNzg4LCJqdGkiOiJiYjIwMTk1Zi0zZDIyLTQwODctYjQ3OS1hNzExZTM0ZGJmNDAiLCJzaWQiOiJjYzUwNzEzNy05M2VmLTQ1ZWMtOGU3MS0xMzdhYzVjYmYwY2YifQ.IXY5vfASKX1amaVkoHe0XyuJ8EHRwqqkRGEINi9Uf50",
  "access_expires_at": "2026-10-30T09:14:48.433398506Z",
  "refresh_token": "69uHV_yei216kSBMZMg6YRGzdDtIrxSGOf2CStHloXo",
  "refresh_expires_at": "2026-11-29T08:59:48.432940544Z",
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
  "device_ref": "sandbox-25050"
}
```

```json
{
  "challenge_id": "05f6e445-1bc3-4116-a11c-094e0fcb5ca9",
  "expires_at": "2026-10-30T09:04:48.884757225Z",
  "resend_available_at": "2026-10-30T08:59:49.884757225Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "058586",
  "sent_at": "2026-10-30T08:59:48.886973419Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "05f6e445-1bc3-4116-a11c-094e0fcb5ca9",
  "code": "058586",
  "device_ref": "sandbox-25050"
}
```

```json
{
  "session_id": "2c54c1ee-1063-4c50-b403-b7c6dedae4fd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTY4OSwiaWF0IjoxNzkzMzUwNzg5LCJqdGkiOiIzZTE2ZDQ2OS1mZTNlLTQ0Y2UtODAyYS1hM2MwZmQ0MTAwMmYiLCJzaWQiOiIyYzU0YzFlZS0xMDYzLTRjNTAtYjQwMy1iN2M2ZGVkYWU0ZmQifQ.ALMi3Moovf9DC-xu2UBUjBCj4t9zobPjmamu-7RRzpk",
  "access_expires_at": "2026-10-30T09:14:49.135934425Z",
  "refresh_token": "XpvSpAudoQBUFr_YlVkNUBH_Sv8XvjWGGaG-kwIDr2k",
  "refresh_expires_at": "2026-11-29T08:59:49.135571587Z",
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
  "device_ref": "sandbox-3200"
}
```

```json
{
  "challenge_id": "9b2f45e9-0c9c-4cc6-be2b-65927e777c78",
  "expires_at": "2026-10-30T09:04:49.572230718Z",
  "resend_available_at": "2026-10-30T08:59:50.572230718Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "384839",
  "sent_at": "2026-10-30T08:59:49.574132368Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9b2f45e9-0c9c-4cc6-be2b-65927e777c78",
  "code": "384839",
  "device_ref": "sandbox-3200"
}
```

```json
{
  "session_id": "c8615f56-040c-460d-9b25-8a000a72a452",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTY4OSwiaWF0IjoxNzkzMzUwNzg5LCJqdGkiOiI3MTVmODdkNi0zNTZjLTQ3MDEtYjg4Mi03MDFhYmIyZjI2MDgiLCJzaWQiOiJjODYxNWY1Ni0wNDBjLTQ2MGQtOWIyNS04YTAwMGE3MmE0NTIifQ.1CK2YVAS-2Jjuzkmr4qQmdi_MG_7jq-mFR2PqPIrsfs",
  "access_expires_at": "2026-10-30T09:14:49.821333378Z",
  "refresh_token": "SKFjoP8t056EGjYK68SxhzHCbW1HJvULYjQUffGmNVU",
  "refresh_expires_at": "2026-11-29T08:59:49.82092072Z",
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
  "phone": "+380690731957",
  "device_ref": "sandbox-26936"
}
```

```json
{
  "challenge_id": "fd3245df-fd1b-4e1c-9b22-640d5f8cef92",
  "expires_at": "2026-10-30T09:04:50.253885145Z",
  "resend_available_at": "2026-10-30T08:59:51.253885145Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380690731957` → **200**

```json
{
  "phone": "+380690731957",
  "audience": "CLIENT",
  "code": "631214",
  "sent_at": "2026-10-30T08:59:50.255805228Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fd3245df-fd1b-4e1c-9b22-640d5f8cef92",
  "code": "631214",
  "device_ref": "sandbox-26936"
}
```

```json
{
  "session_id": "6b266d14-4b99-4c1e-8e80-c4411a85785b",
  "subject": {
    "type": "CLIENT",
    "id": "94342ae5-e251-49d0-84f8-dd095ff5df61"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDM0MmFlNS1lMjUxLTQ5ZDAtODRmOC1kZDA5NWZmNWRmNjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxNjkwLCJpYXQiOjE3OTMzNTA3OTAsImp0aSI6ImI1YTdhNTI1LThlZmUtNDZkZS05ODk1LTBmY2U4YjljYzE1ZCIsInNpZCI6IjZiMjY2ZDE0LTRiOTktNGMxZS04ZTgwLWM0NDExYTg1Nzg1YiJ9.L_QAhmBPlfibjiPr6_GABNWwm9-RVxIJ18SrztyzJMg",
  "access_expires_at": "2026-10-30T09:14:50.494844601Z",
  "refresh_token": "h9hAVzr6LlHG8VpgTgXg_Q-bTbZmHmFQk7OLoca3Kjs",
  "refresh_expires_at": "2026-11-29T08:59:50.494364036Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e44c8c9e-287a-4ad5-8b9b-1d8a69ba0474",
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
  "id": "45f245b5-5779-4a47-8dd2-cca7a6b67bb2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:04:50.720321Z",
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
  "command_id": "203582da-94f3-4882-b992-9a611914b799",
  "quote_id": "45f245b5-5779-4a47-8dd2-cca7a6b67bb2",
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
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:59:50.952579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:59:50.952579Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 11.418402662
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.140258279
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

`GET /api/rider/v1/orders/8bf96ac8-1823-43e3-b219-1f3a82e1240d` → **200**

```json
{
  "id": "8bf96ac8-1823-43e3-b219-1f3a82e1240d",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "94342ae5-e251-49d0-84f8-dd095ff5df61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:59:50.952579Z",
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
  "session_id": "0204eef4-f1db-44b0-94a8-965660e0551e",
  "subject": {
    "type": "STAFF",
    "id": "31a00219-70fd-4586-82bb-ecb321d1f902"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWEwMDIxOS03MGZkLTQ1ODYtODJiYi1lY2IzMjFkMWY5MDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE4NzUsImlhdCI6MTc5MzM1MDk3NSwianRpIjoiNTI3MjZjNmUtYzlmNC00ZjhhLWE1YjMtNjM0OGVkZmE1ZDU0Iiwic2lkIjoiMDIwNGVlZjQtZjFkYi00NGIwLTk0YTgtOTY1NjYwZTA1NTFlIn0.doPV3A00_Jt_tOI86veRenUNoCD0Kr8Py0l4mB4rkpE",
  "access_expires_at": "2026-10-30T09:17:55.439840973Z",
  "refresh_token": "MLBorR57LPTDJ2puS_zgqpmBVfkNBW1eJ2rBe9kQaUg",
  "refresh_expires_at": "2026-10-30T21:02:55.43936007Z",
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
  "id": "53a5e6de-8b47-4c4a-ba44-b02ceea83eb0",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:02:55.679582Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:02:55.679629Z",
  "updated_at": "2026-10-30T09:02:55.693235Z",
  "finished_at": "2026-10-30T09:02:55.693235Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/53a5e6de-8b47-4c4a-ba44-b02ceea83eb0` → **200**

```json
{
  "run": {
    "id": "53a5e6de-8b47-4c4a-ba44-b02ceea83eb0",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T09:02:55.679582Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T09:02:55.679629Z",
    "updated_at": "2026-10-30T09:02:55.693235Z",
    "finished_at": "2026-10-30T09:02:55.693235Z",
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
  "id": "53a5e6de-8b47-4c4a-ba44-b02ceea83eb0",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:02:55.679582Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:02:55.679629Z",
  "updated_at": "2026-10-30T09:02:55.693235Z",
  "finished_at": "2026-10-30T09:02:55.693235Z",
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
  "id": "53a5e6de-8b47-4c4a-ba44-b02ceea83eb0",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:02:55.679582Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:02:55.679629Z",
  "updated_at": "2026-10-30T09:02:55.693235Z",
  "finished_at": "2026-10-30T09:02:55.693235Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/1fa6d74c-6257-4bae-9326-2e9f55f3e35b` → **204**

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
  "id": "cb6a0206-da53-44f1-bcf0-1a48e97351bc",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:02:56.044107Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:02:56.044159Z",
  "updated_at": "2026-10-30T09:02:56.050086Z",
  "finished_at": "2026-10-30T09:02:56.050086Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/cb6a0206-da53-44f1-bcf0-1a48e97351bc` → **200**

```json
{
  "run": {
    "id": "cb6a0206-da53-44f1-bcf0-1a48e97351bc",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T09:02:56.044107Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T09:02:56.044159Z",
    "updated_at": "2026-10-30T09:02:56.050086Z",
    "finished_at": "2026-10-30T09:02:56.050086Z",
    "version": 1
  },
  "items": [
    {
      "id": "7c1327c6-d834-410c-9e5c-a579a6e650b0",
      "run_id": "cb6a0206-da53-44f1-bcf0-1a48e97351bc",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "bd2ddccf432b8899fccfae807ee011a5b63ccf66ee689d835356da0da0c5eba8",
      "reference_display": "sandbox-reconciliation-1fa6d74c-6257-4bae-9326-2e9f55f3e35b",
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
      "provider_at": "2026-10-30T09:02:56Z",
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
  "id": "cb6a0206-da53-44f1-bcf0-1a48e97351bc",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:02:56.044107Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:02:56.044159Z",
  "updated_at": "2026-10-30T09:02:56.050086Z",
  "finished_at": "2026-10-30T09:02:56.050086Z",
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
  "id": "cb6a0206-da53-44f1-bcf0-1a48e97351bc",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:02:56.044107Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:02:56.044159Z",
  "updated_at": "2026-10-30T09:02:56.050086Z",
  "finished_at": "2026-10-30T09:02:56.050086Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/7c1327c6-d834-410c-9e5c-a579a6e650b0/resolve` → **200**

```json
{
  "command_id": "6dd5453b-8424-4200-9032-3afc3f0c1e72",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "7c1327c6-d834-410c-9e5c-a579a6e650b0",
  "run_id": "cb6a0206-da53-44f1-bcf0-1a48e97351bc",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "bd2ddccf432b8899fccfae807ee011a5b63ccf66ee689d835356da0da0c5eba8",
  "reference_display": "sandbox-reconciliation-1fa6d74c-6257-4bae-9326-2e9f55f3e35b",
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
  "provider_at": "2026-10-30T09:02:56Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
  "resolved_at": "2026-10-30T09:02:56.394907Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/7c1327c6-d834-410c-9e5c-a579a6e650b0/resolve` → **200**

```json
{
  "command_id": "6dd5453b-8424-4200-9032-3afc3f0c1e72",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "7c1327c6-d834-410c-9e5c-a579a6e650b0",
  "run_id": "cb6a0206-da53-44f1-bcf0-1a48e97351bc",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "bd2ddccf432b8899fccfae807ee011a5b63ccf66ee689d835356da0da0c5eba8",
  "reference_display": "sandbox-reconciliation-1fa6d74c-6257-4bae-9326-2e9f55f3e35b",
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
  "provider_at": "2026-10-30T09:02:56Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
  "resolved_at": "2026-10-30T09:02:56.394907Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/7c1327c6-d834-410c-9e5c-a579a6e650b0/resolve` → **409**

```json
{
  "command_id": "3a3465ce-15ba-4e84-a262-aa789809aecb",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/7c1327c6-d834-410c-9e5c-a579a6e650b0/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "001b0f79-1bf3-4561-8cb4-236574239ca7"
}
```

`GET /api/admin/v1/payment-reconciliations/cb6a0206-da53-44f1-bcf0-1a48e97351bc` → **200**

```json
{
  "run": {
    "id": "cb6a0206-da53-44f1-bcf0-1a48e97351bc",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T09:02:56.044107Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T09:02:56.044159Z",
    "updated_at": "2026-10-30T09:02:56.394907Z",
    "finished_at": "2026-10-30T09:02:56.050086Z",
    "version": 2
  },
  "items": [
    {
      "id": "7c1327c6-d834-410c-9e5c-a579a6e650b0",
      "run_id": "cb6a0206-da53-44f1-bcf0-1a48e97351bc",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "bd2ddccf432b8899fccfae807ee011a5b63ccf66ee689d835356da0da0c5eba8",
      "reference_display": "sandbox-reconciliation-1fa6d74c-6257-4bae-9326-2e9f55f3e35b",
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
      "provider_at": "2026-10-30T09:02:56Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "31a00219-70fd-4586-82bb-ecb321d1f902",
      "resolved_at": "2026-10-30T09:02:56.394907Z",
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
      "id": "cb6a0206-da53-44f1-bcf0-1a48e97351bc",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T09:02:56.044107Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T09:02:56.044159Z",
      "updated_at": "2026-10-30T09:02:56.394907Z",
      "finished_at": "2026-10-30T09:02:56.050086Z",
      "version": 2
    },
    {
      "id": "55ffddec-07ab-4bda-9d4f-6bba5fb8f5db",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T08:55:52.458352Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T08:55:52.458421Z",
      "updated_at": "2026-10-30T08:55:52.464363Z",
      "finished_at": "2026-10-30T08:55:52.464363Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/1fa6d74c-6257-4bae-9326-2e9f55f3e35b` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "cb6a0206-da53-44f1-bcf0-1a48e97351bc",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:02:56.044107Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:02:56.044159Z",
  "updated_at": "2026-10-30T09:02:56.394907Z",
  "finished_at": "2026-10-30T09:02:56.050086Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793351102584E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793351102771E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793351102771E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793351102592E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793351102771E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
