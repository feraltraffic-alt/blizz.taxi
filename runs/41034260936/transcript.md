# Sandbox transcript (2026-10-30T09:34:11Z, 31edb9b)

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
  "correlation_id": "42712c98-8171-4c8e-abc7-b54138e463ac"
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
  "session_id": "d3895bdb-8699-4577-b2bf-d30c9b27c9ec",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM3NjAsImlhdCI6MTc5MzM1Mjg2MCwianRpIjoiMDhmNWY5MzMtZTQxYi00NTkyLTk5ZjMtYTFiMjE2N2ZjMGRiIiwic2lkIjoiZDM4OTViZGItODY5OS00NTc3LWIyYmYtZDMwYzliMjdjOWVjIn0.GmK9KmGJFTsvawlIGcBjCsDrTyK9H4yPRHWdrCzyLKI",
  "access_expires_at": "2026-10-30T09:49:20.797631369Z",
  "refresh_token": "HAapn1fwoj-BALhmwntBOyH__vUjbSFETZQYe6Q3_Lw",
  "refresh_expires_at": "2026-10-30T21:34:20.795512218Z",
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
  "session_id": "66920055-81a4-4162-aa91-1a2b3ffa68db",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM3NjIsImlhdCI6MTc5MzM1Mjg2MiwianRpIjoiODkyZDYyNzctODcxZS00MWU2LWJjOGUtYmY0ZjUzMWZkYjJmIiwic2lkIjoiNjY5MjAwNTUtODFhNC00MTYyLWFhOTEtMWEyYjNmZmE2OGRiIn0.W5wkfkKpoQozHA6mrAEQK7vk5DXe4mW2XNPyy_85j3M",
  "access_expires_at": "2026-10-30T09:49:22.649202307Z",
  "refresh_token": "1I9qB9Lwn3-QRTgPKaGtYG9IrAaxPtWC9SaarmNowe8",
  "refresh_expires_at": "2026-10-30T21:34:22.64818917Z",
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
  "device_ref": "sandbox-7044"
}
```

```json
{
  "challenge_id": "3a8a8ec1-b431-40d3-bb61-f4740c92eb36",
  "expires_at": "2026-10-30T09:39:23.280258894Z",
  "resend_available_at": "2026-10-30T09:34:24.280258894Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "986884",
  "sent_at": "2026-10-30T09:34:23.292120078Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3a8a8ec1-b431-40d3-bb61-f4740c92eb36",
  "code": "986884",
  "device_ref": "sandbox-7044"
}
```

```json
{
  "session_id": "c99ed342-9a29-4cfc-b903-1442cd7251c8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1Mzc2MywiaWF0IjoxNzkzMzUyODYzLCJqdGkiOiJiMjI3NzQyMy01M2Q1LTQzZTAtOTZmOS1jNjQ0YWM1YjZlYmIiLCJzaWQiOiJjOTllZDM0Mi05YTI5LTRjZmMtYjkwMy0xNDQyY2Q3MjUxYzgifQ.fiKUfCwlQRsGFo42TBpNYYe4hSVNhF1G5tNl1oTTfDk",
  "access_expires_at": "2026-10-30T09:49:23.629871791Z",
  "refresh_token": "bA6VdAKAOD6VlYFgfdvh4PBVQEVa3IRQU9-6ONT2vx8",
  "refresh_expires_at": "2026-11-29T09:34:23.628837003Z",
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
  "command_id": "9f38f11b-10f1-4001-ac09-fb91b621d168",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:34:24Z",
    "sequence": 1793352864197
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ede061aa-1938-4dab-a718-156453dfa221",
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
  "last_heartbeat_at": "2026-10-30T09:34:24.493888Z",
  "last_location_at": "2026-10-30T09:34:24.493888Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630160340",
  "device_ref": "sandbox-4948"
}
```

```json
{
  "challenge_id": "d3c684c8-a49f-496a-84fa-7d678438cf4f",
  "expires_at": "2026-10-30T09:39:24.79975473Z",
  "resend_available_at": "2026-10-30T09:34:25.79975473Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630160340` → **200**

```json
{
  "phone": "+380630160340",
  "audience": "CLIENT",
  "code": "107639",
  "sent_at": "2026-10-30T09:34:24.805104369Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d3c684c8-a49f-496a-84fa-7d678438cf4f",
  "code": "107639",
  "device_ref": "sandbox-4948"
}
```

```json
{
  "session_id": "9bf9f36b-ec8a-4101-ba57-7e18f2905051",
  "subject": {
    "type": "CLIENT",
    "id": "a9311869-81ac-4ba8-bf91-31f59be25c30"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOTMxMTg2OS04MWFjLTRiYTgtYmY5MS0zMWY1OWJlMjVjMzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzNzY1LCJpYXQiOjE3OTMzNTI4NjUsImp0aSI6IjgyODE5MmI0LTAzNGUtNGUwYS1iYzE0LWRkOWIxNDZhMmViMyIsInNpZCI6IjliZjlmMzZiLWVjOGEtNDEwMS1iYTU3LTdlMThmMjkwNTA1MSJ9.OamnjJ0Q2wM3Qk9u9qpLsUvxPo1-uczrNR7SFMfMCgk",
  "access_expires_at": "2026-10-30T09:49:25.139952476Z",
  "refresh_token": "akOjI2KNaYhaNe8k6W5YOHHyUbaVMrzEL4IRjt1EYkE",
  "refresh_expires_at": "2026-11-29T09:34:25.13873719Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "eddbfc9b-b01b-4433-9f87-7241065f030a",
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
  "id": "7f45142d-9704-45e8-ae6c-d7c7699f844e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:39:25.469719Z",
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
  "command_id": "198c47ed-d586-4def-8254-dc71f7af33c8",
  "quote_id": "7f45142d-9704-45e8-ae6c-d7c7699f844e",
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
  "id": "a197b841-bebe-4ce9-8735-7e2bd657e0ab",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a9311869-81ac-4ba8-bf91-31f59be25c30",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:34:25.86669Z",
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
    "id": "0a522bdb-76a7-4de0-b292-7a36429b4609",
    "order_id": "a197b841-bebe-4ce9-8735-7e2bd657e0ab",
    "expires_at": "2026-10-30T09:34:40.880727Z",
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

`POST /api/driver/v1/offers/0a522bdb-76a7-4de0-b292-7a36429b4609/accept` → **200**

```json
{
  "command_id": "ec74758a-88a5-4c57-8ba8-0872a4bebbd8"
}
```

```json
{
  "id": "d1cda40a-1a5f-4948-942d-6fdf31a58ec6",
  "order_id": "a197b841-bebe-4ce9-8735-7e2bd657e0ab",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1f75023b-8b0a-4eb4-a3c2-fcbfeb174140",
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
  "command_id": "41e4ea25-4387-4d2f-9cbe-e8294f30756f",
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
  "changed_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T09:34:27.154027843Z"
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
  "id": "1f75023b-8b0a-4eb4-a3c2-fcbfeb174140",
  "order_id": "a197b841-bebe-4ce9-8735-7e2bd657e0ab",
  "assignment_id": "d1cda40a-1a5f-4948-942d-6fdf31a58ec6",
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

`POST /api/driver/v1/work-sessions/ede061aa-1938-4dab-a718-156453dfa221/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:34:28Z",
    "sequence": 1793352868551
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ede061aa-1938-4dab-a718-156453dfa221",
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
  "last_heartbeat_at": "2026-10-30T09:34:28.082397Z",
  "last_location_at": "2026-10-30T09:34:28.082397Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1f75023b-8b0a-4eb4-a3c2-fcbfeb174140/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "4b893ab9-2273-4c57-91c3-25779515380e",
  "expected_version": 0
}
```

```json
{
  "id": "1f75023b-8b0a-4eb4-a3c2-fcbfeb174140",
  "order_id": "a197b841-bebe-4ce9-8735-7e2bd657e0ab",
  "assignment_id": "d1cda40a-1a5f-4948-942d-6fdf31a58ec6",
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
  "arrived_at": "2026-10-30T09:34:28.387948Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1f75023b-8b0a-4eb4-a3c2-fcbfeb174140/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "9930ba1a-2069-4550-8c13-aed327d69c8d",
  "expected_version": 1
}
```

```json
{
  "id": "1f75023b-8b0a-4eb4-a3c2-fcbfeb174140",
  "order_id": "a197b841-bebe-4ce9-8735-7e2bd657e0ab",
  "assignment_id": "d1cda40a-1a5f-4948-942d-6fdf31a58ec6",
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
  "arrived_at": "2026-10-30T09:34:28.387948Z",
  "started_at": "2026-10-30T09:34:28.683619Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1f75023b-8b0a-4eb4-a3c2-fcbfeb174140/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "4428084a-3c5f-433d-80f2-a59c8d3e5c02",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:34:28Z",
  "cash_received": true
}
```

```json
{
  "id": "1f75023b-8b0a-4eb4-a3c2-fcbfeb174140",
  "order_id": "a197b841-bebe-4ce9-8735-7e2bd657e0ab",
  "assignment_id": "d1cda40a-1a5f-4948-942d-6fdf31a58ec6",
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
  "arrived_at": "2026-10-30T09:34:28.387948Z",
  "started_at": "2026-10-30T09:34:28.683619Z",
  "completed_at": "2026-10-30T09:34:29.003486Z",
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
  "session_id": "ede061aa-1938-4dab-a718-156453dfa221",
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
  "last_heartbeat_at": "2026-10-30T09:34:28.082397Z",
  "last_location_at": "2026-10-30T09:34:28.082397Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ede061aa-1938-4dab-a718-156453dfa221/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "5fc905ea-77d0-4e9f-b086-808ef40b8a2a",
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
  "command_id": "fecc1ae4-a106-417d-ac14-56dec8bf3cb6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:34:29Z",
    "sequence": 1793352869880
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
  "correlation_id": "ff68fed7-3376-431f-b003-7d4c16d62914",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "4582da81-e6f9-431a-bda3-476a500fefa8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:34:30Z",
    "sequence": 1793352870212
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d969c551-20f8-4cc6-b8eb-87a084f52aad",
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
  "last_heartbeat_at": "2026-10-30T09:34:30.237031Z",
  "last_location_at": "2026-10-30T09:34:30.237031Z",
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
  "changed_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T09:34:27.154028Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "ccbe4d14-0e73-4fcf-9819-9c7308560c2e",
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
  "changed_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T09:34:30.834285919Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d969c551-20f8-4cc6-b8eb-87a084f52aad",
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
  "last_heartbeat_at": "2026-10-30T09:34:30.237031Z",
  "last_location_at": "2026-10-30T09:34:30.237031Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d969c551-20f8-4cc6-b8eb-87a084f52aad/close` → **200**

```json
{
  "command_id": "5fab7277-8ded-404d-ab50-faecef69cf54",
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
  "session_id": "d6bcb5d0-b5fe-4d56-989a-71af11acc5ef",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM3NzIsImlhdCI6MTc5MzM1Mjg3MiwianRpIjoiNDA4ZTZiZjktMWU3NC00MTE3LWJjNzgtY2JmNTZkN2U0MDIzIiwic2lkIjoiZDZiY2I1ZDAtYjVmZS00ZDU2LTk4OWEtNzFhZjExYWNjNWVmIn0.4QO4nc_EDnrjokSARJGlGTH8d5ZdB7aoJk_AxI7kFI0",
  "access_expires_at": "2026-10-30T09:49:32.032272068Z",
  "refresh_token": "QZSrlcJayVoiolgSuibtJDHPDHRf3xfO4CIEJbIrvrM",
  "refresh_expires_at": "2026-10-30T21:34:32.031507976Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "9465c00b-89ca-4344-906a-dce9cc98c5e4",
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
  "id": "e2585b92-5a10-4b9a-b320-79b1fb64d964",
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
  "created_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
  "created_at": "2026-10-30T09:34:32.319885Z",
  "updated_at": "2026-10-30T09:34:32.319885Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639770329",
  "device_ref": "sandbox-20853"
}
```

```json
{
  "challenge_id": "9adedbfc-44c1-4a1e-a10a-b8ab08258e4a",
  "expires_at": "2026-10-30T09:39:32.609184908Z",
  "resend_available_at": "2026-10-30T09:34:33.609184908Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639770329` → **200**

```json
{
  "phone": "+380639770329",
  "audience": "CLIENT",
  "code": "428220",
  "sent_at": "2026-10-30T09:34:32.614004097Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9adedbfc-44c1-4a1e-a10a-b8ab08258e4a",
  "code": "428220",
  "device_ref": "sandbox-20853"
}
```

```json
{
  "session_id": "0506afed-0b05-40ef-95b9-7d8c41b4f632",
  "subject": {
    "type": "CLIENT",
    "id": "1b80709a-1271-4af3-8ba7-f2cc4c0394ef"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYjgwNzA5YS0xMjcxLTRhZjMtOGJhNy1mMmNjNGMwMzk0ZWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzNzcyLCJpYXQiOjE3OTMzNTI4NzIsImp0aSI6IjFkYjQ0NDE2LTg4MmYtNDhlZi05MGJlLTllMDk1ZDczMzM0YiIsInNpZCI6IjA1MDZhZmVkLTBiMDUtNDBlZi05NWI5LTdkOGM0MWI0ZjYzMiJ9.KcYKarYUIqLokEjcjbSsBxcH2lPhYuTiDLe1fR3ynfE",
  "access_expires_at": "2026-10-30T09:49:32.924628465Z",
  "refresh_token": "xRkbBE2AXHfIXE2FPJxMp_bJfxYxLjW0mhm5tep4zOA",
  "refresh_expires_at": "2026-11-29T09:34:32.923902615Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380639770329` → **200**

```json
{
  "client_id": "1b80709a-1271-4af3-8ba7-f2cc4c0394ef"
}
```

`POST /api/admin/v1/rider-wallets/1b80709a-1271-4af3-8ba7-f2cc4c0394ef/top-ups` → **201**

```json
{
  "command_id": "11a5346f-fad1-40c5-8ebf-a1ec3c966480",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "1b80709a-1271-4af3-8ba7-f2cc4c0394ef",
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
      "id": "cd438139-bc31-4b78-9e89-2c4582010850",
      "at": "2026-10-30T09:34:33.515277Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "f621c4f1-9b6e-41a5-939b-44be51548e85",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "91e4b836-c4a1-49c8-87b0-f6aff487f186",
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
  "id": "f98d8edb-9efc-4aa4-a7d4-0ab9d2ede3b9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:39:33.821777Z",
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
      "id": "e2585b92-5a10-4b9a-b320-79b1fb64d964",
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
  "device_ref": "sandbox-24758"
}
```

```json
{
  "challenge_id": "3540a80e-7893-4d8d-ac0a-fa3871178b52",
  "expires_at": "2026-10-30T09:39:34.121571329Z",
  "resend_available_at": "2026-10-30T09:34:35.121571329Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "123065",
  "sent_at": "2026-10-30T09:34:34.127018364Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3540a80e-7893-4d8d-ac0a-fa3871178b52",
  "code": "123065",
  "device_ref": "sandbox-24758"
}
```

```json
{
  "session_id": "a1d39333-6240-43ee-81f1-5e6c6648b1dd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1Mzc3NCwiaWF0IjoxNzkzMzUyODc0LCJqdGkiOiIyODQ3NDMyNC04OGExLTQyYTYtOTYyMi01OTg3MzcwYWRjZWIiLCJzaWQiOiJhMWQzOTMzMy02MjQwLTQzZWUtODFmMS01ZTZjNjY0OGIxZGQifQ._xdcb4K0-aYssFp00YAK1IVvqXOtvrmA0OF2EEL3JKQ",
  "access_expires_at": "2026-10-30T09:49:34.438671711Z",
  "refresh_token": "H8y-9Y4p0smm_K1iNkXDUQXt2zDdpU5ICv-HALu4B1Y",
  "refresh_expires_at": "2026-11-29T09:34:34.437869038Z",
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
  "command_id": "975d24a5-fe94-4e0b-ab21-0dede79e827f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:34:34Z",
    "sequence": 1793352874999
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5eb76b38-b5ee-4da2-a0de-927da5dc17dd",
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
  "last_heartbeat_at": "2026-10-30T09:34:35.021465Z",
  "last_location_at": "2026-10-30T09:34:35.021465Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4f1972c4-f592-4c62-b2f4-396b4ace457c",
  "quote_id": "f98d8edb-9efc-4aa4-a7d4-0ab9d2ede3b9",
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
  "id": "22aba70b-5b93-4a25-a7cf-e0a0b325c2e2",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1b80709a-1271-4af3-8ba7-f2cc4c0394ef",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:34:35.341177Z",
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
  "client_id": "1b80709a-1271-4af3-8ba7-f2cc4c0394ef",
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
      "id": "cd438139-bc31-4b78-9e89-2c4582010850",
      "at": "2026-10-30T09:34:33.515277Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "f621c4f1-9b6e-41a5-939b-44be51548e85",
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
    "id": "b233de94-140e-488d-877a-192ace3a2df8",
    "order_id": "22aba70b-5b93-4a25-a7cf-e0a0b325c2e2",
    "expires_at": "2026-10-30T09:34:50.352538Z",
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

`POST /api/driver/v1/offers/b233de94-140e-488d-877a-192ace3a2df8/accept` → **200**

```json
{
  "command_id": "4c0fa473-1dfa-48e9-be2d-7b7fba71ae7e"
}
```

```json
{
  "id": "15749cd3-a0c6-4c94-a441-279f733d237b",
  "order_id": "22aba70b-5b93-4a25-a7cf-e0a0b325c2e2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1f01933d-b6fe-4c6e-8255-cb612deff43a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1f01933d-b6fe-4c6e-8255-cb612deff43a",
  "order_id": "22aba70b-5b93-4a25-a7cf-e0a0b325c2e2",
  "assignment_id": "15749cd3-a0c6-4c94-a441-279f733d237b",
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

`POST /api/driver/v1/work-sessions/5eb76b38-b5ee-4da2-a0de-927da5dc17dd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:34:36Z",
    "sequence": 1793352876813
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5eb76b38-b5ee-4da2-a0de-927da5dc17dd",
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
  "last_heartbeat_at": "2026-10-30T09:34:36.834459Z",
  "last_location_at": "2026-10-30T09:34:36.834459Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1f01933d-b6fe-4c6e-8255-cb612deff43a/arrive` → **200**

```json
{
  "command_id": "a9f3312d-0e1c-4b61-b5fe-ac78b873aba7",
  "expected_version": 0
}
```

```json
{
  "id": "1f01933d-b6fe-4c6e-8255-cb612deff43a",
  "order_id": "22aba70b-5b93-4a25-a7cf-e0a0b325c2e2",
  "assignment_id": "15749cd3-a0c6-4c94-a441-279f733d237b",
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
  "arrived_at": "2026-10-30T09:34:37.126315Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1f01933d-b6fe-4c6e-8255-cb612deff43a/start` → **200**

```json
{
  "command_id": "93454eb6-845e-4ac3-a65c-30a3aa2b1ead",
  "expected_version": 1
}
```

```json
{
  "id": "1f01933d-b6fe-4c6e-8255-cb612deff43a",
  "order_id": "22aba70b-5b93-4a25-a7cf-e0a0b325c2e2",
  "assignment_id": "15749cd3-a0c6-4c94-a441-279f733d237b",
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
  "arrived_at": "2026-10-30T09:34:37.126315Z",
  "started_at": "2026-10-30T09:34:37.417601Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/1f01933d-b6fe-4c6e-8255-cb612deff43a/complete` → **200**

```json
{
  "command_id": "9ecc3023-bf27-49e9-bdb3-55c48503ba17",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:34:37Z",
  "cash_received": true
}
```

```json
{
  "id": "1f01933d-b6fe-4c6e-8255-cb612deff43a",
  "order_id": "22aba70b-5b93-4a25-a7cf-e0a0b325c2e2",
  "assignment_id": "15749cd3-a0c6-4c94-a441-279f733d237b",
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
  "arrived_at": "2026-10-30T09:34:37.126315Z",
  "started_at": "2026-10-30T09:34:37.417601Z",
  "completed_at": "2026-10-30T09:34:37.722493Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "1b80709a-1271-4af3-8ba7-f2cc4c0394ef",
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
      "id": "e4a18319-33af-4cb8-9648-d0bfa44ef03c",
      "at": "2026-10-30T09:34:38.122228Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "22aba70b-5b93-4a25-a7cf-e0a0b325c2e2"
    },
    {
      "id": "cd438139-bc31-4b78-9e89-2c4582010850",
      "at": "2026-10-30T09:34:33.515277Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "f621c4f1-9b6e-41a5-939b-44be51548e85",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/e2585b92-5a10-4b9a-b320-79b1fb64d964/archive` → **200**

```json
{
  "command_id": "045b37fa-b214-428b-8c61-4ab24b3e2e2d",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "e2585b92-5a10-4b9a-b320-79b1fb64d964",
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
  "created_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
  "created_at": "2026-10-30T09:34:32.319885Z",
  "updated_at": "2026-10-30T09:34:41.317999Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5eb76b38-b5ee-4da2-a0de-927da5dc17dd",
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
  "last_heartbeat_at": "2026-10-30T09:34:36.834459Z",
  "last_location_at": "2026-10-30T09:34:36.834459Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5eb76b38-b5ee-4da2-a0de-927da5dc17dd/close` → **200**

```json
{
  "command_id": "61d54257-3f5f-4650-8c63-8837e3389c9f",
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

Done: order 22aba70b-5b93-4a25-a7cf-e0a0b325c2e2.

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
  "session_id": "ee1b993e-fa9a-4b14-8f35-b1f724f3b042",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM3ODIsImlhdCI6MTc5MzM1Mjg4MiwianRpIjoiZjIwZWY3MjctM2IyMC00MjFmLWFkZmQtZTZmNWQ3YzY4M2I2Iiwic2lkIjoiZWUxYjk5M2UtZmE5YS00YjE0LThmMzUtYjFmNzI0ZjNiMDQyIn0.f64Zdfpub47loUgpX11L1R41SmzZdwLlwFdzmMsr9Ro",
  "access_expires_at": "2026-10-30T09:49:42.506232961Z",
  "refresh_token": "ptX17rXIn3vh5VoR_ltxXVVIrye_rg9t6_sEDeMyWa4",
  "refresh_expires_at": "2026-10-30T21:34:42.505573586Z",
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
  "command_id": "03948aa6-4c55-4781-a54a-3489e2ca64fd",
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
  "session_id": "08840346-7cd3-44e3-b45c-1249964b4aec",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM3ODMsImlhdCI6MTc5MzM1Mjg4MywianRpIjoiNjY4MzM3MTctOWNlOS00Y2ZhLTk1YTAtOGQyN2I1MzhkNTUzIiwic2lkIjoiMDg4NDAzNDYtN2NkMy00NGUzLWI0NWMtMTI0OTk2NGI0YWVjIn0.jvuUpBA2_72wPzIsnv0F2-sjZW5A8TSrakVaY2Go26I",
  "access_expires_at": "2026-10-30T09:49:43.657336116Z",
  "refresh_token": "SOowSO2rf6GPR-plwzDBXA56JWDOxSZdnbzGDF9vOh4",
  "refresh_expires_at": "2026-10-30T21:34:43.656647536Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.291627649",
    "linkedid": "1730052700.291627649",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675675842"
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
    "id": "1730052700.291627649",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "e41e02a0-aa19-4db1-92db-db53621c34df",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380675675842",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T09:34:43.940399Z",
      "answered_at": null,
      "ended_at": "2026-10-30T09:34:43.965563Z",
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
    "id": "1730052600.1841017738",
    "linkedid": "1730052600.1841017738",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675675842"
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
      "id": "f82c7477-a185-4a4a-aa38-7367c81c43b5",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380675675842",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T09:34:44.288402Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/f82c7477-a185-4a4a-aa38-7367c81c43b5/answer` → **200**

```json
{
  "command_id": "abca1c00-c376-4b19-aee1-000bc88c493b"
}
```

```json
{
  "id": "f82c7477-a185-4a4a-aa38-7367c81c43b5",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380675675842",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
  "order_ids": [],
  "started_at": "2026-10-30T09:34:44.288402Z",
  "answered_at": "2026-10-30T09:34:44.609284Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1841017738",
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
    "id": "1730052600.1841017738",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "f82c7477-a185-4a4a-aa38-7367c81c43b5",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675675842",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
      "order_ids": [],
      "started_at": "2026-10-30T09:34:44.288402Z",
      "answered_at": "2026-10-30T09:34:44.609284Z",
      "ended_at": "2026-10-30T09:34:44.931093Z",
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
      "id": "f82c7477-a185-4a4a-aa38-7367c81c43b5",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675675842",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
      "order_ids": [],
      "started_at": "2026-10-30T09:34:44.288402Z",
      "answered_at": "2026-10-30T09:34:44.609284Z",
      "ended_at": "2026-10-30T09:34:44.931093Z",
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
      "id": "f82c7477-a185-4a4a-aa38-7367c81c43b5",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675675842",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
      "order_ids": [],
      "started_at": "2026-10-30T09:34:44.288402Z",
      "answered_at": "2026-10-30T09:34:44.609284Z",
      "ended_at": "2026-10-30T09:34:44.931093Z",
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
      "id": "f82c7477-a185-4a4a-aa38-7367c81c43b5",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675675842",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
      "order_ids": [],
      "started_at": "2026-10-30T09:34:44.288402Z",
      "answered_at": "2026-10-30T09:34:44.609284Z",
      "ended_at": "2026-10-30T09:34:44.931093Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T09:34:49.766388Z"
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
      "id": "f82c7477-a185-4a4a-aa38-7367c81c43b5",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675675842",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
      "order_ids": [],
      "started_at": "2026-10-30T09:34:44.288402Z",
      "answered_at": "2026-10-30T09:34:44.609284Z",
      "ended_at": "2026-10-30T09:34:44.931093Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T09:34:49.766388Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/f82c7477-a185-4a4a-aa38-7367c81c43b5/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/f82c7477-a185-4a4a-aa38-7367c81c43b5/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=f82c7477-a185-4a4a-aa38-7367c81c43b5` → **200**

```json
{
  "changes": [
    {
      "id": "ccdc03ed-7c94-43ea-9888-acca3287c60f",
      "occurred_at": "2026-10-30T09:34:52.45592Z",
      "actor_type": "STAFF",
      "actor_id": "f621c4f1-9b6e-41a5-939b-44be51548e85",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "f82c7477-a185-4a4a-aa38-7367c81c43b5",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"26b341ef-ce3c-4311-9327-7ab375ca7a98\", \"order_ids\": []}",
      "correlation_id": "fc608deb-0c81-4457-bb9e-913f04d7d40b"
    },
    {
      "id": "3907f0f3-6eaf-4db9-a8d6-2b9d4b1539c4",
      "occurred_at": "2026-10-30T09:34:52.421329Z",
      "actor_type": "STAFF",
      "actor_id": "f621c4f1-9b6e-41a5-939b-44be51548e85",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "f82c7477-a185-4a4a-aa38-7367c81c43b5",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"26b341ef-ce3c-4311-9327-7ab375ca7a98\", \"order_ids\": []}",
      "correlation_id": "4d02bc32-6d4b-4125-9179-14bb3042a193"
    }
  ]
}
```

Done: call f82c7477-a185-4a4a-aa38-7367c81c43b5 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-28261"
}
```

```json
{
  "challenge_id": "6a516ba7-7e19-42d7-b8e7-76f0e824f693",
  "expires_at": "2026-10-30T09:39:52.792075208Z",
  "resend_available_at": "2026-10-30T09:34:53.792075208Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "763867",
  "sent_at": "2026-10-30T09:34:52.796611536Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6a516ba7-7e19-42d7-b8e7-76f0e824f693",
  "code": "763867",
  "device_ref": "sandbox-28261"
}
```

```json
{
  "session_id": "1b7d36b4-1306-4050-9d90-5d36e71670a1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1Mzc5MywiaWF0IjoxNzkzMzUyODkzLCJqdGkiOiIwZmUzOTgyZS0wZGQ3LTQ5NDEtOGRjZi1iOWM0NTI2YzA1ZWUiLCJzaWQiOiIxYjdkMzZiNC0xMzA2LTQwNTAtOWQ5MC01ZDM2ZTcxNjcwYTEifQ.FK9wtL3BfZgPK0mZxH9j1MaM8k6QSVH-1Yul47vXcJo",
  "access_expires_at": "2026-10-30T09:49:53.112167478Z",
  "refresh_token": "0eAqmIPNwXtgtUJppnhD42q__jqOWrefLdj2j5D_VUo",
  "refresh_expires_at": "2026-11-29T09:34:53.111498074Z",
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
  "command_id": "a3343b92-0ad4-4b23-ba0b-ca19ac2e3484",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:34:53Z",
    "sequence": 1793352893671
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62569446-81a2-48cf-84f2-1a31cd223b6d",
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
  "last_heartbeat_at": "2026-10-30T09:34:53.6921Z",
  "last_location_at": "2026-10-30T09:34:53.6921Z",
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
  "session_id": "15dcba57-349e-4b4c-a1f6-b186051524ce",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM3OTQsImlhdCI6MTc5MzM1Mjg5NCwianRpIjoiMTc5ODRmYTUtYzQ2ZS00YmUzLWIzOGEtNTMyMzBhMWVlNTBhIiwic2lkIjoiMTVkY2JhNTctMzQ5ZS00YjRjLWExZjYtYjE4NjA1MTUyNGNlIn0.tyCgVPqx4jOskNwyI5tfeiWDIpTRUmrTroVyrunc2vE",
  "access_expires_at": "2026-10-30T09:49:54.280607562Z",
  "refresh_token": "OB1npKG-eLwbjXdXhi4mX_trelO9im84uZsF6KVd_3A",
  "refresh_expires_at": "2026-10-30T21:34:54.28002994Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d5ebc0ba-d8a4-40c5-ba08-2c34a80f145e",
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
  "id": "9037b5c5-218a-4c4b-80a1-05a71bbbd016",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:39:54.578577Z",
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
  "command_id": "e2ef4f18-39f2-4fa2-bff8-ea00d4fe518a",
  "quote_id": "9037b5c5-218a-4c4b-80a1-05a71bbbd016",
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
    "phone": "+380678851799"
  }
}
```

```json
{
  "id": "e69f701d-bdfd-4311-88c3-a9c9136bbcff",
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
  "created_at": "2026-10-30T09:34:54.91268Z",
  "caller": {
    "name": "Олена",
    "phone": "+380678851799"
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
    "id": "02e2c691-cc3a-4165-b64b-32d6f3e9c745",
    "order_id": "e69f701d-bdfd-4311-88c3-a9c9136bbcff",
    "expires_at": "2026-10-30T09:35:09.91803Z",
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

`POST /api/driver/v1/offers/02e2c691-cc3a-4165-b64b-32d6f3e9c745/accept` → **200**

```json
{
  "command_id": "85800f1e-6092-4a07-8eea-5f7185b502eb"
}
```

```json
{
  "id": "1b41423d-9b84-4cf3-9e14-9ba95ae45bb0",
  "order_id": "e69f701d-bdfd-4311-88c3-a9c9136bbcff",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1915cc06-c031-4827-bf7a-ee3f2caa2c5b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380678851799` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380678851799` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380678851799` → **200**

```json
[
  {
    "phone": "+380678851799",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:34:56.993379034Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678851799` → **200**

```json
[
  {
    "phone": "+380678851799",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:34:56.993379034Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678851799` → **200**

```json
[
  {
    "phone": "+380678851799",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:34:56.993379034Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1915cc06-c031-4827-bf7a-ee3f2caa2c5b",
  "order_id": "e69f701d-bdfd-4311-88c3-a9c9136bbcff",
  "assignment_id": "1b41423d-9b84-4cf3-9e14-9ba95ae45bb0",
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
    "phone": "+380678851799"
  }
}
```

`POST /api/driver/v1/work-sessions/62569446-81a2-48cf-84f2-1a31cd223b6d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:34:58Z",
    "sequence": 1793352898241
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62569446-81a2-48cf-84f2-1a31cd223b6d",
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
  "last_heartbeat_at": "2026-10-30T09:34:58.260927Z",
  "last_location_at": "2026-10-30T09:34:58.260927Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1915cc06-c031-4827-bf7a-ee3f2caa2c5b/arrive` → **200**

```json
{
  "command_id": "1ec98141-fd47-4be7-8cb6-4ca408149e42",
  "expected_version": 0
}
```

```json
{
  "id": "1915cc06-c031-4827-bf7a-ee3f2caa2c5b",
  "order_id": "e69f701d-bdfd-4311-88c3-a9c9136bbcff",
  "assignment_id": "1b41423d-9b84-4cf3-9e14-9ba95ae45bb0",
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
  "arrived_at": "2026-10-30T09:34:58.549736Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678851799"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380678851799` → **200**

```json
[
  {
    "phone": "+380678851799",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:34:56.993379034Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678851799` → **200**

```json
[
  {
    "phone": "+380678851799",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:34:56.993379034Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678851799` → **200**

```json
[
  {
    "phone": "+380678851799",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:34:56.993379034Z"
  },
  {
    "phone": "+380678851799",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T09:35:00.004738451Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678851799` → **200**

```json
[
  {
    "phone": "+380678851799",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:34:56.993379034Z"
  },
  {
    "phone": "+380678851799",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T09:35:00.004738451Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678851799` → **200**

```json
[
  {
    "phone": "+380678851799",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:34:56.993379034Z"
  },
  {
    "phone": "+380678851799",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T09:35:00.004738451Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/1915cc06-c031-4827-bf7a-ee3f2caa2c5b/start` → **200**

```json
{
  "command_id": "eecf6dff-c864-4008-9093-8bb5f87768ce",
  "expected_version": 1
}
```

```json
{
  "id": "1915cc06-c031-4827-bf7a-ee3f2caa2c5b",
  "order_id": "e69f701d-bdfd-4311-88c3-a9c9136bbcff",
  "assignment_id": "1b41423d-9b84-4cf3-9e14-9ba95ae45bb0",
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
  "arrived_at": "2026-10-30T09:34:58.549736Z",
  "started_at": "2026-10-30T09:35:00.984859Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678851799"
  }
}
```

`POST /api/driver/v1/trips/1915cc06-c031-4827-bf7a-ee3f2caa2c5b/complete` → **200**

```json
{
  "command_id": "ef7818c0-d7ba-47aa-9dcf-732a321aa04e",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:35:01Z",
  "cash_received": true
}
```

```json
{
  "id": "1915cc06-c031-4827-bf7a-ee3f2caa2c5b",
  "order_id": "e69f701d-bdfd-4311-88c3-a9c9136bbcff",
  "assignment_id": "1b41423d-9b84-4cf3-9e14-9ba95ae45bb0",
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
  "arrived_at": "2026-10-30T09:34:58.549736Z",
  "started_at": "2026-10-30T09:35:00.984859Z",
  "completed_at": "2026-10-30T09:35:01.286904Z",
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
  "session_id": "62569446-81a2-48cf-84f2-1a31cd223b6d",
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
  "last_heartbeat_at": "2026-10-30T09:34:58.260927Z",
  "last_location_at": "2026-10-30T09:34:58.260927Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/62569446-81a2-48cf-84f2-1a31cd223b6d/close` → **200**

```json
{
  "command_id": "a3e069be-ad9a-4d1b-84f9-fb5a5a7b9ab5",
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
  "phone": "+380638510343",
  "device_ref": "sandbox-4171"
}
```

```json
{
  "challenge_id": "7625b30a-377e-4f95-8636-e0abfa30ac28",
  "expires_at": "2026-10-30T09:40:02.16792202Z",
  "resend_available_at": "2026-10-30T09:35:03.16792202Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638510343` → **200**

```json
{
  "phone": "+380638510343",
  "audience": "CLIENT",
  "code": "613774",
  "sent_at": "2026-10-30T09:35:02.172081921Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7625b30a-377e-4f95-8636-e0abfa30ac28",
  "code": "613774",
  "device_ref": "sandbox-4171"
}
```

```json
{
  "session_id": "8f5cbb80-5d05-4d8b-9d9b-54f804da84ce",
  "subject": {
    "type": "CLIENT",
    "id": "22bde204-dc27-4efe-b0b4-07f8c29b9978"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMmJkZTIwNC1kYzI3LTRlZmUtYjBiNC0wN2Y4YzI5Yjk5NzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzODAyLCJpYXQiOjE3OTMzNTI5MDIsImp0aSI6IjQ4MTg0NjcwLWUzZjgtNGM0Yi1iNTY3LTgxMTQ2ODA0YjFjNCIsInNpZCI6IjhmNWNiYjgwLTVkMDUtNGQ4Yi05ZDliLTU0ZjgwNGRhODRjZSJ9.LxFkBABR7XzSQKn8yiGyljQZaPJT96cPrFUYm0TFp5g",
  "access_expires_at": "2026-10-30T09:50:02.487832998Z",
  "refresh_token": "al4s2_bhYHwdHYkGSK40Aa84o3dSh1vAQNCYdOFLb0E",
  "refresh_expires_at": "2026-11-29T09:35:02.48719803Z",
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
  "device_ref": "sandbox-9749"
}
```

```json
{
  "challenge_id": "444f6e37-6210-4823-bb00-b136c7c9267f",
  "expires_at": "2026-10-30T09:40:03.048181672Z",
  "resend_available_at": "2026-10-30T09:35:04.048181672Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "638861",
  "sent_at": "2026-10-30T09:35:03.052292173Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "444f6e37-6210-4823-bb00-b136c7c9267f",
  "code": "638861",
  "device_ref": "sandbox-9749"
}
```

```json
{
  "session_id": "2ed2ad66-fe03-471a-9e8e-0a796d98be8b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzgwMywiaWF0IjoxNzkzMzUyOTAzLCJqdGkiOiI2OTIzNDdhYy03MmJiLTQ5NWEtODNkZC05OWI4YjQ1MzkwYTMiLCJzaWQiOiIyZWQyYWQ2Ni1mZTAzLTQ3MWEtOWU4ZS0wYTc5NmQ5OGJlOGIifQ.KDCk--Q0h2X1aTjjxihRY1sUZxMiqUVwaOJgnUvK8rc",
  "access_expires_at": "2026-10-30T09:50:03.367390969Z",
  "refresh_token": "600Lf2OKKYdGPtKzbpWSB1OK-JWAA8enaSndiAC0gms",
  "refresh_expires_at": "2026-11-29T09:35:03.366771638Z",
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
  "session_id": "06325a10-3b9d-417a-bf10-6961bf1e4b7e",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM4MDQsImlhdCI6MTc5MzM1MjkwNCwianRpIjoiMTg5ODZjMmYtMmMyYi00MjBjLWE4YTUtOTljNWRmMDJiOWE2Iiwic2lkIjoiMDYzMjVhMTAtM2I5ZC00MTdhLWJmMTAtNjk2MWJmMWU0YjdlIn0.0Vg4N2tlfpJNN9MZYHc1tOgDOET4YxCJy8vr0Eo15LI",
  "access_expires_at": "2026-10-30T09:50:04.232123761Z",
  "refresh_token": "Fli3rIr2932Zoy25hzDRxRnLbdbkbbdTQQydXi50t50",
  "refresh_expires_at": "2026-10-30T21:35:04.231515732Z",
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
  "session_id": "df55e374-7f55-4685-9a78-8213450e0178",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM4MDQsImlhdCI6MTc5MzM1MjkwNCwianRpIjoiMjhkMzU0ODQtMDBhYS00NDM2LTljNWEtM2MwODY3ZDFlNzVkIiwic2lkIjoiZGY1NWUzNzQtN2Y1NS00Njg1LTlhNzgtODIxMzQ1MGUwMTc4In0.2JPq_hs0O4Zr0QyRWZ8D6lTxenpjjRafba5T0IGS-7I",
  "access_expires_at": "2026-10-30T09:50:04.795428314Z",
  "refresh_token": "ojwCOtvyy22arrEo98yADYWq_aGrEA9ydzavmr603cI",
  "refresh_expires_at": "2026-10-30T21:35:04.79481246Z",
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
  "command_id": "6060649f-f2a2-4e99-8e64-4c3dae32d727",
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
  "id": "f6ad9a38-14de-417d-b8e2-907810587bb9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:40:05.365346Z",
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
  "command_id": "f9b1715c-bfee-4960-a72b-c04f5b07dbc1",
  "quote_id": "f6ad9a38-14de-417d-b8e2-907810587bb9",
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
  "id": "177d41de-3d21-451a-acb0-b1e253f2de39",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "22bde204-dc27-4efe-b0b4-07f8c29b9978",
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
  "created_at": "2026-10-30T09:35:05.688438Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/177d41de-3d21-451a-acb0-b1e253f2de39` → **200**

```json
{
  "id": "177d41de-3d21-451a-acb0-b1e253f2de39",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "22bde204-dc27-4efe-b0b4-07f8c29b9978",
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
  "created_at": "2026-10-30T09:35:05.688438Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/177d41de-3d21-451a-acb0-b1e253f2de39/cancel` → **200**

```json
{
  "command_id": "f0a59630-e27c-46f0-98c6-431dc2aac60f",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "177d41de-3d21-451a-acb0-b1e253f2de39",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "22bde204-dc27-4efe-b0b4-07f8c29b9978",
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
  "created_at": "2026-10-30T09:35:05.688438Z",
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
  "command_id": "30afb084-90ea-441c-b521-4bd923ba13eb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:35:06Z",
    "sequence": 1793352906888
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ca672186-f1ec-49f6-a915-2f5252407d26",
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
  "last_heartbeat_at": "2026-10-30T09:35:06.908051Z",
  "last_location_at": "2026-10-30T09:35:06.908051Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-28517"
}
```

```json
{
  "challenge_id": "ba12e162-cb2a-4be3-a907-c358678c3bbd",
  "expires_at": "2026-10-30T09:40:07.19221227Z",
  "resend_available_at": "2026-10-30T09:35:08.19221227Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "507519",
  "sent_at": "2026-10-30T09:35:07.196132536Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ba12e162-cb2a-4be3-a907-c358678c3bbd",
  "code": "507519",
  "device_ref": "sandbox-28517"
}
```

```json
{
  "session_id": "5f541b48-6390-4a22-a980-e83239621db9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzgwNywiaWF0IjoxNzkzMzUyOTA3LCJqdGkiOiJmYzdiNzM2ZS03YzE1LTRjZGUtOWJlNC02MGY0OGUxNzJhMDUiLCJzaWQiOiI1ZjU0MWI0OC02MzkwLTRhMjItYTk4MC1lODMyMzk2MjFkYjkifQ.JkSApehwrgbx4_PA5SgcNYEknGji1xyyPzdOhse8YHE",
  "access_expires_at": "2026-10-30T09:50:07.511351528Z",
  "refresh_token": "lkKG08Cchqp8asxdhj_CVg-BqcO_7_wCduTDdiN0f7U",
  "refresh_expires_at": "2026-11-29T09:35:07.510726687Z",
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
  "command_id": "d34219b1-2dfe-4e25-9f6a-5a166c6af2ab",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:35:08Z",
    "sequence": 1793352908659
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c5b7a33c-a8b9-435a-8225-65dac95f5b72",
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
  "last_heartbeat_at": "2026-10-30T09:35:08.086057Z",
  "last_location_at": "2026-10-30T09:35:08.086057Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b4f992d9-4d9e-41e4-9294-49bd8f462361",
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
  "id": "70438167-93a5-4413-9b82-1329567c61f6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:40:08.379119Z",
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
  "command_id": "83246177-a6d7-43db-a333-0691b5d8d87f",
  "quote_id": "70438167-93a5-4413-9b82-1329567c61f6",
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
  "id": "b91c1a5a-e36f-4520-b834-264ae18335d6",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "22bde204-dc27-4efe-b0b4-07f8c29b9978",
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
  "created_at": "2026-10-30T09:35:08.678661Z",
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
    "id": "347e78c2-76fe-4309-a7c0-eef843295e39",
    "order_id": "b91c1a5a-e36f-4520-b834-264ae18335d6",
    "expires_at": "2026-10-30T09:35:23.683276Z",
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

`POST /api/driver/v1/offers/347e78c2-76fe-4309-a7c0-eef843295e39/accept` → **200**

```json
{
  "command_id": "c6bd59ab-8919-4d8d-a247-1fe3ac420c25"
}
```

```json
{
  "id": "c27c1d21-b8d2-4bc9-a223-431b983f4c49",
  "order_id": "b91c1a5a-e36f-4520-b834-264ae18335d6",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "daf4f3d7-c443-4e7d-a628-8ea444305074",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "daf4f3d7-c443-4e7d-a628-8ea444305074",
  "order_id": "b91c1a5a-e36f-4520-b834-264ae18335d6",
  "assignment_id": "c27c1d21-b8d2-4bc9-a223-431b983f4c49",
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

`POST /api/driver/v1/trips/daf4f3d7-c443-4e7d-a628-8ea444305074/cancel` → **200**

```json
{
  "command_id": "eb65e565-7df9-42be-bd5a-5e33d514f131",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "daf4f3d7-c443-4e7d-a628-8ea444305074",
  "order_id": "b91c1a5a-e36f-4520-b834-264ae18335d6",
  "assignment_id": "c27c1d21-b8d2-4bc9-a223-431b983f4c49",
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

`GET /api/rider/v1/orders/b91c1a5a-e36f-4520-b834-264ae18335d6` → **200**

```json
{
  "id": "b91c1a5a-e36f-4520-b834-264ae18335d6",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "22bde204-dc27-4efe-b0b4-07f8c29b9978",
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
    "id": "c27c1d21-b8d2-4bc9-a223-431b983f4c49",
    "order_id": "b91c1a5a-e36f-4520-b834-264ae18335d6",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "daf4f3d7-c443-4e7d-a628-8ea444305074",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T09:35:08.678661Z",
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
    "id": "738b51d3-a06d-49ba-afa6-8fdbf00d18bc",
    "order_id": "b91c1a5a-e36f-4520-b834-264ae18335d6",
    "expires_at": "2026-10-30T09:35:24.850764Z",
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

`POST /api/driver/v1/offers/738b51d3-a06d-49ba-afa6-8fdbf00d18bc/accept` → **200**

```json
{
  "command_id": "462abf5f-578b-46de-b075-cc8a548605ac"
}
```

```json
{
  "id": "8ba95113-298e-4d04-97b2-031459bbc435",
  "order_id": "b91c1a5a-e36f-4520-b834-264ae18335d6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d3186629-096b-4462-afe9-695b3ce2e557",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d3186629-096b-4462-afe9-695b3ce2e557",
  "order_id": "b91c1a5a-e36f-4520-b834-264ae18335d6",
  "assignment_id": "8ba95113-298e-4d04-97b2-031459bbc435",
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

`POST /api/driver/v1/trips/d3186629-096b-4462-afe9-695b3ce2e557/cancel` → **200**

```json
{
  "command_id": "c8bd0503-261c-49dc-a141-2450fda3369b",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "d3186629-096b-4462-afe9-695b3ce2e557",
  "order_id": "b91c1a5a-e36f-4520-b834-264ae18335d6",
  "assignment_id": "8ba95113-298e-4d04-97b2-031459bbc435",
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
    "id": "b91c1a5a-e36f-4520-b834-264ae18335d6",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T09:35:08.678661Z",
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
    "id": "177d41de-3d21-451a-acb0-b1e253f2de39",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-30T09:35:05.688438Z",
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

`GET /api/operator/v1/orders/b91c1a5a-e36f-4520-b834-264ae18335d6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:35:08.679481Z",
      "actor": {
        "type": "CLIENT",
        "id": "22bde204-dc27-4efe-b0b4-07f8c29b9978",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b91c1a5a-e36f-4520-b834-264ae18335d6",
        "quote_id": "70438167-93a5-4413-9b82-1329567c61f6",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "f067a007-ab44-4a83-8b01-d5902ee1ec57"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:35:08.682066Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b91c1a5a-e36f-4520-b834-264ae18335d6",
        "attempt_id": "2176209a-206e-4c7a-a4cf-077f85440a00",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f067a007-ab44-4a83-8b01-d5902ee1ec57"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T09:35:08.693526Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "347e78c2-76fe-4309-a7c0-eef843295e39",
        "order_id": "b91c1a5a-e36f-4520-b834-264ae18335d6",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "f067a007-ab44-4a83-8b01-d5902ee1ec57"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T09:35:09.264892Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "347e78c2-76fe-4309-a7c0-eef843295e39",
        "order_id": "b91c1a5a-e36f-4520-b834-264ae18335d6",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "c27c1d21-b8d2-4bc9-a223-431b983f4c49"
      },
      "correlation_id": "9228d722-125c-4e1a-b0f9-3e2668953370"
```

Done: orders 177d41de-3d21-451a-acb0-b1e253f2de39, b91c1a5a-e36f-4520-b834-264ae18335d6.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731689998",
  "device_ref": "sandbox-16151"
}
```

```json
{
  "challenge_id": "44fd2972-53d3-4a50-9f97-77e319c7eef6",
  "expires_at": "2026-10-30T09:40:12.209188386Z",
  "resend_available_at": "2026-10-30T09:35:13.209188386Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380731689998` → **200**

```json
{
  "phone": "+380731689998",
  "audience": "CLIENT",
  "code": "576819",
  "sent_at": "2026-10-30T09:35:12.213449199Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "44fd2972-53d3-4a50-9f97-77e319c7eef6",
  "code": "576819",
  "device_ref": "sandbox-16151"
}
```

```json
{
  "session_id": "4df34d4f-9d8f-4fcf-80cc-04e7a82eca9d",
  "subject": {
    "type": "CLIENT",
    "id": "5a4db37c-b3db-4528-9731-1022577ef8e9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTRkYjM3Yy1iM2RiLTQ1MjgtOTczMS0xMDIyNTc3ZWY4ZTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzODEyLCJpYXQiOjE3OTMzNTI5MTIsImp0aSI6IjQ5ZTExY2QxLWI2MzQtNGRiNy04YzgzLTBkZDFlYzUzYjAwYyIsInNpZCI6IjRkZjM0ZDRmLTlkOGYtNGZjZi04MGNjLTA0ZTdhODJlY2E5ZCJ9.8FUXg4U2M2Kz5YmrCU8eJTZV0rkXPQrmkpDb48vkp-o",
  "access_expires_at": "2026-10-30T09:50:12.522370813Z",
  "refresh_token": "pZgNIt7fRnD68HgjZwAFdCMICD_QTdD2_Ek_DF8tEjo",
  "refresh_expires_at": "2026-11-29T09:35:12.521771551Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "bc109feb-2a8b-41c1-bad2-714a5eb6e3ad",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "4981c378-7206-45ae-87ef-9da274e13a4e",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-4981c378-7206-45ae-87ef-9da274e13a4e",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "c1507e4ec932586a688f8f2cc9023820",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=4981c378-7206-45ae-87ef-9da274e13a4e",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731689998"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=4981c378-7206-45ae-87ef-9da274e13a4e",
  "expires_at": "2026-10-30T10:05:12.805999Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/4981c378-7206-45ae-87ef-9da274e13a4e` → **200**

```json
{
  "id": "4981c378-7206-45ae-87ef-9da274e13a4e",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T10:05:12.805999Z",
  "card": {
    "id": "dc5fc46d-4f09-4d0e-b8d6-fdf6b4ee4bee",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5940",
    "card_type": "Visa",
    "created_at": "2026-10-30T09:35:13.110651Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "dc5fc46d-4f09-4d0e-b8d6-fdf6b4ee4bee",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****5940",
      "card_type": "Visa",
      "created_at": "2026-10-30T09:35:13.110651Z"
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
  "device_ref": "sandbox-21582"
}
```

```json
{
  "challenge_id": "a7fd1a52-11d7-4953-a7fe-becad8323230",
  "expires_at": "2026-10-30T09:40:13.677485541Z",
  "resend_available_at": "2026-10-30T09:35:14.677485541Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "994707",
  "sent_at": "2026-10-30T09:35:13.681077599Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a7fd1a52-11d7-4953-a7fe-becad8323230",
  "code": "994707",
  "device_ref": "sandbox-21582"
}
```

```json
{
  "session_id": "71a87049-5d3b-4488-b805-b93b039f3c7c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzgxMywiaWF0IjoxNzkzMzUyOTEzLCJqdGkiOiI1NTE2MjRjZC1lNWZmLTRmY2UtODhhOC01MzJkZDRlMTU2ZjYiLCJzaWQiOiI3MWE4NzA0OS01ZDNiLTQ0ODgtYjgwNS1iOTNiMDM5ZjNjN2MifQ.kH39DgXE41mO6l4769iBNUZH6BPagTCPLkKT3ZHijrw",
  "access_expires_at": "2026-10-30T09:50:13.981815349Z",
  "refresh_token": "ukqBaBrKLOnj56Tp7-F6ijMNzSeWcuOY66VxahbLq3U",
  "refresh_expires_at": "2026-11-29T09:35:13.981204917Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c5b7a33c-a8b9-435a-8225-65dac95f5b72",
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
  "last_heartbeat_at": "2026-10-30T09:35:08.086057Z",
  "last_location_at": "2026-10-30T09:35:08.086057Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c5b7a33c-a8b9-435a-8225-65dac95f5b72/handover` → **200**

```json
{
  "command_id": "4847ffb0-11af-4c55-90fa-ed40e3db6c72",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c5b7a33c-a8b9-435a-8225-65dac95f5b72",
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
  "last_heartbeat_at": "2026-10-30T09:35:08.086057Z",
  "last_location_at": "2026-10-30T09:35:08.086057Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c5b7a33c-a8b9-435a-8225-65dac95f5b72/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:35:14Z",
    "sequence": 1793352914840
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c5b7a33c-a8b9-435a-8225-65dac95f5b72",
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
  "last_heartbeat_at": "2026-10-30T09:35:14.859517Z",
  "last_location_at": "2026-10-30T09:35:14.859517Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8a30933c-a0e6-45b8-9e3f-578e56750e47",
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
  "id": "81d09627-a635-4ede-918e-b6da916f6c6b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:40:15.154765Z",
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
  "command_id": "9f91e17f-b1ec-419e-b9ca-6c8a5ae88276",
  "quote_id": "81d09627-a635-4ede-918e-b6da916f6c6b",
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
  "id": "d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5a4db37c-b3db-4528-9731-1022577ef8e9",
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
  "created_at": "2026-10-30T09:35:15.48556Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5` → **200**

```json
{
  "id": "d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5a4db37c-b3db-4528-9731-1022577ef8e9",
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
  "created_at": "2026-10-30T09:35:15.48556Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5` → **200**

```json
{
  "id": "d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5a4db37c-b3db-4528-9731-1022577ef8e9",
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
  "created_at": "2026-10-30T09:35:15.48556Z",
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
    "id": "dfdfa8d9-6cdd-41cf-bfcc-2722c2d93dc4",
    "order_id": "d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5",
    "expires_at": "2026-10-30T09:35:31.380261Z",
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

`POST /api/driver/v1/offers/dfdfa8d9-6cdd-41cf-bfcc-2722c2d93dc4/accept` → **200**

```json
{
  "command_id": "df9da873-74a9-457e-80a9-e8bc0e507a12"
}
```

```json
{
  "id": "757b6a57-7102-476f-b075-2c42fd1095c3",
  "order_id": "d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "388ea2e1-c40c-4fc1-a4a8-0a93f5f3b453",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "388ea2e1-c40c-4fc1-a4a8-0a93f5f3b453",
  "order_id": "d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5",
  "assignment_id": "757b6a57-7102-476f-b075-2c42fd1095c3",
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

`POST /api/driver/v1/work-sessions/c5b7a33c-a8b9-435a-8225-65dac95f5b72/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:35:18Z",
    "sequence": 1793352918236
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c5b7a33c-a8b9-435a-8225-65dac95f5b72",
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
  "last_heartbeat_at": "2026-10-30T09:35:18.256312Z",
  "last_location_at": "2026-10-30T09:35:18.256312Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/388ea2e1-c40c-4fc1-a4a8-0a93f5f3b453/arrive` → **200**

```json
{
  "command_id": "8cd2a4df-42ca-4263-8d51-51ceccc807c0",
  "expected_version": 0
}
```

```json
{
  "id": "388ea2e1-c40c-4fc1-a4a8-0a93f5f3b453",
  "order_id": "d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5",
  "assignment_id": "757b6a57-7102-476f-b075-2c42fd1095c3",
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
  "arrived_at": "2026-10-30T09:35:18.560983Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/388ea2e1-c40c-4fc1-a4a8-0a93f5f3b453/start` → **200**

```json
{
  "command_id": "5a20a9b0-df78-4480-bdc4-4148875f6fb0",
  "expected_version": 1
}
```

```json
{
  "id": "388ea2e1-c40c-4fc1-a4a8-0a93f5f3b453",
  "order_id": "d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5",
  "assignment_id": "757b6a57-7102-476f-b075-2c42fd1095c3",
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
  "arrived_at": "2026-10-30T09:35:18.560983Z",
  "started_at": "2026-10-30T09:35:18.866936Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/388ea2e1-c40c-4fc1-a4a8-0a93f5f3b453/complete` → **200**

```json
{
  "command_id": "59325961-7f77-4879-801e-dfa3a40f2eb5",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:35:19Z",
  "cash_received": true
}
```

```json
{
  "id": "388ea2e1-c40c-4fc1-a4a8-0a93f5f3b453",
  "order_id": "d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5",
  "assignment_id": "757b6a57-7102-476f-b075-2c42fd1095c3",
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
  "arrived_at": "2026-10-30T09:35:18.560983Z",
  "started_at": "2026-10-30T09:35:18.866936Z",
  "completed_at": "2026-10-30T09:35:19.170145Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5` → **200**

```json
{
  "id": "d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "5a4db37c-b3db-4528-9731-1022577ef8e9",
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
    "id": "757b6a57-7102-476f-b075-2c42fd1095c3",
    "order_id": "d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "388ea2e1-c40c-4fc1-a4a8-0a93f5f3b453",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:35:15.48556Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5` → **200**

```json
{
  "id": "d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "5a4db37c-b3db-4528-9731-1022577ef8e9",
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
    "id": "757b6a57-7102-476f-b075-2c42fd1095c3",
    "order_id": "d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "388ea2e1-c40c-4fc1-a4a8-0a93f5f3b453",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:35:15.48556Z",
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

`GET /api/rider/v1/orders/d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5/tip` → **200**

```json
{
  "order_id": "d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5",
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
  "available_until": "2026-10-31T09:35:19.170145Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5/tip` → **201**

```json
{
  "command_id": "8f8b821c-97d6-454a-bc88-8b103560199f",
  "amount_minor": 2500
}
```

```json
{
  "id": "0bc0fbac-6faa-497b-b5d0-c0bc57048a73",
  "order_id": "d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T09:35:21.663544Z"
}
```

`GET /api/rider/v1/orders/d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5/tip` → **200**

```json
{
  "order_id": "d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5",
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
  "available_until": "2026-10-31T09:35:19.170145Z",
  "open": false,
  "tip": {
    "id": "0bc0fbac-6faa-497b-b5d0-c0bc57048a73",
    "order_id": "d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T09:35:21.663544Z"
  }
}
```

`GET /api/rider/v1/orders/d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5/tip` → **200**

```json
{
  "order_id": "d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5",
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
  "available_until": "2026-10-31T09:35:19.170145Z",
  "open": false,
  "tip": {
    "id": "0bc0fbac-6faa-497b-b5d0-c0bc57048a73",
    "order_id": "d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T09:35:21.663544Z"
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
      "id": "b0520093-80d1-42b8-a996-23b596643eea",
      "at": "2026-10-30T09:35:23.537651Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5",
      "counterpart_id": null
    },
    {
      "id": "5caaf5f3-8398-41ef-aaef-fa11b50ced23",
      "at": "2026-10-30T09:35:19.475183Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "02de26e4-aced-46c1-8072-c422c86576b4",
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
  "id": "4afbb7dd-3837-46ec-837e-aaa95b868840",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:40:23.852441Z",
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
  "session_id": "dbd4dcd9-b784-4070-ab56-66ef2bc31fda",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM4MjQsImlhdCI6MTc5MzM1MjkyNCwianRpIjoiODQ4NjJkZDgtMDljZi00NjE4LWE2ZDEtM2RkYWI5OWYxMDg5Iiwic2lkIjoiZGJkNGRjZDktYjc4NC00MDcwLWFiNTYtNjZlZjJiYzMxZmRhIn0.PRawNCK69wFBt725gMNP0QNsnxzwyE3rHMMFob5CuWs",
  "access_expires_at": "2026-10-30T09:50:24.446165676Z",
  "refresh_token": "GAO46Ye8v1XCniw25bLeO7XYJdW_NbTnegl9Hq3eLdo",
  "refresh_expires_at": "2026-10-30T21:35:24.445557917Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380731689998` → **200**

```json
{
  "client_id": "5a4db37c-b3db-4528-9731-1022577ef8e9"
}
```

`POST /api/admin/v1/rider-wallets/5a4db37c-b3db-4528-9731-1022577ef8e9/top-ups` → **201**

```json
{
  "command_id": "b040978d-f363-401c-923f-d67d0481a0e9",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "5a4db37c-b3db-4528-9731-1022577ef8e9",
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
      "id": "c38e3560-e1d3-43cf-b430-6e4a19573f2a",
      "at": "2026-10-30T09:35:25.000006Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "f621c4f1-9b6e-41a5-939b-44be51548e85",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ed8712d3-14c5-490e-90f6-4bbc444aba75",
  "quote_id": "4afbb7dd-3837-46ec-837e-aaa95b868840",
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
  "id": "dcb8494a-2c1b-4e11-a406-0614d41c75bd",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5a4db37c-b3db-4528-9731-1022577ef8e9",
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
  "created_at": "2026-10-30T09:35:25.308311Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dcb8494a-2c1b-4e11-a406-0614d41c75bd` → **200**

```json
{
  "id": "dcb8494a-2c1b-4e11-a406-0614d41c75bd",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5a4db37c-b3db-4528-9731-1022577ef8e9",
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
  "created_at": "2026-10-30T09:35:25.308311Z",
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
    "id": "457fd936-0177-4f6c-b65c-311def1007ab",
    "order_id": "dcb8494a-2c1b-4e11-a406-0614d41c75bd",
    "expires_at": "2026-10-30T09:35:40.313725Z",
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

`POST /api/driver/v1/offers/457fd936-0177-4f6c-b65c-311def1007ab/accept` → **200**

```json
{
  "command_id": "81d98e80-cd1e-40f0-a9ea-2034b1147cfb"
}
```

```json
{
  "id": "bdf5b284-57a1-43b9-8fb5-db59d601018c",
  "order_id": "dcb8494a-2c1b-4e11-a406-0614d41c75bd",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e52156de-4947-4114-a370-16c6ec9723bc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e52156de-4947-4114-a370-16c6ec9723bc",
  "order_id": "dcb8494a-2c1b-4e11-a406-0614d41c75bd",
  "assignment_id": "bdf5b284-57a1-43b9-8fb5-db59d601018c",
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

`POST /api/driver/v1/work-sessions/c5b7a33c-a8b9-435a-8225-65dac95f5b72/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:35:26Z",
    "sequence": 1793352926791
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c5b7a33c-a8b9-435a-8225-65dac95f5b72",
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
  "last_heartbeat_at": "2026-10-30T09:35:26.81111Z",
  "last_location_at": "2026-10-30T09:35:26.81111Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e52156de-4947-4114-a370-16c6ec9723bc/arrive` → **200**

```json
{
  "command_id": "b6c20040-e156-473a-bc3d-2d7ecbf2d888",
  "expected_version": 0
}
```

```json
{
  "id": "e52156de-4947-4114-a370-16c6ec9723bc",
  "order_id": "dcb8494a-2c1b-4e11-a406-0614d41c75bd",
  "assignment_id": "bdf5b284-57a1-43b9-8fb5-db59d601018c",
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
  "arrived_at": "2026-10-30T09:35:27.110144Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e52156de-4947-4114-a370-16c6ec9723bc/start` → **200**

```json
{
  "command_id": "cb38ee43-5969-45bb-8f66-4491ef69c21a",
  "expected_version": 1
}
```

```json
{
  "id": "e52156de-4947-4114-a370-16c6ec9723bc",
  "order_id": "dcb8494a-2c1b-4e11-a406-0614d41c75bd",
  "assignment_id": "bdf5b284-57a1-43b9-8fb5-db59d601018c",
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
  "arrived_at": "2026-10-30T09:35:27.110144Z",
  "started_at": "2026-10-30T09:35:27.429306Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e52156de-4947-4114-a370-16c6ec9723bc/complete` → **200**

```json
{
  "command_id": "67448e3f-d26c-4509-b4dc-928dd1165c28",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:35:27Z",
  "cash_received": true
}
```

```json
{
  "id": "e52156de-4947-4114-a370-16c6ec9723bc",
  "order_id": "dcb8494a-2c1b-4e11-a406-0614d41c75bd",
  "assignment_id": "bdf5b284-57a1-43b9-8fb5-db59d601018c",
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
  "arrived_at": "2026-10-30T09:35:27.110144Z",
  "started_at": "2026-10-30T09:35:27.429306Z",
  "completed_at": "2026-10-30T09:35:27.741815Z",
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
  "client_id": "5a4db37c-b3db-4528-9731-1022577ef8e9",
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
      "id": "c38e3560-e1d3-43cf-b430-6e4a19573f2a",
      "at": "2026-10-30T09:35:25.000006Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "f621c4f1-9b6e-41a5-939b-44be51548e85",
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

`GET /api/rider/v1/orders/dcb8494a-2c1b-4e11-a406-0614d41c75bd/tip` → **200**

```json
{
  "order_id": "dcb8494a-2c1b-4e11-a406-0614d41c75bd",
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
  "available_until": "2026-10-31T09:35:27.741815Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/dcb8494a-2c1b-4e11-a406-0614d41c75bd/tip` → **201**

```json
{
  "command_id": "a0910736-3f23-41bd-937d-006b45b59af3",
  "amount_minor": 2500
}
```

```json
{
  "id": "b6ebd0aa-a42d-4d01-a570-e3bc48be9e0e",
  "order_id": "dcb8494a-2c1b-4e11-a406-0614d41c75bd",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T09:35:28.89384Z"
}
```

`GET /api/rider/v1/orders/dcb8494a-2c1b-4e11-a406-0614d41c75bd/tip` → **200**

```json
{
  "order_id": "dcb8494a-2c1b-4e11-a406-0614d41c75bd",
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
  "available_until": "2026-10-31T09:35:27.741815Z",
  "open": false,
  "tip": {
    "id": "b6ebd0aa-a42d-4d01-a570-e3bc48be9e0e",
    "order_id": "dcb8494a-2c1b-4e11-a406-0614d41c75bd",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T09:35:28.89384Z"
  }
}
```

`GET /api/rider/v1/orders/dcb8494a-2c1b-4e11-a406-0614d41c75bd/tip` → **200**

```json
{
  "order_id": "dcb8494a-2c1b-4e11-a406-0614d41c75bd",
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
  "available_until": "2026-10-31T09:35:27.741815Z",
  "open": false,
  "tip": {
    "id": "b6ebd0aa-a42d-4d01-a570-e3bc48be9e0e",
    "order_id": "dcb8494a-2c1b-4e11-a406-0614d41c75bd",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T09:35:28.89384Z"
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
      "id": "99862017-6301-4937-9d1d-3ac38e0f38aa",
      "at": "2026-10-30T09:35:30.620666Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "dcb8494a-2c1b-4e11-a406-0614d41c75bd",
      "counterpart_id": null
    },
    {
      "id": "4a15e078-3467-4687-9093-29b4e59a7af6",
      "at": "2026-10-30T09:35:28.587779Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "dcb8494a-2c1b-4e11-a406-0614d41c75bd",
      "counterpart_id": null
    },
    {
      "id": "b0520093-80d1-42b8-a996-23b596643eea",
      "at": "2026-10-30T09:35:23.537651Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5",
      "counterpart_id": null
    },
    {
      "id": "5caaf5f3-8398-41ef-aaef-fa11b50ced23",
      "at": "2026-10-30T09:35:19.475183Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d0eb27a3-36c2-46cb-bf43-b3d7b90e07e5",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c5b7a33c-a8b9-435a-8225-65dac95f5b72",
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
  "last_heartbeat_at": "2026-10-30T09:35:26.81111Z",
  "last_location_at": "2026-10-30T09:35:26.81111Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c5b7a33c-a8b9-435a-8225-65dac95f5b72/close` → **200**

```json
{
  "command_id": "5ade00b1-0506-4f3f-b5f1-a4b9102173e1",
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

Done: card order dcb8494a-2c1b-4e11-a406-0614d41c75bd.

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
  "phone": "+380738920136",
  "device_ref": "sandbox-20344"
}
```

```json
{
  "challenge_id": "0d7a4e75-d84e-46ad-ba66-a4006e30a70b",
  "expires_at": "2026-10-30T09:40:31.916490793Z",
  "resend_available_at": "2026-10-30T09:35:32.916490793Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738920136` → **200**

```json
{
  "phone": "+380738920136",
  "audience": "CLIENT",
  "code": "268996",
  "sent_at": "2026-10-30T09:35:31.919637288Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0d7a4e75-d84e-46ad-ba66-a4006e30a70b",
  "code": "268996",
  "device_ref": "sandbox-20344"
}
```

```json
{
  "session_id": "96d8957e-b600-4ec5-b078-dc494f559bec",
  "subject": {
    "type": "CLIENT",
    "id": "67f709cc-a318-4c53-95a5-93fa8821a355"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2N2Y3MDljYy1hMzE4LTRjNTMtOTVhNS05M2ZhODgyMWEzNTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzODMyLCJpYXQiOjE3OTMzNTI5MzIsImp0aSI6IjBlZDE0Y2RhLWY2ZTktNDBiOS1hZTA2LTdkZGJiOGExZjVlMyIsInNpZCI6Ijk2ZDg5NTdlLWI2MDAtNGVjNS1iMDc4LWRjNDk0ZjU1OWJlYyJ9.Qzu30NemvDOY67rgQm07285j7wfoHI-UOwxpPhXVh6o",
  "access_expires_at": "2026-10-30T09:50:32.229137302Z",
  "refresh_token": "7YkcKcqAn7jkWmE4VSgWdMRT6dlXpDt9uoKbfvaHkMY",
  "refresh_expires_at": "2026-11-29T09:35:32.228502587Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "6d597120-b008-4cab-a13c-1d30bf29e3cf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "75de16f7-4c3b-4090-bc8a-687898459176",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-75de16f7-4c3b-4090-bc8a-687898459176",
    "orderDate": "1793352932",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "3daa3d648bdf567fad179d26a8262ba5",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=75de16f7-4c3b-4090-bc8a-687898459176",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738920136"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=75de16f7-4c3b-4090-bc8a-687898459176",
  "created_at": "2026-10-30T09:35:32.52413Z",
  "expires_at": "2026-10-30T10:05:32.52413Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/75de16f7-4c3b-4090-bc8a-687898459176` → **200**

```json
{
  "id": "75de16f7-4c3b-4090-bc8a-687898459176",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T09:35:32.52413Z",
  "expires_at": "2026-10-30T10:05:32.52413Z",
  "completed_at": "2026-10-30T09:35:32.823756Z",
  "masked_pan": "41****0135",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "67f709cc-a318-4c53-95a5-93fa8821a355",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "67f709cc-a318-4c53-95a5-93fa8821a355",
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
      "id": "58ed5d5d-8fc3-41fa-9405-6d83870560b7",
      "at": "2026-10-30T09:35:33.63818Z",
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
  "client_id": "67f709cc-a318-4c53-95a5-93fa8821a355",
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
      "id": "58ed5d5d-8fc3-41fa-9405-6d83870560b7",
      "at": "2026-10-30T09:35:33.63818Z",
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
  "device_ref": "sandbox-7679"
}
```

```json
{
  "challenge_id": "d52eaeb2-a5f7-4dec-978e-bf8f02b2b18d",
  "expires_at": "2026-10-30T09:40:34.999099136Z",
  "resend_available_at": "2026-10-30T09:35:35.999099136Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "617007",
  "sent_at": "2026-10-30T09:35:35.001889221Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d52eaeb2-a5f7-4dec-978e-bf8f02b2b18d",
  "code": "617007",
  "device_ref": "sandbox-7679"
}
```

```json
{
  "session_id": "5680ac68-7b26-49c7-a775-49815dbe9053",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzgzNSwiaWF0IjoxNzkzMzUyOTM1LCJqdGkiOiIyZmE0NTAzYi0zNDM2LTRmYjEtYWExNS04NDE0ZjU4MmM2MDMiLCJzaWQiOiI1NjgwYWM2OC03YjI2LTQ5YzctYTc3NS00OTgxNWRiZTkwNTMifQ.sl0CuNh2Ic7z_RRIqZa8tfxQ6Pkr4b0ROp9DXaLuAwQ",
  "access_expires_at": "2026-10-30T09:50:35.337062592Z",
  "refresh_token": "C7f_3KbAItkpxMP8rm_FVd4q0F4WWPMpMaA2lRyDDNc",
  "refresh_expires_at": "2026-11-29T09:35:35.336480982Z",
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
  "command_id": "b02ada87-768c-4654-8251-bf97080fbf65",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "a986b48e-982f-4502-8063-e61b139907a5",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-a986b48e-982f-4502-8063-e61b139907a5",
    "orderDate": "1793352935",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "ec2c66345fbb65c658c333187775c606",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=a986b48e-982f-4502-8063-e61b139907a5",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=a986b48e-982f-4502-8063-e61b139907a5",
  "created_at": "2026-10-30T09:35:35.916194Z",
  "expires_at": "2026-10-30T10:05:35.916194Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/a986b48e-982f-4502-8063-e61b139907a5` → **200**

```json
{
  "id": "a986b48e-982f-4502-8063-e61b139907a5",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T09:35:35.916194Z",
  "expires_at": "2026-10-30T10:05:35.916194Z",
  "completed_at": "2026-10-30T09:35:36.2214Z",
  "masked_pan": "41****5020",
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
      "id": "d6a13e1c-fe4d-4022-9e75-c217a474e761",
      "at": "2026-10-30T09:35:36.646746Z",
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
  "command_id": "020acf20-85e2-48f5-9ddf-9acaac4608c9",
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
  "correlation_id": "1ab1b45c-9e2f-4e81-a972-8fda05340b82"
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
  "device_ref": "sandbox-26205"
}
```

```json
{
  "challenge_id": "9e5282f7-2bfb-4787-aace-4dfd94607f86",
  "expires_at": "2026-10-30T09:40:38.431553879Z",
  "resend_available_at": "2026-10-30T09:35:39.431553879Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "212810",
  "sent_at": "2026-10-30T09:35:38.434974706Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9e5282f7-2bfb-4787-aace-4dfd94607f86",
  "code": "212810",
  "device_ref": "sandbox-26205"
}
```

```json
{
  "session_id": "2b540c68-6371-4ae6-ad8b-afc49f9dc8b7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzgzOCwiaWF0IjoxNzkzMzUyOTM4LCJqdGkiOiJkOTEzNzQwOC0yMmU4LTQyODQtODEwZi1mYTAxNTAxNTc0YWQiLCJzaWQiOiIyYjU0MGM2OC02MzcxLTRhZTYtYWQ4Yi1hZmM0OWY5ZGM4YjcifQ.MXQ6mYmRAKc_sOuOYxQvWJveziOuPqlEQQcRGVP31zE",
  "access_expires_at": "2026-10-30T09:50:38.745948291Z",
  "refresh_token": "teK7b4DN2D86ORRiKYcYS8tFbZFL0RqSb_KKP1Ihg-U",
  "refresh_expires_at": "2026-11-29T09:35:38.745388081Z",
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
  "command_id": "d00f9c9f-efc0-4d36-a1f5-c1296750a4f0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:35:39Z",
    "sequence": 1793352939307
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "519f29f7-04fc-4256-a821-e82df24dc798",
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
  "last_heartbeat_at": "2026-10-30T09:35:39.325746Z",
  "last_location_at": "2026-10-30T09:35:39.325746Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639962924",
  "device_ref": "sandbox-11992"
}
```

```json
{
  "challenge_id": "b3371c94-3e36-4479-8b75-fdd01f237611",
  "expires_at": "2026-10-30T09:40:39.616318308Z",
  "resend_available_at": "2026-10-30T09:35:40.616318308Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639962924` → **200**

```json
{
  "phone": "+380639962924",
  "audience": "CLIENT",
  "code": "765795",
  "sent_at": "2026-10-30T09:35:39.619285939Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b3371c94-3e36-4479-8b75-fdd01f237611",
  "code": "765795",
  "device_ref": "sandbox-11992"
}
```

```json
{
  "session_id": "7166b430-6f3c-4c79-af71-c5d309290762",
  "subject": {
    "type": "CLIENT",
    "id": "29f41168-f640-4062-8871-ab77341890be"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWY0MTE2OC1mNjQwLTQwNjItODg3MS1hYjc3MzQxODkwYmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzODM5LCJpYXQiOjE3OTMzNTI5MzksImp0aSI6ImM0MmZkMDQzLWQzNzEtNDJjZS04ZTBiLTM4MWYxYWEzZjIzOSIsInNpZCI6IjcxNjZiNDMwLTZmM2MtNGM3OS1hZjcxLWM1ZDMwOTI5MDc2MiJ9.2IvH06g1OaSGYctk-uGawr_CvvDUC8zBwqaa3dEOIQQ",
  "access_expires_at": "2026-10-30T09:50:39.940988682Z",
  "refresh_token": "FmPNf5hhA5posDT8DmYN3FCza6ectTHNlCGPoukwz_0",
  "refresh_expires_at": "2026-11-29T09:35:39.940371206Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "df9a25cd-e029-429b-9b99-7385eb9fd6dc",
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
  "id": "86a105b3-a645-4ab0-bdf8-85a40fc789e8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:40:40.261003Z",
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
  "command_id": "dcb1377d-3ca7-4ba6-a29e-b8e02ee84881",
  "quote_id": "86a105b3-a645-4ab0-bdf8-85a40fc789e8",
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
  "id": "55cfc02e-a469-4e4e-a0a3-e98d3b0719d4",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "29f41168-f640-4062-8871-ab77341890be",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:35:40.604448Z",
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
    "id": "67d2c88a-039d-4c15-8802-1c4195213af1",
    "order_id": "55cfc02e-a469-4e4e-a0a3-e98d3b0719d4",
    "expires_at": "2026-10-30T09:35:55.607872Z",
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

`POST /api/driver/v1/offers/67d2c88a-039d-4c15-8802-1c4195213af1/accept` → **200**

```json
{
  "command_id": "4d706d31-8390-49b7-b556-55143ecc3950"
}
```

```json
{
  "id": "a4179e2d-763d-40fe-9b3d-e739d05c057e",
  "order_id": "55cfc02e-a469-4e4e-a0a3-e98d3b0719d4",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a71fe0a1-f684-4e22-8547-1c19af89e13a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a71fe0a1-f684-4e22-8547-1c19af89e13a",
  "order_id": "55cfc02e-a469-4e4e-a0a3-e98d3b0719d4",
  "assignment_id": "a4179e2d-763d-40fe-9b3d-e739d05c057e",
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

`POST /api/driver/v1/work-sessions/519f29f7-04fc-4256-a821-e82df24dc798/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:35:41Z",
    "sequence": 1793352941830
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "519f29f7-04fc-4256-a821-e82df24dc798",
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
  "last_heartbeat_at": "2026-10-30T09:35:41.84938Z",
  "last_location_at": "2026-10-30T09:35:41.84938Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a71fe0a1-f684-4e22-8547-1c19af89e13a/arrive` → **200**

```json
{
  "command_id": "510fbaf6-dfde-4210-b66f-b43be2b0c606",
  "expected_version": 0
}
```

```json
{
  "id": "a71fe0a1-f684-4e22-8547-1c19af89e13a",
  "order_id": "55cfc02e-a469-4e4e-a0a3-e98d3b0719d4",
  "assignment_id": "a4179e2d-763d-40fe-9b3d-e739d05c057e",
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
  "arrived_at": "2026-10-30T09:35:42.152366Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a71fe0a1-f684-4e22-8547-1c19af89e13a/start` → **200**

```json
{
  "command_id": "529fdfa2-20ea-4861-aa19-057e4edc6b76",
  "expected_version": 1
}
```

```json
{
  "id": "a71fe0a1-f684-4e22-8547-1c19af89e13a",
  "order_id": "55cfc02e-a469-4e4e-a0a3-e98d3b0719d4",
  "assignment_id": "a4179e2d-763d-40fe-9b3d-e739d05c057e",
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
  "arrived_at": "2026-10-30T09:35:42.152366Z",
  "started_at": "2026-10-30T09:35:42.450011Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a71fe0a1-f684-4e22-8547-1c19af89e13a/complete` → **200**

```json
{
  "command_id": "5266c9e3-40e6-4127-9bad-6ae6dadebc73",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:35:42Z",
  "cash_received": false
}
```

```json
{
  "id": "a71fe0a1-f684-4e22-8547-1c19af89e13a",
  "order_id": "55cfc02e-a469-4e4e-a0a3-e98d3b0719d4",
  "assignment_id": "a4179e2d-763d-40fe-9b3d-e739d05c057e",
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
  "arrived_at": "2026-10-30T09:35:42.152366Z",
  "started_at": "2026-10-30T09:35:42.450011Z",
  "completed_at": "2026-10-30T09:35:42.761403Z",
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
  "session_id": "727980f8-74f7-4f3f-9336-74f333d94c48",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM4NDMsImlhdCI6MTc5MzM1Mjk0MywianRpIjoiMjc2N2ZjMjQtZGZmYS00ZTgwLWFkZTMtY2ZkYTUyN2JlNDM2Iiwic2lkIjoiNzI3OTgwZjgtNzRmNy00ZjNmLTkzMzYtNzRmMzMzZDk0YzQ4In0.rc4TrxQ51H2C2x8U8T2iPTpxjguPPTiDEb01kqqJuz8",
  "access_expires_at": "2026-10-30T09:50:43.349207928Z",
  "refresh_token": "l-Q2Yfcxqdzg8SgCbcwLs0wokfZByhZ5DgxGmWGV-ak",
  "refresh_expires_at": "2026-10-30T21:35:43.348588728Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/55cfc02e-a469-4e4e-a0a3-e98d3b0719d4/cash-dispute` → **404**

```json
{
  "instance": "/api/admin/v1/orders/55cfc02e-a469-4e4e-a0a3-e98d3b0719d4/cash-dispute",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b2d8fc55-e324-4c40-bdcb-3e63de795471"
}
```

`GET /api/admin/v1/orders/55cfc02e-a469-4e4e-a0a3-e98d3b0719d4/cash-dispute` → **200**

```json
{
  "order_id": "55cfc02e-a469-4e4e-a0a3-e98d3b0719d4",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "29f41168-f640-4062-8871-ab77341890be",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T09:35:43.736543Z",
  "decide_by": "2026-11-13T09:35:43.736543Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T09:35:43.736543Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "55cfc02e-a469-4e4e-a0a3-e98d3b0719d4",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "29f41168-f640-4062-8871-ab77341890be",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T09:35:43.736543Z",
      "decide_by": "2026-11-13T09:35:43.736543Z",
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

`POST /api/admin/v1/orders/55cfc02e-a469-4e4e-a0a3-e98d3b0719d4/cash-dispute/decide` → **400**

```json
{
  "command_id": "f6119360-cc76-480b-983a-078708c05639",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/55cfc02e-a469-4e4e-a0a3-e98d3b0719d4/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "0c5a587a-ec94-4d74-ae43-1895c0a938ba",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/55cfc02e-a469-4e4e-a0a3-e98d3b0719d4/cash-dispute/decide` → **200**

```json
{
  "command_id": "2d01c9f9-b16a-4498-a0b6-5cc66962dc6a",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "55cfc02e-a469-4e4e-a0a3-e98d3b0719d4",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "29f41168-f640-4062-8871-ab77341890be",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T09:35:43.736543Z",
  "decide_by": "2026-11-13T09:35:43.736543Z",
  "decision": "PAY_DRIVER",
  "decided_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T09:35:45.862829Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/55cfc02e-a469-4e4e-a0a3-e98d3b0719d4/cash-dispute/decide` → **409**

```json
{
  "command_id": "2cf1b718-a183-4fbb-9d1a-c8e2602067cd",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/55cfc02e-a469-4e4e-a0a3-e98d3b0719d4/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "7b5db294-d1bd-4af3-a601-048bc050240a"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "519f29f7-04fc-4256-a821-e82df24dc798",
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
  "last_heartbeat_at": "2026-10-30T09:35:41.84938Z",
  "last_location_at": "2026-10-30T09:35:41.84938Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/519f29f7-04fc-4256-a821-e82df24dc798/close` → **200**

```json
{
  "command_id": "afb675b9-1c5c-4bd9-a794-1b77b148f0af",
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
  "phone": "+380738097023",
  "device_ref": "sandbox-25550"
}
```

```json
{
  "challenge_id": "a5b0cc88-cae0-40cf-9413-9b66387d6e45",
  "expires_at": "2026-10-30T09:40:47.060896327Z",
  "resend_available_at": "2026-10-30T09:35:48.060896327Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738097023` → **200**

```json
{
  "phone": "+380738097023",
  "audience": "CLIENT",
  "code": "949644",
  "sent_at": "2026-10-30T09:35:47.064296968Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a5b0cc88-cae0-40cf-9413-9b66387d6e45",
  "code": "949644",
  "device_ref": "sandbox-25550"
}
```

```json
{
  "session_id": "dc26358a-7213-4757-acc7-7de50fcb90bd",
  "subject": {
    "type": "CLIENT",
    "id": "d67f257f-f32a-4f06-907c-95866b6b7820"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjdmMjU3Zi1mMzJhLTRmMDYtOTA3Yy05NTg2NmI2Yjc4MjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzODQ3LCJpYXQiOjE3OTMzNTI5NDcsImp0aSI6IjMyZTNmNjM4LTA3MWEtNDUyNC05MjVlLWNmYTkzOThhMTkxMCIsInNpZCI6ImRjMjYzNThhLTcyMTMtNDc1Ny1hY2M3LTdkZTUwZmNiOTBiZCJ9.o6ca9Yd7FmTL9vYWewi8cqrBumb_aIUdvm3EUt2JFZ8",
  "access_expires_at": "2026-10-30T09:50:47.38640055Z",
  "refresh_token": "hDn9rnSCpbAZpNHMRWyOnOu2km75r_xLaaIyGrK-Q8w",
  "refresh_expires_at": "2026-11-29T09:35:47.385892769Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "81d8c9f7-1c05-49c3-b3d7-a8d35c930fbc",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "2b9a6a2f-9b3b-4f61-8236-e4f0ea30d4e5",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-2b9a6a2f-9b3b-4f61-8236-e4f0ea30d4e5",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "a75c51605e0de0d221f03651afa94884",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=2b9a6a2f-9b3b-4f61-8236-e4f0ea30d4e5",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738097023"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=2b9a6a2f-9b3b-4f61-8236-e4f0ea30d4e5",
  "expires_at": "2026-10-30T10:05:47.677244Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/2b9a6a2f-9b3b-4f61-8236-e4f0ea30d4e5` → **200**

```json
{
  "id": "2b9a6a2f-9b3b-4f61-8236-e4f0ea30d4e5",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T10:05:47.677244Z",
  "card": {
    "id": "1e1e45b8-b126-43dc-8db1-b7b092440fb1",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5982",
    "card_type": "Visa",
    "created_at": "2026-10-30T09:35:47.967987Z"
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
  "device_ref": "sandbox-6441"
}
```

```json
{
  "challenge_id": "08331992-1d91-414c-a379-775430393b2c",
  "expires_at": "2026-10-30T09:40:48.276541955Z",
  "resend_available_at": "2026-10-30T09:35:49.276541955Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "016387",
  "sent_at": "2026-10-30T09:35:48.279556883Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "08331992-1d91-414c-a379-775430393b2c",
  "code": "016387",
  "device_ref": "sandbox-6441"
}
```

```json
{
  "session_id": "7d408177-357f-49bf-bde3-7f6ebc370208",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1Mzg0OCwiaWF0IjoxNzkzMzUyOTQ4LCJqdGkiOiI2YjkyNGY4ZC03YjhiLTQxMzgtYTdjYy1mOWI2MGYyMmU4Y2UiLCJzaWQiOiI3ZDQwODE3Ny0zNTdmLTQ5YmYtYmRlMy03ZjZlYmMzNzAyMDgifQ.8Gqu3_vUIR8Q9zl6118g1KP6zh5-U1r3Cak5MGnvdfY",
  "access_expires_at": "2026-10-30T09:50:48.589448236Z",
  "refresh_token": "a33FEynNlpc-i_eVxTj-Hk6KtRpQhzHK595DIM-CgI4",
  "refresh_expires_at": "2026-11-29T09:35:48.588874361Z",
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
  "command_id": "fd422c0d-ebe4-40a9-9498-a712b5178028",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:35:49Z",
    "sequence": 1793352949160
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d0137003-b524-4adf-8383-b7af33c671f4",
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
  "last_heartbeat_at": "2026-10-30T09:35:49.180243Z",
  "last_location_at": "2026-10-30T09:35:49.180243Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "296e6c36-c768-4b85-b41c-e51c9543ae08",
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
  "id": "04927d99-e240-4a88-b478-38328c4088ed",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:40:49.473539Z",
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
  "command_id": "4f953b49-db4b-4f4c-a053-e3b44deb6689",
  "quote_id": "04927d99-e240-4a88-b478-38328c4088ed",
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
  "id": "20b9a92b-3c55-4ca4-9425-09fc93b18083",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "d67f257f-f32a-4f06-907c-95866b6b7820",
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
  "created_at": "2026-10-30T09:35:49.771911Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/20b9a92b-3c55-4ca4-9425-09fc93b18083` → **200**

```json
{
  "id": "20b9a92b-3c55-4ca4-9425-09fc93b18083",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "d67f257f-f32a-4f06-907c-95866b6b7820",
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
  "created_at": "2026-10-30T09:35:49.771911Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/20b9a92b-3c55-4ca4-9425-09fc93b18083` → **200**

```json
{
  "id": "20b9a92b-3c55-4ca4-9425-09fc93b18083",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d67f257f-f32a-4f06-907c-95866b6b7820",
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
  "created_at": "2026-10-30T09:35:49.771911Z",
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
    "id": "d3f1b0e3-9588-4691-aee7-684f813ee4e2",
    "order_id": "20b9a92b-3c55-4ca4-9425-09fc93b18083",
    "expires_at": "2026-10-30T09:36:05.786759Z",
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

`POST /api/driver/v1/offers/d3f1b0e3-9588-4691-aee7-684f813ee4e2/accept` → **200**

```json
{
  "command_id": "e8832dda-72ae-4ff4-9a94-106a86ed28f4"
}
```

```json
{
  "id": "e5c6d104-b820-4119-b291-098c46bdd1c7",
  "order_id": "20b9a92b-3c55-4ca4-9425-09fc93b18083",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "31723d93-d6ea-4d1c-8304-72359bb2776d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "31723d93-d6ea-4d1c-8304-72359bb2776d",
  "order_id": "20b9a92b-3c55-4ca4-9425-09fc93b18083",
  "assignment_id": "e5c6d104-b820-4119-b291-098c46bdd1c7",
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

`POST /api/rider/v1/orders/20b9a92b-3c55-4ca4-9425-09fc93b18083/messages` → **201**

```json
{
  "command_id": "89ac17c2-2bd6-4275-bafd-bf6d2b12467c",
  "body": "Я біля входу, мій номер +380738097023, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "367da790-2df3-4493-ae32-cecf7c19a161",
  "order_id": "20b9a92b-3c55-4ca4-9425-09fc93b18083",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380738097023, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T09:35:52.566379936Z"
}
```

`POST /api/driver/v1/trips/31723d93-d6ea-4d1c-8304-72359bb2776d/messages` → **201**

```json
{
  "command_id": "3ea67870-4807-44a0-aae4-af69c0d65f82",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "7990a15b-0078-4b3b-be3b-bd10d771e4a5",
  "order_id": "20b9a92b-3c55-4ca4-9425-09fc93b18083",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T09:35:52.863746253Z"
}
```

`POST /api/driver/v1/work-sessions/d0137003-b524-4adf-8383-b7af33c671f4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:35:53Z",
    "sequence": 1793352953141
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d0137003-b524-4adf-8383-b7af33c671f4",
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
  "last_heartbeat_at": "2026-10-30T09:35:53.160737Z",
  "last_location_at": "2026-10-30T09:35:53.160737Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/31723d93-d6ea-4d1c-8304-72359bb2776d/arrive` → **200**

```json
{
  "command_id": "43defc87-5144-4d38-a717-ebdb3599eb24",
  "expected_version": 0
}
```

```json
{
  "id": "31723d93-d6ea-4d1c-8304-72359bb2776d",
  "order_id": "20b9a92b-3c55-4ca4-9425-09fc93b18083",
  "assignment_id": "e5c6d104-b820-4119-b291-098c46bdd1c7",
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
  "arrived_at": "2026-10-30T09:35:53.446581Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/31723d93-d6ea-4d1c-8304-72359bb2776d/start` → **200**

```json
{
  "command_id": "30e970e7-dd43-430c-911c-d72436b4d4e8",
  "expected_version": 1
}
```

```json
{
  "id": "31723d93-d6ea-4d1c-8304-72359bb2776d",
  "order_id": "20b9a92b-3c55-4ca4-9425-09fc93b18083",
  "assignment_id": "e5c6d104-b820-4119-b291-098c46bdd1c7",
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
  "arrived_at": "2026-10-30T09:35:53.446581Z",
  "started_at": "2026-10-30T09:35:53.733291Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/d0137003-b524-4adf-8383-b7af33c671f4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:35:54Z",
    "sequence": 1793352954116
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d0137003-b524-4adf-8383-b7af33c671f4",
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
  "last_heartbeat_at": "2026-10-30T09:35:54.030468Z",
  "last_location_at": "2026-10-30T09:35:54.030468Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/31723d93-d6ea-4d1c-8304-72359bb2776d/complete` → **200**

```json
{
  "command_id": "2a0b6232-9dbf-4aa3-bdb1-4297c2bef63c",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:35:54Z",
  "cash_received": false
}
```

```json
{
  "id": "31723d93-d6ea-4d1c-8304-72359bb2776d",
  "order_id": "20b9a92b-3c55-4ca4-9425-09fc93b18083",
  "assignment_id": "e5c6d104-b820-4119-b291-098c46bdd1c7",
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
  "arrived_at": "2026-10-30T09:35:53.446581Z",
  "started_at": "2026-10-30T09:35:53.733291Z",
  "completed_at": "2026-10-30T09:35:54.320975Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/20b9a92b-3c55-4ca4-9425-09fc93b18083` → **200**

```json
{
  "id": "20b9a92b-3c55-4ca4-9425-09fc93b18083",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "d67f257f-f32a-4f06-907c-95866b6b7820",
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
    "id": "e5c6d104-b820-4119-b291-098c46bdd1c7",
    "order_id": "20b9a92b-3c55-4ca4-9425-09fc93b18083",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "31723d93-d6ea-4d1c-8304-72359bb2776d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:35:49.771911Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/20b9a92b-3c55-4ca4-9425-09fc93b18083` → **200**

```json
{
  "id": "20b9a92b-3c55-4ca4-9425-09fc93b18083",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "d67f257f-f32a-4f06-907c-95866b6b7820",
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
    "id": "e5c6d104-b820-4119-b291-098c46bdd1c7",
    "order_id": "20b9a92b-3c55-4ca4-9425-09fc93b18083",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "31723d93-d6ea-4d1c-8304-72359bb2776d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:35:49.771911Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/20b9a92b-3c55-4ca4-9425-09fc93b18083` → **200**

```json
{
  "id": "20b9a92b-3c55-4ca4-9425-09fc93b18083",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "d67f257f-f32a-4f06-907c-95866b6b7820",
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
    "id": "e5c6d104-b820-4119-b291-098c46bdd1c7",
    "order_id": "20b9a92b-3c55-4ca4-9425-09fc93b18083",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "31723d93-d6ea-4d1c-8304-72359bb2776d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:35:49.771911Z",
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
  "session_id": "d0137003-b524-4adf-8383-b7af33c671f4",
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
  "last_heartbeat_at": "2026-10-30T09:35:54.030468Z",
  "last_location_at": "2026-10-30T09:35:54.030468Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d0137003-b524-4adf-8383-b7af33c671f4/close` → **200**

```json
{
  "command_id": "6d944463-170b-4e6e-bb2c-461ec6ec160a",
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
  "session_id": "a848b9b4-1ae9-4628-b73c-f1c26597ea24",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM4NTgsImlhdCI6MTc5MzM1Mjk1OCwianRpIjoiNDQ4NDdjN2ItYzIwZS00M2ZlLWE3NWMtMTc1YTFmZDgwYjVkIiwic2lkIjoiYTg0OGI5YjQtMWFlOS00NjI4LWI3M2MtZjFjMjY1OTdlYTI0In0.guEJq0z7jkgBg3nAOrzakUk5XZdSs2PVf08pq36K_WY",
  "access_expires_at": "2026-10-30T09:50:58.358744068Z",
  "refresh_token": "L-ZgKHMSB57Lag9w5NThpc_BfdR2IiNghho-7295J8A",
  "refresh_expires_at": "2026-10-30T21:35:58.358203085Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/20b9a92b-3c55-4ca4-9425-09fc93b18083/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/20b9a92b-3c55-4ca4-9425-09fc93b18083/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "8e5f7406-ae01-4779-b0c7-effc5609ec54"
}
```

`GET /api/admin/v1/orders/20b9a92b-3c55-4ca4-9425-09fc93b18083/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T09:35:58.933752001Z",
  "order": {
    "id": "20b9a92b-3c55-4ca4-9425-09fc93b18083",
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
    "created_at": "2026-10-30T09:35:49.771911Z",
    "assigned_at": "2026-10-30T09:35:51.982914Z",
    "arrived_at": "2026-10-30T09:35:53.446581Z",
    "started_at": "2026-10-30T09:35:53.733291Z",
    "completed_at": "2026-10-30T09:35:54.320975Z"
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
    "id": "d67f257f-f32a-4f06-907c-95866b6b7820",
    "registered_at": "2026-10-30T09:35:47.384026Z",
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
      "created_at": "2026-10-30T09:35:49.774557Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T09:35:54.877815Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/20b9a92b-3c55-4ca4-9425-09fc93b18083/chargebacks` → **422**

```json
{
  "command_id": "8e170443-bc58-4018-b0f1-67a71b505014",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/20b9a92b-3c55-4ca4-9425-09fc93b18083/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "12179e85-ac0f-4548-a6f6-dcbd0c31fd18"
}
```

`POST /api/admin/v1/orders/20b9a92b-3c55-4ca4-9425-09fc93b18083/chargebacks` → **201**

```json
{
  "command_id": "7d98ab46-eaad-4d3a-80a2-54b9c7743560",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "baf1e27a-42ee-4a34-bd10-fc31d278eae6",
  "order_id": "20b9a92b-3c55-4ca4-9425-09fc93b18083",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T09:35:59.597567Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/20b9a92b-3c55-4ca4-9425-09fc93b18083/chargebacks` → **201**

```json
{
  "command_id": "7d98ab46-eaad-4d3a-80a2-54b9c7743560",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "baf1e27a-42ee-4a34-bd10-fc31d278eae6",
  "order_id": "20b9a92b-3c55-4ca4-9425-09fc93b18083",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T09:35:59.597567Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/d67f257f-f32a-4f06-907c-95866b6b7820` → **200**

```json
{
  "client": {
    "id": "d67f257f-f32a-4f06-907c-95866b6b7820",
    "phone": "+380738097023",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:35:47.384026Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "20b9a92b-3c55-4ca4-9425-09fc93b18083",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T09:35:49.771911Z",
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

`POST /api/admin/v1/orders/20b9a92b-3c55-4ca4-9425-09fc93b18083/chargebacks/baf1e27a-42ee-4a34-bd10-fc31d278eae6/resolve` → **200**

```json
{
  "command_id": "0c27248b-9e88-498e-8824-3f1876b1cf61",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "baf1e27a-42ee-4a34-bd10-fc31d278eae6",
  "order_id": "20b9a92b-3c55-4ca4-9425-09fc93b18083",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T09:35:59.597567Z",
  "resolved_at": "2026-10-30T09:36:00.553045Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/d67f257f-f32a-4f06-907c-95866b6b7820` → **200**

```json
{
  "client": {
    "id": "d67f257f-f32a-4f06-907c-95866b6b7820",
    "phone": "+380738097023",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:35:47.384026Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "20b9a92b-3c55-4ca4-9425-09fc93b18083",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T09:35:49.771911Z",
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

`GET /api/admin/v1/clients/d67f257f-f32a-4f06-907c-95866b6b7820` → **200**

```json
{
  "client": {
    "id": "d67f257f-f32a-4f06-907c-95866b6b7820",
    "phone": "+380738097023",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:35:47.384026Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "20b9a92b-3c55-4ca4-9425-09fc93b18083",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T09:35:49.771911Z",
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

`POST /api/admin/v1/orders/20b9a92b-3c55-4ca4-9425-09fc93b18083/chargebacks/baf1e27a-42ee-4a34-bd10-fc31d278eae6/resolve` → **409**

```json
{
  "command_id": "d6ccb477-69a7-4097-aecf-ea708b12580c",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/20b9a92b-3c55-4ca4-9425-09fc93b18083/chargebacks/baf1e27a-42ee-4a34-bd10-fc31d278eae6/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3ec1fa37-fda4-41c8-8307-9568fa30b2d7"
}
```

`GET /api/admin/v1/orders/20b9a92b-3c55-4ca4-9425-09fc93b18083/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "baf1e27a-42ee-4a34-bd10-fc31d278eae6",
      "order_id": "20b9a92b-3c55-4ca4-9425-09fc93b18083",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T09:35:59.597567Z",
      "resolved_at": "2026-10-30T09:36:00.553045Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 20b9a92b-3c55-4ca4-9425-09fc93b18083 without phone or card digits; chargeback baf1e27a-42ee-4a34-bd10-fc31d278eae6 recorded and won.

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
  "session_id": "da7760c9-e5d8-47f1-9304-077de0a396c6",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM4NjMsImlhdCI6MTc5MzM1Mjk2MywianRpIjoiNjc3MmZlNmItNDQ5NC00ODIxLWI0OTEtNTYzOWJjOWI4YTg0Iiwic2lkIjoiZGE3NzYwYzktZTVkOC00N2YxLTkzMDQtMDc3ZGUwYTM5NmM2In0.uPpIiwzXaRrkzVSY8suE_ebhUam-ICE5ZCenIV2r6BE",
  "access_expires_at": "2026-10-30T09:51:03.641082508Z",
  "refresh_token": "zddSfQWKZ5e3jZUuAtQDdBF7DsdDgutjrkVnXH_W9gM",
  "refresh_expires_at": "2026-10-30T21:36:03.640543398Z",
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
  "phone": "+48600433824",
  "device_ref": "sandbox-17616"
}
```

```json
{
  "challenge_id": "7097b629-3ad5-4956-bffa-4ee0c1f57123",
  "expires_at": "2026-10-30T09:41:04.512765797Z",
  "resend_available_at": "2026-10-30T09:36:05.512765797Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600433824` → **200**

```json
{
  "phone": "+48600433824",
  "audience": "CLIENT",
  "code": "659104",
  "sent_at": "2026-10-30T09:36:04.51576029Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7097b629-3ad5-4956-bffa-4ee0c1f57123",
  "code": "659104",
  "device_ref": "sandbox-17616"
}
```

```json
{
  "session_id": "38d50363-4ac0-4de4-ba49-dec8f873f275",
  "subject": {
    "type": "CLIENT",
    "id": "2b39cb2b-fc90-4e17-b6d1-8a0f921dbbca"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYjM5Y2IyYi1mYzkwLTRlMTctYjZkMS04YTBmOTIxZGJiY2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzODY0LCJpYXQiOjE3OTMzNTI5NjQsImp0aSI6IjRiYjRhNTk5LWQwMTItNDYxZS04OTBhLWE1NjMzMTA4YWI3OSIsInNpZCI6IjM4ZDUwMzYzLTRhYzAtNGRlNC1iYTQ5LWRlYzhmODczZjI3NSJ9.nL6D8nQ-3hhNS45HnIEB-OqmWgIzFUoefMS_DWqRZMg",
  "access_expires_at": "2026-10-30T09:51:04.82452697Z",
  "refresh_token": "MMRsgsOr4vUywbL-B5GZRNT9alpZGFTM3XSyYf3SJZM",
  "refresh_expires_at": "2026-11-29T09:36:04.82403031Z",
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
  "command_id": "450229b3-d642-45ef-ba5f-7a3c2f3c00a2",
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
  "correlation_id": "d32f1a4b-51a2-47d7-a3fa-f6a7f382456d",
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
  "command_id": "70487d31-ba12-4bb8-8fb6-6d35641cd1b5",
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
  "paused_at": "2026-10-30T09:36:05.939426904Z",
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
  "command_id": "86cc2aa0-c670-4496-98ed-77244f492ac0",
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
  "id": "c81dc6cb-f65b-43b2-b5e1-f6b3b97068b5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:41:06.529598Z",
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
  "command_id": "63928da9-0fd5-437f-bc06-ce056d85deb4",
  "quote_id": "c81dc6cb-f65b-43b2-b5e1-f6b3b97068b5",
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
  "correlation_id": "675dbd49-5cd4-4029-b4a4-b75cd2f8a13b"
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
  "paused_at": "2026-10-30T09:36:05.939427Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "2aa2d494-d1ca-448e-b5fc-300a60f1b290",
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
  "command_id": "27ea8371-0c07-4757-af9d-17a4997fa778",
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
  "command_id": "6ec078ef-a55f-4d3d-bfad-651bb56dbdf5",
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
  "id": "2508b779-5d74-4933-b43d-5e9a777197a9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:41:08.267029Z",
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
  "command_id": "31fdb365-e39f-4f74-afa2-ffc359ec8516",
  "quote_id": "2508b779-5d74-4933-b43d-5e9a777197a9",
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
  "correlation_id": "fdc0071c-35d6-47dc-a6b7-c100994cd49b"
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
  "command_id": "53f1e9d8-a3bf-4e66-a4d1-a4802ff27e3c",
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
  "command_id": "84a81936-2acc-45f3-b39b-265531bdf34c",
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
  "id": "b12848e5-8d4a-4844-9de7-1e312dfe3649",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:41:09.455141Z",
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
  "command_id": "d158900a-dca9-416c-904a-a0417fd21369",
  "quote_id": "b12848e5-8d4a-4844-9de7-1e312dfe3649",
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
  "correlation_id": "97087529-502d-4f6c-9ab2-85db910d471e"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "db6ccf1d-1c21-415c-90c7-f61e2deae1aa",
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
  "correlation_id": "9a3efbfb-38cc-4f23-a472-b81f1a7ba9d1"
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
  "command_id": "fa202325-c124-4c28-aacb-ef6e9c6aa81b",
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
  "phone": "+380678001610",
  "device_ref": "sandbox-27985"
}
```

```json
{
  "challenge_id": "cc2d7aba-2a63-4905-a264-717eaeaefc31",
  "expires_at": "2026-10-30T09:41:10.939435759Z",
  "resend_available_at": "2026-10-30T09:36:11.939435759Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678001610` → **200**

```json
{
  "phone": "+380678001610",
  "audience": "CLIENT",
  "code": "953943",
  "sent_at": "2026-10-30T09:36:10.942066739Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cc2d7aba-2a63-4905-a264-717eaeaefc31",
  "code": "953943",
  "device_ref": "sandbox-27985"
}
```

```json
{
  "session_id": "a6c30e79-5479-445d-abb2-8fcdc76a214c",
  "subject": {
    "type": "CLIENT",
    "id": "0b48ecb2-a542-47b0-8d78-61396db39edd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYjQ4ZWNiMi1hNTQyLTQ3YjAtOGQ3OC02MTM5NmRiMzllZGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzODcxLCJpYXQiOjE3OTMzNTI5NzEsImp0aSI6IjFhMTQ4ZGY5LTVhOGUtNGVmYi05ZjI1LTgyZDFiN2I0NGZhMSIsInNpZCI6ImE2YzMwZTc5LTU0NzktNDQ1ZC1hYmIyLThmY2RjNzZhMjE0YyJ9.7F5un8avgJgS-BygYAgC5QkNL0to2I10jAealVJLJq8",
  "access_expires_at": "2026-10-30T09:51:11.2501899Z",
  "refresh_token": "B8vPrJn3NVVqaEh-03s19l6RBfgjo9XpxBcAu-11j94",
  "refresh_expires_at": "2026-11-29T09:36:11.249627726Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0b48ecb2-a542-47b0-8d78-61396db39edd",
  "session_id": "a6c30e79-5479-445d-abb2-8fcdc76a214c",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "faf9b451-c296-4753-84c7-10232eb739bc",
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
  "id": "6f3d02b8-625c-40d0-8708-dbe06587cf1a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:41:11.845702Z",
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
  "challenge_id": "9c01e34f-c186-4f4d-8fea-76b62b8e6e55",
  "expires_at": "2026-10-30T09:41:14.144369665Z",
  "resend_available_at": "2026-10-30T09:36:15.144369665Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678001610` → **200**

```json
{
  "phone": "+380678001610",
  "audience": "CLIENT",
  "code": "512608",
  "sent_at": "2026-10-30T09:36:14.14703659Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "c466094b-6e2c-4f70-a55e-d0f528f41dd5",
  "challenge_id": "9c01e34f-c186-4f4d-8fea-76b62b8e6e55",
  "otp_code": "512608"
}
```

```json
{
  "client_id": "0b48ecb2-a542-47b0-8d78-61396db39edd",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T09:36:14.466163492Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "9de55a21-0afa-4ab9-a2e8-57b2dae1d739",
  "quote_id": "6f3d02b8-625c-40d0-8708-dbe06587cf1a",
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
  "correlation_id": "c50948fe-2acd-4d5b-b8ea-7e32c9724785"
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
  "session_id": "6fbcea1c-147a-4648-a733-88107b4448b1",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM4NzUsImlhdCI6MTc5MzM1Mjk3NSwianRpIjoiZWFlYWI1NzgtNzNiMC00MGQ4LWE0Y2ItMDdhNzFlY2NmMGU0Iiwic2lkIjoiNmZiY2VhMWMtMTQ3YS00NjQ4LWE3MzMtODgxMDdiNDQ0OGIxIn0.5UCYagbV2yztFuxFzTnrvuD5T46xOHhQhLBJ3WRVo6E",
  "access_expires_at": "2026-10-30T09:51:15.350595708Z",
  "refresh_token": "bDYCRIfCGbcKaS7ghP_oeV6C0mDAXdGmeMDRQEatfI0",
  "refresh_expires_at": "2026-10-30T21:36:15.350040498Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "0b48ecb2-a542-47b0-8d78-61396db39edd",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T09:36:14.466163Z",
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

`POST /api/admin/v1/client-deletions/0b48ecb2-a542-47b0-8d78-61396db39edd/complete` → **200**

```json
{
  "command_id": "85a80bc6-46ff-4cc2-bd22-16dc0bbfd48f",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "0b48ecb2-a542-47b0-8d78-61396db39edd",
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
  "correlation_id": "a4b66fa3-5268-4e6b-9383-dfc5cc4dc57c"
}
```

Done: client 0b48ecb2-a542-47b0-8d78-61396db39edd anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667502443",
  "device_ref": "sandbox-8790"
}
```

```json
{
  "challenge_id": "4275f828-3565-4b26-b7ad-641d792178a1",
  "expires_at": "2026-10-30T09:41:16.493711186Z",
  "resend_available_at": "2026-10-30T09:36:17.493711186Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667502443` → **200**

```json
{
  "phone": "+380667502443",
  "audience": "CLIENT",
  "code": "247018",
  "sent_at": "2026-10-30T09:36:16.496887396Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4275f828-3565-4b26-b7ad-641d792178a1",
  "code": "247018",
  "device_ref": "sandbox-8790"
}
```

```json
{
  "session_id": "8cac7f2e-e580-46db-8d47-cb576e1c9299",
  "subject": {
    "type": "CLIENT",
    "id": "0c073373-631a-4351-abfe-aa747239c071"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYzA3MzM3My02MzFhLTQzNTEtYWJmZS1hYTc0NzIzOWMwNzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzODc2LCJpYXQiOjE3OTMzNTI5NzYsImp0aSI6IjA0MWIwYTU4LTQ3ZWMtNGFmYy1hOGQ2LWIyY2U5Y2NiYjdmNyIsInNpZCI6IjhjYWM3ZjJlLWU1ODAtNDZkYi04ZDQ3LWNiNTc2ZTFjOTI5OSJ9.RhDfwZSEj-FSb3nr7hvkVrz3zUnCdQjQjIl8peCeOew",
  "access_expires_at": "2026-10-30T09:51:16.818986746Z",
  "refresh_token": "glLejHF1iL2vd1rF3SP6hzQLuYpwBG64T2gh3NHwK8g",
  "refresh_expires_at": "2026-11-29T09:36:16.818403633Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0c073373-631a-4351-abfe-aa747239c071",
  "session_id": "8cac7f2e-e580-46db-8d47-cb576e1c9299",
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
  "session_id": "9a0d63a6-f5b8-48bd-9577-a07c7b59c899",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM4NzcsImlhdCI6MTc5MzM1Mjk3NywianRpIjoiZDM2NGRmZjItNWJhNy00ZjEwLWEzZGEtYTNmMjNlMTcxYzkwIiwic2lkIjoiOWEwZDYzYTYtZjViOC00OGJkLTk1NzctYTA3YzdiNTljODk5In0.oUSsDx5Yh07zNwz5bSr9lJugai4A2T9L0liPv2cgYa8",
  "access_expires_at": "2026-10-30T09:51:17.663341792Z",
  "refresh_token": "Uz0y-_prNC9CBhNFD7fD0kht_YqH8NQ23_Fue8ye2As",
  "refresh_expires_at": "2026-10-30T21:36:17.662725357Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=7502443&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "0c073373-631a-4351-abfe-aa747239c071",
      "phone": "+380667502443",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T09:36:16.816697Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/0c073373-631a-4351-abfe-aa747239c071` → **200**

```json
{
  "client": {
    "id": "0c073373-631a-4351-abfe-aa747239c071",
    "phone": "+380667502443",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:36:16.816697Z",
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

`POST /api/admin/v1/clients/0c073373-631a-4351-abfe-aa747239c071/block` → **400**

```json
{
  "command_id": "152551a0-7a2e-43da-af5b-4e679be8f665",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/0c073373-631a-4351-abfe-aa747239c071/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "845c0d31-c4fd-4adb-8ef4-36a2317fb8ce",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/0c073373-631a-4351-abfe-aa747239c071/block` → **200**

```json
{
  "command_id": "26f1f4a8-b386-4a11-b976-c36de0029a31",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "0c073373-631a-4351-abfe-aa747239c071",
  "phone": "+380667502443",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T09:36:16.816697Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T09:36:18.858558Z",
    "by": "f621c4f1-9b6e-41a5-939b-44be51548e85"
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
  "correlation_id": "892fd00d-e337-483a-b3ca-3453d96d5d1d"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667502443",
  "device_ref": "sandbox-30877"
}
```

```json
{
  "challenge_id": "6801153d-5ae6-450b-98cd-4b228a44a840",
  "expires_at": "2026-10-30T09:41:21.427372052Z",
  "resend_available_at": "2026-10-30T09:36:22.427372052Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667502443` → **200**

```json
{
  "phone": "+380667502443",
  "audience": "CLIENT",
  "code": "893243",
  "sent_at": "2026-10-30T09:36:21.43007534Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "6801153d-5ae6-450b-98cd-4b228a44a840",
  "code": "893243",
  "device_ref": "sandbox-30877"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "3efa189b-e29d-4689-92d0-f836202fecb1"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/0c073373-631a-4351-abfe-aa747239c071` → **200**

```json
{
  "client": {
    "id": "0c073373-631a-4351-abfe-aa747239c071",
    "phone": "+380667502443",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T09:36:16.816697Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T09:36:18.858558Z",
      "by": "f621c4f1-9b6e-41a5-939b-44be51548e85"
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

`POST /api/admin/v1/clients/0c073373-631a-4351-abfe-aa747239c071/unblock` → **200**

```json
{
  "command_id": "5f9e8d2e-a8d5-48a4-8a94-6ba0a8bd0fd0",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "0c073373-631a-4351-abfe-aa747239c071",
  "phone": "+380667502443",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T09:36:16.816697Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667502443",
  "device_ref": "sandbox-2765"
}
```

```json
{
  "challenge_id": "507fb68a-5da1-4318-b137-787758da46f5",
  "expires_at": "2026-10-30T09:41:24.643920647Z",
  "resend_available_at": "2026-10-30T09:36:25.643920647Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667502443` → **200**

```json
{
  "phone": "+380667502443",
  "audience": "CLIENT",
  "code": "529574",
  "sent_at": "2026-10-30T09:36:24.646692292Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "507fb68a-5da1-4318-b137-787758da46f5",
  "code": "529574",
  "device_ref": "sandbox-2765"
}
```

```json
{
  "session_id": "66211009-666b-46a0-b2f9-7320931c03ef",
  "subject": {
    "type": "CLIENT",
    "id": "0c073373-631a-4351-abfe-aa747239c071"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYzA3MzM3My02MzFhLTQzNTEtYWJmZS1hYTc0NzIzOWMwNzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzODg0LCJpYXQiOjE3OTMzNTI5ODQsImp0aSI6ImRiODdhYjczLTViOTMtNDg1Mi05ZjIyLTdlYmFhNzM2ZmY0ZiIsInNpZCI6IjY2MjExMDA5LTY2NmItNDZhMC1iMmY5LTczMjA5MzFjMDNlZiJ9.HSe-bFFz0ZWM0EgIGPowx-XvQSPhJrk8fXTrKuFuC44",
  "access_expires_at": "2026-10-30T09:51:24.952967556Z",
  "refresh_token": "ZMXRUlhpmNMGHvBqZd6VfjHYODI0bdybYb-r4WjdLg0",
  "refresh_expires_at": "2026-11-29T09:36:24.952407436Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0c073373-631a-4351-abfe-aa747239c071",
  "session_id": "66211009-666b-46a0-b2f9-7320931c03ef",
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
  "phone": "+380668601596",
  "device_ref": "sandbox-4226"
}
```

```json
{
  "challenge_id": "4126e9da-8126-4926-901a-331e67fb6568",
  "expires_at": "2026-10-30T09:41:25.509443423Z",
  "resend_available_at": "2026-10-30T09:36:26.509443423Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668601596` → **200**

```json
{
  "phone": "+380668601596",
  "audience": "CLIENT",
  "code": "851523",
  "sent_at": "2026-10-30T09:36:25.513892522Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4126e9da-8126-4926-901a-331e67fb6568",
  "code": "851523",
  "device_ref": "sandbox-4226"
}
```

```json
{
  "session_id": "cf52fbdd-c7e7-4117-871b-f7db790c1f55",
  "subject": {
    "type": "CLIENT",
    "id": "5bdc4426-90b3-48fa-be7a-6c30936231a2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YmRjNDQyNi05MGIzLTQ4ZmEtYmU3YS02YzMwOTM2MjMxYTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzODg1LCJpYXQiOjE3OTMzNTI5ODUsImp0aSI6IjQ4ZGU2MzU3LTg3NTAtNGI4MC1hYmI1LTg3MTcwNDVmNjA1MiIsInNpZCI6ImNmNTJmYmRkLWM3ZTctNDExNy04NzFiLWY3ZGI3OTBjMWY1NSJ9.uFXXIVAbEGNI62jjs5hFVjDr6qdyLfIpZlO0YJ5Ou5E",
  "access_expires_at": "2026-10-30T09:51:25.824184034Z",
  "refresh_token": "mCvPTffESOYxuv7Q4CeTGuHpyaDJjRF-NT09wcqlxhU",
  "refresh_expires_at": "2026-11-29T09:36:25.8236374Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b9a925c8-34cb-4d44-91a3-532f73238b70",
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
  "id": "0cecc08c-3325-4e05-ac32-01e6c78ccc54",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:41:26.100310Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 334b7e5a-b79b-4b7b-bdef-e524a93350a4) → **201**

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
  "session_id": "4308860c-7330-4410-ab1d-80b7348549fb",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM4ODYsImlhdCI6MTc5MzM1Mjk4NiwianRpIjoiODM5MjYzMzAtN2M2Yi00NGE3LWFmMDEtZTM5MmE2MWVlZjE4Iiwic2lkIjoiNDMwODg2MGMtNzMzMC00NDEwLWFiMWQtODBiNzM0ODU0OWZiIn0.TLlIIIWeUfFhXP7A64Mb8eSYHEWC-n39xh69jsk2Wa4",
  "access_expires_at": "2026-10-30T09:51:26.71205078Z",
  "refresh_token": "e43hWaFbgmOIfJPPHUduZqsaPLucpFw9CkSWrtF9JAw",
  "refresh_expires_at": "2026-10-30T21:36:26.711203643Z",
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
  "session_id": "4596748a-a92d-47cc-9ba6-3a03ddb83c96",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM4ODcsImlhdCI6MTc5MzM1Mjk4NywianRpIjoiYjQxYWZlYTMtYjc0Ny00ZGQ2LWFhZDctNTg4NjYzMGQyNjI4Iiwic2lkIjoiNDU5Njc0OGEtYTkyZC00N2NjLTliYTYtM2EwM2RkYjgzYzk2In0.s5OOWVMEhEBYqjsRDVSjZvFFXsFhgzDKwNQxzIABh88",
  "access_expires_at": "2026-10-30T09:51:27.29526588Z",
  "refresh_token": "1HMHOmQLP3hWcQeaI4SW9FcUxLWzQ5RjtqQ1fLeZt0s",
  "refresh_expires_at": "2026-10-30T21:36:27.294714196Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/8985985c-86bd-4c96-aad9-57af2c340130/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:36:26.384582Z",
      "actor": {
        "type": "CLIENT",
        "id": "5bdc4426-90b3-48fa-be7a-6c30936231a2",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "8985985c-86bd-4c96-aad9-57af2c340130",
        "quote_id": "0cecc08c-3325-4e05-ac32-01e6c78ccc54",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "334b7e5a-b79b-4b7b-bdef-e524a93350a4"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:36:26.387115Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8985985c-86bd-4c96-aad9-57af2c340130",
        "attempt_id": "7d0ca120-723e-44c2-82a3-7fe70ac7d88a",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "334b7e5a-b79b-4b7b-bdef-e524a93350a4"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T09:36:26.394672Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8985985c-86bd-4c96-aad9-57af2c340130",
        "attempt_id": "7d0ca120-723e-44c2-82a3-7fe70ac7d88a"
      },
      "correlation_id": "334b7e5a-b79b-4b7b-bdef-e524a93350a4"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "7d0ca120-723e-44c2-82a3-7fe70ac7d88a",
        "generation": 1,
        "started_at": "2026-10-30T09:36:26.386047Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T09:36:26.394672Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T09:36:26.387943Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/334b7e5a-b79b-4b7b-bdef-e524a93350a4` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "8985985c-86bd-4c96-aad9-57af2c340130:0",
      "order_id": "8985985c-86bd-4c96-aad9-57af2c340130",
      "at": "2026-10-30T09:36:26.384582Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "8985985c-86bd-4c96-aad9-57af2c340130:1",
      "order_id": "8985985c-86bd-4c96-aad9-57af2c340130",
      "at": "2026-10-30T09:36:26.387115Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "8985985c-86bd-4c96-aad9-57af2c340130:2",
      "order_id": "8985985c-86bd-4c96-aad9-57af2c340130",
      "at": "2026-10-30T09:36:26.394672Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/766e21d3-5562-479a-85eb-dab2627ef5ac` → **200**

```json
{
  "found": []
}
```

Done: request 334b7e5a-b79b-4b7b-bdef-e524a93350a4 — order 8985985c-86bd-4c96-aad9-57af2c340130 found by its id.

`GET /api/rider/v1/orders/8985985c-86bd-4c96-aad9-57af2c340130` → **200**

```json
{
  "id": "8985985c-86bd-4c96-aad9-57af2c340130",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5bdc4426-90b3-48fa-be7a-6c30936231a2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:36:26.384006Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/8985985c-86bd-4c96-aad9-57af2c340130/cancel` → **200**

```json
{
  "command_id": "5e68d104-56a0-428e-9a15-5b99ece39fb4",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "8985985c-86bd-4c96-aad9-57af2c340130",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5bdc4426-90b3-48fa-be7a-6c30936231a2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:36:26.384006Z",
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
  "phone": "+380637148392",
  "device_ref": "sandbox-25950"
}
```

```json
{
  "challenge_id": "cb5780dc-874c-4212-a3af-353a23a5de9b",
  "expires_at": "2026-10-30T09:41:29.042432749Z",
  "resend_available_at": "2026-10-30T09:36:30.042432749Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637148392` → **200**

```json
{
  "phone": "+380637148392",
  "audience": "CLIENT",
  "code": "755852",
  "sent_at": "2026-10-30T09:36:29.045250005Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cb5780dc-874c-4212-a3af-353a23a5de9b",
  "code": "755852",
  "device_ref": "sandbox-25950"
}
```

```json
{
  "session_id": "19eec95a-2ea1-4798-bba1-e9366c32578e",
  "subject": {
    "type": "CLIENT",
    "id": "4d16fa9d-3ee7-4106-829b-ae062080610f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDE2ZmE5ZC0zZWU3LTQxMDYtODI5Yi1hZTA2MjA4MDYxMGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzODg5LCJpYXQiOjE3OTMzNTI5ODksImp0aSI6ImMyY2NkNjRmLWExZDUtNDJkZS05NjkxLWM0N2Q3MDZkYmI2ZCIsInNpZCI6IjE5ZWVjOTVhLTJlYTEtNDc5OC1iYmExLWU5MzY2YzMyNTc4ZSJ9.jZLTVOnsO_wAbG5Mb5wzfuu71CkQB0k968I88ayStow",
  "access_expires_at": "2026-10-30T09:51:29.34305019Z",
  "refresh_token": "HV149NGkNsKVQxMTs6aAV4w2Z9WoXWCiR_Q0Vmonvlw",
  "refresh_expires_at": "2026-11-29T09:36:29.342470654Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "04e14613-e051-41de-a6a9-5401619e4c85",
  "expires_at": "2026-10-30T09:41:31.625754049Z",
  "resend_available_at": "2026-10-30T09:36:32.625754049Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637148392` → **200**

```json
{
  "phone": "+380637148392",
  "audience": "CLIENT",
  "code": "401534",
  "sent_at": "2026-10-30T09:36:31.629211494Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "a74eb9ff-af99-486a-964c-d971554d057b",
  "challenge_id": "04e14613-e051-41de-a6a9-5401619e4c85",
  "otp_code": "401534"
}
```

```json
{
  "id": "9eaee8db-4609-4f3e-a825-1c024be94345",
  "state": "PENDING",
  "created_at": "2026-10-30T09:36:31.93398Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/9eaee8db-4609-4f3e-a825-1c024be94345` → **200**

```json
{
  "id": "9eaee8db-4609-4f3e-a825-1c024be94345",
  "state": "PENDING",
  "created_at": "2026-10-30T09:36:31.93398Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9eaee8db-4609-4f3e-a825-1c024be94345` → **200**

```json
{
  "id": "9eaee8db-4609-4f3e-a825-1c024be94345",
  "state": "PENDING",
  "created_at": "2026-10-30T09:36:31.93398Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9eaee8db-4609-4f3e-a825-1c024be94345` → **200**

```json
{
  "id": "9eaee8db-4609-4f3e-a825-1c024be94345",
  "state": "PENDING",
  "created_at": "2026-10-30T09:36:31.93398Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9eaee8db-4609-4f3e-a825-1c024be94345` → **200**

```json
{
  "id": "9eaee8db-4609-4f3e-a825-1c024be94345",
  "state": "PENDING",
  "created_at": "2026-10-30T09:36:31.93398Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9eaee8db-4609-4f3e-a825-1c024be94345` → **200**

```json
{
  "id": "9eaee8db-4609-4f3e-a825-1c024be94345",
  "state": "PENDING",
  "created_at": "2026-10-30T09:36:31.93398Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9eaee8db-4609-4f3e-a825-1c024be94345` → **200**

```json
{
  "id": "9eaee8db-4609-4f3e-a825-1c024be94345",
  "state": "PENDING",
  "created_at": "2026-10-30T09:36:31.93398Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9eaee8db-4609-4f3e-a825-1c024be94345` → **200**

```json
{
  "id": "9eaee8db-4609-4f3e-a825-1c024be94345",
  "state": "READY",
  "created_at": "2026-10-30T09:36:31.93398Z",
  "ready_at": "2026-10-30T09:36:39.787768Z",
  "expires_at": "2026-11-06T09:36:39.787768Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/9eaee8db-4609-4f3e-a825-1c024be94345/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631969225",
  "device_ref": "sandbox-11940"
}
```

```json
{
  "challenge_id": "5da4292f-0cb2-4595-a335-b5e973e46c0b",
  "expires_at": "2026-10-30T09:41:40.184720501Z",
  "resend_available_at": "2026-10-30T09:36:41.184720501Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631969225` → **200**

```json
{
  "phone": "+380631969225",
  "audience": "CLIENT",
  "code": "982591",
  "sent_at": "2026-10-30T09:36:40.187602501Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5da4292f-0cb2-4595-a335-b5e973e46c0b",
  "code": "982591",
  "device_ref": "sandbox-11940"
}
```

```json
{
  "session_id": "4aa94853-1efb-4fa6-9abb-5c5ee13096d6",
  "subject": {
    "type": "CLIENT",
    "id": "3c9b771d-b3b3-4177-ad1f-fd87567521db"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzliNzcxZC1iM2IzLTQxNzctYWQxZi1mZDg3NTY3NTIxZGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzOTAwLCJpYXQiOjE3OTMzNTMwMDAsImp0aSI6IjQ3ODJhMjA2LTUyZjAtNGY4Ni04MDhmLTdhNjAyN2M0YmIzNiIsInNpZCI6IjRhYTk0ODUzLTFlZmItNGZhNi05YWJiLTVjNWVlMTMwOTZkNiJ9.QJI1pGsRK2PZ66CzDwHDOrY4cbyIBJtgiAgxIwacXKI",
  "access_expires_at": "2026-10-30T09:51:40.498209279Z",
  "refresh_token": "4nWbrz7rg92BNPFcUSj81btMxbA5GiFfw9bQz_Qp7Aw",
  "refresh_expires_at": "2026-11-29T09:36:40.497582025Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/9eaee8db-4609-4f3e-a825-1c024be94345/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/9eaee8db-4609-4f3e-a825-1c024be94345/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5de4890d-e5b3-4313-a645-340f18ccbc1f"
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
  "session_id": "e7c273a1-89fa-4e92-a86f-b3e7a37bd36f",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM5MDEsImlhdCI6MTc5MzM1MzAwMSwianRpIjoiNzI5ZTIwNDAtMDQ3ZS00ZjU0LWEyYmEtNTA2Yzk2OGI2NTg3Iiwic2lkIjoiZTdjMjczYTEtODlmYS00ZTkyLWE4NmYtYjNlN2EzN2JkMzZmIn0.1Va_MH0IiuvZszz_BJdQnIehgY7G73ErfQkMtIXsKM4",
  "access_expires_at": "2026-10-30T09:51:41.352961921Z",
  "refresh_token": "wkZdNFM9qZvEkm6B8pKyz9FVVsrAQfGlL_gQlezQoMs",
  "refresh_expires_at": "2026-10-30T21:36:41.352376835Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "4d16fa9d-3ee7-4106-829b-ae062080610f",
  "session_id": "19eec95a-2ea1-4798-bba1-e9366c32578e",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/4d16fa9d-3ee7-4106-829b-ae062080610f/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "9eaee8db-4609-4f3e-a825-1c024be94345",
      "state": "READY",
      "created_at": "2026-10-30T09:36:31.93398Z",
      "ready_at": "2026-10-30T09:36:39.787768Z",
      "expires_at": "2026-11-06T09:36:39.787768Z",
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
  "device_ref": "sandbox-3477"
}
```

```json
{
  "challenge_id": "5649409d-ba2e-4fed-bfb7-b239ffe2e416",
  "expires_at": "2026-10-30T09:41:42.270113483Z",
  "resend_available_at": "2026-10-30T09:36:43.270113483Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "443680",
  "sent_at": "2026-10-30T09:36:42.273149894Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5649409d-ba2e-4fed-bfb7-b239ffe2e416",
  "code": "443680",
  "device_ref": "sandbox-3477"
}
```

```json
{
  "session_id": "4ed3e9d8-62ff-4b01-83fd-eba7db215398",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzkwMiwiaWF0IjoxNzkzMzUzMDAyLCJqdGkiOiIwZTkyYjU1OS0xMWJkLTQxYjctYTc5ZS0xMmJlOWMxMGI1ZTQiLCJzaWQiOiI0ZWQzZTlkOC02MmZmLTRiMDEtODNmZC1lYmE3ZGIyMTUzOTgifQ.0YCCVnn8JXr_YAtwIPuT40USY3NOP5HPmtElr29GPa4",
  "access_expires_at": "2026-10-30T09:51:42.610750411Z",
  "refresh_token": "tJQ6W8ht8GM66Y_GaBXRoSGl_jorulvYz2zdk73j_j8",
  "refresh_expires_at": "2026-11-29T09:36:42.610160194Z",
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
  "device_ref": "sandbox-2567"
}
```

```json
{
  "challenge_id": "ad25542c-129c-4fa2-b572-0b39e166cbf5",
  "expires_at": "2026-10-30T09:41:43.163368205Z",
  "resend_available_at": "2026-10-30T09:36:44.163368205Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "498139",
  "sent_at": "2026-10-30T09:36:43.167003466Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ad25542c-129c-4fa2-b572-0b39e166cbf5",
  "code": "498139",
  "device_ref": "sandbox-2567"
}
```

```json
{
  "session_id": "0d0223fd-cdd8-4241-b7d4-deebca1620ed",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzkwMywiaWF0IjoxNzkzMzUzMDAzLCJqdGkiOiIyMDJhNTdlYS05NGU0LTRiMWEtYmEwYy02MDNlZWJhZDNiZDUiLCJzaWQiOiIwZDAyMjNmZC1jZGQ4LTQyNDEtYjdkNC1kZWViY2ExNjIwZWQifQ.qvOmT-9iLJ6Tqs7nFKtH1QNkrOZOvsCMrXO9L2uWY6I",
  "access_expires_at": "2026-10-30T09:51:43.469492756Z",
  "refresh_token": "OgrJr2xmSWOSiAPQbgwTkNgr6o9hFlS9aOxyu1ikDBo",
  "refresh_expires_at": "2026-11-29T09:36:43.468839441Z",
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
  "command_id": "df656cd0-afe4-4c8b-8ad0-b17f0c220b2a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:36:44Z",
    "sequence": 1793353004117
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d60ea323-1633-4375-8557-444c5917a374",
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
  "last_heartbeat_at": "2026-10-30T09:36:44.030199Z",
  "last_location_at": "2026-10-30T09:36:44.030199Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-8525"
}
```

```json
{
  "challenge_id": "309bea1b-94b6-4566-a730-449bc169470f",
  "expires_at": "2026-10-30T09:41:44.311172224Z",
  "resend_available_at": "2026-10-30T09:36:45.311172224Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "611446",
  "sent_at": "2026-10-30T09:36:44.314981962Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "309bea1b-94b6-4566-a730-449bc169470f",
  "code": "611446",
  "device_ref": "sandbox-8525"
}
```

```json
{
  "session_id": "9fc7234e-fac6-40a7-945c-42c7c5456025",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzkwNCwiaWF0IjoxNzkzMzUzMDA0LCJqdGkiOiIxMzUzYzNlMy0zOGRjLTQyMmItODc3OC1kZmZlM2U4NWU0MjYiLCJzaWQiOiI5ZmM3MjM0ZS1mYWM2LTQwYTctOTQ1Yy00MmM3YzU0NTYwMjUifQ.EzfnnSRVWt0tkszxTYxZzS-rAl6OLI2lcewsJQcw6jA",
  "access_expires_at": "2026-10-30T09:51:44.614909413Z",
  "refresh_token": "6kiyMQE8hEVuwHUV_MwxfG96gndy07SyAfIlItF8wOg",
  "refresh_expires_at": "2026-11-29T09:36:44.614340386Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ca672186-f1ec-49f6-a915-2f5252407d26",
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
  "last_heartbeat_at": "2026-10-30T09:35:06.908051Z",
  "last_location_at": "2026-10-30T09:35:06.908051Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/ca672186-f1ec-49f6-a915-2f5252407d26/handover` → **200**

```json
{
  "command_id": "0716f2bd-1d0d-43f8-bcec-f596859655fa",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ca672186-f1ec-49f6-a915-2f5252407d26",
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
  "last_heartbeat_at": "2026-10-30T09:35:06.908051Z",
  "last_location_at": "2026-10-30T09:35:06.908051Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/ca672186-f1ec-49f6-a915-2f5252407d26/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:36:45Z",
    "sequence": 1793353005449
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ca672186-f1ec-49f6-a915-2f5252407d26",
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
  "last_heartbeat_at": "2026-10-30T09:36:45.46811Z",
  "last_location_at": "2026-10-30T09:36:45.46811Z",
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
  "session_id": "d45c371a-81b3-4821-a61a-3910b37bb7fa",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM5MDYsImlhdCI6MTc5MzM1MzAwNiwianRpIjoiYWMwNGJhODMtMTVkNi00ZTNhLTg4Y2UtNTJiMmYyOGUyYTQyIiwic2lkIjoiZDQ1YzM3MWEtODFiMy00ODIxLWE2MWEtMzkxMGIzN2JiN2ZhIn0.lKK84jrGVlyz04S5wfOXeybFSK51TYte6AMQlyLqh-w",
  "access_expires_at": "2026-10-30T09:51:46.025956223Z",
  "refresh_token": "1fiDH74ohMVNk7gi2Fx_qpiP6fClkvHhpmXam2TSL1Q",
  "refresh_expires_at": "2026-10-30T21:36:46.025377368Z",
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
  "session_id": "063a079e-54da-48b7-8277-57dd25296328",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM5MDYsImlhdCI6MTc5MzM1MzAwNiwianRpIjoiODlkNDM3NzQtMjM1ZS00YmYzLWI1MmYtNGM1MzgxNTdiOTQ3Iiwic2lkIjoiMDYzYTA3OWUtNTRkYS00OGI3LTgyNzctNTdkZDI1Mjk2MzI4In0.YSM0ZAcc5qgylfAWrAxMMjO92K5U6ZOTlC5NrJ8EnPI",
  "access_expires_at": "2026-10-30T09:51:46.597755418Z",
  "refresh_token": "Dr3t2UyJKtO1FACNT5BBtKCJRz6vucYUtXUi5KV8E3M",
  "refresh_expires_at": "2026-10-30T21:36:46.597171464Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380687258704",
  "device_ref": "sandbox-24313"
}
```

```json
{
  "challenge_id": "79e8f0ae-7c8f-4f3c-a148-9b75123d84e0",
  "expires_at": "2026-10-30T09:41:46.871949422Z",
  "resend_available_at": "2026-10-30T09:36:47.871949422Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380687258704` → **200**

```json
{
  "phone": "+380687258704",
  "audience": "CLIENT",
  "code": "901893",
  "sent_at": "2026-10-30T09:36:46.874724151Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "79e8f0ae-7c8f-4f3c-a148-9b75123d84e0",
  "code": "901893",
  "device_ref": "sandbox-24313"
}
```

```json
{
  "session_id": "94df5d1f-f391-41d7-b83c-0f91894405fa",
  "subject": {
    "type": "CLIENT",
    "id": "c95a13a4-9e1f-4155-926e-9db7c4b32ff3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOTVhMTNhNC05ZTFmLTQxNTUtOTI2ZS05ZGI3YzRiMzJmZjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzOTA3LCJpYXQiOjE3OTMzNTMwMDcsImp0aSI6IjRjNjU4YjUwLWQ3OGQtNDFmOS1iOGQ1LWU3NzBkMmFmNzkxMCIsInNpZCI6Ijk0ZGY1ZDFmLWYzOTEtNDFkNy1iODNjLTBmOTE4OTQ0MDVmYSJ9.B8JR1b7hWHpXnGuW9ur9RCO60PTbIhzeOUnTp173Zec",
  "access_expires_at": "2026-10-30T09:51:47.173746808Z",
  "refresh_token": "OLtgc5BKmLz9EhDiEo1vqi842WXmHfY0XNQzMUFJHUQ",
  "refresh_expires_at": "2026-11-29T09:36:47.173228738Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d8ea2814-126c-4962-9f50-ab029cd7a655",
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
  "id": "83d9fc3e-a3f7-40f9-b4ba-22cb5a3f2f9e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:41:47.474106Z",
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
  "command_id": "83ca69b4-a984-492b-bafc-5dcb57af235b",
  "quote_id": "83d9fc3e-a3f7-40f9-b4ba-22cb5a3f2f9e",
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
  "id": "4f0adf7f-2bac-41f1-ba2f-78875b829515",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c95a13a4-9e1f-4155-926e-9db7c4b32ff3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:36:47.761646Z",
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
    "id": "1dbfc077-01c2-4cc7-85b6-1e840aa1c8d6",
    "order_id": "4f0adf7f-2bac-41f1-ba2f-78875b829515",
    "expires_at": "2026-10-30T09:37:02.764829Z",
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

`POST /api/driver/v1/offers/1dbfc077-01c2-4cc7-85b6-1e840aa1c8d6/reject` → **204**

```json
{
  "command_id": "fbf12747-5a7f-448e-a025-47a4ad83a679"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "069f4536-c748-4cfa-928e-1a4628274c6b",
    "order_id": "4f0adf7f-2bac-41f1-ba2f-78875b829515",
    "expires_at": "2026-10-30T09:37:03.351206Z",
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

`POST /api/driver/v1/offers/069f4536-c748-4cfa-928e-1a4628274c6b/accept` → **200**

```json
{
  "command_id": "a0b477f6-759e-4f79-8360-b6dbfaade8fe"
}
```

```json
{
  "id": "6d95d7be-8866-4453-94e2-ae8e27317e36",
  "order_id": "4f0adf7f-2bac-41f1-ba2f-78875b829515",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "51a95fc8-a010-4112-b2d6-294c953e0835",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/4f0adf7f-2bac-41f1-ba2f-78875b829515/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:36:47.762111Z",
      "actor": {
        "type": "CLIENT",
        "id": "c95a13a4-9e1f-4155-926e-9db7c4b32ff3",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4f0adf7f-2bac-41f1-ba2f-78875b829515",
        "quote_id": "83d9fc3e-a3f7-40f9-b4ba-22cb5a3f2f9e",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "5b7ded42-8321-40e0-8c12-a7cd33a6b9df"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:36:47.764053Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4f0adf7f-2bac-41f1-ba2f-78875b829515",
        "attempt_id": "ce909f28-13b5-40b9-8aef-f31028755381",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "5b7ded42-8321-40e0-8c12-a7cd33a6b9df"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T09:36:47.767669Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1dbfc077-01c2-4cc7-85b6-1e840aa1c8d6",
        "order_id": "4f0adf7f-2bac-41f1-ba2f-78875b829515",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "5b7ded42-8321-40e0-8c12-a7cd33a6b9df"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T09:36:48.35024Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1dbfc077-01c2-4cc7-85b6-1e840aa1c8d6",
        "order_id": "4f0adf7f-2bac-41f1-ba2f-78875b829515"
      },
      "correlation_id": "c5a71746-88b5-4c11-b5d6-10f29115c8c3"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 4f0adf7f-2bac-41f1-ba2f-78875b829515 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/4f0adf7f-2bac-41f1-ba2f-78875b829515` → **200**

```json
{
  "id": "4f0adf7f-2bac-41f1-ba2f-78875b829515",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "c95a13a4-9e1f-4155-926e-9db7c4b32ff3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "6d95d7be-8866-4453-94e2-ae8e27317e36",
    "order_id": "4f0adf7f-2bac-41f1-ba2f-78875b829515",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "51a95fc8-a010-4112-b2d6-294c953e0835",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T09:36:47.761646Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4f0adf7f-2bac-41f1-ba2f-78875b829515/cancel` → **200**

```json
{
  "command_id": "dfedaf08-0b5f-48f4-95a9-8baa458ad608",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "4f0adf7f-2bac-41f1-ba2f-78875b829515",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "c95a13a4-9e1f-4155-926e-9db7c4b32ff3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "6d95d7be-8866-4453-94e2-ae8e27317e36",
    "order_id": "4f0adf7f-2bac-41f1-ba2f-78875b829515",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "51a95fc8-a010-4112-b2d6-294c953e0835",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T09:36:47.761646Z",
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
  "session_id": "d60ea323-1633-4375-8557-444c5917a374",
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
  "last_heartbeat_at": "2026-10-30T09:36:44.030199Z",
  "last_location_at": "2026-10-30T09:36:44.030199Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d60ea323-1633-4375-8557-444c5917a374/close` → **200**

```json
{
  "command_id": "922adc74-e2b8-4dd9-9d66-47c779101524",
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
  "session_id": "ca672186-f1ec-49f6-a915-2f5252407d26",
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
  "last_heartbeat_at": "2026-10-30T09:36:45.46811Z",
  "last_location_at": "2026-10-30T09:36:45.46811Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ca672186-f1ec-49f6-a915-2f5252407d26/close` → **200**

```json
{
  "command_id": "412b6e3c-499b-45ac-b8de-29f9028ff35f",
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
  "session_id": "730ec984-68fe-4a26-bd8f-8c752eac7730",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM5MTEsImlhdCI6MTc5MzM1MzAxMSwianRpIjoiOWFjMGQyNjMtOTE4MS00NjFjLThjZWQtMTFjNjBiOTY1ZmM5Iiwic2lkIjoiNzMwZWM5ODQtNjhmZS00YTI2LWJkOGYtOGM3NTJlYWM3NzMwIn0.6vMogOu5ae8-ogOXzmnB3ZsCRf5fxbcdI0UY4d2QB10",
  "access_expires_at": "2026-10-30T09:51:51.347944637Z",
  "refresh_token": "q7j6B14ui9rm38jfXuq-A5XtuQU1oPET8J4rnXSnW60",
  "refresh_expires_at": "2026-10-30T21:36:51.347218864Z",
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
  "command_id": "fa437663-2334-4986-b85e-c5b4b88ef1ca",
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
  "changed_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T09:36:51.933659Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "733e5bf1-1c36-4745-8e18-60e327155122",
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
  "correlation_id": "8c473e6a-1735-47d3-a6f3-d0fef01f75da"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "c0e68359-32e2-4993-97e4-0140507ca2cf",
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
  "correlation_id": "550fda1b-b533-4772-9d08-8694d5678581"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639512791",
  "device_ref": "sandbox-21864"
}
```

```json
{
  "challenge_id": "ccc1552e-7426-41be-8eda-d7e4130b4836",
  "expires_at": "2026-10-30T09:41:52.810032163Z",
  "resend_available_at": "2026-10-30T09:36:53.810032163Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639512791` → **200**

```json
{
  "phone": "+380639512791",
  "audience": "CLIENT",
  "code": "389600",
  "sent_at": "2026-10-30T09:36:52.813010407Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ccc1552e-7426-41be-8eda-d7e4130b4836",
  "code": "389600",
  "device_ref": "sandbox-21864"
}
```

```json
{
  "session_id": "9bcdd56f-2270-4e8f-8845-d2b097743be9",
  "subject": {
    "type": "CLIENT",
    "id": "5590bb88-d64e-419b-9917-046d603d0a6a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NTkwYmI4OC1kNjRlLTQxOWItOTkxNy0wNDZkNjAzZDBhNmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzOTEzLCJpYXQiOjE3OTMzNTMwMTMsImp0aSI6IjdjZjAzNjJhLWYyMzktNDQ3Yy04MjNiLWQyZTlhM2IyOGE2ZiIsInNpZCI6IjliY2RkNTZmLTIyNzAtNGU4Zi04ODQ1LWQyYjA5Nzc0M2JlOSJ9.sn7FqBoGdyhn7fGhl9CuBOog_2jmdoiofI2dBxdj11A",
  "access_expires_at": "2026-10-30T09:51:53.117700859Z",
  "refresh_token": "Cx_bxjRHFtOfNHVrfUWU3yKagiFbHrR2EPEBdG_hwiY",
  "refresh_expires_at": "2026-11-29T09:36:53.11716418Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e8249cf6-73bb-4d30-9889-2584ff3810c0",
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
  "id": "4fca269f-5ac6-4d34-9e80-55a239771b69",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:41:53.410236Z",
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
  "command_id": "d789b342-1827-4ce2-a95a-c2a18000edf9",
  "quote_id": "4fca269f-5ac6-4d34-9e80-55a239771b69",
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
  "correlation_id": "789d8f9b-80b5-4849-8a0a-85bc57e0dcb6"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "22f54cab-e1c2-43dd-9826-43241414ad4d",
  "quote_id": "4fca269f-5ac6-4d34-9e80-55a239771b69",
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
  "id": "3fa01cf7-888b-499e-9b1e-261e8f0bbb6c",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5590bb88-d64e-419b-9917-046d603d0a6a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:36:53.999853Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3fa01cf7-888b-499e-9b1e-261e8f0bbb6c/cancel` → **200**

```json
{
  "command_id": "7c0cf1a6-fde1-4d84-a93d-fe88bc0f51e5",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3fa01cf7-888b-499e-9b1e-261e8f0bbb6c",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5590bb88-d64e-419b-9917-046d603d0a6a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:36:53.999853Z",
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
  "command_id": "c8020bed-c5f8-4d76-84d8-f3f308474ec5",
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
  "changed_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T09:36:54.628373Z"
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
      "changed_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T09:36:54.628373Z"
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
  "device_ref": "sandbox-31965"
}
```

```json
{
  "challenge_id": "56f1c7d2-881a-4c6d-b13a-c2021be40e00",
  "expires_at": "2026-10-30T09:41:55.515523268Z",
  "resend_available_at": "2026-10-30T09:36:56.515523268Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "832284",
  "sent_at": "2026-10-30T09:36:55.518262811Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "56f1c7d2-881a-4c6d-b13a-c2021be40e00",
  "code": "832284",
  "device_ref": "sandbox-31965"
}
```

```json
{
  "session_id": "536788a6-1847-4e38-a517-6c36106be355",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzkxNSwiaWF0IjoxNzkzMzUzMDE1LCJqdGkiOiI0NzQxY2UzMS05YmM4LTQ3MDUtOWQyNS01ZTY2YWQ0ZGNjYmIiLCJzaWQiOiI1MzY3ODhhNi0xODQ3LTRlMzgtYTUxNy02YzM2MTA2YmUzNTUifQ.GxjQCQfTWlBUW-C3-BdEwQDYJc0xWG9DmwHND7PkkHY",
  "access_expires_at": "2026-10-30T09:51:55.832951184Z",
  "refresh_token": "n_QV7w1W5-hsxX3voOH3byhT_ilJpslHCfxwQEVDjcU",
  "refresh_expires_at": "2026-11-29T09:36:55.832379814Z",
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
  "command_id": "015e1dcb-7284-4394-bb36-fd4558c28912",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:36:56Z",
    "sequence": 1793353016386
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8dd186da-aef8-4678-b611-2d3f47779f53",
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
  "last_heartbeat_at": "2026-10-30T09:36:56.404363Z",
  "last_location_at": "2026-10-30T09:36:56.404363Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671706064",
  "device_ref": "sandbox-3694"
}
```

```json
{
  "challenge_id": "fc9c16eb-efc6-430d-97e5-d9eadb67fa9d",
  "expires_at": "2026-10-30T09:41:56.689224309Z",
  "resend_available_at": "2026-10-30T09:36:57.689224309Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671706064` → **200**

```json
{
  "phone": "+380671706064",
  "audience": "CLIENT",
  "code": "515272",
  "sent_at": "2026-10-30T09:36:56.692046557Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fc9c16eb-efc6-430d-97e5-d9eadb67fa9d",
  "code": "515272",
  "device_ref": "sandbox-3694"
}
```

```json
{
  "session_id": "953e89f6-6667-41bd-8222-29567ac8c29a",
  "subject": {
    "type": "CLIENT",
    "id": "f252eac3-7fe7-45cc-8242-746f4dc6c946"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMjUyZWFjMy03ZmU3LTQ1Y2MtODI0Mi03NDZmNGRjNmM5NDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzOTE2LCJpYXQiOjE3OTMzNTMwMTYsImp0aSI6ImRlOWYyMDM0LTY1NzYtNGM1ZC1iZmM2LWFiMmRhNGYxNDNiOSIsInNpZCI6Ijk1M2U4OWY2LTY2NjctNDFiZC04MjIyLTI5NTY3YWM4YzI5YSJ9.830QpQkL9g7bMXkK2_oZ-JSQm27cmRqaDND_5bdAQ60",
  "access_expires_at": "2026-10-30T09:51:56.988298628Z",
  "refresh_token": "NOB1FC0YVjrpPaYF8rRsg1rYwhtP02xubuGpJxcTsiM",
  "refresh_expires_at": "2026-11-29T09:36:56.987710787Z",
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
  "command_id": "f95f2638-778d-4164-aa38-0dbd084699bd",
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
  "id": "d6045876-5df5-477c-b7a5-e77e1bc8f412",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:41:57.551246Z",
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
  "command_id": "ecee5a91-2c95-4065-a38f-b4b94960d9df",
  "platform": "ANDROID",
  "token": "sandbox-driver-e2b833df-31bd-4d74-9db2-fb67bb3ec074"
}
```

```json
{
  "id": "a3763cb6-a407-4a48-8f80-0fefb9f6b130",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T09:36:57.837464Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "abdff327-458c-48f4-aedc-66fb866e39f2",
  "platform": "ANDROID",
  "token": "sandbox-rider-88d07627-df50-44a6-8174-c6ce1d8b8df5"
}
```

```json
{
  "id": "bdb3a641-49e5-414a-8797-ae96dc799273",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T09:36:58.118933Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "32b16666-d360-4a86-99c9-e326a0ddace7",
  "quote_id": "d6045876-5df5-477c-b7a5-e77e1bc8f412",
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
  "id": "14d62367-eabf-4ce3-b7f4-f350833f4e49",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f252eac3-7fe7-45cc-8242-746f4dc6c946",
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
  "created_at": "2026-10-30T09:36:58.409223Z",
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
    "id": "40ce6312-ab36-4cc1-b905-5422ad9f1d0d",
    "order_id": "14d62367-eabf-4ce3-b7f4-f350833f4e49",
    "expires_at": "2026-10-30T09:37:13.412828Z",
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

`POST /api/driver/v1/offers/40ce6312-ab36-4cc1-b905-5422ad9f1d0d/accept` → **200**

```json
{
  "command_id": "42ec2da4-616f-4816-b3a9-9d0fedf24dbf"
}
```

```json
{
  "id": "af45c1aa-521d-4319-93a3-cbc027e623e2",
  "order_id": "14d62367-eabf-4ce3-b7f4-f350833f4e49",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "88029d34-45a8-43a1-9eb1-8bd478da683e",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T09:36:58.384Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T09:36:58.384Z` → **200**

```json
[
  {
    "at": "2026-10-30T09:36:59.32430681Z",
    "token_suffix": "3ec074",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_version": "2",
      "event_id": "8f28ac36-1c58-488f-989a-1cde491be59a",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "14d62367-eabf-4ce3-b7f4-f350833f4e49"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380671706064&after=2026-10-30T09:36:58.384Z` → **200**

```json
[
  {
    "at": "2026-10-30T09:36:59.321699727Z",
    "token_suffix": "8b8df5",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_version": "3",
      "event_id": "9963ca92-88e5-475e-8fcf-ea718ce9965c",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "14d62367-eabf-4ce3-b7f4-f350833f4e49"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/14d62367-eabf-4ce3-b7f4-f350833f4e49/messages` → **201**

```json
{
  "command_id": "bacc2db9-51bb-4ec5-98e8-c4175927e533",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "d66d935e-438c-4b62-938d-a93992963b8e",
  "order_id": "14d62367-eabf-4ce3-b7f4-f350833f4e49",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T09:37:00.369881726Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "88029d34-45a8-43a1-9eb1-8bd478da683e",
  "order_id": "14d62367-eabf-4ce3-b7f4-f350833f4e49",
  "assignment_id": "af45c1aa-521d-4319-93a3-cbc027e623e2",
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

`POST /api/driver/v1/trips/88029d34-45a8-43a1-9eb1-8bd478da683e/messages` → **201**

```json
{
  "command_id": "ccf71acc-db21-43e2-bcdd-ffded9469562",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "364423a5-b55a-43e7-b18a-23889720ab96",
  "order_id": "14d62367-eabf-4ce3-b7f4-f350833f4e49",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T09:37:00.934465571Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/14d62367-eabf-4ce3-b7f4-f350833f4e49/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/88029d34-45a8-43a1-9eb1-8bd478da683e/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380671706064"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/8dd186da-aef8-4678-b611-2d3f47779f53/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:37:01Z",
    "sequence": 1793353021753
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8dd186da-aef8-4678-b611-2d3f47779f53",
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
  "last_heartbeat_at": "2026-10-30T09:37:01.771954Z",
  "last_location_at": "2026-10-30T09:37:01.771954Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "88029d34-45a8-43a1-9eb1-8bd478da683e",
  "order_id": "14d62367-eabf-4ce3-b7f4-f350833f4e49",
  "assignment_id": "af45c1aa-521d-4319-93a3-cbc027e623e2",
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

`POST /api/driver/v1/trips/88029d34-45a8-43a1-9eb1-8bd478da683e/arrive` → **200**

```json
{
  "command_id": "6cceaa1c-2772-4136-82c1-1d3e473a8b7f",
  "expected_version": 0
}
```

```json
{
  "id": "88029d34-45a8-43a1-9eb1-8bd478da683e",
  "order_id": "14d62367-eabf-4ce3-b7f4-f350833f4e49",
  "assignment_id": "af45c1aa-521d-4319-93a3-cbc027e623e2",
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
  "arrived_at": "2026-10-30T09:37:02.335023Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/88029d34-45a8-43a1-9eb1-8bd478da683e/start` → **200**

```json
{
  "command_id": "8ee7bbd9-f4dc-47af-9962-648b53c3ea19",
  "expected_version": 1
}
```

```json
{
  "id": "88029d34-45a8-43a1-9eb1-8bd478da683e",
  "order_id": "14d62367-eabf-4ce3-b7f4-f350833f4e49",
  "assignment_id": "af45c1aa-521d-4319-93a3-cbc027e623e2",
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
  "arrived_at": "2026-10-30T09:37:02.335023Z",
  "started_at": "2026-10-30T09:37:02.648531Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/8dd186da-aef8-4678-b611-2d3f47779f53/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:37:02Z",
    "sequence": 1793353022929
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8dd186da-aef8-4678-b611-2d3f47779f53",
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
  "last_heartbeat_at": "2026-10-30T09:37:02.948194Z",
  "last_location_at": "2026-10-30T09:37:02.948194Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/88029d34-45a8-43a1-9eb1-8bd478da683e/complete` → **200**

```json
{
  "command_id": "2b12572e-448d-4435-913b-821e6e56d11d",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:37:03Z",
  "cash_received": true
}
```

```json
{
  "id": "88029d34-45a8-43a1-9eb1-8bd478da683e",
  "order_id": "14d62367-eabf-4ce3-b7f4-f350833f4e49",
  "assignment_id": "af45c1aa-521d-4319-93a3-cbc027e623e2",
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
  "arrived_at": "2026-10-30T09:37:02.335023Z",
  "started_at": "2026-10-30T09:37:02.648531Z",
  "completed_at": "2026-10-30T09:37:03.25696Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/14d62367-eabf-4ce3-b7f4-f350833f4e49` → **200**

```json
{
  "id": "14d62367-eabf-4ce3-b7f4-f350833f4e49",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "f252eac3-7fe7-45cc-8242-746f4dc6c946",
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
    "id": "af45c1aa-521d-4319-93a3-cbc027e623e2",
    "order_id": "14d62367-eabf-4ce3-b7f4-f350833f4e49",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "88029d34-45a8-43a1-9eb1-8bd478da683e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:36:58.409223Z",
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
    "id": "14d62367-eabf-4ce3-b7f4-f350833f4e49",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-30T09:36:58.409223Z",
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
    "id": "88029d34-45a8-43a1-9eb1-8bd478da683e",
    "order_id": "14d62367-eabf-4ce3-b7f4-f350833f4e49",
    "order_short_number": 13,
    "created_at": "2026-10-30T09:36:58.983281Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "a71fe0a1-f684-4e22-8547-1c19af89e13a",
    "order_id": "55cfc02e-a469-4e4e-a0a3-e98d3b0719d4",
    "order_short_number": 8,
    "created_at": "2026-10-30T09:35:41.266121Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "1915cc06-c031-4827-bf7a-ee3f2caa2c5b",
    "order_id": "e69f701d-bdfd-4311-88c3-a9c9136bbcff",
    "order_short_number": 3,
    "created_at": "2026-10-30T09:34:55.538603Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "1f01933d-b6fe-4c6e-8255-cb612deff43a",
    "order_id": "22aba70b-5b93-4a25-a7cf-e0a0b325c2e2",
    "order_short_number": 2,
    "created_at": "2026-10-30T09:34:36.272951Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "1f75023b-8b0a-4eb4-a3c2-fcbfeb174140",
    "order_id": "a197b841-bebe-4ce9-8735-7e2bd657e0ab",
    "order_short_number": 1,
    "created_at": "2026-10-30T09:34:26.514854Z",
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

`GET /api/rider/v1/orders/14d62367-eabf-4ce3-b7f4-f350833f4e49/tip` → **200**

```json
{
  "order_id": "14d62367-eabf-4ce3-b7f4-f350833f4e49",
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
  "available_until": "2026-10-31T09:37:03.25696Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/14d62367-eabf-4ce3-b7f4-f350833f4e49/tip` → **201**

```json
{
  "command_id": "5e304d66-1873-48e7-9cf6-49d8afa31131",
  "amount_minor": 1100
}
```

```json
{
  "id": "8bbed45a-9750-4060-9c48-c7cd19980a0b",
  "order_id": "14d62367-eabf-4ce3-b7f4-f350833f4e49",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T09:37:08.306562Z"
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
  "session_id": "2e239114-bbfb-4b8f-97ad-2dc3991a07f4",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM5MjgsImlhdCI6MTc5MzM1MzAyOCwianRpIjoiYjYxZGJiMTctYmIxYS00ODBiLWE4YmMtY2E4NWE3OTZjMDUyIiwic2lkIjoiMmUyMzkxMTQtYmJmYi00YjhmLTk3YWQtMmRjMzk5MWEwN2Y0In0.kQ0g7us6ffXRcobcd0rIEzfWUioFZCvjIiyfypXNVIM",
  "access_expires_at": "2026-10-30T09:52:08.890494669Z",
  "refresh_token": "djF2ILkL9a2NPaM4LAtytQXpwkFSYYDDPxtlX1wqbEs",
  "refresh_expires_at": "2026-10-30T21:37:08.889960717Z",
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
  "generated_at": "2026-10-30T09:37:09.178233692Z"
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
  "generated_at": "2026-10-30T09:37:09.471336494Z"
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
  "session_id": "c2f216f4-0914-4f20-8a88-09aff9f2b0fc",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM5MzAsImlhdCI6MTc5MzM1MzAzMCwianRpIjoiMDQ0ZmJkYzAtZGVlNy00N2ZmLTg2ZDMtMjM1NzRhZmRjZjNmIiwic2lkIjoiYzJmMjE2ZjQtMDkxNC00ZjIwLThhODgtMDlhZmY5ZjJiMGZjIn0.YSBXI0dPD2CYrHQhioqs8Q2DMbdxu12V867IwBvWsKI",
  "access_expires_at": "2026-10-30T09:52:10.088818507Z",
  "refresh_token": "qULKJ9kcroAVob7O_1LFyEdSTetSi9znr4N5IRAv5ko",
  "refresh_expires_at": "2026-10-30T21:37:10.08820673Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/14d62367-eabf-4ce3-b7f4-f350833f4e49/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:36:58.409778Z",
      "actor": {
        "type": "CLIENT",
        "id": "f252eac3-7fe7-45cc-8242-746f4dc6c946",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "14d62367-eabf-4ce3-b7f4-f350833f4e49",
        "quote_id": "d6045876-5df5-477c-b7a5-e77e1bc8f412",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "0459298b-bf61-47e6-a2b1-6701e8654776"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:36:58.41199Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "14d62367-eabf-4ce3-b7f4-f350833f4e49",
        "attempt_id": "52a3cfad-94c4-4fc2-b6b9-331d42a269a4",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "0459298b-bf61-47e6-a2b1-6701e8654776"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T09:36:58.415015Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "40ce6312-ab36-4cc1-b905-5422ad9f1d0d",
        "order_id": "14d62367-eabf-4ce3-b7f4-f350833f4e49",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "0459298b-bf61-47e6-a2b1-6701e8654776"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T09:36:58.984997Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "40ce6312-ab36-4cc1-b905-5422ad9f1d0d",
        "order_id": "14d62367-eabf-4ce3-b7f4-f350833f4e49",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "af45c1aa-521d-4319-93a3-cbc027e623e2"
      },
      "correlation_id": "bf5f7fcb-a53e-4309-8dce-1da2993f6cd8"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T09:37:10.676671337Z",
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
      "last_location_at": "2026-10-30T09:37:02.948194Z",
      "order_id": null
    }
  ]
}
```

Done: order 14d62367-eabf-4ce3-b7f4-f350833f4e49.

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
  "session_id": "0dcee450-ac93-492b-9f57-131d5746c7d0",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM5MzEsImlhdCI6MTc5MzM1MzAzMSwianRpIjoiOWY4MTFjN2QtMmJhOC00YTcwLWFiNzItZDc3MTZlNWJhZjBlIiwic2lkIjoiMGRjZWU0NTAtYWM5My00OTJiLTlmNTctMTMxZDU3NDZjN2QwIn0.dok3BSowWahnzDWnqPiXIB6OiIFdeKP6JHUOdb77Kog",
  "access_expires_at": "2026-10-30T09:52:11.278399523Z",
  "refresh_token": "DBcfuVsOhjrW_4nZopmuzNowH_NQmDzYjDPw21_f1Ak",
  "refresh_expires_at": "2026-10-30T21:37:11.277847739Z",
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
  "command_id": "88004d70-439e-43bf-b2c7-b9586cb088ed",
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
  "timestamp": "2026-10-30T09:37:12.000+0000",
  "channel": {
    "id": "1730052000.108594357",
    "linkedid": "1730052000.108594357",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673676755"
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
  "timestamp": "2026-10-30T09:37:12.000+0000",
  "channel": {
    "id": "1730052000.108594357",
    "linkedid": "1730052000.108594357",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673676755"
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
  "session_id": "9e51610d-8a72-4cfa-aed0-449036a305f8",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM5MzIsImlhdCI6MTc5MzM1MzAzMiwianRpIjoiNGQwM2RjNTQtZDU4NC00ZTFiLTgyYjgtZTJkNTY4OTNiZDk1Iiwic2lkIjoiOWU1MTYxMGQtOGE3Mi00Y2ZhLWFlZDAtNDQ5MDM2YTMwNWY4In0.-snFArXhmMlIvIwKjTKL3ydbSAfmuM7K0opAKQMoIo0",
  "access_expires_at": "2026-10-30T09:52:12.463378682Z",
  "refresh_token": "PiIqeBm0FJi9HaNqgsAepoh_hepSGSnQwW2iopWCjUs",
  "refresh_expires_at": "2026-10-30T21:37:12.462592499Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "39c1b193-b12b-4562-91f9-6231eadd7762",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673676755",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T09:37:12Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/39c1b193-b12b-4562-91f9-6231eadd7762/answer` → **200**

```json
{
  "command_id": "c30dd78e-328c-4fb3-a6a1-544a44ef0c35"
}
```

```json
{
  "id": "39c1b193-b12b-4562-91f9-6231eadd7762",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673676755",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
  "order_ids": [],
  "started_at": "2026-10-30T09:37:12Z",
  "answered_at": "2026-10-30T09:37:13.048338Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.108594357",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d5d20c80-9bce-4b89-ac96-9a1649fb6182",
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
  "id": "5ac0a926-67c8-46d0-9bd6-571b33c4152b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:42:13.379313Z",
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
  "command_id": "4a946c13-f397-4d40-905b-a67d9fd1977c",
  "quote_id": "5ac0a926-67c8-46d0-9bd6-571b33c4152b",
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
    "phone": "+380673676755"
  },
  "call_id": "39c1b193-b12b-4562-91f9-6231eadd7762"
}
```

```json
{
  "id": "c1fb1655-5726-4b6f-9475-26a89f696d89",
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
  "created_at": "2026-10-30T09:37:13.679371Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673676755"
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
    "id": "1730052000.108594357",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "39c1b193-b12b-4562-91f9-6231eadd7762",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673676755",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
      "order_ids": [
        "c1fb1655-5726-4b6f-9475-26a89f696d89"
      ],
      "started_at": "2026-10-30T09:37:12Z",
      "answered_at": "2026-10-30T09:37:13.048338Z",
      "ended_at": "2026-10-30T09:37:14.004294Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "f82c7477-a185-4a4a-aa38-7367c81c43b5",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675675842",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
      "order_ids": [],
      "started_at": "2026-10-30T09:34:44.288402Z",
      "answered_at": "2026-10-30T09:34:44.609284Z",
      "ended_at": "2026-10-30T09:34:44.931093Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T09:34:49.766388Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/c1fb1655-5726-4b6f-9475-26a89f696d89` → **200**

```json
{
  "id": "c1fb1655-5726-4b6f-9475-26a89f696d89",
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
  "created_at": "2026-10-30T09:37:13.679371Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673676755"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/c1fb1655-5726-4b6f-9475-26a89f696d89` → **200**

```json
{
  "id": "c1fb1655-5726-4b6f-9475-26a89f696d89",
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
  "created_at": "2026-10-30T09:37:13.679371Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673676755"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/c1fb1655-5726-4b6f-9475-26a89f696d89/cancel` → **200**

```json
{
  "command_id": "6c253947-efe7-4854-bc8c-333b29e912c2",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "c1fb1655-5726-4b6f-9475-26a89f696d89",
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
  "created_at": "2026-10-30T09:37:13.679371Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673676755"
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

Done: call 39c1b193-b12b-4562-91f9-6231eadd7762 with order c1fb1655-5726-4b6f-9475-26a89f696d89.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-11016"
}
```

```json
{
  "challenge_id": "90dae5dd-1a4c-41d3-9582-b151681c0722",
  "expires_at": "2026-10-30T09:42:15.252442093Z",
  "resend_available_at": "2026-10-30T09:37:16.252442093Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "132411",
  "sent_at": "2026-10-30T09:37:15.256076101Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "90dae5dd-1a4c-41d3-9582-b151681c0722",
  "code": "132411",
  "device_ref": "sandbox-11016"
}
```

```json
{
  "session_id": "2120257c-5bc6-4808-acbf-c4edebdaed91",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzkzNSwiaWF0IjoxNzkzMzUzMDM1LCJqdGkiOiJiZDEwNTY1Yy1lNzQzLTRiMTAtYTRjYS1lNzU5YjQyNWUxYjQiLCJzaWQiOiIyMTIwMjU3Yy01YmM2LTQ4MDgtYWNiZi1jNGVkZWJkYWVkOTEifQ.qWydp8nsnoEXGW6TSE8KcOfxwjoHjX9N1iN88QJRoyw",
  "access_expires_at": "2026-10-30T09:52:15.567783617Z",
  "refresh_token": "GhHoRy1ohKfXVdVfLKsVvYo-o2M0uGzq6906yRBbrtQ",
  "refresh_expires_at": "2026-11-29T09:37:15.567211597Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8dd186da-aef8-4678-b611-2d3f47779f53",
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
  "last_heartbeat_at": "2026-10-30T09:37:02.948194Z",
  "last_location_at": "2026-10-30T09:37:02.948194Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8dd186da-aef8-4678-b611-2d3f47779f53/handover` → **200**

```json
{
  "command_id": "59a8d6b7-e5c7-4da3-996f-9fe2a6275003",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8dd186da-aef8-4678-b611-2d3f47779f53",
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
  "last_heartbeat_at": "2026-10-30T09:37:02.948194Z",
  "last_location_at": "2026-10-30T09:37:02.948194Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8dd186da-aef8-4678-b611-2d3f47779f53/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:37:16Z",
    "sequence": 1793353036438
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8dd186da-aef8-4678-b611-2d3f47779f53",
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
  "last_heartbeat_at": "2026-10-30T09:37:16.456743Z",
  "last_location_at": "2026-10-30T09:37:16.456743Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668487072",
  "device_ref": "sandbox-20123"
}
```

```json
{
  "challenge_id": "59b65d18-479f-4fbb-a0fc-7d758507e08f",
  "expires_at": "2026-10-30T09:42:16.739276486Z",
  "resend_available_at": "2026-10-30T09:37:17.739276486Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668487072` → **200**

```json
{
  "phone": "+380668487072",
  "audience": "CLIENT",
  "code": "108134",
  "sent_at": "2026-10-30T09:37:16.742043262Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "59b65d18-479f-4fbb-a0fc-7d758507e08f",
  "code": "108134",
  "device_ref": "sandbox-20123"
}
```

```json
{
  "session_id": "53c87b2b-b68c-4c5e-b640-6cc6c60c8fe8",
  "subject": {
    "type": "CLIENT",
    "id": "0210ec76-0eaf-470f-862e-275a67bc745b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjEwZWM3Ni0wZWFmLTQ3MGYtODYyZS0yNzVhNjdiYzc0NWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzOTM3LCJpYXQiOjE3OTMzNTMwMzcsImp0aSI6IjNjOTRhYTk2LTc3ODEtNDg0Zi05NTA3LWI1OTk0MTE2OGIwMSIsInNpZCI6IjUzYzg3YjJiLWI2OGMtNGM1ZS1iNjQwLTZjYzZjNjBjOGZlOCJ9.8Hs6YXATY33WztPwdfkzjMZcbCpJ4VmO2JMp0drlea4",
  "access_expires_at": "2026-10-30T09:52:17.054990317Z",
  "refresh_token": "eLsp8eVG9Rm5w1AC0bN_xVFL0O-HK_TLz0ZRgyqPi-U",
  "refresh_expires_at": "2026-11-29T09:37:17.054260443Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4dea8760-8a2a-4c81-925c-47898f5586c8",
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
  "id": "e0f5f116-13fc-4314-9c99-e96b37d45fbd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:42:17.357864Z",
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
  "command_id": "25fed6d6-8e83-43c0-b124-922925dd1eaa",
  "quote_id": "e0f5f116-13fc-4314-9c99-e96b37d45fbd",
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
  "id": "824510fb-abb3-43fb-b6d8-3c197b95c9fe",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0210ec76-0eaf-470f-862e-275a67bc745b",
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
  "created_at": "2026-10-30T09:37:17.66251Z",
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
    "id": "c1dfe3ac-3316-49f4-9094-70cc485a21b0",
    "order_id": "824510fb-abb3-43fb-b6d8-3c197b95c9fe",
    "expires_at": "2026-10-30T09:37:32.666162Z",
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

`POST /api/driver/v1/offers/c1dfe3ac-3316-49f4-9094-70cc485a21b0/accept` → **200**

```json
{
  "command_id": "bfebe0fe-d110-4475-9b19-6deeb87a36d0"
}
```

```json
{
  "id": "ff182b35-250a-4f3f-b9d9-01ccb2607b6b",
  "order_id": "824510fb-abb3-43fb-b6d8-3c197b95c9fe",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9bcf5469-2e81-4a22-9655-45585c7ca233",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9bcf5469-2e81-4a22-9655-45585c7ca233",
  "order_id": "824510fb-abb3-43fb-b6d8-3c197b95c9fe",
  "assignment_id": "ff182b35-250a-4f3f-b9d9-01ccb2607b6b",
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

`POST /api/driver/v1/work-sessions/8dd186da-aef8-4678-b611-2d3f47779f53/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:37:18Z",
    "sequence": 1793353038853
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8dd186da-aef8-4678-b611-2d3f47779f53",
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
  "last_heartbeat_at": "2026-10-30T09:37:18.87083Z",
  "last_location_at": "2026-10-30T09:37:18.87083Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9bcf5469-2e81-4a22-9655-45585c7ca233/arrive` → **200**

```json
{
  "command_id": "7091b786-1f9e-4f53-9dd9-2d355c130eb7",
  "expected_version": 0
}
```

```json
{
  "id": "9bcf5469-2e81-4a22-9655-45585c7ca233",
  "order_id": "824510fb-abb3-43fb-b6d8-3c197b95c9fe",
  "assignment_id": "ff182b35-250a-4f3f-b9d9-01ccb2607b6b",
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
  "arrived_at": "2026-10-30T09:37:19.169707Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9bcf5469-2e81-4a22-9655-45585c7ca233/start` → **200**

```json
{
  "command_id": "6e2637bf-7629-4276-b94d-ad60e242eb47",
  "expected_version": 1
}
```

```json
{
  "id": "9bcf5469-2e81-4a22-9655-45585c7ca233",
  "order_id": "824510fb-abb3-43fb-b6d8-3c197b95c9fe",
  "assignment_id": "ff182b35-250a-4f3f-b9d9-01ccb2607b6b",
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
  "arrived_at": "2026-10-30T09:37:19.169707Z",
  "started_at": "2026-10-30T09:37:19.477127Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/8dd186da-aef8-4678-b611-2d3f47779f53/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:37:19Z",
    "sequence": 1793353039762
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8dd186da-aef8-4678-b611-2d3f47779f53",
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
  "last_heartbeat_at": "2026-10-30T09:37:19.780706Z",
  "last_location_at": "2026-10-30T09:37:19.780706Z",
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
  "device_ref": "sandbox-13130"
}
```

```json
{
  "challenge_id": "6d691abe-b5a1-474a-955b-54952012c5ed",
  "expires_at": "2026-10-30T09:42:20.066186846Z",
  "resend_available_at": "2026-10-30T09:37:21.066186846Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "060092",
  "sent_at": "2026-10-30T09:37:20.06901845Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6d691abe-b5a1-474a-955b-54952012c5ed",
  "code": "060092",
  "device_ref": "sandbox-13130"
}
```

```json
{
  "session_id": "50cbb21d-de0c-4ea3-981a-d2bf09e80707",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1Mzk0MCwiaWF0IjoxNzkzMzUzMDQwLCJqdGkiOiI0NDYyNjQwNi1kNjQ4LTQ5OWQtYjgyZS04OWZiMzBhZTA1OWEiLCJzaWQiOiI1MGNiYjIxZC1kZTBjLTRlYTMtOTgxYS1kMmJmMDllODA3MDcifQ.w5_VLUxAjppnJGLAN-IeJKYJC7KqVBOedMRKOQD8-ac",
  "access_expires_at": "2026-10-30T09:52:20.377835766Z",
  "refresh_token": "ohaA5xcE7n3KSsRgXGV60Q-sS1AGyP3MV0CT5n4CgVk",
  "refresh_expires_at": "2026-11-29T09:37:20.37723494Z",
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
  "command_id": "ce10b713-c686-4c7e-9514-feffab5ec0c8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:37:20Z",
    "sequence": 1793353040933
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "26b28d04-d1d8-4afc-820e-10ede1f02dc3",
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
  "last_heartbeat_at": "2026-10-30T09:37:20.950919Z",
  "last_location_at": "2026-10-30T09:37:20.950919Z",
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
  "session_id": "a62553b0-5591-4ac5-bad0-9261791155e5",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM5NDEsImlhdCI6MTc5MzM1MzA0MSwianRpIjoiYmVhMmI2ODQtNzQ0ZS00MWNjLTlmNDItMDM1Mjk2MGFmMDEzIiwic2lkIjoiYTYyNTUzYjAtNTU5MS00YWM1LWJhZDAtOTI2MTc5MTE1NWU1In0.XEOYxG9HCCZSW-wWVJjwr8X7SRSFkSqZ7XQGlog5OY8",
  "access_expires_at": "2026-10-30T09:52:21.53868711Z",
  "refresh_token": "4zXovdPkw3GlnuavuxY7_qRiubDKkyLBckFo0Ncihlc",
  "refresh_expires_at": "2026-10-30T21:37:21.538030228Z",
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
  "session_id": "32dfb883-d46f-42ad-a961-d45de1fb8183",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM5NDIsImlhdCI6MTc5MzM1MzA0MiwianRpIjoiZjQ4Yzk1OWUtZmEwNy00NTA3LTgyYmEtYmMyZWYzMDE0ODk2Iiwic2lkIjoiMzJkZmI4ODMtZDQ2Zi00MmFkLWE5NjEtZDQ1ZGUxZmI4MTgzIn0.nB7ZdOjtA54NbTpdBlPy4BAWV9DDfLlmJciEskYtS0g",
  "access_expires_at": "2026-10-30T09:52:22.10910936Z",
  "refresh_token": "j1uqq1o_tnHMESwWw6pazPjGGexqW3fMQHMhosac7DA",
  "refresh_expires_at": "2026-10-30T21:37:22.108451457Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/824510fb-abb3-43fb-b6d8-3c197b95c9fe` → **200**

```json
{
  "id": "824510fb-abb3-43fb-b6d8-3c197b95c9fe",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "0210ec76-0eaf-470f-862e-275a67bc745b",
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
    "id": "ff182b35-250a-4f3f-b9d9-01ccb2607b6b",
    "order_id": "824510fb-abb3-43fb-b6d8-3c197b95c9fe",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "9bcf5469-2e81-4a22-9655-45585c7ca233",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T09:37:17.66251Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/824510fb-abb3-43fb-b6d8-3c197b95c9fe/interrupt` → **200**

```json
{
  "command_id": "098733c4-547a-4098-a29a-9fe2b2a2a22c",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "824510fb-abb3-43fb-b6d8-3c197b95c9fe",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "0210ec76-0eaf-470f-862e-275a67bc745b",
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
      "id": "ff182b35-250a-4f3f-b9d9-01ccb2607b6b",
      "order_id": "824510fb-abb3-43fb-b6d8-3c197b95c9fe",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "9bcf5469-2e81-4a22-9655-45585c7ca233",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T09:37:17.66251Z",
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
    "id": "701656d6-b52e-45f2-83cd-5acf3b251464",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "0210ec76-0eaf-470f-862e-275a67bc745b",
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
    "id": "b8022302-b979-493e-8d87-db944f9bacde",
    "order_id": "701656d6-b52e-45f2-83cd-5acf3b251464",
    "expires_at": "2026-10-30T09:37:37.706225Z",
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

`POST /api/driver/v1/offers/b8022302-b979-493e-8d87-db944f9bacde/accept` → **200**

```json
{
  "command_id": "aed8ec6e-cb60-45f8-b612-dff15586a59c"
}
```

```json
{
  "id": "6ab9be9e-353e-439e-9d17-2b4f49f14af1",
  "order_id": "701656d6-b52e-45f2-83cd-5acf3b251464",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "277728a4-57ac-4634-be21-8fc6a8e094c4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "277728a4-57ac-4634-be21-8fc6a8e094c4",
  "order_id": "701656d6-b52e-45f2-83cd-5acf3b251464",
  "assignment_id": "6ab9be9e-353e-439e-9d17-2b4f49f14af1",
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
  "session_id": "26b28d04-d1d8-4afc-820e-10ede1f02dc3",
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
  "last_heartbeat_at": "2026-10-30T09:37:20.950919Z",
  "last_location_at": "2026-10-30T09:37:20.950919Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/26b28d04-d1d8-4afc-820e-10ede1f02dc3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:37:24Z",
    "sequence": 1793353044178
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "26b28d04-d1d8-4afc-820e-10ede1f02dc3",
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
  "last_heartbeat_at": "2026-10-30T09:37:24.200126Z",
  "last_location_at": "2026-10-30T09:37:24.200126Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/277728a4-57ac-4634-be21-8fc6a8e094c4/arrive` → **200**

```json
{
  "command_id": "e377b7ca-8c3c-4134-87f9-4d7660169c77",
  "expected_version": 0
}
```

```json
{
  "id": "277728a4-57ac-4634-be21-8fc6a8e094c4",
  "order_id": "701656d6-b52e-45f2-83cd-5acf3b251464",
  "assignment_id": "6ab9be9e-353e-439e-9d17-2b4f49f14af1",
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
  "arrived_at": "2026-10-30T09:37:24.500298Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/277728a4-57ac-4634-be21-8fc6a8e094c4/start` → **200**

```json
{
  "command_id": "77074982-70f1-413f-bc44-69d9dddfa304",
  "expected_version": 1
}
```

```json
{
  "id": "277728a4-57ac-4634-be21-8fc6a8e094c4",
  "order_id": "701656d6-b52e-45f2-83cd-5acf3b251464",
  "assignment_id": "6ab9be9e-353e-439e-9d17-2b4f49f14af1",
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
  "arrived_at": "2026-10-30T09:37:24.500298Z",
  "started_at": "2026-10-30T09:37:24.806331Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/277728a4-57ac-4634-be21-8fc6a8e094c4/complete` → **200**

```json
{
  "command_id": "b7db4529-2ecc-4591-a602-db40d3d91085",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:37:25Z"
}
```

```json
{
  "id": "277728a4-57ac-4634-be21-8fc6a8e094c4",
  "order_id": "701656d6-b52e-45f2-83cd-5acf3b251464",
  "assignment_id": "6ab9be9e-353e-439e-9d17-2b4f49f14af1",
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
  "arrived_at": "2026-10-30T09:37:24.500298Z",
  "started_at": "2026-10-30T09:37:24.806331Z",
  "completed_at": "2026-10-30T09:37:25.113122Z",
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
    "id": "701656d6-b52e-45f2-83cd-5acf3b251464",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-30T09:37:22.697059Z",
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
    "id": "824510fb-abb3-43fb-b6d8-3c197b95c9fe",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-30T09:37:17.66251Z",
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

`GET /api/operator/v1/orders/824510fb-abb3-43fb-b6d8-3c197b95c9fe/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:37:17.663033Z",
      "actor": {
        "type": "CLIENT",
        "id": "0210ec76-0eaf-470f-862e-275a67bc745b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "824510fb-abb3-43fb-b6d8-3c197b95c9fe",
        "quote_id": "e0f5f116-13fc-4314-9c99-e96b37d45fbd",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "cbc6f4e2-5467-493d-9a03-3bc90ca04c44"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:37:17.665299Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "824510fb-abb3-43fb-b6d8-3c197b95c9fe",
        "attempt_id": "7ad08d7b-8d94-4c66-9dae-9b76f0f9576f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "cbc6f4e2-5467-493d-9a03-3bc90ca04c44"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T09:37:17.668325Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c1dfe3ac-3316-49f4-9094-70cc485a21b0",
        "order_id": "824510fb-abb3-43fb-b6d8-3c197b95c9fe",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "cbc6f4e2-5467-493d-9a03-3bc90ca04c44"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T09:37:18.286305Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "c1dfe3ac-3316-49f4-9094-70cc485a21b0",
        "order_id": "824510fb-abb3-43fb-b6d8-3c197b95c9fe",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "ff182b35-250a-4f3f-b9d9-01ccb2607b6b"
      },
      "correlation_id": "6fb7fe4c-83f0-4b03-b760-ed58ef85b42e"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/701656d6-b52e-45f2-83cd-5acf3b251464/tip` → **200**

```json
{
  "order_id": "701656d6-b52e-45f2-83cd-5acf3b251464",
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
  "available_until": "2026-10-31T09:37:25.113122Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/701656d6-b52e-45f2-83cd-5acf3b251464/tip` → **409**

```json
{
  "command_id": "b56faf5f-a804-4b91-9a24-f0529f632563",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/701656d6-b52e-45f2-83cd-5acf3b251464/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3aef74aa-0858-47a4-92d8-19f5d4af850f"
}
```

Done: interrupted 824510fb-abb3-43fb-b6d8-3c197b95c9fe, follow-up 701656d6-b52e-45f2-83cd-5acf3b251464.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8dd186da-aef8-4678-b611-2d3f47779f53",
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
  "last_heartbeat_at": "2026-10-30T09:37:19.780706Z",
  "last_location_at": "2026-10-30T09:37:19.780706Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8dd186da-aef8-4678-b611-2d3f47779f53/close` → **200**

```json
{
  "command_id": "2beedbed-f424-48c0-85a9-7f0f2f70f591",
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
  "session_id": "26b28d04-d1d8-4afc-820e-10ede1f02dc3",
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
  "last_heartbeat_at": "2026-10-30T09:37:24.200126Z",
  "last_location_at": "2026-10-30T09:37:24.200126Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/26b28d04-d1d8-4afc-820e-10ede1f02dc3/close` → **200**

```json
{
  "command_id": "1e385f81-f5ab-41ee-9889-9e2e7eec11c8",
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
  "session_id": "66b16607-a0fa-49fb-96c4-f00231e1a561",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM5NTEsImlhdCI6MTc5MzM1MzA1MSwianRpIjoiY2UzNjc0NDQtOGUwNy00MmZjLTliZjAtYjllYTRiNzhiNzBmIiwic2lkIjoiNjZiMTY2MDctYTBmYS00OWZiLTk2YzQtZjAwMjMxZTFhNTYxIn0.4HKkpnL8CWuDnW0dKUTt4tGNGCWf0a-b34s6nCxa16I",
  "access_expires_at": "2026-10-30T09:52:31.341475401Z",
  "refresh_token": "GnUKnXhP1tinoGwhAZ0DSWyuQzBdZgf0_9Xz_oo__oU",
  "refresh_expires_at": "2026-10-30T21:37:31.340733371Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "ca39dee0-35e3-4933-86ef-c5191f940657",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T09:37:31Z"
}
```

```json
{
  "id": "e9df9193-da2c-4aa3-b55f-fbf77e77cd2b",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T09:37:31Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/e9df9193-da2c-4aa3-b55f-fbf77e77cd2b/publish` → **200**

```json
{
  "command_id": "452e1a06-047f-45f1-bedd-c4b3261e0453",
  "expected_version": 0
}
```

```json
{
  "id": "e9df9193-da2c-4aa3-b55f-fbf77e77cd2b",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T09:37:31.938432Z",
  "published_at": "2026-10-30T09:37:31.938432Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "e9df9193-da2c-4aa3-b55f-fbf77e77cd2b",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T09:37:31.938432Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635054837",
  "device_ref": "sandbox-2643"
}
```

```json
{
  "challenge_id": "24fba0ce-c14e-40b2-82ec-41c9f127e2ba",
  "expires_at": "2026-10-30T09:42:32.521325028Z",
  "resend_available_at": "2026-10-30T09:37:33.521325028Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635054837` → **200**

```json
{
  "phone": "+380635054837",
  "audience": "CLIENT",
  "code": "213112",
  "sent_at": "2026-10-30T09:37:32.524152515Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "24fba0ce-c14e-40b2-82ec-41c9f127e2ba",
  "code": "213112",
  "device_ref": "sandbox-2643"
}
```

```json
{
  "session_id": "c98b5895-47a3-4e06-aaad-f92f3d34d7d4",
  "subject": {
    "type": "CLIENT",
    "id": "be04c0f2-1e1a-49c1-ab1a-f6c2cbf11c1a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZTA0YzBmMi0xZTFhLTQ5YzEtYWIxYS1mNmMyY2JmMTFjMWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzOTUyLCJpYXQiOjE3OTMzNTMwNTIsImp0aSI6IjIwNDM0NmQ4LTliN2EtNDhkYS05Mjc3LTBkMjAzYTk3MTdmZSIsInNpZCI6ImM5OGI1ODk1LTQ3YTMtNGUwNi1hYWFkLWY5MmYzZDM0ZDdkNCJ9.ibg7XSQyjHg0WgAgTRHBj7SRgOrLLZo5x711nSFydrE",
  "access_expires_at": "2026-10-30T09:52:32.831266622Z",
  "refresh_token": "txFllRJpN9lHgnwzLY4J8by815rm6TWrnEiaiCsuLt8",
  "refresh_expires_at": "2026-11-29T09:37:32.830721601Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "e9df9193-da2c-4aa3-b55f-fbf77e77cd2b",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T09:37:31.938432Z",
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
  "command_id": "6ee5a54b-b3f9-41d1-964e-09383c38863f",
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
  "id": "f3dbc4b2-9ddf-4ea5-a235-3b25d653f654",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:42:33.415635Z",
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
  "command_id": "ecc31562-5a22-4517-91e3-aaeecc6e2c42",
  "quote_id": "f3dbc4b2-9ddf-4ea5-a235-3b25d653f654",
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
  "correlation_id": "98343f9a-804e-4535-a760-0c2e91f430a4"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "f8169ef8-3236-4b1d-ac56-898abb8b1f22",
  "version_id": "e9df9193-da2c-4aa3-b55f-fbf77e77cd2b",
  "language": "uk"
}
```

```json
{
  "version_id": "e9df9193-da2c-4aa3-b55f-fbf77e77cd2b",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T09:37:34.006922Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ae5cf00e-b0b2-4092-8c54-66142f78e950",
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
  "id": "19617b66-4d62-4322-b260-8cd5fcf255d2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:42:34.301550Z",
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
  "command_id": "56a52c2b-e08e-42a5-87a0-5c0824d4cd1b",
  "quote_id": "19617b66-4d62-4322-b260-8cd5fcf255d2",
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
  "id": "e38516e9-bed7-4a3d-86eb-e23963565d5f",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "be04c0f2-1e1a-49c1-ab1a-f6c2cbf11c1a",
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
  "created_at": "2026-10-30T09:37:34.591058Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e38516e9-bed7-4a3d-86eb-e23963565d5f` → **200**

```json
{
  "id": "e38516e9-bed7-4a3d-86eb-e23963565d5f",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "be04c0f2-1e1a-49c1-ab1a-f6c2cbf11c1a",
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
  "created_at": "2026-10-30T09:37:34.591058Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e38516e9-bed7-4a3d-86eb-e23963565d5f/cancel` → **200**

```json
{
  "command_id": "d5af7347-fd19-499e-80f9-d02c023fc6c0",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e38516e9-bed7-4a3d-86eb-e23963565d5f",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "be04c0f2-1e1a-49c1-ab1a-f6c2cbf11c1a",
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
  "created_at": "2026-10-30T09:37:34.591058Z",
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

`POST /api/admin/v1/legal-documents/e9df9193-da2c-4aa3-b55f-fbf77e77cd2b` → **409**

```json
{
  "command_id": "b3e5d279-3444-4af0-a9b3-b0fe3e129e90",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T09:37:35Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/e9df9193-da2c-4aa3-b55f-fbf77e77cd2b",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "8da98b86-3ab3-41b5-8fd6-ae76b815e6bb"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "e4b4db62-93a4-4865-8e02-dd6a46622760",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T09:37:35Z"
}
```

```json
{
  "id": "7a8347bb-2d35-4cee-a6b6-5fa8db28c70b",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T09:37:35Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/7a8347bb-2d35-4cee-a6b6-5fa8db28c70b/publish` → **200**

```json
{
  "command_id": "1965d1e4-99a9-4378-9a54-e439644e6134",
  "expected_version": 0
}
```

```json
{
  "id": "7a8347bb-2d35-4cee-a6b6-5fa8db28c70b",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T09:37:36.085411Z",
  "published_at": "2026-10-30T09:37:36.085411Z",
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
  "device_ref": "sandbox-13759"
}
```

```json
{
  "challenge_id": "53684988-67eb-4b59-a43e-3acf4b824cde",
  "expires_at": "2026-10-30T09:42:36.374865951Z",
  "resend_available_at": "2026-10-30T09:37:37.374865951Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "242290",
  "sent_at": "2026-10-30T09:37:36.377643995Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "53684988-67eb-4b59-a43e-3acf4b824cde",
  "code": "242290",
  "device_ref": "sandbox-13759"
}
```

```json
{
  "session_id": "0159ffad-6b93-4b51-b55a-1b3651db94c2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1Mzk1NiwiaWF0IjoxNzkzMzUzMDU2LCJqdGkiOiI2MjkzMmRmZi1kMDkzLTQzYTItYWQ4Yy1iMjY5YjhjNTUzNjQiLCJzaWQiOiIwMTU5ZmZhZC02YjkzLTRiNTEtYjU1YS0xYjM2NTFkYjk0YzIifQ.7bvPoNXLXVvWPy1kdFPYYch99AzaujzAgVfuKvh_RGE",
  "access_expires_at": "2026-10-30T09:52:36.681740686Z",
  "refresh_token": "QvkNnAeFdsxMtKzLdEL2DW6XKBuMa01Ov-cse2AnqsE",
  "refresh_expires_at": "2026-11-29T09:37:36.6812033Z",
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
  "command_id": "3a0d6933-a5b5-4c8f-b4f0-a74f5a5a6f1e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:37:37Z",
    "sequence": 1793353057244
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "af4700f3-1226-4be5-be13-7c556d28bc67",
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
  "last_heartbeat_at": "2026-10-30T09:37:37.264085Z",
  "last_location_at": "2026-10-30T09:37:37.264085Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672727329",
  "device_ref": "sandbox-16256"
}
```

```json
{
  "challenge_id": "044cd4af-0bb9-4abe-b562-20c57ff672c0",
  "expires_at": "2026-10-30T09:42:37.547706156Z",
  "resend_available_at": "2026-10-30T09:37:38.547706156Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672727329` → **200**

```json
{
  "phone": "+380672727329",
  "audience": "CLIENT",
  "code": "831895",
  "sent_at": "2026-10-30T09:37:37.550627709Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "044cd4af-0bb9-4abe-b562-20c57ff672c0",
  "code": "831895",
  "device_ref": "sandbox-16256"
}
```

```json
{
  "session_id": "ad0b59b7-94ea-4dfc-95f9-46ca6517965d",
  "subject": {
    "type": "CLIENT",
    "id": "ae940421-0db8-4841-86ca-323877649d06"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZTk0MDQyMS0wZGI4LTQ4NDEtODZjYS0zMjM4Nzc2NDlkMDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzOTU3LCJpYXQiOjE3OTMzNTMwNTcsImp0aSI6ImIxZjBmZGYwLTZiY2ItNDI3Yi05Nzg2LWVkMzJjYWU4NjA5OCIsInNpZCI6ImFkMGI1OWI3LTk0ZWEtNGRmYy05NWY5LTQ2Y2E2NTE3OTY1ZCJ9.Ed1nan-WHb2gq96xcCZM1e94xda28gSrxYMbT9q1SKQ",
  "access_expires_at": "2026-10-30T09:52:37.858249094Z",
  "refresh_token": "wyS_LpPRBdgrZlpcy7ztO1d5LubsPKViFn_le9h4O5Y",
  "refresh_expires_at": "2026-11-29T09:37:37.857730132Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bc03297e-8b77-41bd-9f40-0819a1ed8ada",
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
  "id": "cce68065-c326-4581-a7cf-5d613e2ac56f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:42:38.172761Z",
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
  "command_id": "977cd7e4-4472-4797-a0ce-dfbd44846312",
  "quote_id": "cce68065-c326-4581-a7cf-5d613e2ac56f",
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
    "phone": "+380671452402"
  }
}
```

```json
{
  "id": "55b2ca13-3af6-4fa4-ba2c-5f0505e4a8d0",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ae940421-0db8-4841-86ca-323877649d06",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:37:38.466585Z",
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
    "id": "59041821-2078-441c-9933-5eb50ff28470",
    "order_id": "55b2ca13-3af6-4fa4-ba2c-5f0505e4a8d0",
    "expires_at": "2026-10-30T09:37:53.469924Z",
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

`POST /api/driver/v1/offers/59041821-2078-441c-9933-5eb50ff28470/accept` → **200**

```json
{
  "command_id": "a0991b3c-b2b2-42e5-9d5f-d45ab2e237fb"
}
```

```json
{
  "id": "21f191c7-c112-4fc3-ae09-0f47484f7ee4",
  "order_id": "55b2ca13-3af6-4fa4-ba2c-5f0505e4a8d0",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6184f50a-cf39-4d38-858c-ea35cc291b15",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6184f50a-cf39-4d38-858c-ea35cc291b15",
  "order_id": "55b2ca13-3af6-4fa4-ba2c-5f0505e4a8d0",
  "assignment_id": "21f191c7-c112-4fc3-ae09-0f47484f7ee4",
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
    "phone": "+380671452402"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7abc0410-3be3-488e-9a43-8236f36aecec",
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
  "id": "355b5072-ccce-40f4-8b09-4558821d9aa5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:42:39.628347Z",
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
  "command_id": "7b22cb0b-ac92-4391-a662-62ccab5bf8d1",
  "quote_id": "355b5072-ccce-40f4-8b09-4558821d9aa5",
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
  "id": "729a83e9-5251-4a46-9ebc-cd2dd13ca6b2",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ae940421-0db8-4841-86ca-323877649d06",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:37:39.927231Z",
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
  "command_id": "20baa96d-84da-4fee-b1c3-b3309b6c52d0",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T12:37:40Z"
}
```

```json
{
  "id": "bc04c596-d248-4dac-800e-1d4ed9155f57",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:42:40.249035Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T12:37:40Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "87f1be80-cfdc-43ed-88af-109522d47d0d",
  "quote_id": "bc04c596-d248-4dac-800e-1d4ed9155f57",
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
  "pickup_at": "2026-10-30T12:37:40Z"
}
```

```json
{
  "id": "cb418333-9c3b-4a39-ad4f-70668dbbd563",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ae940421-0db8-4841-86ca-323877649d06",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T09:37:40.54525Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T12:37:40Z",
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
  "command_id": "74312b99-caa0-4b82-b294-6651e6655533",
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
  "id": "8da41389-ff6b-4240-87a0-33096ae9a207",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:42:40.850882Z",
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
  "command_id": "cd031103-a706-44a2-8fa8-70b8fd0b5e78",
  "quote_id": "8da41389-ff6b-4240-87a0-33096ae9a207",
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
  "correlation_id": "3f796f33-989f-4155-8110-b62fbd9ea82c"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "cb418333-9c3b-4a39-ad4f-70668dbbd563",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "ae940421-0db8-4841-86ca-323877649d06",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T09:37:40.54525Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T12:37:40Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "729a83e9-5251-4a46-9ebc-cd2dd13ca6b2",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "ae940421-0db8-4841-86ca-323877649d06",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T09:37:39.927231Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "55b2ca13-3af6-4fa4-ba2c-5f0505e4a8d0",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "729a83e9-5251-4a46-9ebc-cd2dd13ca6b2",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ae940421-0db8-4841-86ca-323877649d06",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:37:39.927231Z",
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

`GET /api/rider/v1/orders/55b2ca13-3af6-4fa4-ba2c-5f0505e4a8d0` → **200**

```json
{
  "id": "55b2ca13-3af6-4fa4-ba2c-5f0505e4a8d0",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ae940421-0db8-4841-86ca-323877649d06",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "21f191c7-c112-4fc3-ae09-0f47484f7ee4",
    "order_id": "55b2ca13-3af6-4fa4-ba2c-5f0505e4a8d0",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "6184f50a-cf39-4d38-858c-ea35cc291b15",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T09:37:38.466585Z",
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
    "location_at": "2026-10-30T09:37:37.264085Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/55b2ca13-3af6-4fa4-ba2c-5f0505e4a8d0/cancel` → **200**

```json
{
  "command_id": "189c5b81-4c2e-442f-a60c-8333f0b72d14",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "55b2ca13-3af6-4fa4-ba2c-5f0505e4a8d0",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "ae940421-0db8-4841-86ca-323877649d06",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "21f191c7-c112-4fc3-ae09-0f47484f7ee4",
    "order_id": "55b2ca13-3af6-4fa4-ba2c-5f0505e4a8d0",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "6184f50a-cf39-4d38-858c-ea35cc291b15",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T09:37:38.466585Z",
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

`GET /api/rider/v1/orders/729a83e9-5251-4a46-9ebc-cd2dd13ca6b2` → **200**

```json
{
  "id": "729a83e9-5251-4a46-9ebc-cd2dd13ca6b2",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ae940421-0db8-4841-86ca-323877649d06",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:37:39.927231Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/729a83e9-5251-4a46-9ebc-cd2dd13ca6b2/cancel` → **200**

```json
{
  "command_id": "7fdfd050-4390-4bff-9a32-e3abff84e095",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "729a83e9-5251-4a46-9ebc-cd2dd13ca6b2",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ae940421-0db8-4841-86ca-323877649d06",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:37:39.927231Z",
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

`GET /api/rider/v1/orders/cb418333-9c3b-4a39-ad4f-70668dbbd563` → **200**

```json
{
  "id": "cb418333-9c3b-4a39-ad4f-70668dbbd563",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ae940421-0db8-4841-86ca-323877649d06",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T09:37:40.54525Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T12:37:40Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/cb418333-9c3b-4a39-ad4f-70668dbbd563/cancel` → **200**

```json
{
  "command_id": "749e3930-1c4f-459d-b147-00d19371da00",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "cb418333-9c3b-4a39-ad4f-70668dbbd563",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "ae940421-0db8-4841-86ca-323877649d06",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T09:37:40.54525Z",
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
  "pickup_at": "2026-10-30T12:37:40Z",
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
  "session_id": "af4700f3-1226-4be5-be13-7c556d28bc67",
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
  "last_heartbeat_at": "2026-10-30T09:37:37.264085Z",
  "last_location_at": "2026-10-30T09:37:37.264085Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/af4700f3-1226-4be5-be13-7c556d28bc67/close` → **200**

```json
{
  "command_id": "e20b4085-0428-4208-a34e-1e28df2b6e94",
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

Done: orders 55b2ca13-3af6-4fa4-ba2c-5f0505e4a8d0, 729a83e9-5251-4a46-9ebc-cd2dd13ca6b2, cb418333-9c3b-4a39-ad4f-70668dbbd563.

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
  "session_id": "293f0b01-f932-4c2a-8d89-7e36f43797e3",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM5NjQsImlhdCI6MTc5MzM1MzA2NCwianRpIjoiNTNmMDZiN2ItZDBhNy00OWE3LWJjZjctN2Q4ZGRlYjliZDAxIiwic2lkIjoiMjkzZjBiMDEtZjkzMi00YzJhLThkODktN2UzNmY0Mzc5N2UzIn0.BWkUBuE9s3FgVm6_6b4YBDuay6dpb0QvN9_Dd9zA9OA",
  "access_expires_at": "2026-10-30T09:52:44.851173861Z",
  "refresh_token": "cTtfP7PT-hjQxgJ--CsnNpiTEPEhxPj_o3Gw6j2_jVw",
  "refresh_expires_at": "2026-10-30T21:37:44.850572214Z",
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
  "session_id": "ad430323-7512-44f1-8dce-93780dc8b58f",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM5NjUsImlhdCI6MTc5MzM1MzA2NSwianRpIjoiMzA4ZDJkNmUtYjc3ZS00MzdkLTllMDYtMDA2ZDg3OGYxYjgzIiwic2lkIjoiYWQ0MzAzMjMtNzUxMi00NGYxLThkY2UtOTM3ODBkYzhiNThmIn0.g-XCzfw0Acd0kEBMbrAMHRjiXCaLSvu8v7G_GNwQaMk",
  "access_expires_at": "2026-10-30T09:52:45.418574757Z",
  "refresh_token": "opFbjhv9jPmeFE5k0HhVbHXdaMxq0RruYeVVHIf2bWE",
  "refresh_expires_at": "2026-10-30T21:37:45.418076523Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12695"
}
```

```json
{
  "challenge_id": "409f375e-e1a4-4d0c-98a6-91df02a46aa5",
  "expires_at": "2026-10-30T09:42:45.703423734Z",
  "resend_available_at": "2026-10-30T09:37:46.703423734Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "686400",
  "sent_at": "2026-10-30T09:37:45.706475612Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "409f375e-e1a4-4d0c-98a6-91df02a46aa5",
  "code": "686400",
  "device_ref": "sandbox-12695"
}
```

```json
{
  "session_id": "25473c02-910a-47cf-ab73-3a5cc9fef82d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1Mzk2NiwiaWF0IjoxNzkzMzUzMDY2LCJqdGkiOiI5YjM4MmFhMy1iZDViLTQ4YTgtYjNjZC1iNDg5ODZlNDIzMDIiLCJzaWQiOiIyNTQ3M2MwMi05MTBhLTQ3Y2YtYWI3My0zYTVjYzlmZWY4MmQifQ.tJttA7570lSYkHe5mZYQr68mPKsvJKYW0bnTrSASN4Y",
  "access_expires_at": "2026-10-30T09:52:46.020347481Z",
  "refresh_token": "TMWLasYXyEsMuPfCagOC1Ub06UpML-oGjbYtPmHizFU",
  "refresh_expires_at": "2026-11-29T09:37:46.019814821Z",
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
  "command_id": "8eaef462-cd62-48d7-b52f-2cc42ca2a3ea",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:37:46Z",
    "sequence": 1793353066580
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5f9d6fea-14bb-4fac-8833-c723f1547aca",
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
  "last_heartbeat_at": "2026-10-30T09:37:46.600362Z",
  "last_location_at": "2026-10-30T09:37:46.600362Z",
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
  "command_id": "b0743214-b5cd-41d0-9e40-70ea6e14f909",
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
  "effective_at": "2026-10-30T09:37:47.185246Z",
  "changed_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "f621c4f1-9b6e-41a5-939b-44be51548e85",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T09:35:01.292698Z",
  "last_entries": [
    {
      "order_id": "e69f701d-bdfd-4311-88c3-a9c9136bbcff",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T09:35:01.292698Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "88e995a7-cfec-4202-a25a-174668250d20",
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
  "id": "3c3883eb-c8a7-4037-b8dd-94003f419e29",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:42:47.777831Z",
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
  "command_id": "9aae5fad-6c55-463b-b8a9-5ccf8b6770fb",
  "quote_id": "3c3883eb-c8a7-4037-b8dd-94003f419e29",
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
    "phone": "+380671112451"
  }
}
```

```json
{
  "id": "fd9114d5-f618-4979-8adf-7bcc6b675411",
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
  "created_at": "2026-10-30T09:37:48.069373Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671112451"
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
    "id": "cfc5595f-9b9d-4f11-9179-acdf34d06bc7",
    "order_id": "fd9114d5-f618-4979-8adf-7bcc6b675411",
    "expires_at": "2026-10-30T09:38:03.073538Z",
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

`POST /api/driver/v1/offers/cfc5595f-9b9d-4f11-9179-acdf34d06bc7/accept` → **200**

```json
{
  "command_id": "4e2e17dc-5655-4d9a-acb8-e55935aa169a"
}
```

```json
{
  "id": "1d03ea7d-0b40-483a-985f-f1a7308ae715",
  "order_id": "fd9114d5-f618-4979-8adf-7bcc6b675411",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3950618c-5eb7-4c28-941c-72206c5d478f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3950618c-5eb7-4c28-941c-72206c5d478f",
  "order_id": "fd9114d5-f618-4979-8adf-7bcc6b675411",
  "assignment_id": "1d03ea7d-0b40-483a-985f-f1a7308ae715",
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
    "phone": "+380671112451"
  }
}
```

`POST /api/driver/v1/work-sessions/5f9d6fea-14bb-4fac-8833-c723f1547aca/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:37:49Z",
    "sequence": 1793353069226
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5f9d6fea-14bb-4fac-8833-c723f1547aca",
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
  "last_heartbeat_at": "2026-10-30T09:37:49.244996Z",
  "last_location_at": "2026-10-30T09:37:49.244996Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3950618c-5eb7-4c28-941c-72206c5d478f/arrive` → **200**

```json
{
  "command_id": "b78b28c8-4d53-47af-8e74-d70e717d43fc",
  "expected_version": 0
}
```

```json
{
  "id": "3950618c-5eb7-4c28-941c-72206c5d478f",
  "order_id": "fd9114d5-f618-4979-8adf-7bcc6b675411",
  "assignment_id": "1d03ea7d-0b40-483a-985f-f1a7308ae715",
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
  "arrived_at": "2026-10-30T09:37:49.556145Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671112451"
  }
}
```

`POST /api/driver/v1/trips/3950618c-5eb7-4c28-941c-72206c5d478f/start` → **200**

```json
{
  "command_id": "b98ad481-346b-47e5-9d31-33f6c743e2bd",
  "expected_version": 1
}
```

```json
{
  "id": "3950618c-5eb7-4c28-941c-72206c5d478f",
  "order_id": "fd9114d5-f618-4979-8adf-7bcc6b675411",
  "assignment_id": "1d03ea7d-0b40-483a-985f-f1a7308ae715",
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
  "arrived_at": "2026-10-30T09:37:49.556145Z",
  "started_at": "2026-10-30T09:37:49.850962Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671112451"
  }
}
```

`POST /api/driver/v1/trips/3950618c-5eb7-4c28-941c-72206c5d478f/complete` → **200**

```json
{
  "command_id": "9b1c736a-2c2d-40fb-ad80-fdf2e27542d2",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:37:50Z",
  "cash_received": true
}
```

```json
{
  "id": "3950618c-5eb7-4c28-941c-72206c5d478f",
  "order_id": "fd9114d5-f618-4979-8adf-7bcc6b675411",
  "assignment_id": "1d03ea7d-0b40-483a-985f-f1a7308ae715",
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
  "arrived_at": "2026-10-30T09:37:49.556145Z",
  "started_at": "2026-10-30T09:37:49.850962Z",
  "completed_at": "2026-10-30T09:37:50.159229Z",
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
  "command_id": "6200acce-3420-493b-8b70-8d4dac247512",
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
  "id": "0e548ba1-859c-4278-876f-7f2fefcc4a17",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:42:50.471211Z",
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
  "command_id": "2e02300a-7bc7-4cef-9e4f-71fd23b75c15",
  "quote_id": "0e548ba1-859c-4278-876f-7f2fefcc4a17",
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
    "phone": "+3806711116788"
  }
}
```

```json
{
  "id": "44f5c364-9ff1-44db-b67e-14c47d198895",
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
  "created_at": "2026-10-30T09:37:50.774847Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711116788"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/44f5c364-9ff1-44db-b67e-14c47d198895` → **200**

```json
{
  "id": "44f5c364-9ff1-44db-b67e-14c47d198895",
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
  "created_at": "2026-10-30T09:37:50.774847Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711116788"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/44f5c364-9ff1-44db-b67e-14c47d198895/cancel` → **200**

```json
{
  "command_id": "364ae649-07b0-490f-a2f4-181ebfe20f55",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "44f5c364-9ff1-44db-b67e-14c47d198895",
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
  "created_at": "2026-10-30T09:37:50.774847Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711116788"
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
  "staff_id": "f621c4f1-9b6e-41a5-939b-44be51548e85",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T09:35:01.292698Z",
  "last_entries": [
    {
      "order_id": "44f5c364-9ff1-44db-b67e-14c47d198895",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T09:37:51.428733Z"
    },
    {
      "order_id": "fd9114d5-f618-4979-8adf-7bcc6b675411",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T09:37:50.164352Z"
    },
    {
      "order_id": "e69f701d-bdfd-4311-88c3-a9c9136bbcff",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T09:35:01.292698Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5f9d6fea-14bb-4fac-8833-c723f1547aca",
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
  "last_heartbeat_at": "2026-10-30T09:37:49.244996Z",
  "last_location_at": "2026-10-30T09:37:49.244996Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5f9d6fea-14bb-4fac-8833-c723f1547aca/close` → **200**

```json
{
  "command_id": "36baab1a-2819-419b-892d-c1186b68f984",
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

Done: operator bonus for fulfilled fd9114d5-f618-4979-8adf-7bcc6b675411 and operator-fault cancellation 44f5c364-9ff1-44db-b67e-14c47d198895.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677519689",
  "device_ref": "sandbox-17284"
}
```

```json
{
  "challenge_id": "cf0c50ff-0f56-458d-a6a4-54b9a5d1ac2b",
  "expires_at": "2026-10-30T09:42:55.848337096Z",
  "resend_available_at": "2026-10-30T09:37:56.848337096Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677519689` → **200**

```json
{
  "phone": "+380677519689",
  "audience": "CLIENT",
  "code": "419778",
  "sent_at": "2026-10-30T09:37:55.851248181Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674844999",
  "device_ref": "sandbox-12845",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "fe9c31cf-c54a-4d1d-97b0-fb289de83edd",
  "expires_at": "2026-10-30T09:42:57.358365329Z",
  "resend_available_at": "2026-10-30T09:37:58.358365329Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674844999` → **200**

```json
{
  "phone": "+380674844999",
  "audience": "CLIENT",
  "code": "992341",
  "sent_at": "2026-10-30T09:37:57.361022407Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674844999",
  "device_ref": "sandbox-22062",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "f12fff64-844e-4033-8ff8-0e9bf0b80b3d",
  "expires_at": "2026-10-30T09:42:58.875406372Z",
  "resend_available_at": "2026-10-30T09:37:59.875406372Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380674844999` → **200**

```json
{
  "phone": "+380674844999",
  "audience": "CLIENT",
  "code": "637234",
  "sent_at": "2026-10-30T09:37:58.878516639Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671870000",
  "device_ref": "sandbox-6243"
}
```

```json
{
  "challenge_id": "e71dc6be-cf25-470d-8794-d523757742ba",
  "expires_at": "2026-10-30T09:43:00.394377091Z",
  "resend_available_at": "2026-10-30T09:38:01.394377091Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671870000",
  "device_ref": "sandbox-22769"
}
```

```json
{
  "challenge_id": "6a8328d4-8c9b-4389-9574-bb65ade06bae",
  "expires_at": "2026-10-30T09:43:01.884188463Z",
  "resend_available_at": "2026-10-30T09:38:02.884188463Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380671870000` → **200**

```json
{
  "phone": "+380671870000",
  "audience": "CLIENT",
  "code": "581569",
  "sent_at": "2026-10-30T09:38:01.887625192Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671870000",
  "device_ref": "sandbox-24211",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "c6b67615-4393-400c-b544-ecf594ec2792",
  "expires_at": "2026-10-30T09:43:03.410444416Z",
  "resend_available_at": "2026-10-30T09:38:04.410444416Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380671870000` → **200**

```json
{
  "phone": "+380671870000",
  "audience": "CLIENT",
  "code": "746755",
  "sent_at": "2026-10-30T09:38:03.413615146Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380671870000",
  "device_ref": "sandbox-29669",
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
  "correlation_id": "ba6f8428-7f83-4060-97d0-b75d46fd7c26",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000008272"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "e1061095-1b6d-4c05-ad1f-eaa870e77e52"
}
```

`GET /sandbox/v1/otp?phone=%2B442000008272` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120006751"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "d1d86e70-c1b0-4e92-85be-248a195a33e5"
}
```

`GET /sandbox/v1/otp?phone=%2B37120006751` → **404**

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
  "session_id": "3a5ab3f3-6053-4a5a-a3ff-5f97cdf56798",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM5ODYsImlhdCI6MTc5MzM1MzA4NiwianRpIjoiOWIwMjE5ZWUtNWI1Yy00ODE1LWE3ZGYtZWY4NThkZTVjODA4Iiwic2lkIjoiM2E1YWIzZjMtNjA1My00YTVhLWEzZmYtNWY5N2NkZjU2Nzk4In0.eVy6Y59tirH7bELcaqlGH-Nq6PIqtdrpNVqE_A34_jQ",
  "access_expires_at": "2026-10-30T09:53:06.140930396Z",
  "refresh_token": "Kj1s3rVcNB4n_XKbYUeDmr_Tlvatd035Tnyu-6lZqYg",
  "refresh_expires_at": "2026-10-30T21:38:06.140362242Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380671870000` → **200**

```json
{
  "deliveries": [
    {
      "id": "b6ea0da1-3edc-491b-ab0a-c012489c5d1f",
      "challenge_id": "c6b67615-4393-400c-b544-ecf594ec2792",
      "phone": "+380671870000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-9fe149fa-03aa-4d59-bd05-104f8ea5f2c6",
      "error": null,
      "attempted_at": "2026-10-30T09:38:03.414705Z"
    },
    {
      "id": "d6c90e6e-5515-4bdd-9ce2-10ad69825274",
      "challenge_id": "6a8328d4-8c9b-4389-9574-bb65ade06bae",
      "phone": "+380671870000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-2df9ec6e-5bf7-47ac-844f-0af82698fb53",
      "error": null,
      "attempted_at": "2026-10-30T09:38:01.887971Z"
    },
    {
      "id": "8c5b224b-8512-43a2-867a-4fe63f15bffb",
      "challenge_id": "e71dc6be-cf25-470d-8794-d523757742ba",
      "phone": "+380671870000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T09:38:00.397445Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380671870000` → **200**

```json
{
  "phone": "+380671870000",
  "audience": "CLIENT",
  "code": "746755",
  "sent_at": "2026-10-30T09:38:03.413615146Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380674844999` → **200**

```json
{
  "deliveries": [
    {
      "id": "2a64e7e9-ec3e-43d7-9c05-e02bfd12be3f",
      "challenge_id": "f12fff64-844e-4033-8ff8-0e9bf0b80b3d",
      "phone": "+380674844999",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-43e57915-638e-4993-9375-a96691b136cc",
      "error": null,
      "attempted_at": "2026-10-30T09:37:58.87878Z"
    },
    {
      "id": "bb325391-d151-43a4-be1d-8dc000c7eb75",
      "challenge_id": "fe9c31cf-c54a-4d1d-97b0-fb289de83edd",
      "phone": "+380674844999",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-b1cdf602-244b-4d14-843b-7acb3d2b9034",
      "error": null,
      "attempted_at": "2026-10-30T09:37:57.3615Z"
    }
  ]
}
```

Done: SMS to +380677519689; SMS then a call to +380674844999; a failed SMS, two calls and a refused third to +380671870000; +44 and +371 refused.

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
  "session_id": "0bcdf898-81a8-4e15-9331-8df10975255e",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM5ODcsImlhdCI6MTc5MzM1MzA4NywianRpIjoiYzBjMTgxOWUtODY2ZS00MzMwLTgxNTItMWFhMDk5NjZiMTcwIiwic2lkIjoiMGJjZGY4OTgtODFhOC00ZTE1LTkzMzEtOGRmMTA5NzUyNTVlIn0.Hzc2I1SiY1v1gBXosQjAonPsWlAeFnHRvDqSPM63SpM",
  "access_expires_at": "2026-10-30T09:53:07.362648094Z",
  "refresh_token": "ApXGwZV21MjK4FzxvRWhbG6bAWr_1LTT5qAtUNKnBZE",
  "refresh_expires_at": "2026-10-30T21:38:07.361831965Z",
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
  "session_id": "871d090d-d3e8-4163-81fc-48d1b2646449",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM5ODcsImlhdCI6MTc5MzM1MzA4NywianRpIjoiYTg5ZWJkNGItMmVlNS00ZTg2LWIwMTktNjdhOTA0ODc3NGE3Iiwic2lkIjoiODcxZDA5MGQtZDNlOC00MTYzLTgxZmMtNDhkMWIyNjQ2NDQ5In0.MTAcZO-a61RGiqVFurQft9qCAdjG_2ZTd7cvAn877HQ",
  "access_expires_at": "2026-10-30T09:53:07.934160952Z",
  "refresh_token": "zFqFWgWAidZS-XFkWue05X8tN_4sFoIHf2fO9nsABUQ",
  "refresh_expires_at": "2026-10-30T21:38:07.933592489Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85",
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

`POST /api/admin/v1/staff-extensions/f621c4f1-9b6e-41a5-939b-44be51548e85` → **200**

```json
{
  "command_id": "7d5bbcc7-1ad9-4b99-9e70-ef69a45e02f2",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "f621c4f1-9b6e-41a5-939b-44be51548e85",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "437e6d07-ff1d-467f-b883-e4cd748448f5",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T09:38:09.133199Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T09:38:09.133199Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "55a2d4b3-44dc-4f0d-8b94-817d4114cd20",
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
  "id": "68f3f4f5-8802-4041-8aef-feb190acc35c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:43:09.730862Z",
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
  "command_id": "8b7bc71d-f7ab-426c-8002-428693477ef4",
  "quote_id": "68f3f4f5-8802-4041-8aef-feb190acc35c",
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
    "phone": "+380671488799"
  }
}
```

```json
{
  "id": "1efa76ba-1ddc-4d9c-a4c1-4345f81c9dd5",
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
  "created_at": "2026-10-30T09:38:10.041067Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671488799"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/1efa76ba-1ddc-4d9c-a4c1-4345f81c9dd5/calls` → **201**

```json
{
  "command_id": "62a494ac-9eaf-4a4f-8ff9-0e80ad55c282",
  "to": "CALLER"
}
```

```json
{
  "id": "0bc0cb4d-1ef2-43b3-aacc-baf3bf0bde48",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
  "order_ids": [
    "1efa76ba-1ddc-4d9c-a4c1-4345f81c9dd5"
  ],
  "started_at": "2026-10-30T09:38:10.394247Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/1efa76ba-1ddc-4d9c-a4c1-4345f81c9dd5/calls` → **201**

```json
{
  "command_id": "62a494ac-9eaf-4a4f-8ff9-0e80ad55c282",
  "to": "CALLER"
}
```

```json
{
  "id": "0bc0cb4d-1ef2-43b3-aacc-baf3bf0bde48",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
  "order_ids": [
    "1efa76ba-1ddc-4d9c-a4c1-4345f81c9dd5"
  ],
  "started_at": "2026-10-30T09:38:10.394247Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "0bc0cb4d-1ef2-43b3-aacc-baf3bf0bde48",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380671488799",
    "at": "2026-10-30T09:38:10.39709278Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "0bc0cb4d-1ef2-43b3-aacc-baf3bf0bde48",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.11062",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "0bc0cb4d-1ef2-43b3-aacc-baf3bf0bde48"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "0bc0cb4d-1ef2-43b3-aacc-baf3bf0bde48",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=1efa76ba-1ddc-4d9c-a4c1-4345f81c9dd5` → **200**

```json
{
  "calls": [
    {
      "id": "0bc0cb4d-1ef2-43b3-aacc-baf3bf0bde48",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
      "order_ids": [
        "1efa76ba-1ddc-4d9c-a4c1-4345f81c9dd5"
      ],
      "started_at": "2026-10-30T09:38:10.394247Z",
      "answered_at": "2026-10-30T09:38:11.083412Z",
      "ended_at": "2026-10-30T09:38:11.105598Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=1efa76ba-1ddc-4d9c-a4c1-4345f81c9dd5` → **200**

```json
{
  "calls": [
    {
      "id": "0bc0cb4d-1ef2-43b3-aacc-baf3bf0bde48",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
      "order_ids": [
        "1efa76ba-1ddc-4d9c-a4c1-4345f81c9dd5"
      ],
      "started_at": "2026-10-30T09:38:10.394247Z",
      "answered_at": "2026-10-30T09:38:11.083412Z",
      "ended_at": "2026-10-30T09:38:11.105598Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=1efa76ba-1ddc-4d9c-a4c1-4345f81c9dd5` → **200**

```json
{
  "calls": [
    {
      "id": "0bc0cb4d-1ef2-43b3-aacc-baf3bf0bde48",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
      "order_ids": [
        "1efa76ba-1ddc-4d9c-a4c1-4345f81c9dd5"
      ],
      "started_at": "2026-10-30T09:38:10.394247Z",
      "answered_at": "2026-10-30T09:38:11.083412Z",
      "ended_at": "2026-10-30T09:38:11.105598Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=1efa76ba-1ddc-4d9c-a4c1-4345f81c9dd5` → **200**

```json
{
  "calls": [
    {
      "id": "0bc0cb4d-1ef2-43b3-aacc-baf3bf0bde48",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
      "order_ids": [
        "1efa76ba-1ddc-4d9c-a4c1-4345f81c9dd5"
      ],
      "started_at": "2026-10-30T09:38:10.394247Z",
      "answered_at": "2026-10-30T09:38:11.083412Z",
      "ended_at": "2026-10-30T09:38:11.105598Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=1efa76ba-1ddc-4d9c-a4c1-4345f81c9dd5` → **200**

```json
{
  "calls": [
    {
      "id": "0bc0cb4d-1ef2-43b3-aacc-baf3bf0bde48",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
      "order_ids": [
        "1efa76ba-1ddc-4d9c-a4c1-4345f81c9dd5"
      ],
      "started_at": "2026-10-30T09:38:10.394247Z",
      "answered_at": "2026-10-30T09:38:11.083412Z",
      "ended_at": "2026-10-30T09:38:11.105598Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T09:38:19.815354Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/1efa76ba-1ddc-4d9c-a4c1-4345f81c9dd5` → **200**

```json
{
  "id": "1efa76ba-1ddc-4d9c-a4c1-4345f81c9dd5",
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
  "created_at": "2026-10-30T09:38:10.041067Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671488799"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/1efa76ba-1ddc-4d9c-a4c1-4345f81c9dd5/cancel` → **200**

```json
{
  "command_id": "045b647e-98c3-477c-8563-cfde590bb1a8",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "1efa76ba-1ddc-4d9c-a4c1-4345f81c9dd5",
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
  "created_at": "2026-10-30T09:38:10.041067Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671488799"
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
  "command_id": "1b310e97-1871-481a-9594-11e7fcead747",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T09:38:21.289469Z",
  "extension": "101"
}
```

Done: outgoing call 0bc0cb4d-1ef2-43b3-aacc-baf3bf0bde48 from order 1efa76ba-1ddc-4d9c-a4c1-4345f81c9dd5, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630016947",
  "device_ref": "sandbox-30061"
}
```

```json
{
  "challenge_id": "a85878e6-8f24-4303-88b1-51f97739a59a",
  "expires_at": "2026-10-30T09:43:21.582604772Z",
  "resend_available_at": "2026-10-30T09:38:22.582604772Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630016947` → **200**

```json
{
  "phone": "+380630016947",
  "audience": "CLIENT",
  "code": "112288",
  "sent_at": "2026-10-30T09:38:21.585689871Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a85878e6-8f24-4303-88b1-51f97739a59a",
  "code": "112288",
  "device_ref": "sandbox-30061"
}
```

```json
{
  "session_id": "4a29df51-700a-434b-8727-93f07dfbbc75",
  "subject": {
    "type": "CLIENT",
    "id": "b1eca82d-735b-400f-95e9-81717df60ed4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMWVjYTgyZC03MzViLTQwMGYtOTVlOS04MTcxN2RmNjBlZDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0MDAxLCJpYXQiOjE3OTMzNTMxMDEsImp0aSI6IjBlMGJiY2NmLTdlYWUtNGFhZi1iMzJhLTNlYzM0ZTg4NjhlYSIsInNpZCI6IjRhMjlkZjUxLTcwMGEtNDM0Yi04NzI3LTkzZjA3ZGZiYmM3NSJ9.fFws8ZDUpGo7P9ZIpJxO6ixOR9N-9kAIxp8lQssGxLI",
  "access_expires_at": "2026-10-30T09:53:21.898587258Z",
  "refresh_token": "DLOE4GkR5Jo32o_YNY8LIeVHOKe8gs2V6tLu0L_RQQg",
  "refresh_expires_at": "2026-11-29T09:38:21.898015886Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b1eca82d-735b-400f-95e9-81717df60ed4",
  "session_id": "4a29df51-700a-434b-8727-93f07dfbbc75",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630016947",
  "device_ref": "sandbox-14131"
}
```

```json
{
  "challenge_id": "88070c10-2d3f-4a2a-940c-187bbf8b5d70",
  "expires_at": "2026-10-30T09:43:24.449460045Z",
  "resend_available_at": "2026-10-30T09:38:25.449460045Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630016947` → **200**

```json
{
  "phone": "+380630016947",
  "audience": "CLIENT",
  "code": "150425",
  "sent_at": "2026-10-30T09:38:24.452079941Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "88070c10-2d3f-4a2a-940c-187bbf8b5d70",
  "code": "150425",
  "device_ref": "sandbox-14131"
}
```

```json
{
  "session_id": "e7193e0d-df2b-4b12-bc38-632fc9b6314a",
  "subject": {
    "type": "CLIENT",
    "id": "b1eca82d-735b-400f-95e9-81717df60ed4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMWVjYTgyZC03MzViLTQwMGYtOTVlOS04MTcxN2RmNjBlZDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0MDA0LCJpYXQiOjE3OTMzNTMxMDQsImp0aSI6IjUwY2Y0OWVhLTA2MDYtNDQ4NS05YjY1LTE0ODNlMjYxYzMyZiIsInNpZCI6ImU3MTkzZTBkLWRmMmItNGIxMi1iYzM4LTYzMmZjOWI2MzE0YSJ9.BkgFW2uML6ycYQeHsohc-lkcUqNUa0e9XVV9yMivhEU",
  "access_expires_at": "2026-10-30T09:53:24.765744106Z",
  "refresh_token": "uHStXpdkzuIs6yrIAcQXV4jiLNC4S6vVbjsaFqz1OUk",
  "refresh_expires_at": "2026-11-29T09:38:24.765101012Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "67f3063e-db13-4745-bd01-bf3c40e62652",
  "expires_at": "2026-10-30T09:43:27.059112208Z",
  "resend_available_at": "2026-10-30T09:38:28.059112208Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630016947` → **200**

```json
{
  "phone": "+380630016947",
  "audience": "CLIENT",
  "code": "638035",
  "sent_at": "2026-10-30T09:38:27.062154487Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380636635060"
}
```

```json
{
  "challenge_id": "081b43c3-7bb4-43f1-bc21-ced3d61cfebc",
  "expires_at": "2026-10-30T09:43:27.369262719Z",
  "resend_available_at": "2026-10-30T09:38:28.369262719Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636635060` → **200**

```json
{
  "phone": "+380636635060",
  "audience": "CLIENT",
  "code": "772407",
  "sent_at": "2026-10-30T09:38:27.371680919Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "61eec907-b4f1-43ea-ab47-1d998cc2d541",
  "current_challenge_id": "67f3063e-db13-4745-bd01-bf3c40e62652",
  "current_code": "000000",
  "new_challenge_id": "081b43c3-7bb4-43f1-bc21-ced3d61cfebc",
  "new_code": "772407"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "d9473971-e3f3-4a28-9ff5-0fefe16f7899"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "a18f716d-a5d4-4fa6-98cb-36e15f96747b",
  "current_challenge_id": "67f3063e-db13-4745-bd01-bf3c40e62652",
  "current_code": "638035",
  "new_challenge_id": "081b43c3-7bb4-43f1-bc21-ced3d61cfebc",
  "new_code": "772407"
}
```

```json
{
  "subject_id": "b1eca82d-735b-400f-95e9-81717df60ed4",
  "phone": "+380636635060",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b1eca82d-735b-400f-95e9-81717df60ed4",
  "session_id": "4a29df51-700a-434b-8727-93f07dfbbc75",
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
  "correlation_id": "08f08082-a183-434c-afb4-59c2b48a42fc"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636635060",
  "device_ref": "sandbox-32635"
}
```

```json
{
  "challenge_id": "a3e84f54-ebcb-467f-b214-fa834850425b",
  "expires_at": "2026-10-30T09:43:30.867351477Z",
  "resend_available_at": "2026-10-30T09:38:31.867351477Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636635060` → **200**

```json
{
  "phone": "+380636635060",
  "audience": "CLIENT",
  "code": "935810",
  "sent_at": "2026-10-30T09:38:30.870877503Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a3e84f54-ebcb-467f-b214-fa834850425b",
  "code": "935810",
  "device_ref": "sandbox-32635"
}
```

```json
{
  "session_id": "1d454c66-6bfa-4ee8-bb40-e8600c9b2f87",
  "subject": {
    "type": "CLIENT",
    "id": "b1eca82d-735b-400f-95e9-81717df60ed4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMWVjYTgyZC03MzViLTQwMGYtOTVlOS04MTcxN2RmNjBlZDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0MDExLCJpYXQiOjE3OTMzNTMxMTEsImp0aSI6IjFlMmM3YzBlLTYzNDYtNDVjOC05NGQ0LThhNTlmMzMxNTZiYSIsInNpZCI6IjFkNDU0YzY2LTZiZmEtNGVlOC1iYjQwLWU4NjAwYzliMmY4NyJ9.IEbhx4-YC8Di6s9fUkzG9zPQJXFy6yZ2hKeVplkNzLM",
  "access_expires_at": "2026-10-30T09:53:31.182651549Z",
  "refresh_token": "OUbLkFBcEZ-XQ_9l1dcs8wK0cuCzIO-EMAc9KyTYZVc",
  "refresh_expires_at": "2026-11-29T09:38:31.182111186Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b1eca82d-735b-400f-95e9-81717df60ed4",
  "session_id": "1d454c66-6bfa-4ee8-bb40-e8600c9b2f87",
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
  "session_id": "b09e0482-5ac0-4da4-994c-13eaba72cbaa",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQwMTIsImlhdCI6MTc5MzM1MzExMiwianRpIjoiNzljMjNmYjgtMDAzNy00ZTdjLWFhMWItY2JhMjNjNDlmZWNmIiwic2lkIjoiYjA5ZTA0ODItNWFjMC00ZGE0LTk5NGMtMTNlYWJhNzJjYmFhIn0.mzkU6Jt-nB3sXbgaDUB1lyAUN8ZQ5oL06y0C-NB_RAk",
  "access_expires_at": "2026-10-30T09:53:32.029389139Z",
  "refresh_token": "65Zamk51WgZDVnRMVEd2g3vKzRaCiSfr3v0mwf8lnyc",
  "refresh_expires_at": "2026-10-30T21:38:32.028847384Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/b1eca82d-735b-400f-95e9-81717df60ed4` → **200**

```json
{
  "client": {
    "id": "b1eca82d-735b-400f-95e9-81717df60ed4",
    "phone": "+380636635060",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:38:21.896411Z",
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

`POST /api/admin/v1/clients/b1eca82d-735b-400f-95e9-81717df60ed4/phone/new-code` → **201**

```json
{
  "phone": "+380634427349"
}
```

```json
{
  "challenge_id": "60d9d03f-8a2f-4cf5-b661-841ffbe90c86",
  "expires_at": "2026-10-30T09:43:32.646525556Z",
  "resend_available_at": "2026-10-30T09:38:33.646525556Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634427349` → **200**

```json
{
  "phone": "+380634427349",
  "audience": "CLIENT",
  "code": "598636",
  "sent_at": "2026-10-30T09:38:32.649309993Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/b1eca82d-735b-400f-95e9-81717df60ed4/phone` → **422**

```json
{
  "command_id": "c3fd248f-b164-491f-b2dd-69020646fc09",
  "expected_version": 3,
  "new_challenge_id": "60d9d03f-8a2f-4cf5-b661-841ffbe90c86",
  "new_code": "598637",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/b1eca82d-735b-400f-95e9-81717df60ed4/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "caf74e3f-56db-4d1f-8868-03378387b006"
}
```

`POST /api/admin/v1/clients/b1eca82d-735b-400f-95e9-81717df60ed4/phone` → **400**

```json
{
  "command_id": "0b773880-49b7-427c-a45a-2f1b4f546dd1",
  "expected_version": 3,
  "new_challenge_id": "60d9d03f-8a2f-4cf5-b661-841ffbe90c86",
  "new_code": "598636",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/b1eca82d-735b-400f-95e9-81717df60ed4/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "09d2d7f5-9b61-4fa2-9999-340eaa13f81b",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/b1eca82d-735b-400f-95e9-81717df60ed4/phone` → **200**

```json
{
  "command_id": "4a59d906-826c-4e5e-ba55-3ecaa940ab39",
  "expected_version": 3,
  "new_challenge_id": "60d9d03f-8a2f-4cf5-b661-841ffbe90c86",
  "new_code": "598636",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "b1eca82d-735b-400f-95e9-81717df60ed4",
  "phone": "+380634427349",
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
  "correlation_id": "f266edff-7f59-431a-9791-8e00f5cc0dc3"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634427349",
  "device_ref": "sandbox-20497"
}
```

```json
{
  "challenge_id": "1bfb97a1-a630-4ca2-b5a1-ce26ca77c635",
  "expires_at": "2026-10-30T09:43:34.129686025Z",
  "resend_available_at": "2026-10-30T09:38:35.129686025Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634427349` → **200**

```json
{
  "phone": "+380634427349",
  "audience": "CLIENT",
  "code": "137579",
  "sent_at": "2026-10-30T09:38:34.133547338Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1bfb97a1-a630-4ca2-b5a1-ce26ca77c635",
  "code": "137579",
  "device_ref": "sandbox-20497"
}
```

```json
{
  "session_id": "d3db1b8d-1810-4fac-a8e3-e113f69d0243",
  "subject": {
    "type": "CLIENT",
    "id": "b1eca82d-735b-400f-95e9-81717df60ed4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMWVjYTgyZC03MzViLTQwMGYtOTVlOS04MTcxN2RmNjBlZDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0MDE0LCJpYXQiOjE3OTMzNTMxMTQsImp0aSI6IjQ1ZDM2N2RhLTcwOTAtNDQxZC05NzlhLTcwY2NmYmM2NzQ0MCIsInNpZCI6ImQzZGIxYjhkLTE4MTAtNGZhYy1hOGUzLWUxMTNmNjlkMDI0MyJ9.bp7mRSRCtCZ5iqdL9uFkrQ8p_i9LhfXJ-u5PbvWGUdE",
  "access_expires_at": "2026-10-30T09:53:34.4400358Z",
  "refresh_token": "RdZLpfJRJMrp9yhbfASBZQFDJAVyRiXGbyBQJB2ajL0",
  "refresh_expires_at": "2026-11-29T09:38:34.439497532Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b1eca82d-735b-400f-95e9-81717df60ed4",
  "session_id": "d3db1b8d-1810-4fac-a8e3-e113f69d0243",
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
  "phone": "+380638265036",
  "device_ref": "sandbox-21158"
}
```

```json
{
  "challenge_id": "356e1aea-0711-45c7-8ee0-d1ff6c5aae7f",
  "expires_at": "2026-10-30T09:43:35.017398214Z",
  "resend_available_at": "2026-10-30T09:38:36.017398214Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638265036` → **200**

```json
{
  "phone": "+380638265036",
  "audience": "CLIENT",
  "code": "660647",
  "sent_at": "2026-10-30T09:38:35.02087044Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "356e1aea-0711-45c7-8ee0-d1ff6c5aae7f",
  "code": "660647",
  "device_ref": "sandbox-21158"
}
```

```json
{
  "session_id": "b9d4044a-3d23-4ea4-9c5e-37e17926d87f",
  "subject": {
    "type": "CLIENT",
    "id": "09b2e66d-cf39-4512-ab05-b60c13fb23e1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWIyZTY2ZC1jZjM5LTQ1MTItYWIwNS1iNjBjMTNmYjIzZTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0MDE1LCJpYXQiOjE3OTMzNTMxMTUsImp0aSI6ImI0NmU1Nzk5LTUyMTgtNGNhMS1hMTA3LTRiNWJkYzQzM2U5ZCIsInNpZCI6ImI5ZDQwNDRhLTNkMjMtNGVhNC05YzVlLTM3ZTE3OTI2ZDg3ZiJ9.8mVorB_U2r3jxfD_deEPyW27w6K3k5SoWHywMUAbwFU",
  "access_expires_at": "2026-10-30T09:53:35.321753279Z",
  "refresh_token": "fuEZSksFL7Ga6wtcqluxfSkQWc6DtsiVXzD7VIhQpVA",
  "refresh_expires_at": "2026-11-29T09:38:35.321232814Z",
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
  "session_id": "79875f94-e358-48e4-b724-2343f259c3c8",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQwMTYsImlhdCI6MTc5MzM1MzExNiwianRpIjoiOTg1YmExNTItN2RkMi00NDZhLTk0MWMtYTcwZjlkNmU1NGI5Iiwic2lkIjoiNzk4NzVmOTQtZTM1OC00OGU0LWI3MjQtMjM0M2YyNTljM2M4In0.gCHNfBRCcx28FgMKxyV0rV1uZlW8NrFbA5Jsz354z3c",
  "access_expires_at": "2026-10-30T09:53:36.507252295Z",
  "refresh_token": "m6Y3XX3PZBxSpdKLxnpz_Le3-kIQjGudZ9asS8M-w7U",
  "refresh_expires_at": "2026-10-30T21:38:36.506705641Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380638265036` → **200**

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
  "correlation_id": "6c824959-9dfd-4e90-a734-0f67b1d7a2d6"
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
  "session_id": "82d3ea50-02d2-4e15-8ca8-ab98c7f45b6f",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQwMTcsImlhdCI6MTc5MzM1MzExNywianRpIjoiMTE1YTc0ODAtMTgwMi00NTgxLWI5ZjctOGRhZDQ2ZjdlNzZhIiwic2lkIjoiODJkM2VhNTAtMDJkMi00ZTE1LThjYTgtYWI5OGM3ZjQ1YjZmIn0.4NFrsxqMfVw4odqCsN6EJh-Af6xHYRjd2uzeCm32aTs",
  "access_expires_at": "2026-10-30T09:53:37.673234963Z",
  "refresh_token": "RHDqMuayFfl2xNHMMU6QnWPW7ivtd1yqQjEbfOdrIrY",
  "refresh_expires_at": "2026-10-30T21:38:37.672690723Z",
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
  "changed_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T09:34:30.834286Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "95eaa886-d183-40ba-9e75-7a1616d9da3c",
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
  "changed_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T09:38:38.248584021Z"
}
```

## The rider books the airport for 2026-10-30T12:38:37Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600358405",
  "device_ref": "sandbox-2457"
}
```

```json
{
  "challenge_id": "650cc4f0-1499-4484-b5cc-adcef269c2f8",
  "expires_at": "2026-10-30T09:43:38.570621202Z",
  "resend_available_at": "2026-10-30T09:38:39.570621202Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600358405` → **200**

```json
{
  "phone": "+48600358405",
  "audience": "CLIENT",
  "code": "884325",
  "sent_at": "2026-10-30T09:38:38.576647001Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "650cc4f0-1499-4484-b5cc-adcef269c2f8",
  "code": "884325",
  "device_ref": "sandbox-2457"
}
```

```json
{
  "session_id": "5af97244-e3c2-4bed-a79d-58b90f4bc132",
  "subject": {
    "type": "CLIENT",
    "id": "72749061-0c0e-4996-8b6a-6ac9e88c4ecb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3Mjc0OTA2MS0wYzBlLTQ5OTYtOGI2YS02YWM5ZTg4YzRlY2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0MDE4LCJpYXQiOjE3OTMzNTMxMTgsImp0aSI6ImZlODZmZGEzLTc3YWQtNDIzMS1iMDkxLWI2ZmYzMDkyNDJiZCIsInNpZCI6IjVhZjk3MjQ0LWUzYzItNGJlZC1hNzlkLTU4YjkwZjRiYzEzMiJ9.yZZRPl3qtu3F-Cu09NDUisRszkNH0X1LT6znVB26HD8",
  "access_expires_at": "2026-10-30T09:53:38.893198768Z",
  "refresh_token": "2kz80drCUslbm6VMXLy1kM1-ybb-gsYs-gLVHFkwFSc",
  "refresh_expires_at": "2026-11-29T09:38:38.892690495Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1501840f-25cd-4860-acc1-2b71e24a92b5",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T12:38:37Z"
}
```

```json
{
  "id": "e2063d8f-732d-4b6a-b1a6-511b4f492150",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:43:39.190772Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T12:38:37Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ae4c5d6d-4667-4bd5-a11d-958348b2dab8",
  "quote_id": "e2063d8f-732d-4b6a-b1a6-511b4f492150",
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
  "pickup_at": "2026-10-30T12:38:37Z"
}
```

```json
{
  "id": "3b9550c2-d296-4257-b9c4-accad49f130d",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "72749061-0c0e-4996-8b6a-6ac9e88c4ecb",
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
  "created_at": "2026-10-30T09:38:39.490068Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T12:38:37Z",
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
  "device_ref": "sandbox-11283"
}
```

```json
{
  "challenge_id": "0dc29379-c9f8-4b32-aa75-4ad0e42e1a8c",
  "expires_at": "2026-10-30T09:43:39.802653468Z",
  "resend_available_at": "2026-10-30T09:38:40.802653468Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "733499",
  "sent_at": "2026-10-30T09:38:39.806498091Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0dc29379-c9f8-4b32-aa75-4ad0e42e1a8c",
  "code": "733499",
  "device_ref": "sandbox-11283"
}
```

```json
{
  "session_id": "f6415f42-5be1-4025-9cd7-f101c56f2640",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDAyMCwiaWF0IjoxNzkzMzUzMTIwLCJqdGkiOiJhMDZhNDE4MS0zODAwLTQyNjYtOTJiNC0wNDk0MTYzNzdlMGQiLCJzaWQiOiJmNjQxNWY0Mi01YmUxLTQwMjUtOWNkNy1mMTAxYzU2ZjI2NDAifQ.MgOOkvHxYW04f6YNVRhqZUFCjcfOaGTrVBx9bBP0LiM",
  "access_expires_at": "2026-10-30T09:53:40.117005301Z",
  "refresh_token": "cIhYQt4VklhS9fEHQCryV2FXZJgD4RZF9V7KD6bSsf4",
  "refresh_expires_at": "2026-11-29T09:38:40.116409423Z",
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
  "command_id": "bd2e2ec2-c120-4189-97a1-cd0e59f68f86",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:38:40Z",
    "sequence": 1793353120723
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b3162626-cb15-47ee-8c1d-eb67a37e3dbf",
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
  "last_heartbeat_at": "2026-10-30T09:38:40.744422Z",
  "last_location_at": "2026-10-30T09:38:40.744422Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "3b9550c2-d296-4257-b9c4-accad49f130d",
      "short_number": 24,
      "pickup_at": "2026-10-30T12:38:37Z",
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

`POST /api/driver/v1/preorders/3b9550c2-d296-4257-b9c4-accad49f130d/reserve` → **200**

```json
{
  "command_id": "d9783a95-5fcd-4fa3-9709-f8cdefa1ccfb"
}
```

```json
{
  "id": "28889d42-e36f-4764-b089-ae14ccab13dc",
  "state": "RESERVED",
  "order": {
    "order_id": "3b9550c2-d296-4257-b9c4-accad49f130d",
    "short_number": 24,
    "pickup_at": "2026-10-30T12:38:37Z",
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
  "reserved_at": "2026-10-30T09:38:41.440608Z",
  "confirm_from": "2026-10-30T12:08:37Z",
  "confirm_until": "2026-10-30T12:18:37Z",
  "drop_until": "2026-10-30T11:38:37Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "28889d42-e36f-4764-b089-ae14ccab13dc",
      "state": "RESERVED",
      "order": {
        "order_id": "3b9550c2-d296-4257-b9c4-accad49f130d",
        "short_number": 24,
        "pickup_at": "2026-10-30T12:38:37Z",
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
      "reserved_at": "2026-10-30T09:38:41.440608Z",
      "confirm_from": "2026-10-30T12:08:37Z",
      "confirm_until": "2026-10-30T12:18:37Z",
      "drop_until": "2026-10-30T11:38:37Z"
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
      "id": "28889d42-e36f-4764-b089-ae14ccab13dc",
      "state": "RESERVED",
      "order": {
        "order_id": "3b9550c2-d296-4257-b9c4-accad49f130d",
        "short_number": 24,
        "pickup_at": "2026-10-30T12:38:37Z",
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
      "reserved_at": "2026-10-30T09:38:41.440608Z",
      "confirm_from": "2026-10-30T12:08:37Z",
      "confirm_until": "2026-10-30T12:18:37Z",
      "drop_until": "2026-10-30T11:38:37Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/28889d42-e36f-4764-b089-ae14ccab13dc/confirm` → **409**

```json
{
  "command_id": "a847d853-93c9-4f5f-b87c-3f8790cbd774"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/28889d42-e36f-4764-b089-ae14ccab13dc/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "9e4b5b6d-25d6-4f75-97a7-8c71b13631b6"
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
  "session_id": "500b3e1c-24b4-413d-80dd-d6fc7cf242d1",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQwMjIsImlhdCI6MTc5MzM1MzEyMiwianRpIjoiMmUyZDVmYmQtNjVmYy00Zjc4LTlkMjUtZGRlZTY2YmRmOWRlIiwic2lkIjoiNTAwYjNlMWMtMjRiNC00MTNkLTgwZGQtZDZmYzdjZjI0MmQxIn0.5lt3igBUXysdOveXKE70cCQtzOFzl0p8EAdXyR0huZU",
  "access_expires_at": "2026-10-30T09:53:42.88262635Z",
  "refresh_token": "jmBKyK7VoDVCtc4-QUY3NY7p4YYJFftZI9w_G6UQkCo",
  "refresh_expires_at": "2026-10-30T21:38:42.881848804Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/3b9550c2-d296-4257-b9c4-accad49f130d` → **200**

```json
{
  "id": "3b9550c2-d296-4257-b9c4-accad49f130d",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "72749061-0c0e-4996-8b6a-6ac9e88c4ecb",
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
  "created_at": "2026-10-30T09:38:39.490068Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T12:38:37Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "28889d42-e36f-4764-b089-ae14ccab13dc",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T09:38:41.440608Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/3b9550c2-d296-4257-b9c4-accad49f130d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T09:38:39.491199Z",
      "actor": {
        "type": "CLIENT",
        "id": "72749061-0c0e-4996-8b6a-6ac9e88c4ecb",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "3b9550c2-d296-4257-b9c4-accad49f130d",
        "preorder": true,
        "quote_id": "e2063d8f-732d-4b6a-b1a6-511b4f492150",
        "pickup_at": "2026-10-30T12:38:37Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "fa102b31-b1c8-48b1-8b0a-1eacc3e5b150"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T09:38:41.442168Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3b9550c2-d296-4257-b9c4-accad49f130d",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "28889d42-e36f-4764-b089-ae14ccab13dc"
      },
      "correlation_id": "846f0bfb-83f7-445f-b97e-200596597397"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 3b9550c2-d296-4257-b9c4-accad49f130d, reservation 28889d42-e36f-4764-b089-ae14ccab13dc.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-19760"
}
```

```json
{
  "challenge_id": "75043373-7527-4bac-8156-0f9f21d48583",
  "expires_at": "2026-10-30T09:43:43.798035706Z",
  "resend_available_at": "2026-10-30T09:38:44.798035706Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "573980",
  "sent_at": "2026-10-30T09:38:43.800854767Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "75043373-7527-4bac-8156-0f9f21d48583",
  "code": "573980",
  "device_ref": "sandbox-19760"
}
```

```json
{
  "session_id": "8ebc27b7-b8f6-4b9d-a9f9-dacfb88cfc67",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDAyNCwiaWF0IjoxNzkzMzUzMTI0LCJqdGkiOiIxZDEyY2U4YS1kZDkwLTQ4YWYtOGE2Mi1lYmNlOWU2MWY2NGIiLCJzaWQiOiI4ZWJjMjdiNy1iOGY2LTRiOWQtYTlmOS1kYWNmYjg4Y2ZjNjcifQ.NhIm6FGQg303BAaVoVwF42FAoNzhPWjHFhMvG9lRJeY",
  "access_expires_at": "2026-10-30T09:53:44.133202696Z",
  "refresh_token": "SkrgEERm93MSi6W4dEc0LF1QlYGhvfSfInHDXZECSsM",
  "refresh_expires_at": "2026-11-29T09:38:44.132558459Z",
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
  "command_id": "36314c44-b650-443d-9fef-24636231584b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:38:44Z",
    "sequence": 1793353124690
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bf244294-d206-4e2f-97b2-4ea6d6dfa772",
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
  "last_heartbeat_at": "2026-10-30T09:38:44.708767Z",
  "last_location_at": "2026-10-30T09:38:44.708767Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676167493",
  "device_ref": "sandbox-4502"
}
```

```json
{
  "challenge_id": "a55e4141-7428-4f39-ae26-f91e9591309e",
  "expires_at": "2026-10-30T09:43:44.992107799Z",
  "resend_available_at": "2026-10-30T09:38:45.992107799Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676167493` → **200**

```json
{
  "phone": "+380676167493",
  "audience": "CLIENT",
  "code": "496000",
  "sent_at": "2026-10-30T09:38:45.010757368Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a55e4141-7428-4f39-ae26-f91e9591309e",
  "code": "496000",
  "device_ref": "sandbox-4502"
}
```

```json
{
  "session_id": "3e458612-7c85-4e67-b1a9-e0613b20e0f4",
  "subject": {
    "type": "CLIENT",
    "id": "50e066a2-fe39-450d-bfea-5f49a83b135e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGUwNjZhMi1mZTM5LTQ1MGQtYmZlYS01ZjQ5YTgzYjEzNWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0MDI1LCJpYXQiOjE3OTMzNTMxMjUsImp0aSI6ImU2YjZkMjhiLWQ5YjUtNGM1NS1hMzVhLTRkZDczMjAwZjIxMiIsInNpZCI6IjNlNDU4NjEyLTdjODUtNGU2Ny1iMWE5LWUwNjEzYjIwZTBmNCJ9.TpY1Dt53xqw7lN3nQ8ONVkQz-9TYRgyGaAr4oWnG4kE",
  "access_expires_at": "2026-10-30T09:53:45.324906632Z",
  "refresh_token": "HK32gyWYzSW-QVaAULDMKJ2C2AsH3VHP-XES_nkRyWQ",
  "refresh_expires_at": "2026-11-29T09:38:45.324089571Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6859bd1d-08ac-48b2-9a33-46339c18f26d",
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
  "id": "26a92a35-438f-4051-9b35-941da390348d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:43:45.630629Z",
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
  "command_id": "38f18aaf-b141-4939-97e2-10715dc5af8b",
  "quote_id": "26a92a35-438f-4051-9b35-941da390348d",
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
  "id": "99c69278-6360-41a2-b40f-93aa0353667a",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "50e066a2-fe39-450d-bfea-5f49a83b135e",
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
  "created_at": "2026-10-30T09:38:45.939754Z",
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
    "id": "3c51123e-1a67-4b4b-9d0d-13544aa11df3",
    "order_id": "99c69278-6360-41a2-b40f-93aa0353667a",
    "expires_at": "2026-10-30T09:39:00.943318Z",
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

`POST /api/driver/v1/offers/3c51123e-1a67-4b4b-9d0d-13544aa11df3/accept` → **200**

```json
{
  "command_id": "3f88fc5f-80d4-484d-882e-471543f0e459"
}
```

```json
{
  "id": "147b3fe8-77fa-487b-90ff-5dff6cabc69a",
  "order_id": "99c69278-6360-41a2-b40f-93aa0353667a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d20721e4-94b0-4ed3-be3f-41cf00b7e2b6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d20721e4-94b0-4ed3-be3f-41cf00b7e2b6",
  "order_id": "99c69278-6360-41a2-b40f-93aa0353667a",
  "assignment_id": "147b3fe8-77fa-487b-90ff-5dff6cabc69a",
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

`POST /api/driver/v1/work-sessions/bf244294-d206-4e2f-97b2-4ea6d6dfa772/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:38:47Z",
    "sequence": 1793353127123
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bf244294-d206-4e2f-97b2-4ea6d6dfa772",
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
  "last_heartbeat_at": "2026-10-30T09:38:47.142266Z",
  "last_location_at": "2026-10-30T09:38:47.142266Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d20721e4-94b0-4ed3-be3f-41cf00b7e2b6",
  "order_id": "99c69278-6360-41a2-b40f-93aa0353667a",
  "assignment_id": "147b3fe8-77fa-487b-90ff-5dff6cabc69a",
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

`POST /api/driver/v1/trips/d20721e4-94b0-4ed3-be3f-41cf00b7e2b6/arrive` → **200**

```json
{
  "command_id": "15bb1b39-38b9-48c0-9d05-28c8b3d4614a",
  "expected_version": 0
}
```

```json
{
  "id": "d20721e4-94b0-4ed3-be3f-41cf00b7e2b6",
  "order_id": "99c69278-6360-41a2-b40f-93aa0353667a",
  "assignment_id": "147b3fe8-77fa-487b-90ff-5dff6cabc69a",
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
  "arrived_at": "2026-10-30T09:38:47.724622Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d20721e4-94b0-4ed3-be3f-41cf00b7e2b6/start` → **200**

```json
{
  "command_id": "163d4cf5-22ef-43f3-ac49-0d9e024483e5",
  "expected_version": 1
}
```

```json
{
  "id": "d20721e4-94b0-4ed3-be3f-41cf00b7e2b6",
  "order_id": "99c69278-6360-41a2-b40f-93aa0353667a",
  "assignment_id": "147b3fe8-77fa-487b-90ff-5dff6cabc69a",
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
  "arrived_at": "2026-10-30T09:38:47.724622Z",
  "started_at": "2026-10-30T09:38:48.018028Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/bf244294-d206-4e2f-97b2-4ea6d6dfa772/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:38:48Z",
    "sequence": 1793353128306
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bf244294-d206-4e2f-97b2-4ea6d6dfa772",
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
  "last_heartbeat_at": "2026-10-30T09:38:48.327304Z",
  "last_location_at": "2026-10-30T09:38:48.327304Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/d20721e4-94b0-4ed3-be3f-41cf00b7e2b6/complete` → **200**

```json
{
  "command_id": "1f83af79-a4f2-489b-8bd5-f0c12ed772e6",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:38:48Z",
  "cash_received": true
}
```

```json
{
  "id": "d20721e4-94b0-4ed3-be3f-41cf00b7e2b6",
  "order_id": "99c69278-6360-41a2-b40f-93aa0353667a",
  "assignment_id": "147b3fe8-77fa-487b-90ff-5dff6cabc69a",
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
  "arrived_at": "2026-10-30T09:38:47.724622Z",
  "started_at": "2026-10-30T09:38:48.018028Z",
  "completed_at": "2026-10-30T09:38:48.621603Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/99c69278-6360-41a2-b40f-93aa0353667a/rating` → **200**

```json
{
  "command_id": "9ee14fce-737c-416b-a2e4-18fa60b82f81",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "99c69278-6360-41a2-b40f-93aa0353667a",
  "score": 5,
  "created_at": "2026-10-30T09:38:48.940345699Z"
}
```

`POST /api/driver/v1/orders/99c69278-6360-41a2-b40f-93aa0353667a/rating` → **200**

```json
{
  "command_id": "e6f3af9f-7664-4a2e-a418-958b5541b219",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "99c69278-6360-41a2-b40f-93aa0353667a",
  "score": 4,
  "created_at": "2026-10-30T09:38:49.260731808Z"
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
  "session_id": "fc71b618-7d43-4f40-b518-4b5204fbf308",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQwMzAsImlhdCI6MTc5MzM1MzEzMCwianRpIjoiMDI0OGM0MTItZThkNS00NjA5LThjNTUtNWE0ZTRiZGQzN2JlIiwic2lkIjoiZmM3MWI2MTgtN2Q0My00ZjQwLWI1MTgtNGI1MjA0ZmJmMzA4In0.FJL91q8QOf4J0v1BMmhtrKHDxEwGzICvGOF_NWT3VHw",
  "access_expires_at": "2026-10-30T09:53:50.134028427Z",
  "refresh_token": "Vg_ApM7pG5qfaRP2t1mfIGa2mRN6I2fF84EuzcT9Cyw",
  "refresh_expires_at": "2026-10-30T21:38:50.133311864Z",
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
  "session_id": "2e619789-f7d6-40a8-b0dc-ee13d4c98f0c",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQwMzAsImlhdCI6MTc5MzM1MzEzMCwianRpIjoiY2RjMTNlMDItYTk4Ny00ZmFlLThjNWUtMTk1M2I0NThhYjBmIiwic2lkIjoiMmU2MTk3ODktZjdkNi00MGE4LWIwZGMtZWUxM2Q0Yzk4ZjBjIn0.AtOsskaKhunhvlYfk74LIsEWDhfYhSS3W7q8D1M1UdU",
  "access_expires_at": "2026-10-30T09:53:50.727621243Z",
  "refresh_token": "lSOf2FGnAZJYojni0lJL0eDKhBEVBXty7_Ib0bF8Xkw",
  "refresh_expires_at": "2026-10-30T21:38:50.726938474Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/99c69278-6360-41a2-b40f-93aa0353667a/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "99c69278-6360-41a2-b40f-93aa0353667a",
      "author_type": "RIDER",
      "author_id": "50e066a2-fe39-450d-bfea-5f49a83b135e",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T09:38:48.940346Z"
    },
    {
      "order_id": "99c69278-6360-41a2-b40f-93aa0353667a",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "50e066a2-fe39-450d-bfea-5f49a83b135e",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T09:38:49.260732Z"
    }
  ]
}
```

Done: ratings for order 99c69278-6360-41a2-b40f-93aa0353667a.

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
  "session_id": "2a67e258-b6d4-4c74-be47-b6c5c1e88c25",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQwMzEsImlhdCI6MTc5MzM1MzEzMSwianRpIjoiMGVmYTY3NWMtMWRiZi00YzE4LTk5MGItNzNkNGFlZmRlZmRiIiwic2lkIjoiMmE2N2UyNTgtYjZkNC00Yzc0LWJlNDctYjZjNWMxZTg4YzI1In0.QYwmyH0M0Nm8yimaQBIAnVSboYZC-GnwtBuV_IxT9QA",
  "access_expires_at": "2026-10-30T09:53:51.618049886Z",
  "refresh_token": "bGvyE_YyQRYFuIPtfUk8CQkTYJqPHL-GsFD-LaMqQz8",
  "refresh_expires_at": "2026-10-30T21:38:51.617495037Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "e53ef116-3ff7-4b86-8a84-b19ce55734de",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "30024f61-b785-4f29-8e78-d26e72656ccf",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:38:51.901749Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/30024f61-b785-4f29-8e78-d26e72656ccf` → **200**

```json
{
  "id": "30024f61-b785-4f29-8e78-d26e72656ccf",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:38:51.901749Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/30024f61-b785-4f29-8e78-d26e72656ccf` → **200**

```json
{
  "id": "30024f61-b785-4f29-8e78-d26e72656ccf",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:38:51.901749Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/30024f61-b785-4f29-8e78-d26e72656ccf` → **200**

```json
{
  "id": "30024f61-b785-4f29-8e78-d26e72656ccf",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:38:51.901749Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/30024f61-b785-4f29-8e78-d26e72656ccf` → **200**

```json
{
  "id": "30024f61-b785-4f29-8e78-d26e72656ccf",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T09:38:51.901749Z",
  "ready_at": "2026-10-30T09:38:54.855301Z",
  "expires_at": "2026-10-31T09:38:54.855301Z"
}
```

`GET /api/admin/v1/reports/exports/30024f61-b785-4f29-8e78-d26e72656ccf/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "d852fc94-1c44-4b75-945f-23b25f0ce2f3",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "da0f08ca-8dee-4a43-8309-3ffa2800f382",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:38:56.386698Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/da0f08ca-8dee-4a43-8309-3ffa2800f382` → **200**

```json
{
  "id": "da0f08ca-8dee-4a43-8309-3ffa2800f382",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:38:56.386698Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/da0f08ca-8dee-4a43-8309-3ffa2800f382` → **200**

```json
{
  "id": "da0f08ca-8dee-4a43-8309-3ffa2800f382",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:38:56.386698Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/da0f08ca-8dee-4a43-8309-3ffa2800f382` → **200**

```json
{
  "id": "da0f08ca-8dee-4a43-8309-3ffa2800f382",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:38:56.386698Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/da0f08ca-8dee-4a43-8309-3ffa2800f382` → **200**

```json
{
  "id": "da0f08ca-8dee-4a43-8309-3ffa2800f382",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T09:38:56.386698Z",
  "ready_at": "2026-10-30T09:38:59.864462Z",
  "expires_at": "2026-10-31T09:38:59.864462Z"
}
```

`GET /api/admin/v1/reports/exports/da0f08ca-8dee-4a43-8309-3ffa2800f382/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/0e49ebc7-1023-40dc-b161-3edc587efd08` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/0e49ebc7-1023-40dc-b161-3edc587efd08",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "41442d20-4797-4f85-a6d9-e73a38e2a5ec"
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
  "device_ref": "sandbox-28473"
}
```

```json
{
  "challenge_id": "6d7e7dfc-2248-43fe-b6ac-6ac744503bb7",
  "expires_at": "2026-10-30T09:44:01.124498786Z",
  "resend_available_at": "2026-10-30T09:39:02.124498786Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "640191",
  "sent_at": "2026-10-30T09:39:01.127389774Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6d7e7dfc-2248-43fe-b6ac-6ac744503bb7",
  "code": "640191",
  "device_ref": "sandbox-28473"
}
```

```json
{
  "session_id": "a1d3871d-b198-4685-b656-22504bec1d83",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDA0MSwiaWF0IjoxNzkzMzUzMTQxLCJqdGkiOiIyYTI1ZDg4Ny0wOWIwLTQ5ZmMtYmVkMS0zMDA1MWJiNDU0ZWIiLCJzaWQiOiJhMWQzODcxZC1iMTk4LTQ2ODUtYjY1Ni0yMjUwNGJlYzFkODMifQ.OmMdrykkfys9a3_ESScelW7ollDZBqfEfZg1ufFzuBw",
  "access_expires_at": "2026-10-30T09:54:01.42612026Z",
  "refresh_token": "zqTSoGNFL-z92LWfrphUDz6v7mDr88rF0EW30hjQJx8",
  "refresh_expires_at": "2026-11-29T09:39:01.425555682Z",
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
  "command_id": "50e54822-813d-4005-9634-67dd98abac04",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:39:02Z",
    "sequence": 1793353142276
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0d4bc9e0-75a9-4412-a191-256f8e18b4af",
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
  "last_heartbeat_at": "2026-10-30T09:39:02.295123Z",
  "last_location_at": "2026-10-30T09:39:02.295123Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "57a8c239-c7e3-4ea9-aa75-fdaa2f61573e",
  "points": [
    {
      "sequence": 1793353144582,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T09:38:04Z"
    },
    {
      "sequence": 1793353144590,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T09:39:04Z"
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
  "session_id": "94ed2518-8c42-4c7b-83fc-6132d0a989a4",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQwNDUsImlhdCI6MTc5MzM1MzE0NSwianRpIjoiMjBjMTE5YWYtMTc0ZC00MjBlLWJjNWQtNTU4NzY2Y2M5NjJjIiwic2lkIjoiOTRlZDI1MTgtOGM0Mi00YzdiLTgzZmMtNjEzMmQwYTk4OWE0In0.g_8sf62kB91opuNW4HFs81-ZXxOGRYDmuyk_J2FFdh0",
  "access_expires_at": "2026-10-30T09:54:05.206622387Z",
  "refresh_token": "m9oXbh_5esevBDdBVs9xltog4RpWcNAYl3HGIaOKV9c",
  "refresh_expires_at": "2026-10-30T21:39:05.206099738Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "9290c600-1d45-4bde-b2c7-cd59df646a9e",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T09:39:04Z",
        "track_point_id": "63111809-3873-4de9-a0f6-add4a68dc384",
        "work_session_id": "0d4bc9e0-75a9-4412-a191-256f8e18b4af"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T09:39:04Z",
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

`POST /api/admin/v1/driver-risk-flags/9290c600-1d45-4bde-b2c7-cd59df646a9e/confirm` → **200**

```json
{
  "command_id": "c9757ca3-308d-4d00-8740-6a2724014568",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "9290c600-1d45-4bde-b2c7-cd59df646a9e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T09:39:04Z",
    "track_point_id": "63111809-3873-4de9-a0f6-add4a68dc384",
    "work_session_id": "0d4bc9e0-75a9-4412-a191-256f8e18b4af"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T09:39:04Z",
  "reason": null,
  "reviewed_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
  "reviewed_at": "2026-10-30T09:39:06.107818Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/9290c600-1d45-4bde-b2c7-cd59df646a9e/dismiss` → **409**

```json
{
  "command_id": "ae6bfbb9-6ef3-4f05-b192-630f0a382cfd",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/9290c600-1d45-4bde-b2c7-cd59df646a9e/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a971fdb3-94e1-4cf1-910a-cc650be752a7"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "0413b6bb-c931-4479-8b96-ffad8aaa1cf1",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "8d7e76b4-9693-4646-82cd-84026342e0f4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
  "raised_at": "2026-10-30T09:39:06.708588Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/8d7e76b4-9693-4646-82cd-84026342e0f4/dismiss` → **200**

```json
{
  "command_id": "8718fb7e-2e0e-4911-86f4-fa36b7db6c34",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "8d7e76b4-9693-4646-82cd-84026342e0f4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
  "raised_at": "2026-10-30T09:39:06.708588Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
  "reviewed_at": "2026-10-30T09:39:07.011509Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "20f77ef5-fa91-4aec-8447-8c1e4082ebfe",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "9290c600-1d45-4bde-b2c7-cd59df646a9e"
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
      "actor_id": "f621c4f1-9b6e-41a5-939b-44be51548e85",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T09:39:07.320473Z"
    }
  ]
}
```

Done: flag 9290c600-1d45-4bde-b2c7-cd59df646a9e confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "181b97f6-8d4c-472c-82f1-2dedc877efb3",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQwNDgsImlhdCI6MTc5MzM1MzE0OCwianRpIjoiODA5ODQzMTAtOWRmNi00ZGZmLThlZmMtY2U1YTQ5YzgyM2EyIiwic2lkIjoiMTgxYjk3ZjYtOGQ0Yy00NzJjLTgyZjEtMmRlZGM4NzdlZmIzIn0.Ov_3bgCnxoRb450zXuLXJwHhNQHH_l15uLg_atJ6_J8",
  "access_expires_at": "2026-10-30T09:54:08.196275376Z",
  "refresh_token": "22YA2jVXoEqEwAcXlrrWbj1_htEvytuxsZVdGy8NItE",
  "refresh_expires_at": "2026-10-30T21:39:08.195655703Z",
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
      "actor_id": "f621c4f1-9b6e-41a5-939b-44be51548e85",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T09:39:07.320473Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "207a0cef-08a8-4e2b-a369-b51ea24c0889",
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
  "session_id": "0d4bc9e0-75a9-4412-a191-256f8e18b4af",
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
  "last_heartbeat_at": "2026-10-30T09:39:02.295123Z",
  "last_location_at": "2026-10-30T09:39:02.295123Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0d4bc9e0-75a9-4412-a191-256f8e18b4af/close` → **200**

```json
{
  "command_id": "d19371be-93b6-48d2-8e30-0e1c0e649cce",
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
  "session_id": "199e995d-62f2-4d36-bf6a-341dbde15d86",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQwNDksImlhdCI6MTc5MzM1MzE0OSwianRpIjoiMmZmMjMwYjUtN2QwNy00OTViLTk1YzUtOTk2MmNiYzYyNjAwIiwic2lkIjoiMTk5ZTk5NWQtNjJmMi00ZDM2LWJmNmEtMzQxZGJkZTE1ZDg2In0.TCUt7rr-_z_33rZQWm0vmUjeMvBYDetQIy8T8DPFbP8",
  "access_expires_at": "2026-10-30T09:54:09.98268348Z",
  "refresh_token": "K3SSuiuNjQ7aYJ_GjvOCEbaaAIKMJ9UWrHCdYMjOhsk",
  "refresh_expires_at": "2026-10-30T21:39:09.982139921Z",
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
  "command_id": "1c79e95d-00bc-42bd-a95c-b0c943fd8ee0",
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
  "changed_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T09:39:10.569674Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "1c79e95d-00bc-42bd-a95c-b0c943fd8ee0",
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
  "changed_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T09:39:10.569674Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48237334184",
  "device_ref": "sandbox-15566"
}
```

```json
{
  "challenge_id": "22a41482-7b40-4b64-918f-f96f3efb761d",
  "expires_at": "2026-10-30T09:44:11.200090354Z",
  "resend_available_at": "2026-10-30T09:39:12.200090354Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48237334184` → **200**

```json
{
  "phone": "+48237334184",
  "audience": "CLIENT",
  "code": "626173",
  "sent_at": "2026-10-30T09:39:11.204018926Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "22a41482-7b40-4b64-918f-f96f3efb761d",
  "code": "626173",
  "device_ref": "sandbox-15566"
}
```

```json
{
  "session_id": "7c49ea8b-f26c-4c79-a8d7-66b11a7566e9",
  "subject": {
    "type": "CLIENT",
    "id": "84eabde3-74af-4cec-a001-c0268ddfe6b5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NGVhYmRlMy03NGFmLTRjZWMtYTAwMS1jMDI2OGRkZmU2YjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0MDUxLCJpYXQiOjE3OTMzNTMxNTEsImp0aSI6IjhmNGUxYTIxLTYzMTUtNDNlMC05MTlkLTRlYTExMGUwOWViMSIsInNpZCI6IjdjNDllYThiLWYyNmMtNGM3OS1hOGQ3LTY2YjExYTc1NjZlOSJ9.wVi5Xj1LwmG_sW7T3ngAT318bMz9SlNDt8FDYIbktJQ",
  "access_expires_at": "2026-10-30T09:54:11.530241505Z",
  "refresh_token": "bKlZx0H2XJZ7ZqeJeajOmhPGAHfwNMZYK1fKQWRfgJ8",
  "refresh_expires_at": "2026-11-29T09:39:11.529706091Z",
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
  "correlation_id": "14a3abcf-d4f7-4cab-a521-4910778b6327"
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
  "device_ref": "sandbox-15873"
}
```

```json
{
  "challenge_id": "e6f63368-3f7d-4238-bf34-1505a9451881",
  "expires_at": "2026-10-30T09:44:12.392125269Z",
  "resend_available_at": "2026-10-30T09:39:13.392125269Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "720007",
  "sent_at": "2026-10-30T09:39:12.395449136Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e6f63368-3f7d-4238-bf34-1505a9451881",
  "code": "720007",
  "device_ref": "sandbox-15873"
}
```

```json
{
  "session_id": "41724cd6-e268-4b65-b2a8-9d2b1b076d37",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDA1MiwiaWF0IjoxNzkzMzUzMTUyLCJqdGkiOiI1YTViMDU2Mi04OTNmLTRmYWEtOGJiMC01ZGZiOTlmMWNlMjciLCJzaWQiOiI0MTcyNGNkNi1lMjY4LTRiNjUtYjJhOC05ZDJiMWIwNzZkMzcifQ.-hlP6Dhq3AU9Fb3M9vYG9OR-HS9i1HgufrJ9Xxgc1Fg",
  "access_expires_at": "2026-10-30T09:54:12.701083511Z",
  "refresh_token": "Wsqvdpzcq0qHMZ62SQVmhckhIf5UjQxhMI4E-j_ECB8",
  "refresh_expires_at": "2026-11-29T09:39:12.700511399Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b3162626-cb15-47ee-8c1d-eb67a37e3dbf",
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
  "last_heartbeat_at": "2026-10-30T09:38:40.744422Z",
  "last_location_at": "2026-10-30T09:38:40.744422Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b3162626-cb15-47ee-8c1d-eb67a37e3dbf/handover` → **200**

```json
{
  "command_id": "d7b228d1-367d-4e92-9e4c-63062925851e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b3162626-cb15-47ee-8c1d-eb67a37e3dbf",
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
  "last_heartbeat_at": "2026-10-30T09:38:40.744422Z",
  "last_location_at": "2026-10-30T09:38:40.744422Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b3162626-cb15-47ee-8c1d-eb67a37e3dbf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:39:13Z",
    "sequence": 1793353153550
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b3162626-cb15-47ee-8c1d-eb67a37e3dbf",
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
  "last_heartbeat_at": "2026-10-30T09:39:13.568709Z",
  "last_location_at": "2026-10-30T09:39:13.568709Z",
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
  "session_id": "b3162626-cb15-47ee-8c1d-eb67a37e3dbf",
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
  "last_heartbeat_at": "2026-10-30T09:39:13.568709Z",
  "last_location_at": "2026-10-30T09:39:13.568709Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b3162626-cb15-47ee-8c1d-eb67a37e3dbf/close` → **200**

```json
{
  "command_id": "c4515754-4b93-4c97-9c8f-f24d9fdfe176",
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
  "correlation_id": "50e2cf34-394a-40a8-bec0-4bae2c9c0c4d"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674839187",
  "device_ref": "sandbox-12299"
}
```

```json
{
  "challenge_id": "ddeea9cd-209f-4da8-a4da-e0100e90e2f8",
  "expires_at": "2026-10-30T09:44:15.041387252Z",
  "resend_available_at": "2026-10-30T09:39:16.041387252Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674839187` → **200**

```json
{
  "phone": "+380674839187",
  "audience": "CLIENT",
  "code": "460122",
  "sent_at": "2026-10-30T09:39:15.04411793Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ddeea9cd-209f-4da8-a4da-e0100e90e2f8",
  "code": "460122",
  "device_ref": "sandbox-12299"
}
```

```json
{
  "session_id": "681dc18c-cbdb-46ac-bdf5-d15320745478",
  "subject": {
    "type": "CLIENT",
    "id": "38ee7e16-8b3b-47c1-b5dc-85d0d35f1648"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOGVlN2UxNi04YjNiLTQ3YzEtYjVkYy04NWQwZDM1ZjE2NDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0MDU1LCJpYXQiOjE3OTMzNTMxNTUsImp0aSI6ImZhNWM3ZDk1LTBjODItNGQ4Yy04MDk5LTE5Y2Q3OTJmZWYyNSIsInNpZCI6IjY4MWRjMThjLWNiZGItNDZhYy1iZGY1LWQxNTMyMDc0NTQ3OCJ9.YxZPQAeyon_GWn1YQZK76KZ7X-C-jZPxCXVxpkYQwA0",
  "access_expires_at": "2026-10-30T09:54:15.347247901Z",
  "refresh_token": "SFPyaz6AVTrF-oBLQekoP2qlZEOR6bZcO6Xp0v1GBgo",
  "refresh_expires_at": "2026-11-29T09:39:15.346726534Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "e7310daa-4c55-45c3-be8e-b52e4f1b4582",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "03e71060-237f-4fc7-96e0-e800485463cb",
  "upload_path": "/api/rider/v1/uploads/03e71060-237f-4fc7-96e0-e800485463cb",
  "expires_at": "2026-10-30T09:54:15.646574911Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/03e71060-237f-4fc7-96e0-e800485463cb` → **200**

```json
{
  "file_id": "03e71060-237f-4fc7-96e0-e800485463cb",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "82daec48-bdf2-43c1-91db-2bc5094fdb12",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "03e71060-237f-4fc7-96e0-e800485463cb"
  ]
}
```

```json
{
  "id": "a4a5cece-5165-4d25-841a-4a71452f9c2d",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "38ee7e16-8b3b-47c1-b5dc-85d0d35f1648",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T09:39:15.978938Z",
  "updated_at": "2026-10-30T09:39:15.978938Z",
  "respond_by": "2026-10-30T13:39:15.978938Z",
  "messages": [
    {
      "id": "51f6e2ef-86f7-4941-819f-6aa43848711c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "38ee7e16-8b3b-47c1-b5dc-85d0d35f1648",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T09:39:15.979867Z",
      "attachments": [
        {
          "file_id": "03e71060-237f-4fc7-96e0-e800485463cb",
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
  "session_id": "3e34ec40-4ef2-466b-9598-7913d49eab40",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQwNTYsImlhdCI6MTc5MzM1MzE1NiwianRpIjoiYTc2ZjIwYTktYWM0OS00OTFiLTkzNWItNGYzMzdiMmRmZGY1Iiwic2lkIjoiM2UzNGVjNDAtNGVmMi00NjZiLTk1OTgtNzkxM2Q0OWVhYjQwIn0.UYu857GIq96IYgw_m47Pcb-xZTiKsFM5ubdGuKdNV34",
  "access_expires_at": "2026-10-30T09:54:16.581685935Z",
  "refresh_token": "egQitXK27BEPfTSymG4QDywYD1za3cr2ycDWJ6d2EXo",
  "refresh_expires_at": "2026-10-30T21:39:16.581190547Z",
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
  "session_id": "841ea1e3-a5e4-4cdb-b063-3e6544b6cbd9",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQwNTcsImlhdCI6MTc5MzM1MzE1NywianRpIjoiNmMyMWQ2NGYtZTczYy00MmIyLWFhZTAtOWYwYjA0OWNiMjE5Iiwic2lkIjoiODQxZWExZTMtYTVlNC00Y2RiLWIwNjMtM2U2NTQ0YjZjYmQ5In0.0naT7vpGrLAd0MIe08oB7sujw38AI7XHpyaxNjNeSJ8",
  "access_expires_at": "2026-10-30T09:54:17.173344954Z",
  "refresh_token": "CxOBEFFyNE7CwDGbgPaMXwG6CqNMGwgpizs7V5ZHxWQ",
  "refresh_expires_at": "2026-10-30T21:39:17.172731334Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/a4a5cece-5165-4d25-841a-4a71452f9c2d/attachments/03e71060-237f-4fc7-96e0-e800485463cb` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "622c715f-9f07-47e7-ad66-1f1fa207c8af",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "4fcb1ba3-3dc7-4fc8-954d-46ce9a068284",
  "upload_path": "/api/operator/v1/uploads/4fcb1ba3-3dc7-4fc8-954d-46ce9a068284",
  "expires_at": "2026-10-30T09:54:17.472589008Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/4fcb1ba3-3dc7-4fc8-954d-46ce9a068284` → **200**

```json
{
  "file_id": "4fcb1ba3-3dc7-4fc8-954d-46ce9a068284",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/a4a5cece-5165-4d25-841a-4a71452f9c2d` → **200**

```json
{
  "id": "a4a5cece-5165-4d25-841a-4a71452f9c2d",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "38ee7e16-8b3b-47c1-b5dc-85d0d35f1648",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T09:39:15.978938Z",
  "updated_at": "2026-10-30T09:39:15.978938Z",
  "respond_by": "2026-10-30T13:39:15.978938Z",
  "messages": [
    {
      "id": "51f6e2ef-86f7-4941-819f-6aa43848711c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "38ee7e16-8b3b-47c1-b5dc-85d0d35f1648",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T09:39:15.979867Z",
      "attachments": [
        {
          "file_id": "03e71060-237f-4fc7-96e0-e800485463cb",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/a4a5cece-5165-4d25-841a-4a71452f9c2d/comments` → **200**

```json
{
  "command_id": "2dd7df1a-f1ec-4211-9a21-2606f67cecec",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "4fcb1ba3-3dc7-4fc8-954d-46ce9a068284"
  ]
}
```

```json
{
  "id": "a4a5cece-5165-4d25-841a-4a71452f9c2d",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "38ee7e16-8b3b-47c1-b5dc-85d0d35f1648",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T09:39:15.978938Z",
  "updated_at": "2026-10-30T09:39:18.084569Z",
  "respond_by": "2026-10-30T13:39:15.978938Z",
  "messages": [
    {
      "id": "51f6e2ef-86f7-4941-819f-6aa43848711c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "38ee7e16-8b3b-47c1-b5dc-85d0d35f1648",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T09:39:15.979867Z",
      "attachments": [
        {
          "file_id": "03e71060-237f-4fc7-96e0-e800485463cb",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "ef69bea0-c223-4400-976d-9480dd35bfad",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "f621c4f1-9b6e-41a5-939b-44be51548e85",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T09:39:18.084129Z",
      "attachments": [
        {
          "file_id": "4fcb1ba3-3dc7-4fc8-954d-46ce9a068284",
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

`GET /api/rider/v1/support/cases/a4a5cece-5165-4d25-841a-4a71452f9c2d` → **200**

```json
{
  "id": "a4a5cece-5165-4d25-841a-4a71452f9c2d",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "38ee7e16-8b3b-47c1-b5dc-85d0d35f1648",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T09:39:15.978938Z",
  "updated_at": "2026-10-30T09:39:18.084569Z",
  "respond_by": "2026-10-30T13:39:15.978938Z",
  "messages": [
    {
      "id": "51f6e2ef-86f7-4941-819f-6aa43848711c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "38ee7e16-8b3b-47c1-b5dc-85d0d35f1648",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T09:39:15.979867Z",
      "attachments": [
        {
          "file_id": "03e71060-237f-4fc7-96e0-e800485463cb",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "ef69bea0-c223-4400-976d-9480dd35bfad",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T09:39:18.084129Z",
      "attachments": [
        {
          "file_id": "4fcb1ba3-3dc7-4fc8-954d-46ce9a068284",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/a4a5cece-5165-4d25-841a-4a71452f9c2d/attachments/4fcb1ba3-3dc7-4fc8-954d-46ce9a068284` → **200**

Done: support case a4a5cece-5165-4d25-841a-4a71452f9c2d, rider attachment 03e71060-237f-4fc7-96e0-e800485463cb, operator attachment 4fcb1ba3-3dc7-4fc8-954d-46ce9a068284.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739433844",
  "device_ref": "sandbox-16218"
}
```

```json
{
  "challenge_id": "3437d0cf-0bfc-4351-90bb-8f29f7cba404",
  "expires_at": "2026-10-30T09:44:18.718064228Z",
  "resend_available_at": "2026-10-30T09:39:19.718064228Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739433844` → **200**

```json
{
  "phone": "+380739433844",
  "audience": "CLIENT",
  "code": "672139",
  "sent_at": "2026-10-30T09:39:18.721805475Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3437d0cf-0bfc-4351-90bb-8f29f7cba404",
  "code": "672139",
  "device_ref": "sandbox-16218"
}
```

```json
{
  "session_id": "ec7c6247-cd61-41cd-b355-ffd234c74b13",
  "subject": {
    "type": "CLIENT",
    "id": "5165f721-8036-482e-bb59-7a612579cef1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MTY1ZjcyMS04MDM2LTQ4MmUtYmI1OS03YTYxMjU3OWNlZjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0MDU5LCJpYXQiOjE3OTMzNTMxNTksImp0aSI6ImI1M2MxZjhkLWQxOGUtNDBjZC05Y2E3LWEzMzgzMzBlNzVlZiIsInNpZCI6ImVjN2M2MjQ3LWNkNjEtNDFjZC1iMzU1LWZmZDIzNGM3NGIxMyJ9.GzPZfFfZd_y6jcAw1c6_3ZpyEAjrrUvgI584oLr6Bkk",
  "access_expires_at": "2026-10-30T09:54:19.034373109Z",
  "refresh_token": "B8AxSRc_cXLX-w4iCHJfTnlnPSrCl270JhXPXMRZx-w",
  "refresh_expires_at": "2026-11-29T09:39:19.033875687Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "eef5efc3-7500-41e7-8159-4b4a56c87454",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "ac50f006-c124-413d-b722-8c28103b957a",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-ac50f006-c124-413d-b722-8c28103b957a",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "8948fb1ca8757693081ef18260b83d56",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=ac50f006-c124-413d-b722-8c28103b957a",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739433844"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=ac50f006-c124-413d-b722-8c28103b957a",
  "expires_at": "2026-10-30T10:09:19.319528Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/ac50f006-c124-413d-b722-8c28103b957a` → **200**

```json
{
  "id": "ac50f006-c124-413d-b722-8c28103b957a",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T10:09:19.319528Z",
  "card": {
    "id": "3cb1006d-05cc-49f9-b2a4-5087b386312d",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4728",
    "card_type": "Visa",
    "created_at": "2026-10-30T09:39:19.620132Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1a06100a-dba8-4799-8499-18e39f55b89d",
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
  "id": "6fedd62b-57ec-4fd3-868d-0b1c9672bab5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:44:19.939685Z",
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
  "command_id": "34aac67c-6eba-413c-86b2-9a27dfb9ca65",
  "quote_id": "6fedd62b-57ec-4fd3-868d-0b1c9672bab5",
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
  "id": "8fa56407-5434-4ac1-9cfe-d5e2b5d27543",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5165f721-8036-482e-bb59-7a612579cef1",
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
  "created_at": "2026-10-30T09:39:20.23707Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fa56407-5434-4ac1-9cfe-d5e2b5d27543` → **200**

```json
{
  "id": "8fa56407-5434-4ac1-9cfe-d5e2b5d27543",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5165f721-8036-482e-bb59-7a612579cef1",
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
  "created_at": "2026-10-30T09:39:20.23707Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fa56407-5434-4ac1-9cfe-d5e2b5d27543` → **200**

```json
{
  "id": "8fa56407-5434-4ac1-9cfe-d5e2b5d27543",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5165f721-8036-482e-bb59-7a612579cef1",
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
  "created_at": "2026-10-30T09:39:20.23707Z",
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

`GET /api/rider/v1/orders/8fa56407-5434-4ac1-9cfe-d5e2b5d27543` → **200**

```json
{
  "id": "8fa56407-5434-4ac1-9cfe-d5e2b5d27543",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5165f721-8036-482e-bb59-7a612579cef1",
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
  "created_at": "2026-10-30T09:39:20.23707Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/8fa56407-5434-4ac1-9cfe-d5e2b5d27543/switch-to-cash` → **200**

```json
{
  "command_id": "ebf2ab17-cf4a-4ded-9658-01cdfff6f61a",
  "expected_version": 3
}
```

```json
{
  "id": "8fa56407-5434-4ac1-9cfe-d5e2b5d27543",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "5165f721-8036-482e-bb59-7a612579cef1",
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
  "created_at": "2026-10-30T09:39:20.23707Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/8fa56407-5434-4ac1-9cfe-d5e2b5d27543/switch-to-cash` → **409**

```json
{
  "command_id": "cc641b02-e595-494d-a4a4-c1bb2ec90217",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/8fa56407-5434-4ac1-9cfe-d5e2b5d27543/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6b4f97ba-bec5-43db-a6f6-18a853f114c2"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/8fa56407-5434-4ac1-9cfe-d5e2b5d27543` → **200**

```json
{
  "id": "8fa56407-5434-4ac1-9cfe-d5e2b5d27543",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "5165f721-8036-482e-bb59-7a612579cef1",
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
  "created_at": "2026-10-30T09:39:20.23707Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/8fa56407-5434-4ac1-9cfe-d5e2b5d27543/cancel` → **200**

```json
{
  "command_id": "1b94b3a5-58c8-4445-be5c-3d3d7315cb28",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "8fa56407-5434-4ac1-9cfe-d5e2b5d27543",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "5165f721-8036-482e-bb59-7a612579cef1",
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
  "created_at": "2026-10-30T09:39:20.23707Z",
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
  "session_id": "c17a7973-a15d-440f-b1f6-106b228e3090",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQwNjMsImlhdCI6MTc5MzM1MzE2MywianRpIjoiNDQ5MWQxOGMtZjA5OS00OWYyLTg0M2UtMzI2MjkwZmQ3ZTg1Iiwic2lkIjoiYzE3YTc5NzMtYTE1ZC00NDBmLWIxZjYtMTA2YjIyOGUzMDkwIn0.TQ7WFnmI4yDNNbYmtNiD6ZqsfUner3g8DGaQyN8LmVw",
  "access_expires_at": "2026-10-30T09:54:23.991099483Z",
  "refresh_token": "IuS6b2SA4yp0_2nDXBRUNsN5NmKoTQiD5PJNJjZqxVs",
  "refresh_expires_at": "2026-10-30T21:39:23.99043597Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-1830"
}
```

```json
{
  "challenge_id": "1812b361-86fa-4f1d-8ce7-4ea2b755af37",
  "expires_at": "2026-10-30T09:44:24.279226369Z",
  "resend_available_at": "2026-10-30T09:39:25.279226369Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "042350",
  "sent_at": "2026-10-30T09:39:24.282350901Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1812b361-86fa-4f1d-8ce7-4ea2b755af37",
  "code": "042350",
  "device_ref": "sandbox-1830"
}
```

```json
{
  "session_id": "a49c8a88-b82b-4760-8406-58bf41991625",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDA2NCwiaWF0IjoxNzkzMzUzMTY0LCJqdGkiOiI1MTJmMWE1Yy1mN2UxLTQ5M2QtODVmOC01MDZlOTYzOTliYzQiLCJzaWQiOiJhNDljOGE4OC1iODJiLTQ3NjAtODQwNi01OGJmNDE5OTE2MjUifQ.crpp4ZbxxRViHjv5NRclA3P0z9H3SuUQ7cYOeSYLvvI",
  "access_expires_at": "2026-10-30T09:54:24.591408961Z",
  "refresh_token": "N9CXKVQyVZFOBXBnPSB7RhDVp2Wy6zt-6LLrBnOyNlc",
  "refresh_expires_at": "2026-11-29T09:39:24.59085865Z",
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
      "actor_id": "f621c4f1-9b6e-41a5-939b-44be51548e85",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T09:39:07.320473Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "f621c4f1-9b6e-41a5-939b-44be51548e85",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T09:39:08.787746Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "6ce182c7-3d93-44c0-a8fa-803fe9472aed",
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
  "device_ref": "sandbox-11633"
}
```

```json
{
  "challenge_id": "ed4ebc88-334e-4fd1-9c89-dbf17998157c",
  "expires_at": "2026-10-30T09:44:25.768990662Z",
  "resend_available_at": "2026-10-30T09:39:26.768990662Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "222445",
  "sent_at": "2026-10-30T09:39:25.771922865Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ed4ebc88-334e-4fd1-9c89-dbf17998157c",
  "code": "222445",
  "device_ref": "sandbox-11633"
}
```

```json
{
  "session_id": "3479dbf8-78ce-4885-88b4-d625b548f322",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDA2NiwiaWF0IjoxNzkzMzUzMTY2LCJqdGkiOiJjY2M0NTFhMi0yMTMzLTRkYjAtYmQ5NC0zNDZiN2NkYzg3MzYiLCJzaWQiOiIzNDc5ZGJmOC03OGNlLTQ4ODUtODhiNC1kNjI1YjU0OGYzMjIifQ.tpAXCzOcE6rhEH0tRilOhg4OgqitiO-rYnVefi0YGvw",
  "access_expires_at": "2026-10-30T09:54:26.074409926Z",
  "refresh_token": "D0CuH0ElnSvdVRE7LGXGha8eSmD1ogcJykMRhsgXz88",
  "refresh_expires_at": "2026-11-29T09:39:26.073901483Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bf244294-d206-4e2f-97b2-4ea6d6dfa772",
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
  "last_heartbeat_at": "2026-10-30T09:38:48.327304Z",
  "last_location_at": "2026-10-30T09:38:48.327304Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/bf244294-d206-4e2f-97b2-4ea6d6dfa772/handover` → **200**

```json
{
  "command_id": "ffaf0a9d-f091-4636-a3c2-fef904f44497",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bf244294-d206-4e2f-97b2-4ea6d6dfa772",
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
  "last_heartbeat_at": "2026-10-30T09:38:48.327304Z",
  "last_location_at": "2026-10-30T09:38:48.327304Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/bf244294-d206-4e2f-97b2-4ea6d6dfa772/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:39:26Z",
    "sequence": 1793353166918
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bf244294-d206-4e2f-97b2-4ea6d6dfa772",
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
  "last_heartbeat_at": "2026-10-30T09:39:26.936821Z",
  "last_location_at": "2026-10-30T09:39:26.936821Z",
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
  "command_id": "d43309c2-ea9f-48c5-bcd6-a3ed051b0aec",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:39:27Z",
    "sequence": 1793353167506
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "40dc35a5-0513-470e-8101-3b48228893d5",
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
  "last_heartbeat_at": "2026-10-30T09:39:27.524333Z",
  "last_location_at": "2026-10-30T09:39:27.524333Z",
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
  "session_id": "88e103bb-8030-4fcd-b8c3-d32f2cf816b2",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQwNjgsImlhdCI6MTc5MzM1MzE2OCwianRpIjoiYjA3YjIxZjItOGRjYy00ZmE3LTk4NWEtNTZjMmM1Y2FkZTNmIiwic2lkIjoiODhlMTAzYmItODAzMC00ZmNkLWI4YzMtZDMyZjJjZjgxNmIyIn0.bPVrFtK6a90DjaBRvF79G61yhlKo7wlg8kbNzU9pZMM",
  "access_expires_at": "2026-10-30T09:54:28.114248006Z",
  "refresh_token": "h_edOApbjNNGErYVsfbuvELfZG3nE1VcwfvZ9Yu2xIM",
  "refresh_expires_at": "2026-10-30T21:39:28.113656017Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "bc539c29-dbee-4484-b831-638052078c75",
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
  "id": "3b203c2e-1b45-4313-b8d3-0412488a5d2b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:44:28.401863Z",
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
  "command_id": "06af1527-58b7-4869-9f17-c2d262731e92",
  "quote_id": "3b203c2e-1b45-4313-b8d3-0412488a5d2b",
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
  "id": "fef79558-a018-4f01-bc66-933f22f39641",
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
  "created_at": "2026-10-30T09:39:28.685988Z",
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
    "id": "bcb56ecb-6977-49e0-89e4-e9706d3bd60e",
    "order_id": "fef79558-a018-4f01-bc66-933f22f39641",
    "expires_at": "2026-10-30T09:39:43.68987Z",
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

`POST /api/driver/v1/offers/bcb56ecb-6977-49e0-89e4-e9706d3bd60e/accept` → **200**

```json
{
  "command_id": "3eaa4404-11b9-4e63-8bdb-6c303b0620de"
}
```

```json
{
  "id": "11f14dc8-acd9-4856-bf06-ba2cce1b5917",
  "order_id": "fef79558-a018-4f01-bc66-933f22f39641",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "926df014-f9b2-4f1a-818c-a866ae845c9e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "926df014-f9b2-4f1a-818c-a866ae845c9e",
  "order_id": "fef79558-a018-4f01-bc66-933f22f39641",
  "assignment_id": "11f14dc8-acd9-4856-bf06-ba2cce1b5917",
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

`POST /api/driver/v1/work-sessions/40dc35a5-0513-470e-8101-3b48228893d5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:39:30Z",
    "sequence": 1793353170136
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "40dc35a5-0513-470e-8101-3b48228893d5",
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
  "last_heartbeat_at": "2026-10-30T09:39:30.153512Z",
  "last_location_at": "2026-10-30T09:39:30.153512Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/926df014-f9b2-4f1a-818c-a866ae845c9e/arrive` → **200**

```json
{
  "command_id": "cb02d535-86d6-4991-909f-4dfd35989c3b",
  "expected_version": 0
}
```

```json
{
  "id": "926df014-f9b2-4f1a-818c-a866ae845c9e",
  "order_id": "fef79558-a018-4f01-bc66-933f22f39641",
  "assignment_id": "11f14dc8-acd9-4856-bf06-ba2cce1b5917",
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
  "arrived_at": "2026-10-30T09:39:30.452334Z",
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

`POST /api/driver/v1/trips/926df014-f9b2-4f1a-818c-a866ae845c9e/start` → **200**

```json
{
  "command_id": "44255800-8353-4146-8850-75159f41ed6b",
  "expected_version": 1
}
```

```json
{
  "id": "926df014-f9b2-4f1a-818c-a866ae845c9e",
  "order_id": "fef79558-a018-4f01-bc66-933f22f39641",
  "assignment_id": "11f14dc8-acd9-4856-bf06-ba2cce1b5917",
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
  "arrived_at": "2026-10-30T09:39:30.452334Z",
  "started_at": "2026-10-30T09:39:30.755338Z",
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

`POST /api/driver/v1/trips/926df014-f9b2-4f1a-818c-a866ae845c9e/complete` → **200**

```json
{
  "command_id": "fde0ea96-c7b1-414c-9b30-d24aa974d230",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:39:31Z",
  "cash_received": true
}
```

```json
{
  "id": "926df014-f9b2-4f1a-818c-a866ae845c9e",
  "order_id": "fef79558-a018-4f01-bc66-933f22f39641",
  "assignment_id": "11f14dc8-acd9-4856-bf06-ba2cce1b5917",
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
  "arrived_at": "2026-10-30T09:39:30.452334Z",
  "started_at": "2026-10-30T09:39:30.755338Z",
  "completed_at": "2026-10-30T09:39:31.070122Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/fef79558-a018-4f01-bc66-933f22f39641` → **200**

```json
{
  "id": "fef79558-a018-4f01-bc66-933f22f39641",
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
    "id": "11f14dc8-acd9-4856-bf06-ba2cce1b5917",
    "order_id": "fef79558-a018-4f01-bc66-933f22f39641",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "926df014-f9b2-4f1a-818c-a866ae845c9e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:39:28.685988Z",
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
  "session_id": "bf244294-d206-4e2f-97b2-4ea6d6dfa772",
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
  "last_heartbeat_at": "2026-10-30T09:39:26.936821Z",
  "last_location_at": "2026-10-30T09:39:26.936821Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bf244294-d206-4e2f-97b2-4ea6d6dfa772/close` → **200**

```json
{
  "command_id": "4d4e27c6-7c4b-4473-8ca9-4a6d7d359c79",
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
  "session_id": "40dc35a5-0513-470e-8101-3b48228893d5",
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
  "last_heartbeat_at": "2026-10-30T09:39:30.153512Z",
  "last_location_at": "2026-10-30T09:39:30.153512Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/40dc35a5-0513-470e-8101-3b48228893d5/close` → **200**

```json
{
  "command_id": "eb281f48-d05a-41d5-bccf-0afa569d9b91",
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

Done: terminal order fef79558-a018-4f01-bc66-933f22f39641 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-1674"
}
```

```json
{
  "challenge_id": "020c6321-f920-4733-bfeb-0facf4f85103",
  "expires_at": "2026-10-30T09:44:36.093296694Z",
  "resend_available_at": "2026-10-30T09:39:37.093296694Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "186227",
  "sent_at": "2026-10-30T09:39:36.096205151Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "020c6321-f920-4733-bfeb-0facf4f85103",
  "code": "186227",
  "device_ref": "sandbox-1674"
}
```

```json
{
  "session_id": "6dca082e-01be-4f11-a9e0-610cee38b17d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDA3NiwiaWF0IjoxNzkzMzUzMTc2LCJqdGkiOiI2ODVmYmZlMC1jNTIxLTRmZTYtODRjYi0zODNlODA0MGQ3YzMiLCJzaWQiOiI2ZGNhMDgyZS0wMWJlLTRmMTEtYTllMC02MTBjZWUzOGIxN2QifQ.FTy_2BXbG-YdJgExVgN1UUynt901k0F0GE0TYkMeCZs",
  "access_expires_at": "2026-10-30T09:54:36.411107258Z",
  "refresh_token": "9cJVjXcllkHjtCu18U9TNUXVe5wTh5EwCcNA5cbQjsU",
  "refresh_expires_at": "2026-11-29T09:39:36.410575722Z",
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
  "device_ref": "sandbox-25188"
}
```

```json
{
  "challenge_id": "e0cd17ff-c296-4e50-af30-5bb71f2e604e",
  "expires_at": "2026-10-30T09:44:36.975676023Z",
  "resend_available_at": "2026-10-30T09:39:37.975676023Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "182816",
  "sent_at": "2026-10-30T09:39:36.978442545Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e0cd17ff-c296-4e50-af30-5bb71f2e604e",
  "code": "182816",
  "device_ref": "sandbox-25188"
}
```

```json
{
  "session_id": "e3e2811e-a385-4a72-98fc-0a05da889623",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDA3NywiaWF0IjoxNzkzMzUzMTc3LCJqdGkiOiJmZjFhNDgwYy01MDFjLTQwMDQtODE0ZS04OWI0NGVkMDRjMTEiLCJzaWQiOiJlM2UyODExZS1hMzg1LTRhNzItOThmYy0wYTA1ZGE4ODk2MjMifQ.kHsl8iLjalhj41zclqWemFw120k8L6EcdlqRFvAABNA",
  "access_expires_at": "2026-10-30T09:54:37.283374697Z",
  "refresh_token": "JRWb4JwGjqDgU1viEWqEaH6atyBapYgdww_wa-JNSwI",
  "refresh_expires_at": "2026-11-29T09:39:37.282676619Z",
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
  "device_ref": "sandbox-8405"
}
```

```json
{
  "challenge_id": "0b8f835a-f665-4419-8468-af52fdf6f4d5",
  "expires_at": "2026-10-30T09:44:37.839666936Z",
  "resend_available_at": "2026-10-30T09:39:38.839666936Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "150917",
  "sent_at": "2026-10-30T09:39:37.843314601Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0b8f835a-f665-4419-8468-af52fdf6f4d5",
  "code": "150917",
  "device_ref": "sandbox-8405"
}
```

```json
{
  "session_id": "a6301929-c2db-4ee6-932e-eb71a1130f58",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDA3OCwiaWF0IjoxNzkzMzUzMTc4LCJqdGkiOiJlMTUyM2VlYi0xN2IzLTRiYjEtYWY1OC04MGZlNGNiODdkZjgiLCJzaWQiOiJhNjMwMTkyOS1jMmRiLTRlZTYtOTMyZS1lYjcxYTExMzBmNTgifQ._BeXmWm5b_Zzfym6D51SVDd5LLL-htJnq-xWIXXD7sI",
  "access_expires_at": "2026-10-30T09:54:38.14611126Z",
  "refresh_token": "dPnfRo8D3E7fU16SljITRDujO4S_m-s-pSa85xpQc9A",
  "refresh_expires_at": "2026-11-29T09:39:38.145515103Z",
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
  "phone": "+380695453736",
  "device_ref": "sandbox-14366"
}
```

```json
{
  "challenge_id": "60b40f39-eed4-4bf2-85d8-67d2a523d5ff",
  "expires_at": "2026-10-30T09:44:38.707369483Z",
  "resend_available_at": "2026-10-30T09:39:39.707369483Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380695453736` → **200**

```json
{
  "phone": "+380695453736",
  "audience": "CLIENT",
  "code": "129025",
  "sent_at": "2026-10-30T09:39:38.710162824Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "60b40f39-eed4-4bf2-85d8-67d2a523d5ff",
  "code": "129025",
  "device_ref": "sandbox-14366"
}
```

```json
{
  "session_id": "96168721-1659-4009-9bef-480b57eb6857",
  "subject": {
    "type": "CLIENT",
    "id": "bc651d19-796c-4f13-a44b-02828c50e258"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYzY1MWQxOS03OTZjLTRmMTMtYTQ0Yi0wMjgyOGM1MGUyNTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0MDc5LCJpYXQiOjE3OTMzNTMxNzksImp0aSI6ImM2OTE0NjY4LWZhODktNDNjZC1iYjg2LTRhMDNkMWNkNzFjYiIsInNpZCI6Ijk2MTY4NzIxLTE2NTktNDAwOS05YmVmLTQ4MGI1N2ViNjg1NyJ9.gZpJ32IBbkZ3WfD_AfSlxS51RYhQpYywZ0G0XX_qSPU",
  "access_expires_at": "2026-10-30T09:54:39.022364001Z",
  "refresh_token": "0XGsvkF5WIlOM9gaEoCw4b8wDGfhRpcFkX62KSsJ1yo",
  "refresh_expires_at": "2026-11-29T09:39:39.021782642Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b3892c79-3760-460b-ae9b-f6a104ad017d",
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
  "id": "6e4ed37b-be45-4e9f-8327-134d14b4dccf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:44:39.314167Z",
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
  "command_id": "ad068b20-3e69-43d0-8b87-aedf2a072d04",
  "quote_id": "6e4ed37b-be45-4e9f-8327-134d14b4dccf",
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
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:39:39.605157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:39:39.605157Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 14.348424983
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.202510058
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

`GET /api/rider/v1/orders/5988d6da-aa18-4256-95fc-a84ae6f42185` → **200**

```json
{
  "id": "5988d6da-aa18-4256-95fc-a84ae6f42185",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "bc651d19-796c-4f13-a44b-02828c50e258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:39:39.605157Z",
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
  "session_id": "0cf8bdb8-985c-4492-b55a-ad2db49ab386",
  "subject": {
    "type": "STAFF",
    "id": "f621c4f1-9b6e-41a5-939b-44be51548e85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIxYzRmMS05YjZlLTQxYTUtOTM5Yi00NGJlNTE1NDhlODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQyNjYsImlhdCI6MTc5MzM1MzM2NiwianRpIjoiMjJiNjRhNTEtZjQ1MC00NjFkLTg0OGItYWEyZTZjZTUzZGNlIiwic2lkIjoiMGNmOGJkYjgtOTg1Yy00NDkyLWI1NWEtYWQyZGI0OWFiMzg2In0.vGRxABXE2s_kOX39xlFT6ZoedZeidsX4XjS2O2sFbKM",
  "access_expires_at": "2026-10-30T09:57:46.544526937Z",
  "refresh_token": "y95YPEpB7JKzv_eXkYtv_XBuAH6Sldxjev-x4Hexee8",
  "refresh_expires_at": "2026-10-30T21:42:46.543932143Z",
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
  "id": "fc625975-484b-478d-9abc-8bc9a682d167",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:42:46.855778Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:42:46.855869Z",
  "updated_at": "2026-10-30T09:42:46.873593Z",
  "finished_at": "2026-10-30T09:42:46.873593Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/fc625975-484b-478d-9abc-8bc9a682d167` → **200**

```json
{
  "run": {
    "id": "fc625975-484b-478d-9abc-8bc9a682d167",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T09:42:46.855778Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T09:42:46.855869Z",
    "updated_at": "2026-10-30T09:42:46.873593Z",
    "finished_at": "2026-10-30T09:42:46.873593Z",
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
  "id": "fc625975-484b-478d-9abc-8bc9a682d167",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:42:46.855778Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:42:46.855869Z",
  "updated_at": "2026-10-30T09:42:46.873593Z",
  "finished_at": "2026-10-30T09:42:46.873593Z",
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
  "id": "fc625975-484b-478d-9abc-8bc9a682d167",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:42:46.855778Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:42:46.855869Z",
  "updated_at": "2026-10-30T09:42:46.873593Z",
  "finished_at": "2026-10-30T09:42:46.873593Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/64f14b20-4a53-48f2-bbe7-64482fbde421` → **204**

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
  "id": "0c93d486-5733-481a-b5f7-f30e2414d448",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:42:47.308448Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:42:47.308484Z",
  "updated_at": "2026-10-30T09:42:47.316248Z",
  "finished_at": "2026-10-30T09:42:47.316248Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/0c93d486-5733-481a-b5f7-f30e2414d448` → **200**

```json
{
  "run": {
    "id": "0c93d486-5733-481a-b5f7-f30e2414d448",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T09:42:47.308448Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T09:42:47.308484Z",
    "updated_at": "2026-10-30T09:42:47.316248Z",
    "finished_at": "2026-10-30T09:42:47.316248Z",
    "version": 1
  },
  "items": [
    {
      "id": "12838c8e-9281-488d-a9eb-1b202d8b9893",
      "run_id": "0c93d486-5733-481a-b5f7-f30e2414d448",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "0a242b187126af6c579db89d25856f5f6f0703f98bf3ed07fcfa2691844cb3b0",
      "reference_display": "sandbox-reconciliation-64f14b20-4a53-48f2-bbe7-#####fbde421",
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
      "provider_at": "2026-10-30T09:42:47Z",
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
  "id": "0c93d486-5733-481a-b5f7-f30e2414d448",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:42:47.308448Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:42:47.308484Z",
  "updated_at": "2026-10-30T09:42:47.316248Z",
  "finished_at": "2026-10-30T09:42:47.316248Z",
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
  "id": "0c93d486-5733-481a-b5f7-f30e2414d448",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:42:47.308448Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:42:47.308484Z",
  "updated_at": "2026-10-30T09:42:47.316248Z",
  "finished_at": "2026-10-30T09:42:47.316248Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/12838c8e-9281-488d-a9eb-1b202d8b9893/resolve` → **200**

```json
{
  "command_id": "ec2338ce-8c25-4152-b930-0fb11d43e7a1",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "12838c8e-9281-488d-a9eb-1b202d8b9893",
  "run_id": "0c93d486-5733-481a-b5f7-f30e2414d448",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "0a242b187126af6c579db89d25856f5f6f0703f98bf3ed07fcfa2691844cb3b0",
  "reference_display": "sandbox-reconciliation-64f14b20-4a53-48f2-bbe7-#####fbde421",
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
  "provider_at": "2026-10-30T09:42:47Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
  "resolved_at": "2026-10-30T09:42:47.742343Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/12838c8e-9281-488d-a9eb-1b202d8b9893/resolve` → **200**

```json
{
  "command_id": "ec2338ce-8c25-4152-b930-0fb11d43e7a1",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "12838c8e-9281-488d-a9eb-1b202d8b9893",
  "run_id": "0c93d486-5733-481a-b5f7-f30e2414d448",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "0a242b187126af6c579db89d25856f5f6f0703f98bf3ed07fcfa2691844cb3b0",
  "reference_display": "sandbox-reconciliation-64f14b20-4a53-48f2-bbe7-#####fbde421",
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
  "provider_at": "2026-10-30T09:42:47Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
  "resolved_at": "2026-10-30T09:42:47.742343Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/12838c8e-9281-488d-a9eb-1b202d8b9893/resolve` → **409**

```json
{
  "command_id": "37aed2c3-0ded-490b-a33f-4a9e8bb8cbb9",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/12838c8e-9281-488d-a9eb-1b202d8b9893/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ccecadf7-9c00-4297-a1bd-7cbae03c1143"
}
```

`GET /api/admin/v1/payment-reconciliations/0c93d486-5733-481a-b5f7-f30e2414d448` → **200**

```json
{
  "run": {
    "id": "0c93d486-5733-481a-b5f7-f30e2414d448",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T09:42:47.308448Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T09:42:47.308484Z",
    "updated_at": "2026-10-30T09:42:47.742343Z",
    "finished_at": "2026-10-30T09:42:47.316248Z",
    "version": 2
  },
  "items": [
    {
      "id": "12838c8e-9281-488d-a9eb-1b202d8b9893",
      "run_id": "0c93d486-5733-481a-b5f7-f30e2414d448",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "0a242b187126af6c579db89d25856f5f6f0703f98bf3ed07fcfa2691844cb3b0",
      "reference_display": "sandbox-reconciliation-64f14b20-4a53-48f2-bbe7-#####fbde421",
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
      "provider_at": "2026-10-30T09:42:47Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "f621c4f1-9b6e-41a5-939b-44be51548e85",
      "resolved_at": "2026-10-30T09:42:47.742343Z",
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
      "id": "0c93d486-5733-481a-b5f7-f30e2414d448",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T09:42:47.308448Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T09:42:47.308484Z",
      "updated_at": "2026-10-30T09:42:47.742343Z",
      "finished_at": "2026-10-30T09:42:47.316248Z",
      "version": 2
    },
    {
      "id": "f56e115d-8c7e-4676-8802-83a75a1cdc63",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T09:34:39.751428Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T09:34:39.751491Z",
      "updated_at": "2026-10-30T09:34:39.757035Z",
      "finished_at": "2026-10-30T09:34:39.757035Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/64f14b20-4a53-48f2-bbe7-64482fbde421` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "0c93d486-5733-481a-b5f7-f30e2414d448",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:42:47.308448Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:42:47.308484Z",
  "updated_at": "2026-10-30T09:42:47.742343Z",
  "finished_at": "2026-10-30T09:42:47.316248Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793353494957E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793353495243E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793353495244E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793353494988E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793353495244E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
