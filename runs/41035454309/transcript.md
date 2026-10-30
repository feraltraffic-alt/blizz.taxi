# Sandbox transcript (2026-10-30T09:43:58Z, 08b90b8)

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
  "correlation_id": "82acb171-bda2-4329-b4f4-8085bace940f"
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
  "session_id": "7cce797d-f756-4b4c-99aa-755e35cdfd33",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQzNDYsImlhdCI6MTc5MzM1MzQ0NiwianRpIjoiNDU5Mzk5MTktNjNjZi00NTRkLWE3MjItNDBmNWUyNmYxOGMzIiwic2lkIjoiN2NjZTc5N2QtZjc1Ni00YjRjLTk5YWEtNzU1ZTM1Y2RmZDMzIn0.RF_6WNzcZHPW4odGKK5r8sOIOApfOFvMpWbtmzPG8bI",
  "access_expires_at": "2026-10-30T09:59:06.422125138Z",
  "refresh_token": "ZZ4O-dqVdkaLSh0-KCVhTz05c3gcuNfBFxhw8PRNUvQ",
  "refresh_expires_at": "2026-10-30T21:44:06.41999739Z",
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
  "session_id": "21763731-9bca-44e7-9d0c-74962c2db84d",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQzNDgsImlhdCI6MTc5MzM1MzQ0OCwianRpIjoiYmI0ZjdjNDctNjViMy00MmI0LThlMGUtNzY2ZTJlOGY3MDNiIiwic2lkIjoiMjE3NjM3MzEtOWJjYS00NGU3LTlkMGMtNzQ5NjJjMmRiODRkIn0.MWeGQp61gHERxSAfeOXdudzyVWFWd1_3ZtkdszdTrCE",
  "access_expires_at": "2026-10-30T09:59:08.062382196Z",
  "refresh_token": "LE6_TX7eFrDtlBskfJL6J3Fh0oBcpgMTD4-BU-pnbQM",
  "refresh_expires_at": "2026-10-30T21:44:08.06113741Z",
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
  "device_ref": "sandbox-32349"
}
```

```json
{
  "challenge_id": "5278ba6c-981d-474d-810b-a9c882431a31",
  "expires_at": "2026-10-30T09:49:08.560469074Z",
  "resend_available_at": "2026-10-30T09:44:09.560469074Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "023777",
  "sent_at": "2026-10-30T09:44:08.57274113Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5278ba6c-981d-474d-810b-a9c882431a31",
  "code": "023777",
  "device_ref": "sandbox-32349"
}
```

```json
{
  "session_id": "afe1da47-752e-4484-8f1b-482e9249ad7c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDM0OCwiaWF0IjoxNzkzMzUzNDQ4LCJqdGkiOiI0MWNiYmZiMi1mODcyLTQwMWItYjY2ZC0yZjgzY2Q3MmQ2ZjMiLCJzaWQiOiJhZmUxZGE0Ny03NTJlLTQ0ODQtOGYxYi00ODJlOTI0OWFkN2MifQ.SMysegqlS3ZD2XgMcvMZwzfIE7eAQdLZSIKTe8sxIrA",
  "access_expires_at": "2026-10-30T09:59:08.832126441Z",
  "refresh_token": "HgfX6yhKTgkgSyiS9rPw0kMC-k02TurDNDafKS4s29c",
  "refresh_expires_at": "2026-11-29T09:44:08.831115533Z",
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
  "command_id": "f5ce7949-8c02-4f38-84a5-91a812456f69",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:44:09Z",
    "sequence": 1793353449308
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0992d1bc-6523-403a-8355-dd2afc1c9094",
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
  "last_heartbeat_at": "2026-10-30T09:44:09.441554Z",
  "last_location_at": "2026-10-30T09:44:09.441554Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631957717",
  "device_ref": "sandbox-32353"
}
```

```json
{
  "challenge_id": "ce99fff9-6a74-41fb-a98a-5b05fd82486b",
  "expires_at": "2026-10-30T09:49:09.676388845Z",
  "resend_available_at": "2026-10-30T09:44:10.676388845Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631957717` → **200**

```json
{
  "phone": "+380631957717",
  "audience": "CLIENT",
  "code": "416506",
  "sent_at": "2026-10-30T09:44:09.682119978Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ce99fff9-6a74-41fb-a98a-5b05fd82486b",
  "code": "416506",
  "device_ref": "sandbox-32353"
}
```

```json
{
  "session_id": "d9c8323c-b3db-4a1f-9877-53d6cc9d26cc",
  "subject": {
    "type": "CLIENT",
    "id": "6f156b41-2a8d-4895-abf6-55f58aa4dd43"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZjE1NmI0MS0yYThkLTQ4OTUtYWJmNi01NWY1OGFhNGRkNDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0MzQ5LCJpYXQiOjE3OTMzNTM0NDksImp0aSI6IjQ5ZDg2Zjk1LWEwYmEtNDBmNC04ZjUxLTkyOTNhMGI4MzA5YiIsInNpZCI6ImQ5YzgzMjNjLWIzZGItNGExZi05ODc3LTUzZDZjYzlkMjZjYyJ9._l_YT-lsCR9DhL3Fdbb2OeCWSkHsBYvPBAKrx6-T0Hk",
  "access_expires_at": "2026-10-30T09:59:09.932734802Z",
  "refresh_token": "2zJYsL4K6ccbeQwjdmEZVpKrpHIRsEayvVBKUciPOXk",
  "refresh_expires_at": "2026-11-29T09:44:09.931857074Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8440ee35-b5f5-4af4-bda3-f37289ff25c5",
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
  "id": "65399533-eb14-4cc8-a76c-43fe77f0d77c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:49:10.191287Z",
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
  "command_id": "1808d1c2-d439-4ce4-8a79-6095e1cdcd87",
  "quote_id": "65399533-eb14-4cc8-a76c-43fe77f0d77c",
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
  "id": "1b64848a-9026-4325-9b95-3aa1d904367f",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6f156b41-2a8d-4895-abf6-55f58aa4dd43",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:44:10.499073Z",
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
    "id": "3b79fbf7-edc8-45df-86e7-5616a948a75b",
    "order_id": "1b64848a-9026-4325-9b95-3aa1d904367f",
    "expires_at": "2026-10-30T09:44:25.507467Z",
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

`POST /api/driver/v1/offers/3b79fbf7-edc8-45df-86e7-5616a948a75b/accept` → **200**

```json
{
  "command_id": "a11c0d58-9851-4c83-aafd-c4c859288625"
}
```

```json
{
  "id": "74fc7313-238d-45b4-9eb9-6c95982b6d93",
  "order_id": "1b64848a-9026-4325-9b95-3aa1d904367f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2fd87f78-a8c2-4280-a1a1-42ad39dd9f74",
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
  "command_id": "c6402c3b-eef2-4e50-9cf4-4b631c7c9d60",
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
  "changed_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T09:44:11.509881472Z"
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
  "id": "2fd87f78-a8c2-4280-a1a1-42ad39dd9f74",
  "order_id": "1b64848a-9026-4325-9b95-3aa1d904367f",
  "assignment_id": "74fc7313-238d-45b4-9eb9-6c95982b6d93",
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

`POST /api/driver/v1/work-sessions/0992d1bc-6523-403a-8355-dd2afc1c9094/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:44:12Z",
    "sequence": 1793353452224
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0992d1bc-6523-403a-8355-dd2afc1c9094",
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
  "last_heartbeat_at": "2026-10-30T09:44:12.243872Z",
  "last_location_at": "2026-10-30T09:44:12.243872Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/2fd87f78-a8c2-4280-a1a1-42ad39dd9f74/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "d113d507-427d-4fd4-ad59-84198743bfda",
  "expected_version": 0
}
```

```json
{
  "id": "2fd87f78-a8c2-4280-a1a1-42ad39dd9f74",
  "order_id": "1b64848a-9026-4325-9b95-3aa1d904367f",
  "assignment_id": "74fc7313-238d-45b4-9eb9-6c95982b6d93",
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
  "arrived_at": "2026-10-30T09:44:12.497319Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2fd87f78-a8c2-4280-a1a1-42ad39dd9f74/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "19884381-79b2-4ed9-82f1-cca9f45b634f",
  "expected_version": 1
}
```

```json
{
  "id": "2fd87f78-a8c2-4280-a1a1-42ad39dd9f74",
  "order_id": "1b64848a-9026-4325-9b95-3aa1d904367f",
  "assignment_id": "74fc7313-238d-45b4-9eb9-6c95982b6d93",
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
  "arrived_at": "2026-10-30T09:44:12.497319Z",
  "started_at": "2026-10-30T09:44:12.741594Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2fd87f78-a8c2-4280-a1a1-42ad39dd9f74/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "b8ef437c-6b58-4a9a-9d5c-324376f7b9a7",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:44:13Z",
  "cash_received": true
}
```

```json
{
  "id": "2fd87f78-a8c2-4280-a1a1-42ad39dd9f74",
  "order_id": "1b64848a-9026-4325-9b95-3aa1d904367f",
  "assignment_id": "74fc7313-238d-45b4-9eb9-6c95982b6d93",
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
  "arrived_at": "2026-10-30T09:44:12.497319Z",
  "started_at": "2026-10-30T09:44:12.741594Z",
  "completed_at": "2026-10-30T09:44:13.0299Z",
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
  "session_id": "0992d1bc-6523-403a-8355-dd2afc1c9094",
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
  "last_heartbeat_at": "2026-10-30T09:44:12.243872Z",
  "last_location_at": "2026-10-30T09:44:12.243872Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0992d1bc-6523-403a-8355-dd2afc1c9094/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "b27dcacc-5910-4c18-b2f5-e04774972759",
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
  "command_id": "10559c0e-1ab6-4c52-a53a-1673ada15b59",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:44:13Z",
    "sequence": 1793353453732
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
  "correlation_id": "dc7f11e2-392f-450d-b3e0-ec05ff2bac50",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "76e1d9c1-c1b9-4d7e-8b84-00e450178a6c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:44:13Z",
    "sequence": 1793353453969
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8fa1449f-5663-4641-a645-e0c9ff976f4c",
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
  "last_heartbeat_at": "2026-10-30T09:44:13.98637Z",
  "last_location_at": "2026-10-30T09:44:13.98637Z",
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
  "changed_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T09:44:11.509881Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "c6dbd67c-4503-4bce-bc04-f55c29eae0ee",
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
  "changed_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T09:44:14.451883136Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8fa1449f-5663-4641-a645-e0c9ff976f4c",
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
  "last_heartbeat_at": "2026-10-30T09:44:13.98637Z",
  "last_location_at": "2026-10-30T09:44:13.98637Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8fa1449f-5663-4641-a645-e0c9ff976f4c/close` → **200**

```json
{
  "command_id": "97167094-c076-494a-a3ca-37390fd2d3a3",
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
  "session_id": "1204471f-b002-4ac8-b234-623a5e3d475b",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQzNTUsImlhdCI6MTc5MzM1MzQ1NSwianRpIjoiZGM3OGI0YWQtMGI3YS00MjAxLWFhMzctNjg0ODczNzYxY2IwIiwic2lkIjoiMTIwNDQ3MWYtYjAwMi00YWM4LWIyMzQtNjIzYTVlM2Q0NzViIn0.lC76i7B9jBQjUy5NRqaGv8UdtvRXw88YNz-0Gx86kwM",
  "access_expires_at": "2026-10-30T09:59:15.413192586Z",
  "refresh_token": "6Bxu2CCdfgRwPYWag_aFE-kc1oxHAxkSpPV0lIZIdqI",
  "refresh_expires_at": "2026-10-30T21:44:15.412531084Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "7ac559b1-f2de-49c5-939f-21893e815679",
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
  "id": "2847f6a9-6dff-4013-a3d5-bc40da7815ad",
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
  "created_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
  "created_at": "2026-10-30T09:44:15.645648Z",
  "updated_at": "2026-10-30T09:44:15.645648Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630199630",
  "device_ref": "sandbox-14988"
}
```

```json
{
  "challenge_id": "8cb10146-1e25-411b-a349-926d54ea6a5f",
  "expires_at": "2026-10-30T09:49:15.878316332Z",
  "resend_available_at": "2026-10-30T09:44:16.878316332Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630199630` → **200**

```json
{
  "phone": "+380630199630",
  "audience": "CLIENT",
  "code": "216500",
  "sent_at": "2026-10-30T09:44:15.88220188Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8cb10146-1e25-411b-a349-926d54ea6a5f",
  "code": "216500",
  "device_ref": "sandbox-14988"
}
```

```json
{
  "session_id": "10409838-d0d2-4821-bccf-e698e4e2ac15",
  "subject": {
    "type": "CLIENT",
    "id": "9c07b72d-e1bd-4185-87c3-9b3378b2ffce"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YzA3YjcyZC1lMWJkLTQxODUtODdjMy05YjMzNzhiMmZmY2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0MzU2LCJpYXQiOjE3OTMzNTM0NTYsImp0aSI6IjE4OWNhMzA1LTZhOGQtNGE1Ny05YjU1LTQ1YmRhNzczMjgzNCIsInNpZCI6IjEwNDA5ODM4LWQwZDItNDgyMS1iY2NmLWU2OThlNGUyYWMxNSJ9.vv4HdHnUZ8Sj0HMNQxzWBNx2_kUA_SkvETQZZ5Xs0G4",
  "access_expires_at": "2026-10-30T09:59:16.121247214Z",
  "refresh_token": "KhJWoF8P9o1EmvribQx8Ojh8TRP4AAnYbnnpPZ9EREk",
  "refresh_expires_at": "2026-11-29T09:44:16.120397184Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380630199630` → **200**

```json
{
  "client_id": "9c07b72d-e1bd-4185-87c3-9b3378b2ffce"
}
```

`POST /api/admin/v1/rider-wallets/9c07b72d-e1bd-4185-87c3-9b3378b2ffce/top-ups` → **201**

```json
{
  "command_id": "4ba5aea1-be95-4f3b-a5d8-413795d45ef3",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "9c07b72d-e1bd-4185-87c3-9b3378b2ffce",
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
      "id": "66e2b036-45b4-45c7-90f0-51423eb0d160",
      "at": "2026-10-30T09:44:16.576679Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "83a7d0c1-948b-43c8-a91a-ad701b1760d3",
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
  "id": "79e5086e-c6bf-4ace-b3be-bfb7edcb3ec2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:49:16.829594Z",
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
      "id": "2847f6a9-6dff-4013-a3d5-bc40da7815ad",
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
  "device_ref": "sandbox-26924"
}
```

```json
{
  "challenge_id": "9a0b88c8-9f32-46d2-af31-4f202dfa8d75",
  "expires_at": "2026-10-30T09:49:17.062181631Z",
  "resend_available_at": "2026-10-30T09:44:18.062181631Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "459770",
  "sent_at": "2026-10-30T09:44:17.066389185Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9a0b88c8-9f32-46d2-af31-4f202dfa8d75",
  "code": "459770",
  "device_ref": "sandbox-26924"
}
```

```json
{
  "session_id": "b577d663-4757-4adb-9682-bb5bba247c5a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDM1NywiaWF0IjoxNzkzMzUzNDU3LCJqdGkiOiI3NTI0MDcwNS01Mzc2LTRjNWUtODJmMy0wZTRkOTZlNjQzNTMiLCJzaWQiOiJiNTc3ZDY2My00NzU3LTRhZGItOTY4Mi1iYjViYmEyNDdjNWEifQ.Xso4tVxYf4tgu1DJziYJ1LsDvW5yiZK2VKUIA8u24yg",
  "access_expires_at": "2026-10-30T09:59:17.306212363Z",
  "refresh_token": "7JKvjK_uN5KqSHGWbul53-zVne-qdbj5LsC5abNkQAA",
  "refresh_expires_at": "2026-11-29T09:44:17.305517101Z",
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
  "command_id": "22390afc-ef1b-47b9-999b-dfcb4e005ae6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:44:17Z",
    "sequence": 1793353457758
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e1fab9de-294f-4a3b-b765-31d1a94702d4",
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
  "last_heartbeat_at": "2026-10-30T09:44:17.775459Z",
  "last_location_at": "2026-10-30T09:44:17.775459Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "30a7cf33-57ca-418a-a3ef-5e37d9172ed6",
  "quote_id": "79e5086e-c6bf-4ace-b3be-bfb7edcb3ec2",
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
  "id": "26463439-283b-496c-b67e-9d589d520439",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c07b72d-e1bd-4185-87c3-9b3378b2ffce",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:44:18.023514Z",
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
  "client_id": "9c07b72d-e1bd-4185-87c3-9b3378b2ffce",
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
      "id": "66e2b036-45b4-45c7-90f0-51423eb0d160",
      "at": "2026-10-30T09:44:16.576679Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
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
    "id": "d09875ed-dde8-4628-bae7-f2267f3130b7",
    "order_id": "26463439-283b-496c-b67e-9d589d520439",
    "expires_at": "2026-10-30T09:44:33.03211Z",
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

`POST /api/driver/v1/offers/d09875ed-dde8-4628-bae7-f2267f3130b7/accept` → **200**

```json
{
  "command_id": "e99ccdb0-d57b-4228-8b71-0745d86ed16b"
}
```

```json
{
  "id": "ff474ee9-2639-4696-b3ed-3f6bdaa1361b",
  "order_id": "26463439-283b-496c-b67e-9d589d520439",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0936c4c7-04ba-4fdd-9985-966d81d3836b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0936c4c7-04ba-4fdd-9985-966d81d3836b",
  "order_id": "26463439-283b-496c-b67e-9d589d520439",
  "assignment_id": "ff474ee9-2639-4696-b3ed-3f6bdaa1361b",
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

`POST /api/driver/v1/work-sessions/e1fab9de-294f-4a3b-b765-31d1a94702d4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:44:21Z",
    "sequence": 1793353461204
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e1fab9de-294f-4a3b-b765-31d1a94702d4",
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
  "last_heartbeat_at": "2026-10-30T09:44:21.221069Z",
  "last_location_at": "2026-10-30T09:44:21.221069Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/0936c4c7-04ba-4fdd-9985-966d81d3836b/arrive` → **200**

```json
{
  "command_id": "930e4168-1eea-43d3-b440-5cf2b133c4be",
  "expected_version": 0
}
```

```json
{
  "id": "0936c4c7-04ba-4fdd-9985-966d81d3836b",
  "order_id": "26463439-283b-496c-b67e-9d589d520439",
  "assignment_id": "ff474ee9-2639-4696-b3ed-3f6bdaa1361b",
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
  "arrived_at": "2026-10-30T09:44:21.451378Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0936c4c7-04ba-4fdd-9985-966d81d3836b/start` → **200**

```json
{
  "command_id": "b46e91b1-1b15-4b4b-b7bc-16397e0b3c2d",
  "expected_version": 1
}
```

```json
{
  "id": "0936c4c7-04ba-4fdd-9985-966d81d3836b",
  "order_id": "26463439-283b-496c-b67e-9d589d520439",
  "assignment_id": "ff474ee9-2639-4696-b3ed-3f6bdaa1361b",
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
  "arrived_at": "2026-10-30T09:44:21.451378Z",
  "started_at": "2026-10-30T09:44:21.692955Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/0936c4c7-04ba-4fdd-9985-966d81d3836b/complete` → **200**

```json
{
  "command_id": "f0153033-14a4-4271-ba17-3d210cf446b5",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:44:21Z",
  "cash_received": true
}
```

```json
{
  "id": "0936c4c7-04ba-4fdd-9985-966d81d3836b",
  "order_id": "26463439-283b-496c-b67e-9d589d520439",
  "assignment_id": "ff474ee9-2639-4696-b3ed-3f6bdaa1361b",
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
  "arrived_at": "2026-10-30T09:44:21.451378Z",
  "started_at": "2026-10-30T09:44:21.692955Z",
  "completed_at": "2026-10-30T09:44:21.944896Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "9c07b72d-e1bd-4185-87c3-9b3378b2ffce",
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
      "id": "0d6d7692-5101-4705-ba04-f99f4e3f11b6",
      "at": "2026-10-30T09:44:22.388243Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "26463439-283b-496c-b67e-9d589d520439"
    },
    {
      "id": "66e2b036-45b4-45c7-90f0-51423eb0d160",
      "at": "2026-10-30T09:44:16.576679Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/2847f6a9-6dff-4013-a3d5-bc40da7815ad/archive` → **200**

```json
{
  "command_id": "50862aea-82bb-48e2-91d8-49dfec91067e",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "2847f6a9-6dff-4013-a3d5-bc40da7815ad",
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
  "created_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
  "created_at": "2026-10-30T09:44:15.645648Z",
  "updated_at": "2026-10-30T09:44:25.427466Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e1fab9de-294f-4a3b-b765-31d1a94702d4",
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
  "last_heartbeat_at": "2026-10-30T09:44:21.221069Z",
  "last_location_at": "2026-10-30T09:44:21.221069Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e1fab9de-294f-4a3b-b765-31d1a94702d4/close` → **200**

```json
{
  "command_id": "7f78e586-1c12-4829-8568-028cc5395649",
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

Done: order 26463439-283b-496c-b67e-9d589d520439.

# Scenario: broadcast-abuse

## Anna goes online in Warsaw

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-7069"
}
```

```json
{
  "challenge_id": "0409b264-3199-4859-bb74-d1d475d15896",
  "expires_at": "2026-10-30T09:49:26.109635552Z",
  "resend_available_at": "2026-10-30T09:44:27.109635552Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "225150",
  "sent_at": "2026-10-30T09:44:26.114185562Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0409b264-3199-4859-bb74-d1d475d15896",
  "code": "225150",
  "device_ref": "sandbox-7069"
}
```

```json
{
  "session_id": "397d06de-4f25-4703-9cec-a601a8e13168",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDM2NiwiaWF0IjoxNzkzMzUzNDY2LCJqdGkiOiI1N2MwMDdiZC0yODY3LTQ1YmUtOGQ1YS1kOTA5ODQ5OWRkYTIiLCJzaWQiOiIzOTdkMDZkZS00ZjI1LTQ3MDMtOWNlYy1hNjAxYThlMTMxNjgifQ.ISg0uuSQH1WuvK_W0WLNKjhdDxV97FR9ryQaLJ97qrU",
  "access_expires_at": "2026-10-30T09:59:26.361558475Z",
  "refresh_token": "EvvNviLUPKaMc3krh0YTpp4-GjO5oxh-zFbRCR4CeP4",
  "refresh_expires_at": "2026-11-29T09:44:26.360874532Z",
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
  "command_id": "0c0c33e5-de74-45c0-99c2-02719f8a21b5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:44:27Z",
    "sequence": 1793353467334
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "5fb1fbbf-1ad8-4e37-9b2a-48a5db8841ec",
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
  "last_heartbeat_at": "2026-10-30T09:44:27.051136Z",
  "last_location_at": "2026-10-30T09:44:27.051136Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## 5 seconds later her phone reports Lviv: not taken as her position

`POST /api/driver/v1/work-sessions/5fb1fbbf-1ad8-4e37-9b2a-48a5db8841ec/heartbeat` → **200**

```json
{
  "location": {
    "lat": 49.8397,
    "lon": 24.0297,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:44:32Z",
    "sequence": 1793353472277
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "5fb1fbbf-1ad8-4e37-9b2a-48a5db8841ec",
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
  "last_heartbeat_at": "2026-10-30T09:44:32.299393Z",
  "last_location_at": "2026-10-30T09:44:27.051136Z",
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
  "session_id": "8a5b12a1-197f-461d-893d-29eeada79aa5",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQzNzIsImlhdCI6MTc5MzM1MzQ3MiwianRpIjoiMDM5MThjM2QtMzJjOC00MDUyLWIyMzAtOTMxMDg1MjRjMTllIiwic2lkIjoiOGE1YjEyYTEtMTk3Zi00NjFkLTg5M2QtMjllZWFkYTc5YWE1In0.21W2f9OnUfpUjCkSk3F6gR3ouOBfEqe3Gvp2sW8tvlE",
  "access_expires_at": "2026-10-30T09:59:32.806678189Z",
  "refresh_token": "2aAfGCJGKwWx1Fj3Q47ERQmcuyWQThY3HkkYVpN5GGI",
  "refresh_expires_at": "2026-10-30T21:44:32.806217733Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "at": "2026-10-30T09:44:33.04784975Z",
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
      "last_location_at": "2026-10-30T09:44:27.051136Z",
      "order_id": null
    }
  ]
}
```

## A fix next to the last accepted one is taken again

`POST /api/driver/v1/work-sessions/5fb1fbbf-1ad8-4e37-9b2a-48a5db8841ec/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2299,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:44:33Z",
    "sequence": 1793353473286
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "5fb1fbbf-1ad8-4e37-9b2a-48a5db8841ec",
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
  "last_heartbeat_at": "2026-10-30T09:44:33.301801Z",
  "last_location_at": "2026-10-30T09:44:33.301801Z",
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
  "session_id": "5fb1fbbf-1ad8-4e37-9b2a-48a5db8841ec",
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
  "last_heartbeat_at": "2026-10-30T09:44:33.301801Z",
  "last_location_at": "2026-10-30T09:44:33.301801Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5fb1fbbf-1ad8-4e37-9b2a-48a5db8841ec/close` → **200**

```json
{
  "command_id": "23b262d1-63f4-43cf-93cb-9ffd769bd292",
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
  "device_ref": "sandbox-25157"
}
```

```json
{
  "challenge_id": "ff55c5a5-e468-4b2a-8ff6-3815fa2f9033",
  "expires_at": "2026-10-30T09:49:33.99233625Z",
  "resend_available_at": "2026-10-30T09:44:34.99233625Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "332439",
  "sent_at": "2026-10-30T09:44:33.996031667Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ff55c5a5-e468-4b2a-8ff6-3815fa2f9033",
  "code": "332439",
  "device_ref": "sandbox-25157"
}
```

```json
{
  "session_id": "9cfd70e7-efc7-4447-a12d-1a6995ce6007",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDM3NCwiaWF0IjoxNzkzMzUzNDc0LCJqdGkiOiIwZmE0MTJiNC1hZmYzLTQxOTQtYWJlNi1mYTBjZTg3ZjU0NTYiLCJzaWQiOiI5Y2ZkNzBlNy1lZmM3LTQ0NDctYTEyZC0xYTY5OTVjZTYwMDcifQ.9yFXOGGEQumEZH_MXyzN-YYOQ4q9zPfNvN0T-Q-jJOQ",
  "access_expires_at": "2026-10-30T09:59:34.234612825Z",
  "refresh_token": "KEHt1fayYTMmvMyiwRyOisy8-RP4c7ZRSIPDMkqcHiI",
  "refresh_expires_at": "2026-11-29T09:44:34.233909472Z",
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
  "device_ref": "sandbox-24067"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "f7896bf2-3b75-4592-9784-1f7ef085db9c",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-24067"
}
```

```json
{
  "challenge_id": "a4b0d02e-4674-44d2-849c-2decf9f9545c",
  "expires_at": "2026-10-30T09:49:35.897530421Z",
  "resend_available_at": "2026-10-30T09:44:36.897530421Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "829705",
  "sent_at": "2026-10-30T09:44:35.901427073Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a4b0d02e-4674-44d2-849c-2decf9f9545c",
  "code": "829705",
  "device_ref": "sandbox-24067"
}
```

```json
{
  "session_id": "1dd9e465-ba4c-47de-979c-1a84a6e85695",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDM3NiwiaWF0IjoxNzkzMzUzNDc2LCJqdGkiOiI2NWQxZDFkMy0wMDZhLTQxMTUtOTZmNi05NTc0ZDRkZGJkMGMiLCJzaWQiOiIxZGQ5ZTQ2NS1iYTRjLTQ3ZGUtOTc5Yy0xYTg0YTZlODU2OTUifQ.2M--zXwigWSNY0b7iHs4bYf9iv5zgH8pj7P6xZ0fBgg",
  "access_expires_at": "2026-10-30T09:59:36.145369847Z",
  "refresh_token": "kZwxY6L_GqT9e55LgNTWcvw1XNyht0qEaChnUh0aFpU",
  "refresh_expires_at": "2026-11-29T09:44:36.14475299Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-26721"
}
```

```json
{
  "challenge_id": "3b344ef1-f435-41ac-8a85-f5a392e090ee",
  "expires_at": "2026-10-30T09:49:36.361810322Z",
  "resend_available_at": "2026-10-30T09:44:37.361810322Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "760797",
  "sent_at": "2026-10-30T09:44:36.365215784Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3b344ef1-f435-41ac-8a85-f5a392e090ee",
  "code": "760797",
  "device_ref": "sandbox-26721"
}
```

```json
{
  "session_id": "ef77d59c-6668-4101-9ddb-278d7f32bc2c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDM3NiwiaWF0IjoxNzkzMzUzNDc2LCJqdGkiOiJjMWZlZjJlNy1jODA1LTQyODItYmFhNC04YzdiNDYyYmUxMWIiLCJzaWQiOiJlZjc3ZDU5Yy02NjY4LTQxMDEtOWRkYi0yNzhkN2YzMmJjMmMifQ.AhdLWCkNHQW5oV5klv4G7bBepf4O7cHFBapxQVFg9AM",
  "access_expires_at": "2026-10-30T09:59:36.600832183Z",
  "refresh_token": "aTPVsR7n-8I9idpo3gCe6z2Hj9HIfmdZ-A-u2dtw5gQ",
  "refresh_expires_at": "2026-11-29T09:44:36.600225373Z",
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

(the car drives 184 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "85223bef-3899-4430-b192-0180471fae1c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:47:41Z",
    "sequence": 1793353661270
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "2c2815cd-9faf-4324-b775-0aca407c440e",
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
  "last_heartbeat_at": "2026-10-30T09:47:41.287945Z",
  "last_location_at": "2026-10-30T09:47:41.287945Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600816654",
  "device_ref": "sandbox-19381"
}
```

```json
{
  "challenge_id": "76611099-76b5-4409-b150-f50dcd50b2fa",
  "expires_at": "2026-10-30T09:52:41.526925774Z",
  "resend_available_at": "2026-10-30T09:47:42.526925774Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600816654` → **200**

```json
{
  "phone": "+48600816654",
  "audience": "CLIENT",
  "code": "664162",
  "sent_at": "2026-10-30T09:47:41.529911775Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "76611099-76b5-4409-b150-f50dcd50b2fa",
  "code": "664162",
  "device_ref": "sandbox-19381"
}
```

```json
{
  "session_id": "92db22e8-aed2-433e-86ae-80588a5eec4a",
  "subject": {
    "type": "CLIENT",
    "id": "8b47953f-79b2-4fc2-b8fd-e27a1b2b9282"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YjQ3OTUzZi03OWIyLTRmYzItYjhmZC1lMjdhMWIyYjkyODIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NTYxLCJpYXQiOjE3OTMzNTM2NjEsImp0aSI6ImM5ZGNhOThmLTNmZTItNDEwNy04MjkyLWJkM2Q3N2EwNWVkMyIsInNpZCI6IjkyZGIyMmU4LWFlZDItNDMzZS04NmFlLTgwNTg4YTVlZWM0YSJ9.dy64Pp6mJrwLrvaIW3d5bS4RIBEqf2Mw2fsl4r6IxLw",
  "access_expires_at": "2026-10-30T10:02:41.778899624Z",
  "refresh_token": "j6vRwVpgzXIw9bZvDa6MpsTeAFMBkXFxOebSM6nYoKQ",
  "refresh_expires_at": "2026-11-29T09:47:41.778363877Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "259a2248-d15b-4a2f-8b84-e7fce3cdd0d7",
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
  "id": "d0902848-763b-45dd-a166-85d9ab2088e7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:52:42.013737Z",
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
  "command_id": "42bb37fa-9356-4b8c-a4f0-f69860576b2e",
  "quote_id": "d0902848-763b-45dd-a166-85d9ab2088e7",
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
  "id": "1c9648ce-2f48-4086-bd8f-f6d1b4d7ba6c",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b47953f-79b2-4fc2-b8fd-e27a1b2b9282",
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
  "created_at": "2026-10-30T09:47:42.258147Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1c9648ce-2f48-4086-bd8f-f6d1b4d7ba6c` → **200**

```json
{
  "id": "1c9648ce-2f48-4086-bd8f-f6d1b4d7ba6c",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b47953f-79b2-4fc2-b8fd-e27a1b2b9282",
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
  "created_at": "2026-10-30T09:47:42.258147Z",
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

`POST /api/driver/v1/orders/1c9648ce-2f48-4086-bd8f-f6d1b4d7ba6c/claim` → **422**

```json
{
  "command_id": "128e6a14-c29c-4e1a-8b72-3620d4d1c2fd"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1c9648ce-2f48-4086-bd8f-f6d1b4d7ba6c/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "d6cbe07b-8dd0-4fbd-b277-f11881729da6"
}
```

`GET /api/rider/v1/orders/1c9648ce-2f48-4086-bd8f-f6d1b4d7ba6c` → **200**

```json
{
  "id": "1c9648ce-2f48-4086-bd8f-f6d1b4d7ba6c",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b47953f-79b2-4fc2-b8fd-e27a1b2b9282",
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
  "created_at": "2026-10-30T09:47:42.258147Z",
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

`POST /api/driver/v1/orders/fef60e5e-4844-43af-b8cc-892431e4f20f/claim` → **404**

```json
{
  "command_id": "689c4ea1-fb1f-414b-b515-b3badc71f37e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/fef60e5e-4844-43af-b8cc-892431e4f20f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3371e150-672c-44ae-b4ca-2d03d9153a03"
}
```

`POST /api/driver/v1/orders/e22f440b-c37b-4e91-8dc0-c7685e161392/claim` → **404**

```json
{
  "command_id": "69bef493-f39a-43e6-a6d2-ceeaa6ddfb50"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e22f440b-c37b-4e91-8dc0-c7685e161392/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7eca9a2c-6a3d-4acb-8d84-5da7380c466d"
}
```

`POST /api/driver/v1/orders/35062f09-ce96-479d-8998-a4094a4435d1/claim` → **404**

```json
{
  "command_id": "dac7dab9-eff1-460c-9439-0c9a56383dae"
}
```

```json
{
  "instance": "/api/driver/v1/orders/35062f09-ce96-479d-8998-a4094a4435d1/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5e7f6bbd-4ab6-4be7-9b8b-7e5a5c533f5d"
}
```

`POST /api/driver/v1/orders/06cd15f9-542c-46f1-87ac-e4da02be28fb/claim` → **404**

```json
{
  "command_id": "8bd2e122-18e6-4b84-b5ee-75e1c742b27f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/06cd15f9-542c-46f1-87ac-e4da02be28fb/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d697f461-cdb1-4092-8e1a-059fafd7f049"
}
```

`POST /api/driver/v1/orders/e6efc08f-1040-472d-9615-b1de7bff5d00/claim` → **404**

```json
{
  "command_id": "6c7b2f60-b30f-484b-a2de-486f5ac5d3ad"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e6efc08f-1040-472d-9615-b1de7bff5d00/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7b9b30c5-db45-4360-b666-e46fe99691ac"
}
```

`POST /api/driver/v1/orders/ac3d7cd5-661d-41d6-888c-7b20f7257e86/claim` → **404**

```json
{
  "command_id": "6643c8e7-dcee-41f3-abfa-351b148e64d8"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ac3d7cd5-661d-41d6-888c-7b20f7257e86/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "592aacba-a7f7-49e2-a175-bf984e654ae5"
}
```

`POST /api/driver/v1/orders/c43fa3e6-29d3-4e4b-8134-f1293c2608c7/claim` → **404**

```json
{
  "command_id": "74b4a088-9473-4758-bb91-ab1175b77a22"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c43fa3e6-29d3-4e4b-8134-f1293c2608c7/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5651ba50-b558-4baa-aa73-653acf405067"
}
```

`POST /api/driver/v1/orders/0288ff33-53ba-4fe9-ae05-d93fa2e4f32d/claim` → **404**

```json
{
  "command_id": "184aeb3b-e292-4d31-93e2-719acff745c8"
}
```

```json
{
  "instance": "/api/driver/v1/orders/0288ff33-53ba-4fe9-ae05-d93fa2e4f32d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "26e38fab-57ec-4fe9-b62b-813739f6e654"
}
```

`POST /api/driver/v1/orders/7633fc86-9e25-4f47-bba8-e2af130d6f11/claim` → **404**

```json
{
  "command_id": "17edb50b-8617-43f8-8617-5dea657a0ede"
}
```

```json
{
  "instance": "/api/driver/v1/orders/7633fc86-9e25-4f47-bba8-e2af130d6f11/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "74e06a9a-9f02-49bd-8c57-218d93f55506"
}
```

`POST /api/driver/v1/orders/e8c5ca6f-486a-4348-9bee-dc1ef7a3c822/claim` → **404**

```json
{
  "command_id": "f4739cce-aa71-4060-9905-507c91b4d099"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e8c5ca6f-486a-4348-9bee-dc1ef7a3c822/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6ca922a6-cdf9-44ba-ba9b-6569441bb1c7"
}
```

`POST /api/driver/v1/orders/17898130-7a1f-496a-a26b-9bc84465140e/claim` → **404**

```json
{
  "command_id": "ea222c9e-b3b3-49ce-bd9f-915d4e887255"
}
```

```json
{
  "instance": "/api/driver/v1/orders/17898130-7a1f-496a-a26b-9bc84465140e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c36a8da0-3599-4ff0-a4ed-e121b3a85cf4"
}
```

`POST /api/driver/v1/orders/b083ad77-058d-45a7-9673-ea3a33906403/claim` → **404**

```json
{
  "command_id": "49ef9ff7-4f5c-4fe9-b6e3-aad7a40208ca"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b083ad77-058d-45a7-9673-ea3a33906403/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5eafd43d-6078-44c7-b932-92d1f8a4f5b8"
}
```

`POST /api/driver/v1/orders/4fc8f416-fa38-48b3-85c9-220c9e7dba68/claim` → **404**

```json
{
  "command_id": "df06fa9b-4db9-488d-b5b4-39d6a0f14188"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4fc8f416-fa38-48b3-85c9-220c9e7dba68/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "580bea9b-1635-4b21-a236-11c1deda6b93"
}
```

`POST /api/driver/v1/orders/cf5cdd96-fa9b-49bd-b700-3a5eba9a1985/claim` → **404**

```json
{
  "command_id": "e8e188c6-e87c-4ec4-a610-9cbc2e344431"
}
```

```json
{
  "instance": "/api/driver/v1/orders/cf5cdd96-fa9b-49bd-b700-3a5eba9a1985/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c451c346-2eab-494a-abc8-cfd1c0238684"
}
```

`POST /api/driver/v1/orders/4c1d0657-dc4a-4c62-a8a1-274c4d2cea39/claim` → **404**

```json
{
  "command_id": "dc1b08f8-a469-488d-9d4f-0fce08f8f0de"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4c1d0657-dc4a-4c62-a8a1-274c4d2cea39/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1916bd0d-c0e8-4d80-8564-e962480f77ff"
}
```

`POST /api/driver/v1/orders/94359efd-351e-4e45-a545-163e38499e2d/claim` → **404**

```json
{
  "command_id": "c2a5d744-9b99-4f80-9cef-e072007a93df"
}
```

```json
{
  "instance": "/api/driver/v1/orders/94359efd-351e-4e45-a545-163e38499e2d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "046a7072-7373-4b9c-b366-6ba577ceb6a0"
}
```

`POST /api/driver/v1/orders/f37e61fc-d5e0-4fe2-b629-c84cfc8373f2/claim` → **404**

```json
{
  "command_id": "4ec89d4c-b91e-446f-8f38-a28d1068ee93"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f37e61fc-d5e0-4fe2-b629-c84cfc8373f2/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "21cff20e-1d94-480a-97c8-55ec80b30e57"
}
```

`POST /api/driver/v1/orders/7be937bf-d65e-49d7-9f3d-fbc995aad3d3/claim` → **404**

```json
{
  "command_id": "98bacf6c-38b0-4867-a095-c289c68ce7b1"
}
```

```json
{
  "instance": "/api/driver/v1/orders/7be937bf-d65e-49d7-9f3d-fbc995aad3d3/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3c261052-119d-4bdb-b332-d4f4c0aa174f"
}
```

`POST /api/driver/v1/orders/38e3fc5c-8c9d-4f18-a277-e38fcdf83370/claim` → **404**

```json
{
  "command_id": "4207632c-ccc3-4711-9320-5c8f2da9ba3d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/38e3fc5c-8c9d-4f18-a277-e38fcdf83370/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d5431135-e1c9-4c2e-8f63-450a6ec8a395"
}
```

`POST /api/driver/v1/orders/7727498e-fbbc-48f2-9cdf-256d014e4d56/claim` → **404**

```json
{
  "command_id": "48121f39-0b43-47dc-b6d2-074d1103b851"
}
```

```json
{
  "instance": "/api/driver/v1/orders/7727498e-fbbc-48f2-9cdf-256d014e4d56/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6c3d3bab-61ed-44ae-89aa-24579ca854bc"
}
```

`POST /api/driver/v1/orders/29c9c309-5f92-4c75-8c2d-862524d0ec4a/claim` → **404**

```json
{
  "command_id": "bfcd6160-e31e-4c5f-b567-dfddfe838698"
}
```

```json
{
  "instance": "/api/driver/v1/orders/29c9c309-5f92-4c75-8c2d-862524d0ec4a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2778863a-3316-468f-807e-f671b33960ef"
}
```

`POST /api/driver/v1/orders/1095976f-fff0-45f9-9443-cccfca856b11/claim` → **404**

```json
{
  "command_id": "fcf67d8f-83fd-4577-9cd5-1fb8c72ba8ef"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1095976f-fff0-45f9-9443-cccfca856b11/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b6c8710c-2edb-48a2-9d0e-3647f56aef92"
}
```

`POST /api/driver/v1/orders/070d0f05-3cd8-4d49-8162-b125cce0d52a/claim` → **404**

```json
{
  "command_id": "1557189d-7f6b-43fe-9050-d4f19de523bd"
}
```

```json
{
  "instance": "/api/driver/v1/orders/070d0f05-3cd8-4d49-8162-b125cce0d52a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "66c5ba20-4b63-4e70-892f-0300ed63362c"
}
```

`POST /api/driver/v1/orders/264787d0-b33e-40d2-bbb0-3e657b2cb201/claim` → **404**

```json
{
  "command_id": "7ecb1e0c-215c-444d-9a1f-ec3711773cb6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/264787d0-b33e-40d2-bbb0-3e657b2cb201/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1ea8169a-c522-4c22-b293-7768e0c8bd55"
}
```

`POST /api/driver/v1/orders/5b06ac77-2ea9-4ede-8794-d473a884fa1d/claim` → **404**

```json
{
  "command_id": "38f6f84c-76c2-4dee-9601-c7cf3ee8a1d8"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5b06ac77-2ea9-4ede-8794-d473a884fa1d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4ad30f08-c1b9-4495-b4d9-b7c78ac550f0"
}
```

`POST /api/driver/v1/orders/c4f07356-2321-47fd-8d1b-1d4021c0eec9/claim` → **404**

```json
{
  "command_id": "ea199a4b-9aa1-4c30-8d8e-b1719d55404a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c4f07356-2321-47fd-8d1b-1d4021c0eec9/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3c59daae-7b94-40b3-8582-cd2a7f7a0db2"
}
```

`POST /api/driver/v1/orders/01c35d83-f309-4690-8058-9e01efc6880c/claim` → **404**

```json
{
  "command_id": "f52dcbd6-5b51-4625-b5e3-0f09b15407f9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/01c35d83-f309-4690-8058-9e01efc6880c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b87e6c6d-80a5-472f-b6b7-880e70896a9a"
}
```

`POST /api/driver/v1/orders/0b88a213-f846-4ec2-97e6-e25ee157a67b/claim` → **404**

```json
{
  "command_id": "32237f1c-d444-4929-8554-e812c10162f1"
}
```

```json
{
  "instance": "/api/driver/v1/orders/0b88a213-f846-4ec2-97e6-e25ee157a67b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "16b653da-8e17-4d28-8ad7-07bd19faff5e"
}
```

`POST /api/driver/v1/orders/4174afe6-fa07-44ec-ab5d-5bdb7de9f7a1/claim` → **404**

```json
{
  "command_id": "50ea0c29-d84d-4574-91cc-8a04753dc1c9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4174afe6-fa07-44ec-ab5d-5bdb7de9f7a1/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d73b3f3e-a1d0-45a0-8ef8-b726a9898e93"
}
```

`POST /api/driver/v1/orders/cc1cfc7e-f1c5-47ba-931d-0183389f075b/claim` → **429**

```json
{
  "command_id": "91642572-1c3a-4f0d-bc22-09c11c859a9f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/cc1cfc7e-f1c5-47ba-931d-0183389f075b/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "67b4b116-7e38-4463-88b0-ef7a2e5a7cf1",
  "retryable": true,
  "retry_after_seconds": 593
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
  "command_id": "e10f93da-fadd-40a5-9773-cd1d7cbf9672",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:47:50Z",
    "sequence": 1793353670869
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "25a7ca0c-3e6b-4926-88a9-a33135117be3",
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
  "last_heartbeat_at": "2026-10-30T09:47:50.885828Z",
  "last_location_at": "2026-10-30T09:47:50.885828Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "1c9648ce-2f48-4086-bd8f-f6d1b4d7ba6c",
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

`POST /api/driver/v1/orders/1c9648ce-2f48-4086-bd8f-f6d1b4d7ba6c/claim` → **409**

```json
{
  "command_id": "389e3c82-ad37-4035-ba52-d9a6cd948da5"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1c9648ce-2f48-4086-bd8f-f6d1b4d7ba6c/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3981f2f8-cedd-47c4-8731-470c1663fab7"
}
```

`POST /api/driver/v1/orders/1c9648ce-2f48-4086-bd8f-f6d1b4d7ba6c/claim` → **200**

```json
{
  "command_id": "223caeac-a363-446a-9a27-8c0e6f469913"
}
```

```json
{
  "id": "20e57683-39cf-422e-a9d2-582b98ce7c8b",
  "order_id": "1c9648ce-2f48-4086-bd8f-f6d1b4d7ba6c",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "ceb2afaa-53e6-4e38-b8cf-3a19c535a72a",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ceb2afaa-53e6-4e38-b8cf-3a19c535a72a",
  "order_id": "1c9648ce-2f48-4086-bd8f-f6d1b4d7ba6c",
  "assignment_id": "20e57683-39cf-422e-a9d2-582b98ce7c8b",
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

`POST /api/driver/v1/trips/ceb2afaa-53e6-4e38-b8cf-3a19c535a72a/cancel` → **200**

```json
{
  "command_id": "9d40204b-a0bc-49bb-82d7-e4c16a66e604",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "ceb2afaa-53e6-4e38-b8cf-3a19c535a72a",
  "order_id": "1c9648ce-2f48-4086-bd8f-f6d1b4d7ba6c",
  "assignment_id": "20e57683-39cf-422e-a9d2-582b98ce7c8b",
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

`GET /api/rider/v1/orders/1c9648ce-2f48-4086-bd8f-f6d1b4d7ba6c` → **200**

```json
{
  "id": "1c9648ce-2f48-4086-bd8f-f6d1b4d7ba6c",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "8b47953f-79b2-4fc2-b8fd-e27a1b2b9282",
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
    "id": "20e57683-39cf-422e-a9d2-582b98ce7c8b",
    "order_id": "1c9648ce-2f48-4086-bd8f-f6d1b4d7ba6c",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "ceb2afaa-53e6-4e38-b8cf-3a19c535a72a",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T09:47:42.258147Z",
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
  "session_id": "2c2815cd-9faf-4324-b775-0aca407c440e",
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
  "last_heartbeat_at": "2026-10-30T09:47:41.287945Z",
  "last_location_at": "2026-10-30T09:47:41.287945Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2c2815cd-9faf-4324-b775-0aca407c440e/close` → **200**

```json
{
  "command_id": "32faf34b-2b4f-4fe4-80dd-f3f1ba519f23",
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
  "session_id": "25a7ca0c-3e6b-4926-88a9-a33135117be3",
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
  "last_heartbeat_at": "2026-10-30T09:47:50.885828Z",
  "last_location_at": "2026-10-30T09:47:50.885828Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/25a7ca0c-3e6b-4926-88a9-a33135117be3/close` → **200**

```json
{
  "command_id": "e3ad0e47-e1b4-4656-ae7d-a04ccfe3a206",
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
  "session_id": "d8bcdbcb-8f01-4fc5-ae2c-dc6424d4fbd7",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ1NzMsImlhdCI6MTc5MzM1MzY3MywianRpIjoiZGE2ZmM0OTMtY2U1MC00Y2VlLWJmNzgtN2EwNmE4OGJlMWMxIiwic2lkIjoiZDhiY2RiY2ItOGYwMS00ZmM1LWFlMmMtZGM2NDI0ZDRmYmQ3In0.C1Abvnqr6h_KpiCKcqxtkoPABcHdrvstrs_T0nGJVYo",
  "access_expires_at": "2026-10-30T10:02:53.722283534Z",
  "refresh_token": "soGRp2MHCQ9R5B9XrgjFXe4opQsJGI5DFmxjYNvKBiQ",
  "refresh_expires_at": "2026-10-30T21:47:53.721788054Z",
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
  "command_id": "3654b19d-bcac-49f9-b26c-1be1b31cb98f",
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
  "session_id": "ca54efe5-2936-4cba-9108-ed02f2f5237e",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ1NzQsImlhdCI6MTc5MzM1MzY3NCwianRpIjoiZDBmZTlhZjUtYzYzZS00NGI4LTgyM2QtMzc4ZjhiZjIwMWFlIiwic2lkIjoiY2E1NGVmZTUtMjkzNi00Y2JhLTkxMDgtZWQwMmYyZjUyMzdlIn0.V8Kc5oy2tKSjQjwuY0OFl6o_knu-YIO0JEbbiHeqfqQ",
  "access_expires_at": "2026-10-30T10:02:54.683478588Z",
  "refresh_token": "LMaHcTqpEP5oi3jDnuyfCCUzviOD6MgwlPeoevCWFAo",
  "refresh_expires_at": "2026-10-30T21:47:54.68184741Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.305776117",
    "linkedid": "1730052700.305776117",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674339008"
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
    "id": "1730052700.305776117",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "099c26f1-117e-4e01-8ea4-9900b3403fa4",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380674339008",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T09:47:54.913326Z",
      "answered_at": null,
      "ended_at": "2026-10-30T09:47:54.933123Z",
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
    "id": "1730052600.260713052",
    "linkedid": "1730052600.260713052",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674339008"
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
      "id": "b661b8a2-1d3f-4729-85ab-f703cd735b26",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380674339008",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T09:47:55.1896Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/b661b8a2-1d3f-4729-85ab-f703cd735b26/answer` → **200**

```json
{
  "command_id": "47c269ab-092e-4a09-a643-42e7e749750e"
}
```

```json
{
  "id": "b661b8a2-1d3f-4729-85ab-f703cd735b26",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380674339008",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
  "order_ids": [],
  "started_at": "2026-10-30T09:47:55.1896Z",
  "answered_at": "2026-10-30T09:47:55.44086Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.260713052",
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
    "id": "1730052600.260713052",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "b661b8a2-1d3f-4729-85ab-f703cd735b26",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674339008",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
      "order_ids": [],
      "started_at": "2026-10-30T09:47:55.1896Z",
      "answered_at": "2026-10-30T09:47:55.44086Z",
      "ended_at": "2026-10-30T09:47:55.688533Z",
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
      "id": "b661b8a2-1d3f-4729-85ab-f703cd735b26",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674339008",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
      "order_ids": [],
      "started_at": "2026-10-30T09:47:55.1896Z",
      "answered_at": "2026-10-30T09:47:55.44086Z",
      "ended_at": "2026-10-30T09:47:55.688533Z",
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
      "id": "b661b8a2-1d3f-4729-85ab-f703cd735b26",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674339008",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
      "order_ids": [],
      "started_at": "2026-10-30T09:47:55.1896Z",
      "answered_at": "2026-10-30T09:47:55.44086Z",
      "ended_at": "2026-10-30T09:47:55.688533Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T09:47:58.106406Z"
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
      "id": "b661b8a2-1d3f-4729-85ab-f703cd735b26",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674339008",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
      "order_ids": [],
      "started_at": "2026-10-30T09:47:55.1896Z",
      "answered_at": "2026-10-30T09:47:55.44086Z",
      "ended_at": "2026-10-30T09:47:55.688533Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T09:47:58.106406Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/b661b8a2-1d3f-4729-85ab-f703cd735b26/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/b661b8a2-1d3f-4729-85ab-f703cd735b26/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=b661b8a2-1d3f-4729-85ab-f703cd735b26` → **200**

```json
{
  "changes": [
    {
      "id": "0386c146-0a5f-4d6e-b693-701d0efaa748",
      "occurred_at": "2026-10-30T09:48:00.671598Z",
      "actor_type": "STAFF",
      "actor_id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "b661b8a2-1d3f-4729-85ab-f703cd735b26",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"b599b9fd-2212-422c-ab61-488b26f591e6\", \"order_ids\": []}",
      "correlation_id": "ee4c88db-628a-4e3f-a32e-cc44810986ce"
    },
    {
      "id": "566a624f-203d-44a6-8c1f-996cc88c6d1c",
      "occurred_at": "2026-10-30T09:48:00.647055Z",
      "actor_type": "STAFF",
      "actor_id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "b661b8a2-1d3f-4729-85ab-f703cd735b26",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"b599b9fd-2212-422c-ab61-488b26f591e6\", \"order_ids\": []}",
      "correlation_id": "f8517197-dfe1-4693-8589-3c9badfab4b9"
    }
  ]
}
```

Done: call b661b8a2-1d3f-4729-85ab-f703cd735b26 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-22613"
}
```

```json
{
  "challenge_id": "dafa466b-9593-487f-aef5-abd426ba81cd",
  "expires_at": "2026-10-30T09:53:00.931793487Z",
  "resend_available_at": "2026-10-30T09:48:01.931793487Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "234011",
  "sent_at": "2026-10-30T09:48:00.935201305Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dafa466b-9593-487f-aef5-abd426ba81cd",
  "code": "234011",
  "device_ref": "sandbox-22613"
}
```

```json
{
  "session_id": "3f679929-3ffc-49d9-8a4e-9b86ed2652ac",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDU4MSwiaWF0IjoxNzkzMzUzNjgxLCJqdGkiOiJkY2ZiZjIzOC1hNmRjLTQxMzYtOGZkMS0yZDVjNzNiY2ZhMzkiLCJzaWQiOiIzZjY3OTkyOS0zZmZjLTQ5ZDktOGE0ZS05Yjg2ZWQyNjUyYWMifQ.THiK4VwCfUS-SGUXno07QfsyYFKu9yEHRWfP-1326oo",
  "access_expires_at": "2026-10-30T10:03:01.178134312Z",
  "refresh_token": "LP4-MDZLNfjmvS7R3Dkz4xn3bduOKn-eCYJ9X83oueQ",
  "refresh_expires_at": "2026-11-29T09:48:01.177703569Z",
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
  "command_id": "c7fcaf6a-10e5-4355-8e26-e9d1bde8b154",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:48:01Z",
    "sequence": 1793353681642
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ff5931e2-5f1b-4ff9-9264-03098030f7a0",
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
  "last_heartbeat_at": "2026-10-30T09:48:01.658353Z",
  "last_location_at": "2026-10-30T09:48:01.658353Z",
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
  "session_id": "5d638ea4-c350-4b6c-9c34-61f62f0b8537",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ1ODIsImlhdCI6MTc5MzM1MzY4MiwianRpIjoiN2U3MGU5MDctYzU3OS00MzNlLWFiOWItMGI3ZjI2YjkwNmI5Iiwic2lkIjoiNWQ2MzhlYTQtYzM1MC00YjZjLTljMzQtNjFmNjJmMGI4NTM3In0.zLOBCejFP5t9p7V2qfUklp5dczNn-lOHWmJNg6PThf0",
  "access_expires_at": "2026-10-30T10:03:02.155877739Z",
  "refresh_token": "xp_s7Lc2OWPRJlmyrfMN_pY8WsekELIoZV1Fb7GPhvw",
  "refresh_expires_at": "2026-10-30T21:48:02.155317633Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "81e6fe6e-9f39-43a1-9eba-62f240e4ada6",
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
  "id": "f9fbf4de-ef69-4dbf-9bcb-e3ebd8e7ccef",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:53:02.392589Z",
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
  "command_id": "13789982-7ff8-437d-ba6e-924850633d1b",
  "quote_id": "f9fbf4de-ef69-4dbf-9bcb-e3ebd8e7ccef",
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
    "phone": "+380677880627"
  }
}
```

```json
{
  "id": "659952b6-0627-4f65-91de-4fe940111d47",
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
  "created_at": "2026-10-30T09:48:02.644961Z",
  "caller": {
    "name": "Олена",
    "phone": "+380677880627"
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
    "id": "65b495cc-5f57-442f-93d6-decf3644c399",
    "order_id": "659952b6-0627-4f65-91de-4fe940111d47",
    "expires_at": "2026-10-30T09:48:17.650014Z",
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

`POST /api/driver/v1/offers/65b495cc-5f57-442f-93d6-decf3644c399/accept` → **200**

```json
{
  "command_id": "7a764d44-d163-4e76-9d34-991f3f15e6ce"
}
```

```json
{
  "id": "8e4f658b-ccf5-4e20-bb2a-7d0aeba58f9a",
  "order_id": "659952b6-0627-4f65-91de-4fe940111d47",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d64d09ca-8a6c-4457-8df2-5b9953fdefb3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380677880627` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380677880627` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380677880627` → **200**

```json
[
  {
    "phone": "+380677880627",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:48:04.70388175Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677880627` → **200**

```json
[
  {
    "phone": "+380677880627",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:48:04.70388175Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380677880627` → **200**

```json
[
  {
    "phone": "+380677880627",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:48:04.70388175Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d64d09ca-8a6c-4457-8df2-5b9953fdefb3",
  "order_id": "659952b6-0627-4f65-91de-4fe940111d47",
  "assignment_id": "8e4f658b-ccf5-4e20-bb2a-7d0aeba58f9a",
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
    "phone": "+380677880627"
  }
}
```

`POST /api/driver/v1/work-sessions/ff5931e2-5f1b-4ff9-9264-03098030f7a0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:48:05Z",
    "sequence": 1793353685699
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ff5931e2-5f1b-4ff9-9264-03098030f7a0",
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
  "last_heartbeat_at": "2026-10-30T09:48:05.714886Z",
  "last_location_at": "2026-10-30T09:48:05.714886Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/d64d09ca-8a6c-4457-8df2-5b9953fdefb3/arrive` → **200**

```json
{
  "command_id": "b90a291d-9b07-44f9-b9c1-438001f07eb7",
  "expected_version": 0
}
```

```json
{
  "id": "d64d09ca-8a6c-4457-8df2-5b9953fdefb3",
  "order_id": "659952b6-0627-4f65-91de-4fe940111d47",
  "assignment_id": "8e4f658b-ccf5-4e20-bb2a-7d0aeba58f9a",
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
  "arrived_at": "2026-10-30T09:48:05.946858Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380677880627"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380677880627` → **200**

```json
[
  {
    "phone": "+380677880627",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:48:04.70388175Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677880627` → **200**

```json
[
  {
    "phone": "+380677880627",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:48:04.70388175Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677880627` → **200**

```json
[
  {
    "phone": "+380677880627",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:48:04.70388175Z"
  },
  {
    "phone": "+380677880627",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T09:48:07.71227292Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677880627` → **200**

```json
[
  {
    "phone": "+380677880627",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:48:04.70388175Z"
  },
  {
    "phone": "+380677880627",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T09:48:07.71227292Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380677880627` → **200**

```json
[
  {
    "phone": "+380677880627",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:48:04.70388175Z"
  },
  {
    "phone": "+380677880627",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T09:48:07.71227292Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/d64d09ca-8a6c-4457-8df2-5b9953fdefb3/start` → **200**

```json
{
  "command_id": "e760d869-c40c-4383-a8ab-cf607f2c69e3",
  "expected_version": 1
}
```

```json
{
  "id": "d64d09ca-8a6c-4457-8df2-5b9953fdefb3",
  "order_id": "659952b6-0627-4f65-91de-4fe940111d47",
  "assignment_id": "8e4f658b-ccf5-4e20-bb2a-7d0aeba58f9a",
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
  "arrived_at": "2026-10-30T09:48:05.946858Z",
  "started_at": "2026-10-30T09:48:08.294754Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380677880627"
  }
}
```

`POST /api/driver/v1/trips/d64d09ca-8a6c-4457-8df2-5b9953fdefb3/complete` → **200**

```json
{
  "command_id": "9ee75c3d-a025-47d9-ac86-6931b73abf0f",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:48:08Z",
  "cash_received": true
}
```

```json
{
  "id": "d64d09ca-8a6c-4457-8df2-5b9953fdefb3",
  "order_id": "659952b6-0627-4f65-91de-4fe940111d47",
  "assignment_id": "8e4f658b-ccf5-4e20-bb2a-7d0aeba58f9a",
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
  "arrived_at": "2026-10-30T09:48:05.946858Z",
  "started_at": "2026-10-30T09:48:08.294754Z",
  "completed_at": "2026-10-30T09:48:08.53501Z",
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
  "session_id": "ff5931e2-5f1b-4ff9-9264-03098030f7a0",
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
  "last_heartbeat_at": "2026-10-30T09:48:05.714886Z",
  "last_location_at": "2026-10-30T09:48:05.714886Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ff5931e2-5f1b-4ff9-9264-03098030f7a0/close` → **200**

```json
{
  "command_id": "bff0f6cf-125a-4bf4-ad8c-dbbc10ba4ddf",
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
  "phone": "+380631150686",
  "device_ref": "sandbox-13201"
}
```

```json
{
  "challenge_id": "c23915be-6816-43b6-a4c1-b4edbd8b8e1e",
  "expires_at": "2026-10-30T09:53:09.234749229Z",
  "resend_available_at": "2026-10-30T09:48:10.234749229Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631150686` → **200**

```json
{
  "phone": "+380631150686",
  "audience": "CLIENT",
  "code": "290847",
  "sent_at": "2026-10-30T09:48:09.240356716Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c23915be-6816-43b6-a4c1-b4edbd8b8e1e",
  "code": "290847",
  "device_ref": "sandbox-13201"
}
```

```json
{
  "session_id": "b49b1c0d-5d10-401a-af4f-8f45cc1f2832",
  "subject": {
    "type": "CLIENT",
    "id": "a5e0d320-f791-4193-84ed-500531d4fab4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNWUwZDMyMC1mNzkxLTQxOTMtODRlZC01MDA1MzFkNGZhYjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NTg5LCJpYXQiOjE3OTMzNTM2ODksImp0aSI6IjQyMTM0MGZiLWUzZjktNDQ4MC1iOTYyLTA3MTE5OWI5YjE5YSIsInNpZCI6ImI0OWIxYzBkLTVkMTAtNDAxYS1hZjRmLThmNDVjYzFmMjgzMiJ9.qU7Si90TdB9TSSpqWSjpknDs2ShVn5x-E-iYa5HRzYo",
  "access_expires_at": "2026-10-30T10:03:09.487717926Z",
  "refresh_token": "0a-esgxX_auM3jFV47CilWcaGZsIKYj9niZd1lbugz4",
  "refresh_expires_at": "2026-11-29T09:48:09.487296218Z",
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
  "device_ref": "sandbox-29662"
}
```

```json
{
  "challenge_id": "83056d9b-5a40-46cf-b2c4-8f00ebc0a669",
  "expires_at": "2026-10-30T09:53:09.926699479Z",
  "resend_available_at": "2026-10-30T09:48:10.926699479Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "355663",
  "sent_at": "2026-10-30T09:48:09.929451209Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "83056d9b-5a40-46cf-b2c4-8f00ebc0a669",
  "code": "355663",
  "device_ref": "sandbox-29662"
}
```

```json
{
  "session_id": "061c8c01-bd21-436e-8820-468c452aad11",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDU5MCwiaWF0IjoxNzkzMzUzNjkwLCJqdGkiOiJlMWY2ZWJiMC0wODg0LTQzMjAtYTk0YS0wNjAyNGU5MWU3MGMiLCJzaWQiOiIwNjFjOGMwMS1iZDIxLTQzNmUtODgyMC00NjhjNDUyYWFkMTEifQ.ZxkdP_S4sPd6HxaJws3FuwWg6cvq-eyz41oxQ6gtvig",
  "access_expires_at": "2026-10-30T10:03:10.176659323Z",
  "refresh_token": "6XtWDOM2545C8ZLPfmbo5XZPwnao5LC7ngIaTvq59b0",
  "refresh_expires_at": "2026-11-29T09:48:10.176211573Z",
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
  "session_id": "6e077615-efb4-46dd-8bd3-a6c7757cf39e",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ1OTAsImlhdCI6MTc5MzM1MzY5MCwianRpIjoiZWNjNDE3NjEtYjI3My00ZDdmLWI4N2UtNzQ1MjU2MTU2M2ZiIiwic2lkIjoiNmUwNzc2MTUtZWZiNC00NmRkLThiZDMtYTZjNzc1N2NmMzllIn0.QcibE5Oh5yXkOFU9mCWMu378zR605Rsm7aWwXviJUmQ",
  "access_expires_at": "2026-10-30T10:03:10.885110403Z",
  "refresh_token": "CJ8FGzUHY88k3tgc6BGG4yRguFZwCmX6V7bqDgxxF34",
  "refresh_expires_at": "2026-10-30T21:48:10.884542685Z",
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
  "session_id": "379d9709-73ff-430e-8e4a-0b4d9eaff4f9",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ1OTEsImlhdCI6MTc5MzM1MzY5MSwianRpIjoiOTBkNGNiZmUtZjg0ZS00MzA4LTg0NDYtMjI0YjdlYTE3MjgzIiwic2lkIjoiMzc5ZDk3MDktNzNmZi00MzBlLThlNGEtMGI0ZDllYWZmNGY5In0.jpK0REvbncbOGSgzI96NpCfX8yyLa3A4qepAaDq--_k",
  "access_expires_at": "2026-10-30T10:03:11.373619337Z",
  "refresh_token": "L6x2M2Z3JZcWFazU22VoWbDeVUunWatkjQie1dnzaJw",
  "refresh_expires_at": "2026-10-30T21:48:11.373150814Z",
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
  "command_id": "1542fe02-8226-40a6-b734-84494d027716",
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
  "id": "981206b8-38a1-4309-9258-1e6638e33d0f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:53:11.828853Z",
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
  "command_id": "3a1ff966-fe78-48cc-8497-0e921b88e424",
  "quote_id": "981206b8-38a1-4309-9258-1e6638e33d0f",
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
  "id": "dbcde499-c985-40a9-9b38-436f936c5c54",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a5e0d320-f791-4193-84ed-500531d4fab4",
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
  "created_at": "2026-10-30T09:48:12.074862Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dbcde499-c985-40a9-9b38-436f936c5c54` → **200**

```json
{
  "id": "dbcde499-c985-40a9-9b38-436f936c5c54",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a5e0d320-f791-4193-84ed-500531d4fab4",
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
  "created_at": "2026-10-30T09:48:12.074862Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/dbcde499-c985-40a9-9b38-436f936c5c54/cancel` → **200**

```json
{
  "command_id": "b6f74f0f-066d-4813-97f0-4fce973bd1f3",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "dbcde499-c985-40a9-9b38-436f936c5c54",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a5e0d320-f791-4193-84ed-500531d4fab4",
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
  "created_at": "2026-10-30T09:48:12.074862Z",
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
  "command_id": "9e5fb2c6-5d53-4c75-aa7f-ed624a566137",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:48:13Z",
    "sequence": 1793353693484
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "659dba9f-6c7b-419c-ba6b-82374af640aa",
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
  "last_heartbeat_at": "2026-10-30T09:48:13.065019Z",
  "last_location_at": "2026-10-30T09:48:13.065019Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-29381"
}
```

```json
{
  "challenge_id": "10563e15-c1be-44e6-a40c-85b5ba415296",
  "expires_at": "2026-10-30T09:53:13.296583926Z",
  "resend_available_at": "2026-10-30T09:48:14.296583926Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "960112",
  "sent_at": "2026-10-30T09:48:13.29884132Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "10563e15-c1be-44e6-a40c-85b5ba415296",
  "code": "960112",
  "device_ref": "sandbox-29381"
}
```

```json
{
  "session_id": "7cef0707-befe-49a7-94f7-b9787ac34ea8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDU5MywiaWF0IjoxNzkzMzUzNjkzLCJqdGkiOiI3OWMyNDdkNy1iY2JiLTQ0OTAtODk4NC1mMDg3ZDMyNjNlYmUiLCJzaWQiOiI3Y2VmMDcwNy1iZWZlLTQ5YTctOTRmNy1iOTc4N2FjMzRlYTgifQ.acWjovJEb1zFce0a2Muyk3GRaMDiCGgONn6UHYEtFsE",
  "access_expires_at": "2026-10-30T10:03:13.548705543Z",
  "refresh_token": "MUZStOc4rqJa9HeW6lo7t6jKbMGqDht4ulqwG_R7coA",
  "refresh_expires_at": "2026-11-29T09:48:13.548188338Z",
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
  "command_id": "aeb60948-6ca5-4e2d-819b-9a16a01e7ad3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:48:14Z",
    "sequence": 1793353694938
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c9041382-c0b2-4906-8d39-67f075efd77e",
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
  "last_heartbeat_at": "2026-10-30T09:48:14.025027Z",
  "last_location_at": "2026-10-30T09:48:14.025027Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "14a5ab70-f2d1-4ee0-b4fd-d8372f90127b",
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
  "id": "a657e4ac-3848-439d-b9bd-ab4adf6042eb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:53:14.296303Z",
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
  "command_id": "ae050d15-05c3-4b47-ba18-eeaa346481fe",
  "quote_id": "a657e4ac-3848-439d-b9bd-ab4adf6042eb",
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
  "id": "389bddae-9c5d-46fb-aad3-67f92213620b",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a5e0d320-f791-4193-84ed-500531d4fab4",
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
  "created_at": "2026-10-30T09:48:14.539817Z",
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
    "id": "d75cc087-7fa6-4172-ac0b-6d5ac606dabf",
    "order_id": "389bddae-9c5d-46fb-aad3-67f92213620b",
    "expires_at": "2026-10-30T09:48:29.543208Z",
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

`POST /api/driver/v1/offers/d75cc087-7fa6-4172-ac0b-6d5ac606dabf/accept` → **200**

```json
{
  "command_id": "ab9cd752-e909-4ba4-af38-8724d68e5773"
}
```

```json
{
  "id": "aadd47db-9ff8-4d5e-9d8b-7777e453f74f",
  "order_id": "389bddae-9c5d-46fb-aad3-67f92213620b",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9bcdce1b-fbb9-4152-a495-871c129eaa78",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9bcdce1b-fbb9-4152-a495-871c129eaa78",
  "order_id": "389bddae-9c5d-46fb-aad3-67f92213620b",
  "assignment_id": "aadd47db-9ff8-4d5e-9d8b-7777e453f74f",
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

`POST /api/driver/v1/trips/9bcdce1b-fbb9-4152-a495-871c129eaa78/cancel` → **200**

```json
{
  "command_id": "5174bb80-04b2-4e4d-9347-f784b5bbf448",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "9bcdce1b-fbb9-4152-a495-871c129eaa78",
  "order_id": "389bddae-9c5d-46fb-aad3-67f92213620b",
  "assignment_id": "aadd47db-9ff8-4d5e-9d8b-7777e453f74f",
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

`GET /api/rider/v1/orders/389bddae-9c5d-46fb-aad3-67f92213620b` → **200**

```json
{
  "id": "389bddae-9c5d-46fb-aad3-67f92213620b",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "a5e0d320-f791-4193-84ed-500531d4fab4",
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
    "id": "aadd47db-9ff8-4d5e-9d8b-7777e453f74f",
    "order_id": "389bddae-9c5d-46fb-aad3-67f92213620b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "9bcdce1b-fbb9-4152-a495-871c129eaa78",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T09:48:14.539817Z",
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
    "id": "d1f90a21-1a6d-4274-9d82-71a5d134f50c",
    "order_id": "389bddae-9c5d-46fb-aad3-67f92213620b",
    "expires_at": "2026-10-30T09:48:30.483882Z",
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

`POST /api/driver/v1/offers/d1f90a21-1a6d-4274-9d82-71a5d134f50c/accept` → **200**

```json
{
  "command_id": "a3e12d64-2772-4b6b-afbe-d361a39e6b1e"
}
```

```json
{
  "id": "431ff4de-9c6f-4531-8f74-e3d523a1b410",
  "order_id": "389bddae-9c5d-46fb-aad3-67f92213620b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4fd8153c-aacc-4ce9-8d78-5a5e3c83f373",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4fd8153c-aacc-4ce9-8d78-5a5e3c83f373",
  "order_id": "389bddae-9c5d-46fb-aad3-67f92213620b",
  "assignment_id": "431ff4de-9c6f-4531-8f74-e3d523a1b410",
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

`POST /api/driver/v1/trips/4fd8153c-aacc-4ce9-8d78-5a5e3c83f373/cancel` → **200**

```json
{
  "command_id": "d9eb985c-08bc-49b9-93f2-480690c244c4",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "4fd8153c-aacc-4ce9-8d78-5a5e3c83f373",
  "order_id": "389bddae-9c5d-46fb-aad3-67f92213620b",
  "assignment_id": "431ff4de-9c6f-4531-8f74-e3d523a1b410",
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
    "id": "389bddae-9c5d-46fb-aad3-67f92213620b",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-30T09:48:14.539817Z",
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
    "id": "dbcde499-c985-40a9-9b38-436f936c5c54",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T09:48:12.074862Z",
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

`GET /api/operator/v1/orders/389bddae-9c5d-46fb-aad3-67f92213620b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:48:14.540494Z",
      "actor": {
        "type": "CLIENT",
        "id": "a5e0d320-f791-4193-84ed-500531d4fab4",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "389bddae-9c5d-46fb-aad3-67f92213620b",
        "quote_id": "a657e4ac-3848-439d-b9bd-ab4adf6042eb",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "38b599e5-5fe9-4e1f-8eb9-feb7538e560c"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:48:14.542371Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "389bddae-9c5d-46fb-aad3-67f92213620b",
        "attempt_id": "9ff1b255-5340-46fc-a71f-abf05dc7693b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "38b599e5-5fe9-4e1f-8eb9-feb7538e560c"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T09:48:14.548539Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "d75cc087-7fa6-4172-ac0b-6d5ac606dabf",
        "order_id": "389bddae-9c5d-46fb-aad3-67f92213620b",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "38b599e5-5fe9-4e1f-8eb9-feb7538e560c"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T09:48:15.019073Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "d75cc087-7fa6-4172-ac0b-6d5ac606dabf",
        "order_id": "389bddae-9c5d-46fb-aad3-67f92213620b",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "aadd47db-9ff8-4d5e-9d8b-7777e453f74f"
      },
      "correlation_id": "539181c8-540c-4647-9949-abcf8abe51ec"
```

Done: orders dbcde499-c985-40a9-9b38-436f936c5c54, 389bddae-9c5d-46fb-aad3-67f92213620b.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733933030",
  "device_ref": "sandbox-149"
}
```

```json
{
  "challenge_id": "a4f48a13-91b0-4976-ba87-72d98da2b18a",
  "expires_at": "2026-10-30T09:53:17.39562921Z",
  "resend_available_at": "2026-10-30T09:48:18.39562921Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380733933030` → **200**

```json
{
  "phone": "+380733933030",
  "audience": "CLIENT",
  "code": "666379",
  "sent_at": "2026-10-30T09:48:17.398057353Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a4f48a13-91b0-4976-ba87-72d98da2b18a",
  "code": "666379",
  "device_ref": "sandbox-149"
}
```

```json
{
  "session_id": "e3ca3bc6-56fe-4a3e-8918-39c63e612e6b",
  "subject": {
    "type": "CLIENT",
    "id": "bf3cedf5-05b7-4fa8-a703-c220ba347064"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZjNjZWRmNS0wNWI3LTRmYTgtYTcwMy1jMjIwYmEzNDcwNjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NTk3LCJpYXQiOjE3OTMzNTM2OTcsImp0aSI6ImFhMzBhNGNlLTE5YTMtNDc3OC1iMGNmLTIxYmE0MzcyYjczNiIsInNpZCI6ImUzY2EzYmM2LTU2ZmUtNGEzZS04OTE4LTM5YzYzZTYxMmU2YiJ9.a5IXROwzJTns33HgF5Vl277t8lgy7eUQeiBN5a2NZkI",
  "access_expires_at": "2026-10-30T10:03:17.639444242Z",
  "refresh_token": "oKs7Dj5ckyqxQxNYEKvex8d7cKFmI3H6d5lwWACZVeA",
  "refresh_expires_at": "2026-11-29T09:48:17.639063819Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "4c77b41e-c03b-4fbc-acc6-b2ca21980405",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "9bc2e25f-c1bf-4cc2-bae1-072312b68afc",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-9bc2e25f-c1bf-4cc2-bae1-072312b68afc",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "7f9ecb466733528908ffac677bc52d40",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=9bc2e25f-c1bf-4cc2-bae1-072312b68afc",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733933030"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=9bc2e25f-c1bf-4cc2-bae1-072312b68afc",
  "expires_at": "2026-10-30T10:18:17.866965Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/9bc2e25f-c1bf-4cc2-bae1-072312b68afc` → **200**

```json
{
  "id": "9bc2e25f-c1bf-4cc2-bae1-072312b68afc",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T10:18:17.866965Z",
  "card": {
    "id": "914756da-590e-46ab-ae2c-7a490ac63ccb",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6087",
    "card_type": "Visa",
    "created_at": "2026-10-30T09:48:18.106709Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "914756da-590e-46ab-ae2c-7a490ac63ccb",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****6087",
      "card_type": "Visa",
      "created_at": "2026-10-30T09:48:18.106709Z"
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
  "device_ref": "sandbox-10009"
}
```

```json
{
  "challenge_id": "8bf71414-1eb1-4c51-9f71-c05f849ab74f",
  "expires_at": "2026-10-30T09:53:18.576099228Z",
  "resend_available_at": "2026-10-30T09:48:19.576099228Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "062515",
  "sent_at": "2026-10-30T09:48:18.578403017Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8bf71414-1eb1-4c51-9f71-c05f849ab74f",
  "code": "062515",
  "device_ref": "sandbox-10009"
}
```

```json
{
  "session_id": "a03a09cb-a79a-432a-89af-67c6ffac7f67",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDU5OCwiaWF0IjoxNzkzMzUzNjk4LCJqdGkiOiJhODkwMDYxYS0yYzA3LTRlNDEtOTdhMS1lODUyMWQxNzM5Y2MiLCJzaWQiOiJhMDNhMDljYi1hNzlhLTQzMmEtODlhZi02N2M2ZmZhYzdmNjcifQ.b2NV3BJ8iMeHurx0iqi8PVbCxe8N02YJzoilmoStilY",
  "access_expires_at": "2026-10-30T10:03:18.824782966Z",
  "refresh_token": "Uw4_paIT5HKsugdB6zji8mDBxeCH447xih9yJTZE1ps",
  "refresh_expires_at": "2026-11-29T09:48:18.824286007Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c9041382-c0b2-4906-8d39-67f075efd77e",
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
  "last_heartbeat_at": "2026-10-30T09:48:14.025027Z",
  "last_location_at": "2026-10-30T09:48:14.025027Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c9041382-c0b2-4906-8d39-67f075efd77e/handover` → **200**

```json
{
  "command_id": "481f32d4-425f-48da-984c-14e3d1d6e8f4",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c9041382-c0b2-4906-8d39-67f075efd77e",
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
  "last_heartbeat_at": "2026-10-30T09:48:14.025027Z",
  "last_location_at": "2026-10-30T09:48:14.025027Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 44 s to the next point)

`POST /api/driver/v1/work-sessions/c9041382-c0b2-4906-8d39-67f075efd77e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:49:03Z",
    "sequence": 1793353743555
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c9041382-c0b2-4906-8d39-67f075efd77e",
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
  "last_heartbeat_at": "2026-10-30T09:49:03.570386Z",
  "last_location_at": "2026-10-30T09:49:03.570386Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2163bd72-8b17-46ca-9f15-8903c09982d3",
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
  "id": "e8ccb86a-5284-4955-8f49-191e271c2891",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:54:03.794203Z",
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
  "command_id": "dd422d4f-6f04-425e-a68d-e222eaed273f",
  "quote_id": "e8ccb86a-5284-4955-8f49-191e271c2891",
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
  "id": "e14a80b3-2982-4b38-8f1f-703fd298d691",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "bf3cedf5-05b7-4fa8-a703-c220ba347064",
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
  "created_at": "2026-10-30T09:49:04.031424Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e14a80b3-2982-4b38-8f1f-703fd298d691` → **200**

```json
{
  "id": "e14a80b3-2982-4b38-8f1f-703fd298d691",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "bf3cedf5-05b7-4fa8-a703-c220ba347064",
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
  "created_at": "2026-10-30T09:49:04.031424Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e14a80b3-2982-4b38-8f1f-703fd298d691` → **200**

```json
{
  "id": "e14a80b3-2982-4b38-8f1f-703fd298d691",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "bf3cedf5-05b7-4fa8-a703-c220ba347064",
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
  "created_at": "2026-10-30T09:49:04.031424Z",
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
    "id": "1022a101-526f-4005-9ece-179d1fde7f8f",
    "order_id": "e14a80b3-2982-4b38-8f1f-703fd298d691",
    "expires_at": "2026-10-30T09:49:19.930255Z",
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

`POST /api/driver/v1/offers/1022a101-526f-4005-9ece-179d1fde7f8f/accept` → **200**

```json
{
  "command_id": "a45b233a-edc5-426e-8d47-14101d1e6bd6"
}
```

```json
{
  "id": "4d49146a-ebd9-4ac2-bf17-132cde00c488",
  "order_id": "e14a80b3-2982-4b38-8f1f-703fd298d691",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "da0044d9-00fd-4509-8d35-3522e273a913",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "da0044d9-00fd-4509-8d35-3522e273a913",
  "order_id": "e14a80b3-2982-4b38-8f1f-703fd298d691",
  "assignment_id": "4d49146a-ebd9-4ac2-bf17-132cde00c488",
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

`POST /api/driver/v1/work-sessions/c9041382-c0b2-4906-8d39-67f075efd77e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:49:12Z",
    "sequence": 1793353752406
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c9041382-c0b2-4906-8d39-67f075efd77e",
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
  "last_heartbeat_at": "2026-10-30T09:49:12.42197Z",
  "last_location_at": "2026-10-30T09:49:12.42197Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/da0044d9-00fd-4509-8d35-3522e273a913/arrive` → **200**

```json
{
  "command_id": "05814d56-614b-49f9-880d-03a6956e8c83",
  "expected_version": 0
}
```

```json
{
  "id": "da0044d9-00fd-4509-8d35-3522e273a913",
  "order_id": "e14a80b3-2982-4b38-8f1f-703fd298d691",
  "assignment_id": "4d49146a-ebd9-4ac2-bf17-132cde00c488",
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
  "arrived_at": "2026-10-30T09:49:12.64915Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/da0044d9-00fd-4509-8d35-3522e273a913/start` → **200**

```json
{
  "command_id": "37e8de48-a4ba-42d8-805e-77e06654bb19",
  "expected_version": 1
}
```

```json
{
  "id": "da0044d9-00fd-4509-8d35-3522e273a913",
  "order_id": "e14a80b3-2982-4b38-8f1f-703fd298d691",
  "assignment_id": "4d49146a-ebd9-4ac2-bf17-132cde00c488",
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
  "arrived_at": "2026-10-30T09:49:12.64915Z",
  "started_at": "2026-10-30T09:49:12.886486Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/da0044d9-00fd-4509-8d35-3522e273a913/complete` → **200**

```json
{
  "command_id": "27ff5679-b6df-43cd-b474-a217c227138a",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:49:13Z",
  "cash_received": true
}
```

```json
{
  "id": "da0044d9-00fd-4509-8d35-3522e273a913",
  "order_id": "e14a80b3-2982-4b38-8f1f-703fd298d691",
  "assignment_id": "4d49146a-ebd9-4ac2-bf17-132cde00c488",
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
  "arrived_at": "2026-10-30T09:49:12.64915Z",
  "started_at": "2026-10-30T09:49:12.886486Z",
  "completed_at": "2026-10-30T09:49:13.121268Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/e14a80b3-2982-4b38-8f1f-703fd298d691` → **200**

```json
{
  "id": "e14a80b3-2982-4b38-8f1f-703fd298d691",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "bf3cedf5-05b7-4fa8-a703-c220ba347064",
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
    "id": "4d49146a-ebd9-4ac2-bf17-132cde00c488",
    "order_id": "e14a80b3-2982-4b38-8f1f-703fd298d691",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "da0044d9-00fd-4509-8d35-3522e273a913",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:49:04.031424Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e14a80b3-2982-4b38-8f1f-703fd298d691` → **200**

```json
{
  "id": "e14a80b3-2982-4b38-8f1f-703fd298d691",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "bf3cedf5-05b7-4fa8-a703-c220ba347064",
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
    "id": "4d49146a-ebd9-4ac2-bf17-132cde00c488",
    "order_id": "e14a80b3-2982-4b38-8f1f-703fd298d691",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "da0044d9-00fd-4509-8d35-3522e273a913",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:49:04.031424Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e14a80b3-2982-4b38-8f1f-703fd298d691` → **200**

```json
{
  "id": "e14a80b3-2982-4b38-8f1f-703fd298d691",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "bf3cedf5-05b7-4fa8-a703-c220ba347064",
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
    "id": "4d49146a-ebd9-4ac2-bf17-132cde00c488",
    "order_id": "e14a80b3-2982-4b38-8f1f-703fd298d691",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "da0044d9-00fd-4509-8d35-3522e273a913",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:49:04.031424Z",
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

`GET /api/rider/v1/orders/e14a80b3-2982-4b38-8f1f-703fd298d691/tip` → **200**

```json
{
  "order_id": "e14a80b3-2982-4b38-8f1f-703fd298d691",
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
  "available_until": "2026-10-31T09:49:13.121268Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/e14a80b3-2982-4b38-8f1f-703fd298d691/tip` → **201**

```json
{
  "command_id": "2e71f975-88b6-4fbc-9f12-b98254bde432",
  "amount_minor": 2500
}
```

```json
{
  "id": "5e4ed9c1-dac2-4549-8ae6-4d9f842ff187",
  "order_id": "e14a80b3-2982-4b38-8f1f-703fd298d691",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T09:49:16.52882Z"
}
```

`GET /api/rider/v1/orders/e14a80b3-2982-4b38-8f1f-703fd298d691/tip` → **200**

```json
{
  "order_id": "e14a80b3-2982-4b38-8f1f-703fd298d691",
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
  "available_until": "2026-10-31T09:49:13.121268Z",
  "open": false,
  "tip": {
    "id": "5e4ed9c1-dac2-4549-8ae6-4d9f842ff187",
    "order_id": "e14a80b3-2982-4b38-8f1f-703fd298d691",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T09:49:16.52882Z"
  }
}
```

`GET /api/rider/v1/orders/e14a80b3-2982-4b38-8f1f-703fd298d691/tip` → **200**

```json
{
  "order_id": "e14a80b3-2982-4b38-8f1f-703fd298d691",
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
  "available_until": "2026-10-31T09:49:13.121268Z",
  "open": false,
  "tip": {
    "id": "5e4ed9c1-dac2-4549-8ae6-4d9f842ff187",
    "order_id": "e14a80b3-2982-4b38-8f1f-703fd298d691",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T09:49:16.52882Z"
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
      "id": "43eb8955-8216-434f-b91a-8623cffe4a09",
      "at": "2026-10-30T09:49:18.034994Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "e14a80b3-2982-4b38-8f1f-703fd298d691",
      "counterpart_id": null
    },
    {
      "id": "d9a144e3-854a-4219-91b9-3262f37cd815",
      "at": "2026-10-30T09:49:13.988174Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e14a80b3-2982-4b38-8f1f-703fd298d691",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0f22aa46-e858-4d03-8cc2-693a898231da",
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
  "id": "3200c7f3-8d93-4806-92ff-b3060ff68d2e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:54:18.543134Z",
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
  "session_id": "936276ff-1f3c-4258-a7d4-2fdb5e9d3032",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ2NTksImlhdCI6MTc5MzM1Mzc1OSwianRpIjoiZTNkMDJjOTItMzcyMC00OGMxLTgyMGQtN2Q0ZmViYjU0YWE0Iiwic2lkIjoiOTM2Mjc2ZmYtMWYzYy00MjU4LWE3ZDQtMmZkYjVlOWQzMDMyIn0.jx83Br0Dc2Zzmj4M4WVhr5Vf-v0OpHgoZegiGwbgaak",
  "access_expires_at": "2026-10-30T10:04:19.043497031Z",
  "refresh_token": "f6eVNK2N12mHGdGOAnjr5EKc2JKsMHW0vCalwuFhL_w",
  "refresh_expires_at": "2026-10-30T21:49:19.043040024Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380733933030` → **200**

```json
{
  "client_id": "bf3cedf5-05b7-4fa8-a703-c220ba347064"
}
```

`POST /api/admin/v1/rider-wallets/bf3cedf5-05b7-4fa8-a703-c220ba347064/top-ups` → **201**

```json
{
  "command_id": "074f8a7f-d65e-444c-9361-594bef4c1b4f",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "bf3cedf5-05b7-4fa8-a703-c220ba347064",
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
      "id": "94209828-eb9d-4c65-b023-277b50dcc7a6",
      "at": "2026-10-30T09:49:19.501656Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4039148f-62ed-4568-8a1b-40059fb60bd9",
  "quote_id": "3200c7f3-8d93-4806-92ff-b3060ff68d2e",
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
  "id": "db558883-c08e-42d2-9013-ca00c375be48",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bf3cedf5-05b7-4fa8-a703-c220ba347064",
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
  "created_at": "2026-10-30T09:49:19.749301Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db558883-c08e-42d2-9013-ca00c375be48` → **200**

```json
{
  "id": "db558883-c08e-42d2-9013-ca00c375be48",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bf3cedf5-05b7-4fa8-a703-c220ba347064",
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
  "created_at": "2026-10-30T09:49:19.749301Z",
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
    "id": "f35f4773-2b3d-4bb0-83fc-ae163ce31f40",
    "order_id": "db558883-c08e-42d2-9013-ca00c375be48",
    "expires_at": "2026-10-30T09:49:34.754246Z",
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

`POST /api/driver/v1/offers/f35f4773-2b3d-4bb0-83fc-ae163ce31f40/accept` → **200**

```json
{
  "command_id": "46cd2e74-2b5f-4a61-8ad3-e1f3e30eb150"
}
```

```json
{
  "id": "7f1d3803-e7a4-4fa6-bbe2-9349906ca337",
  "order_id": "db558883-c08e-42d2-9013-ca00c375be48",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1fce4299-58da-40bd-808f-c7b81d2ff838",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1fce4299-58da-40bd-808f-c7b81d2ff838",
  "order_id": "db558883-c08e-42d2-9013-ca00c375be48",
  "assignment_id": "7f1d3803-e7a4-4fa6-bbe2-9349906ca337",
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

`POST /api/driver/v1/work-sessions/c9041382-c0b2-4906-8d39-67f075efd77e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:49:20Z",
    "sequence": 1793353760901
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c9041382-c0b2-4906-8d39-67f075efd77e",
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
  "last_heartbeat_at": "2026-10-30T09:49:20.915538Z",
  "last_location_at": "2026-10-30T09:49:20.915538Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/1fce4299-58da-40bd-808f-c7b81d2ff838/arrive` → **200**

```json
{
  "command_id": "79915cb2-2f6b-48d1-a541-c8f072b14e56",
  "expected_version": 0
}
```

```json
{
  "id": "1fce4299-58da-40bd-808f-c7b81d2ff838",
  "order_id": "db558883-c08e-42d2-9013-ca00c375be48",
  "assignment_id": "7f1d3803-e7a4-4fa6-bbe2-9349906ca337",
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
  "arrived_at": "2026-10-30T09:49:21.144619Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1fce4299-58da-40bd-808f-c7b81d2ff838/start` → **200**

```json
{
  "command_id": "669a7d5d-2dba-4bfc-9912-6de0047cb9c0",
  "expected_version": 1
}
```

```json
{
  "id": "1fce4299-58da-40bd-808f-c7b81d2ff838",
  "order_id": "db558883-c08e-42d2-9013-ca00c375be48",
  "assignment_id": "7f1d3803-e7a4-4fa6-bbe2-9349906ca337",
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
  "arrived_at": "2026-10-30T09:49:21.144619Z",
  "started_at": "2026-10-30T09:49:21.380373Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1fce4299-58da-40bd-808f-c7b81d2ff838/complete` → **200**

```json
{
  "command_id": "c9790a60-7116-4df0-bf75-7046118d2c81",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:49:21Z",
  "cash_received": true
}
```

```json
{
  "id": "1fce4299-58da-40bd-808f-c7b81d2ff838",
  "order_id": "db558883-c08e-42d2-9013-ca00c375be48",
  "assignment_id": "7f1d3803-e7a4-4fa6-bbe2-9349906ca337",
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
  "arrived_at": "2026-10-30T09:49:21.144619Z",
  "started_at": "2026-10-30T09:49:21.380373Z",
  "completed_at": "2026-10-30T09:49:21.636283Z",
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
  "client_id": "bf3cedf5-05b7-4fa8-a703-c220ba347064",
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
      "id": "94209828-eb9d-4c65-b023-277b50dcc7a6",
      "at": "2026-10-30T09:49:19.501656Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
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

`GET /api/rider/v1/orders/db558883-c08e-42d2-9013-ca00c375be48/tip` → **200**

```json
{
  "order_id": "db558883-c08e-42d2-9013-ca00c375be48",
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
  "available_until": "2026-10-31T09:49:21.636283Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/db558883-c08e-42d2-9013-ca00c375be48/tip` → **201**

```json
{
  "command_id": "dee0c165-e4ee-40a0-873c-36b5ad0c16ad",
  "amount_minor": 2500
}
```

```json
{
  "id": "b00de1d4-7fa3-4e11-8a26-8a08adbbbe9a",
  "order_id": "db558883-c08e-42d2-9013-ca00c375be48",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T09:49:22.56375Z"
}
```

`GET /api/rider/v1/orders/db558883-c08e-42d2-9013-ca00c375be48/tip` → **200**

```json
{
  "order_id": "db558883-c08e-42d2-9013-ca00c375be48",
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
  "available_until": "2026-10-31T09:49:21.636283Z",
  "open": false,
  "tip": {
    "id": "b00de1d4-7fa3-4e11-8a26-8a08adbbbe9a",
    "order_id": "db558883-c08e-42d2-9013-ca00c375be48",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T09:49:22.56375Z"
  }
}
```

`GET /api/rider/v1/orders/db558883-c08e-42d2-9013-ca00c375be48/tip` → **200**

```json
{
  "order_id": "db558883-c08e-42d2-9013-ca00c375be48",
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
  "available_until": "2026-10-31T09:49:21.636283Z",
  "open": false,
  "tip": {
    "id": "b00de1d4-7fa3-4e11-8a26-8a08adbbbe9a",
    "order_id": "db558883-c08e-42d2-9013-ca00c375be48",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T09:49:22.56375Z"
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
      "id": "39f53daa-256e-4fa2-8717-6fa8729e27b7",
      "at": "2026-10-30T09:49:24.097352Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "db558883-c08e-42d2-9013-ca00c375be48",
      "counterpart_id": null
    },
    {
      "id": "8553f369-f960-436a-921e-acefb2bd946e",
      "at": "2026-10-30T09:49:22.073946Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "db558883-c08e-42d2-9013-ca00c375be48",
      "counterpart_id": null
    },
    {
      "id": "43eb8955-8216-434f-b91a-8623cffe4a09",
      "at": "2026-10-30T09:49:18.034994Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "e14a80b3-2982-4b38-8f1f-703fd298d691",
      "counterpart_id": null
    },
    {
      "id": "d9a144e3-854a-4219-91b9-3262f37cd815",
      "at": "2026-10-30T09:49:13.988174Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e14a80b3-2982-4b38-8f1f-703fd298d691",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c9041382-c0b2-4906-8d39-67f075efd77e",
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
  "last_heartbeat_at": "2026-10-30T09:49:20.915538Z",
  "last_location_at": "2026-10-30T09:49:20.915538Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c9041382-c0b2-4906-8d39-67f075efd77e/close` → **200**

```json
{
  "command_id": "f96a4cda-5114-4b73-acee-55baa768a6c7",
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

Done: card order db558883-c08e-42d2-9013-ca00c375be48.

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
  "phone": "+380737303462",
  "device_ref": "sandbox-3510"
}
```

```json
{
  "challenge_id": "e69b0d4f-23ea-4cec-9777-ab090bc52b56",
  "expires_at": "2026-10-30T09:54:25.157194512Z",
  "resend_available_at": "2026-10-30T09:49:26.157194512Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737303462` → **200**

```json
{
  "phone": "+380737303462",
  "audience": "CLIENT",
  "code": "432549",
  "sent_at": "2026-10-30T09:49:25.159426456Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e69b0d4f-23ea-4cec-9777-ab090bc52b56",
  "code": "432549",
  "device_ref": "sandbox-3510"
}
```

```json
{
  "session_id": "646c660b-c9f6-448e-ba6b-0d37fc6044d6",
  "subject": {
    "type": "CLIENT",
    "id": "a7e753d9-1be7-49ea-bc27-a89b124a3428"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U3NTNkOS0xYmU3LTQ5ZWEtYmMyNy1hODliMTI0YTM0MjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NjY1LCJpYXQiOjE3OTMzNTM3NjUsImp0aSI6ImFiODdiNmQyLTFiMDAtNGZhMC1iZGJlLWM5OTVkNmVkMTUxYyIsInNpZCI6IjY0NmM2NjBiLWM5ZjYtNDQ4ZS1iYTZiLTBkMzdmYzYwNDRkNiJ9.dcPzrGeGJLNcjAs5mDH2dw5Di8g_TygtaCd0MWqEsvs",
  "access_expires_at": "2026-10-30T10:04:25.403918951Z",
  "refresh_token": "4Vb5S8CRzZuF3kIpSQzIPOkp9Gf7N9S-V1U-aPiiz3c",
  "refresh_expires_at": "2026-11-29T09:49:25.403536731Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "dbd424ae-da8c-4801-b3d3-cc9280b06c05",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "b6948478-bf61-480b-9def-6c8ac3d5fc57",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-b6948478-bf61-480b-9def-6c8ac3d5fc57",
    "orderDate": "1793353765",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "8d3718a4e7b973701b445dba7b506827",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=b6948478-bf61-480b-9def-6c8ac3d5fc57",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737303462"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=b6948478-bf61-480b-9def-6c8ac3d5fc57",
  "created_at": "2026-10-30T09:49:25.626593Z",
  "expires_at": "2026-10-30T10:19:25.626593Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/b6948478-bf61-480b-9def-6c8ac3d5fc57` → **200**

```json
{
  "id": "b6948478-bf61-480b-9def-6c8ac3d5fc57",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T09:49:25.626593Z",
  "expires_at": "2026-10-30T10:19:25.626593Z",
  "completed_at": "2026-10-30T09:49:25.853514Z",
  "masked_pan": "41****9642",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "a7e753d9-1be7-49ea-bc27-a89b124a3428",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "a7e753d9-1be7-49ea-bc27-a89b124a3428",
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
      "id": "bc7c1117-5563-4c19-aa60-23c85b207a30",
      "at": "2026-10-30T09:49:26.113647Z",
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
  "client_id": "a7e753d9-1be7-49ea-bc27-a89b124a3428",
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
      "id": "bc7c1117-5563-4c19-aa60-23c85b207a30",
      "at": "2026-10-30T09:49:26.113647Z",
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
  "device_ref": "sandbox-25448"
}
```

```json
{
  "challenge_id": "36f8b145-ee20-48e0-9b87-b05f9f0ebc07",
  "expires_at": "2026-10-30T09:54:27.755709606Z",
  "resend_available_at": "2026-10-30T09:49:28.755709606Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "054456",
  "sent_at": "2026-10-30T09:49:27.757745833Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "36f8b145-ee20-48e0-9b87-b05f9f0ebc07",
  "code": "054456",
  "device_ref": "sandbox-25448"
}
```

```json
{
  "session_id": "e941a608-4b8f-403e-8c5a-56d7841f2801",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDY2NywiaWF0IjoxNzkzMzUzNzY3LCJqdGkiOiJiN2MxNWVlMi0yZGQ1LTRjZTktOGFkYS04Y2NlMWZmNjAwMmQiLCJzaWQiOiJlOTQxYTYwOC00YjhmLTQwM2UtOGM1YS01NmQ3ODQxZjI4MDEifQ.8NlkSVLbWif7u04GXldS4w-f7kpBpYZ5BJIo-PHEfvk",
  "access_expires_at": "2026-10-30T10:04:27.99232678Z",
  "refresh_token": "YDW4FtjdfnwC0-Y88hJDrr6VvLcpV4HsGzybxKWC6kQ",
  "refresh_expires_at": "2026-11-29T09:49:27.991868287Z",
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
  "command_id": "f607a10e-1a21-4aa1-bf45-19c77c57ed0b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "ce85f65e-256e-417e-a1e0-7ecf589bcf78",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-ce85f65e-256e-417e-a1e0-7ecf589bcf78",
    "orderDate": "1793353768",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "05553b31e75643bf118508a8f53dc931",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=ce85f65e-256e-417e-a1e0-7ecf589bcf78",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=ce85f65e-256e-417e-a1e0-7ecf589bcf78",
  "created_at": "2026-10-30T09:49:28.426525Z",
  "expires_at": "2026-10-30T10:19:28.426525Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/ce85f65e-256e-417e-a1e0-7ecf589bcf78` → **200**

```json
{
  "id": "ce85f65e-256e-417e-a1e0-7ecf589bcf78",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T09:49:28.426525Z",
  "expires_at": "2026-10-30T10:19:28.426525Z",
  "completed_at": "2026-10-30T09:49:28.64882Z",
  "masked_pan": "41****0555",
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
      "id": "e60026bd-63a0-40d5-8a10-6cf0990684c9",
      "at": "2026-10-30T09:49:29.119612Z",
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
  "command_id": "690f817a-1807-422c-8bce-bf70ca60bcde",
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
  "correlation_id": "89d46732-9a18-4c71-8278-d126fb48c88b"
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
  "device_ref": "sandbox-12990"
}
```

```json
{
  "challenge_id": "afebd464-76d6-485f-8e30-ba52bf2fd37e",
  "expires_at": "2026-10-30T09:54:30.55018056Z",
  "resend_available_at": "2026-10-30T09:49:31.55018056Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "106845",
  "sent_at": "2026-10-30T09:49:30.552985728Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "afebd464-76d6-485f-8e30-ba52bf2fd37e",
  "code": "106845",
  "device_ref": "sandbox-12990"
}
```

```json
{
  "session_id": "73e78f01-4e2e-4223-a01a-84c545aeadd4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDY3MCwiaWF0IjoxNzkzMzUzNzcwLCJqdGkiOiJkNDQyZjM1Mi0xMDg2LTQxYWQtYWUzZi1mODcxYjI5ZTUyYjMiLCJzaWQiOiI3M2U3OGYwMS00ZTJlLTQyMjMtYTAxYS04NGM1NDVhZWFkZDQifQ.OOk2l-GY8UJ6VZn2XKFiZnWvWt5ftaiXzJ_14WuH8Nc",
  "access_expires_at": "2026-10-30T10:04:30.784047915Z",
  "refresh_token": "QhlY7Wp7OxpQ4k5Wux8Toioh5qFWKiJCbj2s5EvYgS0",
  "refresh_expires_at": "2026-11-29T09:49:30.783630164Z",
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
  "command_id": "1e8ff9f7-09ae-4fd6-a602-4c6e2b65b5f5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:49:31Z",
    "sequence": 1793353771224
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d13fc275-3110-46d8-aa20-8429fba04d5d",
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
  "last_heartbeat_at": "2026-10-30T09:49:31.238594Z",
  "last_location_at": "2026-10-30T09:49:31.238594Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639067545",
  "device_ref": "sandbox-8418"
}
```

```json
{
  "challenge_id": "7609ee71-dfef-40da-9a66-a657c544df28",
  "expires_at": "2026-10-30T09:54:31.461001789Z",
  "resend_available_at": "2026-10-30T09:49:32.461001789Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639067545` → **200**

```json
{
  "phone": "+380639067545",
  "audience": "CLIENT",
  "code": "756749",
  "sent_at": "2026-10-30T09:49:31.463779191Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7609ee71-dfef-40da-9a66-a657c544df28",
  "code": "756749",
  "device_ref": "sandbox-8418"
}
```

```json
{
  "session_id": "3e4ce606-c739-45d4-b6ab-dcaabde876e4",
  "subject": {
    "type": "CLIENT",
    "id": "fbaeed54-a1e6-48b8-9b27-5e75db9c5dc1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYmFlZWQ1NC1hMWU2LTQ4YjgtOWIyNy01ZTc1ZGI5YzVkYzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NjcxLCJpYXQiOjE3OTMzNTM3NzEsImp0aSI6ImY2ZDA2YmM5LTU1NmUtNDU4Yy1iY2YyLWM4NTI0NTJjMGYzMCIsInNpZCI6IjNlNGNlNjA2LWM3MzktNDVkNC1iNmFiLWRjYWFiZGU4NzZlNCJ9._ZfZ7c6cod8AEwCjFAXFWHgMAwmorDryP7NhNhJEYe8",
  "access_expires_at": "2026-10-30T10:04:31.698033551Z",
  "refresh_token": "v6WnPl5sMACCGAJs_s0jlZGuXwgppwXmcDoVlS6rDoY",
  "refresh_expires_at": "2026-11-29T09:49:31.697697036Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "daa08f2e-a3ae-43bc-bdd9-574ba9d5b9c1",
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
  "id": "5366a16f-5237-4836-8d6b-848a18091524",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:54:31.933146Z",
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
  "command_id": "76f400cf-4c1f-4115-8407-439352c0552c",
  "quote_id": "5366a16f-5237-4836-8d6b-848a18091524",
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
  "id": "b9cfc9fc-e4b1-4af3-af9a-3037825533f5",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fbaeed54-a1e6-48b8-9b27-5e75db9c5dc1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:49:32.195449Z",
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
    "id": "c631974c-f3a8-4cd1-8138-27ff2904fab5",
    "order_id": "b9cfc9fc-e4b1-4af3-af9a-3037825533f5",
    "expires_at": "2026-10-30T09:49:47.198091Z",
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

`POST /api/driver/v1/offers/c631974c-f3a8-4cd1-8138-27ff2904fab5/accept` → **200**

```json
{
  "command_id": "a1d5cdce-79d4-45e1-a669-07ed135af890"
}
```

```json
{
  "id": "94d13bce-fd72-4c16-b277-56d42208dc8c",
  "order_id": "b9cfc9fc-e4b1-4af3-af9a-3037825533f5",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "47446958-144a-460b-beb6-3839ecf7d713",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "47446958-144a-460b-beb6-3839ecf7d713",
  "order_id": "b9cfc9fc-e4b1-4af3-af9a-3037825533f5",
  "assignment_id": "94d13bce-fd72-4c16-b277-56d42208dc8c",
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

`POST /api/driver/v1/work-sessions/d13fc275-3110-46d8-aa20-8429fba04d5d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:49:33Z",
    "sequence": 1793353773893
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d13fc275-3110-46d8-aa20-8429fba04d5d",
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
  "last_heartbeat_at": "2026-10-30T09:49:33.102907Z",
  "last_location_at": "2026-10-30T09:49:33.102907Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/47446958-144a-460b-beb6-3839ecf7d713/arrive` → **200**

```json
{
  "command_id": "f15f0ca2-3896-43e7-83dd-d705ae1dcdcc",
  "expected_version": 0
}
```

```json
{
  "id": "47446958-144a-460b-beb6-3839ecf7d713",
  "order_id": "b9cfc9fc-e4b1-4af3-af9a-3037825533f5",
  "assignment_id": "94d13bce-fd72-4c16-b277-56d42208dc8c",
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
  "arrived_at": "2026-10-30T09:49:33.334049Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/47446958-144a-460b-beb6-3839ecf7d713/start` → **200**

```json
{
  "command_id": "480dc919-fe30-41c0-b1a7-f810dd5b1b6d",
  "expected_version": 1
}
```

```json
{
  "id": "47446958-144a-460b-beb6-3839ecf7d713",
  "order_id": "b9cfc9fc-e4b1-4af3-af9a-3037825533f5",
  "assignment_id": "94d13bce-fd72-4c16-b277-56d42208dc8c",
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
  "arrived_at": "2026-10-30T09:49:33.334049Z",
  "started_at": "2026-10-30T09:49:33.563894Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/47446958-144a-460b-beb6-3839ecf7d713/complete` → **200**

```json
{
  "command_id": "8d1655a2-17fe-446e-808a-437aaef7a029",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:49:33Z",
  "cash_received": false
}
```

```json
{
  "id": "47446958-144a-460b-beb6-3839ecf7d713",
  "order_id": "b9cfc9fc-e4b1-4af3-af9a-3037825533f5",
  "assignment_id": "94d13bce-fd72-4c16-b277-56d42208dc8c",
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
  "arrived_at": "2026-10-30T09:49:33.334049Z",
  "started_at": "2026-10-30T09:49:33.563894Z",
  "completed_at": "2026-10-30T09:49:33.796764Z",
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
  "session_id": "e71f62e0-dbe0-4ac5-b678-612ede139d7f",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ2NzQsImlhdCI6MTc5MzM1Mzc3NCwianRpIjoiNjg1OWU5ZDQtNzEzOC00MDlkLTgxZDUtNWE1NjM1MzllNDExIiwic2lkIjoiZTcxZjYyZTAtZGJlMC00YWM1LWI2NzgtNjEyZWRlMTM5ZDdmIn0.dqhcmDbJk5ncci7Ne99KD1402LgIc2xr_IejUfarMnQ",
  "access_expires_at": "2026-10-30T10:04:34.283938905Z",
  "refresh_token": "9piXzuq-XiV-nTWHdCPfUOEQRmTTBgGKeqxF7BEKRoU",
  "refresh_expires_at": "2026-10-30T21:49:34.28359925Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/b9cfc9fc-e4b1-4af3-af9a-3037825533f5/cash-dispute` → **200**

```json
{
  "order_id": "b9cfc9fc-e4b1-4af3-af9a-3037825533f5",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "fbaeed54-a1e6-48b8-9b27-5e75db9c5dc1",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T09:49:34.157976Z",
  "decide_by": "2026-11-13T09:49:34.157976Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T09:49:34.157976Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "b9cfc9fc-e4b1-4af3-af9a-3037825533f5",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "fbaeed54-a1e6-48b8-9b27-5e75db9c5dc1",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T09:49:34.157976Z",
      "decide_by": "2026-11-13T09:49:34.157976Z",
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

`POST /api/admin/v1/orders/b9cfc9fc-e4b1-4af3-af9a-3037825533f5/cash-dispute/decide` → **400**

```json
{
  "command_id": "6027c03f-a608-4d90-92aa-8d8245b3e139",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/b9cfc9fc-e4b1-4af3-af9a-3037825533f5/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "980efb96-bc48-46a7-9a8c-0ce9b4d57e0d",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/b9cfc9fc-e4b1-4af3-af9a-3037825533f5/cash-dispute/decide` → **200**

```json
{
  "command_id": "7f8f4fac-deef-4941-9fd4-87b0baefe332",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "b9cfc9fc-e4b1-4af3-af9a-3037825533f5",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "fbaeed54-a1e6-48b8-9b27-5e75db9c5dc1",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T09:49:34.157976Z",
  "decide_by": "2026-11-13T09:49:34.157976Z",
  "decision": "PAY_DRIVER",
  "decided_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T09:49:35.209503Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/b9cfc9fc-e4b1-4af3-af9a-3037825533f5/cash-dispute/decide` → **409**

```json
{
  "command_id": "2748bc84-417c-4c86-afb3-679c2537277e",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/b9cfc9fc-e4b1-4af3-af9a-3037825533f5/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "93b6d6fe-f171-4c9f-86d5-7d636deafb6a"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d13fc275-3110-46d8-aa20-8429fba04d5d",
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
  "last_heartbeat_at": "2026-10-30T09:49:33.102907Z",
  "last_location_at": "2026-10-30T09:49:33.102907Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d13fc275-3110-46d8-aa20-8429fba04d5d/close` → **200**

```json
{
  "command_id": "197b8819-cfeb-4dbf-b03a-b4af39c1466c",
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
  "phone": "+380737314237",
  "device_ref": "sandbox-9965"
}
```

```json
{
  "challenge_id": "0e78a46e-a494-4095-a3ad-b4f67813b3de",
  "expires_at": "2026-10-30T09:54:36.119410091Z",
  "resend_available_at": "2026-10-30T09:49:37.119410091Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737314237` → **200**

```json
{
  "phone": "+380737314237",
  "audience": "CLIENT",
  "code": "135801",
  "sent_at": "2026-10-30T09:49:36.121727229Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0e78a46e-a494-4095-a3ad-b4f67813b3de",
  "code": "135801",
  "device_ref": "sandbox-9965"
}
```

```json
{
  "session_id": "bfb97cba-ad8f-418e-b0a4-de18cfe9b348",
  "subject": {
    "type": "CLIENT",
    "id": "3f58654c-ef54-4974-8c13-cd5299e9deb3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZjU4NjU0Yy1lZjU0LTQ5NzQtOGMxMy1jZDUyOTllOWRlYjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0Njc2LCJpYXQiOjE3OTMzNTM3NzYsImp0aSI6IjI3OWRiMWZhLTRmZjgtNGZlZi1hNjMxLTlkM2EzZTRkNGQzZSIsInNpZCI6ImJmYjk3Y2JhLWFkOGYtNDE4ZS1iMGE0LWRlMThjZmU5YjM0OCJ9.yy10qmRB-NbNhzL7pWd82KRWk_J6EY7bcYhjHx4MVwE",
  "access_expires_at": "2026-10-30T10:04:36.363981562Z",
  "refresh_token": "lAjo4uT0eIEe0tB-lu8UDyO4sPKn8W8TCEsjxIZXiOE",
  "refresh_expires_at": "2026-11-29T09:49:36.363521297Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "cf59acde-a38a-467c-a6d2-0625e81720e5",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "2e6042f5-1eda-499d-9e7d-706af16a4275",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-2e6042f5-1eda-499d-9e7d-706af16a4275",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "4ca6fbce4f663857d29528a59a163cd0",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=2e6042f5-1eda-499d-9e7d-706af16a4275",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737314237"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=2e6042f5-1eda-499d-9e7d-706af16a4275",
  "expires_at": "2026-10-30T10:19:36.588037Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/2e6042f5-1eda-499d-9e7d-706af16a4275` → **200**

```json
{
  "id": "2e6042f5-1eda-499d-9e7d-706af16a4275",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T10:19:36.588037Z",
  "card": {
    "id": "30b0916e-b892-4f37-87d4-6dfb62991ecc",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7683",
    "card_type": "Visa",
    "created_at": "2026-10-30T09:49:36.816616Z"
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
  "device_ref": "sandbox-22299"
}
```

```json
{
  "challenge_id": "fd69d1f2-08aa-457d-ade1-1558dda927b1",
  "expires_at": "2026-10-30T09:54:37.064751618Z",
  "resend_available_at": "2026-10-30T09:49:38.064751618Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "295547",
  "sent_at": "2026-10-30T09:49:37.067263334Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fd69d1f2-08aa-457d-ade1-1558dda927b1",
  "code": "295547",
  "device_ref": "sandbox-22299"
}
```

```json
{
  "session_id": "13a9ee12-7bc1-42b5-8b9d-0ce70efd0b7d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDY3NywiaWF0IjoxNzkzMzUzNzc3LCJqdGkiOiJjYjkzZTFjOC1lOGJiLTRkMzYtOTQ2OC0wNWVjOWNkMWU2ZmIiLCJzaWQiOiIxM2E5ZWUxMi03YmMxLTQyYjUtOGI5ZC0wY2U3MGVmZDBiN2QifQ.1cXiIWMQzoZe0LsTyrV438ANgDJID2G8_uqQr3nAVZQ",
  "access_expires_at": "2026-10-30T10:04:37.334161798Z",
  "refresh_token": "HIIu-BomwzH2is1xAcabKT4v2_-ZI0VtCOlM9R7HIe4",
  "refresh_expires_at": "2026-11-29T09:49:37.3337367Z",
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
  "command_id": "fad47e13-8f02-4c67-b56c-64888c072ef7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:49:37Z",
    "sequence": 1793353777777
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7692eb9a-2cc5-4385-ab05-2cb2e9d12e3c",
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
  "last_heartbeat_at": "2026-10-30T09:49:37.792179Z",
  "last_location_at": "2026-10-30T09:49:37.792179Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e3340a5b-d428-440e-a075-c626b34e3a76",
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
  "id": "156ca3a2-5eff-4c78-8472-cf64d9fa5886",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:54:38.028712Z",
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
  "command_id": "6dc3c0d2-d576-4efa-be4e-375e45ae1518",
  "quote_id": "156ca3a2-5eff-4c78-8472-cf64d9fa5886",
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
  "id": "7a271bb3-f826-4b38-9aa5-b585073617b8",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "3f58654c-ef54-4974-8c13-cd5299e9deb3",
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
  "created_at": "2026-10-30T09:49:38.255818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7a271bb3-f826-4b38-9aa5-b585073617b8` → **200**

```json
{
  "id": "7a271bb3-f826-4b38-9aa5-b585073617b8",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "3f58654c-ef54-4974-8c13-cd5299e9deb3",
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
  "created_at": "2026-10-30T09:49:38.255818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7a271bb3-f826-4b38-9aa5-b585073617b8` → **200**

```json
{
  "id": "7a271bb3-f826-4b38-9aa5-b585073617b8",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3f58654c-ef54-4974-8c13-cd5299e9deb3",
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
  "created_at": "2026-10-30T09:49:38.255818Z",
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
    "id": "2af92514-3a89-4680-b0d0-1819512181bb",
    "order_id": "7a271bb3-f826-4b38-9aa5-b585073617b8",
    "expires_at": "2026-10-30T09:49:54.191698Z",
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

`POST /api/driver/v1/offers/2af92514-3a89-4680-b0d0-1819512181bb/accept` → **200**

```json
{
  "command_id": "4cc3d826-e8bd-4024-8317-012292a36233"
}
```

```json
{
  "id": "5819136c-28cc-4b30-80cd-a8bc9e46dc35",
  "order_id": "7a271bb3-f826-4b38-9aa5-b585073617b8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8a8e9635-e0c9-47a4-ba9a-5b33d1ebb08b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8a8e9635-e0c9-47a4-ba9a-5b33d1ebb08b",
  "order_id": "7a271bb3-f826-4b38-9aa5-b585073617b8",
  "assignment_id": "5819136c-28cc-4b30-80cd-a8bc9e46dc35",
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

`POST /api/rider/v1/orders/7a271bb3-f826-4b38-9aa5-b585073617b8/messages` → **201**

```json
{
  "command_id": "1eef88a7-8ac2-4200-a986-8ed75af4f922",
  "body": "Я біля входу, мій номер +380737314237, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "fa488e78-218a-4d6b-9e77-5e0c996a0a45",
  "order_id": "7a271bb3-f826-4b38-9aa5-b585073617b8",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380737314237, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T09:49:40.64272822Z"
}
```

`POST /api/driver/v1/trips/8a8e9635-e0c9-47a4-ba9a-5b33d1ebb08b/messages` → **201**

```json
{
  "command_id": "3178d54b-a167-4b00-80f8-8f6efc6228d1",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "1b75edd4-2aef-4a9d-8001-9de4d29b89e3",
  "order_id": "7a271bb3-f826-4b38-9aa5-b585073617b8",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T09:49:40.874026397Z"
}
```

(the car drives 5 s to the next point)

`POST /api/driver/v1/work-sessions/7692eb9a-2cc5-4385-ab05-2cb2e9d12e3c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:49:46Z",
    "sequence": 1793353786107
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7692eb9a-2cc5-4385-ab05-2cb2e9d12e3c",
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
  "last_heartbeat_at": "2026-10-30T09:49:46.122704Z",
  "last_location_at": "2026-10-30T09:49:46.122704Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/8a8e9635-e0c9-47a4-ba9a-5b33d1ebb08b/arrive` → **200**

```json
{
  "command_id": "8718b2de-5832-4abb-b8a0-25e4852d3945",
  "expected_version": 0
}
```

```json
{
  "id": "8a8e9635-e0c9-47a4-ba9a-5b33d1ebb08b",
  "order_id": "7a271bb3-f826-4b38-9aa5-b585073617b8",
  "assignment_id": "5819136c-28cc-4b30-80cd-a8bc9e46dc35",
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
  "arrived_at": "2026-10-30T09:49:46.359299Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8a8e9635-e0c9-47a4-ba9a-5b33d1ebb08b/start` → **200**

```json
{
  "command_id": "c632b633-a736-43dc-9297-5f06ffb498df",
  "expected_version": 1
}
```

```json
{
  "id": "8a8e9635-e0c9-47a4-ba9a-5b33d1ebb08b",
  "order_id": "7a271bb3-f826-4b38-9aa5-b585073617b8",
  "assignment_id": "5819136c-28cc-4b30-80cd-a8bc9e46dc35",
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
  "arrived_at": "2026-10-30T09:49:46.359299Z",
  "started_at": "2026-10-30T09:49:46.593278Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 91 s to the next point)

`POST /api/driver/v1/work-sessions/7692eb9a-2cc5-4385-ab05-2cb2e9d12e3c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:51:17Z",
    "sequence": 1793353877826
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7692eb9a-2cc5-4385-ab05-2cb2e9d12e3c",
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
  "last_heartbeat_at": "2026-10-30T09:51:17.841629Z",
  "last_location_at": "2026-10-30T09:51:17.841629Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/8a8e9635-e0c9-47a4-ba9a-5b33d1ebb08b/complete` → **200**

```json
{
  "command_id": "68be93fb-378a-4cf1-a9c7-a57c8513eee2",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:51:18Z",
  "cash_received": false
}
```

```json
{
  "id": "8a8e9635-e0c9-47a4-ba9a-5b33d1ebb08b",
  "order_id": "7a271bb3-f826-4b38-9aa5-b585073617b8",
  "assignment_id": "5819136c-28cc-4b30-80cd-a8bc9e46dc35",
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
  "arrived_at": "2026-10-30T09:49:46.359299Z",
  "started_at": "2026-10-30T09:49:46.593278Z",
  "completed_at": "2026-10-30T09:51:18.076748Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/7a271bb3-f826-4b38-9aa5-b585073617b8` → **200**

```json
{
  "id": "7a271bb3-f826-4b38-9aa5-b585073617b8",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "3f58654c-ef54-4974-8c13-cd5299e9deb3",
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
    "id": "5819136c-28cc-4b30-80cd-a8bc9e46dc35",
    "order_id": "7a271bb3-f826-4b38-9aa5-b585073617b8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "8a8e9635-e0c9-47a4-ba9a-5b33d1ebb08b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:49:38.255818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7a271bb3-f826-4b38-9aa5-b585073617b8` → **200**

```json
{
  "id": "7a271bb3-f826-4b38-9aa5-b585073617b8",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "3f58654c-ef54-4974-8c13-cd5299e9deb3",
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
    "id": "5819136c-28cc-4b30-80cd-a8bc9e46dc35",
    "order_id": "7a271bb3-f826-4b38-9aa5-b585073617b8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "8a8e9635-e0c9-47a4-ba9a-5b33d1ebb08b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:49:38.255818Z",
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
  "session_id": "7692eb9a-2cc5-4385-ab05-2cb2e9d12e3c",
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
  "last_heartbeat_at": "2026-10-30T09:51:17.841629Z",
  "last_location_at": "2026-10-30T09:51:17.841629Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7692eb9a-2cc5-4385-ab05-2cb2e9d12e3c/close` → **200**

```json
{
  "command_id": "8750dcce-ef54-4dce-a8b1-4485ad4983ed",
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
  "session_id": "bdf61e7f-c975-4106-a3e6-8cdd4008f013",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ3ODAsImlhdCI6MTc5MzM1Mzg4MCwianRpIjoiYWQ5MmVjODUtMzE0Zi00ZDFkLWFlNmEtZTZmNTZhZDVkOGNjIiwic2lkIjoiYmRmNjFlN2YtYzk3NS00MTA2LWEzZTYtOGNkZDQwMDhmMDEzIn0.shq1bLC5YnFfX5uMf-vUFgjL0wbd_1VIa_mYJ6upxVE",
  "access_expires_at": "2026-10-30T10:06:20.495057185Z",
  "refresh_token": "gDwC4L1FwkvP_nQmKi0J0sO_JjUTJytF3aVa4Z6kMMk",
  "refresh_expires_at": "2026-10-30T21:51:20.494687756Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/7a271bb3-f826-4b38-9aa5-b585073617b8/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/7a271bb3-f826-4b38-9aa5-b585073617b8/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "7f903947-dcfd-4e39-b840-50be78551822"
}
```

`GET /api/admin/v1/orders/7a271bb3-f826-4b38-9aa5-b585073617b8/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T09:51:20.951411198Z",
  "order": {
    "id": "7a271bb3-f826-4b38-9aa5-b585073617b8",
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
    "created_at": "2026-10-30T09:49:38.255818Z",
    "assigned_at": "2026-10-30T09:49:40.193359Z",
    "arrived_at": "2026-10-30T09:49:46.359299Z",
    "started_at": "2026-10-30T09:49:46.593278Z",
    "completed_at": "2026-10-30T09:51:18.076748Z"
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
    "id": "3f58654c-ef54-4974-8c13-cd5299e9deb3",
    "registered_at": "2026-10-30T09:49:36.361984Z",
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
      "created_at": "2026-10-30T09:49:38.257739Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T09:51:18.347303Z"
    }
  ],
  "chat": [
    {
```

**The evidence carries a phone or card number.**

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
  "session_id": "870d59c3-04cf-459a-be74-0612740846d5",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ3ODEsImlhdCI6MTc5MzM1Mzg4MSwianRpIjoiODQ3YTAwZmItNzYxMy00MDM3LWE1NzgtZTlhMDA1NWUxNzEwIiwic2lkIjoiODcwZDU5YzMtMDRjZi00NTlhLWJlNzQtMDYxMjc0MDg0NmQ1In0.CXGnN9pLi_ch4sixDP9zcOSH0FCwQTcmzRzVFs4ROxM",
  "access_expires_at": "2026-10-30T10:06:21.721357536Z",
  "refresh_token": "cHQbufjC3BbKCTcHmDLZGe7OjU_7AWuzshhcwlCgPK8",
  "refresh_expires_at": "2026-10-30T21:51:21.720941649Z",
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
  "phone": "+48600956119",
  "device_ref": "sandbox-5673"
}
```

```json
{
  "challenge_id": "b4f0f806-7589-4ea3-8b1e-60b2a8558d56",
  "expires_at": "2026-10-30T09:56:22.413531472Z",
  "resend_available_at": "2026-10-30T09:51:23.413531472Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600956119` → **200**

```json
{
  "phone": "+48600956119",
  "audience": "CLIENT",
  "code": "402422",
  "sent_at": "2026-10-30T09:51:22.415722176Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b4f0f806-7589-4ea3-8b1e-60b2a8558d56",
  "code": "402422",
  "device_ref": "sandbox-5673"
}
```

```json
{
  "session_id": "33912537-f47f-4a1d-83cc-e8f4e5a7e25f",
  "subject": {
    "type": "CLIENT",
    "id": "4b9f447a-1cc2-4a86-bc09-afa59c9a7deb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YjlmNDQ3YS0xY2MyLTRhODYtYmMwOS1hZmE1OWM5YTdkZWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NzgyLCJpYXQiOjE3OTMzNTM4ODIsImp0aSI6ImM3MmI0N2I5LWU5YzgtNDk2My05ODQwLWU0MjdiZGRiM2QxMyIsInNpZCI6IjMzOTEyNTM3LWY0N2YtNGExZC04M2NjLWU4ZjRlNWE3ZTI1ZiJ9.XNkG0P_XOtq6Lt-BQE-A3oxdsFPeR6Oq6Ua5IznQgyo",
  "access_expires_at": "2026-10-30T10:06:22.656635855Z",
  "refresh_token": "lLrJ8f6ubBWfk81d32SZcznk1WldHGVHhaLvMRU95V8",
  "refresh_expires_at": "2026-11-29T09:51:22.656189875Z",
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
  "command_id": "1a9ce625-a0ce-435b-9cf7-2c52551951f9",
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
  "correlation_id": "e1e8ecef-c2c6-4e2a-964b-ebf9fbc0a612",
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
  "command_id": "4eb21fb5-aaf5-4d1f-81db-0f9376a8982d",
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
  "paused_at": "2026-10-30T09:51:23.542809249Z",
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
  "command_id": "8310c9ca-804f-4d7f-9cc2-770f37a772b2",
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
  "id": "9354d9d0-9e72-434d-86fe-bf5d45ef63d8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:56:24.008559Z",
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
  "command_id": "f0417f04-2fdc-4aac-841f-8dba9ece54e9",
  "quote_id": "9354d9d0-9e72-434d-86fe-bf5d45ef63d8",
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
  "correlation_id": "b3b9af25-dd5f-470a-b277-ff184937dd0b"
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
  "paused_at": "2026-10-30T09:51:23.542809Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "eea5a0ec-c504-4532-a15d-3eac724798f5",
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
  "command_id": "9c3edf24-2f2b-4314-a684-7125f0cb72fd",
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
  "command_id": "0d8b1ad9-d9fb-4e65-b446-f75f31b9e08c",
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
  "id": "a73fb821-eeae-4779-8141-0a62ce82c12e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:56:25.365783Z",
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
  "command_id": "02916b9b-8f9e-42af-bd37-e21c0a15b77d",
  "quote_id": "a73fb821-eeae-4779-8141-0a62ce82c12e",
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
  "correlation_id": "19644e61-e55f-48a1-8ca8-39c483605f05"
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
  "command_id": "96c5f01a-2a8c-4b04-a7c9-cbf001ae6ea9",
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
      "from": "12:00",
      "to": "13:00"
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
      "from": "12:00",
      "to": "13:00"
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
  "command_id": "4f0938bb-b41e-417b-9b5f-85b96f8e21ac",
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
  "id": "fcd4e191-4577-4123-890f-d2ee3627ff67",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:56:26.274550Z",
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
  "command_id": "f399d99a-f593-4ce4-b7a9-0fb683c984aa",
  "quote_id": "fcd4e191-4577-4123-890f-d2ee3627ff67",
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
  "correlation_id": "b7bc1ee5-f146-438d-992a-3402312dc574"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "13dffc01-4ec1-4d01-a496-a7c6186455d8",
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
  "correlation_id": "7a403d0c-90ed-4077-9d26-ab144c2afd61"
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
      "from": "12:00",
      "to": "13:00"
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
  "command_id": "e9ebeacb-80f9-4af0-b529-23279ba0bf4d",
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
  "phone": "+380671685946",
  "device_ref": "sandbox-9022"
}
```

```json
{
  "challenge_id": "ae69569b-a1c4-496c-9b0e-05597d663985",
  "expires_at": "2026-10-30T09:56:27.437638333Z",
  "resend_available_at": "2026-10-30T09:51:28.437638333Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671685946` → **200**

```json
{
  "phone": "+380671685946",
  "audience": "CLIENT",
  "code": "431884",
  "sent_at": "2026-10-30T09:51:27.439739939Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ae69569b-a1c4-496c-9b0e-05597d663985",
  "code": "431884",
  "device_ref": "sandbox-9022"
}
```

```json
{
  "session_id": "1fc7a257-d4c5-4466-8deb-2d7fc9b1a6d6",
  "subject": {
    "type": "CLIENT",
    "id": "9aae438d-e4cb-4653-a0b3-7de4f3ead5b0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YWFlNDM4ZC1lNGNiLTQ2NTMtYTBiMy03ZGU0ZjNlYWQ1YjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0Nzg3LCJpYXQiOjE3OTMzNTM4ODcsImp0aSI6IjZjMzQyNmU5LTY5NDMtNGM4My1iM2IyLWIyY2M1N2YyNzJkZiIsInNpZCI6IjFmYzdhMjU3LWQ0YzUtNDQ2Ni04ZGViLTJkN2ZjOWIxYTZkNiJ9.oXzb79C9bxhyKgOhUQ73ILlXEzTMf7weMCQ4nRFdHkc",
  "access_expires_at": "2026-10-30T10:06:27.679947174Z",
  "refresh_token": "MxaggUPQ0NQbe_9WrOAXwdMBxP1X7eYLs1R5C16e9P8",
  "refresh_expires_at": "2026-11-29T09:51:27.679460672Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9aae438d-e4cb-4653-a0b3-7de4f3ead5b0",
  "session_id": "1fc7a257-d4c5-4466-8deb-2d7fc9b1a6d6",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4d3f85b9-f44c-4855-ba68-eccd75d38da6",
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
  "id": "28c1c44b-b3d1-4119-ac12-5d5ab8bf1525",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:56:28.117204Z",
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
  "challenge_id": "00d318eb-9371-4f9d-a556-94354795422b",
  "expires_at": "2026-10-30T09:56:30.351874921Z",
  "resend_available_at": "2026-10-30T09:51:31.351874921Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671685946` → **200**

```json
{
  "phone": "+380671685946",
  "audience": "CLIENT",
  "code": "951100",
  "sent_at": "2026-10-30T09:51:30.354207079Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "feb6e417-773a-43cb-8dc4-7e71fc051c06",
  "challenge_id": "00d318eb-9371-4f9d-a556-94354795422b",
  "otp_code": "951100"
}
```

```json
{
  "client_id": "9aae438d-e4cb-4653-a0b3-7de4f3ead5b0",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T09:51:30.611015848Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "18766519-b2c9-4d03-aac4-93ed8dbca2c3",
  "quote_id": "28c1c44b-b3d1-4119-ac12-5d5ab8bf1525",
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
  "correlation_id": "67e568c7-5f62-4dbd-bb14-be119842ef1d"
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
  "session_id": "23eb30a9-bb17-40ae-a87c-6701c5f88b68",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ3OTEsImlhdCI6MTc5MzM1Mzg5MSwianRpIjoiODZmOTUzYTItNGQwNS00ZGQzLWFkYzktY2UxMGQ2YjM1NTcxIiwic2lkIjoiMjNlYjMwYTktYmIxNy00MGFlLWE4N2MtNjcwMWM1Zjg4YjY4In0.stuhZBKikDx_XIzqCEy-bhwh-BnWLXvmlNI784v3flI",
  "access_expires_at": "2026-10-30T10:06:31.33495962Z",
  "refresh_token": "Pky8Vzr_HUUSkI0vYbR9K6ZTAjg4a-yGb5EtiSDbacs",
  "refresh_expires_at": "2026-10-30T21:51:31.334580908Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "9aae438d-e4cb-4653-a0b3-7de4f3ead5b0",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T09:51:30.611016Z",
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

`POST /api/admin/v1/client-deletions/9aae438d-e4cb-4653-a0b3-7de4f3ead5b0/complete` → **200**

```json
{
  "command_id": "017ede62-5b0a-4738-9fad-783f8b8ef242",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "9aae438d-e4cb-4653-a0b3-7de4f3ead5b0",
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
  "correlation_id": "2aa15e7b-f943-428c-95cf-7c732b7c7951"
}
```

Done: client 9aae438d-e4cb-4653-a0b3-7de4f3ead5b0 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666727171",
  "device_ref": "sandbox-17076"
}
```

```json
{
  "challenge_id": "1972f446-c486-4930-ac39-cf008f2222e5",
  "expires_at": "2026-10-30T09:56:32.314776012Z",
  "resend_available_at": "2026-10-30T09:51:33.314776012Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666727171` → **200**

```json
{
  "phone": "+380666727171",
  "audience": "CLIENT",
  "code": "863961",
  "sent_at": "2026-10-30T09:51:32.317659621Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1972f446-c486-4930-ac39-cf008f2222e5",
  "code": "863961",
  "device_ref": "sandbox-17076"
}
```

```json
{
  "session_id": "6df1f8ea-cc26-4278-b42e-2dd450ea8de3",
  "subject": {
    "type": "CLIENT",
    "id": "5d8e501a-b1bf-4e2e-a546-0f15c73dbcb2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDhlNTAxYS1iMWJmLTRlMmUtYTU0Ni0wZjE1YzczZGJjYjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NzkyLCJpYXQiOjE3OTMzNTM4OTIsImp0aSI6Ijg1NDQzNTRmLTEyN2MtNGRhYi05YWNlLTJhZWFiZWNhMDYwNyIsInNpZCI6IjZkZjFmOGVhLWNjMjYtNDI3OC1iNDJlLTJkZDQ1MGVhOGRlMyJ9.GdTKBrTwaqS7I1apZf1oJKRJZVq45se3P7TCqBcKKvY",
  "access_expires_at": "2026-10-30T10:06:32.564528204Z",
  "refresh_token": "znN0picF5sOO0EB2qZAuL8bkSR41KJ9fCfbyNNS5yjc",
  "refresh_expires_at": "2026-11-29T09:51:32.564103807Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "5d8e501a-b1bf-4e2e-a546-0f15c73dbcb2",
  "session_id": "6df1f8ea-cc26-4278-b42e-2dd450ea8de3",
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
  "session_id": "e99c66b7-2671-4af6-9667-490537b66a85",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ3OTMsImlhdCI6MTc5MzM1Mzg5MywianRpIjoiYzViNWRhZGMtZWQ3NS00ZTgwLTljNjEtNDYyNzg5M2FlMjEwIiwic2lkIjoiZTk5YzY2YjctMjY3MS00YWY2LTk2NjctNDkwNTM3YjY2YTg1In0.TWGpI0f-wUJLH1LyAHTB7eMabmfWTGi__q6agXJb6w4",
  "access_expires_at": "2026-10-30T10:06:33.282194803Z",
  "refresh_token": "JmdzVHeYvy2vFyEDOeLNxSkUMclnpLnM6R2ltlefhC8",
  "refresh_expires_at": "2026-10-30T21:51:33.281725693Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=6727171&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "5d8e501a-b1bf-4e2e-a546-0f15c73dbcb2",
      "phone": "+380666727171",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T09:51:32.562457Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/5d8e501a-b1bf-4e2e-a546-0f15c73dbcb2` → **200**

```json
{
  "client": {
    "id": "5d8e501a-b1bf-4e2e-a546-0f15c73dbcb2",
    "phone": "+380666727171",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:51:32.562457Z",
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

`POST /api/admin/v1/clients/5d8e501a-b1bf-4e2e-a546-0f15c73dbcb2/block` → **400**

```json
{
  "command_id": "7d308234-77ae-4d09-86d3-3722ffba8c6c",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/5d8e501a-b1bf-4e2e-a546-0f15c73dbcb2/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "bed6d0c4-9414-4e6e-a802-23ab0e100089",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/5d8e501a-b1bf-4e2e-a546-0f15c73dbcb2/block` → **200**

```json
{
  "command_id": "97c4a7e5-9841-4da1-902e-d68124393307",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "5d8e501a-b1bf-4e2e-a546-0f15c73dbcb2",
  "phone": "+380666727171",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T09:51:32.562457Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T09:51:34.236362Z",
    "by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
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
  "correlation_id": "bad6743c-70e8-4737-b776-06f54f5d972c"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666727171",
  "device_ref": "sandbox-10668"
}
```

```json
{
  "challenge_id": "10d5664b-1911-4da2-a417-c3e4ae954dd3",
  "expires_at": "2026-10-30T09:56:36.693704314Z",
  "resend_available_at": "2026-10-30T09:51:37.693704314Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666727171` → **200**

```json
{
  "phone": "+380666727171",
  "audience": "CLIENT",
  "code": "908260",
  "sent_at": "2026-10-30T09:51:36.695798618Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "10d5664b-1911-4da2-a417-c3e4ae954dd3",
  "code": "908260",
  "device_ref": "sandbox-10668"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "01ad04a9-4763-4a27-8de5-0493a067db2c"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/5d8e501a-b1bf-4e2e-a546-0f15c73dbcb2` → **200**

```json
{
  "client": {
    "id": "5d8e501a-b1bf-4e2e-a546-0f15c73dbcb2",
    "phone": "+380666727171",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T09:51:32.562457Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T09:51:34.236362Z",
      "by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
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

`POST /api/admin/v1/clients/5d8e501a-b1bf-4e2e-a546-0f15c73dbcb2/unblock` → **200**

```json
{
  "command_id": "73fbe908-9e64-4fe5-8539-3aa6b218ffac",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "5d8e501a-b1bf-4e2e-a546-0f15c73dbcb2",
  "phone": "+380666727171",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T09:51:32.562457Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666727171",
  "device_ref": "sandbox-22059"
}
```

```json
{
  "challenge_id": "a7a592be-4408-4dad-b9eb-02874bb4eb15",
  "expires_at": "2026-10-30T09:56:39.656167063Z",
  "resend_available_at": "2026-10-30T09:51:40.656167063Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666727171` → **200**

```json
{
  "phone": "+380666727171",
  "audience": "CLIENT",
  "code": "565128",
  "sent_at": "2026-10-30T09:51:39.658243501Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a7a592be-4408-4dad-b9eb-02874bb4eb15",
  "code": "565128",
  "device_ref": "sandbox-22059"
}
```

```json
{
  "session_id": "dd881670-9c81-40f9-a9f8-036d89b26373",
  "subject": {
    "type": "CLIENT",
    "id": "5d8e501a-b1bf-4e2e-a546-0f15c73dbcb2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDhlNTAxYS1iMWJmLTRlMmUtYTU0Ni0wZjE1YzczZGJjYjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0Nzk5LCJpYXQiOjE3OTMzNTM4OTksImp0aSI6ImU5NzA0YWRmLWFiNjAtNGEzNy1hOWJhLWRkMDgyYTFhMjRlOCIsInNpZCI6ImRkODgxNjcwLTljODEtNDBmOS1hOWY4LTAzNmQ4OWIyNjM3MyJ9.CzPZBvDQSM3wEMhhAVT9gLUlJq42MB52GWB1YaRD71I",
  "access_expires_at": "2026-10-30T10:06:39.903660067Z",
  "refresh_token": "Ik6N1f5G1XfKwlF1iGxhjrvWt1hp1rq7UUDo9_yvYMo",
  "refresh_expires_at": "2026-11-29T09:51:39.90329283Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "5d8e501a-b1bf-4e2e-a546-0f15c73dbcb2",
  "session_id": "dd881670-9c81-40f9-a9f8-036d89b26373",
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
  "phone": "+380664996803",
  "device_ref": "sandbox-13675"
}
```

```json
{
  "challenge_id": "e9e022db-51a1-460d-8144-176a073f4b0a",
  "expires_at": "2026-10-30T09:56:40.348526219Z",
  "resend_available_at": "2026-10-30T09:51:41.348526219Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664996803` → **200**

```json
{
  "phone": "+380664996803",
  "audience": "CLIENT",
  "code": "698207",
  "sent_at": "2026-10-30T09:51:40.350599671Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9e022db-51a1-460d-8144-176a073f4b0a",
  "code": "698207",
  "device_ref": "sandbox-13675"
}
```

```json
{
  "session_id": "9e300af6-bb87-4439-a020-1c1cae2d3078",
  "subject": {
    "type": "CLIENT",
    "id": "ab2e680f-8802-42db-bfdb-3ff3beac1fe6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYjJlNjgwZi04ODAyLTQyZGItYmZkYi0zZmYzYmVhYzFmZTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0ODAwLCJpYXQiOjE3OTMzNTM5MDAsImp0aSI6ImYwMmExMGQ4LWMwZDAtNDZlOS1hN2Q5LWYwMDlmODAxNTM2YyIsInNpZCI6IjllMzAwYWY2LWJiODctNDQzOS1hMDIwLTFjMWNhZTJkMzA3OCJ9.VrSxDBd5cWOoPOFKwxrvNuN-HjuVWH7ttCwQclmj9Cs",
  "access_expires_at": "2026-10-30T10:06:40.589887913Z",
  "refresh_token": "iq1PZC3J5q5GgWvJFQc7t6XZGi9QFIgxbI1V1N8HBHQ",
  "refresh_expires_at": "2026-11-29T09:51:40.589553991Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "85e4b1be-9069-4dd0-98d2-5e9fd5c0257e",
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
  "id": "a5649b51-4bea-4fe3-99c6-106ee81f06da",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:56:40.819976Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: f5646c61-303b-47b0-bfa9-0459b39704df) → **201**

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
  "session_id": "b774b1dc-a082-4e0e-a8af-901b950d25de",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ4MDEsImlhdCI6MTc5MzM1MzkwMSwianRpIjoiNWMzODBlMzctZTE3NC00MjllLWI4NTUtOGRlZTMxMmFlYmEzIiwic2lkIjoiYjc3NGIxZGMtYTA4Mi00ZTBlLWE4YWYtOTAxYjk1MGQyNWRlIn0.uYtGQjKBMLtBMvk6aPp_67YrD2y9y6lxP3pb-94bT5c",
  "access_expires_at": "2026-10-30T10:06:41.340313742Z",
  "refresh_token": "BEpzb34qvkCa765A5JU_ZAeFW0SYW31JDz0MHoioewM",
  "refresh_expires_at": "2026-10-30T21:51:41.339749444Z",
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
  "session_id": "769fecb8-eb46-47f4-a118-04ea4f38f300",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ4MDEsImlhdCI6MTc5MzM1MzkwMSwianRpIjoiZjIxOGY3OWItYTVhZi00MTBlLWJjNTMtZTJiMzI1ZDMxMmZkIiwic2lkIjoiNzY5ZmVjYjgtZWI0Ni00N2Y0LWExMTgtMDRlYTRmMzhmMzAwIn0.KiVBF2lloB2EIbXE5xfdECg-rfqA2Lvx1JV4irNLe_c",
  "access_expires_at": "2026-10-30T10:06:41.844071938Z",
  "refresh_token": "Zosuv_8Yz_ZGGJHnYIGvrQyfUdc0aR41XKckboq--nM",
  "refresh_expires_at": "2026-10-30T21:51:41.843698324Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/3e28d7c7-0ae6-4e91-a00e-ba936b9351d3/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:51:41.052471Z",
      "actor": {
        "type": "CLIENT",
        "id": "ab2e680f-8802-42db-bfdb-3ff3beac1fe6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "3e28d7c7-0ae6-4e91-a00e-ba936b9351d3",
        "quote_id": "a5649b51-4bea-4fe3-99c6-106ee81f06da",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "f5646c61-303b-47b0-bfa9-0459b39704df"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:51:41.053714Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3e28d7c7-0ae6-4e91-a00e-ba936b9351d3",
        "attempt_id": "d1827fd0-4ad9-42d0-af28-01a33b71e915",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f5646c61-303b-47b0-bfa9-0459b39704df"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T09:51:41.056707Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3e28d7c7-0ae6-4e91-a00e-ba936b9351d3",
        "attempt_id": "d1827fd0-4ad9-42d0-af28-01a33b71e915"
      },
      "correlation_id": "f5646c61-303b-47b0-bfa9-0459b39704df"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "d1827fd0-4ad9-42d0-af28-01a33b71e915",
        "generation": 1,
        "started_at": "2026-10-30T09:51:41.053054Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T09:51:41.056707Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T09:51:41.054176Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/f5646c61-303b-47b0-bfa9-0459b39704df` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "3e28d7c7-0ae6-4e91-a00e-ba936b9351d3:0",
      "order_id": "3e28d7c7-0ae6-4e91-a00e-ba936b9351d3",
      "at": "2026-10-30T09:51:41.052471Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "3e28d7c7-0ae6-4e91-a00e-ba936b9351d3:1",
      "order_id": "3e28d7c7-0ae6-4e91-a00e-ba936b9351d3",
      "at": "2026-10-30T09:51:41.053714Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "3e28d7c7-0ae6-4e91-a00e-ba936b9351d3:2",
      "order_id": "3e28d7c7-0ae6-4e91-a00e-ba936b9351d3",
      "at": "2026-10-30T09:51:41.056707Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/9986c398-952c-4ccf-8268-5291cd7a6335` → **200**

```json
{
  "found": []
}
```

Done: request f5646c61-303b-47b0-bfa9-0459b39704df — order 3e28d7c7-0ae6-4e91-a00e-ba936b9351d3 found by its id.

`GET /api/rider/v1/orders/3e28d7c7-0ae6-4e91-a00e-ba936b9351d3` → **200**

```json
{
  "id": "3e28d7c7-0ae6-4e91-a00e-ba936b9351d3",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ab2e680f-8802-42db-bfdb-3ff3beac1fe6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:51:41.052018Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3e28d7c7-0ae6-4e91-a00e-ba936b9351d3/cancel` → **200**

```json
{
  "command_id": "57b8aafd-3758-494c-ba3d-b5dd967e8762",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3e28d7c7-0ae6-4e91-a00e-ba936b9351d3",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ab2e680f-8802-42db-bfdb-3ff3beac1fe6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:51:41.052018Z",
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
  "phone": "+380631836239",
  "device_ref": "sandbox-11745"
}
```

```json
{
  "challenge_id": "4889b92f-b680-4235-bed0-cfb96f3f57ed",
  "expires_at": "2026-10-30T09:56:43.238668742Z",
  "resend_available_at": "2026-10-30T09:51:44.238668742Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631836239` → **200**

```json
{
  "phone": "+380631836239",
  "audience": "CLIENT",
  "code": "891932",
  "sent_at": "2026-10-30T09:51:43.240838787Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4889b92f-b680-4235-bed0-cfb96f3f57ed",
  "code": "891932",
  "device_ref": "sandbox-11745"
}
```

```json
{
  "session_id": "1024df28-99b5-4c39-b899-4141e3a63dcb",
  "subject": {
    "type": "CLIENT",
    "id": "1f66514c-9a71-4ae2-82bd-172809fd785d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjY2NTE0Yy05YTcxLTRhZTItODJiZC0xNzI4MDlmZDc4NWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0ODAzLCJpYXQiOjE3OTMzNTM5MDMsImp0aSI6IjI4Zjk0N2RlLWQzODctNGM0Zi1hZDNjLWJlNTVkZGY3NjE3OCIsInNpZCI6IjEwMjRkZjI4LTk5YjUtNGMzOS1iODk5LTQxNDFlM2E2M2RjYiJ9.C_UXgCLDqdlyEKSVmljnVX7qBmd51M67EtzkwfBxhPM",
  "access_expires_at": "2026-10-30T10:06:43.483160392Z",
  "refresh_token": "BJiPCSNOHVWrc4tm6YCp7GPOop95cqH_3PR-tvoyzdE",
  "refresh_expires_at": "2026-11-29T09:51:43.482711154Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "3cbe29b6-e1c4-439f-9f9d-084d8daafff7",
  "expires_at": "2026-10-30T09:56:45.699706574Z",
  "resend_available_at": "2026-10-30T09:51:46.699706574Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631836239` → **200**

```json
{
  "phone": "+380631836239",
  "audience": "CLIENT",
  "code": "174833",
  "sent_at": "2026-10-30T09:51:45.701658677Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "8ebe04b6-5886-4d85-a7b4-60c766f7a2cb",
  "challenge_id": "3cbe29b6-e1c4-439f-9f9d-084d8daafff7",
  "otp_code": "174833"
}
```

```json
{
  "id": "65246920-e46b-4a07-83e6-0fc51e8be736",
  "state": "PENDING",
  "created_at": "2026-10-30T09:51:45.956777Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/65246920-e46b-4a07-83e6-0fc51e8be736` → **200**

```json
{
  "id": "65246920-e46b-4a07-83e6-0fc51e8be736",
  "state": "PENDING",
  "created_at": "2026-10-30T09:51:45.956777Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/65246920-e46b-4a07-83e6-0fc51e8be736` → **200**

```json
{
  "id": "65246920-e46b-4a07-83e6-0fc51e8be736",
  "state": "PENDING",
  "created_at": "2026-10-30T09:51:45.956777Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/65246920-e46b-4a07-83e6-0fc51e8be736` → **200**

```json
{
  "id": "65246920-e46b-4a07-83e6-0fc51e8be736",
  "state": "READY",
  "created_at": "2026-10-30T09:51:45.956777Z",
  "ready_at": "2026-10-30T09:51:48.137383Z",
  "expires_at": "2026-11-06T09:51:48.137383Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/65246920-e46b-4a07-83e6-0fc51e8be736/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636480018",
  "device_ref": "sandbox-8707"
}
```

```json
{
  "challenge_id": "e69f5cda-0fc9-4028-82eb-0c9f90327502",
  "expires_at": "2026-10-30T09:56:48.871843366Z",
  "resend_available_at": "2026-10-30T09:51:49.871843366Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636480018` → **200**

```json
{
  "phone": "+380636480018",
  "audience": "CLIENT",
  "code": "233765",
  "sent_at": "2026-10-30T09:51:48.874237582Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e69f5cda-0fc9-4028-82eb-0c9f90327502",
  "code": "233765",
  "device_ref": "sandbox-8707"
}
```

```json
{
  "session_id": "c1b5f5b6-333d-446b-8afd-da6aa89e9047",
  "subject": {
    "type": "CLIENT",
    "id": "2eb07a9e-3ae9-4127-82db-570325baa186"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZWIwN2E5ZS0zYWU5LTQxMjctODJkYi01NzAzMjViYWExODYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0ODA5LCJpYXQiOjE3OTMzNTM5MDksImp0aSI6ImViNTA5NjA2LTI1ODEtNDAwOS04YzZlLTA4NmZkMTNhM2Q1NSIsInNpZCI6ImMxYjVmNWI2LTMzM2QtNDQ2Yi04YWZkLWRhNmFhODllOTA0NyJ9.pMDanHt6hoxfPVi4_wp1J_cSgJuccZDFo3Ss-DA3kUY",
  "access_expires_at": "2026-10-30T10:06:49.118290108Z",
  "refresh_token": "hJFm9VKCxjHmoaRMN6RWF8QC13sTtTWMUbquCMZy-cg",
  "refresh_expires_at": "2026-11-29T09:51:49.11760594Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/65246920-e46b-4a07-83e6-0fc51e8be736/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/65246920-e46b-4a07-83e6-0fc51e8be736/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0226b5c7-239c-4e1b-8c49-47da1fd23200"
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
  "session_id": "3d1df06d-17d9-4f35-ab2c-5f21a7a3e32e",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ4MDksImlhdCI6MTc5MzM1MzkwOSwianRpIjoiNjQxN2UxNmQtOTIzOC00M2RmLTgxMTItODAyZWQyM2NhODZlIiwic2lkIjoiM2QxZGYwNmQtMTdkOS00ZjM1LWFiMmMtNWYyMWE3YTNlMzJlIn0.R15D68QmqfpPqNP-rDdcvENhdLFhY8D_nfF581xMhTU",
  "access_expires_at": "2026-10-30T10:06:49.831253895Z",
  "refresh_token": "gK0O-X4bLM2RgvW6fhyGsxNnKEh-3zMweP-Fn1g16C8",
  "refresh_expires_at": "2026-10-30T21:51:49.830821148Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1f66514c-9a71-4ae2-82bd-172809fd785d",
  "session_id": "1024df28-99b5-4c39-b899-4141e3a63dcb",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/1f66514c-9a71-4ae2-82bd-172809fd785d/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "65246920-e46b-4a07-83e6-0fc51e8be736",
      "state": "READY",
      "created_at": "2026-10-30T09:51:45.956777Z",
      "ready_at": "2026-10-30T09:51:48.137383Z",
      "expires_at": "2026-11-06T09:51:48.137383Z",
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
  "device_ref": "sandbox-11715"
}
```

```json
{
  "challenge_id": "cf2811bc-3e29-4d28-b190-8d21b417e978",
  "expires_at": "2026-10-30T09:56:50.513767622Z",
  "resend_available_at": "2026-10-30T09:51:51.513767622Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "609963",
  "sent_at": "2026-10-30T09:51:50.5160356Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cf2811bc-3e29-4d28-b190-8d21b417e978",
  "code": "609963",
  "device_ref": "sandbox-11715"
}
```

```json
{
  "session_id": "c486e9ac-7124-479b-bbf9-4a89726f89ed",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDgxMCwiaWF0IjoxNzkzMzUzOTEwLCJqdGkiOiIwMDdkNjU3MC03ODk3LTRhYjAtODMyOS00YWUwMWExNWQ5YWIiLCJzaWQiOiJjNDg2ZTlhYy03MTI0LTQ3OWItYmJmOS00YTg5NzI2Zjg5ZWQifQ.I0rMxkqgg3Gk9Zlvv8NVToyTCxWt2ZyKeIs4II4ekWU",
  "access_expires_at": "2026-10-30T10:06:50.761403847Z",
  "refresh_token": "7R0vD3Vz9whZov_edpbV0GtjYKCWGfSDMoWS5Al_KWo",
  "refresh_expires_at": "2026-11-29T09:51:50.760990341Z",
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
  "device_ref": "sandbox-30814"
}
```

```json
{
  "challenge_id": "cdb183ad-416b-4f3a-97fd-6ceae1acfe11",
  "expires_at": "2026-10-30T09:56:51.206746167Z",
  "resend_available_at": "2026-10-30T09:51:52.206746167Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "082485",
  "sent_at": "2026-10-30T09:51:51.209001189Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cdb183ad-416b-4f3a-97fd-6ceae1acfe11",
  "code": "082485",
  "device_ref": "sandbox-30814"
}
```

```json
{
  "session_id": "95ca90a5-e7ad-4777-8284-4855ce38f64b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDgxMSwiaWF0IjoxNzkzMzUzOTExLCJqdGkiOiJlNGUyOTVjOS1hYmVkLTQwMjQtOTcxZS00YmZmM2E5NjFiNDkiLCJzaWQiOiI5NWNhOTBhNS1lN2FkLTQ3NzctODI4NC00ODU1Y2UzOGY2NGIifQ.wKTVmn7vowx_828YCGdRxXZBv0EveCKnDdx20euavcM",
  "access_expires_at": "2026-10-30T10:06:51.499342288Z",
  "refresh_token": "O9Hcw2HeXuj0Y7Ru6-koP-NnOdEfiGA5WFmLIqfZh7I",
  "refresh_expires_at": "2026-11-29T09:51:51.498750784Z",
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
  "command_id": "bbb32b13-be34-4912-8787-cc1cbc4b4a7c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:51:51Z",
    "sequence": 1793353911969
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19c08d63-10de-444a-893a-c542615e566f",
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
  "last_heartbeat_at": "2026-10-30T09:51:51.984369Z",
  "last_location_at": "2026-10-30T09:51:51.984369Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-22252"
}
```

```json
{
  "challenge_id": "f6270dfc-2e57-4cd1-89e1-3503a22aa83c",
  "expires_at": "2026-10-30T09:56:52.2118806Z",
  "resend_available_at": "2026-10-30T09:51:53.2118806Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "727073",
  "sent_at": "2026-10-30T09:51:52.214191375Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f6270dfc-2e57-4cd1-89e1-3503a22aa83c",
  "code": "727073",
  "device_ref": "sandbox-22252"
}
```

```json
{
  "session_id": "ceea796e-1d32-463b-919f-a06640202591",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDgxMiwiaWF0IjoxNzkzMzUzOTEyLCJqdGkiOiI0YzExMDVlYS02MTgwLTRlYTYtYTcxZS0xYzVlMWYxMWZhODciLCJzaWQiOiJjZWVhNzk2ZS0xZDMyLTQ2M2ItOTE5Zi1hMDY2NDAyMDI1OTEifQ.FQopW9TyD5zKFlQh6wX2CJGYnnr9AMdIxLdAjV2Aoe4",
  "access_expires_at": "2026-10-30T10:06:52.46098733Z",
  "refresh_token": "QIliPsBemfylqfVTpB8qhlFQ4RUlfKHn9GLa_R9s20w",
  "refresh_expires_at": "2026-11-29T09:51:52.460551048Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "659dba9f-6c7b-419c-ba6b-82374af640aa",
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
  "last_heartbeat_at": "2026-10-30T09:48:13.065019Z",
  "last_location_at": "2026-10-30T09:48:13.065019Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/659dba9f-6c7b-419c-ba6b-82374af640aa/handover` → **200**

```json
{
  "command_id": "4aee3bfd-8447-4ebd-9b8d-404dede3fb71",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "659dba9f-6c7b-419c-ba6b-82374af640aa",
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
  "last_heartbeat_at": "2026-10-30T09:48:13.065019Z",
  "last_location_at": "2026-10-30T09:48:13.065019Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/659dba9f-6c7b-419c-ba6b-82374af640aa/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:51:53Z",
    "sequence": 1793353913160
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "659dba9f-6c7b-419c-ba6b-82374af640aa",
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
  "last_heartbeat_at": "2026-10-30T09:51:53.17469Z",
  "last_location_at": "2026-10-30T09:51:53.17469Z",
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
  "session_id": "d82ba4a3-6a8d-42f8-9f7e-c61efd85ab58",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ4MTMsImlhdCI6MTc5MzM1MzkxMywianRpIjoiNzZkNWUxOTgtOTZiMC00MDM0LTkwMmQtMWNjZTU3ZDMyYTU5Iiwic2lkIjoiZDgyYmE0YTMtNmE4ZC00MmY4LTlmN2UtYzYxZWZkODVhYjU4In0.fngYYYC76l2PtrD9qG41HCOGdU_r8bV0PnfK1zInBn4",
  "access_expires_at": "2026-10-30T10:06:53.670246211Z",
  "refresh_token": "Xd75wDormcoLS-yU1Q3vbpBbQnSptqxUdQ0EG9g-6dw",
  "refresh_expires_at": "2026-10-30T21:51:53.669809872Z",
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
  "session_id": "cab59b6a-a24c-40f0-9110-7b4a225e8a68",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ4MTQsImlhdCI6MTc5MzM1MzkxNCwianRpIjoiYzc1YzVmNmUtMDRmMi00MDFiLThhYzQtZTMxM2NjZjYxYWNjIiwic2lkIjoiY2FiNTliNmEtYTI0Yy00MGYwLTkxMTAtN2I0YTIyNWU4YTY4In0.23EUR3QMZI3Ufme_auRNamiKPgJfY3ynVwu-xnZ3Pc4",
  "access_expires_at": "2026-10-30T10:06:54.164858816Z",
  "refresh_token": "vflyq7XKOf0BxdkOKqQ5XIyMdFPUOqV-RkTmTKe2Pp0",
  "refresh_expires_at": "2026-10-30T21:51:54.164482862Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380685477621",
  "device_ref": "sandbox-25714"
}
```

```json
{
  "challenge_id": "a681034f-fc9a-49c2-aa2a-b2f7ff9af9ad",
  "expires_at": "2026-10-30T09:56:54.392210078Z",
  "resend_available_at": "2026-10-30T09:51:55.392210078Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380685477621` → **200**

```json
{
  "phone": "+380685477621",
  "audience": "CLIENT",
  "code": "220367",
  "sent_at": "2026-10-30T09:51:54.39574049Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a681034f-fc9a-49c2-aa2a-b2f7ff9af9ad",
  "code": "220367",
  "device_ref": "sandbox-25714"
}
```

```json
{
  "session_id": "ad344dca-5642-46b6-a9f7-8f8cb78bb1c6",
  "subject": {
    "type": "CLIENT",
    "id": "8be3e57d-eb78-44c3-9858-4b1070ca620c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YmUzZTU3ZC1lYjc4LTQ0YzMtOTg1OC00YjEwNzBjYTYyMGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0ODE0LCJpYXQiOjE3OTMzNTM5MTQsImp0aSI6ImY5NTc2ZDMwLTQ2NjEtNDdjNi1iMTk0LTEyMmVkZjhmNWZjZiIsInNpZCI6ImFkMzQ0ZGNhLTU2NDItNDZiNi1hOWY3LThmOGNiNzhiYjFjNiJ9.AmTp5SNNtouqwzTP4YGWcg6VjLVprs7JK-P85pflF7E",
  "access_expires_at": "2026-10-30T10:06:54.64641569Z",
  "refresh_token": "rS0rMAtYmcz3H0Q3iTkecQp-mQrMdQgYROp78_tXVmg",
  "refresh_expires_at": "2026-11-29T09:51:54.646052697Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "886767f3-f8fe-47c8-bd05-228ecc8bc71b",
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
  "id": "f1d107cf-9fb5-41b5-a8d6-5a3293e14cf7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:56:54.881016Z",
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
  "command_id": "8b96f9ad-0d38-4e81-a294-8f40053ddf16",
  "quote_id": "f1d107cf-9fb5-41b5-a8d6-5a3293e14cf7",
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
  "id": "f1abed1f-747f-4807-a7c4-e23a51a714ee",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8be3e57d-eb78-44c3-9858-4b1070ca620c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:51:55.117544Z",
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
    "id": "ab727b22-1cb0-4451-8331-0d4f3eb24f22",
    "order_id": "f1abed1f-747f-4807-a7c4-e23a51a714ee",
    "expires_at": "2026-10-30T09:52:10.119983Z",
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

`POST /api/driver/v1/offers/ab727b22-1cb0-4451-8331-0d4f3eb24f22/reject` → **204**

```json
{
  "command_id": "280a05c8-32bf-4209-82d1-dea2cdf30b42"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "4488f582-c098-456f-94fe-a8b4761d83cc",
    "order_id": "f1abed1f-747f-4807-a7c4-e23a51a714ee",
    "expires_at": "2026-10-30T09:52:10.588673Z",
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

`POST /api/driver/v1/offers/4488f582-c098-456f-94fe-a8b4761d83cc/accept` → **200**

```json
{
  "command_id": "36dfa532-004e-468b-98c7-102a4c0dc12c"
}
```

```json
{
  "id": "c0262c91-c6a5-40cd-85d8-94c19dc882c0",
  "order_id": "f1abed1f-747f-4807-a7c4-e23a51a714ee",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "29eb914e-52fc-4475-bbff-d1d7a1fb05a8",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/f1abed1f-747f-4807-a7c4-e23a51a714ee/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:51:55.117942Z",
      "actor": {
        "type": "CLIENT",
        "id": "8be3e57d-eb78-44c3-9858-4b1070ca620c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "f1abed1f-747f-4807-a7c4-e23a51a714ee",
        "quote_id": "f1d107cf-9fb5-41b5-a8d6-5a3293e14cf7",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "2404b742-0976-4a10-abcc-ff707e4eb3c7"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:51:55.119431Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f1abed1f-747f-4807-a7c4-e23a51a714ee",
        "attempt_id": "16d78c1a-2584-4674-a69d-0665aa9768f2",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "2404b742-0976-4a10-abcc-ff707e4eb3c7"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T09:51:55.121663Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ab727b22-1cb0-4451-8331-0d4f3eb24f22",
        "order_id": "f1abed1f-747f-4807-a7c4-e23a51a714ee",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "2404b742-0976-4a10-abcc-ff707e4eb3c7"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T09:51:55.587386Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ab727b22-1cb0-4451-8331-0d4f3eb24f22",
        "order_id": "f1abed1f-747f-4807-a7c4-e23a51a714ee"
      },
      "correlation_id": "cf9700b1-f0b6-4a1f-89f9-50584a8f2fbd"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order f1abed1f-747f-4807-a7c4-e23a51a714ee — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/f1abed1f-747f-4807-a7c4-e23a51a714ee` → **200**

```json
{
  "id": "f1abed1f-747f-4807-a7c4-e23a51a714ee",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "8be3e57d-eb78-44c3-9858-4b1070ca620c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "c0262c91-c6a5-40cd-85d8-94c19dc882c0",
    "order_id": "f1abed1f-747f-4807-a7c4-e23a51a714ee",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "29eb914e-52fc-4475-bbff-d1d7a1fb05a8",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T09:51:55.117544Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/f1abed1f-747f-4807-a7c4-e23a51a714ee/cancel` → **200**

```json
{
  "command_id": "15bdd816-dcb1-4004-9ffc-c4e6415af82b",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "f1abed1f-747f-4807-a7c4-e23a51a714ee",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "8be3e57d-eb78-44c3-9858-4b1070ca620c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "c0262c91-c6a5-40cd-85d8-94c19dc882c0",
    "order_id": "f1abed1f-747f-4807-a7c4-e23a51a714ee",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "29eb914e-52fc-4475-bbff-d1d7a1fb05a8",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T09:51:55.117544Z",
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
  "session_id": "19c08d63-10de-444a-893a-c542615e566f",
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
  "last_heartbeat_at": "2026-10-30T09:51:51.984369Z",
  "last_location_at": "2026-10-30T09:51:51.984369Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/19c08d63-10de-444a-893a-c542615e566f/close` → **200**

```json
{
  "command_id": "8c91aea8-dc37-4a0e-961f-57d6319a6346",
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
  "session_id": "659dba9f-6c7b-419c-ba6b-82374af640aa",
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
  "last_heartbeat_at": "2026-10-30T09:51:53.17469Z",
  "last_location_at": "2026-10-30T09:51:53.17469Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/659dba9f-6c7b-419c-ba6b-82374af640aa/close` → **200**

```json
{
  "command_id": "4c26f90a-bc18-435b-8f48-5619ae4eb53c",
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
  "session_id": "3f8a38b5-838e-403a-98e5-a6a0882ce588",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ4MTgsImlhdCI6MTc5MzM1MzkxOCwianRpIjoiNWJhNWI1ZjMtOTcxNi00MWYyLTkwZjQtOWRmNzJjNTcyYjhhIiwic2lkIjoiM2Y4YTM4YjUtODM4ZS00MDNhLTk4ZTUtYTZhMDg4MmNlNTg4In0.TAlyOL2QXJF_hFaVqQ56ELz7YL0rbKiZkMf-MDDLDy4",
  "access_expires_at": "2026-10-30T10:06:58.022318882Z",
  "refresh_token": "eLU_NvPvNEcgQ9YQjFS9Cyk0k89Uy9ZHNenGeAHH8tA",
  "refresh_expires_at": "2026-10-30T21:51:58.0219166Z",
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
  "command_id": "e6f3797f-07e8-448b-adc1-b759899f93fd",
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
  "changed_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T09:51:58.500288Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "9bd8b1dd-fe18-4c8b-b8f9-f67c78fb0350",
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
  "correlation_id": "4b02bc7e-3a03-416f-aae8-42998aa44762"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "816068af-6d07-4a0d-9e6d-e80ed7cfc6cd",
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
  "correlation_id": "36a27edf-d03e-46f5-bf06-d3170a96abb2"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634099210",
  "device_ref": "sandbox-480"
}
```

```json
{
  "challenge_id": "c9482bca-bb5b-4dba-b6e0-eade2a00ca60",
  "expires_at": "2026-10-30T09:56:59.187376537Z",
  "resend_available_at": "2026-10-30T09:52:00.187376537Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634099210` → **200**

```json
{
  "phone": "+380634099210",
  "audience": "CLIENT",
  "code": "454157",
  "sent_at": "2026-10-30T09:51:59.189633935Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c9482bca-bb5b-4dba-b6e0-eade2a00ca60",
  "code": "454157",
  "device_ref": "sandbox-480"
}
```

```json
{
  "session_id": "cbba7587-8122-43e0-8e3e-a41f6ea8ecd4",
  "subject": {
    "type": "CLIENT",
    "id": "bd54bd77-e08d-4fee-8e41-d6fd6b83cc9d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZDU0YmQ3Ny1lMDhkLTRmZWUtOGU0MS1kNmZkNmI4M2NjOWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0ODE5LCJpYXQiOjE3OTMzNTM5MTksImp0aSI6ImZkYzBiZjc1LWMxNzAtNGQxNi05MjYwLWEyOWE5ZjNjYzZmNCIsInNpZCI6ImNiYmE3NTg3LTgxMjItNDNlMC04ZTNlLWE0MWY2ZWE4ZWNkNCJ9.8OrLXPCAkvdJuHSTM20veN-aEkT95jFoUqNNPjLnyHo",
  "access_expires_at": "2026-10-30T10:06:59.440666477Z",
  "refresh_token": "e7Y4ajX6qS02THTP0V5xb_Guo8KwRJ8Hg4NeQ6ttcLg",
  "refresh_expires_at": "2026-11-29T09:51:59.440303678Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "633a0ef6-0a48-427d-b8c8-c45ffe1e8eb4",
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
  "id": "0371a93a-a1c5-4590-958c-fd0b82fc212d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:56:59.669530Z",
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
  "command_id": "39b32bb0-347a-471b-8f91-17657b44c509",
  "quote_id": "0371a93a-a1c5-4590-958c-fd0b82fc212d",
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
  "correlation_id": "ae5ee1ce-43ed-4f13-80bb-98dba06d973c"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3d3f1ccb-c894-4f7b-a2c2-96cb02ab26e3",
  "quote_id": "0371a93a-a1c5-4590-958c-fd0b82fc212d",
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
  "id": "2963cea4-e8c5-4d3b-a8e8-edeae6dfcfd9",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd54bd77-e08d-4fee-8e41-d6fd6b83cc9d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:00.145433Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/2963cea4-e8c5-4d3b-a8e8-edeae6dfcfd9/cancel` → **200**

```json
{
  "command_id": "3e8c61f7-8380-4c4b-a812-f160a9b2d0a8",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2963cea4-e8c5-4d3b-a8e8-edeae6dfcfd9",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "bd54bd77-e08d-4fee-8e41-d6fd6b83cc9d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:52:00.145433Z",
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
  "command_id": "5445769a-6885-459d-9274-8f4d92634536",
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
  "changed_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T09:52:00.643641Z"
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
      "changed_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T09:52:00.643641Z"
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
  "device_ref": "sandbox-10660"
}
```

```json
{
  "challenge_id": "65e59b5e-7638-420e-bf0a-2614d09091a2",
  "expires_at": "2026-10-30T09:57:01.333998749Z",
  "resend_available_at": "2026-10-30T09:52:02.333998749Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "060013",
  "sent_at": "2026-10-30T09:52:01.336766539Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "65e59b5e-7638-420e-bf0a-2614d09091a2",
  "code": "060013",
  "device_ref": "sandbox-10660"
}
```

```json
{
  "session_id": "d5d7f88b-dbe9-4a46-bc54-3f8e0620ae69",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDgyMSwiaWF0IjoxNzkzMzUzOTIxLCJqdGkiOiJkZjBlMzJhZC1hYzQ5LTQ0YzYtYTcxNy1kNjAzODI2N2QzZDQiLCJzaWQiOiJkNWQ3Zjg4Yi1kYmU5LTRhNDYtYmM1NC0zZjhlMDYyMGFlNjkifQ.lRaEwfhWNj55wS8JS9C2W1PjtDygjLhvoeB8iljy7PM",
  "access_expires_at": "2026-10-30T10:07:01.582551691Z",
  "refresh_token": "npNk5hrZoGdthIiwfoCq2cUpcZ0BK58-B5gkUs06CL8",
  "refresh_expires_at": "2026-11-29T09:52:01.582139457Z",
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
  "command_id": "cadeefd5-531c-4fd0-85f6-c9b1a8fa9dd3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:52:02Z",
    "sequence": 1793353922442
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0ad08eb3-e769-48e5-9683-a7f7d9c63029",
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
  "last_heartbeat_at": "2026-10-30T09:52:02.058552Z",
  "last_location_at": "2026-10-30T09:52:02.058552Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672676845",
  "device_ref": "sandbox-12669"
}
```

```json
{
  "challenge_id": "bc32cf16-3a4a-4b04-86c8-d7cf3cd75f55",
  "expires_at": "2026-10-30T09:57:02.288466646Z",
  "resend_available_at": "2026-10-30T09:52:03.288466646Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672676845` → **200**

```json
{
  "phone": "+380672676845",
  "audience": "CLIENT",
  "code": "406062",
  "sent_at": "2026-10-30T09:52:02.290634849Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc32cf16-3a4a-4b04-86c8-d7cf3cd75f55",
  "code": "406062",
  "device_ref": "sandbox-12669"
}
```

```json
{
  "session_id": "8ee0a952-1c08-4cbb-acd1-e9f1d83dae3f",
  "subject": {
    "type": "CLIENT",
    "id": "8005ad80-228d-474a-818e-b3368bc1d2e2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MDA1YWQ4MC0yMjhkLTQ3NGEtODE4ZS1iMzM2OGJjMWQyZTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0ODIyLCJpYXQiOjE3OTMzNTM5MjIsImp0aSI6IjkyOTAzMTA0LTQxNTItNGE3OS05MzczLWNlNjRiZGZiMzJiZiIsInNpZCI6IjhlZTBhOTUyLTFjMDgtNGNiYi1hY2QxLWU5ZjFkODNkYWUzZiJ9.e9cxh6nM-Qx3pgVthOlXn0CP-cp3WRFAsVvuH861Ay0",
  "access_expires_at": "2026-10-30T10:07:02.533164499Z",
  "refresh_token": "35-fKCPq2Q2MGKnsRLPhmbk6YI7Y1YhToZe7wxGQA58",
  "refresh_expires_at": "2026-11-29T09:52:02.532676199Z",
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
  "command_id": "ea8d49b9-d425-49ad-9034-0b624af83e45",
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
  "id": "41443aa2-f3a2-4702-93ce-125bf1f6f43c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:57:02.990713Z",
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
  "command_id": "195ff6fb-a8a2-407d-9b5a-7a5af1f33256",
  "platform": "ANDROID",
  "token": "sandbox-driver-23295fd9-f98e-406c-a80a-8d26da0b8689"
}
```

```json
{
  "id": "b241d669-1ad3-4cd6-9642-23c1c6e02ecd",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T09:52:03.230325Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "067ac7e7-a402-4797-bb93-bc7fb2839e11",
  "platform": "ANDROID",
  "token": "sandbox-rider-6e2c0fdf-69fe-4c2a-89d0-93e3c92940fa"
}
```

```json
{
  "id": "e2795af5-2443-472f-85c4-bd62830bada7",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T09:52:03.459475Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a8edd558-3368-407b-a5b0-7e818eaa94da",
  "quote_id": "41443aa2-f3a2-4702-93ce-125bf1f6f43c",
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
  "id": "bd566b3c-c47e-4120-b7e6-6aa907b03642",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8005ad80-228d-474a-818e-b3368bc1d2e2",
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
  "created_at": "2026-10-30T09:52:03.694541Z",
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
    "id": "85025866-b55d-45e5-ae5f-e283135b2f95",
    "order_id": "bd566b3c-c47e-4120-b7e6-6aa907b03642",
    "expires_at": "2026-10-30T09:52:18.696879Z",
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

`POST /api/driver/v1/offers/85025866-b55d-45e5-ae5f-e283135b2f95/accept` → **200**

```json
{
  "command_id": "b87150d0-bda2-422a-96fa-69022ec07786"
}
```

```json
{
  "id": "738d3885-cf65-49ef-baae-217a52cb4a49",
  "order_id": "bd566b3c-c47e-4120-b7e6-6aa907b03642",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dbd86644-5ae7-4c33-9491-e0562efb19f2",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T09:52:03.674Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T09:52:03.674Z` → **200**

```json
[
  {
    "at": "2026-10-30T09:52:05.108594962Z",
    "token_suffix": "0b8689",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "bd566b3c-c47e-4120-b7e6-6aa907b03642",
      "order_version": "2",
      "event_id": "6dc2a5dd-83cc-4057-bfd9-77db4a408f67"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380672676845&after=2026-10-30T09:52:03.674Z` → **200**

```json
[
  {
    "at": "2026-10-30T09:52:05.106155796Z",
    "token_suffix": "2940fa",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "bd566b3c-c47e-4120-b7e6-6aa907b03642",
      "order_version": "3",
      "event_id": "f2204c58-4650-4ece-85b9-58d28a5df48f"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/bd566b3c-c47e-4120-b7e6-6aa907b03642/messages` → **201**

```json
{
  "command_id": "6c662cf3-9ec5-4c27-be5a-856f5f0b728d",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "efbd5fa5-c3dd-450d-be23-26d81fc9c669",
  "order_id": "bd566b3c-c47e-4120-b7e6-6aa907b03642",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T09:52:05.470926907Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dbd86644-5ae7-4c33-9491-e0562efb19f2",
  "order_id": "bd566b3c-c47e-4120-b7e6-6aa907b03642",
  "assignment_id": "738d3885-cf65-49ef-baae-217a52cb4a49",
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

`POST /api/driver/v1/trips/dbd86644-5ae7-4c33-9491-e0562efb19f2/messages` → **201**

```json
{
  "command_id": "df168846-29c2-4fff-8493-b55683422b7c",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "94b5d049-07ca-4594-b06f-2b8e641cb979",
  "order_id": "bd566b3c-c47e-4120-b7e6-6aa907b03642",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T09:52:05.934300695Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/bd566b3c-c47e-4120-b7e6-6aa907b03642/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/dbd86644-5ae7-4c33-9491-e0562efb19f2/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380672676845"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/0ad08eb3-e769-48e5-9683-a7f7d9c63029/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:52:06Z",
    "sequence": 1793353926616
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0ad08eb3-e769-48e5-9683-a7f7d9c63029",
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
  "last_heartbeat_at": "2026-10-30T09:52:06.630652Z",
  "last_location_at": "2026-10-30T09:52:06.630652Z",
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
  "id": "dbd86644-5ae7-4c33-9491-e0562efb19f2",
  "order_id": "bd566b3c-c47e-4120-b7e6-6aa907b03642",
  "assignment_id": "738d3885-cf65-49ef-baae-217a52cb4a49",
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

`POST /api/driver/v1/trips/dbd86644-5ae7-4c33-9491-e0562efb19f2/arrive` → **200**

```json
{
  "command_id": "b3401588-811f-44af-8f88-a06397790d06",
  "expected_version": 0
}
```

```json
{
  "id": "dbd86644-5ae7-4c33-9491-e0562efb19f2",
  "order_id": "bd566b3c-c47e-4120-b7e6-6aa907b03642",
  "assignment_id": "738d3885-cf65-49ef-baae-217a52cb4a49",
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
  "arrived_at": "2026-10-30T09:52:07.087682Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/dbd86644-5ae7-4c33-9491-e0562efb19f2/start` → **200**

```json
{
  "command_id": "431c75f6-006f-4760-829e-a26ae7bc725a",
  "expected_version": 1
}
```

```json
{
  "id": "dbd86644-5ae7-4c33-9491-e0562efb19f2",
  "order_id": "bd566b3c-c47e-4120-b7e6-6aa907b03642",
  "assignment_id": "738d3885-cf65-49ef-baae-217a52cb4a49",
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
  "arrived_at": "2026-10-30T09:52:07.087682Z",
  "started_at": "2026-10-30T09:52:07.32805Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/0ad08eb3-e769-48e5-9683-a7f7d9c63029/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:52:55Z",
    "sequence": 1793353975574
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0ad08eb3-e769-48e5-9683-a7f7d9c63029",
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
  "last_heartbeat_at": "2026-10-30T09:52:55.590651Z",
  "last_location_at": "2026-10-30T09:52:55.590651Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/dbd86644-5ae7-4c33-9491-e0562efb19f2/complete` → **200**

```json
{
  "command_id": "3073d358-47cf-48fc-934d-9c370da0c38f",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:52:55Z",
  "cash_received": true
}
```

```json
{
  "id": "dbd86644-5ae7-4c33-9491-e0562efb19f2",
  "order_id": "bd566b3c-c47e-4120-b7e6-6aa907b03642",
  "assignment_id": "738d3885-cf65-49ef-baae-217a52cb4a49",
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
  "arrived_at": "2026-10-30T09:52:07.087682Z",
  "started_at": "2026-10-30T09:52:07.32805Z",
  "completed_at": "2026-10-30T09:52:55.830666Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/bd566b3c-c47e-4120-b7e6-6aa907b03642` → **200**

```json
{
  "id": "bd566b3c-c47e-4120-b7e6-6aa907b03642",
  "short_number": 14,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "8005ad80-228d-474a-818e-b3368bc1d2e2",
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
    "id": "738d3885-cf65-49ef-baae-217a52cb4a49",
    "order_id": "bd566b3c-c47e-4120-b7e6-6aa907b03642",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "dbd86644-5ae7-4c33-9491-e0562efb19f2",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:52:03.694541Z",
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
    "id": "bd566b3c-c47e-4120-b7e6-6aa907b03642",
    "short_number": 14,
    "status": "FULFILLED",
    "created_at": "2026-10-30T09:52:03.694541Z",
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
    "id": "dbd86644-5ae7-4c33-9491-e0562efb19f2",
    "order_id": "bd566b3c-c47e-4120-b7e6-6aa907b03642",
    "order_short_number": 14,
    "created_at": "2026-10-30T09:52:04.168039Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "47446958-144a-460b-beb6-3839ecf7d713",
    "order_id": "b9cfc9fc-e4b1-4af3-af9a-3037825533f5",
    "order_short_number": 9,
    "created_at": "2026-10-30T09:49:32.656863Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "d64d09ca-8a6c-4457-8df2-5b9953fdefb3",
    "order_id": "659952b6-0627-4f65-91de-4fe940111d47",
    "order_short_number": 4,
    "created_at": "2026-10-30T09:48:03.136313Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "0936c4c7-04ba-4fdd-9985-966d81d3836b",
    "order_id": "26463439-283b-496c-b67e-9d589d520439",
    "order_short_number": 2,
    "created_at": "2026-10-30T09:44:18.74595Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "2fd87f78-a8c2-4280-a1a1-42ad39dd9f74",
    "order_id": "1b64848a-9026-4325-9b95-3aa1d904367f",
    "order_short_number": 1,
    "created_at": "2026-10-30T09:44:11.022668Z",
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

`GET /api/rider/v1/orders/bd566b3c-c47e-4120-b7e6-6aa907b03642/tip` → **200**

```json
{
  "order_id": "bd566b3c-c47e-4120-b7e6-6aa907b03642",
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
  "available_until": "2026-10-31T09:52:55.830666Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/bd566b3c-c47e-4120-b7e6-6aa907b03642/tip` → **201**

```json
{
  "command_id": "72240b3b-cd43-4382-a4c8-69c897d4b033",
  "amount_minor": 1100
}
```

```json
{
  "id": "f53297fe-9bf8-45dd-8546-11ce0ec5e2c4",
  "order_id": "bd566b3c-c47e-4120-b7e6-6aa907b03642",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T09:53:00.44524Z"
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
  "session_id": "97141a64-e87a-45ec-80de-6d1bcca80af1",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ4ODAsImlhdCI6MTc5MzM1Mzk4MCwianRpIjoiOGFlNjgwZDAtNDRiOC00YTg4LWI3MGQtNThmYTY3ODI5MDdlIiwic2lkIjoiOTcxNDFhNjQtZTg3YS00NWVjLTgwZGUtNmQxYmNjYTgwYWYxIn0.BPE7u-ejznIyVHmueX7ETqYyRuHPcuXqOPc2GFMkuyo",
  "access_expires_at": "2026-10-30T10:08:00.942950356Z",
  "refresh_token": "XvQeC9AxX5rNlaivA9qQRWydd2ETh4jM8qqyaZ03xpE",
  "refresh_expires_at": "2026-10-30T21:53:00.942293956Z",
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
  "generated_at": "2026-10-30T09:53:01.172361725Z"
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
  "generated_at": "2026-10-30T09:53:01.401227354Z"
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
  "session_id": "7f701e92-b9a1-42b4-8e8c-02c3a9405f9f",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ4ODEsImlhdCI6MTc5MzM1Mzk4MSwianRpIjoiODlmN2UzZjQtZmRmNS00YmY1LWFhN2QtM2Q3ZTlmYWEwZjE4Iiwic2lkIjoiN2Y3MDFlOTItYjlhMS00MmI0LThlOGMtMDJjM2E5NDA1ZjlmIn0.giRe4D2rjXxngCHwYice_ws6FCqAZRBbdYBcSDH6vdM",
  "access_expires_at": "2026-10-30T10:08:01.901641648Z",
  "refresh_token": "YZP1l0tImeIJjRXCRABZfNCBQwlcq68VmF8L2RxhQIM",
  "refresh_expires_at": "2026-10-30T21:53:01.901129494Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/bd566b3c-c47e-4120-b7e6-6aa907b03642/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:52:03.694919Z",
      "actor": {
        "type": "CLIENT",
        "id": "8005ad80-228d-474a-818e-b3368bc1d2e2",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "bd566b3c-c47e-4120-b7e6-6aa907b03642",
        "quote_id": "41443aa2-f3a2-4702-93ce-125bf1f6f43c",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "5e0a405e-479f-4dd8-834e-04009b9b59a6"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:52:03.696326Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "bd566b3c-c47e-4120-b7e6-6aa907b03642",
        "attempt_id": "2d6ae02e-1170-4def-a65f-1ba66bb5ca27",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "5e0a405e-479f-4dd8-834e-04009b9b59a6"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T09:52:03.698306Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "85025866-b55d-45e5-ae5f-e283135b2f95",
        "order_id": "bd566b3c-c47e-4120-b7e6-6aa907b03642",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "5e0a405e-479f-4dd8-834e-04009b9b59a6"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T09:52:04.169517Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "85025866-b55d-45e5-ae5f-e283135b2f95",
        "order_id": "bd566b3c-c47e-4120-b7e6-6aa907b03642",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "738d3885-cf65-49ef-baae-217a52cb4a49"
      },
      "correlation_id": "d3387f78-ec55-4343-bde1-57b50ba5f7c4"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T09:53:02.358614324Z",
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
      "last_location_at": "2026-10-30T09:52:55.590651Z",
      "order_id": null
    }
  ]
}
```

Done: order bd566b3c-c47e-4120-b7e6-6aa907b03642.

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
  "session_id": "2cc057c8-3e54-48a5-be53-79908177d29f",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ4ODIsImlhdCI6MTc5MzM1Mzk4MiwianRpIjoiODBlYzBkNDItOWMwZC00Zjg4LWJjYzYtNjcxMWYwM2QyYzNhIiwic2lkIjoiMmNjMDU3YzgtM2U1NC00OGE1LWJlNTMtNzk5MDgxNzdkMjlmIn0.tMRDjRTvensa_FiiLxe-ivpO8dDYZ0Hm5_5yp2lUjAI",
  "access_expires_at": "2026-10-30T10:08:02.873860053Z",
  "refresh_token": "23ClxmtnESEb8Q46nVHaD6K92a6v5TRcYnZTRQuC6h4",
  "refresh_expires_at": "2026-10-30T21:53:02.873356531Z",
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
  "command_id": "88e3efe5-2167-47b8-9235-1e0d242ccf2a",
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
  "timestamp": "2026-10-30T09:53:03.000+0000",
  "channel": {
    "id": "1730052000.2490612673",
    "linkedid": "1730052000.2490612673",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673092487"
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
  "timestamp": "2026-10-30T09:53:03.000+0000",
  "channel": {
    "id": "1730052000.2490612673",
    "linkedid": "1730052000.2490612673",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673092487"
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
  "session_id": "4b34c8f1-51af-4793-9ecb-b90ae4cab4e5",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ4ODMsImlhdCI6MTc5MzM1Mzk4MywianRpIjoiNTZkZjljODEtNmFhZS00MWM3LTg1ZTUtM2M3OWQyOTNhNDBhIiwic2lkIjoiNGIzNGM4ZjEtNTFhZi00NzkzLTllY2ItYjkwYWU0Y2FiNGU1In0.2khWNwVeJwH5Y3vyc-NT95aFYOMGaNYQRfa64--dUQU",
  "access_expires_at": "2026-10-30T10:08:03.858269199Z",
  "refresh_token": "rlwFlZ4AuidrYCuXrOd8imPkmN_XmOwM8jWl3TIRRFw",
  "refresh_expires_at": "2026-10-30T21:53:03.857806497Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "04bc72b5-01d2-4d64-9d83-e0d00d42f3ed",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673092487",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T09:53:03Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/04bc72b5-01d2-4d64-9d83-e0d00d42f3ed/answer` → **200**

```json
{
  "command_id": "5b90a1b3-3181-43d7-bfe1-42f80aacb904"
}
```

```json
{
  "id": "04bc72b5-01d2-4d64-9d83-e0d00d42f3ed",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673092487",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
  "order_ids": [],
  "started_at": "2026-10-30T09:53:03Z",
  "answered_at": "2026-10-30T09:53:04.320592Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2490612673",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "325eeddc-6101-4995-917f-ad07f9809c6c",
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
  "id": "e6561384-c044-4638-b01d-1e81673bac8b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:58:04.579055Z",
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
  "command_id": "33988400-e4b4-4aaa-9b90-452ecec7e60d",
  "quote_id": "e6561384-c044-4638-b01d-1e81673bac8b",
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
    "phone": "+380673092487"
  },
  "call_id": "04bc72b5-01d2-4d64-9d83-e0d00d42f3ed"
}
```

```json
{
  "id": "546c523e-567c-42c4-8f52-35083619f1a2",
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
  "created_at": "2026-10-30T09:53:04.811615Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673092487"
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
    "id": "1730052000.2490612673",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "04bc72b5-01d2-4d64-9d83-e0d00d42f3ed",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673092487",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
      "order_ids": [
        "546c523e-567c-42c4-8f52-35083619f1a2"
      ],
      "started_at": "2026-10-30T09:53:03Z",
      "answered_at": "2026-10-30T09:53:04.320592Z",
      "ended_at": "2026-10-30T09:53:05.069736Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "b661b8a2-1d3f-4729-85ab-f703cd735b26",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674339008",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
      "order_ids": [],
      "started_at": "2026-10-30T09:47:55.1896Z",
      "answered_at": "2026-10-30T09:47:55.44086Z",
      "ended_at": "2026-10-30T09:47:55.688533Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T09:47:58.106406Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/546c523e-567c-42c4-8f52-35083619f1a2` → **200**

```json
{
  "id": "546c523e-567c-42c4-8f52-35083619f1a2",
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
  "created_at": "2026-10-30T09:53:04.811615Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673092487"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/546c523e-567c-42c4-8f52-35083619f1a2` → **200**

```json
{
  "id": "546c523e-567c-42c4-8f52-35083619f1a2",
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
  "created_at": "2026-10-30T09:53:04.811615Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673092487"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/546c523e-567c-42c4-8f52-35083619f1a2/cancel` → **200**

```json
{
  "command_id": "f0390e05-ecd2-4094-851e-473a2c76df58",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "546c523e-567c-42c4-8f52-35083619f1a2",
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
  "created_at": "2026-10-30T09:53:04.811615Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673092487"
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

Done: call 04bc72b5-01d2-4d64-9d83-e0d00d42f3ed with order 546c523e-567c-42c4-8f52-35083619f1a2.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-3210"
}
```

```json
{
  "challenge_id": "b044d4dd-2a7c-489b-82b4-9fddc802be86",
  "expires_at": "2026-10-30T09:58:06.041150922Z",
  "resend_available_at": "2026-10-30T09:53:07.041150922Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "425621",
  "sent_at": "2026-10-30T09:53:06.044422187Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b044d4dd-2a7c-489b-82b4-9fddc802be86",
  "code": "425621",
  "device_ref": "sandbox-3210"
}
```

```json
{
  "session_id": "75c79631-6eaf-401a-a92d-ca575bf8a521",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDg4NiwiaWF0IjoxNzkzMzUzOTg2LCJqdGkiOiI5YjFjNGI4ZS0xOWIzLTQwMjMtYjUxOC1hYjJlZGI5YTdmMzgiLCJzaWQiOiI3NWM3OTYzMS02ZWFmLTQwMWEtYTkyZC1jYTU3NWJmOGE1MjEifQ.HUxZ9hhGK4v89gncXBzPhmMyOz1Xrf3XmQV5kkGnlEI",
  "access_expires_at": "2026-10-30T10:08:06.283941605Z",
  "refresh_token": "8K0FXYPn1LzxIC4TfdlwgFp9hmyVYQfeUK6ad-LoREQ",
  "refresh_expires_at": "2026-11-29T09:53:06.283441774Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0ad08eb3-e769-48e5-9683-a7f7d9c63029",
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
  "last_heartbeat_at": "2026-10-30T09:52:55.590651Z",
  "last_location_at": "2026-10-30T09:52:55.590651Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0ad08eb3-e769-48e5-9683-a7f7d9c63029/handover` → **200**

```json
{
  "command_id": "002af69e-07d7-44a2-adc1-8df6df9b317f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0ad08eb3-e769-48e5-9683-a7f7d9c63029",
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
  "last_heartbeat_at": "2026-10-30T09:52:55.590651Z",
  "last_location_at": "2026-10-30T09:52:55.590651Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 88 s to the next point)

`POST /api/driver/v1/work-sessions/0ad08eb3-e769-48e5-9683-a7f7d9c63029/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:54:34Z",
    "sequence": 1793354074976
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0ad08eb3-e769-48e5-9683-a7f7d9c63029",
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
  "last_heartbeat_at": "2026-10-30T09:54:34.990656Z",
  "last_location_at": "2026-10-30T09:54:34.990656Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664815015",
  "device_ref": "sandbox-19130"
}
```

```json
{
  "challenge_id": "9399f686-e64c-45a7-8522-70bb50d38ec8",
  "expires_at": "2026-10-30T09:59:35.214883872Z",
  "resend_available_at": "2026-10-30T09:54:36.214883872Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664815015` → **200**

```json
{
  "phone": "+380664815015",
  "audience": "CLIENT",
  "code": "509475",
  "sent_at": "2026-10-30T09:54:35.217047064Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9399f686-e64c-45a7-8522-70bb50d38ec8",
  "code": "509475",
  "device_ref": "sandbox-19130"
}
```

```json
{
  "session_id": "ea923ac8-2128-48eb-993a-e3909d682b44",
  "subject": {
    "type": "CLIENT",
    "id": "68913498-b7f9-4316-adbb-aecf718a18d7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODkxMzQ5OC1iN2Y5LTQzMTYtYWRiYi1hZWNmNzE4YTE4ZDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0OTc1LCJpYXQiOjE3OTMzNTQwNzUsImp0aSI6IjYzNTk1YzlmLTQ4MTYtNGVlOS1hOGY2LTZmNTQwZGU3YzhmZSIsInNpZCI6ImVhOTIzYWM4LTIxMjgtNDhlYi05OTNhLWUzOTA5ZDY4MmI0NCJ9.3U9qsYbQt9oyqgVqY7F4WH92ww3VseNPXkEHn8LgGx0",
  "access_expires_at": "2026-10-30T10:09:35.462364138Z",
  "refresh_token": "4cmXinMB96UFugPzIJk03YVVuXzsxOfVPQxW7EJwNIs",
  "refresh_expires_at": "2026-11-29T09:54:35.461897395Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "548066ed-f3ad-40c5-951c-11afa1170dfc",
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
  "id": "f5d3d03a-c321-4a06-b315-9f006c5fe2fc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:59:35.691017Z",
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
  "command_id": "36c6b7b1-082e-454c-8e39-e5791dcf6485",
  "quote_id": "f5d3d03a-c321-4a06-b315-9f006c5fe2fc",
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
  "id": "a4dad15d-9a07-4c9e-8691-c91359d7e5a9",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68913498-b7f9-4316-adbb-aecf718a18d7",
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
  "created_at": "2026-10-30T09:54:35.928025Z",
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
    "id": "1b0985af-7627-4ba5-8a2e-a33aec547c31",
    "order_id": "a4dad15d-9a07-4c9e-8691-c91359d7e5a9",
    "expires_at": "2026-10-30T09:54:50.930956Z",
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

`POST /api/driver/v1/offers/1b0985af-7627-4ba5-8a2e-a33aec547c31/accept` → **200**

```json
{
  "command_id": "86715505-735f-47dd-b057-90fa3a24ce9b"
}
```

```json
{
  "id": "a47f20f0-6f34-4d9e-9941-91cd12270f1d",
  "order_id": "a4dad15d-9a07-4c9e-8691-c91359d7e5a9",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "93784bf3-1a93-4234-b1be-dc087b8e0658",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "93784bf3-1a93-4234-b1be-dc087b8e0658",
  "order_id": "a4dad15d-9a07-4c9e-8691-c91359d7e5a9",
  "assignment_id": "a47f20f0-6f34-4d9e-9941-91cd12270f1d",
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

`POST /api/driver/v1/work-sessions/0ad08eb3-e769-48e5-9683-a7f7d9c63029/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:54:36Z",
    "sequence": 1793354076865
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0ad08eb3-e769-48e5-9683-a7f7d9c63029",
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
  "last_heartbeat_at": "2026-10-30T09:54:36.879494Z",
  "last_location_at": "2026-10-30T09:54:36.879494Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/93784bf3-1a93-4234-b1be-dc087b8e0658/arrive` → **200**

```json
{
  "command_id": "4d271c8c-d405-4c62-8b8d-3ecf699b629f",
  "expected_version": 0
}
```

```json
{
  "id": "93784bf3-1a93-4234-b1be-dc087b8e0658",
  "order_id": "a4dad15d-9a07-4c9e-8691-c91359d7e5a9",
  "assignment_id": "a47f20f0-6f34-4d9e-9941-91cd12270f1d",
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
  "arrived_at": "2026-10-30T09:54:37.110291Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/93784bf3-1a93-4234-b1be-dc087b8e0658/start` → **200**

```json
{
  "command_id": "abeaf032-72b0-4ed1-99ae-0c0e314faf7e",
  "expected_version": 1
}
```

```json
{
  "id": "93784bf3-1a93-4234-b1be-dc087b8e0658",
  "order_id": "a4dad15d-9a07-4c9e-8691-c91359d7e5a9",
  "assignment_id": "a47f20f0-6f34-4d9e-9941-91cd12270f1d",
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
  "arrived_at": "2026-10-30T09:54:37.110291Z",
  "started_at": "2026-10-30T09:54:37.367326Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

(the car drives 59 s to the next point)

`POST /api/driver/v1/work-sessions/0ad08eb3-e769-48e5-9683-a7f7d9c63029/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:55:36Z",
    "sequence": 1793354136612
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0ad08eb3-e769-48e5-9683-a7f7d9c63029",
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
  "last_heartbeat_at": "2026-10-30T09:55:36.627413Z",
  "last_location_at": "2026-10-30T09:55:36.627413Z",
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
  "device_ref": "sandbox-16043"
}
```

```json
{
  "challenge_id": "9ba746d1-0cc3-44c8-aba0-7c8b2dc5c274",
  "expires_at": "2026-10-30T10:00:36.850890147Z",
  "resend_available_at": "2026-10-30T09:55:37.850890147Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "107747",
  "sent_at": "2026-10-30T09:55:36.853264375Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9ba746d1-0cc3-44c8-aba0-7c8b2dc5c274",
  "code": "107747",
  "device_ref": "sandbox-16043"
}
```

```json
{
  "session_id": "b972602a-f924-48d2-9b17-02bc736c1a89",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTAzNywiaWF0IjoxNzkzMzU0MTM3LCJqdGkiOiI1NWE0ODNlYS04NDlkLTRmZGUtODk0My0yZDhjYTE1MzgyNDciLCJzaWQiOiJiOTcyNjAyYS1mOTI0LTQ4ZDItOWIxNy0wMmJjNzM2YzFhODkifQ.2WesIYsiNU7-16odHeOefhUjVgjT7JOYi5vyiE4c6kk",
  "access_expires_at": "2026-10-30T10:10:37.091071666Z",
  "refresh_token": "Ruhd8a0V4t8rox-oDgdOfrZvbETKiHm98MuWCxl0WHk",
  "refresh_expires_at": "2026-11-29T09:55:37.090683984Z",
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
  "command_id": "8aa7fff5-6077-428b-9af0-f9c0188b9f30",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:55:37Z",
    "sequence": 1793354137534
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "08341857-7ce3-4896-8d9e-ccaf56e20d3c",
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
  "last_heartbeat_at": "2026-10-30T09:55:37.547766Z",
  "last_location_at": "2026-10-30T09:55:37.547766Z",
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
  "session_id": "1b0862f3-f24a-4827-8e11-c2109c8afcd9",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUwMzgsImlhdCI6MTc5MzM1NDEzOCwianRpIjoiMjBhNDYxMDItZmViYy00ODhlLWEyODktMWUxZmU5ODRmNTczIiwic2lkIjoiMWIwODYyZjMtZjI0YS00ODI3LThlMTEtYzIxMDljOGFmY2Q5In0.bqN5qeJhlu7Ska7yrWDHIOJgY3X0c-0dIw_5TjkkJ0w",
  "access_expires_at": "2026-10-30T10:10:38.035212737Z",
  "refresh_token": "qdtdNqydJ8u7mAg0dx7W_o3nfoPW7ZU5n5r3bIoQ_uQ",
  "refresh_expires_at": "2026-10-30T21:55:38.034796468Z",
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
  "session_id": "05acbfb0-38a6-4754-8fcd-176785c373d7",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUwMzgsImlhdCI6MTc5MzM1NDEzOCwianRpIjoiNjY0MDk0MTctMWJiZS00NWNjLTk5ZjctMjc4NDc3OTFjMzhmIiwic2lkIjoiMDVhY2JmYjAtMzhhNi00NzU0LThmY2QtMTc2Nzg1YzM3M2Q3In0.eR1c7yhe3w3n1fL2wG0yYOCfdUYlfD2io6bvQrGKbPc",
  "access_expires_at": "2026-10-30T10:10:38.524276404Z",
  "refresh_token": "SAJ7IBYM27luwoc8Ax5YTYJqBWLKQsgWZ3Q5l5Iscbw",
  "refresh_expires_at": "2026-10-30T21:55:38.523840526Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a4dad15d-9a07-4c9e-8691-c91359d7e5a9` → **200**

```json
{
  "id": "a4dad15d-9a07-4c9e-8691-c91359d7e5a9",
  "short_number": 16,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "68913498-b7f9-4316-adbb-aecf718a18d7",
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
    "id": "a47f20f0-6f34-4d9e-9941-91cd12270f1d",
    "order_id": "a4dad15d-9a07-4c9e-8691-c91359d7e5a9",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "93784bf3-1a93-4234-b1be-dc087b8e0658",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T09:54:35.928025Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a4dad15d-9a07-4c9e-8691-c91359d7e5a9/interrupt` → **200**

```json
{
  "command_id": "88b4f2d5-200c-4b46-9654-625facef55af",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "a4dad15d-9a07-4c9e-8691-c91359d7e5a9",
    "short_number": 16,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "68913498-b7f9-4316-adbb-aecf718a18d7",
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
      "id": "a47f20f0-6f34-4d9e-9941-91cd12270f1d",
      "order_id": "a4dad15d-9a07-4c9e-8691-c91359d7e5a9",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "93784bf3-1a93-4234-b1be-dc087b8e0658",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T09:54:35.928025Z",
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
    "id": "b6664229-9d54-47ea-b756-c12db1805bdf",
    "short_number": 17,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "68913498-b7f9-4316-adbb-aecf718a18d7",
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
    "id": "bd156417-7c50-428d-b865-ec60962f6e35",
    "order_id": "b6664229-9d54-47ea-b756-c12db1805bdf",
    "expires_at": "2026-10-30T09:55:54.001333Z",
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

`POST /api/driver/v1/offers/bd156417-7c50-428d-b865-ec60962f6e35/accept` → **200**

```json
{
  "command_id": "95cca77b-f371-4bb6-8cd4-8c228355f62a"
}
```

```json
{
  "id": "02ce4f01-4796-4ea6-bdce-703779004565",
  "order_id": "b6664229-9d54-47ea-b756-c12db1805bdf",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cad69057-d8cc-44e8-adbc-78fd472d2d91",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cad69057-d8cc-44e8-adbc-78fd472d2d91",
  "order_id": "b6664229-9d54-47ea-b756-c12db1805bdf",
  "assignment_id": "02ce4f01-4796-4ea6-bdce-703779004565",
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
  "session_id": "08341857-7ce3-4896-8d9e-ccaf56e20d3c",
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
  "last_heartbeat_at": "2026-10-30T09:55:37.547766Z",
  "last_location_at": "2026-10-30T09:55:37.547766Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/08341857-7ce3-4896-8d9e-ccaf56e20d3c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:55:40Z",
    "sequence": 1793354140160
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "08341857-7ce3-4896-8d9e-ccaf56e20d3c",
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
  "last_heartbeat_at": "2026-10-30T09:55:40.174639Z",
  "last_location_at": "2026-10-30T09:55:40.174639Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/cad69057-d8cc-44e8-adbc-78fd472d2d91/arrive` → **200**

```json
{
  "command_id": "2afd3838-b527-44a8-9eda-6ffdfe8a8984",
  "expected_version": 0
}
```

```json
{
  "id": "cad69057-d8cc-44e8-adbc-78fd472d2d91",
  "order_id": "b6664229-9d54-47ea-b756-c12db1805bdf",
  "assignment_id": "02ce4f01-4796-4ea6-bdce-703779004565",
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
  "arrived_at": "2026-10-30T09:55:40.397259Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cad69057-d8cc-44e8-adbc-78fd472d2d91/start` → **200**

```json
{
  "command_id": "9f106a10-e5a5-4e3b-a2f0-8bfed9dc1f92",
  "expected_version": 1
}
```

```json
{
  "id": "cad69057-d8cc-44e8-adbc-78fd472d2d91",
  "order_id": "b6664229-9d54-47ea-b756-c12db1805bdf",
  "assignment_id": "02ce4f01-4796-4ea6-bdce-703779004565",
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
  "arrived_at": "2026-10-30T09:55:40.397259Z",
  "started_at": "2026-10-30T09:55:40.627338Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cad69057-d8cc-44e8-adbc-78fd472d2d91/complete` → **200**

```json
{
  "command_id": "11a9596a-e872-48cf-9e64-0619385a4ae5",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:55:40Z"
}
```

```json
{
  "id": "cad69057-d8cc-44e8-adbc-78fd472d2d91",
  "order_id": "b6664229-9d54-47ea-b756-c12db1805bdf",
  "assignment_id": "02ce4f01-4796-4ea6-bdce-703779004565",
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
  "arrived_at": "2026-10-30T09:55:40.397259Z",
  "started_at": "2026-10-30T09:55:40.627338Z",
  "completed_at": "2026-10-30T09:55:40.857724Z",
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
    "id": "b6664229-9d54-47ea-b756-c12db1805bdf",
    "short_number": 17,
    "status": "FULFILLED",
    "created_at": "2026-10-30T09:55:38.991395Z",
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
    "id": "a4dad15d-9a07-4c9e-8691-c91359d7e5a9",
    "short_number": 16,
    "status": "CANCELLED",
    "created_at": "2026-10-30T09:54:35.928025Z",
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

`GET /api/operator/v1/orders/a4dad15d-9a07-4c9e-8691-c91359d7e5a9/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:54:35.928581Z",
      "actor": {
        "type": "CLIENT",
        "id": "68913498-b7f9-4316-adbb-aecf718a18d7",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a4dad15d-9a07-4c9e-8691-c91359d7e5a9",
        "quote_id": "f5d3d03a-c321-4a06-b315-9f006c5fe2fc",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "2733859c-5540-4a71-a68b-9b786f4af6b8"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:54:35.930299Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a4dad15d-9a07-4c9e-8691-c91359d7e5a9",
        "attempt_id": "47e18ec5-a718-4263-b8e6-ea3feeadd51d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "2733859c-5540-4a71-a68b-9b786f4af6b8"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T09:54:35.932665Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1b0985af-7627-4ba5-8a2e-a33aec547c31",
        "order_id": "a4dad15d-9a07-4c9e-8691-c91359d7e5a9",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "2733859c-5540-4a71-a68b-9b786f4af6b8"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T09:54:36.395543Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "1b0985af-7627-4ba5-8a2e-a33aec547c31",
        "order_id": "a4dad15d-9a07-4c9e-8691-c91359d7e5a9",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "a47f20f0-6f34-4d9e-9941-91cd12270f1d"
      },
      "correlation_id": "003c954e-9f05-45e5-9b19-418800b2009a"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/b6664229-9d54-47ea-b756-c12db1805bdf/tip` → **200**

```json
{
  "order_id": "b6664229-9d54-47ea-b756-c12db1805bdf",
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
  "available_until": "2026-10-31T09:55:40.857724Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/b6664229-9d54-47ea-b756-c12db1805bdf/tip` → **409**

```json
{
  "command_id": "fdd98492-4493-4a32-a9aa-867215a9ce8d",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/b6664229-9d54-47ea-b756-c12db1805bdf/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "44a5eda9-7777-4915-b548-f685aa8c68f3"
}
```

Done: interrupted a4dad15d-9a07-4c9e-8691-c91359d7e5a9, follow-up b6664229-9d54-47ea-b756-c12db1805bdf.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0ad08eb3-e769-48e5-9683-a7f7d9c63029",
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
  "last_heartbeat_at": "2026-10-30T09:55:36.627413Z",
  "last_location_at": "2026-10-30T09:55:36.627413Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0ad08eb3-e769-48e5-9683-a7f7d9c63029/close` → **200**

```json
{
  "command_id": "79b5eebb-23f1-4bb3-a95f-c6f39fd696cd",
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
  "session_id": "08341857-7ce3-4896-8d9e-ccaf56e20d3c",
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
  "last_heartbeat_at": "2026-10-30T09:55:40.174639Z",
  "last_location_at": "2026-10-30T09:55:40.174639Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/08341857-7ce3-4896-8d9e-ccaf56e20d3c/close` → **200**

```json
{
  "command_id": "087fb7bd-1d8f-4862-bcb9-22cb824f6e4d",
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
  "session_id": "c32092ea-6357-4efb-9381-c7d76bd06734",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUwNDYsImlhdCI6MTc5MzM1NDE0NiwianRpIjoiMjg2NjA4ZmUtZWRlNC00NmU4LWIyMTMtZjNkM2YwMDU3MjM5Iiwic2lkIjoiYzMyMDkyZWEtNjM1Ny00ZWZiLTkzODEtYzdkNzZiZDA2NzM0In0.NUsjCuIUltcugHvWqR4xFxJC3I0VjpUmRFWkdhZnGJk",
  "access_expires_at": "2026-10-30T10:10:46.388972425Z",
  "refresh_token": "IWMmkkarFu62r6p13EZTtqI89DkFwe_-fNHupU6br7o",
  "refresh_expires_at": "2026-10-30T21:55:46.388501923Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "97af8a8d-a5c9-4b48-bdcc-62726ee4195d",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T09:55:46Z"
}
```

```json
{
  "id": "069788f8-9945-411a-ade7-020b4ca6d11f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T09:55:46Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/069788f8-9945-411a-ade7-020b4ca6d11f/publish` → **200**

```json
{
  "command_id": "af656839-2bc2-4462-8496-1d16aad18008",
  "expected_version": 0
}
```

```json
{
  "id": "069788f8-9945-411a-ade7-020b4ca6d11f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T09:55:46.870454Z",
  "published_at": "2026-10-30T09:55:46.870454Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "069788f8-9945-411a-ade7-020b4ca6d11f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T09:55:46.870454Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636459209",
  "device_ref": "sandbox-22658"
}
```

```json
{
  "challenge_id": "02fc63f1-4370-43a6-8fb2-f8b7ab12a00b",
  "expires_at": "2026-10-30T10:00:47.309825804Z",
  "resend_available_at": "2026-10-30T09:55:48.309825804Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636459209` → **200**

```json
{
  "phone": "+380636459209",
  "audience": "CLIENT",
  "code": "673518",
  "sent_at": "2026-10-30T09:55:47.313213408Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "02fc63f1-4370-43a6-8fb2-f8b7ab12a00b",
  "code": "673518",
  "device_ref": "sandbox-22658"
}
```

```json
{
  "session_id": "586cfef2-b29b-426f-a097-b0f83249b0b3",
  "subject": {
    "type": "CLIENT",
    "id": "5c7d593d-f7af-4564-a269-e3d0e9fec359"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YzdkNTkzZC1mN2FmLTQ1NjQtYTI2OS1lM2QwZTlmZWMzNTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MDQ3LCJpYXQiOjE3OTMzNTQxNDcsImp0aSI6ImNjNjAyMDRmLWZjNjAtNGJiMS04MmIyLTA0OTA2ZmNiZTkzNiIsInNpZCI6IjU4NmNmZWYyLWIyOWItNDI2Zi1hMDk3LWIwZjgzMjQ5YjBiMyJ9.vtUxy7VnPd12RGQnOZW__mdkxwTwXGibnt3lUkp9Gf4",
  "access_expires_at": "2026-10-30T10:10:47.549598735Z",
  "refresh_token": "i80wFgNuD24IDHV13taYEbSNUhw9Y4agoTgSsMRCs58",
  "refresh_expires_at": "2026-11-29T09:55:47.549260842Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "069788f8-9945-411a-ade7-020b4ca6d11f",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T09:55:46.870454Z",
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
  "command_id": "6038e24b-6707-4157-a9a7-491fb69d2165",
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
  "id": "ec21ae52-670a-41a8-aa87-87ff01b543fc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:00:47.997526Z",
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
  "command_id": "02b1b456-fae5-44a0-966b-40b469f15e8b",
  "quote_id": "ec21ae52-670a-41a8-aa87-87ff01b543fc",
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
  "correlation_id": "568e170c-e4be-4c89-8981-3d486daa5e28"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "f1f236da-a572-4dd1-8b9b-5c2b1b028faf",
  "version_id": "069788f8-9945-411a-ade7-020b4ca6d11f",
  "language": "uk"
}
```

```json
{
  "version_id": "069788f8-9945-411a-ade7-020b4ca6d11f",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T09:55:48.454011Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8d01223f-d913-45b1-8098-53e405446ac2",
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
  "id": "bdfa756a-d168-4a05-83a7-d68530fef9a9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:00:48.679576Z",
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
  "command_id": "a91914fb-ae9d-45df-9e91-be4b7fe75765",
  "quote_id": "bdfa756a-d168-4a05-83a7-d68530fef9a9",
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
  "id": "e3575038-d92d-4a05-b3af-6704ca657ad6",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5c7d593d-f7af-4564-a269-e3d0e9fec359",
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
  "created_at": "2026-10-30T09:55:48.907112Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e3575038-d92d-4a05-b3af-6704ca657ad6` → **200**

```json
{
  "id": "e3575038-d92d-4a05-b3af-6704ca657ad6",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5c7d593d-f7af-4564-a269-e3d0e9fec359",
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
  "created_at": "2026-10-30T09:55:48.907112Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e3575038-d92d-4a05-b3af-6704ca657ad6/cancel` → **200**

```json
{
  "command_id": "55fe7f85-55f9-4144-842f-532d05f49a5d",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e3575038-d92d-4a05-b3af-6704ca657ad6",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5c7d593d-f7af-4564-a269-e3d0e9fec359",
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
  "created_at": "2026-10-30T09:55:48.907112Z",
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

`POST /api/admin/v1/legal-documents/069788f8-9945-411a-ade7-020b4ca6d11f` → **409**

```json
{
  "command_id": "892663e9-3dca-42b0-a46d-e535eb346e73",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T09:55:49Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/069788f8-9945-411a-ade7-020b4ca6d11f",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "8c4c4ed3-5894-48ec-81b1-df3dea0d83ae"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "d93f67f6-fcfe-45df-9713-f8946a3e8fce",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T09:55:49Z"
}
```

```json
{
  "id": "b4ac4e23-382e-4582-b043-b5544ba8847c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T09:55:49Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/b4ac4e23-382e-4582-b043-b5544ba8847c/publish` → **200**

```json
{
  "command_id": "f1febf9c-ffe8-4744-9d1c-f85eb626450a",
  "expected_version": 0
}
```

```json
{
  "id": "b4ac4e23-382e-4582-b043-b5544ba8847c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T09:55:50.071931Z",
  "published_at": "2026-10-30T09:55:50.071931Z",
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
  "device_ref": "sandbox-25085"
}
```

```json
{
  "challenge_id": "c0222542-99e0-49fd-802c-509c788c4c85",
  "expires_at": "2026-10-30T10:00:50.300267494Z",
  "resend_available_at": "2026-10-30T09:55:51.300267494Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "356714",
  "sent_at": "2026-10-30T09:55:50.303320904Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c0222542-99e0-49fd-802c-509c788c4c85",
  "code": "356714",
  "device_ref": "sandbox-25085"
}
```

```json
{
  "session_id": "56fb0644-9158-4a04-85f2-8970b332c208",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTA1MCwiaWF0IjoxNzkzMzU0MTUwLCJqdGkiOiJlMzhlOTRmZS1kY2UyLTQ0YmUtYjdjOS0yYTdkMjI3Y2NiOTIiLCJzaWQiOiI1NmZiMDY0NC05MTU4LTRhMDQtODVmMi04OTcwYjMzMmMyMDgifQ.KLhCndFoZ5GbBGBsNTk30tYlw6v3xlXFpChqWp9ktcU",
  "access_expires_at": "2026-10-30T10:10:50.543831717Z",
  "refresh_token": "WcM_L1XXGqKqq5gJek5W18ifUGvUoHY-Dmx0g_GBWjw",
  "refresh_expires_at": "2026-11-29T09:55:50.543316998Z",
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
  "command_id": "6ce0ab6f-b707-487c-8ede-61cf38958051",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:57:05Z",
    "sequence": 1793354225489
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "70eebabb-5c40-485a-b302-e78d7fec423c",
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
  "last_heartbeat_at": "2026-10-30T09:57:05.019504Z",
  "last_location_at": "2026-10-30T09:57:05.019504Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674888056",
  "device_ref": "sandbox-16833"
}
```

```json
{
  "challenge_id": "3fa1585a-4be2-4fb8-9cf7-19b584716100",
  "expires_at": "2026-10-30T10:02:05.244375686Z",
  "resend_available_at": "2026-10-30T09:57:06.244375686Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674888056` → **200**

```json
{
  "phone": "+380674888056",
  "audience": "CLIENT",
  "code": "692833",
  "sent_at": "2026-10-30T09:57:05.247214176Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3fa1585a-4be2-4fb8-9cf7-19b584716100",
  "code": "692833",
  "device_ref": "sandbox-16833"
}
```

```json
{
  "session_id": "d38de615-d1eb-401d-acc7-f4d1880cd454",
  "subject": {
    "type": "CLIENT",
    "id": "05205482-cb54-4f6c-8bee-110a67c392fa"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTIwNTQ4Mi1jYjU0LTRmNmMtOGJlZS0xMTBhNjdjMzkyZmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MTI1LCJpYXQiOjE3OTMzNTQyMjUsImp0aSI6IjU2YTViYmM1LTIxNmItNDUxZS1hODUxLTYxYWVmZDcxYWQwYyIsInNpZCI6ImQzOGRlNjE1LWQxZWItNDAxZC1hY2M3LWY0ZDE4ODBjZDQ1NCJ9.i6fHnU8tp7-6UZR1jNWirb9EXdjMIcDtVU1FK7-94U8",
  "access_expires_at": "2026-10-30T10:12:05.48959356Z",
  "refresh_token": "UdLBwRbj-hFtztGZDZ_Aegv63gsHUrxbxCJ4FtaB-QI",
  "refresh_expires_at": "2026-11-29T09:57:05.489244811Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7ae51fb8-a638-4fbb-8263-53be91763654",
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
  "id": "a4739b27-1945-4574-bfec-f1937870bc3d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:02:05.716951Z",
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
  "command_id": "06ecf44a-f4e4-4f67-b3fb-89bcf47e96e5",
  "quote_id": "a4739b27-1945-4574-bfec-f1937870bc3d",
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
    "phone": "+380676276202"
  }
}
```

```json
{
  "id": "06682e1e-ebb2-4b9b-9500-58c53c32d748",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "05205482-cb54-4f6c-8bee-110a67c392fa",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:57:05.954423Z",
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
    "id": "7f986916-d419-450a-b3e3-f758c2fcb81c",
    "order_id": "06682e1e-ebb2-4b9b-9500-58c53c32d748",
    "expires_at": "2026-10-30T09:57:20.95698Z",
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

`POST /api/driver/v1/offers/7f986916-d419-450a-b3e3-f758c2fcb81c/accept` → **200**

```json
{
  "command_id": "72e96860-3725-4f17-b5d4-51818be4b119"
}
```

```json
{
  "id": "706fa16c-15f8-44ae-bb91-ecf610650a71",
  "order_id": "06682e1e-ebb2-4b9b-9500-58c53c32d748",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4c78e963-195b-43ff-8859-b540a619712b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4c78e963-195b-43ff-8859-b540a619712b",
  "order_id": "06682e1e-ebb2-4b9b-9500-58c53c32d748",
  "assignment_id": "706fa16c-15f8-44ae-bb91-ecf610650a71",
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
    "phone": "+380676276202"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a8d9d58f-d740-4b55-8486-aee88effebf6",
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
  "id": "b8044880-7e19-4b0f-8ebf-db3a644607a2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:02:06.854258Z",
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
  "command_id": "b8edbf9c-6417-4229-89da-9f0f7f15aa7e",
  "quote_id": "b8044880-7e19-4b0f-8ebf-db3a644607a2",
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
  "id": "e24ab23e-486d-4a4e-9b61-90bc72d91a6d",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "05205482-cb54-4f6c-8bee-110a67c392fa",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:57:07.080488Z",
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
  "command_id": "e3f607f1-0474-487f-88e0-a838fdf0284d",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T12:57:07Z"
}
```

```json
{
  "id": "793c5e3d-e3a6-434f-a24b-efa597c0a0f6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:02:07.328122Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T12:57:07Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "2a12b9f7-ccdd-4409-a7d3-ff216117f11a",
  "quote_id": "793c5e3d-e3a6-434f-a24b-efa597c0a0f6",
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
  "pickup_at": "2026-10-30T12:57:07Z"
}
```

```json
{
  "id": "3480abe8-6108-4197-a8dd-a878d716dc1a",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "05205482-cb54-4f6c-8bee-110a67c392fa",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T09:57:07.562699Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T12:57:07Z",
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
  "command_id": "b96fe092-a552-4e23-af84-d64038154640",
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
  "id": "db9b85f1-c21b-4669-b376-792b02c194af",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:02:07.811632Z",
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
  "command_id": "bfd04394-a9ba-4a07-b237-3440e3f71c55",
  "quote_id": "db9b85f1-c21b-4669-b376-792b02c194af",
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
  "correlation_id": "14175385-1d78-44f4-9741-a0b44f6fe94d"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "3480abe8-6108-4197-a8dd-a878d716dc1a",
      "short_number": 21,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "05205482-cb54-4f6c-8bee-110a67c392fa",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T09:57:07.562699Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T12:57:07Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "e24ab23e-486d-4a4e-9b61-90bc72d91a6d",
      "short_number": 20,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "05205482-cb54-4f6c-8bee-110a67c392fa",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T09:57:07.080488Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "06682e1e-ebb2-4b9b-9500-58c53c32d748",
      "short_number": 19,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "e24ab23e-486d-4a4e-9b61-90bc72d91a6d",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "05205482-cb54-4f6c-8bee-110a67c392fa",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:57:07.080488Z",
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

`GET /api/rider/v1/orders/06682e1e-ebb2-4b9b-9500-58c53c32d748` → **200**

```json
{
  "id": "06682e1e-ebb2-4b9b-9500-58c53c32d748",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "05205482-cb54-4f6c-8bee-110a67c392fa",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "706fa16c-15f8-44ae-bb91-ecf610650a71",
    "order_id": "06682e1e-ebb2-4b9b-9500-58c53c32d748",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "4c78e963-195b-43ff-8859-b540a619712b",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T09:57:05.954423Z",
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
    "location_at": "2026-10-30T09:57:05.019504Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/06682e1e-ebb2-4b9b-9500-58c53c32d748/cancel` → **200**

```json
{
  "command_id": "5e1c0b59-0b4a-422d-ab43-9b93959c616b",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "06682e1e-ebb2-4b9b-9500-58c53c32d748",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "05205482-cb54-4f6c-8bee-110a67c392fa",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "706fa16c-15f8-44ae-bb91-ecf610650a71",
    "order_id": "06682e1e-ebb2-4b9b-9500-58c53c32d748",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "4c78e963-195b-43ff-8859-b540a619712b",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T09:57:05.954423Z",
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

`GET /api/rider/v1/orders/e24ab23e-486d-4a4e-9b61-90bc72d91a6d` → **200**

```json
{
  "id": "e24ab23e-486d-4a4e-9b61-90bc72d91a6d",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "05205482-cb54-4f6c-8bee-110a67c392fa",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:57:07.080488Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e24ab23e-486d-4a4e-9b61-90bc72d91a6d/cancel` → **200**

```json
{
  "command_id": "4a6717a7-c57c-4649-964e-c7742639be9f",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e24ab23e-486d-4a4e-9b61-90bc72d91a6d",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "05205482-cb54-4f6c-8bee-110a67c392fa",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:57:07.080488Z",
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

`GET /api/rider/v1/orders/3480abe8-6108-4197-a8dd-a878d716dc1a` → **200**

```json
{
  "id": "3480abe8-6108-4197-a8dd-a878d716dc1a",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "05205482-cb54-4f6c-8bee-110a67c392fa",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T09:57:07.562699Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T12:57:07Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3480abe8-6108-4197-a8dd-a878d716dc1a/cancel` → **200**

```json
{
  "command_id": "cac27fc7-f18e-4a46-8074-f82f782045a8",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3480abe8-6108-4197-a8dd-a878d716dc1a",
  "short_number": 21,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "05205482-cb54-4f6c-8bee-110a67c392fa",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T09:57:07.562699Z",
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
  "pickup_at": "2026-10-30T12:57:07Z",
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
  "session_id": "70eebabb-5c40-485a-b302-e78d7fec423c",
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
  "last_heartbeat_at": "2026-10-30T09:57:05.019504Z",
  "last_location_at": "2026-10-30T09:57:05.019504Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/70eebabb-5c40-485a-b302-e78d7fec423c/close` → **200**

```json
{
  "command_id": "68d44a98-7fb0-4172-9dd9-d4f66032e4d6",
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

Done: orders 06682e1e-ebb2-4b9b-9500-58c53c32d748, e24ab23e-486d-4a4e-9b61-90bc72d91a6d, 3480abe8-6108-4197-a8dd-a878d716dc1a.

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
  "session_id": "66bc53dc-dba8-4840-a958-8c46cb7dfb5b",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUxMzAsImlhdCI6MTc5MzM1NDIzMCwianRpIjoiN2ZhYTdmN2QtYWU3NC00ZDEwLWI1YjItOWU4ZDIyNDViYThmIiwic2lkIjoiNjZiYzUzZGMtZGJhOC00ODQwLWE5NTgtOGM0NmNiN2RmYjViIn0.H5LFj6cahZ-yyyZOmugfirRS7wXSx7A0EAlmgO-GO-I",
  "access_expires_at": "2026-10-30T10:12:10.853323739Z",
  "refresh_token": "JfMQJmw2ZnmPs6AtYTrGqJqMyaIusovrJq7Pc-p_3eY",
  "refresh_expires_at": "2026-10-30T21:57:10.852931303Z",
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
  "session_id": "c456ff42-09d5-4af5-a44e-1b6a5bd4afcd",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUxMzEsImlhdCI6MTc5MzM1NDIzMSwianRpIjoiZTkwYmZlOWItNTYyZC00NmU2LTg2ZDctZjVmMWE5ZTE2NDk4Iiwic2lkIjoiYzQ1NmZmNDItMDlkNS00YWY1LWE0NGUtMWI2YTViZDRhZmNkIn0.G9HM8B2t2WOLuCFVmGMyMMYgrLusiJj63g3B6stdNnk",
  "access_expires_at": "2026-10-30T10:12:11.338171665Z",
  "refresh_token": "4UfbaPnCnxExafjTEN7QrLEvURjGgLXahJ7zQLl4xPM",
  "refresh_expires_at": "2026-10-30T21:57:11.337515621Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-20719"
}
```

```json
{
  "challenge_id": "5615db8c-bcea-43e1-9641-00042ec602e0",
  "expires_at": "2026-10-30T10:02:11.553644268Z",
  "resend_available_at": "2026-10-30T09:57:12.553644268Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "111005",
  "sent_at": "2026-10-30T09:57:11.556424824Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5615db8c-bcea-43e1-9641-00042ec602e0",
  "code": "111005",
  "device_ref": "sandbox-20719"
}
```

```json
{
  "session_id": "8eb86327-b22e-4ad2-acad-1928227932a2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTEzMSwiaWF0IjoxNzkzMzU0MjMxLCJqdGkiOiJjMmIzMjY2MC1hMzA4LTQ2OWQtYjkyYy05YTlkODczMzk3MjgiLCJzaWQiOiI4ZWI4NjMyNy1iMjJlLTRhZDItYWNhZC0xOTI4MjI3OTMyYTIifQ.Jk0Pf7dO2JBeMsxddNSsoXfbKfCixdZJQCJ9kUoRBj8",
  "access_expires_at": "2026-10-30T10:12:11.793774895Z",
  "refresh_token": "A0YRBWoAKsyRCJkjtmj09N7VPawx6FMOpbzRgujq3PE",
  "refresh_expires_at": "2026-11-29T09:57:11.793365084Z",
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
  "command_id": "cc610e8f-55f5-4e62-8518-8e3f4abe1488",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:57:12Z",
    "sequence": 1793354232251
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "405e7e9c-1022-45a2-b7e5-ca1497b6ac89",
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
  "last_heartbeat_at": "2026-10-30T09:57:12.267697Z",
  "last_location_at": "2026-10-30T09:57:12.267697Z",
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
  "command_id": "fcfecf13-d26d-42cf-b0e3-3d3307a6ba76",
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
  "effective_at": "2026-10-30T09:57:12.724585Z",
  "changed_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T09:48:08.539907Z",
  "last_entries": [
    {
      "order_id": "659952b6-0627-4f65-91de-4fe940111d47",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T09:48:08.539907Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "799ac2ee-9139-4629-8940-ce331a1c2184",
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
  "id": "8617f468-d961-4f79-ba5c-e3c97d115bce",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:02:13.170017Z",
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
  "command_id": "c592823b-5fa4-4d67-9e5c-306bf9f5f623",
  "quote_id": "8617f468-d961-4f79-ba5c-e3c97d115bce",
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
    "phone": "+3806711114269"
  }
}
```

```json
{
  "id": "7b45d460-8d9a-450b-af7b-31b60624e5b2",
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
  "created_at": "2026-10-30T09:57:13.4058Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114269"
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
    "id": "fe798c85-9642-4cf2-af7f-10d237cbed44",
    "order_id": "7b45d460-8d9a-450b-af7b-31b60624e5b2",
    "expires_at": "2026-10-30T09:57:28.410089Z",
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

`POST /api/driver/v1/offers/fe798c85-9642-4cf2-af7f-10d237cbed44/accept` → **200**

```json
{
  "command_id": "1569f85f-ee82-43ad-8b43-5c9a6c4f0777"
}
```

```json
{
  "id": "6976bee4-8a37-46e9-9f5a-6d5c7cdc0d1e",
  "order_id": "7b45d460-8d9a-450b-af7b-31b60624e5b2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7bfde8f9-c603-4535-9640-bf30dd011f3e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7bfde8f9-c603-4535-9640-bf30dd011f3e",
  "order_id": "7b45d460-8d9a-450b-af7b-31b60624e5b2",
  "assignment_id": "6976bee4-8a37-46e9-9f5a-6d5c7cdc0d1e",
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
    "phone": "+3806711114269"
  }
}
```

`POST /api/driver/v1/work-sessions/405e7e9c-1022-45a2-b7e5-ca1497b6ac89/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:57:14Z",
    "sequence": 1793354234309
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "405e7e9c-1022-45a2-b7e5-ca1497b6ac89",
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
  "last_heartbeat_at": "2026-10-30T09:57:14.322858Z",
  "last_location_at": "2026-10-30T09:57:14.322858Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/7bfde8f9-c603-4535-9640-bf30dd011f3e/arrive` → **200**

```json
{
  "command_id": "2d7d931e-b676-4a4c-8060-f255b1f85a38",
  "expected_version": 0
}
```

```json
{
  "id": "7bfde8f9-c603-4535-9640-bf30dd011f3e",
  "order_id": "7b45d460-8d9a-450b-af7b-31b60624e5b2",
  "assignment_id": "6976bee4-8a37-46e9-9f5a-6d5c7cdc0d1e",
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
  "arrived_at": "2026-10-30T09:57:14.550062Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711114269"
  }
}
```

`POST /api/driver/v1/trips/7bfde8f9-c603-4535-9640-bf30dd011f3e/start` → **200**

```json
{
  "command_id": "ae000a17-8c72-4b25-a7ef-e322e3ec9cd5",
  "expected_version": 1
}
```

```json
{
  "id": "7bfde8f9-c603-4535-9640-bf30dd011f3e",
  "order_id": "7b45d460-8d9a-450b-af7b-31b60624e5b2",
  "assignment_id": "6976bee4-8a37-46e9-9f5a-6d5c7cdc0d1e",
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
  "arrived_at": "2026-10-30T09:57:14.550062Z",
  "started_at": "2026-10-30T09:57:14.784462Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711114269"
  }
}
```

`POST /api/driver/v1/trips/7bfde8f9-c603-4535-9640-bf30dd011f3e/complete` → **200**

```json
{
  "command_id": "c90b00e2-1822-44fa-95bd-4e883eda1a05",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:57:15Z",
  "cash_received": true
}
```

```json
{
  "id": "7bfde8f9-c603-4535-9640-bf30dd011f3e",
  "order_id": "7b45d460-8d9a-450b-af7b-31b60624e5b2",
  "assignment_id": "6976bee4-8a37-46e9-9f5a-6d5c7cdc0d1e",
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
  "arrived_at": "2026-10-30T09:57:14.550062Z",
  "started_at": "2026-10-30T09:57:14.784462Z",
  "completed_at": "2026-10-30T09:57:15.024551Z",
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
  "command_id": "c973c7d3-550c-4266-87f6-261eaf5d53ea",
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
  "id": "8213ff8d-3325-4b0a-8175-c41a4d5b986a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:02:15.271855Z",
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
  "command_id": "111609ac-e8c5-4bfd-b619-6e20bc973273",
  "quote_id": "8213ff8d-3325-4b0a-8175-c41a4d5b986a",
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
    "phone": "+3806711121024"
  }
}
```

```json
{
  "id": "c1f6d243-6170-4458-8fda-20ea4b667914",
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
  "created_at": "2026-10-30T09:57:15.502354Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121024"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/c1f6d243-6170-4458-8fda-20ea4b667914` → **200**

```json
{
  "id": "c1f6d243-6170-4458-8fda-20ea4b667914",
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
  "created_at": "2026-10-30T09:57:15.502354Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121024"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/c1f6d243-6170-4458-8fda-20ea4b667914/cancel` → **200**

```json
{
  "command_id": "b2c07f03-2234-46be-9281-7ec56154dc32",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "c1f6d243-6170-4458-8fda-20ea4b667914",
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
  "created_at": "2026-10-30T09:57:15.502354Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121024"
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
  "staff_id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T09:48:08.539907Z",
  "last_entries": [
    {
      "order_id": "c1f6d243-6170-4458-8fda-20ea4b667914",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T09:57:15.983432Z"
    },
    {
      "order_id": "7b45d460-8d9a-450b-af7b-31b60624e5b2",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T09:57:15.029361Z"
    },
    {
      "order_id": "659952b6-0627-4f65-91de-4fe940111d47",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T09:48:08.539907Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "405e7e9c-1022-45a2-b7e5-ca1497b6ac89",
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
  "last_heartbeat_at": "2026-10-30T09:57:14.322858Z",
  "last_location_at": "2026-10-30T09:57:14.322858Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/405e7e9c-1022-45a2-b7e5-ca1497b6ac89/close` → **200**

```json
{
  "command_id": "70d29691-5a79-4739-9851-fc155734480d",
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

Done: operator bonus for fulfilled 7b45d460-8d9a-450b-af7b-31b60624e5b2 and operator-fault cancellation c1f6d243-6170-4458-8fda-20ea4b667914.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679068928",
  "device_ref": "sandbox-23058"
}
```

```json
{
  "challenge_id": "41d52c34-9a8a-44bb-9fe2-8a8951f5dab4",
  "expires_at": "2026-10-30T10:02:20.130091942Z",
  "resend_available_at": "2026-10-30T09:57:21.130091942Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679068928` → **200**

```json
{
  "phone": "+380679068928",
  "audience": "CLIENT",
  "code": "254085",
  "sent_at": "2026-10-30T09:57:20.133107528Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670109608",
  "device_ref": "sandbox-6265",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "8e0edbaa-5eae-45f9-9715-b25867194d6b",
  "expires_at": "2026-10-30T10:02:21.579261997Z",
  "resend_available_at": "2026-10-30T09:57:22.579261997Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670109608` → **200**

```json
{
  "phone": "+380670109608",
  "audience": "CLIENT",
  "code": "829624",
  "sent_at": "2026-10-30T09:57:21.581102749Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670109608",
  "device_ref": "sandbox-408",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "49e532e2-a25b-4557-a162-f52520930f52",
  "expires_at": "2026-10-30T10:02:23.022425575Z",
  "resend_available_at": "2026-10-30T09:57:24.022425575Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380670109608` → **200**

```json
{
  "phone": "+380670109608",
  "audience": "CLIENT",
  "code": "624429",
  "sent_at": "2026-10-30T09:57:23.024846521Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679010000",
  "device_ref": "sandbox-1654"
}
```

```json
{
  "challenge_id": "c571c7f7-f350-4367-8276-ac9bd77869a1",
  "expires_at": "2026-10-30T10:02:24.473232339Z",
  "resend_available_at": "2026-10-30T09:57:25.473232339Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679010000",
  "device_ref": "sandbox-26985"
}
```

```json
{
  "challenge_id": "3f70b019-6730-40d2-953e-c03a58e15318",
  "expires_at": "2026-10-30T10:02:25.895471563Z",
  "resend_available_at": "2026-10-30T09:57:26.895471563Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380679010000` → **200**

```json
{
  "phone": "+380679010000",
  "audience": "CLIENT",
  "code": "280676",
  "sent_at": "2026-10-30T09:57:25.897770233Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679010000",
  "device_ref": "sandbox-20290",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "23515d00-f444-42e0-aef8-21b9af80450e",
  "expires_at": "2026-10-30T10:02:27.335752731Z",
  "resend_available_at": "2026-10-30T09:57:28.335752731Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380679010000` → **200**

```json
{
  "phone": "+380679010000",
  "audience": "CLIENT",
  "code": "642039",
  "sent_at": "2026-10-30T09:57:27.337879485Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380679010000",
  "device_ref": "sandbox-19509",
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
  "correlation_id": "4c2f90f1-b972-4c76-9d77-4f2fc1ba74cb",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000004424"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "b9906c06-8873-4ad7-a3fd-553a50ab2782"
}
```

`GET /sandbox/v1/otp?phone=%2B442000004424` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120023286"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "e81f56ab-a35a-4271-b2c6-a45ce7d144e3"
}
```

`GET /sandbox/v1/otp?phone=%2B37120023286` → **404**

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
  "session_id": "cd608132-d537-400e-9e68-a06d261f10cc",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUxNDksImlhdCI6MTc5MzM1NDI0OSwianRpIjoiNDhiZGY4ZWItYzljZC00MWMxLWE3NmUtNGQ5MGRiMjE2MzNmIiwic2lkIjoiY2Q2MDgxMzItZDUzNy00MDBlLTllNjgtYTA2ZDI2MWYxMGNjIn0.iUnkNxK4VHzbdzePnOvb-Eh8-_CgrPpQ2OPoTX7ar00",
  "access_expires_at": "2026-10-30T10:12:29.75463289Z",
  "refresh_token": "7PW6v7_LKqvvHgeYP0dX01ggb6Gam5JL2qNOKLiCd6s",
  "refresh_expires_at": "2026-10-30T21:57:29.753992686Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380679010000` → **200**

```json
{
  "deliveries": [
    {
      "id": "bc65026b-f65b-494e-b090-4ec0e67a51c5",
      "challenge_id": "23515d00-f444-42e0-aef8-21b9af80450e",
      "phone": "+380679010000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-6f4cd199-93f5-4bc9-b5fd-17983693f506",
      "error": null,
      "attempted_at": "2026-10-30T09:57:27.338246Z"
    },
    {
      "id": "eca78b94-0876-4693-b1b7-6a8232260129",
      "challenge_id": "3f70b019-6730-40d2-953e-c03a58e15318",
      "phone": "+380679010000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-cf9e4c3b-d49e-4182-8797-8d75a13ef4fa",
      "error": null,
      "attempted_at": "2026-10-30T09:57:25.898268Z"
    },
    {
      "id": "49dae0bc-ac6b-4a4f-8e05-e8b1f386c4ac",
      "challenge_id": "c571c7f7-f350-4367-8276-ac9bd77869a1",
      "phone": "+380679010000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T09:57:24.475844Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380679010000` → **200**

```json
{
  "phone": "+380679010000",
  "audience": "CLIENT",
  "code": "642039",
  "sent_at": "2026-10-30T09:57:27.337879485Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380670109608` → **200**

```json
{
  "deliveries": [
    {
      "id": "5c42dfc6-3f94-4795-950f-759411b54d55",
      "challenge_id": "49e532e2-a25b-4557-a162-f52520930f52",
      "phone": "+380670109608",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-fb8ab12e-e856-43c2-acd7-1fd47dd3ff7b",
      "error": null,
      "attempted_at": "2026-10-30T09:57:23.025147Z"
    },
    {
      "id": "e7ee203e-8080-4371-9452-c1ba580a6e11",
      "challenge_id": "8e0edbaa-5eae-45f9-9715-b25867194d6b",
      "phone": "+380670109608",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-92f1474f-37e6-45f0-9fcc-9199e18f4da1",
      "error": null,
      "attempted_at": "2026-10-30T09:57:21.581427Z"
    }
  ]
}
```

Done: SMS to +380679068928; SMS then a call to +380670109608; a failed SMS, two calls and a refused third to +380679010000; +44 and +371 refused.

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
  "session_id": "309ff9ea-e20c-460d-911f-4effcb711498",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUxNTAsImlhdCI6MTc5MzM1NDI1MCwianRpIjoiM2RkYzc4NWYtMDgzOC00ODE3LTgxMDYtMjgzN2Q2NjIzMTk4Iiwic2lkIjoiMzA5ZmY5ZWEtZTIwYy00NjBkLTkxMWYtNGVmZmNiNzExNDk4In0.Y9B_Y18uoiHgCSg3SWbMePNP_M6R3dAy5eijyb8qZvQ",
  "access_expires_at": "2026-10-30T10:12:30.729498176Z",
  "refresh_token": "veVH4sAYNwCVAnQsgxIGczWmc9TLYocZP-zLpjmlLGk",
  "refresh_expires_at": "2026-10-30T21:57:30.728950702Z",
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
  "session_id": "aca79252-5c7d-46bd-90c6-348b175bc67d",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUxNTEsImlhdCI6MTc5MzM1NDI1MSwianRpIjoiMmUxYTFkOGQtNTZiMi00ZTI2LWJiNzktZGY5ZDQ5NTQyNDhjIiwic2lkIjoiYWNhNzkyNTItNWM3ZC00NmJkLTkwYzYtMzQ4YjE3NWJjNjdkIn0.NjpFKVJHTaFWNOJmc4TBeVRK_l0z363pE53yLEMvIXQ",
  "access_expires_at": "2026-10-30T10:12:31.218677894Z",
  "refresh_token": "2exmR1E8vMTwrDVCvXQOrk2SerelJZjfWZdR19vgrVA",
  "refresh_expires_at": "2026-10-30T21:57:31.218194859Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
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

`POST /api/admin/v1/staff-extensions/2e9a9967-16ea-403c-a9bf-9388f7767ab7` → **200**

```json
{
  "command_id": "f7a7b3d5-3636-46a9-9703-aa30e5309a2c",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "be8e7d1c-f11a-4403-8bf4-28c81a21fa14",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T09:57:32.145746Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T09:57:32.145746Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "e9d11b7d-cd3e-481c-8957-aa69dd61cf30",
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
  "id": "3e0f0c2d-82b6-4803-a867-3b82d764df98",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:02:32.588048Z",
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
  "command_id": "3760cb47-6f2d-476d-b896-7eca4a89aac4",
  "quote_id": "3e0f0c2d-82b6-4803-a867-3b82d764df98",
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
    "phone": "+380676072747"
  }
}
```

```json
{
  "id": "29000a0c-f9c7-4d55-b30d-88fb80197263",
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
  "created_at": "2026-10-30T09:57:32.809993Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676072747"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/29000a0c-f9c7-4d55-b30d-88fb80197263/calls` → **201**

```json
{
  "command_id": "3a322871-355d-4304-ae56-f90cf1d4235d",
  "to": "CALLER"
}
```

```json
{
  "id": "75389ddb-1c32-4ea0-a6c8-d953c6d30dd1",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
  "order_ids": [
    "29000a0c-f9c7-4d55-b30d-88fb80197263"
  ],
  "started_at": "2026-10-30T09:57:33.05726Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/29000a0c-f9c7-4d55-b30d-88fb80197263/calls` → **201**

```json
{
  "command_id": "3a322871-355d-4304-ae56-f90cf1d4235d",
  "to": "CALLER"
}
```

```json
{
  "id": "75389ddb-1c32-4ea0-a6c8-d953c6d30dd1",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
  "order_ids": [
    "29000a0c-f9c7-4d55-b30d-88fb80197263"
  ],
  "started_at": "2026-10-30T09:57:33.05726Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "75389ddb-1c32-4ea0-a6c8-d953c6d30dd1",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380676072747",
    "at": "2026-10-30T09:57:33.059116948Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "75389ddb-1c32-4ea0-a6c8-d953c6d30dd1",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.2364",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "75389ddb-1c32-4ea0-a6c8-d953c6d30dd1"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "75389ddb-1c32-4ea0-a6c8-d953c6d30dd1",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=29000a0c-f9c7-4d55-b30d-88fb80197263` → **200**

```json
{
  "calls": [
    {
      "id": "75389ddb-1c32-4ea0-a6c8-d953c6d30dd1",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
      "order_ids": [
        "29000a0c-f9c7-4d55-b30d-88fb80197263"
      ],
      "started_at": "2026-10-30T09:57:33.05726Z",
      "answered_at": "2026-10-30T09:57:33.559355Z",
      "ended_at": "2026-10-30T09:57:33.573645Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=29000a0c-f9c7-4d55-b30d-88fb80197263` → **200**

```json
{
  "calls": [
    {
      "id": "75389ddb-1c32-4ea0-a6c8-d953c6d30dd1",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
      "order_ids": [
        "29000a0c-f9c7-4d55-b30d-88fb80197263"
      ],
      "started_at": "2026-10-30T09:57:33.05726Z",
      "answered_at": "2026-10-30T09:57:33.559355Z",
      "ended_at": "2026-10-30T09:57:33.573645Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=29000a0c-f9c7-4d55-b30d-88fb80197263` → **200**

```json
{
  "calls": [
    {
      "id": "75389ddb-1c32-4ea0-a6c8-d953c6d30dd1",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
      "order_ids": [
        "29000a0c-f9c7-4d55-b30d-88fb80197263"
      ],
      "started_at": "2026-10-30T09:57:33.05726Z",
      "answered_at": "2026-10-30T09:57:33.559355Z",
      "ended_at": "2026-10-30T09:57:33.573645Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=29000a0c-f9c7-4d55-b30d-88fb80197263` → **200**

```json
{
  "calls": [
    {
      "id": "75389ddb-1c32-4ea0-a6c8-d953c6d30dd1",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
      "order_ids": [
        "29000a0c-f9c7-4d55-b30d-88fb80197263"
      ],
      "started_at": "2026-10-30T09:57:33.05726Z",
      "answered_at": "2026-10-30T09:57:33.559355Z",
      "ended_at": "2026-10-30T09:57:33.573645Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T09:57:38.179501Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/29000a0c-f9c7-4d55-b30d-88fb80197263` → **200**

```json
{
  "id": "29000a0c-f9c7-4d55-b30d-88fb80197263",
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
  "created_at": "2026-10-30T09:57:32.809993Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676072747"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/29000a0c-f9c7-4d55-b30d-88fb80197263/cancel` → **200**

```json
{
  "command_id": "dc992c81-bae6-4dc5-89db-b2435f70958b",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "29000a0c-f9c7-4d55-b30d-88fb80197263",
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
  "created_at": "2026-10-30T09:57:32.809993Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676072747"
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
  "command_id": "bd068300-5554-4114-983d-f02ced412723",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T09:57:41.030171Z",
  "extension": "101"
}
```

Done: outgoing call 75389ddb-1c32-4ea0-a6c8-d953c6d30dd1 from order 29000a0c-f9c7-4d55-b30d-88fb80197263, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639735018",
  "device_ref": "sandbox-25183"
}
```

```json
{
  "challenge_id": "e12d435d-bc94-4d73-ac39-27f39fbea70b",
  "expires_at": "2026-10-30T10:02:41.257149759Z",
  "resend_available_at": "2026-10-30T09:57:42.257149759Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639735018` → **200**

```json
{
  "phone": "+380639735018",
  "audience": "CLIENT",
  "code": "377992",
  "sent_at": "2026-10-30T09:57:41.259183417Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e12d435d-bc94-4d73-ac39-27f39fbea70b",
  "code": "377992",
  "device_ref": "sandbox-25183"
}
```

```json
{
  "session_id": "c65b0633-4339-4d58-8fab-8ab49fd7d1d4",
  "subject": {
    "type": "CLIENT",
    "id": "d0da16a3-d0c5-49e6-8209-f230fcd4fd3f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMGRhMTZhMy1kMGM1LTQ5ZTYtODIwOS1mMjMwZmNkNGZkM2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MTYxLCJpYXQiOjE3OTMzNTQyNjEsImp0aSI6IjZlYmE3NGUwLWMxYTEtNDhhNi05MTM5LTljZGI1MzdjZWNhMiIsInNpZCI6ImM2NWIwNjMzLTQzMzktNGQ1OC04ZmFiLThhYjQ5ZmQ3ZDFkNCJ9.n7Z-GhFkg04bdV7OvWdq7g9Bgs463uXpivHikaqzlEY",
  "access_expires_at": "2026-10-30T10:12:41.496286809Z",
  "refresh_token": "H3hCQ4WGNXHZL4Bt4E02PSIe_USawJKnV7YtU7fdoGo",
  "refresh_expires_at": "2026-11-29T09:57:41.495948657Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d0da16a3-d0c5-49e6-8209-f230fcd4fd3f",
  "session_id": "c65b0633-4339-4d58-8fab-8ab49fd7d1d4",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639735018",
  "device_ref": "sandbox-28825"
}
```

```json
{
  "challenge_id": "bb9249eb-5782-4b1b-98da-e57afb95ba7a",
  "expires_at": "2026-10-30T10:02:43.928452753Z",
  "resend_available_at": "2026-10-30T09:57:44.928452753Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639735018` → **200**

```json
{
  "phone": "+380639735018",
  "audience": "CLIENT",
  "code": "767744",
  "sent_at": "2026-10-30T09:57:43.931103732Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bb9249eb-5782-4b1b-98da-e57afb95ba7a",
  "code": "767744",
  "device_ref": "sandbox-28825"
}
```

```json
{
  "session_id": "4a93eb04-2e27-4f8d-974c-f0ab2baef42d",
  "subject": {
    "type": "CLIENT",
    "id": "d0da16a3-d0c5-49e6-8209-f230fcd4fd3f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMGRhMTZhMy1kMGM1LTQ5ZTYtODIwOS1mMjMwZmNkNGZkM2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MTY0LCJpYXQiOjE3OTMzNTQyNjQsImp0aSI6ImFiYTI0OTZjLTA1YWItNDQ1OC1iMWJlLTNhYjgzYzAwZmQ4ZSIsInNpZCI6IjRhOTNlYjA0LTJlMjctNGY4ZC05NzRjLWYwYWIyYmFlZjQyZCJ9.zW9tT6MwT_Zx4jBQd9SbcIzPPcPsLWUBWSagDWRZJgg",
  "access_expires_at": "2026-10-30T10:12:44.172855182Z",
  "refresh_token": "XoTDJU-CHeEfIdo1UZPi3mVg3tb6dv9Vp44RbgcBGgM",
  "refresh_expires_at": "2026-11-29T09:57:44.17245706Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "915ef214-2cac-424d-a2e8-ffdc54ffe268",
  "expires_at": "2026-10-30T10:02:46.389839906Z",
  "resend_available_at": "2026-10-30T09:57:47.389839906Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639735018` → **200**

```json
{
  "phone": "+380639735018",
  "audience": "CLIENT",
  "code": "966998",
  "sent_at": "2026-10-30T09:57:46.391777617Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380636764914"
}
```

```json
{
  "challenge_id": "6588a58c-bd59-4390-b5da-b1738865a7c4",
  "expires_at": "2026-10-30T10:02:46.625544763Z",
  "resend_available_at": "2026-10-30T09:57:47.625544763Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636764914` → **200**

```json
{
  "phone": "+380636764914",
  "audience": "CLIENT",
  "code": "777268",
  "sent_at": "2026-10-30T09:57:46.627324602Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "08ff411a-9212-483b-b12b-7ee9c4512f0f",
  "current_challenge_id": "915ef214-2cac-424d-a2e8-ffdc54ffe268",
  "current_code": "000000",
  "new_challenge_id": "6588a58c-bd59-4390-b5da-b1738865a7c4",
  "new_code": "777268"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "c3b6b460-25b9-417b-9357-b157fd9cfb29"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "e137801f-d9ee-417b-8f01-91213f74d4c6",
  "current_challenge_id": "915ef214-2cac-424d-a2e8-ffdc54ffe268",
  "current_code": "966998",
  "new_challenge_id": "6588a58c-bd59-4390-b5da-b1738865a7c4",
  "new_code": "777268"
}
```

```json
{
  "subject_id": "d0da16a3-d0c5-49e6-8209-f230fcd4fd3f",
  "phone": "+380636764914",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d0da16a3-d0c5-49e6-8209-f230fcd4fd3f",
  "session_id": "c65b0633-4339-4d58-8fab-8ab49fd7d1d4",
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
  "correlation_id": "260493ca-1d14-4c8c-b2c5-4f3f62fed7f6"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636764914",
  "device_ref": "sandbox-12480"
}
```

```json
{
  "challenge_id": "45afc03e-1959-4d2a-bacb-1950056ad06a",
  "expires_at": "2026-10-30T10:02:49.846987243Z",
  "resend_available_at": "2026-10-30T09:57:50.846987243Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636764914` → **200**

```json
{
  "phone": "+380636764914",
  "audience": "CLIENT",
  "code": "497053",
  "sent_at": "2026-10-30T09:57:49.849239044Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "45afc03e-1959-4d2a-bacb-1950056ad06a",
  "code": "497053",
  "device_ref": "sandbox-12480"
}
```

```json
{
  "session_id": "6a9900f2-0f70-4e37-951b-ba4aab6a2227",
  "subject": {
    "type": "CLIENT",
    "id": "d0da16a3-d0c5-49e6-8209-f230fcd4fd3f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMGRhMTZhMy1kMGM1LTQ5ZTYtODIwOS1mMjMwZmNkNGZkM2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MTcwLCJpYXQiOjE3OTMzNTQyNzAsImp0aSI6ImMzYmJjN2E4LTU3OWYtNGExZi05NjljLWQ4N2Y2ZjEyMTg4OSIsInNpZCI6IjZhOTkwMGYyLTBmNzAtNGUzNy05NTFiLWJhNGFhYjZhMjIyNyJ9.5WYQ1BZBF00f1aKzaruf5WFDq7jBrnKnR3UHf2GgWgM",
  "access_expires_at": "2026-10-30T10:12:50.084858873Z",
  "refresh_token": "sFrfB_Edq1Wk33fvC_gAfa_ccSLZ9bXSG9I1EWcNZXU",
  "refresh_expires_at": "2026-11-29T09:57:50.084491765Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d0da16a3-d0c5-49e6-8209-f230fcd4fd3f",
  "session_id": "6a9900f2-0f70-4e37-951b-ba4aab6a2227",
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
  "session_id": "b697bbcc-8ddd-4ccb-94eb-96c4766f786a",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUxNzAsImlhdCI6MTc5MzM1NDI3MCwianRpIjoiYTVjNWY5YzYtMzk3Ny00MzhjLWIwMTktNTlmZGQwNDQxMDMwIiwic2lkIjoiYjY5N2JiY2MtOGRkZC00Y2NiLTk0ZWItOTZjNDc2NmY3ODZhIn0._sShaez96uRB3RNTCBTGF6W96w36FglhJ_9SKvriV4M",
  "access_expires_at": "2026-10-30T10:12:50.791068039Z",
  "refresh_token": "TojCZQWm85FFXWV8Dl1i154IGTlTBN-OJcWDzKGsk6s",
  "refresh_expires_at": "2026-10-30T21:57:50.790636988Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/d0da16a3-d0c5-49e6-8209-f230fcd4fd3f` → **200**

```json
{
  "client": {
    "id": "d0da16a3-d0c5-49e6-8209-f230fcd4fd3f",
    "phone": "+380636764914",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:57:41.494752Z",
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

`POST /api/admin/v1/clients/d0da16a3-d0c5-49e6-8209-f230fcd4fd3f/phone/new-code` → **201**

```json
{
  "phone": "+380635138462"
}
```

```json
{
  "challenge_id": "1b60d9bc-b166-44d4-977a-042738d6b687",
  "expires_at": "2026-10-30T10:02:51.260540476Z",
  "resend_available_at": "2026-10-30T09:57:52.260540476Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635138462` → **200**

```json
{
  "phone": "+380635138462",
  "audience": "CLIENT",
  "code": "058766",
  "sent_at": "2026-10-30T09:57:51.262192448Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/d0da16a3-d0c5-49e6-8209-f230fcd4fd3f/phone` → **422**

```json
{
  "command_id": "d58d481b-02ca-4b95-94a2-b5e498a8cdd5",
  "expected_version": 3,
  "new_challenge_id": "1b60d9bc-b166-44d4-977a-042738d6b687",
  "new_code": "058767",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/d0da16a3-d0c5-49e6-8209-f230fcd4fd3f/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "55399e3a-9929-4b82-8b8c-d58c18cba18f"
}
```

`POST /api/admin/v1/clients/d0da16a3-d0c5-49e6-8209-f230fcd4fd3f/phone` → **400**

```json
{
  "command_id": "31a5fc3f-cca5-42f2-abb3-f44be16403ea",
  "expected_version": 3,
  "new_challenge_id": "1b60d9bc-b166-44d4-977a-042738d6b687",
  "new_code": "058766",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/d0da16a3-d0c5-49e6-8209-f230fcd4fd3f/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "db4cb502-8935-432a-b2b3-584b20d17d44",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/d0da16a3-d0c5-49e6-8209-f230fcd4fd3f/phone` → **200**

```json
{
  "command_id": "0449fec1-ef29-4b33-beba-831b26d30cc0",
  "expected_version": 3,
  "new_challenge_id": "1b60d9bc-b166-44d4-977a-042738d6b687",
  "new_code": "058766",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "d0da16a3-d0c5-49e6-8209-f230fcd4fd3f",
  "phone": "+380635138462",
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
  "correlation_id": "6cbfa2fd-1ccf-422b-a13e-9533abf251f3"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635138462",
  "device_ref": "sandbox-12380"
}
```

```json
{
  "challenge_id": "212824df-7233-474c-bffe-25b2ba494ffa",
  "expires_at": "2026-10-30T10:02:52.378978403Z",
  "resend_available_at": "2026-10-30T09:57:53.378978403Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635138462` → **200**

```json
{
  "phone": "+380635138462",
  "audience": "CLIENT",
  "code": "005240",
  "sent_at": "2026-10-30T09:57:52.381225979Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "212824df-7233-474c-bffe-25b2ba494ffa",
  "code": "005240",
  "device_ref": "sandbox-12380"
}
```

```json
{
  "session_id": "2380b592-7a72-4623-8827-0aadb12bce9e",
  "subject": {
    "type": "CLIENT",
    "id": "d0da16a3-d0c5-49e6-8209-f230fcd4fd3f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMGRhMTZhMy1kMGM1LTQ5ZTYtODIwOS1mMjMwZmNkNGZkM2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MTcyLCJpYXQiOjE3OTMzNTQyNzIsImp0aSI6IjRjZDVlOWI3LTU4MjQtNGUwOS1iNjc0LWE3YTRkNGNmZDk3MCIsInNpZCI6IjIzODBiNTkyLTdhNzItNDYyMy04ODI3LTBhYWRiMTJiY2U5ZSJ9.kr9FGIAGeVYrGcbBwm5nRifvNG6tiygAuLHy3DlEV_A",
  "access_expires_at": "2026-10-30T10:12:52.618718169Z",
  "refresh_token": "HQp-yD7SJP3bx-SgGpRgaVxTQWel4JynBJUfZUwVfTo",
  "refresh_expires_at": "2026-11-29T09:57:52.618395233Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d0da16a3-d0c5-49e6-8209-f230fcd4fd3f",
  "session_id": "2380b592-7a72-4623-8827-0aadb12bce9e",
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
  "phone": "+380634512247",
  "device_ref": "sandbox-30780"
}
```

```json
{
  "challenge_id": "efe77967-0c79-4648-a4c0-fad741d67a30",
  "expires_at": "2026-10-30T10:02:53.056262402Z",
  "resend_available_at": "2026-10-30T09:57:54.056262402Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634512247` → **200**

```json
{
  "phone": "+380634512247",
  "audience": "CLIENT",
  "code": "551930",
  "sent_at": "2026-10-30T09:57:53.058400798Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "efe77967-0c79-4648-a4c0-fad741d67a30",
  "code": "551930",
  "device_ref": "sandbox-30780"
}
```

```json
{
  "session_id": "f99052be-4e0d-4398-bc3f-2ac6013e4bdc",
  "subject": {
    "type": "CLIENT",
    "id": "c8bcd76f-1644-4541-a061-ec8e479e07a6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGJjZDc2Zi0xNjQ0LTQ1NDEtYTA2MS1lYzhlNDc5ZTA3YTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MTczLCJpYXQiOjE3OTMzNTQyNzMsImp0aSI6IjQ1YjczZGEwLWMyNDUtNGQwYi04ZDZjLWJhMDEzZmIyY2NhNSIsInNpZCI6ImY5OTA1MmJlLTRlMGQtNDM5OC1iYzNmLTJhYzYwMTNlNGJkYyJ9.riB3kDoZeHA6u_U-sb1eqirwzHkmWWDWA6DHxJsK7GA",
  "access_expires_at": "2026-10-30T10:12:53.297570441Z",
  "refresh_token": "KAtfqCVaB9x0Y2bPw6MZJyokieQw8YpWoilpdgCfgFQ",
  "refresh_expires_at": "2026-11-29T09:57:53.29721403Z",
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
  "session_id": "f8008ee5-bb61-4d14-afaf-c20060f8eb72",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUxNzQsImlhdCI6MTc5MzM1NDI3NCwianRpIjoiMzJiMGNiMjMtZTM5MC00ODU2LTg5NDEtYjc2ZThlMDYxMzFkIiwic2lkIjoiZjgwMDhlZTUtYmI2MS00ZDE0LWFmYWYtYzIwMDYwZjhlYjcyIn0.I8Vgl0mst48Wq-a_kqsbpWC-QCMrDKrY4T5kWDXz9rI",
  "access_expires_at": "2026-10-30T10:12:54.250256486Z",
  "refresh_token": "_sbtE42k2vCGGIcv2B2qbBJj5aQa03bQ-0FxhjDamCM",
  "refresh_expires_at": "2026-10-30T21:57:54.249688832Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380634512247` → **200**

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
  "correlation_id": "b7c5cf10-6d04-48f3-8a84-2fa88826dd7b"
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
  "session_id": "6c2a4922-fbd6-4daf-9726-144b19feab23",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUxNzUsImlhdCI6MTc5MzM1NDI3NSwianRpIjoiNGFmOWViZjItYjgzNy00ODBhLTljOTctZWEyMDM3MGRkNzY2Iiwic2lkIjoiNmMyYTQ5MjItZmJkNi00ZGFmLTk3MjYtMTQ0YjE5ZmVhYjIzIn0.n-7O8ea7jzAQOEDrdacEgKEWTMqlA2bmexANoKhvfsw",
  "access_expires_at": "2026-10-30T10:12:55.216450977Z",
  "refresh_token": "XSXZ_z8h0OKu9fHpP1WP1nVP5sHxcOqB98X3nLSvrsM",
  "refresh_expires_at": "2026-10-30T21:57:55.216032352Z",
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
  "changed_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T09:44:14.451883Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "76781c42-7bd5-4b29-b5e5-21bded39edd4",
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
  "changed_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T09:57:55.679376096Z"
}
```

## The rider books the airport for 2026-10-30T12:57:54Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600478319",
  "device_ref": "sandbox-30758"
}
```

```json
{
  "challenge_id": "594e2fb4-5e25-4a11-8554-700656d58378",
  "expires_at": "2026-10-30T10:02:55.914239416Z",
  "resend_available_at": "2026-10-30T09:57:56.914239416Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600478319` → **200**

```json
{
  "phone": "+48600478319",
  "audience": "CLIENT",
  "code": "654476",
  "sent_at": "2026-10-30T09:57:55.916287823Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "594e2fb4-5e25-4a11-8554-700656d58378",
  "code": "654476",
  "device_ref": "sandbox-30758"
}
```

```json
{
  "session_id": "ed9129de-bba2-4a4e-ac85-390ec9a88365",
  "subject": {
    "type": "CLIENT",
    "id": "56f64178-feb8-4f0d-92d7-3bef4d74dd0f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NmY2NDE3OC1mZWI4LTRmMGQtOTJkNy0zYmVmNGQ3NGRkMGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MTc2LCJpYXQiOjE3OTMzNTQyNzYsImp0aSI6ImZiZjI4ZDE0LTNlMGEtNDk0Yy05YzQyLTNjZTQ2MDI1YjExZCIsInNpZCI6ImVkOTEyOWRlLWJiYTItNGE0ZS1hYzg1LTM5MGVjOWE4ODM2NSJ9.Gb_d-QTTEn0szo2d3sgu3xtAlOrl0mYJyWahBJEsJ-M",
  "access_expires_at": "2026-10-30T10:12:56.152684359Z",
  "refresh_token": "4JI9zminiuVjQi1Ab1N6JKZ_PMesghON4JMowKCvmt4",
  "refresh_expires_at": "2026-11-29T09:57:56.152352215Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "58d05a80-1a39-4ac0-9848-e2502a56d316",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T12:57:54Z"
}
```

```json
{
  "id": "e5da8157-d2a3-4d20-8a4e-b2ec6649faea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:02:56.380641Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T12:57:54Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "937c4ec1-4b89-43f0-889a-05abf236102f",
  "quote_id": "e5da8157-d2a3-4d20-8a4e-b2ec6649faea",
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
  "pickup_at": "2026-10-30T12:57:54Z"
}
```

```json
{
  "id": "8d0cb8c9-b3b9-4e16-989c-90881bfd79cc",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "56f64178-feb8-4f0d-92d7-3bef4d74dd0f",
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
  "created_at": "2026-10-30T09:57:56.614605Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T12:57:54Z",
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
  "device_ref": "sandbox-9562"
}
```

```json
{
  "challenge_id": "0c6be198-ec6a-4fb6-95da-181bc7f35680",
  "expires_at": "2026-10-30T10:02:56.852593393Z",
  "resend_available_at": "2026-10-30T09:57:57.852593393Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "950478",
  "sent_at": "2026-10-30T09:57:56.854670712Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0c6be198-ec6a-4fb6-95da-181bc7f35680",
  "code": "950478",
  "device_ref": "sandbox-9562"
}
```

```json
{
  "session_id": "c9e37bd3-9332-4d60-868d-10f1fedc238d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTE3NywiaWF0IjoxNzkzMzU0Mjc3LCJqdGkiOiI2OTA4Y2FjOS0xYTZjLTRkZjYtYjZkOS1lMzdhOWNkNWJiMzciLCJzaWQiOiJjOWUzN2JkMy05MzMyLTRkNjAtODY4ZC0xMGYxZmVkYzIzOGQifQ.6ihYxyjs29RcyThOEk1PFvQVFy0mo6ifVctT2sdCXkE",
  "access_expires_at": "2026-10-30T10:12:57.096024008Z",
  "refresh_token": "lhOvKZ2RfT5uNTG2O1LVNxON8HtudNKYY5u7RUhkePc",
  "refresh_expires_at": "2026-11-29T09:57:57.095545329Z",
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
  "command_id": "ff61ff1f-9247-4cfa-a7af-5a2439b9ea60",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:57:57Z",
    "sequence": 1793354277562
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "415cac05-fec0-4476-ab36-abe8314157c5",
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
  "last_heartbeat_at": "2026-10-30T09:57:57.576538Z",
  "last_location_at": "2026-10-30T09:57:57.576538Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "8d0cb8c9-b3b9-4e16-989c-90881bfd79cc",
      "short_number": 25,
      "pickup_at": "2026-10-30T12:57:54Z",
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

`POST /api/driver/v1/preorders/8d0cb8c9-b3b9-4e16-989c-90881bfd79cc/reserve` → **200**

```json
{
  "command_id": "e12ab091-a0dc-4f5d-b7bf-35c30af8f15c"
}
```

```json
{
  "id": "4fe22e04-0e4c-4306-b4b0-c90fd88c6732",
  "state": "RESERVED",
  "order": {
    "order_id": "8d0cb8c9-b3b9-4e16-989c-90881bfd79cc",
    "short_number": 25,
    "pickup_at": "2026-10-30T12:57:54Z",
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
  "reserved_at": "2026-10-30T09:57:58.02125Z",
  "confirm_from": "2026-10-30T12:27:54Z",
  "confirm_until": "2026-10-30T12:37:54Z",
  "drop_until": "2026-10-30T11:57:54Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "4fe22e04-0e4c-4306-b4b0-c90fd88c6732",
      "state": "RESERVED",
      "order": {
        "order_id": "8d0cb8c9-b3b9-4e16-989c-90881bfd79cc",
        "short_number": 25,
        "pickup_at": "2026-10-30T12:57:54Z",
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
      "reserved_at": "2026-10-30T09:57:58.02125Z",
      "confirm_from": "2026-10-30T12:27:54Z",
      "confirm_until": "2026-10-30T12:37:54Z",
      "drop_until": "2026-10-30T11:57:54Z"
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
      "id": "4fe22e04-0e4c-4306-b4b0-c90fd88c6732",
      "state": "RESERVED",
      "order": {
        "order_id": "8d0cb8c9-b3b9-4e16-989c-90881bfd79cc",
        "short_number": 25,
        "pickup_at": "2026-10-30T12:57:54Z",
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
      "reserved_at": "2026-10-30T09:57:58.02125Z",
      "confirm_from": "2026-10-30T12:27:54Z",
      "confirm_until": "2026-10-30T12:37:54Z",
      "drop_until": "2026-10-30T11:57:54Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/4fe22e04-0e4c-4306-b4b0-c90fd88c6732/confirm` → **409**

```json
{
  "command_id": "8ddd76ff-dcb0-44e4-9681-63360356eecf"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/4fe22e04-0e4c-4306-b4b0-c90fd88c6732/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "528a8604-b2f9-45f0-af07-67a283c8b91e"
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
  "session_id": "44074852-8d70-425e-95c9-dd094cdabfcc",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUxNzksImlhdCI6MTc5MzM1NDI3OSwianRpIjoiNjU2MjJkNDctZTVjYy00YWRmLWI0YmQtYTlkOWI2ZDdlYmRhIiwic2lkIjoiNDQwNzQ4NTItOGQ3MC00MjVlLTk1YzktZGQwOTRjZGFiZmNjIn0.Xs6zwa3wGHJ1O1XWkYAsOEhO_u9Q25Zi0dKNJdhKvUs",
  "access_expires_at": "2026-10-30T10:12:59.165059306Z",
  "refresh_token": "PmcbgE_sZ5tty35bFJqjjImldoix0pukJEXZEn3YIPs",
  "refresh_expires_at": "2026-10-30T21:57:59.164678923Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/8d0cb8c9-b3b9-4e16-989c-90881bfd79cc` → **200**

```json
{
  "id": "8d0cb8c9-b3b9-4e16-989c-90881bfd79cc",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "56f64178-feb8-4f0d-92d7-3bef4d74dd0f",
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
  "created_at": "2026-10-30T09:57:56.614605Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T12:57:54Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "4fe22e04-0e4c-4306-b4b0-c90fd88c6732",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T09:57:58.02125Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/8d0cb8c9-b3b9-4e16-989c-90881bfd79cc/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T09:57:56.615585Z",
      "actor": {
        "type": "CLIENT",
        "id": "56f64178-feb8-4f0d-92d7-3bef4d74dd0f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "8d0cb8c9-b3b9-4e16-989c-90881bfd79cc",
        "preorder": true,
        "quote_id": "e5da8157-d2a3-4d20-8a4e-b2ec6649faea",
        "pickup_at": "2026-10-30T12:57:54Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "d201aecb-0ef4-429c-a173-b89f96dcf476"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T09:57:58.02221Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8d0cb8c9-b3b9-4e16-989c-90881bfd79cc",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "4fe22e04-0e4c-4306-b4b0-c90fd88c6732"
      },
      "correlation_id": "45c7aa75-5e70-47e2-863c-8cd6cb6ae1e2"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 8d0cb8c9-b3b9-4e16-989c-90881bfd79cc, reservation 4fe22e04-0e4c-4306-b4b0-c90fd88c6732.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-20091"
}
```

```json
{
  "challenge_id": "a2d5a217-3184-4be0-abfd-589e3e5b29b0",
  "expires_at": "2026-10-30T10:02:59.845977164Z",
  "resend_available_at": "2026-10-30T09:58:00.845977164Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "180792",
  "sent_at": "2026-10-30T09:57:59.848205612Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a2d5a217-3184-4be0-abfd-589e3e5b29b0",
  "code": "180792",
  "device_ref": "sandbox-20091"
}
```

```json
{
  "session_id": "1bf452eb-2a81-4975-a686-f70c62d12764",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTE4MCwiaWF0IjoxNzkzMzU0MjgwLCJqdGkiOiI1ODUyMWMzYS0wYzU0LTQwMTktODI0ZS1hOTFkODdiYzM2YzIiLCJzaWQiOiIxYmY0NTJlYi0yYTgxLTQ5NzUtYTY4Ni1mNzBjNjJkMTI3NjQifQ.-r0dT9kuW9tSmqYHBtoltvdRQJIlu5-27-KD9saIir0",
  "access_expires_at": "2026-10-30T10:13:00.085130842Z",
  "refresh_token": "RclqEg8hScyNnvD-78-2Lia74ojABgsLwbyBIVxq6Do",
  "refresh_expires_at": "2026-11-29T09:58:00.084662082Z",
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
  "command_id": "0240df32-a51e-4b9f-b40d-793fb4e0ec33",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:58:00Z",
    "sequence": 1793354280531
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "706fb268-4605-4510-9665-b02e107e2174",
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
  "last_heartbeat_at": "2026-10-30T09:58:00.54533Z",
  "last_location_at": "2026-10-30T09:58:00.54533Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678630524",
  "device_ref": "sandbox-15815"
}
```

```json
{
  "challenge_id": "12283a34-87c6-439a-a4da-5e37c339a393",
  "expires_at": "2026-10-30T10:03:00.768619231Z",
  "resend_available_at": "2026-10-30T09:58:01.768619231Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678630524` → **200**

```json
{
  "phone": "+380678630524",
  "audience": "CLIENT",
  "code": "434820",
  "sent_at": "2026-10-30T09:58:00.77086643Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "12283a34-87c6-439a-a4da-5e37c339a393",
  "code": "434820",
  "device_ref": "sandbox-15815"
}
```

```json
{
  "session_id": "d41cd423-2e5a-4577-98bb-bf1ab5820e22",
  "subject": {
    "type": "CLIENT",
    "id": "d4f5122b-9ff0-469d-8805-17f374af3785"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGY1MTIyYi05ZmYwLTQ2OWQtODgwNS0xN2YzNzRhZjM3ODUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MTgwLCJpYXQiOjE3OTMzNTQyODAsImp0aSI6ImJmYzkxZmI4LTRjOTUtNDlkYi1iMGUyLTQzYWQ1Mjg4NTk3MCIsInNpZCI6ImQ0MWNkNDIzLTJlNWEtNDU3Ny05OGJiLWJmMWFiNTgyMGUyMiJ9.c1n0vzxoeNOXQjeyq_jRULb7ImimE6juP-R4CjOQy5c",
  "access_expires_at": "2026-10-30T10:13:00.999512915Z",
  "refresh_token": "AeyihCL1_8FyoDQVjG-LvAXNBZLCd4hUIdgDWyINPFk",
  "refresh_expires_at": "2026-11-29T09:58:00.999009156Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "58f8dea7-e2fb-407f-820a-5e9246458892",
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
  "id": "0defcbf9-0dd6-408c-afa3-3c6cb43695c3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:03:01.220898Z",
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
  "command_id": "7fafe0a1-a589-4478-8800-5c22161eba71",
  "quote_id": "0defcbf9-0dd6-408c-afa3-3c6cb43695c3",
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
  "id": "fcf2c836-8b10-4166-8fe1-51ad214cea51",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4f5122b-9ff0-469d-8805-17f374af3785",
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
  "created_at": "2026-10-30T09:58:01.455048Z",
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
    "id": "5380f056-3c52-4c19-9756-1fd37e828ee4",
    "order_id": "fcf2c836-8b10-4166-8fe1-51ad214cea51",
    "expires_at": "2026-10-30T09:58:16.457011Z",
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

`POST /api/driver/v1/offers/5380f056-3c52-4c19-9756-1fd37e828ee4/accept` → **200**

```json
{
  "command_id": "35f744f4-b464-41ee-9e51-51e472201a8d"
}
```

```json
{
  "id": "7b78ea25-3280-4c38-8ff5-3da1fa079f6e",
  "order_id": "fcf2c836-8b10-4166-8fe1-51ad214cea51",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3ea56d8f-ef7c-47a8-8489-7a43f43204ff",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3ea56d8f-ef7c-47a8-8489-7a43f43204ff",
  "order_id": "fcf2c836-8b10-4166-8fe1-51ad214cea51",
  "assignment_id": "7b78ea25-3280-4c38-8ff5-3da1fa079f6e",
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

`POST /api/driver/v1/work-sessions/706fb268-4605-4510-9665-b02e107e2174/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:58:02Z",
    "sequence": 1793354282380
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "706fb268-4605-4510-9665-b02e107e2174",
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
  "last_heartbeat_at": "2026-10-30T09:58:02.394312Z",
  "last_location_at": "2026-10-30T09:58:02.394312Z",
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
  "id": "3ea56d8f-ef7c-47a8-8489-7a43f43204ff",
  "order_id": "fcf2c836-8b10-4166-8fe1-51ad214cea51",
  "assignment_id": "7b78ea25-3280-4c38-8ff5-3da1fa079f6e",
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

`POST /api/driver/v1/trips/3ea56d8f-ef7c-47a8-8489-7a43f43204ff/arrive` → **200**

```json
{
  "command_id": "d8029958-580b-4018-9540-21c5aba537e4",
  "expected_version": 0
}
```

```json
{
  "id": "3ea56d8f-ef7c-47a8-8489-7a43f43204ff",
  "order_id": "fcf2c836-8b10-4166-8fe1-51ad214cea51",
  "assignment_id": "7b78ea25-3280-4c38-8ff5-3da1fa079f6e",
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
  "arrived_at": "2026-10-30T09:58:02.830042Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3ea56d8f-ef7c-47a8-8489-7a43f43204ff/start` → **200**

```json
{
  "command_id": "edb36950-ccee-4aa8-a836-01204dd92844",
  "expected_version": 1
}
```

```json
{
  "id": "3ea56d8f-ef7c-47a8-8489-7a43f43204ff",
  "order_id": "fcf2c836-8b10-4166-8fe1-51ad214cea51",
  "assignment_id": "7b78ea25-3280-4c38-8ff5-3da1fa079f6e",
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
  "arrived_at": "2026-10-30T09:58:02.830042Z",
  "started_at": "2026-10-30T09:58:03.058969Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/706fb268-4605-4510-9665-b02e107e2174/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:58:51Z",
    "sequence": 1793354331305
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "706fb268-4605-4510-9665-b02e107e2174",
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
  "last_heartbeat_at": "2026-10-30T09:58:51.320194Z",
  "last_location_at": "2026-10-30T09:58:51.320194Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/3ea56d8f-ef7c-47a8-8489-7a43f43204ff/complete` → **200**

```json
{
  "command_id": "82684bb9-c411-47c4-af15-da87e4c840eb",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:58:51Z",
  "cash_received": true
}
```

```json
{
  "id": "3ea56d8f-ef7c-47a8-8489-7a43f43204ff",
  "order_id": "fcf2c836-8b10-4166-8fe1-51ad214cea51",
  "assignment_id": "7b78ea25-3280-4c38-8ff5-3da1fa079f6e",
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
  "arrived_at": "2026-10-30T09:58:02.830042Z",
  "started_at": "2026-10-30T09:58:03.058969Z",
  "completed_at": "2026-10-30T09:58:51.553107Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/fcf2c836-8b10-4166-8fe1-51ad214cea51/rating` → **200**

```json
{
  "command_id": "cd8037e8-707b-47e7-8b06-10adb4e7060b",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "fcf2c836-8b10-4166-8fe1-51ad214cea51",
  "score": 5,
  "created_at": "2026-10-30T09:58:51.792758035Z"
}
```

`POST /api/driver/v1/orders/fcf2c836-8b10-4166-8fe1-51ad214cea51/rating` → **200**

```json
{
  "command_id": "adae4809-0ae5-4945-89d0-5a04910523f4",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "fcf2c836-8b10-4166-8fe1-51ad214cea51",
  "score": 4,
  "created_at": "2026-10-30T09:58:52.026810601Z"
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
  "session_id": "5b682527-e3c9-4477-8142-df16adec7948",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUyMzIsImlhdCI6MTc5MzM1NDMzMiwianRpIjoiMDk5MGE4MmItOTQ3Yi00OWEwLTkzNWYtNzFjMDljMTU3ODc5Iiwic2lkIjoiNWI2ODI1MjctZTNjOS00NDc3LTgxNDItZGYxNmFkZWM3OTQ4In0.GEXf_mShOSob8S3hTzZulZQmRuI8Pwp7QGnEmstRjyA",
  "access_expires_at": "2026-10-30T10:13:52.739337225Z",
  "refresh_token": "gvMLWhFNa_oOGLAZhZzweFbW8MXkA7q8RyBY_mCLOhY",
  "refresh_expires_at": "2026-10-30T21:58:52.738926367Z",
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
  "session_id": "93a86585-c1ed-47c4-9c39-d3e3581eecd5",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUyMzMsImlhdCI6MTc5MzM1NDMzMywianRpIjoiNmIzYzdhYTgtN2IyNC00ZGQ1LWIzZWMtOWIzZWU5MmE5NjhmIiwic2lkIjoiOTNhODY1ODUtYzFlZC00N2M0LTljMzktZDNlMzU4MWVlY2Q1In0.4mMpNhafTwtwjZdWPfauRyf4yIM5-uOcYu2GZsJzZY4",
  "access_expires_at": "2026-10-30T10:13:53.219981813Z",
  "refresh_token": "jrE-KakVETeAoU_4bYPCAkTTQUVn7LbJgogys1fIRcM",
  "refresh_expires_at": "2026-10-30T21:58:53.219604087Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/fcf2c836-8b10-4166-8fe1-51ad214cea51/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "fcf2c836-8b10-4166-8fe1-51ad214cea51",
      "author_type": "RIDER",
      "author_id": "d4f5122b-9ff0-469d-8805-17f374af3785",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T09:58:51.792758Z"
    },
    {
      "order_id": "fcf2c836-8b10-4166-8fe1-51ad214cea51",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "d4f5122b-9ff0-469d-8805-17f374af3785",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T09:58:52.026811Z"
    }
  ]
}
```

Done: ratings for order fcf2c836-8b10-4166-8fe1-51ad214cea51.

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
  "session_id": "6d8b2311-9000-466b-a1d5-62b99d4f1411",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUyMzMsImlhdCI6MTc5MzM1NDMzMywianRpIjoiNGE1MmFhNzEtOWNmZS00M2EwLTlkNDgtMTY1MTAxM2I1MWZkIiwic2lkIjoiNmQ4YjIzMTEtOTAwMC00NjZiLWExZDUtNjJiOTlkNGYxNDExIn0.AvaxjFyJkRsPcvUSbQGtuDxEdkwRgQ5IYwlBFNBuD7w",
  "access_expires_at": "2026-10-30T10:13:53.951048584Z",
  "refresh_token": "Rqu1TOQko2HV4aaVrgZccc9XlJBxhiABMSyLULY7p6U",
  "refresh_expires_at": "2026-10-30T21:58:53.950653324Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "b36ec337-c9d9-4c3b-aa0b-019f0fabde38",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "7c5a0b0a-c2ae-47e8-a0c3-a19a9b3a9262",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:58:54.184339Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7c5a0b0a-c2ae-47e8-a0c3-a19a9b3a9262` → **200**

```json
{
  "id": "7c5a0b0a-c2ae-47e8-a0c3-a19a9b3a9262",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:58:54.184339Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7c5a0b0a-c2ae-47e8-a0c3-a19a9b3a9262` → **200**

```json
{
  "id": "7c5a0b0a-c2ae-47e8-a0c3-a19a9b3a9262",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:58:54.184339Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7c5a0b0a-c2ae-47e8-a0c3-a19a9b3a9262` → **200**

```json
{
  "id": "7c5a0b0a-c2ae-47e8-a0c3-a19a9b3a9262",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:58:54.184339Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7c5a0b0a-c2ae-47e8-a0c3-a19a9b3a9262` → **200**

```json
{
  "id": "7c5a0b0a-c2ae-47e8-a0c3-a19a9b3a9262",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:58:54.184339Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7c5a0b0a-c2ae-47e8-a0c3-a19a9b3a9262` → **200**

```json
{
  "id": "7c5a0b0a-c2ae-47e8-a0c3-a19a9b3a9262",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T09:58:54.184339Z",
  "ready_at": "2026-10-30T09:58:58.30252Z",
  "expires_at": "2026-10-31T09:58:58.30252Z"
}
```

`GET /api/admin/v1/reports/exports/7c5a0b0a-c2ae-47e8-a0c3-a19a9b3a9262/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "203b24dc-e0df-416e-aab7-89d9ff3e2724",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "0b601ae0-f044-4183-a1ba-480c4d26dcca",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:58:59.556762Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0b601ae0-f044-4183-a1ba-480c4d26dcca` → **200**

```json
{
  "id": "0b601ae0-f044-4183-a1ba-480c4d26dcca",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:58:59.556762Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0b601ae0-f044-4183-a1ba-480c4d26dcca` → **200**

```json
{
  "id": "0b601ae0-f044-4183-a1ba-480c4d26dcca",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:58:59.556762Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0b601ae0-f044-4183-a1ba-480c4d26dcca` → **200**

```json
{
  "id": "0b601ae0-f044-4183-a1ba-480c4d26dcca",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:58:59.556762Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0b601ae0-f044-4183-a1ba-480c4d26dcca` → **200**

```json
{
  "id": "0b601ae0-f044-4183-a1ba-480c4d26dcca",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T09:58:59.556762Z",
  "ready_at": "2026-10-30T09:59:03.309132Z",
  "expires_at": "2026-10-31T09:59:03.309132Z"
}
```

`GET /api/admin/v1/reports/exports/0b601ae0-f044-4183-a1ba-480c4d26dcca/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/2b2f6961-bd15-4243-850a-5f39616f11b7` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/2b2f6961-bd15-4243-850a-5f39616f11b7",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a6410844-690a-4a1d-8fec-65a451500d98"
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
  "device_ref": "sandbox-24737"
}
```

```json
{
  "challenge_id": "3f60e470-3079-4f62-b042-9857c98fbb47",
  "expires_at": "2026-10-30T10:04:03.971416283Z",
  "resend_available_at": "2026-10-30T09:59:04.971416283Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "054264",
  "sent_at": "2026-10-30T09:59:03.973931936Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3f60e470-3079-4f62-b042-9857c98fbb47",
  "code": "054264",
  "device_ref": "sandbox-24737"
}
```

```json
{
  "session_id": "b36bf283-f2be-4cfe-90e5-86df9ddba567",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTI0NCwiaWF0IjoxNzkzMzU0MzQ0LCJqdGkiOiIxN2I0YTg3Yy1jMzEzLTQ3NTYtYjU0Ni02Y2FhNWMzMzU3NjciLCJzaWQiOiJiMzZiZjI4My1mMmJlLTRjZmUtOTBlNS04NmRmOWRkYmE1NjcifQ.6S72kKZi5vUL9LAvJtGkOUnGRsH-vShfBHbQDBhGrcg",
  "access_expires_at": "2026-10-30T10:14:04.210852976Z",
  "refresh_token": "DYqXQBWusB79If5J6QirYPbY9mfgsX-IFJWCfok--xY",
  "refresh_expires_at": "2026-11-29T09:59:04.210368767Z",
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
  "command_id": "03b376d3-c3ca-41a7-a5ee-d4dc4dc80593",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:59:04Z",
    "sequence": 1793354344882
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5713c9c3-7e96-4d05-a6e0-d8411b45ff6b",
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
  "last_heartbeat_at": "2026-10-30T09:59:04.896533Z",
  "last_location_at": "2026-10-30T09:59:04.896533Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "a20e769d-4788-414b-b228-d6c62372c864",
  "points": [
    {
      "sequence": 1793354347123,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T09:58:07Z"
    },
    {
      "sequence": 1793354347128,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T09:59:07Z"
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
  "session_id": "8f2b03f6-86c3-4766-865e-ad40938c024e",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUyNDcsImlhdCI6MTc5MzM1NDM0NywianRpIjoiZTNkYjE2NzktZmQ1OS00ZjE3LTk3ZDYtMzEwZWNhNTgzMmZmIiwic2lkIjoiOGYyYjAzZjYtODZjMy00NzY2LTg2NWUtYWQ0MDkzOGMwMjRlIn0.tWyoVQeG3-NqH70JR187FDU-kicjI8h1alFgA7jPdNE",
  "access_expires_at": "2026-10-30T10:14:07.657839796Z",
  "refresh_token": "IiJe8LotXiw2Ak8sL49x4S1_7FYGuhihLm58OWLp2LE",
  "refresh_expires_at": "2026-10-30T21:59:07.657480618Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "968effe3-82cf-4975-ba53-dda3cf7a087a",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T09:59:07Z",
        "track_point_id": "df2e85a8-a411-4dfa-aace-adab6dad5021",
        "work_session_id": "5713c9c3-7e96-4d05-a6e0-d8411b45ff6b"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T09:59:07Z",
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

`POST /api/admin/v1/driver-risk-flags/968effe3-82cf-4975-ba53-dda3cf7a087a/confirm` → **200**

```json
{
  "command_id": "ac3b5776-e483-4281-aace-aaa460c37b2d",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "968effe3-82cf-4975-ba53-dda3cf7a087a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T09:59:07Z",
    "track_point_id": "df2e85a8-a411-4dfa-aace-adab6dad5021",
    "work_session_id": "5713c9c3-7e96-4d05-a6e0-d8411b45ff6b"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T09:59:07Z",
  "reason": null,
  "reviewed_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
  "reviewed_at": "2026-10-30T09:59:08.362139Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/968effe3-82cf-4975-ba53-dda3cf7a087a/dismiss` → **409**

```json
{
  "command_id": "626a1103-beb3-4206-a9cb-a04f760ea47b",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/968effe3-82cf-4975-ba53-dda3cf7a087a/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "2312a08f-acf7-412c-93d9-b906a7e27ae1"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "0baf0f97-63df-4d8a-8e9a-cb41423c148d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "28ce05f2-6882-49e8-b093-70774fe8613d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
  "raised_at": "2026-10-30T09:59:08.834292Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/28ce05f2-6882-49e8-b093-70774fe8613d/dismiss` → **200**

```json
{
  "command_id": "32d2753f-a258-4921-90b7-0f2a61129bd0",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "28ce05f2-6882-49e8-b093-70774fe8613d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
  "raised_at": "2026-10-30T09:59:08.834292Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
  "reviewed_at": "2026-10-30T09:59:09.071424Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "ec10d5b8-1c32-457b-b449-7fb1748e6f9d",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "968effe3-82cf-4975-ba53-dda3cf7a087a"
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
      "actor_id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T09:59:09.324657Z"
    }
  ]
}
```

Done: flag 968effe3-82cf-4975-ba53-dda3cf7a087a confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "5c524de0-7681-47fc-8255-5878cc256626",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUyNTAsImlhdCI6MTc5MzM1NDM1MCwianRpIjoiZDhiMTQzMmYtZTA2MC00NjgzLWJhZTEtZGUzM2E0YmJlOGUxIiwic2lkIjoiNWM1MjRkZTAtNzY4MS00N2ZjLTgyNTUtNTg3OGNjMjU2NjI2In0.SAxdMKj2a9eHnhBnmowJ-9KQcwHanxCjZ3ebjEv7L48",
  "access_expires_at": "2026-10-30T10:14:10.070213122Z",
  "refresh_token": "m76n-YVcEi5UYNcsJr6YiDHUZSe53aMTKw4UzY1F5tE",
  "refresh_expires_at": "2026-10-30T21:59:10.069808143Z",
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
      "actor_id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T09:59:09.324657Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "3b488900-4bb1-459f-92b4-2c86199f149d",
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
  "session_id": "5713c9c3-7e96-4d05-a6e0-d8411b45ff6b",
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
  "last_heartbeat_at": "2026-10-30T09:59:04.896533Z",
  "last_location_at": "2026-10-30T09:59:04.896533Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5713c9c3-7e96-4d05-a6e0-d8411b45ff6b/close` → **200**

```json
{
  "command_id": "f3f6eb5f-be6c-4ff2-b61a-6086428708fc",
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
  "session_id": "c647f3d3-33ea-4fa7-ae04-3d16b5c2fc4b",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUyNTEsImlhdCI6MTc5MzM1NDM1MSwianRpIjoiZDdjZTdkYTUtYjFjNy00Y2E5LWIxMmEtYWZiYmU0NDdkZGQxIiwic2lkIjoiYzY0N2YzZDMtMzNlYS00ZmE3LWFlMDQtM2QxNmI1YzJmYzRiIn0.-7ZUSxI3Up65a_JTcCuPu8PO3wp_BiGxwlKW9lycL_M",
  "access_expires_at": "2026-10-30T10:14:11.480761097Z",
  "refresh_token": "pY7f-oN2acbSzTyBoj67NVOl2_nmD8hHo67xYb6lgoY",
  "refresh_expires_at": "2026-10-30T21:59:11.480324196Z",
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
  "command_id": "bec7f2d1-8b4a-4fd6-ae91-89d9c4c8b2c7",
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
  "changed_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T09:59:11.940153Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "bec7f2d1-8b4a-4fd6-ae91-89d9c4c8b2c7",
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
  "changed_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T09:59:11.940153Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48172574918",
  "device_ref": "sandbox-4660"
}
```

```json
{
  "challenge_id": "6e3d45a1-d982-4962-8ae9-de683636f8be",
  "expires_at": "2026-10-30T10:04:12.423674335Z",
  "resend_available_at": "2026-10-30T09:59:13.423674335Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48172574918` → **200**

```json
{
  "phone": "+48172574918",
  "audience": "CLIENT",
  "code": "193690",
  "sent_at": "2026-10-30T09:59:12.426060671Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6e3d45a1-d982-4962-8ae9-de683636f8be",
  "code": "193690",
  "device_ref": "sandbox-4660"
}
```

```json
{
  "session_id": "8e79ab78-c962-4dc7-8697-a345d68f1206",
  "subject": {
    "type": "CLIENT",
    "id": "b6768563-205d-4140-aad3-1e7d0becff00"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNjc2ODU2My0yMDVkLTQxNDAtYWFkMy0xZTdkMGJlY2ZmMDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MjUyLCJpYXQiOjE3OTMzNTQzNTIsImp0aSI6IjUxODY3NDg4LTg0ZmItNGJlYS1hMTJiLTZkMjNkNTliOTFjNiIsInNpZCI6IjhlNzlhYjc4LWM5NjItNGRjNy04Njk3LWEzNDVkNjhmMTIwNiJ9.t1JcQ6i_728bajOuwQNzVqlWt6Pj4g7d2DYbNO5QWoc",
  "access_expires_at": "2026-10-30T10:14:12.668578024Z",
  "refresh_token": "d87E4BrO_hE2O_BMvvalcRJA9wfAekZzG9uh-6TF-cA",
  "refresh_expires_at": "2026-11-29T09:59:12.668282878Z",
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
  "correlation_id": "58f8d071-5617-4f05-aada-92df5dac0788"
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
  "device_ref": "sandbox-11021"
}
```

```json
{
  "challenge_id": "5259826f-15ba-4d33-a50d-4196529a6fbe",
  "expires_at": "2026-10-30T10:04:13.326524534Z",
  "resend_available_at": "2026-10-30T09:59:14.326524534Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "644256",
  "sent_at": "2026-10-30T09:59:13.329505675Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5259826f-15ba-4d33-a50d-4196529a6fbe",
  "code": "644256",
  "device_ref": "sandbox-11021"
}
```

```json
{
  "session_id": "2cbb60da-424e-49c7-bc0f-0800aa51af0e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTI1MywiaWF0IjoxNzkzMzU0MzUzLCJqdGkiOiI2OWNjNzczOS1iZTQ5LTQ4ODYtYTE2NC1jYTYyYmJjMGE3YmMiLCJzaWQiOiIyY2JiNjBkYS00MjRlLTQ5YzctYmMwZi0wODAwYWE1MWFmMGUifQ.z0JDEaYbRX3ZQPfJeoGijNotkUdFJ0-9mqYBqaIYas8",
  "access_expires_at": "2026-10-30T10:14:13.574248843Z",
  "refresh_token": "DmmPzTqh_F2YHO3z-hUgh2bkHIbUJhMeLNbwqBnAxd0",
  "refresh_expires_at": "2026-11-29T09:59:13.573817727Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "415cac05-fec0-4476-ab36-abe8314157c5",
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
  "last_heartbeat_at": "2026-10-30T09:57:57.576538Z",
  "last_location_at": "2026-10-30T09:57:57.576538Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/415cac05-fec0-4476-ab36-abe8314157c5/handover` → **200**

```json
{
  "command_id": "e737c033-92b0-425d-90c7-0a0691cdb88a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "415cac05-fec0-4476-ab36-abe8314157c5",
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
  "last_heartbeat_at": "2026-10-30T09:57:57.576538Z",
  "last_location_at": "2026-10-30T09:57:57.576538Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/415cac05-fec0-4476-ab36-abe8314157c5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:59:14Z",
    "sequence": 1793354354258
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "415cac05-fec0-4476-ab36-abe8314157c5",
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
  "last_heartbeat_at": "2026-10-30T09:59:14.272751Z",
  "last_location_at": "2026-10-30T09:59:14.272751Z",
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
  "session_id": "415cac05-fec0-4476-ab36-abe8314157c5",
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
  "last_heartbeat_at": "2026-10-30T09:59:14.272751Z",
  "last_location_at": "2026-10-30T09:59:14.272751Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/415cac05-fec0-4476-ab36-abe8314157c5/close` → **200**

```json
{
  "command_id": "da5a2f0f-ea62-4eba-a292-7545bbb1d71f",
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
  "correlation_id": "5c2436b6-8941-41a5-991e-eedae3232645"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675388258",
  "device_ref": "sandbox-7968"
}
```

```json
{
  "challenge_id": "5e1310b0-e844-47e1-aa3d-1b4f5c7505f3",
  "expires_at": "2026-10-30T10:04:15.418481321Z",
  "resend_available_at": "2026-10-30T09:59:16.418481321Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675388258` → **200**

```json
{
  "phone": "+380675388258",
  "audience": "CLIENT",
  "code": "086269",
  "sent_at": "2026-10-30T09:59:15.420683488Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5e1310b0-e844-47e1-aa3d-1b4f5c7505f3",
  "code": "086269",
  "device_ref": "sandbox-7968"
}
```

```json
{
  "session_id": "752bfddd-4408-4d88-a608-874422d856bc",
  "subject": {
    "type": "CLIENT",
    "id": "303de356-4cba-4491-90c8-16dfc13e3979"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMDNkZTM1Ni00Y2JhLTQ0OTEtOTBjOC0xNmRmYzEzZTM5NzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MjU1LCJpYXQiOjE3OTMzNTQzNTUsImp0aSI6ImQ0YzIyYjcyLWY0NmUtNDRhZS1iODhjLWQ3YmVkYzkxMTcwOCIsInNpZCI6Ijc1MmJmZGRkLTQ0MDgtNGQ4OC1hNjA4LTg3NDQyMmQ4NTZiYyJ9.rXt1ryINGtm3haeh6AfdES_KuN2IaiM6xJwOh96bSw4",
  "access_expires_at": "2026-10-30T10:14:15.66919902Z",
  "refresh_token": "nxiK-gF79ObGORPoZS8hXjfEkhsyyOq1tNvs7Qk0ia0",
  "refresh_expires_at": "2026-11-29T09:59:15.668828109Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "effc6785-5c79-4a5a-bbc1-42c6dba2ea6a",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "3b8288f0-4fc5-4e81-bbb0-3415414cd836",
  "upload_path": "/api/rider/v1/uploads/3b8288f0-4fc5-4e81-bbb0-3415414cd836",
  "expires_at": "2026-10-30T10:14:15.897192356Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/3b8288f0-4fc5-4e81-bbb0-3415414cd836` → **200**

```json
{
  "file_id": "3b8288f0-4fc5-4e81-bbb0-3415414cd836",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "f0b2e879-7c66-45e0-b8d5-ba676b6d0047",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "3b8288f0-4fc5-4e81-bbb0-3415414cd836"
  ]
}
```

```json
{
  "id": "1b48e1d0-d694-409a-bd08-9435dc87261e",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "303de356-4cba-4491-90c8-16dfc13e3979",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T09:59:16.150265Z",
  "updated_at": "2026-10-30T09:59:16.150265Z",
  "respond_by": "2026-10-30T13:59:16.150265Z",
  "messages": [
    {
      "id": "54114ab8-8306-4802-b9b9-3e572a527851",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "303de356-4cba-4491-90c8-16dfc13e3979",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T09:59:16.151144Z",
      "attachments": [
        {
          "file_id": "3b8288f0-4fc5-4e81-bbb0-3415414cd836",
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
  "session_id": "b6b9368e-7eb7-4948-bdc0-47f76e56e471",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUyNTYsImlhdCI6MTc5MzM1NDM1NiwianRpIjoiN2U1ODg5YzQtOWVhZC00YmYzLTlhOGUtMWMyYWFjNzljMTZhIiwic2lkIjoiYjZiOTM2OGUtN2ViNy00OTQ4LWJkYzAtNDdmNzZlNTZlNDcxIn0.KIUnCOyQM_GvYa68n_efxhZhE-Tv_PwwCTLSn9up0x0",
  "access_expires_at": "2026-10-30T10:14:16.67332345Z",
  "refresh_token": "Y5yBVRY7Vr0_cXddLfSgW7L0wIEmWP9-VmE2edCTwFM",
  "refresh_expires_at": "2026-10-30T21:59:16.672711989Z",
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
  "session_id": "61dcf278-311b-425b-b73d-36156c83e37a",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUyNTcsImlhdCI6MTc5MzM1NDM1NywianRpIjoiOTc4Y2E3ZTItMWRhNS00YzAzLWEwNzAtMTNhMzgyNDExOTE2Iiwic2lkIjoiNjFkY2YyNzgtMzExYi00MjViLWI3M2QtMzYxNTZjODNlMzdhIn0.iKcB7OZ8-cn2DneCa87xFbG2CEq-5lVwn156v6MyO1s",
  "access_expires_at": "2026-10-30T10:14:17.167192737Z",
  "refresh_token": "N4Fw5PA_3_q2GugRl72lxw8nq3Rq8uFkaaAfbkb_V7o",
  "refresh_expires_at": "2026-10-30T21:59:17.166792136Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/1b48e1d0-d694-409a-bd08-9435dc87261e/attachments/3b8288f0-4fc5-4e81-bbb0-3415414cd836` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "662d35c9-4bae-4a9b-84e5-c12916598ca2",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "e2bdf109-269e-4435-8452-adac5bd5f83a",
  "upload_path": "/api/operator/v1/uploads/e2bdf109-269e-4435-8452-adac5bd5f83a",
  "expires_at": "2026-10-30T10:14:17.406914792Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/e2bdf109-269e-4435-8452-adac5bd5f83a` → **200**

```json
{
  "file_id": "e2bdf109-269e-4435-8452-adac5bd5f83a",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/1b48e1d0-d694-409a-bd08-9435dc87261e` → **200**

```json
{
  "id": "1b48e1d0-d694-409a-bd08-9435dc87261e",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "303de356-4cba-4491-90c8-16dfc13e3979",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T09:59:16.150265Z",
  "updated_at": "2026-10-30T09:59:16.150265Z",
  "respond_by": "2026-10-30T13:59:16.150265Z",
  "messages": [
    {
      "id": "54114ab8-8306-4802-b9b9-3e572a527851",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "303de356-4cba-4491-90c8-16dfc13e3979",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T09:59:16.151144Z",
      "attachments": [
        {
          "file_id": "3b8288f0-4fc5-4e81-bbb0-3415414cd836",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/1b48e1d0-d694-409a-bd08-9435dc87261e/comments` → **200**

```json
{
  "command_id": "5c590ad9-3b8f-4748-bc0a-7ad355c575df",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "e2bdf109-269e-4435-8452-adac5bd5f83a"
  ]
}
```

```json
{
  "id": "1b48e1d0-d694-409a-bd08-9435dc87261e",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "303de356-4cba-4491-90c8-16dfc13e3979",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T09:59:16.150265Z",
  "updated_at": "2026-10-30T09:59:17.889202Z",
  "respond_by": "2026-10-30T13:59:16.150265Z",
  "messages": [
    {
      "id": "54114ab8-8306-4802-b9b9-3e572a527851",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "303de356-4cba-4491-90c8-16dfc13e3979",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T09:59:16.151144Z",
      "attachments": [
        {
          "file_id": "3b8288f0-4fc5-4e81-bbb0-3415414cd836",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "4a77ca2d-6888-4706-9926-e54d310fd5c8",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T09:59:17.888568Z",
      "attachments": [
        {
          "file_id": "e2bdf109-269e-4435-8452-adac5bd5f83a",
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

`GET /api/rider/v1/support/cases/1b48e1d0-d694-409a-bd08-9435dc87261e` → **200**

```json
{
  "id": "1b48e1d0-d694-409a-bd08-9435dc87261e",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "303de356-4cba-4491-90c8-16dfc13e3979",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T09:59:16.150265Z",
  "updated_at": "2026-10-30T09:59:17.889202Z",
  "respond_by": "2026-10-30T13:59:16.150265Z",
  "messages": [
    {
      "id": "54114ab8-8306-4802-b9b9-3e572a527851",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "303de356-4cba-4491-90c8-16dfc13e3979",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T09:59:16.151144Z",
      "attachments": [
        {
          "file_id": "3b8288f0-4fc5-4e81-bbb0-3415414cd836",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "4a77ca2d-6888-4706-9926-e54d310fd5c8",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T09:59:17.888568Z",
      "attachments": [
        {
          "file_id": "e2bdf109-269e-4435-8452-adac5bd5f83a",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/1b48e1d0-d694-409a-bd08-9435dc87261e/attachments/e2bdf109-269e-4435-8452-adac5bd5f83a` → **200**

Done: support case 1b48e1d0-d694-409a-bd08-9435dc87261e, rider attachment 3b8288f0-4fc5-4e81-bbb0-3415414cd836, operator attachment e2bdf109-269e-4435-8452-adac5bd5f83a.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734531225",
  "device_ref": "sandbox-1169"
}
```

```json
{
  "challenge_id": "319eccd8-35f6-43ef-80a9-c553552c49ef",
  "expires_at": "2026-10-30T10:04:18.370710558Z",
  "resend_available_at": "2026-10-30T09:59:19.370710558Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734531225` → **200**

```json
{
  "phone": "+380734531225",
  "audience": "CLIENT",
  "code": "910814",
  "sent_at": "2026-10-30T09:59:18.372840867Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "319eccd8-35f6-43ef-80a9-c553552c49ef",
  "code": "910814",
  "device_ref": "sandbox-1169"
}
```

```json
{
  "session_id": "08f763ed-e409-4add-8b3b-947c8f75ca8e",
  "subject": {
    "type": "CLIENT",
    "id": "92e858cc-f0e4-4d28-8925-d9dabc64d39f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MmU4NThjYy1mMGU0LTRkMjgtODkyNS1kOWRhYmM2NGQzOWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MjU4LCJpYXQiOjE3OTMzNTQzNTgsImp0aSI6IjZlNDM5MzNhLTUwZjQtNDMxZi05MmQxLTM3MGNjNTEwOTdiOSIsInNpZCI6IjA4Zjc2M2VkLWU0MDktNGFkZC04YjNiLTk0N2M4Zjc1Y2E4ZSJ9.jrb_wIfy5LZwIYS8znYV8F5xFmhxYiO-f6gdI4f-S0c",
  "access_expires_at": "2026-10-30T10:14:18.612897005Z",
  "refresh_token": "eceYKXzQMaSUCxSlYrhH9jP7akJV7Z8Pq0eF33O9LGo",
  "refresh_expires_at": "2026-11-29T09:59:18.612459743Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "18f28419-c283-43c2-8819-c663ee132dca",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "e033672f-3f0e-4e41-b325-65586c918734",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-e033672f-3f0e-4e41-b325-65586c918734",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "9ecdc10662c7f2e45973e5895454e90d",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=e033672f-3f0e-4e41-b325-65586c918734",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734531225"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=e033672f-3f0e-4e41-b325-65586c918734",
  "expires_at": "2026-10-30T10:29:18.840404Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/e033672f-3f0e-4e41-b325-65586c918734` → **200**

```json
{
  "id": "e033672f-3f0e-4e41-b325-65586c918734",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T10:29:18.840404Z",
  "card": {
    "id": "2dea8341-21bd-4da0-ab0a-6959c556f56a",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6390",
    "card_type": "Visa",
    "created_at": "2026-10-30T09:59:19.064828Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ba4bedc3-73f2-493b-8ee0-367cd9850b47",
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
  "id": "4026cc5b-198f-4c96-a108-193dca6c3135",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:04:19.307154Z",
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
  "command_id": "68926adc-645a-4b75-9325-07bb877ba45b",
  "quote_id": "4026cc5b-198f-4c96-a108-193dca6c3135",
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
  "id": "14da2423-c105-453e-b24e-a5a91af8e9d8",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "92e858cc-f0e4-4d28-8925-d9dabc64d39f",
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
  "created_at": "2026-10-30T09:59:19.543638Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/14da2423-c105-453e-b24e-a5a91af8e9d8` → **200**

```json
{
  "id": "14da2423-c105-453e-b24e-a5a91af8e9d8",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "92e858cc-f0e4-4d28-8925-d9dabc64d39f",
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
  "created_at": "2026-10-30T09:59:19.543638Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/14da2423-c105-453e-b24e-a5a91af8e9d8` → **200**

```json
{
  "id": "14da2423-c105-453e-b24e-a5a91af8e9d8",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "92e858cc-f0e4-4d28-8925-d9dabc64d39f",
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
  "created_at": "2026-10-30T09:59:19.543638Z",
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

`GET /api/rider/v1/orders/14da2423-c105-453e-b24e-a5a91af8e9d8` → **200**

```json
{
  "id": "14da2423-c105-453e-b24e-a5a91af8e9d8",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "92e858cc-f0e4-4d28-8925-d9dabc64d39f",
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
  "created_at": "2026-10-30T09:59:19.543638Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/14da2423-c105-453e-b24e-a5a91af8e9d8/switch-to-cash` → **200**

```json
{
  "command_id": "8055e401-10d1-4080-8bba-afc9e5a2f99d",
  "expected_version": 3
}
```

```json
{
  "id": "14da2423-c105-453e-b24e-a5a91af8e9d8",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "92e858cc-f0e4-4d28-8925-d9dabc64d39f",
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
  "created_at": "2026-10-30T09:59:19.543638Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/14da2423-c105-453e-b24e-a5a91af8e9d8/switch-to-cash` → **409**

```json
{
  "command_id": "e619a7c1-e29f-496a-8f28-09ebde56a8e4",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/14da2423-c105-453e-b24e-a5a91af8e9d8/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b61d9613-9272-44a6-b57f-dfd49095573c"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/14da2423-c105-453e-b24e-a5a91af8e9d8` → **200**

```json
{
  "id": "14da2423-c105-453e-b24e-a5a91af8e9d8",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "92e858cc-f0e4-4d28-8925-d9dabc64d39f",
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
  "created_at": "2026-10-30T09:59:19.543638Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/14da2423-c105-453e-b24e-a5a91af8e9d8/cancel` → **200**

```json
{
  "command_id": "768dbc81-29a5-4c5a-86f0-87a59cc9b546",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "14da2423-c105-453e-b24e-a5a91af8e9d8",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "92e858cc-f0e4-4d28-8925-d9dabc64d39f",
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
  "created_at": "2026-10-30T09:59:19.543638Z",
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
  "session_id": "2cce5a5f-68e2-49f7-9d47-3312103a8271",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUyNjIsImlhdCI6MTc5MzM1NDM2MiwianRpIjoiNjc0MzExODctNTA2OS00OWIxLTlkNWQtOTkwZTJkMDNjM2YyIiwic2lkIjoiMmNjZTVhNWYtNjhlMi00OWY3LTlkNDctMzMxMjEwM2E4MjcxIn0.XqOcfBwHhJ3Y4geYZArAvs6HOF5lC29y9e-vs004Gxk",
  "access_expires_at": "2026-10-30T10:14:22.692959883Z",
  "refresh_token": "bu4iNCfGmefnNlzWaUrFdGW80nvG-VLwyXWgbXcWfBQ",
  "refresh_expires_at": "2026-10-30T21:59:22.69245274Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-8341"
}
```

```json
{
  "challenge_id": "fd7ce5b6-1d9e-455d-be69-bc5521d81362",
  "expires_at": "2026-10-30T10:04:22.919233097Z",
  "resend_available_at": "2026-10-30T09:59:23.919233097Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "780527",
  "sent_at": "2026-10-30T09:59:22.921715595Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fd7ce5b6-1d9e-455d-be69-bc5521d81362",
  "code": "780527",
  "device_ref": "sandbox-8341"
}
```

```json
{
  "session_id": "1d7f8dd3-55b5-49b9-9076-1bd8229a292e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTI2MywiaWF0IjoxNzkzMzU0MzYzLCJqdGkiOiJmNGNhNzJmMS00Y2FhLTRiZDctODM0MC04ZDlmY2RlNzU4OGEiLCJzaWQiOiIxZDdmOGRkMy01NWI1LTQ5YjktOTA3Ni0xYmQ4MjI5YTI5MmUifQ.z58W6eGTTccWz8hvT1XV37CZ0CXStpdtuXFriuqjcHM",
  "access_expires_at": "2026-10-30T10:14:23.164436376Z",
  "refresh_token": "JYu0r0HDGKzrCEoYY9s7EX_pVBJSezknDSVBT378qHU",
  "refresh_expires_at": "2026-11-29T09:59:23.164022679Z",
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
      "actor_id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T09:59:09.324657Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T09:59:10.529566Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "bc0ebb41-a2c5-4100-b8fb-0b15c5f10c82",
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
  "device_ref": "sandbox-24842"
}
```

```json
{
  "challenge_id": "64cdb433-f8ec-44d3-9cf0-f977fcb72c32",
  "expires_at": "2026-10-30T10:04:24.081496783Z",
  "resend_available_at": "2026-10-30T09:59:25.081496783Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "810542",
  "sent_at": "2026-10-30T09:59:24.083594821Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "64cdb433-f8ec-44d3-9cf0-f977fcb72c32",
  "code": "810542",
  "device_ref": "sandbox-24842"
}
```

```json
{
  "session_id": "c7ff6a9a-9d22-4664-8afe-d2042f6798c2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTI2NCwiaWF0IjoxNzkzMzU0MzY0LCJqdGkiOiJkZWQ3ZTViMy1mM2Q2LTQxM2YtYTA5Zi03M2EzMzI0OTUwMDgiLCJzaWQiOiJjN2ZmNmE5YS05ZDIyLTQ2NjQtOGFmZS1kMjA0MmY2Nzk4YzIifQ.2UqDhdYWTmRQg5ZaDOMbN_gKaiwDy7ZHhDVOpS_6YGE",
  "access_expires_at": "2026-10-30T10:14:24.326346723Z",
  "refresh_token": "ZK-SJQPVhCh3mdNnnbJ7lGtEu0bT0YU5FZSKWXjar5Y",
  "refresh_expires_at": "2026-11-29T09:59:24.325895875Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "706fb268-4605-4510-9665-b02e107e2174",
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
  "last_heartbeat_at": "2026-10-30T09:58:51.320194Z",
  "last_location_at": "2026-10-30T09:58:51.320194Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/706fb268-4605-4510-9665-b02e107e2174/handover` → **200**

```json
{
  "command_id": "980b2ad1-0b88-4f41-b79f-587d7fbbeeff",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "706fb268-4605-4510-9665-b02e107e2174",
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
  "last_heartbeat_at": "2026-10-30T09:58:51.320194Z",
  "last_location_at": "2026-10-30T09:58:51.320194Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

(the car drives 15 s to the next point)

`POST /api/driver/v1/work-sessions/706fb268-4605-4510-9665-b02e107e2174/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:59:40Z",
    "sequence": 1793354380294
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "706fb268-4605-4510-9665-b02e107e2174",
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
  "last_heartbeat_at": "2026-10-30T09:59:40.045407Z",
  "last_location_at": "2026-10-30T09:59:40.045407Z",
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
  "command_id": "d65f82b2-054a-47d9-b65b-d4c9e6a82907",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:59:40Z",
    "sequence": 1793354380499
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0ff09602-9fc9-4fe5-bac3-24614863e96d",
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
  "last_heartbeat_at": "2026-10-30T09:59:40.52025Z",
  "last_location_at": "2026-10-30T09:59:40.52025Z",
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
  "session_id": "c65cf416-0a43-4825-9292-d34dbcb10bd4",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUyODEsImlhdCI6MTc5MzM1NDM4MSwianRpIjoiN2UwYWM2NGEtNjQ2MS00ZjM3LWFiY2QtYWUxNjRiM2NhN2NkIiwic2lkIjoiYzY1Y2Y0MTYtMGE0My00ODI1LTkyOTItZDM0ZGJjYjEwYmQ0In0.ULnqfsgWE5pagB0hSpZWb0Xvz7urv4KZ7827uc50XHU",
  "access_expires_at": "2026-10-30T10:14:41.01339899Z",
  "refresh_token": "ahbR93zv5UlyB5wBVEGLrA0H6-vJC_t8FVA51NH1h3I",
  "refresh_expires_at": "2026-10-30T21:59:41.013005855Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "75441488-4799-4dff-b782-a4e6c731c718",
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
  "id": "ab9ca994-53f9-41ea-b068-82f1b139a20e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:04:41.245642Z",
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
  "command_id": "6be89158-1001-48bd-9413-eeb2942283b9",
  "quote_id": "ab9ca994-53f9-41ea-b068-82f1b139a20e",
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
  "id": "9c769d84-042c-41ca-9a7a-a29f408b7dac",
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
  "created_at": "2026-10-30T09:59:41.475149Z",
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
    "id": "65c70237-744f-4d90-a2b6-12cec2a3301d",
    "order_id": "9c769d84-042c-41ca-9a7a-a29f408b7dac",
    "expires_at": "2026-10-30T09:59:56.479472Z",
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

`POST /api/driver/v1/offers/65c70237-744f-4d90-a2b6-12cec2a3301d/accept` → **200**

```json
{
  "command_id": "bbcfec7f-2c4a-41a7-8ea8-18beb737aa36"
}
```

```json
{
  "id": "fff5fc0d-5640-45cf-834a-44cce6e45768",
  "order_id": "9c769d84-042c-41ca-9a7a-a29f408b7dac",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e1f00fee-32e1-4f65-a497-bf4823445383",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e1f00fee-32e1-4f65-a497-bf4823445383",
  "order_id": "9c769d84-042c-41ca-9a7a-a29f408b7dac",
  "assignment_id": "fff5fc0d-5640-45cf-834a-44cce6e45768",
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

(the car drives 10 s to the next point)

`POST /api/driver/v1/work-sessions/0ff09602-9fc9-4fe5-bac3-24614863e96d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:59:52Z",
    "sequence": 1793354392642
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0ff09602-9fc9-4fe5-bac3-24614863e96d",
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
  "last_heartbeat_at": "2026-10-30T09:59:52.658391Z",
  "last_location_at": "2026-10-30T09:59:52.658391Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/e1f00fee-32e1-4f65-a497-bf4823445383/arrive` → **200**

```json
{
  "command_id": "29d155d6-91a3-416b-a04f-3aae9a5729ab",
  "expected_version": 0
}
```

```json
{
  "id": "e1f00fee-32e1-4f65-a497-bf4823445383",
  "order_id": "9c769d84-042c-41ca-9a7a-a29f408b7dac",
  "assignment_id": "fff5fc0d-5640-45cf-834a-44cce6e45768",
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
  "arrived_at": "2026-10-30T09:59:52.903933Z",
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

`POST /api/driver/v1/trips/e1f00fee-32e1-4f65-a497-bf4823445383/start` → **200**

```json
{
  "command_id": "37b41ab4-7efb-43b0-a14e-3a72ece64682",
  "expected_version": 1
}
```

```json
{
  "id": "e1f00fee-32e1-4f65-a497-bf4823445383",
  "order_id": "9c769d84-042c-41ca-9a7a-a29f408b7dac",
  "assignment_id": "fff5fc0d-5640-45cf-834a-44cce6e45768",
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
  "arrived_at": "2026-10-30T09:59:52.903933Z",
  "started_at": "2026-10-30T09:59:53.148042Z",
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

`POST /api/driver/v1/trips/e1f00fee-32e1-4f65-a497-bf4823445383/complete` → **200**

```json
{
  "command_id": "be5cae3d-7b50-44b6-bc3f-2dadf90ae35b",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:59:53Z",
  "cash_received": true
}
```

```json
{
  "id": "e1f00fee-32e1-4f65-a497-bf4823445383",
  "order_id": "9c769d84-042c-41ca-9a7a-a29f408b7dac",
  "assignment_id": "fff5fc0d-5640-45cf-834a-44cce6e45768",
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
  "arrived_at": "2026-10-30T09:59:52.903933Z",
  "started_at": "2026-10-30T09:59:53.148042Z",
  "completed_at": "2026-10-30T09:59:53.380887Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/9c769d84-042c-41ca-9a7a-a29f408b7dac` → **200**

```json
{
  "id": "9c769d84-042c-41ca-9a7a-a29f408b7dac",
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
    "id": "fff5fc0d-5640-45cf-834a-44cce6e45768",
    "order_id": "9c769d84-042c-41ca-9a7a-a29f408b7dac",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e1f00fee-32e1-4f65-a497-bf4823445383",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:59:41.475149Z",
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
  "session_id": "706fb268-4605-4510-9665-b02e107e2174",
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
  "last_heartbeat_at": "2026-10-30T09:59:40.045407Z",
  "last_location_at": "2026-10-30T09:59:40.045407Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/706fb268-4605-4510-9665-b02e107e2174/close` → **200**

```json
{
  "command_id": "3bd86164-6e40-487c-a689-8daacd3fed8c",
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
  "session_id": "0ff09602-9fc9-4fe5-bac3-24614863e96d",
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
  "last_heartbeat_at": "2026-10-30T09:59:52.658391Z",
  "last_location_at": "2026-10-30T09:59:52.658391Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0ff09602-9fc9-4fe5-bac3-24614863e96d/close` → **200**

```json
{
  "command_id": "e383c54f-5ee7-4bf7-902c-dbfba0772de2",
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

Done: terminal order 9c769d84-042c-41ca-9a7a-a29f408b7dac by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-17320"
}
```

```json
{
  "challenge_id": "e872ef90-0129-484d-91d9-913426fa8662",
  "expires_at": "2026-10-30T10:04:57.983324858Z",
  "resend_available_at": "2026-10-30T09:59:58.983324858Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "415903",
  "sent_at": "2026-10-30T09:59:57.985542737Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e872ef90-0129-484d-91d9-913426fa8662",
  "code": "415903",
  "device_ref": "sandbox-17320"
}
```

```json
{
  "session_id": "3d1101d2-a53b-4dc5-92d3-1ed0ef42694d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTI5OCwiaWF0IjoxNzkzMzU0Mzk4LCJqdGkiOiI4MjlkZDQwNC04OTJlLTQxMWYtODU4ZC1iYTE5NDUwNTMzMTEiLCJzaWQiOiIzZDExMDFkMi1hNTNiLTRkYzUtOTJkMy0xZWQwZWY0MjY5NGQifQ.zgG7EG4Q-hFViX22FWRMoflRN5sfwpe8gh4cYlGa04U",
  "access_expires_at": "2026-10-30T10:14:58.234066904Z",
  "refresh_token": "veyFm_DB4yKeNLG5JrAzzIbHt8Xmwxa12We9eKGbzdI",
  "refresh_expires_at": "2026-11-29T09:59:58.233726252Z",
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
  "device_ref": "sandbox-19197"
}
```

```json
{
  "challenge_id": "470d2ad5-4df2-465d-a605-68d6a79c975a",
  "expires_at": "2026-10-30T10:04:58.674137505Z",
  "resend_available_at": "2026-10-30T09:59:59.674137505Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "551683",
  "sent_at": "2026-10-30T09:59:58.676837715Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "470d2ad5-4df2-465d-a605-68d6a79c975a",
  "code": "551683",
  "device_ref": "sandbox-19197"
}
```

```json
{
  "session_id": "bb195562-530f-4e5b-a3ae-3181f96d1cc1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTI5OCwiaWF0IjoxNzkzMzU0Mzk4LCJqdGkiOiIwYWJkZWFkZi00M2U5LTQzMjYtOWRlOC1kMmM0MzFmOTA0ZDUiLCJzaWQiOiJiYjE5NTU2Mi01MzBmLTRlNWItYTNhZS0zMTgxZjk2ZDFjYzEifQ.jtihe23ih4LRCr34QgKFwwiCP8cxv13ZBLlMASvkVOQ",
  "access_expires_at": "2026-10-30T10:14:58.919746591Z",
  "refresh_token": "CL3jbOL3OXHBXrytbVYSkZZbR_OOFH309ZTlJbMmok0",
  "refresh_expires_at": "2026-11-29T09:59:58.919347997Z",
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
  "device_ref": "sandbox-13260"
}
```

```json
{
  "challenge_id": "1227757f-87df-4c97-980e-58036aeaa9f6",
  "expires_at": "2026-10-30T10:04:59.356375088Z",
  "resend_available_at": "2026-10-30T10:00:00.356375088Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "284678",
  "sent_at": "2026-10-30T09:59:59.358636234Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1227757f-87df-4c97-980e-58036aeaa9f6",
  "code": "284678",
  "device_ref": "sandbox-13260"
}
```

```json
{
  "session_id": "19248679-0694-4d4a-b871-4d7beb6835e8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTI5OSwiaWF0IjoxNzkzMzU0Mzk5LCJqdGkiOiI5NjBiZTZhOC1hMGM4LTQxZmItYTJmZS05NjIzYzk2NDIxOTciLCJzaWQiOiIxOTI0ODY3OS0wNjk0LTRkNGEtYjg3MS00ZDdiZWI2ODM1ZTgifQ.lUM_tAEhWBrLY1AUvWhMsirEWDuluszdpKXehQ6kgOw",
  "access_expires_at": "2026-10-30T10:14:59.600605993Z",
  "refresh_token": "ABN6oYoWrlUqRvPgb1Na6jQiPj1G4z2igX6JqY-E2s8",
  "refresh_expires_at": "2026-11-29T09:59:59.600241796Z",
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
  "phone": "+380696341259",
  "device_ref": "sandbox-13496"
}
```

```json
{
  "challenge_id": "6ef4245f-747f-4d9c-978b-99c915681e03",
  "expires_at": "2026-10-30T10:05:00.036777706Z",
  "resend_available_at": "2026-10-30T10:00:01.036777706Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380696341259` → **200**

```json
{
  "phone": "+380696341259",
  "audience": "CLIENT",
  "code": "469283",
  "sent_at": "2026-10-30T10:00:00.038951701Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6ef4245f-747f-4d9c-978b-99c915681e03",
  "code": "469283",
  "device_ref": "sandbox-13496"
}
```

```json
{
  "session_id": "8ce7a121-a1bd-43d9-a9f7-f73173e8a0cb",
  "subject": {
    "type": "CLIENT",
    "id": "72a7d953-a1c2-4b02-92fe-6a11dee41669"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MmE3ZDk1My1hMWMyLTRiMDItOTJmZS02YTExZGVlNDE2NjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MzAwLCJpYXQiOjE3OTMzNTQ0MDAsImp0aSI6ImIxY2EyODhmLWY4N2MtNDcxMC1iMzQ4LWU1ZmVkODcyNGM2ZCIsInNpZCI6IjhjZTdhMTIxLWExYmQtNDNkOS1hOWY3LWY3MzE3M2U4YTBjYiJ9.Swfcp3T7m5ke_7NOUEB8uFKlNzDhU9YyU9B4fwwiGXE",
  "access_expires_at": "2026-10-30T10:15:00.278309669Z",
  "refresh_token": "juErpZz_xwBtfwT82_PI-7wn3O39c9hYimen28RoVgM",
  "refresh_expires_at": "2026-11-29T10:00:00.277687343Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "960e3d67-5548-4893-b606-e2d4e788793b",
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
  "id": "1bc77752-76fc-40c4-a687-866ca4f7e53f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:05:00.507261Z",
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
  "command_id": "a741977a-e3ee-4efc-a388-f0727d9a6f0a",
  "quote_id": "1bc77752-76fc-40c4-a687-866ca4f7e53f",
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
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:00:00.749516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:00:00.749516Z",
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
  "blizz_sms_sent_total": 77
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="BROADCAST"} 1
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 9.319441165
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 17
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 11.301785874
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="BROADCAST"} 0.0
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 6.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="TOO_FAR"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.151285818
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
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 70.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/db4a4d45-44b0-4563-95c2-c518f52ee8a8` → **200**

```json
{
  "id": "db4a4d45-44b0-4563-95c2-c518f52ee8a8",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "72a7d953-a1c2-4b02-92fe-6a11dee41669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:00:00.749516Z",
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
  "session_id": "af9c65dc-c9c2-4b87-a6de-2493fed38173",
  "subject": {
    "type": "STAFF",
    "id": "2e9a9967-16ea-403c-a9bf-9388f7767ab7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlhOTk2Ny0xNmVhLTQwM2MtYTliZi05Mzg4Zjc3NjdhYjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU0ODUsImlhdCI6MTc5MzM1NDU4NSwianRpIjoiYjdkYjUwNjAtNjdkZS00MjQwLTg1NTMtZDcyODY0MzI5ZDQ3Iiwic2lkIjoiYWY5YzY1ZGMtYzljMi00Yjg3LWE2ZGUtMjQ5M2ZlZDM4MTczIn0.hAGX-HZsXiPaR1vT5lsLBaQY2QH6h1o587uNbMErVIg",
  "access_expires_at": "2026-10-30T10:18:05.292564233Z",
  "refresh_token": "LunmA1jZyl6pjC2UyuPw3uqysnmfAP1uV56jB5Av6oo",
  "refresh_expires_at": "2026-10-30T22:03:05.291998073Z",
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
  "id": "c04ed434-a333-4011-9d19-9b46c979703a",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T10:03:05.52701Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T10:03:05.527047Z",
  "updated_at": "2026-10-30T10:03:05.542283Z",
  "finished_at": "2026-10-30T10:03:05.542283Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/c04ed434-a333-4011-9d19-9b46c979703a` → **200**

```json
{
  "run": {
    "id": "c04ed434-a333-4011-9d19-9b46c979703a",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T10:03:05.52701Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T10:03:05.527047Z",
    "updated_at": "2026-10-30T10:03:05.542283Z",
    "finished_at": "2026-10-30T10:03:05.542283Z",
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
  "id": "c04ed434-a333-4011-9d19-9b46c979703a",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T10:03:05.52701Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T10:03:05.527047Z",
  "updated_at": "2026-10-30T10:03:05.542283Z",
  "finished_at": "2026-10-30T10:03:05.542283Z",
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
  "id": "c04ed434-a333-4011-9d19-9b46c979703a",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T10:03:05.52701Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T10:03:05.527047Z",
  "updated_at": "2026-10-30T10:03:05.542283Z",
  "finished_at": "2026-10-30T10:03:05.542283Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/3ecb3b8c-8bde-44b0-99f8-de99feb387d6` → **204**

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
  "id": "0763c62f-4ab1-48b6-8ae7-6185f148075b",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T10:03:05.890697Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T10:03:05.890726Z",
  "updated_at": "2026-10-30T10:03:05.897463Z",
  "finished_at": "2026-10-30T10:03:05.897463Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/0763c62f-4ab1-48b6-8ae7-6185f148075b` → **200**

```json
{
  "run": {
    "id": "0763c62f-4ab1-48b6-8ae7-6185f148075b",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T10:03:05.890697Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T10:03:05.890726Z",
    "updated_at": "2026-10-30T10:03:05.897463Z",
    "finished_at": "2026-10-30T10:03:05.897463Z",
    "version": 1
  },
  "items": [
    {
      "id": "b1e1f020-b7df-4205-8e6d-01b536f9922c",
      "run_id": "0763c62f-4ab1-48b6-8ae7-6185f148075b",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "da2f428eeecea11260aa104d92f80709c8e16a92ee6162be6b102237bd4ebbb6",
      "reference_display": "sandbox-reconciliation-3ecb3b8c-8bde-44b0-99f8-de99feb387d6",
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
      "provider_at": "2026-10-30T10:03:05Z",
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
  "id": "0763c62f-4ab1-48b6-8ae7-6185f148075b",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T10:03:05.890697Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T10:03:05.890726Z",
  "updated_at": "2026-10-30T10:03:05.897463Z",
  "finished_at": "2026-10-30T10:03:05.897463Z",
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
  "id": "0763c62f-4ab1-48b6-8ae7-6185f148075b",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T10:03:05.890697Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T10:03:05.890726Z",
  "updated_at": "2026-10-30T10:03:05.897463Z",
  "finished_at": "2026-10-30T10:03:05.897463Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/b1e1f020-b7df-4205-8e6d-01b536f9922c/resolve` → **200**

```json
{
  "command_id": "784e2cb1-61d5-4000-bcfa-e1a7b3aef767",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "b1e1f020-b7df-4205-8e6d-01b536f9922c",
  "run_id": "0763c62f-4ab1-48b6-8ae7-6185f148075b",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "da2f428eeecea11260aa104d92f80709c8e16a92ee6162be6b102237bd4ebbb6",
  "reference_display": "sandbox-reconciliation-3ecb3b8c-8bde-44b0-99f8-de99feb387d6",
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
  "provider_at": "2026-10-30T10:03:05Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
  "resolved_at": "2026-10-30T10:03:06.223231Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/b1e1f020-b7df-4205-8e6d-01b536f9922c/resolve` → **200**

```json
{
  "command_id": "784e2cb1-61d5-4000-bcfa-e1a7b3aef767",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "b1e1f020-b7df-4205-8e6d-01b536f9922c",
  "run_id": "0763c62f-4ab1-48b6-8ae7-6185f148075b",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "da2f428eeecea11260aa104d92f80709c8e16a92ee6162be6b102237bd4ebbb6",
  "reference_display": "sandbox-reconciliation-3ecb3b8c-8bde-44b0-99f8-de99feb387d6",
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
  "provider_at": "2026-10-30T10:03:05Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
  "resolved_at": "2026-10-30T10:03:06.223231Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/b1e1f020-b7df-4205-8e6d-01b536f9922c/resolve` → **409**

```json
{
  "command_id": "3e6860af-c7ca-4081-be2a-5d9e3e9663f7",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/b1e1f020-b7df-4205-8e6d-01b536f9922c/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a5798bbc-7413-46c7-bff1-36976af2a941"
}
```

`GET /api/admin/v1/payment-reconciliations/0763c62f-4ab1-48b6-8ae7-6185f148075b` → **200**

```json
{
  "run": {
    "id": "0763c62f-4ab1-48b6-8ae7-6185f148075b",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T10:03:05.890697Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T10:03:05.890726Z",
    "updated_at": "2026-10-30T10:03:06.223231Z",
    "finished_at": "2026-10-30T10:03:05.897463Z",
    "version": 2
  },
  "items": [
    {
      "id": "b1e1f020-b7df-4205-8e6d-01b536f9922c",
      "run_id": "0763c62f-4ab1-48b6-8ae7-6185f148075b",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "da2f428eeecea11260aa104d92f80709c8e16a92ee6162be6b102237bd4ebbb6",
      "reference_display": "sandbox-reconciliation-3ecb3b8c-8bde-44b0-99f8-de99feb387d6",
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
      "provider_at": "2026-10-30T10:03:05Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "2e9a9967-16ea-403c-a9bf-9388f7767ab7",
      "resolved_at": "2026-10-30T10:03:06.223231Z",
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
      "id": "0763c62f-4ab1-48b6-8ae7-6185f148075b",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T10:03:05.890697Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T10:03:05.890726Z",
      "updated_at": "2026-10-30T10:03:06.223231Z",
      "finished_at": "2026-10-30T10:03:05.897463Z",
      "version": 2
    },
    {
      "id": "5acc993a-44cb-4e91-9658-adbf65575f4b",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T09:44:28.071011Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T09:44:28.071142Z",
      "updated_at": "2026-10-30T09:44:28.076164Z",
      "finished_at": "2026-10-30T09:44:28.076164Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/3ecb3b8c-8bde-44b0-99f8-de99feb387d6` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "0763c62f-4ab1-48b6-8ae7-6185f148075b",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T10:03:05.890697Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T10:03:05.890726Z",
  "updated_at": "2026-10-30T10:03:06.223231Z",
  "finished_at": "2026-10-30T10:03:05.897463Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793354708376E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793354708643E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793354708643E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793354708376E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793354708643E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
