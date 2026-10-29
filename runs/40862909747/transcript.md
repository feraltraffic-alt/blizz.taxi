# Sandbox transcript (2026-10-29T11:08:16Z, 1f4b5e5)

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
  "correlation_id": "d4c1d2ca-ab18-4e77-b28b-269bab170f46"
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
  "session_id": "c570b8e7-2ac4-4c4a-9028-682a91a8b0f2",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMwMDUsImlhdCI6MTc5MzI3MjEwNSwianRpIjoiM2NmMmNjYmItOTU4Ni00YzM4LWFmMDctNDg4MDc5ZWFkZmRjIiwic2lkIjoiYzU3MGI4ZTctMmFjNC00YzRhLTkwMjgtNjgyYTkxYThiMGYyIn0.1OJcGfKBEZakR4SO6USDNvskBSFidRvSAgtRWmtaI-4",
  "access_expires_at": "2026-10-29T11:23:25.134958517Z",
  "refresh_token": "-8nMFKdVLGqjjqfuQCQovC6_nwIlxqLMFznLtJHJids",
  "refresh_expires_at": "2026-10-29T23:08:25.132383264Z",
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
  "session_id": "96091376-6537-49dd-b05c-3519b763f82f",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMwMDYsImlhdCI6MTc5MzI3MjEwNiwianRpIjoiMThmMTBkNjUtMTRlMi00NzQxLTk5NjUtMjZjMGEwM2JjYmI0Iiwic2lkIjoiOTYwOTEzNzYtNjUzNy00OWRkLWIwNWMtMzUxOWI3NjNmODJmIn0.yNhTNy1wSIDoEOiU96NTiE2H0DQCF-RXRZ4jAGn8nAE",
  "access_expires_at": "2026-10-29T11:23:26.736643094Z",
  "refresh_token": "2W_baQ-NdR5g97sranXw3fJLPrj2nSO4op0SElY5ApI",
  "refresh_expires_at": "2026-10-29T23:08:26.735646194Z",
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
  "device_ref": "sandbox-4276"
}
```

```json
{
  "challenge_id": "e9f2bf8c-ff91-4493-91b9-3881045239d5",
  "expires_at": "2026-10-29T11:13:27.329905775Z",
  "resend_available_at": "2026-10-29T11:08:28.329905775Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "515446",
  "sent_at": "2026-10-29T11:08:27.343377747Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9f2bf8c-ff91-4493-91b9-3881045239d5",
  "code": "515446",
  "device_ref": "sandbox-4276"
}
```

```json
{
  "session_id": "dfad9325-d9ac-4173-a754-48ea95a040b1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MzAwNywiaWF0IjoxNzkzMjcyMTA3LCJqdGkiOiJmYjE5MDJjOC1iNTRkLTRiMDctODc5OS01NWNkOTU5MzRmMzMiLCJzaWQiOiJkZmFkOTMyNS1kOWFjLTQxNzMtYTc1NC00OGVhOTVhMDQwYjEifQ.tj5CmTLpAG1qjcomXheHBURT4dCYzjNEE9ihspbMGS4",
  "access_expires_at": "2026-10-29T11:23:27.664759012Z",
  "refresh_token": "TRwKiTzrTTXDk_m8f20mo1oGmw_Ji-scBQ_LNGq52ew",
  "refresh_expires_at": "2026-11-28T11:08:27.663623513Z",
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
  "command_id": "fa73bc36-67d1-475c-86a5-423f0b4fb135",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:08:28Z",
    "sequence": 1793272108210
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "383408e9-9b7b-4878-ab27-92658c612db7",
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
  "last_heartbeat_at": "2026-10-29T11:08:28.357146Z",
  "last_location_at": "2026-10-29T11:08:28.357146Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633825237",
  "device_ref": "sandbox-21290"
}
```

```json
{
  "challenge_id": "f570082c-01f9-4d6f-b72f-823cbba99dca",
  "expires_at": "2026-10-29T11:13:28.642729258Z",
  "resend_available_at": "2026-10-29T11:08:29.642729258Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633825237` → **200**

```json
{
  "phone": "+380633825237",
  "audience": "CLIENT",
  "code": "523279",
  "sent_at": "2026-10-29T11:08:28.64788502Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f570082c-01f9-4d6f-b72f-823cbba99dca",
  "code": "523279",
  "device_ref": "sandbox-21290"
}
```

```json
{
  "session_id": "19073de7-a641-47a0-9d56-7367fc44640a",
  "subject": {
    "type": "CLIENT",
    "id": "47197063-e1cc-4517-b5cb-dfd10fc1a94f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NzE5NzA2My1lMWNjLTQ1MTctYjVjYi1kZmQxMGZjMWE5NGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMDA4LCJpYXQiOjE3OTMyNzIxMDgsImp0aSI6IjhjMzMzOGNiLWIzOWMtNDQzOC04YTc1LTQ5OGVlOTYwMzhkNCIsInNpZCI6IjE5MDczZGU3LWE2NDEtNDdhMC05ZDU2LTczNjdmYzQ0NjQwYSJ9.0yaoEIbg20o1Uz9nI3Gl5Al4AIaFKKp5VPL8JfjYOuk",
  "access_expires_at": "2026-10-29T11:23:28.935910115Z",
  "refresh_token": "jRFbLl7n3NB-12kjRyRvOjpR4TZvo8umvY8l005ngFQ",
  "refresh_expires_at": "2026-11-28T11:08:28.934723652Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fa590ae8-4ed4-4865-9b14-373094092ab3",
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
  "id": "744bd25a-b26e-4e5f-adcb-51392c03c1bb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:13:29.255777Z",
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
  "command_id": "32234ce5-781b-4de4-8446-17fdaa649b3c",
  "quote_id": "744bd25a-b26e-4e5f-adcb-51392c03c1bb",
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
  "id": "2ae38552-de59-443a-8b0b-7e3843e1b2e3",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "47197063-e1cc-4517-b5cb-dfd10fc1a94f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T11:08:29.625304Z",
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
    "id": "b71ab963-3863-41e5-ab3f-cc3d3b076909",
    "order_id": "2ae38552-de59-443a-8b0b-7e3843e1b2e3",
    "expires_at": "2026-10-29T11:08:44.637091Z",
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

`POST /api/driver/v1/offers/b71ab963-3863-41e5-ab3f-cc3d3b076909/accept` → **200**

```json
{
  "command_id": "ea424c8c-9b18-4e5a-a75c-fabf0ea13326"
}
```

```json
{
  "id": "0a58de2a-c818-4fd1-93b4-c9f710a61f14",
  "order_id": "2ae38552-de59-443a-8b0b-7e3843e1b2e3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7af11eac-f9e7-40fb-97f6-85499eb8808f",
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
  "command_id": "630c6e6b-4eb4-411d-938b-9de35670ef12",
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
  "changed_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T11:08:30.825758284Z"
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
  "id": "7af11eac-f9e7-40fb-97f6-85499eb8808f",
  "order_id": "2ae38552-de59-443a-8b0b-7e3843e1b2e3",
  "assignment_id": "0a58de2a-c818-4fd1-93b4-c9f710a61f14",
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

`POST /api/driver/v1/work-sessions/383408e9-9b7b-4878-ab27-92658c612db7/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:08:31Z",
    "sequence": 1793272111673
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "383408e9-9b7b-4878-ab27-92658c612db7",
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
  "last_heartbeat_at": "2026-10-29T11:08:31.698295Z",
  "last_location_at": "2026-10-29T11:08:31.698295Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7af11eac-f9e7-40fb-97f6-85499eb8808f/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "c84241b5-2f38-443d-b9f0-7d08c0fc175a",
  "expected_version": 0
}
```

```json
{
  "id": "7af11eac-f9e7-40fb-97f6-85499eb8808f",
  "order_id": "2ae38552-de59-443a-8b0b-7e3843e1b2e3",
  "assignment_id": "0a58de2a-c818-4fd1-93b4-c9f710a61f14",
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
  "arrived_at": "2026-10-29T11:08:31.993761Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7af11eac-f9e7-40fb-97f6-85499eb8808f/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "32fd04a1-7481-438e-a40e-d714700a796c",
  "expected_version": 1
}
```

```json
{
  "id": "7af11eac-f9e7-40fb-97f6-85499eb8808f",
  "order_id": "2ae38552-de59-443a-8b0b-7e3843e1b2e3",
  "assignment_id": "0a58de2a-c818-4fd1-93b4-c9f710a61f14",
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
  "arrived_at": "2026-10-29T11:08:31.993761Z",
  "started_at": "2026-10-29T11:08:32.289652Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7af11eac-f9e7-40fb-97f6-85499eb8808f/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "da483241-2a7f-4cb3-9f7f-943655dc8011",
  "expected_version": 2,
  "reported_at": "2026-10-29T11:08:32Z",
  "cash_received": true
}
```

```json
{
  "id": "7af11eac-f9e7-40fb-97f6-85499eb8808f",
  "order_id": "2ae38552-de59-443a-8b0b-7e3843e1b2e3",
  "assignment_id": "0a58de2a-c818-4fd1-93b4-c9f710a61f14",
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
  "arrived_at": "2026-10-29T11:08:31.993761Z",
  "started_at": "2026-10-29T11:08:32.289652Z",
  "completed_at": "2026-10-29T11:08:32.589858Z",
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
  "session_id": "383408e9-9b7b-4878-ab27-92658c612db7",
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
  "last_heartbeat_at": "2026-10-29T11:08:31.698295Z",
  "last_location_at": "2026-10-29T11:08:31.698295Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/383408e9-9b7b-4878-ab27-92658c612db7/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "d54f750a-9b21-4fb7-8b9c-35c85e7d59b2",
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
  "command_id": "1450a504-760f-4dee-a20b-0fdf4f605a98",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:08:33Z",
    "sequence": 1793272113421
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
  "correlation_id": "f8670d16-73e2-4ad2-9d3e-e3769fa9b45a",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "961d74ea-4a75-4473-938c-b4531e81dd02",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:08:33Z",
    "sequence": 1793272113748
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ff608a0e-7439-44ff-a6cb-63d3e505eb0e",
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
  "last_heartbeat_at": "2026-10-29T11:08:33.77102Z",
  "last_location_at": "2026-10-29T11:08:33.77102Z",
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
  "changed_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T11:08:30.825758Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "dbcb6763-c5cd-4848-b100-21d5e3903402",
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
  "changed_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T11:08:34.343952213Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ff608a0e-7439-44ff-a6cb-63d3e505eb0e",
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
  "last_heartbeat_at": "2026-10-29T11:08:33.77102Z",
  "last_location_at": "2026-10-29T11:08:33.77102Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ff608a0e-7439-44ff-a6cb-63d3e505eb0e/close` → **200**

```json
{
  "command_id": "ac7dd32c-fa79-4080-8e2c-1d86b2d678f4",
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
  "session_id": "401367c4-6cbf-4f14-91d7-1fb334050b92",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMwMTUsImlhdCI6MTc5MzI3MjExNSwianRpIjoiYjA3ZTYzMDctODU5NC00MDI1LTlmZmEtNGRkMWMzZjMyZjQ2Iiwic2lkIjoiNDAxMzY3YzQtNmNiZi00ZjE0LTkxZDctMWZiMzM0MDUwYjkyIn0.Zf28efj2OHSamWYXs92NyU2CSC_ZeRGWAgFn1Yuz_UM",
  "access_expires_at": "2026-10-29T11:23:35.502274939Z",
  "refresh_token": "izgP6hA7a9Sv6Xjoi3PxMDPhCyeFAzbXx9JivYBCHrY",
  "refresh_expires_at": "2026-10-29T23:08:35.501362554Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "14d96f5a-611d-4cc5-abf0-5a570c6ca3e8",
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
  "id": "81f8bb0a-804a-4844-8ec8-b669ef80b592",
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
  "created_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
  "created_at": "2026-10-29T11:08:35.781303Z",
  "updated_at": "2026-10-29T11:08:35.781303Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630372399",
  "device_ref": "sandbox-28624"
}
```

```json
{
  "challenge_id": "8181d8b9-29fc-46a5-a734-b5b0ff350f5d",
  "expires_at": "2026-10-29T11:13:36.067242641Z",
  "resend_available_at": "2026-10-29T11:08:37.067242641Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630372399` → **200**

```json
{
  "phone": "+380630372399",
  "audience": "CLIENT",
  "code": "484930",
  "sent_at": "2026-10-29T11:08:36.07167783Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8181d8b9-29fc-46a5-a734-b5b0ff350f5d",
  "code": "484930",
  "device_ref": "sandbox-28624"
}
```

```json
{
  "session_id": "8fd6b8b2-f2d0-4fbe-8611-b2a40d56b3e4",
  "subject": {
    "type": "CLIENT",
    "id": "9254dd36-8d4d-4ab1-8326-8b7d2a8eae59"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MjU0ZGQzNi04ZDRkLTRhYjEtODMyNi04YjdkMmE4ZWFlNTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMDE2LCJpYXQiOjE3OTMyNzIxMTYsImp0aSI6ImE1YTcwN2VkLTNkOWQtNGVjZi1iNzAyLTJjZmVlODNlZGZjYyIsInNpZCI6IjhmZDZiOGIyLWYyZDAtNGZiZS04NjExLWIyYTQwZDU2YjNlNCJ9.VXU00DDnH1Sr4DW1yzZE10c9lc7jiWBoAZHci72iHWo",
  "access_expires_at": "2026-10-29T11:23:36.378881353Z",
  "refresh_token": "cL9l0QVopOQ827kshmvijcckPVAimGfbsPQ1-SQS72Y",
  "refresh_expires_at": "2026-11-28T11:08:36.377954352Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380630372399` → **200**

```json
{
  "client_id": "9254dd36-8d4d-4ab1-8326-8b7d2a8eae59"
}
```

`POST /api/admin/v1/rider-wallets/9254dd36-8d4d-4ab1-8326-8b7d2a8eae59/top-ups` → **201**

```json
{
  "command_id": "2e1c60e1-c009-47af-9ca8-d588fa1687ab",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "9254dd36-8d4d-4ab1-8326-8b7d2a8eae59",
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
      "id": "bb80ede2-1f46-42b8-a368-8133dc4f17d3",
      "at": "2026-10-29T11:08:36.927418Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "81cbe7a9-e91e-471f-ae70-daf27d80e02a",
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
  "id": "df5dca76-e7b6-43e4-8503-35584fecc382",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:13:37.222586Z",
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
      "id": "81f8bb0a-804a-4844-8ec8-b669ef80b592",
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
  "device_ref": "sandbox-10376"
}
```

```json
{
  "challenge_id": "25be69c4-b9ce-48dd-96ee-dc7a8233d188",
  "expires_at": "2026-10-29T11:13:37.506361806Z",
  "resend_available_at": "2026-10-29T11:08:38.506361806Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "031008",
  "sent_at": "2026-10-29T11:08:37.5100994Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "25be69c4-b9ce-48dd-96ee-dc7a8233d188",
  "code": "031008",
  "device_ref": "sandbox-10376"
}
```

```json
{
  "session_id": "e2494d6e-0685-40a2-9b25-7d5f6d9b4d85",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MzAxNywiaWF0IjoxNzkzMjcyMTE3LCJqdGkiOiI5YjQ2ODE4Ni1lNTYyLTRmODEtOTA4NC1iNTYyZTlkMzdkYjUiLCJzaWQiOiJlMjQ5NGQ2ZS0wNjg1LTQwYTItOWIyNS03ZDVmNmQ5YjRkODUifQ.hQrqihVHGfpR9PQYZ-5NvvUNnXHoUNnal8T-kSsk1zo",
  "access_expires_at": "2026-10-29T11:23:37.803216204Z",
  "refresh_token": "d7xHeEKeHlkC4RBXcLiA4hKycwuN8_f1wDj9WDPzO7Q",
  "refresh_expires_at": "2026-11-28T11:08:37.80233841Z",
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
  "command_id": "65d9a244-a0af-4583-a304-f2d1e74dd5e9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:08:38Z",
    "sequence": 1793272118333
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d6624714-f8f0-4444-a923-23d5ed3d82ed",
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
  "last_heartbeat_at": "2026-10-29T11:08:38.354673Z",
  "last_location_at": "2026-10-29T11:08:38.354673Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8b5bb246-b415-4348-adf0-d5fadd5b37cf",
  "quote_id": "df5dca76-e7b6-43e4-8503-35584fecc382",
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
  "id": "fd1bd3bf-5d42-4b11-aebb-ccb3a87bd0ea",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9254dd36-8d4d-4ab1-8326-8b7d2a8eae59",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T11:08:38.645031Z",
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
  "client_id": "9254dd36-8d4d-4ab1-8326-8b7d2a8eae59",
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
      "id": "bb80ede2-1f46-42b8-a368-8133dc4f17d3",
      "at": "2026-10-29T11:08:36.927418Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
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
    "id": "ef01e8de-d8fe-4ae3-8b6f-c03e3377b094",
    "order_id": "fd1bd3bf-5d42-4b11-aebb-ccb3a87bd0ea",
    "expires_at": "2026-10-29T11:08:53.653965Z",
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

`POST /api/driver/v1/offers/ef01e8de-d8fe-4ae3-8b6f-c03e3377b094/accept` → **200**

```json
{
  "command_id": "9a786293-f7e4-4e6e-bc9f-559fc74f5098"
}
```

```json
{
  "id": "a7c6df29-e5d4-4734-a0e8-09ba16ab7f4d",
  "order_id": "fd1bd3bf-5d42-4b11-aebb-ccb3a87bd0ea",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "78181c14-dee4-43bd-8ccc-4b3dde506708",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "78181c14-dee4-43bd-8ccc-4b3dde506708",
  "order_id": "fd1bd3bf-5d42-4b11-aebb-ccb3a87bd0ea",
  "assignment_id": "a7c6df29-e5d4-4734-a0e8-09ba16ab7f4d",
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

`POST /api/driver/v1/work-sessions/d6624714-f8f0-4444-a923-23d5ed3d82ed/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:08:40Z",
    "sequence": 1793272120247
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d6624714-f8f0-4444-a923-23d5ed3d82ed",
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
  "last_heartbeat_at": "2026-10-29T11:08:40.268163Z",
  "last_location_at": "2026-10-29T11:08:40.268163Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/78181c14-dee4-43bd-8ccc-4b3dde506708/arrive` → **200**

```json
{
  "command_id": "9e3f768d-0873-4438-98d3-97c5f0cc8971",
  "expected_version": 0
}
```

```json
{
  "id": "78181c14-dee4-43bd-8ccc-4b3dde506708",
  "order_id": "fd1bd3bf-5d42-4b11-aebb-ccb3a87bd0ea",
  "assignment_id": "a7c6df29-e5d4-4734-a0e8-09ba16ab7f4d",
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
  "arrived_at": "2026-10-29T11:08:40.544074Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/78181c14-dee4-43bd-8ccc-4b3dde506708/start` → **200**

```json
{
  "command_id": "0c71aead-4794-4ddb-8358-c77af32c2348",
  "expected_version": 1
}
```

```json
{
  "id": "78181c14-dee4-43bd-8ccc-4b3dde506708",
  "order_id": "fd1bd3bf-5d42-4b11-aebb-ccb3a87bd0ea",
  "assignment_id": "a7c6df29-e5d4-4734-a0e8-09ba16ab7f4d",
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
  "arrived_at": "2026-10-29T11:08:40.544074Z",
  "started_at": "2026-10-29T11:08:40.819928Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/78181c14-dee4-43bd-8ccc-4b3dde506708/complete` → **200**

```json
{
  "command_id": "cc34ac9b-1e2f-4a9d-a2f9-4599d81e1a94",
  "expected_version": 2,
  "reported_at": "2026-10-29T11:08:41Z",
  "cash_received": true
}
```

```json
{
  "id": "78181c14-dee4-43bd-8ccc-4b3dde506708",
  "order_id": "fd1bd3bf-5d42-4b11-aebb-ccb3a87bd0ea",
  "assignment_id": "a7c6df29-e5d4-4734-a0e8-09ba16ab7f4d",
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
  "arrived_at": "2026-10-29T11:08:40.544074Z",
  "started_at": "2026-10-29T11:08:40.819928Z",
  "completed_at": "2026-10-29T11:08:41.120246Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "9254dd36-8d4d-4ab1-8326-8b7d2a8eae59",
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
      "id": "fb29d810-6073-4e6e-afdf-6a200e2ed1cd",
      "at": "2026-10-29T11:08:41.553977Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "fd1bd3bf-5d42-4b11-aebb-ccb3a87bd0ea"
    },
    {
      "id": "bb80ede2-1f46-42b8-a368-8133dc4f17d3",
      "at": "2026-10-29T11:08:36.927418Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/81f8bb0a-804a-4844-8ec8-b669ef80b592/archive` → **200**

```json
{
  "command_id": "dd7d58f8-7f19-42b7-8afa-003cce8b77f4",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "81f8bb0a-804a-4844-8ec8-b669ef80b592",
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
  "created_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
  "created_at": "2026-10-29T11:08:35.781303Z",
  "updated_at": "2026-10-29T11:08:44.699723Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d6624714-f8f0-4444-a923-23d5ed3d82ed",
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
  "last_heartbeat_at": "2026-10-29T11:08:40.268163Z",
  "last_location_at": "2026-10-29T11:08:40.268163Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d6624714-f8f0-4444-a923-23d5ed3d82ed/close` → **200**

```json
{
  "command_id": "a55f4284-c62d-4cd7-84b6-2379deabda59",
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

Done: order fd1bd3bf-5d42-4b11-aebb-ccb3a87bd0ea.

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
  "session_id": "c8c543db-8a36-47d7-8238-ceb5e5c9cf42",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMwMjUsImlhdCI6MTc5MzI3MjEyNSwianRpIjoiMzJlMzAxZTMtOGY1NS00NDJiLWI0NTctNDI5Mzk5NjM0ZjhkIiwic2lkIjoiYzhjNTQzZGItOGEzNi00N2Q3LTgyMzgtY2ViNWU1YzljZjQyIn0.GmmQTr5Sc8UxXSY_jneEZPN6D65Wv1K3XJJ1JKlgWsg",
  "access_expires_at": "2026-10-29T11:23:45.892555766Z",
  "refresh_token": "yC6UXhPhFe9zCfFP_d-1PXHI89kvuVgZYJEqzIOgfOI",
  "refresh_expires_at": "2026-10-29T23:08:45.892004194Z",
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
  "command_id": "462bae64-eeb9-489f-9dc3-6fe630681f28",
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
  "session_id": "86ee52e2-9191-479a-8841-c617bac58528",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMwMjcsImlhdCI6MTc5MzI3MjEyNywianRpIjoiMzc4YWNiZjctMmJmNi00ZmY2LThiY2UtZGEyYWM0MDRlY2YzIiwic2lkIjoiODZlZTUyZTItOTE5MS00NzlhLTg4NDEtYzYxN2JhYzU4NTI4In0.y_e9uSVFvsWRAdRqurE_Ckqlw_7frQcc2yBJOPmkhcg",
  "access_expires_at": "2026-10-29T11:23:47.021485648Z",
  "refresh_token": "W47zM092KqRcrOcy6FDi6Nvt81_bBbF3YD_9qYH8Iwk",
  "refresh_expires_at": "2026-10-29T23:08:47.02073142Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.1280425296",
    "linkedid": "1730052700.1280425296",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670606440"
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
    "id": "1730052700.1280425296",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "24a9bc78-94a4-439b-b5c6-6f5a559ada38",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380670606440",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T11:08:47.302668Z",
      "answered_at": null,
      "ended_at": "2026-10-29T11:08:47.326471Z",
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
    "id": "1730052600.2323930966",
    "linkedid": "1730052600.2323930966",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670606440"
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
      "id": "9b15b20c-ab20-4b8e-b49a-4ae082d7c5a7",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670606440",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T11:08:47.631955Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/9b15b20c-ab20-4b8e-b49a-4ae082d7c5a7/answer` → **200**

```json
{
  "command_id": "9dc121ef-dd84-4278-a141-4eeda7a00ff2"
}
```

```json
{
  "id": "9b15b20c-ab20-4b8e-b49a-4ae082d7c5a7",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670606440",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
  "order_ids": [],
  "started_at": "2026-10-29T11:08:47.631955Z",
  "answered_at": "2026-10-29T11:08:47.933344Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2323930966",
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
    "id": "1730052600.2323930966",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "9b15b20c-ab20-4b8e-b49a-4ae082d7c5a7",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670606440",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
      "order_ids": [],
      "started_at": "2026-10-29T11:08:47.631955Z",
      "answered_at": "2026-10-29T11:08:47.933344Z",
      "ended_at": "2026-10-29T11:08:48.224887Z",
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
      "id": "9b15b20c-ab20-4b8e-b49a-4ae082d7c5a7",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670606440",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
      "order_ids": [],
      "started_at": "2026-10-29T11:08:47.631955Z",
      "answered_at": "2026-10-29T11:08:47.933344Z",
      "ended_at": "2026-10-29T11:08:48.224887Z",
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
      "id": "9b15b20c-ab20-4b8e-b49a-4ae082d7c5a7",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670606440",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
      "order_ids": [],
      "started_at": "2026-10-29T11:08:47.631955Z",
      "answered_at": "2026-10-29T11:08:47.933344Z",
      "ended_at": "2026-10-29T11:08:48.224887Z",
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
      "id": "9b15b20c-ab20-4b8e-b49a-4ae082d7c5a7",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670606440",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
      "order_ids": [],
      "started_at": "2026-10-29T11:08:47.631955Z",
      "answered_at": "2026-10-29T11:08:47.933344Z",
      "ended_at": "2026-10-29T11:08:48.224887Z",
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
      "id": "9b15b20c-ab20-4b8e-b49a-4ae082d7c5a7",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670606440",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
      "order_ids": [],
      "started_at": "2026-10-29T11:08:47.631955Z",
      "answered_at": "2026-10-29T11:08:47.933344Z",
      "ended_at": "2026-10-29T11:08:48.224887Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T11:08:55.270109Z"
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
      "id": "9b15b20c-ab20-4b8e-b49a-4ae082d7c5a7",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670606440",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
      "order_ids": [],
      "started_at": "2026-10-29T11:08:47.631955Z",
      "answered_at": "2026-10-29T11:08:47.933344Z",
      "ended_at": "2026-10-29T11:08:48.224887Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T11:08:55.270109Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/9b15b20c-ab20-4b8e-b49a-4ae082d7c5a7/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/9b15b20c-ab20-4b8e-b49a-4ae082d7c5a7/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=9b15b20c-ab20-4b8e-b49a-4ae082d7c5a7` → **200**

```json
{
  "changes": [
    {
      "id": "5a965fe5-ce3a-402e-9277-f922a25b4601",
      "occurred_at": "2026-10-29T11:08:57.94149Z",
      "actor_type": "STAFF",
      "actor_id": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "9b15b20c-ab20-4b8e-b49a-4ae082d7c5a7",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"2772730e-5a41-4053-be83-12c3123eb7df\", \"order_ids\": []}",
      "correlation_id": "3c67409c-17a0-418f-bc2e-b9a68e3340ca"
    },
    {
      "id": "a7dee709-c07f-4aa8-a49a-67b66e562623",
      "occurred_at": "2026-10-29T11:08:57.909137Z",
      "actor_type": "STAFF",
      "actor_id": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "9b15b20c-ab20-4b8e-b49a-4ae082d7c5a7",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"2772730e-5a41-4053-be83-12c3123eb7df\", \"order_ids\": []}",
      "correlation_id": "bd8e787b-a160-42e1-8d5a-32e3f38ed5a0"
    }
  ]
}
```

Done: call 9b15b20c-ab20-4b8e-b49a-4ae082d7c5a7 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6581"
}
```

```json
{
  "challenge_id": "88191cd8-cdaf-45be-b780-01dce3945bdf",
  "expires_at": "2026-10-29T11:13:58.272337587Z",
  "resend_available_at": "2026-10-29T11:08:59.272337587Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "486504",
  "sent_at": "2026-10-29T11:08:58.289040296Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "88191cd8-cdaf-45be-b780-01dce3945bdf",
  "code": "486504",
  "device_ref": "sandbox-6581"
}
```

```json
{
  "session_id": "f81f7a10-c538-4d6e-9b05-d41eebeaa900",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MzAzOCwiaWF0IjoxNzkzMjcyMTM4LCJqdGkiOiI5NTMyMWFjZS0wYjhlLTRkYWQtOTkzZC05OWU0NTAyN2VkNjciLCJzaWQiOiJmODFmN2ExMC1jNTM4LTRkNmUtOWIwNS1kNDFlZWJlYWE5MDAifQ.YHXxIA-3z4KGGXbxCfsxN9pVZS_RhoNJLdJQuRayUy0",
  "access_expires_at": "2026-10-29T11:23:58.577507504Z",
  "refresh_token": "yj9nsajGKoJFt35zc1WuT6WaRBHfzQRvzkkNBOeB6_I",
  "refresh_expires_at": "2026-11-28T11:08:58.57656444Z",
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
  "command_id": "6132cb8c-037b-4138-b140-d7b1fa6f3b99",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:08:59Z",
    "sequence": 1793272139961
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ed1e21cc-23e1-4a23-ac38-6491ba0df31c",
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
  "last_heartbeat_at": "2026-10-29T11:08:59.116194Z",
  "last_location_at": "2026-10-29T11:08:59.116194Z",
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
  "session_id": "ab16ea46-2411-467f-b894-762cb502a63a",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMwMzksImlhdCI6MTc5MzI3MjEzOSwianRpIjoiZTIxZTliMmQtOWRlMi00ZTdmLWEwZGUtZWRhYzYxMjYyZWRjIiwic2lkIjoiYWIxNmVhNDYtMjQxMS00NjdmLWI4OTQtNzYyY2I1MDJhNjNhIn0.7SP0NNq7WPVxxZHGq60vyqoWRQSKiafdlS3sGGHZ2LI",
  "access_expires_at": "2026-10-29T11:23:59.697665629Z",
  "refresh_token": "zCbv6lHCMkU6mAkiM6Ih-TCBRV66abnQr5wIRMAAT9U",
  "refresh_expires_at": "2026-10-29T23:08:59.697014899Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "83a9ec0b-befa-4812-a521-f63eeecbda1b",
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
  "id": "6e43f043-3d42-49b8-a1b9-680e4c80086c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:13:59.978188Z",
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
  "command_id": "18d68cbe-1eb4-4123-9961-a9e11934e706",
  "quote_id": "6e43f043-3d42-49b8-a1b9-680e4c80086c",
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
    "phone": "+380671821264"
  }
}
```

```json
{
  "id": "181bb042-515f-4554-9947-bbf6523e902e",
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
  "created_at": "2026-10-29T11:09:00.272072Z",
  "caller": {
    "name": "Олена",
    "phone": "+380671821264"
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
    "id": "05ce5a28-0328-4fd8-8fbb-60ebbfbf0795",
    "order_id": "181bb042-515f-4554-9947-bbf6523e902e",
    "expires_at": "2026-10-29T11:09:15.27772Z",
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

`POST /api/driver/v1/offers/05ce5a28-0328-4fd8-8fbb-60ebbfbf0795/accept` → **200**

```json
{
  "command_id": "7b463616-ea46-4499-9c31-f757f8f564f4"
}
```

```json
{
  "id": "db9d2496-6f5b-49ce-9a6c-b9b7c8934ecf",
  "order_id": "181bb042-515f-4554-9947-bbf6523e902e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cd74a93b-5cb7-4b89-a74c-170607c1668a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380671821264` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380671821264` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380671821264` → **200**

```json
[
  {
    "phone": "+380671821264",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T11:09:02.433986969Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671821264` → **200**

```json
[
  {
    "phone": "+380671821264",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T11:09:02.433986969Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380671821264` → **200**

```json
[
  {
    "phone": "+380671821264",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T11:09:02.433986969Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cd74a93b-5cb7-4b89-a74c-170607c1668a",
  "order_id": "181bb042-515f-4554-9947-bbf6523e902e",
  "assignment_id": "db9d2496-6f5b-49ce-9a6c-b9b7c8934ecf",
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
    "phone": "+380671821264"
  }
}
```

`POST /api/driver/v1/work-sessions/ed1e21cc-23e1-4a23-ac38-6491ba0df31c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:09:03Z",
    "sequence": 1793272143516
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ed1e21cc-23e1-4a23-ac38-6491ba0df31c",
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
  "last_heartbeat_at": "2026-10-29T11:09:03.535676Z",
  "last_location_at": "2026-10-29T11:09:03.535676Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/cd74a93b-5cb7-4b89-a74c-170607c1668a/arrive` → **200**

```json
{
  "command_id": "deb60482-08d3-4bfc-82ff-a264aa5df392",
  "expected_version": 0
}
```

```json
{
  "id": "cd74a93b-5cb7-4b89-a74c-170607c1668a",
  "order_id": "181bb042-515f-4554-9947-bbf6523e902e",
  "assignment_id": "db9d2496-6f5b-49ce-9a6c-b9b7c8934ecf",
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
  "arrived_at": "2026-10-29T11:09:03.813247Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671821264"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380671821264` → **200**

```json
[
  {
    "phone": "+380671821264",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T11:09:02.433986969Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671821264` → **200**

```json
[
  {
    "phone": "+380671821264",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T11:09:02.433986969Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671821264` → **200**

```json
[
  {
    "phone": "+380671821264",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T11:09:02.433986969Z"
  },
  {
    "phone": "+380671821264",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T11:09:05.445531669Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671821264` → **200**

```json
[
  {
    "phone": "+380671821264",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T11:09:02.433986969Z"
  },
  {
    "phone": "+380671821264",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T11:09:05.445531669Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380671821264` → **200**

```json
[
  {
    "phone": "+380671821264",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T11:09:02.433986969Z"
  },
  {
    "phone": "+380671821264",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T11:09:05.445531669Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/cd74a93b-5cb7-4b89-a74c-170607c1668a/start` → **200**

```json
{
  "command_id": "cb6a569e-8b38-4d16-bf0e-dc04f2ca71d2",
  "expected_version": 1
}
```

```json
{
  "id": "cd74a93b-5cb7-4b89-a74c-170607c1668a",
  "order_id": "181bb042-515f-4554-9947-bbf6523e902e",
  "assignment_id": "db9d2496-6f5b-49ce-9a6c-b9b7c8934ecf",
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
  "arrived_at": "2026-10-29T11:09:03.813247Z",
  "started_at": "2026-10-29T11:09:06.229409Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671821264"
  }
}
```

`POST /api/driver/v1/trips/cd74a93b-5cb7-4b89-a74c-170607c1668a/complete` → **200**

```json
{
  "command_id": "1e59dceb-8256-4439-af79-00a9d1a41926",
  "expected_version": 2,
  "reported_at": "2026-10-29T11:09:06Z",
  "cash_received": true
}
```

```json
{
  "id": "cd74a93b-5cb7-4b89-a74c-170607c1668a",
  "order_id": "181bb042-515f-4554-9947-bbf6523e902e",
  "assignment_id": "db9d2496-6f5b-49ce-9a6c-b9b7c8934ecf",
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
  "arrived_at": "2026-10-29T11:09:03.813247Z",
  "started_at": "2026-10-29T11:09:06.229409Z",
  "completed_at": "2026-10-29T11:09:06.520717Z",
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
  "session_id": "ed1e21cc-23e1-4a23-ac38-6491ba0df31c",
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
  "last_heartbeat_at": "2026-10-29T11:09:03.535676Z",
  "last_location_at": "2026-10-29T11:09:03.535676Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ed1e21cc-23e1-4a23-ac38-6491ba0df31c/close` → **200**

```json
{
  "command_id": "77124ae1-6482-45db-9988-f35a369b4902",
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
  "phone": "+380636838113",
  "device_ref": "sandbox-7684"
}
```

```json
{
  "challenge_id": "bd66a2bc-d396-4d7d-a5ef-cd3936184d23",
  "expires_at": "2026-10-29T11:14:07.375416739Z",
  "resend_available_at": "2026-10-29T11:09:08.375416739Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636838113` → **200**

```json
{
  "phone": "+380636838113",
  "audience": "CLIENT",
  "code": "896369",
  "sent_at": "2026-10-29T11:09:07.379399296Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bd66a2bc-d396-4d7d-a5ef-cd3936184d23",
  "code": "896369",
  "device_ref": "sandbox-7684"
}
```

```json
{
  "session_id": "cf7c3dd8-87d4-42a1-81ec-2b5fb129d9a4",
  "subject": {
    "type": "CLIENT",
    "id": "468d372f-c511-4db4-8a1c-96a08e77a422"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NjhkMzcyZi1jNTExLTRkYjQtOGExYy05NmEwOGU3N2E0MjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMDQ3LCJpYXQiOjE3OTMyNzIxNDcsImp0aSI6IjcxMTk5ODM5LTUwYjUtNDJlNC1hNjgxLWJjMTFiOTdjZmZjMiIsInNpZCI6ImNmN2MzZGQ4LTg3ZDQtNDJhMS04MWVjLTJiNWZiMTI5ZDlhNCJ9.gOmpwgyycQrLlpHxanF8Y6EQPCSguCVnTTftY1hml8Q",
  "access_expires_at": "2026-10-29T11:24:07.687167375Z",
  "refresh_token": "Um1NbACV41i4wsuJzyb05_nJW_wW8RLxCmn6rPj89QI",
  "refresh_expires_at": "2026-11-28T11:09:07.686543618Z",
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
  "device_ref": "sandbox-19329"
}
```

```json
{
  "challenge_id": "b0f27a36-7df3-47a2-be78-bb45c0571c3b",
  "expires_at": "2026-10-29T11:14:08.231959087Z",
  "resend_available_at": "2026-10-29T11:09:09.231959087Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "592321",
  "sent_at": "2026-10-29T11:09:08.235194985Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b0f27a36-7df3-47a2-be78-bb45c0571c3b",
  "code": "592321",
  "device_ref": "sandbox-19329"
}
```

```json
{
  "session_id": "7157a217-66da-437c-bf40-1eaa3f281fe5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MzA0OCwiaWF0IjoxNzkzMjcyMTQ4LCJqdGkiOiI1MzZmNWViZS1jY2MwLTQ3NDgtODQ2Ni1kNGM5ZTU1MGE2NGQiLCJzaWQiOiI3MTU3YTIxNy02NmRhLTQzN2MtYmY0MC0xZWFhM2YyODFmZTUifQ.ttArXhvwe8A9XO4i9y4rQUliS7ufSd6wRdS_R49rxjk",
  "access_expires_at": "2026-10-29T11:24:08.531066561Z",
  "refresh_token": "oBzl3Xcw-4Mcsg_HA5vy5sAtDY6jhwtouIJyJjCduKU",
  "refresh_expires_at": "2026-11-28T11:09:08.530379555Z",
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
  "session_id": "83c239be-0f01-448f-9b69-9b628f03b3d5",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMwNDksImlhdCI6MTc5MzI3MjE0OSwianRpIjoiNDZiYTE2M2ItNmQxNy00NDNiLTg4ZTAtNWRmMmYxMGUzMmM2Iiwic2lkIjoiODNjMjM5YmUtMGYwMS00NDhmLTliNjktOWI2MjhmMDNiM2Q1In0.t2fuRCyv175AQA7DLREQvtDa7FikeoXN6kYWK1TRsyg",
  "access_expires_at": "2026-10-29T11:24:09.391467352Z",
  "refresh_token": "WKQ-8bywuoHIeFiiBMUkxAtDZcDM2rQYxqn5AL4To_8",
  "refresh_expires_at": "2026-10-29T23:09:09.390987407Z",
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
  "session_id": "a4686d51-bcae-4b26-a213-010fe5884a86",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMwNDksImlhdCI6MTc5MzI3MjE0OSwianRpIjoiNTlmMmU4MTEtZTZkNi00MDI4LTllNTYtZWRmM2Y2OTlhZTE3Iiwic2lkIjoiYTQ2ODZkNTEtYmNhZS00YjI2LWEyMTMtMDEwZmU1ODg0YTg2In0.8N9NuJ6pdTR_ScBWEm-Ers15ERjBtZRGcFzlmGwey1g",
  "access_expires_at": "2026-10-29T11:24:09.969329995Z",
  "refresh_token": "PL16EU0UAFYurf_1i6Wtf11uXwGtZ1vY-7UcEHUuV4A",
  "refresh_expires_at": "2026-10-29T23:09:09.968703237Z",
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
  "command_id": "62978dc7-62af-4036-acb3-c2027bc8dc89",
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
  "id": "2400b6dd-07ee-44c5-9b83-a855287bfcdc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:14:10.507133Z",
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
  "command_id": "5103c4d6-d2bf-4148-80a0-9e610d028a90",
  "quote_id": "2400b6dd-07ee-44c5-9b83-a855287bfcdc",
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
  "id": "a6e96b28-dd3c-4850-a6da-0a0e27cc64c5",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "468d372f-c511-4db4-8a1c-96a08e77a422",
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
  "created_at": "2026-10-29T11:09:10.79988Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6e96b28-dd3c-4850-a6da-0a0e27cc64c5` → **200**

```json
{
  "id": "a6e96b28-dd3c-4850-a6da-0a0e27cc64c5",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "468d372f-c511-4db4-8a1c-96a08e77a422",
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
  "created_at": "2026-10-29T11:09:10.79988Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a6e96b28-dd3c-4850-a6da-0a0e27cc64c5/cancel` → **200**

```json
{
  "command_id": "c90a978e-0e3f-430f-9726-630a2543f1cc",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "a6e96b28-dd3c-4850-a6da-0a0e27cc64c5",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "468d372f-c511-4db4-8a1c-96a08e77a422",
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
  "created_at": "2026-10-29T11:09:10.79988Z",
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
  "command_id": "191d22cb-23b2-47ee-bd73-c0a5793f3199",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:09:11Z",
    "sequence": 1793272151944
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "478d87a5-7305-4103-bd9a-7c47502c6924",
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
  "last_heartbeat_at": "2026-10-29T11:09:11.96391Z",
  "last_location_at": "2026-10-29T11:09:11.96391Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-9320"
}
```

```json
{
  "challenge_id": "54950a82-5298-4468-9929-b312100c6ae4",
  "expires_at": "2026-10-29T11:14:12.232719311Z",
  "resend_available_at": "2026-10-29T11:09:13.232719311Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "228262",
  "sent_at": "2026-10-29T11:09:12.236618224Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "54950a82-5298-4468-9929-b312100c6ae4",
  "code": "228262",
  "device_ref": "sandbox-9320"
}
```

```json
{
  "session_id": "60072602-2055-43dc-a6fd-31a10b893fdc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MzA1MiwiaWF0IjoxNzkzMjcyMTUyLCJqdGkiOiJlOGFkNzMwNy1jMDRkLTQyNjYtOWY4My0xMGE3OTFhOWYwZDEiLCJzaWQiOiI2MDA3MjYwMi0yMDU1LTQzZGMtYTZmZC0zMWExMGI4OTNmZGMifQ.EK9THbndJpKls9RGsqxPBcF5-k2a_PqWvzl_IO_Gjjk",
  "access_expires_at": "2026-10-29T11:24:12.535726607Z",
  "refresh_token": "kpdXywoH8sAAs29pEsrFb5Vu78oRJC87G5otYPLGpts",
  "refresh_expires_at": "2026-11-28T11:09:12.534721721Z",
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
  "command_id": "4f8262d4-f823-4380-8036-0c29388bd918",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:09:13Z",
    "sequence": 1793272153490
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7f3b4cde-4a2a-465e-89ef-c924ed1b5b4d",
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
  "last_heartbeat_at": "2026-10-29T11:09:13.068235Z",
  "last_location_at": "2026-10-29T11:09:13.068235Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bb309f69-810b-40ee-87a0-c45fc50232f2",
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
  "id": "629742ed-7304-4874-b6f3-291044a683e3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:14:13.362210Z",
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
  "command_id": "b6563998-26a7-45f6-a9bb-0074971628b1",
  "quote_id": "629742ed-7304-4874-b6f3-291044a683e3",
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
  "id": "d49061d3-6aef-4aaf-bb19-1fff5c6c4a30",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "468d372f-c511-4db4-8a1c-96a08e77a422",
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
  "created_at": "2026-10-29T11:09:13.653208Z",
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
    "id": "56cdceda-c188-42c6-9a89-b98d6f78a25f",
    "order_id": "d49061d3-6aef-4aaf-bb19-1fff5c6c4a30",
    "expires_at": "2026-10-29T11:09:28.657632Z",
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

`POST /api/driver/v1/offers/56cdceda-c188-42c6-9a89-b98d6f78a25f/accept` → **200**

```json
{
  "command_id": "d39be2f1-dae8-4ff6-86d0-39667c428c24"
}
```

```json
{
  "id": "474d3879-cf5f-482a-a061-4ac6bd2bf65e",
  "order_id": "d49061d3-6aef-4aaf-bb19-1fff5c6c4a30",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c29cd8ab-b88b-465a-a891-ff3871ed6764",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c29cd8ab-b88b-465a-a891-ff3871ed6764",
  "order_id": "d49061d3-6aef-4aaf-bb19-1fff5c6c4a30",
  "assignment_id": "474d3879-cf5f-482a-a061-4ac6bd2bf65e",
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

`POST /api/driver/v1/trips/c29cd8ab-b88b-465a-a891-ff3871ed6764/cancel` → **200**

```json
{
  "command_id": "a012f67d-ad8e-4037-8394-4cbbc5acab7b",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "c29cd8ab-b88b-465a-a891-ff3871ed6764",
  "order_id": "d49061d3-6aef-4aaf-bb19-1fff5c6c4a30",
  "assignment_id": "474d3879-cf5f-482a-a061-4ac6bd2bf65e",
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

`GET /api/rider/v1/orders/d49061d3-6aef-4aaf-bb19-1fff5c6c4a30` → **200**

```json
{
  "id": "d49061d3-6aef-4aaf-bb19-1fff5c6c4a30",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "468d372f-c511-4db4-8a1c-96a08e77a422",
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
    "id": "474d3879-cf5f-482a-a061-4ac6bd2bf65e",
    "order_id": "d49061d3-6aef-4aaf-bb19-1fff5c6c4a30",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "c29cd8ab-b88b-465a-a891-ff3871ed6764",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T11:09:13.653208Z",
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
    "id": "ae5df25c-30e8-46e8-92f0-e44dd1336edb",
    "order_id": "d49061d3-6aef-4aaf-bb19-1fff5c6c4a30",
    "expires_at": "2026-10-29T11:09:29.744874Z",
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

`POST /api/driver/v1/offers/ae5df25c-30e8-46e8-92f0-e44dd1336edb/accept` → **200**

```json
{
  "command_id": "857fc8ba-1903-4553-a5b6-a12298cc2ca0"
}
```

```json
{
  "id": "44073113-31f0-488f-bec1-52125acb3626",
  "order_id": "d49061d3-6aef-4aaf-bb19-1fff5c6c4a30",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "399a4101-6bb3-4b4e-aca9-3b2e6fa72909",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "399a4101-6bb3-4b4e-aca9-3b2e6fa72909",
  "order_id": "d49061d3-6aef-4aaf-bb19-1fff5c6c4a30",
  "assignment_id": "44073113-31f0-488f-bec1-52125acb3626",
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

`POST /api/driver/v1/trips/399a4101-6bb3-4b4e-aca9-3b2e6fa72909/cancel` → **200**

```json
{
  "command_id": "8a37a09f-9427-4175-9af6-907459ee102b",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "399a4101-6bb3-4b4e-aca9-3b2e6fa72909",
  "order_id": "d49061d3-6aef-4aaf-bb19-1fff5c6c4a30",
  "assignment_id": "44073113-31f0-488f-bec1-52125acb3626",
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
    "id": "d49061d3-6aef-4aaf-bb19-1fff5c6c4a30",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T11:09:13.653208Z",
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
    "id": "a6e96b28-dd3c-4850-a6da-0a0e27cc64c5",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T11:09:10.79988Z",
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

`GET /api/operator/v1/orders/d49061d3-6aef-4aaf-bb19-1fff5c6c4a30/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T11:09:13.654023Z",
      "actor": {
        "type": "CLIENT",
        "id": "468d372f-c511-4db4-8a1c-96a08e77a422",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d49061d3-6aef-4aaf-bb19-1fff5c6c4a30",
        "quote_id": "629742ed-7304-4874-b6f3-291044a683e3",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "1d0ace63-ed3e-4e60-86cd-68c9add805e9"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T11:09:13.656637Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d49061d3-6aef-4aaf-bb19-1fff5c6c4a30",
        "attempt_id": "21bef6e6-0564-47e9-b694-e2f0d64f01b8",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "1d0ace63-ed3e-4e60-86cd-68c9add805e9"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T11:09:13.663534Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "56cdceda-c188-42c6-9a89-b98d6f78a25f",
        "order_id": "d49061d3-6aef-4aaf-bb19-1fff5c6c4a30",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "1d0ace63-ed3e-4e60-86cd-68c9add805e9"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T11:09:14.204816Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "56cdceda-c188-42c6-9a89-b98d6f78a25f",
        "order_id": "d49061d3-6aef-4aaf-bb19-1fff5c6c4a30",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "474d3879-cf5f-482a-a061-4ac6bd2bf65e"
      },
      "correlation_id": "7583bcef-18b8-41fb-98ee-8c84be674b71"
```

Done: orders a6e96b28-dd3c-4850-a6da-0a0e27cc64c5, d49061d3-6aef-4aaf-bb19-1fff5c6c4a30.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738807315",
  "device_ref": "sandbox-1484"
}
```

```json
{
  "challenge_id": "a92c2f1c-18d9-4323-812b-e4cb38091ccc",
  "expires_at": "2026-10-29T11:14:16.997476567Z",
  "resend_available_at": "2026-10-29T11:09:17.997476567Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738807315` → **200**

```json
{
  "phone": "+380738807315",
  "audience": "CLIENT",
  "code": "712463",
  "sent_at": "2026-10-29T11:09:17.000432267Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a92c2f1c-18d9-4323-812b-e4cb38091ccc",
  "code": "712463",
  "device_ref": "sandbox-1484"
}
```

```json
{
  "session_id": "8cf41fc1-efac-4e33-a8b5-26415ec4c8a5",
  "subject": {
    "type": "CLIENT",
    "id": "4eee530e-25a5-44f8-bc26-d9ec99b50308"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWVlNTMwZS0yNWE1LTQ0ZjgtYmMyNi1kOWVjOTliNTAzMDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMDU3LCJpYXQiOjE3OTMyNzIxNTcsImp0aSI6IjEwZDIxMWUxLThlMzktNGY0Mi1iZDQyLWU4MzYwOWY0YjJiNyIsInNpZCI6IjhjZjQxZmMxLWVmYWMtNGUzMy1hOGI1LTI2NDE1ZWM0YzhhNSJ9.m4eHwvx29Ox3st6wZDuqwJhv0e6freXJwwenLTHoWZU",
  "access_expires_at": "2026-10-29T11:24:17.300912609Z",
  "refresh_token": "qPt5e6R6hd3GgNh6-unIe9tmPMufbVeU037Vrkcjrdk",
  "refresh_expires_at": "2026-11-28T11:09:17.300467963Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "38cfc824-0414-4c0f-adc3-d37680dad93c",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "54a25619-af16-498b-8f19-d6be6367f8ff",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-54a25619-af16-498b-8f19-d6be6367f8ff",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "76a61194e01ff0b37907c8682de0e3a4",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=54a25619-af16-498b-8f19-d6be6367f8ff",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738807315"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=54a25619-af16-498b-8f19-d6be6367f8ff",
  "expires_at": "2026-10-29T11:39:17.585351Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/54a25619-af16-498b-8f19-d6be6367f8ff` → **200**

```json
{
  "id": "54a25619-af16-498b-8f19-d6be6367f8ff",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T11:39:17.585351Z",
  "card": {
    "id": "98af9a61-a20e-4aea-be88-4621c1395ee5",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****9450",
    "card_type": "Visa",
    "created_at": "2026-10-29T11:09:17.872434Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "98af9a61-a20e-4aea-be88-4621c1395ee5",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****9450",
      "card_type": "Visa",
      "created_at": "2026-10-29T11:09:17.872434Z"
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
  "device_ref": "sandbox-15059"
}
```

```json
{
  "challenge_id": "0e705c5d-9cbf-46f5-b5ca-580bd9b2e50b",
  "expires_at": "2026-10-29T11:14:18.449184612Z",
  "resend_available_at": "2026-10-29T11:09:19.449184612Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "813891",
  "sent_at": "2026-10-29T11:09:18.453093622Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0e705c5d-9cbf-46f5-b5ca-580bd9b2e50b",
  "code": "813891",
  "device_ref": "sandbox-15059"
}
```

```json
{
  "session_id": "f5dd35cd-e671-4d40-b05f-869848d9c594",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MzA1OCwiaWF0IjoxNzkzMjcyMTU4LCJqdGkiOiI1ZDA0M2E3My05ZDg2LTRlMWQtYWI3Yi0yNDUwNThhMWI5ZjgiLCJzaWQiOiJmNWRkMzVjZC1lNjcxLTRkNDAtYjA1Zi04Njk4NDhkOWM1OTQifQ.kGOqvU88BPXZW6U0OMEBMzBidsxcqYY8YrgYAz2r7kw",
  "access_expires_at": "2026-10-29T11:24:18.754457084Z",
  "refresh_token": "f3OiTuuIBQdmx2jWmXkcuabgdyjGr6xJALWcQdcjHJI",
  "refresh_expires_at": "2026-11-28T11:09:18.753781674Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7f3b4cde-4a2a-465e-89ef-c924ed1b5b4d",
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
  "last_heartbeat_at": "2026-10-29T11:09:13.068235Z",
  "last_location_at": "2026-10-29T11:09:13.068235Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7f3b4cde-4a2a-465e-89ef-c924ed1b5b4d/handover` → **200**

```json
{
  "command_id": "882c33eb-a55f-491e-b293-e7e1ce9c7565",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7f3b4cde-4a2a-465e-89ef-c924ed1b5b4d",
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
  "last_heartbeat_at": "2026-10-29T11:09:13.068235Z",
  "last_location_at": "2026-10-29T11:09:13.068235Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7f3b4cde-4a2a-465e-89ef-c924ed1b5b4d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:09:19Z",
    "sequence": 1793272159568
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7f3b4cde-4a2a-465e-89ef-c924ed1b5b4d",
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
  "last_heartbeat_at": "2026-10-29T11:09:19.586388Z",
  "last_location_at": "2026-10-29T11:09:19.586388Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "41c32985-f23a-4f8a-8ed9-57d3ea3ef555",
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
  "id": "c54d40b2-8958-471e-8c21-db5ca42a4691",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:14:19.872248Z",
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
  "command_id": "6bb01dda-62ef-48de-b0f7-308548ed03b0",
  "quote_id": "c54d40b2-8958-471e-8c21-db5ca42a4691",
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
  "id": "3e24e886-1ab6-48e1-b7e3-01cf556f6bad",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4eee530e-25a5-44f8-bc26-d9ec99b50308",
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
  "created_at": "2026-10-29T11:09:20.157948Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3e24e886-1ab6-48e1-b7e3-01cf556f6bad` → **200**

```json
{
  "id": "3e24e886-1ab6-48e1-b7e3-01cf556f6bad",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4eee530e-25a5-44f8-bc26-d9ec99b50308",
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
  "created_at": "2026-10-29T11:09:20.157948Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3e24e886-1ab6-48e1-b7e3-01cf556f6bad` → **200**

```json
{
  "id": "3e24e886-1ab6-48e1-b7e3-01cf556f6bad",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4eee530e-25a5-44f8-bc26-d9ec99b50308",
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
  "created_at": "2026-10-29T11:09:20.157948Z",
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
    "id": "3b4daff6-79bb-4410-8929-a529b5b0b1de",
    "order_id": "3e24e886-1ab6-48e1-b7e3-01cf556f6bad",
    "expires_at": "2026-10-29T11:09:35.841055Z",
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

`POST /api/driver/v1/offers/3b4daff6-79bb-4410-8929-a529b5b0b1de/accept` → **200**

```json
{
  "command_id": "c6b04994-f25d-46fe-b138-1f74f6e45dfc"
}
```

```json
{
  "id": "69be360a-1356-4c69-b469-1c56e0bc2b86",
  "order_id": "3e24e886-1ab6-48e1-b7e3-01cf556f6bad",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "974cec4c-6559-4c36-b1a9-963e43770469",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "974cec4c-6559-4c36-b1a9-963e43770469",
  "order_id": "3e24e886-1ab6-48e1-b7e3-01cf556f6bad",
  "assignment_id": "69be360a-1356-4c69-b469-1c56e0bc2b86",
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

`POST /api/driver/v1/work-sessions/7f3b4cde-4a2a-465e-89ef-c924ed1b5b4d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:09:22Z",
    "sequence": 1793272162811
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7f3b4cde-4a2a-465e-89ef-c924ed1b5b4d",
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
  "last_heartbeat_at": "2026-10-29T11:09:22.830132Z",
  "last_location_at": "2026-10-29T11:09:22.830132Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/974cec4c-6559-4c36-b1a9-963e43770469/arrive` → **200**

```json
{
  "command_id": "42bb7066-3a4e-4914-9ddc-dbf5ae0882df",
  "expected_version": 0
}
```

```json
{
  "id": "974cec4c-6559-4c36-b1a9-963e43770469",
  "order_id": "3e24e886-1ab6-48e1-b7e3-01cf556f6bad",
  "assignment_id": "69be360a-1356-4c69-b469-1c56e0bc2b86",
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
  "arrived_at": "2026-10-29T11:09:23.110775Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/974cec4c-6559-4c36-b1a9-963e43770469/start` → **200**

```json
{
  "command_id": "361f954c-021b-4ec6-bfb7-a35c5e09f7c8",
  "expected_version": 1
}
```

```json
{
  "id": "974cec4c-6559-4c36-b1a9-963e43770469",
  "order_id": "3e24e886-1ab6-48e1-b7e3-01cf556f6bad",
  "assignment_id": "69be360a-1356-4c69-b469-1c56e0bc2b86",
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
  "arrived_at": "2026-10-29T11:09:23.110775Z",
  "started_at": "2026-10-29T11:09:23.394174Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/974cec4c-6559-4c36-b1a9-963e43770469/complete` → **200**

```json
{
  "command_id": "b02763df-4107-4a2d-9b57-13bb28a0c377",
  "expected_version": 2,
  "reported_at": "2026-10-29T11:09:23Z",
  "cash_received": true
}
```

```json
{
  "id": "974cec4c-6559-4c36-b1a9-963e43770469",
  "order_id": "3e24e886-1ab6-48e1-b7e3-01cf556f6bad",
  "assignment_id": "69be360a-1356-4c69-b469-1c56e0bc2b86",
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
  "arrived_at": "2026-10-29T11:09:23.110775Z",
  "started_at": "2026-10-29T11:09:23.394174Z",
  "completed_at": "2026-10-29T11:09:23.684183Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/3e24e886-1ab6-48e1-b7e3-01cf556f6bad` → **200**

```json
{
  "id": "3e24e886-1ab6-48e1-b7e3-01cf556f6bad",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "4eee530e-25a5-44f8-bc26-d9ec99b50308",
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
    "id": "69be360a-1356-4c69-b469-1c56e0bc2b86",
    "order_id": "3e24e886-1ab6-48e1-b7e3-01cf556f6bad",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "974cec4c-6559-4c36-b1a9-963e43770469",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T11:09:20.157948Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3e24e886-1ab6-48e1-b7e3-01cf556f6bad` → **200**

```json
{
  "id": "3e24e886-1ab6-48e1-b7e3-01cf556f6bad",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "4eee530e-25a5-44f8-bc26-d9ec99b50308",
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
    "id": "69be360a-1356-4c69-b469-1c56e0bc2b86",
    "order_id": "3e24e886-1ab6-48e1-b7e3-01cf556f6bad",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "974cec4c-6559-4c36-b1a9-963e43770469",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T11:09:20.157948Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3e24e886-1ab6-48e1-b7e3-01cf556f6bad` → **200**

```json
{
  "id": "3e24e886-1ab6-48e1-b7e3-01cf556f6bad",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "4eee530e-25a5-44f8-bc26-d9ec99b50308",
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
    "id": "69be360a-1356-4c69-b469-1c56e0bc2b86",
    "order_id": "3e24e886-1ab6-48e1-b7e3-01cf556f6bad",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "974cec4c-6559-4c36-b1a9-963e43770469",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T11:09:20.157948Z",
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

`GET /api/rider/v1/orders/3e24e886-1ab6-48e1-b7e3-01cf556f6bad/tip` → **200**

```json
{
  "order_id": "3e24e886-1ab6-48e1-b7e3-01cf556f6bad",
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
  "available_until": "2026-10-30T11:09:23.684183Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/3e24e886-1ab6-48e1-b7e3-01cf556f6bad/tip` → **201**

```json
{
  "command_id": "09ea3ab2-8026-46a3-8138-eb3acba54edc",
  "amount_minor": 2500
}
```

```json
{
  "id": "8a43c705-c248-46c6-917d-b4055bce84d2",
  "order_id": "3e24e886-1ab6-48e1-b7e3-01cf556f6bad",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T11:09:27.380745Z"
}
```

`GET /api/rider/v1/orders/3e24e886-1ab6-48e1-b7e3-01cf556f6bad/tip` → **200**

```json
{
  "order_id": "3e24e886-1ab6-48e1-b7e3-01cf556f6bad",
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
  "available_until": "2026-10-30T11:09:23.684183Z",
  "open": false,
  "tip": {
    "id": "8a43c705-c248-46c6-917d-b4055bce84d2",
    "order_id": "3e24e886-1ab6-48e1-b7e3-01cf556f6bad",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T11:09:27.380745Z"
  }
}
```

`GET /api/rider/v1/orders/3e24e886-1ab6-48e1-b7e3-01cf556f6bad/tip` → **200**

```json
{
  "order_id": "3e24e886-1ab6-48e1-b7e3-01cf556f6bad",
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
  "available_until": "2026-10-30T11:09:23.684183Z",
  "open": false,
  "tip": {
    "id": "8a43c705-c248-46c6-917d-b4055bce84d2",
    "order_id": "3e24e886-1ab6-48e1-b7e3-01cf556f6bad",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T11:09:27.380745Z"
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
      "id": "b087061f-ffab-4877-a550-249a66021cba",
      "at": "2026-10-29T11:09:28.973229Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3e24e886-1ab6-48e1-b7e3-01cf556f6bad",
      "counterpart_id": null
    },
    {
      "id": "bd657b34-1e83-4df5-ad40-b6772ec05035",
      "at": "2026-10-29T11:09:23.902629Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3e24e886-1ab6-48e1-b7e3-01cf556f6bad",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "087ca10e-2fdd-479b-b6d2-a40c384de579",
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
  "id": "31c8acd7-ad18-46a5-9196-622764a85ff4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:14:29.493951Z",
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
  "session_id": "ace10199-31d5-441d-81e5-01e98e68d540",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMwNzAsImlhdCI6MTc5MzI3MjE3MCwianRpIjoiZDIwMzliOTItNTFlMi00MTE1LWJiZjItNjIwZmNmMjNlYjg3Iiwic2lkIjoiYWNlMTAxOTktMzFkNS00NDFkLTgxZTUtMDFlOThlNjhkNTQwIn0.gVPsBP9PCNZzCs5c42gEXjSN5KPNIS7Y8-HIZ-OepQM",
  "access_expires_at": "2026-10-29T11:24:30.084342976Z",
  "refresh_token": "KhDmGKnTF1nWeVyBrn8ufHEPcTU7iTYkROF6Nbg8RLQ",
  "refresh_expires_at": "2026-10-29T23:09:30.083892127Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380738807315` → **200**

```json
{
  "client_id": "4eee530e-25a5-44f8-bc26-d9ec99b50308"
}
```

`POST /api/admin/v1/rider-wallets/4eee530e-25a5-44f8-bc26-d9ec99b50308/top-ups` → **201**

```json
{
  "command_id": "66f62d72-b065-43d4-bca2-5ce5e4f9996d",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "4eee530e-25a5-44f8-bc26-d9ec99b50308",
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
      "id": "48102727-d750-4cd2-98a8-ac7c337de853",
      "at": "2026-10-29T11:09:30.624221Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8c010339-bceb-42c8-ba15-6ba06d268709",
  "quote_id": "31c8acd7-ad18-46a5-9196-622764a85ff4",
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
  "id": "9e38c05b-da37-4037-8902-39418a27b6f4",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4eee530e-25a5-44f8-bc26-d9ec99b50308",
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
  "created_at": "2026-10-29T11:09:30.9118Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9e38c05b-da37-4037-8902-39418a27b6f4` → **200**

```json
{
  "id": "9e38c05b-da37-4037-8902-39418a27b6f4",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4eee530e-25a5-44f8-bc26-d9ec99b50308",
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
  "created_at": "2026-10-29T11:09:30.9118Z",
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
    "id": "d981d60b-f4d3-49ec-9ead-5a622f6d1dd4",
    "order_id": "9e38c05b-da37-4037-8902-39418a27b6f4",
    "expires_at": "2026-10-29T11:09:45.917848Z",
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

`POST /api/driver/v1/offers/d981d60b-f4d3-49ec-9ead-5a622f6d1dd4/accept` → **200**

```json
{
  "command_id": "fc6a443b-a925-4c6f-8951-c1467acf7fcf"
}
```

```json
{
  "id": "d42649bd-af33-4b73-97f5-20dd261d8bf6",
  "order_id": "9e38c05b-da37-4037-8902-39418a27b6f4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "90cfe4cf-3cdd-4723-a8e6-6f97ffb29d76",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "90cfe4cf-3cdd-4723-a8e6-6f97ffb29d76",
  "order_id": "9e38c05b-da37-4037-8902-39418a27b6f4",
  "assignment_id": "d42649bd-af33-4b73-97f5-20dd261d8bf6",
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

`POST /api/driver/v1/work-sessions/7f3b4cde-4a2a-465e-89ef-c924ed1b5b4d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:09:32Z",
    "sequence": 1793272172302
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7f3b4cde-4a2a-465e-89ef-c924ed1b5b4d",
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
  "last_heartbeat_at": "2026-10-29T11:09:32.322253Z",
  "last_location_at": "2026-10-29T11:09:32.322253Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/90cfe4cf-3cdd-4723-a8e6-6f97ffb29d76/arrive` → **200**

```json
{
  "command_id": "110e2971-04de-4da2-b25e-4d1aac5255bd",
  "expected_version": 0
}
```

```json
{
  "id": "90cfe4cf-3cdd-4723-a8e6-6f97ffb29d76",
  "order_id": "9e38c05b-da37-4037-8902-39418a27b6f4",
  "assignment_id": "d42649bd-af33-4b73-97f5-20dd261d8bf6",
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
  "arrived_at": "2026-10-29T11:09:32.606078Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/90cfe4cf-3cdd-4723-a8e6-6f97ffb29d76/start` → **200**

```json
{
  "command_id": "ea536cf1-b65d-4601-bd83-ff6638dfe1fe",
  "expected_version": 1
}
```

```json
{
  "id": "90cfe4cf-3cdd-4723-a8e6-6f97ffb29d76",
  "order_id": "9e38c05b-da37-4037-8902-39418a27b6f4",
  "assignment_id": "d42649bd-af33-4b73-97f5-20dd261d8bf6",
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
  "arrived_at": "2026-10-29T11:09:32.606078Z",
  "started_at": "2026-10-29T11:09:32.903223Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/90cfe4cf-3cdd-4723-a8e6-6f97ffb29d76/complete` → **200**

```json
{
  "command_id": "126ef0a5-d47d-4a10-857f-ab8731bdae6d",
  "expected_version": 2,
  "reported_at": "2026-10-29T11:09:33Z",
  "cash_received": true
}
```

```json
{
  "id": "90cfe4cf-3cdd-4723-a8e6-6f97ffb29d76",
  "order_id": "9e38c05b-da37-4037-8902-39418a27b6f4",
  "assignment_id": "d42649bd-af33-4b73-97f5-20dd261d8bf6",
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
  "arrived_at": "2026-10-29T11:09:32.606078Z",
  "started_at": "2026-10-29T11:09:32.903223Z",
  "completed_at": "2026-10-29T11:09:33.184598Z",
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
  "client_id": "4eee530e-25a5-44f8-bc26-d9ec99b50308",
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
      "id": "48102727-d750-4cd2-98a8-ac7c337de853",
      "at": "2026-10-29T11:09:30.624221Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
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

`GET /api/rider/v1/orders/9e38c05b-da37-4037-8902-39418a27b6f4/tip` → **200**

```json
{
  "order_id": "9e38c05b-da37-4037-8902-39418a27b6f4",
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
  "available_until": "2026-10-30T11:09:33.184598Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/9e38c05b-da37-4037-8902-39418a27b6f4/tip` → **201**

```json
{
  "command_id": "73026735-6087-4deb-b4e3-c26b22763df7",
  "amount_minor": 2500
}
```

```json
{
  "id": "74e84788-41cc-4f0c-a0d2-eecdc78e37ef",
  "order_id": "9e38c05b-da37-4037-8902-39418a27b6f4",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T11:09:34.270552Z"
}
```

`GET /api/rider/v1/orders/9e38c05b-da37-4037-8902-39418a27b6f4/tip` → **200**

```json
{
  "order_id": "9e38c05b-da37-4037-8902-39418a27b6f4",
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
  "available_until": "2026-10-30T11:09:33.184598Z",
  "open": false,
  "tip": {
    "id": "74e84788-41cc-4f0c-a0d2-eecdc78e37ef",
    "order_id": "9e38c05b-da37-4037-8902-39418a27b6f4",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T11:09:34.270552Z"
  }
}
```

`GET /api/rider/v1/orders/9e38c05b-da37-4037-8902-39418a27b6f4/tip` → **200**

```json
{
  "order_id": "9e38c05b-da37-4037-8902-39418a27b6f4",
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
  "available_until": "2026-10-30T11:09:33.184598Z",
  "open": false,
  "tip": {
    "id": "74e84788-41cc-4f0c-a0d2-eecdc78e37ef",
    "order_id": "9e38c05b-da37-4037-8902-39418a27b6f4",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T11:09:34.270552Z"
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
      "id": "38193a50-3366-4636-aadc-b474979c1b3f",
      "at": "2026-10-29T11:09:36.041032Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "9e38c05b-da37-4037-8902-39418a27b6f4",
      "counterpart_id": null
    },
    {
      "id": "a7646473-102f-4e4d-98d8-9d2877802596",
      "at": "2026-10-29T11:09:34.017657Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "9e38c05b-da37-4037-8902-39418a27b6f4",
      "counterpart_id": null
    },
    {
      "id": "b087061f-ffab-4877-a550-249a66021cba",
      "at": "2026-10-29T11:09:28.973229Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3e24e886-1ab6-48e1-b7e3-01cf556f6bad",
      "counterpart_id": null
    },
    {
      "id": "bd657b34-1e83-4df5-ad40-b6772ec05035",
      "at": "2026-10-29T11:09:23.902629Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3e24e886-1ab6-48e1-b7e3-01cf556f6bad",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7f3b4cde-4a2a-465e-89ef-c924ed1b5b4d",
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
  "last_heartbeat_at": "2026-10-29T11:09:32.322253Z",
  "last_location_at": "2026-10-29T11:09:32.322253Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7f3b4cde-4a2a-465e-89ef-c924ed1b5b4d/close` → **200**

```json
{
  "command_id": "4653aaf2-9a84-4f28-a935-2e90a62c92f1",
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

Done: card order 9e38c05b-da37-4037-8902-39418a27b6f4.

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
  "phone": "+380733552864",
  "device_ref": "sandbox-22450"
}
```

```json
{
  "challenge_id": "ba6faef2-a9f1-43d8-80c7-2d5b905b7cef",
  "expires_at": "2026-10-29T11:14:37.185022611Z",
  "resend_available_at": "2026-10-29T11:09:38.185022611Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380733552864` → **200**

```json
{
  "phone": "+380733552864",
  "audience": "CLIENT",
  "code": "152436",
  "sent_at": "2026-10-29T11:09:37.187820972Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ba6faef2-a9f1-43d8-80c7-2d5b905b7cef",
  "code": "152436",
  "device_ref": "sandbox-22450"
}
```

```json
{
  "session_id": "84c738e9-e3d7-45f4-a04a-3315fdc8a8b3",
  "subject": {
    "type": "CLIENT",
    "id": "eeaaaef1-478f-4a56-b7ea-32ce87576b95"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWFhYWVmMS00NzhmLTRhNTYtYjdlYS0zMmNlODc1NzZiOTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMDc3LCJpYXQiOjE3OTMyNzIxNzcsImp0aSI6IjNkNzY4ZDRkLWZiMGItNDRlNy1hOWM5LTVkNGE4M2Y5MTJlZSIsInNpZCI6Ijg0YzczOGU5LWUzZDctNDVmNC1hMDRhLTMzMTVmZGM4YThiMyJ9.vfy50njwAP1vooVFjTf5wH7UX4_yO9Ilt3JWTXq5GuA",
  "access_expires_at": "2026-10-29T11:24:37.485047176Z",
  "refresh_token": "WoxamNRQL8BwWziznuvZN7h3KB9V0oK4CBZNmZaDEyk",
  "refresh_expires_at": "2026-11-28T11:09:37.484505872Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "10b04454-0cea-438d-a09c-d462ee831e5a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "4bb5a275-5c6f-465a-a8cf-aff604f76a76",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-4bb5a275-5c6f-465a-a8cf-aff604f76a76",
    "orderDate": "1793272177",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "bed6fba5d2526b78795a769237a92255",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=4bb5a275-5c6f-465a-a8cf-aff604f76a76",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733552864"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=4bb5a275-5c6f-465a-a8cf-aff604f76a76",
  "created_at": "2026-10-29T11:09:37.755735Z",
  "expires_at": "2026-10-29T11:39:37.755735Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/4bb5a275-5c6f-465a-a8cf-aff604f76a76` → **200**

```json
{
  "id": "4bb5a275-5c6f-465a-a8cf-aff604f76a76",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T11:09:37.755735Z",
  "expires_at": "2026-10-29T11:39:37.755735Z",
  "completed_at": "2026-10-29T11:09:38.040871Z",
  "masked_pan": "41****7319",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "eeaaaef1-478f-4a56-b7ea-32ce87576b95",
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
      "id": "98b0ad15-2841-4ca3-8f17-9bb5ed66df43",
      "at": "2026-10-29T11:09:38.056477Z",
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
  "client_id": "eeaaaef1-478f-4a56-b7ea-32ce87576b95",
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
      "id": "98b0ad15-2841-4ca3-8f17-9bb5ed66df43",
      "at": "2026-10-29T11:09:38.056477Z",
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
  "device_ref": "sandbox-4627"
}
```

```json
{
  "challenge_id": "41893b16-50f2-418b-9535-11c282a292e7",
  "expires_at": "2026-10-29T11:14:38.861423093Z",
  "resend_available_at": "2026-10-29T11:09:39.861423093Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "783451",
  "sent_at": "2026-10-29T11:09:38.864793594Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "41893b16-50f2-418b-9535-11c282a292e7",
  "code": "783451",
  "device_ref": "sandbox-4627"
}
```

```json
{
  "session_id": "376caf03-c5b0-47dc-afa8-ff886ffa1834",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MzA3OSwiaWF0IjoxNzkzMjcyMTc5LCJqdGkiOiI1ZGE4N2FmMC0wZGViLTQxZGYtYjRkOS0wYTM2N2I5NjM1MjMiLCJzaWQiOiIzNzZjYWYwMy1jNWIwLTQ3ZGMtYWZhOC1mZjg4NmZmYTE4MzQifQ.X43F4OJR0cAvDHn9Fs6q3zMCjh_7_9dkWs1Q9J7qyxM",
  "access_expires_at": "2026-10-29T11:24:39.151600626Z",
  "refresh_token": "lHJDycdEY1-4_GeRQdaHJlOFYgzYw818--c7pNTwcpc",
  "refresh_expires_at": "2026-11-28T11:09:39.150943118Z",
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
  "command_id": "2e55c42a-bc2c-417a-bf4f-961cfa5407f1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "920820a4-7653-4f28-9d01-adfb3543de8d",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-920820a4-7653-4f28-9d01-adfb3543de8d",
    "orderDate": "1793272179",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "a7297c8e5494388f2fc03ed7f521e6a2",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=920820a4-7653-4f28-9d01-adfb3543de8d",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=920820a4-7653-4f28-9d01-adfb3543de8d",
  "created_at": "2026-10-29T11:09:39.712994Z",
  "expires_at": "2026-10-29T11:39:39.712994Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/920820a4-7653-4f28-9d01-adfb3543de8d` → **200**

```json
{
  "id": "920820a4-7653-4f28-9d01-adfb3543de8d",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T11:09:39.712994Z",
  "expires_at": "2026-10-29T11:39:39.712994Z",
  "completed_at": "2026-10-29T11:09:39.993643Z",
  "masked_pan": "41****5403",
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
      "id": "8fe8c35c-5003-4250-bc91-f8cf6fcdfcaa",
      "at": "2026-10-29T11:09:40.064349Z",
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
  "command_id": "03727d58-844b-4c61-9e1f-04b90bdffae5",
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
  "correlation_id": "56419897-113f-4593-a7b0-af742744fb1d"
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
  "device_ref": "sandbox-20635"
}
```

```json
{
  "challenge_id": "376720b9-9595-44c6-b262-6838d7305ec0",
  "expires_at": "2026-10-29T11:14:40.834459994Z",
  "resend_available_at": "2026-10-29T11:09:41.834459994Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "618865",
  "sent_at": "2026-10-29T11:09:40.837415982Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "376720b9-9595-44c6-b262-6838d7305ec0",
  "code": "618865",
  "device_ref": "sandbox-20635"
}
```

```json
{
  "session_id": "da9d5f1a-a0c5-4f20-a148-36a5fd8ac681",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MzA4MSwiaWF0IjoxNzkzMjcyMTgxLCJqdGkiOiJhMDQxMjdiZi04NDFlLTRmM2EtOGNhZS0yNDdhM2Y3NzlkYzUiLCJzaWQiOiJkYTlkNWYxYS1hMGM1LTRmMjAtYTE0OC0zNmE1ZmQ4YWM2ODEifQ.NAcoQNs6MEKWsaBIr1zc96vgKOij5sqgHuADYOnpd0s",
  "access_expires_at": "2026-10-29T11:24:41.123668267Z",
  "refresh_token": "qpETGfgThAZV76_jLeQIPWkYLQdbRC27l6qR4mXV8yo",
  "refresh_expires_at": "2026-11-28T11:09:41.12321126Z",
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
  "command_id": "f01f58c8-5088-47cd-ad65-f785be687118",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:09:41Z",
    "sequence": 1793272181651
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8f630953-835a-4c86-b28f-405929eb4dc5",
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
  "last_heartbeat_at": "2026-10-29T11:09:41.669572Z",
  "last_location_at": "2026-10-29T11:09:41.669572Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630897083",
  "device_ref": "sandbox-7800"
}
```

```json
{
  "challenge_id": "152b636f-5ca5-4d10-a6b4-08f8332ba5c9",
  "expires_at": "2026-10-29T11:14:41.94725525Z",
  "resend_available_at": "2026-10-29T11:09:42.94725525Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630897083` → **200**

```json
{
  "phone": "+380630897083",
  "audience": "CLIENT",
  "code": "463322",
  "sent_at": "2026-10-29T11:09:41.94983835Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "152b636f-5ca5-4d10-a6b4-08f8332ba5c9",
  "code": "463322",
  "device_ref": "sandbox-7800"
}
```

```json
{
  "session_id": "2688e428-2b45-411f-8547-83d325851879",
  "subject": {
    "type": "CLIENT",
    "id": "8246461b-1338-4def-9d6c-0eb76d7b9a82"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MjQ2NDYxYi0xMzM4LTRkZWYtOWQ2Yy0wZWI3NmQ3YjlhODIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMDgyLCJpYXQiOjE3OTMyNzIxODIsImp0aSI6IjI5YjE0ODUzLThiYzQtNDYzZC1hOGNhLTNhOGVkNmNjODg3YyIsInNpZCI6IjI2ODhlNDI4LTJiNDUtNDExZi04NTQ3LTgzZDMyNTg1MTg3OSJ9.bWzg3xSU4MC_YzVq039RJhFVvgrPktyaFP5Wp_zM90Y",
  "access_expires_at": "2026-10-29T11:24:42.238810695Z",
  "refresh_token": "AH3Hwu3L3m5GgtDjBACrD8bfX0Rm95M_9NB0ZBaLN2Q",
  "refresh_expires_at": "2026-11-28T11:09:42.238405611Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "756903e1-bd39-4c92-b59b-a1eab1baa8e8",
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
  "id": "76649ded-d399-43b6-acbe-3a2e67150b10",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:14:42.513113Z",
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
  "command_id": "17d30a61-26a9-416f-9d19-83e6214b15d8",
  "quote_id": "76649ded-d399-43b6-acbe-3a2e67150b10",
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
  "id": "0586c1af-1bf3-489f-aa99-c9c06948bed0",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8246461b-1338-4def-9d6c-0eb76d7b9a82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T11:09:42.8012Z",
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
    "id": "3ef7caa6-5ff6-4fe5-ba22-35be1cf45fbd",
    "order_id": "0586c1af-1bf3-489f-aa99-c9c06948bed0",
    "expires_at": "2026-10-29T11:09:57.803927Z",
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

`POST /api/driver/v1/offers/3ef7caa6-5ff6-4fe5-ba22-35be1cf45fbd/accept` → **200**

```json
{
  "command_id": "a5f885dc-7a9e-4eb5-bc3c-1f051b88599f"
}
```

```json
{
  "id": "74d73e9c-ecbe-4af3-985a-2777cac99a6d",
  "order_id": "0586c1af-1bf3-489f-aa99-c9c06948bed0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3fcdb1ff-902a-4a26-b6ec-634d507053f0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3fcdb1ff-902a-4a26-b6ec-634d507053f0",
  "order_id": "0586c1af-1bf3-489f-aa99-c9c06948bed0",
  "assignment_id": "74d73e9c-ecbe-4af3-985a-2777cac99a6d",
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

`POST /api/driver/v1/work-sessions/8f630953-835a-4c86-b28f-405929eb4dc5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:09:43Z",
    "sequence": 1793272183880
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8f630953-835a-4c86-b28f-405929eb4dc5",
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
  "last_heartbeat_at": "2026-10-29T11:09:43.898948Z",
  "last_location_at": "2026-10-29T11:09:43.898948Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3fcdb1ff-902a-4a26-b6ec-634d507053f0/arrive` → **200**

```json
{
  "command_id": "ccaa6b0a-4d2e-4131-96a2-91a4cb5391eb",
  "expected_version": 0
}
```

```json
{
  "id": "3fcdb1ff-902a-4a26-b6ec-634d507053f0",
  "order_id": "0586c1af-1bf3-489f-aa99-c9c06948bed0",
  "assignment_id": "74d73e9c-ecbe-4af3-985a-2777cac99a6d",
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
  "arrived_at": "2026-10-29T11:09:44.180021Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3fcdb1ff-902a-4a26-b6ec-634d507053f0/start` → **200**

```json
{
  "command_id": "954963cf-7b01-41c9-950b-01ae412d5ffe",
  "expected_version": 1
}
```

```json
{
  "id": "3fcdb1ff-902a-4a26-b6ec-634d507053f0",
  "order_id": "0586c1af-1bf3-489f-aa99-c9c06948bed0",
  "assignment_id": "74d73e9c-ecbe-4af3-985a-2777cac99a6d",
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
  "arrived_at": "2026-10-29T11:09:44.180021Z",
  "started_at": "2026-10-29T11:09:44.46809Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3fcdb1ff-902a-4a26-b6ec-634d507053f0/complete` → **200**

```json
{
  "command_id": "9b8cd4c1-9958-42cb-b133-a2f6a1d37320",
  "expected_version": 2,
  "reported_at": "2026-10-29T11:09:44Z",
  "cash_received": false
}
```

```json
{
  "id": "3fcdb1ff-902a-4a26-b6ec-634d507053f0",
  "order_id": "0586c1af-1bf3-489f-aa99-c9c06948bed0",
  "assignment_id": "74d73e9c-ecbe-4af3-985a-2777cac99a6d",
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
  "arrived_at": "2026-10-29T11:09:44.180021Z",
  "started_at": "2026-10-29T11:09:44.46809Z",
  "completed_at": "2026-10-29T11:09:44.751863Z",
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
  "session_id": "9f8bda07-b276-48bb-b954-d03d595cb469",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMwODUsImlhdCI6MTc5MzI3MjE4NSwianRpIjoiMWNhOWZjMmUtNjk5My00ZThjLWJhMWItZWU0YWQ4MDY2NTJhIiwic2lkIjoiOWY4YmRhMDctYjI3Ni00OGJiLWI5NTQtZDAzZDU5NWNiNDY5In0.GtVTczyBZooLzSUmWZo6qZOPQNT5Wbb7neivP_1Tyho",
  "access_expires_at": "2026-10-29T11:24:45.350251169Z",
  "refresh_token": "vsb77Tue8JephgayGvROhfszjX1FKVCX24EyO2ZVYMc",
  "refresh_expires_at": "2026-10-29T23:09:45.349739085Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/0586c1af-1bf3-489f-aa99-c9c06948bed0/cash-dispute` → **200**

```json
{
  "order_id": "0586c1af-1bf3-489f-aa99-c9c06948bed0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "8246461b-1338-4def-9d6c-0eb76d7b9a82",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T11:09:45.121431Z",
  "decide_by": "2026-11-12T11:09:45.121431Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T11:09:45.121431Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "0586c1af-1bf3-489f-aa99-c9c06948bed0",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "8246461b-1338-4def-9d6c-0eb76d7b9a82",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T11:09:45.121431Z",
      "decide_by": "2026-11-12T11:09:45.121431Z",
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

`POST /api/admin/v1/orders/0586c1af-1bf3-489f-aa99-c9c06948bed0/cash-dispute/decide` → **400**

```json
{
  "command_id": "c4fb8a5e-dc06-4e4a-83f3-552422dd8e61",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/0586c1af-1bf3-489f-aa99-c9c06948bed0/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "f132a440-d72e-43af-8608-2bb7a04460f4",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/0586c1af-1bf3-489f-aa99-c9c06948bed0/cash-dispute/decide` → **200**

```json
{
  "command_id": "7440437d-e1a1-4bd6-a8c6-3082883913f5",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "0586c1af-1bf3-489f-aa99-c9c06948bed0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "8246461b-1338-4def-9d6c-0eb76d7b9a82",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T11:09:45.121431Z",
  "decide_by": "2026-11-12T11:09:45.121431Z",
  "decision": "PAY_DRIVER",
  "decided_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T11:09:46.487999Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/0586c1af-1bf3-489f-aa99-c9c06948bed0/cash-dispute/decide` → **409**

```json
{
  "command_id": "8aa6b5bb-c313-4743-8670-020b9274df24",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/0586c1af-1bf3-489f-aa99-c9c06948bed0/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "f2f34e44-5403-467b-964a-cf0ecc948fd2"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8f630953-835a-4c86-b28f-405929eb4dc5",
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
  "last_heartbeat_at": "2026-10-29T11:09:43.898948Z",
  "last_location_at": "2026-10-29T11:09:43.898948Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8f630953-835a-4c86-b28f-405929eb4dc5/close` → **200**

```json
{
  "command_id": "0b7be328-1e7d-4711-b579-5cb8212e74ed",
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
  "phone": "+380733860593",
  "device_ref": "sandbox-4407"
}
```

```json
{
  "challenge_id": "054687ab-e960-46c6-a6f8-d1dbd0190614",
  "expires_at": "2026-10-29T11:14:47.608391691Z",
  "resend_available_at": "2026-10-29T11:09:48.608391691Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380733860593` → **200**

```json
{
  "phone": "+380733860593",
  "audience": "CLIENT",
  "code": "573068",
  "sent_at": "2026-10-29T11:09:47.610991472Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "054687ab-e960-46c6-a6f8-d1dbd0190614",
  "code": "573068",
  "device_ref": "sandbox-4407"
}
```

```json
{
  "session_id": "4bfcf190-15dc-4e97-a074-52deea38b2a9",
  "subject": {
    "type": "CLIENT",
    "id": "850c22a9-2b78-49fb-9965-544716023788"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTBjMjJhOS0yYjc4LTQ5ZmItOTk2NS01NDQ3MTYwMjM3ODgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMDg3LCJpYXQiOjE3OTMyNzIxODcsImp0aSI6IjZiY2FhZWU3LTM5NzUtNGU4OC05MTI1LTMxNjgxNTczZTliYSIsInNpZCI6IjRiZmNmMTkwLTE1ZGMtNGU5Ny1hMDc0LTUyZGVlYTM4YjJhOSJ9.7Yuz8LlwulyxfBPowizQusYeyMKrGOyM5ZokHnRmnsc",
  "access_expires_at": "2026-10-29T11:24:47.912720488Z",
  "refresh_token": "3Sy2P4qb1t-VkyZ3C-5XfFmtG2OMlGsHvAshOxv9x9U",
  "refresh_expires_at": "2026-11-28T11:09:47.912102061Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "49504046-2248-4b51-9545-6fcf6583e8b6",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "e99cfbdf-cbe1-4f6f-8aaa-2e7460240332",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-e99cfbdf-cbe1-4f6f-8aaa-2e7460240332",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "f21d6d7a9c769829bce23a4ab560341a",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=e99cfbdf-cbe1-4f6f-8aaa-2e7460240332",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733860593"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=e99cfbdf-cbe1-4f6f-8aaa-2e7460240332",
  "expires_at": "2026-10-29T11:39:48.188208Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/e99cfbdf-cbe1-4f6f-8aaa-2e7460240332` → **200**

```json
{
  "id": "e99cfbdf-cbe1-4f6f-8aaa-2e7460240332",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T11:39:48.188208Z",
  "card": {
    "id": "a3677b9a-8180-4808-a617-af42a19e1b09",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3141",
    "card_type": "Visa",
    "created_at": "2026-10-29T11:09:48.46545Z"
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
  "device_ref": "sandbox-26880"
}
```

```json
{
  "challenge_id": "889612b8-f838-4180-8b14-74b46927345a",
  "expires_at": "2026-10-29T11:14:48.755354444Z",
  "resend_available_at": "2026-10-29T11:09:49.755354444Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "528613",
  "sent_at": "2026-10-29T11:09:48.758195297Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "889612b8-f838-4180-8b14-74b46927345a",
  "code": "528613",
  "device_ref": "sandbox-26880"
}
```

```json
{
  "session_id": "ae0abef3-6577-45dc-ab0c-f57c16fe2d73",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MzA4OSwiaWF0IjoxNzkzMjcyMTg5LCJqdGkiOiI5YjUzODEzMi1mZjNlLTQyYzYtYTI3ZC1hYmI4YzE5NmE2NzgiLCJzaWQiOiJhZTBhYmVmMy02NTc3LTQ1ZGMtYWIwYy1mNTdjMTZmZTJkNzMifQ.c8NE_2FaNO9z0w9ap_Bsq-pWTc1MZsgs1FfeKWc7MEI",
  "access_expires_at": "2026-10-29T11:24:49.055471904Z",
  "refresh_token": "jgatVllxcIE6YNl7hvp1YeSknFhp3jlFYvvHiS8cEh8",
  "refresh_expires_at": "2026-11-28T11:09:49.055022969Z",
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
  "command_id": "ff946d74-ec0f-4417-a33c-95066a8ba4d8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:09:49Z",
    "sequence": 1793272189572
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "17e08ed9-2d5e-4eda-8ef5-88a4b6c68031",
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
  "last_heartbeat_at": "2026-10-29T11:09:49.590532Z",
  "last_location_at": "2026-10-29T11:09:49.590532Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "eb83f959-b68d-44e1-b9b2-7a985023aa8e",
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
  "id": "a6871a33-ca23-4bf2-933a-f45b3f73e8b7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:14:49.866808Z",
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
  "command_id": "99faedf6-edf4-4e5a-9724-f0fa7522861c",
  "quote_id": "a6871a33-ca23-4bf2-933a-f45b3f73e8b7",
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
  "id": "2e67d030-b015-4b10-8533-d63af2b96046",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "850c22a9-2b78-49fb-9965-544716023788",
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
  "created_at": "2026-10-29T11:09:50.154064Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e67d030-b015-4b10-8533-d63af2b96046` → **200**

```json
{
  "id": "2e67d030-b015-4b10-8533-d63af2b96046",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "850c22a9-2b78-49fb-9965-544716023788",
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
  "created_at": "2026-10-29T11:09:50.154064Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e67d030-b015-4b10-8533-d63af2b96046` → **200**

```json
{
  "id": "2e67d030-b015-4b10-8533-d63af2b96046",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "850c22a9-2b78-49fb-9965-544716023788",
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
  "created_at": "2026-10-29T11:09:50.154064Z",
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
    "id": "82c9d2f9-84a5-42e8-a753-00430c641e14",
    "order_id": "2e67d030-b015-4b10-8533-d63af2b96046",
    "expires_at": "2026-10-29T11:10:06.160983Z",
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

`POST /api/driver/v1/offers/82c9d2f9-84a5-42e8-a753-00430c641e14/accept` → **200**

```json
{
  "command_id": "3c674cee-4d8a-46a4-a08e-c23e91035f82"
}
```

```json
{
  "id": "49f18997-268e-4a29-8e31-2ad3127f7cd4",
  "order_id": "2e67d030-b015-4b10-8533-d63af2b96046",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a92ece36-cfa7-438e-864a-3ffa7e34ec4e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a92ece36-cfa7-438e-864a-3ffa7e34ec4e",
  "order_id": "2e67d030-b015-4b10-8533-d63af2b96046",
  "assignment_id": "49f18997-268e-4a29-8e31-2ad3127f7cd4",
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

`POST /api/rider/v1/orders/2e67d030-b015-4b10-8533-d63af2b96046/messages` → **201**

```json
{
  "command_id": "cad503b2-5a40-43e8-b865-1d69bbfdaf26",
  "body": "Я біля входу, мій номер +380733860593, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "107f1ba6-6d60-4d03-8444-8e9cfa81c869",
  "order_id": "2e67d030-b015-4b10-8533-d63af2b96046",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380733860593, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-29T11:09:52.830545364Z"
}
```

`POST /api/driver/v1/trips/a92ece36-cfa7-438e-864a-3ffa7e34ec4e/messages` → **201**

```json
{
  "command_id": "0664571f-df45-405a-9a6e-ba1ea96fba06",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "ae235f61-6939-4ab5-bd97-ed61da4e6316",
  "order_id": "2e67d030-b015-4b10-8533-d63af2b96046",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-29T11:09:53.121525979Z"
}
```

`POST /api/driver/v1/work-sessions/17e08ed9-2d5e-4eda-8ef5-88a4b6c68031/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:09:53Z",
    "sequence": 1793272193376
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "17e08ed9-2d5e-4eda-8ef5-88a4b6c68031",
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
  "last_heartbeat_at": "2026-10-29T11:09:53.393814Z",
  "last_location_at": "2026-10-29T11:09:53.393814Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a92ece36-cfa7-438e-864a-3ffa7e34ec4e/arrive` → **200**

```json
{
  "command_id": "537943ac-f5f3-4d5f-94e7-46042a86ecd0",
  "expected_version": 0
}
```

```json
{
  "id": "a92ece36-cfa7-438e-864a-3ffa7e34ec4e",
  "order_id": "2e67d030-b015-4b10-8533-d63af2b96046",
  "assignment_id": "49f18997-268e-4a29-8e31-2ad3127f7cd4",
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
  "arrived_at": "2026-10-29T11:09:53.668993Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a92ece36-cfa7-438e-864a-3ffa7e34ec4e/start` → **200**

```json
{
  "command_id": "c8384da5-c07f-4eda-9ae1-6839b9fe6df9",
  "expected_version": 1
}
```

```json
{
  "id": "a92ece36-cfa7-438e-864a-3ffa7e34ec4e",
  "order_id": "2e67d030-b015-4b10-8533-d63af2b96046",
  "assignment_id": "49f18997-268e-4a29-8e31-2ad3127f7cd4",
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
  "arrived_at": "2026-10-29T11:09:53.668993Z",
  "started_at": "2026-10-29T11:09:53.946066Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/17e08ed9-2d5e-4eda-8ef5-88a4b6c68031/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:09:54Z",
    "sequence": 1793272194218
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "17e08ed9-2d5e-4eda-8ef5-88a4b6c68031",
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
  "last_heartbeat_at": "2026-10-29T11:09:54.236426Z",
  "last_location_at": "2026-10-29T11:09:54.236426Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/a92ece36-cfa7-438e-864a-3ffa7e34ec4e/complete` → **200**

```json
{
  "command_id": "7cc9725e-65bd-4e9d-a3ad-692237c9d925",
  "expected_version": 2,
  "reported_at": "2026-10-29T11:09:54Z",
  "cash_received": false
}
```

```json
{
  "id": "a92ece36-cfa7-438e-864a-3ffa7e34ec4e",
  "order_id": "2e67d030-b015-4b10-8533-d63af2b96046",
  "assignment_id": "49f18997-268e-4a29-8e31-2ad3127f7cd4",
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
  "arrived_at": "2026-10-29T11:09:53.668993Z",
  "started_at": "2026-10-29T11:09:53.946066Z",
  "completed_at": "2026-10-29T11:09:54.512624Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/2e67d030-b015-4b10-8533-d63af2b96046` → **200**

```json
{
  "id": "2e67d030-b015-4b10-8533-d63af2b96046",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "850c22a9-2b78-49fb-9965-544716023788",
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
    "id": "49f18997-268e-4a29-8e31-2ad3127f7cd4",
    "order_id": "2e67d030-b015-4b10-8533-d63af2b96046",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a92ece36-cfa7-438e-864a-3ffa7e34ec4e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T11:09:50.154064Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e67d030-b015-4b10-8533-d63af2b96046` → **200**

```json
{
  "id": "2e67d030-b015-4b10-8533-d63af2b96046",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "850c22a9-2b78-49fb-9965-544716023788",
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
    "id": "49f18997-268e-4a29-8e31-2ad3127f7cd4",
    "order_id": "2e67d030-b015-4b10-8533-d63af2b96046",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a92ece36-cfa7-438e-864a-3ffa7e34ec4e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T11:09:50.154064Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e67d030-b015-4b10-8533-d63af2b96046` → **200**

```json
{
  "id": "2e67d030-b015-4b10-8533-d63af2b96046",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "850c22a9-2b78-49fb-9965-544716023788",
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
    "id": "49f18997-268e-4a29-8e31-2ad3127f7cd4",
    "order_id": "2e67d030-b015-4b10-8533-d63af2b96046",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a92ece36-cfa7-438e-864a-3ffa7e34ec4e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T11:09:50.154064Z",
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
  "session_id": "17e08ed9-2d5e-4eda-8ef5-88a4b6c68031",
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
  "last_heartbeat_at": "2026-10-29T11:09:54.236426Z",
  "last_location_at": "2026-10-29T11:09:54.236426Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/17e08ed9-2d5e-4eda-8ef5-88a4b6c68031/close` → **200**

```json
{
  "command_id": "e2f920c6-afb3-48c0-97a3-266cde2f197c",
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
  "session_id": "34593f17-7f1d-4280-9196-24eb8c416c52",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMwOTgsImlhdCI6MTc5MzI3MjE5OCwianRpIjoiZDk5NGY4MjktMmExZC00NmYwLWIxODEtNjRkNjUxNDdjYTliIiwic2lkIjoiMzQ1OTNmMTctN2YxZC00MjgwLTkxOTYtMjRlYjhjNDE2YzUyIn0.7HKWitn8nvK7jdTycS4bxFOSZL6NFiCYDY8fTPVsIWU",
  "access_expires_at": "2026-10-29T11:24:58.482509264Z",
  "refresh_token": "TObkEak-oyuaV1n31CO_9xm41E6ZWHL65FKox93sUx4",
  "refresh_expires_at": "2026-10-29T23:09:58.48210172Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/2e67d030-b015-4b10-8533-d63af2b96046/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/2e67d030-b015-4b10-8533-d63af2b96046/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "faf0c965-154e-4429-9ad4-2538bcc79306"
}
```

`GET /api/admin/v1/orders/2e67d030-b015-4b10-8533-d63af2b96046/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-29T11:09:59.011239406Z",
  "order": {
    "id": "2e67d030-b015-4b10-8533-d63af2b96046",
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
    "created_at": "2026-10-29T11:09:50.154064Z",
    "assigned_at": "2026-10-29T11:09:52.275179Z",
    "arrived_at": "2026-10-29T11:09:53.668993Z",
    "started_at": "2026-10-29T11:09:53.946066Z",
    "completed_at": "2026-10-29T11:09:54.512624Z"
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
    "id": "850c22a9-2b78-49fb-9965-544716023788",
    "registered_at": "2026-10-29T11:09:47.909453Z",
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
      "created_at": "2026-10-29T11:09:50.156783Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-29T11:09:55.219945Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/2e67d030-b015-4b10-8533-d63af2b96046/chargebacks` → **422**

```json
{
  "command_id": "d2db5b8e-670c-4704-b254-57b6dd07d892",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "instance": "/api/admin/v1/orders/2e67d030-b015-4b10-8533-d63af2b96046/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "f4dc2284-293a-4fc8-9ca5-19738ca4e1c7"
}
```

`POST /api/admin/v1/orders/2e67d030-b015-4b10-8533-d63af2b96046/chargebacks` → **201**

```json
{
  "command_id": "d9674013-21b5-41df-9384-b727fca0a190",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "3e1a7bd1-2f48-46d2-9976-c81c6623c8b3",
  "order_id": "2e67d030-b015-4b10-8533-d63af2b96046",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T11:09:59.647517Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/2e67d030-b015-4b10-8533-d63af2b96046/chargebacks` → **201**

```json
{
  "command_id": "d9674013-21b5-41df-9384-b727fca0a190",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "3e1a7bd1-2f48-46d2-9976-c81c6623c8b3",
  "order_id": "2e67d030-b015-4b10-8533-d63af2b96046",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T11:09:59.647517Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/850c22a9-2b78-49fb-9965-544716023788` → **200**

```json
{
  "client": {
    "id": "850c22a9-2b78-49fb-9965-544716023788",
    "phone": "+380733860593",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T11:09:47.909453Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "2e67d030-b015-4b10-8533-d63af2b96046",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T11:09:50.154064Z",
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

`GET /api/admin/v1/clients/850c22a9-2b78-49fb-9965-544716023788` → **200**

```json
{
  "client": {
    "id": "850c22a9-2b78-49fb-9965-544716023788",
    "phone": "+380733860593",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T11:09:47.909453Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "2e67d030-b015-4b10-8533-d63af2b96046",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T11:09:50.154064Z",
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

`POST /api/admin/v1/orders/2e67d030-b015-4b10-8533-d63af2b96046/chargebacks/3e1a7bd1-2f48-46d2-9976-c81c6623c8b3/resolve` → **200**

```json
{
  "command_id": "cd984d9d-5f89-45a6-a616-522f2a597b87",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "3e1a7bd1-2f48-46d2-9976-c81c6623c8b3",
  "order_id": "2e67d030-b015-4b10-8533-d63af2b96046",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-29T11:09:59.647517Z",
  "resolved_at": "2026-10-29T11:10:01.834775Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/850c22a9-2b78-49fb-9965-544716023788` → **200**

```json
{
  "client": {
    "id": "850c22a9-2b78-49fb-9965-544716023788",
    "phone": "+380733860593",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T11:09:47.909453Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "2e67d030-b015-4b10-8533-d63af2b96046",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T11:09:50.154064Z",
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

`GET /api/admin/v1/clients/850c22a9-2b78-49fb-9965-544716023788` → **200**

```json
{
  "client": {
    "id": "850c22a9-2b78-49fb-9965-544716023788",
    "phone": "+380733860593",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T11:09:47.909453Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "2e67d030-b015-4b10-8533-d63af2b96046",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T11:09:50.154064Z",
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

`POST /api/admin/v1/orders/2e67d030-b015-4b10-8533-d63af2b96046/chargebacks/3e1a7bd1-2f48-46d2-9976-c81c6623c8b3/resolve` → **409**

```json
{
  "command_id": "5f5e7aa6-4a72-45d2-90a3-82afe169c3f9",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/2e67d030-b015-4b10-8533-d63af2b96046/chargebacks/3e1a7bd1-2f48-46d2-9976-c81c6623c8b3/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c3b7e5b8-b52d-4325-945a-a13cee608cd9"
}
```

`GET /api/admin/v1/orders/2e67d030-b015-4b10-8533-d63af2b96046/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "3e1a7bd1-2f48-46d2-9976-c81c6623c8b3",
      "order_id": "2e67d030-b015-4b10-8533-d63af2b96046",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-28",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-29T11:09:59.647517Z",
      "resolved_at": "2026-10-29T11:10:01.834775Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 2e67d030-b015-4b10-8533-d63af2b96046 without phone or card digits; chargeback 3e1a7bd1-2f48-46d2-9976-c81c6623c8b3 recorded and won.

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
  "session_id": "43d38f3b-7c01-4010-9cf9-4b2e6636b2af",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMxMDQsImlhdCI6MTc5MzI3MjIwNCwianRpIjoiYTkzMTMwN2QtZmFiNi00Y2RlLTlmZmQtNDE4YmVmYzY2MDZmIiwic2lkIjoiNDNkMzhmM2ItN2MwMS00MDEwLTljZjktNGIyZTY2MzZiMmFmIn0.8HkoYqpZk4SwSf6dgUVRNrRbWs_W7gx4dQjpjoFOEDs",
  "access_expires_at": "2026-10-29T11:25:04.84315898Z",
  "refresh_token": "swu2X8trExA77SVWbenyXBFytJeaTzXvj7z21Clo-_s",
  "refresh_expires_at": "2026-10-29T23:10:04.842739862Z",
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
  "phone": "+48600387611",
  "device_ref": "sandbox-6672"
}
```

```json
{
  "challenge_id": "b437efa1-807d-48a7-a22b-cfb8962c3635",
  "expires_at": "2026-10-29T11:15:05.649149861Z",
  "resend_available_at": "2026-10-29T11:10:06.649149861Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600387611` → **200**

```json
{
  "phone": "+48600387611",
  "audience": "CLIENT",
  "code": "462012",
  "sent_at": "2026-10-29T11:10:05.651624776Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b437efa1-807d-48a7-a22b-cfb8962c3635",
  "code": "462012",
  "device_ref": "sandbox-6672"
}
```

```json
{
  "session_id": "c3e02542-5433-429c-83ea-546ff0c1c850",
  "subject": {
    "type": "CLIENT",
    "id": "cb8c55b2-780d-4f65-a723-ea7d8cc1750b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYjhjNTViMi03ODBkLTRmNjUtYTcyMy1lYTdkOGNjMTc1MGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMTA1LCJpYXQiOjE3OTMyNzIyMDUsImp0aSI6IjMyZTY5MTI5LTBkOWEtNGY2Yi05YmU5LTBjY2UxMzExMjQzYiIsInNpZCI6ImMzZTAyNTQyLTU0MzMtNDI5Yy04M2VhLTU0NmZmMGMxYzg1MCJ9.TK8ylPHtIB0v6tsPql_EwRXeUCY2LMrEQhL6AP9dTqU",
  "access_expires_at": "2026-10-29T11:25:05.943276684Z",
  "refresh_token": "mnCyRzyQJk9buudZDiY6ATr79avNrVTqcOqRLB2GHmM",
  "refresh_expires_at": "2026-11-28T11:10:05.94271986Z",
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
  "command_id": "08b32632-17ad-46f1-87ac-995b033dec2e",
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
  "correlation_id": "495a4bf6-3af5-4f2e-8f39-722db83d62eb",
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
  "command_id": "99e0028a-da97-4f65-9ffd-e4b27656b964",
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
  "paused_at": "2026-10-29T11:10:07.013375277Z",
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
  "command_id": "a6118787-c5f9-4d7b-ba99-96a0e85e8a13",
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
  "id": "7063f848-9403-45a9-ae90-d3edb4f2f065",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:15:07.767812Z",
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
  "command_id": "e7f5836e-ac18-4f5e-9da5-104443e48027",
  "quote_id": "7063f848-9403-45a9-ae90-d3edb4f2f065",
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
  "correlation_id": "fbaa805e-252d-48a3-b809-ed6eaeecdf9e"
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
  "paused_at": "2026-10-29T11:10:07.013375Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "b2618147-9ac8-4257-b16d-d66a03e03e47",
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
  "command_id": "db90eef5-7b14-40ba-9df0-fb11f35e8e5d",
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
  "command_id": "6a74bae0-e158-4466-8293-7d40fa916d34",
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
  "id": "165d4e6d-682e-4672-a986-b024ffd4a9e8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:15:09.499725Z",
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
  "command_id": "5f303788-faf3-4e30-ad3d-aeb4d8a4b13d",
  "quote_id": "165d4e6d-682e-4672-a986-b024ffd4a9e8",
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
  "correlation_id": "099a059e-3310-4e24-8c55-0833a3d32d10"
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
  "command_id": "a80fea6a-74de-47ff-a25a-9d68426cded2",
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
      "from": "14:00",
      "to": "15:00"
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
      "from": "14:00",
      "to": "15:00"
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
  "command_id": "cccbd903-864b-452f-9bc4-ddcd306c6c56",
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
  "id": "5480ced0-51c0-4780-8c26-3642357362e2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:15:10.624220Z",
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
  "command_id": "bbba1f87-82c6-44b4-8273-7589d09d3208",
  "quote_id": "5480ced0-51c0-4780-8c26-3642357362e2",
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
  "correlation_id": "35c288bb-ab29-4160-b69e-4de61db663ef"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "749d61ab-aaf2-4a4e-9cbd-2bc83ab15e90",
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
  "correlation_id": "23d9e5ba-13cf-4f55-97fb-d609315c540f"
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
      "from": "14:00",
      "to": "15:00"
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
  "command_id": "30914f29-1dce-4406-9788-3a06ce2a4630",
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
  "phone": "+380673130009",
  "device_ref": "sandbox-7102"
}
```

```json
{
  "challenge_id": "2fb67a84-87d9-4c0a-8cc1-324a17c41b8f",
  "expires_at": "2026-10-29T11:15:12.041607098Z",
  "resend_available_at": "2026-10-29T11:10:13.041607098Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673130009` → **200**

```json
{
  "phone": "+380673130009",
  "audience": "CLIENT",
  "code": "873035",
  "sent_at": "2026-10-29T11:10:12.044037801Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2fb67a84-87d9-4c0a-8cc1-324a17c41b8f",
  "code": "873035",
  "device_ref": "sandbox-7102"
}
```

```json
{
  "session_id": "65ad1f9e-9fd5-4e02-9555-ace220d09a97",
  "subject": {
    "type": "CLIENT",
    "id": "503f8df2-f3df-4463-a522-357e8b0541e0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MDNmOGRmMi1mM2RmLTQ0NjMtYTUyMi0zNTdlOGIwNTQxZTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMTEyLCJpYXQiOjE3OTMyNzIyMTIsImp0aSI6IjhlNDk5YmEwLWYyZWYtNDI4OC1iZmFkLWU0N2VlZGJkMjRlMSIsInNpZCI6IjY1YWQxZjllLTlmZDUtNGUwMi05NTU1LWFjZTIyMGQwOWE5NyJ9.WQGteSwKiLtTIZqwFlj9lQLJi78I7vQJicKb0zxO0x4",
  "access_expires_at": "2026-10-29T11:25:12.337389234Z",
  "refresh_token": "XebFIr7xiL-HgLzt_55lAHyZmONtkrFxZkZOOZbnOGM",
  "refresh_expires_at": "2026-11-28T11:10:12.336704366Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "503f8df2-f3df-4463-a522-357e8b0541e0",
  "session_id": "65ad1f9e-9fd5-4e02-9555-ace220d09a97",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3d5c5f36-384a-403d-8b69-10ab82ed8fcf",
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
  "id": "cd252b9f-e662-44a6-9ff6-2454f4798bc2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:15:12.878929Z",
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
  "challenge_id": "030ba03b-7183-4c66-bca5-6642733f6a84",
  "expires_at": "2026-10-29T11:15:15.156195973Z",
  "resend_available_at": "2026-10-29T11:10:16.156195973Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673130009` → **200**

```json
{
  "phone": "+380673130009",
  "audience": "CLIENT",
  "code": "926212",
  "sent_at": "2026-10-29T11:10:15.158532341Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "8a9b6601-d642-49d8-97e1-7f109066a778",
  "challenge_id": "030ba03b-7183-4c66-bca5-6642733f6a84",
  "otp_code": "926212"
}
```

```json
{
  "client_id": "503f8df2-f3df-4463-a522-357e8b0541e0",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T11:10:15.467391395Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "be978693-f8da-4fd9-831e-6f2e9dfffe95",
  "quote_id": "cd252b9f-e662-44a6-9ff6-2454f4798bc2",
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
  "correlation_id": "64f94d49-615c-4f64-a2b3-b1e93d8583e8"
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
  "session_id": "80e12363-389e-4882-84f0-f1a64e2fbd18",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMxMTYsImlhdCI6MTc5MzI3MjIxNiwianRpIjoiYzVlNThkZDAtOTUyNC00ODkxLWE3ZDQtMTBiNWIwMWYzYmFiIiwic2lkIjoiODBlMTIzNjMtMzg5ZS00ODgyLTg0ZjAtZjFhNjRlMmZiZDE4In0.66vmVczsluiVxM6xYaKYVrrArQ5FltH_gk64uIjwt3w",
  "access_expires_at": "2026-10-29T11:25:16.33280439Z",
  "refresh_token": "nO2f3p2B3nq36AvkknGdXAyTBcucWc5nqlq7Kc87fd0",
  "refresh_expires_at": "2026-10-29T23:10:16.332342072Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "503f8df2-f3df-4463-a522-357e8b0541e0",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T11:10:15.467391Z",
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

`POST /api/admin/v1/client-deletions/503f8df2-f3df-4463-a522-357e8b0541e0/complete` → **200**

```json
{
  "command_id": "66d5498b-e553-4d6c-b3a9-48bc051f9102",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "503f8df2-f3df-4463-a522-357e8b0541e0",
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
  "correlation_id": "13154dc5-6974-4c35-b81e-f9524e0802d7"
}
```

Done: client 503f8df2-f3df-4463-a522-357e8b0541e0 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666858924",
  "device_ref": "sandbox-20980"
}
```

```json
{
  "challenge_id": "3ed93c89-6309-479b-8c59-72084aa42824",
  "expires_at": "2026-10-29T11:15:17.44094722Z",
  "resend_available_at": "2026-10-29T11:10:18.44094722Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666858924` → **200**

```json
{
  "phone": "+380666858924",
  "audience": "CLIENT",
  "code": "549148",
  "sent_at": "2026-10-29T11:10:17.443854567Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3ed93c89-6309-479b-8c59-72084aa42824",
  "code": "549148",
  "device_ref": "sandbox-20980"
}
```

```json
{
  "session_id": "25a5dbdb-21c0-404b-be85-7d9f6b66f56e",
  "subject": {
    "type": "CLIENT",
    "id": "73803955-94d4-4854-b0d2-55b3c32c48ad"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MzgwMzk1NS05NGQ0LTQ4NTQtYjBkMi01NWIzYzMyYzQ4YWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMTE3LCJpYXQiOjE3OTMyNzIyMTcsImp0aSI6IjM2YWRjZDk4LTA1NzQtNDIwMi05NWJlLWExMzkzNDY0ZjhmZCIsInNpZCI6IjI1YTVkYmRiLTIxYzAtNDA0Yi1iZTg1LTdkOWY2YjY2ZjU2ZSJ9._QNKgfRv1e0uxl2t9kcabVLMXU-aFvWUxEio1I9gR34",
  "access_expires_at": "2026-10-29T11:25:17.732922796Z",
  "refresh_token": "3TXlPs0sTnvguo9TApfSRSLTa--Fap_xLL9Xm6scApg",
  "refresh_expires_at": "2026-11-28T11:10:17.732491406Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "73803955-94d4-4854-b0d2-55b3c32c48ad",
  "session_id": "25a5dbdb-21c0-404b-be85-7d9f6b66f56e",
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
  "session_id": "a2110a8c-818c-451b-a291-d7b9f8849f0c",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMxMTgsImlhdCI6MTc5MzI3MjIxOCwianRpIjoiMWEzODRiODMtOGE0OC00OGNiLWIwYzQtNTRiZGZmYTdhMDY1Iiwic2lkIjoiYTIxMTBhOGMtODE4Yy00NTFiLWEyOTEtZDdiOWY4ODQ5ZjBjIn0.RCGGZaUvyxpw2aGcVHfgujw3-CV8yOproN3_RRlbCLQ",
  "access_expires_at": "2026-10-29T11:25:18.563202187Z",
  "refresh_token": "voX7nx4LBcmwD0iBSdhHQpvpZbvTpvQ8bEu5mUBz2zE",
  "refresh_expires_at": "2026-10-29T23:10:18.562657608Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=6858924&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "73803955-94d4-4854-b0d2-55b3c32c48ad",
      "phone": "+380666858924",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T11:10:17.730364Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/73803955-94d4-4854-b0d2-55b3c32c48ad` → **200**

```json
{
  "client": {
    "id": "73803955-94d4-4854-b0d2-55b3c32c48ad",
    "phone": "+380666858924",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T11:10:17.730364Z",
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

`POST /api/admin/v1/clients/73803955-94d4-4854-b0d2-55b3c32c48ad/block` → **400**

```json
{
  "command_id": "ffb11368-6f94-4a32-8f9e-205af0a50284",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/73803955-94d4-4854-b0d2-55b3c32c48ad/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "79d2425f-9b01-44ff-a938-345d15b16757",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/73803955-94d4-4854-b0d2-55b3c32c48ad/block` → **200**

```json
{
  "command_id": "427eb683-8a37-4073-bdd6-e4e515c8a32b",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "73803955-94d4-4854-b0d2-55b3c32c48ad",
  "phone": "+380666858924",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T11:10:17.730364Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T11:10:19.713346Z",
    "by": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
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
  "correlation_id": "1b852b2f-81ad-463b-bd19-a94b67f8758e"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666858924",
  "device_ref": "sandbox-18034"
}
```

```json
{
  "challenge_id": "d009df76-5cf9-412d-84c9-27e94b63fa29",
  "expires_at": "2026-10-29T11:15:22.251835714Z",
  "resend_available_at": "2026-10-29T11:10:23.251835714Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666858924` → **200**

```json
{
  "phone": "+380666858924",
  "audience": "CLIENT",
  "code": "652353",
  "sent_at": "2026-10-29T11:10:22.254645843Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "d009df76-5cf9-412d-84c9-27e94b63fa29",
  "code": "652353",
  "device_ref": "sandbox-18034"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "6fc28441-c90d-4337-a41a-542ba4746ec9"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/73803955-94d4-4854-b0d2-55b3c32c48ad` → **200**

```json
{
  "client": {
    "id": "73803955-94d4-4854-b0d2-55b3c32c48ad",
    "phone": "+380666858924",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T11:10:17.730364Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T11:10:19.713346Z",
      "by": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
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

`POST /api/admin/v1/clients/73803955-94d4-4854-b0d2-55b3c32c48ad/unblock` → **200**

```json
{
  "command_id": "36a2efb8-f560-4594-892f-5a9f74b4e13d",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "73803955-94d4-4854-b0d2-55b3c32c48ad",
  "phone": "+380666858924",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T11:10:17.730364Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666858924",
  "device_ref": "sandbox-28552"
}
```

```json
{
  "challenge_id": "57bba7fc-daab-4006-9e4c-f5db3cb99247",
  "expires_at": "2026-10-29T11:15:25.390604237Z",
  "resend_available_at": "2026-10-29T11:10:26.390604237Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666858924` → **200**

```json
{
  "phone": "+380666858924",
  "audience": "CLIENT",
  "code": "856344",
  "sent_at": "2026-10-29T11:10:25.393383011Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "57bba7fc-daab-4006-9e4c-f5db3cb99247",
  "code": "856344",
  "device_ref": "sandbox-28552"
}
```

```json
{
  "session_id": "dc38be05-c63a-4d20-952c-120d73f6730f",
  "subject": {
    "type": "CLIENT",
    "id": "73803955-94d4-4854-b0d2-55b3c32c48ad"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MzgwMzk1NS05NGQ0LTQ4NTQtYjBkMi01NWIzYzMyYzQ4YWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMTI1LCJpYXQiOjE3OTMyNzIyMjUsImp0aSI6ImY1ZTMyZjhiLWY0YTUtNDBlYS1hOTM5LTI3YzhmMDhjNzk0ZiIsInNpZCI6ImRjMzhiZTA1LWM2M2EtNGQyMC05NTJjLTEyMGQ3M2Y2NzMwZiJ9.PjC_yc6h4jQfySTiQJDgNB5viNqdyX5otzKGoGMdMsk",
  "access_expires_at": "2026-10-29T11:25:25.689436625Z",
  "refresh_token": "Xl74kJ1vTCuvhCG02D6XNUkB-SZgaKEvmnp-S1UN-nI",
  "refresh_expires_at": "2026-11-28T11:10:25.688998772Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "73803955-94d4-4854-b0d2-55b3c32c48ad",
  "session_id": "dc38be05-c63a-4d20-952c-120d73f6730f",
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
  "phone": "+380660859030",
  "device_ref": "sandbox-17466"
}
```

```json
{
  "challenge_id": "bc4f8658-15ad-43e2-b2cf-1f4d3f263de2",
  "expires_at": "2026-10-29T11:15:26.231625696Z",
  "resend_available_at": "2026-10-29T11:10:27.231625696Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660859030` → **200**

```json
{
  "phone": "+380660859030",
  "audience": "CLIENT",
  "code": "790877",
  "sent_at": "2026-10-29T11:10:26.234104785Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc4f8658-15ad-43e2-b2cf-1f4d3f263de2",
  "code": "790877",
  "device_ref": "sandbox-17466"
}
```

```json
{
  "session_id": "bebd88eb-4f97-4df1-9f27-739c010a0a0b",
  "subject": {
    "type": "CLIENT",
    "id": "c43753ab-1556-49bb-9c93-13228204294a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNDM3NTNhYi0xNTU2LTQ5YmItOWM5My0xMzIyODIwNDI5NGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMTI2LCJpYXQiOjE3OTMyNzIyMjYsImp0aSI6IjA3YmE3ZTY5LWU2ODYtNDQxNi05YWJlLTRiNTU1OTM3YTczNyIsInNpZCI6ImJlYmQ4OGViLTRmOTctNGRmMS05ZjI3LTczOWMwMTBhMGEwYiJ9.gP1fJz6JEgmbtDMxSXzP6L-RId8YSjYjR4XTVsopZOQ",
  "access_expires_at": "2026-10-29T11:25:26.521931846Z",
  "refresh_token": "MsrUjza66tA0YZMiA7QP-HDSh3bzltYg1B8T2vIJDeo",
  "refresh_expires_at": "2026-11-28T11:10:26.521467005Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "50d0377a-9b10-4d4d-890d-146c43849f5d",
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
  "id": "f6adc859-c65f-4e85-a517-039ae96cdfe8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:15:26.803354Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 43352fa6-bf28-41d9-8c2c-0a59ed8938c8) → **201**

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
  "session_id": "40d8dfb3-a33b-471d-8c0f-3015df3ff4df",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMxMjcsImlhdCI6MTc5MzI3MjIyNywianRpIjoiMjM3NGYyMTUtODIwOS00YzQ0LTliNWEtM2Y0YWExYWJiNDk1Iiwic2lkIjoiNDBkOGRmYjMtYTMzYi00NzFkLThjMGYtMzAxNWRmM2ZmNGRmIn0.Hgq1DCAv_rzDQVMPTu3eESebyFOaUTrukxqPVPwUaMQ",
  "access_expires_at": "2026-10-29T11:25:27.422539364Z",
  "refresh_token": "I-CpurPZ0NN6lphjNsRAJZq7De5M22A1dH5dntTe07Q",
  "refresh_expires_at": "2026-10-29T23:10:27.422047239Z",
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
  "session_id": "4c2539e3-94bc-4aee-a5ab-94226da3a00c",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMxMjgsImlhdCI6MTc5MzI3MjIyOCwianRpIjoiY2YzNzE3YzItYzMyOC00ZGZmLTk2ZjMtZDg4NjhjYzY2ZjkzIiwic2lkIjoiNGMyNTM5ZTMtOTRiYy00YWVlLWE1YWItOTQyMjZkYTNhMDBjIn0.49TBcHhYCyvUFE46SwftFyFkClOj1N6mjJYTRq2LjSM",
  "access_expires_at": "2026-10-29T11:25:28.000853008Z",
  "refresh_token": "VKLwBUFJAVM8CSco8p20sczC8MCrFgamzyBBD_dmNXM",
  "refresh_expires_at": "2026-10-29T23:10:28.000355603Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/1c3ee23e-5ac9-42fb-94d8-329b0d8d60a6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T11:10:27.081342Z",
      "actor": {
        "type": "CLIENT",
        "id": "c43753ab-1556-49bb-9c93-13228204294a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "1c3ee23e-5ac9-42fb-94d8-329b0d8d60a6",
        "quote_id": "f6adc859-c65f-4e85-a517-039ae96cdfe8",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "43352fa6-bf28-41d9-8c2c-0a59ed8938c8"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T11:10:27.083279Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1c3ee23e-5ac9-42fb-94d8-329b0d8d60a6",
        "attempt_id": "1115a0fd-6d03-492b-b3c3-72260810275d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "43352fa6-bf28-41d9-8c2c-0a59ed8938c8"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T11:10:27.089442Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1c3ee23e-5ac9-42fb-94d8-329b0d8d60a6",
        "attempt_id": "1115a0fd-6d03-492b-b3c3-72260810275d"
      },
      "correlation_id": "43352fa6-bf28-41d9-8c2c-0a59ed8938c8"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "1115a0fd-6d03-492b-b3c3-72260810275d",
        "generation": 1,
        "started_at": "2026-10-29T11:10:27.082493Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T11:10:27.089442Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T11:10:27.083947Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/43352fa6-bf28-41d9-8c2c-0a59ed8938c8` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "1c3ee23e-5ac9-42fb-94d8-329b0d8d60a6:0",
      "order_id": "1c3ee23e-5ac9-42fb-94d8-329b0d8d60a6",
      "at": "2026-10-29T11:10:27.081342Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "1c3ee23e-5ac9-42fb-94d8-329b0d8d60a6:1",
      "order_id": "1c3ee23e-5ac9-42fb-94d8-329b0d8d60a6",
      "at": "2026-10-29T11:10:27.083279Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "1c3ee23e-5ac9-42fb-94d8-329b0d8d60a6:2",
      "order_id": "1c3ee23e-5ac9-42fb-94d8-329b0d8d60a6",
      "at": "2026-10-29T11:10:27.089442Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/3ee21dda-90c8-436f-8c64-eb7e7859f2fa` → **200**

```json
{
  "found": []
}
```

Done: request 43352fa6-bf28-41d9-8c2c-0a59ed8938c8 — order 1c3ee23e-5ac9-42fb-94d8-329b0d8d60a6 found by its id.

`GET /api/rider/v1/orders/1c3ee23e-5ac9-42fb-94d8-329b0d8d60a6` → **200**

```json
{
  "id": "1c3ee23e-5ac9-42fb-94d8-329b0d8d60a6",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c43753ab-1556-49bb-9c93-13228204294a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:10:27.080812Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/1c3ee23e-5ac9-42fb-94d8-329b0d8d60a6/cancel` → **200**

```json
{
  "command_id": "c8d0aafc-6900-4f78-8a4d-f57b537c6d3a",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "1c3ee23e-5ac9-42fb-94d8-329b0d8d60a6",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c43753ab-1556-49bb-9c93-13228204294a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T11:10:27.080812Z",
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
  "phone": "+380636301452",
  "device_ref": "sandbox-17208"
}
```

```json
{
  "challenge_id": "ba5514da-141d-444c-a2de-d8caf2d4ee83",
  "expires_at": "2026-10-29T11:15:29.673711154Z",
  "resend_available_at": "2026-10-29T11:10:30.673711154Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636301452` → **200**

```json
{
  "phone": "+380636301452",
  "audience": "CLIENT",
  "code": "666294",
  "sent_at": "2026-10-29T11:10:29.676430263Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ba5514da-141d-444c-a2de-d8caf2d4ee83",
  "code": "666294",
  "device_ref": "sandbox-17208"
}
```

```json
{
  "session_id": "86b63df2-0cc2-484e-89fe-75d2f57c433e",
  "subject": {
    "type": "CLIENT",
    "id": "d93e6629-6142-4592-8c0e-23d3210fe578"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkOTNlNjYyOS02MTQyLTQ1OTItOGMwZS0yM2QzMjEwZmU1NzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMTI5LCJpYXQiOjE3OTMyNzIyMjksImp0aSI6ImFhM2M3ODRlLTU5NWEtNDM1NC04NDk3LTUwNTY0M2I1MjgwYSIsInNpZCI6Ijg2YjYzZGYyLTBjYzItNDg0ZS04OWZlLTc1ZDJmNTdjNDMzZSJ9.T_1TH3ZzZPc6EffsJIPZP2F1gmk_HRnasLKBK1BzSlY",
  "access_expires_at": "2026-10-29T11:25:29.967179034Z",
  "refresh_token": "5LGsgX1CM3ofgQv3JV2UV4ofUwjAWimynX3fptktyKM",
  "refresh_expires_at": "2026-11-28T11:10:29.966663181Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "7d58e0da-f5e9-4bef-895b-4fdbf192fe40",
  "expires_at": "2026-10-29T11:15:32.238056351Z",
  "resend_available_at": "2026-10-29T11:10:33.238056351Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636301452` → **200**

```json
{
  "phone": "+380636301452",
  "audience": "CLIENT",
  "code": "409841",
  "sent_at": "2026-10-29T11:10:32.240156481Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "9c95123b-a075-45cd-ba59-c2559f0b85cf",
  "challenge_id": "7d58e0da-f5e9-4bef-895b-4fdbf192fe40",
  "otp_code": "409841"
}
```

```json
{
  "id": "c1eb2681-b981-493c-9bb4-977a18b832b6",
  "state": "PENDING",
  "created_at": "2026-10-29T11:10:32.532349Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/c1eb2681-b981-493c-9bb4-977a18b832b6` → **200**

```json
{
  "id": "c1eb2681-b981-493c-9bb4-977a18b832b6",
  "state": "PENDING",
  "created_at": "2026-10-29T11:10:32.532349Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c1eb2681-b981-493c-9bb4-977a18b832b6` → **200**

```json
{
  "id": "c1eb2681-b981-493c-9bb4-977a18b832b6",
  "state": "PENDING",
  "created_at": "2026-10-29T11:10:32.532349Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c1eb2681-b981-493c-9bb4-977a18b832b6` → **200**

```json
{
  "id": "c1eb2681-b981-493c-9bb4-977a18b832b6",
  "state": "READY",
  "created_at": "2026-10-29T11:10:32.532349Z",
  "ready_at": "2026-10-29T11:10:35.290318Z",
  "expires_at": "2026-11-05T11:10:35.290318Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/c1eb2681-b981-493c-9bb4-977a18b832b6/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639766609",
  "device_ref": "sandbox-11984"
}
```

```json
{
  "challenge_id": "44d2509d-439c-4f77-82ac-f1047ad7969a",
  "expires_at": "2026-10-29T11:15:35.607222384Z",
  "resend_available_at": "2026-10-29T11:10:36.607222384Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639766609` → **200**

```json
{
  "phone": "+380639766609",
  "audience": "CLIENT",
  "code": "984108",
  "sent_at": "2026-10-29T11:10:35.609918943Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "44d2509d-439c-4f77-82ac-f1047ad7969a",
  "code": "984108",
  "device_ref": "sandbox-11984"
}
```

```json
{
  "session_id": "930ae565-8080-497b-bad3-8bb5ac1d3112",
  "subject": {
    "type": "CLIENT",
    "id": "0bd73638-c804-4f38-9d1a-f90c7e7af5ca"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYmQ3MzYzOC1jODA0LTRmMzgtOWQxYS1mOTBjN2U3YWY1Y2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMTM1LCJpYXQiOjE3OTMyNzIyMzUsImp0aSI6ImJjYmEzMGJkLWI5YmMtNGU5My04NDQ5LTEwMmY2OGE4OWViOCIsInNpZCI6IjkzMGFlNTY1LTgwODAtNDk3Yi1iYWQzLThiYjVhYzFkMzExMiJ9.t7dlCi3-IpW4iuqN5ii_Rll1AZm6o7DznQlU22t_LZ8",
  "access_expires_at": "2026-10-29T11:25:35.9019458Z",
  "refresh_token": "D-iUnBwrnHWrXAvPSDxhOMRXHp5jKw1HyAi0zgJHoPg",
  "refresh_expires_at": "2026-11-28T11:10:35.901527882Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/c1eb2681-b981-493c-9bb4-977a18b832b6/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/c1eb2681-b981-493c-9bb4-977a18b832b6/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "133c0088-98d9-4e81-bcef-63e9d8b10fd8"
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
  "session_id": "500332cf-8d40-4cfc-99c3-905fb5122f07",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMxMzYsImlhdCI6MTc5MzI3MjIzNiwianRpIjoiZWRlYjJlODUtM2U4Ni00YzFlLTgwYjYtMjBkZWZlODNlYTAxIiwic2lkIjoiNTAwMzMyY2YtOGQ0MC00Y2ZjLTk5YzMtOTA1ZmI1MTIyZjA3In0.t2nqoB6Zu4XpaL_2AGR0VF5L22Fm68Vnr_KVgT5GEWE",
  "access_expires_at": "2026-10-29T11:25:36.748481418Z",
  "refresh_token": "nvZXMJS-PH17BCCTzG56jtFVNarv3kfKkI6BWOWJryA",
  "refresh_expires_at": "2026-10-29T23:10:36.748026008Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d93e6629-6142-4592-8c0e-23d3210fe578",
  "session_id": "86b63df2-0cc2-484e-89fe-75d2f57c433e",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/d93e6629-6142-4592-8c0e-23d3210fe578/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "c1eb2681-b981-493c-9bb4-977a18b832b6",
      "state": "READY",
      "created_at": "2026-10-29T11:10:32.532349Z",
      "ready_at": "2026-10-29T11:10:35.290318Z",
      "expires_at": "2026-11-05T11:10:35.290318Z",
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
  "device_ref": "sandbox-25766"
}
```

```json
{
  "challenge_id": "9d3eaec0-44d2-498e-82f7-d4969bc40edc",
  "expires_at": "2026-10-29T11:15:37.549123944Z",
  "resend_available_at": "2026-10-29T11:10:38.549123944Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "596258",
  "sent_at": "2026-10-29T11:10:37.551796068Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9d3eaec0-44d2-498e-82f7-d4969bc40edc",
  "code": "596258",
  "device_ref": "sandbox-25766"
}
```

```json
{
  "session_id": "df6b33b1-0f96-45d7-845e-dbd9099eb5b2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MzEzNywiaWF0IjoxNzkzMjcyMjM3LCJqdGkiOiI5NmM0MDRiZS0yYjBiLTRhN2UtYjk2MS01MTMwNzZkZGIzN2IiLCJzaWQiOiJkZjZiMzNiMS0wZjk2LTQ1ZDctODQ1ZS1kYmQ5MDk5ZWI1YjIifQ.C4Scp7oK8f4Cr1sBc18JpCLw5j0NdVuVQB7XXyu3tDM",
  "access_expires_at": "2026-10-29T11:25:37.836709544Z",
  "refresh_token": "Eijp2QhCFBDoaVyu2ZS5w7GvfUxoCqdhPsgGU0ipq3Q",
  "refresh_expires_at": "2026-11-28T11:10:37.83629254Z",
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
  "device_ref": "sandbox-25368"
}
```

```json
{
  "challenge_id": "6143cb1c-4560-45ba-974d-68fee221b945",
  "expires_at": "2026-10-29T11:15:38.353949112Z",
  "resend_available_at": "2026-10-29T11:10:39.353949112Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "201532",
  "sent_at": "2026-10-29T11:10:38.356333257Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6143cb1c-4560-45ba-974d-68fee221b945",
  "code": "201532",
  "device_ref": "sandbox-25368"
}
```

```json
{
  "session_id": "ac928711-15b7-4e09-9f25-09f8d536a281",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MzEzOCwiaWF0IjoxNzkzMjcyMjM4LCJqdGkiOiJjYTI0NDU0NC1kZTc0LTRkMmEtOTI0Zi00ZWM0MzAwNDU0MjciLCJzaWQiOiJhYzkyODcxMS0xNWI3LTRlMDktOWYyNS0wOWY4ZDUzNmEyODEifQ.63X7spQU06o4yT8bGhI6PHznvGH0A7MH7j_rq76NLMk",
  "access_expires_at": "2026-10-29T11:25:38.647044942Z",
  "refresh_token": "f6kYdvMKprpM1uceg4z170D9ua45QTP5YLFN7fxCa1c",
  "refresh_expires_at": "2026-11-28T11:10:38.646482229Z",
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
  "command_id": "afa67a7c-8743-416d-97b1-29ba1cde52d2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:10:39Z",
    "sequence": 1793272239169
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "979847c6-9892-49ca-951d-fe91eeae47da",
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
  "last_heartbeat_at": "2026-10-29T11:10:39.187269Z",
  "last_location_at": "2026-10-29T11:10:39.187269Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-15274"
}
```

```json
{
  "challenge_id": "1bd6e04e-0595-41b4-9b02-8d17cc2331c5",
  "expires_at": "2026-10-29T11:15:39.461073021Z",
  "resend_available_at": "2026-10-29T11:10:40.461073021Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "163097",
  "sent_at": "2026-10-29T11:10:39.463806082Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1bd6e04e-0595-41b4-9b02-8d17cc2331c5",
  "code": "163097",
  "device_ref": "sandbox-15274"
}
```

```json
{
  "session_id": "fc1a0e4a-fd01-4041-b46e-a45828289813",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MzEzOSwiaWF0IjoxNzkzMjcyMjM5LCJqdGkiOiI3ZDY2YWJkYi0yZjQ2LTQwYzYtYjQ1YS0zNDZjYjA1NTY4YzMiLCJzaWQiOiJmYzFhMGU0YS1mZDAxLTQwNDEtYjQ2ZS1hNDU4MjgyODk4MTMifQ.3VjEKfAfMT6t5QEJntF_UDz7LfvJG3b1G-TIpcKYBC0",
  "access_expires_at": "2026-10-29T11:25:39.794726095Z",
  "refresh_token": "v5dzEFcFFt81Zk6mRbiNVlm93ycn26FHxd5hTZ00Umk",
  "refresh_expires_at": "2026-11-28T11:10:39.794329808Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "478d87a5-7305-4103-bd9a-7c47502c6924",
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
  "last_heartbeat_at": "2026-10-29T11:09:11.96391Z",
  "last_location_at": "2026-10-29T11:09:11.96391Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/478d87a5-7305-4103-bd9a-7c47502c6924/handover` → **200**

```json
{
  "command_id": "e03aaff3-f751-4c33-99e1-5ee53caf889c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "478d87a5-7305-4103-bd9a-7c47502c6924",
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
  "last_heartbeat_at": "2026-10-29T11:09:11.96391Z",
  "last_location_at": "2026-10-29T11:09:11.96391Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/478d87a5-7305-4103-bd9a-7c47502c6924/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:10:40Z",
    "sequence": 1793272240618
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "478d87a5-7305-4103-bd9a-7c47502c6924",
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
  "last_heartbeat_at": "2026-10-29T11:10:40.636576Z",
  "last_location_at": "2026-10-29T11:10:40.636576Z",
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
  "session_id": "9b3f3198-b0d8-4098-9ce6-77e36a03081e",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMxNDEsImlhdCI6MTc5MzI3MjI0MSwianRpIjoiYTNiMjk4MzMtMWI2NS00Nzk0LWFmZjMtMTFhNGJmNDY4MDIyIiwic2lkIjoiOWIzZjMxOTgtYjBkOC00MDk4LTljZTYtNzdlMzZhMDMwODFlIn0.DO8HtYjLw2cPsQL3sDStvC7Bn3UXxqg_BfaX8_JxPBM",
  "access_expires_at": "2026-10-29T11:25:41.209146231Z",
  "refresh_token": "MBw6xl6VqtDoDLHh79huqvfuXwWK-KOKbQ0XQnbYXrQ",
  "refresh_expires_at": "2026-10-29T23:10:41.208582407Z",
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
  "session_id": "4f86e70c-ee2e-4206-9ba7-662f53a24ef3",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMxNDEsImlhdCI6MTc5MzI3MjI0MSwianRpIjoiN2MyZGJhZWMtYzY4YS00NjUxLWFhYzktYmI3OTliYThiNDQyIiwic2lkIjoiNGY4NmU3MGMtZWUyZS00MjA2LTliYTctNjYyZjUzYTI0ZWYzIn0._gca5wkoDMsEVXX8Qz9_BxloP85IBueqXD47lEpQv18",
  "access_expires_at": "2026-10-29T11:25:41.793653404Z",
  "refresh_token": "9eHR3x9OQJmstq1_dWjJsiLdycHNkw0n9NgTNwcP3r8",
  "refresh_expires_at": "2026-10-29T23:10:41.793247856Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380689482790",
  "device_ref": "sandbox-25473"
}
```

```json
{
  "challenge_id": "184524a7-26a9-4044-859c-42fa5c11f1ce",
  "expires_at": "2026-10-29T11:15:42.055649999Z",
  "resend_available_at": "2026-10-29T11:10:43.055649999Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380689482790` → **200**

```json
{
  "phone": "+380689482790",
  "audience": "CLIENT",
  "code": "295594",
  "sent_at": "2026-10-29T11:10:42.058396278Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "184524a7-26a9-4044-859c-42fa5c11f1ce",
  "code": "295594",
  "device_ref": "sandbox-25473"
}
```

```json
{
  "session_id": "bd4439d5-f957-4bf7-9a8d-1f6dbffd4471",
  "subject": {
    "type": "CLIENT",
    "id": "5f60aed5-a2ad-4780-af6d-46f8ea933099"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZjYwYWVkNS1hMmFkLTQ3ODAtYWY2ZC00NmY4ZWE5MzMwOTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMTQyLCJpYXQiOjE3OTMyNzIyNDIsImp0aSI6ImYxMmNhOWQ0LWM1MzktNDQ1YS05MTQxLTJiNDc0OTFmM2Y4MSIsInNpZCI6ImJkNDQzOWQ1LWY5NTctNGJmNy05YThkLTFmNmRiZmZkNDQ3MSJ9.fe3EfgElPElG4w4tV-AJFjnpvVjPK2t0eKfV5Ljj8hE",
  "access_expires_at": "2026-10-29T11:25:42.350063752Z",
  "refresh_token": "GMvLVFsuf2APSen60ChEV1zh7ScZ3LkVZWA31OT1a7k",
  "refresh_expires_at": "2026-11-28T11:10:42.349535166Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6cf60e6e-371f-4ce0-bad2-2dff63043606",
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
  "id": "5649fd56-8b5b-4738-b13a-1747951e6e69",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:15:42.625218Z",
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
  "command_id": "0890032b-69c5-471d-879c-d3fb8bad4a0f",
  "quote_id": "5649fd56-8b5b-4738-b13a-1747951e6e69",
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
  "id": "23b5cd22-8146-4352-bfb9-cd2a9aef53db",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5f60aed5-a2ad-4780-af6d-46f8ea933099",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T11:10:42.905803Z",
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
    "id": "625b0205-35e3-4809-bd2d-ada899561aa4",
    "order_id": "23b5cd22-8146-4352-bfb9-cd2a9aef53db",
    "expires_at": "2026-10-29T11:10:57.909163Z",
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

`POST /api/driver/v1/offers/625b0205-35e3-4809-bd2d-ada899561aa4/reject` → **204**

```json
{
  "command_id": "b81bd1b1-8345-437c-ac40-b6d5a83ad6fc"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "377f008c-b5d6-483c-9c99-d5057bd36d9e",
    "order_id": "23b5cd22-8146-4352-bfb9-cd2a9aef53db",
    "expires_at": "2026-10-29T11:10:58.47661Z",
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

`POST /api/driver/v1/offers/377f008c-b5d6-483c-9c99-d5057bd36d9e/accept` → **200**

```json
{
  "command_id": "20323051-34e6-404f-bbfb-e69904c75736"
}
```

```json
{
  "id": "b3fd5c84-97b2-4edf-97f8-0a9059fb19ed",
  "order_id": "23b5cd22-8146-4352-bfb9-cd2a9aef53db",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4c5746a9-bd4c-4732-a39a-8869f2d25420",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/23b5cd22-8146-4352-bfb9-cd2a9aef53db/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T11:10:42.906432Z",
      "actor": {
        "type": "CLIENT",
        "id": "5f60aed5-a2ad-4780-af6d-46f8ea933099",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "23b5cd22-8146-4352-bfb9-cd2a9aef53db",
        "quote_id": "5649fd56-8b5b-4738-b13a-1747951e6e69",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "c8bcef59-a35d-438f-b5a4-f95deddd3290"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T11:10:42.908348Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "23b5cd22-8146-4352-bfb9-cd2a9aef53db",
        "attempt_id": "e421f090-9890-4b5d-baf4-c66a4b775047",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c8bcef59-a35d-438f-b5a4-f95deddd3290"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T11:10:42.912044Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "625b0205-35e3-4809-bd2d-ada899561aa4",
        "order_id": "23b5cd22-8146-4352-bfb9-cd2a9aef53db",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "c8bcef59-a35d-438f-b5a4-f95deddd3290"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T11:10:43.475699Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "625b0205-35e3-4809-bd2d-ada899561aa4",
        "order_id": "23b5cd22-8146-4352-bfb9-cd2a9aef53db"
      },
      "correlation_id": "3da90297-ae19-426e-99f9-4baadf857026"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 23b5cd22-8146-4352-bfb9-cd2a9aef53db — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/23b5cd22-8146-4352-bfb9-cd2a9aef53db` → **200**

```json
{
  "id": "23b5cd22-8146-4352-bfb9-cd2a9aef53db",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "5f60aed5-a2ad-4780-af6d-46f8ea933099",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "b3fd5c84-97b2-4edf-97f8-0a9059fb19ed",
    "order_id": "23b5cd22-8146-4352-bfb9-cd2a9aef53db",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "4c5746a9-bd4c-4732-a39a-8869f2d25420",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T11:10:42.905803Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/23b5cd22-8146-4352-bfb9-cd2a9aef53db/cancel` → **200**

```json
{
  "command_id": "55980318-c5e1-40f2-9d92-0772f8e00e2a",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "23b5cd22-8146-4352-bfb9-cd2a9aef53db",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "5f60aed5-a2ad-4780-af6d-46f8ea933099",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "b3fd5c84-97b2-4edf-97f8-0a9059fb19ed",
    "order_id": "23b5cd22-8146-4352-bfb9-cd2a9aef53db",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "4c5746a9-bd4c-4732-a39a-8869f2d25420",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T11:10:42.905803Z",
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
  "session_id": "979847c6-9892-49ca-951d-fe91eeae47da",
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
  "last_heartbeat_at": "2026-10-29T11:10:39.187269Z",
  "last_location_at": "2026-10-29T11:10:39.187269Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/979847c6-9892-49ca-951d-fe91eeae47da/close` → **200**

```json
{
  "command_id": "a861379b-5e6c-44c4-8c7c-af729ad5141a",
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
  "session_id": "478d87a5-7305-4103-bd9a-7c47502c6924",
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
  "last_heartbeat_at": "2026-10-29T11:10:40.636576Z",
  "last_location_at": "2026-10-29T11:10:40.636576Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/478d87a5-7305-4103-bd9a-7c47502c6924/close` → **200**

```json
{
  "command_id": "5fedcd90-6b31-4808-a89b-734d11eb681f",
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
  "session_id": "0a511e28-81c0-4dc5-9835-e947d6ad7e60",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMxNDYsImlhdCI6MTc5MzI3MjI0NiwianRpIjoiMWM2ZTIyYjYtYTY4OS00NmI4LWE5NjgtZGU1YTZmZGUyNjI1Iiwic2lkIjoiMGE1MTFlMjgtODFjMC00ZGM1LTk4MzUtZTk0N2Q2YWQ3ZTYwIn0.Fi71mrGc06PxRCwa9OnjoiMLhgroVTHVD6WXZTd0Gyw",
  "access_expires_at": "2026-10-29T11:25:46.39497345Z",
  "refresh_token": "KWqvrOb8a59CntsaL00tbPiSeMRgLITlUcXyBgRaPT0",
  "refresh_expires_at": "2026-10-29T23:10:46.394478385Z",
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
  "command_id": "050b1c24-3b9e-4179-86e3-80bed0d8e073",
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
  "changed_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T11:10:46.952786Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "8dcaa417-d62b-434e-9710-306744f41830",
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
  "correlation_id": "cc23d209-ff65-43be-a88f-efe4e2240c67"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "0d4dbbea-7093-465e-a2ab-1c9de9704a91",
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
  "correlation_id": "307a57db-f501-49b0-9e3a-edd0718cbf5a"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635396835",
  "device_ref": "sandbox-14802"
}
```

```json
{
  "challenge_id": "cd012797-6918-47d7-a44c-f39a9545bb58",
  "expires_at": "2026-10-29T11:15:47.803686079Z",
  "resend_available_at": "2026-10-29T11:10:48.803686079Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635396835` → **200**

```json
{
  "phone": "+380635396835",
  "audience": "CLIENT",
  "code": "393799",
  "sent_at": "2026-10-29T11:10:47.806230366Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd012797-6918-47d7-a44c-f39a9545bb58",
  "code": "393799",
  "device_ref": "sandbox-14802"
}
```

```json
{
  "session_id": "2cacc8a0-e6d0-4f53-b721-c464b4abff54",
  "subject": {
    "type": "CLIENT",
    "id": "e0517827-ac84-445f-a3c7-4a8a747aaf69"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDUxNzgyNy1hYzg0LTQ0NWYtYTNjNy00YThhNzQ3YWFmNjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMTQ4LCJpYXQiOjE3OTMyNzIyNDgsImp0aSI6IjgxZjRhMzc0LTYwZjktNDQ3My05NjE3LWFkOGUyYzI1ZDAwZiIsInNpZCI6IjJjYWNjOGEwLWU2ZDAtNGY1My1iNzIxLWM0NjRiNGFiZmY1NCJ9.DJWtnW6yvZTHE7koaIBH6kfEK2YLwgysDZxKzkGZsf4",
  "access_expires_at": "2026-10-29T11:25:48.097656239Z",
  "refresh_token": "BbcylUmrYJow7Bkp8jNC6_lmAAwLn0R4ZRPBIGkFFm8",
  "refresh_expires_at": "2026-11-28T11:10:48.097234311Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0ebbc410-8033-4ffc-b498-a7b01abca826",
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
  "id": "0f6cece0-c8b2-4a90-a7c4-4879d87e6b40",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:15:48.366194Z",
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
  "command_id": "cc79db63-c45d-4766-91db-d28563aa7cf4",
  "quote_id": "0f6cece0-c8b2-4a90-a7c4-4879d87e6b40",
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
  "correlation_id": "72289782-c0fd-4aa5-9263-0b06439dbfe2"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "56dca88a-0ff6-48a5-be09-414375535f33",
  "quote_id": "0f6cece0-c8b2-4a90-a7c4-4879d87e6b40",
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
  "id": "9de37bca-ddcf-43d5-bfc0-cb852268ec1c",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e0517827-ac84-445f-a3c7-4a8a747aaf69",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:10:48.924561Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/9de37bca-ddcf-43d5-bfc0-cb852268ec1c/cancel` → **200**

```json
{
  "command_id": "398a1717-a219-4648-863c-85f5871bd56d",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "9de37bca-ddcf-43d5-bfc0-cb852268ec1c",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e0517827-ac84-445f-a3c7-4a8a747aaf69",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T11:10:48.924561Z",
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
  "command_id": "f851c2b9-fc18-44cd-8fd2-ec8a31067589",
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
  "changed_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T11:10:49.522205Z"
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
      "changed_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T11:10:49.522205Z"
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
  "device_ref": "sandbox-2991"
}
```

```json
{
  "challenge_id": "e3321fc8-5eaf-448b-9966-09791bf98bf1",
  "expires_at": "2026-10-29T11:15:50.346387558Z",
  "resend_available_at": "2026-10-29T11:10:51.346387558Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "689908",
  "sent_at": "2026-10-29T11:10:50.349035345Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e3321fc8-5eaf-448b-9966-09791bf98bf1",
  "code": "689908",
  "device_ref": "sandbox-2991"
}
```

```json
{
  "session_id": "772dbd9b-3822-4c89-b4a5-f6bfcdcf591c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MzE1MCwiaWF0IjoxNzkzMjcyMjUwLCJqdGkiOiIyODhlNWRhMi1kNzZmLTQ4YTktYWViYy01OGU1N2FkZDZkMmQiLCJzaWQiOiI3NzJkYmQ5Yi0zODIyLTRjODktYjRhNS1mNmJmY2RjZjU5MWMifQ.FQgbSMhJmYtsvws4TvRy6Dcyox68tLat5kUENxxZVZc",
  "access_expires_at": "2026-10-29T11:25:50.644738523Z",
  "refresh_token": "R8VM2esSyE07RhxauiKrtXcYi6TrlIEe2YGTILPeAjM",
  "refresh_expires_at": "2026-11-28T11:10:50.644331363Z",
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
  "command_id": "badaf48e-1d61-4c0a-8ac6-31b449788839",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:10:51Z",
    "sequence": 1793272251161
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4db7fa66-ee94-412d-9244-9780a6ef07b5",
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
  "last_heartbeat_at": "2026-10-29T11:10:51.179288Z",
  "last_location_at": "2026-10-29T11:10:51.179288Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677856320",
  "device_ref": "sandbox-20239"
}
```

```json
{
  "challenge_id": "19e7ccdb-e0d6-4dc3-9fcc-77736696cae0",
  "expires_at": "2026-10-29T11:15:51.457597258Z",
  "resend_available_at": "2026-10-29T11:10:52.457597258Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677856320` → **200**

```json
{
  "phone": "+380677856320",
  "audience": "CLIENT",
  "code": "563974",
  "sent_at": "2026-10-29T11:10:51.459855855Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "19e7ccdb-e0d6-4dc3-9fcc-77736696cae0",
  "code": "563974",
  "device_ref": "sandbox-20239"
}
```

```json
{
  "session_id": "c8400bbd-5b38-4f0f-9a68-8d9a9fe0e300",
  "subject": {
    "type": "CLIENT",
    "id": "5518e83d-b3d9-4831-b97b-ea092cca9e8c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NTE4ZTgzZC1iM2Q5LTQ4MzEtYjk3Yi1lYTA5MmNjYTllOGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMTUxLCJpYXQiOjE3OTMyNzIyNTEsImp0aSI6Ijg2ZTdiMzNhLTU4N2ItNDI5NC1hNjU3LTNlMWY0YzViZDJiZCIsInNpZCI6ImM4NDAwYmJkLTViMzgtNGYwZi05YTY4LThkOWE5ZmUwZTMwMCJ9.FIH0ts_0lG2es1MQkjbfv6LYtF204ouwIJO-IU40d-0",
  "access_expires_at": "2026-10-29T11:25:51.752729285Z",
  "refresh_token": "zKWtPxKf15rcxoANJzXqId3oGOkgpNMk01XrDjJE14w",
  "refresh_expires_at": "2026-11-28T11:10:51.752312148Z",
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
  "command_id": "0f45661b-765c-4b6d-9e65-37aaf32aaed3",
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
  "id": "d3ce3b19-bfef-4c71-bd5d-1607e3e51ea8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:15:52.307458Z",
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
  "command_id": "a81bbe6a-d50b-4216-a1af-a994cda6293e",
  "platform": "ANDROID",
  "token": "sandbox-driver-394f6c19-7cf3-447f-b9ef-87a4b89a305f"
}
```

```json
{
  "id": "415f404c-cf7f-40b5-a645-d82685b1d52f",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T11:10:52.587736Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "13012b6b-86d3-45e5-8691-45b52a5ad7e2",
  "platform": "ANDROID",
  "token": "sandbox-rider-5b902c14-292e-4f40-85fc-9656b017bb85"
}
```

```json
{
  "id": "849ab7cf-fd30-49c7-9e31-501e60e9b892",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T11:10:52.862784Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "875227d8-c973-4cbb-b087-3ee1a6ca7329",
  "quote_id": "d3ce3b19-bfef-4c71-bd5d-1607e3e51ea8",
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
  "id": "d3f2f0ed-eab5-4608-a0d2-4532e8b06e44",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5518e83d-b3d9-4831-b97b-ea092cca9e8c",
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
  "created_at": "2026-10-29T11:10:53.141256Z",
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
    "id": "53e49df8-155c-404a-887e-4c0afa2036d9",
    "order_id": "d3f2f0ed-eab5-4608-a0d2-4532e8b06e44",
    "expires_at": "2026-10-29T11:11:08.145091Z",
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

`POST /api/driver/v1/offers/53e49df8-155c-404a-887e-4c0afa2036d9/accept` → **200**

```json
{
  "command_id": "a04727e6-a440-4fa4-a85c-e9cbc8c91c1a"
}
```

```json
{
  "id": "61e11a3e-bfa9-42f7-9d0a-8758554ec780",
  "order_id": "d3f2f0ed-eab5-4608-a0d2-4532e8b06e44",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c315706c-4427-4f43-a3ca-c1c5f6554214",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T11:10:53.117Z` → **200**

```json
[
  {
    "at": "2026-10-29T11:10:53.75609452Z",
    "token_suffix": "9a305f",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_id": "d3f2f0ed-eab5-4608-a0d2-4532e8b06e44",
      "type": "driver.offer",
      "event_type": "OfferMade",
      "event_id": "797514e6-d5af-4a2d-94e9-04b9807ab67d",
      "order_version": "2"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380677856320&after=2026-10-29T11:10:53.117Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380677856320&after=2026-10-29T11:10:53.117Z` → **200**

```json
[
  {
    "at": "2026-10-29T11:10:54.762928163Z",
    "token_suffix": "17bb85",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_id": "d3f2f0ed-eab5-4608-a0d2-4532e8b06e44",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted",
      "event_id": "59697ce7-972b-4794-8585-80cec26392f6",
      "order_version": "3"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/d3f2f0ed-eab5-4608-a0d2-4532e8b06e44/messages` → **201**

```json
{
  "command_id": "a4e07d7c-a74b-4099-8ea8-a5d60aedce3a",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "96730f69-a07a-4fa7-b5e1-e3af50ec78be",
  "order_id": "d3f2f0ed-eab5-4608-a0d2-4532e8b06e44",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T11:10:55.07031643Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c315706c-4427-4f43-a3ca-c1c5f6554214",
  "order_id": "d3f2f0ed-eab5-4608-a0d2-4532e8b06e44",
  "assignment_id": "61e11a3e-bfa9-42f7-9d0a-8758554ec780",
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

`POST /api/driver/v1/trips/c315706c-4427-4f43-a3ca-c1c5f6554214/messages` → **201**

```json
{
  "command_id": "4c1363c8-0b28-4ba7-b8ee-62374a2eb4fb",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "a3c87e39-55e4-46a8-a7fa-ed353d07f52b",
  "order_id": "d3f2f0ed-eab5-4608-a0d2-4532e8b06e44",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T11:10:55.614229178Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/d3f2f0ed-eab5-4608-a0d2-4532e8b06e44/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/c315706c-4427-4f43-a3ca-c1c5f6554214/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380677856320"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/4db7fa66-ee94-412d-9244-9780a6ef07b5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:10:56Z",
    "sequence": 1793272256407
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4db7fa66-ee94-412d-9244-9780a6ef07b5",
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
  "last_heartbeat_at": "2026-10-29T11:10:56.425104Z",
  "last_location_at": "2026-10-29T11:10:56.425104Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c315706c-4427-4f43-a3ca-c1c5f6554214",
  "order_id": "d3f2f0ed-eab5-4608-a0d2-4532e8b06e44",
  "assignment_id": "61e11a3e-bfa9-42f7-9d0a-8758554ec780",
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

`POST /api/driver/v1/trips/c315706c-4427-4f43-a3ca-c1c5f6554214/arrive` → **200**

```json
{
  "command_id": "7b37b008-e456-4efc-9003-bf8a8a765b55",
  "expected_version": 0
}
```

```json
{
  "id": "c315706c-4427-4f43-a3ca-c1c5f6554214",
  "order_id": "d3f2f0ed-eab5-4608-a0d2-4532e8b06e44",
  "assignment_id": "61e11a3e-bfa9-42f7-9d0a-8758554ec780",
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
  "arrived_at": "2026-10-29T11:10:56.964973Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c315706c-4427-4f43-a3ca-c1c5f6554214/start` → **200**

```json
{
  "command_id": "48876a51-03b3-46a1-ac70-2be302c718d8",
  "expected_version": 1
}
```

```json
{
  "id": "c315706c-4427-4f43-a3ca-c1c5f6554214",
  "order_id": "d3f2f0ed-eab5-4608-a0d2-4532e8b06e44",
  "assignment_id": "61e11a3e-bfa9-42f7-9d0a-8758554ec780",
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
  "arrived_at": "2026-10-29T11:10:56.964973Z",
  "started_at": "2026-10-29T11:10:57.246125Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/4db7fa66-ee94-412d-9244-9780a6ef07b5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:10:57Z",
    "sequence": 1793272257518
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4db7fa66-ee94-412d-9244-9780a6ef07b5",
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
  "last_heartbeat_at": "2026-10-29T11:10:57.536705Z",
  "last_location_at": "2026-10-29T11:10:57.536705Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/c315706c-4427-4f43-a3ca-c1c5f6554214/complete` → **200**

```json
{
  "command_id": "b835014b-214b-489f-b062-9c5d26a75ab7",
  "expected_version": 2,
  "reported_at": "2026-10-29T11:10:57Z",
  "cash_received": true
}
```

```json
{
  "id": "c315706c-4427-4f43-a3ca-c1c5f6554214",
  "order_id": "d3f2f0ed-eab5-4608-a0d2-4532e8b06e44",
  "assignment_id": "61e11a3e-bfa9-42f7-9d0a-8758554ec780",
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
  "arrived_at": "2026-10-29T11:10:56.964973Z",
  "started_at": "2026-10-29T11:10:57.246125Z",
  "completed_at": "2026-10-29T11:10:57.821744Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/d3f2f0ed-eab5-4608-a0d2-4532e8b06e44` → **200**

```json
{
  "id": "d3f2f0ed-eab5-4608-a0d2-4532e8b06e44",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "5518e83d-b3d9-4831-b97b-ea092cca9e8c",
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
    "id": "61e11a3e-bfa9-42f7-9d0a-8758554ec780",
    "order_id": "d3f2f0ed-eab5-4608-a0d2-4532e8b06e44",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c315706c-4427-4f43-a3ca-c1c5f6554214",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T11:10:53.141256Z",
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
    "id": "d3f2f0ed-eab5-4608-a0d2-4532e8b06e44",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-29T11:10:53.141256Z",
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
    "id": "c315706c-4427-4f43-a3ca-c1c5f6554214",
    "order_id": "d3f2f0ed-eab5-4608-a0d2-4532e8b06e44",
    "order_short_number": 13,
    "created_at": "2026-10-29T11:10:53.696758Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "3fcdb1ff-902a-4a26-b6ec-634d507053f0",
    "order_id": "0586c1af-1bf3-489f-aa99-c9c06948bed0",
    "order_short_number": 8,
    "created_at": "2026-10-29T11:09:43.360353Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "cd74a93b-5cb7-4b89-a74c-170607c1668a",
    "order_id": "181bb042-515f-4554-9947-bbf6523e902e",
    "order_short_number": 3,
    "created_at": "2026-10-29T11:09:00.858605Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "78181c14-dee4-43bd-8ccc-4b3dde506708",
    "order_id": "fd1bd3bf-5d42-4b11-aebb-ccb3a87bd0ea",
    "order_short_number": 2,
    "created_at": "2026-10-29T11:08:39.73229Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "7af11eac-f9e7-40fb-97f6-85499eb8808f",
    "order_id": "2ae38552-de59-443a-8b0b-7e3843e1b2e3",
    "order_short_number": 1,
    "created_at": "2026-10-29T11:08:30.235641Z",
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

`GET /api/rider/v1/orders/d3f2f0ed-eab5-4608-a0d2-4532e8b06e44/tip` → **200**

```json
{
  "order_id": "d3f2f0ed-eab5-4608-a0d2-4532e8b06e44",
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
  "available_until": "2026-10-30T11:10:57.821744Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/d3f2f0ed-eab5-4608-a0d2-4532e8b06e44/tip` → **201**

```json
{
  "command_id": "ef0732db-d0d1-4583-829a-01b7d3834151",
  "amount_minor": 1100
}
```

```json
{
  "id": "c61cd975-b1b2-44ed-b067-a1aa38b3e2ff",
  "order_id": "d3f2f0ed-eab5-4608-a0d2-4532e8b06e44",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T11:11:02.741165Z"
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
  "session_id": "bc730b2b-8107-46d1-89e3-ae50a46e6ffa",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMxNjMsImlhdCI6MTc5MzI3MjI2MywianRpIjoiOTI2NjlkMzctNDYxZS00ZjM3LWFiNjgtOGU3MWUxYjc2ZjNlIiwic2lkIjoiYmM3MzBiMmItODEwNy00NmQxLTg5ZTMtYWU1MGE0NmU2ZmZhIn0.uzu3-8kJI4JbqsN9U_2Ask7nzzH091NkrcmworvmOuQ",
  "access_expires_at": "2026-10-29T11:26:03.328481718Z",
  "refresh_token": "Eq5UwMWZMcsHJJyBEZEBVNtwtz0N5XClTNvfrjenbok",
  "refresh_expires_at": "2026-10-29T23:11:03.328047456Z",
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
          "PHONE": 1,
          "APP": 12
        },
        "by_payment": {
          "CASH": 11,
          "CARD": 2
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
      "CASH": 11,
      "CARD": 2
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
  "generated_at": "2026-10-29T11:11:03.606956181Z"
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
  "generated_at": "2026-10-29T11:11:03.886277724Z"
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
  "session_id": "bf935cac-6a5f-4cb5-ac7e-f947e546c648",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMxNjQsImlhdCI6MTc5MzI3MjI2NCwianRpIjoiYWUzMTZjZDQtYzZhZC00ZWJkLWJjOTYtMWUxOTA4ZGRjMDllIiwic2lkIjoiYmY5MzVjYWMtNmE1Zi00Y2I1LWFjN2UtZjk0N2U1NDZjNjQ4In0.dE9t4coegX0nrO2Qnc4xYcVabyWQzaB9I5IjyBhQGss",
  "access_expires_at": "2026-10-29T11:26:04.478399358Z",
  "refresh_token": "lwv-kGaR76XXBDoVvwsfiDn_nhIuHlMDqI3Wm9ZL9Qk",
  "refresh_expires_at": "2026-10-29T23:11:04.477782043Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d3f2f0ed-eab5-4608-a0d2-4532e8b06e44/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T11:10:53.141965Z",
      "actor": {
        "type": "CLIENT",
        "id": "5518e83d-b3d9-4831-b97b-ea092cca9e8c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d3f2f0ed-eab5-4608-a0d2-4532e8b06e44",
        "quote_id": "d3ce3b19-bfef-4c71-bd5d-1607e3e51ea8",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "49a0a51f-0618-4ef6-9655-9bd53552b190"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T11:10:53.144152Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d3f2f0ed-eab5-4608-a0d2-4532e8b06e44",
        "attempt_id": "aa0d0f42-c999-40cd-8c97-dc7253d85b5a",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "49a0a51f-0618-4ef6-9655-9bd53552b190"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T11:10:53.146917Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "53e49df8-155c-404a-887e-4c0afa2036d9",
        "order_id": "d3f2f0ed-eab5-4608-a0d2-4532e8b06e44",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "49a0a51f-0618-4ef6-9655-9bd53552b190"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T11:10:53.698104Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "53e49df8-155c-404a-887e-4c0afa2036d9",
        "order_id": "d3f2f0ed-eab5-4608-a0d2-4532e8b06e44",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "61e11a3e-bfa9-42f7-9d0a-8758554ec780"
      },
      "correlation_id": "c3ac5e82-bf66-4202-9a64-8e85cc01d88d"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T11:11:05.059067131Z",
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
      "last_location_at": "2026-10-29T11:10:57.536705Z",
      "order_id": null
    }
  ]
}
```

Done: order d3f2f0ed-eab5-4608-a0d2-4532e8b06e44.

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
  "session_id": "c8f7e259-bb2a-4400-9ef2-8d868dbf1b4a",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMxNjUsImlhdCI6MTc5MzI3MjI2NSwianRpIjoiYjUzOWM1NzYtMmNlZi00YWYzLTlkM2ItNmIzY2RmN2UwZWY0Iiwic2lkIjoiYzhmN2UyNTktYmIyYS00NDAwLTllZjItOGQ4NjhkYmYxYjRhIn0.9aBDVBU5obuvlwTEZw6svZcVYv_LDurj0aYyHt29GJY",
  "access_expires_at": "2026-10-29T11:26:05.654304931Z",
  "refresh_token": "6Wd-8t9_KQmJMwdf-gqnV4UUMszuWwrz3YqyD-FtKhM",
  "refresh_expires_at": "2026-10-29T23:11:05.65389401Z",
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
  "command_id": "c36f12c3-c1e9-4d34-bafb-60f39d6c1ce5",
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
  "timestamp": "2026-10-29T11:11:06.000+0000",
  "channel": {
    "id": "1730052000.2496823943",
    "linkedid": "1730052000.2496823943",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679770694"
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
  "timestamp": "2026-10-29T11:11:06.000+0000",
  "channel": {
    "id": "1730052000.2496823943",
    "linkedid": "1730052000.2496823943",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679770694"
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
  "session_id": "bf1da22f-2332-41d3-85a3-5ad267b27235",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMxNjYsImlhdCI6MTc5MzI3MjI2NiwianRpIjoiMDA0Yjg4NDYtMGQyZi00MmQwLWI0N2UtMzMzZGRkYmY4ODgzIiwic2lkIjoiYmYxZGEyMmYtMjMzMi00MWQzLTg1YTMtNWFkMjY3YjI3MjM1In0.zeXvJpRr8F2Xl5hjftjF64s2nQYlJFToeJ41G8pxKis",
  "access_expires_at": "2026-10-29T11:26:06.789200968Z",
  "refresh_token": "dsLYPuIsYBSsvOkuexhwdmI4RSgBZ77xIL-iS0zpXY0",
  "refresh_expires_at": "2026-10-29T23:11:06.788644993Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "31add54b-1aa7-4063-9f5d-e260ea6c454e",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679770694",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T11:11:06Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/31add54b-1aa7-4063-9f5d-e260ea6c454e/answer` → **200**

```json
{
  "command_id": "8d7a9759-a53f-44e6-a1a6-e32cc975d830"
}
```

```json
{
  "id": "31add54b-1aa7-4063-9f5d-e260ea6c454e",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679770694",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
  "order_ids": [],
  "started_at": "2026-10-29T11:11:06Z",
  "answered_at": "2026-10-29T11:11:07.338883Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2496823943",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "ba8e787d-3c9a-4c5f-ac28-c56f7aab7880",
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
  "id": "ea201efc-8621-42f4-a3ae-391825590aab",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:16:07.636283Z",
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
  "command_id": "450451d9-654e-451f-b982-ebe097aae0ca",
  "quote_id": "ea201efc-8621-42f4-a3ae-391825590aab",
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
    "phone": "+380679770694"
  },
  "call_id": "31add54b-1aa7-4063-9f5d-e260ea6c454e"
}
```

```json
{
  "id": "d098711f-0cb2-4531-bc01-9e3ce18f841a",
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
  "created_at": "2026-10-29T11:11:07.92199Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679770694"
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
    "id": "1730052000.2496823943",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "31add54b-1aa7-4063-9f5d-e260ea6c454e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679770694",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
      "order_ids": [
        "d098711f-0cb2-4531-bc01-9e3ce18f841a"
      ],
      "started_at": "2026-10-29T11:11:06Z",
      "answered_at": "2026-10-29T11:11:07.338883Z",
      "ended_at": "2026-10-29T11:11:08.210062Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "9b15b20c-ab20-4b8e-b49a-4ae082d7c5a7",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670606440",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
      "order_ids": [],
      "started_at": "2026-10-29T11:08:47.631955Z",
      "answered_at": "2026-10-29T11:08:47.933344Z",
      "ended_at": "2026-10-29T11:08:48.224887Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T11:08:55.270109Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/d098711f-0cb2-4531-bc01-9e3ce18f841a` → **200**

```json
{
  "id": "d098711f-0cb2-4531-bc01-9e3ce18f841a",
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
  "created_at": "2026-10-29T11:11:07.92199Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679770694"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/d098711f-0cb2-4531-bc01-9e3ce18f841a` → **200**

```json
{
  "id": "d098711f-0cb2-4531-bc01-9e3ce18f841a",
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
  "created_at": "2026-10-29T11:11:07.92199Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679770694"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d098711f-0cb2-4531-bc01-9e3ce18f841a/cancel` → **200**

```json
{
  "command_id": "ffda2f45-a1b7-4d22-857c-551709d5dc9f",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "d098711f-0cb2-4531-bc01-9e3ce18f841a",
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
  "created_at": "2026-10-29T11:11:07.92199Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679770694"
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

Done: call 31add54b-1aa7-4063-9f5d-e260ea6c454e with order d098711f-0cb2-4531-bc01-9e3ce18f841a.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-518"
}
```

```json
{
  "challenge_id": "b9c83971-958b-4ff9-8fab-173df23242bf",
  "expires_at": "2026-10-29T11:16:09.358810076Z",
  "resend_available_at": "2026-10-29T11:11:10.358810076Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "772851",
  "sent_at": "2026-10-29T11:11:09.361366549Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b9c83971-958b-4ff9-8fab-173df23242bf",
  "code": "772851",
  "device_ref": "sandbox-518"
}
```

```json
{
  "session_id": "553fcb7f-62cb-4e75-9069-7bfdf9f3c840",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MzE3MCwiaWF0IjoxNzkzMjcyMjcwLCJqdGkiOiJiZDBhOWY4ZC1jMTgxLTQ3OTAtOTFiZC0yMWI0NWIxNmE4ZjMiLCJzaWQiOiI1NTNmY2I3Zi02MmNiLTRlNzUtOTA2OS03YmZkZjlmM2M4NDAifQ.0LZWXXIdjRPwYd-AK6VPKuRcy5naWEth_IvP8_Gu7VQ",
  "access_expires_at": "2026-10-29T11:26:10.411967772Z",
  "refresh_token": "hq0RimlILNusO3pmxrbnEbjYgIteoe0hbO2hce-2CYc",
  "refresh_expires_at": "2026-11-28T11:11:10.411540883Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4db7fa66-ee94-412d-9244-9780a6ef07b5",
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
  "last_heartbeat_at": "2026-10-29T11:10:57.536705Z",
  "last_location_at": "2026-10-29T11:10:57.536705Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4db7fa66-ee94-412d-9244-9780a6ef07b5/handover` → **200**

```json
{
  "command_id": "f7519122-6af0-4d5f-8264-8f8a341b39ba",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4db7fa66-ee94-412d-9244-9780a6ef07b5",
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
  "last_heartbeat_at": "2026-10-29T11:10:57.536705Z",
  "last_location_at": "2026-10-29T11:10:57.536705Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4db7fa66-ee94-412d-9244-9780a6ef07b5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:11:11Z",
    "sequence": 1793272271215
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4db7fa66-ee94-412d-9244-9780a6ef07b5",
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
  "last_heartbeat_at": "2026-10-29T11:11:11.232855Z",
  "last_location_at": "2026-10-29T11:11:11.232855Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661773774",
  "device_ref": "sandbox-14932"
}
```

```json
{
  "challenge_id": "9928d46c-f362-4b90-9973-52205ff4ca5f",
  "expires_at": "2026-10-29T11:16:11.495648543Z",
  "resend_available_at": "2026-10-29T11:11:12.495648543Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380661773774` → **200**

```json
{
  "phone": "+380661773774",
  "audience": "CLIENT",
  "code": "256461",
  "sent_at": "2026-10-29T11:11:11.498169265Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9928d46c-f362-4b90-9973-52205ff4ca5f",
  "code": "256461",
  "device_ref": "sandbox-14932"
}
```

```json
{
  "session_id": "1b1176f6-d788-451b-a338-5f7523f6fdd2",
  "subject": {
    "type": "CLIENT",
    "id": "dd56cbfd-da67-4409-9662-4369cb992b60"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZDU2Y2JmZC1kYTY3LTQ0MDktOTY2Mi00MzY5Y2I5OTJiNjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMTcxLCJpYXQiOjE3OTMyNzIyNzEsImp0aSI6Ijk5MzNhNDE5LTFjMGQtNDFiNy1hOWY0LWMxNThjZGY3YTBjZSIsInNpZCI6IjFiMTE3NmY2LWQ3ODgtNDUxYi1hMzM4LTVmNzUyM2Y2ZmRkMiJ9.qQFIJspyosM1LEN3l3WBNQDIAWI8JIxzovls0IEshUA",
  "access_expires_at": "2026-10-29T11:26:11.777309973Z",
  "refresh_token": "vBCXBWrFfBD1P8eQa8_9rrWrWgJuVXkXpk_SefvHigI",
  "refresh_expires_at": "2026-11-28T11:11:11.776810331Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "176ca2bc-443c-4d14-acd7-b29eb4aef269",
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
  "id": "f2e21bdc-8584-4fdf-bdbd-bd4590e650ec",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:16:12.042152Z",
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
  "command_id": "c377cfc1-0637-45f8-a74c-855fbd568a58",
  "quote_id": "f2e21bdc-8584-4fdf-bdbd-bd4590e650ec",
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
  "id": "807eda0c-a87c-4903-a2e1-6960e9d8f27a",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dd56cbfd-da67-4409-9662-4369cb992b60",
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
  "created_at": "2026-10-29T11:11:12.316974Z",
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
    "id": "8d2414f6-5819-4ada-8a8f-f67852e195dc",
    "order_id": "807eda0c-a87c-4903-a2e1-6960e9d8f27a",
    "expires_at": "2026-10-29T11:11:27.319944Z",
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

`POST /api/driver/v1/offers/8d2414f6-5819-4ada-8a8f-f67852e195dc/accept` → **200**

```json
{
  "command_id": "5e3fdb35-c4a6-4927-b92e-252a693a0c9b"
}
```

```json
{
  "id": "74e43ce3-b854-4bd9-a694-c722b603864d",
  "order_id": "807eda0c-a87c-4903-a2e1-6960e9d8f27a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "369779cc-2e5b-4420-8318-98003058c936",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "369779cc-2e5b-4420-8318-98003058c936",
  "order_id": "807eda0c-a87c-4903-a2e1-6960e9d8f27a",
  "assignment_id": "74e43ce3-b854-4bd9-a694-c722b603864d",
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

`POST /api/driver/v1/work-sessions/4db7fa66-ee94-412d-9244-9780a6ef07b5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:11:13Z",
    "sequence": 1793272273387
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4db7fa66-ee94-412d-9244-9780a6ef07b5",
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
  "last_heartbeat_at": "2026-10-29T11:11:13.404179Z",
  "last_location_at": "2026-10-29T11:11:13.404179Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/369779cc-2e5b-4420-8318-98003058c936/arrive` → **200**

```json
{
  "command_id": "f695bd33-11ae-45d4-b1b8-4aab18a4ad75",
  "expected_version": 0
}
```

```json
{
  "id": "369779cc-2e5b-4420-8318-98003058c936",
  "order_id": "807eda0c-a87c-4903-a2e1-6960e9d8f27a",
  "assignment_id": "74e43ce3-b854-4bd9-a694-c722b603864d",
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
  "arrived_at": "2026-10-29T11:11:13.676811Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/369779cc-2e5b-4420-8318-98003058c936/start` → **200**

```json
{
  "command_id": "9ff0bea7-ca2b-4b0d-9446-c87cf8ace94a",
  "expected_version": 1
}
```

```json
{
  "id": "369779cc-2e5b-4420-8318-98003058c936",
  "order_id": "807eda0c-a87c-4903-a2e1-6960e9d8f27a",
  "assignment_id": "74e43ce3-b854-4bd9-a694-c722b603864d",
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
  "arrived_at": "2026-10-29T11:11:13.676811Z",
  "started_at": "2026-10-29T11:11:13.948179Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/4db7fa66-ee94-412d-9244-9780a6ef07b5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:11:14Z",
    "sequence": 1793272274225
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4db7fa66-ee94-412d-9244-9780a6ef07b5",
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
  "last_heartbeat_at": "2026-10-29T11:11:14.242615Z",
  "last_location_at": "2026-10-29T11:11:14.242615Z",
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
  "device_ref": "sandbox-5075"
}
```

```json
{
  "challenge_id": "5eb688c1-2e94-46b9-997d-89047e7a87b1",
  "expires_at": "2026-10-29T11:16:14.500264869Z",
  "resend_available_at": "2026-10-29T11:11:15.500264869Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "229958",
  "sent_at": "2026-10-29T11:11:14.502807119Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5eb688c1-2e94-46b9-997d-89047e7a87b1",
  "code": "229958",
  "device_ref": "sandbox-5075"
}
```

```json
{
  "session_id": "181f5c77-6f38-47d7-8c90-50a0a2697bdc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MzE3NCwiaWF0IjoxNzkzMjcyMjc0LCJqdGkiOiI0ZjI3MThiYy04NGU0LTQ1Y2UtYjhiMS00ZmY3ZmIxODg4Y2QiLCJzaWQiOiIxODFmNWM3Ny02ZjM4LTQ3ZDctOGM5MC01MGEwYTI2OTdiZGMifQ.wyeNUM_dMDA4GZX7ZDUo_HJ8w3rWqi4gjXNfDsRptAg",
  "access_expires_at": "2026-10-29T11:26:14.790056694Z",
  "refresh_token": "ehjMbMMfZxbuMfY-kB35pThgi1cLAAkPxoEyr9cIGHE",
  "refresh_expires_at": "2026-11-28T11:11:14.789555478Z",
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
  "command_id": "9690fd8b-3903-401c-add7-477effae5732",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:11:15Z",
    "sequence": 1793272275321
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "20424e8f-c4be-4b13-91f0-44354801b876",
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
  "last_heartbeat_at": "2026-10-29T11:11:15.338256Z",
  "last_location_at": "2026-10-29T11:11:15.338256Z",
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
  "session_id": "b440a020-289a-4cd6-b86f-01a52b65187e",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMxNzUsImlhdCI6MTc5MzI3MjI3NSwianRpIjoiOGU0MjcxZGQtNjc3MS00YTBhLWEwNmMtMzZhNGUzODc2NDhmIiwic2lkIjoiYjQ0MGEwMjAtMjg5YS00Y2Q2LWI4NmYtMDFhNTJiNjUxODdlIn0.yNTSnRpNK28i8qmhlXCDGaNQmi5gPhy_fBm_A86Ao7M",
  "access_expires_at": "2026-10-29T11:26:15.913764188Z",
  "refresh_token": "2UeXiw2G1ZG5BlrRYhevHr6FDmLiLJLj_3Wxjk00wlE",
  "refresh_expires_at": "2026-10-29T23:11:15.913194044Z",
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
  "session_id": "97676209-a9e1-4c9e-889c-8e76b9f9fde3",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMxNzYsImlhdCI6MTc5MzI3MjI3NiwianRpIjoiMDk4ZWNmY2EtMjEyNC00MTY2LTgzZjItZjJjYTdhZTcwMjBmIiwic2lkIjoiOTc2NzYyMDktYTllMS00YzllLTg4OWMtOGU3NmI5ZjlmZGUzIn0.1_E5SA3g8mZaQihnAhc-ST-WKM2tqXfr2ZBPHCvv5bc",
  "access_expires_at": "2026-10-29T11:26:16.493793988Z",
  "refresh_token": "sweSzjyeJnWS8RTsnTpuxkvZGaHz6XvsVAM5IATG8Vw",
  "refresh_expires_at": "2026-10-29T23:11:16.493202712Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/807eda0c-a87c-4903-a2e1-6960e9d8f27a` → **200**

```json
{
  "id": "807eda0c-a87c-4903-a2e1-6960e9d8f27a",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "dd56cbfd-da67-4409-9662-4369cb992b60",
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
    "id": "74e43ce3-b854-4bd9-a694-c722b603864d",
    "order_id": "807eda0c-a87c-4903-a2e1-6960e9d8f27a",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "369779cc-2e5b-4420-8318-98003058c936",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T11:11:12.316974Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/807eda0c-a87c-4903-a2e1-6960e9d8f27a/interrupt` → **200**

```json
{
  "command_id": "b1758b6d-0685-422f-a54d-a1c999d47ea9",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "807eda0c-a87c-4903-a2e1-6960e9d8f27a",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "dd56cbfd-da67-4409-9662-4369cb992b60",
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
      "id": "74e43ce3-b854-4bd9-a694-c722b603864d",
      "order_id": "807eda0c-a87c-4903-a2e1-6960e9d8f27a",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "369779cc-2e5b-4420-8318-98003058c936",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T11:11:12.316974Z",
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
    "id": "66267a6f-85c8-4c39-abe0-e45ea3468b64",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "dd56cbfd-da67-4409-9662-4369cb992b60",
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
    "id": "c50e5354-29b4-4a01-be6e-48a3233f9cdc",
    "order_id": "66267a6f-85c8-4c39-abe0-e45ea3468b64",
    "expires_at": "2026-10-29T11:11:32.065155Z",
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

`POST /api/driver/v1/offers/c50e5354-29b4-4a01-be6e-48a3233f9cdc/accept` → **200**

```json
{
  "command_id": "141c9bfd-6587-4e3b-830c-78ca88c83e40"
}
```

```json
{
  "id": "b8a25f32-a129-4944-9adc-5a0d06e13011",
  "order_id": "66267a6f-85c8-4c39-abe0-e45ea3468b64",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c2d61897-f835-4283-ad29-edff02a17d75",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c2d61897-f835-4283-ad29-edff02a17d75",
  "order_id": "66267a6f-85c8-4c39-abe0-e45ea3468b64",
  "assignment_id": "b8a25f32-a129-4944-9adc-5a0d06e13011",
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
  "session_id": "20424e8f-c4be-4b13-91f0-44354801b876",
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
  "last_heartbeat_at": "2026-10-29T11:11:15.338256Z",
  "last_location_at": "2026-10-29T11:11:15.338256Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/20424e8f-c4be-4b13-91f0-44354801b876/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:11:18Z",
    "sequence": 1793272278428
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "20424e8f-c4be-4b13-91f0-44354801b876",
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
  "last_heartbeat_at": "2026-10-29T11:11:18.446009Z",
  "last_location_at": "2026-10-29T11:11:18.446009Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c2d61897-f835-4283-ad29-edff02a17d75/arrive` → **200**

```json
{
  "command_id": "07026b70-caed-48e3-82b5-e977e31ea6a4",
  "expected_version": 0
}
```

```json
{
  "id": "c2d61897-f835-4283-ad29-edff02a17d75",
  "order_id": "66267a6f-85c8-4c39-abe0-e45ea3468b64",
  "assignment_id": "b8a25f32-a129-4944-9adc-5a0d06e13011",
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
  "arrived_at": "2026-10-29T11:11:18.720083Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c2d61897-f835-4283-ad29-edff02a17d75/start` → **200**

```json
{
  "command_id": "2872ca49-12bc-4c43-994d-2e0431178c15",
  "expected_version": 1
}
```

```json
{
  "id": "c2d61897-f835-4283-ad29-edff02a17d75",
  "order_id": "66267a6f-85c8-4c39-abe0-e45ea3468b64",
  "assignment_id": "b8a25f32-a129-4944-9adc-5a0d06e13011",
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
  "arrived_at": "2026-10-29T11:11:18.720083Z",
  "started_at": "2026-10-29T11:11:19.004337Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c2d61897-f835-4283-ad29-edff02a17d75/complete` → **200**

```json
{
  "command_id": "d2cb9951-a787-4bf2-b7ce-662ffb9b0766",
  "expected_version": 2,
  "reported_at": "2026-10-29T11:11:19Z"
}
```

```json
{
  "id": "c2d61897-f835-4283-ad29-edff02a17d75",
  "order_id": "66267a6f-85c8-4c39-abe0-e45ea3468b64",
  "assignment_id": "b8a25f32-a129-4944-9adc-5a0d06e13011",
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
  "arrived_at": "2026-10-29T11:11:18.720083Z",
  "started_at": "2026-10-29T11:11:19.004337Z",
  "completed_at": "2026-10-29T11:11:19.303557Z",
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
    "id": "66267a6f-85c8-4c39-abe0-e45ea3468b64",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-29T11:11:17.055075Z",
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
    "id": "807eda0c-a87c-4903-a2e1-6960e9d8f27a",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-29T11:11:12.316974Z",
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

`GET /api/operator/v1/orders/807eda0c-a87c-4903-a2e1-6960e9d8f27a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T11:11:12.31752Z",
      "actor": {
        "type": "CLIENT",
        "id": "dd56cbfd-da67-4409-9662-4369cb992b60",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "807eda0c-a87c-4903-a2e1-6960e9d8f27a",
        "quote_id": "f2e21bdc-8584-4fdf-bdbd-bd4590e650ec",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "09002b8b-4cb1-44f8-8746-1e835da29fd4"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T11:11:12.319264Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "807eda0c-a87c-4903-a2e1-6960e9d8f27a",
        "attempt_id": "87285d05-ab4e-467c-b77a-3db7e8d5a48c",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "09002b8b-4cb1-44f8-8746-1e835da29fd4"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T11:11:12.321802Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "8d2414f6-5819-4ada-8a8f-f67852e195dc",
        "order_id": "807eda0c-a87c-4903-a2e1-6960e9d8f27a",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "09002b8b-4cb1-44f8-8746-1e835da29fd4"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T11:11:12.86428Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "8d2414f6-5819-4ada-8a8f-f67852e195dc",
        "order_id": "807eda0c-a87c-4903-a2e1-6960e9d8f27a",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "74e43ce3-b854-4bd9-a694-c722b603864d"
      },
      "correlation_id": "c95565a9-b757-432f-b86f-d13c26c23659"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/66267a6f-85c8-4c39-abe0-e45ea3468b64/tip` → **200**

```json
{
  "order_id": "66267a6f-85c8-4c39-abe0-e45ea3468b64",
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
  "available_until": "2026-10-30T11:11:19.303557Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/66267a6f-85c8-4c39-abe0-e45ea3468b64/tip` → **409**

```json
{
  "command_id": "6589ade8-fc18-43c4-bda4-6d6016b82d8b",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/66267a6f-85c8-4c39-abe0-e45ea3468b64/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "0fd3eb29-9d30-4bae-aec6-22a605c0715e"
}
```

Done: interrupted 807eda0c-a87c-4903-a2e1-6960e9d8f27a, follow-up 66267a6f-85c8-4c39-abe0-e45ea3468b64.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4db7fa66-ee94-412d-9244-9780a6ef07b5",
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
  "last_heartbeat_at": "2026-10-29T11:11:14.242615Z",
  "last_location_at": "2026-10-29T11:11:14.242615Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4db7fa66-ee94-412d-9244-9780a6ef07b5/close` → **200**

```json
{
  "command_id": "1df0225e-ffa0-4df7-9a7a-f52dc2a76b4a",
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
  "session_id": "20424e8f-c4be-4b13-91f0-44354801b876",
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
  "last_heartbeat_at": "2026-10-29T11:11:18.446009Z",
  "last_location_at": "2026-10-29T11:11:18.446009Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/20424e8f-c4be-4b13-91f0-44354801b876/close` → **200**

```json
{
  "command_id": "9a636b9e-a320-4c35-9f43-d80925c69c61",
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
  "session_id": "0c17d6a0-a22d-44ce-8696-dd1f13ac3373",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMxODUsImlhdCI6MTc5MzI3MjI4NSwianRpIjoiYTFhN2ZmN2ItMmQ0Yi00ZjFhLTkyMjQtN2QxMjg5MzQxN2FiIiwic2lkIjoiMGMxN2Q2YTAtYTIyZC00NGNlLTg2OTYtZGQxZjEzYWMzMzczIn0.AsjWMliwD9DgXDomUGg6-v4mDV5on4QVW2PNRPtiuzo",
  "access_expires_at": "2026-10-29T11:26:25.373528854Z",
  "refresh_token": "8bXIj5Zef84NNMJqKGl9tbMiEF0MgBCVPEzVBe8F8ds",
  "refresh_expires_at": "2026-10-29T23:11:25.372531496Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "bec193bf-7cdb-49d8-beb5-69fe8e13c262",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T11:11:25Z"
}
```

```json
{
  "id": "d0696fd8-775a-4679-b01d-223adefea10c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T11:11:25Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/d0696fd8-775a-4679-b01d-223adefea10c/publish` → **200**

```json
{
  "command_id": "915d66ba-7f9b-45d3-adbf-b8c1de38a233",
  "expected_version": 0
}
```

```json
{
  "id": "d0696fd8-775a-4679-b01d-223adefea10c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T11:11:25.949056Z",
  "published_at": "2026-10-29T11:11:25.949056Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "d0696fd8-775a-4679-b01d-223adefea10c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T11:11:25.949056Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631420879",
  "device_ref": "sandbox-31356"
}
```

```json
{
  "challenge_id": "87ab1d38-8b32-4597-8256-cb95f5da0458",
  "expires_at": "2026-10-29T11:16:26.483046521Z",
  "resend_available_at": "2026-10-29T11:11:27.483046521Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631420879` → **200**

```json
{
  "phone": "+380631420879",
  "audience": "CLIENT",
  "code": "405684",
  "sent_at": "2026-10-29T11:11:26.486369728Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "87ab1d38-8b32-4597-8256-cb95f5da0458",
  "code": "405684",
  "device_ref": "sandbox-31356"
}
```

```json
{
  "session_id": "eb7ac61d-5394-493d-bf4d-f0967d98bd9b",
  "subject": {
    "type": "CLIENT",
    "id": "edc50016-3247-4e7a-8c5f-2df218609066"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZGM1MDAxNi0zMjQ3LTRlN2EtOGM1Zi0yZGYyMTg2MDkwNjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMTg2LCJpYXQiOjE3OTMyNzIyODYsImp0aSI6ImU3MmFjZmQ1LTc3MTUtNDQxNC1hOTVjLWFkY2IyMTMzMzBjNSIsInNpZCI6ImViN2FjNjFkLTUzOTQtNDkzZC1iZjRkLWYwOTY3ZDk4YmQ5YiJ9.qLWncgDakCuUCH_UUn9tTZ4x3YcGfc_N-DtYuXlowv0",
  "access_expires_at": "2026-10-29T11:26:26.897356071Z",
  "refresh_token": "kR-Tm4lXL5RFLJDQxSGRh4wXT7KAXo48ql3zHGkI0e0",
  "refresh_expires_at": "2026-11-28T11:11:26.896875264Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "d0696fd8-775a-4679-b01d-223adefea10c",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T11:11:25.949056Z",
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
  "command_id": "336bf054-7e3d-4721-898d-93c32bb218d7",
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
  "id": "cc840be4-7c77-4e13-a534-5e71d04bb747",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:16:27.437984Z",
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
  "command_id": "5b573d71-79cf-4b52-aebc-c619d0382624",
  "quote_id": "cc840be4-7c77-4e13-a534-5e71d04bb747",
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
  "correlation_id": "0fc964bb-0f52-43c9-bcbb-b96abec23815"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "40c263f9-731a-448f-be76-29e574393e1d",
  "version_id": "d0696fd8-775a-4679-b01d-223adefea10c",
  "language": "uk"
}
```

```json
{
  "version_id": "d0696fd8-775a-4679-b01d-223adefea10c",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T11:11:28.000366Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "68548f78-926c-4ff8-b808-94f1a69f8f22",
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
  "id": "946846d7-0f6d-48cb-bc65-c62d898d8ec8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:16:28.273313Z",
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
  "command_id": "09ff941f-6f09-4ab2-a137-d571785dc921",
  "quote_id": "946846d7-0f6d-48cb-bc65-c62d898d8ec8",
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
  "id": "c02d9bbc-3f8f-469f-89ae-c5353a8e02ce",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "edc50016-3247-4e7a-8c5f-2df218609066",
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
  "created_at": "2026-10-29T11:11:28.547204Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c02d9bbc-3f8f-469f-89ae-c5353a8e02ce` → **200**

```json
{
  "id": "c02d9bbc-3f8f-469f-89ae-c5353a8e02ce",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "edc50016-3247-4e7a-8c5f-2df218609066",
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
  "created_at": "2026-10-29T11:11:28.547204Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c02d9bbc-3f8f-469f-89ae-c5353a8e02ce/cancel` → **200**

```json
{
  "command_id": "0ff50402-bf5b-4b61-930d-1d232659d499",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c02d9bbc-3f8f-469f-89ae-c5353a8e02ce",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "edc50016-3247-4e7a-8c5f-2df218609066",
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
  "created_at": "2026-10-29T11:11:28.547204Z",
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

`POST /api/admin/v1/legal-documents/d0696fd8-775a-4679-b01d-223adefea10c` → **409**

```json
{
  "command_id": "26c1d185-88fd-414f-a64c-8550060c53e4",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T11:11:29Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/d0696fd8-775a-4679-b01d-223adefea10c",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ffc4aee4-8642-435e-bbf1-aaa1583aad46"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "6c442bb9-865a-4273-9638-831eee3c1d79",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T11:11:29Z"
}
```

```json
{
  "id": "e55f7c19-8c91-40e3-9483-6df89d7a97d1",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T11:11:29Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/e55f7c19-8c91-40e3-9483-6df89d7a97d1/publish` → **200**

```json
{
  "command_id": "73ca75e1-4fb3-480f-91f6-31300291f20e",
  "expected_version": 0
}
```

```json
{
  "id": "e55f7c19-8c91-40e3-9483-6df89d7a97d1",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T11:11:29.956118Z",
  "published_at": "2026-10-29T11:11:29.956118Z",
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
  "device_ref": "sandbox-16107"
}
```

```json
{
  "challenge_id": "f26f43e9-db80-4f3e-8a5e-5aa2bee63a51",
  "expires_at": "2026-10-29T11:16:30.228851978Z",
  "resend_available_at": "2026-10-29T11:11:31.228851978Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "941683",
  "sent_at": "2026-10-29T11:11:30.231114604Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f26f43e9-db80-4f3e-8a5e-5aa2bee63a51",
  "code": "941683",
  "device_ref": "sandbox-16107"
}
```

```json
{
  "session_id": "03eaf475-8833-46a5-8c18-7be404b7dab5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MzE5MCwiaWF0IjoxNzkzMjcyMjkwLCJqdGkiOiI4NWQxN2VlYS03NzI1LTQxMmMtYWZmOS0zMTIxYTRkOGRkNjQiLCJzaWQiOiIwM2VhZjQ3NS04ODMzLTQ2YTUtOGMxOC03YmU0MDRiN2RhYjUifQ.G-pLymZvpbERcZMrUrLaoX8Ffv-xcARjvoMCFz-AMpU",
  "access_expires_at": "2026-10-29T11:26:30.521339277Z",
  "refresh_token": "cRotg0QWFWKgH-HvWEhLcul8ZUooLfluhrFVOay6o8U",
  "refresh_expires_at": "2026-11-28T11:11:30.520460318Z",
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
  "command_id": "bfc292ff-7907-42ca-ab95-11e8ad1477be",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:11:31Z",
    "sequence": 1793272291509
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "db8ccbdc-b309-4d6a-afe4-acf6efd7544e",
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
  "last_heartbeat_at": "2026-10-29T11:11:31.068086Z",
  "last_location_at": "2026-10-29T11:11:31.068086Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677869317",
  "device_ref": "sandbox-14233"
}
```

```json
{
  "challenge_id": "e8b1132c-e668-48e3-8331-9d7982b7f6ba",
  "expires_at": "2026-10-29T11:16:31.335402376Z",
  "resend_available_at": "2026-10-29T11:11:32.335402376Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677869317` → **200**

```json
{
  "phone": "+380677869317",
  "audience": "CLIENT",
  "code": "456006",
  "sent_at": "2026-10-29T11:11:31.338125041Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e8b1132c-e668-48e3-8331-9d7982b7f6ba",
  "code": "456006",
  "device_ref": "sandbox-14233"
}
```

```json
{
  "session_id": "fcfe3c24-7bd9-4a38-abfa-7e2b65a952fe",
  "subject": {
    "type": "CLIENT",
    "id": "f5fc365e-c5ba-4aff-9725-cc7114c677c3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNWZjMzY1ZS1jNWJhLTRhZmYtOTcyNS1jYzcxMTRjNjc3YzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMTkxLCJpYXQiOjE3OTMyNzIyOTEsImp0aSI6IjM0ODNjOWYxLTM2ZjAtNDEwNS1hOGI4LTkxOWVhODM3MWZkZCIsInNpZCI6ImZjZmUzYzI0LTdiZDktNGEzOC1hYmZhLTdlMmI2NWE5NTJmZSJ9.6MnG3L_6RLUfTCScxF5NMoxVOdLb1oIiTB39BbJGqoQ",
  "access_expires_at": "2026-10-29T11:26:31.629099398Z",
  "refresh_token": "n9bPI4NmXoF8HC9EWvAc-gY3_p-f0uu2iFDVEYjHHNU",
  "refresh_expires_at": "2026-11-28T11:11:31.628537374Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f56fec08-fa0a-43b9-bec5-4396ffba7619",
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
  "id": "0383e12c-620f-444e-ae9b-56c7bcb30ebc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:16:31.903965Z",
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
  "command_id": "fa149098-6595-42cd-9e7f-9c4478f2a4bd",
  "quote_id": "0383e12c-620f-444e-ae9b-56c7bcb30ebc",
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
    "phone": "+380675707379"
  }
}
```

```json
{
  "id": "90ab9669-f6fe-4ccb-95bf-65d23ec77db8",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5fc365e-c5ba-4aff-9725-cc7114c677c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T11:11:32.187968Z",
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
    "id": "69aa6455-9b33-451d-bce2-5029135b06ad",
    "order_id": "90ab9669-f6fe-4ccb-95bf-65d23ec77db8",
    "expires_at": "2026-10-29T11:11:47.192186Z",
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

`POST /api/driver/v1/offers/69aa6455-9b33-451d-bce2-5029135b06ad/accept` → **200**

```json
{
  "command_id": "108c56c9-0bfe-4fa2-b5b8-268e8fe66ef0"
}
```

```json
{
  "id": "a1bd5409-c45e-414e-8aa3-a003ebc546dc",
  "order_id": "90ab9669-f6fe-4ccb-95bf-65d23ec77db8",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9754594d-7b8c-45ef-aff1-8fd6ca09a0a2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9754594d-7b8c-45ef-aff1-8fd6ca09a0a2",
  "order_id": "90ab9669-f6fe-4ccb-95bf-65d23ec77db8",
  "assignment_id": "a1bd5409-c45e-414e-8aa3-a003ebc546dc",
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
    "phone": "+380675707379"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "da4ea776-e5d1-4039-9b01-99d0eab57860",
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
  "id": "66916709-b4a1-484e-849c-21b62cbdca0c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:16:33.278328Z",
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
  "command_id": "fa973e55-7ff2-435d-a471-008741e1e3d7",
  "quote_id": "66916709-b4a1-484e-849c-21b62cbdca0c",
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
  "id": "b5d3860a-e506-4477-a82e-db8a50df515b",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5fc365e-c5ba-4aff-9725-cc7114c677c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:11:33.557942Z",
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
  "command_id": "16410035-b8ec-44e3-b882-cc42531ca0b9",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T14:11:33Z"
}
```

```json
{
  "id": "cd405cf5-b020-4df9-b9f6-49beee8dddd2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:16:33.853106Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T14:11:33Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "aacd1ca9-5eb0-4e72-9b36-be3f55572c61",
  "quote_id": "cd405cf5-b020-4df9-b9f6-49beee8dddd2",
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
  "pickup_at": "2026-10-29T14:11:33Z"
}
```

```json
{
  "id": "351d6039-691a-497d-b0cd-d5ce9729d43c",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f5fc365e-c5ba-4aff-9725-cc7114c677c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T11:11:34.133814Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T14:11:33Z",
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
  "command_id": "ee759570-faa9-4119-a5aa-7185e841c1cd",
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
  "id": "0cc6269b-3012-43c4-aa68-b40e7e336d8e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:16:34.438263Z",
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
  "command_id": "412381d4-ba5c-418c-a5a4-5bef17227186",
  "quote_id": "0cc6269b-3012-43c4-aa68-b40e7e336d8e",
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
  "correlation_id": "8d115909-e1ea-437c-aa62-46941a6f7a62"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "351d6039-691a-497d-b0cd-d5ce9729d43c",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "f5fc365e-c5ba-4aff-9725-cc7114c677c3",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-29T11:11:34.133814Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T14:11:33Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "b5d3860a-e506-4477-a82e-db8a50df515b",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "f5fc365e-c5ba-4aff-9725-cc7114c677c3",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-29T11:11:33.557942Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "90ab9669-f6fe-4ccb-95bf-65d23ec77db8",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "b5d3860a-e506-4477-a82e-db8a50df515b",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5fc365e-c5ba-4aff-9725-cc7114c677c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:11:33.557942Z",
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

`GET /api/rider/v1/orders/90ab9669-f6fe-4ccb-95bf-65d23ec77db8` → **200**

```json
{
  "id": "90ab9669-f6fe-4ccb-95bf-65d23ec77db8",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f5fc365e-c5ba-4aff-9725-cc7114c677c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "a1bd5409-c45e-414e-8aa3-a003ebc546dc",
    "order_id": "90ab9669-f6fe-4ccb-95bf-65d23ec77db8",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "9754594d-7b8c-45ef-aff1-8fd6ca09a0a2",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T11:11:32.187968Z",
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
    "location_at": "2026-10-29T11:11:31.068086Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/90ab9669-f6fe-4ccb-95bf-65d23ec77db8/cancel` → **200**

```json
{
  "command_id": "863b61a8-88bd-4fb0-9482-b82739182fe5",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "90ab9669-f6fe-4ccb-95bf-65d23ec77db8",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "f5fc365e-c5ba-4aff-9725-cc7114c677c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "a1bd5409-c45e-414e-8aa3-a003ebc546dc",
    "order_id": "90ab9669-f6fe-4ccb-95bf-65d23ec77db8",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "9754594d-7b8c-45ef-aff1-8fd6ca09a0a2",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T11:11:32.187968Z",
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

`GET /api/rider/v1/orders/b5d3860a-e506-4477-a82e-db8a50df515b` → **200**

```json
{
  "id": "b5d3860a-e506-4477-a82e-db8a50df515b",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5fc365e-c5ba-4aff-9725-cc7114c677c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:11:33.557942Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b5d3860a-e506-4477-a82e-db8a50df515b/cancel` → **200**

```json
{
  "command_id": "38983d52-0a11-446d-b2a1-86d38cfa9ad0",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b5d3860a-e506-4477-a82e-db8a50df515b",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f5fc365e-c5ba-4aff-9725-cc7114c677c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T11:11:33.557942Z",
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

`GET /api/rider/v1/orders/351d6039-691a-497d-b0cd-d5ce9729d43c` → **200**

```json
{
  "id": "351d6039-691a-497d-b0cd-d5ce9729d43c",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f5fc365e-c5ba-4aff-9725-cc7114c677c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T11:11:34.133814Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T14:11:33Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/351d6039-691a-497d-b0cd-d5ce9729d43c/cancel` → **200**

```json
{
  "command_id": "61e8554f-dc18-44d4-a627-8240e6cf43b1",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "351d6039-691a-497d-b0cd-d5ce9729d43c",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "f5fc365e-c5ba-4aff-9725-cc7114c677c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T11:11:34.133814Z",
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
  "pickup_at": "2026-10-29T14:11:33Z",
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
  "session_id": "db8ccbdc-b309-4d6a-afe4-acf6efd7544e",
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
  "last_heartbeat_at": "2026-10-29T11:11:31.068086Z",
  "last_location_at": "2026-10-29T11:11:31.068086Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/db8ccbdc-b309-4d6a-afe4-acf6efd7544e/close` → **200**

```json
{
  "command_id": "fc779afa-e2e7-41ce-99df-3274ec745147",
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

Done: orders 90ab9669-f6fe-4ccb-95bf-65d23ec77db8, b5d3860a-e506-4477-a82e-db8a50df515b, 351d6039-691a-497d-b0cd-d5ce9729d43c.

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
  "session_id": "beb30278-04ac-42d2-b58f-453b243ce3f7",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMxOTgsImlhdCI6MTc5MzI3MjI5OCwianRpIjoiNThhZWUxM2UtNTljYS00NjkyLWI0OGMtNmFlNTBmMzRlOTEzIiwic2lkIjoiYmViMzAyNzgtMDRhYy00MmQyLWI1OGYtNDUzYjI0M2NlM2Y3In0.Q9IMSV4RkG_AAgCLrCGMwMMez6M1AjIviFiJUa3imE0",
  "access_expires_at": "2026-10-29T11:26:38.098552196Z",
  "refresh_token": "kuyyoOC3WpRvUxV5fcZtrLiqy6Si9tNlExcw0mLjYwY",
  "refresh_expires_at": "2026-10-29T23:11:38.097976833Z",
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
  "session_id": "cdb97a53-ddf7-48a1-83d1-3c253b7b5f51",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMxOTgsImlhdCI6MTc5MzI3MjI5OCwianRpIjoiMGYxYmZmZTQtNmMxZS00ZGU1LTgzZDctNDgzODYzMDEzOWI4Iiwic2lkIjoiY2RiOTdhNTMtZGRmNy00OGExLTgzZDEtM2MyNTNiN2I1ZjUxIn0.k4lzuCBt323mAsyBi4Sc2eKZqEScU0q4bNcvL_ogIQ8",
  "access_expires_at": "2026-10-29T11:26:38.67033356Z",
  "refresh_token": "Fk9OpjyDKl-oB_ICElqNCMNQcCFw4uKamt9lWD0Balg",
  "refresh_expires_at": "2026-10-29T23:11:38.669885076Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6449"
}
```

```json
{
  "challenge_id": "caecb629-3e48-4866-aa4f-e025545f574f",
  "expires_at": "2026-10-29T11:16:38.926377743Z",
  "resend_available_at": "2026-10-29T11:11:39.926377743Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "666249",
  "sent_at": "2026-10-29T11:11:38.928928297Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "caecb629-3e48-4866-aa4f-e025545f574f",
  "code": "666249",
  "device_ref": "sandbox-6449"
}
```

```json
{
  "session_id": "7f657dff-e1bd-4618-984f-cf8a4b67c0ea",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MzE5OSwiaWF0IjoxNzkzMjcyMjk5LCJqdGkiOiIxNDE2MmMzNi1hYzI0LTRjNzgtOTAyZS1lNGNhNGQ1MjE5NzkiLCJzaWQiOiI3ZjY1N2RmZi1lMWJkLTQ2MTgtOTg0Zi1jZjhhNGI2N2MwZWEifQ.j2oM3qR0VS3znVLA5Pw17-TP2zvyt82_flbnHqUs3ic",
  "access_expires_at": "2026-10-29T11:26:39.21137009Z",
  "refresh_token": "O_1pjq7zeLU8EKA6yDZ-7KxZDXXlLqFxsjss3LEXNmg",
  "refresh_expires_at": "2026-11-28T11:11:39.21075836Z",
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
  "command_id": "e8802678-398c-46e3-9b9d-ccab0ab52429",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:11:39Z",
    "sequence": 1793272299753
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8421f7e7-f330-41eb-8a73-cd4cf11400a8",
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
  "last_heartbeat_at": "2026-10-29T11:11:39.773687Z",
  "last_location_at": "2026-10-29T11:11:39.773687Z",
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
  "command_id": "9efa1f5d-26c7-46d0-b5cd-cbc1222524eb",
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
  "effective_at": "2026-10-29T11:11:40.664852Z",
  "changed_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T11:09:06.52669Z",
  "last_entries": [
    {
      "order_id": "181bb042-515f-4554-9947-bbf6523e902e",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T11:09:06.52669Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "59212b82-dc02-4067-946c-1b15ab82053f",
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
  "id": "e3ab48e5-49c2-4f80-9aa0-79393507c7b7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:16:41.204612Z",
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
  "command_id": "f08b4214-903a-46a4-8177-b7db1489eaa0",
  "quote_id": "e3ab48e5-49c2-4f80-9aa0-79393507c7b7",
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
    "phone": "+3806711127860"
  }
}
```

```json
{
  "id": "af3807d5-223d-448b-bc1b-8460b5e34149",
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
  "created_at": "2026-10-29T11:11:41.49135Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711127860"
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
    "id": "53464982-7d9f-47e2-a687-9dbf316e3483",
    "order_id": "af3807d5-223d-448b-bc1b-8460b5e34149",
    "expires_at": "2026-10-29T11:11:56.494928Z",
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

`POST /api/driver/v1/offers/53464982-7d9f-47e2-a687-9dbf316e3483/accept` → **200**

```json
{
  "command_id": "cc29281e-8384-48f8-8d60-ec5f988505d2"
}
```

```json
{
  "id": "49bba840-1229-45ae-b6a6-2634d1cf99cc",
  "order_id": "af3807d5-223d-448b-bc1b-8460b5e34149",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "13d8e50b-360d-4155-91f3-c0f2f28c9c03",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "13d8e50b-360d-4155-91f3-c0f2f28c9c03",
  "order_id": "af3807d5-223d-448b-bc1b-8460b5e34149",
  "assignment_id": "49bba840-1229-45ae-b6a6-2634d1cf99cc",
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
    "phone": "+3806711127860"
  }
}
```

`POST /api/driver/v1/work-sessions/8421f7e7-f330-41eb-8a73-cd4cf11400a8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:11:42Z",
    "sequence": 1793272302564
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8421f7e7-f330-41eb-8a73-cd4cf11400a8",
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
  "last_heartbeat_at": "2026-10-29T11:11:42.582516Z",
  "last_location_at": "2026-10-29T11:11:42.582516Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/13d8e50b-360d-4155-91f3-c0f2f28c9c03/arrive` → **200**

```json
{
  "command_id": "0457deab-1706-4003-83ef-6de9c54658d1",
  "expected_version": 0
}
```

```json
{
  "id": "13d8e50b-360d-4155-91f3-c0f2f28c9c03",
  "order_id": "af3807d5-223d-448b-bc1b-8460b5e34149",
  "assignment_id": "49bba840-1229-45ae-b6a6-2634d1cf99cc",
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
  "arrived_at": "2026-10-29T11:11:42.86594Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711127860"
  }
}
```

`POST /api/driver/v1/trips/13d8e50b-360d-4155-91f3-c0f2f28c9c03/start` → **200**

```json
{
  "command_id": "dcba3242-7bed-4f3d-84f5-96c0089746dd",
  "expected_version": 1
}
```

```json
{
  "id": "13d8e50b-360d-4155-91f3-c0f2f28c9c03",
  "order_id": "af3807d5-223d-448b-bc1b-8460b5e34149",
  "assignment_id": "49bba840-1229-45ae-b6a6-2634d1cf99cc",
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
  "arrived_at": "2026-10-29T11:11:42.86594Z",
  "started_at": "2026-10-29T11:11:43.14691Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711127860"
  }
}
```

`POST /api/driver/v1/trips/13d8e50b-360d-4155-91f3-c0f2f28c9c03/complete` → **200**

```json
{
  "command_id": "1937bcb8-2707-470d-9003-48b630e19506",
  "expected_version": 2,
  "reported_at": "2026-10-29T11:11:43Z",
  "cash_received": true
}
```

```json
{
  "id": "13d8e50b-360d-4155-91f3-c0f2f28c9c03",
  "order_id": "af3807d5-223d-448b-bc1b-8460b5e34149",
  "assignment_id": "49bba840-1229-45ae-b6a6-2634d1cf99cc",
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
  "arrived_at": "2026-10-29T11:11:42.86594Z",
  "started_at": "2026-10-29T11:11:43.14691Z",
  "completed_at": "2026-10-29T11:11:43.433692Z",
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
  "command_id": "a9809447-9b08-47bc-8d48-b1f24ec6c079",
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
  "id": "ee489397-4ca6-47a8-8d21-a55ec93bb6e2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:16:43.721669Z",
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
  "command_id": "82bf17e6-534f-4396-b6ea-3b5eaa840bc4",
  "quote_id": "ee489397-4ca6-47a8-8d21-a55ec93bb6e2",
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
    "phone": "+3806711116508"
  }
}
```

```json
{
  "id": "d40e9cc9-5fe5-4275-93d5-e143b15bcd54",
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
  "created_at": "2026-10-29T11:11:44.011393Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711116508"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/d40e9cc9-5fe5-4275-93d5-e143b15bcd54` → **200**

```json
{
  "id": "d40e9cc9-5fe5-4275-93d5-e143b15bcd54",
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
  "created_at": "2026-10-29T11:11:44.011393Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711116508"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d40e9cc9-5fe5-4275-93d5-e143b15bcd54/cancel` → **200**

```json
{
  "command_id": "9afcd5f5-65a1-4b77-afa6-77ede85a9df4",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "d40e9cc9-5fe5-4275-93d5-e143b15bcd54",
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
  "created_at": "2026-10-29T11:11:44.011393Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711116508"
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
  "staff_id": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-29T11:09:06.52669Z",
  "last_entries": [
    {
      "order_id": "d40e9cc9-5fe5-4275-93d5-e143b15bcd54",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-29T11:11:44.59209Z"
    },
    {
      "order_id": "af3807d5-223d-448b-bc1b-8460b5e34149",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-29T11:11:43.438049Z"
    },
    {
      "order_id": "181bb042-515f-4554-9947-bbf6523e902e",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T11:09:06.52669Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8421f7e7-f330-41eb-8a73-cd4cf11400a8",
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
  "last_heartbeat_at": "2026-10-29T11:11:42.582516Z",
  "last_location_at": "2026-10-29T11:11:42.582516Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8421f7e7-f330-41eb-8a73-cd4cf11400a8/close` → **200**

```json
{
  "command_id": "e5bade0a-b897-4acf-9aa7-f37307766bb1",
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

Done: operator bonus for fulfilled af3807d5-223d-448b-bc1b-8460b5e34149 and operator-fault cancellation d40e9cc9-5fe5-4275-93d5-e143b15bcd54.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673520013",
  "device_ref": "sandbox-17372"
}
```

```json
{
  "challenge_id": "1a86ee83-d197-449a-8d52-12f32472cd15",
  "expires_at": "2026-10-29T11:16:48.926240739Z",
  "resend_available_at": "2026-10-29T11:11:49.926240739Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673520013` → **200**

```json
{
  "phone": "+380673520013",
  "audience": "CLIENT",
  "code": "577342",
  "sent_at": "2026-10-29T11:11:48.928567715Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679890274",
  "device_ref": "sandbox-11325",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "c29e210c-8b10-42a4-af52-4233ae9b5a4c",
  "expires_at": "2026-10-29T11:16:50.424941557Z",
  "resend_available_at": "2026-10-29T11:11:51.424941557Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679890274` → **200**

```json
{
  "phone": "+380679890274",
  "audience": "CLIENT",
  "code": "331869",
  "sent_at": "2026-10-29T11:11:50.427025276Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679890274",
  "device_ref": "sandbox-9746",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "e7d14b7c-c23c-4f39-871f-f83c5aa40a0a",
  "expires_at": "2026-10-29T11:16:51.914958897Z",
  "resend_available_at": "2026-10-29T11:11:52.914958897Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380679890274` → **200**

```json
{
  "phone": "+380679890274",
  "audience": "CLIENT",
  "code": "903168",
  "sent_at": "2026-10-29T11:11:51.918022599Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674410000",
  "device_ref": "sandbox-32376"
}
```

```json
{
  "challenge_id": "aff73733-7576-4a39-9e04-22a7c4115279",
  "expires_at": "2026-10-29T11:16:53.407296126Z",
  "resend_available_at": "2026-10-29T11:11:54.407296126Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674410000",
  "device_ref": "sandbox-16129"
}
```

```json
{
  "challenge_id": "d5e5e265-7858-4c52-a609-17331d742125",
  "expires_at": "2026-10-29T11:16:54.884870499Z",
  "resend_available_at": "2026-10-29T11:11:55.884870499Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380674410000` → **200**

```json
{
  "phone": "+380674410000",
  "audience": "CLIENT",
  "code": "954981",
  "sent_at": "2026-10-29T11:11:54.887620968Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674410000",
  "device_ref": "sandbox-10260",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "0ff190b5-7e33-4de9-97f6-0cd0d9ab3c30",
  "expires_at": "2026-10-29T11:16:56.391688569Z",
  "resend_available_at": "2026-10-29T11:11:57.391688569Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380674410000` → **200**

```json
{
  "phone": "+380674410000",
  "audience": "CLIENT",
  "code": "621218",
  "sent_at": "2026-10-29T11:11:56.394279513Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380674410000",
  "device_ref": "sandbox-19928",
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
  "correlation_id": "d3728a60-8cae-4289-950a-2a313501e0e4",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000003343"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "a152a100-92a4-41f1-95c1-e0456f30226b"
}
```

`GET /sandbox/v1/otp?phone=%2B442000003343` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120003830"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "71b42164-a2db-4535-a223-07905e79e287"
}
```

`GET /sandbox/v1/otp?phone=%2B37120003830` → **404**

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
  "session_id": "8e7e6e18-040b-410f-9012-de72a0e7cd95",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMyMTksImlhdCI6MTc5MzI3MjMxOSwianRpIjoiYmRlMmFhOTYtOWUzNS00ZTRjLWI0MGItZDczZTg1YTliZTZmIiwic2lkIjoiOGU3ZTZlMTgtMDQwYi00MTBmLTkwMTItZGU3MmEwZTdjZDk1In0.fBJ6w66SxaOc0uuVJqNut0gXSiKOLDB6zpzim0uAojU",
  "access_expires_at": "2026-10-29T11:26:59.17207771Z",
  "refresh_token": "_ei5-2E3rSQLTYEP870JnpR7Gv503aoLOeCc0fjzG7M",
  "refresh_expires_at": "2026-10-29T23:11:59.171647388Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380674410000` → **200**

```json
{
  "deliveries": [
    {
      "id": "82ee0d84-efae-421d-9b8e-04dea865e8b8",
      "challenge_id": "0ff190b5-7e33-4de9-97f6-0cd0d9ab3c30",
      "phone": "+380674410000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-86f1604a-32d3-4cd3-a753-b33dacf7c004",
      "error": null,
      "attempted_at": "2026-10-29T11:11:56.394772Z"
    },
    {
      "id": "0557a130-f1f1-4d99-835b-a1a5e5cf4411",
      "challenge_id": "d5e5e265-7858-4c52-a609-17331d742125",
      "phone": "+380674410000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-627ed849-c100-4e28-a0f9-24e5a1056658",
      "error": null,
      "attempted_at": "2026-10-29T11:11:54.888165Z"
    },
    {
      "id": "02fa4f54-e42c-4657-a659-307ab5fd20aa",
      "challenge_id": "aff73733-7576-4a39-9e04-22a7c4115279",
      "phone": "+380674410000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-29T11:11:53.41028Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380674410000` → **200**

```json
{
  "phone": "+380674410000",
  "audience": "CLIENT",
  "code": "621218",
  "sent_at": "2026-10-29T11:11:56.394279513Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380679890274` → **200**

```json
{
  "deliveries": [
    {
      "id": "c722cfac-dfe0-47bf-bdfc-af33785d48cd",
      "challenge_id": "e7d14b7c-c23c-4f39-871f-f83c5aa40a0a",
      "phone": "+380679890274",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-62f1ab08-f8ed-4e14-869f-9c5a64e6acb3",
      "error": null,
      "attempted_at": "2026-10-29T11:11:51.918554Z"
    },
    {
      "id": "328ae761-4926-426e-b398-8cb0c53e3d64",
      "challenge_id": "c29e210c-8b10-42a4-af52-4233ae9b5a4c",
      "phone": "+380679890274",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-b889620f-74ec-431d-aa81-ede39bd7bea2",
      "error": null,
      "attempted_at": "2026-10-29T11:11:50.427533Z"
    }
  ]
}
```

Done: SMS to +380673520013; SMS then a call to +380679890274; a failed SMS, two calls and a refused third to +380674410000; +44 and +371 refused.

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
  "session_id": "7be13e47-8200-4909-93d7-01049777b880",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMyMjAsImlhdCI6MTc5MzI3MjMyMCwianRpIjoiMGZiNzBhOGItOGQ4OC00YTViLWI4MzUtNTcwYzFhMTZmZWI3Iiwic2lkIjoiN2JlMTNlNDctODIwMC00OTA5LTkzZDctMDEwNDk3NzdiODgwIn0.KwsiEHldxl1OZWAz8z62F7pCborzZ2bTDZAoxCuEdk8",
  "access_expires_at": "2026-10-29T11:27:00.330705942Z",
  "refresh_token": "SVy88tdx7QDEMUhvmEpFTIJ7AHdfkp4pxSDNU7_5AKU",
  "refresh_expires_at": "2026-10-29T23:12:00.329861988Z",
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
  "session_id": "b1a56b58-8bd4-4964-a04d-a791573e73ac",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMyMjAsImlhdCI6MTc5MzI3MjMyMCwianRpIjoiMWJjZWUyY2MtNjk0MS00OGVjLWE4YTUtY2Q2ZDFlMTQ3YjU1Iiwic2lkIjoiYjFhNTZiNTgtOGJkNC00OTY0LWEwNGQtYTc5MTU3M2U3M2FjIn0.6_nuo1Qg56NHi_KtqsycE-bhcO4-Go_YKeXO-5PV8TA",
  "access_expires_at": "2026-10-29T11:27:00.906191789Z",
  "refresh_token": "jMszycoPlprOpLDXmK5rRLHvadU6RKNZr44DZ-w82Ko",
  "refresh_expires_at": "2026-10-29T23:12:00.905760401Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
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

`POST /api/admin/v1/staff-extensions/d86fcc7f-3fba-4a68-ad64-9a802c519589` → **200**

```json
{
  "command_id": "47a68a51-1078-4ad5-a504-4d0742d863b5",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "f44e8359-fd56-4d9a-8f78-dd7c6289c5fc",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T11:12:01.993531Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T11:12:01.993531Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "53fd393d-df1a-4897-8926-0504f6b7bcf2",
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
  "id": "43aaa86c-0a7f-4829-b2cb-2b9f03c7e3bb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:17:02.524971Z",
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
  "command_id": "f1afc771-e468-4872-9acf-a4fb8966c436",
  "quote_id": "43aaa86c-0a7f-4829-b2cb-2b9f03c7e3bb",
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
    "phone": "+380675888502"
  }
}
```

```json
{
  "id": "2ce22559-431c-4442-8007-21ea07bc221a",
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
  "created_at": "2026-10-29T11:12:02.805546Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675888502"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/2ce22559-431c-4442-8007-21ea07bc221a/calls` → **201**

```json
{
  "command_id": "2cb52665-3e91-42bb-8429-90f3f12f27c0",
  "to": "CALLER"
}
```

```json
{
  "id": "3407e5a0-74a7-4731-936f-9e709d5b3332",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
  "order_ids": [
    "2ce22559-431c-4442-8007-21ea07bc221a"
  ],
  "started_at": "2026-10-29T11:12:03.109918Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/2ce22559-431c-4442-8007-21ea07bc221a/calls` → **201**

```json
{
  "command_id": "2cb52665-3e91-42bb-8429-90f3f12f27c0",
  "to": "CALLER"
}
```

```json
{
  "id": "3407e5a0-74a7-4731-936f-9e709d5b3332",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
  "order_ids": [
    "2ce22559-431c-4442-8007-21ea07bc221a"
  ],
  "started_at": "2026-10-29T11:12:03.109918Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "3407e5a0-74a7-4731-936f-9e709d5b3332",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380675888502",
    "at": "2026-10-29T11:12:03.112303823Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "3407e5a0-74a7-4731-936f-9e709d5b3332",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.21853",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "3407e5a0-74a7-4731-936f-9e709d5b3332"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "3407e5a0-74a7-4731-936f-9e709d5b3332",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=2ce22559-431c-4442-8007-21ea07bc221a` → **200**

```json
{
  "calls": [
    {
      "id": "3407e5a0-74a7-4731-936f-9e709d5b3332",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
      "order_ids": [
        "2ce22559-431c-4442-8007-21ea07bc221a"
      ],
      "started_at": "2026-10-29T11:12:03.109918Z",
      "answered_at": "2026-10-29T11:12:03.718751Z",
      "ended_at": "2026-10-29T11:12:03.737455Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=2ce22559-431c-4442-8007-21ea07bc221a` → **200**

```json
{
  "calls": [
    {
      "id": "3407e5a0-74a7-4731-936f-9e709d5b3332",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
      "order_ids": [
        "2ce22559-431c-4442-8007-21ea07bc221a"
      ],
      "started_at": "2026-10-29T11:12:03.109918Z",
      "answered_at": "2026-10-29T11:12:03.718751Z",
      "ended_at": "2026-10-29T11:12:03.737455Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T11:12:05.317427Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/2ce22559-431c-4442-8007-21ea07bc221a` → **200**

```json
{
  "id": "2ce22559-431c-4442-8007-21ea07bc221a",
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
  "created_at": "2026-10-29T11:12:02.805546Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675888502"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/2ce22559-431c-4442-8007-21ea07bc221a/cancel` → **200**

```json
{
  "command_id": "d1d9b900-f4fd-4bea-9f26-69ecc7649be5",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "2ce22559-431c-4442-8007-21ea07bc221a",
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
  "created_at": "2026-10-29T11:12:02.805546Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675888502"
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
  "command_id": "f6ece45f-0dec-43db-b890-228dd9bc1158",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-29T11:12:06.941697Z",
  "extension": "101"
}
```

Done: outgoing call 3407e5a0-74a7-4731-936f-9e709d5b3332 from order 2ce22559-431c-4442-8007-21ea07bc221a, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634349168",
  "device_ref": "sandbox-9101"
}
```

```json
{
  "challenge_id": "0e5b54d9-95b0-416b-aa11-ebcc23b60f67",
  "expires_at": "2026-10-29T11:17:07.225487152Z",
  "resend_available_at": "2026-10-29T11:12:08.225487152Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634349168` → **200**

```json
{
  "phone": "+380634349168",
  "audience": "CLIENT",
  "code": "839837",
  "sent_at": "2026-10-29T11:12:07.227821336Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0e5b54d9-95b0-416b-aa11-ebcc23b60f67",
  "code": "839837",
  "device_ref": "sandbox-9101"
}
```

```json
{
  "session_id": "68ddeae8-b206-4caf-a554-725cf716efcc",
  "subject": {
    "type": "CLIENT",
    "id": "db1ba04c-234e-45b5-af93-6ea954283c3c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjFiYTA0Yy0yMzRlLTQ1YjUtYWY5My02ZWE5NTQyODNjM2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMjI3LCJpYXQiOjE3OTMyNzIzMjcsImp0aSI6IjExNmI4YmY4LWI5ZjQtNGVjYy1iYzEyLWU0MGI0YzVkMzgwYiIsInNpZCI6IjY4ZGRlYWU4LWIyMDYtNGNhZi1hNTU0LTcyNWNmNzE2ZWZjYyJ9.k8eCZEt74D5_pT58Q5_Vws6NgR2tLj45rSH7_EFcTCA",
  "access_expires_at": "2026-10-29T11:27:07.521029143Z",
  "refresh_token": "VvQOpfwu22lWBdr9zR5Z-zTseTZAsPQYuDtOk-HKsno",
  "refresh_expires_at": "2026-11-28T11:12:07.52054614Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "db1ba04c-234e-45b5-af93-6ea954283c3c",
  "session_id": "68ddeae8-b206-4caf-a554-725cf716efcc",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634349168",
  "device_ref": "sandbox-14288"
}
```

```json
{
  "challenge_id": "280238f7-a9e5-46e5-a337-06fcaeb949c0",
  "expires_at": "2026-10-29T11:17:10.044122917Z",
  "resend_available_at": "2026-10-29T11:12:11.044122917Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634349168` → **200**

```json
{
  "phone": "+380634349168",
  "audience": "CLIENT",
  "code": "356650",
  "sent_at": "2026-10-29T11:12:10.046416052Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "280238f7-a9e5-46e5-a337-06fcaeb949c0",
  "code": "356650",
  "device_ref": "sandbox-14288"
}
```

```json
{
  "session_id": "992d4532-2062-4b63-bdb9-1f6435a3d763",
  "subject": {
    "type": "CLIENT",
    "id": "db1ba04c-234e-45b5-af93-6ea954283c3c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjFiYTA0Yy0yMzRlLTQ1YjUtYWY5My02ZWE5NTQyODNjM2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMjMwLCJpYXQiOjE3OTMyNzIzMzAsImp0aSI6IjY5NTk0YTE0LTcyNTItNDViZC1iMjFjLTk4M2FhZDkyMjRhZiIsInNpZCI6Ijk5MmQ0NTMyLTIwNjItNGI2My1iZGI5LTFmNjQzNWEzZDc2MyJ9.4Mv3hFreVeniQxVT9xSHRYCAFWMiAyHq5_6J5FcEVr8",
  "access_expires_at": "2026-10-29T11:27:10.340078385Z",
  "refresh_token": "Br2Ta6Z6QU9Sc1FAcYpVu75Ca1us-C595aiPLpL79SU",
  "refresh_expires_at": "2026-11-28T11:12:10.339354369Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "f87d0153-8a5e-408b-93a9-d52772df3cd9",
  "expires_at": "2026-10-29T11:17:12.619545382Z",
  "resend_available_at": "2026-10-29T11:12:13.619545382Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634349168` → **200**

```json
{
  "phone": "+380634349168",
  "audience": "CLIENT",
  "code": "355715",
  "sent_at": "2026-10-29T11:12:12.622182288Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380637621201"
}
```

```json
{
  "challenge_id": "f6fa0a86-420e-424d-aa97-7e0876cf6a14",
  "expires_at": "2026-10-29T11:17:12.916698259Z",
  "resend_available_at": "2026-10-29T11:12:13.916698259Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637621201` → **200**

```json
{
  "phone": "+380637621201",
  "audience": "CLIENT",
  "code": "679708",
  "sent_at": "2026-10-29T11:12:12.918582591Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "ffe0161d-70e8-4978-bee6-b533703850a2",
  "current_challenge_id": "f87d0153-8a5e-408b-93a9-d52772df3cd9",
  "current_code": "000000",
  "new_challenge_id": "f6fa0a86-420e-424d-aa97-7e0876cf6a14",
  "new_code": "679708"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "d93a30bf-6a32-41bf-b56d-255306bee5fd"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "56b2c18a-6809-4b10-8a93-ab7df59de670",
  "current_challenge_id": "f87d0153-8a5e-408b-93a9-d52772df3cd9",
  "current_code": "355715",
  "new_challenge_id": "f6fa0a86-420e-424d-aa97-7e0876cf6a14",
  "new_code": "679708"
}
```

```json
{
  "subject_id": "db1ba04c-234e-45b5-af93-6ea954283c3c",
  "phone": "+380637621201",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "db1ba04c-234e-45b5-af93-6ea954283c3c",
  "session_id": "68ddeae8-b206-4caf-a554-725cf716efcc",
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
  "correlation_id": "cdc2499f-8dfc-4713-9059-bf5d95f24980"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637621201",
  "device_ref": "sandbox-19916"
}
```

```json
{
  "challenge_id": "c0a877a2-aa89-49f0-bad0-f1ee7f6b5a19",
  "expires_at": "2026-10-29T11:17:16.287339929Z",
  "resend_available_at": "2026-10-29T11:12:17.287339929Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637621201` → **200**

```json
{
  "phone": "+380637621201",
  "audience": "CLIENT",
  "code": "097796",
  "sent_at": "2026-10-29T11:12:16.29005845Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c0a877a2-aa89-49f0-bad0-f1ee7f6b5a19",
  "code": "097796",
  "device_ref": "sandbox-19916"
}
```

```json
{
  "session_id": "159758e2-6bb1-4d40-9b62-fc2d6a7b834b",
  "subject": {
    "type": "CLIENT",
    "id": "db1ba04c-234e-45b5-af93-6ea954283c3c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjFiYTA0Yy0yMzRlLTQ1YjUtYWY5My02ZWE5NTQyODNjM2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMjM2LCJpYXQiOjE3OTMyNzIzMzYsImp0aSI6ImIyYWVmMDc1LWFhNTktNDZmYS04YWQyLWViNmEyZDM5N2I2NSIsInNpZCI6IjE1OTc1OGUyLTZiYjEtNGQ0MC05YjYyLWZjMmQ2YTdiODM0YiJ9.BW-cmm2SPhdR89nm2uuBrCMdkW_PMXp92TLTGjFOsUI",
  "access_expires_at": "2026-10-29T11:27:16.584220812Z",
  "refresh_token": "PXjetfcHedTb0UM7-o5GFQVSjDu8KyBmvwdZMZty5gc",
  "refresh_expires_at": "2026-11-28T11:12:16.583731731Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "db1ba04c-234e-45b5-af93-6ea954283c3c",
  "session_id": "159758e2-6bb1-4d40-9b62-fc2d6a7b834b",
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
  "session_id": "8f8508e3-2554-42a7-9408-6ce6b53f38a1",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMyMzcsImlhdCI6MTc5MzI3MjMzNywianRpIjoiMzYwMjE1NGUtYTAxNC00MGQ5LWIzNGUtOGZmMTlmZGM4M2IzIiwic2lkIjoiOGY4NTA4ZTMtMjU1NC00MmE3LTk0MDgtNmNlNmI1M2YzOGExIn0.O3c35WXI-vHKK0Ya-mzDBe-TnNpsFU5XjUG05zsqy2E",
  "access_expires_at": "2026-10-29T11:27:17.41172259Z",
  "refresh_token": "khqR8VTmNcJXrwz95jyRkGzzIG9GrSN7Xb5eswM9JoI",
  "refresh_expires_at": "2026-10-29T23:12:17.411306085Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/db1ba04c-234e-45b5-af93-6ea954283c3c` → **200**

```json
{
  "client": {
    "id": "db1ba04c-234e-45b5-af93-6ea954283c3c",
    "phone": "+380637621201",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T11:12:07.518669Z",
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

`POST /api/admin/v1/clients/db1ba04c-234e-45b5-af93-6ea954283c3c/phone/new-code` → **201**

```json
{
  "phone": "+380630042997"
}
```

```json
{
  "challenge_id": "52f4930d-94da-4ae8-96b3-dc97a5c84b3f",
  "expires_at": "2026-10-29T11:17:18.087138916Z",
  "resend_available_at": "2026-10-29T11:12:19.087138916Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630042997` → **200**

```json
{
  "phone": "+380630042997",
  "audience": "CLIENT",
  "code": "703273",
  "sent_at": "2026-10-29T11:12:18.08881341Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/db1ba04c-234e-45b5-af93-6ea954283c3c/phone` → **422**

```json
{
  "command_id": "d2264cfa-4986-4ad9-ba86-8b125a41c404",
  "expected_version": 3,
  "new_challenge_id": "52f4930d-94da-4ae8-96b3-dc97a5c84b3f",
  "new_code": "703274",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/db1ba04c-234e-45b5-af93-6ea954283c3c/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "172a85cc-f64f-40a3-ba37-251eac5368e0"
}
```

`POST /api/admin/v1/clients/db1ba04c-234e-45b5-af93-6ea954283c3c/phone` → **400**

```json
{
  "command_id": "ad85dd9e-7c5e-48b2-bd27-ef27458d305e",
  "expected_version": 3,
  "new_challenge_id": "52f4930d-94da-4ae8-96b3-dc97a5c84b3f",
  "new_code": "703273",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/db1ba04c-234e-45b5-af93-6ea954283c3c/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "bb66c4fb-6b9d-4741-9b5e-532bb0917ec3",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/db1ba04c-234e-45b5-af93-6ea954283c3c/phone` → **200**

```json
{
  "command_id": "4d6ac710-697b-4889-b187-d6420a488997",
  "expected_version": 3,
  "new_challenge_id": "52f4930d-94da-4ae8-96b3-dc97a5c84b3f",
  "new_code": "703273",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "db1ba04c-234e-45b5-af93-6ea954283c3c",
  "phone": "+380630042997",
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
  "correlation_id": "0cefe2bd-1cc2-4d2c-b6c4-9c20daabf1d8"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630042997",
  "device_ref": "sandbox-20421"
}
```

```json
{
  "challenge_id": "a0b87ca9-3704-4584-a632-26e7c1a3e0ef",
  "expires_at": "2026-10-29T11:17:19.614294946Z",
  "resend_available_at": "2026-10-29T11:12:20.614294946Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630042997` → **200**

```json
{
  "phone": "+380630042997",
  "audience": "CLIENT",
  "code": "184657",
  "sent_at": "2026-10-29T11:12:19.616694624Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a0b87ca9-3704-4584-a632-26e7c1a3e0ef",
  "code": "184657",
  "device_ref": "sandbox-20421"
}
```

```json
{
  "session_id": "f2c6af00-919e-4a23-ab8e-8fa3653368d9",
  "subject": {
    "type": "CLIENT",
    "id": "db1ba04c-234e-45b5-af93-6ea954283c3c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjFiYTA0Yy0yMzRlLTQ1YjUtYWY5My02ZWE5NTQyODNjM2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMjM5LCJpYXQiOjE3OTMyNzIzMzksImp0aSI6ImE2MGRmMjExLTM2NzAtNDU2Yy05NWM4LTNkNjNlZTg5ZTk4OCIsInNpZCI6ImYyYzZhZjAwLTkxOWUtNGEyMy1hYjhlLThmYTM2NTMzNjhkOSJ9.GTanGBy375fdx-A-uCHtR3m5jHdRkahLSxmWkCsJNkw",
  "access_expires_at": "2026-10-29T11:27:19.909178441Z",
  "refresh_token": "o027-OZBAUN37Y6w5rJOmeTJZ8bzzzW3UQ7ZfyQEC_I",
  "refresh_expires_at": "2026-11-28T11:12:19.90848955Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "db1ba04c-234e-45b5-af93-6ea954283c3c",
  "session_id": "f2c6af00-919e-4a23-ab8e-8fa3653368d9",
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
  "phone": "+380634297483",
  "device_ref": "sandbox-21910"
}
```

```json
{
  "challenge_id": "a33d7708-c6c2-4f16-92f8-fd2787047806",
  "expires_at": "2026-10-29T11:17:20.44456291Z",
  "resend_available_at": "2026-10-29T11:12:21.44456291Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634297483` → **200**

```json
{
  "phone": "+380634297483",
  "audience": "CLIENT",
  "code": "741457",
  "sent_at": "2026-10-29T11:12:20.446837998Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a33d7708-c6c2-4f16-92f8-fd2787047806",
  "code": "741457",
  "device_ref": "sandbox-21910"
}
```

```json
{
  "session_id": "f4563da8-0e4d-4495-84a6-11430d6d750f",
  "subject": {
    "type": "CLIENT",
    "id": "33f01adb-9f35-4030-a09c-d59cde0ef20a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzM2YwMWFkYi05ZjM1LTQwMzAtYTA5Yy1kNTljZGUwZWYyMGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMjQwLCJpYXQiOjE3OTMyNzIzNDAsImp0aSI6ImJlM2U5ODJhLTkxOGItNDQ1My1hYWI4LTFhMmY4NjIwZGRkMyIsInNpZCI6ImY0NTYzZGE4LTBlNGQtNDQ5NS04NGE2LTExNDMwZDZkNzUwZiJ9.-NeIG4Z2RKh5QD7eC-c_8CXoOUY5v8ZrWzsXmoooP88",
  "access_expires_at": "2026-10-29T11:27:20.736348914Z",
  "refresh_token": "vpGPOOieF_puQz6LYsRajRF6lpO1ORFfA_D6EMcU60g",
  "refresh_expires_at": "2026-11-28T11:12:20.735852033Z",
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
  "session_id": "e1a419c2-7ff1-4fb4-b243-feab28410c25",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMyNDEsImlhdCI6MTc5MzI3MjM0MSwianRpIjoiOWIxMDI0ZWQtYTY5Ny00MDFiLTgyMjctNGE2MzI3MmM5ZGY3Iiwic2lkIjoiZTFhNDE5YzItN2ZmMS00ZmI0LWIyNDMtZmVhYjI4NDEwYzI1In0.DuYONf4uRN2kRgDwkiPn7Rvo0_iuu0G9cj4Xu1CmsEU",
  "access_expires_at": "2026-10-29T11:27:21.87824676Z",
  "refresh_token": "H6bqjGDdgngwpgt03Kb1rX3BzYLEUnk95otVXVL9kyc",
  "refresh_expires_at": "2026-10-29T23:12:21.877808313Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380634297483` → **200**

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
  "correlation_id": "5e4ed1fd-14de-4544-b17f-8f2158db5fe9"
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
  "session_id": "6a9723b3-0583-48d4-852c-751a910fefb6",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMyNDMsImlhdCI6MTc5MzI3MjM0MywianRpIjoiM2VkYzkwMDYtNTM3YS00ZjI2LThmMjYtY2QyYjM4MmQxNGM4Iiwic2lkIjoiNmE5NzIzYjMtMDU4My00OGQ0LTg1MmMtNzUxYTkxMGZlZmI2In0.LQN9VnZrI3gOfS-OlXBpCZTFY6LeFkCyD8WL3sf2YXg",
  "access_expires_at": "2026-10-29T11:27:23.015859391Z",
  "refresh_token": "_5R-hV5tqcPUMRgsCZXftOEdZeVz7eN4PSENPf5FMuA",
  "refresh_expires_at": "2026-10-29T23:12:23.015371976Z",
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
  "changed_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T11:08:34.343952Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "85b129f9-e848-41d0-ad74-b7a699439d1b",
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
  "changed_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-29T11:12:23.582431503Z"
}
```

## The rider books the airport for 2026-10-29T14:12:22Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600923125",
  "device_ref": "sandbox-31398"
}
```

```json
{
  "challenge_id": "69c43aab-8b6c-4168-95df-cf28d4769c45",
  "expires_at": "2026-10-29T11:17:23.869880045Z",
  "resend_available_at": "2026-10-29T11:12:24.869880045Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600923125` → **200**

```json
{
  "phone": "+48600923125",
  "audience": "CLIENT",
  "code": "116943",
  "sent_at": "2026-10-29T11:12:23.872703196Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "69c43aab-8b6c-4168-95df-cf28d4769c45",
  "code": "116943",
  "device_ref": "sandbox-31398"
}
```

```json
{
  "session_id": "376c7461-8d4c-4121-b7bc-7a9d00fceaad",
  "subject": {
    "type": "CLIENT",
    "id": "32fca9f4-27ee-4a93-9225-3b357a8e7692"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMmZjYTlmNC0yN2VlLTRhOTMtOTIyNS0zYjM1N2E4ZTc2OTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMjQ0LCJpYXQiOjE3OTMyNzIzNDQsImp0aSI6IjgxNDk0MWM5LThjMTctNDdjZi05N2M1LTc3ODkzMmEwMTBkYyIsInNpZCI6IjM3NmM3NDYxLThkNGMtNDEyMS1iN2JjLTdhOWQwMGZjZWFhZCJ9.oFqRKD3w789FSmmcz3ZNxDQigaPB7k38EsavmC5oNMQ",
  "access_expires_at": "2026-10-29T11:27:24.218261743Z",
  "refresh_token": "gGpxp2nsrciw1rFQt-TATmqM6VY1aQx67Q_ii0_GD2M",
  "refresh_expires_at": "2026-11-28T11:12:24.217887435Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3b0ba457-cdca-4982-9a97-9f2b8c53268e",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-29T14:12:22Z"
}
```

```json
{
  "id": "03d43967-319c-4607-8e9b-b0761b696e95",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:17:24.491055Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T14:12:22Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "fec886d7-63c3-48c3-a10b-2286a4761241",
  "quote_id": "03d43967-319c-4607-8e9b-b0761b696e95",
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
  "pickup_at": "2026-10-29T14:12:22Z"
}
```

```json
{
  "id": "36889a66-9eaf-4ad1-a3bc-2bc0fc76f51c",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "32fca9f4-27ee-4a93-9225-3b357a8e7692",
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
  "created_at": "2026-10-29T11:12:24.772238Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T14:12:22Z",
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
  "device_ref": "sandbox-23303"
}
```

```json
{
  "challenge_id": "d045b848-bf4e-4794-849b-295a5b0f5705",
  "expires_at": "2026-10-29T11:17:25.065890848Z",
  "resend_available_at": "2026-10-29T11:12:26.065890848Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "125750",
  "sent_at": "2026-10-29T11:12:25.070212048Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d045b848-bf4e-4794-849b-295a5b0f5705",
  "code": "125750",
  "device_ref": "sandbox-23303"
}
```

```json
{
  "session_id": "a468aa43-3f25-44e4-a833-fd8352c59ce8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MzI0NSwiaWF0IjoxNzkzMjcyMzQ1LCJqdGkiOiIwM2IzM2M4Ny05N2UwLTQzODctYjJjYi0yNzYxOWY4NWQ4MDgiLCJzaWQiOiJhNDY4YWE0My0zZjI1LTQ0ZTQtYTgzMy1mZDgzNTJjNTljZTgifQ.EB2u6Q6XoURGamBxFlZ7up-rHutUxb8f8crEXMF44k8",
  "access_expires_at": "2026-10-29T11:27:25.360353087Z",
  "refresh_token": "K1UmaHKvDpxkRlrbdCGdmK0wEWqjJu9M8U2nO_ATNyY",
  "refresh_expires_at": "2026-11-28T11:12:25.359856776Z",
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
  "command_id": "2c8aced0-9166-4e64-acb3-ba7fa3737c21",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:12:25Z",
    "sequence": 1793272345887
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "123886c7-3c5d-4623-aa6e-8c021ce1a949",
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
  "last_heartbeat_at": "2026-10-29T11:12:25.906651Z",
  "last_location_at": "2026-10-29T11:12:25.906651Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "36889a66-9eaf-4ad1-a3bc-2bc0fc76f51c",
      "short_number": 24,
      "pickup_at": "2026-10-29T14:12:22Z",
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

`POST /api/driver/v1/preorders/36889a66-9eaf-4ad1-a3bc-2bc0fc76f51c/reserve` → **200**

```json
{
  "command_id": "2e3a0d45-abbc-447f-a952-70ede4f34221"
}
```

```json
{
  "id": "34f15e30-d48a-4383-a39e-77844ae55ebd",
  "state": "RESERVED",
  "order": {
    "order_id": "36889a66-9eaf-4ad1-a3bc-2bc0fc76f51c",
    "short_number": 24,
    "pickup_at": "2026-10-29T14:12:22Z",
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
  "reserved_at": "2026-10-29T11:12:26.468518Z",
  "confirm_from": "2026-10-29T13:42:22Z",
  "confirm_until": "2026-10-29T13:52:22Z",
  "drop_until": "2026-10-29T13:12:22Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "34f15e30-d48a-4383-a39e-77844ae55ebd",
      "state": "RESERVED",
      "order": {
        "order_id": "36889a66-9eaf-4ad1-a3bc-2bc0fc76f51c",
        "short_number": 24,
        "pickup_at": "2026-10-29T14:12:22Z",
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
      "reserved_at": "2026-10-29T11:12:26.468518Z",
      "confirm_from": "2026-10-29T13:42:22Z",
      "confirm_until": "2026-10-29T13:52:22Z",
      "drop_until": "2026-10-29T13:12:22Z"
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
      "id": "34f15e30-d48a-4383-a39e-77844ae55ebd",
      "state": "RESERVED",
      "order": {
        "order_id": "36889a66-9eaf-4ad1-a3bc-2bc0fc76f51c",
        "short_number": 24,
        "pickup_at": "2026-10-29T14:12:22Z",
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
      "reserved_at": "2026-10-29T11:12:26.468518Z",
      "confirm_from": "2026-10-29T13:42:22Z",
      "confirm_until": "2026-10-29T13:52:22Z",
      "drop_until": "2026-10-29T13:12:22Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/34f15e30-d48a-4383-a39e-77844ae55ebd/confirm` → **409**

```json
{
  "command_id": "5231de28-c160-41bd-aaa3-dc78e87aae5a"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/34f15e30-d48a-4383-a39e-77844ae55ebd/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "62453560-5729-47c1-b340-f45318e6e65a"
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
  "session_id": "fa7683a9-9649-4908-a517-5a6b5f6540bd",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMyNDcsImlhdCI6MTc5MzI3MjM0NywianRpIjoiMzA0YmRlMzQtOTVhNi00NDExLTk5OTAtMDRmNjY2MWJmOTdiIiwic2lkIjoiZmE3NjgzYTktOTY0OS00OTA4LWE1MTctNWE2YjVmNjU0MGJkIn0.uwyhB-hpd8tFjLFJ-mNRx7Dog-2FjW1DaOyEPUZ3aLE",
  "access_expires_at": "2026-10-29T11:27:27.846726052Z",
  "refresh_token": "fJpj7x9a_plwQTlns56pFSzeqmAVzg6zl2PXDojMzzI",
  "refresh_expires_at": "2026-10-29T23:12:27.846189848Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/36889a66-9eaf-4ad1-a3bc-2bc0fc76f51c` → **200**

```json
{
  "id": "36889a66-9eaf-4ad1-a3bc-2bc0fc76f51c",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "32fca9f4-27ee-4a93-9225-3b357a8e7692",
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
  "created_at": "2026-10-29T11:12:24.772238Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-29T14:12:22Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "34f15e30-d48a-4383-a39e-77844ae55ebd",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-29T11:12:26.468518Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/36889a66-9eaf-4ad1-a3bc-2bc0fc76f51c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-29T11:12:24.773612Z",
      "actor": {
        "type": "CLIENT",
        "id": "32fca9f4-27ee-4a93-9225-3b357a8e7692",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "36889a66-9eaf-4ad1-a3bc-2bc0fc76f51c",
        "preorder": true,
        "quote_id": "03d43967-319c-4607-8e9b-b0761b696e95",
        "pickup_at": "2026-10-29T14:12:22Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "f3794868-6b65-4186-a46d-b451fc4788ab"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-29T11:12:26.470062Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "36889a66-9eaf-4ad1-a3bc-2bc0fc76f51c",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "34f15e30-d48a-4383-a39e-77844ae55ebd"
      },
      "correlation_id": "fa75ff86-a0d2-46a5-91ae-473da1b103ca"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 36889a66-9eaf-4ad1-a3bc-2bc0fc76f51c, reservation 34f15e30-d48a-4383-a39e-77844ae55ebd.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-23883"
}
```

```json
{
  "challenge_id": "452b4e7a-2e0a-4de6-bfce-b1cab9559ec0",
  "expires_at": "2026-10-29T11:17:28.675310085Z",
  "resend_available_at": "2026-10-29T11:12:29.675310085Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "872895",
  "sent_at": "2026-10-29T11:12:28.677883699Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "452b4e7a-2e0a-4de6-bfce-b1cab9559ec0",
  "code": "872895",
  "device_ref": "sandbox-23883"
}
```

```json
{
  "session_id": "6604e66a-9664-41a6-b3a0-2c3c7e46c8af",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MzI0OCwiaWF0IjoxNzkzMjcyMzQ4LCJqdGkiOiI3M2Q5N2IxZS0wODBmLTQzZGYtYjU2Ni1mN2UyNGU5NDY5MzAiLCJzaWQiOiI2NjA0ZTY2YS05NjY0LTQxYTYtYjNhMC0yYzNjN2U0NmM4YWYifQ.1-93sCcrIztguJe-EWpEucoqnX-cZvg-FRSR8SR2sIY",
  "access_expires_at": "2026-10-29T11:27:28.970246379Z",
  "refresh_token": "YT4kxQ3sqFoxVqlXtWOvo16Ui_qTAOVk2mXRSXYwT0c",
  "refresh_expires_at": "2026-11-28T11:12:28.969761826Z",
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
  "command_id": "d28d846b-0307-4b72-bbeb-6f10a05be7a4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:12:29Z",
    "sequence": 1793272349495
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a96a9a4b-5050-4ce5-8016-7d5bb63264f1",
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
  "last_heartbeat_at": "2026-10-29T11:12:29.51346Z",
  "last_location_at": "2026-10-29T11:12:29.51346Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672872481",
  "device_ref": "sandbox-26490"
}
```

```json
{
  "challenge_id": "0b23683b-919c-481a-b4cf-3ca96537b237",
  "expires_at": "2026-10-29T11:17:29.778983423Z",
  "resend_available_at": "2026-10-29T11:12:30.778983423Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672872481` → **200**

```json
{
  "phone": "+380672872481",
  "audience": "CLIENT",
  "code": "517034",
  "sent_at": "2026-10-29T11:12:29.78160087Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0b23683b-919c-481a-b4cf-3ca96537b237",
  "code": "517034",
  "device_ref": "sandbox-26490"
}
```

```json
{
  "session_id": "51edb314-08f9-4c27-b719-cc618c88d786",
  "subject": {
    "type": "CLIENT",
    "id": "2cabb68f-7800-4708-a5da-9cd783dc4ccd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyY2FiYjY4Zi03ODAwLTQ3MDgtYTVkYS05Y2Q3ODNkYzRjY2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMjUwLCJpYXQiOjE3OTMyNzIzNTAsImp0aSI6ImMxYWU2OWFlLTFkNjQtNGQxNy04NmRkLTcyNTE4NGFjZDc1YSIsInNpZCI6IjUxZWRiMzE0LTA4ZjktNGMyNy1iNzE5LWNjNjE4Yzg4ZDc4NiJ9.RCR_XPZEoTS8XSze6DwkXbLHxOmIqACKTZLv4umbJxc",
  "access_expires_at": "2026-10-29T11:27:30.070326656Z",
  "refresh_token": "O9ONIeWxmcxFb34iZPjWAww-zIeey_mVkg9p0NJt-b4",
  "refresh_expires_at": "2026-11-28T11:12:30.069700911Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6d7617c9-4f61-4d3b-86b3-708341c3a25a",
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
  "id": "2bf770f1-34b0-4f82-a925-39ff0c566a95",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:17:30.350642Z",
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
  "command_id": "adccfec1-7faa-4ed9-b7f2-9ea008f01010",
  "quote_id": "2bf770f1-34b0-4f82-a925-39ff0c566a95",
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
  "id": "027e1ae7-2b96-46c7-87dc-7f3306d8ac87",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2cabb68f-7800-4708-a5da-9cd783dc4ccd",
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
  "created_at": "2026-10-29T11:12:30.645483Z",
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
    "id": "caf6466a-270c-4da8-ab25-532d3ce4ec50",
    "order_id": "027e1ae7-2b96-46c7-87dc-7f3306d8ac87",
    "expires_at": "2026-10-29T11:12:45.648232Z",
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

`POST /api/driver/v1/offers/caf6466a-270c-4da8-ab25-532d3ce4ec50/accept` → **200**

```json
{
  "command_id": "43a8a8e6-497a-46c8-8efb-0a8314aa81d7"
}
```

```json
{
  "id": "36d70cba-b403-44f0-82de-c2579991f613",
  "order_id": "027e1ae7-2b96-46c7-87dc-7f3306d8ac87",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bf707918-8124-4a74-bd82-733d914f2df5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bf707918-8124-4a74-bd82-733d914f2df5",
  "order_id": "027e1ae7-2b96-46c7-87dc-7f3306d8ac87",
  "assignment_id": "36d70cba-b403-44f0-82de-c2579991f613",
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

`POST /api/driver/v1/work-sessions/a96a9a4b-5050-4ce5-8016-7d5bb63264f1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:12:31Z",
    "sequence": 1793272351718
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a96a9a4b-5050-4ce5-8016-7d5bb63264f1",
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
  "last_heartbeat_at": "2026-10-29T11:12:31.736189Z",
  "last_location_at": "2026-10-29T11:12:31.736189Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bf707918-8124-4a74-bd82-733d914f2df5",
  "order_id": "027e1ae7-2b96-46c7-87dc-7f3306d8ac87",
  "assignment_id": "36d70cba-b403-44f0-82de-c2579991f613",
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

`POST /api/driver/v1/trips/bf707918-8124-4a74-bd82-733d914f2df5/arrive` → **200**

```json
{
  "command_id": "c5b1cdf0-e7c0-4693-9a71-6066798270aa",
  "expected_version": 0
}
```

```json
{
  "id": "bf707918-8124-4a74-bd82-733d914f2df5",
  "order_id": "027e1ae7-2b96-46c7-87dc-7f3306d8ac87",
  "assignment_id": "36d70cba-b403-44f0-82de-c2579991f613",
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
  "arrived_at": "2026-10-29T11:12:32.269229Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bf707918-8124-4a74-bd82-733d914f2df5/start` → **200**

```json
{
  "command_id": "5b83d63d-adda-458d-8ad3-cae5f137568e",
  "expected_version": 1
}
```

```json
{
  "id": "bf707918-8124-4a74-bd82-733d914f2df5",
  "order_id": "027e1ae7-2b96-46c7-87dc-7f3306d8ac87",
  "assignment_id": "36d70cba-b403-44f0-82de-c2579991f613",
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
  "arrived_at": "2026-10-29T11:12:32.269229Z",
  "started_at": "2026-10-29T11:12:32.545146Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/a96a9a4b-5050-4ce5-8016-7d5bb63264f1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:12:32Z",
    "sequence": 1793272352809
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a96a9a4b-5050-4ce5-8016-7d5bb63264f1",
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
  "last_heartbeat_at": "2026-10-29T11:12:32.826131Z",
  "last_location_at": "2026-10-29T11:12:32.826131Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/bf707918-8124-4a74-bd82-733d914f2df5/complete` → **200**

```json
{
  "command_id": "7360eaf1-5f9a-467c-b17a-0f19af8cbb08",
  "expected_version": 2,
  "reported_at": "2026-10-29T11:12:33Z",
  "cash_received": true
}
```

```json
{
  "id": "bf707918-8124-4a74-bd82-733d914f2df5",
  "order_id": "027e1ae7-2b96-46c7-87dc-7f3306d8ac87",
  "assignment_id": "36d70cba-b403-44f0-82de-c2579991f613",
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
  "arrived_at": "2026-10-29T11:12:32.269229Z",
  "started_at": "2026-10-29T11:12:32.545146Z",
  "completed_at": "2026-10-29T11:12:33.098466Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/027e1ae7-2b96-46c7-87dc-7f3306d8ac87/rating` → **200**

```json
{
  "command_id": "111e16a1-3108-48f1-9dc7-0094a234f8c3",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "027e1ae7-2b96-46c7-87dc-7f3306d8ac87",
  "score": 5,
  "created_at": "2026-10-29T11:12:33.387026358Z"
}
```

`POST /api/driver/v1/orders/027e1ae7-2b96-46c7-87dc-7f3306d8ac87/rating` → **200**

```json
{
  "command_id": "4de0930d-cb7c-4223-acd1-d987c6844a92",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "027e1ae7-2b96-46c7-87dc-7f3306d8ac87",
  "score": 4,
  "created_at": "2026-10-29T11:12:33.655916078Z"
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
  "session_id": "afedfe38-a5f9-4cb0-9578-50ce48c74fac",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMyNTQsImlhdCI6MTc5MzI3MjM1NCwianRpIjoiZTgyMWY1MzgtZjk0Ny00NmU3LTlhOWItNjY4YTdkYWZhMWZkIiwic2lkIjoiYWZlZGZlMzgtYTVmOS00Y2IwLTk1NzgtNTBjZTQ4Yzc0ZmFjIn0.-1P0DzViCPNTSGHIuAdP__A3ymEmNqWSd7T4Tdi4mpU",
  "access_expires_at": "2026-10-29T11:27:34.497582545Z",
  "refresh_token": "2wP1CkrvQY4naUMEN0v7gZ-Tw7h2pMPdkyg2agsl0XY",
  "refresh_expires_at": "2026-10-29T23:12:34.497161626Z",
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
  "session_id": "fa6a7988-3e92-4d3b-a7b0-792f1f71c546",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMyNTUsImlhdCI6MTc5MzI3MjM1NSwianRpIjoiMTVjMjM2ZTQtYzU5Ny00NzJhLWI3OWMtM2Q3N2Q4ZGFhOTJlIiwic2lkIjoiZmE2YTc5ODgtM2U5Mi00ZDNiLWE3YjAtNzkyZjFmNzFjNTQ2In0.B_5YkgyrcUyUWvzSELlGUyUXvfTD6s34nErMKy1y1jg",
  "access_expires_at": "2026-10-29T11:27:35.081768469Z",
  "refresh_token": "W71ddAXy1RqiGWRtbwRy2jmb4nXgPEMEjhTsPehMhUI",
  "refresh_expires_at": "2026-10-29T23:12:35.081363918Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/027e1ae7-2b96-46c7-87dc-7f3306d8ac87/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "027e1ae7-2b96-46c7-87dc-7f3306d8ac87",
      "author_type": "RIDER",
      "author_id": "2cabb68f-7800-4708-a5da-9cd783dc4ccd",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-29T11:12:33.387026Z"
    },
    {
      "order_id": "027e1ae7-2b96-46c7-87dc-7f3306d8ac87",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "2cabb68f-7800-4708-a5da-9cd783dc4ccd",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-29T11:12:33.655916Z"
    }
  ]
}
```

Done: ratings for order 027e1ae7-2b96-46c7-87dc-7f3306d8ac87.

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
  "session_id": "c02c22ae-8e9a-419d-9bfc-f61bbb315df2",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMyNTUsImlhdCI6MTc5MzI3MjM1NSwianRpIjoiNTNmYjJkODctY2M0Yy00ZTVlLWFhOGEtMmZjYWUxOTkyYjQ0Iiwic2lkIjoiYzAyYzIyYWUtOGU5YS00MTlkLTliZmMtZjYxYmJiMzE1ZGYyIn0.lLJtNVxDM5QilScglXLeUQaA6RiMW48KYUrQJs3glE0",
  "access_expires_at": "2026-10-29T11:27:35.948810382Z",
  "refresh_token": "lmnaW_BmOqqhKfuRsNhtSGzN98zvOqxc42o9VZIYC_8",
  "refresh_expires_at": "2026-10-29T23:12:35.948188587Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "9845e547-529e-4610-9ac8-fd865411c500",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "8bdb043c-0ab0-469b-8c8b-edfd5687f009",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T11:12:36.224665Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8bdb043c-0ab0-469b-8c8b-edfd5687f009` → **200**

```json
{
  "id": "8bdb043c-0ab0-469b-8c8b-edfd5687f009",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T11:12:36.224665Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8bdb043c-0ab0-469b-8c8b-edfd5687f009` → **200**

```json
{
  "id": "8bdb043c-0ab0-469b-8c8b-edfd5687f009",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T11:12:36.224665Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8bdb043c-0ab0-469b-8c8b-edfd5687f009` → **200**

```json
{
  "id": "8bdb043c-0ab0-469b-8c8b-edfd5687f009",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T11:12:36.224665Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8bdb043c-0ab0-469b-8c8b-edfd5687f009` → **200**

```json
{
  "id": "8bdb043c-0ab0-469b-8c8b-edfd5687f009",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T11:12:36.224665Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8bdb043c-0ab0-469b-8c8b-edfd5687f009` → **200**

```json
{
  "id": "8bdb043c-0ab0-469b-8c8b-edfd5687f009",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T11:12:36.224665Z",
  "ready_at": "2026-10-29T11:12:40.359935Z",
  "expires_at": "2026-10-30T11:12:40.359935Z"
}
```

`GET /api/admin/v1/reports/exports/8bdb043c-0ab0-469b-8c8b-edfd5687f009/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-29,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "c9fbe3b9-3ad4-42eb-a3b8-8f92ee5e620c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "0fedde4d-5704-4e0f-99be-06145df4b60a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T11:12:41.84452Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0fedde4d-5704-4e0f-99be-06145df4b60a` → **200**

```json
{
  "id": "0fedde4d-5704-4e0f-99be-06145df4b60a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T11:12:41.84452Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0fedde4d-5704-4e0f-99be-06145df4b60a` → **200**

```json
{
  "id": "0fedde4d-5704-4e0f-99be-06145df4b60a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T11:12:41.84452Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0fedde4d-5704-4e0f-99be-06145df4b60a` → **200**

```json
{
  "id": "0fedde4d-5704-4e0f-99be-06145df4b60a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T11:12:41.84452Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0fedde4d-5704-4e0f-99be-06145df4b60a` → **200**

```json
{
  "id": "0fedde4d-5704-4e0f-99be-06145df4b60a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T11:12:41.84452Z",
  "ready_at": "2026-10-29T11:12:45.368599Z",
  "expires_at": "2026-10-30T11:12:45.368599Z"
}
```

`GET /api/admin/v1/reports/exports/0fedde4d-5704-4e0f-99be-06145df4b60a/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-29,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/00fb5f04-44f4-4258-acba-56661471f5be` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/00fb5f04-44f4-4258-acba-56661471f5be",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7a2871b7-7bca-45f8-b5ca-9460b7926f9b"
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
  "device_ref": "sandbox-18061"
}
```

```json
{
  "challenge_id": "d53005e0-587d-46c3-9e4e-7202fb9fd7f2",
  "expires_at": "2026-10-29T11:17:46.461926024Z",
  "resend_available_at": "2026-10-29T11:12:47.461926024Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "708570",
  "sent_at": "2026-10-29T11:12:46.464338045Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d53005e0-587d-46c3-9e4e-7202fb9fd7f2",
  "code": "708570",
  "device_ref": "sandbox-18061"
}
```

```json
{
  "session_id": "14814c21-e418-4374-bbda-eea672dd3801",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MzI2NiwiaWF0IjoxNzkzMjcyMzY2LCJqdGkiOiI5YWU1YzI1OC1lYjAxLTQ5MmEtYjYzMC1jYzFjZGQ4YmNiM2QiLCJzaWQiOiIxNDgxNGMyMS1lNDE4LTQzNzQtYmJkYS1lZWE2NzJkZDM4MDEifQ.zjcDkvtED0lh_D1rk_Ij5D3pwOa2k4a68FAsB7o3mN0",
  "access_expires_at": "2026-10-29T11:27:46.752708267Z",
  "refresh_token": "ZoTVGxehrUAEKq0JxRPX_qjn76WQ_L8YSVp17Zi0vrU",
  "refresh_expires_at": "2026-11-28T11:12:46.752205411Z",
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
  "command_id": "6863fa14-608b-4269-aa78-9d54b1c84b7d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:12:47Z",
    "sequence": 1793272367529
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4759490b-b676-4108-bd0b-456d2538c1dd",
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
  "last_heartbeat_at": "2026-10-29T11:12:47.545598Z",
  "last_location_at": "2026-10-29T11:12:47.545598Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "07fbb9e1-3c1a-4759-88a7-7e8476d13473",
  "points": [
    {
      "sequence": 1793272369817,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T11:11:49Z"
    },
    {
      "sequence": 1793272369824,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T11:12:49Z"
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
  "session_id": "a3e4c478-0518-4bd6-9614-b18b40fdef25",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMyNzAsImlhdCI6MTc5MzI3MjM3MCwianRpIjoiY2UwNjU2NWItMTQyMy00NGQ1LThhMzUtNjg2YzI2ZDU4NGUyIiwic2lkIjoiYTNlNGM0NzgtMDUxOC00YmQ2LTk2MTQtYjE4YjQwZmRlZjI1In0.ul5amGSfkALjGSIBezBt0Pf75Uj7Piptr3YJu0Bcv4g",
  "access_expires_at": "2026-10-29T11:27:50.440481928Z",
  "refresh_token": "7gaPU8wlq7MbiGSUT5viwZb84MUaTjcy8e5O26gg3ag",
  "refresh_expires_at": "2026-10-29T23:12:50.440107393Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "1bbc4b71-1773-429f-b467-0acec3cdf8b5",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-29T11:12:49Z",
        "track_point_id": "7027d1a0-0296-4cb7-9c87-e08ca94f4477",
        "work_session_id": "4759490b-b676-4108-bd0b-456d2538c1dd"
      },
      "raised_by": null,
      "raised_at": "2026-10-29T11:12:49Z",
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

`POST /api/admin/v1/driver-risk-flags/1bbc4b71-1773-429f-b467-0acec3cdf8b5/confirm` → **200**

```json
{
  "command_id": "6b31d5ad-3707-4d5c-9038-954ef6d59ee1",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "1bbc4b71-1773-429f-b467-0acec3cdf8b5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-29T11:12:49Z",
    "track_point_id": "7027d1a0-0296-4cb7-9c87-e08ca94f4477",
    "work_session_id": "4759490b-b676-4108-bd0b-456d2538c1dd"
  },
  "raised_by": null,
  "raised_at": "2026-10-29T11:12:49Z",
  "reason": null,
  "reviewed_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
  "reviewed_at": "2026-10-29T11:12:51.284141Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/1bbc4b71-1773-429f-b467-0acec3cdf8b5/dismiss` → **409**

```json
{
  "command_id": "c3cfa029-4d27-475b-a1d4-bbd05c374cf8",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/1bbc4b71-1773-429f-b467-0acec3cdf8b5/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ed0d99e4-db1b-4783-b9b0-cf0af2c82704"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "87098d57-559d-4253-9abb-95897e8125e4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "f9cfea33-8301-48e2-9d19-117f15975b38",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
  "raised_at": "2026-10-29T11:12:51.830672Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/f9cfea33-8301-48e2-9d19-117f15975b38/dismiss` → **200**

```json
{
  "command_id": "10716637-5ba2-4185-bac8-205d1d244efc",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "f9cfea33-8301-48e2-9d19-117f15975b38",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
  "raised_at": "2026-10-29T11:12:51.830672Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
  "reviewed_at": "2026-10-29T11:12:52.112014Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "8159d97d-6c70-4730-93fd-302a297ee88a",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "1bbc4b71-1773-429f-b467-0acec3cdf8b5"
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
      "actor_id": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T11:12:52.400569Z"
    }
  ]
}
```

Done: flag 1bbc4b71-1773-429f-b467-0acec3cdf8b5 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "074bb922-8d85-4bf2-a9ac-f93d1445e78a",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMyNzMsImlhdCI6MTc5MzI3MjM3MywianRpIjoiODcyOGYzYTYtY2UyOC00ODc0LThjYWQtMDk1MGY3Y2UzMmQxIiwic2lkIjoiMDc0YmI5MjItOGQ4NS00YmYyLWE5YWMtZjkzZDE0NDVlNzhhIn0.uLyk4dTQrPV_w_TcG_mZ5JhIEdkM7krK9zLgplsyfGU",
  "access_expires_at": "2026-10-29T11:27:53.265336777Z",
  "refresh_token": "sRHouW01OiYgaUsuM7dy9xBkm-pg8CM_FkRNy25c21A",
  "refresh_expires_at": "2026-10-29T23:12:53.26481503Z",
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
      "actor_id": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T11:12:52.400569Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "fa1f809e-9997-4818-9e90-bf3c7dd5720f",
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
  "session_id": "4759490b-b676-4108-bd0b-456d2538c1dd",
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
  "last_heartbeat_at": "2026-10-29T11:12:47.545598Z",
  "last_location_at": "2026-10-29T11:12:47.545598Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4759490b-b676-4108-bd0b-456d2538c1dd/close` → **200**

```json
{
  "command_id": "2dfd1055-277a-44de-87b9-309e0f13c130",
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
  "session_id": "ac3c4747-4537-4f93-9adf-79d20a47c188",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMyNzQsImlhdCI6MTc5MzI3MjM3NCwianRpIjoiOTc1OTM3NTMtODJjYy00MTc0LWJiNjYtZTU5ZTgwYjQzODc1Iiwic2lkIjoiYWMzYzQ3NDctNDUzNy00ZjkzLTlhZGYtNzlkMjBhNDdjMTg4In0.gZpeR69IQjV6qXyl6jN8EM4_7P_oJmMilJ0LRr83UwI",
  "access_expires_at": "2026-10-29T11:27:54.944702334Z",
  "refresh_token": "MRqthrWW6nOp_STNeXn8UgfwFY7PfHwEOhrUR7tQsX8",
  "refresh_expires_at": "2026-10-29T23:12:54.944271457Z",
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
  "command_id": "0eb73e3b-f66b-4d2c-894f-1c73a2509870",
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
  "changed_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T11:12:55.498773Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "0eb73e3b-f66b-4d2c-894f-1c73a2509870",
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
  "changed_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T11:12:55.498773Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48701916310",
  "device_ref": "sandbox-30107"
}
```

```json
{
  "challenge_id": "20eff56e-27ba-4929-a78e-b0c03c595eca",
  "expires_at": "2026-10-29T11:17:56.057483122Z",
  "resend_available_at": "2026-10-29T11:12:57.057483122Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48701916310` → **200**

```json
{
  "phone": "+48701916310",
  "audience": "CLIENT",
  "code": "468302",
  "sent_at": "2026-10-29T11:12:56.059803643Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "20eff56e-27ba-4929-a78e-b0c03c595eca",
  "code": "468302",
  "device_ref": "sandbox-30107"
}
```

```json
{
  "session_id": "4055c753-866b-42b5-960b-29323b7451e2",
  "subject": {
    "type": "CLIENT",
    "id": "bd7b69bc-a740-46c7-aa7a-516b81eb3c0a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZDdiNjliYy1hNzQwLTQ2YzctYWE3YS01MTZiODFlYjNjMGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMjc2LCJpYXQiOjE3OTMyNzIzNzYsImp0aSI6ImY0Mzc3MTQ5LTRhMzAtNGFhMy1iYTM0LThmZmUzMTQ4MDZlNCIsInNpZCI6IjQwNTVjNzUzLTg2NmItNDJiNS05NjBiLTI5MzIzYjc0NTFlMiJ9.skhiEiq9d1svKb2Ny64kUkokIIDHF0ENkozWPrKHkpw",
  "access_expires_at": "2026-10-29T11:27:56.411744994Z",
  "refresh_token": "cXlWWEWdtrH7fw_ikp1JgKnkkkpm408FWXC0o_lQMW0",
  "refresh_expires_at": "2026-11-28T11:12:56.411314399Z",
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
  "correlation_id": "62ba3895-14d5-4948-9f23-c2a17d8b0ccb"
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
  "device_ref": "sandbox-21855"
}
```

```json
{
  "challenge_id": "308feaa4-b1cd-47e0-87b6-9422eeefe599",
  "expires_at": "2026-10-29T11:17:57.478587521Z",
  "resend_available_at": "2026-10-29T11:12:58.478587521Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "065804",
  "sent_at": "2026-10-29T11:12:57.480896802Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "308feaa4-b1cd-47e0-87b6-9422eeefe599",
  "code": "065804",
  "device_ref": "sandbox-21855"
}
```

```json
{
  "session_id": "bafb40e1-39b2-44a2-b330-15844e00244c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MzI3NywiaWF0IjoxNzkzMjcyMzc3LCJqdGkiOiI4N2QwNWQzZS1kOWY4LTRlNDgtOWJkMC1kOWNlMWI2NjQ1ZmIiLCJzaWQiOiJiYWZiNDBlMS0zOWIyLTQ0YTItYjMzMC0xNTg0NGUwMDI0NGMifQ.CrjNI56QuQ9yB8pKuCZnSBWC4Wq-ZZgoGU2rOdtjp2g",
  "access_expires_at": "2026-10-29T11:27:57.807906455Z",
  "refresh_token": "HVB-g1YULm0OwdiZKo-3-m_ixucW7yaCsgte3sY2YxA",
  "refresh_expires_at": "2026-11-28T11:12:57.807275111Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "123886c7-3c5d-4623-aa6e-8c021ce1a949",
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
  "last_heartbeat_at": "2026-10-29T11:12:25.906651Z",
  "last_location_at": "2026-10-29T11:12:25.906651Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/123886c7-3c5d-4623-aa6e-8c021ce1a949/handover` → **200**

```json
{
  "command_id": "99d9b9c1-f651-4e15-807e-d55cc865aa5a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "123886c7-3c5d-4623-aa6e-8c021ce1a949",
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
  "last_heartbeat_at": "2026-10-29T11:12:25.906651Z",
  "last_location_at": "2026-10-29T11:12:25.906651Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/123886c7-3c5d-4623-aa6e-8c021ce1a949/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:12:58Z",
    "sequence": 1793272378610
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "123886c7-3c5d-4623-aa6e-8c021ce1a949",
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
  "last_heartbeat_at": "2026-10-29T11:12:58.627996Z",
  "last_location_at": "2026-10-29T11:12:58.627996Z",
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
  "session_id": "123886c7-3c5d-4623-aa6e-8c021ce1a949",
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
  "last_heartbeat_at": "2026-10-29T11:12:58.627996Z",
  "last_location_at": "2026-10-29T11:12:58.627996Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/123886c7-3c5d-4623-aa6e-8c021ce1a949/close` → **200**

```json
{
  "command_id": "8ba1c50f-a5fe-4142-8f67-ab2fcbe90f4f",
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
  "correlation_id": "fa5a5e6d-7456-4182-bda9-0bf887a796c4"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676732961",
  "device_ref": "sandbox-9744"
}
```

```json
{
  "challenge_id": "bd9f8b26-9a6f-4121-b547-53dd8507ea8b",
  "expires_at": "2026-10-29T11:17:59.978694523Z",
  "resend_available_at": "2026-10-29T11:13:00.978694523Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676732961` → **200**

```json
{
  "phone": "+380676732961",
  "audience": "CLIENT",
  "code": "218633",
  "sent_at": "2026-10-29T11:12:59.980991355Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bd9f8b26-9a6f-4121-b547-53dd8507ea8b",
  "code": "218633",
  "device_ref": "sandbox-9744"
}
```

```json
{
  "session_id": "8fa89c37-f13f-472a-ab75-1d12a1e19b95",
  "subject": {
    "type": "CLIENT",
    "id": "d5e62488-35c8-4aa6-b793-8af6f1d74512"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNWU2MjQ4OC0zNWM4LTRhYTYtYjc5My04YWY2ZjFkNzQ1MTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMjgwLCJpYXQiOjE3OTMyNzIzODAsImp0aSI6ImMxY2NhOTliLWMyMjctNDdhMC1hYTgzLTdhYTUwYzZjZmNlOCIsInNpZCI6IjhmYTg5YzM3LWYxM2YtNDcyYS1hYjc1LTFkMTJhMWUxOWI5NSJ9.2UkxaKh3g-QBDp5MHl93qZVg9JspiESVhZ47F8Qmtak",
  "access_expires_at": "2026-10-29T11:28:00.263735447Z",
  "refresh_token": "aPikVPDQt9_06jflZf22srId_Rrpcsv7b_RDcl29160",
  "refresh_expires_at": "2026-11-28T11:13:00.263348212Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "1a33f8a2-18ff-4246-8ac7-93b35f95e960",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "83f27128-04f0-4e6d-9ee5-acd68c200b4e",
  "upload_path": "/api/rider/v1/uploads/83f27128-04f0-4e6d-9ee5-acd68c200b4e",
  "expires_at": "2026-10-29T11:28:00.544654991Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/83f27128-04f0-4e6d-9ee5-acd68c200b4e` → **200**

```json
{
  "file_id": "83f27128-04f0-4e6d-9ee5-acd68c200b4e",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "64c9f666-073a-44c2-aa28-d26ddab9c9e5",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "83f27128-04f0-4e6d-9ee5-acd68c200b4e"
  ]
}
```

```json
{
  "id": "ebb680a2-910c-4903-93d7-e457dfaa4339",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d5e62488-35c8-4aa6-b793-8af6f1d74512",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T11:13:00.843115Z",
  "updated_at": "2026-10-29T11:13:00.843115Z",
  "respond_by": "2026-10-29T15:13:00.843115Z",
  "messages": [
    {
      "id": "a74a8c4b-b3e9-436d-87c0-285656e1b8a7",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d5e62488-35c8-4aa6-b793-8af6f1d74512",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T11:13:00.844052Z",
      "attachments": [
        {
          "file_id": "83f27128-04f0-4e6d-9ee5-acd68c200b4e",
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
  "session_id": "d40a6aaf-b2a1-4173-8f05-be88b25dbea8",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMyODEsImlhdCI6MTc5MzI3MjM4MSwianRpIjoiMmY0YTY2NmItMjgxNi00MGQzLTgzYzgtODIxZDk4OTA0MTg5Iiwic2lkIjoiZDQwYTZhYWYtYjJhMS00MTczLThmMDUtYmU4OGIyNWRiZWE4In0.tV26cbUMRquzOkG0o_cREibYlCJnEWjpaG4b5jLFkbk",
  "access_expires_at": "2026-10-29T11:28:01.442755915Z",
  "refresh_token": "6jd5kqBzslg91-G39YgAO6sh7lnmTB-BisyQd-EvrH0",
  "refresh_expires_at": "2026-10-29T23:13:01.442328244Z",
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
  "session_id": "5b2bdb23-8d6f-4ca6-95e2-88da4c6fecd9",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMyODIsImlhdCI6MTc5MzI3MjM4MiwianRpIjoiN2FhY2M3YTQtMTQxNi00MjFiLWFiYzYtY2U4ZTlhYTNhNjc4Iiwic2lkIjoiNWIyYmRiMjMtOGQ2Zi00Y2E2LTk1ZTItODhkYTRjNmZlY2Q5In0.XXZeBnIhZM_kSB5jBjZ7eXesrUDBVlKoFsy53PAo6zY",
  "access_expires_at": "2026-10-29T11:28:02.011385474Z",
  "refresh_token": "4IEuzuopK2tTtkC96gjkor29YwrGLbSFigchs0yS978",
  "refresh_expires_at": "2026-10-29T23:13:02.010945555Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/ebb680a2-910c-4903-93d7-e457dfaa4339/attachments/83f27128-04f0-4e6d-9ee5-acd68c200b4e` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "dc7034f6-fb0c-4559-86a1-910dcf4ef725",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "5b80f19f-1684-40b2-96fc-b9dfe850a9d6",
  "upload_path": "/api/operator/v1/uploads/5b80f19f-1684-40b2-96fc-b9dfe850a9d6",
  "expires_at": "2026-10-29T11:28:02.293624441Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/5b80f19f-1684-40b2-96fc-b9dfe850a9d6` → **200**

```json
{
  "file_id": "5b80f19f-1684-40b2-96fc-b9dfe850a9d6",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/ebb680a2-910c-4903-93d7-e457dfaa4339` → **200**

```json
{
  "id": "ebb680a2-910c-4903-93d7-e457dfaa4339",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d5e62488-35c8-4aa6-b793-8af6f1d74512",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T11:13:00.843115Z",
  "updated_at": "2026-10-29T11:13:00.843115Z",
  "respond_by": "2026-10-29T15:13:00.843115Z",
  "messages": [
    {
      "id": "a74a8c4b-b3e9-436d-87c0-285656e1b8a7",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d5e62488-35c8-4aa6-b793-8af6f1d74512",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T11:13:00.844052Z",
      "attachments": [
        {
          "file_id": "83f27128-04f0-4e6d-9ee5-acd68c200b4e",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/ebb680a2-910c-4903-93d7-e457dfaa4339/comments` → **200**

```json
{
  "command_id": "1de58be7-58ed-4de3-b4be-3ff04c66e41f",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "5b80f19f-1684-40b2-96fc-b9dfe850a9d6"
  ]
}
```

```json
{
  "id": "ebb680a2-910c-4903-93d7-e457dfaa4339",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d5e62488-35c8-4aa6-b793-8af6f1d74512",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T11:13:00.843115Z",
  "updated_at": "2026-10-29T11:13:02.883709Z",
  "respond_by": "2026-10-29T15:13:00.843115Z",
  "messages": [
    {
      "id": "a74a8c4b-b3e9-436d-87c0-285656e1b8a7",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d5e62488-35c8-4aa6-b793-8af6f1d74512",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T11:13:00.844052Z",
      "attachments": [
        {
          "file_id": "83f27128-04f0-4e6d-9ee5-acd68c200b4e",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "da5662c3-32e7-46c3-98b3-f06977fe70f0",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T11:13:02.883109Z",
      "attachments": [
        {
          "file_id": "5b80f19f-1684-40b2-96fc-b9dfe850a9d6",
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

`GET /api/rider/v1/support/cases/ebb680a2-910c-4903-93d7-e457dfaa4339` → **200**

```json
{
  "id": "ebb680a2-910c-4903-93d7-e457dfaa4339",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d5e62488-35c8-4aa6-b793-8af6f1d74512",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T11:13:00.843115Z",
  "updated_at": "2026-10-29T11:13:02.883709Z",
  "respond_by": "2026-10-29T15:13:00.843115Z",
  "messages": [
    {
      "id": "a74a8c4b-b3e9-436d-87c0-285656e1b8a7",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d5e62488-35c8-4aa6-b793-8af6f1d74512",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T11:13:00.844052Z",
      "attachments": [
        {
          "file_id": "83f27128-04f0-4e6d-9ee5-acd68c200b4e",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "da5662c3-32e7-46c3-98b3-f06977fe70f0",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T11:13:02.883109Z",
      "attachments": [
        {
          "file_id": "5b80f19f-1684-40b2-96fc-b9dfe850a9d6",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/ebb680a2-910c-4903-93d7-e457dfaa4339/attachments/5b80f19f-1684-40b2-96fc-b9dfe850a9d6` → **200**

Done: support case ebb680a2-910c-4903-93d7-e457dfaa4339, rider attachment 83f27128-04f0-4e6d-9ee5-acd68c200b4e, operator attachment 5b80f19f-1684-40b2-96fc-b9dfe850a9d6.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739545552",
  "device_ref": "sandbox-5915"
}
```

```json
{
  "challenge_id": "5ee1605f-1bbd-4337-987b-34924e2b7d1a",
  "expires_at": "2026-10-29T11:18:03.496189847Z",
  "resend_available_at": "2026-10-29T11:13:04.496189847Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739545552` → **200**

```json
{
  "phone": "+380739545552",
  "audience": "CLIENT",
  "code": "038978",
  "sent_at": "2026-10-29T11:13:03.498639141Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5ee1605f-1bbd-4337-987b-34924e2b7d1a",
  "code": "038978",
  "device_ref": "sandbox-5915"
}
```

```json
{
  "session_id": "4191f7b3-5cf1-4407-a3a0-5fe7dc623894",
  "subject": {
    "type": "CLIENT",
    "id": "057dcb63-ad0d-4a47-93b6-ffea71ab78e4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTdkY2I2My1hZDBkLTRhNDctOTNiNi1mZmVhNzFhYjc4ZTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMjgzLCJpYXQiOjE3OTMyNzIzODMsImp0aSI6ImE3YjNjNWYzLTFjMGUtNDAzZS05NjY5LWQ4YTNhY2NmZWVlYSIsInNpZCI6IjQxOTFmN2IzLTVjZjEtNDQwNy1hM2EwLTVmZTdkYzYyMzg5NCJ9.0NKrvP6Uccampq7ErXmSWfV7hzy5JKKZ-hot9eGKbFc",
  "access_expires_at": "2026-10-29T11:28:03.778427446Z",
  "refresh_token": "2Oixyo4j-KnRF80YdpvBxM-2QXtt1GIdYFed0kWFiic",
  "refresh_expires_at": "2026-11-28T11:13:03.777915777Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "17a12894-93bb-46bb-b01c-72aface3dc91",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "8f5402af-6c54-46d9-9c3b-26906448cb29",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-8f5402af-6c54-46d9-9c3b-26906448cb29",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "c4d8f771d840e2206b2169f60afb7b97",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=8f5402af-6c54-46d9-9c3b-26906448cb29",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739545552"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=8f5402af-6c54-46d9-9c3b-26906448cb29",
  "expires_at": "2026-10-29T11:43:04.038543Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/8f5402af-6c54-46d9-9c3b-26906448cb29` → **200**

```json
{
  "id": "8f5402af-6c54-46d9-9c3b-26906448cb29",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T11:43:04.038543Z",
  "card": {
    "id": "0f4654fd-d57b-4bc5-bfa7-b0dbb691f070",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1094",
    "card_type": "Visa",
    "created_at": "2026-10-29T11:13:04.303352Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bc1260fd-41c7-4902-ae90-d0eb98e0c661",
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
  "id": "0c8ccf1f-d456-45f6-bb99-9468012bfb5d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:18:04.587266Z",
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
  "command_id": "43bad5e5-a1f8-4e02-9e03-b3cc9574ed65",
  "quote_id": "0c8ccf1f-d456-45f6-bb99-9468012bfb5d",
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
  "id": "2eaf618b-c9af-42d6-8f8c-442d08356de4",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "057dcb63-ad0d-4a47-93b6-ffea71ab78e4",
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
  "created_at": "2026-10-29T11:13:04.863261Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2eaf618b-c9af-42d6-8f8c-442d08356de4` → **200**

```json
{
  "id": "2eaf618b-c9af-42d6-8f8c-442d08356de4",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "057dcb63-ad0d-4a47-93b6-ffea71ab78e4",
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
  "created_at": "2026-10-29T11:13:04.863261Z",
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

`GET /api/rider/v1/orders/2eaf618b-c9af-42d6-8f8c-442d08356de4` → **200**

```json
{
  "id": "2eaf618b-c9af-42d6-8f8c-442d08356de4",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "057dcb63-ad0d-4a47-93b6-ffea71ab78e4",
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
  "created_at": "2026-10-29T11:13:04.863261Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/2eaf618b-c9af-42d6-8f8c-442d08356de4/switch-to-cash` → **200**

```json
{
  "command_id": "8e20030e-35b4-40ba-a653-205651b7a454",
  "expected_version": 3
}
```

```json
{
  "id": "2eaf618b-c9af-42d6-8f8c-442d08356de4",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "057dcb63-ad0d-4a47-93b6-ffea71ab78e4",
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
  "created_at": "2026-10-29T11:13:04.863261Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/2eaf618b-c9af-42d6-8f8c-442d08356de4/switch-to-cash` → **409**

```json
{
  "command_id": "80cd85a2-045d-4a6b-afae-c451ba8be4bd",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/2eaf618b-c9af-42d6-8f8c-442d08356de4/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a2629342-f84b-47e1-ab08-f8c9576ee940"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/2eaf618b-c9af-42d6-8f8c-442d08356de4` → **200**

```json
{
  "id": "2eaf618b-c9af-42d6-8f8c-442d08356de4",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "057dcb63-ad0d-4a47-93b6-ffea71ab78e4",
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
  "created_at": "2026-10-29T11:13:04.863261Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/2eaf618b-c9af-42d6-8f8c-442d08356de4/cancel` → **200**

```json
{
  "command_id": "ba2f8916-e956-4703-b031-ed3d52ff6411",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2eaf618b-c9af-42d6-8f8c-442d08356de4",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "057dcb63-ad0d-4a47-93b6-ffea71ab78e4",
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
  "created_at": "2026-10-29T11:13:04.863261Z",
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
  "session_id": "a657bc66-31fb-4312-8195-34a507aa79d5",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMyODcsImlhdCI6MTc5MzI3MjM4NywianRpIjoiN2I3ZWNmNjctNTkzZi00OWI4LWJiZTEtNTJiMTI4ZmY4ZjRmIiwic2lkIjoiYTY1N2JjNjYtMzFmYi00MzEyLTgxOTUtMzRhNTA3YWE3OWQ1In0.egb92DZojQXtQRwiTRJexAbTpJ2hD2XhjI0fTN_rNLQ",
  "access_expires_at": "2026-10-29T11:28:07.168212078Z",
  "refresh_token": "zzYkyhQ-DA-luRXAJhouCsqKGaLvoIlmZlknVrANTag",
  "refresh_expires_at": "2026-10-29T23:13:07.167705383Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-19677"
}
```

```json
{
  "challenge_id": "1de36659-8edb-4488-a131-77cfab8e5041",
  "expires_at": "2026-10-29T11:18:07.43741009Z",
  "resend_available_at": "2026-10-29T11:13:08.43741009Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "978756",
  "sent_at": "2026-10-29T11:13:07.439984576Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1de36659-8edb-4488-a131-77cfab8e5041",
  "code": "978756",
  "device_ref": "sandbox-19677"
}
```

```json
{
  "session_id": "69537d46-0f63-4a9f-8bb3-09eb5707dfe9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MzI4NywiaWF0IjoxNzkzMjcyMzg3LCJqdGkiOiI0ODcwZTVlOS0xZmIzLTRhMTItODEwOS1iYzBiZWU0YWViNTYiLCJzaWQiOiI2OTUzN2Q0Ni0wZjYzLTRhOWYtOGJiMy0wOWViNTcwN2RmZTkifQ.z24FIpk5-xB66xEiYmzEWxAxeGVfWBjAEMK_DJU7xvA",
  "access_expires_at": "2026-10-29T11:28:07.728645863Z",
  "refresh_token": "k4XHKi4dugcRvjF0bEkOMq4nN8aBE0P8Wta-8mDyVd8",
  "refresh_expires_at": "2026-11-28T11:13:07.728044171Z",
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
      "actor_id": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T11:12:52.400569Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
      "reason": "Sandbox clean-up",
      "at": "2026-10-29T11:12:53.814325Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "94fc8792-9d7d-4933-94a4-1d5b4d1b34e3",
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
  "device_ref": "sandbox-19860"
}
```

```json
{
  "challenge_id": "869f134f-e2c0-4e2a-b5b4-b462443114aa",
  "expires_at": "2026-10-29T11:18:08.807950085Z",
  "resend_available_at": "2026-10-29T11:13:09.807950085Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "922719",
  "sent_at": "2026-10-29T11:13:08.81037083Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "869f134f-e2c0-4e2a-b5b4-b462443114aa",
  "code": "922719",
  "device_ref": "sandbox-19860"
}
```

```json
{
  "session_id": "7f78ad63-7c93-4f30-aa72-dd2ca3be1ae5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MzI4OSwiaWF0IjoxNzkzMjcyMzg5LCJqdGkiOiI1NzIzYzNmMi1mODgzLTRjMjItOWVhOS1kMGE2MjdhM2E0ZGIiLCJzaWQiOiI3Zjc4YWQ2My03YzkzLTRmMzAtYWE3Mi1kZDJjYTNiZTFhZTUifQ.NEUPZqXUtk637l36jA6gxa_XTxjM1K3yaFc0UvnKm2U",
  "access_expires_at": "2026-10-29T11:28:09.094186222Z",
  "refresh_token": "_2O2HUCgk35UtgqfeoLI56vkqeCBuM2oUIwdNNQ2mXg",
  "refresh_expires_at": "2026-11-28T11:13:09.09378205Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a96a9a4b-5050-4ce5-8016-7d5bb63264f1",
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
  "last_heartbeat_at": "2026-10-29T11:12:32.826131Z",
  "last_location_at": "2026-10-29T11:12:32.826131Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a96a9a4b-5050-4ce5-8016-7d5bb63264f1/handover` → **200**

```json
{
  "command_id": "146a89e5-7cb2-4ad0-9c84-aa8bd6366e3b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a96a9a4b-5050-4ce5-8016-7d5bb63264f1",
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
  "last_heartbeat_at": "2026-10-29T11:12:32.826131Z",
  "last_location_at": "2026-10-29T11:12:32.826131Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a96a9a4b-5050-4ce5-8016-7d5bb63264f1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:13:09Z",
    "sequence": 1793272389880
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a96a9a4b-5050-4ce5-8016-7d5bb63264f1",
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
  "last_heartbeat_at": "2026-10-29T11:13:09.897309Z",
  "last_location_at": "2026-10-29T11:13:09.897309Z",
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
  "command_id": "d250e052-f595-4dc7-b250-86e05d0d1fc1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:13:10Z",
    "sequence": 1793272390421
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "59eeae15-ccbc-472f-ad9c-dac94c2db55f",
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
  "last_heartbeat_at": "2026-10-29T11:13:10.439107Z",
  "last_location_at": "2026-10-29T11:13:10.439107Z",
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
  "session_id": "2aa9224a-d0a4-4400-8ffa-3ac07944097a",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzMyOTEsImlhdCI6MTc5MzI3MjM5MSwianRpIjoiY2JhNTA1MGMtMzFiNy00MmYwLWI3NmUtM2E1Nzg2NTgwZDIxIiwic2lkIjoiMmFhOTIyNGEtZDBhNC00NDAwLThmZmEtM2FjMDc5NDQwOTdhIn0.aFWt5cRzq601Q3zyiekcfMvaXwA_DYur52B5arNl8RE",
  "access_expires_at": "2026-10-29T11:28:11.024935443Z",
  "refresh_token": "w0bOabl5pGaJrLEl6LetU8h-ylzEwO6oeELgRH2IDpg",
  "refresh_expires_at": "2026-10-29T23:13:11.024379938Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7c554a30-33b4-4c7f-8111-4fb1dfd30d9a",
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
  "id": "d814f395-2a44-430c-80d8-705d49ec4baf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:18:11.292414Z",
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
  "command_id": "5f138d98-c458-447c-b7c8-a658abd0ec4a",
  "quote_id": "d814f395-2a44-430c-80d8-705d49ec4baf",
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
  "id": "280a8e05-de8f-4fee-a943-d90fc6319a9b",
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
  "created_at": "2026-10-29T11:13:11.575129Z",
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
    "id": "df709281-556a-49af-b87d-11a0e9e4013f",
    "order_id": "280a8e05-de8f-4fee-a943-d90fc6319a9b",
    "expires_at": "2026-10-29T11:13:26.579671Z",
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

`POST /api/driver/v1/offers/df709281-556a-49af-b87d-11a0e9e4013f/accept` → **200**

```json
{
  "command_id": "57129f9b-71ce-4132-80eb-09aaca5463a1"
}
```

```json
{
  "id": "81e694dc-cc6d-4667-bb03-eaec5940ca45",
  "order_id": "280a8e05-de8f-4fee-a943-d90fc6319a9b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b2f7625b-04ac-4496-84b6-c227f07f2faf",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b2f7625b-04ac-4496-84b6-c227f07f2faf",
  "order_id": "280a8e05-de8f-4fee-a943-d90fc6319a9b",
  "assignment_id": "81e694dc-cc6d-4667-bb03-eaec5940ca45",
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

`POST /api/driver/v1/work-sessions/59eeae15-ccbc-472f-ad9c-dac94c2db55f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T11:13:12Z",
    "sequence": 1793272392905
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "59eeae15-ccbc-472f-ad9c-dac94c2db55f",
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
  "last_heartbeat_at": "2026-10-29T11:13:12.921456Z",
  "last_location_at": "2026-10-29T11:13:12.921456Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b2f7625b-04ac-4496-84b6-c227f07f2faf/arrive` → **200**

```json
{
  "command_id": "00407dbf-50ed-4b68-a060-367e18f7d0de",
  "expected_version": 0
}
```

```json
{
  "id": "b2f7625b-04ac-4496-84b6-c227f07f2faf",
  "order_id": "280a8e05-de8f-4fee-a943-d90fc6319a9b",
  "assignment_id": "81e694dc-cc6d-4667-bb03-eaec5940ca45",
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
  "arrived_at": "2026-10-29T11:13:13.196972Z",
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

`POST /api/driver/v1/trips/b2f7625b-04ac-4496-84b6-c227f07f2faf/start` → **200**

```json
{
  "command_id": "078abba7-f8d9-4032-bf8f-96a73332b6b0",
  "expected_version": 1
}
```

```json
{
  "id": "b2f7625b-04ac-4496-84b6-c227f07f2faf",
  "order_id": "280a8e05-de8f-4fee-a943-d90fc6319a9b",
  "assignment_id": "81e694dc-cc6d-4667-bb03-eaec5940ca45",
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
  "arrived_at": "2026-10-29T11:13:13.196972Z",
  "started_at": "2026-10-29T11:13:13.476341Z",
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

`POST /api/driver/v1/trips/b2f7625b-04ac-4496-84b6-c227f07f2faf/complete` → **200**

```json
{
  "command_id": "34b4184c-5ffe-4d38-902f-5e31f5f83c17",
  "expected_version": 2,
  "reported_at": "2026-10-29T11:13:13Z",
  "cash_received": true
}
```

```json
{
  "id": "b2f7625b-04ac-4496-84b6-c227f07f2faf",
  "order_id": "280a8e05-de8f-4fee-a943-d90fc6319a9b",
  "assignment_id": "81e694dc-cc6d-4667-bb03-eaec5940ca45",
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
  "arrived_at": "2026-10-29T11:13:13.196972Z",
  "started_at": "2026-10-29T11:13:13.476341Z",
  "completed_at": "2026-10-29T11:13:13.762358Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/280a8e05-de8f-4fee-a943-d90fc6319a9b` → **200**

```json
{
  "id": "280a8e05-de8f-4fee-a943-d90fc6319a9b",
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
    "id": "81e694dc-cc6d-4667-bb03-eaec5940ca45",
    "order_id": "280a8e05-de8f-4fee-a943-d90fc6319a9b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b2f7625b-04ac-4496-84b6-c227f07f2faf",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T11:13:11.575129Z",
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
  "session_id": "a96a9a4b-5050-4ce5-8016-7d5bb63264f1",
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
  "last_heartbeat_at": "2026-10-29T11:13:09.897309Z",
  "last_location_at": "2026-10-29T11:13:09.897309Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a96a9a4b-5050-4ce5-8016-7d5bb63264f1/close` → **200**

```json
{
  "command_id": "f649e5bc-864b-4cd9-a6bd-7b2ec9c2c28f",
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
  "session_id": "59eeae15-ccbc-472f-ad9c-dac94c2db55f",
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
  "last_heartbeat_at": "2026-10-29T11:13:12.921456Z",
  "last_location_at": "2026-10-29T11:13:12.921456Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/59eeae15-ccbc-472f-ad9c-dac94c2db55f/close` → **200**

```json
{
  "command_id": "401e4101-a3da-4e68-a7f5-7b402dbfdfe9",
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

Done: terminal order 280a8e05-de8f-4fee-a943-d90fc6319a9b by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-18780"
}
```

```json
{
  "challenge_id": "47499e92-c086-4463-a4df-29714ad7d17a",
  "expires_at": "2026-10-29T11:18:18.644159618Z",
  "resend_available_at": "2026-10-29T11:13:19.644159618Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "067443",
  "sent_at": "2026-10-29T11:13:18.647026912Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "47499e92-c086-4463-a4df-29714ad7d17a",
  "code": "067443",
  "device_ref": "sandbox-18780"
}
```

```json
{
  "session_id": "bb3c4710-9c9f-4995-83da-4ea95961a671",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MzI5OCwiaWF0IjoxNzkzMjcyMzk4LCJqdGkiOiIxMDg2MjI4NS00MWQxLTQ5YmItYTBjMS1lYmViZTQ5YTk0NDkiLCJzaWQiOiJiYjNjNDcxMC05YzlmLTQ5OTUtODNkYS00ZWE5NTk2MWE2NzEifQ.I1q08r1aUnftA0UYbojnU9rSCfSmtoVX5kZe_OI1Pes",
  "access_expires_at": "2026-10-29T11:28:18.94444184Z",
  "refresh_token": "GTZ8icP7wb5aI0bz4DkOauVn-cdixPyDu25WKNbr-QQ",
  "refresh_expires_at": "2026-11-28T11:13:18.943954011Z",
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
  "device_ref": "sandbox-26999"
}
```

```json
{
  "challenge_id": "b3d75c46-8d1a-496a-b685-f677ab520a6e",
  "expires_at": "2026-10-29T11:18:19.462845205Z",
  "resend_available_at": "2026-10-29T11:13:20.462845205Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "053653",
  "sent_at": "2026-10-29T11:13:19.465111275Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b3d75c46-8d1a-496a-b685-f677ab520a6e",
  "code": "053653",
  "device_ref": "sandbox-26999"
}
```

```json
{
  "session_id": "6b40b0fc-a0a9-4bdc-8b7b-8b6f7dc44f5d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MzI5OSwiaWF0IjoxNzkzMjcyMzk5LCJqdGkiOiI4OTlmODc5MS00NWUwLTRkYjgtOWU4MS1hNGY4MzVjYzMzOGEiLCJzaWQiOiI2YjQwYjBmYy1hMGE5LTRiZGMtOGI3Yi04YjZmN2RjNDRmNWQifQ.QTOQETe5vCO11hDSk-9DW-DdgNEoGa65l682ZJQotg4",
  "access_expires_at": "2026-10-29T11:28:19.750479439Z",
  "refresh_token": "p1q8Pg3E0qMDmQXIq88dkeQoKCfTB4Gju-prrK9Jqmk",
  "refresh_expires_at": "2026-11-28T11:13:19.750018639Z",
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
  "device_ref": "sandbox-19199"
}
```

```json
{
  "challenge_id": "c94a2321-9365-4070-aeb5-784860b28ea7",
  "expires_at": "2026-10-29T11:18:20.260310501Z",
  "resend_available_at": "2026-10-29T11:13:21.260310501Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "842120",
  "sent_at": "2026-10-29T11:13:20.262930873Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c94a2321-9365-4070-aeb5-784860b28ea7",
  "code": "842120",
  "device_ref": "sandbox-19199"
}
```

```json
{
  "session_id": "42b60bd9-f5d7-4644-b212-06021757ce54",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MzMwMCwiaWF0IjoxNzkzMjcyNDAwLCJqdGkiOiJiNGYwODY1YS1lNjU5LTQ5MTAtOWQxNi1lYzdkNDE2NDdmYmQiLCJzaWQiOiI0MmI2MGJkOS1mNWQ3LTQ2NDQtYjIxMi0wNjAyMTc1N2NlNTQifQ.BSwF4-bzMImmWEqKlZr47R6Sjfpn-c1w8RjmR1fRSRg",
  "access_expires_at": "2026-10-29T11:28:20.549804659Z",
  "refresh_token": "Bn2LtgTTO4ngwouSqdaM1aZCVpoqYRcdKjBFi6jhBqg",
  "refresh_expires_at": "2026-11-28T11:13:20.549141067Z",
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
  "phone": "+380696965918",
  "device_ref": "sandbox-14114"
}
```

```json
{
  "challenge_id": "d7004d38-1fff-478f-a76a-cd2cd3c52bed",
  "expires_at": "2026-10-29T11:18:21.068856505Z",
  "resend_available_at": "2026-10-29T11:13:22.068856505Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380696965918` → **200**

```json
{
  "phone": "+380696965918",
  "audience": "CLIENT",
  "code": "783157",
  "sent_at": "2026-10-29T11:13:21.071137866Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d7004d38-1fff-478f-a76a-cd2cd3c52bed",
  "code": "783157",
  "device_ref": "sandbox-14114"
}
```

```json
{
  "session_id": "66a6c608-3520-45b5-b671-aa194953de9f",
  "subject": {
    "type": "CLIENT",
    "id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Y2M3MmNiMy1mZjNhLTRiOWItODNkYi1lMTg2YTRjMmJhMjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjczMzAxLCJpYXQiOjE3OTMyNzI0MDEsImp0aSI6ImRjMGQ0MDc2LTFkMWYtNGZkZS1iNjlmLWJlYTU4ZjNkNDNkYiIsInNpZCI6IjY2YTZjNjA4LTM1MjAtNDViNS1iNjcxLWFhMTk0OTUzZGU5ZiJ9.RXNKOUENJhQdBlcHJ_kFHp9d4AIRvKLDx98WO6uMw64",
  "access_expires_at": "2026-10-29T11:28:21.349299949Z",
  "refresh_token": "in8N2H0hLV7Dk_9NVYcTqV5cobadvFDJ8SLvaulsRC8",
  "refresh_expires_at": "2026-11-28T11:13:21.348768908Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "96fbfc1e-b159-4818-81b1-c4aa97bda939",
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
  "id": "ee681421-1105-4d37-9115-4e10ea6487a4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T11:18:21.618510Z",
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
  "command_id": "0a7004cd-54e6-4c0b-8e41-c35a35deb20d",
  "quote_id": "ee681421-1105-4d37-9115-4e10ea6487a4",
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
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T11:13:21.895981Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T11:13:21.895981Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 13.811197658
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.142495473
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

`GET /api/rider/v1/orders/3a6a0d0c-69a7-46b4-96d9-de2d82139c5f` → **200**

```json
{
  "id": "3a6a0d0c-69a7-46b4-96d9-de2d82139c5f",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8cc72cb3-ff3a-4b9b-83db-e186a4c2ba22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T11:13:21.895981Z",
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
  "session_id": "c85311dc-2587-42f8-b9fd-50feabd73a2e",
  "subject": {
    "type": "STAFF",
    "id": "d86fcc7f-3fba-4a68-ad64-9a802c519589"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODZmY2M3Zi0zZmJhLTRhNjgtYWQ2NC05YTgwMmM1MTk1ODkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzM0ODgsImlhdCI6MTc5MzI3MjU4OCwianRpIjoiM2U4M2ViYTktYjM4ZS00Y2Q1LTk5ZjItMDU1MTBhMDg1ZjNkIiwic2lkIjoiYzg1MzExZGMtMjU4Ny00MmY4LWI5ZmQtNTBmZWFiZDczYTJlIn0.VlaTVtJbNMpoyQHWdspHUwKTo7GOek659Sj1jLGokHk",
  "access_expires_at": "2026-10-29T11:31:28.151491573Z",
  "refresh_token": "U02fkxYUrJaGyyombre2bjZWcs-rX1zXtiB7zlfcH3M",
  "refresh_expires_at": "2026-10-29T23:16:28.151066825Z",
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
  "id": "798bf9ca-72a7-4af8-ac92-0baaa212742b",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T11:16:28.428203Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T11:16:28.428279Z",
  "updated_at": "2026-10-29T11:16:28.445184Z",
  "finished_at": "2026-10-29T11:16:28.445184Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/798bf9ca-72a7-4af8-ac92-0baaa212742b` → **200**

```json
{
  "run": {
    "id": "798bf9ca-72a7-4af8-ac92-0baaa212742b",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T11:16:28.428203Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T11:16:28.428279Z",
    "updated_at": "2026-10-29T11:16:28.445184Z",
    "finished_at": "2026-10-29T11:16:28.445184Z",
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
  "id": "798bf9ca-72a7-4af8-ac92-0baaa212742b",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T11:16:28.428203Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T11:16:28.428279Z",
  "updated_at": "2026-10-29T11:16:28.445184Z",
  "finished_at": "2026-10-29T11:16:28.445184Z",
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
  "id": "798bf9ca-72a7-4af8-ac92-0baaa212742b",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T11:16:28.428203Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T11:16:28.428279Z",
  "updated_at": "2026-10-29T11:16:28.445184Z",
  "finished_at": "2026-10-29T11:16:28.445184Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/e9e40a21-e038-4b50-bb08-e89f79feba86` → **204**

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
  "id": "293f2b09-f4e2-4ba7-b687-d768e22b1077",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T11:16:28.867645Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T11:16:28.867763Z",
  "updated_at": "2026-10-29T11:16:28.875341Z",
  "finished_at": "2026-10-29T11:16:28.875341Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/293f2b09-f4e2-4ba7-b687-d768e22b1077` → **200**

```json
{
  "run": {
    "id": "293f2b09-f4e2-4ba7-b687-d768e22b1077",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T11:16:28.867645Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T11:16:28.867763Z",
    "updated_at": "2026-10-29T11:16:28.875341Z",
    "finished_at": "2026-10-29T11:16:28.875341Z",
    "version": 1
  },
  "items": [
    {
      "id": "f6818372-1f6f-4dfb-bb5a-fac794efb52a",
      "run_id": "293f2b09-f4e2-4ba7-b687-d768e22b1077",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "5c0e41b641fb5f229ee90fdb42b4452187685d967c5684178c6e5c548923d35c",
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
      "provider_at": "2026-10-29T11:16:28Z",
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
  "id": "293f2b09-f4e2-4ba7-b687-d768e22b1077",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T11:16:28.867645Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T11:16:28.867763Z",
  "updated_at": "2026-10-29T11:16:28.875341Z",
  "finished_at": "2026-10-29T11:16:28.875341Z",
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
  "id": "293f2b09-f4e2-4ba7-b687-d768e22b1077",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T11:16:28.867645Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T11:16:28.867763Z",
  "updated_at": "2026-10-29T11:16:28.875341Z",
  "finished_at": "2026-10-29T11:16:28.875341Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/f6818372-1f6f-4dfb-bb5a-fac794efb52a/resolve` → **200**

```json
{
  "command_id": "ae3db1ba-f1eb-4e44-bde7-6a12648cfd66",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "f6818372-1f6f-4dfb-bb5a-fac794efb52a",
  "run_id": "293f2b09-f4e2-4ba7-b687-d768e22b1077",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "5c0e41b641fb5f229ee90fdb42b4452187685d967c5684178c6e5c548923d35c",
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
  "provider_at": "2026-10-29T11:16:28Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
  "resolved_at": "2026-10-29T11:16:29.27394Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/f6818372-1f6f-4dfb-bb5a-fac794efb52a/resolve` → **200**

```json
{
  "command_id": "ae3db1ba-f1eb-4e44-bde7-6a12648cfd66",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "f6818372-1f6f-4dfb-bb5a-fac794efb52a",
  "run_id": "293f2b09-f4e2-4ba7-b687-d768e22b1077",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "5c0e41b641fb5f229ee90fdb42b4452187685d967c5684178c6e5c548923d35c",
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
  "provider_at": "2026-10-29T11:16:28Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
  "resolved_at": "2026-10-29T11:16:29.27394Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/f6818372-1f6f-4dfb-bb5a-fac794efb52a/resolve` → **409**

```json
{
  "command_id": "f233a88e-97ca-4438-b91d-30337366abf7",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/f6818372-1f6f-4dfb-bb5a-fac794efb52a/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "680dbfed-28e9-475d-8af8-686f3de48bc1"
}
```

`GET /api/admin/v1/payment-reconciliations/293f2b09-f4e2-4ba7-b687-d768e22b1077` → **200**

```json
{
  "run": {
    "id": "293f2b09-f4e2-4ba7-b687-d768e22b1077",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T11:16:28.867645Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T11:16:28.867763Z",
    "updated_at": "2026-10-29T11:16:29.27394Z",
    "finished_at": "2026-10-29T11:16:28.875341Z",
    "version": 2
  },
  "items": [
    {
      "id": "f6818372-1f6f-4dfb-bb5a-fac794efb52a",
      "run_id": "293f2b09-f4e2-4ba7-b687-d768e22b1077",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "5c0e41b641fb5f229ee90fdb42b4452187685d967c5684178c6e5c548923d35c",
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
      "provider_at": "2026-10-29T11:16:28Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "d86fcc7f-3fba-4a68-ad64-9a802c519589",
      "resolved_at": "2026-10-29T11:16:29.27394Z",
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
      "id": "293f2b09-f4e2-4ba7-b687-d768e22b1077",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-29T11:16:28.867645Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T11:16:28.867763Z",
      "updated_at": "2026-10-29T11:16:29.27394Z",
      "finished_at": "2026-10-29T11:16:28.875341Z",
      "version": 2
    },
    {
      "id": "89236017-00be-494e-9531-6f5a3efa5c50",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-28",
      "period_from": "2026-10-27T22:00:00Z",
      "period_to": "2026-10-29T02:00:00Z",
      "observed_until": "2026-10-29T11:08:45.222365Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T11:08:45.222568Z",
      "updated_at": "2026-10-29T11:08:45.237691Z",
      "finished_at": "2026-10-29T11:08:45.237691Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/e9e40a21-e038-4b50-bb08-e89f79feba86` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29"
}
```

```json
{
  "id": "293f2b09-f4e2-4ba7-b687-d768e22b1077",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T11:16:28.867645Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T11:16:28.867763Z",
  "updated_at": "2026-10-29T11:16:29.27394Z",
  "finished_at": "2026-10-29T11:16:28.875341Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.79327271546E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793272715609E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.79327271561E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793272715611E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.79327271561E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
