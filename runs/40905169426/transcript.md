# Sandbox transcript (2026-10-29T15:48:43Z, aea9e15)

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
  "correlation_id": "7e7b0037-94d2-4824-8272-be358567bb0c"
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
  "session_id": "6ccf6515-5b16-4f04-aaeb-219fc83a237d",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4MzAsImlhdCI6MTc5MzI4ODkzMCwianRpIjoiMzk1ODdhODAtNTU2Ni00NjY1LWI4NDYtYWI2NGE1OWYwZGViIiwic2lkIjoiNmNjZjY1MTUtNWIxNi00ZjA0LWFhZWItMjE5ZmM4M2EyMzdkIn0._n3RHAtUkd93f8KazIGEbaxS1A1VvQ0SXfyHR3VuZXM",
  "access_expires_at": "2026-10-29T16:03:50.45825024Z",
  "refresh_token": "njaf6VyAbhsdrqu2mQVQdS6u3DlPV3obf4e8Jo-hlbE",
  "refresh_expires_at": "2026-10-30T03:48:50.455958303Z",
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
  "session_id": "46272a8e-1893-4eff-8536-30140d7246b5",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4MzIsImlhdCI6MTc5MzI4ODkzMiwianRpIjoiNjY0OWZmZTktODYxMS00OTkyLThiODUtYTU0MTE1MWU2MjgxIiwic2lkIjoiNDYyNzJhOGUtMTg5My00ZWZmLTg1MzYtMzAxNDBkNzI0NmI1In0.P_ja1zLiO187L37VE8jsEvL4weuggO4bBsF19ZXiVmM",
  "access_expires_at": "2026-10-29T16:03:52.313595763Z",
  "refresh_token": "aKa9l-T-4NhDyrmlKaN9dQ__CjqEQ7NnyeP14xT66K0",
  "refresh_expires_at": "2026-10-30T03:48:52.31243449Z",
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
  "device_ref": "sandbox-7560"
}
```

```json
{
  "challenge_id": "6306f076-9a1e-4e81-9d60-47c8101c3676",
  "expires_at": "2026-10-29T15:53:52.943727261Z",
  "resend_available_at": "2026-10-29T15:48:53.943727261Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "816885",
  "sent_at": "2026-10-29T15:48:52.956476455Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6306f076-9a1e-4e81-9d60-47c8101c3676",
  "code": "816885",
  "device_ref": "sandbox-7560"
}
```

```json
{
  "session_id": "c20883db-e862-46cb-aef7-ca29e8c8e0da",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTgzMywiaWF0IjoxNzkzMjg4OTMzLCJqdGkiOiI4NjQ5YjY3Zi0xMDM2LTRjY2EtYTMzMC1lMDgwNjU0ZmNiZGEiLCJzaWQiOiJjMjA4ODNkYi1lODYyLTQ2Y2ItYWVmNy1jYTI5ZThjOGUwZGEifQ.krztXl4iF8fwu3Q_LuDVuM5Hg2bMdJtiWp0XXjxcQOY",
  "access_expires_at": "2026-10-29T16:03:53.313114842Z",
  "refresh_token": "Dhf6KvCR9_G-MaUwOOT-Y8_UKJ4gF39heVxBt_wrMGE",
  "refresh_expires_at": "2026-11-28T15:48:53.312033028Z",
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
  "command_id": "f05bf7f8-f259-45b6-92af-10ddb6be86c9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:48:53Z",
    "sequence": 1793288933946
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3165fa0b-804b-4973-ad2c-8b00fbae9a1d",
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
  "last_heartbeat_at": "2026-10-29T15:48:54.028077Z",
  "last_location_at": "2026-10-29T15:48:54.028077Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630169805",
  "device_ref": "sandbox-32336"
}
```

```json
{
  "challenge_id": "7243d408-6cff-4822-8923-ec5baee7ae7b",
  "expires_at": "2026-10-29T15:53:54.346119095Z",
  "resend_available_at": "2026-10-29T15:48:55.346119095Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630169805` → **200**

```json
{
  "phone": "+380630169805",
  "audience": "CLIENT",
  "code": "104028",
  "sent_at": "2026-10-29T15:48:54.351245693Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7243d408-6cff-4822-8923-ec5baee7ae7b",
  "code": "104028",
  "device_ref": "sandbox-32336"
}
```

```json
{
  "session_id": "617eaf2b-49a9-42b3-afcd-c87bce01738f",
  "subject": {
    "type": "CLIENT",
    "id": "43fe573a-7c01-40f1-b2fc-c8be8d8e9afe"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0M2ZlNTczYS03YzAxLTQwZjEtYjJmYy1jOGJlOGQ4ZTlhZmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5ODM0LCJpYXQiOjE3OTMyODg5MzQsImp0aSI6IjRiY2NiNmJhLWQ1ZjUtNGJmNS05ODJkLWQ5NjFmNTBjY2RjYSIsInNpZCI6IjYxN2VhZjJiLTQ5YTktNDJiMy1hZmNkLWM4N2JjZTAxNzM4ZiJ9.-Qx4IxbGakFR1jPaT_SKF6tJUpUw2EUwsfjUb_z6ySY",
  "access_expires_at": "2026-10-29T16:03:54.677813299Z",
  "refresh_token": "8mB2yHlYoCpPfGKUbQHo_r8WFyHG6Yfm9w6HLAsqD2U",
  "refresh_expires_at": "2026-11-28T15:48:54.676905377Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d10e0305-968e-48ad-8671-57d83226f691",
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
  "id": "f3d2f8e2-92c2-4b10-bbb8-71d2612d7635",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:53:55.022162Z",
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
  "command_id": "97413023-290b-4c7f-a070-375f1c421adf",
  "quote_id": "f3d2f8e2-92c2-4b10-bbb8-71d2612d7635",
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
  "id": "837b8d42-ad21-4e39-b4da-89f19570bfbb",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "43fe573a-7c01-40f1-b2fc-c8be8d8e9afe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:48:55.440356Z",
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
    "id": "e9f5856e-eb8b-458f-beac-af127340dc49",
    "order_id": "837b8d42-ad21-4e39-b4da-89f19570bfbb",
    "expires_at": "2026-10-29T15:49:10.451515Z",
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

`POST /api/driver/v1/offers/e9f5856e-eb8b-458f-beac-af127340dc49/accept` → **200**

```json
{
  "command_id": "ccc3f66d-235f-474f-a4ef-020dbf96d8bb"
}
```

```json
{
  "id": "bd32a90a-29df-4a80-9f67-5a8e7a98ef08",
  "order_id": "837b8d42-ad21-4e39-b4da-89f19570bfbb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "27cddf5e-23ff-4d42-b34f-de2ab4fd7468",
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
  "command_id": "f8d32d09-c7d5-4b8f-80b2-53d415452b04",
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
  "changed_by": "84015309-667b-408e-9731-2b3c5e734ac0",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T15:48:56.779947386Z"
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
  "id": "27cddf5e-23ff-4d42-b34f-de2ab4fd7468",
  "order_id": "837b8d42-ad21-4e39-b4da-89f19570bfbb",
  "assignment_id": "bd32a90a-29df-4a80-9f67-5a8e7a98ef08",
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

`POST /api/driver/v1/work-sessions/3165fa0b-804b-4973-ad2c-8b00fbae9a1d/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:48:57Z",
    "sequence": 1793288937702
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3165fa0b-804b-4973-ad2c-8b00fbae9a1d",
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
  "last_heartbeat_at": "2026-10-29T15:48:57.730549Z",
  "last_location_at": "2026-10-29T15:48:57.730549Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/27cddf5e-23ff-4d42-b34f-de2ab4fd7468/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "9010c57d-fe42-408b-93ba-d49ee9a00ec0",
  "expected_version": 0
}
```

```json
{
  "id": "27cddf5e-23ff-4d42-b34f-de2ab4fd7468",
  "order_id": "837b8d42-ad21-4e39-b4da-89f19570bfbb",
  "assignment_id": "bd32a90a-29df-4a80-9f67-5a8e7a98ef08",
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
  "arrived_at": "2026-10-29T15:48:58.051052Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/27cddf5e-23ff-4d42-b34f-de2ab4fd7468/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "2483d274-ce4c-410f-b97f-63046b1be0a9",
  "expected_version": 1
}
```

```json
{
  "id": "27cddf5e-23ff-4d42-b34f-de2ab4fd7468",
  "order_id": "837b8d42-ad21-4e39-b4da-89f19570bfbb",
  "assignment_id": "bd32a90a-29df-4a80-9f67-5a8e7a98ef08",
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
  "arrived_at": "2026-10-29T15:48:58.051052Z",
  "started_at": "2026-10-29T15:48:58.35254Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/27cddf5e-23ff-4d42-b34f-de2ab4fd7468/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "b729c5f9-3b1b-46e4-a0f5-c84184e31562",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:48:58Z",
  "cash_received": true
}
```

```json
{
  "id": "27cddf5e-23ff-4d42-b34f-de2ab4fd7468",
  "order_id": "837b8d42-ad21-4e39-b4da-89f19570bfbb",
  "assignment_id": "bd32a90a-29df-4a80-9f67-5a8e7a98ef08",
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
  "arrived_at": "2026-10-29T15:48:58.051052Z",
  "started_at": "2026-10-29T15:48:58.35254Z",
  "completed_at": "2026-10-29T15:48:58.674931Z",
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
  "session_id": "3165fa0b-804b-4973-ad2c-8b00fbae9a1d",
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
  "last_heartbeat_at": "2026-10-29T15:48:57.730549Z",
  "last_location_at": "2026-10-29T15:48:57.730549Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3165fa0b-804b-4973-ad2c-8b00fbae9a1d/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "62980300-9b01-4ec6-94d6-2baacdc2b3fb",
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
  "command_id": "d06ce2ab-2594-4ea3-aab3-217f6da99e32",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:48:59Z",
    "sequence": 1793288939631
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
  "correlation_id": "45572e38-7f83-4e3c-b9aa-5d355ac6e5e8",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "164bee1d-e43a-4047-84ed-f084f1b0a627",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:48:59Z",
    "sequence": 1793288939952
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5b3804eb-4ff9-487a-98fb-a911fc4df1c5",
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
  "last_heartbeat_at": "2026-10-29T15:48:59.97494Z",
  "last_location_at": "2026-10-29T15:48:59.97494Z",
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
  "changed_by": "84015309-667b-408e-9731-2b3c5e734ac0",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T15:48:56.779947Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "5a789067-638c-48bb-9ba6-7852d0e0f7b8",
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
  "changed_by": "84015309-667b-408e-9731-2b3c5e734ac0",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T15:49:00.593775271Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5b3804eb-4ff9-487a-98fb-a911fc4df1c5",
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
  "last_heartbeat_at": "2026-10-29T15:48:59.97494Z",
  "last_location_at": "2026-10-29T15:48:59.97494Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5b3804eb-4ff9-487a-98fb-a911fc4df1c5/close` → **200**

```json
{
  "command_id": "90c65906-a841-4582-bb01-9cec7c63f6ee",
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
  "session_id": "ff4bc192-9d49-4d28-adfa-c3c7dadbbda0",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4NDEsImlhdCI6MTc5MzI4ODk0MSwianRpIjoiOTAwOWVlN2ItYWIwYS00MjQ1LWEyYjAtYjlkOWUzM2RlYmNmIiwic2lkIjoiZmY0YmMxOTItOWQ0OS00ZDI4LWFkZmEtYzNjN2RhZGJiZGEwIn0.GfQBy3UBWFEO7vE084yZw48A579pmYp2L6TlgM2JsdI",
  "access_expires_at": "2026-10-29T16:04:01.800999707Z",
  "refresh_token": "e3StzHvJENqdgxt0W4-dg72D7laYKoX5-Iw8zhEFG7k",
  "refresh_expires_at": "2026-10-30T03:49:01.800212996Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "a35e3fa5-e340-4545-ba02-f2ef1b9dff0c",
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
  "id": "982a9b9a-c9d6-4c23-aefe-7ae05962d956",
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
  "created_by": "84015309-667b-408e-9731-2b3c5e734ac0",
  "created_at": "2026-10-29T15:49:02.109077Z",
  "updated_at": "2026-10-29T15:49:02.109077Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637947565",
  "device_ref": "sandbox-18357"
}
```

```json
{
  "challenge_id": "18943a44-afd8-41e6-a4df-50ec00a519c8",
  "expires_at": "2026-10-29T15:54:02.421060047Z",
  "resend_available_at": "2026-10-29T15:49:03.421060047Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637947565` → **200**

```json
{
  "phone": "+380637947565",
  "audience": "CLIENT",
  "code": "648258",
  "sent_at": "2026-10-29T15:49:02.426488273Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "18943a44-afd8-41e6-a4df-50ec00a519c8",
  "code": "648258",
  "device_ref": "sandbox-18357"
}
```

```json
{
  "session_id": "8cb4ce8f-5dc8-4cd1-ad32-28bd427043be",
  "subject": {
    "type": "CLIENT",
    "id": "cdd589f8-d067-497f-830f-b6c9663ee4a2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZGQ1ODlmOC1kMDY3LTQ5N2YtODMwZi1iNmM5NjYzZWU0YTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5ODQyLCJpYXQiOjE3OTMyODg5NDIsImp0aSI6IjgwMTU2NDFhLTAxZTgtNGQ1NS05NjMxLTk4OWU4MWVhNjMwYyIsInNpZCI6IjhjYjRjZThmLTVkYzgtNGNkMS1hZDMyLTI4YmQ0MjcwNDNiZSJ9.A87iETsmo4ke2Ozoxy6I_4G3ow6am2l3r71oWkBFKJw",
  "access_expires_at": "2026-10-29T16:04:02.7543292Z",
  "refresh_token": "LrHCGcj7F-ll5_28hf41BTJVkeaD_tw3l3Xb-DF6nAA",
  "refresh_expires_at": "2026-11-28T15:49:02.753518784Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380637947565` → **200**

```json
{
  "client_id": "cdd589f8-d067-497f-830f-b6c9663ee4a2"
}
```

`POST /api/admin/v1/rider-wallets/cdd589f8-d067-497f-830f-b6c9663ee4a2/top-ups` → **201**

```json
{
  "command_id": "1a1a2119-b73e-472e-af93-a0a38f35db6d",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "cdd589f8-d067-497f-830f-b6c9663ee4a2",
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
      "id": "8a15277d-a89e-446c-8e5c-b2c61e208d3f",
      "at": "2026-10-29T15:49:03.350777Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "84015309-667b-408e-9731-2b3c5e734ac0",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5fff953f-4368-42a0-8f04-da1e1ec8cedc",
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
  "id": "f2f1b932-abac-4f6a-b55c-269de9865767",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:54:03.680534Z",
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
      "id": "982a9b9a-c9d6-4c23-aefe-7ae05962d956",
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
  "device_ref": "sandbox-15042"
}
```

```json
{
  "challenge_id": "d5aa0b0e-fb51-4303-b69c-06ba19eb67b3",
  "expires_at": "2026-10-29T15:54:04.016677686Z",
  "resend_available_at": "2026-10-29T15:49:05.016677686Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "250476",
  "sent_at": "2026-10-29T15:49:04.021221946Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d5aa0b0e-fb51-4303-b69c-06ba19eb67b3",
  "code": "250476",
  "device_ref": "sandbox-15042"
}
```

```json
{
  "session_id": "d6afce93-cf1b-4fad-8724-b3ac998b76c8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTg0NCwiaWF0IjoxNzkzMjg4OTQ0LCJqdGkiOiIwODg1ODVjMy1hOGFmLTQ2ZmItOWZiMS0wMzUwODM2ZmYzYzQiLCJzaWQiOiJkNmFmY2U5My1jZjFiLTRmYWQtODcyNC1iM2FjOTk4Yjc2YzgifQ.8BmNgfAFEDtvrRNpDStTaVSLU9ZdjF8kRlNha5QNBTo",
  "access_expires_at": "2026-10-29T16:04:04.34980247Z",
  "refresh_token": "rO7Lm_vv2msUqnRfMf9zkGsbl5cBGE-Zz6Q298G-6v8",
  "refresh_expires_at": "2026-11-28T15:49:04.349035166Z",
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
  "command_id": "12e9e0a3-bae3-404e-96ea-4ac3a86a9928",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:49:04Z",
    "sequence": 1793288944927
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "98f6dbe8-d6c8-47af-bf49-02477b841785",
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
  "last_heartbeat_at": "2026-10-29T15:49:04.950544Z",
  "last_location_at": "2026-10-29T15:49:04.950544Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4a344ba7-988c-4f68-82ca-cd91959476b6",
  "quote_id": "f2f1b932-abac-4f6a-b55c-269de9865767",
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
  "id": "72398b7a-c32c-4224-9530-30b0acf13c1b",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cdd589f8-d067-497f-830f-b6c9663ee4a2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:49:05.264752Z",
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
  "client_id": "cdd589f8-d067-497f-830f-b6c9663ee4a2",
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
      "id": "8a15277d-a89e-446c-8e5c-b2c61e208d3f",
      "at": "2026-10-29T15:49:03.350777Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "84015309-667b-408e-9731-2b3c5e734ac0",
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
    "id": "ae313083-3de6-44b5-91a4-53cd3a9826cb",
    "order_id": "72398b7a-c32c-4224-9530-30b0acf13c1b",
    "expires_at": "2026-10-29T15:49:20.27592Z",
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

`POST /api/driver/v1/offers/ae313083-3de6-44b5-91a4-53cd3a9826cb/accept` → **200**

```json
{
  "command_id": "f6ef4b27-609b-4316-be1b-7449f3b9f294"
}
```

```json
{
  "id": "8736ebc8-1de4-409a-a1c4-de50ef3ebf6d",
  "order_id": "72398b7a-c32c-4224-9530-30b0acf13c1b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "daa44874-ee65-420a-ac26-a636bb90dd48",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "daa44874-ee65-420a-ac26-a636bb90dd48",
  "order_id": "72398b7a-c32c-4224-9530-30b0acf13c1b",
  "assignment_id": "8736ebc8-1de4-409a-a1c4-de50ef3ebf6d",
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

`POST /api/driver/v1/work-sessions/98f6dbe8-d6c8-47af-bf49-02477b841785/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:49:06Z",
    "sequence": 1793288946791
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "98f6dbe8-d6c8-47af-bf49-02477b841785",
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
  "last_heartbeat_at": "2026-10-29T15:49:06.813039Z",
  "last_location_at": "2026-10-29T15:49:06.813039Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/daa44874-ee65-420a-ac26-a636bb90dd48/arrive` → **200**

```json
{
  "command_id": "312cd947-ead7-41e7-ac28-1557a3946116",
  "expected_version": 0
}
```

```json
{
  "id": "daa44874-ee65-420a-ac26-a636bb90dd48",
  "order_id": "72398b7a-c32c-4224-9530-30b0acf13c1b",
  "assignment_id": "8736ebc8-1de4-409a-a1c4-de50ef3ebf6d",
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
  "arrived_at": "2026-10-29T15:49:07.115452Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/daa44874-ee65-420a-ac26-a636bb90dd48/start` → **200**

```json
{
  "command_id": "27ef2d77-16fe-41f2-889e-baea035eadc7",
  "expected_version": 1
}
```

```json
{
  "id": "daa44874-ee65-420a-ac26-a636bb90dd48",
  "order_id": "72398b7a-c32c-4224-9530-30b0acf13c1b",
  "assignment_id": "8736ebc8-1de4-409a-a1c4-de50ef3ebf6d",
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
  "arrived_at": "2026-10-29T15:49:07.115452Z",
  "started_at": "2026-10-29T15:49:07.4327Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/daa44874-ee65-420a-ac26-a636bb90dd48/complete` → **200**

```json
{
  "command_id": "f0d54ae5-658b-462c-a6db-926e013dc645",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:49:07Z",
  "cash_received": true
}
```

```json
{
  "id": "daa44874-ee65-420a-ac26-a636bb90dd48",
  "order_id": "72398b7a-c32c-4224-9530-30b0acf13c1b",
  "assignment_id": "8736ebc8-1de4-409a-a1c4-de50ef3ebf6d",
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
  "arrived_at": "2026-10-29T15:49:07.115452Z",
  "started_at": "2026-10-29T15:49:07.4327Z",
  "completed_at": "2026-10-29T15:49:07.761322Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "cdd589f8-d067-497f-830f-b6c9663ee4a2",
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
      "id": "42c6f243-a2b9-4146-af27-8ee42187fe8f",
      "at": "2026-10-29T15:49:07.920693Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "72398b7a-c32c-4224-9530-30b0acf13c1b"
    },
    {
      "id": "8a15277d-a89e-446c-8e5c-b2c61e208d3f",
      "at": "2026-10-29T15:49:03.350777Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "84015309-667b-408e-9731-2b3c5e734ac0",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/982a9b9a-c9d6-4c23-aefe-7ae05962d956/archive` → **200**

```json
{
  "command_id": "5fecc707-51f1-48a5-97e2-879766873568",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "982a9b9a-c9d6-4c23-aefe-7ae05962d956",
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
  "created_by": "84015309-667b-408e-9731-2b3c5e734ac0",
  "created_at": "2026-10-29T15:49:02.109077Z",
  "updated_at": "2026-10-29T15:49:11.419395Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "98f6dbe8-d6c8-47af-bf49-02477b841785",
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
  "last_heartbeat_at": "2026-10-29T15:49:06.813039Z",
  "last_location_at": "2026-10-29T15:49:06.813039Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/98f6dbe8-d6c8-47af-bf49-02477b841785/close` → **200**

```json
{
  "command_id": "85ff4492-c2cb-4650-8bdb-cfed3195f7e2",
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

Done: order 72398b7a-c32c-4224-9530-30b0acf13c1b.

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
  "session_id": "b0f4b0e2-7666-42ea-b310-255b7b68ee39",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4NTIsImlhdCI6MTc5MzI4ODk1MiwianRpIjoiODNiZGY1ZDUtYzkwMC00ZmMxLTlmNTYtMDJlODZiNDNlODhkIiwic2lkIjoiYjBmNGIwZTItNzY2Ni00MmVhLWIzMTAtMjU1YjdiNjhlZTM5In0.0oB1pxrUjV1BVImqCaO1FbAm6yLeP0NfFS9HkskVdd4",
  "access_expires_at": "2026-10-29T16:04:12.650359803Z",
  "refresh_token": "mIQpUrq3FSN6ZUlijqNzTlDEgU8KkoFivLSTrcW7nko",
  "refresh_expires_at": "2026-10-30T03:49:12.649417821Z",
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
  "command_id": "dc58584e-91e7-4bc5-9722-ecca4ddeeed4",
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
  "session_id": "942f1d3f-b615-4b83-95a7-c0454e67aa0e",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4NTMsImlhdCI6MTc5MzI4ODk1MywianRpIjoiNzI2ZTI0ZDItYTIzYi00Yjg2LWExMmEtMzc0NjY2ZjJjYWM4Iiwic2lkIjoiOTQyZjFkM2YtYjYxNS00YjgzLTk1YTctYzA0NTRlNjdhYTBlIn0.oGNm6zeDndV-5Lr_2fIlp4bbLvnMeDtyL1xOxaCwpGA",
  "access_expires_at": "2026-10-29T16:04:13.84949167Z",
  "refresh_token": "MKMhx29eiWfLSy9Tt77326gkyEkVmrOqPnmMcWkKrGE",
  "refresh_expires_at": "2026-10-30T03:49:13.848682577Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.2788424056",
    "linkedid": "1730052700.2788424056",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679272715"
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
    "id": "1730052700.2788424056",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "656da091-61c6-4ffc-b39f-0402311f3f37",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380679272715",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T15:49:14.147803Z",
      "answered_at": null,
      "ended_at": "2026-10-29T15:49:14.174809Z",
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
    "id": "1730052600.287645981",
    "linkedid": "1730052600.287645981",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679272715"
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
      "id": "d66a4389-4db8-445a-a873-fb27bbe49c49",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679272715",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T15:49:14.507435Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/d66a4389-4db8-445a-a873-fb27bbe49c49/answer` → **200**

```json
{
  "command_id": "86e481c8-6a66-406f-84e0-79b1988d0025"
}
```

```json
{
  "id": "d66a4389-4db8-445a-a873-fb27bbe49c49",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679272715",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "84015309-667b-408e-9731-2b3c5e734ac0",
  "order_ids": [],
  "started_at": "2026-10-29T15:49:14.507435Z",
  "answered_at": "2026-10-29T15:49:14.841677Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.287645981",
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
    "id": "1730052600.287645981",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "d66a4389-4db8-445a-a873-fb27bbe49c49",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679272715",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "84015309-667b-408e-9731-2b3c5e734ac0",
      "order_ids": [],
      "started_at": "2026-10-29T15:49:14.507435Z",
      "answered_at": "2026-10-29T15:49:14.841677Z",
      "ended_at": "2026-10-29T15:49:15.180006Z",
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
      "id": "d66a4389-4db8-445a-a873-fb27bbe49c49",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679272715",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "84015309-667b-408e-9731-2b3c5e734ac0",
      "order_ids": [],
      "started_at": "2026-10-29T15:49:14.507435Z",
      "answered_at": "2026-10-29T15:49:14.841677Z",
      "ended_at": "2026-10-29T15:49:15.180006Z",
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
      "id": "d66a4389-4db8-445a-a873-fb27bbe49c49",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679272715",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "84015309-667b-408e-9731-2b3c5e734ac0",
      "order_ids": [],
      "started_at": "2026-10-29T15:49:14.507435Z",
      "answered_at": "2026-10-29T15:49:14.841677Z",
      "ended_at": "2026-10-29T15:49:15.180006Z",
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
      "id": "d66a4389-4db8-445a-a873-fb27bbe49c49",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679272715",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "84015309-667b-408e-9731-2b3c5e734ac0",
      "order_ids": [],
      "started_at": "2026-10-29T15:49:14.507435Z",
      "answered_at": "2026-10-29T15:49:14.841677Z",
      "ended_at": "2026-10-29T15:49:15.180006Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T15:49:21.550188Z"
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
      "id": "d66a4389-4db8-445a-a873-fb27bbe49c49",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679272715",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "84015309-667b-408e-9731-2b3c5e734ac0",
      "order_ids": [],
      "started_at": "2026-10-29T15:49:14.507435Z",
      "answered_at": "2026-10-29T15:49:14.841677Z",
      "ended_at": "2026-10-29T15:49:15.180006Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T15:49:21.550188Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/d66a4389-4db8-445a-a873-fb27bbe49c49/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/d66a4389-4db8-445a-a873-fb27bbe49c49/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=d66a4389-4db8-445a-a873-fb27bbe49c49` → **200**

```json
{
  "changes": [
    {
      "id": "5077cd40-a716-4c72-948e-aa147b8bafa0",
      "occurred_at": "2026-10-29T15:49:22.770522Z",
      "actor_type": "STAFF",
      "actor_id": "84015309-667b-408e-9731-2b3c5e734ac0",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "d66a4389-4db8-445a-a873-fb27bbe49c49",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"51072b8c-f22c-433a-b982-b5a68875dcbd\", \"order_ids\": []}",
      "correlation_id": "b0fac7df-b0a8-49ab-8cef-d195726d02d8"
    },
    {
      "id": "395f1040-3182-44e7-9508-9dc26559d80d",
      "occurred_at": "2026-10-29T15:49:22.736054Z",
      "actor_type": "STAFF",
      "actor_id": "84015309-667b-408e-9731-2b3c5e734ac0",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "d66a4389-4db8-445a-a873-fb27bbe49c49",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"51072b8c-f22c-433a-b982-b5a68875dcbd\", \"order_ids\": []}",
      "correlation_id": "f37dd0b9-a8b9-4ddf-9035-5a08497296f3"
    }
  ]
}
```

Done: call d66a4389-4db8-445a-a873-fb27bbe49c49 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10198"
}
```

```json
{
  "challenge_id": "9d579e26-fece-426c-a8cb-300bacc7242a",
  "expires_at": "2026-10-29T15:54:23.116733486Z",
  "resend_available_at": "2026-10-29T15:49:24.116733486Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "818220",
  "sent_at": "2026-10-29T15:49:23.121058095Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9d579e26-fece-426c-a8cb-300bacc7242a",
  "code": "818220",
  "device_ref": "sandbox-10198"
}
```

```json
{
  "session_id": "ea92b1b3-a447-4285-ad25-b0927cdc3cc2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTg2MywiaWF0IjoxNzkzMjg4OTYzLCJqdGkiOiIxMGY1OTk4MS03MGJkLTQ5NTgtYjVjMC05ZTg3NDM3NTAwNjYiLCJzaWQiOiJlYTkyYjFiMy1hNDQ3LTQyODUtYWQyNS1iMDkyN2NkYzNjYzIifQ.Z7kR3rcwRE5ShNGAIaBbQT-T12qj-9z4QP_8uujkMtk",
  "access_expires_at": "2026-10-29T16:04:23.458102202Z",
  "refresh_token": "N-6EgB7uZ1Us0yXT2QGR-0MCimqD_6Xz1syAW8LW1a4",
  "refresh_expires_at": "2026-11-28T15:49:23.457403696Z",
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
  "command_id": "eeacf7db-df89-47df-8007-2eccae8f92e6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:49:24Z",
    "sequence": 1793288964497
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2d7ed473-9fc1-4b6a-ba60-376cff2dda0f",
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
  "last_heartbeat_at": "2026-10-29T15:49:24.071298Z",
  "last_location_at": "2026-10-29T15:49:24.071298Z",
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
  "session_id": "53f6fa7d-af40-4b28-8051-39474bceead8",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4NjQsImlhdCI6MTc5MzI4ODk2NCwianRpIjoiYzllMDgyZjItYWQ0MS00NzQ1LWIxZWEtMTQwM2MwYTg0NTM4Iiwic2lkIjoiNTNmNmZhN2QtYWY0MC00YjI4LTgwNTEtMzk0NzRiY2VlYWQ4In0._7wtD71Q37GfFzp4kE2d50TdpgrwYrcRtPQSvpmg0sM",
  "access_expires_at": "2026-10-29T16:04:24.6803369Z",
  "refresh_token": "2lGootaEUEUxCo6aJCzKQnpsmoCt8DbdRVivMnQdzRs",
  "refresh_expires_at": "2026-10-30T03:49:24.679596189Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "3c0e2004-f99f-4c44-9d6a-c393112622a4",
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
  "id": "84750a66-038e-4558-b9b5-0f9c093855f6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:54:24.980856Z",
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
  "command_id": "8e5b5068-239e-4a0b-b85c-cbadb9949281",
  "quote_id": "84750a66-038e-4558-b9b5-0f9c093855f6",
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
    "phone": "+380675536576"
  }
}
```

```json
{
  "id": "02c3a07c-5b6b-4a1c-8541-4d3498495694",
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
  "created_at": "2026-10-29T15:49:25.311508Z",
  "caller": {
    "name": "Олена",
    "phone": "+380675536576"
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
    "id": "13f1e455-83c8-434d-9996-76d703effa47",
    "order_id": "02c3a07c-5b6b-4a1c-8541-4d3498495694",
    "expires_at": "2026-10-29T15:49:40.31733Z",
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

`POST /api/driver/v1/offers/13f1e455-83c8-434d-9996-76d703effa47/accept` → **200**

```json
{
  "command_id": "4c2b018f-a1d2-4bbe-8bce-4f2c8e3165b9"
}
```

```json
{
  "id": "fbe3c3a4-9cff-4104-bc6a-2e05f461bb1f",
  "order_id": "02c3a07c-5b6b-4a1c-8541-4d3498495694",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "44bada39-98b0-4849-aa29-e378cd4d6fcb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380675536576` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380675536576` → **200**

```json
[
  {
    "phone": "+380675536576",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:49:26.821250148Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675536576` → **200**

```json
[
  {
    "phone": "+380675536576",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:49:26.821250148Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675536576` → **200**

```json
[
  {
    "phone": "+380675536576",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:49:26.821250148Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "44bada39-98b0-4849-aa29-e378cd4d6fcb",
  "order_id": "02c3a07c-5b6b-4a1c-8541-4d3498495694",
  "assignment_id": "fbe3c3a4-9cff-4104-bc6a-2e05f461bb1f",
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
    "phone": "+380675536576"
  }
}
```

`POST /api/driver/v1/work-sessions/2d7ed473-9fc1-4b6a-ba60-376cff2dda0f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:49:27Z",
    "sequence": 1793288967638
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2d7ed473-9fc1-4b6a-ba60-376cff2dda0f",
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
  "last_heartbeat_at": "2026-10-29T15:49:27.661345Z",
  "last_location_at": "2026-10-29T15:49:27.661345Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/44bada39-98b0-4849-aa29-e378cd4d6fcb/arrive` → **200**

```json
{
  "command_id": "c7ede8d8-2dc2-4d51-8bfd-99df6f339afa",
  "expected_version": 0
}
```

```json
{
  "id": "44bada39-98b0-4849-aa29-e378cd4d6fcb",
  "order_id": "02c3a07c-5b6b-4a1c-8541-4d3498495694",
  "assignment_id": "fbe3c3a4-9cff-4104-bc6a-2e05f461bb1f",
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
  "arrived_at": "2026-10-29T15:49:27.961549Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675536576"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380675536576` → **200**

```json
[
  {
    "phone": "+380675536576",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:49:26.821250148Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675536576` → **200**

```json
[
  {
    "phone": "+380675536576",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:49:26.821250148Z"
  },
  {
    "phone": "+380675536576",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T15:49:28.831475443Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675536576` → **200**

```json
[
  {
    "phone": "+380675536576",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:49:26.821250148Z"
  },
  {
    "phone": "+380675536576",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T15:49:28.831475443Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675536576` → **200**

```json
[
  {
    "phone": "+380675536576",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:49:26.821250148Z"
  },
  {
    "phone": "+380675536576",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T15:49:28.831475443Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/44bada39-98b0-4849-aa29-e378cd4d6fcb/start` → **200**

```json
{
  "command_id": "c4d568d0-c9c1-49b1-836e-2dca960d0bc2",
  "expected_version": 1
}
```

```json
{
  "id": "44bada39-98b0-4849-aa29-e378cd4d6fcb",
  "order_id": "02c3a07c-5b6b-4a1c-8541-4d3498495694",
  "assignment_id": "fbe3c3a4-9cff-4104-bc6a-2e05f461bb1f",
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
  "arrived_at": "2026-10-29T15:49:27.961549Z",
  "started_at": "2026-10-29T15:49:29.396849Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675536576"
  }
}
```

`POST /api/driver/v1/trips/44bada39-98b0-4849-aa29-e378cd4d6fcb/complete` → **200**

```json
{
  "command_id": "cd3b9c26-ac30-48db-b0be-810add0b8f27",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:49:29Z",
  "cash_received": true
}
```

```json
{
  "id": "44bada39-98b0-4849-aa29-e378cd4d6fcb",
  "order_id": "02c3a07c-5b6b-4a1c-8541-4d3498495694",
  "assignment_id": "fbe3c3a4-9cff-4104-bc6a-2e05f461bb1f",
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
  "arrived_at": "2026-10-29T15:49:27.961549Z",
  "started_at": "2026-10-29T15:49:29.396849Z",
  "completed_at": "2026-10-29T15:49:29.720506Z",
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
  "session_id": "2d7ed473-9fc1-4b6a-ba60-376cff2dda0f",
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
  "last_heartbeat_at": "2026-10-29T15:49:27.661345Z",
  "last_location_at": "2026-10-29T15:49:27.661345Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2d7ed473-9fc1-4b6a-ba60-376cff2dda0f/close` → **200**

```json
{
  "command_id": "9b051be2-485e-4699-93ba-ecb1fcf05ca3",
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
  "phone": "+380635639764",
  "device_ref": "sandbox-25599"
}
```

```json
{
  "challenge_id": "038b59ea-a6d6-46c4-a5ba-7025053f17c5",
  "expires_at": "2026-10-29T15:54:30.636301397Z",
  "resend_available_at": "2026-10-29T15:49:31.636301397Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635639764` → **200**

```json
{
  "phone": "+380635639764",
  "audience": "CLIENT",
  "code": "039546",
  "sent_at": "2026-10-29T15:49:30.640260563Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "038b59ea-a6d6-46c4-a5ba-7025053f17c5",
  "code": "039546",
  "device_ref": "sandbox-25599"
}
```

```json
{
  "session_id": "e158aaf6-8b36-4589-94e2-7eeec75df080",
  "subject": {
    "type": "CLIENT",
    "id": "1e087b33-4ac6-477a-9b5d-e894d05f0832"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZTA4N2IzMy00YWM2LTQ3N2EtOWI1ZC1lODk0ZDA1ZjA4MzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5ODcwLCJpYXQiOjE3OTMyODg5NzAsImp0aSI6IjM2ZDBjYTE4LWE2MDgtNDBiZS1iNmEwLTA4NTE2NDBhZTAzNiIsInNpZCI6ImUxNThhYWY2LThiMzYtNDU4OS05NGUyLTdlZWVjNzVkZjA4MCJ9.XJPcPf40j41DlhP0A_uOq7hX2iGyRD6hKa-Jj2UVZG8",
  "access_expires_at": "2026-10-29T16:04:30.96863045Z",
  "refresh_token": "rN66PPT2xMeS7eJEEankf_t9PN6-5NXT9-8Wc_vzjMc",
  "refresh_expires_at": "2026-11-28T15:49:30.968067414Z",
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
        "en": "Changed my mind",
        "uk": "Передумав їхати",
        "pl": "Zmiana planów"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "ru": "Долго ждать машину",
        "en": "The wait is too long",
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "ru": "Ошибся адресом",
        "en": "Wrong address",
        "uk": "Помилився адресою",
        "pl": "Błędny adres"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "ru": "Уеду на другом транспорте",
        "en": "Found other transport",
        "uk": "Поїду іншим транспортом",
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
  "device_ref": "sandbox-22837"
}
```

```json
{
  "challenge_id": "e9a49012-d344-4cb7-88b5-0d01a330e5f8",
  "expires_at": "2026-10-29T15:54:31.54611457Z",
  "resend_available_at": "2026-10-29T15:49:32.54611457Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "148638",
  "sent_at": "2026-10-29T15:49:31.549703684Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9a49012-d344-4cb7-88b5-0d01a330e5f8",
  "code": "148638",
  "device_ref": "sandbox-22837"
}
```

```json
{
  "session_id": "d82f5084-6f1d-4efb-97ee-5d67c425e0a7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTg3MSwiaWF0IjoxNzkzMjg4OTcxLCJqdGkiOiJjZGRkNjJjMy0zYmFmLTQyNDQtOTFjNS1mMDU3OWVmOThhMzAiLCJzaWQiOiJkODJmNTA4NC02ZjFkLTRlZmItOTdlZS01ZDY3YzQyNWUwYTcifQ.C6okDJhG8YFdoRFStUtBA2oAc-4hjfULtkzzywkmP9c",
  "access_expires_at": "2026-10-29T16:04:31.871746561Z",
  "refresh_token": "8DpOGtaqk_FxWilb3sTmyEn111K20Yc_9vZMexu5jc8",
  "refresh_expires_at": "2026-11-28T15:49:31.871019061Z",
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
        "en": "Passenger did not show up",
        "uk": "Пасажир не вийшов",
        "pl": "Pasażer nie przyszedł"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "ru": "Неисправность автомобиля",
        "en": "Vehicle problem",
        "uk": "Несправність автомобіля",
        "pl": "Awaria samochodu"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "ru": "Не могу подъехать",
        "en": "Cannot reach the pickup",
        "uk": "Не можу під'їхати",
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
  "session_id": "0db85f20-9a74-4217-90c2-4053309c9b1d",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4NzIsImlhdCI6MTc5MzI4ODk3MiwianRpIjoiNmM4ZWUwNjEtMTI5Zi00ZjUzLTliNTctOTJmMWRiOTEyZTFlIiwic2lkIjoiMGRiODVmMjAtOWE3NC00MjE3LTkwYzItNDA1MzMwOWM5YjFkIn0.4bWVN2iORCA6cr83xx-16BDIbGE194bKsgr33GfZ1Mg",
  "access_expires_at": "2026-10-29T16:04:32.734912515Z",
  "refresh_token": "8dEoomu1YysZwZT4GQSH8jf263Dl-nwOYrWYwLSnOtY",
  "refresh_expires_at": "2026-10-30T03:49:32.734256731Z",
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
  "session_id": "fec2a2af-2c1e-4747-bc33-88fcf71768f1",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4NzMsImlhdCI6MTc5MzI4ODk3MywianRpIjoiYWI5ZDA4ZGItNDQyMS00MGQ4LWI4YWItZWFhMGJmZGViY2E0Iiwic2lkIjoiZmVjMmEyYWYtMmMxZS00NzQ3LWJjMzMtODhmY2Y3MTc2OGYxIn0.f1uiGSlxtlazRj1EiWKDs76m5M-AgxPG1Xbxm3LYPJo",
  "access_expires_at": "2026-10-29T16:04:33.306905788Z",
  "refresh_token": "vQdyq3E3NcmvRvo-RkzSOfZc6pfx3kkCs8J4e6lDs4M",
  "refresh_expires_at": "2026-10-30T03:49:33.306284006Z",
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
        "en": "Passenger asked",
        "uk": "Пасажир попросив",
        "pl": "Na prośbę pasażera"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "ru": "Дубль заказа",
        "en": "Duplicate order",
        "uk": "Дубль замовлення",
        "pl": "Duplikat zamówienia"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "ru": "Нет свободных машин",
        "en": "No cars available",
        "uk": "Немає вільних авто",
        "pl": "Brak wolnych aut"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "ru": "Тестовый заказ",
        "en": "Test order",
        "uk": "Тестове замовлення",
        "pl": "Zamówienie testowe"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "ru": "Ошибка оператора",
        "en": "Operator error",
        "uk": "Помилка оператора",
        "pl": "Błąd operatora"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "ru": "ДТП",
        "en": "Accident",
        "uk": "ДТП",
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
  "command_id": "be4dcd7b-e4ac-45ae-860a-cedfcfcbdf4d",
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
  "id": "ffe5dd7f-cb76-467b-9173-60b789434fa8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:54:33.908Z",
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
  "command_id": "788e5c42-181f-4372-beb6-7aca2bb600e5",
  "quote_id": "ffe5dd7f-cb76-467b-9173-60b789434fa8",
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
  "id": "ce4a650b-27d3-4b64-97e9-cc77bf71968c",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e087b33-4ac6-477a-9b5d-e894d05f0832",
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
  "created_at": "2026-10-29T15:49:34.21645Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ce4a650b-27d3-4b64-97e9-cc77bf71968c` → **200**

```json
{
  "id": "ce4a650b-27d3-4b64-97e9-cc77bf71968c",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e087b33-4ac6-477a-9b5d-e894d05f0832",
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
  "created_at": "2026-10-29T15:49:34.21645Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ce4a650b-27d3-4b64-97e9-cc77bf71968c/cancel` → **200**

```json
{
  "command_id": "52e0d839-e6db-45be-9d5e-24bb0a694a40",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "ce4a650b-27d3-4b64-97e9-cc77bf71968c",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1e087b33-4ac6-477a-9b5d-e894d05f0832",
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
  "created_at": "2026-10-29T15:49:34.21645Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "ru": "Долго ждать машину",
      "en": "The wait is too long",
      "uk": "Довго чекати авто",
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
  "command_id": "b5b69283-3328-442f-8b5e-d133d76f4162",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:49:35Z",
    "sequence": 1793288975477
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5027022d-2578-42b1-9bbb-48af0885186a",
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
  "last_heartbeat_at": "2026-10-29T15:49:35.4983Z",
  "last_location_at": "2026-10-29T15:49:35.4983Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-8672"
}
```

```json
{
  "challenge_id": "575819bb-42df-4716-9053-4d19b91b001f",
  "expires_at": "2026-10-29T15:54:35.783112799Z",
  "resend_available_at": "2026-10-29T15:49:36.783112799Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "008372",
  "sent_at": "2026-10-29T15:49:35.786636175Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "575819bb-42df-4716-9053-4d19b91b001f",
  "code": "008372",
  "device_ref": "sandbox-8672"
}
```

```json
{
  "session_id": "1cd8b97c-4292-4420-87f9-3f9648605539",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTg3NiwiaWF0IjoxNzkzMjg4OTc2LCJqdGkiOiIzODQ0NDA0YS1kZDg4LTRkMWQtYTQwMC03M2M4MDBiNmM2Y2IiLCJzaWQiOiIxY2Q4Yjk3Yy00MjkyLTQ0MjAtODdmOS0zZjk2NDg2MDU1MzkifQ.R4Rsz5SmqlAP6MADHniZPcLBwQJAwd-Ntb8Obi9jUzM",
  "access_expires_at": "2026-10-29T16:04:36.103176173Z",
  "refresh_token": "f46Wb8QFV5efrw0tgxxeZkZ0ydJy40OEC-bFJQVLwOo",
  "refresh_expires_at": "2026-11-28T15:49:36.102590207Z",
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
  "command_id": "80d2336b-0e71-4824-81e4-84e5e5288edb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:49:36Z",
    "sequence": 1793288976688
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2b92c2f5-3e98-4ef6-bb8a-6f74e56c5c11",
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
  "last_heartbeat_at": "2026-10-29T15:49:36.709712Z",
  "last_location_at": "2026-10-29T15:49:36.709712Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "99f8aaf5-04a9-4bfe-83e9-3fa2127562b2",
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
  "id": "957a4822-20e9-46c5-ac89-ae2148949b06",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:54:37.002908Z",
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
  "command_id": "57db72ff-8990-4710-8b8c-a8a6165923bb",
  "quote_id": "957a4822-20e9-46c5-ac89-ae2148949b06",
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
  "id": "fa31e996-bd2f-4657-93b1-3210657bedd2",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e087b33-4ac6-477a-9b5d-e894d05f0832",
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
  "created_at": "2026-10-29T15:49:37.315848Z",
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
    "id": "2caff98d-70fd-4b1d-9973-2b0986438dc3",
    "order_id": "fa31e996-bd2f-4657-93b1-3210657bedd2",
    "expires_at": "2026-10-29T15:49:52.334176Z",
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

`POST /api/driver/v1/offers/2caff98d-70fd-4b1d-9973-2b0986438dc3/accept` → **200**

```json
{
  "command_id": "88b080c0-5963-43b7-9dff-484b933529f8"
}
```

```json
{
  "id": "075d79ba-0ca6-47ac-a64f-533d8106049c",
  "order_id": "fa31e996-bd2f-4657-93b1-3210657bedd2",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f147bc1d-49e5-48c1-9dca-cef3bbc362dd",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f147bc1d-49e5-48c1-9dca-cef3bbc362dd",
  "order_id": "fa31e996-bd2f-4657-93b1-3210657bedd2",
  "assignment_id": "075d79ba-0ca6-47ac-a64f-533d8106049c",
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

`POST /api/driver/v1/trips/f147bc1d-49e5-48c1-9dca-cef3bbc362dd/cancel` → **200**

```json
{
  "command_id": "53b779a4-8524-4a42-a598-394377dafd5a",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "f147bc1d-49e5-48c1-9dca-cef3bbc362dd",
  "order_id": "fa31e996-bd2f-4657-93b1-3210657bedd2",
  "assignment_id": "075d79ba-0ca6-47ac-a64f-533d8106049c",
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

`GET /api/rider/v1/orders/fa31e996-bd2f-4657-93b1-3210657bedd2` → **200**

```json
{
  "id": "fa31e996-bd2f-4657-93b1-3210657bedd2",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "1e087b33-4ac6-477a-9b5d-e894d05f0832",
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
    "id": "075d79ba-0ca6-47ac-a64f-533d8106049c",
    "order_id": "fa31e996-bd2f-4657-93b1-3210657bedd2",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "f147bc1d-49e5-48c1-9dca-cef3bbc362dd",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T15:49:37.315848Z",
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
    "id": "9caf8397-8477-40e5-835d-1b6de75d8eea",
    "order_id": "fa31e996-bd2f-4657-93b1-3210657bedd2",
    "expires_at": "2026-10-29T15:49:53.561953Z",
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

`POST /api/driver/v1/offers/9caf8397-8477-40e5-835d-1b6de75d8eea/accept` → **200**

```json
{
  "command_id": "25dab60e-dbfc-4b28-a068-e7ba38098e19"
}
```

```json
{
  "id": "575b1159-33f4-4db9-a835-05394e7372d2",
  "order_id": "fa31e996-bd2f-4657-93b1-3210657bedd2",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "117b86c7-3db9-4ed9-9068-572f293fc3f2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "117b86c7-3db9-4ed9-9068-572f293fc3f2",
  "order_id": "fa31e996-bd2f-4657-93b1-3210657bedd2",
  "assignment_id": "575b1159-33f4-4db9-a835-05394e7372d2",
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

`POST /api/driver/v1/trips/117b86c7-3db9-4ed9-9068-572f293fc3f2/cancel` → **200**

```json
{
  "command_id": "f825d9e7-c850-4932-823d-263f7fe76704",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "117b86c7-3db9-4ed9-9068-572f293fc3f2",
  "order_id": "fa31e996-bd2f-4657-93b1-3210657bedd2",
  "assignment_id": "575b1159-33f4-4db9-a835-05394e7372d2",
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
    "id": "fa31e996-bd2f-4657-93b1-3210657bedd2",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T15:49:37.315848Z",
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
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie"
      }
    },
    "pickup_at": null
  },
  {
    "id": "ce4a650b-27d3-4b64-97e9-cc77bf71968c",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T15:49:34.21645Z",
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
        "en": "The wait is too long",
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/fa31e996-bd2f-4657-93b1-3210657bedd2/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:49:37.316495Z",
      "actor": {
        "type": "CLIENT",
        "id": "1e087b33-4ac6-477a-9b5d-e894d05f0832",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "fa31e996-bd2f-4657-93b1-3210657bedd2",
        "quote_id": "957a4822-20e9-46c5-ac89-ae2148949b06",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "81bc919d-f0b2-4217-91c6-e69fbfabe71d"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:49:37.319001Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "fa31e996-bd2f-4657-93b1-3210657bedd2",
        "attempt_id": "f2e4a570-4e86-419c-9dfb-f5cbb193dc19",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "81bc919d-f0b2-4217-91c6-e69fbfabe71d"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T15:49:37.34095Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "2caff98d-70fd-4b1d-9973-2b0986438dc3",
        "order_id": "fa31e996-bd2f-4657-93b1-3210657bedd2",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "81bc919d-f0b2-4217-91c6-e69fbfabe71d"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T15:49:37.962925Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "2caff98d-70fd-4b1d-9973-2b0986438dc3",
        "order_id": "fa31e996-bd2f-4657-93b1-3210657bedd2",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "075d79ba-0ca6-47ac-a64f-533d8106049c"
      },
      "correlation_id": "63596c15-b26c-4c38-b0fd-490c1bc0a06f"
```

Done: orders ce4a650b-27d3-4b64-97e9-cc77bf71968c, fa31e996-bd2f-4657-93b1-3210657bedd2.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738905036",
  "device_ref": "sandbox-1565"
}
```

```json
{
  "challenge_id": "7a6c6c70-1ab4-4bc1-b69a-933accb5de99",
  "expires_at": "2026-10-29T15:54:41.058976812Z",
  "resend_available_at": "2026-10-29T15:49:42.058976812Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738905036` → **200**

```json
{
  "phone": "+380738905036",
  "audience": "CLIENT",
  "code": "454076",
  "sent_at": "2026-10-29T15:49:41.062816511Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7a6c6c70-1ab4-4bc1-b69a-933accb5de99",
  "code": "454076",
  "device_ref": "sandbox-1565"
}
```

```json
{
  "session_id": "bde17073-45c5-421c-b616-2d7761e928be",
  "subject": {
    "type": "CLIENT",
    "id": "d359a6fb-e18b-4ae3-b146-31f19ef16db3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzU5YTZmYi1lMThiLTRhZTMtYjE0Ni0zMWYxOWVmMTZkYjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5ODgxLCJpYXQiOjE3OTMyODg5ODEsImp0aSI6IjMxODVjOTZmLTI1ZmQtNDZkMi1hMDMzLTQyNTE1ZGEyMjk0NiIsInNpZCI6ImJkZTE3MDczLTQ1YzUtNDIxYy1iNjE2LTJkNzc2MWU5MjhiZSJ9.izOc27_0-k1ekcH4ZFktznKSPVAvjWPkTO4YXiX8RHo",
  "access_expires_at": "2026-10-29T16:04:41.404541532Z",
  "refresh_token": "8OLwJ3fMvb6OBp7JNWQtgfJX4P2ON2ZjTbLbAVa_HZ8",
  "refresh_expires_at": "2026-11-28T15:49:41.403913311Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "e9150302-b64f-40f6-a6fb-524e7d2fbcb2",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "0786b20d-bc9b-4d08-90cc-03817eaccd2a",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-0786b20d-bc9b-4d08-90cc-03817eaccd2a",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "858c8846a5a853d405d9a550526792b0",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=0786b20d-bc9b-4d08-90cc-03817eaccd2a",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738905036"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=0786b20d-bc9b-4d08-90cc-03817eaccd2a",
  "expires_at": "2026-10-29T16:19:41.741896Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/0786b20d-bc9b-4d08-90cc-03817eaccd2a` → **200**

```json
{
  "id": "0786b20d-bc9b-4d08-90cc-03817eaccd2a",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T16:19:41.741896Z",
  "card": {
    "id": "06043e2c-045c-4e08-8737-5352dcd4a572",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8569",
    "card_type": "Visa",
    "created_at": "2026-10-29T15:49:42.055407Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "06043e2c-045c-4e08-8737-5352dcd4a572",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****8569",
      "card_type": "Visa",
      "created_at": "2026-10-29T15:49:42.055407Z"
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
  "device_ref": "sandbox-1379"
}
```

```json
{
  "challenge_id": "56ef782d-64a9-4d73-908e-fa30661de869",
  "expires_at": "2026-10-29T15:54:42.664662589Z",
  "resend_available_at": "2026-10-29T15:49:43.664662589Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "561247",
  "sent_at": "2026-10-29T15:49:42.66809244Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "56ef782d-64a9-4d73-908e-fa30661de869",
  "code": "561247",
  "device_ref": "sandbox-1379"
}
```

```json
{
  "session_id": "3bbb09bc-9a3f-4933-91f6-8d5d2935a6d3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTg4MiwiaWF0IjoxNzkzMjg4OTgyLCJqdGkiOiIzNjNjOWM5Zi0yNjVhLTRkMjEtODA3NS00MDg1YmM2MDU4NGQiLCJzaWQiOiIzYmJiMDliYy05YTNmLTQ5MzMtOTFmNi04ZDVkMjkzNWE2ZDMifQ.Uy_o_9nN0YJ8P4w9I4p7fnT4pI6hNXXRHGZ288OhTWs",
  "access_expires_at": "2026-10-29T16:04:42.972952726Z",
  "refresh_token": "0vx-fiFSKg6OqmT3nTsAvwY7atSNJbSMgKumyMYXPrc",
  "refresh_expires_at": "2026-11-28T15:49:42.972327037Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2b92c2f5-3e98-4ef6-bb8a-6f74e56c5c11",
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
  "last_heartbeat_at": "2026-10-29T15:49:36.709712Z",
  "last_location_at": "2026-10-29T15:49:36.709712Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2b92c2f5-3e98-4ef6-bb8a-6f74e56c5c11/handover` → **200**

```json
{
  "command_id": "b46eca9c-310b-4b67-9dd9-11f57fde2344",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2b92c2f5-3e98-4ef6-bb8a-6f74e56c5c11",
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
  "last_heartbeat_at": "2026-10-29T15:49:36.709712Z",
  "last_location_at": "2026-10-29T15:49:36.709712Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2b92c2f5-3e98-4ef6-bb8a-6f74e56c5c11/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:49:43Z",
    "sequence": 1793288983836
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2b92c2f5-3e98-4ef6-bb8a-6f74e56c5c11",
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
  "last_heartbeat_at": "2026-10-29T15:49:43.855135Z",
  "last_location_at": "2026-10-29T15:49:43.855135Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ec408ed9-6af9-4d05-a7d4-6f8c934b40ba",
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
  "id": "e81ac121-a401-41be-a06a-7a0ab90082a8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:54:44.158276Z",
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
  "command_id": "3d87c213-100b-4b2f-90de-d25cd1b2e7ab",
  "quote_id": "e81ac121-a401-41be-a06a-7a0ab90082a8",
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
  "id": "9be52889-2fa0-440a-ac4d-ead40b249bff",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "d359a6fb-e18b-4ae3-b146-31f19ef16db3",
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
  "created_at": "2026-10-29T15:49:44.474065Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9be52889-2fa0-440a-ac4d-ead40b249bff` → **200**

```json
{
  "id": "9be52889-2fa0-440a-ac4d-ead40b249bff",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "d359a6fb-e18b-4ae3-b146-31f19ef16db3",
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
  "created_at": "2026-10-29T15:49:44.474065Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9be52889-2fa0-440a-ac4d-ead40b249bff` → **200**

```json
{
  "id": "9be52889-2fa0-440a-ac4d-ead40b249bff",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d359a6fb-e18b-4ae3-b146-31f19ef16db3",
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
  "created_at": "2026-10-29T15:49:44.474065Z",
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
    "id": "b1c04820-defc-475d-a1cb-7e6b9ba63eea",
    "order_id": "9be52889-2fa0-440a-ac4d-ead40b249bff",
    "expires_at": "2026-10-29T15:50:00.210647Z",
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

`POST /api/driver/v1/offers/b1c04820-defc-475d-a1cb-7e6b9ba63eea/accept` → **200**

```json
{
  "command_id": "d663f2ac-ddd4-4b86-b833-4cad857497ba"
}
```

```json
{
  "id": "6edd10f8-0e5c-4dc1-b3a3-e24206428095",
  "order_id": "9be52889-2fa0-440a-ac4d-ead40b249bff",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "415a158f-8cfe-442f-bbf0-daa429a97963",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "415a158f-8cfe-442f-bbf0-daa429a97963",
  "order_id": "9be52889-2fa0-440a-ac4d-ead40b249bff",
  "assignment_id": "6edd10f8-0e5c-4dc1-b3a3-e24206428095",
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

`POST /api/driver/v1/work-sessions/2b92c2f5-3e98-4ef6-bb8a-6f74e56c5c11/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:49:47Z",
    "sequence": 1793288987274
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2b92c2f5-3e98-4ef6-bb8a-6f74e56c5c11",
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
  "last_heartbeat_at": "2026-10-29T15:49:47.293433Z",
  "last_location_at": "2026-10-29T15:49:47.293433Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/415a158f-8cfe-442f-bbf0-daa429a97963/arrive` → **200**

```json
{
  "command_id": "81c3c4f7-51b4-4d03-9551-2e94bde78fc6",
  "expected_version": 0
}
```

```json
{
  "id": "415a158f-8cfe-442f-bbf0-daa429a97963",
  "order_id": "9be52889-2fa0-440a-ac4d-ead40b249bff",
  "assignment_id": "6edd10f8-0e5c-4dc1-b3a3-e24206428095",
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
  "arrived_at": "2026-10-29T15:49:47.587868Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/415a158f-8cfe-442f-bbf0-daa429a97963/start` → **200**

```json
{
  "command_id": "48dd9c7d-9441-4955-8394-598ef597c203",
  "expected_version": 1
}
```

```json
{
  "id": "415a158f-8cfe-442f-bbf0-daa429a97963",
  "order_id": "9be52889-2fa0-440a-ac4d-ead40b249bff",
  "assignment_id": "6edd10f8-0e5c-4dc1-b3a3-e24206428095",
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
  "arrived_at": "2026-10-29T15:49:47.587868Z",
  "started_at": "2026-10-29T15:49:47.889935Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/415a158f-8cfe-442f-bbf0-daa429a97963/complete` → **200**

```json
{
  "command_id": "217496f0-2aa6-4c94-aa9e-1cb3eb2af2b9",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:49:48Z",
  "cash_received": true
}
```

```json
{
  "id": "415a158f-8cfe-442f-bbf0-daa429a97963",
  "order_id": "9be52889-2fa0-440a-ac4d-ead40b249bff",
  "assignment_id": "6edd10f8-0e5c-4dc1-b3a3-e24206428095",
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
  "arrived_at": "2026-10-29T15:49:47.587868Z",
  "started_at": "2026-10-29T15:49:47.889935Z",
  "completed_at": "2026-10-29T15:49:48.199035Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/9be52889-2fa0-440a-ac4d-ead40b249bff` → **200**

```json
{
  "id": "9be52889-2fa0-440a-ac4d-ead40b249bff",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "d359a6fb-e18b-4ae3-b146-31f19ef16db3",
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
    "id": "6edd10f8-0e5c-4dc1-b3a3-e24206428095",
    "order_id": "9be52889-2fa0-440a-ac4d-ead40b249bff",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "415a158f-8cfe-442f-bbf0-daa429a97963",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:49:44.474065Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9be52889-2fa0-440a-ac4d-ead40b249bff` → **200**

```json
{
  "id": "9be52889-2fa0-440a-ac4d-ead40b249bff",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "d359a6fb-e18b-4ae3-b146-31f19ef16db3",
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
    "id": "6edd10f8-0e5c-4dc1-b3a3-e24206428095",
    "order_id": "9be52889-2fa0-440a-ac4d-ead40b249bff",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "415a158f-8cfe-442f-bbf0-daa429a97963",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:49:44.474065Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9be52889-2fa0-440a-ac4d-ead40b249bff` → **200**

```json
{
  "id": "9be52889-2fa0-440a-ac4d-ead40b249bff",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "d359a6fb-e18b-4ae3-b146-31f19ef16db3",
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
    "id": "6edd10f8-0e5c-4dc1-b3a3-e24206428095",
    "order_id": "9be52889-2fa0-440a-ac4d-ead40b249bff",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "415a158f-8cfe-442f-bbf0-daa429a97963",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:49:44.474065Z",
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

`GET /api/rider/v1/orders/9be52889-2fa0-440a-ac4d-ead40b249bff/tip` → **200**

```json
{
  "order_id": "9be52889-2fa0-440a-ac4d-ead40b249bff",
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
  "available_until": "2026-10-30T15:49:48.199035Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/9be52889-2fa0-440a-ac4d-ead40b249bff/tip` → **201**

```json
{
  "command_id": "e49769a2-a842-495d-bec9-64f8865ee021",
  "amount_minor": 2500
}
```

```json
{
  "id": "c8f05786-8313-4c9d-b7da-bf4c45f08a41",
  "order_id": "9be52889-2fa0-440a-ac4d-ead40b249bff",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T15:49:52.025494Z"
}
```

`GET /api/rider/v1/orders/9be52889-2fa0-440a-ac4d-ead40b249bff/tip` → **200**

```json
{
  "order_id": "9be52889-2fa0-440a-ac4d-ead40b249bff",
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
  "available_until": "2026-10-30T15:49:48.199035Z",
  "open": false,
  "tip": {
    "id": "c8f05786-8313-4c9d-b7da-bf4c45f08a41",
    "order_id": "9be52889-2fa0-440a-ac4d-ead40b249bff",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T15:49:52.025494Z"
  }
}
```

`GET /api/rider/v1/orders/9be52889-2fa0-440a-ac4d-ead40b249bff/tip` → **200**

```json
{
  "order_id": "9be52889-2fa0-440a-ac4d-ead40b249bff",
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
  "available_until": "2026-10-30T15:49:48.199035Z",
  "open": false,
  "tip": {
    "id": "c8f05786-8313-4c9d-b7da-bf4c45f08a41",
    "order_id": "9be52889-2fa0-440a-ac4d-ead40b249bff",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T15:49:52.025494Z"
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
      "id": "83ee566f-2394-486e-8b8b-93265c9613aa",
      "at": "2026-10-29T15:49:53.353065Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "9be52889-2fa0-440a-ac4d-ead40b249bff",
      "counterpart_id": null
    },
    {
      "id": "4e2f5ca7-59a7-47e6-9062-7c0794bbe1ea",
      "at": "2026-10-29T15:49:48.275965Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "9be52889-2fa0-440a-ac4d-ead40b249bff",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5052860d-2073-44e9-8ed5-feaff0eeb2b3",
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
  "id": "9c8dfba6-0724-4f9b-92c2-55101b511771",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:54:54.229986Z",
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
  "session_id": "c473b435-4cc4-4fae-bd54-cab79cda6195",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4OTQsImlhdCI6MTc5MzI4ODk5NCwianRpIjoiMjljMTIzNjYtNmZjNC00YjFmLTk4NDMtY2JjZmM5NWU2ZTFkIiwic2lkIjoiYzQ3M2I0MzUtNGNjNC00ZmFlLWJkNTQtY2FiNzljZGE2MTk1In0.H8Smdmc4e-f7rc7rPpM9YFLxCicqR_NrTNbDaGFcuIs",
  "access_expires_at": "2026-10-29T16:04:54.827194241Z",
  "refresh_token": "VnA-nNR4UaUv0Nh8lAmB-_Fl1IHeUVqF8AwL01bioKA",
  "refresh_expires_at": "2026-10-30T03:49:54.826623203Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380738905036` → **200**

```json
{
  "client_id": "d359a6fb-e18b-4ae3-b146-31f19ef16db3"
}
```

`POST /api/admin/v1/rider-wallets/d359a6fb-e18b-4ae3-b146-31f19ef16db3/top-ups` → **201**

```json
{
  "command_id": "1e285199-6060-4e3b-8927-56e29c99b8fb",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "d359a6fb-e18b-4ae3-b146-31f19ef16db3",
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
      "id": "5c204fb5-3603-471f-b880-97d6ed597a4f",
      "at": "2026-10-29T15:49:55.408505Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "84015309-667b-408e-9731-2b3c5e734ac0",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9eeb4484-b172-4577-abab-de54eaa7fdfb",
  "quote_id": "9c8dfba6-0724-4f9b-92c2-55101b511771",
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
  "id": "198682c4-701d-4196-a804-d75a47148f91",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d359a6fb-e18b-4ae3-b146-31f19ef16db3",
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
  "created_at": "2026-10-29T15:49:55.729321Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/198682c4-701d-4196-a804-d75a47148f91` → **200**

```json
{
  "id": "198682c4-701d-4196-a804-d75a47148f91",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d359a6fb-e18b-4ae3-b146-31f19ef16db3",
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
  "created_at": "2026-10-29T15:49:55.729321Z",
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
    "id": "67f0967c-69f5-43e5-90c3-4707e5a80acf",
    "order_id": "198682c4-701d-4196-a804-d75a47148f91",
    "expires_at": "2026-10-29T15:50:10.734818Z",
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

`POST /api/driver/v1/offers/67f0967c-69f5-43e5-90c3-4707e5a80acf/accept` → **200**

```json
{
  "command_id": "636ab994-1d30-415d-b9a7-6a6683444e59"
}
```

```json
{
  "id": "c2ac880b-ae44-4db7-9414-c95bf9bb09c9",
  "order_id": "198682c4-701d-4196-a804-d75a47148f91",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "32e6720b-babc-481a-9c9a-437955f80f0c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "32e6720b-babc-481a-9c9a-437955f80f0c",
  "order_id": "198682c4-701d-4196-a804-d75a47148f91",
  "assignment_id": "c2ac880b-ae44-4db7-9414-c95bf9bb09c9",
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

`POST /api/driver/v1/work-sessions/2b92c2f5-3e98-4ef6-bb8a-6f74e56c5c11/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:49:57Z",
    "sequence": 1793288997234
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2b92c2f5-3e98-4ef6-bb8a-6f74e56c5c11",
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
  "last_heartbeat_at": "2026-10-29T15:49:57.254772Z",
  "last_location_at": "2026-10-29T15:49:57.254772Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/32e6720b-babc-481a-9c9a-437955f80f0c/arrive` → **200**

```json
{
  "command_id": "bbc7b088-e975-4022-baee-b8a2d8b32759",
  "expected_version": 0
}
```

```json
{
  "id": "32e6720b-babc-481a-9c9a-437955f80f0c",
  "order_id": "198682c4-701d-4196-a804-d75a47148f91",
  "assignment_id": "c2ac880b-ae44-4db7-9414-c95bf9bb09c9",
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
  "arrived_at": "2026-10-29T15:49:57.554067Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/32e6720b-babc-481a-9c9a-437955f80f0c/start` → **200**

```json
{
  "command_id": "545acfa0-0f50-4fbf-adbb-09fd0e13fa4c",
  "expected_version": 1
}
```

```json
{
  "id": "32e6720b-babc-481a-9c9a-437955f80f0c",
  "order_id": "198682c4-701d-4196-a804-d75a47148f91",
  "assignment_id": "c2ac880b-ae44-4db7-9414-c95bf9bb09c9",
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
  "arrived_at": "2026-10-29T15:49:57.554067Z",
  "started_at": "2026-10-29T15:49:57.875214Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/32e6720b-babc-481a-9c9a-437955f80f0c/complete` → **200**

```json
{
  "command_id": "d9bdfc44-b7c4-4af4-81d9-6aabf871ece4",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:49:58Z",
  "cash_received": true
}
```

```json
{
  "id": "32e6720b-babc-481a-9c9a-437955f80f0c",
  "order_id": "198682c4-701d-4196-a804-d75a47148f91",
  "assignment_id": "c2ac880b-ae44-4db7-9414-c95bf9bb09c9",
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
  "arrived_at": "2026-10-29T15:49:57.554067Z",
  "started_at": "2026-10-29T15:49:57.875214Z",
  "completed_at": "2026-10-29T15:49:58.201149Z",
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
  "client_id": "d359a6fb-e18b-4ae3-b146-31f19ef16db3",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 300,
      "reserved_minor": 0,
      "available_minor": 300
    }
  ],
  "entries": [
    {
      "id": "7b1b293d-3b60-4aff-9706-b88eacd87c75",
      "at": "2026-10-29T15:49:58.397815Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -16297,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "198682c4-701d-4196-a804-d75a47148f91"
    },
    {
      "id": "5c204fb5-3603-471f-b880-97d6ed597a4f",
      "at": "2026-10-29T15:49:55.408505Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "84015309-667b-408e-9731-2b3c5e734ac0",
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

`GET /api/rider/v1/orders/198682c4-701d-4196-a804-d75a47148f91/tip` → **200**

```json
{
  "order_id": "198682c4-701d-4196-a804-d75a47148f91",
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
  "available_until": "2026-10-30T15:49:58.201149Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/198682c4-701d-4196-a804-d75a47148f91/tip` → **201**

```json
{
  "command_id": "01bb41df-3204-40e1-9f9a-cbe07df4baef",
  "amount_minor": 2500
}
```

```json
{
  "id": "b9da0ba4-8db8-4b1c-905d-da909120377e",
  "order_id": "198682c4-701d-4196-a804-d75a47148f91",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T15:49:59.40823Z"
}
```

`GET /api/rider/v1/orders/198682c4-701d-4196-a804-d75a47148f91/tip` → **200**

```json
{
  "order_id": "198682c4-701d-4196-a804-d75a47148f91",
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
  "available_until": "2026-10-30T15:49:58.201149Z",
  "open": false,
  "tip": {
    "id": "b9da0ba4-8db8-4b1c-905d-da909120377e",
    "order_id": "198682c4-701d-4196-a804-d75a47148f91",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T15:49:59.40823Z"
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
      "id": "6fcf0a52-51d4-40d1-acda-7381577e5a11",
      "at": "2026-10-29T15:49:58.391298Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "198682c4-701d-4196-a804-d75a47148f91",
      "counterpart_id": null
    },
    {
      "id": "83ee566f-2394-486e-8b8b-93265c9613aa",
      "at": "2026-10-29T15:49:53.353065Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "9be52889-2fa0-440a-ac4d-ead40b249bff",
      "counterpart_id": null
    },
    {
      "id": "4e2f5ca7-59a7-47e6-9062-7c0794bbe1ea",
      "at": "2026-10-29T15:49:48.275965Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "9be52889-2fa0-440a-ac4d-ead40b249bff",
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
      "id": "115cd14b-7e7a-4724-aedb-037c83202106",
      "at": "2026-10-29T15:50:00.426333Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "198682c4-701d-4196-a804-d75a47148f91",
      "counterpart_id": null
    },
    {
      "id": "6fcf0a52-51d4-40d1-acda-7381577e5a11",
      "at": "2026-10-29T15:49:58.391298Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "198682c4-701d-4196-a804-d75a47148f91",
      "counterpart_id": null
    },
    {
      "id": "83ee566f-2394-486e-8b8b-93265c9613aa",
      "at": "2026-10-29T15:49:53.353065Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "9be52889-2fa0-440a-ac4d-ead40b249bff",
      "counterpart_id": null
    },
    {
      "id": "4e2f5ca7-59a7-47e6-9062-7c0794bbe1ea",
      "at": "2026-10-29T15:49:48.275965Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "9be52889-2fa0-440a-ac4d-ead40b249bff",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2b92c2f5-3e98-4ef6-bb8a-6f74e56c5c11",
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
  "last_heartbeat_at": "2026-10-29T15:49:57.254772Z",
  "last_location_at": "2026-10-29T15:49:57.254772Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2b92c2f5-3e98-4ef6-bb8a-6f74e56c5c11/close` → **200**

```json
{
  "command_id": "440b8d73-f140-4695-a79c-45756f24ce85",
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

Done: card order 198682c4-701d-4196-a804-d75a47148f91.

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
  "phone": "+380739484919",
  "device_ref": "sandbox-18054"
}
```

```json
{
  "challenge_id": "016b217e-77fd-4854-8d8d-c55d57452c89",
  "expires_at": "2026-10-29T15:55:02.460529315Z",
  "resend_available_at": "2026-10-29T15:50:03.460529315Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739484919` → **200**

```json
{
  "phone": "+380739484919",
  "audience": "CLIENT",
  "code": "473034",
  "sent_at": "2026-10-29T15:50:02.463487168Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "016b217e-77fd-4854-8d8d-c55d57452c89",
  "code": "473034",
  "device_ref": "sandbox-18054"
}
```

```json
{
  "session_id": "fd7fb690-638b-4d9b-8386-ef94b8248ad0",
  "subject": {
    "type": "CLIENT",
    "id": "a8389c8a-4453-4d33-ad7c-b04668de035b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhODM4OWM4YS00NDUzLTRkMzMtYWQ3Yy1iMDQ2NjhkZTAzNWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTAyLCJpYXQiOjE3OTMyODkwMDIsImp0aSI6IjE2MTAyMmE2LWEzNTUtNDA5MC05NWM1LTVlNTU2NWMyMmYyZiIsInNpZCI6ImZkN2ZiNjkwLTYzOGItNGQ5Yi04Mzg2LWVmOTRiODI0OGFkMCJ9.lMVgd50CWurR88efn5JEO2-oIZy-3qZdWSrWPnUMRQ0",
  "access_expires_at": "2026-10-29T16:05:02.776571508Z",
  "refresh_token": "MbU-YSXom3uCX7Ssw5o3JrVp971LIUabps5Q7T96cnQ",
  "refresh_expires_at": "2026-11-28T15:50:02.775873561Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "29de7f84-f4cd-4d91-8994-896545f884c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "c19f4b01-6a56-4074-af27-cd4470aa18ff",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-c19f4b01-6a56-4074-af27-cd4470aa18ff",
    "orderDate": "1793289003",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "2b8c2103a858ac317fe1af4381a4ca4e",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=c19f4b01-6a56-4074-af27-cd4470aa18ff",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739484919"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=c19f4b01-6a56-4074-af27-cd4470aa18ff",
  "created_at": "2026-10-29T15:50:03.07216Z",
  "expires_at": "2026-10-29T16:20:03.07216Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/c19f4b01-6a56-4074-af27-cd4470aa18ff` → **200**

```json
{
  "id": "c19f4b01-6a56-4074-af27-cd4470aa18ff",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T15:50:03.07216Z",
  "expires_at": "2026-10-29T16:20:03.07216Z",
  "completed_at": "2026-10-29T15:50:03.374733Z",
  "masked_pan": "41****5051",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "a8389c8a-4453-4d33-ad7c-b04668de035b",
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
      "id": "70696aed-7d13-4a9b-938b-ee47776eba1e",
      "at": "2026-10-29T15:50:03.44232Z",
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
  "client_id": "a8389c8a-4453-4d33-ad7c-b04668de035b",
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
      "id": "70696aed-7d13-4a9b-938b-ee47776eba1e",
      "at": "2026-10-29T15:50:03.44232Z",
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
  "device_ref": "sandbox-7094"
}
```

```json
{
  "challenge_id": "24e3e7c9-5155-4142-aecf-b9e1d766a17b",
  "expires_at": "2026-10-29T15:55:04.273680235Z",
  "resend_available_at": "2026-10-29T15:50:05.273680235Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "229452",
  "sent_at": "2026-10-29T15:50:04.278091501Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "24e3e7c9-5155-4142-aecf-b9e1d766a17b",
  "code": "229452",
  "device_ref": "sandbox-7094"
}
```

```json
{
  "session_id": "545a9185-0afc-472f-8f94-1d76e642dce2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTkwNCwiaWF0IjoxNzkzMjg5MDA0LCJqdGkiOiI3ZWRjMTlhNC04N2M0LTQyNjAtYWVhMy1kMzJlZDU1ZWM1NTYiLCJzaWQiOiI1NDVhOTE4NS0wYWZjLTQ3MmYtOGY5NC0xZDc2ZTY0MmRjZTIifQ.AaQaCsLGRXEz9pZIk1YUNIq3fxgRxayD4YsNf5zacAw",
  "access_expires_at": "2026-10-29T16:05:04.591724062Z",
  "refresh_token": "PjAuMlIvm80W1Sr9YHmKExj3C_Pz5vNpdyJdmzpm_Nw",
  "refresh_expires_at": "2026-11-28T15:50:04.591135411Z",
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
  "command_id": "7c9074d5-c701-4eee-98df-4bf28fec7ac1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "3ea8bf0a-2155-478e-8e03-9463387d8ed3",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-3ea8bf0a-2155-478e-8e03-9463387d8ed3",
    "orderDate": "1793289005",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "1023afec1681470f585511c88eed2fae",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=3ea8bf0a-2155-478e-8e03-9463387d8ed3",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=3ea8bf0a-2155-478e-8e03-9463387d8ed3",
  "created_at": "2026-10-29T15:50:05.174329Z",
  "expires_at": "2026-10-29T16:20:05.174329Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/3ea8bf0a-2155-478e-8e03-9463387d8ed3` → **200**

```json
{
  "id": "3ea8bf0a-2155-478e-8e03-9463387d8ed3",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T15:50:05.174329Z",
  "expires_at": "2026-10-29T16:20:05.174329Z",
  "completed_at": "2026-10-29T15:50:05.460471Z",
  "masked_pan": "41****2834",
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
      "id": "28e5bc95-1d87-44eb-9f3b-bac497915afe",
      "at": "2026-10-29T15:50:06.45248Z",
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
  "command_id": "eed7f9dd-2a6f-47bd-97b5-306ae15d2e50",
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
  "correlation_id": "88dd5e20-935e-4e90-818c-cbf7864dd662"
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
  "device_ref": "sandbox-21125"
}
```

```json
{
  "challenge_id": "7065c022-9fa9-490c-85b2-89f37b41ae2b",
  "expires_at": "2026-10-29T15:55:07.64688346Z",
  "resend_available_at": "2026-10-29T15:50:08.64688346Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "242271",
  "sent_at": "2026-10-29T15:50:07.650443268Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7065c022-9fa9-490c-85b2-89f37b41ae2b",
  "code": "242271",
  "device_ref": "sandbox-21125"
}
```

```json
{
  "session_id": "5c042b34-ee90-4adc-b723-0cfdebd7d0fa",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTkwNywiaWF0IjoxNzkzMjg5MDA3LCJqdGkiOiJjYzNiZjRmNS01Y2Y1LTQxZmItOTg5NS1kZDEyMzUxZjNmMzkiLCJzaWQiOiI1YzA0MmIzNC1lZTkwLTRhZGMtYjcyMy0wY2ZkZWJkN2QwZmEifQ.R3xZ3LWLv8ryWTCKGcWOzBd8WAvrKSsYTQJNEZZrosw",
  "access_expires_at": "2026-10-29T16:05:07.967235422Z",
  "refresh_token": "o7Shjlb2wmZ3gRF_ZQzwegKgz0GtU7XvyuqrDO3JjmE",
  "refresh_expires_at": "2026-11-28T15:50:07.966486361Z",
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
  "command_id": "5ae10391-2da9-4666-a9d1-fb99db931556",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:50:08Z",
    "sequence": 1793289008534
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "84f1ad66-7ef9-44fa-80dc-b4f8da344444",
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
  "last_heartbeat_at": "2026-10-29T15:50:08.554065Z",
  "last_location_at": "2026-10-29T15:50:08.554065Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639931645",
  "device_ref": "sandbox-8400"
}
```

```json
{
  "challenge_id": "bd6b7a36-0148-4688-a78c-183bd373e527",
  "expires_at": "2026-10-29T15:55:08.844379213Z",
  "resend_available_at": "2026-10-29T15:50:09.844379213Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639931645` → **200**

```json
{
  "phone": "+380639931645",
  "audience": "CLIENT",
  "code": "043890",
  "sent_at": "2026-10-29T15:50:08.848227801Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bd6b7a36-0148-4688-a78c-183bd373e527",
  "code": "043890",
  "device_ref": "sandbox-8400"
}
```

```json
{
  "session_id": "5dcfe804-f92e-4b6e-a24d-4331b0f091b4",
  "subject": {
    "type": "CLIENT",
    "id": "5aa5e1d9-1225-4d23-bf67-c1210e17a6de"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWE1ZTFkOS0xMjI1LTRkMjMtYmY2Ny1jMTIxMGUxN2E2ZGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTA5LCJpYXQiOjE3OTMyODkwMDksImp0aSI6IjM3YWQzZmIyLTA2MDYtNDNhMi1iOTliLTU5YjQ1YzViMDRkNCIsInNpZCI6IjVkY2ZlODA0LWY5MmUtNGI2ZS1hMjRkLTQzMzFiMGYwOTFiNCJ9.m3Ab1nTIM4FEECyk3uLCWOzJNCU_NaAbqAF55muzsts",
  "access_expires_at": "2026-10-29T16:05:09.161321795Z",
  "refresh_token": "Mjnjv81GeSY-b1iER9h6gaoi4-YgGu4fdI3Jxb_pBm8",
  "refresh_expires_at": "2026-11-28T15:50:09.16081113Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2f0d8bf0-ea63-430f-a369-2e3061976b80",
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
  "id": "a672d0fd-7ad2-4fe4-bf92-7f56b89e6dd6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:55:09.463822Z",
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
  "command_id": "b8c8d345-ddeb-43df-a553-4be267025eb1",
  "quote_id": "a672d0fd-7ad2-4fe4-bf92-7f56b89e6dd6",
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
  "id": "7555cd09-0b21-4f97-a33a-2e6ab70d81c0",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5aa5e1d9-1225-4d23-bf67-c1210e17a6de",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:50:09.761896Z",
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
    "id": "87fa91bb-9c4c-4e85-a43f-ecac4ab95c00",
    "order_id": "7555cd09-0b21-4f97-a33a-2e6ab70d81c0",
    "expires_at": "2026-10-29T15:50:24.764983Z",
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

`POST /api/driver/v1/offers/87fa91bb-9c4c-4e85-a43f-ecac4ab95c00/accept` → **200**

```json
{
  "command_id": "e6da7178-d5ff-4d21-8f95-1c1416a0aac3"
}
```

```json
{
  "id": "a6929246-c383-4c3b-9f24-c5fd0dd4886d",
  "order_id": "7555cd09-0b21-4f97-a33a-2e6ab70d81c0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "973ee3da-2076-475e-9659-f21d90dc4aa1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "973ee3da-2076-475e-9659-f21d90dc4aa1",
  "order_id": "7555cd09-0b21-4f97-a33a-2e6ab70d81c0",
  "assignment_id": "a6929246-c383-4c3b-9f24-c5fd0dd4886d",
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

`POST /api/driver/v1/work-sessions/84f1ad66-7ef9-44fa-80dc-b4f8da344444/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:50:10Z",
    "sequence": 1793289010960
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "84f1ad66-7ef9-44fa-80dc-b4f8da344444",
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
  "last_heartbeat_at": "2026-10-29T15:50:10.981328Z",
  "last_location_at": "2026-10-29T15:50:10.981328Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/973ee3da-2076-475e-9659-f21d90dc4aa1/arrive` → **200**

```json
{
  "command_id": "bc861b8f-b19d-4b01-891a-77e0e0923a73",
  "expected_version": 0
}
```

```json
{
  "id": "973ee3da-2076-475e-9659-f21d90dc4aa1",
  "order_id": "7555cd09-0b21-4f97-a33a-2e6ab70d81c0",
  "assignment_id": "a6929246-c383-4c3b-9f24-c5fd0dd4886d",
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
  "arrived_at": "2026-10-29T15:50:11.286636Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/973ee3da-2076-475e-9659-f21d90dc4aa1/start` → **200**

```json
{
  "command_id": "d1ba9747-92e7-4dd7-aee9-b333badf43e8",
  "expected_version": 1
}
```

```json
{
  "id": "973ee3da-2076-475e-9659-f21d90dc4aa1",
  "order_id": "7555cd09-0b21-4f97-a33a-2e6ab70d81c0",
  "assignment_id": "a6929246-c383-4c3b-9f24-c5fd0dd4886d",
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
  "arrived_at": "2026-10-29T15:50:11.286636Z",
  "started_at": "2026-10-29T15:50:11.592785Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/973ee3da-2076-475e-9659-f21d90dc4aa1/complete` → **200**

```json
{
  "command_id": "69c845e6-e122-4a0d-b7ed-7b9c6837d34d",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:50:11Z",
  "cash_received": false
}
```

```json
{
  "id": "973ee3da-2076-475e-9659-f21d90dc4aa1",
  "order_id": "7555cd09-0b21-4f97-a33a-2e6ab70d81c0",
  "assignment_id": "a6929246-c383-4c3b-9f24-c5fd0dd4886d",
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
  "arrived_at": "2026-10-29T15:50:11.286636Z",
  "started_at": "2026-10-29T15:50:11.592785Z",
  "completed_at": "2026-10-29T15:50:11.900156Z",
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
  "session_id": "a61e6dce-135f-406c-917e-df185743fa72",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5MTIsImlhdCI6MTc5MzI4OTAxMiwianRpIjoiMDU0ZGJiNDEtNThlMy00NzU5LThiMTAtMWI0MjMyM2JkMTIwIiwic2lkIjoiYTYxZTZkY2UtMTM1Zi00MDZjLTkxN2UtZGYxODU3NDNmYTcyIn0.MHKzEBQWWNvzoO1yiza0izm__JDEmQzTzaHzctsUx6c",
  "access_expires_at": "2026-10-29T16:05:12.495648969Z",
  "refresh_token": "QrgouaK7JUWQ1x3aXiEE__DWMEQZ6j6DZqd6BZyn0l8",
  "refresh_expires_at": "2026-10-30T03:50:12.494929613Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/7555cd09-0b21-4f97-a33a-2e6ab70d81c0/cash-dispute` → **200**

```json
{
  "order_id": "7555cd09-0b21-4f97-a33a-2e6ab70d81c0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "5aa5e1d9-1225-4d23-bf67-c1210e17a6de",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T15:50:12.525274Z",
  "decide_by": "2026-11-12T15:50:12.525274Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T15:50:12.525274Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "7555cd09-0b21-4f97-a33a-2e6ab70d81c0",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "5aa5e1d9-1225-4d23-bf67-c1210e17a6de",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T15:50:12.525274Z",
      "decide_by": "2026-11-12T15:50:12.525274Z",
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

`POST /api/admin/v1/orders/7555cd09-0b21-4f97-a33a-2e6ab70d81c0/cash-dispute/decide` → **400**

```json
{
  "command_id": "106cb268-0819-4a8d-9796-75f5bb76781d",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/7555cd09-0b21-4f97-a33a-2e6ab70d81c0/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "b9029fe4-cb48-4add-8ed4-17f92637fc51",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/7555cd09-0b21-4f97-a33a-2e6ab70d81c0/cash-dispute/decide` → **200**

```json
{
  "command_id": "5f7867e6-c94d-4304-aca3-54cf64bb1f07",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "7555cd09-0b21-4f97-a33a-2e6ab70d81c0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "5aa5e1d9-1225-4d23-bf67-c1210e17a6de",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T15:50:12.525274Z",
  "decide_by": "2026-11-12T15:50:12.525274Z",
  "decision": "PAY_DRIVER",
  "decided_by": "84015309-667b-408e-9731-2b3c5e734ac0",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T15:50:13.743419Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/7555cd09-0b21-4f97-a33a-2e6ab70d81c0/cash-dispute/decide` → **409**

```json
{
  "command_id": "41120a6f-fffe-4c54-bac6-c48b933600b0",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/7555cd09-0b21-4f97-a33a-2e6ab70d81c0/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6ca23cf1-eb13-4e81-887d-6dfc47e91188"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "84f1ad66-7ef9-44fa-80dc-b4f8da344444",
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
  "last_heartbeat_at": "2026-10-29T15:50:10.981328Z",
  "last_location_at": "2026-10-29T15:50:10.981328Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/84f1ad66-7ef9-44fa-80dc-b4f8da344444/close` → **200**

```json
{
  "command_id": "a1122d69-ae13-40d8-8774-9030b0ac4245",
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
  "phone": "+380738959672",
  "device_ref": "sandbox-7611"
}
```

```json
{
  "challenge_id": "ed23d4c5-b8eb-4879-866d-2369a4e78813",
  "expires_at": "2026-10-29T15:55:14.929803928Z",
  "resend_available_at": "2026-10-29T15:50:15.929803928Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738959672` → **200**

```json
{
  "phone": "+380738959672",
  "audience": "CLIENT",
  "code": "668674",
  "sent_at": "2026-10-29T15:50:14.932796034Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ed23d4c5-b8eb-4879-866d-2369a4e78813",
  "code": "668674",
  "device_ref": "sandbox-7611"
}
```

```json
{
  "session_id": "143a1351-a410-4cfc-a156-541922c9ba72",
  "subject": {
    "type": "CLIENT",
    "id": "792f9633-764d-42d7-b796-d2b6cf36fb7b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3OTJmOTYzMy03NjRkLTQyZDctYjc5Ni1kMmI2Y2YzNmZiN2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTE1LCJpYXQiOjE3OTMyODkwMTUsImp0aSI6ImQ4OThmN2VjLWM1NzktNGIxMy1iYTZlLTQxN2EzZTU1NzE5YSIsInNpZCI6IjE0M2ExMzUxLWE0MTAtNGNmYy1hMTU2LTU0MTkyMmM5YmE3MiJ9.Zb7tkjsJkSdZoQetIhHIsGZfAl6L-wHzG1dOA7wndBg",
  "access_expires_at": "2026-10-29T16:05:15.269902881Z",
  "refresh_token": "cOTD0bSJOOu_BWUx35kQCDZYv8UxjVhgt7zfkkkhMr0",
  "refresh_expires_at": "2026-11-28T15:50:15.269307557Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "f086f3cd-ca25-4f04-9f5f-8d8ecbf0c3ad",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "686a08fb-210f-4265-bc79-e3059cf29531",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-686a08fb-210f-4265-bc79-e3059cf29531",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "021f90b4b4d5ad6cec62061aa81a40ec",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=686a08fb-210f-4265-bc79-e3059cf29531",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738959672"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=686a08fb-210f-4265-bc79-e3059cf29531",
  "expires_at": "2026-10-29T16:20:15.557742Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/686a08fb-210f-4265-bc79-e3059cf29531` → **200**

```json
{
  "id": "686a08fb-210f-4265-bc79-e3059cf29531",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T16:20:15.557742Z",
  "card": {
    "id": "0d8cdbc4-2eb3-474d-bbbf-2f6869075615",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6790",
    "card_type": "Visa",
    "created_at": "2026-10-29T15:50:15.846649Z"
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
  "device_ref": "sandbox-2703"
}
```

```json
{
  "challenge_id": "e307d86e-1320-4046-95b1-61fca92f09a0",
  "expires_at": "2026-10-29T15:55:16.159515998Z",
  "resend_available_at": "2026-10-29T15:50:17.159515998Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "481825",
  "sent_at": "2026-10-29T15:50:16.162248989Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e307d86e-1320-4046-95b1-61fca92f09a0",
  "code": "481825",
  "device_ref": "sandbox-2703"
}
```

```json
{
  "session_id": "5dfa8a03-50d1-4496-b181-f33dd66d619e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTkxNiwiaWF0IjoxNzkzMjg5MDE2LCJqdGkiOiI3ZGJkNmM1Yi01ZTZhLTRkYjMtOGZkMS01YWIyMzI4ZWE1YjEiLCJzaWQiOiI1ZGZhOGEwMy01MGQxLTQ0OTYtYjE4MS1mMzNkZDY2ZDYxOWUifQ.4E0MTz_V4_zgHjWnVUZf0JIEbXwNHkPmpIVaiiMDAyw",
  "access_expires_at": "2026-10-29T16:05:16.482949369Z",
  "refresh_token": "SVeeU2lh6cyMOxYeFMT9Pge0v1rWxAHmT5n9Dwn3DsI",
  "refresh_expires_at": "2026-11-28T15:50:16.482326855Z",
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
  "command_id": "34f11566-4085-49cb-be89-c72dd2eef454",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:50:17Z",
    "sequence": 1793289017526
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "759f2efb-2dd9-43b8-bff8-274072e9fc17",
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
  "last_heartbeat_at": "2026-10-29T15:50:17.073744Z",
  "last_location_at": "2026-10-29T15:50:17.073744Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "306af4ce-9816-40eb-8499-629972cf7427",
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
  "id": "a7ceaf72-f21c-46fa-a434-b0ab32739505",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:55:17.369101Z",
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
  "command_id": "3a3931a5-a18d-4bfb-aaed-4f033cd0eb0d",
  "quote_id": "a7ceaf72-f21c-46fa-a434-b0ab32739505",
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
  "id": "ed0605c9-12b1-4980-847e-3009a4c01ba4",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "792f9633-764d-42d7-b796-d2b6cf36fb7b",
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
  "created_at": "2026-10-29T15:50:17.673399Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ed0605c9-12b1-4980-847e-3009a4c01ba4` → **200**

```json
{
  "id": "ed0605c9-12b1-4980-847e-3009a4c01ba4",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "792f9633-764d-42d7-b796-d2b6cf36fb7b",
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
  "created_at": "2026-10-29T15:50:17.673399Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ed0605c9-12b1-4980-847e-3009a4c01ba4` → **200**

```json
{
  "id": "ed0605c9-12b1-4980-847e-3009a4c01ba4",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "792f9633-764d-42d7-b796-d2b6cf36fb7b",
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
  "created_at": "2026-10-29T15:50:17.673399Z",
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
    "id": "41aec4b3-3982-4993-a3a7-5d55a50fc620",
    "order_id": "ed0605c9-12b1-4980-847e-3009a4c01ba4",
    "expires_at": "2026-10-29T15:50:33.56921Z",
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

`POST /api/driver/v1/offers/41aec4b3-3982-4993-a3a7-5d55a50fc620/accept` → **200**

```json
{
  "command_id": "ec3af802-862a-455b-a05e-c0bd6f4b46ae"
}
```

```json
{
  "id": "1aad55e6-fce5-4180-bec6-f9f7466d598c",
  "order_id": "ed0605c9-12b1-4980-847e-3009a4c01ba4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dbe1519b-e1ee-4d44-aa3f-0e634b589e34",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dbe1519b-e1ee-4d44-aa3f-0e634b589e34",
  "order_id": "ed0605c9-12b1-4980-847e-3009a4c01ba4",
  "assignment_id": "1aad55e6-fce5-4180-bec6-f9f7466d598c",
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

`POST /api/rider/v1/orders/ed0605c9-12b1-4980-847e-3009a4c01ba4/messages` → **201**

```json
{
  "command_id": "239b0218-8adc-46f8-a98c-318a4c3c30b8",
  "body": "Я біля входу, мій номер +380738959672, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "0a88543a-88d9-49cf-9624-810ba2388ccd",
  "order_id": "ed0605c9-12b1-4980-847e-3009a4c01ba4",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380738959672, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-29T15:50:20.472319268Z"
}
```

`POST /api/driver/v1/trips/dbe1519b-e1ee-4d44-aa3f-0e634b589e34/messages` → **201**

```json
{
  "command_id": "c32efa87-967f-4359-ac33-67fcea9273d7",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "752a4547-88bd-42e8-badf-91c7a54a7ed8",
  "order_id": "ed0605c9-12b1-4980-847e-3009a4c01ba4",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-29T15:50:20.76817485Z"
}
```

`POST /api/driver/v1/work-sessions/759f2efb-2dd9-43b8-bff8-274072e9fc17/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:50:21Z",
    "sequence": 1793289021480
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "759f2efb-2dd9-43b8-bff8-274072e9fc17",
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
  "last_heartbeat_at": "2026-10-29T15:50:21.067095Z",
  "last_location_at": "2026-10-29T15:50:21.067095Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/dbe1519b-e1ee-4d44-aa3f-0e634b589e34/arrive` → **200**

```json
{
  "command_id": "da1fa9a6-1453-4536-9f18-e45d350f6900",
  "expected_version": 0
}
```

```json
{
  "id": "dbe1519b-e1ee-4d44-aa3f-0e634b589e34",
  "order_id": "ed0605c9-12b1-4980-847e-3009a4c01ba4",
  "assignment_id": "1aad55e6-fce5-4180-bec6-f9f7466d598c",
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
  "arrived_at": "2026-10-29T15:50:21.365189Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/dbe1519b-e1ee-4d44-aa3f-0e634b589e34/start` → **200**

```json
{
  "command_id": "e1335aa0-3e7d-41b0-b8ac-a3a4165b512f",
  "expected_version": 1
}
```

```json
{
  "id": "dbe1519b-e1ee-4d44-aa3f-0e634b589e34",
  "order_id": "ed0605c9-12b1-4980-847e-3009a4c01ba4",
  "assignment_id": "1aad55e6-fce5-4180-bec6-f9f7466d598c",
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
  "arrived_at": "2026-10-29T15:50:21.365189Z",
  "started_at": "2026-10-29T15:50:21.664456Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/759f2efb-2dd9-43b8-bff8-274072e9fc17/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:50:21Z",
    "sequence": 1793289021955
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "759f2efb-2dd9-43b8-bff8-274072e9fc17",
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
  "last_heartbeat_at": "2026-10-29T15:50:21.974528Z",
  "last_location_at": "2026-10-29T15:50:21.974528Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/dbe1519b-e1ee-4d44-aa3f-0e634b589e34/complete` → **200**

```json
{
  "command_id": "2dc10023-463c-41ab-af58-f928aabef4be",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:50:22Z",
  "cash_received": false
}
```

```json
{
  "id": "dbe1519b-e1ee-4d44-aa3f-0e634b589e34",
  "order_id": "ed0605c9-12b1-4980-847e-3009a4c01ba4",
  "assignment_id": "1aad55e6-fce5-4180-bec6-f9f7466d598c",
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
  "arrived_at": "2026-10-29T15:50:21.365189Z",
  "started_at": "2026-10-29T15:50:21.664456Z",
  "completed_at": "2026-10-29T15:50:22.270157Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/ed0605c9-12b1-4980-847e-3009a4c01ba4` → **200**

```json
{
  "id": "ed0605c9-12b1-4980-847e-3009a4c01ba4",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "792f9633-764d-42d7-b796-d2b6cf36fb7b",
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
    "id": "1aad55e6-fce5-4180-bec6-f9f7466d598c",
    "order_id": "ed0605c9-12b1-4980-847e-3009a4c01ba4",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "dbe1519b-e1ee-4d44-aa3f-0e634b589e34",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:50:17.673399Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ed0605c9-12b1-4980-847e-3009a4c01ba4` → **200**

```json
{
  "id": "ed0605c9-12b1-4980-847e-3009a4c01ba4",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "792f9633-764d-42d7-b796-d2b6cf36fb7b",
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
    "id": "1aad55e6-fce5-4180-bec6-f9f7466d598c",
    "order_id": "ed0605c9-12b1-4980-847e-3009a4c01ba4",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "dbe1519b-e1ee-4d44-aa3f-0e634b589e34",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:50:17.673399Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ed0605c9-12b1-4980-847e-3009a4c01ba4` → **200**

```json
{
  "id": "ed0605c9-12b1-4980-847e-3009a4c01ba4",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "792f9633-764d-42d7-b796-d2b6cf36fb7b",
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
    "id": "1aad55e6-fce5-4180-bec6-f9f7466d598c",
    "order_id": "ed0605c9-12b1-4980-847e-3009a4c01ba4",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "dbe1519b-e1ee-4d44-aa3f-0e634b589e34",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:50:17.673399Z",
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
  "session_id": "759f2efb-2dd9-43b8-bff8-274072e9fc17",
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
  "last_heartbeat_at": "2026-10-29T15:50:21.974528Z",
  "last_location_at": "2026-10-29T15:50:21.974528Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/759f2efb-2dd9-43b8-bff8-274072e9fc17/close` → **200**

```json
{
  "command_id": "0f68037d-30a6-4e91-8aeb-ddddcd2f6b3e",
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
  "session_id": "dc5311b0-31a7-429a-b94e-d17b83bcb928",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5MjYsImlhdCI6MTc5MzI4OTAyNiwianRpIjoiMGQyM2ViNGMtYzJiYy00ODYzLTgzMTQtZjcwMzU3YTQzNzJlIiwic2lkIjoiZGM1MzExYjAtMzFhNy00MjlhLWI5NGUtZDE3YjgzYmNiOTI4In0.F2KgxsvAdl0guiZ_TzjdTfm3MtvnBZFisr13FBzJllY",
  "access_expires_at": "2026-10-29T16:05:26.362682995Z",
  "refresh_token": "0SIhN_4FeJv1ceBXJR8wXTCa4iW_FdjXwsSHTYqXs_Y",
  "refresh_expires_at": "2026-10-30T03:50:26.362073825Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/ed0605c9-12b1-4980-847e-3009a4c01ba4/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/ed0605c9-12b1-4980-847e-3009a4c01ba4/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "823e9d0a-7624-4d0b-a240-bbf9384a6581"
}
```

`GET /api/admin/v1/orders/ed0605c9-12b1-4980-847e-3009a4c01ba4/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-29T15:50:26.944621954Z",
  "order": {
    "id": "ed0605c9-12b1-4980-847e-3009a4c01ba4",
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
    "created_at": "2026-10-29T15:50:17.673399Z",
    "assigned_at": "2026-10-29T15:50:19.868854Z",
    "arrived_at": "2026-10-29T15:50:21.365189Z",
    "started_at": "2026-10-29T15:50:21.664456Z",
    "completed_at": "2026-10-29T15:50:22.270157Z"
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
    "id": "792f9633-764d-42d7-b796-d2b6cf36fb7b",
    "registered_at": "2026-10-29T15:50:15.267398Z",
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
      "created_at": "2026-10-29T15:50:17.6763Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-29T15:50:22.641658Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/ed0605c9-12b1-4980-847e-3009a4c01ba4/chargebacks` → **422**

```json
{
  "command_id": "6fc52283-b35e-410e-9c49-7319b8be84a7",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "instance": "/api/admin/v1/orders/ed0605c9-12b1-4980-847e-3009a4c01ba4/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "919e0757-55f3-400b-9000-01c802898a13"
}
```

`POST /api/admin/v1/orders/ed0605c9-12b1-4980-847e-3009a4c01ba4/chargebacks` → **201**

```json
{
  "command_id": "9755baef-7f1f-4722-a195-3f428b85cad9",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "2945e9d8-9e5c-43d8-b371-c1f584b03ec4",
  "order_id": "ed0605c9-12b1-4980-847e-3009a4c01ba4",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T15:50:27.616164Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/ed0605c9-12b1-4980-847e-3009a4c01ba4/chargebacks` → **201**

```json
{
  "command_id": "9755baef-7f1f-4722-a195-3f428b85cad9",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "2945e9d8-9e5c-43d8-b371-c1f584b03ec4",
  "order_id": "ed0605c9-12b1-4980-847e-3009a4c01ba4",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T15:50:27.616164Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/792f9633-764d-42d7-b796-d2b6cf36fb7b` → **200**

```json
{
  "client": {
    "id": "792f9633-764d-42d7-b796-d2b6cf36fb7b",
    "phone": "+380738959672",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T15:50:15.267398Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "ed0605c9-12b1-4980-847e-3009a4c01ba4",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T15:50:17.673399Z",
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

`POST /api/admin/v1/orders/ed0605c9-12b1-4980-847e-3009a4c01ba4/chargebacks/2945e9d8-9e5c-43d8-b371-c1f584b03ec4/resolve` → **200**

```json
{
  "command_id": "8e8d93e4-4e32-499f-abca-f818bb6f8d8e",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "2945e9d8-9e5c-43d8-b371-c1f584b03ec4",
  "order_id": "ed0605c9-12b1-4980-847e-3009a4c01ba4",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-29T15:50:27.616164Z",
  "resolved_at": "2026-10-29T15:50:28.555659Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/792f9633-764d-42d7-b796-d2b6cf36fb7b` → **200**

```json
{
  "client": {
    "id": "792f9633-764d-42d7-b796-d2b6cf36fb7b",
    "phone": "+380738959672",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T15:50:15.267398Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "ed0605c9-12b1-4980-847e-3009a4c01ba4",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T15:50:17.673399Z",
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

`POST /api/admin/v1/orders/ed0605c9-12b1-4980-847e-3009a4c01ba4/chargebacks/2945e9d8-9e5c-43d8-b371-c1f584b03ec4/resolve` → **409**

```json
{
  "command_id": "afef8c06-3ed4-48bb-ba09-c7b35acd4b28",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/ed0605c9-12b1-4980-847e-3009a4c01ba4/chargebacks/2945e9d8-9e5c-43d8-b371-c1f584b03ec4/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a006c8f6-cfe7-4d7a-b35e-9f8eaa2bee8f"
}
```

`GET /api/admin/v1/orders/ed0605c9-12b1-4980-847e-3009a4c01ba4/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "2945e9d8-9e5c-43d8-b371-c1f584b03ec4",
      "order_id": "ed0605c9-12b1-4980-847e-3009a4c01ba4",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-28",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-29T15:50:27.616164Z",
      "resolved_at": "2026-10-29T15:50:28.555659Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order ed0605c9-12b1-4980-847e-3009a4c01ba4 without phone or card digits; chargeback 2945e9d8-9e5c-43d8-b371-c1f584b03ec4 recorded and won.

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
  "session_id": "16e8440b-8e7d-439d-98cf-7c71df87a611",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5MzAsImlhdCI6MTc5MzI4OTAzMCwianRpIjoiYWRhM2ViNTItM2QzMC00NjE0LWI1MjYtZTk3MzhmNGQyMzkyIiwic2lkIjoiMTZlODQ0MGItOGU3ZC00MzlkLTk4Y2YtN2M3MWRmODdhNjExIn0.cXt3_BtMO04bc8UCCt1Dx8sAwIbrUgAd13-cmpihq2w",
  "access_expires_at": "2026-10-29T16:05:30.383897794Z",
  "refresh_token": "kyDy4seYghISVMUFwu8zwiVa0tez1oolm8iTkKKXOy8",
  "refresh_expires_at": "2026-10-30T03:50:30.383295067Z",
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
  "phone": "+48600290844",
  "device_ref": "sandbox-26810"
}
```

```json
{
  "challenge_id": "4e574909-74ef-4089-bb3e-1b047153bf70",
  "expires_at": "2026-10-29T15:55:31.260467444Z",
  "resend_available_at": "2026-10-29T15:50:32.260467444Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600290844` → **200**

```json
{
  "phone": "+48600290844",
  "audience": "CLIENT",
  "code": "212251",
  "sent_at": "2026-10-29T15:50:31.263069681Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4e574909-74ef-4089-bb3e-1b047153bf70",
  "code": "212251",
  "device_ref": "sandbox-26810"
}
```

```json
{
  "session_id": "7273eb59-7086-459d-aa7c-9e4c4e1f76a0",
  "subject": {
    "type": "CLIENT",
    "id": "18b92d4d-8012-4580-8675-69b773718352"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOGI5MmQ0ZC04MDEyLTQ1ODAtODY3NS02OWI3NzM3MTgzNTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTMxLCJpYXQiOjE3OTMyODkwMzEsImp0aSI6IjY1ZmVjZTY4LWM2N2UtNGYwNS04ZmZjLWY5ZTViM2JmMDZlNyIsInNpZCI6IjcyNzNlYjU5LTcwODYtNDU5ZC1hYTdjLTllNGM0ZTFmNzZhMCJ9.HfI0rRi-sVKvPqvColQ4zWj5R6Fs_5TmF_Rc9tgW9lc",
  "access_expires_at": "2026-10-29T16:05:31.578870015Z",
  "refresh_token": "XijKO28P9XTxv2qfv6hjn1vmGwxhhVX1PzpIvUZuGzU",
  "refresh_expires_at": "2026-11-28T15:50:31.57820029Z",
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
  "command_id": "f9f4c12e-c4fd-4d06-a469-5d9f41a8ab0c",
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
  "correlation_id": "07ccd2bc-f574-4c73-9f9f-96437e091fe7",
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
  "command_id": "9f9e09f7-c549-49f1-bcda-f8a64c413fc3",
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
  "paused_at": "2026-10-29T15:50:32.745468701Z",
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
  "command_id": "697b7871-d5f9-4956-b959-ef8e42f8aefa",
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
  "id": "e40e0e3f-fd2a-447d-84a0-b7f244ce934c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:55:33.336227Z",
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
  "command_id": "24b4851c-b29c-4240-9ee2-bc6ec15c90a7",
  "quote_id": "e40e0e3f-fd2a-447d-84a0-b7f244ce934c",
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
  "correlation_id": "12558264-19c9-412d-aeb3-2614bdd0c965"
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
  "paused_at": "2026-10-29T15:50:32.745469Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "de14c6cf-84ce-4c70-ae1e-73616d4319c5",
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
  "command_id": "7bc96cd9-e724-46c4-8ffb-c5e67027a75b",
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
  "command_id": "d274ae5d-5548-44d0-9c71-0f460dae0bdf",
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
  "id": "c6b94637-2650-4d86-8711-b57d4644952f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:55:35.091218Z",
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
  "command_id": "a447ed42-7bf4-4679-8893-27ed8de63840",
  "quote_id": "c6b94637-2650-4d86-8711-b57d4644952f",
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
  "correlation_id": "c8f158d9-94ad-45c7-bfe6-1ff63eaad311"
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
  "command_id": "43395042-794c-4dda-98e1-298889f56b0d",
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
  "command_id": "3fbe69e5-6eb7-4f5e-acc5-356cb509e05b",
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
  "id": "c19afc47-68d4-4214-8e04-462dc0dc2ea8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:55:36.288800Z",
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
  "command_id": "d1cb4d8c-5f5f-4d3a-a6a7-0cf981623aa3",
  "quote_id": "c19afc47-68d4-4214-8e04-462dc0dc2ea8",
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
  "correlation_id": "8ab80a42-59bc-4f32-a73b-35cf9a937a30"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "56ac7f01-0f12-4f53-b672-2e26f1738230",
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
  "correlation_id": "a85ef340-ae08-4aff-9148-de8e672cef3c"
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
  "command_id": "26e42679-08a9-4130-b84b-4b032c85adc7",
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
  "phone": "+380674894683",
  "device_ref": "sandbox-27345"
}
```

```json
{
  "challenge_id": "d2f76ee6-0df6-4b12-8b28-ad59d2b353e6",
  "expires_at": "2026-10-29T15:55:37.789050656Z",
  "resend_available_at": "2026-10-29T15:50:38.789050656Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674894683` → **200**

```json
{
  "phone": "+380674894683",
  "audience": "CLIENT",
  "code": "380123",
  "sent_at": "2026-10-29T15:50:37.791546712Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d2f76ee6-0df6-4b12-8b28-ad59d2b353e6",
  "code": "380123",
  "device_ref": "sandbox-27345"
}
```

```json
{
  "session_id": "0f0b2d8e-c277-44ff-bce6-91d0538f293f",
  "subject": {
    "type": "CLIENT",
    "id": "1f1d0db3-9026-4715-9e99-b021c3549e05"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjFkMGRiMy05MDI2LTQ3MTUtOWU5OS1iMDIxYzM1NDllMDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTM4LCJpYXQiOjE3OTMyODkwMzgsImp0aSI6IjM3NGU1Y2E5LWNmNjYtNGNiMy1iODY3LWFhOWVjYzAxMzk1YiIsInNpZCI6IjBmMGIyZDhlLWMyNzctNDRmZi1iY2U2LTkxZDA1MzhmMjkzZiJ9.HntwoBv_0P4W8oYvH_b1pHT1JguZWPHwZnRefr5nCP0",
  "access_expires_at": "2026-10-29T16:05:38.106949087Z",
  "refresh_token": "Mq2CcJ1TQW9FxvpxMiZfeyFX1qY-5Us9G4hPL0C7z0Y",
  "refresh_expires_at": "2026-11-28T15:50:38.106406172Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1f1d0db3-9026-4715-9e99-b021c3549e05",
  "session_id": "0f0b2d8e-c277-44ff-bce6-91d0538f293f",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "eb9948f4-b570-4295-b15c-2eedefc41ad8",
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
  "id": "843afea5-4595-4db9-a917-21d7f5355e31",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:55:38.673412Z",
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
  "challenge_id": "5ab0f75d-be93-41af-af30-61ebb76fe4ee",
  "expires_at": "2026-10-29T15:55:40.988378229Z",
  "resend_available_at": "2026-10-29T15:50:41.988378229Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674894683` → **200**

```json
{
  "phone": "+380674894683",
  "audience": "CLIENT",
  "code": "657837",
  "sent_at": "2026-10-29T15:50:40.991012599Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "d8edbb43-6b6f-417d-aa1d-04bc8f91c022",
  "challenge_id": "5ab0f75d-be93-41af-af30-61ebb76fe4ee",
  "otp_code": "657837"
}
```

```json
{
  "client_id": "1f1d0db3-9026-4715-9e99-b021c3549e05",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T15:50:41.326786292Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "6ea94565-7203-4f2e-ad19-f7023b44ed83",
  "quote_id": "843afea5-4595-4db9-a917-21d7f5355e31",
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
  "correlation_id": "f728f756-afb6-4d4b-89bc-6e07d46dfb1f"
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
  "session_id": "d550b574-8f89-4ac2-8a20-d9fa651ed533",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5NDIsImlhdCI6MTc5MzI4OTA0MiwianRpIjoiZTljM2U4NDgtMmEyNy00ZTE0LWIyNDYtNmQ2MDAzZGI5Y2FjIiwic2lkIjoiZDU1MGI1NzQtOGY4OS00YWMyLThhMjAtZDlmYTY1MWVkNTMzIn0.agvwgp7xAwNHecFBTyw6A90GQ7SrsRq1N2nxIBVRLbE",
  "access_expires_at": "2026-10-29T16:05:42.206669866Z",
  "refresh_token": "o1KZxhBqZTW-6ZMnFEXfVAD5V2xmi0_ywsfhaxUVClY",
  "refresh_expires_at": "2026-10-30T03:50:42.206092857Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "1f1d0db3-9026-4715-9e99-b021c3549e05",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T15:50:41.326786Z",
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

`POST /api/admin/v1/client-deletions/1f1d0db3-9026-4715-9e99-b021c3549e05/complete` → **200**

```json
{
  "command_id": "3ecfaa3d-b960-41f9-bc76-cda86181ec77",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "1f1d0db3-9026-4715-9e99-b021c3549e05",
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
  "correlation_id": "43da5482-7391-4ad8-8baa-ef36421cdbbf"
}
```

Done: client 1f1d0db3-9026-4715-9e99-b021c3549e05 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665464718",
  "device_ref": "sandbox-26651"
}
```

```json
{
  "challenge_id": "78a767be-9728-4990-afe4-e8e644722f3c",
  "expires_at": "2026-10-29T15:55:43.380936301Z",
  "resend_available_at": "2026-10-29T15:50:44.380936301Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380665464718` → **200**

```json
{
  "phone": "+380665464718",
  "audience": "CLIENT",
  "code": "302147",
  "sent_at": "2026-10-29T15:50:43.383710902Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "78a767be-9728-4990-afe4-e8e644722f3c",
  "code": "302147",
  "device_ref": "sandbox-26651"
}
```

```json
{
  "session_id": "2ae0d18b-aff0-46b4-9872-7600d38a0a2f",
  "subject": {
    "type": "CLIENT",
    "id": "a5cf3460-b861-4b58-a310-352ce1e2c556"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNWNmMzQ2MC1iODYxLTRiNTgtYTMxMC0zNTJjZTFlMmM1NTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTQzLCJpYXQiOjE3OTMyODkwNDMsImp0aSI6IjFhM2MzMmJhLTQzZWItNDM2NS05NzVlLTRhNjBkZDY3MGJlMCIsInNpZCI6IjJhZTBkMThiLWFmZjAtNDZiNC05ODcyLTc2MDBkMzhhMGEyZiJ9.FONzjwmrBNPB3vqRmmfnND3696IVUNmhjxpOzeO_8Ns",
  "access_expires_at": "2026-10-29T16:05:43.691726498Z",
  "refresh_token": "beI7LQojKtX1acrgVWUaGALk7nyCCCr69wST3NDIvlI",
  "refresh_expires_at": "2026-11-28T15:50:43.691149668Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a5cf3460-b861-4b58-a310-352ce1e2c556",
  "session_id": "2ae0d18b-aff0-46b4-9872-7600d38a0a2f",
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
  "session_id": "d4f15e19-4ce6-4550-95cc-12556c385977",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5NDQsImlhdCI6MTc5MzI4OTA0NCwianRpIjoiNDFhMmE1MWUtMDk0YS00YjRhLWI2NGEtYThjMGYzMDUyM2ZlIiwic2lkIjoiZDRmMTVlMTktNGNlNi00NTUwLTk1Y2MtMTI1NTZjMzg1OTc3In0.H__Vpqukxry8zVdzYk6g2fyMONUqIWoKNMzhn_f1Nqo",
  "access_expires_at": "2026-10-29T16:05:44.565014112Z",
  "refresh_token": "ywMDTQ5rRroXzePHrqCtCceXM6dncwbPz0gSr6aoQIE",
  "refresh_expires_at": "2026-10-30T03:50:44.564430645Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=5464718&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "a5cf3460-b861-4b58-a310-352ce1e2c556",
      "phone": "+380665464718",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T15:50:43.689467Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/a5cf3460-b861-4b58-a310-352ce1e2c556` → **200**

```json
{
  "client": {
    "id": "a5cf3460-b861-4b58-a310-352ce1e2c556",
    "phone": "+380665464718",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T15:50:43.689467Z",
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

`POST /api/admin/v1/clients/a5cf3460-b861-4b58-a310-352ce1e2c556/block` → **400**

```json
{
  "command_id": "3efd86d3-3f94-4094-82ce-b2bd39d7f0a2",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/a5cf3460-b861-4b58-a310-352ce1e2c556/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "6edf54a6-1017-4782-80ec-36b7a37e7388",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/a5cf3460-b861-4b58-a310-352ce1e2c556/block` → **200**

```json
{
  "command_id": "918fbb5c-ac63-49f0-bca1-8943efa6b330",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "a5cf3460-b861-4b58-a310-352ce1e2c556",
  "phone": "+380665464718",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T15:50:43.689467Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T15:50:45.801829Z",
    "by": "84015309-667b-408e-9731-2b3c5e734ac0"
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
  "correlation_id": "38a9078b-5014-4870-933b-875725debda5"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665464718",
  "device_ref": "sandbox-10699"
}
```

```json
{
  "challenge_id": "408d7f24-a5b9-4e42-b351-2fed31c5689a",
  "expires_at": "2026-10-29T15:55:48.412072974Z",
  "resend_available_at": "2026-10-29T15:50:49.412072974Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380665464718` → **200**

```json
{
  "phone": "+380665464718",
  "audience": "CLIENT",
  "code": "615593",
  "sent_at": "2026-10-29T15:50:48.415450734Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "408d7f24-a5b9-4e42-b351-2fed31c5689a",
  "code": "615593",
  "device_ref": "sandbox-10699"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "4921a460-da6c-40d5-b723-31e009de5570"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/a5cf3460-b861-4b58-a310-352ce1e2c556` → **200**

```json
{
  "client": {
    "id": "a5cf3460-b861-4b58-a310-352ce1e2c556",
    "phone": "+380665464718",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T15:50:43.689467Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T15:50:45.801829Z",
      "by": "84015309-667b-408e-9731-2b3c5e734ac0"
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

`POST /api/admin/v1/clients/a5cf3460-b861-4b58-a310-352ce1e2c556/unblock` → **200**

```json
{
  "command_id": "3a6ced87-c254-45f0-99d5-76c24a85e552",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "a5cf3460-b861-4b58-a310-352ce1e2c556",
  "phone": "+380665464718",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T15:50:43.689467Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665464718",
  "device_ref": "sandbox-21603"
}
```

```json
{
  "challenge_id": "cfa35596-bfca-47a0-8398-edd5bbe3cdc4",
  "expires_at": "2026-10-29T15:55:51.691020419Z",
  "resend_available_at": "2026-10-29T15:50:52.691020419Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380665464718` → **200**

```json
{
  "phone": "+380665464718",
  "audience": "CLIENT",
  "code": "247935",
  "sent_at": "2026-10-29T15:50:51.693788832Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cfa35596-bfca-47a0-8398-edd5bbe3cdc4",
  "code": "247935",
  "device_ref": "sandbox-21603"
}
```

```json
{
  "session_id": "36c650ea-db72-4af4-905a-b82d7d7b949a",
  "subject": {
    "type": "CLIENT",
    "id": "a5cf3460-b861-4b58-a310-352ce1e2c556"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNWNmMzQ2MC1iODYxLTRiNTgtYTMxMC0zNTJjZTFlMmM1NTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTUyLCJpYXQiOjE3OTMyODkwNTIsImp0aSI6IjhhZDQ0NmU4LThkYWQtNDM0Ni1hZWIwLTQ1MTkyNmY1NWIxNCIsInNpZCI6IjM2YzY1MGVhLWRiNzItNGFmNC05MDVhLWI4MmQ3ZDdiOTQ5YSJ9.N0v6VqxuE3Xe6SOJLIcJeFRjtX9djLOmWN-mrBMWlEE",
  "access_expires_at": "2026-10-29T16:05:52.008272474Z",
  "refresh_token": "rnCSSKCmoux2Bazl3p4XEGjF0O-XeaZPbyiJKWkvT4o",
  "refresh_expires_at": "2026-11-28T15:50:52.007651958Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a5cf3460-b861-4b58-a310-352ce1e2c556",
  "session_id": "36c650ea-db72-4af4-905a-b82d7d7b949a",
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
  "phone": "+380662653446",
  "device_ref": "sandbox-31451"
}
```

```json
{
  "challenge_id": "4f50f145-db25-4743-827f-6484b68037e8",
  "expires_at": "2026-10-29T15:55:52.588874734Z",
  "resend_available_at": "2026-10-29T15:50:53.588874734Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662653446` → **200**

```json
{
  "phone": "+380662653446",
  "audience": "CLIENT",
  "code": "541941",
  "sent_at": "2026-10-29T15:50:52.591372178Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4f50f145-db25-4743-827f-6484b68037e8",
  "code": "541941",
  "device_ref": "sandbox-31451"
}
```

```json
{
  "session_id": "ae27baf2-9794-4342-8764-88d804bcdd15",
  "subject": {
    "type": "CLIENT",
    "id": "eda74854-f3eb-4c8e-b17e-87e5dfa54aaa"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZGE3NDg1NC1mM2ViLTRjOGUtYjE3ZS04N2U1ZGZhNTRhYWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTUyLCJpYXQiOjE3OTMyODkwNTIsImp0aSI6ImI0MzJkYWI2LWJhZmQtNGY3Ni05ZGIzLWZjMWQ2MDEwYTg0NiIsInNpZCI6ImFlMjdiYWYyLTk3OTQtNDM0Mi04NzY0LTg4ZDgwNGJjZGQxNSJ9.ZVcNwk4DvNljmqBkHo0gKOlmGGDwm5bMHDdll-JX8_w",
  "access_expires_at": "2026-10-29T16:05:52.901935353Z",
  "refresh_token": "DO6PiG6TiIQQp6x4W8BtDPsnR9zd6EFizMBIrf_b2RM",
  "refresh_expires_at": "2026-11-28T15:50:52.901027638Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b60ab575-78a9-48d4-ad5e-a4a842d710e0",
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
  "id": "51d73fdf-d871-49ae-9419-01d148de3ff0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:55:53.184875Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 2357ade3-199a-456a-954f-673808a3b081) → **201**

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
  "session_id": "c6d49524-7d21-4c8f-9350-86f49cd97d4b",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5NTMsImlhdCI6MTc5MzI4OTA1MywianRpIjoiM2ZkZDU5YTEtNDkxMS00YzdhLTg0NTktYTQ1ZGUyMmQyZTIwIiwic2lkIjoiYzZkNDk1MjQtN2QyMS00YzhmLTkzNTAtODZmNDljZDk3ZDRiIn0._Jv6NntCN1i9BXylS-5Ra4BAn4hcYpNdcT8OpuvBxYY",
  "access_expires_at": "2026-10-29T16:05:53.805640406Z",
  "refresh_token": "6meh1kHfzUwy_bGDUOv-FACsa2TXDcBJmUeHENKLask",
  "refresh_expires_at": "2026-10-30T03:50:53.804920854Z",
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
  "session_id": "f1bfd30e-ed2b-44e0-8518-ac50ad730da8",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5NTQsImlhdCI6MTc5MzI4OTA1NCwianRpIjoiN2E0ZmU0OWQtNDA1Ni00MTJkLWJhMmEtNDExMzA4MzdkZWY0Iiwic2lkIjoiZjFiZmQzMGUtZWQyYi00NGUwLTg1MTgtYWM1MGFkNzMwZGE4In0.ZYTR_Tu6TN8k0V4Qh7knmIvfODMXrYZ42NwmjJlXChI",
  "access_expires_at": "2026-10-29T16:05:54.387716419Z",
  "refresh_token": "g0-vB3wJKRJCerpm2S9BZwZUN1I2AO2I_2nxiv5pivE",
  "refresh_expires_at": "2026-10-30T03:50:54.387122068Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/8ca19226-60bd-471e-8c5a-3acc17f3ae08/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:50:53.472607Z",
      "actor": {
        "type": "CLIENT",
        "id": "eda74854-f3eb-4c8e-b17e-87e5dfa54aaa",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "8ca19226-60bd-471e-8c5a-3acc17f3ae08",
        "quote_id": "51d73fdf-d871-49ae-9419-01d148de3ff0",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "2357ade3-199a-456a-954f-673808a3b081"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:50:53.475355Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8ca19226-60bd-471e-8c5a-3acc17f3ae08",
        "attempt_id": "e37594ce-5a17-49fd-a8a9-554c573ac64e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "2357ade3-199a-456a-954f-673808a3b081"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T15:50:53.486896Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8ca19226-60bd-471e-8c5a-3acc17f3ae08",
        "attempt_id": "e37594ce-5a17-49fd-a8a9-554c573ac64e"
      },
      "correlation_id": "2357ade3-199a-456a-954f-673808a3b081"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "e37594ce-5a17-49fd-a8a9-554c573ac64e",
        "generation": 1,
        "started_at": "2026-10-29T15:50:53.473989Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T15:50:53.486896Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T15:50:53.476429Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/2357ade3-199a-456a-954f-673808a3b081` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "8ca19226-60bd-471e-8c5a-3acc17f3ae08:0",
      "order_id": "8ca19226-60bd-471e-8c5a-3acc17f3ae08",
      "at": "2026-10-29T15:50:53.472607Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "8ca19226-60bd-471e-8c5a-3acc17f3ae08:1",
      "order_id": "8ca19226-60bd-471e-8c5a-3acc17f3ae08",
      "at": "2026-10-29T15:50:53.475355Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "8ca19226-60bd-471e-8c5a-3acc17f3ae08:2",
      "order_id": "8ca19226-60bd-471e-8c5a-3acc17f3ae08",
      "at": "2026-10-29T15:50:53.486896Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/d4454072-f6db-4a20-b172-8eaa740366a1` → **200**

```json
{
  "found": []
}
```

Done: request 2357ade3-199a-456a-954f-673808a3b081 — order 8ca19226-60bd-471e-8c5a-3acc17f3ae08 found by its id.

`GET /api/rider/v1/orders/8ca19226-60bd-471e-8c5a-3acc17f3ae08` → **200**

```json
{
  "id": "8ca19226-60bd-471e-8c5a-3acc17f3ae08",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "eda74854-f3eb-4c8e-b17e-87e5dfa54aaa",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:50:53.471988Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/8ca19226-60bd-471e-8c5a-3acc17f3ae08/cancel` → **200**

```json
{
  "command_id": "a3224b65-0289-45dd-bedb-576769ce2816",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "8ca19226-60bd-471e-8c5a-3acc17f3ae08",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "eda74854-f3eb-4c8e-b17e-87e5dfa54aaa",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:50:53.471988Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати",
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
  "phone": "+380631272829",
  "device_ref": "sandbox-16720"
}
```

```json
{
  "challenge_id": "a6b97faa-02ea-4137-89b3-8d28d2287a71",
  "expires_at": "2026-10-29T15:55:56.182664775Z",
  "resend_available_at": "2026-10-29T15:50:57.182664775Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631272829` → **200**

```json
{
  "phone": "+380631272829",
  "audience": "CLIENT",
  "code": "166745",
  "sent_at": "2026-10-29T15:50:56.186241805Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a6b97faa-02ea-4137-89b3-8d28d2287a71",
  "code": "166745",
  "device_ref": "sandbox-16720"
}
```

```json
{
  "session_id": "303dd512-efaf-4b52-96ce-b3f9a4d89c42",
  "subject": {
    "type": "CLIENT",
    "id": "002286fb-0e50-4f0f-a4fa-4f5f5ba257b4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMDIyODZmYi0wZTUwLTRmMGYtYTRmYS00ZjVmNWJhMjU3YjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTU2LCJpYXQiOjE3OTMyODkwNTYsImp0aSI6ImZkNTkzMzdhLTA4OTEtNGIyZC1hZDVmLTg1MjM5MTgwOWY3YiIsInNpZCI6IjMwM2RkNTEyLWVmYWYtNGI1Mi05NmNlLWIzZjlhNGQ4OWM0MiJ9.Aj9-ctYvWE5IF5sNONdcoMk_OD8mJTqM9FnaYxAQIfM",
  "access_expires_at": "2026-10-29T16:05:56.49414954Z",
  "refresh_token": "lwcquCwWUjd1UMh_LVPnV3zVmNJrrcxEZyvQycqEMeg",
  "refresh_expires_at": "2026-11-28T15:50:56.493619929Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "83e4389e-cfc6-4558-873c-3a597b67aab3",
  "expires_at": "2026-10-29T15:55:58.779225366Z",
  "resend_available_at": "2026-10-29T15:50:59.779225366Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631272829` → **200**

```json
{
  "phone": "+380631272829",
  "audience": "CLIENT",
  "code": "903635",
  "sent_at": "2026-10-29T15:50:58.781446088Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "0e678ada-f792-43a1-9116-c0073e53eb99",
  "challenge_id": "83e4389e-cfc6-4558-873c-3a597b67aab3",
  "otp_code": "903635"
}
```

```json
{
  "id": "1ba6c319-8c89-48d7-99c1-12365c3e14db",
  "state": "PENDING",
  "created_at": "2026-10-29T15:50:59.105518Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/1ba6c319-8c89-48d7-99c1-12365c3e14db` → **200**

```json
{
  "id": "1ba6c319-8c89-48d7-99c1-12365c3e14db",
  "state": "PENDING",
  "created_at": "2026-10-29T15:50:59.105518Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/1ba6c319-8c89-48d7-99c1-12365c3e14db` → **200**

```json
{
  "id": "1ba6c319-8c89-48d7-99c1-12365c3e14db",
  "state": "PENDING",
  "created_at": "2026-10-29T15:50:59.105518Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/1ba6c319-8c89-48d7-99c1-12365c3e14db` → **200**

```json
{
  "id": "1ba6c319-8c89-48d7-99c1-12365c3e14db",
  "state": "READY",
  "created_at": "2026-10-29T15:50:59.105518Z",
  "ready_at": "2026-10-29T15:51:01.568148Z",
  "expires_at": "2026-11-05T15:51:01.568148Z",
  "size_bytes": 1027
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/1ba6c319-8c89-48d7-99c1-12365c3e14db/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636110557",
  "device_ref": "sandbox-26736"
}
```

```json
{
  "challenge_id": "dd10d9f5-d26f-4ba8-a0fb-ee9915c8cff1",
  "expires_at": "2026-10-29T15:56:02.275373094Z",
  "resend_available_at": "2026-10-29T15:51:03.275373094Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636110557` → **200**

```json
{
  "phone": "+380636110557",
  "audience": "CLIENT",
  "code": "784518",
  "sent_at": "2026-10-29T15:51:02.278112096Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dd10d9f5-d26f-4ba8-a0fb-ee9915c8cff1",
  "code": "784518",
  "device_ref": "sandbox-26736"
}
```

```json
{
  "session_id": "ac7898e4-ba2f-4920-982c-0dc0be9c8e27",
  "subject": {
    "type": "CLIENT",
    "id": "df9c5363-5ed6-42d5-b842-c8426aade5a9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZjljNTM2My01ZWQ2LTQyZDUtYjg0Mi1jODQyNmFhZGU1YTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTYyLCJpYXQiOjE3OTMyODkwNjIsImp0aSI6ImEwMzRmMWY5LWVjNzctNDFmMy05ZjIwLWExYTQzOTg5YWFjOCIsInNpZCI6ImFjNzg5OGU0LWJhMmYtNDkyMC05ODJjLTBkYzBiZTljOGUyNyJ9.ReE0crqdJnWSIdGoL9eLUbDOm5gxKa8wY57oo2IH6Nc",
  "access_expires_at": "2026-10-29T16:06:02.590399567Z",
  "refresh_token": "6AGCTijPx7YHm1OtbtZgUAd3L3C364tBdbCdp2fRXdE",
  "refresh_expires_at": "2026-11-28T15:51:02.589873713Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/1ba6c319-8c89-48d7-99c1-12365c3e14db/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/1ba6c319-8c89-48d7-99c1-12365c3e14db/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3a9922c7-9bfd-43ba-850d-c639a540d18b"
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
  "session_id": "1b08cf85-29f7-487d-869e-1066de2e4357",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5NjMsImlhdCI6MTc5MzI4OTA2MywianRpIjoiZGEwNTFiZDQtZjJlZi00ODNjLWI4MjMtYjNkMDBiMDYxYmE5Iiwic2lkIjoiMWIwOGNmODUtMjlmNy00ODdkLTg2OWUtMTA2NmRlMmU0MzU3In0.V07V8UBLJwaVycfaNEp3KvibORb17pyPO2dqonrh3rA",
  "access_expires_at": "2026-10-29T16:06:03.471584697Z",
  "refresh_token": "rMIFOqZc_xoAaS1XWHnvkaYh2gmnSPoV3LlYK-tikLo",
  "refresh_expires_at": "2026-10-30T03:51:03.47103549Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "002286fb-0e50-4f0f-a4fa-4f5f5ba257b4",
  "session_id": "303dd512-efaf-4b52-96ce-b3f9a4d89c42",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/002286fb-0e50-4f0f-a4fa-4f5f5ba257b4/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "1ba6c319-8c89-48d7-99c1-12365c3e14db",
      "state": "READY",
      "created_at": "2026-10-29T15:50:59.105518Z",
      "ready_at": "2026-10-29T15:51:01.568148Z",
      "expires_at": "2026-11-05T15:51:01.568148Z",
      "size_bytes": 1027
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
  "device_ref": "sandbox-11498"
}
```

```json
{
  "challenge_id": "4dd33df9-a7ca-44fe-8cbc-f1428657ce32",
  "expires_at": "2026-10-29T15:56:04.339832545Z",
  "resend_available_at": "2026-10-29T15:51:05.339832545Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "418694",
  "sent_at": "2026-10-29T15:51:04.342406854Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4dd33df9-a7ca-44fe-8cbc-f1428657ce32",
  "code": "418694",
  "device_ref": "sandbox-11498"
}
```

```json
{
  "session_id": "f95ad3ab-3531-4ee1-8157-3a76d9e12a67",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTk2NCwiaWF0IjoxNzkzMjg5MDY0LCJqdGkiOiJkY2E0ZDdhMC00OGQ4LTQyZjUtYWY4MC00NTgyZmUzNzQyYTUiLCJzaWQiOiJmOTVhZDNhYi0zNTMxLTRlZTEtODE1Ny0zYTc2ZDllMTJhNjcifQ.j5snUkRxuS1wijXCkm0U-zGm-ywKrYT00cRkSd1USJ4",
  "access_expires_at": "2026-10-29T16:06:04.655352387Z",
  "refresh_token": "F5v_C0KVxIpypAYmY06KzAgjldLB0Ua1T4xAWjEfynM",
  "refresh_expires_at": "2026-11-28T15:51:04.654803329Z",
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
  "device_ref": "sandbox-32639"
}
```

```json
{
  "challenge_id": "6dc12c62-3c0f-4c84-b769-aa57081c6c4f",
  "expires_at": "2026-10-29T15:56:05.208159543Z",
  "resend_available_at": "2026-10-29T15:51:06.208159543Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "455245",
  "sent_at": "2026-10-29T15:51:05.210721507Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6dc12c62-3c0f-4c84-b769-aa57081c6c4f",
  "code": "455245",
  "device_ref": "sandbox-32639"
}
```

```json
{
  "session_id": "61f1248a-9320-49e3-8b35-312e714045d0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTk2NSwiaWF0IjoxNzkzMjg5MDY1LCJqdGkiOiI4M2EyZmMzMC0xZDBiLTRmMGQtOGM5Ny05NDlmNmVhYzkwY2IiLCJzaWQiOiI2MWYxMjQ4YS05MzIwLTQ5ZTMtOGIzNS0zMTJlNzE0MDQ1ZDAifQ.tPFQ-mfCYZq1dIOa3kyQxlTMybC3Yr4_ivrVbwUcZ10",
  "access_expires_at": "2026-10-29T16:06:05.514129567Z",
  "refresh_token": "Cn7OqOSEOu-OlSMg086fhHs3S03iSVQKfnuVU9W5odI",
  "refresh_expires_at": "2026-11-28T15:51:05.513493464Z",
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
  "command_id": "7b313590-35bc-4f54-bc53-d74ded4005a4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:51:06Z",
    "sequence": 1793289066860
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b8b6e757-3551-4980-969f-828e4729c1c7",
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
  "last_heartbeat_at": "2026-10-29T15:51:06.104904Z",
  "last_location_at": "2026-10-29T15:51:06.104904Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-10567"
}
```

```json
{
  "challenge_id": "68f7e8f6-b77a-4c09-a3a9-4dfd0226a35a",
  "expires_at": "2026-10-29T15:56:06.387662406Z",
  "resend_available_at": "2026-10-29T15:51:07.387662406Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "784221",
  "sent_at": "2026-10-29T15:51:06.390250115Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "68f7e8f6-b77a-4c09-a3a9-4dfd0226a35a",
  "code": "784221",
  "device_ref": "sandbox-10567"
}
```

```json
{
  "session_id": "7d200a50-d5eb-4334-866e-2425d4905e62",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTk2NiwiaWF0IjoxNzkzMjg5MDY2LCJqdGkiOiIzMjJjNjZjOS1hMDY3LTRjNTUtYjhmOS0wYWU1ODA5NWJiMjgiLCJzaWQiOiI3ZDIwMGE1MC1kNWViLTQzMzQtODY2ZS0yNDI1ZDQ5MDVlNjIifQ.20uMAKuFgS03oGN0MIsnWN9pmXhQN1ZBoveLizqto6Q",
  "access_expires_at": "2026-10-29T16:06:06.701426351Z",
  "refresh_token": "0sORL9QofJa8miTHDOwYFXtN1iHYViF-k2oTVqRMr50",
  "refresh_expires_at": "2026-11-28T15:51:06.700938538Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5027022d-2578-42b1-9bbb-48af0885186a",
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
  "last_heartbeat_at": "2026-10-29T15:49:35.4983Z",
  "last_location_at": "2026-10-29T15:49:35.4983Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/5027022d-2578-42b1-9bbb-48af0885186a/handover` → **200**

```json
{
  "command_id": "da97a3d5-a944-4063-9beb-d9a2f92dc45f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5027022d-2578-42b1-9bbb-48af0885186a",
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
  "last_heartbeat_at": "2026-10-29T15:49:35.4983Z",
  "last_location_at": "2026-10-29T15:49:35.4983Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/5027022d-2578-42b1-9bbb-48af0885186a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:51:07Z",
    "sequence": 1793289067539
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5027022d-2578-42b1-9bbb-48af0885186a",
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
  "last_heartbeat_at": "2026-10-29T15:51:07.559019Z",
  "last_location_at": "2026-10-29T15:51:07.559019Z",
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
  "session_id": "66030e02-0e99-40e7-8973-7d3a676c67ee",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5NjgsImlhdCI6MTc5MzI4OTA2OCwianRpIjoiM2I4Yzc0YTQtZTc1Mi00Y2Q3LWE5MzUtMWE1NGQwM2Q2ZmFjIiwic2lkIjoiNjYwMzBlMDItMGU5OS00MGU3LTg5NzMtN2QzYTY3NmM2N2VlIn0.4wcElXXQwkh5KcSozST60FJb1MJYArcRkP3Z83E3kKU",
  "access_expires_at": "2026-10-29T16:06:08.138739614Z",
  "refresh_token": "IG35gAshFJDIPUv8Fz-zlnSqZXATCl2x3wJXYYvGB2w",
  "refresh_expires_at": "2026-10-30T03:51:08.138188934Z",
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
  "session_id": "b2aa150e-0898-47df-80c3-696ae4bc8908",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5NjgsImlhdCI6MTc5MzI4OTA2OCwianRpIjoiMjMzZDY4YTMtNjhkYy00OGMzLWJjNDAtY2FmMWYwMzVlM2ViIiwic2lkIjoiYjJhYTE1MGUtMDg5OC00N2RmLTgwYzMtNjk2YWU0YmM4OTA4In0.EZ7sM-2fMqdtMW7wyNJvl5QvOFznDEbsy1_n1yFM7o8",
  "access_expires_at": "2026-10-29T16:06:08.72376044Z",
  "refresh_token": "PO_uGdi70fvsGbj2HWidY2XpRS_k3yusV_wY0pB5MKY",
  "refresh_expires_at": "2026-10-30T03:51:08.723181447Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380689035738",
  "device_ref": "sandbox-1081"
}
```

```json
{
  "challenge_id": "b9d712fb-86d4-476b-918e-cf894b900852",
  "expires_at": "2026-10-29T15:56:09.003718355Z",
  "resend_available_at": "2026-10-29T15:51:10.003718355Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380689035738` → **200**

```json
{
  "phone": "+380689035738",
  "audience": "CLIENT",
  "code": "121126",
  "sent_at": "2026-10-29T15:51:09.006381938Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b9d712fb-86d4-476b-918e-cf894b900852",
  "code": "121126",
  "device_ref": "sandbox-1081"
}
```

```json
{
  "session_id": "527b2bf4-8cbc-497b-a998-779bd0108572",
  "subject": {
    "type": "CLIENT",
    "id": "d9e82671-c0e9-4b15-96e7-8555ec5665f8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkOWU4MjY3MS1jMGU5LTRiMTUtOTZlNy04NTU1ZWM1NjY1ZjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTY5LCJpYXQiOjE3OTMyODkwNjksImp0aSI6IjMxYTBhMDA5LWNkMzEtNGUyNi05YjNlLTUyZjliNzg3OTcxMCIsInNpZCI6IjUyN2IyYmY0LThjYmMtNDk3Yi1hOTk4LTc3OWJkMDEwODU3MiJ9.xPM0eeTbelwb2Nz1KiH120xAYxsS6vYaLqQVp3Z_vvA",
  "access_expires_at": "2026-10-29T16:06:09.320338593Z",
  "refresh_token": "OS7FFAmBZr7VFgkR3lOnCa80eGv40YZewy22wkTI-gg",
  "refresh_expires_at": "2026-11-28T15:51:09.319858264Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3b6d7dac-6830-4e86-907a-05d35720c094",
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
  "id": "6e5e21cb-03c9-4a5d-97af-d612ec5ff5a1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:56:09.604137Z",
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
  "command_id": "29cb46b5-8c02-4bbf-9bf9-2740a5a4fdc4",
  "quote_id": "6e5e21cb-03c9-4a5d-97af-d612ec5ff5a1",
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
  "id": "b939fe41-1226-43d2-a42b-43593704ed9c",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d9e82671-c0e9-4b15-96e7-8555ec5665f8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:51:09.893472Z",
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
    "id": "82be9fd0-7abb-4670-aa63-68b7c5f6d171",
    "order_id": "b939fe41-1226-43d2-a42b-43593704ed9c",
    "expires_at": "2026-10-29T15:51:24.896835Z",
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

`POST /api/driver/v1/offers/82be9fd0-7abb-4670-aa63-68b7c5f6d171/reject` → **204**

```json
{
  "command_id": "e1daec70-a359-4df1-b833-2f13bc3a0801"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "e67991c1-3f9d-45f8-9104-d44f81da51f0",
    "order_id": "b939fe41-1226-43d2-a42b-43593704ed9c",
    "expires_at": "2026-10-29T15:51:25.490745Z",
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

`POST /api/driver/v1/offers/e67991c1-3f9d-45f8-9104-d44f81da51f0/accept` → **200**

```json
{
  "command_id": "ff7083cc-5e5e-4eba-bc11-bc1c3f05e074"
}
```

```json
{
  "id": "925aca78-da29-45be-bd86-d286f622e04c",
  "order_id": "b939fe41-1226-43d2-a42b-43593704ed9c",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "15e04421-daf6-436e-b767-d9bf05ce71b9",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/b939fe41-1226-43d2-a42b-43593704ed9c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:51:09.893928Z",
      "actor": {
        "type": "CLIENT",
        "id": "d9e82671-c0e9-4b15-96e7-8555ec5665f8",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b939fe41-1226-43d2-a42b-43593704ed9c",
        "quote_id": "6e5e21cb-03c9-4a5d-97af-d612ec5ff5a1",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "8bc75245-baa4-4f4e-aa1b-f56877414bc8"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:51:09.895962Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b939fe41-1226-43d2-a42b-43593704ed9c",
        "attempt_id": "80f0fca4-5344-4c05-971c-9a19827162aa",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "8bc75245-baa4-4f4e-aa1b-f56877414bc8"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T15:51:09.902302Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "82be9fd0-7abb-4670-aa63-68b7c5f6d171",
        "order_id": "b939fe41-1226-43d2-a42b-43593704ed9c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "8bc75245-baa4-4f4e-aa1b-f56877414bc8"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T15:51:10.489644Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "82be9fd0-7abb-4670-aa63-68b7c5f6d171",
        "order_id": "b939fe41-1226-43d2-a42b-43593704ed9c"
      },
      "correlation_id": "4c1c1f90-0ea0-4784-8a54-e440344e6e33"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order b939fe41-1226-43d2-a42b-43593704ed9c — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/b939fe41-1226-43d2-a42b-43593704ed9c` → **200**

```json
{
  "id": "b939fe41-1226-43d2-a42b-43593704ed9c",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "d9e82671-c0e9-4b15-96e7-8555ec5665f8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "925aca78-da29-45be-bd86-d286f622e04c",
    "order_id": "b939fe41-1226-43d2-a42b-43593704ed9c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "15e04421-daf6-436e-b767-d9bf05ce71b9",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T15:51:09.893472Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b939fe41-1226-43d2-a42b-43593704ed9c/cancel` → **200**

```json
{
  "command_id": "859ef65f-7580-4a97-989a-977efdae9b6c",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "b939fe41-1226-43d2-a42b-43593704ed9c",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "d9e82671-c0e9-4b15-96e7-8555ec5665f8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "925aca78-da29-45be-bd86-d286f622e04c",
    "order_id": "b939fe41-1226-43d2-a42b-43593704ed9c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "15e04421-daf6-436e-b767-d9bf05ce71b9",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T15:51:09.893472Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто",
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
  "session_id": "b8b6e757-3551-4980-969f-828e4729c1c7",
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
  "last_heartbeat_at": "2026-10-29T15:51:06.104904Z",
  "last_location_at": "2026-10-29T15:51:06.104904Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b8b6e757-3551-4980-969f-828e4729c1c7/close` → **200**

```json
{
  "command_id": "1e5670e6-c284-44b4-8ad9-4d73c074bae9",
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
  "session_id": "5027022d-2578-42b1-9bbb-48af0885186a",
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
  "last_heartbeat_at": "2026-10-29T15:51:07.559019Z",
  "last_location_at": "2026-10-29T15:51:07.559019Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5027022d-2578-42b1-9bbb-48af0885186a/close` → **200**

```json
{
  "command_id": "aecd9a29-9ac4-405a-a95d-57a01b85b6ce",
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
  "session_id": "ed9a9bbc-1867-46ec-afcf-3dc482dee5c3",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5NzMsImlhdCI6MTc5MzI4OTA3MywianRpIjoiYTQwYTY4ODAtMTE4MC00MTIxLWFiOWEtMGVkNWJkNGQxMmYzIiwic2lkIjoiZWQ5YTliYmMtMTg2Ny00NmVjLWFmY2YtM2RjNDgyZGVlNWMzIn0.J_aW4epxTCMLCuNtp6D8u2bqf-Xtz2lpD3FM60D6C8c",
  "access_expires_at": "2026-10-29T16:06:13.530225284Z",
  "refresh_token": "Bis8yWpF3yB1K1nk5_ef05n_Wn_RpAaMHBSPN5qy8Mw",
  "refresh_expires_at": "2026-10-30T03:51:13.529723726Z",
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
  "command_id": "61605632-1681-4c2e-963e-aa71c43e5bd5",
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
  "changed_by": "84015309-667b-408e-9731-2b3c5e734ac0",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T15:51:14.124395Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "e7485aa8-a663-434b-b1e3-52fbfb1162dc",
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
  "correlation_id": "b8a5b8c7-6e65-43c0-be99-ed9188b7d5c1"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "12012dd5-60eb-46c7-afd3-24d33c16433b",
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
  "correlation_id": "07188618-e9db-48d0-acce-16439cc645f9"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631875017",
  "device_ref": "sandbox-17291"
}
```

```json
{
  "challenge_id": "f02cd73e-a693-4612-b819-94f25fbb96e5",
  "expires_at": "2026-10-29T15:56:15.015498698Z",
  "resend_available_at": "2026-10-29T15:51:16.015498698Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631875017` → **200**

```json
{
  "phone": "+380631875017",
  "audience": "CLIENT",
  "code": "472861",
  "sent_at": "2026-10-29T15:51:15.018536852Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f02cd73e-a693-4612-b819-94f25fbb96e5",
  "code": "472861",
  "device_ref": "sandbox-17291"
}
```

```json
{
  "session_id": "442476d2-7b74-4d92-9370-4ea32919d7f5",
  "subject": {
    "type": "CLIENT",
    "id": "ef551589-9929-4a84-87f3-8faf4765d963"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZjU1MTU4OS05OTI5LTRhODQtODdmMy04ZmFmNDc2NWQ5NjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTc1LCJpYXQiOjE3OTMyODkwNzUsImp0aSI6IjdkYjlmMmVkLWFmYmYtNDc0Zi05ZWFkLTJkN2JjMzQzNzAwOCIsInNpZCI6IjQ0MjQ3NmQyLTdiNzQtNGQ5Mi05MzcwLTRlYTMyOTE5ZDdmNSJ9.QWbpxMLMtI_xCqILYc7PgmL3i6SQJWT14EFzRgfM1Ls",
  "access_expires_at": "2026-10-29T16:06:15.329169108Z",
  "refresh_token": "-igZdnIPc9dMz9SaOoVojvVUSguzRRyY5RCvdOBe3KA",
  "refresh_expires_at": "2026-11-28T15:51:15.328676014Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1be86633-0427-4e8f-9dfc-d893200ee94e",
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
  "id": "4919345f-3802-43f0-abbc-d5fefc3b1a2d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:56:15.620323Z",
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
  "command_id": "1d1c064d-b58b-4b9b-8578-ada7b7dd83da",
  "quote_id": "4919345f-3802-43f0-abbc-d5fefc3b1a2d",
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
  "correlation_id": "b76abea2-8bd5-488a-88dc-3b7261de2a56"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c631f975-331b-4d18-ac5b-29bde227204f",
  "quote_id": "4919345f-3802-43f0-abbc-d5fefc3b1a2d",
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
  "id": "73879745-2d30-413b-b838-4880aea192e0",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ef551589-9929-4a84-87f3-8faf4765d963",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:51:16.205954Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/73879745-2d30-413b-b838-4880aea192e0/cancel` → **200**

```json
{
  "command_id": "d582809e-ae14-47ea-b3e7-af93582129fd",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "73879745-2d30-413b-b838-4880aea192e0",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ef551589-9929-4a84-87f3-8faf4765d963",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:51:16.205954Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати",
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
  "command_id": "37b0bdd4-3178-4bfa-8172-acaf271f849b",
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
  "changed_by": "84015309-667b-408e-9731-2b3c5e734ac0",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T15:51:16.828286Z"
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
      "changed_by": "84015309-667b-408e-9731-2b3c5e734ac0",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T15:51:16.828286Z"
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
  "device_ref": "sandbox-2415"
}
```

```json
{
  "challenge_id": "2a4ab87f-24e8-45f9-9cac-d22b7bc36f01",
  "expires_at": "2026-10-29T15:56:17.702083108Z",
  "resend_available_at": "2026-10-29T15:51:18.702083108Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "296450",
  "sent_at": "2026-10-29T15:51:17.704614332Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2a4ab87f-24e8-45f9-9cac-d22b7bc36f01",
  "code": "296450",
  "device_ref": "sandbox-2415"
}
```

```json
{
  "session_id": "34116a4f-513f-4bbf-8ddd-bef59b48187d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTk3OCwiaWF0IjoxNzkzMjg5MDc4LCJqdGkiOiJmODdkYzI1Mi0yN2QzLTRhNTktYTYxMS1iYTdhY2UzNTI1OTMiLCJzaWQiOiIzNDExNmE0Zi01MTNmLTRiYmYtOGRkZC1iZWY1OWI0ODE4N2QifQ.zq0ytE3MhGDgukXo5z5xxIevkC2zVHuycd7Lk16jsa0",
  "access_expires_at": "2026-10-29T16:06:18.009622078Z",
  "refresh_token": "UtfSQl90Y9ueduU4Jv9-caAyywAxP8RWiv0WHX1qznc",
  "refresh_expires_at": "2026-11-28T15:51:18.009045224Z",
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
  "command_id": "6d23e235-76d7-4edb-bb7c-d016d0ff03df",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:51:18Z",
    "sequence": 1793289078579
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "81f6eb91-7acf-4345-9212-83c514bf87d1",
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
  "last_heartbeat_at": "2026-10-29T15:51:18.597821Z",
  "last_location_at": "2026-10-29T15:51:18.597821Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673552212",
  "device_ref": "sandbox-17400"
}
```

```json
{
  "challenge_id": "2b4e7d88-1154-4ef8-859a-c6eb7d66e9e0",
  "expires_at": "2026-10-29T15:56:18.885088911Z",
  "resend_available_at": "2026-10-29T15:51:19.885088911Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673552212` → **200**

```json
{
  "phone": "+380673552212",
  "audience": "CLIENT",
  "code": "613744",
  "sent_at": "2026-10-29T15:51:18.887731321Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2b4e7d88-1154-4ef8-859a-c6eb7d66e9e0",
  "code": "613744",
  "device_ref": "sandbox-17400"
}
```

```json
{
  "session_id": "026a08f3-0cb2-4cfc-8871-b067371ed922",
  "subject": {
    "type": "CLIENT",
    "id": "7eac6504-d4b8-4139-bc21-383eb344c04d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZWFjNjUwNC1kNGI4LTQxMzktYmMyMS0zODNlYjM0NGMwNGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTc5LCJpYXQiOjE3OTMyODkwNzksImp0aSI6IjY1ZGVjYWU1LWE0ZDItNDg1ZS05Zjk2LWQ3NWZhOTM0NTMzOCIsInNpZCI6IjAyNmEwOGYzLTBjYjItNGNmYy04ODcxLWIwNjczNzFlZDkyMiJ9.ygunIf9EeUy2CBYE8iNXtOYNALAWumureoknVanYvHk",
  "access_expires_at": "2026-10-29T16:06:19.196651567Z",
  "refresh_token": "R-Twx40O0lq_2r8uYcBRPrNSCvMXJeIpuUYsFs_wPXg",
  "refresh_expires_at": "2026-11-28T15:51:19.196152884Z",
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
  "command_id": "83c922e7-926d-470c-8f4e-bca2e3e699a3",
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
  "id": "f38cd8d5-7e56-4c30-a923-d59dcaeb9f49",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:56:19.764154Z",
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
  "command_id": "1088923f-07e8-4ef7-b96e-1e58b8251dae",
  "platform": "ANDROID",
  "token": "sandbox-driver-92541598-91b3-4cd9-87b1-4a8119e1bbe6"
}
```

```json
{
  "id": "0beac9f3-de5b-4d7c-a8c4-5a1a6dee3bf7",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T15:51:20.063877Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "52c60a35-2ca5-469f-a42f-56a234b29ed0",
  "platform": "ANDROID",
  "token": "sandbox-rider-1a1d5116-ac99-4040-8a4a-52547a374cda"
}
```

```json
{
  "id": "18b1a213-1e90-49e8-8865-f82751d0190b",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T15:51:20.344384Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "5677e22b-1abc-46a1-accb-51e3a5ae382f",
  "quote_id": "f38cd8d5-7e56-4c30-a923-d59dcaeb9f49",
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
  "id": "6e4fc56f-c3ae-4898-a7d8-2c6d82371abb",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7eac6504-d4b8-4139-bc21-383eb344c04d",
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
  "created_at": "2026-10-29T15:51:20.635096Z",
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
    "id": "95dc87db-4504-4fe7-bcdb-4b277932cee3",
    "order_id": "6e4fc56f-c3ae-4898-a7d8-2c6d82371abb",
    "expires_at": "2026-10-29T15:51:35.638317Z",
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

`POST /api/driver/v1/offers/95dc87db-4504-4fe7-bcdb-4b277932cee3/accept` → **200**

```json
{
  "command_id": "245084d8-d011-4289-9327-76c649014a0d"
}
```

```json
{
  "id": "cb4b4b18-84e4-4fa4-8445-9384794dac3e",
  "order_id": "6e4fc56f-c3ae-4898-a7d8-2c6d82371abb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "79596e80-ae94-42b6-bae1-304c31a9c6f5",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T15:51:20.611Z` → **200**

```json
[
  {
    "at": "2026-10-29T15:51:21.147177853Z",
    "token_suffix": "e1bbe6",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "8b237127-d78e-4160-8b92-bef6da48cee7",
      "order_version": "2",
      "order_id": "6e4fc56f-c3ae-4898-a7d8-2c6d82371abb",
      "type": "driver.offer",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380673552212&after=2026-10-29T15:51:20.611Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380673552212&after=2026-10-29T15:51:20.611Z` → **200**

```json
[
  {
    "at": "2026-10-29T15:51:22.153052974Z",
    "token_suffix": "374cda",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "3b65ee5c-72ed-4545-8446-b2f0ae657b04",
      "order_version": "3",
      "order_id": "6e4fc56f-c3ae-4898-a7d8-2c6d82371abb",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/6e4fc56f-c3ae-4898-a7d8-2c6d82371abb/messages` → **201**

```json
{
  "command_id": "0ecfbc80-4395-4cac-9773-72718de35fc5",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "01bd549e-e377-43aa-9de1-5025337a6da3",
  "order_id": "6e4fc56f-c3ae-4898-a7d8-2c6d82371abb",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T15:51:22.624032392Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "79596e80-ae94-42b6-bae1-304c31a9c6f5",
  "order_id": "6e4fc56f-c3ae-4898-a7d8-2c6d82371abb",
  "assignment_id": "cb4b4b18-84e4-4fa4-8445-9384794dac3e",
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

`POST /api/driver/v1/trips/79596e80-ae94-42b6-bae1-304c31a9c6f5/messages` → **201**

```json
{
  "command_id": "3c4c6ace-9371-423c-a455-811c207ae7fd",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "33c45236-4d7f-4d11-849b-c8745eec87b9",
  "order_id": "6e4fc56f-c3ae-4898-a7d8-2c6d82371abb",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T15:51:23.19348143Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/6e4fc56f-c3ae-4898-a7d8-2c6d82371abb/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/79596e80-ae94-42b6-bae1-304c31a9c6f5/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380673552212"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/81f6eb91-7acf-4345-9212-83c514bf87d1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:51:24Z",
    "sequence": 1793289084247
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "81f6eb91-7acf-4345-9212-83c514bf87d1",
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
  "last_heartbeat_at": "2026-10-29T15:51:24.043207Z",
  "last_location_at": "2026-10-29T15:51:24.043207Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "79596e80-ae94-42b6-bae1-304c31a9c6f5",
  "order_id": "6e4fc56f-c3ae-4898-a7d8-2c6d82371abb",
  "assignment_id": "cb4b4b18-84e4-4fa4-8445-9384794dac3e",
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

`POST /api/driver/v1/trips/79596e80-ae94-42b6-bae1-304c31a9c6f5/arrive` → **200**

```json
{
  "command_id": "a5a361d7-a44c-4ea7-bb33-2c4b1348f637",
  "expected_version": 0
}
```

```json
{
  "id": "79596e80-ae94-42b6-bae1-304c31a9c6f5",
  "order_id": "6e4fc56f-c3ae-4898-a7d8-2c6d82371abb",
  "assignment_id": "cb4b4b18-84e4-4fa4-8445-9384794dac3e",
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
  "arrived_at": "2026-10-29T15:51:24.615482Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/79596e80-ae94-42b6-bae1-304c31a9c6f5/start` → **200**

```json
{
  "command_id": "e92738f9-979c-4adc-816a-a48165a678ba",
  "expected_version": 1
}
```

```json
{
  "id": "79596e80-ae94-42b6-bae1-304c31a9c6f5",
  "order_id": "6e4fc56f-c3ae-4898-a7d8-2c6d82371abb",
  "assignment_id": "cb4b4b18-84e4-4fa4-8445-9384794dac3e",
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
  "arrived_at": "2026-10-29T15:51:24.615482Z",
  "started_at": "2026-10-29T15:51:24.910715Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/81f6eb91-7acf-4345-9212-83c514bf87d1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:51:25Z",
    "sequence": 1793289085200
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "81f6eb91-7acf-4345-9212-83c514bf87d1",
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
  "last_heartbeat_at": "2026-10-29T15:51:25.21947Z",
  "last_location_at": "2026-10-29T15:51:25.21947Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/79596e80-ae94-42b6-bae1-304c31a9c6f5/complete` → **200**

```json
{
  "command_id": "ac66c5d2-ffdb-45ba-b0ba-37782d68f242",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:51:25Z",
  "cash_received": true
}
```

```json
{
  "id": "79596e80-ae94-42b6-bae1-304c31a9c6f5",
  "order_id": "6e4fc56f-c3ae-4898-a7d8-2c6d82371abb",
  "assignment_id": "cb4b4b18-84e4-4fa4-8445-9384794dac3e",
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
  "arrived_at": "2026-10-29T15:51:24.615482Z",
  "started_at": "2026-10-29T15:51:24.910715Z",
  "completed_at": "2026-10-29T15:51:25.520137Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/6e4fc56f-c3ae-4898-a7d8-2c6d82371abb` → **200**

```json
{
  "id": "6e4fc56f-c3ae-4898-a7d8-2c6d82371abb",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "7eac6504-d4b8-4139-bc21-383eb344c04d",
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
    "id": "cb4b4b18-84e4-4fa4-8445-9384794dac3e",
    "order_id": "6e4fc56f-c3ae-4898-a7d8-2c6d82371abb",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "79596e80-ae94-42b6-bae1-304c31a9c6f5",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:51:20.635096Z",
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
    "id": "6e4fc56f-c3ae-4898-a7d8-2c6d82371abb",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-29T15:51:20.635096Z",
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
    "id": "79596e80-ae94-42b6-bae1-304c31a9c6f5",
    "order_id": "6e4fc56f-c3ae-4898-a7d8-2c6d82371abb",
    "order_short_number": 13,
    "created_at": "2026-10-29T15:51:21.249264Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "973ee3da-2076-475e-9659-f21d90dc4aa1",
    "order_id": "7555cd09-0b21-4f97-a33a-2e6ab70d81c0",
    "order_short_number": 8,
    "created_at": "2026-10-29T15:50:10.387789Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "44bada39-98b0-4849-aa29-e378cd4d6fcb",
    "order_id": "02c3a07c-5b6b-4a1c-8541-4d3498495694",
    "order_short_number": 3,
    "created_at": "2026-10-29T15:49:25.949696Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "daa44874-ee65-420a-ac26-a636bb90dd48",
    "order_id": "72398b7a-c32c-4224-9530-30b0acf13c1b",
    "order_short_number": 2,
    "created_at": "2026-10-29T15:49:06.212165Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "27cddf5e-23ff-4d42-b34f-de2ab4fd7468",
    "order_id": "837b8d42-ad21-4e39-b4da-89f19570bfbb",
    "order_short_number": 1,
    "created_at": "2026-10-29T15:48:56.122129Z",
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

`GET /api/rider/v1/orders/6e4fc56f-c3ae-4898-a7d8-2c6d82371abb/tip` → **200**

```json
{
  "order_id": "6e4fc56f-c3ae-4898-a7d8-2c6d82371abb",
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
  "available_until": "2026-10-30T15:51:25.520137Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/6e4fc56f-c3ae-4898-a7d8-2c6d82371abb/tip` → **201**

```json
{
  "command_id": "42c32166-2f35-450a-a3b2-9f87132a198c",
  "amount_minor": 1100
}
```

```json
{
  "id": "77a2cf60-3bd4-402e-af95-c6f32be23631",
  "order_id": "6e4fc56f-c3ae-4898-a7d8-2c6d82371abb",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T15:51:30.610671Z"
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
  "session_id": "27987ed3-87dd-4491-b5cd-ed6ff9c1dfc6",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5OTEsImlhdCI6MTc5MzI4OTA5MSwianRpIjoiZTE1MTk2MTctYWEwZC00YmQzLTg4YTUtZjZjM2EzYTZiNDkxIiwic2lkIjoiMjc5ODdlZDMtODdkZC00NDkxLWI1Y2QtZWQ2ZmY5YzFkZmM2In0.wXElgw07tFkwbRNqRU2CxXUGs6cWY01EAkk9mK2aYYQ",
  "access_expires_at": "2026-10-29T16:06:31.194271673Z",
  "refresh_token": "UuH1RESDX_bDxH98ffyTLDi-k1MNd33C91Jn2dk0KH8",
  "refresh_expires_at": "2026-10-30T03:51:31.19364424Z",
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
          "CARD": 2,
          "CASH": 11
        },
        "cancelled_by": {
          "RIDER": 3,
          "STAFF": 1,
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
      "CARD": 2,
      "CASH": 11
    },
    "cancelled_by": {
      "RIDER": 3,
      "STAFF": 1,
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
  "generated_at": "2026-10-29T15:51:31.485481303Z"
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
  "generated_at": "2026-10-29T15:51:31.780393136Z"
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
  "session_id": "10dda410-a820-424c-af64-700dcffdbc93",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5OTIsImlhdCI6MTc5MzI4OTA5MiwianRpIjoiOTdhN2M4MjYtYzEyMi00YTg3LWFjNGUtMGZmYjRmZDYwMWU4Iiwic2lkIjoiMTBkZGE0MTAtYTgyMC00MjRjLWFmNjQtNzAwZGNmZmRiYzkzIn0.5gaJhJpb2_ybG3mFuy1Vni_j9Wkq1t-thhQV0UprOgg",
  "access_expires_at": "2026-10-29T16:06:32.390720525Z",
  "refresh_token": "AKIjSpR7fULmcxxn8_GZpLx9P_CPMdD1cs4P8v9caQA",
  "refresh_expires_at": "2026-10-30T03:51:32.38981431Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/6e4fc56f-c3ae-4898-a7d8-2c6d82371abb/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:51:20.635525Z",
      "actor": {
        "type": "CLIENT",
        "id": "7eac6504-d4b8-4139-bc21-383eb344c04d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "6e4fc56f-c3ae-4898-a7d8-2c6d82371abb",
        "quote_id": "f38cd8d5-7e56-4c30-a923-d59dcaeb9f49",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "a6df8cac-2f1f-48f6-b32c-baf86e755cc7"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:51:20.637491Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6e4fc56f-c3ae-4898-a7d8-2c6d82371abb",
        "attempt_id": "883b3993-ccdc-40e3-823b-f8cfe2e1304a",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "a6df8cac-2f1f-48f6-b32c-baf86e755cc7"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T15:51:20.64354Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "95dc87db-4504-4fe7-bcdb-4b277932cee3",
        "order_id": "6e4fc56f-c3ae-4898-a7d8-2c6d82371abb",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "a6df8cac-2f1f-48f6-b32c-baf86e755cc7"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T15:51:21.25086Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "95dc87db-4504-4fe7-bcdb-4b277932cee3",
        "order_id": "6e4fc56f-c3ae-4898-a7d8-2c6d82371abb",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "cb4b4b18-84e4-4fa4-8445-9384794dac3e"
      },
      "correlation_id": "1aa9ed98-9542-40ed-9256-02035dc1fb94"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T15:51:32.986059812Z",
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
      "last_location_at": "2026-10-29T15:51:25.21947Z",
      "order_id": null
    }
  ]
}
```

Done: order 6e4fc56f-c3ae-4898-a7d8-2c6d82371abb.

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
  "session_id": "c05b4c17-2ed7-4fa7-b019-ae91acfe5802",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5OTMsImlhdCI6MTc5MzI4OTA5MywianRpIjoiOTE1MGJhNzYtMWE1MC00ZGIzLWJlZjAtZmVhYzVkYTE1YmRkIiwic2lkIjoiYzA1YjRjMTctMmVkNy00ZmE3LWIwMTktYWU5MWFjZmU1ODAyIn0.BQYxmRU_Fy_Ztz2-hKG57Uckrwu28sQCb__9YBpiMSM",
  "access_expires_at": "2026-10-29T16:06:33.598834448Z",
  "refresh_token": "8thVcvAH2JaIUe2SAv7CF181YowAB4bkw-BFJA6XZn4",
  "refresh_expires_at": "2026-10-30T03:51:33.598155828Z",
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
  "command_id": "bee50fc1-f988-4feb-99c0-dd82da6b2e13",
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
  "timestamp": "2026-10-29T15:51:34.000+0000",
  "channel": {
    "id": "1730052000.758322794",
    "linkedid": "1730052000.758322794",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679892303"
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
  "timestamp": "2026-10-29T15:51:34.000+0000",
  "channel": {
    "id": "1730052000.758322794",
    "linkedid": "1730052000.758322794",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679892303"
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
  "session_id": "bdc59e80-5b7c-4058-b489-fc21a1701b28",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5OTQsImlhdCI6MTc5MzI4OTA5NCwianRpIjoiOWY0NTJkZGItNWQ1Mi00ZjRlLThjNWEtMjIyZDkzNDA3Nzc1Iiwic2lkIjoiYmRjNTllODAtNWI3Yy00MDU4LWI0ODktZmMyMWExNzAxYjI4In0.Z1i9UxX28FBOzh3PLfxP77Rr5WiqyebrxwC4NVAKU3o",
  "access_expires_at": "2026-10-29T16:06:34.78196144Z",
  "refresh_token": "p4PmMpxCYf3wH5y48PO1mc7UbJUsdZipGZtpA5vyPSM",
  "refresh_expires_at": "2026-10-30T03:51:34.781366335Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "f9ce9c6f-c7f4-482c-b324-1509bdc62a42",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679892303",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T15:51:34Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/f9ce9c6f-c7f4-482c-b324-1509bdc62a42/answer` → **200**

```json
{
  "command_id": "cc1794c1-361d-447b-a0e0-ec2195d7f8d3"
}
```

```json
{
  "id": "f9ce9c6f-c7f4-482c-b324-1509bdc62a42",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679892303",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "84015309-667b-408e-9731-2b3c5e734ac0",
  "order_ids": [],
  "started_at": "2026-10-29T15:51:34Z",
  "answered_at": "2026-10-29T15:51:35.376872Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.758322794",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "23fd9185-94af-4c94-9312-a11496cf49f5",
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
  "id": "10ceb357-5dd7-464f-b6f7-c58eb02ae149",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:56:35.692419Z",
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
  "command_id": "7652376e-55b7-4670-82df-6bda79918fca",
  "quote_id": "10ceb357-5dd7-464f-b6f7-c58eb02ae149",
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
    "phone": "+380679892303"
  },
  "call_id": "f9ce9c6f-c7f4-482c-b324-1509bdc62a42"
}
```

```json
{
  "id": "6231da9f-97e4-4faf-b32f-2a70531c47b9",
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
  "created_at": "2026-10-29T15:51:36.012063Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679892303"
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
    "id": "1730052000.758322794",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "f9ce9c6f-c7f4-482c-b324-1509bdc62a42",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679892303",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "84015309-667b-408e-9731-2b3c5e734ac0",
      "order_ids": [
        "6231da9f-97e4-4faf-b32f-2a70531c47b9"
      ],
      "started_at": "2026-10-29T15:51:34Z",
      "answered_at": "2026-10-29T15:51:35.376872Z",
      "ended_at": "2026-10-29T15:51:36.34732Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "d66a4389-4db8-445a-a873-fb27bbe49c49",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679272715",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "84015309-667b-408e-9731-2b3c5e734ac0",
      "order_ids": [],
      "started_at": "2026-10-29T15:49:14.507435Z",
      "answered_at": "2026-10-29T15:49:14.841677Z",
      "ended_at": "2026-10-29T15:49:15.180006Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T15:49:21.550188Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/6231da9f-97e4-4faf-b32f-2a70531c47b9` → **200**

```json
{
  "id": "6231da9f-97e4-4faf-b32f-2a70531c47b9",
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
  "created_at": "2026-10-29T15:51:36.012063Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679892303"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/6231da9f-97e4-4faf-b32f-2a70531c47b9` → **200**

```json
{
  "id": "6231da9f-97e4-4faf-b32f-2a70531c47b9",
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
  "created_at": "2026-10-29T15:51:36.012063Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679892303"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/6231da9f-97e4-4faf-b32f-2a70531c47b9/cancel` → **200**

```json
{
  "command_id": "682e86a0-fc39-45dc-97a3-51161e1c2b56",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "6231da9f-97e4-4faf-b32f-2a70531c47b9",
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
  "created_at": "2026-10-29T15:51:36.012063Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679892303"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call f9ce9c6f-c7f4-482c-b324-1509bdc62a42 with order 6231da9f-97e4-4faf-b32f-2a70531c47b9.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-9463"
}
```

```json
{
  "challenge_id": "cf834f81-f8e9-4eb3-ac09-30204f009ed9",
  "expires_at": "2026-10-29T15:56:37.615639398Z",
  "resend_available_at": "2026-10-29T15:51:38.615639398Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "852636",
  "sent_at": "2026-10-29T15:51:37.618304594Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cf834f81-f8e9-4eb3-ac09-30204f009ed9",
  "code": "852636",
  "device_ref": "sandbox-9463"
}
```

```json
{
  "session_id": "5c23f198-65ef-4014-ae40-2f8745946ffd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTk5NywiaWF0IjoxNzkzMjg5MDk3LCJqdGkiOiIyZTk4MTcxMS0zOTA3LTRmNGYtOTA1Ny1hMTUzYTllMTczNjQiLCJzaWQiOiI1YzIzZjE5OC02NWVmLTQwMTQtYWU0MC0yZjg3NDU5NDZmZmQifQ.UakQbL2ROdVOqB3uKQXuixDn4kWdP_4y7fAFwrv2sf8",
  "access_expires_at": "2026-10-29T16:06:37.934036881Z",
  "refresh_token": "Vl0feUtYnoJo_5A--N0C6kShtfkDoUHTbw6udbkqHc4",
  "refresh_expires_at": "2026-11-28T15:51:37.933464811Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "81f6eb91-7acf-4345-9212-83c514bf87d1",
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
  "last_heartbeat_at": "2026-10-29T15:51:25.21947Z",
  "last_location_at": "2026-10-29T15:51:25.21947Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/81f6eb91-7acf-4345-9212-83c514bf87d1/handover` → **200**

```json
{
  "command_id": "3b911ada-466a-4dc9-bdcd-ec359b94c09f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "81f6eb91-7acf-4345-9212-83c514bf87d1",
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
  "last_heartbeat_at": "2026-10-29T15:51:25.21947Z",
  "last_location_at": "2026-10-29T15:51:25.21947Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/81f6eb91-7acf-4345-9212-83c514bf87d1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:51:38Z",
    "sequence": 1793289098789
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "81f6eb91-7acf-4345-9212-83c514bf87d1",
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
  "last_heartbeat_at": "2026-10-29T15:51:38.808647Z",
  "last_location_at": "2026-10-29T15:51:38.808647Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661120148",
  "device_ref": "sandbox-3781"
}
```

```json
{
  "challenge_id": "3c05a564-7bce-43d3-b4db-29005c195111",
  "expires_at": "2026-10-29T15:56:39.110909904Z",
  "resend_available_at": "2026-10-29T15:51:40.110909904Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380661120148` → **200**

```json
{
  "phone": "+380661120148",
  "audience": "CLIENT",
  "code": "122118",
  "sent_at": "2026-10-29T15:51:39.113549168Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c05a564-7bce-43d3-b4db-29005c195111",
  "code": "122118",
  "device_ref": "sandbox-3781"
}
```

```json
{
  "session_id": "798c9460-314a-4d96-be02-898650e621b1",
  "subject": {
    "type": "CLIENT",
    "id": "ca7c251b-1605-4bf0-8dd4-0f7df1c13c05"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTdjMjUxYi0xNjA1LTRiZjAtOGRkNC0wZjdkZjFjMTNjMDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTk5LCJpYXQiOjE3OTMyODkwOTksImp0aSI6IjIzOTVhYThjLTY1MmQtNDI1NS04MzFlLWQxZWU1MmY3NjZjNiIsInNpZCI6Ijc5OGM5NDYwLTMxNGEtNGQ5Ni1iZTAyLTg5ODY1MGU2MjFiMSJ9.fz4bfdnCMsNNCjVfSUh0z2GU834D1lQ6PC7brmeVLWA",
  "access_expires_at": "2026-10-29T16:06:39.432875705Z",
  "refresh_token": "uyiVUpvi1quvwdDK41Bx0220HZBLgBXzkXJnmk0UF8o",
  "refresh_expires_at": "2026-11-28T15:51:39.432297827Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9bc22bae-1dd4-4a44-a0d0-c1215c93b8a4",
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
  "id": "f0811ec3-3b77-473a-ae74-865fac08bc9d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:56:39.726944Z",
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
  "command_id": "529b304e-df6d-459d-bc8f-b3a4922f9630",
  "quote_id": "f0811ec3-3b77-473a-ae74-865fac08bc9d",
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
  "id": "34c2fbb5-25e7-4b0f-9122-16100b683c5f",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ca7c251b-1605-4bf0-8dd4-0f7df1c13c05",
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
  "created_at": "2026-10-29T15:51:40.039324Z",
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
    "id": "e7284247-e2c3-4d09-9157-2fdd5ace333c",
    "order_id": "34c2fbb5-25e7-4b0f-9122-16100b683c5f",
    "expires_at": "2026-10-29T15:51:55.042582Z",
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

`POST /api/driver/v1/offers/e7284247-e2c3-4d09-9157-2fdd5ace333c/accept` → **200**

```json
{
  "command_id": "994fb606-7612-44b4-8421-64701cdce33d"
}
```

```json
{
  "id": "4ca15bc5-c85c-49c5-879e-4f40c9c686cc",
  "order_id": "34c2fbb5-25e7-4b0f-9122-16100b683c5f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3030face-56e3-412b-a4e8-40780233d7b7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3030face-56e3-412b-a4e8-40780233d7b7",
  "order_id": "34c2fbb5-25e7-4b0f-9122-16100b683c5f",
  "assignment_id": "4ca15bc5-c85c-49c5-879e-4f40c9c686cc",
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

`POST /api/driver/v1/work-sessions/81f6eb91-7acf-4345-9212-83c514bf87d1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:51:41Z",
    "sequence": 1793289101207
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "81f6eb91-7acf-4345-9212-83c514bf87d1",
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
  "last_heartbeat_at": "2026-10-29T15:51:41.226407Z",
  "last_location_at": "2026-10-29T15:51:41.226407Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3030face-56e3-412b-a4e8-40780233d7b7/arrive` → **200**

```json
{
  "command_id": "21e370b3-1609-46bf-bb6d-d2a21bea3702",
  "expected_version": 0
}
```

```json
{
  "id": "3030face-56e3-412b-a4e8-40780233d7b7",
  "order_id": "34c2fbb5-25e7-4b0f-9122-16100b683c5f",
  "assignment_id": "4ca15bc5-c85c-49c5-879e-4f40c9c686cc",
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
  "arrived_at": "2026-10-29T15:51:41.561925Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3030face-56e3-412b-a4e8-40780233d7b7/start` → **200**

```json
{
  "command_id": "c4b3e7b9-de94-43f6-87ad-37ca34397f60",
  "expected_version": 1
}
```

```json
{
  "id": "3030face-56e3-412b-a4e8-40780233d7b7",
  "order_id": "34c2fbb5-25e7-4b0f-9122-16100b683c5f",
  "assignment_id": "4ca15bc5-c85c-49c5-879e-4f40c9c686cc",
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
  "arrived_at": "2026-10-29T15:51:41.561925Z",
  "started_at": "2026-10-29T15:51:41.961891Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/81f6eb91-7acf-4345-9212-83c514bf87d1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:51:42Z",
    "sequence": 1793289102323
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "81f6eb91-7acf-4345-9212-83c514bf87d1",
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
  "last_heartbeat_at": "2026-10-29T15:51:42.344732Z",
  "last_location_at": "2026-10-29T15:51:42.344732Z",
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
  "device_ref": "sandbox-10073"
}
```

```json
{
  "challenge_id": "81530fac-1479-465a-8a9c-a7b507a8399b",
  "expires_at": "2026-10-29T15:56:42.640116836Z",
  "resend_available_at": "2026-10-29T15:51:43.640116836Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "635598",
  "sent_at": "2026-10-29T15:51:42.642780671Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "81530fac-1479-465a-8a9c-a7b507a8399b",
  "code": "635598",
  "device_ref": "sandbox-10073"
}
```

```json
{
  "session_id": "cfad1871-e894-4551-9bf4-ccf534676276",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDAwMiwiaWF0IjoxNzkzMjg5MTAyLCJqdGkiOiIyNGFkZjRlMS05ZTQxLTRlMGMtOWUwMS00OTY5NjMyZGY5ZDYiLCJzaWQiOiJjZmFkMTg3MS1lODk0LTQ1NTEtOWJmNC1jY2Y1MzQ2NzYyNzYifQ.FjnI3AI4ofFXCEa2XHRbZdNBoOeeuy10-BUeUg40DkQ",
  "access_expires_at": "2026-10-29T16:06:42.95488898Z",
  "refresh_token": "WlfujBteW4jRjkcke20eef0h5nXIQ0nVprLwWIjm6Bk",
  "refresh_expires_at": "2026-11-28T15:51:42.954347978Z",
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
  "command_id": "78aea948-ace5-4041-b61d-c46071808c97",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:51:43Z",
    "sequence": 1793289103510
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6a4112d3-dd2e-4535-8905-e70fdda3ad20",
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
  "last_heartbeat_at": "2026-10-29T15:51:43.529122Z",
  "last_location_at": "2026-10-29T15:51:43.529122Z",
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
  "session_id": "7ad02ca6-aefa-4442-93e0-561ec7fd1213",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwMDQsImlhdCI6MTc5MzI4OTEwNCwianRpIjoiN2RlZDY4YjgtODkyZC00MGI1LTg1YTUtYzE3ZDU2MjljZmQ0Iiwic2lkIjoiN2FkMDJjYTYtYWVmYS00NDQyLTkzZTAtNTYxZWM3ZmQxMjEzIn0.PPOxcs-jFt-RUtPu9-4SRtSWKJ-UALnUs5_ua-5czvc",
  "access_expires_at": "2026-10-29T16:06:44.105485654Z",
  "refresh_token": "bYvzB2nnfupSDkejvMnB9XOF_jg4HmHgmck9df3WmGE",
  "refresh_expires_at": "2026-10-30T03:51:44.104932869Z",
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
  "session_id": "52a8c051-e12e-4a81-a27a-896f20144b31",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwMDQsImlhdCI6MTc5MzI4OTEwNCwianRpIjoiMjQyNWJmZDEtNDg2NC00OWEyLWEwZDctZTE2Nzg2NjQ2NGJjIiwic2lkIjoiNTJhOGMwNTEtZTEyZS00YTgxLWEyN2EtODk2ZjIwMTQ0YjMxIn0.czrKiC9Z9V-BLkD7QFOBSxRVsgyFUmkAaBCnI1H_qAI",
  "access_expires_at": "2026-10-29T16:06:44.683148651Z",
  "refresh_token": "loSd8m29OsNiqTdQHY4d0ixZJIk0dJ1hCXdDkt5LnXs",
  "refresh_expires_at": "2026-10-30T03:51:44.682534653Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/34c2fbb5-25e7-4b0f-9122-16100b683c5f` → **200**

```json
{
  "id": "34c2fbb5-25e7-4b0f-9122-16100b683c5f",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "ca7c251b-1605-4bf0-8dd4-0f7df1c13c05",
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
    "id": "4ca15bc5-c85c-49c5-879e-4f40c9c686cc",
    "order_id": "34c2fbb5-25e7-4b0f-9122-16100b683c5f",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "3030face-56e3-412b-a4e8-40780233d7b7",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T15:51:40.039324Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/34c2fbb5-25e7-4b0f-9122-16100b683c5f/interrupt` → **200**

```json
{
  "command_id": "3770837d-4814-4fcf-983e-52fabedb9bd4",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "34c2fbb5-25e7-4b0f-9122-16100b683c5f",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "ca7c251b-1605-4bf0-8dd4-0f7df1c13c05",
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
      "id": "4ca15bc5-c85c-49c5-879e-4f40c9c686cc",
      "order_id": "34c2fbb5-25e7-4b0f-9122-16100b683c5f",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "3030face-56e3-412b-a4e8-40780233d7b7",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T15:51:40.039324Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "29b042a1-ca6c-4191-92e9-42ccc3c0c61a",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "ca7c251b-1605-4bf0-8dd4-0f7df1c13c05",
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
    "id": "ca27ea36-dcec-45ea-b97f-6031b9d9c16f",
    "order_id": "29b042a1-ca6c-4191-92e9-42ccc3c0c61a",
    "expires_at": "2026-10-29T15:52:00.307501Z",
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

`POST /api/driver/v1/offers/ca27ea36-dcec-45ea-b97f-6031b9d9c16f/accept` → **200**

```json
{
  "command_id": "e1bd3b23-fbe7-40dd-8190-f8207dd02453"
}
```

```json
{
  "id": "8b51e8f4-0304-4a1b-90a3-a2b2e39ae52b",
  "order_id": "29b042a1-ca6c-4191-92e9-42ccc3c0c61a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "37070d3e-aed2-4357-85c3-4dac56600218",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "37070d3e-aed2-4357-85c3-4dac56600218",
  "order_id": "29b042a1-ca6c-4191-92e9-42ccc3c0c61a",
  "assignment_id": "8b51e8f4-0304-4a1b-90a3-a2b2e39ae52b",
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
  "session_id": "6a4112d3-dd2e-4535-8905-e70fdda3ad20",
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
  "last_heartbeat_at": "2026-10-29T15:51:43.529122Z",
  "last_location_at": "2026-10-29T15:51:43.529122Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/6a4112d3-dd2e-4535-8905-e70fdda3ad20/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:51:46Z",
    "sequence": 1793289106790
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6a4112d3-dd2e-4535-8905-e70fdda3ad20",
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
  "last_heartbeat_at": "2026-10-29T15:51:46.810137Z",
  "last_location_at": "2026-10-29T15:51:46.810137Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/37070d3e-aed2-4357-85c3-4dac56600218/arrive` → **200**

```json
{
  "command_id": "fd3379cb-4afd-40c3-91c4-11255a5c1692",
  "expected_version": 0
}
```

```json
{
  "id": "37070d3e-aed2-4357-85c3-4dac56600218",
  "order_id": "29b042a1-ca6c-4191-92e9-42ccc3c0c61a",
  "assignment_id": "8b51e8f4-0304-4a1b-90a3-a2b2e39ae52b",
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
  "arrived_at": "2026-10-29T15:51:47.109358Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/37070d3e-aed2-4357-85c3-4dac56600218/start` → **200**

```json
{
  "command_id": "5b14df1f-8adf-47a1-8b23-b5389b114475",
  "expected_version": 1
}
```

```json
{
  "id": "37070d3e-aed2-4357-85c3-4dac56600218",
  "order_id": "29b042a1-ca6c-4191-92e9-42ccc3c0c61a",
  "assignment_id": "8b51e8f4-0304-4a1b-90a3-a2b2e39ae52b",
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
  "arrived_at": "2026-10-29T15:51:47.109358Z",
  "started_at": "2026-10-29T15:51:47.415496Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/37070d3e-aed2-4357-85c3-4dac56600218/complete` → **200**

```json
{
  "command_id": "59044ddb-d974-4452-ad34-9e3912eed1fb",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:51:47Z"
}
```

```json
{
  "id": "37070d3e-aed2-4357-85c3-4dac56600218",
  "order_id": "29b042a1-ca6c-4191-92e9-42ccc3c0c61a",
  "assignment_id": "8b51e8f4-0304-4a1b-90a3-a2b2e39ae52b",
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
  "arrived_at": "2026-10-29T15:51:47.109358Z",
  "started_at": "2026-10-29T15:51:47.415496Z",
  "completed_at": "2026-10-29T15:51:47.718329Z",
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
    "id": "29b042a1-ca6c-4191-92e9-42ccc3c0c61a",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-29T15:51:45.296738Z",
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
    "id": "34c2fbb5-25e7-4b0f-9122-16100b683c5f",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-29T15:51:40.039324Z",
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
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі",
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

`GET /api/operator/v1/orders/34c2fbb5-25e7-4b0f-9122-16100b683c5f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:51:40.039846Z",
      "actor": {
        "type": "CLIENT",
        "id": "ca7c251b-1605-4bf0-8dd4-0f7df1c13c05",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "34c2fbb5-25e7-4b0f-9122-16100b683c5f",
        "quote_id": "f0811ec3-3b77-473a-ae74-865fac08bc9d",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "d600dd7a-1d50-47a5-8377-2fd20a7833dc"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:51:40.041777Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "34c2fbb5-25e7-4b0f-9122-16100b683c5f",
        "attempt_id": "4067663a-5967-49b6-ac19-ef6e858d11f7",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "d600dd7a-1d50-47a5-8377-2fd20a7833dc"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T15:51:40.047842Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "e7284247-e2c3-4d09-9157-2fdd5ace333c",
        "order_id": "34c2fbb5-25e7-4b0f-9122-16100b683c5f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "d600dd7a-1d50-47a5-8377-2fd20a7833dc"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T15:51:40.647309Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "e7284247-e2c3-4d09-9157-2fdd5ace333c",
        "order_id": "34c2fbb5-25e7-4b0f-9122-16100b683c5f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "4ca15bc5-c85c-49c5-879e-4f40c9c686cc"
      },
      "correlation_id": "9c257030-b790-40b5-b01f-48333ad99cf4"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/29b042a1-ca6c-4191-92e9-42ccc3c0c61a/tip` → **200**

```json
{
  "order_id": "29b042a1-ca6c-4191-92e9-42ccc3c0c61a",
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
  "available_until": "2026-10-30T15:51:47.718329Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/29b042a1-ca6c-4191-92e9-42ccc3c0c61a/tip` → **409**

```json
{
  "command_id": "6831b1a8-3dfe-4f0b-b571-089a4cf9fed8",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/29b042a1-ca6c-4191-92e9-42ccc3c0c61a/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "05294d2c-7d20-4bff-8e67-2560ae0e441c"
}
```

Done: interrupted 34c2fbb5-25e7-4b0f-9122-16100b683c5f, follow-up 29b042a1-ca6c-4191-92e9-42ccc3c0c61a.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "81f6eb91-7acf-4345-9212-83c514bf87d1",
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
  "last_heartbeat_at": "2026-10-29T15:51:42.344732Z",
  "last_location_at": "2026-10-29T15:51:42.344732Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/81f6eb91-7acf-4345-9212-83c514bf87d1/close` → **200**

```json
{
  "command_id": "e039cb45-5cff-4df9-a52b-e2821c32d246",
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
  "session_id": "6a4112d3-dd2e-4535-8905-e70fdda3ad20",
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
  "last_heartbeat_at": "2026-10-29T15:51:46.810137Z",
  "last_location_at": "2026-10-29T15:51:46.810137Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6a4112d3-dd2e-4535-8905-e70fdda3ad20/close` → **200**

```json
{
  "command_id": "8af5c85a-53a9-4755-85f3-68f8b76dd508",
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
  "session_id": "daabb263-b11e-4c4e-930e-0050936d5844",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwMTQsImlhdCI6MTc5MzI4OTExNCwianRpIjoiZWM5ZGExNmQtZWRkNS00N2E2LThkYjQtNWE4ZWE2Y2QzYzA1Iiwic2lkIjoiZGFhYmIyNjMtYjExZS00YzRlLTkzMGUtMDA1MDkzNmQ1ODQ0In0.BgYNbr7i3GSq4cJr3OAMef1tr__9Q453GAdtXq6cS94",
  "access_expires_at": "2026-10-29T16:06:54.00190268Z",
  "refresh_token": "m7NsmS9mZXmPA3M_ZbrSy6tJwnmRpQwtiC7oe1zzrDk",
  "refresh_expires_at": "2026-10-30T03:51:54.001025368Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "80261fe9-d649-4ade-8a2f-60a154eda51f",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T15:51:54Z"
}
```

```json
{
  "id": "8a58cbd4-7857-4ab0-acb7-d4d710c1328f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T15:51:54Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/8a58cbd4-7857-4ab0-acb7-d4d710c1328f/publish` → **200**

```json
{
  "command_id": "bc3f2909-3a8b-4ef0-b8ac-bc236fb1d72b",
  "expected_version": 0
}
```

```json
{
  "id": "8a58cbd4-7857-4ab0-acb7-d4d710c1328f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T15:51:54.623383Z",
  "published_at": "2026-10-29T15:51:54.623383Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "8a58cbd4-7857-4ab0-acb7-d4d710c1328f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T15:51:54.623383Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632907180",
  "device_ref": "sandbox-18921"
}
```

```json
{
  "challenge_id": "8e7a7a88-ff28-41ad-b17a-ad38b5b5d39b",
  "expires_at": "2026-10-29T15:56:55.195502597Z",
  "resend_available_at": "2026-10-29T15:51:56.195502597Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632907180` → **200**

```json
{
  "phone": "+380632907180",
  "audience": "CLIENT",
  "code": "202518",
  "sent_at": "2026-10-29T15:51:55.198928826Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8e7a7a88-ff28-41ad-b17a-ad38b5b5d39b",
  "code": "202518",
  "device_ref": "sandbox-18921"
}
```

```json
{
  "session_id": "53f5dcd2-6a7a-47a0-81f1-ff3596e6ad09",
  "subject": {
    "type": "CLIENT",
    "id": "e1cd8a50-121d-4734-b323-cdee9e5bd47d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWNkOGE1MC0xMjFkLTQ3MzQtYjMyMy1jZGVlOWU1YmQ0N2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMDE1LCJpYXQiOjE3OTMyODkxMTUsImp0aSI6IjNkM2U0ODZlLWZlMmUtNGJjZi04ODQwLTdhNjdiNDVhMGRhYSIsInNpZCI6IjUzZjVkY2QyLTZhN2EtNDdhMC04MWYxLWZmMzU5NmU2YWQwOSJ9.vZw7I8YIanyPOElE4WlhLYSRjSHkbNm21xwWbNl1IxE",
  "access_expires_at": "2026-10-29T16:06:55.514861404Z",
  "refresh_token": "9BPeu0kDeE-06XfbR8EthYC6BxCJR1tI5rqEwHYZJ0o",
  "refresh_expires_at": "2026-11-28T15:51:55.514289394Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "8a58cbd4-7857-4ab0-acb7-d4d710c1328f",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T15:51:54.623383Z",
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
  "command_id": "1552f76b-8d25-4d10-ac0f-43a74dc16bb2",
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
  "id": "7f3f9980-0ad3-4b4f-9613-7de149e7b55e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:56:56.108425Z",
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
  "command_id": "a4024d04-a672-482a-a548-2caf286cea77",
  "quote_id": "7f3f9980-0ad3-4b4f-9613-7de149e7b55e",
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
  "correlation_id": "76a0809a-76a2-42c3-b27d-41ff5c404883"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "a06bd465-94c0-4b73-8773-d11225ba092b",
  "version_id": "8a58cbd4-7857-4ab0-acb7-d4d710c1328f",
  "language": "uk"
}
```

```json
{
  "version_id": "8a58cbd4-7857-4ab0-acb7-d4d710c1328f",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T15:51:56.733874Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "11bd4adf-d0bc-4ac7-8513-4d4d4665d984",
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
  "id": "70a6a1d7-8d3a-4743-b0c2-d9b5da468849",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:56:57.032853Z",
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
  "command_id": "daa869c4-b653-43eb-85cf-08d7f328b974",
  "quote_id": "70a6a1d7-8d3a-4743-b0c2-d9b5da468849",
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
  "id": "03a98fcf-1f48-4f32-953e-47e5cba189b3",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e1cd8a50-121d-4734-b323-cdee9e5bd47d",
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
  "created_at": "2026-10-29T15:51:57.335582Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/03a98fcf-1f48-4f32-953e-47e5cba189b3` → **200**

```json
{
  "id": "03a98fcf-1f48-4f32-953e-47e5cba189b3",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e1cd8a50-121d-4734-b323-cdee9e5bd47d",
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
  "created_at": "2026-10-29T15:51:57.335582Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/03a98fcf-1f48-4f32-953e-47e5cba189b3/cancel` → **200**

```json
{
  "command_id": "a6be824b-2b42-46c1-93e1-65f1a3a396a3",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "03a98fcf-1f48-4f32-953e-47e5cba189b3",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e1cd8a50-121d-4734-b323-cdee9e5bd47d",
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
  "created_at": "2026-10-29T15:51:57.335582Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати",
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

`POST /api/admin/v1/legal-documents/8a58cbd4-7857-4ab0-acb7-d4d710c1328f` → **409**

```json
{
  "command_id": "d697b7e4-d4d8-4017-991b-aebc85cd8d04",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T15:51:58Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/8a58cbd4-7857-4ab0-acb7-d4d710c1328f",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4a8500b2-3b44-4e63-bd47-a3c81f2a68e5"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "19d09bab-afb9-4360-9d90-b0522e83592f",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T15:51:58Z"
}
```

```json
{
  "id": "02824b9c-bd1b-47f5-bdee-98402214eb51",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T15:51:58Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/02824b9c-bd1b-47f5-bdee-98402214eb51/publish` → **200**

```json
{
  "command_id": "0abb77e6-315e-42f9-8625-44c4e1f924c5",
  "expected_version": 0
}
```

```json
{
  "id": "02824b9c-bd1b-47f5-bdee-98402214eb51",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T15:51:58.841625Z",
  "published_at": "2026-10-29T15:51:58.841625Z",
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
  "device_ref": "sandbox-8219"
}
```

```json
{
  "challenge_id": "de027ff2-9d87-4b77-b342-113c7213d7ab",
  "expires_at": "2026-10-29T15:56:59.148839206Z",
  "resend_available_at": "2026-10-29T15:52:00.148839206Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "025967",
  "sent_at": "2026-10-29T15:51:59.151468954Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "de027ff2-9d87-4b77-b342-113c7213d7ab",
  "code": "025967",
  "device_ref": "sandbox-8219"
}
```

```json
{
  "session_id": "ea734d97-3499-4940-b0f6-50fc3cc5be1b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDAxOSwiaWF0IjoxNzkzMjg5MTE5LCJqdGkiOiIyYWFhMzMzYy02NzIyLTQ2NDctOGM4OC1kMDQ0MzgyZTM4YmUiLCJzaWQiOiJlYTczNGQ5Ny0zNDk5LTQ5NDAtYjBmNi01MGZjM2NjNWJlMWIifQ.zmaOer-T2sbg1Y-H6emvAeg6OAJJ2u6miR13c_LX-Eg",
  "access_expires_at": "2026-10-29T16:06:59.462651395Z",
  "refresh_token": "CTgwZnOgiOKV-4OeQX7eclH5htXtVz8Bxj4D4FXxj3c",
  "refresh_expires_at": "2026-11-28T15:51:59.462024131Z",
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
  "command_id": "6f08cf8b-f453-47c9-ab41-b38f2e44efe9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:52:00Z",
    "sequence": 1793289120295
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f9ca054b-9c0f-4404-be02-afc373564ff5",
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
  "last_heartbeat_at": "2026-10-29T15:52:00.047775Z",
  "last_location_at": "2026-10-29T15:52:00.047775Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676430447",
  "device_ref": "sandbox-7551"
}
```

```json
{
  "challenge_id": "4db1d13e-2a0b-4af8-8f7a-20a7007a34ec",
  "expires_at": "2026-10-29T15:57:00.342713517Z",
  "resend_available_at": "2026-10-29T15:52:01.342713517Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676430447` → **200**

```json
{
  "phone": "+380676430447",
  "audience": "CLIENT",
  "code": "404388",
  "sent_at": "2026-10-29T15:52:00.345470432Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4db1d13e-2a0b-4af8-8f7a-20a7007a34ec",
  "code": "404388",
  "device_ref": "sandbox-7551"
}
```

```json
{
  "session_id": "4cf9dc82-9ae6-4937-9c39-e983a821b52b",
  "subject": {
    "type": "CLIENT",
    "id": "22f0e3e0-2a62-4257-be51-d9815edf3e9a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMmYwZTNlMC0yYTYyLTQyNTctYmU1MS1kOTgxNWVkZjNlOWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMDIwLCJpYXQiOjE3OTMyODkxMjAsImp0aSI6IjY5MjNkY2JhLWNjNzEtNDQyNi05ZWE4LWU1NjdiMGZlYzNlMCIsInNpZCI6IjRjZjlkYzgyLTlhZTYtNDkzNy05YzM5LWU5ODNhODIxYjUyYiJ9.VPtl8wMiQIUZTjCybMg7Cf-bIXFdSI7KcQDQKLm62lU",
  "access_expires_at": "2026-10-29T16:07:00.647615532Z",
  "refresh_token": "W2dFDKAZWH4yRWOY0Zh2LPyr3pLj_PQ8HbxZfKAQwbk",
  "refresh_expires_at": "2026-11-28T15:52:00.647018094Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9625bf5a-5897-4af2-82f5-12ad70f33890",
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
  "id": "829c02b6-0ec9-4b88-96c7-7a665e20f919",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:57:00.947920Z",
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
  "command_id": "5ffc5a71-bb7f-4b39-b2d3-17d0371c0b65",
  "quote_id": "829c02b6-0ec9-4b88-96c7-7a665e20f919",
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
    "phone": "+380671268848"
  }
}
```

```json
{
  "id": "8be2a1b9-4d2a-4287-b2a0-376edf926a8c",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "22f0e3e0-2a62-4257-be51-d9815edf3e9a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:52:01.247154Z",
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
    "id": "5c01884f-f122-41be-968b-a8edba5b5ef4",
    "order_id": "8be2a1b9-4d2a-4287-b2a0-376edf926a8c",
    "expires_at": "2026-10-29T15:52:16.250647Z",
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

`POST /api/driver/v1/offers/5c01884f-f122-41be-968b-a8edba5b5ef4/accept` → **200**

```json
{
  "command_id": "192fd5db-f56b-496f-ad38-00f6dc7b514a"
}
```

```json
{
  "id": "5c910a2b-8257-4bb7-aae2-dd6d8b7a05ca",
  "order_id": "8be2a1b9-4d2a-4287-b2a0-376edf926a8c",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "84940ebd-fde4-4225-993b-23a3178b2e82",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "84940ebd-fde4-4225-993b-23a3178b2e82",
  "order_id": "8be2a1b9-4d2a-4287-b2a0-376edf926a8c",
  "assignment_id": "5c910a2b-8257-4bb7-aae2-dd6d8b7a05ca",
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
    "phone": "+380671268848"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e9ed257a-cfa5-43d7-a57e-fc0313c58b3f",
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
  "id": "33d1daba-a392-474b-ad04-50cb16f8b461",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:57:02.471686Z",
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
  "command_id": "604e64f2-2fa3-41d2-945b-257ad0a13e95",
  "quote_id": "33d1daba-a392-474b-ad04-50cb16f8b461",
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
  "id": "c51d2acc-1945-4a1e-b4dd-adf5037c3111",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "22f0e3e0-2a62-4257-be51-d9815edf3e9a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:02.772966Z",
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
  "command_id": "d5604b3b-a238-45ac-9e64-5eddefb153cc",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T18:52:03Z"
}
```

```json
{
  "id": "8034c7ac-3c42-4fae-8982-ac1ea6b1235e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:57:03.096480Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T18:52:03Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "dfe6f8f9-8c97-4a62-ab3e-80647836fac2",
  "quote_id": "8034c7ac-3c42-4fae-8982-ac1ea6b1235e",
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
  "pickup_at": "2026-10-29T18:52:03Z"
}
```

```json
{
  "id": "a927fb15-4294-472e-bfa2-4f35252a3858",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "22f0e3e0-2a62-4257-be51-d9815edf3e9a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T15:52:03.406362Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T18:52:03Z",
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
  "command_id": "ebd0af02-6ef9-4b6f-9df4-f0b9674662ab",
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
  "id": "e506ddb3-2daf-4c3d-b6d7-97454d5d9255",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:57:03.709635Z",
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
  "command_id": "25f68cc9-a10f-44d2-ab3c-18042594957d",
  "quote_id": "e506ddb3-2daf-4c3d-b6d7-97454d5d9255",
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
  "correlation_id": "a8542f92-c15c-415d-9119-efdb9557eba7"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "a927fb15-4294-472e-bfa2-4f35252a3858",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "22f0e3e0-2a62-4257-be51-d9815edf3e9a",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-29T15:52:03.406362Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T18:52:03Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "c51d2acc-1945-4a1e-b4dd-adf5037c3111",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "22f0e3e0-2a62-4257-be51-d9815edf3e9a",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-29T15:52:02.772966Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "8be2a1b9-4d2a-4287-b2a0-376edf926a8c",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "c51d2acc-1945-4a1e-b4dd-adf5037c3111",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "22f0e3e0-2a62-4257-be51-d9815edf3e9a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:02.772966Z",
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

`GET /api/rider/v1/orders/8be2a1b9-4d2a-4287-b2a0-376edf926a8c` → **200**

```json
{
  "id": "8be2a1b9-4d2a-4287-b2a0-376edf926a8c",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "22f0e3e0-2a62-4257-be51-d9815edf3e9a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "5c910a2b-8257-4bb7-aae2-dd6d8b7a05ca",
    "order_id": "8be2a1b9-4d2a-4287-b2a0-376edf926a8c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "84940ebd-fde4-4225-993b-23a3178b2e82",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T15:52:01.247154Z",
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
    "location_at": "2026-10-29T15:52:00.047775Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/8be2a1b9-4d2a-4287-b2a0-376edf926a8c/cancel` → **200**

```json
{
  "command_id": "16cd7787-6979-4160-a338-fdd5f9dfc6b7",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "8be2a1b9-4d2a-4287-b2a0-376edf926a8c",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "22f0e3e0-2a62-4257-be51-d9815edf3e9a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "5c910a2b-8257-4bb7-aae2-dd6d8b7a05ca",
    "order_id": "8be2a1b9-4d2a-4287-b2a0-376edf926a8c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "84940ebd-fde4-4225-993b-23a3178b2e82",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T15:52:01.247154Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати",
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

`GET /api/rider/v1/orders/c51d2acc-1945-4a1e-b4dd-adf5037c3111` → **200**

```json
{
  "id": "c51d2acc-1945-4a1e-b4dd-adf5037c3111",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "22f0e3e0-2a62-4257-be51-d9815edf3e9a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:02.772966Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c51d2acc-1945-4a1e-b4dd-adf5037c3111/cancel` → **200**

```json
{
  "command_id": "40336c37-6d89-4333-8dd3-79c8678696ac",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c51d2acc-1945-4a1e-b4dd-adf5037c3111",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "22f0e3e0-2a62-4257-be51-d9815edf3e9a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:52:02.772966Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати",
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

`GET /api/rider/v1/orders/a927fb15-4294-472e-bfa2-4f35252a3858` → **200**

```json
{
  "id": "a927fb15-4294-472e-bfa2-4f35252a3858",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "22f0e3e0-2a62-4257-be51-d9815edf3e9a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T15:52:03.406362Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T18:52:03Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a927fb15-4294-472e-bfa2-4f35252a3858/cancel` → **200**

```json
{
  "command_id": "3d77f484-02b8-4a70-8fc6-02ae9ccff476",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a927fb15-4294-472e-bfa2-4f35252a3858",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "22f0e3e0-2a62-4257-be51-d9815edf3e9a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T15:52:03.406362Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów"
    }
  },
  "pickup_at": "2026-10-29T18:52:03Z",
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
  "session_id": "f9ca054b-9c0f-4404-be02-afc373564ff5",
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
  "last_heartbeat_at": "2026-10-29T15:52:00.047775Z",
  "last_location_at": "2026-10-29T15:52:00.047775Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f9ca054b-9c0f-4404-be02-afc373564ff5/close` → **200**

```json
{
  "command_id": "cd796968-85e6-4aba-890a-334c04727b1b",
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

Done: orders 8be2a1b9-4d2a-4287-b2a0-376edf926a8c, c51d2acc-1945-4a1e-b4dd-adf5037c3111, a927fb15-4294-472e-bfa2-4f35252a3858.

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
  "session_id": "302f8a41-1949-4099-890f-6c3ab6c7926f",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwMjcsImlhdCI6MTc5MzI4OTEyNywianRpIjoiYTE0M2NmYzYtMGI2My00YzRkLTlhZjItYzllMWVmYjI2ZTdiIiwic2lkIjoiMzAyZjhhNDEtMTk0OS00MDk5LTg5MGYtNmMzYWI2Yzc5MjZmIn0.fzQXlUeaaPpGdOtr4_XCizpUvVcG3MRHDsvdpGaosJc",
  "access_expires_at": "2026-10-29T16:07:07.577541091Z",
  "refresh_token": "0dM3KB0YlUNUW26H5f-qT_uxQ27BrpvGYexXJ871qaY",
  "refresh_expires_at": "2026-10-30T03:52:07.576987796Z",
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
  "session_id": "f0ab559b-cda6-4f6b-aa7e-8c71d24ec5af",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwMjgsImlhdCI6MTc5MzI4OTEyOCwianRpIjoiYTIwNTQyYzItODdhYS00NzBjLWIxZGItMzNiNGQwZWVjNDMzIiwic2lkIjoiZjBhYjU1OWItY2RhNi00ZjZiLWFhN2UtOGM3MWQyNGVjNWFmIn0.lUb1dwPxXiHGe_ytauN_suzKsncGLqnvpMi9Bx-06LM",
  "access_expires_at": "2026-10-29T16:07:08.149200205Z",
  "refresh_token": "sB9k0uz6ROwIJMAXK9uq93GZUfrb076Q5p6UMkig6V8",
  "refresh_expires_at": "2026-10-30T03:52:08.148653381Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-14264"
}
```

```json
{
  "challenge_id": "f50ca646-41b6-4349-adc6-0aa1b26046a1",
  "expires_at": "2026-10-29T15:57:08.430047602Z",
  "resend_available_at": "2026-10-29T15:52:09.430047602Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "470569",
  "sent_at": "2026-10-29T15:52:08.432802297Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f50ca646-41b6-4349-adc6-0aa1b26046a1",
  "code": "470569",
  "device_ref": "sandbox-14264"
}
```

```json
{
  "session_id": "ba57eb2c-d39a-4752-8454-0f2cfb33de35",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDAyOCwiaWF0IjoxNzkzMjg5MTI4LCJqdGkiOiIwNWU0OTYzOC0zODc0LTRjMDQtOGJiYy0zYzlkMWVhODAwMDUiLCJzaWQiOiJiYTU3ZWIyYy1kMzlhLTQ3NTItODQ1NC0wZjJjZmIzM2RlMzUifQ.YWvhpUHkaZGA9pQ9SO2l6YWZBEjphc4V4vLOydR6Of0",
  "access_expires_at": "2026-10-29T16:07:08.737020975Z",
  "refresh_token": "p0GBJpOnLAxRMTIAxtTh-mZv1kaRrXf3LBKqfMv53hw",
  "refresh_expires_at": "2026-11-28T15:52:08.736445057Z",
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
  "command_id": "208d71cb-d95f-4c0c-955a-70fe1d5a9b01",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:52:09Z",
    "sequence": 1793289129300
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a5fd1e92-3da7-4917-880d-2c31a25786c3",
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
  "last_heartbeat_at": "2026-10-29T15:52:09.317828Z",
  "last_location_at": "2026-10-29T15:52:09.317828Z",
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
  "command_id": "0a0fbbf0-8c46-4c56-a473-dc2bd5d243b3",
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
  "effective_at": "2026-10-29T15:52:09.883875Z",
  "changed_by": "84015309-667b-408e-9731-2b3c5e734ac0",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "84015309-667b-408e-9731-2b3c5e734ac0",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T15:49:29.72686Z",
  "last_entries": [
    {
      "order_id": "02c3a07c-5b6b-4a1c-8541-4d3498495694",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T15:49:29.72686Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "b2acc5e1-8d08-4b38-a45c-263bca19ecdc",
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
  "id": "0afb7efe-4dd1-4f64-92a9-106c89037e3b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:57:10.464647Z",
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
  "command_id": "1bf1ffac-0418-4265-bce9-63dcc95992fd",
  "quote_id": "0afb7efe-4dd1-4f64-92a9-106c89037e3b",
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
    "phone": "+3806711114272"
  }
}
```

```json
{
  "id": "a693d92d-9df1-4d88-92aa-8190f0d95628",
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
  "created_at": "2026-10-29T15:52:10.764835Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114272"
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
    "id": "3f488998-e94a-47d7-bd35-a48b3fa43dbf",
    "order_id": "a693d92d-9df1-4d88-92aa-8190f0d95628",
    "expires_at": "2026-10-29T15:52:25.768802Z",
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

`POST /api/driver/v1/offers/3f488998-e94a-47d7-bd35-a48b3fa43dbf/accept` → **200**

```json
{
  "command_id": "30016613-9733-4696-87d6-8e4a097521b2"
}
```

```json
{
  "id": "a637ced3-0fc6-40fe-9c1b-d87e49885093",
  "order_id": "a693d92d-9df1-4d88-92aa-8190f0d95628",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ea3ee124-48c2-4ddc-b288-80387ff5874c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ea3ee124-48c2-4ddc-b288-80387ff5874c",
  "order_id": "a693d92d-9df1-4d88-92aa-8190f0d95628",
  "assignment_id": "a637ced3-0fc6-40fe-9c1b-d87e49885093",
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
    "phone": "+3806711114272"
  }
}
```

`POST /api/driver/v1/work-sessions/a5fd1e92-3da7-4917-880d-2c31a25786c3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:52:11Z",
    "sequence": 1793289131958
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a5fd1e92-3da7-4917-880d-2c31a25786c3",
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
  "last_heartbeat_at": "2026-10-29T15:52:11.97701Z",
  "last_location_at": "2026-10-29T15:52:11.97701Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ea3ee124-48c2-4ddc-b288-80387ff5874c/arrive` → **200**

```json
{
  "command_id": "fa94c16a-8aa5-4c77-9547-a208bc1c6c3a",
  "expected_version": 0
}
```

```json
{
  "id": "ea3ee124-48c2-4ddc-b288-80387ff5874c",
  "order_id": "a693d92d-9df1-4d88-92aa-8190f0d95628",
  "assignment_id": "a637ced3-0fc6-40fe-9c1b-d87e49885093",
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
  "arrived_at": "2026-10-29T15:52:12.271533Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711114272"
  }
}
```

`POST /api/driver/v1/trips/ea3ee124-48c2-4ddc-b288-80387ff5874c/start` → **200**

```json
{
  "command_id": "80957438-8360-43f5-b9c5-fed3366a280b",
  "expected_version": 1
}
```

```json
{
  "id": "ea3ee124-48c2-4ddc-b288-80387ff5874c",
  "order_id": "a693d92d-9df1-4d88-92aa-8190f0d95628",
  "assignment_id": "a637ced3-0fc6-40fe-9c1b-d87e49885093",
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
  "arrived_at": "2026-10-29T15:52:12.271533Z",
  "started_at": "2026-10-29T15:52:12.579163Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711114272"
  }
}
```

`POST /api/driver/v1/trips/ea3ee124-48c2-4ddc-b288-80387ff5874c/complete` → **200**

```json
{
  "command_id": "e8912e5b-2546-46c0-8444-98fd2e44201a",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:52:12Z",
  "cash_received": true
}
```

```json
{
  "id": "ea3ee124-48c2-4ddc-b288-80387ff5874c",
  "order_id": "a693d92d-9df1-4d88-92aa-8190f0d95628",
  "assignment_id": "a637ced3-0fc6-40fe-9c1b-d87e49885093",
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
  "arrived_at": "2026-10-29T15:52:12.271533Z",
  "started_at": "2026-10-29T15:52:12.579163Z",
  "completed_at": "2026-10-29T15:52:12.887792Z",
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
  "command_id": "b7e355be-087c-4cb4-82f4-e68cba7cff34",
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
  "id": "3ca51344-bfb2-44ea-a78d-e7fe7fbc3021",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:57:13.188895Z",
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
  "command_id": "1eabe944-11d3-403b-99c3-3f173f8be031",
  "quote_id": "3ca51344-bfb2-44ea-a78d-e7fe7fbc3021",
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
    "phone": "+380671118674"
  }
}
```

```json
{
  "id": "0d184813-d928-4a52-9f2e-f7a52bde5d8f",
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
  "created_at": "2026-10-29T15:52:13.502037Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118674"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/0d184813-d928-4a52-9f2e-f7a52bde5d8f` → **200**

```json
{
  "id": "0d184813-d928-4a52-9f2e-f7a52bde5d8f",
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
  "created_at": "2026-10-29T15:52:13.502037Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118674"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/0d184813-d928-4a52-9f2e-f7a52bde5d8f/cancel` → **200**

```json
{
  "command_id": "8a2259f6-d66c-498e-a002-74f25bc0ec46",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "0d184813-d928-4a52-9f2e-f7a52bde5d8f",
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
  "created_at": "2026-10-29T15:52:13.502037Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118674"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "ru": "Ошибка оператора",
      "en": "Operator error",
      "uk": "Помилка оператора",
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
  "staff_id": "84015309-667b-408e-9731-2b3c5e734ac0",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-29T15:49:29.72686Z",
  "last_entries": [
    {
      "order_id": "0d184813-d928-4a52-9f2e-f7a52bde5d8f",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-29T15:52:14.128655Z"
    },
    {
      "order_id": "a693d92d-9df1-4d88-92aa-8190f0d95628",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-29T15:52:12.892633Z"
    },
    {
      "order_id": "02c3a07c-5b6b-4a1c-8541-4d3498495694",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T15:49:29.72686Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a5fd1e92-3da7-4917-880d-2c31a25786c3",
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
  "last_heartbeat_at": "2026-10-29T15:52:11.97701Z",
  "last_location_at": "2026-10-29T15:52:11.97701Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a5fd1e92-3da7-4917-880d-2c31a25786c3/close` → **200**

```json
{
  "command_id": "a6648add-2e47-4ce8-a7ab-63580aabc6b4",
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

Done: operator bonus for fulfilled a693d92d-9df1-4d88-92aa-8190f0d95628 and operator-fault cancellation 0d184813-d928-4a52-9f2e-f7a52bde5d8f.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674118702",
  "device_ref": "sandbox-30697"
}
```

```json
{
  "challenge_id": "37bb54f2-5935-4581-9ae3-cc3734ccc951",
  "expires_at": "2026-10-29T15:57:18.568212083Z",
  "resend_available_at": "2026-10-29T15:52:19.568212083Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674118702` → **200**

```json
{
  "phone": "+380674118702",
  "audience": "CLIENT",
  "code": "646617",
  "sent_at": "2026-10-29T15:52:18.570795828Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672326317",
  "device_ref": "sandbox-7579",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "6b74f8cb-b0b9-472c-ab1c-a165506c816d",
  "expires_at": "2026-10-29T15:57:20.074331269Z",
  "resend_available_at": "2026-10-29T15:52:21.074331269Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672326317` → **200**

```json
{
  "phone": "+380672326317",
  "audience": "CLIENT",
  "code": "494350",
  "sent_at": "2026-10-29T15:52:20.076652818Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672326317",
  "device_ref": "sandbox-32423",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "66e69768-972b-4c3c-9f6e-6f440748f687",
  "expires_at": "2026-10-29T15:57:21.594316449Z",
  "resend_available_at": "2026-10-29T15:52:22.594316449Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380672326317` → **200**

```json
{
  "phone": "+380672326317",
  "audience": "CLIENT",
  "code": "079755",
  "sent_at": "2026-10-29T15:52:21.597084261Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677250000",
  "device_ref": "sandbox-21488"
}
```

```json
{
  "challenge_id": "7d65f052-ec4c-41cd-8c9d-7e45a9c72ee8",
  "expires_at": "2026-10-29T15:57:23.115458253Z",
  "resend_available_at": "2026-10-29T15:52:24.115458253Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677250000",
  "device_ref": "sandbox-8162"
}
```

```json
{
  "challenge_id": "847dacc1-0a00-459e-bda6-7a6288278cf8",
  "expires_at": "2026-10-29T15:57:24.597378514Z",
  "resend_available_at": "2026-10-29T15:52:25.597378514Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677250000` → **200**

```json
{
  "phone": "+380677250000",
  "audience": "CLIENT",
  "code": "959446",
  "sent_at": "2026-10-29T15:52:24.600260937Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677250000",
  "device_ref": "sandbox-21593",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "c1f80a96-f2b2-404e-9f77-62cc9d93c662",
  "expires_at": "2026-10-29T15:57:26.115985371Z",
  "resend_available_at": "2026-10-29T15:52:27.115985371Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677250000` → **200**

```json
{
  "phone": "+380677250000",
  "audience": "CLIENT",
  "code": "803741",
  "sent_at": "2026-10-29T15:52:26.118607977Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380677250000",
  "device_ref": "sandbox-26299",
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
  "correlation_id": "77d46ab3-7f3e-4f7f-826b-ee0baa3dd425",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000021275"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "b3653694-fb3e-4f90-a17d-c252325e8630"
}
```

`GET /sandbox/v1/otp?phone=%2B442000021275` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120026248"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "ea622e52-341c-428d-bf3c-404b734f2f0d"
}
```

`GET /sandbox/v1/otp?phone=%2B37120026248` → **404**

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
  "session_id": "16daedf1-beb1-432f-9c89-edb0c9cb5d42",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwNDgsImlhdCI6MTc5MzI4OTE0OCwianRpIjoiZWExM2VjZmEtNWMxMi00ODdhLWFjYzgtNTllMjEwOWZlNjk3Iiwic2lkIjoiMTZkYWVkZjEtYmViMS00MzJmLTljODktZWRiMGM5Y2I1ZDQyIn0.MFoome3fZvV0932vVE8PL2_VZt72kzRfac_-WN9MPKY",
  "access_expires_at": "2026-10-29T16:07:28.862629281Z",
  "refresh_token": "fbE8IlB-sWndlUx-fVyOCrL75SQCghPdCXQiOyfk6Ko",
  "refresh_expires_at": "2026-10-30T03:52:28.862088599Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677250000` → **200**

```json
{
  "deliveries": [
    {
      "id": "598958f3-01f6-4f78-9634-887db4e1d957",
      "challenge_id": "c1f80a96-f2b2-404e-9f77-62cc9d93c662",
      "phone": "+380677250000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-0164187d-33c7-4735-84dc-210df8a60102",
      "error": null,
      "attempted_at": "2026-10-29T15:52:26.118874Z"
    },
    {
      "id": "4799b30d-b239-4334-beea-6e43cfbe5a72",
      "challenge_id": "847dacc1-0a00-459e-bda6-7a6288278cf8",
      "phone": "+380677250000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-d22c1188-0c7e-4d50-9abc-3299c50e2d3b",
      "error": null,
      "attempted_at": "2026-10-29T15:52:24.600522Z"
    },
    {
      "id": "1ae499f2-0e54-4f56-a59a-a6397ebfa53c",
      "challenge_id": "7d65f052-ec4c-41cd-8c9d-7e45a9c72ee8",
      "phone": "+380677250000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-29T15:52:23.117896Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380677250000` → **200**

```json
{
  "phone": "+380677250000",
  "audience": "CLIENT",
  "code": "803741",
  "sent_at": "2026-10-29T15:52:26.118607977Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380672326317` → **200**

```json
{
  "deliveries": [
    {
      "id": "fac63add-7468-4ce2-97d6-8a080ddb7e9a",
      "challenge_id": "66e69768-972b-4c3c-9f6e-6f440748f687",
      "phone": "+380672326317",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-bb1be711-ec27-40b1-a273-c53fc88da54f",
      "error": null,
      "attempted_at": "2026-10-29T15:52:21.597344Z"
    },
    {
      "id": "eae756b7-4dec-4729-8254-f31bb8f74b24",
      "challenge_id": "6b74f8cb-b0b9-472c-ab1c-a165506c816d",
      "phone": "+380672326317",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-348dc67d-6b47-41c4-8dc2-eb077c3ce368",
      "error": null,
      "attempted_at": "2026-10-29T15:52:20.076911Z"
    }
  ]
}
```

Done: SMS to +380674118702; SMS then a call to +380672326317; a failed SMS, two calls and a refused third to +380677250000; +44 and +371 refused.

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
  "session_id": "81266523-462f-41be-a56b-8de35c57f19f",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwNTAsImlhdCI6MTc5MzI4OTE1MCwianRpIjoiMDkzMWIzMTMtNTJlZC00MGNlLTg5ZjgtMmU4NmM1Y2U3ODZlIiwic2lkIjoiODEyNjY1MjMtNDYyZi00MWJlLWE1NmItOGRlMzVjNTdmMTlmIn0.CsNtmIwA5yods8tOtZBlqPBWLEXVgnWLEwDzDNKXk-0",
  "access_expires_at": "2026-10-29T16:07:30.071228788Z",
  "refresh_token": "izbwnBzXJe2kwz7M_aO95RDFJauQcLILD4rcYEshmSk",
  "refresh_expires_at": "2026-10-30T03:52:30.070305802Z",
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
  "session_id": "dfb342c4-12a9-43c8-8cd7-aa82bcb3d6fc",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwNTAsImlhdCI6MTc5MzI4OTE1MCwianRpIjoiNGU4NjZhZGEtYjIwZi00OTQ4LWI3MGMtMzVhOWFkODc0MzE0Iiwic2lkIjoiZGZiMzQyYzQtMTJhOS00M2M4LThjZDctYWE4MmJjYjNkNmZjIn0.q9Ukvgv8IwI1n73EWKkhrWw2lI98kQG6p3CiR4uxtcQ",
  "access_expires_at": "2026-10-29T16:07:30.645241626Z",
  "refresh_token": "8QUs2d-WxDi8H9zz29gtstlvj2V-U-4aKfkvRShttIU",
  "refresh_expires_at": "2026-10-30T03:52:30.644686316Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "84015309-667b-408e-9731-2b3c5e734ac0",
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

`POST /api/admin/v1/staff-extensions/84015309-667b-408e-9731-2b3c5e734ac0` → **200**

```json
{
  "command_id": "8ad92752-a2b3-4c52-b180-6d884db294f4",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "84015309-667b-408e-9731-2b3c5e734ac0",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "9215aefe-e1f0-4c73-97d1-f28dab0cdb10",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T15:52:31.834682Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T15:52:31.834682Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "df093b62-d133-49e3-b929-ad58599c9aa1",
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
  "id": "662429be-a088-4145-a055-1a46ad4ad139",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:57:32.421213Z",
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
  "command_id": "637285b6-628f-45ce-a2f9-45c00a80eabf",
  "quote_id": "662429be-a088-4145-a055-1a46ad4ad139",
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
    "phone": "+380673541854"
  }
}
```

```json
{
  "id": "80aa4f78-6239-4496-a9e9-7455521f8c85",
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
  "created_at": "2026-10-29T15:52:32.717777Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673541854"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/80aa4f78-6239-4496-a9e9-7455521f8c85/calls` → **201**

```json
{
  "command_id": "3e7571b7-9124-4634-b369-922d9ef3fbba",
  "to": "CALLER"
}
```

```json
{
  "id": "aa14e83d-43ee-403b-942c-41cb323f0b2e",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "84015309-667b-408e-9731-2b3c5e734ac0",
  "order_ids": [
    "80aa4f78-6239-4496-a9e9-7455521f8c85"
  ],
  "started_at": "2026-10-29T15:52:33.056436Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/80aa4f78-6239-4496-a9e9-7455521f8c85/calls` → **201**

```json
{
  "command_id": "3e7571b7-9124-4634-b369-922d9ef3fbba",
  "to": "CALLER"
}
```

```json
{
  "id": "aa14e83d-43ee-403b-942c-41cb323f0b2e",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "84015309-667b-408e-9731-2b3c5e734ac0",
  "order_ids": [
    "80aa4f78-6239-4496-a9e9-7455521f8c85"
  ],
  "started_at": "2026-10-29T15:52:33.056436Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "aa14e83d-43ee-403b-942c-41cb323f0b2e",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380673541854",
    "at": "2026-10-29T15:52:33.059020744Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "aa14e83d-43ee-403b-942c-41cb323f0b2e",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.20311",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "aa14e83d-43ee-403b-942c-41cb323f0b2e"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "aa14e83d-43ee-403b-942c-41cb323f0b2e",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=80aa4f78-6239-4496-a9e9-7455521f8c85` → **200**

```json
{
  "calls": [
    {
      "id": "aa14e83d-43ee-403b-942c-41cb323f0b2e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "84015309-667b-408e-9731-2b3c5e734ac0",
      "order_ids": [
        "80aa4f78-6239-4496-a9e9-7455521f8c85"
      ],
      "started_at": "2026-10-29T15:52:33.056436Z",
      "answered_at": "2026-10-29T15:52:33.733783Z",
      "ended_at": "2026-10-29T15:52:33.755391Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=80aa4f78-6239-4496-a9e9-7455521f8c85` → **200**

```json
{
  "calls": [
    {
      "id": "aa14e83d-43ee-403b-942c-41cb323f0b2e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "84015309-667b-408e-9731-2b3c5e734ac0",
      "order_ids": [
        "80aa4f78-6239-4496-a9e9-7455521f8c85"
      ],
      "started_at": "2026-10-29T15:52:33.056436Z",
      "answered_at": "2026-10-29T15:52:33.733783Z",
      "ended_at": "2026-10-29T15:52:33.755391Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=80aa4f78-6239-4496-a9e9-7455521f8c85` → **200**

```json
{
  "calls": [
    {
      "id": "aa14e83d-43ee-403b-942c-41cb323f0b2e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "84015309-667b-408e-9731-2b3c5e734ac0",
      "order_ids": [
        "80aa4f78-6239-4496-a9e9-7455521f8c85"
      ],
      "started_at": "2026-10-29T15:52:33.056436Z",
      "answered_at": "2026-10-29T15:52:33.733783Z",
      "ended_at": "2026-10-29T15:52:33.755391Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=80aa4f78-6239-4496-a9e9-7455521f8c85` → **200**

```json
{
  "calls": [
    {
      "id": "aa14e83d-43ee-403b-942c-41cb323f0b2e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "84015309-667b-408e-9731-2b3c5e734ac0",
      "order_ids": [
        "80aa4f78-6239-4496-a9e9-7455521f8c85"
      ],
      "started_at": "2026-10-29T15:52:33.056436Z",
      "answered_at": "2026-10-29T15:52:33.733783Z",
      "ended_at": "2026-10-29T15:52:33.755391Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=80aa4f78-6239-4496-a9e9-7455521f8c85` → **200**

```json
{
  "calls": [
    {
      "id": "aa14e83d-43ee-403b-942c-41cb323f0b2e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "84015309-667b-408e-9731-2b3c5e734ac0",
      "order_ids": [
        "80aa4f78-6239-4496-a9e9-7455521f8c85"
      ],
      "started_at": "2026-10-29T15:52:33.056436Z",
      "answered_at": "2026-10-29T15:52:33.733783Z",
      "ended_at": "2026-10-29T15:52:33.755391Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T15:52:41.603383Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/80aa4f78-6239-4496-a9e9-7455521f8c85` → **200**

```json
{
  "id": "80aa4f78-6239-4496-a9e9-7455521f8c85",
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
  "created_at": "2026-10-29T15:52:32.717777Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673541854"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/80aa4f78-6239-4496-a9e9-7455521f8c85/cancel` → **200**

```json
{
  "command_id": "ee97f731-fc9c-4fb6-a04b-edd8ce1e2aee",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "80aa4f78-6239-4496-a9e9-7455521f8c85",
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
  "created_at": "2026-10-29T15:52:32.717777Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673541854"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто",
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
  "command_id": "3258550c-244f-4d97-851a-3a3077ff3199",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-29T15:52:43.916979Z",
  "extension": "101"
}
```

Done: outgoing call aa14e83d-43ee-403b-942c-41cb323f0b2e from order 80aa4f78-6239-4496-a9e9-7455521f8c85, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636297579",
  "device_ref": "sandbox-10435"
}
```

```json
{
  "challenge_id": "58672208-eb47-42da-874c-b836622f56c2",
  "expires_at": "2026-10-29T15:57:44.211317919Z",
  "resend_available_at": "2026-10-29T15:52:45.211317919Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636297579` → **200**

```json
{
  "phone": "+380636297579",
  "audience": "CLIENT",
  "code": "359308",
  "sent_at": "2026-10-29T15:52:44.213983835Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "58672208-eb47-42da-874c-b836622f56c2",
  "code": "359308",
  "device_ref": "sandbox-10435"
}
```

```json
{
  "session_id": "ca099282-58a2-4d95-a078-6b88176ab938",
  "subject": {
    "type": "CLIENT",
    "id": "c22dc737-3b1e-4397-98cb-04bb4e0ccb5d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMjJkYzczNy0zYjFlLTQzOTctOThjYi0wNGJiNGUwY2NiNWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMDY0LCJpYXQiOjE3OTMyODkxNjQsImp0aSI6ImI3ODU3MTMzLThlNjAtNDlkYS05OWNiLTk3MTNiNGRhNWYyZSIsInNpZCI6ImNhMDk5MjgyLTU4YTItNGQ5NS1hMDc4LTZiODgxNzZhYjkzOCJ9.C1-_4W4yiz8VGzNWsuIVec7BMkBN16bL40E2j84tsrc",
  "access_expires_at": "2026-10-29T16:07:44.530187683Z",
  "refresh_token": "OHuoTWU5IWv0NRzaq4mO1tclRF8MyUfvUGo0wXy0kZE",
  "refresh_expires_at": "2026-11-28T15:52:44.529680534Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c22dc737-3b1e-4397-98cb-04bb4e0ccb5d",
  "session_id": "ca099282-58a2-4d95-a078-6b88176ab938",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636297579",
  "device_ref": "sandbox-23826"
}
```

```json
{
  "challenge_id": "535da3b3-bf48-4ec3-ac33-1bb2e5bbed55",
  "expires_at": "2026-10-29T15:57:47.107288311Z",
  "resend_available_at": "2026-10-29T15:52:48.107288311Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636297579` → **200**

```json
{
  "phone": "+380636297579",
  "audience": "CLIENT",
  "code": "545220",
  "sent_at": "2026-10-29T15:52:47.110300619Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "535da3b3-bf48-4ec3-ac33-1bb2e5bbed55",
  "code": "545220",
  "device_ref": "sandbox-23826"
}
```

```json
{
  "session_id": "e5a1d813-98ab-4b83-8cdd-939b91ae81f9",
  "subject": {
    "type": "CLIENT",
    "id": "c22dc737-3b1e-4397-98cb-04bb4e0ccb5d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMjJkYzczNy0zYjFlLTQzOTctOThjYi0wNGJiNGUwY2NiNWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMDY3LCJpYXQiOjE3OTMyODkxNjcsImp0aSI6ImQ2ZTI2YjI4LWEyOWUtNDk0NS05MmNhLTRmNzIwNGMyYzlmZSIsInNpZCI6ImU1YTFkODEzLTk4YWItNGI4My04Y2RkLTkzOWI5MWFlODFmOSJ9.tMS7vYOq9jEgrjr-KMJu5pg9TwjIEhvJtsOfgAi3uOQ",
  "access_expires_at": "2026-10-29T16:07:47.446403907Z",
  "refresh_token": "jidx0L4Ojkz6Zd1c2XvBQaAceC-QS1iB3PyAWpJd84Y",
  "refresh_expires_at": "2026-11-28T15:52:47.445889795Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "9d4ab3a4-5201-4f7c-8601-0994b2be77f7",
  "expires_at": "2026-10-29T15:57:49.737454418Z",
  "resend_available_at": "2026-10-29T15:52:50.737454418Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636297579` → **200**

```json
{
  "phone": "+380636297579",
  "audience": "CLIENT",
  "code": "089646",
  "sent_at": "2026-10-29T15:52:49.740251823Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380632569241"
}
```

```json
{
  "challenge_id": "0dd6c0fe-8550-440d-aa10-c5dac10bff9e",
  "expires_at": "2026-10-29T15:57:50.048674957Z",
  "resend_available_at": "2026-10-29T15:52:51.048674957Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632569241` → **200**

```json
{
  "phone": "+380632569241",
  "audience": "CLIENT",
  "code": "576805",
  "sent_at": "2026-10-29T15:52:50.051212694Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "09328db9-fd85-4953-b710-f5acb4da9941",
  "current_challenge_id": "9d4ab3a4-5201-4f7c-8601-0994b2be77f7",
  "current_code": "000000",
  "new_challenge_id": "0dd6c0fe-8550-440d-aa10-c5dac10bff9e",
  "new_code": "576805"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "f2bf074b-b37b-4e49-a5fe-91bd444d8b86"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "e9c229e8-c9af-4777-a2b4-48f52ebb168b",
  "current_challenge_id": "9d4ab3a4-5201-4f7c-8601-0994b2be77f7",
  "current_code": "089646",
  "new_challenge_id": "0dd6c0fe-8550-440d-aa10-c5dac10bff9e",
  "new_code": "576805"
}
```

```json
{
  "subject_id": "c22dc737-3b1e-4397-98cb-04bb4e0ccb5d",
  "phone": "+380632569241",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c22dc737-3b1e-4397-98cb-04bb4e0ccb5d",
  "session_id": "ca099282-58a2-4d95-a078-6b88176ab938",
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
  "correlation_id": "cc7a5330-450a-4cd7-8323-c00db61be65f"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632569241",
  "device_ref": "sandbox-17543"
}
```

```json
{
  "challenge_id": "f8440794-c365-4a7d-a3aa-200410286a3b",
  "expires_at": "2026-10-29T15:57:53.531501075Z",
  "resend_available_at": "2026-10-29T15:52:54.531501075Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632569241` → **200**

```json
{
  "phone": "+380632569241",
  "audience": "CLIENT",
  "code": "474738",
  "sent_at": "2026-10-29T15:52:53.534277882Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f8440794-c365-4a7d-a3aa-200410286a3b",
  "code": "474738",
  "device_ref": "sandbox-17543"
}
```

```json
{
  "session_id": "cd0ed9a7-d8fc-4dc5-89ea-bddfc6b2c92b",
  "subject": {
    "type": "CLIENT",
    "id": "c22dc737-3b1e-4397-98cb-04bb4e0ccb5d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMjJkYzczNy0zYjFlLTQzOTctOThjYi0wNGJiNGUwY2NiNWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMDczLCJpYXQiOjE3OTMyODkxNzMsImp0aSI6ImUxYWYxN2YzLWQ3ODUtNDU3Yi04Mzg2LWM0M2RmOTg0MWJkMyIsInNpZCI6ImNkMGVkOWE3LWQ4ZmMtNGRjNS04OWVhLWJkZGZjNmIyYzkyYiJ9.VH4yKBX1goGsV4jXOvu9VWGMZuxBlfMPFnQyhP041ow",
  "access_expires_at": "2026-10-29T16:07:53.848628199Z",
  "refresh_token": "4xfNgp9SzmJCAo1zuZnHFR08QPBXXcjqd14q4M8bN60",
  "refresh_expires_at": "2026-11-28T15:52:53.84805187Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c22dc737-3b1e-4397-98cb-04bb4e0ccb5d",
  "session_id": "cd0ed9a7-d8fc-4dc5-89ea-bddfc6b2c92b",
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
  "session_id": "4b0c9273-0bb8-4f49-a0a2-1df496d14bb6",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwNzQsImlhdCI6MTc5MzI4OTE3NCwianRpIjoiY2RlNmFjNjAtMjRmMi00NjNhLWEyOWMtZDNjZDE1MDFiODkxIiwic2lkIjoiNGIwYzkyNzMtMGJiOC00ZjQ5LWEwYTItMWRmNDk2ZDE0YmI2In0.VXs9BT-VN_yVnNUwkzZiO6nU9okZverRj-Mbqgs97GM",
  "access_expires_at": "2026-10-29T16:07:54.721273226Z",
  "refresh_token": "IHx8nYziCXKt_uc4Y9lMbCDvO78R5OgKVVOIx80yWSM",
  "refresh_expires_at": "2026-10-30T03:52:54.720734308Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/c22dc737-3b1e-4397-98cb-04bb4e0ccb5d` → **200**

```json
{
  "client": {
    "id": "c22dc737-3b1e-4397-98cb-04bb4e0ccb5d",
    "phone": "+380632569241",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T15:52:44.528124Z",
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

`POST /api/admin/v1/clients/c22dc737-3b1e-4397-98cb-04bb4e0ccb5d/phone/new-code` → **201**

```json
{
  "phone": "+380638206107"
}
```

```json
{
  "challenge_id": "0ea8467b-5742-4670-8832-23d0d1aa26ce",
  "expires_at": "2026-10-29T15:57:55.344480753Z",
  "resend_available_at": "2026-10-29T15:52:56.344480753Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638206107` → **200**

```json
{
  "phone": "+380638206107",
  "audience": "CLIENT",
  "code": "616589",
  "sent_at": "2026-10-29T15:52:55.346846621Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/c22dc737-3b1e-4397-98cb-04bb4e0ccb5d/phone` → **422**

```json
{
  "command_id": "feaff353-c958-46ab-8475-c23e979f0c62",
  "expected_version": 3,
  "new_challenge_id": "0ea8467b-5742-4670-8832-23d0d1aa26ce",
  "new_code": "616590",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/c22dc737-3b1e-4397-98cb-04bb4e0ccb5d/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "5b15f2d6-5184-4fb8-b8ba-021e3422d682"
}
```

`POST /api/admin/v1/clients/c22dc737-3b1e-4397-98cb-04bb4e0ccb5d/phone` → **400**

```json
{
  "command_id": "fd08a377-322b-4da8-9bdf-5a73f47471c4",
  "expected_version": 3,
  "new_challenge_id": "0ea8467b-5742-4670-8832-23d0d1aa26ce",
  "new_code": "616589",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/c22dc737-3b1e-4397-98cb-04bb4e0ccb5d/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "afdcdc1c-f6cf-49e2-8a9a-c70d2e974cac",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/c22dc737-3b1e-4397-98cb-04bb4e0ccb5d/phone` → **200**

```json
{
  "command_id": "aade3c9e-24bb-4c14-876e-a81885d91681",
  "expected_version": 3,
  "new_challenge_id": "0ea8467b-5742-4670-8832-23d0d1aa26ce",
  "new_code": "616589",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "c22dc737-3b1e-4397-98cb-04bb4e0ccb5d",
  "phone": "+380638206107",
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
  "correlation_id": "c16ca120-ce06-4733-8c28-ae5aca6e76e9"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638206107",
  "device_ref": "sandbox-913"
}
```

```json
{
  "challenge_id": "51fa2933-0c06-4df4-ab9e-496612cd6821",
  "expires_at": "2026-10-29T15:57:56.86568867Z",
  "resend_available_at": "2026-10-29T15:52:57.86568867Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638206107` → **200**

```json
{
  "phone": "+380638206107",
  "audience": "CLIENT",
  "code": "570790",
  "sent_at": "2026-10-29T15:52:56.868222931Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "51fa2933-0c06-4df4-ab9e-496612cd6821",
  "code": "570790",
  "device_ref": "sandbox-913"
}
```

```json
{
  "session_id": "834fa7e1-a391-476d-8673-cfb5dbcfa430",
  "subject": {
    "type": "CLIENT",
    "id": "c22dc737-3b1e-4397-98cb-04bb4e0ccb5d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMjJkYzczNy0zYjFlLTQzOTctOThjYi0wNGJiNGUwY2NiNWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMDc3LCJpYXQiOjE3OTMyODkxNzcsImp0aSI6ImZjZWM1MjVhLTg2ZTYtNDYwYy1hYTM0LWMzZTIyZmMwMmE4MiIsInNpZCI6IjgzNGZhN2UxLWEzOTEtNDc2ZC04NjczLWNmYjVkYmNmYTQzMCJ9.Yaoc0mTITc1HGivdGC1YchQlmiSBItlmuWYwx25tGA0",
  "access_expires_at": "2026-10-29T16:07:57.194903253Z",
  "refresh_token": "aVNxtdJw3Sn4Xtnurw5ZwWIb8lllIQWFNWzvw411aIE",
  "refresh_expires_at": "2026-11-28T15:52:57.194350378Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c22dc737-3b1e-4397-98cb-04bb4e0ccb5d",
  "session_id": "834fa7e1-a391-476d-8673-cfb5dbcfa430",
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
  "phone": "+380631813177",
  "device_ref": "sandbox-22241"
}
```

```json
{
  "challenge_id": "6ed98390-395f-41c8-97fc-e07342d42624",
  "expires_at": "2026-10-29T15:57:57.804007023Z",
  "resend_available_at": "2026-10-29T15:52:58.804007023Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631813177` → **200**

```json
{
  "phone": "+380631813177",
  "audience": "CLIENT",
  "code": "470545",
  "sent_at": "2026-10-29T15:52:57.807651033Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6ed98390-395f-41c8-97fc-e07342d42624",
  "code": "470545",
  "device_ref": "sandbox-22241"
}
```

```json
{
  "session_id": "0a505c91-ff44-4f45-93e4-61d957d66a0d",
  "subject": {
    "type": "CLIENT",
    "id": "956435b7-570a-4546-bc1e-af222e4ae93b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NTY0MzViNy01NzBhLTQ1NDYtYmMxZS1hZjIyMmU0YWU5M2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMDc4LCJpYXQiOjE3OTMyODkxNzgsImp0aSI6Ijc2ZTQ2ZWRmLTg1ODktNDU5OC05MjBhLWI2YzBiYjhiYTU3NSIsInNpZCI6IjBhNTA1YzkxLWZmNDQtNGY0NS05M2U0LTYxZDk1N2Q2NmEwZCJ9.f2GaxqkN5y5EnmHjKKXs6C6yD2RSYLVGDW3DtEGD81s",
  "access_expires_at": "2026-10-29T16:07:58.134007167Z",
  "refresh_token": "QtXBUKWFKt-fdbTNbMBnUWCziGaoeXicrOgTxOvhnls",
  "refresh_expires_at": "2026-11-28T15:52:58.133115007Z",
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
  "session_id": "15bc5d3b-7b1b-4900-bb32-feebc9032cc6",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwNzksImlhdCI6MTc5MzI4OTE3OSwianRpIjoiNDBmZjg0ZDctODAzNC00ODZkLTk5MWMtODEyNGU1YTc2ZjczIiwic2lkIjoiMTViYzVkM2ItN2IxYi00OTAwLWJiMzItZmVlYmM5MDMyY2M2In0.vGSmGWz88Y6JpxV43RVIlkdoc1uSsLqeDJrCmMGmRH8",
  "access_expires_at": "2026-10-29T16:07:59.333506802Z",
  "refresh_token": "zAiD5x08MKtYWDsovKmbPyAOSRnEj9NeNQgr5OJMBN4",
  "refresh_expires_at": "2026-10-30T03:52:59.33297667Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380631813177` → **200**

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
  "correlation_id": "abd0c4b2-269a-4ce8-9b60-3603b1c8e20c"
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
  "session_id": "41bc907d-b733-448f-8b92-001ee7f8f4d6",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwODAsImlhdCI6MTc5MzI4OTE4MCwianRpIjoiYjVkZGFjN2QtNDI4MC00NmQ0LWIwZmEtNjE3NGVlZjdkMjZjIiwic2lkIjoiNDFiYzkwN2QtYjczMy00NDhmLThiOTItMDAxZWU3ZjhmNGQ2In0.eAdAzCjn43SbKt5GGSIDap8sbF-MhkEM_19D8riRyGs",
  "access_expires_at": "2026-10-29T16:08:00.519175018Z",
  "refresh_token": "GAWvsE8S83jajuCvbww5KzzcJttH5H_LEIY1NgXnY3A",
  "refresh_expires_at": "2026-10-30T03:53:00.518632112Z",
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
  "changed_by": "84015309-667b-408e-9731-2b3c5e734ac0",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T15:49:00.593775Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "e0dfa731-c10e-43b8-9195-c118e830c341",
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
  "changed_by": "84015309-667b-408e-9731-2b3c5e734ac0",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-29T15:53:01.119837306Z"
}
```

## The rider books the airport for 2026-10-29T18:53:00Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600502146",
  "device_ref": "sandbox-26731"
}
```

```json
{
  "challenge_id": "8e47ac02-ad6a-42bd-b2e8-31d39fbd6c5c",
  "expires_at": "2026-10-29T15:58:01.431824194Z",
  "resend_available_at": "2026-10-29T15:53:02.431824194Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600502146` → **200**

```json
{
  "phone": "+48600502146",
  "audience": "CLIENT",
  "code": "534028",
  "sent_at": "2026-10-29T15:53:01.434585061Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8e47ac02-ad6a-42bd-b2e8-31d39fbd6c5c",
  "code": "534028",
  "device_ref": "sandbox-26731"
}
```

```json
{
  "session_id": "412baf6c-fb9d-4c4b-8aab-036274bf765c",
  "subject": {
    "type": "CLIENT",
    "id": "01d4730f-8dd0-4459-aa8e-ac9371bc1a2a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMWQ0NzMwZi04ZGQwLTQ0NTktYWE4ZS1hYzkzNzFiYzFhMmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMDgxLCJpYXQiOjE3OTMyODkxODEsImp0aSI6ImU1Y2M1ZTg1LWU0MmYtNGY5Ni1hZDM0LTA5YTI2ZTlmZTQ1YSIsInNpZCI6IjQxMmJhZjZjLWZiOWQtNGM0Yi04YWFiLTAzNjI3NGJmNzY1YyJ9.ijPcYyse58RKnhY5VGO6EheLuAzwMw0s-Prb7s6kWWY",
  "access_expires_at": "2026-10-29T16:08:01.755457754Z",
  "refresh_token": "6H5UR5RcGrF-ULHGzq6qVxe5FtcZDvrxSdIomd05eZI",
  "refresh_expires_at": "2026-11-28T15:53:01.754977977Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7fe515da-85a9-4207-a910-557e82cb51b9",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-29T18:53:00Z"
}
```

```json
{
  "id": "9440dcca-821b-4af0-88c7-f2c4d037a28d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:58:02.050528Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T18:53:00Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d9697b84-ff18-4eb6-ae24-c034d0a27126",
  "quote_id": "9440dcca-821b-4af0-88c7-f2c4d037a28d",
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
  "pickup_at": "2026-10-29T18:53:00Z"
}
```

```json
{
  "id": "f6d10545-51e7-4997-bc47-c77deadf6fd2",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "01d4730f-8dd0-4459-aa8e-ac9371bc1a2a",
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
  "created_at": "2026-10-29T15:53:02.362225Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T18:53:00Z",
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
  "device_ref": "sandbox-625"
}
```

```json
{
  "challenge_id": "948ec229-b75c-46ba-bdba-098efc6471f1",
  "expires_at": "2026-10-29T15:58:02.688496598Z",
  "resend_available_at": "2026-10-29T15:53:03.688496598Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "967471",
  "sent_at": "2026-10-29T15:53:02.691352732Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "948ec229-b75c-46ba-bdba-098efc6471f1",
  "code": "967471",
  "device_ref": "sandbox-625"
}
```

```json
{
  "session_id": "44583ff2-9a52-469a-a332-753d1ed1dc55",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDA4MywiaWF0IjoxNzkzMjg5MTgzLCJqdGkiOiJmYmRiYThhNi0xMmMyLTQ4M2YtODQ4ZS0yZDBiNWViMjJhZmMiLCJzaWQiOiI0NDU4M2ZmMi05YTUyLTQ2OWEtYTMzMi03NTNkMWVkMWRjNTUifQ.uYFu_HRCfAv2o-yFF3xBTw_xppcG-LAeG2aQYdXfX2o",
  "access_expires_at": "2026-10-29T16:08:03.014869394Z",
  "refresh_token": "dzrXJEcc29shvopsT0Hc3VGp3fRP0aRT2zo4WgaOmpc",
  "refresh_expires_at": "2026-11-28T15:53:03.014257349Z",
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
  "command_id": "5378a34e-0cd1-41bf-9422-e0775ddb5d4c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:53:03Z",
    "sequence": 1793289183587
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "42f46af5-b23b-4078-9ae6-a1bf9d8ffae5",
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
  "last_heartbeat_at": "2026-10-29T15:53:03.606299Z",
  "last_location_at": "2026-10-29T15:53:03.606299Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "f6d10545-51e7-4997-bc47-c77deadf6fd2",
      "short_number": 24,
      "pickup_at": "2026-10-29T18:53:00Z",
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

`POST /api/driver/v1/preorders/f6d10545-51e7-4997-bc47-c77deadf6fd2/reserve` → **200**

```json
{
  "command_id": "d5fd2579-7bab-4614-a9fc-ce66290a4b9a"
}
```

```json
{
  "id": "c758b190-88ab-4e36-8cb9-2b678bf25b49",
  "state": "RESERVED",
  "order": {
    "order_id": "f6d10545-51e7-4997-bc47-c77deadf6fd2",
    "short_number": 24,
    "pickup_at": "2026-10-29T18:53:00Z",
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
  "reserved_at": "2026-10-29T15:53:04.181062Z",
  "confirm_from": "2026-10-29T18:23:00Z",
  "confirm_until": "2026-10-29T18:33:00Z",
  "drop_until": "2026-10-29T17:53:00Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "c758b190-88ab-4e36-8cb9-2b678bf25b49",
      "state": "RESERVED",
      "order": {
        "order_id": "f6d10545-51e7-4997-bc47-c77deadf6fd2",
        "short_number": 24,
        "pickup_at": "2026-10-29T18:53:00Z",
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
      "reserved_at": "2026-10-29T15:53:04.181062Z",
      "confirm_from": "2026-10-29T18:23:00Z",
      "confirm_until": "2026-10-29T18:33:00Z",
      "drop_until": "2026-10-29T17:53:00Z"
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
      "id": "c758b190-88ab-4e36-8cb9-2b678bf25b49",
      "state": "RESERVED",
      "order": {
        "order_id": "f6d10545-51e7-4997-bc47-c77deadf6fd2",
        "short_number": 24,
        "pickup_at": "2026-10-29T18:53:00Z",
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
      "reserved_at": "2026-10-29T15:53:04.181062Z",
      "confirm_from": "2026-10-29T18:23:00Z",
      "confirm_until": "2026-10-29T18:33:00Z",
      "drop_until": "2026-10-29T17:53:00Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/c758b190-88ab-4e36-8cb9-2b678bf25b49/confirm` → **409**

```json
{
  "command_id": "8e70622f-836a-4e0c-aed2-853e0a2936b8"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/c758b190-88ab-4e36-8cb9-2b678bf25b49/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3f281874-2124-40c4-b8f9-5a0b5bb1ddfa"
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
  "session_id": "6589404f-d053-4325-a60e-bea80b987ad9",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwODUsImlhdCI6MTc5MzI4OTE4NSwianRpIjoiYWZhOGYwNmYtN2M0NS00YjM5LTg1MjEtNGJiMGIzY2MyYTEzIiwic2lkIjoiNjU4OTQwNGYtZDA1My00MzI1LWE2MGUtYmVhODBiOTg3YWQ5In0.3fi9NwkXPl4J67lZ3Ws8os12en7ey4Mm3CEsHqi9BTQ",
  "access_expires_at": "2026-10-29T16:08:05.636159619Z",
  "refresh_token": "TbPdZXRY2Yill3c7ZfyKCkO2KFFtrdeAlA8Z3j-1DeY",
  "refresh_expires_at": "2026-10-30T03:53:05.635646429Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f6d10545-51e7-4997-bc47-c77deadf6fd2` → **200**

```json
{
  "id": "f6d10545-51e7-4997-bc47-c77deadf6fd2",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "01d4730f-8dd0-4459-aa8e-ac9371bc1a2a",
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
  "created_at": "2026-10-29T15:53:02.362225Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-29T18:53:00Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "c758b190-88ab-4e36-8cb9-2b678bf25b49",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-29T15:53:04.181062Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/f6d10545-51e7-4997-bc47-c77deadf6fd2/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-29T15:53:02.363351Z",
      "actor": {
        "type": "CLIENT",
        "id": "01d4730f-8dd0-4459-aa8e-ac9371bc1a2a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "f6d10545-51e7-4997-bc47-c77deadf6fd2",
        "preorder": true,
        "quote_id": "9440dcca-821b-4af0-88c7-f2c4d037a28d",
        "pickup_at": "2026-10-29T18:53Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "b4863e65-ffb6-4c98-b533-2e66e87b7969"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-29T15:53:04.182195Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f6d10545-51e7-4997-bc47-c77deadf6fd2",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "c758b190-88ab-4e36-8cb9-2b678bf25b49"
      },
      "correlation_id": "92dd6562-1315-4850-82e5-d1f60fbf5677"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order f6d10545-51e7-4997-bc47-c77deadf6fd2, reservation c758b190-88ab-4e36-8cb9-2b678bf25b49.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-30268"
}
```

```json
{
  "challenge_id": "35aef94f-b229-4a36-ad08-e82481af21e8",
  "expires_at": "2026-10-29T15:58:06.525531125Z",
  "resend_available_at": "2026-10-29T15:53:07.525531125Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "607370",
  "sent_at": "2026-10-29T15:53:06.528078412Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "35aef94f-b229-4a36-ad08-e82481af21e8",
  "code": "607370",
  "device_ref": "sandbox-30268"
}
```

```json
{
  "session_id": "73ce4e12-efde-4862-ad89-e5ea33882c6f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDA4NiwiaWF0IjoxNzkzMjg5MTg2LCJqdGkiOiI0ZmFmOGE5Ny1jNTFhLTQ3ZDUtODVjMC1lOThmMWQzMzg1YjkiLCJzaWQiOiI3M2NlNGUxMi1lZmRlLTQ4NjItYWQ4OS1lNWVhMzM4ODJjNmYifQ.JnuzCaJxrac_KU9DjeP18bzq-xS97u1Uru9lmhDvY28",
  "access_expires_at": "2026-10-29T16:08:06.844192618Z",
  "refresh_token": "BudEHe6RaHYTl_nyF-sHH0fcrMTEAdJjWGA4W-8OmHc",
  "refresh_expires_at": "2026-11-28T15:53:06.843698203Z",
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
  "command_id": "2cad60f5-5119-46ad-960e-6a7a26829ee0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:53:07Z",
    "sequence": 1793289187411
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "336049d2-08f1-427f-978e-9a86ced93b35",
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
  "last_heartbeat_at": "2026-10-29T15:53:07.430396Z",
  "last_location_at": "2026-10-29T15:53:07.430396Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671919513",
  "device_ref": "sandbox-7453"
}
```

```json
{
  "challenge_id": "f16ca37e-e1ec-4f95-9f78-4c681a8f66c6",
  "expires_at": "2026-10-29T15:58:07.727743901Z",
  "resend_available_at": "2026-10-29T15:53:08.727743901Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671919513` → **200**

```json
{
  "phone": "+380671919513",
  "audience": "CLIENT",
  "code": "814874",
  "sent_at": "2026-10-29T15:53:07.730227527Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f16ca37e-e1ec-4f95-9f78-4c681a8f66c6",
  "code": "814874",
  "device_ref": "sandbox-7453"
}
```

```json
{
  "session_id": "9004dfa3-3486-435f-902a-f087b4f326c7",
  "subject": {
    "type": "CLIENT",
    "id": "3ef757a3-e0fb-468c-a664-4d985c18bd00"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZWY3NTdhMy1lMGZiLTQ2OGMtYTY2NC00ZDk4NWMxOGJkMDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMDg4LCJpYXQiOjE3OTMyODkxODgsImp0aSI6IjQ3MGFmYmFmLTg4NGQtNGRjYi04NWE4LTRmMWZhZGNmZjRmZCIsInNpZCI6IjkwMDRkZmEzLTM0ODYtNDM1Zi05MDJhLWYwODdiNGYzMjZjNyJ9.FX_o9jJar1vZLGqLDsh0JiM7j5T9N9b_u-e-LXOeFGs",
  "access_expires_at": "2026-10-29T16:08:08.043038557Z",
  "refresh_token": "8Lye3SOHMgpoRs3NwS21cjT6Au0OAw7Ota1IhyrXeWg",
  "refresh_expires_at": "2026-11-28T15:53:08.042306517Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6af2cdcb-2e5a-4aab-9c8b-3f070e16e09b",
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
  "id": "ba8917d1-fab1-4385-bbb5-98342d1003c1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:58:08.329296Z",
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
  "command_id": "258b63b0-85cf-4a6b-9963-274e4331230e",
  "quote_id": "ba8917d1-fab1-4385-bbb5-98342d1003c1",
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
  "id": "6f221730-803e-48d0-a6f8-6fa862b110a2",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3ef757a3-e0fb-468c-a664-4d985c18bd00",
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
  "created_at": "2026-10-29T15:53:08.628784Z",
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
    "id": "c8696b2f-3ffe-45e6-92f3-92c0d042470b",
    "order_id": "6f221730-803e-48d0-a6f8-6fa862b110a2",
    "expires_at": "2026-10-29T15:53:23.631844Z",
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

`POST /api/driver/v1/offers/c8696b2f-3ffe-45e6-92f3-92c0d042470b/accept` → **200**

```json
{
  "command_id": "e30252fc-1ec4-46ba-8cc0-31c66c212453"
}
```

```json
{
  "id": "d53290ac-ae69-4fcf-b710-590594290eb0",
  "order_id": "6f221730-803e-48d0-a6f8-6fa862b110a2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f7de91ec-0b18-4f5b-bc09-6d1b2cb2e516",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f7de91ec-0b18-4f5b-bc09-6d1b2cb2e516",
  "order_id": "6f221730-803e-48d0-a6f8-6fa862b110a2",
  "assignment_id": "d53290ac-ae69-4fcf-b710-590594290eb0",
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

`POST /api/driver/v1/work-sessions/336049d2-08f1-427f-978e-9a86ced93b35/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:53:09Z",
    "sequence": 1793289189783
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "336049d2-08f1-427f-978e-9a86ced93b35",
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
  "last_heartbeat_at": "2026-10-29T15:53:09.802641Z",
  "last_location_at": "2026-10-29T15:53:09.802641Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f7de91ec-0b18-4f5b-bc09-6d1b2cb2e516",
  "order_id": "6f221730-803e-48d0-a6f8-6fa862b110a2",
  "assignment_id": "d53290ac-ae69-4fcf-b710-590594290eb0",
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

`POST /api/driver/v1/trips/f7de91ec-0b18-4f5b-bc09-6d1b2cb2e516/arrive` → **200**

```json
{
  "command_id": "ebbe4623-5e5c-4d50-9c47-1359b7ae31d3",
  "expected_version": 0
}
```

```json
{
  "id": "f7de91ec-0b18-4f5b-bc09-6d1b2cb2e516",
  "order_id": "6f221730-803e-48d0-a6f8-6fa862b110a2",
  "assignment_id": "d53290ac-ae69-4fcf-b710-590594290eb0",
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
  "arrived_at": "2026-10-29T15:53:10.373386Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f7de91ec-0b18-4f5b-bc09-6d1b2cb2e516/start` → **200**

```json
{
  "command_id": "e38beb83-f6bd-43a4-9d75-ab730b92fd96",
  "expected_version": 1
}
```

```json
{
  "id": "f7de91ec-0b18-4f5b-bc09-6d1b2cb2e516",
  "order_id": "6f221730-803e-48d0-a6f8-6fa862b110a2",
  "assignment_id": "d53290ac-ae69-4fcf-b710-590594290eb0",
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
  "arrived_at": "2026-10-29T15:53:10.373386Z",
  "started_at": "2026-10-29T15:53:10.670147Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/336049d2-08f1-427f-978e-9a86ced93b35/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:53:10Z",
    "sequence": 1793289190949
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "336049d2-08f1-427f-978e-9a86ced93b35",
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
  "last_heartbeat_at": "2026-10-29T15:53:10.967188Z",
  "last_location_at": "2026-10-29T15:53:10.967188Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/f7de91ec-0b18-4f5b-bc09-6d1b2cb2e516/complete` → **200**

```json
{
  "command_id": "da7ad4c2-4691-4965-bf72-ce2b49af46a9",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:53:11Z",
  "cash_received": true
}
```

```json
{
  "id": "f7de91ec-0b18-4f5b-bc09-6d1b2cb2e516",
  "order_id": "6f221730-803e-48d0-a6f8-6fa862b110a2",
  "assignment_id": "d53290ac-ae69-4fcf-b710-590594290eb0",
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
  "arrived_at": "2026-10-29T15:53:10.373386Z",
  "started_at": "2026-10-29T15:53:10.670147Z",
  "completed_at": "2026-10-29T15:53:11.256009Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/6f221730-803e-48d0-a6f8-6fa862b110a2/rating` → **200**

```json
{
  "command_id": "32aaea20-20ce-4ca6-9114-93d3ad49bab3",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "6f221730-803e-48d0-a6f8-6fa862b110a2",
  "score": 5,
  "created_at": "2026-10-29T15:53:11.571722866Z"
}
```

`POST /api/driver/v1/orders/6f221730-803e-48d0-a6f8-6fa862b110a2/rating` → **200**

```json
{
  "command_id": "dbaeb1ba-207f-43d6-864a-26820dd26793",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "6f221730-803e-48d0-a6f8-6fa862b110a2",
  "score": 4,
  "created_at": "2026-10-29T15:53:11.851897196Z"
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
  "session_id": "a0a6e80b-f9c3-4c89-a58d-5a20ace8cd4c",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwOTIsImlhdCI6MTc5MzI4OTE5MiwianRpIjoiOThjYzA1NTYtNzU3OS00ZmNmLTg2MDktNjU1ZTA4MjRlM2E4Iiwic2lkIjoiYTBhNmU4MGItZjljMy00Yzg5LWE1OGQtNWEyMGFjZThjZDRjIn0.Dl8gkAZ6gSj8Q5ZPij-ybh0A2G86C9OBbI0y699ptDQ",
  "access_expires_at": "2026-10-29T16:08:12.720273357Z",
  "refresh_token": "5RkQLC402FXwiiQwBkXSEX8P1-K5yn-F9ijwBoJ3jJ8",
  "refresh_expires_at": "2026-10-30T03:53:12.719647252Z",
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
  "session_id": "573875e8-fa8a-4a59-8025-838eb4b8cee1",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwOTMsImlhdCI6MTc5MzI4OTE5MywianRpIjoiY2YwMTQ5ZTEtZWM4My00MzFjLWIzOTUtYzRlNzJhMTlkNzViIiwic2lkIjoiNTczODc1ZTgtZmE4YS00YTU5LTgwMjUtODM4ZWI0YjhjZWUxIn0._inuwu1lpzqt71wllZAlNWo6iq0OZRQIvPuVYcYfl8A",
  "access_expires_at": "2026-10-29T16:08:13.3068299Z",
  "refresh_token": "xBQFfXSVuQyKm552b7gat3928ymMrxYW3LXfjR_kXB8",
  "refresh_expires_at": "2026-10-30T03:53:13.306085066Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/6f221730-803e-48d0-a6f8-6fa862b110a2/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "6f221730-803e-48d0-a6f8-6fa862b110a2",
      "author_type": "RIDER",
      "author_id": "3ef757a3-e0fb-468c-a664-4d985c18bd00",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-29T15:53:11.571723Z"
    },
    {
      "order_id": "6f221730-803e-48d0-a6f8-6fa862b110a2",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "3ef757a3-e0fb-468c-a664-4d985c18bd00",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-29T15:53:11.851897Z"
    }
  ]
}
```

Done: ratings for order 6f221730-803e-48d0-a6f8-6fa862b110a2.

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
  "session_id": "4d6bb4ea-50ca-448e-92b9-ed1aac6f8e4f",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwOTQsImlhdCI6MTc5MzI4OTE5NCwianRpIjoiNjcxZWRhODUtMTJiMS00ZTc2LTkzYmQtZGUxODYwYjFmNTcyIiwic2lkIjoiNGQ2YmI0ZWEtNTBjYS00NDhlLTkyYjktZWQxYWFjNmY4ZTRmIn0.C8jML5ZGiOB75vh34qjI_ek-dwh4pH-aWt0wIwvLNWw",
  "access_expires_at": "2026-10-29T16:08:14.183739523Z",
  "refresh_token": "jPlje44CGlx_pVEaolw2ruAcoaDKKFX2X4mM-t6IO5M",
  "refresh_expires_at": "2026-10-30T03:53:14.18323013Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "8ace7dfd-d0e8-4d1e-a8de-0408b3cac538",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "f4e5fa8b-65b6-4293-89fd-d1e861ff8d15",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:53:14.480971Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f4e5fa8b-65b6-4293-89fd-d1e861ff8d15` → **200**

```json
{
  "id": "f4e5fa8b-65b6-4293-89fd-d1e861ff8d15",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:53:14.480971Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f4e5fa8b-65b6-4293-89fd-d1e861ff8d15` → **200**

```json
{
  "id": "f4e5fa8b-65b6-4293-89fd-d1e861ff8d15",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:53:14.480971Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f4e5fa8b-65b6-4293-89fd-d1e861ff8d15` → **200**

```json
{
  "id": "f4e5fa8b-65b6-4293-89fd-d1e861ff8d15",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T15:53:14.480971Z",
  "ready_at": "2026-10-29T15:53:16.66327Z",
  "expires_at": "2026-10-30T15:53:16.66327Z"
}
```

`GET /api/admin/v1/reports/exports/f4e5fa8b-65b6-4293-89fd-d1e861ff8d15/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-29,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "5a74fc27-7af5-4b36-8a34-d485830f2d66",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "ca550aa2-4920-42bb-930d-cd047480c2a5",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:53:17.647513Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ca550aa2-4920-42bb-930d-cd047480c2a5` → **200**

```json
{
  "id": "ca550aa2-4920-42bb-930d-cd047480c2a5",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:53:17.647513Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ca550aa2-4920-42bb-930d-cd047480c2a5` → **200**

```json
{
  "id": "ca550aa2-4920-42bb-930d-cd047480c2a5",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:53:17.647513Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ca550aa2-4920-42bb-930d-cd047480c2a5` → **200**

```json
{
  "id": "ca550aa2-4920-42bb-930d-cd047480c2a5",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:53:17.647513Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ca550aa2-4920-42bb-930d-cd047480c2a5` → **200**

```json
{
  "id": "ca550aa2-4920-42bb-930d-cd047480c2a5",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T15:53:17.647513Z",
  "ready_at": "2026-10-29T15:53:21.670408Z",
  "expires_at": "2026-10-30T15:53:21.670408Z"
}
```

`GET /api/admin/v1/reports/exports/ca550aa2-4920-42bb-930d-cd047480c2a5/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-29,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/eb7ea133-3eae-4d07-a446-4430c603c191` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/eb7ea133-3eae-4d07-a446-4430c603c191",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "93c811a6-3d37-4ba7-baf7-2ad994bf2e32"
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
  "device_ref": "sandbox-5780"
}
```

```json
{
  "challenge_id": "09324fa7-729b-4027-8ad6-6f1c1ce20877",
  "expires_at": "2026-10-29T15:58:22.406074768Z",
  "resend_available_at": "2026-10-29T15:53:23.406074768Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "811161",
  "sent_at": "2026-10-29T15:53:22.409495249Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "09324fa7-729b-4027-8ad6-6f1c1ce20877",
  "code": "811161",
  "device_ref": "sandbox-5780"
}
```

```json
{
  "session_id": "b5de1dd1-7aed-4796-b8de-d5c103f0978e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDEwMiwiaWF0IjoxNzkzMjg5MjAyLCJqdGkiOiI5NDMwZTk1Ni0wZWMxLTQ4NjctYjhmNi1mNmI2NDhlNzM1YTkiLCJzaWQiOiJiNWRlMWRkMS03YWVkLTQ3OTYtYjhkZS1kNWMxMDNmMDk3OGUifQ.xaurEWOKQVisCYG9E9DVCpSiz_qUfYaqGxBt9slKH6o",
  "access_expires_at": "2026-10-29T16:08:22.724051206Z",
  "refresh_token": "9EA9Y85xgHJT5-bt2vQkbSBu951aKHHlkDRek1Yqgdk",
  "refresh_expires_at": "2026-11-28T15:53:22.723504423Z",
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
  "command_id": "1c7527ca-5758-496b-b6ec-2122930bb3d9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:53:23Z",
    "sequence": 1793289203590
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "dfd3d8c8-a008-40dd-90b3-24afdcbf1029",
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
  "last_heartbeat_at": "2026-10-29T15:53:23.608988Z",
  "last_location_at": "2026-10-29T15:53:23.608988Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "75778c85-0c11-40da-8667-2863d7a89df0",
  "points": [
    {
      "sequence": 1793289205906,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T15:52:25Z"
    },
    {
      "sequence": 1793289205913,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T15:53:25Z"
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
  "session_id": "3d325f27-51d7-48f4-ae94-5151476e2f06",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAxMDYsImlhdCI6MTc5MzI4OTIwNiwianRpIjoiZWRjZWMzMmItZDliZS00ZGY0LWFiZGItZjgzZTBlMzhhNDIyIiwic2lkIjoiM2QzMjVmMjctNTFkNy00OGY0LWFlOTQtNTE1MTQ3NmUyZjA2In0.HFGXNr-ZpLmxuQPqg_kHVy5fIl6_6ZSDpbrnB--3oIg",
  "access_expires_at": "2026-10-29T16:08:26.532763009Z",
  "refresh_token": "P0NrNvCyK6d9NFFXACCtxcWfaMk8rtpJpcSADQ4F7Ec",
  "refresh_expires_at": "2026-10-30T03:53:26.532137646Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "8043a300-5e2a-4af6-8b93-5cecbf575b31",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-29T15:53:25Z",
        "track_point_id": "9e1d3d5c-7308-4f09-89ee-5bbdfac295b1",
        "work_session_id": "dfd3d8c8-a008-40dd-90b3-24afdcbf1029"
      },
      "raised_by": null,
      "raised_at": "2026-10-29T15:53:25Z",
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

`POST /api/admin/v1/driver-risk-flags/8043a300-5e2a-4af6-8b93-5cecbf575b31/confirm` → **200**

```json
{
  "command_id": "8d02a679-8b09-42e6-952d-6a4e99603e2f",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "8043a300-5e2a-4af6-8b93-5cecbf575b31",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-29T15:53:25Z",
    "track_point_id": "9e1d3d5c-7308-4f09-89ee-5bbdfac295b1",
    "work_session_id": "dfd3d8c8-a008-40dd-90b3-24afdcbf1029"
  },
  "raised_by": null,
  "raised_at": "2026-10-29T15:53:25Z",
  "reason": null,
  "reviewed_by": "84015309-667b-408e-9731-2b3c5e734ac0",
  "reviewed_at": "2026-10-29T15:53:27.428867Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/8043a300-5e2a-4af6-8b93-5cecbf575b31/dismiss` → **409**

```json
{
  "command_id": "02514fd6-e21a-4676-a029-173479c8841f",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/8043a300-5e2a-4af6-8b93-5cecbf575b31/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "50f7af5c-e629-46ee-858d-8f52ed3b3170"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "2b31bf93-3569-4e6f-a554-0792996df16a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "9384b682-9d69-4f87-b5be-16fc778043d5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "84015309-667b-408e-9731-2b3c5e734ac0",
  "raised_at": "2026-10-29T15:53:28.051944Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/9384b682-9d69-4f87-b5be-16fc778043d5/dismiss` → **200**

```json
{
  "command_id": "629d4753-4756-41f3-919a-57df0f82bbb6",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "9384b682-9d69-4f87-b5be-16fc778043d5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "84015309-667b-408e-9731-2b3c5e734ac0",
  "raised_at": "2026-10-29T15:53:28.051944Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "84015309-667b-408e-9731-2b3c5e734ac0",
  "reviewed_at": "2026-10-29T15:53:28.350736Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "bfa00a26-3bbf-46ea-bb2f-46e1a8d985ca",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "8043a300-5e2a-4af6-8b93-5cecbf575b31"
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
      "actor_id": "84015309-667b-408e-9731-2b3c5e734ac0",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T15:53:28.652519Z"
    }
  ]
}
```

Done: flag 8043a300-5e2a-4af6-8b93-5cecbf575b31 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "5822cc4b-d3c7-4990-9e90-410ded75898d",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAxMDksImlhdCI6MTc5MzI4OTIwOSwianRpIjoiODNlODE2MTEtZTcxMC00ZWE5LWFkOTQtYmUzMjRjMzcyNWI5Iiwic2lkIjoiNTgyMmNjNGItZDNjNy00OTkwLTllOTAtNDEwZGVkNzU4OThkIn0.HgFaTC7vMpG1h5f0sPv4RDq98iedkZ0qX7v-zIR8cNw",
  "access_expires_at": "2026-10-29T16:08:29.523621804Z",
  "refresh_token": "7_p-OmWjLU_29Eai2eqHA114IeZBd9UM-NR0X4WSafY",
  "refresh_expires_at": "2026-10-30T03:53:29.522977489Z",
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
      "actor_id": "84015309-667b-408e-9731-2b3c5e734ac0",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T15:53:28.652519Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "ea90fd01-cdd0-43a3-bc25-07d75da72720",
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
  "session_id": "dfd3d8c8-a008-40dd-90b3-24afdcbf1029",
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
  "last_heartbeat_at": "2026-10-29T15:53:23.608988Z",
  "last_location_at": "2026-10-29T15:53:23.608988Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dfd3d8c8-a008-40dd-90b3-24afdcbf1029/close` → **200**

```json
{
  "command_id": "5d939075-834c-4cbc-8968-5c1afaa62434",
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
  "session_id": "398ab950-a2c5-4cae-9c71-fc55cd70b762",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAxMTEsImlhdCI6MTc5MzI4OTIxMSwianRpIjoiNzA1MGQ5ZTUtMmFmMy00NTRmLWFmN2MtYWEzZmMxNWFlNjY5Iiwic2lkIjoiMzk4YWI5NTAtYTJjNS00Y2FlLTljNzEtZmM1NWNkNzBiNzYyIn0.neD2E--AYo_9-LyCm3YddYQWMArsDe0uEQVRKanQ4Tg",
  "access_expires_at": "2026-10-29T16:08:31.290918905Z",
  "refresh_token": "2KrHOkq12WhnZYh2eP1Xr_F9_jSw_PcVb3xFnkhv70U",
  "refresh_expires_at": "2026-10-30T03:53:31.290232791Z",
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
  "command_id": "f3c0e6a8-ebde-4a92-894e-1e5dda126904",
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
  "changed_by": "84015309-667b-408e-9731-2b3c5e734ac0",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T15:53:31.86079Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "f3c0e6a8-ebde-4a92-894e-1e5dda126904",
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
  "changed_by": "84015309-667b-408e-9731-2b3c5e734ac0",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T15:53:31.86079Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48904343466",
  "device_ref": "sandbox-2838"
}
```

```json
{
  "challenge_id": "27908fb3-de3e-4010-83ed-f3dee000844e",
  "expires_at": "2026-10-29T15:58:32.466109902Z",
  "resend_available_at": "2026-10-29T15:53:33.466109902Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48904343466` → **200**

```json
{
  "phone": "+48904343466",
  "audience": "CLIENT",
  "code": "203073",
  "sent_at": "2026-10-29T15:53:32.46858857Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "27908fb3-de3e-4010-83ed-f3dee000844e",
  "code": "203073",
  "device_ref": "sandbox-2838"
}
```

```json
{
  "session_id": "0022e43d-79dc-4934-adcb-f0281dd62662",
  "subject": {
    "type": "CLIENT",
    "id": "ccabfead-f131-4113-9ddd-3c41d499c4d1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjY2FiZmVhZC1mMTMxLTQxMTMtOWRkZC0zYzQxZDQ5OWM0ZDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMTEyLCJpYXQiOjE3OTMyODkyMTIsImp0aSI6IjAxMjQ2MTAxLTEzYjUtNDE0NS05NTUyLTRkMjYyZWMxNThlNSIsInNpZCI6IjAwMjJlNDNkLTc5ZGMtNDkzNC1hZGNiLWYwMjgxZGQ2MjY2MiJ9.HfszcjNftCpMMjKgV3Pl4rRrJ6_WBV6ek9Wt2_xjtDs",
  "access_expires_at": "2026-10-29T16:08:32.772814007Z",
  "refresh_token": "hdyMAlwLRR2FaIO8tYsIk36ofe6EEhK4oT0ScrBL4LI",
  "refresh_expires_at": "2026-11-28T15:53:32.772289435Z",
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
  "correlation_id": "1a40f31e-70be-4067-8c78-1a4be0366a08"
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
  "device_ref": "sandbox-12022"
}
```

```json
{
  "challenge_id": "529426d8-2e00-45cd-9eed-dd4da17014a6",
  "expires_at": "2026-10-29T15:58:33.635301547Z",
  "resend_available_at": "2026-10-29T15:53:34.635301547Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "794253",
  "sent_at": "2026-10-29T15:53:33.637689956Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "529426d8-2e00-45cd-9eed-dd4da17014a6",
  "code": "794253",
  "device_ref": "sandbox-12022"
}
```

```json
{
  "session_id": "936105eb-8300-499b-918f-6279058f4e50",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDExMywiaWF0IjoxNzkzMjg5MjEzLCJqdGkiOiI0Y2E0ZDViNi1lMWRmLTRlYTUtODhiNy1mNWRlOTY3OTkzZjEiLCJzaWQiOiI5MzYxMDVlYi04MzAwLTQ5OWItOTE4Zi02Mjc5MDU4ZjRlNTAifQ.vf0a-LrALlK8iS0a2yWjb7Mgpk04LzqnSz1Y-7jtu2M",
  "access_expires_at": "2026-10-29T16:08:33.949246492Z",
  "refresh_token": "GURhJGDXijqmqUuNzunoxlnVqm7dH3ejyAQDv491Xj8",
  "refresh_expires_at": "2026-11-28T15:53:33.948751756Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "42f46af5-b23b-4078-9ae6-a1bf9d8ffae5",
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
  "last_heartbeat_at": "2026-10-29T15:53:03.606299Z",
  "last_location_at": "2026-10-29T15:53:03.606299Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/42f46af5-b23b-4078-9ae6-a1bf9d8ffae5/handover` → **200**

```json
{
  "command_id": "7d2ba673-5d82-4670-a6fd-9119694c634c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "42f46af5-b23b-4078-9ae6-a1bf9d8ffae5",
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
  "last_heartbeat_at": "2026-10-29T15:53:03.606299Z",
  "last_location_at": "2026-10-29T15:53:03.606299Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/42f46af5-b23b-4078-9ae6-a1bf9d8ffae5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:53:34Z",
    "sequence": 1793289214824
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "42f46af5-b23b-4078-9ae6-a1bf9d8ffae5",
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
  "last_heartbeat_at": "2026-10-29T15:53:34.8423Z",
  "last_location_at": "2026-10-29T15:53:34.8423Z",
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
  "session_id": "42f46af5-b23b-4078-9ae6-a1bf9d8ffae5",
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
  "last_heartbeat_at": "2026-10-29T15:53:34.8423Z",
  "last_location_at": "2026-10-29T15:53:34.8423Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/42f46af5-b23b-4078-9ae6-a1bf9d8ffae5/close` → **200**

```json
{
  "command_id": "7a86af4b-775a-4310-8f1f-69d1b677beb6",
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
  "correlation_id": "2cadfd2a-aa54-41ef-aa05-8886bba1befd"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678028546",
  "device_ref": "sandbox-16775"
}
```

```json
{
  "challenge_id": "8ed5642c-3b88-4cc9-a42d-50deaed89869",
  "expires_at": "2026-10-29T15:58:36.306894394Z",
  "resend_available_at": "2026-10-29T15:53:37.306894394Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678028546` → **200**

```json
{
  "phone": "+380678028546",
  "audience": "CLIENT",
  "code": "903974",
  "sent_at": "2026-10-29T15:53:36.309791285Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8ed5642c-3b88-4cc9-a42d-50deaed89869",
  "code": "903974",
  "device_ref": "sandbox-16775"
}
```

```json
{
  "session_id": "3073ac60-579d-49da-8332-fb8a6606cc86",
  "subject": {
    "type": "CLIENT",
    "id": "1613d8ac-6b73-4e8b-b9d7-28d347db2d0a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNjEzZDhhYy02YjczLTRlOGItYjlkNy0yOGQzNDdkYjJkMGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMTE2LCJpYXQiOjE3OTMyODkyMTYsImp0aSI6IjM2MWM3MGVkLTlmYjUtNDQ2Ni1iODhhLWFhODZkNjg4ZmVjYSIsInNpZCI6IjMwNzNhYzYwLTU3OWQtNDlkYS04MzMyLWZiOGE2NjA2Y2M4NiJ9.JE2ZzHOXacYavTE8sB6WcJL8TUUX-ijuMPczWR-qbRc",
  "access_expires_at": "2026-10-29T16:08:36.616221295Z",
  "refresh_token": "2vKhTv3h1gnTARFfCxRo0zFyVVzW2N3xVF4ZaDu8UXc",
  "refresh_expires_at": "2026-11-28T15:53:36.615749051Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "20ba7be3-cb27-4f9d-9bfd-3efd2ccc3beb",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "dd1cd436-8c99-405c-899e-db369502b450",
  "upload_path": "/api/rider/v1/uploads/dd1cd436-8c99-405c-899e-db369502b450",
  "expires_at": "2026-10-29T16:08:36.911197184Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/dd1cd436-8c99-405c-899e-db369502b450` → **200**

```json
{
  "file_id": "dd1cd436-8c99-405c-899e-db369502b450",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "5a2b4fd6-ed92-484d-aa70-aab40af90d4a",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "dd1cd436-8c99-405c-899e-db369502b450"
  ]
}
```

```json
{
  "id": "ea54ed0a-9c48-4a3a-b25d-77840b2655af",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "1613d8ac-6b73-4e8b-b9d7-28d347db2d0a",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T15:53:37.226318Z",
  "updated_at": "2026-10-29T15:53:37.226318Z",
  "respond_by": "2026-10-29T19:53:37.226318Z",
  "messages": [
    {
      "id": "e9812ea1-e39f-4e46-849c-643bb6e1f59b",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "1613d8ac-6b73-4e8b-b9d7-28d347db2d0a",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T15:53:37.22726Z",
      "attachments": [
        {
          "file_id": "dd1cd436-8c99-405c-899e-db369502b450",
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
  "session_id": "6a56735b-89b0-4a32-8e3c-3613530c9b91",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAxMTcsImlhdCI6MTc5MzI4OTIxNywianRpIjoiNDJmMGE0ZWEtOWFkZS00NDYzLWFkODUtZjhlZGFkOWQyMmM5Iiwic2lkIjoiNmE1NjczNWItODliMC00YTMyLThlM2MtMzYxMzUzMGM5YjkxIn0.74KgR_tA2m1cql7RXlUFCiS4ZZVus0D2Hv8Y50a-Xvo",
  "access_expires_at": "2026-10-29T16:08:37.838484263Z",
  "refresh_token": "z2uHIqy05fiPef1dkh62JSNzKtkX7Dh2M9BuCOFT_e4",
  "refresh_expires_at": "2026-10-30T03:53:37.837909546Z",
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
  "session_id": "e8a14f04-7825-4c56-9cc8-56cf2c09a846",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAxMTgsImlhdCI6MTc5MzI4OTIxOCwianRpIjoiOGNkYzI4MmEtZjIzMS00ZWY5LThhOWItZTZlMmFmMzRlNjEzIiwic2lkIjoiZThhMTRmMDQtNzgyNS00YzU2LTljYzgtNTZjZjJjMDlhODQ2In0.462lNGibzdNSiG-pNVdm1ND3R50QtjJUi3PCG320Gmk",
  "access_expires_at": "2026-10-29T16:08:38.428355078Z",
  "refresh_token": "x_FnTNgbTvJcLZfiw7eXIV_dUzMkSc9Hi4V07cerxvc",
  "refresh_expires_at": "2026-10-30T03:53:38.427850624Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/ea54ed0a-9c48-4a3a-b25d-77840b2655af/attachments/dd1cd436-8c99-405c-899e-db369502b450` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "cd89a8ce-1b6c-4718-b666-98168940defa",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "588438b3-d7ad-4bde-8ff2-e1915fa1120c",
  "upload_path": "/api/operator/v1/uploads/588438b3-d7ad-4bde-8ff2-e1915fa1120c",
  "expires_at": "2026-10-29T16:08:38.731634188Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/588438b3-d7ad-4bde-8ff2-e1915fa1120c` → **200**

```json
{
  "file_id": "588438b3-d7ad-4bde-8ff2-e1915fa1120c",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/ea54ed0a-9c48-4a3a-b25d-77840b2655af` → **200**

```json
{
  "id": "ea54ed0a-9c48-4a3a-b25d-77840b2655af",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "1613d8ac-6b73-4e8b-b9d7-28d347db2d0a",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T15:53:37.226318Z",
  "updated_at": "2026-10-29T15:53:37.226318Z",
  "respond_by": "2026-10-29T19:53:37.226318Z",
  "messages": [
    {
      "id": "e9812ea1-e39f-4e46-849c-643bb6e1f59b",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "1613d8ac-6b73-4e8b-b9d7-28d347db2d0a",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T15:53:37.22726Z",
      "attachments": [
        {
          "file_id": "dd1cd436-8c99-405c-899e-db369502b450",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/ea54ed0a-9c48-4a3a-b25d-77840b2655af/comments` → **200**

```json
{
  "command_id": "6a0d1e87-e99b-4667-b6d0-3dff4f11d45a",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "588438b3-d7ad-4bde-8ff2-e1915fa1120c"
  ]
}
```

```json
{
  "id": "ea54ed0a-9c48-4a3a-b25d-77840b2655af",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "1613d8ac-6b73-4e8b-b9d7-28d347db2d0a",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T15:53:37.226318Z",
  "updated_at": "2026-10-29T15:53:39.346676Z",
  "respond_by": "2026-10-29T19:53:37.226318Z",
  "messages": [
    {
      "id": "e9812ea1-e39f-4e46-849c-643bb6e1f59b",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "1613d8ac-6b73-4e8b-b9d7-28d347db2d0a",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T15:53:37.22726Z",
      "attachments": [
        {
          "file_id": "dd1cd436-8c99-405c-899e-db369502b450",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "158a9fc7-65ed-4ae4-ace6-d9cd9b2135e4",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "84015309-667b-408e-9731-2b3c5e734ac0",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T15:53:39.346145Z",
      "attachments": [
        {
          "file_id": "588438b3-d7ad-4bde-8ff2-e1915fa1120c",
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

`GET /api/rider/v1/support/cases/ea54ed0a-9c48-4a3a-b25d-77840b2655af` → **200**

```json
{
  "id": "ea54ed0a-9c48-4a3a-b25d-77840b2655af",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "1613d8ac-6b73-4e8b-b9d7-28d347db2d0a",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T15:53:37.226318Z",
  "updated_at": "2026-10-29T15:53:39.346676Z",
  "respond_by": "2026-10-29T19:53:37.226318Z",
  "messages": [
    {
      "id": "e9812ea1-e39f-4e46-849c-643bb6e1f59b",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "1613d8ac-6b73-4e8b-b9d7-28d347db2d0a",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T15:53:37.22726Z",
      "attachments": [
        {
          "file_id": "dd1cd436-8c99-405c-899e-db369502b450",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "158a9fc7-65ed-4ae4-ace6-d9cd9b2135e4",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T15:53:39.346145Z",
      "attachments": [
        {
          "file_id": "588438b3-d7ad-4bde-8ff2-e1915fa1120c",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/ea54ed0a-9c48-4a3a-b25d-77840b2655af/attachments/588438b3-d7ad-4bde-8ff2-e1915fa1120c` → **200**

Done: support case ea54ed0a-9c48-4a3a-b25d-77840b2655af, rider attachment dd1cd436-8c99-405c-899e-db369502b450, operator attachment 588438b3-d7ad-4bde-8ff2-e1915fa1120c.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734878538",
  "device_ref": "sandbox-24871"
}
```

```json
{
  "challenge_id": "437a89eb-6ac1-4f14-8b24-213da11a5f46",
  "expires_at": "2026-10-29T15:58:39.97645797Z",
  "resend_available_at": "2026-10-29T15:53:40.97645797Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734878538` → **200**

```json
{
  "phone": "+380734878538",
  "audience": "CLIENT",
  "code": "246816",
  "sent_at": "2026-10-29T15:53:39.979154964Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "437a89eb-6ac1-4f14-8b24-213da11a5f46",
  "code": "246816",
  "device_ref": "sandbox-24871"
}
```

```json
{
  "session_id": "3fe0d727-b50e-4a39-a7fa-3a7696d24451",
  "subject": {
    "type": "CLIENT",
    "id": "01468c32-c583-42a0-af10-82aa10f82a8d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMTQ2OGMzMi1jNTgzLTQyYTAtYWYxMC04MmFhMTBmODJhOGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMTIwLCJpYXQiOjE3OTMyODkyMjAsImp0aSI6IjM3NDI5YTg5LWJjZGItNGE1Ny1iYTY2LTZmZmI1MWZkNmI4ZiIsInNpZCI6IjNmZTBkNzI3LWI1MGUtNGEzOS1hN2ZhLTNhNzY5NmQyNDQ1MSJ9.yfllOe8eGpqmtOAK4s-vh8TmlZmCP7p0yS0WI6EvIbQ",
  "access_expires_at": "2026-10-29T16:08:40.289952809Z",
  "refresh_token": "BV2q8bXjKNe5-fIpTKpzFuQ8TsjTiK0ddH_VmVg1DEI",
  "refresh_expires_at": "2026-11-28T15:53:40.289451473Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "2c48e853-6666-43d7-a8da-1a96ce250dd3",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "f07de1fb-dfd6-47c0-b17e-28e6f324dee3",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-f07de1fb-dfd6-47c0-b17e-28e6f324dee3",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "8433faad85b9035d7b81bc280ace3791",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=f07de1fb-dfd6-47c0-b17e-28e6f324dee3",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734878538"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=f07de1fb-dfd6-47c0-b17e-28e6f324dee3",
  "expires_at": "2026-10-29T16:23:40.578419Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/f07de1fb-dfd6-47c0-b17e-28e6f324dee3` → **200**

```json
{
  "id": "f07de1fb-dfd6-47c0-b17e-28e6f324dee3",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T16:23:40.578419Z",
  "card": {
    "id": "085a462e-fbb8-49cf-a776-344307bc4415",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5104",
    "card_type": "Visa",
    "created_at": "2026-10-29T15:53:40.870423Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "96b694c5-d572-4746-93c1-c37f44988c11",
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
  "id": "93259a47-f142-422e-89ce-4ce37534eb23",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:58:41.191902Z",
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
  "command_id": "e3b8a74d-b7f8-4a0f-98b6-e08f4cc348f7",
  "quote_id": "93259a47-f142-422e-89ce-4ce37534eb23",
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
  "id": "916ab385-8b14-4190-914c-554fe0ec9e89",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "01468c32-c583-42a0-af10-82aa10f82a8d",
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
  "created_at": "2026-10-29T15:53:41.512792Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/916ab385-8b14-4190-914c-554fe0ec9e89` → **200**

```json
{
  "id": "916ab385-8b14-4190-914c-554fe0ec9e89",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "01468c32-c583-42a0-af10-82aa10f82a8d",
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
  "created_at": "2026-10-29T15:53:41.512792Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/916ab385-8b14-4190-914c-554fe0ec9e89` → **200**

```json
{
  "id": "916ab385-8b14-4190-914c-554fe0ec9e89",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "01468c32-c583-42a0-af10-82aa10f82a8d",
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
  "created_at": "2026-10-29T15:53:41.512792Z",
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

`GET /api/rider/v1/orders/916ab385-8b14-4190-914c-554fe0ec9e89` → **200**

```json
{
  "id": "916ab385-8b14-4190-914c-554fe0ec9e89",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "01468c32-c583-42a0-af10-82aa10f82a8d",
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
  "created_at": "2026-10-29T15:53:41.512792Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/916ab385-8b14-4190-914c-554fe0ec9e89/switch-to-cash` → **200**

```json
{
  "command_id": "597b7d5d-65b1-4b18-8eb0-eda4a1cac29a",
  "expected_version": 3
}
```

```json
{
  "id": "916ab385-8b14-4190-914c-554fe0ec9e89",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "01468c32-c583-42a0-af10-82aa10f82a8d",
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
  "created_at": "2026-10-29T15:53:41.512792Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/916ab385-8b14-4190-914c-554fe0ec9e89/switch-to-cash` → **409**

```json
{
  "command_id": "cabf7a77-dd9b-4bd0-bc56-bb766ca39f94",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/916ab385-8b14-4190-914c-554fe0ec9e89/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "89123a0d-4056-40d2-85a5-8cf110f13eea"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/916ab385-8b14-4190-914c-554fe0ec9e89` → **200**

```json
{
  "id": "916ab385-8b14-4190-914c-554fe0ec9e89",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "01468c32-c583-42a0-af10-82aa10f82a8d",
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
  "created_at": "2026-10-29T15:53:41.512792Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/916ab385-8b14-4190-914c-554fe0ec9e89/cancel` → **200**

```json
{
  "command_id": "448b09a0-572d-448e-b5c2-cbda780146e1",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "916ab385-8b14-4190-914c-554fe0ec9e89",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "01468c32-c583-42a0-af10-82aa10f82a8d",
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
  "created_at": "2026-10-29T15:53:41.512792Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати",
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
  "session_id": "a64a5f1f-8d78-4145-8951-fcb63903d05b",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAxMjUsImlhdCI6MTc5MzI4OTIyNSwianRpIjoiNWQwYTkxZjAtMTdiYS00NDVlLWIyMjgtNGE4OWVjZGY2MTNhIiwic2lkIjoiYTY0YTVmMWYtOGQ3OC00MTQ1LTg5NTEtZmNiNjM5MDNkMDViIn0.3mkQJN7sALLkyI5US6JGi887dNpwW5MRgHM_Vi1YQbY",
  "access_expires_at": "2026-10-29T16:08:45.288045286Z",
  "refresh_token": "cssY2U6cpbxsjEnWUmmU9rt6pcmlWWOwkV879o9sj9k",
  "refresh_expires_at": "2026-10-30T03:53:45.287487091Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-3651"
}
```

```json
{
  "challenge_id": "db2b8f0c-a7b9-4ebf-9cdf-9dd11d3295b7",
  "expires_at": "2026-10-29T15:58:45.579341728Z",
  "resend_available_at": "2026-10-29T15:53:46.579341728Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "758470",
  "sent_at": "2026-10-29T15:53:45.582149379Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "db2b8f0c-a7b9-4ebf-9cdf-9dd11d3295b7",
  "code": "758470",
  "device_ref": "sandbox-3651"
}
```

```json
{
  "session_id": "ab50f47a-fdd2-4af4-9f9d-9df95e7618df",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDEyNSwiaWF0IjoxNzkzMjg5MjI1LCJqdGkiOiI4MDczNjY3NC1mOWFjLTQ0NDEtYWYyZC1kNjk1ZGEzZmU2MWEiLCJzaWQiOiJhYjUwZjQ3YS1mZGQyLTRhZjQtOWY5ZC05ZGY5NWU3NjE4ZGYifQ.sT-y1OrLTQrUTrSzmiIzkoqKR-3v62soXuo6OC4oX8s",
  "access_expires_at": "2026-10-29T16:08:45.897306681Z",
  "refresh_token": "rqFr-eT6PMfIf3ASdKVA9Zul9-QJP3vGzX4wY2a8YwQ",
  "refresh_expires_at": "2026-11-28T15:53:45.896779773Z",
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
      "actor_id": "84015309-667b-408e-9731-2b3c5e734ac0",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T15:53:28.652519Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "84015309-667b-408e-9731-2b3c5e734ac0",
      "reason": "Sandbox clean-up",
      "at": "2026-10-29T15:53:30.118323Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "5d6dcad3-71b1-4939-8add-31f240ec9441",
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
  "device_ref": "sandbox-6874"
}
```

```json
{
  "challenge_id": "339c3ba8-cd55-4ed9-a43c-ce8391d8c3c0",
  "expires_at": "2026-10-29T15:58:47.062361167Z",
  "resend_available_at": "2026-10-29T15:53:48.062361167Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "454881",
  "sent_at": "2026-10-29T15:53:47.065061779Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "339c3ba8-cd55-4ed9-a43c-ce8391d8c3c0",
  "code": "454881",
  "device_ref": "sandbox-6874"
}
```

```json
{
  "session_id": "42b239ad-e3e0-4eab-9057-c007aba59345",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDEyNywiaWF0IjoxNzkzMjg5MjI3LCJqdGkiOiI4OWU1ZGQzMS04MTQ3LTRlYmUtOWUwZS05OWUzYjJlZTQwMzkiLCJzaWQiOiI0MmIyMzlhZC1lM2UwLTRlYWItOTA1Ny1jMDA3YWJhNTkzNDUifQ.vvvAzl-0SnrgEU96T7MhCIr3SOES4Wxkh6h6qoX1F9Q",
  "access_expires_at": "2026-10-29T16:08:47.378618774Z",
  "refresh_token": "zWe3VgSi0RjVv73vINe-oqiv5qzji3bEgPC7bjtWp1U",
  "refresh_expires_at": "2026-11-28T15:53:47.378050039Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "336049d2-08f1-427f-978e-9a86ced93b35",
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
  "last_heartbeat_at": "2026-10-29T15:53:10.967188Z",
  "last_location_at": "2026-10-29T15:53:10.967188Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/336049d2-08f1-427f-978e-9a86ced93b35/handover` → **200**

```json
{
  "command_id": "d6dec080-dd21-48e3-a08d-e2a57b5188b5",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "336049d2-08f1-427f-978e-9a86ced93b35",
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
  "last_heartbeat_at": "2026-10-29T15:53:10.967188Z",
  "last_location_at": "2026-10-29T15:53:10.967188Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/336049d2-08f1-427f-978e-9a86ced93b35/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:53:48Z",
    "sequence": 1793289228258
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "336049d2-08f1-427f-978e-9a86ced93b35",
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
  "last_heartbeat_at": "2026-10-29T15:53:48.279541Z",
  "last_location_at": "2026-10-29T15:53:48.279541Z",
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
  "command_id": "9ba1c71f-d0c2-4531-879c-d45d07ba80cd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:53:48Z",
    "sequence": 1793289228845
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2d1496a9-7547-4e34-b109-c7893ceb5aee",
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
  "last_heartbeat_at": "2026-10-29T15:53:48.864728Z",
  "last_location_at": "2026-10-29T15:53:48.864728Z",
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
  "session_id": "4d3b357b-9ccd-4801-8d4b-3dba95f2d2fe",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAxMjksImlhdCI6MTc5MzI4OTIyOSwianRpIjoiNjU2MDQ3NjEtMWI3ZC00Yzg0LTgwN2YtNTRmMTMxYWI2MTY4Iiwic2lkIjoiNGQzYjM1N2ItOWNjZC00ODAxLThkNGItM2RiYTk1ZjJkMmZlIn0.cfJFYel_PMSklwhjAIZS_M3XwOgc3Phvp6DgsgloEbw",
  "access_expires_at": "2026-10-29T16:08:49.461284105Z",
  "refresh_token": "KsoAUFrmFfJmqS2RK-frYIuKwPO2NXy0op0L-f_6S7U",
  "refresh_expires_at": "2026-10-30T03:53:49.460749074Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "213604ea-56a9-41aa-9ad3-33eaa7ac2db5",
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
  "id": "dc225c9b-af14-40da-afb3-0dbf31fada59",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:58:49.756009Z",
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
  "command_id": "5b68b381-7102-4b45-9c15-1aa3e06b011d",
  "quote_id": "dc225c9b-af14-40da-afb3-0dbf31fada59",
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
  "id": "fa626f73-0f22-494c-bf31-f9ab4a57be1b",
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
  "created_at": "2026-10-29T15:53:50.062374Z",
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
    "id": "61356e65-d073-4267-bb52-5bab4181c10c",
    "order_id": "fa626f73-0f22-494c-bf31-f9ab4a57be1b",
    "expires_at": "2026-10-29T15:54:05.065978Z",
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

`POST /api/driver/v1/offers/61356e65-d073-4267-bb52-5bab4181c10c/accept` → **200**

```json
{
  "command_id": "649a89b9-d97c-4a2c-ad39-bb8003f1eb04"
}
```

```json
{
  "id": "70faf782-a807-496b-83a6-513c3e5e0476",
  "order_id": "fa626f73-0f22-494c-bf31-f9ab4a57be1b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "76eb562e-03b2-42cc-add0-6201792f627c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "76eb562e-03b2-42cc-add0-6201792f627c",
  "order_id": "fa626f73-0f22-494c-bf31-f9ab4a57be1b",
  "assignment_id": "70faf782-a807-496b-83a6-513c3e5e0476",
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

`POST /api/driver/v1/work-sessions/2d1496a9-7547-4e34-b109-c7893ceb5aee/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:53:51Z",
    "sequence": 1793289231532
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2d1496a9-7547-4e34-b109-c7893ceb5aee",
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
  "last_heartbeat_at": "2026-10-29T15:53:51.55126Z",
  "last_location_at": "2026-10-29T15:53:51.55126Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/76eb562e-03b2-42cc-add0-6201792f627c/arrive` → **200**

```json
{
  "command_id": "9426c730-8375-4e82-a0b5-ff7a500bc693",
  "expected_version": 0
}
```

```json
{
  "id": "76eb562e-03b2-42cc-add0-6201792f627c",
  "order_id": "fa626f73-0f22-494c-bf31-f9ab4a57be1b",
  "assignment_id": "70faf782-a807-496b-83a6-513c3e5e0476",
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
  "arrived_at": "2026-10-29T15:53:51.847455Z",
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

`POST /api/driver/v1/trips/76eb562e-03b2-42cc-add0-6201792f627c/start` → **200**

```json
{
  "command_id": "a8ebbc70-47e8-42e4-8e62-752f912b036f",
  "expected_version": 1
}
```

```json
{
  "id": "76eb562e-03b2-42cc-add0-6201792f627c",
  "order_id": "fa626f73-0f22-494c-bf31-f9ab4a57be1b",
  "assignment_id": "70faf782-a807-496b-83a6-513c3e5e0476",
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
  "arrived_at": "2026-10-29T15:53:51.847455Z",
  "started_at": "2026-10-29T15:53:52.146663Z",
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

`POST /api/driver/v1/trips/76eb562e-03b2-42cc-add0-6201792f627c/complete` → **200**

```json
{
  "command_id": "ed3847d0-2501-4771-b93a-597919d3764b",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:53:52Z",
  "cash_received": true
}
```

```json
{
  "id": "76eb562e-03b2-42cc-add0-6201792f627c",
  "order_id": "fa626f73-0f22-494c-bf31-f9ab4a57be1b",
  "assignment_id": "70faf782-a807-496b-83a6-513c3e5e0476",
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
  "arrived_at": "2026-10-29T15:53:51.847455Z",
  "started_at": "2026-10-29T15:53:52.146663Z",
  "completed_at": "2026-10-29T15:53:52.45805Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/fa626f73-0f22-494c-bf31-f9ab4a57be1b` → **200**

```json
{
  "id": "fa626f73-0f22-494c-bf31-f9ab4a57be1b",
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
    "id": "70faf782-a807-496b-83a6-513c3e5e0476",
    "order_id": "fa626f73-0f22-494c-bf31-f9ab4a57be1b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "76eb562e-03b2-42cc-add0-6201792f627c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:53:50.062374Z",
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
  "session_id": "336049d2-08f1-427f-978e-9a86ced93b35",
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
  "last_heartbeat_at": "2026-10-29T15:53:48.279541Z",
  "last_location_at": "2026-10-29T15:53:48.279541Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/336049d2-08f1-427f-978e-9a86ced93b35/close` → **200**

```json
{
  "command_id": "ca8da809-4a88-45a9-8451-e913a1ad4293",
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
  "session_id": "2d1496a9-7547-4e34-b109-c7893ceb5aee",
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
  "last_heartbeat_at": "2026-10-29T15:53:51.55126Z",
  "last_location_at": "2026-10-29T15:53:51.55126Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2d1496a9-7547-4e34-b109-c7893ceb5aee/close` → **200**

```json
{
  "command_id": "64248c20-84a0-4a5d-95a8-2aab3ed68575",
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

Done: terminal order fa626f73-0f22-494c-bf31-f9ab4a57be1b by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15347"
}
```

```json
{
  "challenge_id": "16fe3c22-456d-47f2-827a-123f163d5596",
  "expires_at": "2026-10-29T15:58:57.542948392Z",
  "resend_available_at": "2026-10-29T15:53:58.542948392Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "162339",
  "sent_at": "2026-10-29T15:53:57.547051764Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "16fe3c22-456d-47f2-827a-123f163d5596",
  "code": "162339",
  "device_ref": "sandbox-15347"
}
```

```json
{
  "session_id": "927481cc-fab1-4ad9-95e7-ac4f8c4f2b06",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDEzNywiaWF0IjoxNzkzMjg5MjM3LCJqdGkiOiI5Zjk2M2NiMS01YzU2LTQyZjktYjYzZi0wZjMzYWZlN2Y1N2IiLCJzaWQiOiI5Mjc0ODFjYy1mYWIxLTRhZDktOTVlNy1hYzRmOGM0ZjJiMDYifQ.fB3z9s5N9tB3Bdcq_-FBeR4tqVwBG3YNwmbYJ5k68to",
  "access_expires_at": "2026-10-29T16:08:57.855151799Z",
  "refresh_token": "JS_xRXTkwYek_VKcidlINeQk1XOZL5WhMza2wXeUb08",
  "refresh_expires_at": "2026-11-28T15:53:57.854635282Z",
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
  "device_ref": "sandbox-24017"
}
```

```json
{
  "challenge_id": "c7c2a27d-1171-4da3-b28c-7d95c760e947",
  "expires_at": "2026-10-29T15:58:58.42850995Z",
  "resend_available_at": "2026-10-29T15:53:59.42850995Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "735301",
  "sent_at": "2026-10-29T15:53:58.431826015Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c7c2a27d-1171-4da3-b28c-7d95c760e947",
  "code": "735301",
  "device_ref": "sandbox-24017"
}
```

```json
{
  "session_id": "4fc6e2a4-a626-44e4-896e-2af90d2ff081",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDEzOCwiaWF0IjoxNzkzMjg5MjM4LCJqdGkiOiJhZDc2NzNiNS1kYjY4LTQ4Y2YtODVhNS01YzQ1ZDhlYTIwMTYiLCJzaWQiOiI0ZmM2ZTJhNC1hNjI2LTQ0ZTQtODk2ZS0yYWY5MGQyZmYwODEifQ.uvx6vgBJgl_lopeygYqvbYze6fUMEXrKq0_LBe7RJZk",
  "access_expires_at": "2026-10-29T16:08:58.754766718Z",
  "refresh_token": "PkGBxAFU6lWXJtGJxnYSkmPkhyTUfguDaxw09IANjBk",
  "refresh_expires_at": "2026-11-28T15:53:58.754213312Z",
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
  "device_ref": "sandbox-2685"
}
```

```json
{
  "challenge_id": "abe1b98b-916c-4f88-bedf-f59be49d27d5",
  "expires_at": "2026-10-29T15:58:59.330191384Z",
  "resend_available_at": "2026-10-29T15:54:00.330191384Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "425699",
  "sent_at": "2026-10-29T15:53:59.33285033Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "abe1b98b-916c-4f88-bedf-f59be49d27d5",
  "code": "425699",
  "device_ref": "sandbox-2685"
}
```

```json
{
  "session_id": "cfd8d2ea-e7e4-476d-8942-a9312b8a0330",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDEzOSwiaWF0IjoxNzkzMjg5MjM5LCJqdGkiOiI5NGNlZTJlYi03MThkLTRjNzQtYWYyNC1lZWYyNjZmZWY3NmMiLCJzaWQiOiJjZmQ4ZDJlYS1lN2U0LTQ3NmQtODk0Mi1hOTMxMmI4YTAzMzAifQ.t2qgg6L5s3waMPDfpVCLnaNAr-OXwLoQGPlPLTwKolw",
  "access_expires_at": "2026-10-29T16:08:59.645844863Z",
  "refresh_token": "ZXfAaZ5r42YoyCnuqk6h_9IaIeAgc3xhQbEdVDqsTZw",
  "refresh_expires_at": "2026-11-28T15:53:59.645275528Z",
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
  "phone": "+380692223335",
  "device_ref": "sandbox-14841"
}
```

```json
{
  "challenge_id": "48fa19a9-5245-4921-96cd-602d37f9793c",
  "expires_at": "2026-10-29T15:59:00.210828756Z",
  "resend_available_at": "2026-10-29T15:54:01.210828756Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380692223335` → **200**

```json
{
  "phone": "+380692223335",
  "audience": "CLIENT",
  "code": "615823",
  "sent_at": "2026-10-29T15:54:00.213313235Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "48fa19a9-5245-4921-96cd-602d37f9793c",
  "code": "615823",
  "device_ref": "sandbox-14841"
}
```

```json
{
  "session_id": "4d886a17-6903-4718-afb3-ea90268a63ca",
  "subject": {
    "type": "CLIENT",
    "id": "8afe0026-168b-4054-a742-19c419d8045a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YWZlMDAyNi0xNjhiLTQwNTQtYTc0Mi0xOWM0MTlkODA0NWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMTQwLCJpYXQiOjE3OTMyODkyNDAsImp0aSI6IjVlYTIzM2QyLWYyYTYtNDhmYS05ODQ0LTYzNzQ3MmNjZjlmMCIsInNpZCI6IjRkODg2YTE3LTY5MDMtNDcxOC1hZmIzLWVhOTAyNjhhNjNjYSJ9.StgMUWgnzMQgvO8_U8D957ZOsn453p3sDn5xbmvijF4",
  "access_expires_at": "2026-10-29T16:09:00.524591062Z",
  "refresh_token": "wPZaFV4WithdhxBm5YbqesjI1YQbr2b6U8SrhflxYmE",
  "refresh_expires_at": "2026-11-28T15:54:00.524045776Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c75794de-f03d-4af6-bf0a-3056391d49ae",
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
  "id": "ff8e932c-2df7-4fb2-909f-09b5689bb2ea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:59:00.824869Z",
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
  "command_id": "68793101-5c1e-4d33-8c9d-8cab9014c824",
  "quote_id": "ff8e932c-2df7-4fb2-909f-09b5689bb2ea",
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
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:01.130719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:54:01.130719Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 14.961243464
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.200559491
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

`GET /api/rider/v1/orders/8fc40b45-bf24-4985-9fb1-e149b199140c` → **200**

```json
{
  "id": "8fc40b45-bf24-4985-9fb1-e149b199140c",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8afe0026-168b-4054-a742-19c419d8045a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:54:01.130719Z",
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
  "session_id": "2cf9a2d1-99c3-4555-a489-979c6bd973a3",
  "subject": {
    "type": "STAFF",
    "id": "84015309-667b-408e-9731-2b3c5e734ac0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAxNTMwOS02NjdiLTQwOGUtOTczMS0yYjNjNWU3MzRhYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAzMjMsImlhdCI6MTc5MzI4OTQyMywianRpIjoiY2Y1MTE1MjAtNjgwNS00NDYwLWE1OTYtZTA5OTcwYTNkN2E4Iiwic2lkIjoiMmNmOWEyZDEtOTljMy00NTU1LWE0ODktOTc5YzZiZDk3M2EzIn0.sF-Q7iIZVnzKzzSfLJ_yXzP2KWnUPiyNIXEeoyDS9Js",
  "access_expires_at": "2026-10-29T16:12:03.100886159Z",
  "refresh_token": "FHvTB4VxHnukAgUJ0WxWGlyRjS8GYNbHJ5jmUq4rEkI",
  "refresh_expires_at": "2026-10-30T03:57:03.100139113Z",
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
  "id": "1321de9f-fa2a-412e-8e34-62f09c5067dd",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:57:03.412253Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:57:03.412372Z",
  "updated_at": "2026-10-29T15:57:03.428857Z",
  "finished_at": "2026-10-29T15:57:03.428857Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/1321de9f-fa2a-412e-8e34-62f09c5067dd` → **200**

```json
{
  "run": {
    "id": "1321de9f-fa2a-412e-8e34-62f09c5067dd",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T15:57:03.412253Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T15:57:03.412372Z",
    "updated_at": "2026-10-29T15:57:03.428857Z",
    "finished_at": "2026-10-29T15:57:03.428857Z",
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
  "id": "1321de9f-fa2a-412e-8e34-62f09c5067dd",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:57:03.412253Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:57:03.412372Z",
  "updated_at": "2026-10-29T15:57:03.428857Z",
  "finished_at": "2026-10-29T15:57:03.428857Z",
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
  "id": "1321de9f-fa2a-412e-8e34-62f09c5067dd",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:57:03.412253Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:57:03.412372Z",
  "updated_at": "2026-10-29T15:57:03.428857Z",
  "finished_at": "2026-10-29T15:57:03.428857Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/3745aba5-7297-4a03-a0a6-2f9069c7951f` → **204**

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
  "id": "9ba33fbd-ea63-4e9e-998d-452b7e9333d2",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:57:03.879187Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:57:03.879232Z",
  "updated_at": "2026-10-29T15:57:03.886518Z",
  "finished_at": "2026-10-29T15:57:03.886518Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/9ba33fbd-ea63-4e9e-998d-452b7e9333d2` → **200**

```json
{
  "run": {
    "id": "9ba33fbd-ea63-4e9e-998d-452b7e9333d2",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T15:57:03.879187Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T15:57:03.879232Z",
    "updated_at": "2026-10-29T15:57:03.886518Z",
    "finished_at": "2026-10-29T15:57:03.886518Z",
    "version": 1
  },
  "items": [
    {
      "id": "eea446cf-f594-40e8-b11c-d171826b4031",
      "run_id": "9ba33fbd-ea63-4e9e-998d-452b7e9333d2",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "25b8d525caa355f8335b6b3ed12a5308a3543dd03a47d6ec3b109c155d290703",
      "reference_display": "sandbox-reconciliation-3745aba5-7297-4a03-a0a6-2f9069c7951f",
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
      "provider_at": "2026-10-29T15:57:03Z",
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
  "id": "9ba33fbd-ea63-4e9e-998d-452b7e9333d2",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:57:03.879187Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:57:03.879232Z",
  "updated_at": "2026-10-29T15:57:03.886518Z",
  "finished_at": "2026-10-29T15:57:03.886518Z",
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
  "id": "9ba33fbd-ea63-4e9e-998d-452b7e9333d2",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:57:03.879187Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:57:03.879232Z",
  "updated_at": "2026-10-29T15:57:03.886518Z",
  "finished_at": "2026-10-29T15:57:03.886518Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/eea446cf-f594-40e8-b11c-d171826b4031/resolve` → **200**

```json
{
  "command_id": "23baf60f-05a3-4b56-ac44-34de574cbcb5",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "eea446cf-f594-40e8-b11c-d171826b4031",
  "run_id": "9ba33fbd-ea63-4e9e-998d-452b7e9333d2",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "25b8d525caa355f8335b6b3ed12a5308a3543dd03a47d6ec3b109c155d290703",
  "reference_display": "sandbox-reconciliation-3745aba5-7297-4a03-a0a6-2f9069c7951f",
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
  "provider_at": "2026-10-29T15:57:03Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "84015309-667b-408e-9731-2b3c5e734ac0",
  "resolved_at": "2026-10-29T15:57:04.316073Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/eea446cf-f594-40e8-b11c-d171826b4031/resolve` → **200**

```json
{
  "command_id": "23baf60f-05a3-4b56-ac44-34de574cbcb5",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "eea446cf-f594-40e8-b11c-d171826b4031",
  "run_id": "9ba33fbd-ea63-4e9e-998d-452b7e9333d2",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "25b8d525caa355f8335b6b3ed12a5308a3543dd03a47d6ec3b109c155d290703",
  "reference_display": "sandbox-reconciliation-3745aba5-7297-4a03-a0a6-2f9069c7951f",
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
  "provider_at": "2026-10-29T15:57:03Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "84015309-667b-408e-9731-2b3c5e734ac0",
  "resolved_at": "2026-10-29T15:57:04.316073Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/eea446cf-f594-40e8-b11c-d171826b4031/resolve` → **409**

```json
{
  "command_id": "0dd4924d-1c20-4a9e-b05b-fc07010c9f66",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/eea446cf-f594-40e8-b11c-d171826b4031/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "2fe44914-c474-45ba-b404-5344641403f2"
}
```

`GET /api/admin/v1/payment-reconciliations/9ba33fbd-ea63-4e9e-998d-452b7e9333d2` → **200**

```json
{
  "run": {
    "id": "9ba33fbd-ea63-4e9e-998d-452b7e9333d2",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T15:57:03.879187Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T15:57:03.879232Z",
    "updated_at": "2026-10-29T15:57:04.316073Z",
    "finished_at": "2026-10-29T15:57:03.886518Z",
    "version": 2
  },
  "items": [
    {
      "id": "eea446cf-f594-40e8-b11c-d171826b4031",
      "run_id": "9ba33fbd-ea63-4e9e-998d-452b7e9333d2",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "25b8d525caa355f8335b6b3ed12a5308a3543dd03a47d6ec3b109c155d290703",
      "reference_display": "sandbox-reconciliation-3745aba5-7297-4a03-a0a6-2f9069c7951f",
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
      "provider_at": "2026-10-29T15:57:03Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "84015309-667b-408e-9731-2b3c5e734ac0",
      "resolved_at": "2026-10-29T15:57:04.316073Z",
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
      "id": "9ba33fbd-ea63-4e9e-998d-452b7e9333d2",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-29T15:57:03.879187Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T15:57:03.879232Z",
      "updated_at": "2026-10-29T15:57:04.316073Z",
      "finished_at": "2026-10-29T15:57:03.886518Z",
      "version": 2
    },
    {
      "id": "bffa25ac-fef3-4ef5-8430-f044813a4b69",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-28",
      "period_from": "2026-10-27T22:00:00Z",
      "period_to": "2026-10-29T02:00:00Z",
      "observed_until": "2026-10-29T15:49:11.545188Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T15:49:11.545381Z",
      "updated_at": "2026-10-29T15:49:11.551218Z",
      "finished_at": "2026-10-29T15:49:11.551218Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/3745aba5-7297-4a03-a0a6-2f9069c7951f` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29"
}
```

```json
{
  "id": "9ba33fbd-ea63-4e9e-998d-452b7e9333d2",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:57:03.879187Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:57:03.879232Z",
  "updated_at": "2026-10-29T15:57:04.316073Z",
  "finished_at": "2026-10-29T15:57:03.886518Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.79328954674E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793289547021E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793289547021E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.79328954678E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793289547022E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
