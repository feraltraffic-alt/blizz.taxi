# Sandbox transcript (2026-10-29T08:27:58Z, 15036ce)

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
  "correlation_id": "853cd252-4347-40db-9886-8f8438fa47e8"
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
  "session_id": "61f1d175-ae7f-4870-bd85-0f7ef4ba5633",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjMzODcsImlhdCI6MTc5MzI2MjQ4NywianRpIjoiYjRmNDA1NGQtMDFkZS00NWQ3LWI0YzQtYzM5NmQxYmJhMTcxIiwic2lkIjoiNjFmMWQxNzUtYWU3Zi00ODcwLWJkODUtMGY3ZWY0YmE1NjMzIn0.cRJ3grg9BpK2wOzYvn9p5ePhC_hzD3Wdt-RVROrtTsw",
  "access_expires_at": "2026-10-29T08:43:07.726727707Z",
  "refresh_token": "oVw3m6hM1pG_p_63eZ0OL3qrnBdjxnGCpDJ4wQEGKpI",
  "refresh_expires_at": "2026-10-29T20:28:07.724597665Z",
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
  "session_id": "60152ab4-a07a-44b8-9ab7-49558d2619a3",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjMzODksImlhdCI6MTc5MzI2MjQ4OSwianRpIjoiYjY5ZjZiMzQtMGUxYS00NjNjLTlkMTgtN2Y2NzA2YjNlYjI3Iiwic2lkIjoiNjAxNTJhYjQtYTA3YS00NGI4LTlhYjctNDk1NThkMjYxOWEzIn0.JlTMgDHiYrO7VksXpD3Q4qBspjmJ7LdTap_vH_m8ZoU",
  "access_expires_at": "2026-10-29T08:43:09.263611525Z",
  "refresh_token": "pPWW48eCVDD2_B4UMhv9AYf8vAWLXptAls7q0scFH20",
  "refresh_expires_at": "2026-10-29T20:28:09.262692291Z",
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
  "device_ref": "sandbox-32470"
}
```

```json
{
  "challenge_id": "fd6e17b4-bc7c-4981-b4ac-a20ffebfe5fc",
  "expires_at": "2026-10-29T08:33:09.865264442Z",
  "resend_available_at": "2026-10-29T08:28:10.865264442Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "928172",
  "sent_at": "2026-10-29T08:28:09.874208114Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fd6e17b4-bc7c-4981-b4ac-a20ffebfe5fc",
  "code": "928172",
  "device_ref": "sandbox-32470"
}
```

```json
{
  "session_id": "bc928c1f-0e2e-401e-bead-db9ba5f43a2e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MzM5MCwiaWF0IjoxNzkzMjYyNDkwLCJqdGkiOiIwM2FiNTg4ZC05OWNmLTQ4NDAtYTY2MS02NTUxNjE4MWRiOGMiLCJzaWQiOiJiYzkyOGMxZi0wZTJlLTQwMWUtYmVhZC1kYjliYTVmNDNhMmUifQ.HOClQzH5FauLeApONWWGZVHRYJzvretorZOZv6b4s1g",
  "access_expires_at": "2026-10-29T08:43:10.204252663Z",
  "refresh_token": "wRo_BJgiAnzk0hl88ys7yDnRgR6WUj4_7XPWg4k2F9k",
  "refresh_expires_at": "2026-11-28T08:28:10.202951926Z",
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
  "command_id": "69ff1edc-3ade-4de0-b015-7c08bd16cd20",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:28:10Z",
    "sequence": 1793262490785
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d3107d78-e943-4a8c-8418-237286097f98",
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
  "last_heartbeat_at": "2026-10-29T08:28:10.913787Z",
  "last_location_at": "2026-10-29T08:28:10.913787Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636687447",
  "device_ref": "sandbox-18546"
}
```

```json
{
  "challenge_id": "abf4ed57-f8f6-457b-aa2d-0ebfc1562f6d",
  "expires_at": "2026-10-29T08:33:11.207887684Z",
  "resend_available_at": "2026-10-29T08:28:12.207887684Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636687447` → **200**

```json
{
  "phone": "+380636687447",
  "audience": "CLIENT",
  "code": "288460",
  "sent_at": "2026-10-29T08:28:11.211485294Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "abf4ed57-f8f6-457b-aa2d-0ebfc1562f6d",
  "code": "288460",
  "device_ref": "sandbox-18546"
}
```

```json
{
  "session_id": "6b0d2393-d019-4164-b2ae-abc2d00a1708",
  "subject": {
    "type": "CLIENT",
    "id": "f33a8d7d-cc85-4bb8-9e76-14f22423c4ea"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMzNhOGQ3ZC1jYzg1LTRiYjgtOWU3Ni0xNGYyMjQyM2M0ZWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzMzkxLCJpYXQiOjE3OTMyNjI0OTEsImp0aSI6Ijk5ZjllYjgyLWVmYzYtNDBlYy1iYmQ1LTA4NWI0ZWNlYzM3NyIsInNpZCI6IjZiMGQyMzkzLWQwMTktNDE2NC1iMmFlLWFiYzJkMDBhMTcwOCJ9.DTd-Ed3H_4TuQeGXQ5etssN0NFbD8-1oBkcUlS8YIb0",
  "access_expires_at": "2026-10-29T08:43:11.549295544Z",
  "refresh_token": "aU2ScfnUVjGWcg_n5nYVGCuhmyNlTAVTVSmiYEjLZCM",
  "refresh_expires_at": "2026-11-28T08:28:11.548163671Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "526c0a99-78c8-4f04-a1f4-8f01a46c7d04",
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
  "id": "427ceb47-7660-44e7-a627-720be3fe4897",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:33:11.878482Z",
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
  "command_id": "83554ac2-1629-48db-bd93-2ac549a37920",
  "quote_id": "427ceb47-7660-44e7-a627-720be3fe4897",
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
  "id": "504e2b50-3d20-4556-961b-183897656c46",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f33a8d7d-cc85-4bb8-9e76-14f22423c4ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T08:28:12.292235Z",
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
    "id": "7593d7a1-55f1-43ae-8f8c-c0f55d8cbbc4",
    "order_id": "504e2b50-3d20-4556-961b-183897656c46",
    "expires_at": "2026-10-29T08:28:27.302582Z",
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

`POST /api/driver/v1/offers/7593d7a1-55f1-43ae-8f8c-c0f55d8cbbc4/accept` → **200**

```json
{
  "command_id": "61ba0da2-6e29-40fd-a61b-25a947c20744"
}
```

```json
{
  "id": "2062ee20-d9e8-4822-80f8-8fff3992bce7",
  "order_id": "504e2b50-3d20-4556-961b-183897656c46",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dc05f205-c1fb-4d24-bc03-14ef631d0b7a",
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
  "command_id": "c6b8b573-8e95-4942-8f7c-2a677043f00c",
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
  "changed_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T08:28:13.575068356Z"
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
  "id": "dc05f205-c1fb-4d24-bc03-14ef631d0b7a",
  "order_id": "504e2b50-3d20-4556-961b-183897656c46",
  "assignment_id": "2062ee20-d9e8-4822-80f8-8fff3992bce7",
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

`POST /api/driver/v1/work-sessions/d3107d78-e943-4a8c-8418-237286097f98/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:28:14Z",
    "sequence": 1793262494464
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d3107d78-e943-4a8c-8418-237286097f98",
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
  "last_heartbeat_at": "2026-10-29T08:28:14.491917Z",
  "last_location_at": "2026-10-29T08:28:14.491917Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/dc05f205-c1fb-4d24-bc03-14ef631d0b7a/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "d1e42b8e-642b-4572-9602-89d9fd618032",
  "expected_version": 0
}
```

```json
{
  "id": "dc05f205-c1fb-4d24-bc03-14ef631d0b7a",
  "order_id": "504e2b50-3d20-4556-961b-183897656c46",
  "assignment_id": "2062ee20-d9e8-4822-80f8-8fff3992bce7",
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
  "arrived_at": "2026-10-29T08:28:14.795333Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/dc05f205-c1fb-4d24-bc03-14ef631d0b7a/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "30fea18a-603e-4d9a-843c-95271ecaec97",
  "expected_version": 1
}
```

```json
{
  "id": "dc05f205-c1fb-4d24-bc03-14ef631d0b7a",
  "order_id": "504e2b50-3d20-4556-961b-183897656c46",
  "assignment_id": "2062ee20-d9e8-4822-80f8-8fff3992bce7",
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
  "arrived_at": "2026-10-29T08:28:14.795333Z",
  "started_at": "2026-10-29T08:28:15.107869Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/dc05f205-c1fb-4d24-bc03-14ef631d0b7a/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "195ebab5-73dd-4b3b-bb05-5eea02c9ab27",
  "expected_version": 2,
  "reported_at": "2026-10-29T08:28:15Z",
  "cash_received": true
}
```

```json
{
  "id": "dc05f205-c1fb-4d24-bc03-14ef631d0b7a",
  "order_id": "504e2b50-3d20-4556-961b-183897656c46",
  "assignment_id": "2062ee20-d9e8-4822-80f8-8fff3992bce7",
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
  "arrived_at": "2026-10-29T08:28:14.795333Z",
  "started_at": "2026-10-29T08:28:15.107869Z",
  "completed_at": "2026-10-29T08:28:15.42235Z",
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
  "session_id": "d3107d78-e943-4a8c-8418-237286097f98",
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
  "last_heartbeat_at": "2026-10-29T08:28:14.491917Z",
  "last_location_at": "2026-10-29T08:28:14.491917Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d3107d78-e943-4a8c-8418-237286097f98/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "9ec00783-a0aa-4376-85f0-534bceeadbac",
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
  "command_id": "f927654f-62ab-43d6-b3cc-779daf9ebbe0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:28:16Z",
    "sequence": 1793262496351
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
  "correlation_id": "d7fc85e0-fdb4-4233-902d-a0405bf0ae6b",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "b39ffb76-d93f-47ec-bfff-67f4633ba2d5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:28:16Z",
    "sequence": 1793262496668
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "417fe816-4876-4ad3-aa95-80d54a86f4ca",
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
  "last_heartbeat_at": "2026-10-29T08:28:16.690579Z",
  "last_location_at": "2026-10-29T08:28:16.690579Z",
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
  "changed_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T08:28:13.575068Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "1670ea45-f46d-46ea-bf0d-f37a3246c6ca",
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
  "changed_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T08:28:17.290905748Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "417fe816-4876-4ad3-aa95-80d54a86f4ca",
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
  "last_heartbeat_at": "2026-10-29T08:28:16.690579Z",
  "last_location_at": "2026-10-29T08:28:16.690579Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/417fe816-4876-4ad3-aa95-80d54a86f4ca/close` → **200**

```json
{
  "command_id": "4b7ea58b-42c5-4b0a-a08d-ef0826a6549d",
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
  "session_id": "e102d099-6f07-46da-9083-553c102802d0",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjMzOTgsImlhdCI6MTc5MzI2MjQ5OCwianRpIjoiOGM0ZTBlYzItYjdkMC00Y2M3LTljM2UtOTM4NzBkZTI3OTllIiwic2lkIjoiZTEwMmQwOTktNmYwNy00NmRhLTkwODMtNTUzYzEwMjgwMmQwIn0.iTgFPoPdGnWQQuQNouzIU9R6x9kjKM99T9qh6Ne8HWo",
  "access_expires_at": "2026-10-29T08:43:18.480323317Z",
  "refresh_token": "ZZUP-Se9fZV3997pd0QkzNEAL0mHnpEtgfF1tpbWePc",
  "refresh_expires_at": "2026-10-29T20:28:18.479505204Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "d68ab485-f6b0-4493-baec-240c1154a775",
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
  "id": "579ab018-5f3f-4c40-9501-5b64d410565f",
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
  "created_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
  "created_at": "2026-10-29T08:28:18.783811Z",
  "updated_at": "2026-10-29T08:28:18.783811Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630289486",
  "device_ref": "sandbox-23532"
}
```

```json
{
  "challenge_id": "6b185b9e-2bd5-48c2-b8d4-acd48c316af8",
  "expires_at": "2026-10-29T08:33:19.101428107Z",
  "resend_available_at": "2026-10-29T08:28:20.101428107Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630289486` → **200**

```json
{
  "phone": "+380630289486",
  "audience": "CLIENT",
  "code": "158326",
  "sent_at": "2026-10-29T08:28:19.105881142Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6b185b9e-2bd5-48c2-b8d4-acd48c316af8",
  "code": "158326",
  "device_ref": "sandbox-23532"
}
```

```json
{
  "session_id": "809f002c-485e-4c8e-80b6-5423318d5bc8",
  "subject": {
    "type": "CLIENT",
    "id": "761eb685-70a2-40c3-a41d-261fd158288d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NjFlYjY4NS03MGEyLTQwYzMtYTQxZC0yNjFmZDE1ODI4OGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzMzk5LCJpYXQiOjE3OTMyNjI0OTksImp0aSI6IjJmNTJhNzhmLWFmOTUtNDkxYi1iYTg2LTFiMzdjYzNkZTc3MiIsInNpZCI6IjgwOWYwMDJjLTQ4NWUtNGM4ZS04MGI2LTU0MjMzMThkNWJjOCJ9.k9X8BbnLbmIOXKnEnJZ6t5WwXRYPm_p6UdvLHVZnCMo",
  "access_expires_at": "2026-10-29T08:43:19.454291275Z",
  "refresh_token": "NKN-Lzl293nTed_oAqyTvM1z911f9RJN8hpjd5plLY8",
  "refresh_expires_at": "2026-11-28T08:28:19.453418546Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380630289486` → **200**

```json
{
  "client_id": "761eb685-70a2-40c3-a41d-261fd158288d"
}
```

`POST /api/admin/v1/rider-wallets/761eb685-70a2-40c3-a41d-261fd158288d/top-ups` → **201**

```json
{
  "command_id": "2c6f560e-f5cd-4d25-894e-202cf7862b36",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "761eb685-70a2-40c3-a41d-261fd158288d",
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
      "id": "550e1a1a-b990-4264-9ec0-abb67dc109ff",
      "at": "2026-10-29T08:28:20.087488Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "85782d39-1a26-4896-83e2-d51f63705ba3",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f82249fa-b632-4941-a357-d57aa93b91a8",
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
  "id": "c4d98ed6-22d3-428a-87da-c311c281ae1e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:33:20.403600Z",
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
      "id": "579ab018-5f3f-4c40-9501-5b64d410565f",
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
  "device_ref": "sandbox-17427"
}
```

```json
{
  "challenge_id": "60f09a74-dae3-4c5c-853d-5dc6e1ed42ce",
  "expires_at": "2026-10-29T08:33:20.706400354Z",
  "resend_available_at": "2026-10-29T08:28:21.706400354Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "102799",
  "sent_at": "2026-10-29T08:28:20.709919574Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "60f09a74-dae3-4c5c-853d-5dc6e1ed42ce",
  "code": "102799",
  "device_ref": "sandbox-17427"
}
```

```json
{
  "session_id": "ca64cd25-35f2-4f58-bb50-c8473e345a66",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MzQwMSwiaWF0IjoxNzkzMjYyNTAxLCJqdGkiOiIwMThlMjRhMC1jMTVjLTRjNTgtODY0MC1kYjk4M2Q4YTdkMDYiLCJzaWQiOiJjYTY0Y2QyNS0zNWYyLTRmNTgtYmI1MC1jODQ3M2UzNDVhNjYifQ.QlPaDOgQyu8Ua5XIGqwtS1hfeXivIWokWzW_pwQPAkI",
  "access_expires_at": "2026-10-29T08:43:21.02125686Z",
  "refresh_token": "2QkcaGaYITi8wNzy-i0OZpV8gJ1mLI4CUp7PN1ntOto",
  "refresh_expires_at": "2026-11-28T08:28:21.020495195Z",
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
  "command_id": "5ffb144f-0498-4bc5-af39-632745d92b1f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:28:21Z",
    "sequence": 1793262501583
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "69caf0c5-6835-4458-a453-a1a929984667",
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
  "last_heartbeat_at": "2026-10-29T08:28:21.609388Z",
  "last_location_at": "2026-10-29T08:28:21.609388Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "af210caf-c49c-4ce3-ab9b-fad678965292",
  "quote_id": "c4d98ed6-22d3-428a-87da-c311c281ae1e",
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
  "id": "c4260047-dd70-405f-9a20-4c8ea563d5ea",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "761eb685-70a2-40c3-a41d-261fd158288d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T08:28:21.926561Z",
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
  "client_id": "761eb685-70a2-40c3-a41d-261fd158288d",
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
      "id": "550e1a1a-b990-4264-9ec0-abb67dc109ff",
      "at": "2026-10-29T08:28:20.087488Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "85782d39-1a26-4896-83e2-d51f63705ba3",
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
    "id": "f5ea14ca-1368-4452-bfcd-2e0dd90d4721",
    "order_id": "c4260047-dd70-405f-9a20-4c8ea563d5ea",
    "expires_at": "2026-10-29T08:28:36.936669Z",
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

`POST /api/driver/v1/offers/f5ea14ca-1368-4452-bfcd-2e0dd90d4721/accept` → **200**

```json
{
  "command_id": "2b41a377-8c9a-4d63-99b3-d98fc4186db6"
}
```

```json
{
  "id": "bf931a27-51be-4ff0-a079-1a39e96104b7",
  "order_id": "c4260047-dd70-405f-9a20-4c8ea563d5ea",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a160abde-1ad2-4112-9166-91df092fdd55",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a160abde-1ad2-4112-9166-91df092fdd55",
  "order_id": "c4260047-dd70-405f-9a20-4c8ea563d5ea",
  "assignment_id": "bf931a27-51be-4ff0-a079-1a39e96104b7",
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

`POST /api/driver/v1/work-sessions/69caf0c5-6835-4458-a453-a1a929984667/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:28:23Z",
    "sequence": 1793262503384
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "69caf0c5-6835-4458-a453-a1a929984667",
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
  "last_heartbeat_at": "2026-10-29T08:28:23.407136Z",
  "last_location_at": "2026-10-29T08:28:23.407136Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a160abde-1ad2-4112-9166-91df092fdd55/arrive` → **200**

```json
{
  "command_id": "fbb96b09-61cc-4131-a863-c883805e3369",
  "expected_version": 0
}
```

```json
{
  "id": "a160abde-1ad2-4112-9166-91df092fdd55",
  "order_id": "c4260047-dd70-405f-9a20-4c8ea563d5ea",
  "assignment_id": "bf931a27-51be-4ff0-a079-1a39e96104b7",
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
  "arrived_at": "2026-10-29T08:28:23.697521Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a160abde-1ad2-4112-9166-91df092fdd55/start` → **200**

```json
{
  "command_id": "089cdf56-67d9-46f5-b23b-e1d77a3e1f43",
  "expected_version": 1
}
```

```json
{
  "id": "a160abde-1ad2-4112-9166-91df092fdd55",
  "order_id": "c4260047-dd70-405f-9a20-4c8ea563d5ea",
  "assignment_id": "bf931a27-51be-4ff0-a079-1a39e96104b7",
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
  "arrived_at": "2026-10-29T08:28:23.697521Z",
  "started_at": "2026-10-29T08:28:23.994807Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/a160abde-1ad2-4112-9166-91df092fdd55/complete` → **200**

```json
{
  "command_id": "e0f36003-e2af-445b-a49f-72a9a08baf42",
  "expected_version": 2,
  "reported_at": "2026-10-29T08:28:24Z",
  "cash_received": true
}
```

```json
{
  "id": "a160abde-1ad2-4112-9166-91df092fdd55",
  "order_id": "c4260047-dd70-405f-9a20-4c8ea563d5ea",
  "assignment_id": "bf931a27-51be-4ff0-a079-1a39e96104b7",
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
  "arrived_at": "2026-10-29T08:28:23.697521Z",
  "started_at": "2026-10-29T08:28:23.994807Z",
  "completed_at": "2026-10-29T08:28:24.327021Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "761eb685-70a2-40c3-a41d-261fd158288d",
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
      "id": "ab728ec6-9de9-46d0-a2bf-f686f22df792",
      "at": "2026-10-29T08:28:25.092869Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "c4260047-dd70-405f-9a20-4c8ea563d5ea"
    },
    {
      "id": "550e1a1a-b990-4264-9ec0-abb67dc109ff",
      "at": "2026-10-29T08:28:20.087488Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "85782d39-1a26-4896-83e2-d51f63705ba3",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/579ab018-5f3f-4c40-9501-5b64d410565f/archive` → **200**

```json
{
  "command_id": "df24f5fc-f5a2-4fdd-a3d7-0d1fa564c4c2",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "579ab018-5f3f-4c40-9501-5b64d410565f",
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
  "created_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
  "created_at": "2026-10-29T08:28:18.783811Z",
  "updated_at": "2026-10-29T08:28:27.929452Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "69caf0c5-6835-4458-a453-a1a929984667",
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
  "last_heartbeat_at": "2026-10-29T08:28:23.407136Z",
  "last_location_at": "2026-10-29T08:28:23.407136Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/69caf0c5-6835-4458-a453-a1a929984667/close` → **200**

```json
{
  "command_id": "bf565bec-a824-4882-b09f-284c8620812b",
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

Done: order c4260047-dd70-405f-9a20-4c8ea563d5ea.

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
  "session_id": "810bdef5-fc17-486e-b453-69f53fb4a6dc",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM0MDksImlhdCI6MTc5MzI2MjUwOSwianRpIjoiZDhlNzQyYzItNWQ4ZC00MDE3LTg4YmYtMTc5ZDA5ODZjZDMzIiwic2lkIjoiODEwYmRlZjUtZmMxNy00ODZlLWI0NTMtNjlmNTNmYjRhNmRjIn0.PWjfSCthIJy-qFI16-JszXItQM29vo38pcB_Cms320I",
  "access_expires_at": "2026-10-29T08:43:29.130704884Z",
  "refresh_token": "TedqLzdz4nDHK7A-hDg5BmJn13PTwTeqF5jg7OSibHA",
  "refresh_expires_at": "2026-10-29T20:28:29.129982722Z",
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
  "command_id": "0b53d2b2-dfe0-425c-a4a8-239d4ecc2edb",
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
  "session_id": "3ba6173b-a503-4f75-a4fb-6615241e1955",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM0MTAsImlhdCI6MTc5MzI2MjUxMCwianRpIjoiMjc2ZDc5ZjUtNDc1Zi00NjBjLWI1MmYtNGU1MTQ0MDNlZTQxIiwic2lkIjoiM2JhNjE3M2ItYTUwMy00Zjc1LWE0ZmItNjYxNTI0MWUxOTU1In0.f-oSUz7LW0BRbj-YQOV2adsTJUGRiUcAG94inxXODBI",
  "access_expires_at": "2026-10-29T08:43:30.288612456Z",
  "refresh_token": "-e9anC-hGkjb8tjU_sYzyxZs5s94q9s7qErOUVyVcRE",
  "refresh_expires_at": "2026-10-29T20:28:30.287670977Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.286715417",
    "linkedid": "1730052700.286715417",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670216416"
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
    "id": "1730052700.286715417",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "278262c1-f70e-4c42-b5c1-4223eea9861b",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380670216416",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T08:28:30.565547Z",
      "answered_at": null,
      "ended_at": "2026-10-29T08:28:30.592159Z",
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
    "id": "1730052600.2946512876",
    "linkedid": "1730052600.2946512876",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670216416"
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
      "id": "904d80f5-677d-4f7f-beaf-c322c4f90e44",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670216416",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T08:28:30.920921Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/904d80f5-677d-4f7f-beaf-c322c4f90e44/answer` → **200**

```json
{
  "command_id": "a54e32f9-ab05-4027-9a0b-4d3428df2107"
}
```

```json
{
  "id": "904d80f5-677d-4f7f-beaf-c322c4f90e44",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670216416",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
  "order_ids": [],
  "started_at": "2026-10-29T08:28:30.920921Z",
  "answered_at": "2026-10-29T08:28:31.248542Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2946512876",
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
    "id": "1730052600.2946512876",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "904d80f5-677d-4f7f-beaf-c322c4f90e44",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670216416",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
      "order_ids": [],
      "started_at": "2026-10-29T08:28:30.920921Z",
      "answered_at": "2026-10-29T08:28:31.248542Z",
      "ended_at": "2026-10-29T08:28:31.562132Z",
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
      "id": "904d80f5-677d-4f7f-beaf-c322c4f90e44",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670216416",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
      "order_ids": [],
      "started_at": "2026-10-29T08:28:30.920921Z",
      "answered_at": "2026-10-29T08:28:31.248542Z",
      "ended_at": "2026-10-29T08:28:31.562132Z",
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
      "id": "904d80f5-677d-4f7f-beaf-c322c4f90e44",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670216416",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
      "order_ids": [],
      "started_at": "2026-10-29T08:28:30.920921Z",
      "answered_at": "2026-10-29T08:28:31.248542Z",
      "ended_at": "2026-10-29T08:28:31.562132Z",
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
      "id": "904d80f5-677d-4f7f-beaf-c322c4f90e44",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670216416",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
      "order_ids": [],
      "started_at": "2026-10-29T08:28:30.920921Z",
      "answered_at": "2026-10-29T08:28:31.248542Z",
      "ended_at": "2026-10-29T08:28:31.562132Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T08:28:36.760212Z"
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
      "id": "904d80f5-677d-4f7f-beaf-c322c4f90e44",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670216416",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
      "order_ids": [],
      "started_at": "2026-10-29T08:28:30.920921Z",
      "answered_at": "2026-10-29T08:28:31.248542Z",
      "ended_at": "2026-10-29T08:28:31.562132Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T08:28:36.760212Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/904d80f5-677d-4f7f-beaf-c322c4f90e44/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/904d80f5-677d-4f7f-beaf-c322c4f90e44/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=904d80f5-677d-4f7f-beaf-c322c4f90e44` → **200**

```json
{
  "changes": [
    {
      "id": "59545b36-f83e-4ebc-9517-e6135a707660",
      "occurred_at": "2026-10-29T08:28:39.091386Z",
      "actor_type": "STAFF",
      "actor_id": "85782d39-1a26-4896-83e2-d51f63705ba3",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "904d80f5-677d-4f7f-beaf-c322c4f90e44",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"2e0df674-5b38-4c46-9d7e-9bbbbc5965e6\", \"order_ids\": []}",
      "correlation_id": "43c0c79c-3533-4d21-80c6-24fb095b1c3e"
    },
    {
      "id": "5d51da7f-df6f-43b7-9970-2d946f09acc8",
      "occurred_at": "2026-10-29T08:28:39.058062Z",
      "actor_type": "STAFF",
      "actor_id": "85782d39-1a26-4896-83e2-d51f63705ba3",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "904d80f5-677d-4f7f-beaf-c322c4f90e44",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"2e0df674-5b38-4c46-9d7e-9bbbbc5965e6\", \"order_ids\": []}",
      "correlation_id": "f3a3aebf-0906-4bd4-98ca-43383195514d"
    }
  ]
}
```

Done: call 904d80f5-677d-4f7f-beaf-c322c4f90e44 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-11838"
}
```

```json
{
  "challenge_id": "49755753-54d8-4c06-a38b-982458bb49d9",
  "expires_at": "2026-10-29T08:33:39.432121166Z",
  "resend_available_at": "2026-10-29T08:28:40.432121166Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "188240",
  "sent_at": "2026-10-29T08:28:39.43641368Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "49755753-54d8-4c06-a38b-982458bb49d9",
  "code": "188240",
  "device_ref": "sandbox-11838"
}
```

```json
{
  "session_id": "1ca32108-7a51-45ea-9cf1-a69fd42873aa",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MzQxOSwiaWF0IjoxNzkzMjYyNTE5LCJqdGkiOiI2NjNjNTY3Yi01MDQ3LTQzM2QtYjk0YS0xOTVlNTBjYWYzNjkiLCJzaWQiOiIxY2EzMjEwOC03YTUxLTQ1ZWEtOWNmMS1hNjlmZDQyODczYWEifQ.pg0kQt2ZtOmpzcIEfWnvnKlhWBI-h939TJWiWPEZrYA",
  "access_expires_at": "2026-10-29T08:43:39.741793805Z",
  "refresh_token": "KNWfCD6Ez7GQlbGj-diMrj3dbS3Phae--mJtm6RSjnQ",
  "refresh_expires_at": "2026-11-28T08:28:39.741124542Z",
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
  "command_id": "9e3921d5-cf37-4025-b699-59be9cfc06de",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:28:40Z",
    "sequence": 1793262520288
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e1bd0b8f-bc51-440d-a36d-f385a2dbdd93",
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
  "last_heartbeat_at": "2026-10-29T08:28:40.310169Z",
  "last_location_at": "2026-10-29T08:28:40.310169Z",
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
  "session_id": "131cfce7-d89f-4fc9-bd62-219adeed6c4c",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM0MjAsImlhdCI6MTc5MzI2MjUyMCwianRpIjoiYzM1ZDg5ODMtM2QwZS00N2E5LWJmZTAtM2M3NzMxMWIxMDUzIiwic2lkIjoiMTMxY2ZjZTctZDg5Zi00ZmM5LWJkNjItMjE5YWRlZWQ2YzRjIn0.JmoIN1raBXMgKLwu_nW09BjY8AZgEqIv-7U0Csz-nY0",
  "access_expires_at": "2026-10-29T08:43:40.88836033Z",
  "refresh_token": "PI1EWMx6_cBQJ-OkEZY_vaMgu7AN_dYBWVrcYba_NOI",
  "refresh_expires_at": "2026-10-29T20:28:40.887715903Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "5f684458-effe-4830-8da7-0d543ce05df3",
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
  "id": "1581cb9a-541d-43a2-a55b-28e9427a7f93",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:33:41.172679Z",
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
  "command_id": "413c8fa6-22e3-4025-bde5-9dfe5cf18afa",
  "quote_id": "1581cb9a-541d-43a2-a55b-28e9427a7f93",
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
    "phone": "+380678555827"
  }
}
```

```json
{
  "id": "49a06744-0287-41e2-8009-781a690e2eae",
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
  "created_at": "2026-10-29T08:28:41.487543Z",
  "caller": {
    "name": "Олена",
    "phone": "+380678555827"
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
    "id": "7e5d6729-0866-4209-9654-16d87d24909d",
    "order_id": "49a06744-0287-41e2-8009-781a690e2eae",
    "expires_at": "2026-10-29T08:28:56.492883Z",
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

`POST /api/driver/v1/offers/7e5d6729-0866-4209-9654-16d87d24909d/accept` → **200**

```json
{
  "command_id": "eb646228-083f-40af-b984-a66d4a49bf03"
}
```

```json
{
  "id": "d6633bff-741a-49ae-b613-6409dd51c2ba",
  "order_id": "49a06744-0287-41e2-8009-781a690e2eae",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8a678c85-fa17-4847-8571-30ceaeedc0d8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380678555827` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380678555827` → **200**

```json
[
  {
    "phone": "+380678555827",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T08:28:42.976710919Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678555827` → **200**

```json
[
  {
    "phone": "+380678555827",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T08:28:42.976710919Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678555827` → **200**

```json
[
  {
    "phone": "+380678555827",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T08:28:42.976710919Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8a678c85-fa17-4847-8571-30ceaeedc0d8",
  "order_id": "49a06744-0287-41e2-8009-781a690e2eae",
  "assignment_id": "d6633bff-741a-49ae-b613-6409dd51c2ba",
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
    "phone": "+380678555827"
  }
}
```

`POST /api/driver/v1/work-sessions/e1bd0b8f-bc51-440d-a36d-f385a2dbdd93/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:28:43Z",
    "sequence": 1793262523787
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e1bd0b8f-bc51-440d-a36d-f385a2dbdd93",
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
  "last_heartbeat_at": "2026-10-29T08:28:43.809156Z",
  "last_location_at": "2026-10-29T08:28:43.809156Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8a678c85-fa17-4847-8571-30ceaeedc0d8/arrive` → **200**

```json
{
  "command_id": "ce176c39-fde7-4ae9-98b6-5426ac8d1350",
  "expected_version": 0
}
```

```json
{
  "id": "8a678c85-fa17-4847-8571-30ceaeedc0d8",
  "order_id": "49a06744-0287-41e2-8009-781a690e2eae",
  "assignment_id": "d6633bff-741a-49ae-b613-6409dd51c2ba",
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
  "arrived_at": "2026-10-29T08:28:44.102606Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678555827"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380678555827` → **200**

```json
[
  {
    "phone": "+380678555827",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T08:28:42.976710919Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678555827` → **200**

```json
[
  {
    "phone": "+380678555827",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T08:28:42.976710919Z"
  },
  {
    "phone": "+380678555827",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T08:28:44.984295748Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678555827` → **200**

```json
[
  {
    "phone": "+380678555827",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T08:28:42.976710919Z"
  },
  {
    "phone": "+380678555827",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T08:28:44.984295748Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678555827` → **200**

```json
[
  {
    "phone": "+380678555827",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T08:28:42.976710919Z"
  },
  {
    "phone": "+380678555827",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T08:28:44.984295748Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/8a678c85-fa17-4847-8571-30ceaeedc0d8/start` → **200**

```json
{
  "command_id": "a64f9d66-a631-40fe-9523-a008bbb85c42",
  "expected_version": 1
}
```

```json
{
  "id": "8a678c85-fa17-4847-8571-30ceaeedc0d8",
  "order_id": "49a06744-0287-41e2-8009-781a690e2eae",
  "assignment_id": "d6633bff-741a-49ae-b613-6409dd51c2ba",
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
  "arrived_at": "2026-10-29T08:28:44.102606Z",
  "started_at": "2026-10-29T08:28:45.51289Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678555827"
  }
}
```

`POST /api/driver/v1/trips/8a678c85-fa17-4847-8571-30ceaeedc0d8/complete` → **200**

```json
{
  "command_id": "8bcb8e91-516c-42a2-b2bc-4b6f16cde29f",
  "expected_version": 2,
  "reported_at": "2026-10-29T08:28:45Z",
  "cash_received": true
}
```

```json
{
  "id": "8a678c85-fa17-4847-8571-30ceaeedc0d8",
  "order_id": "49a06744-0287-41e2-8009-781a690e2eae",
  "assignment_id": "d6633bff-741a-49ae-b613-6409dd51c2ba",
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
  "arrived_at": "2026-10-29T08:28:44.102606Z",
  "started_at": "2026-10-29T08:28:45.51289Z",
  "completed_at": "2026-10-29T08:28:45.815535Z",
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
  "session_id": "e1bd0b8f-bc51-440d-a36d-f385a2dbdd93",
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
  "last_heartbeat_at": "2026-10-29T08:28:43.809156Z",
  "last_location_at": "2026-10-29T08:28:43.809156Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e1bd0b8f-bc51-440d-a36d-f385a2dbdd93/close` → **200**

```json
{
  "command_id": "829f236c-eef5-4979-99d1-b0e053cd348d",
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
  "phone": "+380634154103",
  "device_ref": "sandbox-30045"
}
```

```json
{
  "challenge_id": "1391f29e-7558-4566-bbd4-aef53c8b68e5",
  "expires_at": "2026-10-29T08:33:46.698890718Z",
  "resend_available_at": "2026-10-29T08:28:47.698890718Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634154103` → **200**

```json
{
  "phone": "+380634154103",
  "audience": "CLIENT",
  "code": "781641",
  "sent_at": "2026-10-29T08:28:46.702203963Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1391f29e-7558-4566-bbd4-aef53c8b68e5",
  "code": "781641",
  "device_ref": "sandbox-30045"
}
```

```json
{
  "session_id": "6fd564f7-5635-4161-bc6a-affac3f869a6",
  "subject": {
    "type": "CLIENT",
    "id": "afa40428-0242-4065-8c5d-c42d3f7764f2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZmE0MDQyOC0wMjQyLTQwNjUtOGM1ZC1jNDJkM2Y3NzY0ZjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzNDI3LCJpYXQiOjE3OTMyNjI1MjcsImp0aSI6ImY3YmI5YWQ4LTEwYjctNDc3ZS1iNDNjLThlZDlkNzgxMDYyNyIsInNpZCI6IjZmZDU2NGY3LTU2MzUtNDE2MS1iYzZhLWFmZmFjM2Y4NjlhNiJ9.1rooQbt_xt8GQTwS15xIa3-qBmgE1BdYuYd99M5Wtq4",
  "access_expires_at": "2026-10-29T08:43:47.029526611Z",
  "refresh_token": "tGG2GuEeJUTq_GiVTnGfsmoQS77kDWQJVOtzgPUs8BU",
  "refresh_expires_at": "2026-11-28T08:28:47.028844263Z",
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
  "device_ref": "sandbox-11614"
}
```

```json
{
  "challenge_id": "7f2be943-3b2e-4072-810d-a4e5468c7b57",
  "expires_at": "2026-10-29T08:33:47.563067501Z",
  "resend_available_at": "2026-10-29T08:28:48.563067501Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "329667",
  "sent_at": "2026-10-29T08:28:47.565851995Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7f2be943-3b2e-4072-810d-a4e5468c7b57",
  "code": "329667",
  "device_ref": "sandbox-11614"
}
```

```json
{
  "session_id": "75350e4f-c17c-496b-9d7a-cc4cee5e17cb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MzQyNywiaWF0IjoxNzkzMjYyNTI3LCJqdGkiOiJhZTgyYThmZC05NDA5LTRlODMtYThlOS0yNGUzMzA2ZjVjNDMiLCJzaWQiOiI3NTM1MGU0Zi1jMTdjLTQ5NmItOWQ3YS1jYzRjZWU1ZTE3Y2IifQ.CRIPbOWP1FOc09KsFl8EF_oIoKzI-WIJj8_TsmfVR-k",
  "access_expires_at": "2026-10-29T08:43:47.864432327Z",
  "refresh_token": "0nBqawknLwX1cFq2CdkCkHfS1K2IQPk6IZo6fDTtVck",
  "refresh_expires_at": "2026-11-28T08:28:47.863864191Z",
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
  "session_id": "99567440-de70-423f-b6a4-30709b59c6ab",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM0MjgsImlhdCI6MTc5MzI2MjUyOCwianRpIjoiOWY0M2NhY2UtZTQ3Yi00NGM2LTk5ZTYtOWVlZmMzZjgxYzYzIiwic2lkIjoiOTk1Njc0NDAtZGU3MC00MjNmLWI2YTQtMzA3MDliNTljNmFiIn0.CUDprsv_h8q_EWpHHNiG4B7xxlnulFgw0o1Mou7PNJo",
  "access_expires_at": "2026-10-29T08:43:48.690976535Z",
  "refresh_token": "pSHl65qITgpT-25RRKOatqsbA75FUhkxc3szwE8JH2I",
  "refresh_expires_at": "2026-10-29T20:28:48.690294397Z",
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
  "session_id": "7dafb337-da8e-47f0-89e3-96fd94b5e318",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM0MjksImlhdCI6MTc5MzI2MjUyOSwianRpIjoiMTI3ZDYwYmQtMzczZC00ODViLWI4MjktN2ZkNTQzZjY0OTI3Iiwic2lkIjoiN2RhZmIzMzctZGE4ZS00N2YwLTg5ZTMtOTZmZDk0YjVlMzE4In0.LLAPj7cJ874jO5jnC49i1hPsq2WLQsr_Rb32G_RPOHs",
  "access_expires_at": "2026-10-29T08:43:49.260474565Z",
  "refresh_token": "0WtFJsWJdYA_fMyyOYHeD0pjofmKr6kBW6BGldGBE6Y",
  "refresh_expires_at": "2026-10-29T20:28:49.259705632Z",
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
  "command_id": "3e09df54-f043-45c1-9a42-ea51267f29b6",
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
  "id": "59b51f3f-fe6e-4a67-ae8a-19c68d680c4f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:33:49.825244Z",
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
  "command_id": "cc72e5e8-cfa5-420f-bc35-18a6f74a3392",
  "quote_id": "59b51f3f-fe6e-4a67-ae8a-19c68d680c4f",
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
  "id": "5d4ba4b9-e85a-4e05-9a60-f8f9e7587f5a",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "afa40428-0242-4065-8c5d-c42d3f7764f2",
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
  "created_at": "2026-10-29T08:28:50.119923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5d4ba4b9-e85a-4e05-9a60-f8f9e7587f5a` → **200**

```json
{
  "id": "5d4ba4b9-e85a-4e05-9a60-f8f9e7587f5a",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "afa40428-0242-4065-8c5d-c42d3f7764f2",
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
  "created_at": "2026-10-29T08:28:50.119923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5d4ba4b9-e85a-4e05-9a60-f8f9e7587f5a/cancel` → **200**

```json
{
  "command_id": "3eb2d716-b628-48a9-baec-64bbc17f41b5",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "5d4ba4b9-e85a-4e05-9a60-f8f9e7587f5a",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "afa40428-0242-4065-8c5d-c42d3f7764f2",
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
  "created_at": "2026-10-29T08:28:50.119923Z",
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
  "command_id": "d6220be7-7a3b-44bd-833b-80061fef74e2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:28:51Z",
    "sequence": 1793262531289
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6e9ed5c7-637a-4d58-995e-d6925a9fe24f",
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
  "last_heartbeat_at": "2026-10-29T08:28:51.310504Z",
  "last_location_at": "2026-10-29T08:28:51.310504Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-25491"
}
```

```json
{
  "challenge_id": "0a694bc1-d8bb-49d1-97b9-a17401e0d714",
  "expires_at": "2026-10-29T08:33:51.597044008Z",
  "resend_available_at": "2026-10-29T08:28:52.597044008Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "802702",
  "sent_at": "2026-10-29T08:28:51.599839671Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0a694bc1-d8bb-49d1-97b9-a17401e0d714",
  "code": "802702",
  "device_ref": "sandbox-25491"
}
```

```json
{
  "session_id": "509b2b94-6771-476b-ab8c-95f7d70577e5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MzQzMSwiaWF0IjoxNzkzMjYyNTMxLCJqdGkiOiI2ZjEyNjc3MS02MDIwLTQ0OWYtODQ1ZS1lNzQ0ZWJjZTdkZTYiLCJzaWQiOiI1MDliMmI5NC02NzcxLTQ3NmItYWI4Yy05NWY3ZDcwNTc3ZTUifQ.UZyK-562zS0WDXOmx7h7O1bmCfZBig1AOy8jjSwzM5A",
  "access_expires_at": "2026-10-29T08:43:51.910630211Z",
  "refresh_token": "x3CDnVNJQz1Cv04_qODpGJj_LV07czHNVv31MDTYNmQ",
  "refresh_expires_at": "2026-11-28T08:28:51.910066363Z",
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
  "command_id": "914a4a1a-7143-4c8d-9583-74aba392257a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:28:52Z",
    "sequence": 1793262532481
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "121a8e84-b5ab-485d-842e-edc2438cc5f0",
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
  "last_heartbeat_at": "2026-10-29T08:28:52.503668Z",
  "last_location_at": "2026-10-29T08:28:52.503668Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "be388f9d-669b-4231-a6c1-a815b3ddf618",
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
  "id": "40ea601d-1a87-4806-9e3d-faad7075d75f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:33:52.804884Z",
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
  "command_id": "da9a42b6-d9ef-4592-a3f9-124a40783058",
  "quote_id": "40ea601d-1a87-4806-9e3d-faad7075d75f",
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
  "id": "3a5067d5-6a9b-4208-be9e-9de635edf873",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "afa40428-0242-4065-8c5d-c42d3f7764f2",
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
  "created_at": "2026-10-29T08:28:53.110014Z",
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
    "id": "2dabbe77-4e6f-4185-8957-17b4051888f8",
    "order_id": "3a5067d5-6a9b-4208-be9e-9de635edf873",
    "expires_at": "2026-10-29T08:29:08.114005Z",
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

`POST /api/driver/v1/offers/2dabbe77-4e6f-4185-8957-17b4051888f8/accept` → **200**

```json
{
  "command_id": "325069b7-eca2-4061-90f6-ffcb87ad6a6d"
}
```

```json
{
  "id": "1252c112-5fb9-4fc0-97d1-480efb9b9b13",
  "order_id": "3a5067d5-6a9b-4208-be9e-9de635edf873",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c46e7b6d-90c1-4035-877c-28dc91ece9e7",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c46e7b6d-90c1-4035-877c-28dc91ece9e7",
  "order_id": "3a5067d5-6a9b-4208-be9e-9de635edf873",
  "assignment_id": "1252c112-5fb9-4fc0-97d1-480efb9b9b13",
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

`POST /api/driver/v1/trips/c46e7b6d-90c1-4035-877c-28dc91ece9e7/cancel` → **200**

```json
{
  "command_id": "32fb3b66-8173-4405-a4bd-cd025fa1c604",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "c46e7b6d-90c1-4035-877c-28dc91ece9e7",
  "order_id": "3a5067d5-6a9b-4208-be9e-9de635edf873",
  "assignment_id": "1252c112-5fb9-4fc0-97d1-480efb9b9b13",
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

`GET /api/rider/v1/orders/3a5067d5-6a9b-4208-be9e-9de635edf873` → **200**

```json
{
  "id": "3a5067d5-6a9b-4208-be9e-9de635edf873",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "afa40428-0242-4065-8c5d-c42d3f7764f2",
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
    "id": "1252c112-5fb9-4fc0-97d1-480efb9b9b13",
    "order_id": "3a5067d5-6a9b-4208-be9e-9de635edf873",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "c46e7b6d-90c1-4035-877c-28dc91ece9e7",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T08:28:53.110014Z",
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
    "id": "225ba7b0-3312-4f0e-808e-83702a73a548",
    "order_id": "3a5067d5-6a9b-4208-be9e-9de635edf873",
    "expires_at": "2026-10-29T08:29:09.274908Z",
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

`POST /api/driver/v1/offers/225ba7b0-3312-4f0e-808e-83702a73a548/accept` → **200**

```json
{
  "command_id": "6c6c1289-381b-43d9-8eca-d6db445d436c"
}
```

```json
{
  "id": "cd79982d-53bc-4e86-b6da-f571d5fe8fd1",
  "order_id": "3a5067d5-6a9b-4208-be9e-9de635edf873",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "aa8aa98a-75ee-4276-bd47-46c3822f6753",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "aa8aa98a-75ee-4276-bd47-46c3822f6753",
  "order_id": "3a5067d5-6a9b-4208-be9e-9de635edf873",
  "assignment_id": "cd79982d-53bc-4e86-b6da-f571d5fe8fd1",
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

`POST /api/driver/v1/trips/aa8aa98a-75ee-4276-bd47-46c3822f6753/cancel` → **200**

```json
{
  "command_id": "eab0fca9-8ae1-420e-88bc-4007568501e3",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "aa8aa98a-75ee-4276-bd47-46c3822f6753",
  "order_id": "3a5067d5-6a9b-4208-be9e-9de635edf873",
  "assignment_id": "cd79982d-53bc-4e86-b6da-f571d5fe8fd1",
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
    "id": "3a5067d5-6a9b-4208-be9e-9de635edf873",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T08:28:53.110014Z",
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
    "id": "5d4ba4b9-e85a-4e05-9a60-f8f9e7587f5a",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T08:28:50.119923Z",
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

`GET /api/operator/v1/orders/3a5067d5-6a9b-4208-be9e-9de635edf873/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T08:28:53.110679Z",
      "actor": {
        "type": "CLIENT",
        "id": "afa40428-0242-4065-8c5d-c42d3f7764f2",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "3a5067d5-6a9b-4208-be9e-9de635edf873",
        "quote_id": "40ea601d-1a87-4806-9e3d-faad7075d75f",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "345d8e6c-a6c4-4607-94e9-14c267280076"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T08:28:53.113035Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3a5067d5-6a9b-4208-be9e-9de635edf873",
        "attempt_id": "c3104036-a795-4971-ad74-720e73550755",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "345d8e6c-a6c4-4607-94e9-14c267280076"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T08:28:53.120357Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "2dabbe77-4e6f-4185-8957-17b4051888f8",
        "order_id": "3a5067d5-6a9b-4208-be9e-9de635edf873",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "345d8e6c-a6c4-4607-94e9-14c267280076"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T08:28:53.706622Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "2dabbe77-4e6f-4185-8957-17b4051888f8",
        "order_id": "3a5067d5-6a9b-4208-be9e-9de635edf873",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "1252c112-5fb9-4fc0-97d1-480efb9b9b13"
      },
      "correlation_id": "70d6f717-d4e5-4cc5-b4d9-f94c07e72eac"
```

Done: orders 5d4ba4b9-e85a-4e05-9a60-f8f9e7587f5a, 3a5067d5-6a9b-4208-be9e-9de635edf873.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739774240",
  "device_ref": "sandbox-1012"
}
```

```json
{
  "challenge_id": "ba81351a-2afc-4b61-a9fb-da11059229d6",
  "expires_at": "2026-10-29T08:33:56.605272589Z",
  "resend_available_at": "2026-10-29T08:28:57.605272589Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380739774240` → **200**

```json
{
  "phone": "+380739774240",
  "audience": "CLIENT",
  "code": "551230",
  "sent_at": "2026-10-29T08:28:56.608401575Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ba81351a-2afc-4b61-a9fb-da11059229d6",
  "code": "551230",
  "device_ref": "sandbox-1012"
}
```

```json
{
  "session_id": "420ba4a1-14c6-4e17-8abe-a76aece9d757",
  "subject": {
    "type": "CLIENT",
    "id": "1d91d02d-0633-4baa-b7b0-6125554867a3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZDkxZDAyZC0wNjMzLTRiYWEtYjdiMC02MTI1NTU0ODY3YTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzNDM2LCJpYXQiOjE3OTMyNjI1MzYsImp0aSI6ImMzZmJmY2RjLTZkYjctNGJjMC1hMWI2LWU5NjFhY2NkYTY2MiIsInNpZCI6IjQyMGJhNGExLTE0YzYtNGUxNy04YWJlLWE3NmFlY2U5ZDc1NyJ9.vW4XJQlCWWqkwpxKKsw41FdyWsNnqaPBuwX7n7s6o9A",
  "access_expires_at": "2026-10-29T08:43:56.955345156Z",
  "refresh_token": "y2T9IunbN1uiIV0_iU814do92JGEreuTb44vax_PaXU",
  "refresh_expires_at": "2026-11-28T08:28:56.954801085Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "61abb8fd-30df-41eb-a10e-bb5250e108a0",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "cc75da5c-d879-449d-bfce-dc0a4c1d3c73",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-cc75da5c-d879-449d-bfce-dc0a4c1d3c73",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "d11588db398a2bf31183d56ce6a8d549",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=cc75da5c-d879-449d-bfce-dc0a4c1d3c73",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739774240"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=cc75da5c-d879-449d-bfce-dc0a4c1d3c73",
  "expires_at": "2026-10-29T08:58:57.265973Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/cc75da5c-d879-449d-bfce-dc0a4c1d3c73` → **200**

```json
{
  "id": "cc75da5c-d879-449d-bfce-dc0a4c1d3c73",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T08:58:57.265973Z",
  "card": {
    "id": "3d2db3bf-c9ed-47ab-be90-27c0cf56e2a8",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1811",
    "card_type": "Visa",
    "created_at": "2026-10-29T08:28:57.563892Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "3d2db3bf-c9ed-47ab-be90-27c0cf56e2a8",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****1811",
      "card_type": "Visa",
      "created_at": "2026-10-29T08:28:57.563892Z"
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
  "device_ref": "sandbox-31179"
}
```

```json
{
  "challenge_id": "6cada511-b943-45a8-8cdd-323741dc6702",
  "expires_at": "2026-10-29T08:33:58.135404588Z",
  "resend_available_at": "2026-10-29T08:28:59.135404588Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "616141",
  "sent_at": "2026-10-29T08:28:58.138809695Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6cada511-b943-45a8-8cdd-323741dc6702",
  "code": "616141",
  "device_ref": "sandbox-31179"
}
```

```json
{
  "session_id": "864a0d72-23a3-473a-92a2-41d715bfc607",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MzQzOCwiaWF0IjoxNzkzMjYyNTM4LCJqdGkiOiJkYmEwOTNhMS1iMjFjLTRkZGEtODY5ZS01NGYzZjYxMjNjMDAiLCJzaWQiOiI4NjRhMGQ3Mi0yM2EzLTQ3M2EtOTJhMi00MWQ3MTViZmM2MDcifQ.NuDIjmIfGY5Xdl9AO6EuupbCJsdvL5e1U6N_Bc66_5o",
  "access_expires_at": "2026-10-29T08:43:58.441751188Z",
  "refresh_token": "aSDjwe28np9lHi0K6Pr_rlv1mUjPtfFs6-q45ALP2QQ",
  "refresh_expires_at": "2026-11-28T08:28:58.441148776Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "121a8e84-b5ab-485d-842e-edc2438cc5f0",
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
  "last_heartbeat_at": "2026-10-29T08:28:52.503668Z",
  "last_location_at": "2026-10-29T08:28:52.503668Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/121a8e84-b5ab-485d-842e-edc2438cc5f0/handover` → **200**

```json
{
  "command_id": "655cfd80-837a-4a0a-8aa9-30c8cdc3793e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "121a8e84-b5ab-485d-842e-edc2438cc5f0",
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
  "last_heartbeat_at": "2026-10-29T08:28:52.503668Z",
  "last_location_at": "2026-10-29T08:28:52.503668Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/121a8e84-b5ab-485d-842e-edc2438cc5f0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:28:59Z",
    "sequence": 1793262539284
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "121a8e84-b5ab-485d-842e-edc2438cc5f0",
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
  "last_heartbeat_at": "2026-10-29T08:28:59.304611Z",
  "last_location_at": "2026-10-29T08:28:59.304611Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "08f8612d-35c2-4ca9-8c78-52c47f11d6e7",
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
  "id": "3b8eea2c-937b-4c02-be67-44a891cb62c1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:33:59.603011Z",
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
  "command_id": "8f61dd65-b445-4ca4-a041-7698e77f840f",
  "quote_id": "3b8eea2c-937b-4c02-be67-44a891cb62c1",
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
  "id": "c3859bd9-ba4b-44e3-9de7-e06b512ae106",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1d91d02d-0633-4baa-b7b0-6125554867a3",
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
  "created_at": "2026-10-29T08:28:59.896637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c3859bd9-ba4b-44e3-9de7-e06b512ae106` → **200**

```json
{
  "id": "c3859bd9-ba4b-44e3-9de7-e06b512ae106",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1d91d02d-0633-4baa-b7b0-6125554867a3",
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
  "created_at": "2026-10-29T08:28:59.896637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c3859bd9-ba4b-44e3-9de7-e06b512ae106` → **200**

```json
{
  "id": "c3859bd9-ba4b-44e3-9de7-e06b512ae106",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1d91d02d-0633-4baa-b7b0-6125554867a3",
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
  "created_at": "2026-10-29T08:28:59.896637Z",
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
    "id": "21fbe4ed-23fb-4e28-ba83-9697b5c59f79",
    "order_id": "c3859bd9-ba4b-44e3-9de7-e06b512ae106",
    "expires_at": "2026-10-29T08:29:15.343898Z",
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

`POST /api/driver/v1/offers/21fbe4ed-23fb-4e28-ba83-9697b5c59f79/accept` → **200**

```json
{
  "command_id": "2127b914-9449-44ee-9a85-c6a512b54319"
}
```

```json
{
  "id": "4e770aa9-2f19-4fc7-b5c2-385ee432d491",
  "order_id": "c3859bd9-ba4b-44e3-9de7-e06b512ae106",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9a677f49-2cbc-47d2-9daf-37e73cab274d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9a677f49-2cbc-47d2-9daf-37e73cab274d",
  "order_id": "c3859bd9-ba4b-44e3-9de7-e06b512ae106",
  "assignment_id": "4e770aa9-2f19-4fc7-b5c2-385ee432d491",
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

`POST /api/driver/v1/work-sessions/121a8e84-b5ab-485d-842e-edc2438cc5f0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:29:02Z",
    "sequence": 1793262542670
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "121a8e84-b5ab-485d-842e-edc2438cc5f0",
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
  "last_heartbeat_at": "2026-10-29T08:29:02.691724Z",
  "last_location_at": "2026-10-29T08:29:02.691724Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9a677f49-2cbc-47d2-9daf-37e73cab274d/arrive` → **200**

```json
{
  "command_id": "c5d0cabe-a3c3-4b0d-be9e-1b9a4c034815",
  "expected_version": 0
}
```

```json
{
  "id": "9a677f49-2cbc-47d2-9daf-37e73cab274d",
  "order_id": "c3859bd9-ba4b-44e3-9de7-e06b512ae106",
  "assignment_id": "4e770aa9-2f19-4fc7-b5c2-385ee432d491",
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
  "arrived_at": "2026-10-29T08:29:02.988269Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9a677f49-2cbc-47d2-9daf-37e73cab274d/start` → **200**

```json
{
  "command_id": "47127932-5268-450b-9e57-76e715b3df7e",
  "expected_version": 1
}
```

```json
{
  "id": "9a677f49-2cbc-47d2-9daf-37e73cab274d",
  "order_id": "c3859bd9-ba4b-44e3-9de7-e06b512ae106",
  "assignment_id": "4e770aa9-2f19-4fc7-b5c2-385ee432d491",
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
  "arrived_at": "2026-10-29T08:29:02.988269Z",
  "started_at": "2026-10-29T08:29:03.287722Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9a677f49-2cbc-47d2-9daf-37e73cab274d/complete` → **200**

```json
{
  "command_id": "ead1978c-5e50-4cc3-af15-1993648c2c0c",
  "expected_version": 2,
  "reported_at": "2026-10-29T08:29:03Z",
  "cash_received": true
}
```

```json
{
  "id": "9a677f49-2cbc-47d2-9daf-37e73cab274d",
  "order_id": "c3859bd9-ba4b-44e3-9de7-e06b512ae106",
  "assignment_id": "4e770aa9-2f19-4fc7-b5c2-385ee432d491",
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
  "arrived_at": "2026-10-29T08:29:02.988269Z",
  "started_at": "2026-10-29T08:29:03.287722Z",
  "completed_at": "2026-10-29T08:29:03.583934Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/c3859bd9-ba4b-44e3-9de7-e06b512ae106` → **200**

```json
{
  "id": "c3859bd9-ba4b-44e3-9de7-e06b512ae106",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "1d91d02d-0633-4baa-b7b0-6125554867a3",
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
    "id": "4e770aa9-2f19-4fc7-b5c2-385ee432d491",
    "order_id": "c3859bd9-ba4b-44e3-9de7-e06b512ae106",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9a677f49-2cbc-47d2-9daf-37e73cab274d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T08:28:59.896637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c3859bd9-ba4b-44e3-9de7-e06b512ae106` → **200**

```json
{
  "id": "c3859bd9-ba4b-44e3-9de7-e06b512ae106",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "1d91d02d-0633-4baa-b7b0-6125554867a3",
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
    "id": "4e770aa9-2f19-4fc7-b5c2-385ee432d491",
    "order_id": "c3859bd9-ba4b-44e3-9de7-e06b512ae106",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9a677f49-2cbc-47d2-9daf-37e73cab274d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T08:28:59.896637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c3859bd9-ba4b-44e3-9de7-e06b512ae106` → **200**

```json
{
  "id": "c3859bd9-ba4b-44e3-9de7-e06b512ae106",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "1d91d02d-0633-4baa-b7b0-6125554867a3",
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
    "id": "4e770aa9-2f19-4fc7-b5c2-385ee432d491",
    "order_id": "c3859bd9-ba4b-44e3-9de7-e06b512ae106",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9a677f49-2cbc-47d2-9daf-37e73cab274d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T08:28:59.896637Z",
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

`GET /api/rider/v1/orders/c3859bd9-ba4b-44e3-9de7-e06b512ae106/tip` → **200**

```json
{
  "order_id": "c3859bd9-ba4b-44e3-9de7-e06b512ae106",
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
  "available_until": "2026-10-30T08:29:03.583934Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/c3859bd9-ba4b-44e3-9de7-e06b512ae106/tip` → **201**

```json
{
  "command_id": "063850f0-ccdb-4c6e-843a-a8963b8ed0b9",
  "amount_minor": 2500
}
```

```json
{
  "id": "3b709df7-ceaa-48fc-a47d-c2c89efbdcc6",
  "order_id": "c3859bd9-ba4b-44e3-9de7-e06b512ae106",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T08:29:07.366675Z"
}
```

`GET /api/rider/v1/orders/c3859bd9-ba4b-44e3-9de7-e06b512ae106/tip` → **200**

```json
{
  "order_id": "c3859bd9-ba4b-44e3-9de7-e06b512ae106",
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
  "available_until": "2026-10-30T08:29:03.583934Z",
  "open": false,
  "tip": {
    "id": "3b709df7-ceaa-48fc-a47d-c2c89efbdcc6",
    "order_id": "c3859bd9-ba4b-44e3-9de7-e06b512ae106",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T08:29:07.366675Z"
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
      "id": "31076e57-7822-49f0-a368-7aa4e92d4d0e",
      "at": "2026-10-29T08:29:04.414872Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c3859bd9-ba4b-44e3-9de7-e06b512ae106",
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
      "id": "eee12cd0-a6be-45ed-8e1a-4d72e3f2d4de",
      "at": "2026-10-29T08:29:08.466032Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c3859bd9-ba4b-44e3-9de7-e06b512ae106",
      "counterpart_id": null
    },
    {
      "id": "31076e57-7822-49f0-a368-7aa4e92d4d0e",
      "at": "2026-10-29T08:29:04.414872Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c3859bd9-ba4b-44e3-9de7-e06b512ae106",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "aa9c87fa-fc74-4ba9-9cf9-754b6d18ab10",
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
  "id": "64650fc0-1a28-4d85-b228-5326b6f52f51",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:34:09.512779Z",
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
  "session_id": "1c936bf8-452a-440f-b452-456ea04ddbf2",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM0NTAsImlhdCI6MTc5MzI2MjU1MCwianRpIjoiNzI5MTA2ZWItOTE2Mi00ZTA1LThiNGYtN2EwYzM0NWZiMmIwIiwic2lkIjoiMWM5MzZiZjgtNDUyYS00NDBmLWI0NTItNDU2ZWEwNGRkYmYyIn0.yB6n6ku2CULuu5ow3PTHaXZEnOi2otdSXi10nv3ITd0",
  "access_expires_at": "2026-10-29T08:44:10.105359832Z",
  "refresh_token": "Di34IVDACY5k5KiFHyjKr-9hoJz8pY_SCNA0miHbmqg",
  "refresh_expires_at": "2026-10-29T20:29:10.104678787Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380739774240` → **200**

```json
{
  "client_id": "1d91d02d-0633-4baa-b7b0-6125554867a3"
}
```

`POST /api/admin/v1/rider-wallets/1d91d02d-0633-4baa-b7b0-6125554867a3/top-ups` → **201**

```json
{
  "command_id": "901f6944-8d4e-467d-bca4-3ecc06d42452",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "1d91d02d-0633-4baa-b7b0-6125554867a3",
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
      "id": "4e432eb6-6996-4fb1-b469-1a09c42f37cf",
      "at": "2026-10-29T08:29:10.65587Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "85782d39-1a26-4896-83e2-d51f63705ba3",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "7b071fd5-c53a-4edf-b5fc-036e232bb203",
  "quote_id": "64650fc0-1a28-4d85-b228-5326b6f52f51",
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
  "id": "e6d5d877-8f90-4b08-bd2e-9380335e09e9",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1d91d02d-0633-4baa-b7b0-6125554867a3",
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
  "created_at": "2026-10-29T08:29:10.951062Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e6d5d877-8f90-4b08-bd2e-9380335e09e9` → **200**

```json
{
  "id": "e6d5d877-8f90-4b08-bd2e-9380335e09e9",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1d91d02d-0633-4baa-b7b0-6125554867a3",
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
  "created_at": "2026-10-29T08:29:10.951062Z",
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
    "id": "378e2709-d99f-46d4-97cc-a4cdd7f9449f",
    "order_id": "e6d5d877-8f90-4b08-bd2e-9380335e09e9",
    "expires_at": "2026-10-29T08:29:25.95657Z",
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

`POST /api/driver/v1/offers/378e2709-d99f-46d4-97cc-a4cdd7f9449f/accept` → **200**

```json
{
  "command_id": "4c48d611-6296-4c5f-8a75-cd5e46c77a2e"
}
```

```json
{
  "id": "e02b3adc-a886-4171-81b3-e9b5ce056c8d",
  "order_id": "e6d5d877-8f90-4b08-bd2e-9380335e09e9",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c23071f9-b650-4594-a462-10cd55861dff",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c23071f9-b650-4594-a462-10cd55861dff",
  "order_id": "e6d5d877-8f90-4b08-bd2e-9380335e09e9",
  "assignment_id": "e02b3adc-a886-4171-81b3-e9b5ce056c8d",
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

`POST /api/driver/v1/work-sessions/121a8e84-b5ab-485d-842e-edc2438cc5f0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:29:12Z",
    "sequence": 1793262552401
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "121a8e84-b5ab-485d-842e-edc2438cc5f0",
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
  "last_heartbeat_at": "2026-10-29T08:29:12.423421Z",
  "last_location_at": "2026-10-29T08:29:12.423421Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c23071f9-b650-4594-a462-10cd55861dff/arrive` → **200**

```json
{
  "command_id": "a999ebc5-6676-4288-8410-e8c34b398d78",
  "expected_version": 0
}
```

```json
{
  "id": "c23071f9-b650-4594-a462-10cd55861dff",
  "order_id": "e6d5d877-8f90-4b08-bd2e-9380335e09e9",
  "assignment_id": "e02b3adc-a886-4171-81b3-e9b5ce056c8d",
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
  "arrived_at": "2026-10-29T08:29:12.709905Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c23071f9-b650-4594-a462-10cd55861dff/start` → **200**

```json
{
  "command_id": "06c46eb5-d27f-40cb-950e-d58344dbdc43",
  "expected_version": 1
}
```

```json
{
  "id": "c23071f9-b650-4594-a462-10cd55861dff",
  "order_id": "e6d5d877-8f90-4b08-bd2e-9380335e09e9",
  "assignment_id": "e02b3adc-a886-4171-81b3-e9b5ce056c8d",
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
  "arrived_at": "2026-10-29T08:29:12.709905Z",
  "started_at": "2026-10-29T08:29:13.003067Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c23071f9-b650-4594-a462-10cd55861dff/complete` → **200**

```json
{
  "command_id": "588adf62-1ba0-4a97-a5e5-661cc841bfc0",
  "expected_version": 2,
  "reported_at": "2026-10-29T08:29:13Z",
  "cash_received": true
}
```

```json
{
  "id": "c23071f9-b650-4594-a462-10cd55861dff",
  "order_id": "e6d5d877-8f90-4b08-bd2e-9380335e09e9",
  "assignment_id": "e02b3adc-a886-4171-81b3-e9b5ce056c8d",
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
  "arrived_at": "2026-10-29T08:29:12.709905Z",
  "started_at": "2026-10-29T08:29:13.003067Z",
  "completed_at": "2026-10-29T08:29:13.305464Z",
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
  "client_id": "1d91d02d-0633-4baa-b7b0-6125554867a3",
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
      "id": "f1829683-5cd4-44cd-85f5-9dc44441c9d5",
      "at": "2026-10-29T08:29:13.518639Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -16297,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "e6d5d877-8f90-4b08-bd2e-9380335e09e9"
    },
    {
      "id": "4e432eb6-6996-4fb1-b469-1a09c42f37cf",
      "at": "2026-10-29T08:29:10.65587Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "85782d39-1a26-4896-83e2-d51f63705ba3",
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

`GET /api/rider/v1/orders/e6d5d877-8f90-4b08-bd2e-9380335e09e9/tip` → **200**

```json
{
  "order_id": "e6d5d877-8f90-4b08-bd2e-9380335e09e9",
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
  "available_until": "2026-10-30T08:29:13.305464Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/e6d5d877-8f90-4b08-bd2e-9380335e09e9/tip` → **201**

```json
{
  "command_id": "9ae5b113-5282-4763-b59c-a02502ab5f3c",
  "amount_minor": 2500
}
```

```json
{
  "id": "ba9ad7df-d53a-496c-a49e-e840a32a7728",
  "order_id": "e6d5d877-8f90-4b08-bd2e-9380335e09e9",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T08:29:14.445136Z"
}
```

`GET /api/rider/v1/orders/e6d5d877-8f90-4b08-bd2e-9380335e09e9/tip` → **200**

```json
{
  "order_id": "e6d5d877-8f90-4b08-bd2e-9380335e09e9",
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
  "available_until": "2026-10-30T08:29:13.305464Z",
  "open": false,
  "tip": {
    "id": "ba9ad7df-d53a-496c-a49e-e840a32a7728",
    "order_id": "e6d5d877-8f90-4b08-bd2e-9380335e09e9",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T08:29:14.445136Z"
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
      "id": "55883c93-a2b1-4cdd-b61b-e874916f4307",
      "at": "2026-10-29T08:29:13.514417Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e6d5d877-8f90-4b08-bd2e-9380335e09e9",
      "counterpart_id": null
    },
    {
      "id": "eee12cd0-a6be-45ed-8e1a-4d72e3f2d4de",
      "at": "2026-10-29T08:29:08.466032Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c3859bd9-ba4b-44e3-9de7-e06b512ae106",
      "counterpart_id": null
    },
    {
      "id": "31076e57-7822-49f0-a368-7aa4e92d4d0e",
      "at": "2026-10-29T08:29:04.414872Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c3859bd9-ba4b-44e3-9de7-e06b512ae106",
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
      "id": "f8b90665-d709-417c-b352-84f3dfc6194f",
      "at": "2026-10-29T08:29:15.541736Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "e6d5d877-8f90-4b08-bd2e-9380335e09e9",
      "counterpart_id": null
    },
    {
      "id": "55883c93-a2b1-4cdd-b61b-e874916f4307",
      "at": "2026-10-29T08:29:13.514417Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e6d5d877-8f90-4b08-bd2e-9380335e09e9",
      "counterpart_id": null
    },
    {
      "id": "eee12cd0-a6be-45ed-8e1a-4d72e3f2d4de",
      "at": "2026-10-29T08:29:08.466032Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c3859bd9-ba4b-44e3-9de7-e06b512ae106",
      "counterpart_id": null
    },
    {
      "id": "31076e57-7822-49f0-a368-7aa4e92d4d0e",
      "at": "2026-10-29T08:29:04.414872Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c3859bd9-ba4b-44e3-9de7-e06b512ae106",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "121a8e84-b5ab-485d-842e-edc2438cc5f0",
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
  "last_heartbeat_at": "2026-10-29T08:29:12.423421Z",
  "last_location_at": "2026-10-29T08:29:12.423421Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/121a8e84-b5ab-485d-842e-edc2438cc5f0/close` → **200**

```json
{
  "command_id": "95a3730b-371f-4bbf-9785-2db51686edb2",
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

Done: card order e6d5d877-8f90-4b08-bd2e-9380335e09e9.

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
  "phone": "+380738640675",
  "device_ref": "sandbox-19129"
}
```

```json
{
  "challenge_id": "b8bbbc8f-7993-4ed3-8421-b9ee54a20b6b",
  "expires_at": "2026-10-29T08:34:17.406959324Z",
  "resend_available_at": "2026-10-29T08:29:18.406959324Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380738640675` → **200**

```json
{
  "phone": "+380738640675",
  "audience": "CLIENT",
  "code": "166426",
  "sent_at": "2026-10-29T08:29:17.409468831Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b8bbbc8f-7993-4ed3-8421-b9ee54a20b6b",
  "code": "166426",
  "device_ref": "sandbox-19129"
}
```

```json
{
  "session_id": "e7ad6f91-e4e5-4158-a9bc-ddbc30eb6696",
  "subject": {
    "type": "CLIENT",
    "id": "faed6a59-f966-45a8-ab58-4bb9eab57c39"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYWVkNmE1OS1mOTY2LTQ1YTgtYWI1OC00YmI5ZWFiNTdjMzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzNDU3LCJpYXQiOjE3OTMyNjI1NTcsImp0aSI6ImI5MTc2MjY2LWE2ZWItNGU4Yi1hY2U5LWE3N2U4ZDFkOTc5ZCIsInNpZCI6ImU3YWQ2ZjkxLWU0ZTUtNDE1OC1hOWJjLWRkYmMzMGViNjY5NiJ9.LkVbR83vPG2siwNy5Pd7Gjce_QiPyZDX8Q_rV0k4LPw",
  "access_expires_at": "2026-10-29T08:44:17.742068184Z",
  "refresh_token": "sVlbp_9d5erLvUbVCRq6oOns5klAYii0qEC13eazmb0",
  "refresh_expires_at": "2026-11-28T08:29:17.741437946Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "19110d46-a60c-46b2-8c7d-64632c12327b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "abcca4b1-8159-453f-8ec3-431ce62e9a63",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-abcca4b1-8159-453f-8ec3-431ce62e9a63",
    "orderDate": "1793262558",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "b47f07452c58fb5fa8dc785f19af5960",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=abcca4b1-8159-453f-8ec3-431ce62e9a63",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738640675"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=abcca4b1-8159-453f-8ec3-431ce62e9a63",
  "created_at": "2026-10-29T08:29:18.033745Z",
  "expires_at": "2026-10-29T08:59:18.033745Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/abcca4b1-8159-453f-8ec3-431ce62e9a63` → **200**

```json
{
  "id": "abcca4b1-8159-453f-8ec3-431ce62e9a63",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T08:29:18.033745Z",
  "expires_at": "2026-10-29T08:59:18.033745Z",
  "completed_at": "2026-10-29T08:29:18.350015Z",
  "masked_pan": "41****8340",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "faed6a59-f966-45a8-ab58-4bb9eab57c39",
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
      "id": "06814f19-6420-4da4-8e80-6bc8981d3fe3",
      "at": "2026-10-29T08:29:18.558802Z",
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
  "client_id": "faed6a59-f966-45a8-ab58-4bb9eab57c39",
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
      "id": "06814f19-6420-4da4-8e80-6bc8981d3fe3",
      "at": "2026-10-29T08:29:18.558802Z",
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
  "device_ref": "sandbox-32070"
}
```

```json
{
  "challenge_id": "dc5e6a3b-07b1-4f77-b1d1-cc1c164686da",
  "expires_at": "2026-10-29T08:34:19.279445921Z",
  "resend_available_at": "2026-10-29T08:29:20.279445921Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "549744",
  "sent_at": "2026-10-29T08:29:19.281957206Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dc5e6a3b-07b1-4f77-b1d1-cc1c164686da",
  "code": "549744",
  "device_ref": "sandbox-32070"
}
```

```json
{
  "session_id": "9050481b-be05-4797-9ea0-7451e23759cc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MzQ1OSwiaWF0IjoxNzkzMjYyNTU5LCJqdGkiOiJiZmE5MWM4Yi1jODYzLTQ4OGUtYjI5NC0xNTI1NjRiNDZjYWIiLCJzaWQiOiI5MDUwNDgxYi1iZTA1LTQ3OTctOWVhMC03NDUxZTIzNzU5Y2MifQ.eY9462MpSdXh3fyoC6INYxtUj0kiDNpR-MYny_IHyz0",
  "access_expires_at": "2026-10-29T08:44:19.578834717Z",
  "refresh_token": "BnpQ0kWYGfmf_A1HQ7VxTB52NGvnqtuTnxOrCTHhxd8",
  "refresh_expires_at": "2026-11-28T08:29:19.578255561Z",
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
  "command_id": "fe56fe75-1b17-4c83-857a-d2f774892a91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "c0a5f534-4b63-413d-88d8-bba5be284c21",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-c0a5f534-4b63-413d-88d8-bba5be284c21",
    "orderDate": "1793262560",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "a652db5c1cfe19760878fe83971ae7f9",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=c0a5f534-4b63-413d-88d8-bba5be284c21",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=c0a5f534-4b63-413d-88d8-bba5be284c21",
  "created_at": "2026-10-29T08:29:20.125509Z",
  "expires_at": "2026-10-29T08:59:20.125509Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/c0a5f534-4b63-413d-88d8-bba5be284c21` → **200**

```json
{
  "id": "c0a5f534-4b63-413d-88d8-bba5be284c21",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T08:29:20.125509Z",
  "expires_at": "2026-10-29T08:59:20.125509Z",
  "completed_at": "2026-10-29T08:29:20.403892Z",
  "masked_pan": "41****8696",
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
      "id": "daad02af-9d0e-4dac-b7b7-f36f6d96f6db",
      "at": "2026-10-29T08:29:20.56729Z",
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
  "command_id": "eba77588-9932-4bf0-8e39-d9954244d181",
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
  "correlation_id": "bf4acc79-7965-4c8e-b27e-eb35ea221b3b"
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
  "device_ref": "sandbox-1580"
}
```

```json
{
  "challenge_id": "0e302f72-8bbb-4f8f-8b86-52af40cdf7a0",
  "expires_at": "2026-10-29T08:34:21.268486748Z",
  "resend_available_at": "2026-10-29T08:29:22.268486748Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "305965",
  "sent_at": "2026-10-29T08:29:21.271208299Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0e302f72-8bbb-4f8f-8b86-52af40cdf7a0",
  "code": "305965",
  "device_ref": "sandbox-1580"
}
```

```json
{
  "session_id": "3199cd7a-afb8-42af-a8ba-005a207ede18",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MzQ2MSwiaWF0IjoxNzkzMjYyNTYxLCJqdGkiOiIxODEzMzE2Mi0yYmRlLTQwZGYtOThhNS03Yjk2ZGNmZDQ1OTAiLCJzaWQiOiIzMTk5Y2Q3YS1hZmI4LTQyYWYtYThiYS0wMDVhMjA3ZWRlMTgifQ.F5QGnHJYPbpo2FyGdqsFW-N8Y1kFstl-GTL-UB6HpLM",
  "access_expires_at": "2026-10-29T08:44:21.578938377Z",
  "refresh_token": "AdWtxSqdEtYxQ4ZcjEADSQzW5I38NKwq4NubR_TGrCA",
  "refresh_expires_at": "2026-11-28T08:29:21.578345616Z",
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
  "command_id": "fb97b8e5-f633-4942-b96a-b8dc12d6a564",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:29:22Z",
    "sequence": 1793262562136
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1cc6589a-3c7d-44bc-96de-2c5a555b522f",
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
  "last_heartbeat_at": "2026-10-29T08:29:22.156715Z",
  "last_location_at": "2026-10-29T08:29:22.156715Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636224421",
  "device_ref": "sandbox-25295"
}
```

```json
{
  "challenge_id": "b0c63e97-cf38-4c53-85a4-228daf031ad3",
  "expires_at": "2026-10-29T08:34:22.446529943Z",
  "resend_available_at": "2026-10-29T08:29:23.446529943Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636224421` → **200**

```json
{
  "phone": "+380636224421",
  "audience": "CLIENT",
  "code": "221709",
  "sent_at": "2026-10-29T08:29:22.449154468Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b0c63e97-cf38-4c53-85a4-228daf031ad3",
  "code": "221709",
  "device_ref": "sandbox-25295"
}
```

```json
{
  "session_id": "4350ab19-9c0d-445f-800e-3453695bb675",
  "subject": {
    "type": "CLIENT",
    "id": "1b4c73b9-6386-4675-a24c-9f71cfb5fb75"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYjRjNzNiOS02Mzg2LTQ2NzUtYTI0Yy05ZjcxY2ZiNWZiNzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzNDYyLCJpYXQiOjE3OTMyNjI1NjIsImp0aSI6IjlmM2RmMzhhLWU5ZWQtNDdjYy1hODMxLTEyMWU2M2NiNDUxNCIsInNpZCI6IjQzNTBhYjE5LTljMGQtNDQ1Zi04MDBlLTM0NTM2OTViYjY3NSJ9.-OBq8nEQWdm6NkcKggNf0hFoVo6sdOngJnBrCmeBn2M",
  "access_expires_at": "2026-10-29T08:44:22.77395635Z",
  "refresh_token": "_HxqO880gkymGuC0sChYOXOYSievEcsyt2BnXorgD6Q",
  "refresh_expires_at": "2026-11-28T08:29:22.773387073Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1f07f5e0-e09a-4ae0-aa64-a745b686a0cc",
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
  "id": "90e7145b-7709-4ff8-8d0b-01d88e9d2602",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:34:23.057883Z",
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
  "command_id": "bd7b6823-eb5e-4572-b635-f61156540816",
  "quote_id": "90e7145b-7709-4ff8-8d0b-01d88e9d2602",
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
  "id": "973d58c9-f883-4c0d-8306-cc1d86ccbafb",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1b4c73b9-6386-4675-a24c-9f71cfb5fb75",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T08:29:23.361953Z",
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
    "id": "f259d5fa-0c68-4404-85db-8d9af5d2e533",
    "order_id": "973d58c9-f883-4c0d-8306-cc1d86ccbafb",
    "expires_at": "2026-10-29T08:29:38.365247Z",
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

`POST /api/driver/v1/offers/f259d5fa-0c68-4404-85db-8d9af5d2e533/accept` → **200**

```json
{
  "command_id": "e028253c-27db-4337-956a-e6a221796db2"
}
```

```json
{
  "id": "74fa10d8-2bb9-470f-b2b8-04eaa67dbbf5",
  "order_id": "973d58c9-f883-4c0d-8306-cc1d86ccbafb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "91de2e9b-e67a-47fa-9d43-1f1dd577ed91",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "91de2e9b-e67a-47fa-9d43-1f1dd577ed91",
  "order_id": "973d58c9-f883-4c0d-8306-cc1d86ccbafb",
  "assignment_id": "74fa10d8-2bb9-470f-b2b8-04eaa67dbbf5",
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

`POST /api/driver/v1/work-sessions/1cc6589a-3c7d-44bc-96de-2c5a555b522f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:29:24Z",
    "sequence": 1793262564496
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1cc6589a-3c7d-44bc-96de-2c5a555b522f",
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
  "last_heartbeat_at": "2026-10-29T08:29:24.516936Z",
  "last_location_at": "2026-10-29T08:29:24.516936Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/91de2e9b-e67a-47fa-9d43-1f1dd577ed91/arrive` → **200**

```json
{
  "command_id": "58278352-8838-4103-90b6-51fc91617857",
  "expected_version": 0
}
```

```json
{
  "id": "91de2e9b-e67a-47fa-9d43-1f1dd577ed91",
  "order_id": "973d58c9-f883-4c0d-8306-cc1d86ccbafb",
  "assignment_id": "74fa10d8-2bb9-470f-b2b8-04eaa67dbbf5",
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
  "arrived_at": "2026-10-29T08:29:24.803554Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/91de2e9b-e67a-47fa-9d43-1f1dd577ed91/start` → **200**

```json
{
  "command_id": "381f2363-c324-426c-a14a-898e012de3df",
  "expected_version": 1
}
```

```json
{
  "id": "91de2e9b-e67a-47fa-9d43-1f1dd577ed91",
  "order_id": "973d58c9-f883-4c0d-8306-cc1d86ccbafb",
  "assignment_id": "74fa10d8-2bb9-470f-b2b8-04eaa67dbbf5",
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
  "arrived_at": "2026-10-29T08:29:24.803554Z",
  "started_at": "2026-10-29T08:29:25.097203Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/91de2e9b-e67a-47fa-9d43-1f1dd577ed91/complete` → **200**

```json
{
  "command_id": "a2d6dc51-74dd-4a07-8058-eac1922c15e8",
  "expected_version": 2,
  "reported_at": "2026-10-29T08:29:25Z",
  "cash_received": false
}
```

```json
{
  "id": "91de2e9b-e67a-47fa-9d43-1f1dd577ed91",
  "order_id": "973d58c9-f883-4c0d-8306-cc1d86ccbafb",
  "assignment_id": "74fa10d8-2bb9-470f-b2b8-04eaa67dbbf5",
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
  "arrived_at": "2026-10-29T08:29:24.803554Z",
  "started_at": "2026-10-29T08:29:25.097203Z",
  "completed_at": "2026-10-29T08:29:25.389327Z",
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
  "session_id": "99d3b550-7fca-40cd-8327-726329ce74ce",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM0NjUsImlhdCI6MTc5MzI2MjU2NSwianRpIjoiZjI0OWQ0YWItM2Y0Ny00MTNmLTllMDUtNDk0ZjA2YmNlZmE2Iiwic2lkIjoiOTlkM2I1NTAtN2ZjYS00MGNkLTgzMjctNzI2MzI5Y2U3NGNlIn0.M6Sp_q3NJG_9B2DVZiijzi77cif-RWXeuRgd388F4vQ",
  "access_expires_at": "2026-10-29T08:44:25.985200733Z",
  "refresh_token": "EQCLOgtVqAGKkznJqiQ8j8KpMuzZeaQaehUq_FChLtI",
  "refresh_expires_at": "2026-10-29T20:29:25.984656702Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/973d58c9-f883-4c0d-8306-cc1d86ccbafb/cash-dispute` → **200**

```json
{
  "order_id": "973d58c9-f883-4c0d-8306-cc1d86ccbafb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "1b4c73b9-6386-4675-a24c-9f71cfb5fb75",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T08:29:25.620941Z",
  "decide_by": "2026-11-12T08:29:25.620941Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T08:29:25.620941Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "973d58c9-f883-4c0d-8306-cc1d86ccbafb",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "1b4c73b9-6386-4675-a24c-9f71cfb5fb75",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T08:29:25.620941Z",
      "decide_by": "2026-11-12T08:29:25.620941Z",
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

`POST /api/admin/v1/orders/973d58c9-f883-4c0d-8306-cc1d86ccbafb/cash-dispute/decide` → **400**

```json
{
  "command_id": "fe91dc46-4176-4c57-a28f-db753600cca9",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/973d58c9-f883-4c0d-8306-cc1d86ccbafb/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "10182710-adae-4762-9f21-e49962601c38",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/973d58c9-f883-4c0d-8306-cc1d86ccbafb/cash-dispute/decide` → **200**

```json
{
  "command_id": "1cac649c-e63a-49e5-b887-561e1b420d5a",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "973d58c9-f883-4c0d-8306-cc1d86ccbafb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "1b4c73b9-6386-4675-a24c-9f71cfb5fb75",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T08:29:25.620941Z",
  "decide_by": "2026-11-12T08:29:25.620941Z",
  "decision": "PAY_DRIVER",
  "decided_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T08:29:27.15953Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/973d58c9-f883-4c0d-8306-cc1d86ccbafb/cash-dispute/decide` → **409**

```json
{
  "command_id": "641458d7-0de8-4248-9a66-6863be7aa7ca",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/973d58c9-f883-4c0d-8306-cc1d86ccbafb/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "dc8b9d06-35ef-4a3e-bbdb-cb60ced6a329"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1cc6589a-3c7d-44bc-96de-2c5a555b522f",
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
  "last_heartbeat_at": "2026-10-29T08:29:24.516936Z",
  "last_location_at": "2026-10-29T08:29:24.516936Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1cc6589a-3c7d-44bc-96de-2c5a555b522f/close` → **200**

```json
{
  "command_id": "fd42ed9f-cf56-4573-a31c-a014d4765bf9",
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
  "session_id": "2404be92-7b5f-4209-a43a-99356442cfee",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM0NjgsImlhdCI6MTc5MzI2MjU2OCwianRpIjoiNjAzZGFkOTAtNDNjMy00Y2ZkLWJjZDItZWRmNzRhZGUyMmEwIiwic2lkIjoiMjQwNGJlOTItN2I1Zi00MjA5LWE0M2EtOTkzNTY0NDJjZmVlIn0.HuLvFK6I_nqBhBxdA4dKFSJzw2fV_cUkWGXV9Zk5koE",
  "access_expires_at": "2026-10-29T08:44:28.639803315Z",
  "refresh_token": "bvCrvql8gaG3Gv_KRhVRG1qf3R2jRAQwbdWUBXICniY",
  "refresh_expires_at": "2026-10-29T20:29:28.639224408Z",
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
  "phone": "+48600546831",
  "device_ref": "sandbox-12601"
}
```

```json
{
  "challenge_id": "f0e99429-4bc8-4a91-a9c3-7465b8ea2e85",
  "expires_at": "2026-10-29T08:34:29.49800585Z",
  "resend_available_at": "2026-10-29T08:29:30.49800585Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600546831` → **200**

```json
{
  "phone": "+48600546831",
  "audience": "CLIENT",
  "code": "041364",
  "sent_at": "2026-10-29T08:29:29.500528579Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f0e99429-4bc8-4a91-a9c3-7465b8ea2e85",
  "code": "041364",
  "device_ref": "sandbox-12601"
}
```

```json
{
  "session_id": "188b123d-cf80-420c-874f-fe72a9f6d3f8",
  "subject": {
    "type": "CLIENT",
    "id": "c7b9d314-ad32-45da-a941-87ead6f44a2e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjN2I5ZDMxNC1hZDMyLTQ1ZGEtYTk0MS04N2VhZDZmNDRhMmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzNDY5LCJpYXQiOjE3OTMyNjI1NjksImp0aSI6ImFkNjYyYTZhLTgyZDAtNGE0NS1iYjI3LTkxN2JjOWIwMTcxYyIsInNpZCI6IjE4OGIxMjNkLWNmODAtNDIwYy04NzRmLWZlNzJhOWY2ZDNmOCJ9.UAK5cvASmbAnj-P7qJb5g846bEYYZsjs1uvcVPYEN_E",
  "access_expires_at": "2026-10-29T08:44:29.809557435Z",
  "refresh_token": "SzEX5JoZWtUNx7eKNod6EAQTC9eddWxZ-sat32goTsQ",
  "refresh_expires_at": "2026-11-28T08:29:29.809033351Z",
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
  "command_id": "8aaa23f3-5e6e-439d-b1ee-d08e81607717",
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
  "correlation_id": "283e205c-f04d-4f16-b46c-391e44b07d6b",
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
  "command_id": "4afe46d9-c786-4920-aa84-833a5dcd74e6",
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
  "paused_at": "2026-10-29T08:29:30.948972235Z",
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
  "command_id": "3c95666c-d535-4a79-8d8a-6569c9704920",
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
  "id": "7a9b14d9-9df5-41cd-a15f-49899b1e583c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:34:31.522925Z",
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
  "command_id": "9ec54e03-e2a0-4947-bdb0-ac15dd31acf1",
  "quote_id": "7a9b14d9-9df5-41cd-a15f-49899b1e583c",
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
  "correlation_id": "4ad1bdca-06f9-40aa-9448-c5b8282cac61"
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
  "paused_at": "2026-10-29T08:29:30.948972Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "5330c90e-9d34-4275-836a-9c28f73d83ef",
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
  "command_id": "2ce66f39-2509-4165-88fa-7e8b8909bc4b",
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
  "command_id": "d9e21b76-4d70-4e00-8b13-99534cdac630",
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
  "id": "e2ead536-cbac-4c10-81ba-5335e5f4b843",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:34:33.263451Z",
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
  "command_id": "353043b8-2a4a-46b3-876b-7aa054f5c54b",
  "quote_id": "e2ead536-cbac-4c10-81ba-5335e5f4b843",
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
  "correlation_id": "9f0992e6-45f3-4a7b-ba0c-9cb27ddaa016"
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
  "command_id": "0a9e95ac-fadc-4d87-92dd-18c42152e2ff",
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
  "command_id": "8161b73b-078c-4eea-9d5e-6ae851ea87e8",
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
  "id": "3aef509d-4702-4c7c-90d5-5d8c438a1ae3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:34:34.429005Z",
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
  "command_id": "ed0c0d4d-8b35-4702-b992-9c6c36ceacd8",
  "quote_id": "3aef509d-4702-4c7c-90d5-5d8c438a1ae3",
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
  "correlation_id": "a2bd5a55-2724-412d-97b9-92dd9e2dc93b"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "0f10bbf6-d05e-4535-a444-83a66cf632b0",
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
  "correlation_id": "6498eb24-d9a5-463d-8958-84b8823c9423"
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
  "command_id": "740934da-48ed-4cbe-9e00-9106226ca576",
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
  "phone": "+380676714378",
  "device_ref": "sandbox-16316"
}
```

```json
{
  "challenge_id": "c7eca8e8-7d69-469a-89f5-cf32efd8ca56",
  "expires_at": "2026-10-29T08:34:35.928170332Z",
  "resend_available_at": "2026-10-29T08:29:36.928170332Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676714378` → **200**

```json
{
  "phone": "+380676714378",
  "audience": "CLIENT",
  "code": "691281",
  "sent_at": "2026-10-29T08:29:35.930407816Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c7eca8e8-7d69-469a-89f5-cf32efd8ca56",
  "code": "691281",
  "device_ref": "sandbox-16316"
}
```

```json
{
  "session_id": "9fabbabb-6398-42f8-b093-4bdbcc327f09",
  "subject": {
    "type": "CLIENT",
    "id": "2e2124dd-a1bb-48e9-a069-191a8bfb5727"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTIxMjRkZC1hMWJiLTQ4ZTktYTA2OS0xOTFhOGJmYjU3MjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzNDc2LCJpYXQiOjE3OTMyNjI1NzYsImp0aSI6IjY0YjA5ZjI1LTM2OTMtNDY2Ni04OWVjLWRiOGMyZTg2MmQ1ZCIsInNpZCI6IjlmYWJiYWJiLTYzOTgtNDJmOC1iMDkzLTRiZGJjYzMyN2YwOSJ9.LboBEPDJkkmfCJnqPROYFJUCYKjn4IaeembnBPSaxzM",
  "access_expires_at": "2026-10-29T08:44:36.24495159Z",
  "refresh_token": "7hLv2cxPBpdhgMj7jteTBcRnO3rT0Tr5G_KTuSLRsYA",
  "refresh_expires_at": "2026-11-28T08:29:36.244395727Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "2e2124dd-a1bb-48e9-a069-191a8bfb5727",
  "session_id": "9fabbabb-6398-42f8-b093-4bdbcc327f09",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a3655a0e-a1af-48b5-8157-adb7bb14e741",
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
  "id": "4361527f-0fc1-460d-97da-32e724ca1837",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:34:36.807079Z",
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
  "challenge_id": "7fd6bfc8-99e0-444d-888d-9cf75d3494b4",
  "expires_at": "2026-10-29T08:34:39.110022849Z",
  "resend_available_at": "2026-10-29T08:29:40.110022849Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676714378` → **200**

```json
{
  "phone": "+380676714378",
  "audience": "CLIENT",
  "code": "537258",
  "sent_at": "2026-10-29T08:29:39.112056891Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "fc374c90-ef83-4153-9b88-38aab359ee01",
  "challenge_id": "7fd6bfc8-99e0-444d-888d-9cf75d3494b4",
  "otp_code": "537258"
}
```

```json
{
  "client_id": "2e2124dd-a1bb-48e9-a069-191a8bfb5727",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T08:29:39.435597811Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "5ee3d97d-f3ad-42e5-9e67-a6562f38f1c5",
  "quote_id": "4361527f-0fc1-460d-97da-32e724ca1837",
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
  "correlation_id": "eff96159-0fd4-49b6-855f-89933f3ba673"
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
  "session_id": "8ac5ab76-42a5-4e3e-b988-5cab6bf8c942",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM0ODAsImlhdCI6MTc5MzI2MjU4MCwianRpIjoiNzJlYWNkNWMtNTdmMC00YTMxLThhN2YtYmVkYjRkY2RlNDYyIiwic2lkIjoiOGFjNWFiNzYtNDJhNS00ZTNlLWI5ODgtNWNhYjZiZjhjOTQyIn0.Xy_SKR5Xu08u4xDiHcuEb2WnZ1QmRchcd9T79dcHHLo",
  "access_expires_at": "2026-10-29T08:44:40.322399197Z",
  "refresh_token": "_NoSMnBfeMCICwPZWG91jHxXHNUAArubIaXrUrSabMA",
  "refresh_expires_at": "2026-10-29T20:29:40.32186809Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "2e2124dd-a1bb-48e9-a069-191a8bfb5727",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T08:29:39.435598Z",
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

`POST /api/admin/v1/client-deletions/2e2124dd-a1bb-48e9-a069-191a8bfb5727/complete` → **200**

```json
{
  "command_id": "2cd9f301-87d8-41e2-b111-b18aa7211f6f",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "2e2124dd-a1bb-48e9-a069-191a8bfb5727",
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
  "correlation_id": "6898b810-7ef3-4fe0-8651-d4a5c251521c"
}
```

Done: client 2e2124dd-a1bb-48e9-a069-191a8bfb5727 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664670609",
  "device_ref": "sandbox-5699"
}
```

```json
{
  "challenge_id": "a82e4fb7-c8a3-434c-a041-136314d677a7",
  "expires_at": "2026-10-29T08:34:41.50483781Z",
  "resend_available_at": "2026-10-29T08:29:42.50483781Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664670609` → **200**

```json
{
  "phone": "+380664670609",
  "audience": "CLIENT",
  "code": "435446",
  "sent_at": "2026-10-29T08:29:41.507396193Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a82e4fb7-c8a3-434c-a041-136314d677a7",
  "code": "435446",
  "device_ref": "sandbox-5699"
}
```

```json
{
  "session_id": "8c241912-ca8d-437f-b3a4-dee042dd81a8",
  "subject": {
    "type": "CLIENT",
    "id": "d43bf3df-e2c4-4630-a37c-09a93a328655"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNDNiZjNkZi1lMmM0LTQ2MzAtYTM3Yy0wOWE5M2EzMjg2NTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzNDgxLCJpYXQiOjE3OTMyNjI1ODEsImp0aSI6ImJmNTIxNmEzLWRjZGItNDkxYy1hOGM4LWQ3ZmM3MzM3NTM5OCIsInNpZCI6IjhjMjQxOTEyLWNhOGQtNDM3Zi1iM2E0LWRlZTA0MmRkODFhOCJ9.usSVkrV_S7ZLD0KyFaCC_5JaNpX7Tcb4gCbIkxAsUEs",
  "access_expires_at": "2026-10-29T08:44:41.82111754Z",
  "refresh_token": "jyOnB_dz37Cedl85Dn7zD6xBe6Z60ptLFGst6UEPju0",
  "refresh_expires_at": "2026-11-28T08:29:41.820583638Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d43bf3df-e2c4-4630-a37c-09a93a328655",
  "session_id": "8c241912-ca8d-437f-b3a4-dee042dd81a8",
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
  "session_id": "a20715ed-d27a-4523-af0f-b24ae81346a3",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM0ODIsImlhdCI6MTc5MzI2MjU4MiwianRpIjoiYzlkNzA4MDktZjc0MC00N2MyLThlZjYtYWE3MWU4MmM2MWM0Iiwic2lkIjoiYTIwNzE1ZWQtZDI3YS00NTIzLWFmMGYtYjI0YWU4MTM0NmEzIn0.VbPa-tMl6U7b3WgJ_lp_NlurLcGpX5eo08spY7Esp-A",
  "access_expires_at": "2026-10-29T08:44:42.686717007Z",
  "refresh_token": "YXA-aptSuI8wH8C1PvIqp-fuQ_T7jGJDOVxS2TNctb8",
  "refresh_expires_at": "2026-10-29T20:29:42.686178998Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=4670609&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "d43bf3df-e2c4-4630-a37c-09a93a328655",
      "phone": "+380664670609",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T08:29:41.818855Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/d43bf3df-e2c4-4630-a37c-09a93a328655` → **200**

```json
{
  "client": {
    "id": "d43bf3df-e2c4-4630-a37c-09a93a328655",
    "phone": "+380664670609",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T08:29:41.818855Z",
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

`POST /api/admin/v1/clients/d43bf3df-e2c4-4630-a37c-09a93a328655/block` → **400**

```json
{
  "command_id": "bfa44582-88cc-4aad-9dbe-55ac7f377918",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/d43bf3df-e2c4-4630-a37c-09a93a328655/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "eec34ff4-3a4b-4019-b09e-27b17f48c0a4",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/d43bf3df-e2c4-4630-a37c-09a93a328655/block` → **200**

```json
{
  "command_id": "1e2ddb3a-6829-4f02-bcea-0baa51a12a32",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "d43bf3df-e2c4-4630-a37c-09a93a328655",
  "phone": "+380664670609",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T08:29:41.818855Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T08:29:43.911408Z",
    "by": "85782d39-1a26-4896-83e2-d51f63705ba3"
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
  "correlation_id": "e9f46163-971e-4abd-9c66-ecd36055d6ed"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664670609",
  "device_ref": "sandbox-15374"
}
```

```json
{
  "challenge_id": "9ac133db-0583-490d-af28-fea7a40596a3",
  "expires_at": "2026-10-29T08:34:46.482216731Z",
  "resend_available_at": "2026-10-29T08:29:47.482216731Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664670609` → **200**

```json
{
  "phone": "+380664670609",
  "audience": "CLIENT",
  "code": "427286",
  "sent_at": "2026-10-29T08:29:46.484399164Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "9ac133db-0583-490d-af28-fea7a40596a3",
  "code": "427286",
  "device_ref": "sandbox-15374"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "588b8388-3071-4909-b41b-ad765e346a56"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/d43bf3df-e2c4-4630-a37c-09a93a328655` → **200**

```json
{
  "client": {
    "id": "d43bf3df-e2c4-4630-a37c-09a93a328655",
    "phone": "+380664670609",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T08:29:41.818855Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T08:29:43.911408Z",
      "by": "85782d39-1a26-4896-83e2-d51f63705ba3"
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

`POST /api/admin/v1/clients/d43bf3df-e2c4-4630-a37c-09a93a328655/unblock` → **200**

```json
{
  "command_id": "900eee34-0025-4cf0-b7bd-affb7b4b041d",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "d43bf3df-e2c4-4630-a37c-09a93a328655",
  "phone": "+380664670609",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T08:29:41.818855Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664670609",
  "device_ref": "sandbox-1421"
}
```

```json
{
  "challenge_id": "079ba592-481b-494b-bdd6-ea83f75e8b7a",
  "expires_at": "2026-10-29T08:34:49.67718844Z",
  "resend_available_at": "2026-10-29T08:29:50.67718844Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664670609` → **200**

```json
{
  "phone": "+380664670609",
  "audience": "CLIENT",
  "code": "332499",
  "sent_at": "2026-10-29T08:29:49.67969046Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "079ba592-481b-494b-bdd6-ea83f75e8b7a",
  "code": "332499",
  "device_ref": "sandbox-1421"
}
```

```json
{
  "session_id": "73f09826-b324-46a0-9617-5747796b62b3",
  "subject": {
    "type": "CLIENT",
    "id": "d43bf3df-e2c4-4630-a37c-09a93a328655"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNDNiZjNkZi1lMmM0LTQ2MzAtYTM3Yy0wOWE5M2EzMjg2NTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzNDg5LCJpYXQiOjE3OTMyNjI1ODksImp0aSI6IjMzZGQ0NzFjLWJmNzEtNGRhZC1hOTgxLTg4Njc5YWU1ODFlOCIsInNpZCI6IjczZjA5ODI2LWIzMjQtNDZhMC05NjE3LTU3NDc3OTZiNjJiMyJ9.D5pdnTjsHT6ufAxbhEw30-9D_vEVSHeOh7pImd83rFs",
  "access_expires_at": "2026-10-29T08:44:49.978394068Z",
  "refresh_token": "m7qpp8jh66Y3n7ESCWCbHHGrRk-EgHxaJJ18c2f2z5w",
  "refresh_expires_at": "2026-11-28T08:29:49.977888348Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d43bf3df-e2c4-4630-a37c-09a93a328655",
  "session_id": "73f09826-b324-46a0-9617-5747796b62b3",
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
  "phone": "+380663450572",
  "device_ref": "sandbox-1001"
}
```

```json
{
  "challenge_id": "7464bbf7-f43f-48c2-a4dd-9c8c5bf9b903",
  "expires_at": "2026-10-29T08:34:50.532933434Z",
  "resend_available_at": "2026-10-29T08:29:51.532933434Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663450572` → **200**

```json
{
  "phone": "+380663450572",
  "audience": "CLIENT",
  "code": "228825",
  "sent_at": "2026-10-29T08:29:50.535491445Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7464bbf7-f43f-48c2-a4dd-9c8c5bf9b903",
  "code": "228825",
  "device_ref": "sandbox-1001"
}
```

```json
{
  "session_id": "cbacafac-198f-4446-8249-f3738b2fe773",
  "subject": {
    "type": "CLIENT",
    "id": "fa0bfa53-6700-41ba-a60e-915e6fe87c72"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYTBiZmE1My02NzAwLTQxYmEtYTYwZS05MTVlNmZlODdjNzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzNDkwLCJpYXQiOjE3OTMyNjI1OTAsImp0aSI6IjhiNmExMjRhLWZmNmYtNDYxZS1hMGVmLWRjOTc3OTk0N2NlMyIsInNpZCI6ImNiYWNhZmFjLTE5OGYtNDQ0Ni04MjQ5LWYzNzM4YjJmZTc3MyJ9.RJ5qjDblTLiiwR9gquIRZT6c73TKnnqX4YAQ8tK2xgs",
  "access_expires_at": "2026-10-29T08:44:50.836659525Z",
  "refresh_token": "NSm_Jh3GJ_wqVkK6sOD9YL6CcN5B1debJygxB6BzgHU",
  "refresh_expires_at": "2026-11-28T08:29:50.836168202Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7c62dc6b-298b-4155-80e2-ed4a7ec5c648",
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
  "id": "9041a078-3fae-47ef-91fc-f080821aa84c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:34:51.115476Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: fb5d40db-0476-4b0a-99f6-111e67f1aedc) → **201**

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
  "session_id": "95f68b9d-2bf7-4a53-b8b6-0beff4f37020",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM0OTEsImlhdCI6MTc5MzI2MjU5MSwianRpIjoiN2U1MjE5MDktNWM4My00N2I3LTliNzUtOWZjMTg4NzFmNWQ2Iiwic2lkIjoiOTVmNjhiOWQtMmJmNy00YTUzLWI4YjYtMGJlZmY0ZjM3MDIwIn0.V4adMLm0OxGKsyMrZFSXwi3QcW4u1mSZf0OhoH8WSNQ",
  "access_expires_at": "2026-10-29T08:44:51.732366704Z",
  "refresh_token": "6gI31J3TynNGjS7rLAYJ2Uo_e2Dt1ulZSC3RkmF6XUE",
  "refresh_expires_at": "2026-10-29T20:29:51.731818276Z",
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
  "session_id": "5ff8589f-1dea-4be3-9711-10dd20d708b4",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM0OTIsImlhdCI6MTc5MzI2MjU5MiwianRpIjoiZGZlMDZhODctNGQwYy00NTBhLThjMmUtMzEyNjIwZmExZWRiIiwic2lkIjoiNWZmODU4OWYtMWRlYS00YmUzLTk3MTEtMTBkZDIwZDcwOGI0In0.e5yU1WmmnNErSTxMojxF4SdG8HgsW2GadEHT5zHmKAo",
  "access_expires_at": "2026-10-29T08:44:52.30326146Z",
  "refresh_token": "N-gg62yBv7_MQs52lKOvA3LaAPMqm2k1pea-USx87Cc",
  "refresh_expires_at": "2026-10-29T20:29:52.302679679Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5e51a513-42fd-4f9d-8ea2-89d68e2b535d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T08:29:51.405673Z",
      "actor": {
        "type": "CLIENT",
        "id": "fa0bfa53-6700-41ba-a60e-915e6fe87c72",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5e51a513-42fd-4f9d-8ea2-89d68e2b535d",
        "quote_id": "9041a078-3fae-47ef-91fc-f080821aa84c",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "fb5d40db-0476-4b0a-99f6-111e67f1aedc"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T08:29:51.407754Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5e51a513-42fd-4f9d-8ea2-89d68e2b535d",
        "attempt_id": "aa08b1d9-089b-4bc3-83ed-90554ad275af",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "fb5d40db-0476-4b0a-99f6-111e67f1aedc"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T08:29:51.414794Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5e51a513-42fd-4f9d-8ea2-89d68e2b535d",
        "attempt_id": "aa08b1d9-089b-4bc3-83ed-90554ad275af"
      },
      "correlation_id": "fb5d40db-0476-4b0a-99f6-111e67f1aedc"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "aa08b1d9-089b-4bc3-83ed-90554ad275af",
        "generation": 1,
        "started_at": "2026-10-29T08:29:51.406694Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T08:29:51.414794Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T08:29:51.408638Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/fb5d40db-0476-4b0a-99f6-111e67f1aedc` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "5e51a513-42fd-4f9d-8ea2-89d68e2b535d:0",
      "order_id": "5e51a513-42fd-4f9d-8ea2-89d68e2b535d",
      "at": "2026-10-29T08:29:51.405673Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "5e51a513-42fd-4f9d-8ea2-89d68e2b535d:1",
      "order_id": "5e51a513-42fd-4f9d-8ea2-89d68e2b535d",
      "at": "2026-10-29T08:29:51.407754Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "5e51a513-42fd-4f9d-8ea2-89d68e2b535d:2",
      "order_id": "5e51a513-42fd-4f9d-8ea2-89d68e2b535d",
      "at": "2026-10-29T08:29:51.414794Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/01b264dd-1f6f-4d0d-bd59-ce6333e1dee9` → **200**

```json
{
  "found": []
}
```

Done: request fb5d40db-0476-4b0a-99f6-111e67f1aedc — order 5e51a513-42fd-4f9d-8ea2-89d68e2b535d found by its id.

`GET /api/rider/v1/orders/5e51a513-42fd-4f9d-8ea2-89d68e2b535d` → **200**

```json
{
  "id": "5e51a513-42fd-4f9d-8ea2-89d68e2b535d",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fa0bfa53-6700-41ba-a60e-915e6fe87c72",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:29:51.405193Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5e51a513-42fd-4f9d-8ea2-89d68e2b535d/cancel` → **200**

```json
{
  "command_id": "cdd24dc5-46a3-467a-8eeb-85c718d63941",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5e51a513-42fd-4f9d-8ea2-89d68e2b535d",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fa0bfa53-6700-41ba-a60e-915e6fe87c72",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T08:29:51.405193Z",
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
  "phone": "+380633668371",
  "device_ref": "sandbox-14696"
}
```

```json
{
  "challenge_id": "cee7b4a4-79d4-4824-a210-339006ef4948",
  "expires_at": "2026-10-29T08:34:54.05232293Z",
  "resend_available_at": "2026-10-29T08:29:55.05232293Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633668371` → **200**

```json
{
  "phone": "+380633668371",
  "audience": "CLIENT",
  "code": "607292",
  "sent_at": "2026-10-29T08:29:54.054536227Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cee7b4a4-79d4-4824-a210-339006ef4948",
  "code": "607292",
  "device_ref": "sandbox-14696"
}
```

```json
{
  "session_id": "3ad04b3c-750d-40e1-ad7a-7b6580cc0178",
  "subject": {
    "type": "CLIENT",
    "id": "54ca9c55-772f-480d-9d0c-35d2d35167a9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NGNhOWM1NS03NzJmLTQ4MGQtOWQwYy0zNWQyZDM1MTY3YTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzNDk0LCJpYXQiOjE3OTMyNjI1OTQsImp0aSI6IjlkN2UyNjk3LTQ3YTEtNDE5Zi1iOGI1LTQ0N2NiNmNjMWY3ZiIsInNpZCI6IjNhZDA0YjNjLTc1MGQtNDBlMS1hZDdhLTdiNjU4MGNjMDE3OCJ9.hX90aQH4vWfl-GK9dIGicw2JNzWD01PNw9UoOt1uH3Y",
  "access_expires_at": "2026-10-29T08:44:54.360294339Z",
  "refresh_token": "1u8e0JR56pynHoDbYB4zWuyNXETAo6sVWKDT4lDs950",
  "refresh_expires_at": "2026-11-28T08:29:54.359752092Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "9fa4658e-8c71-4493-9c82-4245169928e2",
  "expires_at": "2026-10-29T08:34:56.645020521Z",
  "resend_available_at": "2026-10-29T08:29:57.645020521Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633668371` → **200**

```json
{
  "phone": "+380633668371",
  "audience": "CLIENT",
  "code": "453599",
  "sent_at": "2026-10-29T08:29:56.647308414Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "64df76f7-6688-40db-b4ce-6926eadcd9c3",
  "challenge_id": "9fa4658e-8c71-4493-9c82-4245169928e2",
  "otp_code": "453599"
}
```

```json
{
  "id": "80761264-c1df-423b-bebb-2ba3ce6e9660",
  "state": "PENDING",
  "created_at": "2026-10-29T08:29:56.958787Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/80761264-c1df-423b-bebb-2ba3ce6e9660` → **200**

```json
{
  "id": "80761264-c1df-423b-bebb-2ba3ce6e9660",
  "state": "PENDING",
  "created_at": "2026-10-29T08:29:56.958787Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/80761264-c1df-423b-bebb-2ba3ce6e9660` → **200**

```json
{
  "id": "80761264-c1df-423b-bebb-2ba3ce6e9660",
  "state": "PENDING",
  "created_at": "2026-10-29T08:29:56.958787Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/80761264-c1df-423b-bebb-2ba3ce6e9660` → **200**

```json
{
  "id": "80761264-c1df-423b-bebb-2ba3ce6e9660",
  "state": "PENDING",
  "created_at": "2026-10-29T08:29:56.958787Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/80761264-c1df-423b-bebb-2ba3ce6e9660` → **200**

```json
{
  "id": "80761264-c1df-423b-bebb-2ba3ce6e9660",
  "state": "PENDING",
  "created_at": "2026-10-29T08:29:56.958787Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/80761264-c1df-423b-bebb-2ba3ce6e9660` → **200**

```json
{
  "id": "80761264-c1df-423b-bebb-2ba3ce6e9660",
  "state": "PENDING",
  "created_at": "2026-10-29T08:29:56.958787Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/80761264-c1df-423b-bebb-2ba3ce6e9660` → **200**

```json
{
  "id": "80761264-c1df-423b-bebb-2ba3ce6e9660",
  "state": "PENDING",
  "created_at": "2026-10-29T08:29:56.958787Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/80761264-c1df-423b-bebb-2ba3ce6e9660` → **200**

```json
{
  "id": "80761264-c1df-423b-bebb-2ba3ce6e9660",
  "state": "PENDING",
  "created_at": "2026-10-29T08:29:56.958787Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/80761264-c1df-423b-bebb-2ba3ce6e9660` → **200**

```json
{
  "id": "80761264-c1df-423b-bebb-2ba3ce6e9660",
  "state": "PENDING",
  "created_at": "2026-10-29T08:29:56.958787Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/80761264-c1df-423b-bebb-2ba3ce6e9660` → **200**

```json
{
  "id": "80761264-c1df-423b-bebb-2ba3ce6e9660",
  "state": "READY",
  "created_at": "2026-10-29T08:29:56.958787Z",
  "ready_at": "2026-10-29T08:30:06.780724Z",
  "expires_at": "2026-11-05T08:30:06.780724Z",
  "size_bytes": 1030
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/80761264-c1df-423b-bebb-2ba3ce6e9660/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632475157",
  "device_ref": "sandbox-163"
}
```

```json
{
  "challenge_id": "ce3c3815-87d6-4aeb-882c-18d996e65fb4",
  "expires_at": "2026-10-29T08:35:07.725873805Z",
  "resend_available_at": "2026-10-29T08:30:08.725873805Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632475157` → **200**

```json
{
  "phone": "+380632475157",
  "audience": "CLIENT",
  "code": "655286",
  "sent_at": "2026-10-29T08:30:07.728486392Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ce3c3815-87d6-4aeb-882c-18d996e65fb4",
  "code": "655286",
  "device_ref": "sandbox-163"
}
```

```json
{
  "session_id": "c11ff1f9-f459-4c61-8fbe-8e76b7b507df",
  "subject": {
    "type": "CLIENT",
    "id": "a868b404-dead-4239-aa36-1f24934b0356"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhODY4YjQwNC1kZWFkLTQyMzktYWEzNi0xZjI0OTM0YjAzNTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzNTA4LCJpYXQiOjE3OTMyNjI2MDgsImp0aSI6ImFkMGNjNGNiLTc1MjgtNGQ5Zi04MTk1LWY4YjE3NTVjZGZhYiIsInNpZCI6ImMxMWZmMWY5LWY0NTktNGM2MS04ZmJlLThlNzZiN2I1MDdkZiJ9.bNTahDpzopQzB_3K7n0_GLDHcxREfyjiI20_NpJ1oVI",
  "access_expires_at": "2026-10-29T08:45:08.032366589Z",
  "refresh_token": "GF3dtwEkwcBHmASMans_jjdYeaRotecfjs7VP6scqto",
  "refresh_expires_at": "2026-11-28T08:30:08.031822448Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/80761264-c1df-423b-bebb-2ba3ce6e9660/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/80761264-c1df-423b-bebb-2ba3ce6e9660/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e7e13b40-b0ca-4444-b036-9bf7d06ce181"
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
  "session_id": "27496937-dc51-48c0-8e7e-7ff8ee3a0f63",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM1MDgsImlhdCI6MTc5MzI2MjYwOCwianRpIjoiYTc2M2M5ZGYtMTUyMi00MWI4LThjYmEtNWM1NDlhNTJkNTZlIiwic2lkIjoiMjc0OTY5MzctZGM1MS00OGMwLThlN2UtN2ZmOGVlM2EwZjYzIn0._P-BHsNYp8LyPVSMjxk_hqHCewm5qORoakUdSPMRvR0",
  "access_expires_at": "2026-10-29T08:45:08.902226549Z",
  "refresh_token": "CbkKfwg29ZkUF6mKRDP_7G9UdRv3yF27nyrsE1Lo0Ew",
  "refresh_expires_at": "2026-10-29T20:30:08.901672179Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "54ca9c55-772f-480d-9d0c-35d2d35167a9",
  "session_id": "3ad04b3c-750d-40e1-ad7a-7b6580cc0178",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/54ca9c55-772f-480d-9d0c-35d2d35167a9/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "80761264-c1df-423b-bebb-2ba3ce6e9660",
      "state": "READY",
      "created_at": "2026-10-29T08:29:56.958787Z",
      "ready_at": "2026-10-29T08:30:06.780724Z",
      "expires_at": "2026-11-05T08:30:06.780724Z",
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
  "device_ref": "sandbox-6481"
}
```

```json
{
  "challenge_id": "6eb7cc8a-214c-4107-af7c-86c69d7f5a76",
  "expires_at": "2026-10-29T08:35:09.734129876Z",
  "resend_available_at": "2026-10-29T08:30:10.734129876Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "191059",
  "sent_at": "2026-10-29T08:30:09.736423069Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6eb7cc8a-214c-4107-af7c-86c69d7f5a76",
  "code": "191059",
  "device_ref": "sandbox-6481"
}
```

```json
{
  "session_id": "4077ff80-09b2-4b34-91fd-7233bc291b1a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MzUxMCwiaWF0IjoxNzkzMjYyNjEwLCJqdGkiOiIwYzBiMTEwYS0yN2Q5LTRlYzEtYTg0ZS05OWZmZTQ4ZWNiYjUiLCJzaWQiOiI0MDc3ZmY4MC0wOWIyLTRiMzQtOTFmZC03MjMzYmMyOTFiMWEifQ.dy26TO05tZjs8qRmOhGUEhPnf_1F-uNnLs4szNOj23Q",
  "access_expires_at": "2026-10-29T08:45:10.031378408Z",
  "refresh_token": "F6-ZI07TAlREQClmbge44aHae79vVV8dJ9VlkvfDySU",
  "refresh_expires_at": "2026-11-28T08:30:10.030827297Z",
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
  "device_ref": "sandbox-26145"
}
```

```json
{
  "challenge_id": "64dee3ac-5b15-4406-8852-3ee2be82ce46",
  "expires_at": "2026-10-29T08:35:10.590007316Z",
  "resend_available_at": "2026-10-29T08:30:11.590007316Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "450274",
  "sent_at": "2026-10-29T08:30:10.592461185Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "64dee3ac-5b15-4406-8852-3ee2be82ce46",
  "code": "450274",
  "device_ref": "sandbox-26145"
}
```

```json
{
  "session_id": "2adf2134-f582-4ecf-91b5-0953d8d2be0c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MzUxMCwiaWF0IjoxNzkzMjYyNjEwLCJqdGkiOiI4OTBmOTg5Ni00YTc5LTQ2NzYtOGFjZC1iNmVjZTdhYjczZmMiLCJzaWQiOiIyYWRmMjEzNC1mNTgyLTRlY2YtOTFiNS0wOTUzZDhkMmJlMGMifQ.9frs0TbO6bO82IhziyNIrjnZxBzzpzbJO5yUjYWinJ0",
  "access_expires_at": "2026-10-29T08:45:10.891640925Z",
  "refresh_token": "OMdpd8z9U5G_fkM1tT86WBErxfTpRh2YebMV-NN7D5k",
  "refresh_expires_at": "2026-11-28T08:30:10.891139053Z",
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
  "command_id": "79fe7f2c-14b2-493b-ae07-d0f673e9d06e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:30:11Z",
    "sequence": 1793262611446
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a0f71e5d-4142-4714-bf19-d621ba6a3708",
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
  "last_heartbeat_at": "2026-10-29T08:30:11.466062Z",
  "last_location_at": "2026-10-29T08:30:11.466062Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-26613"
}
```

```json
{
  "challenge_id": "173f6360-547f-4f63-b4f5-c3c8ddda032f",
  "expires_at": "2026-10-29T08:35:11.742642967Z",
  "resend_available_at": "2026-10-29T08:30:12.742642967Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "179365",
  "sent_at": "2026-10-29T08:30:11.744920606Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "173f6360-547f-4f63-b4f5-c3c8ddda032f",
  "code": "179365",
  "device_ref": "sandbox-26613"
}
```

```json
{
  "session_id": "8977e56c-285f-4b3b-a588-59728ce5b26b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MzUxMiwiaWF0IjoxNzkzMjYyNjEyLCJqdGkiOiIwM2Y0NzUxNC1jMTVhLTQ0ZDktOTQ0Yi05ZDZiMjhhYmIwYzMiLCJzaWQiOiI4OTc3ZTU2Yy0yODVmLTRiM2ItYTU4OC01OTcyOGNlNWIyNmIifQ.06_dC8fMb5piPTn5lREifkv7CJFyy_JWrGIxhF_l_NA",
  "access_expires_at": "2026-10-29T08:45:12.05297991Z",
  "refresh_token": "_UNZ-BzQg1oLDrUxUBj4l6usUlISswLYa76tbApb7GY",
  "refresh_expires_at": "2026-11-28T08:30:12.052419859Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6e9ed5c7-637a-4d58-995e-d6925a9fe24f",
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
  "last_heartbeat_at": "2026-10-29T08:28:51.310504Z",
  "last_location_at": "2026-10-29T08:28:51.310504Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6e9ed5c7-637a-4d58-995e-d6925a9fe24f/handover` → **200**

```json
{
  "command_id": "754b9818-38be-4b7b-9a36-a78f772080d0",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6e9ed5c7-637a-4d58-995e-d6925a9fe24f",
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
  "last_heartbeat_at": "2026-10-29T08:28:51.310504Z",
  "last_location_at": "2026-10-29T08:28:51.310504Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6e9ed5c7-637a-4d58-995e-d6925a9fe24f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:30:12Z",
    "sequence": 1793262612881
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6e9ed5c7-637a-4d58-995e-d6925a9fe24f",
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
  "last_heartbeat_at": "2026-10-29T08:30:12.900397Z",
  "last_location_at": "2026-10-29T08:30:12.900397Z",
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
  "session_id": "c3697f55-1259-4bc7-a1b4-52b4e1c5c20d",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM1MTMsImlhdCI6MTc5MzI2MjYxMywianRpIjoiZmY3OGM5ODYtNjhhZC00Zjk0LTgyYjMtNzExMjU1ZTgzMTBlIiwic2lkIjoiYzM2OTdmNTUtMTI1OS00YmM3LWExYjQtNTJiNGUxYzVjMjBkIn0.jPmmEqOmMVfOGnbT9kVKZNVLktoB_V28j3kczSh-vM4",
  "access_expires_at": "2026-10-29T08:45:13.466048144Z",
  "refresh_token": "lCOYbqFtr2olMALoxIbezQpf4OB28NlpMJexBhZ8U-A",
  "refresh_expires_at": "2026-10-29T20:30:13.465440184Z",
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
  "session_id": "7105dee5-8bd3-4886-b501-15d689f921f2",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM1MTQsImlhdCI6MTc5MzI2MjYxNCwianRpIjoiOWM0NzI5NzctODZjYi00YzI5LThkOTItZWZjYTg5MzgyMTI0Iiwic2lkIjoiNzEwNWRlZTUtOGJkMy00ODg2LWI1MDEtMTVkNjg5ZjkyMWYyIn0.8mU9B6x23z7rzObaWA1LQfE35FjHh4b_SKgLJ51_X5U",
  "access_expires_at": "2026-10-29T08:45:14.022292916Z",
  "refresh_token": "bM8qQFZmw7XOEAaJzQvXUXV2g6ysMQajnah0C4nxkd8",
  "refresh_expires_at": "2026-10-29T20:30:14.021658809Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380688810035",
  "device_ref": "sandbox-5484"
}
```

```json
{
  "challenge_id": "19aeb318-b5d2-466f-846b-bd0713afc6dd",
  "expires_at": "2026-10-29T08:35:14.293517755Z",
  "resend_available_at": "2026-10-29T08:30:15.293517755Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380688810035` → **200**

```json
{
  "phone": "+380688810035",
  "audience": "CLIENT",
  "code": "072296",
  "sent_at": "2026-10-29T08:30:14.296011585Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "19aeb318-b5d2-466f-846b-bd0713afc6dd",
  "code": "072296",
  "device_ref": "sandbox-5484"
}
```

```json
{
  "session_id": "53e5828f-cbf4-4466-b149-f12390759d3a",
  "subject": {
    "type": "CLIENT",
    "id": "510194f1-ff04-42c8-b12f-5fc06d4bcbac"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MTAxOTRmMS1mZjA0LTQyYzgtYjEyZi01ZmMwNmQ0YmNiYWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzNTE0LCJpYXQiOjE3OTMyNjI2MTQsImp0aSI6ImE0YTBhYWFlLWY1MTItNDI0OC05ZDI2LTQyMTgzMzhhMWYyYyIsInNpZCI6IjUzZTU4MjhmLWNiZjQtNDQ2Ni1iMTQ5LWYxMjM5MDc1OWQzYSJ9.r44YKdsIrcgIfd-XOPTeAFJk1-8dduRbT1n4iOq5wTE",
  "access_expires_at": "2026-10-29T08:45:14.59574118Z",
  "refresh_token": "PgdCA5AbL8OPzRgg370w--ETWafSU11m_t7xUeBL9RI",
  "refresh_expires_at": "2026-11-28T08:30:14.595261048Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c30bf942-dc34-4558-a339-3e1a20c1c3be",
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
  "id": "3cf5b7a2-bcc0-4197-8095-69658bda2eaa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:35:14.872069Z",
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
  "command_id": "2527338e-215c-4baf-8d42-219d02dda698",
  "quote_id": "3cf5b7a2-bcc0-4197-8095-69658bda2eaa",
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
  "id": "a427086f-a7dd-476c-b03f-ec7c095ac4b4",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "510194f1-ff04-42c8-b12f-5fc06d4bcbac",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T08:30:15.158675Z",
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
    "id": "97487969-2262-43ea-8962-09d1d70a3282",
    "order_id": "a427086f-a7dd-476c-b03f-ec7c095ac4b4",
    "expires_at": "2026-10-29T08:30:30.162418Z",
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

`POST /api/driver/v1/offers/97487969-2262-43ea-8962-09d1d70a3282/reject` → **204**

```json
{
  "command_id": "5448a629-ccb1-431c-8b19-b3b43469f835"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "83a8e988-f66e-4d99-92c8-30e95e86efce",
    "order_id": "a427086f-a7dd-476c-b03f-ec7c095ac4b4",
    "expires_at": "2026-10-29T08:30:30.741451Z",
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

`POST /api/driver/v1/offers/83a8e988-f66e-4d99-92c8-30e95e86efce/accept` → **200**

```json
{
  "command_id": "eb140457-e8e1-4610-b3fb-50f27e4e1d0f"
}
```

```json
{
  "id": "091662b9-efa5-4bd6-99dc-9ea2807ec665",
  "order_id": "a427086f-a7dd-476c-b03f-ec7c095ac4b4",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ae98abad-3b8d-4132-95d8-a699406d2ca6",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/a427086f-a7dd-476c-b03f-ec7c095ac4b4/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T08:30:15.159211Z",
      "actor": {
        "type": "CLIENT",
        "id": "510194f1-ff04-42c8-b12f-5fc06d4bcbac",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a427086f-a7dd-476c-b03f-ec7c095ac4b4",
        "quote_id": "3cf5b7a2-bcc0-4197-8095-69658bda2eaa",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "baaca365-3abc-4976-8afd-bbde567599e5"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T08:30:15.161515Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a427086f-a7dd-476c-b03f-ec7c095ac4b4",
        "attempt_id": "f3b4b209-0e48-4665-aff0-52ebf93d6993",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "baaca365-3abc-4976-8afd-bbde567599e5"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T08:30:15.168396Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "97487969-2262-43ea-8962-09d1d70a3282",
        "order_id": "a427086f-a7dd-476c-b03f-ec7c095ac4b4",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "baaca365-3abc-4976-8afd-bbde567599e5"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T08:30:15.740406Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "97487969-2262-43ea-8962-09d1d70a3282",
        "order_id": "a427086f-a7dd-476c-b03f-ec7c095ac4b4"
      },
      "correlation_id": "0e441c52-c151-4803-ae06-8f91dda958fe"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order a427086f-a7dd-476c-b03f-ec7c095ac4b4 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/a427086f-a7dd-476c-b03f-ec7c095ac4b4` → **200**

```json
{
  "id": "a427086f-a7dd-476c-b03f-ec7c095ac4b4",
  "short_number": 10,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "510194f1-ff04-42c8-b12f-5fc06d4bcbac",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "091662b9-efa5-4bd6-99dc-9ea2807ec665",
    "order_id": "a427086f-a7dd-476c-b03f-ec7c095ac4b4",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "ae98abad-3b8d-4132-95d8-a699406d2ca6",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T08:30:15.158675Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a427086f-a7dd-476c-b03f-ec7c095ac4b4/cancel` → **200**

```json
{
  "command_id": "ef8a8ed7-25c3-4843-bf18-0b89ff279ee1",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "a427086f-a7dd-476c-b03f-ec7c095ac4b4",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "510194f1-ff04-42c8-b12f-5fc06d4bcbac",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "091662b9-efa5-4bd6-99dc-9ea2807ec665",
    "order_id": "a427086f-a7dd-476c-b03f-ec7c095ac4b4",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "ae98abad-3b8d-4132-95d8-a699406d2ca6",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T08:30:15.158675Z",
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
  "session_id": "a0f71e5d-4142-4714-bf19-d621ba6a3708",
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
  "last_heartbeat_at": "2026-10-29T08:30:11.466062Z",
  "last_location_at": "2026-10-29T08:30:11.466062Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a0f71e5d-4142-4714-bf19-d621ba6a3708/close` → **200**

```json
{
  "command_id": "755184e7-9f62-4a0b-9a8e-973930a57d06",
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
  "session_id": "6e9ed5c7-637a-4d58-995e-d6925a9fe24f",
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
  "last_heartbeat_at": "2026-10-29T08:30:12.900397Z",
  "last_location_at": "2026-10-29T08:30:12.900397Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6e9ed5c7-637a-4d58-995e-d6925a9fe24f/close` → **200**

```json
{
  "command_id": "af334536-11f7-479f-b47d-dbda7b3490f5",
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
  "session_id": "e806486b-e9cc-4128-b46a-57fe32f124a8",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM1MTgsImlhdCI6MTc5MzI2MjYxOCwianRpIjoiZDNiYWExYWQtYWUwZS00YmM2LTg5MWYtNTRiNDkxOWE4MWFjIiwic2lkIjoiZTgwNjQ4NmItZTljYy00MTI4LWI0NmEtNTdmZTMyZjEyNGE4In0.DiQXFDeqzXc7RHlMLKuFnem7IwHQ5LfviO_m1RZXWeM",
  "access_expires_at": "2026-10-29T08:45:18.692464033Z",
  "refresh_token": "li788zgUgVyBRs14bH2oBd1_XXGyjPI6I0ampnsE88E",
  "refresh_expires_at": "2026-10-29T20:30:18.691844472Z",
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
  "command_id": "64923857-f1cf-4e82-afe3-34521b2f3cdf",
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
  "changed_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T08:30:19.27383Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "75db0eb0-f927-49af-b8f6-fb32991b4f67",
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
  "correlation_id": "702d865d-e177-43a4-8131-1d32b608669a"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "943ca0e9-5138-4001-82a3-dd8d47c92ba9",
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
  "correlation_id": "0af56ab8-3216-4a8d-a9e3-f0538165d6a6"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638895358",
  "device_ref": "sandbox-28520"
}
```

```json
{
  "challenge_id": "f464f314-8a34-4fd4-81e2-cf028765075f",
  "expires_at": "2026-10-29T08:35:20.128788445Z",
  "resend_available_at": "2026-10-29T08:30:21.128788445Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638895358` → **200**

```json
{
  "phone": "+380638895358",
  "audience": "CLIENT",
  "code": "120818",
  "sent_at": "2026-10-29T08:30:20.131183175Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f464f314-8a34-4fd4-81e2-cf028765075f",
  "code": "120818",
  "device_ref": "sandbox-28520"
}
```

```json
{
  "session_id": "a56fe369-4a4a-4d14-937d-222cc74cbe35",
  "subject": {
    "type": "CLIENT",
    "id": "108bb8ab-2167-40b4-b2f5-0cf1cc56b355"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMDhiYjhhYi0yMTY3LTQwYjQtYjJmNS0wY2YxY2M1NmIzNTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzNTIwLCJpYXQiOjE3OTMyNjI2MjAsImp0aSI6ImE2OTE3MGE5LTIwYmMtNGFiOS1hMzRhLWM1OGExNDU0NTM0OSIsInNpZCI6ImE1NmZlMzY5LTRhNGEtNGQxNC05MzdkLTIyMmNjNzRjYmUzNSJ9.3lHOJBYEwiLxxStEVJOcvKAc2EvsxtmS4m-_0iO9UM8",
  "access_expires_at": "2026-10-29T08:45:20.426515179Z",
  "refresh_token": "8MRY3xjAFFi35g0IHiyfXTp3Lc4Urp6Gs7qabTXmD1Q",
  "refresh_expires_at": "2026-11-28T08:30:20.426025629Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "53c46cf1-1c65-4e16-9a55-b8c827464e0c",
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
  "id": "adf070f1-2ff1-47d6-99bc-deb5dcd0e51a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:35:20.707002Z",
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
  "command_id": "d9979f03-f104-4f19-b73b-9385798305d1",
  "quote_id": "adf070f1-2ff1-47d6-99bc-deb5dcd0e51a",
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
  "correlation_id": "95a9c9ce-85fc-49fc-b4c7-db0e0a7d7dc3"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "19b95b73-a449-4985-a6ed-1a77566cb78b",
  "quote_id": "adf070f1-2ff1-47d6-99bc-deb5dcd0e51a",
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
  "id": "79a90ff2-dbd2-4983-b738-975b8532259f",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "108bb8ab-2167-40b4-b2f5-0cf1cc56b355",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:30:21.280326Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/79a90ff2-dbd2-4983-b738-975b8532259f/cancel` → **200**

```json
{
  "command_id": "79b39e64-a890-42cd-980b-d26a16b02db5",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "79a90ff2-dbd2-4983-b738-975b8532259f",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "108bb8ab-2167-40b4-b2f5-0cf1cc56b355",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T08:30:21.280326Z",
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
  "command_id": "4ae13de6-3543-4d69-8fff-265d99e5a534",
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
  "changed_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T08:30:21.917171Z"
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
      "changed_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T08:30:21.917171Z"
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
  "device_ref": "sandbox-19224"
}
```

```json
{
  "challenge_id": "a9b573a0-3a2e-43c7-8e8a-69c507e02fab",
  "expires_at": "2026-10-29T08:35:22.813616647Z",
  "resend_available_at": "2026-10-29T08:30:23.813616647Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "711501",
  "sent_at": "2026-10-29T08:30:22.81595559Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a9b573a0-3a2e-43c7-8e8a-69c507e02fab",
  "code": "711501",
  "device_ref": "sandbox-19224"
}
```

```json
{
  "session_id": "2789aa1b-df3e-4525-beb4-e72423c1092f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MzUyMywiaWF0IjoxNzkzMjYyNjIzLCJqdGkiOiJiMGU2NjY4OC03NzNiLTQwYTAtOTA4OC0wYWU2MWVhZWQ0MGYiLCJzaWQiOiIyNzg5YWExYi1kZjNlLTQ1MjUtYmViNC1lNzI0MjNjMTA5MmYifQ.qEfookcX6huIgPCAeO831nECKrGlvzpFx55_clfKaaY",
  "access_expires_at": "2026-10-29T08:45:23.147890441Z",
  "refresh_token": "G1S30y0wzcZRLGBTL8vuXytUBnWEP4dW8JPWIxBOPzQ",
  "refresh_expires_at": "2026-11-28T08:30:23.147186623Z",
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
  "command_id": "3c7f5edb-b2c9-4449-85a3-4691fa586706",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:30:23Z",
    "sequence": 1793262623785
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c5d12e44-a170-4edd-8089-88a9dbed9875",
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
  "last_heartbeat_at": "2026-10-29T08:30:23.804786Z",
  "last_location_at": "2026-10-29T08:30:23.804786Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674554368",
  "device_ref": "sandbox-388"
}
```

```json
{
  "challenge_id": "610816e4-b7cb-4533-a3b9-d025c9b73aa5",
  "expires_at": "2026-10-29T08:35:24.081410162Z",
  "resend_available_at": "2026-10-29T08:30:25.081410162Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674554368` → **200**

```json
{
  "phone": "+380674554368",
  "audience": "CLIENT",
  "code": "219522",
  "sent_at": "2026-10-29T08:30:24.083668629Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "610816e4-b7cb-4533-a3b9-d025c9b73aa5",
  "code": "219522",
  "device_ref": "sandbox-388"
}
```

```json
{
  "session_id": "fce590eb-6c45-4bef-862d-cb4bf09b5674",
  "subject": {
    "type": "CLIENT",
    "id": "fa40132a-519f-4754-8787-b01ece96a8bd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYTQwMTMyYS01MTlmLTQ3NTQtODc4Ny1iMDFlY2U5NmE4YmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzNTI0LCJpYXQiOjE3OTMyNjI2MjQsImp0aSI6IjUxYWUyNWE3LTlkYTUtNGMyZS04MTE4LTQ4YWEyZTM1ZTczMiIsInNpZCI6ImZjZTU5MGViLTZjNDUtNGJlZi04NjJkLWNiNGJmMDliNTY3NCJ9.cSapK6FaTkWyEAxx314W3f4osK8BIXyA938bHdT8IGA",
  "access_expires_at": "2026-10-29T08:45:24.392402198Z",
  "refresh_token": "HArP_sPMKX9PjuCrNSRDhSF4EPqQHUOKRpWzZ5q8VHc",
  "refresh_expires_at": "2026-11-28T08:30:24.391866713Z",
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
  "command_id": "bd8a2105-7f0b-49d8-b45a-b3dbcbb5de6c",
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
  "id": "8a9f09ae-5c98-4f40-b0c0-f16fda21b431",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:35:24.954051Z",
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
  "command_id": "fa6f3703-2500-4e7b-86e5-d7a8723c224c",
  "platform": "ANDROID",
  "token": "sandbox-driver-e6f526b8-4dac-446c-bca6-e5cba108e0da"
}
```

```json
{
  "id": "b71a74ce-833f-4c4f-81e7-0dac86fdb11b",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T08:30:25.250111Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "6ee174d8-f356-4df2-9a6b-abbf246cc259",
  "platform": "ANDROID",
  "token": "sandbox-rider-0f85f2fe-8ab3-41e1-98fe-41533acad6db"
}
```

```json
{
  "id": "8ddff8b4-a464-4ac9-855a-f9f4f3ad18ca",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T08:30:25.52991Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0e7f6d1e-cb1f-40b9-8ad1-a91a2dd4dd61",
  "quote_id": "8a9f09ae-5c98-4f40-b0c0-f16fda21b431",
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
  "id": "c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fa40132a-519f-4754-8787-b01ece96a8bd",
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
  "created_at": "2026-10-29T08:30:25.812603Z",
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
    "id": "e628e732-2776-4ace-94db-4bd1e2e2f283",
    "order_id": "c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a",
    "expires_at": "2026-10-29T08:30:40.815805Z",
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

`POST /api/driver/v1/offers/e628e732-2776-4ace-94db-4bd1e2e2f283/accept` → **200**

```json
{
  "command_id": "b072ce2f-9217-41ee-b87e-db8ca8c68ce3"
}
```

```json
{
  "id": "bde94018-2b5d-48e6-9981-9d4ff39eb665",
  "order_id": "c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "40648a22-c876-4a16-935a-c5deb9fb9d88",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T08:30:25.787Z` → **200**

```json
[
  {
    "at": "2026-10-29T08:30:26.227531822Z",
    "token_suffix": "08e0da",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "order_id": "c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a",
      "order_version": "2",
      "event_id": "28f1e45a-e004-424c-a33f-b01dbca469ba",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380674554368&after=2026-10-29T08:30:25.787Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380674554368&after=2026-10-29T08:30:25.787Z` → **200**

```json
[
  {
    "at": "2026-10-29T08:30:27.232925287Z",
    "token_suffix": "cad6db",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "order_id": "c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a",
      "order_version": "3",
      "event_id": "021429cb-05c0-43d7-8e80-9fed47a57ed5",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a/messages` → **201**

```json
{
  "command_id": "c68a4164-d435-4295-bdae-32f63cbcccf5",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "0b54473a-5b14-4b4f-b8e4-34cb73280681",
  "order_id": "c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T08:30:27.760732102Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "40648a22-c876-4a16-935a-c5deb9fb9d88",
  "order_id": "c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a",
  "assignment_id": "bde94018-2b5d-48e6-9981-9d4ff39eb665",
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

`POST /api/driver/v1/trips/40648a22-c876-4a16-935a-c5deb9fb9d88/messages` → **201**

```json
{
  "command_id": "e72f81a1-4d52-41bf-895e-af671b5a737e",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "7f2ac9f2-37f2-4e7f-b482-dc6dbea154ba",
  "order_id": "c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T08:30:28.310733963Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/40648a22-c876-4a16-935a-c5deb9fb9d88/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380674554368"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/c5d12e44-a170-4edd-8089-88a9dbed9875/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:30:29Z",
    "sequence": 1793262629116
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c5d12e44-a170-4edd-8089-88a9dbed9875",
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
  "last_heartbeat_at": "2026-10-29T08:30:29.135024Z",
  "last_location_at": "2026-10-29T08:30:29.135024Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "40648a22-c876-4a16-935a-c5deb9fb9d88",
  "order_id": "c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a",
  "assignment_id": "bde94018-2b5d-48e6-9981-9d4ff39eb665",
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

`POST /api/driver/v1/trips/40648a22-c876-4a16-935a-c5deb9fb9d88/arrive` → **200**

```json
{
  "command_id": "ff2b730d-57bd-416e-9fde-8e6e94f7ea6a",
  "expected_version": 0
}
```

```json
{
  "id": "40648a22-c876-4a16-935a-c5deb9fb9d88",
  "order_id": "c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a",
  "assignment_id": "bde94018-2b5d-48e6-9981-9d4ff39eb665",
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
  "arrived_at": "2026-10-29T08:30:29.674406Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/40648a22-c876-4a16-935a-c5deb9fb9d88/start` → **200**

```json
{
  "command_id": "f00117dc-e4cd-403f-90b4-556958c88cd1",
  "expected_version": 1
}
```

```json
{
  "id": "40648a22-c876-4a16-935a-c5deb9fb9d88",
  "order_id": "c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a",
  "assignment_id": "bde94018-2b5d-48e6-9981-9d4ff39eb665",
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
  "arrived_at": "2026-10-29T08:30:29.674406Z",
  "started_at": "2026-10-29T08:30:29.973474Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/c5d12e44-a170-4edd-8089-88a9dbed9875/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:30:30Z",
    "sequence": 1793262630255
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c5d12e44-a170-4edd-8089-88a9dbed9875",
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
  "last_heartbeat_at": "2026-10-29T08:30:30.273982Z",
  "last_location_at": "2026-10-29T08:30:30.273982Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/40648a22-c876-4a16-935a-c5deb9fb9d88/complete` → **200**

```json
{
  "command_id": "23ca5967-bbbd-460a-9e5f-d353d7869ce0",
  "expected_version": 2,
  "reported_at": "2026-10-29T08:30:30Z",
  "cash_received": true
}
```

```json
{
  "id": "40648a22-c876-4a16-935a-c5deb9fb9d88",
  "order_id": "c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a",
  "assignment_id": "bde94018-2b5d-48e6-9981-9d4ff39eb665",
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
  "arrived_at": "2026-10-29T08:30:29.674406Z",
  "started_at": "2026-10-29T08:30:29.973474Z",
  "completed_at": "2026-10-29T08:30:30.552871Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a` → **200**

```json
{
  "id": "c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a",
  "short_number": 12,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "fa40132a-519f-4754-8787-b01ece96a8bd",
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
    "id": "bde94018-2b5d-48e6-9981-9d4ff39eb665",
    "order_id": "c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "40648a22-c876-4a16-935a-c5deb9fb9d88",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T08:30:25.812603Z",
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
    "id": "c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a",
    "short_number": 12,
    "status": "FULFILLED",
    "created_at": "2026-10-29T08:30:25.812603Z",
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
    "id": "40648a22-c876-4a16-935a-c5deb9fb9d88",
    "order_id": "c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a",
    "order_short_number": 12,
    "created_at": "2026-10-29T08:30:26.392682Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "91de2e9b-e67a-47fa-9d43-1f1dd577ed91",
    "order_id": "973d58c9-f883-4c0d-8306-cc1d86ccbafb",
    "order_short_number": 8,
    "created_at": "2026-10-29T08:29:23.952178Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "8a678c85-fa17-4847-8571-30ceaeedc0d8",
    "order_id": "49a06744-0287-41e2-8009-781a690e2eae",
    "order_short_number": 3,
    "created_at": "2026-10-29T08:28:42.096969Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "a160abde-1ad2-4112-9166-91df092fdd55",
    "order_id": "c4260047-dd70-405f-9a20-4c8ea563d5ea",
    "order_short_number": 2,
    "created_at": "2026-10-29T08:28:22.821741Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "dc05f205-c1fb-4d24-bc03-14ef631d0b7a",
    "order_id": "504e2b50-3d20-4556-961b-183897656c46",
    "order_short_number": 1,
    "created_at": "2026-10-29T08:28:12.954715Z",
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

`GET /api/rider/v1/orders/c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a/tip` → **200**

```json
{
  "order_id": "c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a",
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
  "available_until": "2026-10-30T08:30:30.552871Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a/tip` → **201**

```json
{
  "command_id": "7cea2c44-0b30-483c-8d99-6392d8430f86",
  "amount_minor": 1100
}
```

```json
{
  "id": "6d3379b1-2799-4218-83e6-296b4e2603bb",
  "order_id": "c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T08:30:35.603995Z"
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
  "session_id": "20f5aa4b-adc0-4fb5-88b0-e7b3e463b664",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM1MzYsImlhdCI6MTc5MzI2MjYzNiwianRpIjoiMzFkYjNiOGYtODcwNC00Yzk5LWFmODEtNTY2NzhlOTY0MzE4Iiwic2lkIjoiMjBmNWFhNGItYWRjMC00ZmI1LTg4YjAtZTdiM2U0NjNiNjY0In0.idvQhgE0foBqvq76iDy8TXodGQtjzUWScqOKhVDcgt0",
  "access_expires_at": "2026-10-29T08:45:36.180922Z",
  "refresh_token": "xiAtEGZ43i9Hixnq8YHyolaAGd5MxZr2kODRQZTBSIo",
  "refresh_expires_at": "2026-10-29T20:30:36.180345678Z",
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
        "created": 12,
        "fulfilled": 7,
        "cancelled": 5,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "APP": 11,
          "PHONE": 1
        },
        "by_payment": {
          "CASH": 11,
          "CARD": 1
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
    "created": 12,
    "fulfilled": 7,
    "cancelled": 5,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "APP": 11,
      "PHONE": 1
    },
    "by_payment": {
      "CASH": 11,
      "CARD": 1
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
  "generated_at": "2026-10-29T08:30:36.461913203Z"
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
        "trips": 7,
        "fares_minor": 85179,
        "service_rides_minor": 0,
        "commission_minor": 12780,
        "driver_share_minor": 72399,
        "discounts_minor": 1052,
        "bonuses_granted_minor": 0,
        "paid_by_card_minor": 16297,
        "paid_with_bonuses_minor": 18297,
        "collected_by_drivers_minor": 39016,
        "tips_minor": 5000,
        "rider_debt_change_minor": 10517
      }
    }
  ],
  "total": {
    "trips": 7,
    "fares_minor": 85179,
    "service_rides_minor": 0,
    "commission_minor": 12780,
    "driver_share_minor": 72399,
    "discounts_minor": 1052,
    "bonuses_granted_minor": 0,
    "paid_by_card_minor": 16297,
    "paid_with_bonuses_minor": 18297,
    "collected_by_drivers_minor": 39016,
    "tips_minor": 5000,
    "rider_debt_change_minor": 10517
  },
  "generated_at": "2026-10-29T08:30:36.7484698Z"
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
  "session_id": "de937329-f3d4-4a66-a73f-51c85cb7bcf9",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM1MzcsImlhdCI6MTc5MzI2MjYzNywianRpIjoiMDFiZDI4YzQtZTBkNy00YTY2LTk1OTctMzRhNWFjZjllNTFhIiwic2lkIjoiZGU5MzczMjktZjNkNC00YTY2LWE3M2YtNTFjODVjYjdiY2Y5In0._C_UdOXU9t70nnbgU5T-hgCwp5OLLkpuwwbsecEUMTY",
  "access_expires_at": "2026-10-29T08:45:37.345346754Z",
  "refresh_token": "nV-NtNZ8rk629zTo5cwm50cirLmL5HFGd_U-ywWYtl4",
  "refresh_expires_at": "2026-10-29T20:30:37.344479002Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T08:30:25.813087Z",
      "actor": {
        "type": "CLIENT",
        "id": "fa40132a-519f-4754-8787-b01ece96a8bd",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a",
        "quote_id": "8a9f09ae-5c98-4f40-b0c0-f16fda21b431",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "be9a0b64-8dfd-4b62-ae99-5f70ca18732a"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T08:30:25.81505Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a",
        "attempt_id": "18560405-0236-4466-ac67-16920ad61113",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "be9a0b64-8dfd-4b62-ae99-5f70ca18732a"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T08:30:25.817941Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "e628e732-2776-4ace-94db-4bd1e2e2f283",
        "order_id": "c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "be9a0b64-8dfd-4b62-ae99-5f70ca18732a"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T08:30:26.394251Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "e628e732-2776-4ace-94db-4bd1e2e2f283",
        "order_id": "c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "bde94018-2b5d-48e6-9981-9d4ff39eb665"
      },
      "correlation_id": "e7c16a51-4b2d-41b4-849b-a87fff7840cc"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T08:30:37.95725617Z",
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
      "last_location_at": "2026-10-29T08:30:30.273982Z",
      "order_id": null
    }
  ]
}
```

Done: order c90ddc3d-7bf2-4911-ae3e-72b8c3a3761a.

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
  "session_id": "de8a0b44-084d-4e24-a948-fa7af5f69b5f",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM1MzgsImlhdCI6MTc5MzI2MjYzOCwianRpIjoiMWZmMmJlNzYtZDY4Yy00ZThiLTk1MTAtMjI4MzhiYjBlN2ZmIiwic2lkIjoiZGU4YTBiNDQtMDg0ZC00ZTI0LWE5NDgtZmE3YWY1ZjY5YjVmIn0.VM5YT5Pa6gvfVskz8Pkf5tI-b9lp0U9BbBy5qzI0qWA",
  "access_expires_at": "2026-10-29T08:45:38.548307176Z",
  "refresh_token": "cSvZaUjyLXTSwvB3OoKLSARsrxJpIh0PSsefLmhBYwE",
  "refresh_expires_at": "2026-10-29T20:30:38.547704591Z",
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
  "command_id": "6f33f1c9-59dc-448b-8512-fc10345743aa",
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
  "timestamp": "2026-10-29T08:30:39.000+0000",
  "channel": {
    "id": "1730052000.2054812211",
    "linkedid": "1730052000.2054812211",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674191402"
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
  "timestamp": "2026-10-29T08:30:39.000+0000",
  "channel": {
    "id": "1730052000.2054812211",
    "linkedid": "1730052000.2054812211",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674191402"
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
  "session_id": "850dfebe-764f-42ee-a813-7bddcb0ee82e",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM1MzksImlhdCI6MTc5MzI2MjYzOSwianRpIjoiYTk4M2FkN2UtMmE0YS00NGZhLTk4YTItNzhlYWIxMWUwMmFlIiwic2lkIjoiODUwZGZlYmUtNzY0Zi00MmVlLWE4MTMtN2JkZGNiMGVlODJlIn0.K1HzsMsN2VZtyG9C-4Mgcfi77T135Fr8UfCKb8w_k54",
  "access_expires_at": "2026-10-29T08:45:39.737347864Z",
  "refresh_token": "lWgscgUGHNTExe0QcK4KB-RhoB8LhO9WYbXr26dT77A",
  "refresh_expires_at": "2026-10-29T20:30:39.736828117Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "30bae715-4364-4947-9109-8fd715d56baf",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380674191402",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T08:30:39Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/30bae715-4364-4947-9109-8fd715d56baf/answer` → **200**

```json
{
  "command_id": "9cf3aa25-eb7f-4944-83ab-ee8781368266"
}
```

```json
{
  "id": "30bae715-4364-4947-9109-8fd715d56baf",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380674191402",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
  "order_ids": [],
  "started_at": "2026-10-29T08:30:39Z",
  "answered_at": "2026-10-29T08:30:40.306953Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2054812211",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "07e045e6-d961-4c6c-80ed-d0ca46ed4350",
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
  "id": "d325fe47-5d23-49ed-b386-8fb6e5e11d91",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:35:40.615569Z",
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
  "command_id": "9574b40d-c3ee-4a07-a98e-3fdc6a9ec2b1",
  "quote_id": "d325fe47-5d23-49ed-b386-8fb6e5e11d91",
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
    "phone": "+380674191402"
  },
  "call_id": "30bae715-4364-4947-9109-8fd715d56baf"
}
```

```json
{
  "id": "cf9d1e7b-6967-431d-9f3e-40e12d0df887",
  "short_number": 13,
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
  "created_at": "2026-10-29T08:30:40.911232Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674191402"
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
    "id": "1730052000.2054812211",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "30bae715-4364-4947-9109-8fd715d56baf",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674191402",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
      "order_ids": [
        "cf9d1e7b-6967-431d-9f3e-40e12d0df887"
      ],
      "started_at": "2026-10-29T08:30:39Z",
      "answered_at": "2026-10-29T08:30:40.306953Z",
      "ended_at": "2026-10-29T08:30:41.224916Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "904d80f5-677d-4f7f-beaf-c322c4f90e44",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670216416",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
      "order_ids": [],
      "started_at": "2026-10-29T08:28:30.920921Z",
      "answered_at": "2026-10-29T08:28:31.248542Z",
      "ended_at": "2026-10-29T08:28:31.562132Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T08:28:36.760212Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/cf9d1e7b-6967-431d-9f3e-40e12d0df887` → **200**

```json
{
  "id": "cf9d1e7b-6967-431d-9f3e-40e12d0df887",
  "short_number": 13,
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
  "created_at": "2026-10-29T08:30:40.911232Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674191402"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/cf9d1e7b-6967-431d-9f3e-40e12d0df887` → **200**

```json
{
  "id": "cf9d1e7b-6967-431d-9f3e-40e12d0df887",
  "short_number": 13,
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
  "created_at": "2026-10-29T08:30:40.911232Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674191402"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/cf9d1e7b-6967-431d-9f3e-40e12d0df887/cancel` → **200**

```json
{
  "command_id": "8a4e2368-1ad6-44de-88d8-10a0a106b36a",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "cf9d1e7b-6967-431d-9f3e-40e12d0df887",
  "short_number": 13,
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
  "created_at": "2026-10-29T08:30:40.911232Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674191402"
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

Done: call 30bae715-4364-4947-9109-8fd715d56baf with order cf9d1e7b-6967-431d-9f3e-40e12d0df887.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10685"
}
```

```json
{
  "challenge_id": "52e2fe38-82f3-4a13-8148-b71b204938af",
  "expires_at": "2026-10-29T08:35:42.445279436Z",
  "resend_available_at": "2026-10-29T08:30:43.445279436Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "972798",
  "sent_at": "2026-10-29T08:30:42.447534296Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "52e2fe38-82f3-4a13-8148-b71b204938af",
  "code": "972798",
  "device_ref": "sandbox-10685"
}
```

```json
{
  "session_id": "4e8912ba-946e-4e3d-96fa-fcbe74fee25e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MzU0MiwiaWF0IjoxNzkzMjYyNjQyLCJqdGkiOiIzM2NjMWQ4OC1jMDliLTQ3YzgtYTFmMS1hNjE2MWNmN2RhNTciLCJzaWQiOiI0ZTg5MTJiYS05NDZlLTRlM2QtOTZmYS1mY2JlNzRmZWUyNWUifQ.QFY08oO7FSXAQQy1o_EKNgKWAkXBoDFkZ81yeB7pefE",
  "access_expires_at": "2026-10-29T08:45:42.743077865Z",
  "refresh_token": "GTWt9vsISi295SS8PofX6JJoNfilGr6hILHeFZva4E4",
  "refresh_expires_at": "2026-11-28T08:30:42.742503207Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c5d12e44-a170-4edd-8089-88a9dbed9875",
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
  "last_heartbeat_at": "2026-10-29T08:30:30.273982Z",
  "last_location_at": "2026-10-29T08:30:30.273982Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c5d12e44-a170-4edd-8089-88a9dbed9875/handover` → **200**

```json
{
  "command_id": "690e2d7b-4f3d-40ed-8bdb-fadc2e59bee8",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c5d12e44-a170-4edd-8089-88a9dbed9875",
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
  "last_heartbeat_at": "2026-10-29T08:30:30.273982Z",
  "last_location_at": "2026-10-29T08:30:30.273982Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c5d12e44-a170-4edd-8089-88a9dbed9875/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:30:43Z",
    "sequence": 1793262643567
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c5d12e44-a170-4edd-8089-88a9dbed9875",
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
  "last_heartbeat_at": "2026-10-29T08:30:43.585696Z",
  "last_location_at": "2026-10-29T08:30:43.585696Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669816797",
  "device_ref": "sandbox-10164"
}
```

```json
{
  "challenge_id": "6b07901d-4770-4123-8d1e-08d45c4491c3",
  "expires_at": "2026-10-29T08:35:43.878889666Z",
  "resend_available_at": "2026-10-29T08:30:44.878889666Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669816797` → **200**

```json
{
  "phone": "+380669816797",
  "audience": "CLIENT",
  "code": "330703",
  "sent_at": "2026-10-29T08:30:43.881032026Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6b07901d-4770-4123-8d1e-08d45c4491c3",
  "code": "330703",
  "device_ref": "sandbox-10164"
}
```

```json
{
  "session_id": "dbb9c753-ef2e-4d2f-bf34-be58155281be",
  "subject": {
    "type": "CLIENT",
    "id": "fbdba3a8-9771-4811-8ae7-be2f30abe572"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYmRiYTNhOC05NzcxLTQ4MTEtOGFlNy1iZTJmMzBhYmU1NzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzNTQ0LCJpYXQiOjE3OTMyNjI2NDQsImp0aSI6IjJmYzIxNTliLWViNWItNDQ1Ny1hYmE3LTk0Y2VkNjA1ODA2MyIsInNpZCI6ImRiYjljNzUzLWVmMmUtNGQyZi1iZjM0LWJlNTgxNTUyODFiZSJ9.hEwGsAoeDs3tflmpBjQsiCk83QcjjP48KzobxbeycuE",
  "access_expires_at": "2026-10-29T08:45:44.187938678Z",
  "refresh_token": "0atWsG2MrcR3w9IdgjQX08Ol32k8999FtgJ2w5MmxCM",
  "refresh_expires_at": "2026-11-28T08:30:44.187448106Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3ee5c8aa-f8c4-405b-b88c-5bafafb541a9",
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
  "id": "97349815-73b6-420c-9c38-02cf56fc5f2e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:35:44.474029Z",
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
  "command_id": "e55e82cd-1343-403d-862e-1d189bdce5c3",
  "quote_id": "97349815-73b6-420c-9c38-02cf56fc5f2e",
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
  "id": "fc26f524-7e4e-499a-ad16-1a10d6e10e86",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fbdba3a8-9771-4811-8ae7-be2f30abe572",
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
  "created_at": "2026-10-29T08:30:44.761437Z",
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
    "id": "b4b96807-9718-4538-8403-b0aa9af8c07e",
    "order_id": "fc26f524-7e4e-499a-ad16-1a10d6e10e86",
    "expires_at": "2026-10-29T08:30:59.764812Z",
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

`POST /api/driver/v1/offers/b4b96807-9718-4538-8403-b0aa9af8c07e/accept` → **200**

```json
{
  "command_id": "3ab88f53-901c-41f9-9723-a699c948a503"
}
```

```json
{
  "id": "0b0060c4-ee6a-4254-b4ed-12db1ffe2f04",
  "order_id": "fc26f524-7e4e-499a-ad16-1a10d6e10e86",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ea00245a-3cb9-4b74-b1f4-5f3a6e3ef786",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ea00245a-3cb9-4b74-b1f4-5f3a6e3ef786",
  "order_id": "fc26f524-7e4e-499a-ad16-1a10d6e10e86",
  "assignment_id": "0b0060c4-ee6a-4254-b4ed-12db1ffe2f04",
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

`POST /api/driver/v1/work-sessions/c5d12e44-a170-4edd-8089-88a9dbed9875/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:30:45Z",
    "sequence": 1793262645904
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c5d12e44-a170-4edd-8089-88a9dbed9875",
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
  "last_heartbeat_at": "2026-10-29T08:30:45.923156Z",
  "last_location_at": "2026-10-29T08:30:45.923156Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ea00245a-3cb9-4b74-b1f4-5f3a6e3ef786/arrive` → **200**

```json
{
  "command_id": "e0930841-ede6-41d4-8e37-a924925d8c71",
  "expected_version": 0
}
```

```json
{
  "id": "ea00245a-3cb9-4b74-b1f4-5f3a6e3ef786",
  "order_id": "fc26f524-7e4e-499a-ad16-1a10d6e10e86",
  "assignment_id": "0b0060c4-ee6a-4254-b4ed-12db1ffe2f04",
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
  "arrived_at": "2026-10-29T08:30:46.213097Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ea00245a-3cb9-4b74-b1f4-5f3a6e3ef786/start` → **200**

```json
{
  "command_id": "9c0e787d-f188-4b7e-a7d2-2d457e4793c7",
  "expected_version": 1
}
```

```json
{
  "id": "ea00245a-3cb9-4b74-b1f4-5f3a6e3ef786",
  "order_id": "fc26f524-7e4e-499a-ad16-1a10d6e10e86",
  "assignment_id": "0b0060c4-ee6a-4254-b4ed-12db1ffe2f04",
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
  "arrived_at": "2026-10-29T08:30:46.213097Z",
  "started_at": "2026-10-29T08:30:46.507305Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/c5d12e44-a170-4edd-8089-88a9dbed9875/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:30:46Z",
    "sequence": 1793262646783
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c5d12e44-a170-4edd-8089-88a9dbed9875",
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
  "last_heartbeat_at": "2026-10-29T08:30:46.803971Z",
  "last_location_at": "2026-10-29T08:30:46.803971Z",
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
  "device_ref": "sandbox-8847"
}
```

```json
{
  "challenge_id": "fbc7f529-3273-4bc0-a22d-af7bd0b62c86",
  "expires_at": "2026-10-29T08:35:47.092899372Z",
  "resend_available_at": "2026-10-29T08:30:48.092899372Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "457856",
  "sent_at": "2026-10-29T08:30:47.095371134Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fbc7f529-3273-4bc0-a22d-af7bd0b62c86",
  "code": "457856",
  "device_ref": "sandbox-8847"
}
```

```json
{
  "session_id": "f84990f9-9761-44c0-b8a0-d33c7fd3b319",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MzU0NywiaWF0IjoxNzkzMjYyNjQ3LCJqdGkiOiI0ZTQ3YWE3Mi0zM2Q4LTRhZWUtYmM3MS0xYWExZjVmNTU3YWYiLCJzaWQiOiJmODQ5OTBmOS05NzYxLTQ0YzAtYjhhMC1kMzNjN2ZkM2IzMTkifQ.l_oAHxFvpLgL4iSSl680-XYhSk5YP-i3nsd6mfxQULo",
  "access_expires_at": "2026-10-29T08:45:47.394563369Z",
  "refresh_token": "3vepa7HsGeKd6mKS_ndmjAzCkHBlNMNsu8qk34kgG20",
  "refresh_expires_at": "2026-11-28T08:30:47.394046127Z",
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
  "command_id": "ba7c2f55-22dd-4421-bee0-55199ae450a5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:30:47Z",
    "sequence": 1793262647941
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "55f67cd6-9b64-471a-9279-c6fcbb9cabf6",
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
  "last_heartbeat_at": "2026-10-29T08:30:47.960694Z",
  "last_location_at": "2026-10-29T08:30:47.960694Z",
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
  "session_id": "34c9431f-d687-4e7d-afc4-9ea2e8a60309",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM1NDgsImlhdCI6MTc5MzI2MjY0OCwianRpIjoiN2EyNTdlMTYtNmQwZS00ZGZhLTg1ZDAtOTY2ODg1NjI1YjdhIiwic2lkIjoiMzRjOTQzMWYtZDY4Ny00ZTdkLWFmYzQtOWVhMmU4YTYwMzA5In0.X6Azkws7lG43fTdXFmJPhtnaqINTN35vO3rYtbTUsnk",
  "access_expires_at": "2026-10-29T08:45:48.536967249Z",
  "refresh_token": "m39drj3jtldX_AAnJGZ79vOe3NrvPQvH2ImrmikJpuU",
  "refresh_expires_at": "2026-10-29T20:30:48.536378477Z",
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
  "session_id": "0a59c1d7-2548-477a-8d63-3c4cad7c232e",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM1NDksImlhdCI6MTc5MzI2MjY0OSwianRpIjoiZjc4ZmQ1YmYtYmMzZi00YjRhLWJhZWQtMWQyNzI0NzgyYmMwIiwic2lkIjoiMGE1OWMxZDctMjU0OC00NzdhLThkNjMtM2M0Y2FkN2MyMzJlIn0.WkuYkOTbnD8cBGEl8tHJvKxUU-E8KxPFqTLHBpnffKo",
  "access_expires_at": "2026-10-29T08:45:49.098398233Z",
  "refresh_token": "iB1NltkbNGY8otOuh8uw0Nmug3TcrOszywl7yZk1ONc",
  "refresh_expires_at": "2026-10-29T20:30:49.097853361Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/fc26f524-7e4e-499a-ad16-1a10d6e10e86` → **200**

```json
{
  "id": "fc26f524-7e4e-499a-ad16-1a10d6e10e86",
  "short_number": 14,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "fbdba3a8-9771-4811-8ae7-be2f30abe572",
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
    "id": "0b0060c4-ee6a-4254-b4ed-12db1ffe2f04",
    "order_id": "fc26f524-7e4e-499a-ad16-1a10d6e10e86",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "ea00245a-3cb9-4b74-b1f4-5f3a6e3ef786",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T08:30:44.761437Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/fc26f524-7e4e-499a-ad16-1a10d6e10e86/interrupt` → **200**

```json
{
  "command_id": "0d80cc70-505b-4b49-8783-0d9b8699a8c0",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "fc26f524-7e4e-499a-ad16-1a10d6e10e86",
    "short_number": 14,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "fbdba3a8-9771-4811-8ae7-be2f30abe572",
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
      "id": "0b0060c4-ee6a-4254-b4ed-12db1ffe2f04",
      "order_id": "fc26f524-7e4e-499a-ad16-1a10d6e10e86",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "ea00245a-3cb9-4b74-b1f4-5f3a6e3ef786",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T08:30:44.761437Z",
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
    "id": "52656fa3-cedc-4c4f-a01c-3aaa7de841b5",
    "short_number": 15,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "fbdba3a8-9771-4811-8ae7-be2f30abe572",
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
    "id": "4639ae16-a580-4394-afea-4bf2a1406583",
    "order_id": "52656fa3-cedc-4c4f-a01c-3aaa7de841b5",
    "expires_at": "2026-10-29T08:31:04.692567Z",
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

`POST /api/driver/v1/offers/4639ae16-a580-4394-afea-4bf2a1406583/accept` → **200**

```json
{
  "command_id": "188971c5-3ff1-45ba-8530-a82d63faf218"
}
```

```json
{
  "id": "93aa276e-9701-453b-8a71-dd0bdd8b3cb2",
  "order_id": "52656fa3-cedc-4c4f-a01c-3aaa7de841b5",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e82a11da-2d54-406a-b56b-6ca084f90bda",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e82a11da-2d54-406a-b56b-6ca084f90bda",
  "order_id": "52656fa3-cedc-4c4f-a01c-3aaa7de841b5",
  "assignment_id": "93aa276e-9701-453b-8a71-dd0bdd8b3cb2",
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
  "session_id": "55f67cd6-9b64-471a-9279-c6fcbb9cabf6",
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
  "last_heartbeat_at": "2026-10-29T08:30:47.960694Z",
  "last_location_at": "2026-10-29T08:30:47.960694Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/55f67cd6-9b64-471a-9279-c6fcbb9cabf6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:30:51Z",
    "sequence": 1793262651137
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "55f67cd6-9b64-471a-9279-c6fcbb9cabf6",
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
  "last_heartbeat_at": "2026-10-29T08:30:51.156993Z",
  "last_location_at": "2026-10-29T08:30:51.156993Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e82a11da-2d54-406a-b56b-6ca084f90bda/arrive` → **200**

```json
{
  "command_id": "dd33b5ca-3104-413a-a54f-dcfb19cfd82a",
  "expected_version": 0
}
```

```json
{
  "id": "e82a11da-2d54-406a-b56b-6ca084f90bda",
  "order_id": "52656fa3-cedc-4c4f-a01c-3aaa7de841b5",
  "assignment_id": "93aa276e-9701-453b-8a71-dd0bdd8b3cb2",
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
  "arrived_at": "2026-10-29T08:30:51.446029Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e82a11da-2d54-406a-b56b-6ca084f90bda/start` → **200**

```json
{
  "command_id": "26acc541-fbd6-45b9-ae96-c36158540b98",
  "expected_version": 1
}
```

```json
{
  "id": "e82a11da-2d54-406a-b56b-6ca084f90bda",
  "order_id": "52656fa3-cedc-4c4f-a01c-3aaa7de841b5",
  "assignment_id": "93aa276e-9701-453b-8a71-dd0bdd8b3cb2",
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
  "arrived_at": "2026-10-29T08:30:51.446029Z",
  "started_at": "2026-10-29T08:30:51.737963Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e82a11da-2d54-406a-b56b-6ca084f90bda/complete` → **200**

```json
{
  "command_id": "bc02e57f-6ada-445e-8110-f4f147408899",
  "expected_version": 2,
  "reported_at": "2026-10-29T08:30:52Z"
}
```

```json
{
  "id": "e82a11da-2d54-406a-b56b-6ca084f90bda",
  "order_id": "52656fa3-cedc-4c4f-a01c-3aaa7de841b5",
  "assignment_id": "93aa276e-9701-453b-8a71-dd0bdd8b3cb2",
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
  "arrived_at": "2026-10-29T08:30:51.446029Z",
  "started_at": "2026-10-29T08:30:51.737963Z",
  "completed_at": "2026-10-29T08:30:52.029072Z",
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
    "id": "52656fa3-cedc-4c4f-a01c-3aaa7de841b5",
    "short_number": 15,
    "status": "FULFILLED",
    "created_at": "2026-10-29T08:30:49.683082Z",
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
    "id": "fc26f524-7e4e-499a-ad16-1a10d6e10e86",
    "short_number": 14,
    "status": "CANCELLED",
    "created_at": "2026-10-29T08:30:44.761437Z",
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

`GET /api/operator/v1/orders/fc26f524-7e4e-499a-ad16-1a10d6e10e86/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T08:30:44.762027Z",
      "actor": {
        "type": "CLIENT",
        "id": "fbdba3a8-9771-4811-8ae7-be2f30abe572",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "fc26f524-7e4e-499a-ad16-1a10d6e10e86",
        "quote_id": "97349815-73b6-420c-9c38-02cf56fc5f2e",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "ef6e3c23-afe9-417e-b070-0e4e2088ea12"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T08:30:44.764074Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "fc26f524-7e4e-499a-ad16-1a10d6e10e86",
        "attempt_id": "5b2d59a6-fcac-4e7e-8e30-0d5e88641be5",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "ef6e3c23-afe9-417e-b070-0e4e2088ea12"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T08:30:44.766957Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b4b96807-9718-4538-8403-b0aa9af8c07e",
        "order_id": "fc26f524-7e4e-499a-ad16-1a10d6e10e86",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "ef6e3c23-afe9-417e-b070-0e4e2088ea12"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T08:30:45.360978Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "b4b96807-9718-4538-8403-b0aa9af8c07e",
        "order_id": "fc26f524-7e4e-499a-ad16-1a10d6e10e86",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "0b0060c4-ee6a-4254-b4ed-12db1ffe2f04"
      },
      "correlation_id": "e650a1ec-8759-4e9e-95c7-cc9784fada17"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/52656fa3-cedc-4c4f-a01c-3aaa7de841b5/tip` → **200**

```json
{
  "order_id": "52656fa3-cedc-4c4f-a01c-3aaa7de841b5",
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
  "available_until": "2026-10-30T08:30:52.029072Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/52656fa3-cedc-4c4f-a01c-3aaa7de841b5/tip` → **409**

```json
{
  "command_id": "1265e51a-a0f2-4f91-b46d-ca6f83a33229",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/52656fa3-cedc-4c4f-a01c-3aaa7de841b5/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "db0122ad-0521-4ef2-ad16-8fb199eb3ed7"
}
```

Done: interrupted fc26f524-7e4e-499a-ad16-1a10d6e10e86, follow-up 52656fa3-cedc-4c4f-a01c-3aaa7de841b5.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c5d12e44-a170-4edd-8089-88a9dbed9875",
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
  "last_heartbeat_at": "2026-10-29T08:30:46.803971Z",
  "last_location_at": "2026-10-29T08:30:46.803971Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c5d12e44-a170-4edd-8089-88a9dbed9875/close` → **200**

```json
{
  "command_id": "12b8fd2a-305d-43c2-9053-a772d62ea9e2",
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
  "session_id": "55f67cd6-9b64-471a-9279-c6fcbb9cabf6",
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
  "last_heartbeat_at": "2026-10-29T08:30:51.156993Z",
  "last_location_at": "2026-10-29T08:30:51.156993Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/55f67cd6-9b64-471a-9279-c6fcbb9cabf6/close` → **200**

```json
{
  "command_id": "e8c3e8fb-a9e9-4b02-9984-be6ac7f5f3ec",
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
  "session_id": "8c87a704-4e34-4fba-aae3-c643a720c0a7",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM1NTgsImlhdCI6MTc5MzI2MjY1OCwianRpIjoiZjM5YzBmMDUtYzVhMC00NDE5LWE3YWQtM2NlNjFkYzZhMmUzIiwic2lkIjoiOGM4N2E3MDQtNGUzNC00ZmJhLWFhZTMtYzY0M2E3MjBjMGE3In0.Eu33myQoX9IJR37x1khut83MDiJHUnSV-9EIhwBHZtM",
  "access_expires_at": "2026-10-29T08:45:58.20019691Z",
  "refresh_token": "xYLg3qv7GSMAE4Xccebv5uC2iQYizJdTz9uhqQEqaAY",
  "refresh_expires_at": "2026-10-29T20:30:58.199091821Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "3b2a9d89-c6b7-4aa3-a834-083ff2a97c31",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T08:30:58Z"
}
```

```json
{
  "id": "eae4f316-ad22-4565-85f1-b2977a8c42b1",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T08:30:58Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/eae4f316-ad22-4565-85f1-b2977a8c42b1/publish` → **200**

```json
{
  "command_id": "808cb11e-fa96-4be3-b2b2-dfafb97b3ef1",
  "expected_version": 0
}
```

```json
{
  "id": "eae4f316-ad22-4565-85f1-b2977a8c42b1",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T08:30:58.788729Z",
  "published_at": "2026-10-29T08:30:58.788729Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "eae4f316-ad22-4565-85f1-b2977a8c42b1",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T08:30:58.788729Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632046328",
  "device_ref": "sandbox-31633"
}
```

```json
{
  "challenge_id": "66f74872-5080-441e-a15e-521f20449ed6",
  "expires_at": "2026-10-29T08:35:59.371713945Z",
  "resend_available_at": "2026-10-29T08:31:00.371713945Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632046328` → **200**

```json
{
  "phone": "+380632046328",
  "audience": "CLIENT",
  "code": "616165",
  "sent_at": "2026-10-29T08:30:59.37493784Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "66f74872-5080-441e-a15e-521f20449ed6",
  "code": "616165",
  "device_ref": "sandbox-31633"
}
```

```json
{
  "session_id": "05945a24-5164-44b2-90d5-cefaedca2c71",
  "subject": {
    "type": "CLIENT",
    "id": "c0edebe4-8a22-42d1-b164-a67144473294"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMGVkZWJlNC04YTIyLTQyZDEtYjE2NC1hNjcxNDQ0NzMyOTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzNTU5LCJpYXQiOjE3OTMyNjI2NTksImp0aSI6IjFhMzI5NmEzLWYwNzctNDlkZS04NWFhLTkzNGVmYTQ5NWZhOCIsInNpZCI6IjA1OTQ1YTI0LTUxNjQtNDRiMi05MGQ1LWNlZmFlZGNhMmM3MSJ9.aA2mfeuxOMuoIzIaIfu2ptdbYy59EasqTAyUt1BYda0",
  "access_expires_at": "2026-10-29T08:45:59.686416268Z",
  "refresh_token": "Mdncugz9wNvfXTaQ3cwP8_wD21TXS7gYYKHwFahpOvs",
  "refresh_expires_at": "2026-11-28T08:30:59.685887928Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "eae4f316-ad22-4565-85f1-b2977a8c42b1",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T08:30:58.788729Z",
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
  "command_id": "d19bc871-09c3-45ba-8300-b2284bfda7a2",
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
  "id": "e0b0a8e2-8d56-4392-944c-388e3c725307",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:36:00.270366Z",
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
  "command_id": "02606f1c-87b2-42c8-ab01-82dca0e53328",
  "quote_id": "e0b0a8e2-8d56-4392-944c-388e3c725307",
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
  "correlation_id": "257c695b-c639-4e2a-b2e1-f3c3e66d8c6c"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "cb75c3bb-65fd-43cd-9db4-c9328549f4a6",
  "version_id": "eae4f316-ad22-4565-85f1-b2977a8c42b1",
  "language": "uk"
}
```

```json
{
  "version_id": "eae4f316-ad22-4565-85f1-b2977a8c42b1",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T08:31:00.85687Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "eb260b20-189b-4b43-89b3-ce3bcddcdd9b",
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
  "id": "0738905b-89f3-4124-9708-00d4a92368f8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:36:01.150611Z",
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
  "command_id": "d224bed9-cabc-4ba3-899c-e456367dcbb1",
  "quote_id": "0738905b-89f3-4124-9708-00d4a92368f8",
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
  "id": "b3d61259-234f-49c0-829d-411fc668e672",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c0edebe4-8a22-42d1-b164-a67144473294",
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
  "created_at": "2026-10-29T08:31:01.438951Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b3d61259-234f-49c0-829d-411fc668e672` → **200**

```json
{
  "id": "b3d61259-234f-49c0-829d-411fc668e672",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c0edebe4-8a22-42d1-b164-a67144473294",
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
  "created_at": "2026-10-29T08:31:01.438951Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b3d61259-234f-49c0-829d-411fc668e672/cancel` → **200**

```json
{
  "command_id": "d38a9ed5-18c7-4e97-aa15-4203faa17938",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b3d61259-234f-49c0-829d-411fc668e672",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c0edebe4-8a22-42d1-b164-a67144473294",
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
  "created_at": "2026-10-29T08:31:01.438951Z",
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

`POST /api/admin/v1/legal-documents/eae4f316-ad22-4565-85f1-b2977a8c42b1` → **409**

```json
{
  "command_id": "a827fb90-e5e5-46b8-a9a3-a5f4808a717d",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T08:31:02Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/eae4f316-ad22-4565-85f1-b2977a8c42b1",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ef7bf48b-6f93-4f8c-97f7-53c97d67d22b"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "0d43fcc4-2842-45d5-8482-81a38fd97929",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T08:31:02Z"
}
```

```json
{
  "id": "db8a0489-6227-4721-b87b-549f39a0db78",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T08:31:02Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/db8a0489-6227-4721-b87b-549f39a0db78/publish` → **200**

```json
{
  "command_id": "191340b4-18fa-4fcb-a683-6181921ff46d",
  "expected_version": 0
}
```

```json
{
  "id": "db8a0489-6227-4721-b87b-549f39a0db78",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T08:31:02.918004Z",
  "published_at": "2026-10-29T08:31:02.918004Z",
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
  "device_ref": "sandbox-6500"
}
```

```json
{
  "challenge_id": "a7fd69eb-6a84-4746-a2b3-4f84756ff311",
  "expires_at": "2026-10-29T08:36:03.216890788Z",
  "resend_available_at": "2026-10-29T08:31:04.216890788Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "693133",
  "sent_at": "2026-10-29T08:31:03.218957788Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a7fd69eb-6a84-4746-a2b3-4f84756ff311",
  "code": "693133",
  "device_ref": "sandbox-6500"
}
```

```json
{
  "session_id": "2a945f38-bf44-43a3-9b58-e9333d0aba5e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MzU2MywiaWF0IjoxNzkzMjYyNjYzLCJqdGkiOiJlZGQ2YmIzMC1lMTI1LTRhOGQtODUwZi0xYjE3NjkxYzUzYzQiLCJzaWQiOiIyYTk0NWYzOC1iZjQ0LTQzYTMtOWI1OC1lOTMzM2QwYWJhNWUifQ.KgGRoXaDBtwDqPrGOVeV70ZjZOekx_CbUutdwPa-LkE",
  "access_expires_at": "2026-10-29T08:46:03.519078379Z",
  "refresh_token": "cRRwkg98A4yooDzhZwSste5Fs5u5jLu-56GnC3FzYY4",
  "refresh_expires_at": "2026-11-28T08:31:03.51843346Z",
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
  "command_id": "a494c552-aaca-4236-9eca-780c290b9ab2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:31:04Z",
    "sequence": 1793262664843
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "00a3420e-9492-431c-bca4-8092f02c373c",
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
  "last_heartbeat_at": "2026-10-29T08:31:04.104022Z",
  "last_location_at": "2026-10-29T08:31:04.104022Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679961538",
  "device_ref": "sandbox-10497"
}
```

```json
{
  "challenge_id": "a5dcf7d6-71bd-46fe-8899-344f699596e7",
  "expires_at": "2026-10-29T08:36:04.385049926Z",
  "resend_available_at": "2026-10-29T08:31:05.385049926Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679961538` → **200**

```json
{
  "phone": "+380679961538",
  "audience": "CLIENT",
  "code": "047618",
  "sent_at": "2026-10-29T08:31:04.3873179Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a5dcf7d6-71bd-46fe-8899-344f699596e7",
  "code": "047618",
  "device_ref": "sandbox-10497"
}
```

```json
{
  "session_id": "8d7f6e9b-3d98-410a-8306-20cb9e0b1688",
  "subject": {
    "type": "CLIENT",
    "id": "e65694cd-5d3a-4476-9cff-b380e285b778"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjU2OTRjZC01ZDNhLTQ0NzYtOWNmZi1iMzgwZTI4NWI3NzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzNTY0LCJpYXQiOjE3OTMyNjI2NjQsImp0aSI6ImFkNjU3Y2M4LTc3M2ItNDRjZi05YTczLTg0ZmI3N2NiOWY1NSIsInNpZCI6IjhkN2Y2ZTliLTNkOTgtNDEwYS04MzA2LTIwY2I5ZTBiMTY4OCJ9.X9oKGWoimsOYZN0jwdAgPPYZ192yPrWR_8lQrNBcRbk",
  "access_expires_at": "2026-10-29T08:46:04.692711816Z",
  "refresh_token": "MIQoqUavy5sGc7iIH9VJzRI6WGvF0tCtYUjc1t1eDwQ",
  "refresh_expires_at": "2026-11-28T08:31:04.692161222Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "47a4057e-0bfb-4aff-9efc-2e8cbae00a38",
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
  "id": "7c49a386-8483-456a-ada0-e0dc71509118",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:36:04.972742Z",
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
  "command_id": "c62255e3-7cbe-4aae-a7e9-9f5dbf25f5e6",
  "quote_id": "7c49a386-8483-456a-ada0-e0dc71509118",
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
    "phone": "+380678114624"
  }
}
```

```json
{
  "id": "a021a76e-6ecc-4b81-b13c-9cfe23c42249",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e65694cd-5d3a-4476-9cff-b380e285b778",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T08:31:05.277872Z",
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
    "id": "f1854a78-b2af-4dfc-ab6b-d28e33c34c62",
    "order_id": "a021a76e-6ecc-4b81-b13c-9cfe23c42249",
    "expires_at": "2026-10-29T08:31:20.282341Z",
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

`POST /api/driver/v1/offers/f1854a78-b2af-4dfc-ab6b-d28e33c34c62/accept` → **200**

```json
{
  "command_id": "0e5c60bd-68c1-4899-a20f-26fcd23a1b13"
}
```

```json
{
  "id": "c9135030-fb2e-4250-9aee-3b5696fc340b",
  "order_id": "a021a76e-6ecc-4b81-b13c-9cfe23c42249",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "03730dce-84e3-4450-b029-d99352e5b403",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "03730dce-84e3-4450-b029-d99352e5b403",
  "order_id": "a021a76e-6ecc-4b81-b13c-9cfe23c42249",
  "assignment_id": "c9135030-fb2e-4250-9aee-3b5696fc340b",
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
    "phone": "+380678114624"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1af6b4f9-50c3-4ce2-980f-1716b56927e0",
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
  "id": "9d69b30e-3669-43cd-97e7-619e01137916",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:36:06.476589Z",
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
  "command_id": "0d6035c2-040f-4c73-8db7-94accda43aa8",
  "quote_id": "9d69b30e-3669-43cd-97e7-619e01137916",
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
  "id": "742bd19b-ad6e-455a-9b54-ef4528ab8498",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e65694cd-5d3a-4476-9cff-b380e285b778",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:31:06.77952Z",
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
  "command_id": "107bc00c-c7e3-468f-9ad2-04d28d2ffd1f",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T11:31:07Z"
}
```

```json
{
  "id": "af6bd759-6eaa-4468-b78b-d209afc8e2ef",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:36:07.105395Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T11:31:07Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "07efcae1-c5dc-42cd-aeca-6d2c284a00e0",
  "quote_id": "af6bd759-6eaa-4468-b78b-d209afc8e2ef",
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
  "pickup_at": "2026-10-29T11:31:07Z"
}
```

```json
{
  "id": "06b58f7e-480d-4480-b5eb-74bf658fff81",
  "short_number": 19,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e65694cd-5d3a-4476-9cff-b380e285b778",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T08:31:07.409434Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T11:31:07Z",
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
  "command_id": "8713d734-4d8d-4fe8-85d8-5d4e180df241",
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
  "id": "da7998c2-3fa4-4580-a2da-de6807618de1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:36:07.722660Z",
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
  "command_id": "c471163c-1dce-40ea-9136-89acb3003db5",
  "quote_id": "da7998c2-3fa4-4580-a2da-de6807618de1",
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
  "correlation_id": "6d358668-6710-44c9-a92b-618fddc517b5"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "06b58f7e-480d-4480-b5eb-74bf658fff81",
      "short_number": 19,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "e65694cd-5d3a-4476-9cff-b380e285b778",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-29T08:31:07.409434Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T11:31:07Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "742bd19b-ad6e-455a-9b54-ef4528ab8498",
      "short_number": 18,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "e65694cd-5d3a-4476-9cff-b380e285b778",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-29T08:31:06.77952Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "a021a76e-6ecc-4b81-b13c-9cfe23c42249",
      "short_number": 17,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "742bd19b-ad6e-455a-9b54-ef4528ab8498",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e65694cd-5d3a-4476-9cff-b380e285b778",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:31:06.77952Z",
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

`GET /api/rider/v1/orders/a021a76e-6ecc-4b81-b13c-9cfe23c42249` → **200**

```json
{
  "id": "a021a76e-6ecc-4b81-b13c-9cfe23c42249",
  "short_number": 17,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e65694cd-5d3a-4476-9cff-b380e285b778",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "c9135030-fb2e-4250-9aee-3b5696fc340b",
    "order_id": "a021a76e-6ecc-4b81-b13c-9cfe23c42249",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "03730dce-84e3-4450-b029-d99352e5b403",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T08:31:05.277872Z",
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
    "location_at": "2026-10-29T08:31:04.104022Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/a021a76e-6ecc-4b81-b13c-9cfe23c42249/cancel` → **200**

```json
{
  "command_id": "779e314e-37b4-4baa-bb4c-0383777bd457",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a021a76e-6ecc-4b81-b13c-9cfe23c42249",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "e65694cd-5d3a-4476-9cff-b380e285b778",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "c9135030-fb2e-4250-9aee-3b5696fc340b",
    "order_id": "a021a76e-6ecc-4b81-b13c-9cfe23c42249",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "03730dce-84e3-4450-b029-d99352e5b403",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T08:31:05.277872Z",
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

`GET /api/rider/v1/orders/742bd19b-ad6e-455a-9b54-ef4528ab8498` → **200**

```json
{
  "id": "742bd19b-ad6e-455a-9b54-ef4528ab8498",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e65694cd-5d3a-4476-9cff-b380e285b778",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:31:06.77952Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/742bd19b-ad6e-455a-9b54-ef4528ab8498/cancel` → **200**

```json
{
  "command_id": "4fa3699a-11d4-4fb2-ac2b-9bf522c6ad7a",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "742bd19b-ad6e-455a-9b54-ef4528ab8498",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e65694cd-5d3a-4476-9cff-b380e285b778",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T08:31:06.77952Z",
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

`GET /api/rider/v1/orders/06b58f7e-480d-4480-b5eb-74bf658fff81` → **200**

```json
{
  "id": "06b58f7e-480d-4480-b5eb-74bf658fff81",
  "short_number": 19,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e65694cd-5d3a-4476-9cff-b380e285b778",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T08:31:07.409434Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T11:31:07Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/06b58f7e-480d-4480-b5eb-74bf658fff81/cancel` → **200**

```json
{
  "command_id": "7cdd55a8-b216-4192-9647-b12072cd478a",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "06b58f7e-480d-4480-b5eb-74bf658fff81",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "e65694cd-5d3a-4476-9cff-b380e285b778",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T08:31:07.409434Z",
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
  "pickup_at": "2026-10-29T11:31:07Z",
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
  "session_id": "00a3420e-9492-431c-bca4-8092f02c373c",
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
  "last_heartbeat_at": "2026-10-29T08:31:04.104022Z",
  "last_location_at": "2026-10-29T08:31:04.104022Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/00a3420e-9492-431c-bca4-8092f02c373c/close` → **200**

```json
{
  "command_id": "9b45a76e-4d5a-48e4-b3f1-510b1c385339",
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

Done: orders a021a76e-6ecc-4b81-b13c-9cfe23c42249, 742bd19b-ad6e-455a-9b54-ef4528ab8498, 06b58f7e-480d-4480-b5eb-74bf658fff81.

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
  "session_id": "3e4826fe-a690-4952-9c18-b7ff20750cfe",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM1NzEsImlhdCI6MTc5MzI2MjY3MSwianRpIjoiNDBjOGIyNjYtZTY3Ny00MDc0LWI1NTMtOTYwNmQ1OTZkY2Y3Iiwic2lkIjoiM2U0ODI2ZmUtYTY5MC00OTUyLTljMTgtYjdmZjIwNzUwY2ZlIn0.eSeyfZDlRaelqbESQTdfOPneD3RZY89usZDeXmnydTU",
  "access_expires_at": "2026-10-29T08:46:11.456929753Z",
  "refresh_token": "sUfl1Zoy0PhxnA7AOUDN66zmIKOBtE_a03wNgGBWpZQ",
  "refresh_expires_at": "2026-10-29T20:31:11.45631458Z",
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
  "session_id": "d941be11-0d33-40bf-96ee-85d61782f32a",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM1NzIsImlhdCI6MTc5MzI2MjY3MiwianRpIjoiYzVhNmM0MGUtZTEwNS00YzM4LThjOGMtMjMyODAyNTI1NTU2Iiwic2lkIjoiZDk0MWJlMTEtMGQzMy00MGJmLTk2ZWUtODVkNjE3ODJmMzJhIn0.Jn2gp9MSUOoF18UtoPe-B06F6o4PeNuhc19dfzaPqkA",
  "access_expires_at": "2026-10-29T08:46:12.022099974Z",
  "refresh_token": "LQECXK_HKcF9cROZ8nS9qYhzyilzBNTAOqaL2y4Qqbg",
  "refresh_expires_at": "2026-10-29T20:31:12.021536307Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12408"
}
```

```json
{
  "challenge_id": "b3d5ac96-8c4f-4c75-86d3-043622bc80ce",
  "expires_at": "2026-10-29T08:36:12.292000166Z",
  "resend_available_at": "2026-10-29T08:31:13.292000166Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "337390",
  "sent_at": "2026-10-29T08:31:12.294309462Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b3d5ac96-8c4f-4c75-86d3-043622bc80ce",
  "code": "337390",
  "device_ref": "sandbox-12408"
}
```

```json
{
  "session_id": "269aeac8-22b1-47e3-ae69-f0ecff62ee59",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MzU3MiwiaWF0IjoxNzkzMjYyNjcyLCJqdGkiOiJlMmNkN2NjMC0yODBhLTRkZTAtOWViNC1hMWZhNWFiZDNmN2MiLCJzaWQiOiIyNjlhZWFjOC0yMmIxLTQ3ZTMtYWU2OS1mMGVjZmY2MmVlNTkifQ.grmq8rWs24D_xfuuY8Mb_q2petw1hgt7sHf9pVAc1XQ",
  "access_expires_at": "2026-10-29T08:46:12.605395672Z",
  "refresh_token": "RAuQFIz339XmNo7s-LR3lH41iOtCsAGw1ONixvqNJms",
  "refresh_expires_at": "2026-11-28T08:31:12.604821831Z",
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
  "command_id": "c6a2d181-a28c-49d3-8815-199704c21c46",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:31:13Z",
    "sequence": 1793262673158
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1cda6a2-be18-41e9-be84-37453160474c",
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
  "last_heartbeat_at": "2026-10-29T08:31:13.177187Z",
  "last_location_at": "2026-10-29T08:31:13.177187Z",
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
  "command_id": "98b4113d-7cd9-4ba8-972a-79b6d0c7e32a",
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
  "effective_at": "2026-10-29T08:31:13.763556Z",
  "changed_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "85782d39-1a26-4896-83e2-d51f63705ba3",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T08:28:45.821465Z",
  "last_entries": [
    {
      "order_id": "49a06744-0287-41e2-8009-781a690e2eae",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T08:28:45.821465Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "518aa89a-7978-40d6-9cd6-28ca252fe882",
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
  "id": "57384749-c127-4356-8991-7dd464a264af",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:36:14.366782Z",
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
  "command_id": "f65c6cfc-5a20-40fe-a507-54eca7b39706",
  "quote_id": "57384749-c127-4356-8991-7dd464a264af",
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
    "phone": "+3806711118622"
  }
}
```

```json
{
  "id": "acd6ddf5-9248-45f6-9c51-62779bd48db0",
  "short_number": 20,
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
  "created_at": "2026-10-29T08:31:14.659426Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711118622"
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
    "id": "7dbe5f8f-8f73-4b3c-a6a4-a8e47e860348",
    "order_id": "acd6ddf5-9248-45f6-9c51-62779bd48db0",
    "expires_at": "2026-10-29T08:31:29.663122Z",
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

`POST /api/driver/v1/offers/7dbe5f8f-8f73-4b3c-a6a4-a8e47e860348/accept` → **200**

```json
{
  "command_id": "e2e393f0-9192-45a9-b9cf-3b0fc92c7302"
}
```

```json
{
  "id": "a10a48ad-66ad-47e2-90df-7eb51c03b710",
  "order_id": "acd6ddf5-9248-45f6-9c51-62779bd48db0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a0f22ef4-7189-4e1b-9c2f-961a16a75dfe",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a0f22ef4-7189-4e1b-9c2f-961a16a75dfe",
  "order_id": "acd6ddf5-9248-45f6-9c51-62779bd48db0",
  "assignment_id": "a10a48ad-66ad-47e2-90df-7eb51c03b710",
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
    "phone": "+3806711118622"
  }
}
```

`POST /api/driver/v1/work-sessions/f1cda6a2-be18-41e9-be84-37453160474c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:31:15Z",
    "sequence": 1793262675816
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1cda6a2-be18-41e9-be84-37453160474c",
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
  "last_heartbeat_at": "2026-10-29T08:31:15.835573Z",
  "last_location_at": "2026-10-29T08:31:15.835573Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a0f22ef4-7189-4e1b-9c2f-961a16a75dfe/arrive` → **200**

```json
{
  "command_id": "77aafb30-ef52-47bd-a227-1ae199768409",
  "expected_version": 0
}
```

```json
{
  "id": "a0f22ef4-7189-4e1b-9c2f-961a16a75dfe",
  "order_id": "acd6ddf5-9248-45f6-9c51-62779bd48db0",
  "assignment_id": "a10a48ad-66ad-47e2-90df-7eb51c03b710",
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
  "arrived_at": "2026-10-29T08:31:16.135155Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711118622"
  }
}
```

`POST /api/driver/v1/trips/a0f22ef4-7189-4e1b-9c2f-961a16a75dfe/start` → **200**

```json
{
  "command_id": "d4357257-d935-4efb-9d2c-3af9858c2a51",
  "expected_version": 1
}
```

```json
{
  "id": "a0f22ef4-7189-4e1b-9c2f-961a16a75dfe",
  "order_id": "acd6ddf5-9248-45f6-9c51-62779bd48db0",
  "assignment_id": "a10a48ad-66ad-47e2-90df-7eb51c03b710",
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
  "arrived_at": "2026-10-29T08:31:16.135155Z",
  "started_at": "2026-10-29T08:31:16.439004Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711118622"
  }
}
```

`POST /api/driver/v1/trips/a0f22ef4-7189-4e1b-9c2f-961a16a75dfe/complete` → **200**

```json
{
  "command_id": "2b4a4da4-d19f-46dc-a4c3-7a95f7e0fbe4",
  "expected_version": 2,
  "reported_at": "2026-10-29T08:31:16Z",
  "cash_received": true
}
```

```json
{
  "id": "a0f22ef4-7189-4e1b-9c2f-961a16a75dfe",
  "order_id": "acd6ddf5-9248-45f6-9c51-62779bd48db0",
  "assignment_id": "a10a48ad-66ad-47e2-90df-7eb51c03b710",
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
  "arrived_at": "2026-10-29T08:31:16.135155Z",
  "started_at": "2026-10-29T08:31:16.439004Z",
  "completed_at": "2026-10-29T08:31:16.739412Z",
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
  "command_id": "02aa4653-257d-4fd9-b374-332d3d59480d",
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
  "id": "0c883a67-071e-411b-b84e-a4f0d5dccea1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:36:17.050103Z",
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
  "command_id": "5c3c85bd-b0b7-49f4-8414-b0d69fe86bb3",
  "quote_id": "0c883a67-071e-411b-b84e-a4f0d5dccea1",
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
    "phone": "+380671116256"
  }
}
```

```json
{
  "id": "4a9d7c93-3356-4481-ae5b-7e104d2beb6c",
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
  "created_at": "2026-10-29T08:31:17.36495Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671116256"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/4a9d7c93-3356-4481-ae5b-7e104d2beb6c` → **200**

```json
{
  "id": "4a9d7c93-3356-4481-ae5b-7e104d2beb6c",
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
  "created_at": "2026-10-29T08:31:17.36495Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671116256"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4a9d7c93-3356-4481-ae5b-7e104d2beb6c/cancel` → **200**

```json
{
  "command_id": "b05a610f-e922-4168-93db-93deb149583b",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "4a9d7c93-3356-4481-ae5b-7e104d2beb6c",
  "short_number": 21,
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
  "created_at": "2026-10-29T08:31:17.36495Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671116256"
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
  "staff_id": "85782d39-1a26-4896-83e2-d51f63705ba3",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-29T08:28:45.821465Z",
  "last_entries": [
    {
      "order_id": "4a9d7c93-3356-4481-ae5b-7e104d2beb6c",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-29T08:31:17.990642Z"
    },
    {
      "order_id": "acd6ddf5-9248-45f6-9c51-62779bd48db0",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-29T08:31:16.744507Z"
    },
    {
      "order_id": "49a06744-0287-41e2-8009-781a690e2eae",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T08:28:45.821465Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1cda6a2-be18-41e9-be84-37453160474c",
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
  "last_heartbeat_at": "2026-10-29T08:31:15.835573Z",
  "last_location_at": "2026-10-29T08:31:15.835573Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f1cda6a2-be18-41e9-be84-37453160474c/close` → **200**

```json
{
  "command_id": "9b396b26-0913-4038-b3d4-642adfa6d0c8",
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

Done: operator bonus for fulfilled acd6ddf5-9248-45f6-9c51-62779bd48db0 and operator-fault cancellation 4a9d7c93-3356-4481-ae5b-7e104d2beb6c.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670086589",
  "device_ref": "sandbox-8657"
}
```

```json
{
  "challenge_id": "e522ef93-7170-4c63-9dab-cf733be68d9e",
  "expires_at": "2026-10-29T08:36:21.163744367Z",
  "resend_available_at": "2026-10-29T08:31:22.163744367Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670086589` → **200**

```json
{
  "phone": "+380670086589",
  "audience": "CLIENT",
  "code": "764782",
  "sent_at": "2026-10-29T08:31:21.166012076Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675949669",
  "device_ref": "sandbox-16648",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "b300ae88-6640-4a73-84ad-8bbdd3b86902",
  "expires_at": "2026-10-29T08:36:21.461294501Z",
  "resend_available_at": "2026-10-29T08:31:22.461294501Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675949669` → **200**

```json
{
  "phone": "+380675949669",
  "audience": "CLIENT",
  "code": "660815",
  "sent_at": "2026-10-29T08:31:21.46349575Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676540000",
  "device_ref": "sandbox-29681"
}
```

```json
{
  "challenge_id": "afcce870-e6fd-4a9d-b0fd-983069795a47",
  "expires_at": "2026-10-29T08:36:21.754599818Z",
  "resend_available_at": "2026-10-29T08:31:22.754599818Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676540000` → **200**

```json
{
  "phone": "+380676540000",
  "audience": "CLIENT",
  "code": "509495",
  "sent_at": "2026-10-29T08:31:21.757811315Z",
  "channel": "VOICE"
}
```

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
  "session_id": "1ebec8c4-bb22-4377-a062-77fb284b0f34",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM1ODIsImlhdCI6MTc5MzI2MjY4MiwianRpIjoiOWJhOWZiMDgtODA3ZC00YjdhLWI0MmItNmU2ZGIwYzA4OTEwIiwic2lkIjoiMWViZWM4YzQtYmIyMi00Mzc3LWEwNjItNzdmYjI4NGIwZjM0In0.lJIVJXpliqprng5n_9HzjwRu0Jo8ntglTXgtkuurV2I",
  "access_expires_at": "2026-10-29T08:46:22.376986873Z",
  "refresh_token": "X0LUqblkVakCdIOuR4UkGjSp55fTht_h7V8pBH-ydXw",
  "refresh_expires_at": "2026-10-29T20:31:22.376394967Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676540000` → **200**

```json
{
  "deliveries": [
    {
      "id": "d15f5b63-36e6-4285-b62b-e00f13674014",
      "challenge_id": "afcce870-e6fd-4a9d-b0fd-983069795a47",
      "phone": "+380676540000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-52379a79-ed9d-450d-922c-b4901ee6f97a",
      "error": null,
      "attempted_at": "2026-10-29T08:31:21.758055Z"
    },
    {
      "id": "c8def6e3-a51c-4ef7-872c-7ce6c3edb477",
      "challenge_id": "afcce870-e6fd-4a9d-b0fd-983069795a47",
      "phone": "+380676540000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-29T08:31:21.756953Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380676540000` → **200**

```json
{
  "phone": "+380676540000",
  "audience": "CLIENT",
  "code": "509495",
  "sent_at": "2026-10-29T08:31:21.757811315Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675949669` → **200**

```json
{
  "deliveries": [
    {
      "id": "9bb4099d-6696-4902-a970-7cb809f4360a",
      "challenge_id": "b300ae88-6640-4a73-84ad-8bbdd3b86902",
      "phone": "+380675949669",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-0c0f25e6-d1ef-437c-9f63-b4bb9ea96647",
      "error": null,
      "attempted_at": "2026-10-29T08:31:21.463801Z"
    }
  ]
}
```

Done: SMS to +380670086589, a call to +380675949669, SMS then a call to +380676540000.

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
  "session_id": "8be66c1e-808a-47bf-b4a0-68a003fbc454",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM1ODMsImlhdCI6MTc5MzI2MjY4MywianRpIjoiODRlNjZmODgtN2FhMS00YWNlLWE1ODUtOWRmYzI4YmZjOTU4Iiwic2lkIjoiOGJlNjZjMWUtODA4YS00N2JmLWI0YTAtNjhhMDAzZmJjNDU0In0.lsmS1tCgCl1r_wLBmFa0jeKVk5Cx7ouljLHxKrtQMas",
  "access_expires_at": "2026-10-29T08:46:23.544540975Z",
  "refresh_token": "1n8L8zzmiRLwRlrvXP8neq0vL1kvWmXIso-YSCETF1o",
  "refresh_expires_at": "2026-10-29T20:31:23.544042729Z",
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
  "session_id": "97dc8a7a-9d6f-4c47-bc02-6a47847c00db",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM1ODQsImlhdCI6MTc5MzI2MjY4NCwianRpIjoiZWYzNTE2MDEtOGNhNy00ZDU0LWFhMjctNWRhYmFkODNmM2VjIiwic2lkIjoiOTdkYzhhN2EtOWQ2Zi00YzQ3LWJjMDItNmE0Nzg0N2MwMGRiIn0.7DGnjblklTMiKeowxVTNkE_MEVEN1vEBiHBQ9Wlr7BY",
  "access_expires_at": "2026-10-29T08:46:24.116596108Z",
  "refresh_token": "lyFlrtpadVmX2HrA8F_0lUC5_MLvDSLEwJ_e4rJOVtQ",
  "refresh_expires_at": "2026-10-29T20:31:24.116104945Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3",
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

`POST /api/admin/v1/staff-extensions/85782d39-1a26-4896-83e2-d51f63705ba3` → **200**

```json
{
  "command_id": "6db2c05d-67c5-4170-a24a-8e3150b5b945",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "85782d39-1a26-4896-83e2-d51f63705ba3",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "89ac0072-2949-407e-8172-37f364d5fe12",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T08:31:25.255666Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T08:31:25.255666Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "bb6cde60-c791-4d76-8655-13d8fea76140",
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
  "id": "6825e3eb-b210-4fd5-9030-60ebae85bf0f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:36:25.807078Z",
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
  "command_id": "28eed834-780a-408c-b9a4-ea661e537853",
  "quote_id": "6825e3eb-b210-4fd5-9030-60ebae85bf0f",
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
    "phone": "+380675046798"
  }
}
```

```json
{
  "id": "47c327af-ba51-48a1-886f-cd165ef88fbf",
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
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:31:26.086464Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675046798"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/47c327af-ba51-48a1-886f-cd165ef88fbf/calls` → **201**

```json
{
  "command_id": "adfb9731-9674-405d-9ea3-bad9dde00a2c",
  "to": "CALLER"
}
```

```json
{
  "id": "2cda108e-17af-41c3-967a-10e6fad0405b",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
  "order_ids": [
    "47c327af-ba51-48a1-886f-cd165ef88fbf"
  ],
  "started_at": "2026-10-29T08:31:26.400152Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/47c327af-ba51-48a1-886f-cd165ef88fbf/calls` → **201**

```json
{
  "command_id": "adfb9731-9674-405d-9ea3-bad9dde00a2c",
  "to": "CALLER"
}
```

```json
{
  "id": "2cda108e-17af-41c3-967a-10e6fad0405b",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
  "order_ids": [
    "47c327af-ba51-48a1-886f-cd165ef88fbf"
  ],
  "started_at": "2026-10-29T08:31:26.400152Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "2cda108e-17af-41c3-967a-10e6fad0405b",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380675046798",
    "at": "2026-10-29T08:31:26.402656941Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "2cda108e-17af-41c3-967a-10e6fad0405b",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.4156",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "2cda108e-17af-41c3-967a-10e6fad0405b"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "2cda108e-17af-41c3-967a-10e6fad0405b",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=47c327af-ba51-48a1-886f-cd165ef88fbf` → **200**

```json
{
  "calls": [
    {
      "id": "2cda108e-17af-41c3-967a-10e6fad0405b",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
      "order_ids": [
        "47c327af-ba51-48a1-886f-cd165ef88fbf"
      ],
      "started_at": "2026-10-29T08:31:26.400152Z",
      "answered_at": "2026-10-29T08:31:27.068227Z",
      "ended_at": "2026-10-29T08:31:27.089935Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=47c327af-ba51-48a1-886f-cd165ef88fbf` → **200**

```json
{
  "calls": [
    {
      "id": "2cda108e-17af-41c3-967a-10e6fad0405b",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
      "order_ids": [
        "47c327af-ba51-48a1-886f-cd165ef88fbf"
      ],
      "started_at": "2026-10-29T08:31:26.400152Z",
      "answered_at": "2026-10-29T08:31:27.068227Z",
      "ended_at": "2026-10-29T08:31:27.089935Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=47c327af-ba51-48a1-886f-cd165ef88fbf` → **200**

```json
{
  "calls": [
    {
      "id": "2cda108e-17af-41c3-967a-10e6fad0405b",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
      "order_ids": [
        "47c327af-ba51-48a1-886f-cd165ef88fbf"
      ],
      "started_at": "2026-10-29T08:31:26.400152Z",
      "answered_at": "2026-10-29T08:31:27.068227Z",
      "ended_at": "2026-10-29T08:31:27.089935Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=47c327af-ba51-48a1-886f-cd165ef88fbf` → **200**

```json
{
  "calls": [
    {
      "id": "2cda108e-17af-41c3-967a-10e6fad0405b",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
      "order_ids": [
        "47c327af-ba51-48a1-886f-cd165ef88fbf"
      ],
      "started_at": "2026-10-29T08:31:26.400152Z",
      "answered_at": "2026-10-29T08:31:27.068227Z",
      "ended_at": "2026-10-29T08:31:27.089935Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=47c327af-ba51-48a1-886f-cd165ef88fbf` → **200**

```json
{
  "calls": [
    {
      "id": "2cda108e-17af-41c3-967a-10e6fad0405b",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
      "order_ids": [
        "47c327af-ba51-48a1-886f-cd165ef88fbf"
      ],
      "started_at": "2026-10-29T08:31:26.400152Z",
      "answered_at": "2026-10-29T08:31:27.068227Z",
      "ended_at": "2026-10-29T08:31:27.089935Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=47c327af-ba51-48a1-886f-cd165ef88fbf` → **200**

```json
{
  "calls": [
    {
      "id": "2cda108e-17af-41c3-967a-10e6fad0405b",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
      "order_ids": [
        "47c327af-ba51-48a1-886f-cd165ef88fbf"
      ],
      "started_at": "2026-10-29T08:31:26.400152Z",
      "answered_at": "2026-10-29T08:31:27.068227Z",
      "ended_at": "2026-10-29T08:31:27.089935Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T08:31:36.809228Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/47c327af-ba51-48a1-886f-cd165ef88fbf` → **200**

```json
{
  "id": "47c327af-ba51-48a1-886f-cd165ef88fbf",
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
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:31:26.086464Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675046798"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/47c327af-ba51-48a1-886f-cd165ef88fbf/cancel` → **200**

```json
{
  "command_id": "6e12092b-34a1-474f-86dd-cfed9f143792",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "47c327af-ba51-48a1-886f-cd165ef88fbf",
  "short_number": 22,
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
  "created_at": "2026-10-29T08:31:26.086464Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675046798"
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
  "command_id": "731593b9-348d-48ac-be7e-ee75b84b16e9",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-29T08:31:39.46984Z",
  "extension": "101"
}
```

Done: outgoing call 2cda108e-17af-41c3-967a-10e6fad0405b from order 47c327af-ba51-48a1-886f-cd165ef88fbf, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631870747",
  "device_ref": "sandbox-29388"
}
```

```json
{
  "challenge_id": "4f5ed91d-dffe-4d85-b5be-b93694cbc38a",
  "expires_at": "2026-10-29T08:36:39.772689574Z",
  "resend_available_at": "2026-10-29T08:31:40.772689574Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631870747` → **200**

```json
{
  "phone": "+380631870747",
  "audience": "CLIENT",
  "code": "675867",
  "sent_at": "2026-10-29T08:31:39.775143569Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4f5ed91d-dffe-4d85-b5be-b93694cbc38a",
  "code": "675867",
  "device_ref": "sandbox-29388"
}
```

```json
{
  "session_id": "dd39cc44-6ecb-4f1d-ad60-2735b03f2e5e",
  "subject": {
    "type": "CLIENT",
    "id": "eb40fbde-1d62-4502-b2f8-be3936bc276b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYjQwZmJkZS0xZDYyLTQ1MDItYjJmOC1iZTM5MzZiYzI3NmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzNjAwLCJpYXQiOjE3OTMyNjI3MDAsImp0aSI6Ijk1OGVkYmJhLWMwMzQtNDlmMS04OWM0LTIyNWQwNDQzNjE0ZSIsInNpZCI6ImRkMzljYzQ0LTZlY2ItNGYxZC1hZDYwLTI3MzViMDNmMmU1ZSJ9.iV5Vqj5LBkUEaLjO9DyMCRn8z607TVy1Ju3cqxpsHro",
  "access_expires_at": "2026-10-29T08:46:40.072804823Z",
  "refresh_token": "LMkkRCQxWEYtNvQE6uBay5WmMk9TkT27f44XP_PfFWM",
  "refresh_expires_at": "2026-11-28T08:31:40.07230684Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "eb40fbde-1d62-4502-b2f8-be3936bc276b",
  "session_id": "dd39cc44-6ecb-4f1d-ad60-2735b03f2e5e",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631870747",
  "device_ref": "sandbox-23990"
}
```

```json
{
  "challenge_id": "31996c86-f86c-488a-89a7-aea3e5824a41",
  "expires_at": "2026-10-29T08:36:42.610339267Z",
  "resend_available_at": "2026-10-29T08:31:43.610339267Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631870747` → **200**

```json
{
  "phone": "+380631870747",
  "audience": "CLIENT",
  "code": "183277",
  "sent_at": "2026-10-29T08:31:42.612367996Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "31996c86-f86c-488a-89a7-aea3e5824a41",
  "code": "183277",
  "device_ref": "sandbox-23990"
}
```

```json
{
  "session_id": "6c135aba-ab31-47e5-bec0-863e60d76eb5",
  "subject": {
    "type": "CLIENT",
    "id": "eb40fbde-1d62-4502-b2f8-be3936bc276b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYjQwZmJkZS0xZDYyLTQ1MDItYjJmOC1iZTM5MzZiYzI3NmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzNjAyLCJpYXQiOjE3OTMyNjI3MDIsImp0aSI6IjhkYTcwNTBhLWJkN2MtNDBiZC05OGNiLTFjNDQxNDFlNzM0MiIsInNpZCI6IjZjMTM1YWJhLWFiMzEtNDdlNS1iZWMwLTg2M2U2MGQ3NmViNSJ9.BMTLKv52jIrvrTeKtAvNCbKRYNj4G_p44Y-MjMgeeQU",
  "access_expires_at": "2026-10-29T08:46:42.911190656Z",
  "refresh_token": "2XvJhPEgju7L9MSl0WIl7v1-XTIZ_hdcdiPHeNdoOQE",
  "refresh_expires_at": "2026-11-28T08:31:42.910484895Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "a83e0693-82fe-473d-b6ff-2af226ee3593",
  "expires_at": "2026-10-29T08:36:45.200690563Z",
  "resend_available_at": "2026-10-29T08:31:46.200690563Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631870747` → **200**

```json
{
  "phone": "+380631870747",
  "audience": "CLIENT",
  "code": "337046",
  "sent_at": "2026-10-29T08:31:45.202689549Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380630956198"
}
```

```json
{
  "challenge_id": "6c986f77-deed-48be-a782-e37a0061aa4d",
  "expires_at": "2026-10-29T08:36:45.489098878Z",
  "resend_available_at": "2026-10-29T08:31:46.489098878Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630956198` → **200**

```json
{
  "phone": "+380630956198",
  "audience": "CLIENT",
  "code": "569143",
  "sent_at": "2026-10-29T08:31:45.491065872Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "fdb4de09-1c87-4848-93ae-0c079990795d",
  "current_challenge_id": "a83e0693-82fe-473d-b6ff-2af226ee3593",
  "current_code": "000000",
  "new_challenge_id": "6c986f77-deed-48be-a782-e37a0061aa4d",
  "new_code": "569143"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "bfb3ca22-44ee-4801-b9c9-2374e84ccab4"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "4288d0d3-53b8-4f6f-8771-8f91ae509e35",
  "current_challenge_id": "a83e0693-82fe-473d-b6ff-2af226ee3593",
  "current_code": "337046",
  "new_challenge_id": "6c986f77-deed-48be-a782-e37a0061aa4d",
  "new_code": "569143"
}
```

```json
{
  "subject_id": "eb40fbde-1d62-4502-b2f8-be3936bc276b",
  "phone": "+380630956198",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "eb40fbde-1d62-4502-b2f8-be3936bc276b",
  "session_id": "dd39cc44-6ecb-4f1d-ad60-2735b03f2e5e",
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
  "correlation_id": "07d499b9-cb94-4b2b-8b7c-740f5aad5819"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630956198",
  "device_ref": "sandbox-14431"
}
```

```json
{
  "challenge_id": "7646bfc0-a5b3-41ac-89fd-2d2e44ad23e3",
  "expires_at": "2026-10-29T08:36:48.906184844Z",
  "resend_available_at": "2026-10-29T08:31:49.906184844Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630956198` → **200**

```json
{
  "phone": "+380630956198",
  "audience": "CLIENT",
  "code": "892842",
  "sent_at": "2026-10-29T08:31:48.908314968Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7646bfc0-a5b3-41ac-89fd-2d2e44ad23e3",
  "code": "892842",
  "device_ref": "sandbox-14431"
}
```

```json
{
  "session_id": "78fc5234-f3d0-4f2a-9473-d5e31a32b1ae",
  "subject": {
    "type": "CLIENT",
    "id": "eb40fbde-1d62-4502-b2f8-be3936bc276b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYjQwZmJkZS0xZDYyLTQ1MDItYjJmOC1iZTM5MzZiYzI3NmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzNjA5LCJpYXQiOjE3OTMyNjI3MDksImp0aSI6ImM3YzZlOWVhLWVhZWYtNDMzMS05MDVkLTJkNzc0YzNjMTE4MSIsInNpZCI6Ijc4ZmM1MjM0LWYzZDAtNGYyYS05NDczLWQ1ZTMxYTMyYjFhZSJ9.h07oomUH8GT5IC6UVtV79P5kQU79xVl-kLCvE7X_vt4",
  "access_expires_at": "2026-10-29T08:46:49.214551808Z",
  "refresh_token": "-L1JXHfcUlbnlzNFl233nhB3PyDFmuaJtf85yGWLazU",
  "refresh_expires_at": "2026-11-28T08:31:49.214008725Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "eb40fbde-1d62-4502-b2f8-be3936bc276b",
  "session_id": "78fc5234-f3d0-4f2a-9473-d5e31a32b1ae",
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
  "session_id": "04e63130-7e87-4e2f-b449-19f911cac20a",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM2MTAsImlhdCI6MTc5MzI2MjcxMCwianRpIjoiODcxZTk4MDQtMTdjYS00NTExLTljZDgtMjcwMmMwNmY3YzJiIiwic2lkIjoiMDRlNjMxMzAtN2U4Ny00ZTJmLWI0NDktMTlmOTExY2FjMjBhIn0.UqN9xRU6faKm1xTN2-PpUhQPaSx9A_vQjLcXxkbIXws",
  "access_expires_at": "2026-10-29T08:46:50.062944795Z",
  "refresh_token": "VsJpNzaBbjeIwwoHHzFVSr_3pzIyN9I3ryQlp0Pwwxw",
  "refresh_expires_at": "2026-10-29T20:31:50.062394333Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/eb40fbde-1d62-4502-b2f8-be3936bc276b` → **200**

```json
{
  "client": {
    "id": "eb40fbde-1d62-4502-b2f8-be3936bc276b",
    "phone": "+380630956198",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T08:31:40.070747Z",
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

`POST /api/admin/v1/clients/eb40fbde-1d62-4502-b2f8-be3936bc276b/phone/new-code` → **201**

```json
{
  "phone": "+380636815526"
}
```

```json
{
  "challenge_id": "3d467e3e-e4cb-43fd-854f-91f09ec57342",
  "expires_at": "2026-10-29T08:36:50.645978465Z",
  "resend_available_at": "2026-10-29T08:31:51.645978465Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636815526` → **200**

```json
{
  "phone": "+380636815526",
  "audience": "CLIENT",
  "code": "432509",
  "sent_at": "2026-10-29T08:31:50.647929682Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/eb40fbde-1d62-4502-b2f8-be3936bc276b/phone` → **422**

```json
{
  "command_id": "2ae83592-0f30-46af-985b-c568c62d1db2",
  "expected_version": 3,
  "new_challenge_id": "3d467e3e-e4cb-43fd-854f-91f09ec57342",
  "new_code": "432510",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/eb40fbde-1d62-4502-b2f8-be3936bc276b/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "004322d6-e15a-4dcf-99e0-f257884dc7d1"
}
```

`POST /api/admin/v1/clients/eb40fbde-1d62-4502-b2f8-be3936bc276b/phone` → **400**

```json
{
  "command_id": "1a0aa70c-8f25-46b2-af91-5d636195e89d",
  "expected_version": 3,
  "new_challenge_id": "3d467e3e-e4cb-43fd-854f-91f09ec57342",
  "new_code": "432509",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/eb40fbde-1d62-4502-b2f8-be3936bc276b/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "62028b61-26b2-481b-8180-d9fa16b537d2",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/eb40fbde-1d62-4502-b2f8-be3936bc276b/phone` → **200**

```json
{
  "command_id": "f4106c90-9211-4366-abd1-bfed3db6272f",
  "expected_version": 3,
  "new_challenge_id": "3d467e3e-e4cb-43fd-854f-91f09ec57342",
  "new_code": "432509",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "eb40fbde-1d62-4502-b2f8-be3936bc276b",
  "phone": "+380636815526",
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
  "correlation_id": "5953afe8-2096-4541-a2e7-b616dd40b578"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636815526",
  "device_ref": "sandbox-2445"
}
```

```json
{
  "challenge_id": "a14e489c-298b-47f8-a479-257eae502521",
  "expires_at": "2026-10-29T08:36:52.108073161Z",
  "resend_available_at": "2026-10-29T08:31:53.108073161Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636815526` → **200**

```json
{
  "phone": "+380636815526",
  "audience": "CLIENT",
  "code": "819234",
  "sent_at": "2026-10-29T08:31:52.110218055Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a14e489c-298b-47f8-a479-257eae502521",
  "code": "819234",
  "device_ref": "sandbox-2445"
}
```

```json
{
  "session_id": "d463524e-520b-4896-bb96-f222ac6ae0aa",
  "subject": {
    "type": "CLIENT",
    "id": "eb40fbde-1d62-4502-b2f8-be3936bc276b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYjQwZmJkZS0xZDYyLTQ1MDItYjJmOC1iZTM5MzZiYzI3NmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzNjEyLCJpYXQiOjE3OTMyNjI3MTIsImp0aSI6IjM3NTg3YmQ5LTNjYjgtNDM4ZC1hMDgzLTM4ZWZjMzU2MTczNiIsInNpZCI6ImQ0NjM1MjRlLTUyMGItNDg5Ni1iYjk2LWYyMjJhYzZhZTBhYSJ9.YHaw8taYZRUqPKgAE3CtMnIfNg5badOuZA5KBJgrSlw",
  "access_expires_at": "2026-10-29T08:46:52.409227458Z",
  "refresh_token": "xfdR0IR9mQOKLB1XlUcD2tYJ88X1fmi8MyL4BJgeYa0",
  "refresh_expires_at": "2026-11-28T08:31:52.408667559Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "eb40fbde-1d62-4502-b2f8-be3936bc276b",
  "session_id": "d463524e-520b-4896-bb96-f222ac6ae0aa",
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
  "phone": "+380635564712",
  "device_ref": "sandbox-24122"
}
```

```json
{
  "challenge_id": "4dcda69e-c462-42e7-a897-93d87c2b4b0f",
  "expires_at": "2026-10-29T08:36:52.954907968Z",
  "resend_available_at": "2026-10-29T08:31:53.954907968Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635564712` → **200**

```json
{
  "phone": "+380635564712",
  "audience": "CLIENT",
  "code": "590577",
  "sent_at": "2026-10-29T08:31:52.957004831Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4dcda69e-c462-42e7-a897-93d87c2b4b0f",
  "code": "590577",
  "device_ref": "sandbox-24122"
}
```

```json
{
  "session_id": "6dda4c5c-ac4b-40f3-bcb6-df339e2cb51b",
  "subject": {
    "type": "CLIENT",
    "id": "2afc8b1b-7bc2-4eee-934f-97d63165b83d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYWZjOGIxYi03YmMyLTRlZWUtOTM0Zi05N2Q2MzE2NWI4M2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzNjEzLCJpYXQiOjE3OTMyNjI3MTMsImp0aSI6ImNlYjcwMjQzLWQ0OGEtNGQ4Yy05N2ZiLTg3NjY2NmFjNTBlNSIsInNpZCI6IjZkZGE0YzVjLWFjNGItNDBmMy1iY2I2LWRmMzM5ZTJjYjUxYiJ9.x75NtQablcT3ELRMm0FWgkV6Fsa10vv1boZbDRAqZQk",
  "access_expires_at": "2026-10-29T08:46:53.26934022Z",
  "refresh_token": "u9sy9IrMj4hFW4raD2MthqutJxVTqi4-9e1Y9tQiZfM",
  "refresh_expires_at": "2026-11-28T08:31:53.268664905Z",
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
  "session_id": "2d3097da-000d-4243-bca2-eca0fd65a21f",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM2MTQsImlhdCI6MTc5MzI2MjcxNCwianRpIjoiYjY0MDQzOGEtZDg2Yi00YjI4LTg1NTMtZTU4ZGIyMjdjYWY2Iiwic2lkIjoiMmQzMDk3ZGEtMDAwZC00MjQzLWJjYTItZWNhMGZkNjVhMjFmIn0.B8pByeksnFV9Xk9dIr1VqxyEA4ar9rXq-RinpXka4Xo",
  "access_expires_at": "2026-10-29T08:46:54.409208758Z",
  "refresh_token": "PHePs1cAS67YHqWymr5N2C1Ye3IwQ5P0CbdoXzJqZ3s",
  "refresh_expires_at": "2026-10-29T20:31:54.408652558Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380635564712` → **200**

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
  "correlation_id": "c54508e3-a5de-4ed5-8924-49de1f1795bf"
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
  "session_id": "74851867-59f2-4a32-b17b-b63a433eb2b6",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM2MTUsImlhdCI6MTc5MzI2MjcxNSwianRpIjoiMGQxMDNlMTctZTk2MS00ZDViLTkyYjAtZmE4MGY5YTU1NjhhIiwic2lkIjoiNzQ4NTE4NjctNTlmMi00YTMyLWIxN2ItYjYzYTQzM2ViMmI2In0.q8jm5bbE_4tQRpYYiAeJJPaU3k01ySrAq3ds-DlGnyI",
  "access_expires_at": "2026-10-29T08:46:55.553540962Z",
  "refresh_token": "YWxLd8pMGYqhfARXa6AxMvsHsj3cURVeXtgeOj1dwlE",
  "refresh_expires_at": "2026-10-29T20:31:55.553050243Z",
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
  "changed_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T08:28:17.290906Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "d711458f-a168-4134-9bb4-4c888f464a90",
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
  "changed_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-29T08:31:56.120601001Z"
}
```

## The rider books the airport for 2026-10-29T11:31:55Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600192007",
  "device_ref": "sandbox-4437"
}
```

```json
{
  "challenge_id": "e6943160-a85c-4361-8c54-379835bb89ca",
  "expires_at": "2026-10-29T08:36:56.410787382Z",
  "resend_available_at": "2026-10-29T08:31:57.410787382Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600192007` → **200**

```json
{
  "phone": "+48600192007",
  "audience": "CLIENT",
  "code": "078955",
  "sent_at": "2026-10-29T08:31:56.413508423Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e6943160-a85c-4361-8c54-379835bb89ca",
  "code": "078955",
  "device_ref": "sandbox-4437"
}
```

```json
{
  "session_id": "e19d2bdf-b533-44e5-bf9d-f94b9e69d1e6",
  "subject": {
    "type": "CLIENT",
    "id": "63d8d60e-e94b-4173-9ea9-c488abc8c2f7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2M2Q4ZDYwZS1lOTRiLTQxNzMtOWVhOS1jNDg4YWJjOGMyZjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzNjE2LCJpYXQiOjE3OTMyNjI3MTYsImp0aSI6IjcwMWU1NGZlLTE1MDktNDA0Zi04NWE1LWE5Y2Y4ZGE3Nzg1NCIsInNpZCI6ImUxOWQyYmRmLWI1MzMtNDRlNS1iZjlkLWY5NGI5ZTY5ZDFlNiJ9.p1NEXNOjxRNY19-4MnN_Hhuh3NhYIkSU73efI4zWqsw",
  "access_expires_at": "2026-10-29T08:46:56.719245941Z",
  "refresh_token": "hgjaH_RNKJKFXMNp7ZaJpiEozuBYrprGGtIWG7VYR3M",
  "refresh_expires_at": "2026-11-28T08:31:56.718672748Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f86d5840-69dc-4cc4-b6e7-5e944bf93a83",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-29T11:31:55Z"
}
```

```json
{
  "id": "f22317dc-8468-4754-bbe0-ca0eae714656",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:36:57.008221Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T11:31:55Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "869dbb08-35ef-42f4-987e-99a94e52dcf5",
  "quote_id": "f22317dc-8468-4754-bbe0-ca0eae714656",
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
  "pickup_at": "2026-10-29T11:31:55Z"
}
```

```json
{
  "id": "0c6b0378-4e2f-4f7e-9345-af0caf1de291",
  "short_number": 23,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "63d8d60e-e94b-4173-9ea9-c488abc8c2f7",
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
  "created_at": "2026-10-29T08:31:57.305493Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T11:31:55Z",
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
  "device_ref": "sandbox-7561"
}
```

```json
{
  "challenge_id": "4d36ff78-364d-4b0c-8920-f5ef0c84f3b3",
  "expires_at": "2026-10-29T08:36:57.609011636Z",
  "resend_available_at": "2026-10-29T08:31:58.609011636Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "762654",
  "sent_at": "2026-10-29T08:31:57.611144573Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4d36ff78-364d-4b0c-8920-f5ef0c84f3b3",
  "code": "762654",
  "device_ref": "sandbox-7561"
}
```

```json
{
  "session_id": "896a08af-9fee-449f-9200-5c2af8c828ba",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MzYxNywiaWF0IjoxNzkzMjYyNzE3LCJqdGkiOiI3MjA0MDJhMy0wMGM3LTQyNzMtYmQwNS0zNzRhYzQyYjJkMDMiLCJzaWQiOiI4OTZhMDhhZi05ZmVlLTQ0OWYtOTIwMC01YzJhZjhjODI4YmEifQ.9TdxWbw-4T7AEUYNDvzSzhKeS7q5sWlnqcg509VO_U4",
  "access_expires_at": "2026-10-29T08:46:57.9152843Z",
  "refresh_token": "kMLDeGKPfMoVrsL7_iq7hFXM99XFOsw3xG1pU2kI0Q4",
  "refresh_expires_at": "2026-11-28T08:31:57.914704085Z",
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
  "command_id": "c136ce05-59d2-490f-b957-c85c01df4eb4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:31:58Z",
    "sequence": 1793262718481
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "57f00729-8ae9-43c7-be2e-7a58fc24f0e8",
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
  "last_heartbeat_at": "2026-10-29T08:31:58.500494Z",
  "last_location_at": "2026-10-29T08:31:58.500494Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "0c6b0378-4e2f-4f7e-9345-af0caf1de291",
      "short_number": 23,
      "pickup_at": "2026-10-29T11:31:55Z",
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

`POST /api/driver/v1/preorders/0c6b0378-4e2f-4f7e-9345-af0caf1de291/reserve` → **200**

```json
{
  "command_id": "9cc4de96-a4e9-450d-9394-497a70c45444"
}
```

```json
{
  "id": "88545777-c091-4a84-8e83-15db653a7dc0",
  "state": "RESERVED",
  "order": {
    "order_id": "0c6b0378-4e2f-4f7e-9345-af0caf1de291",
    "short_number": 23,
    "pickup_at": "2026-10-29T11:31:55Z",
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
  "reserved_at": "2026-10-29T08:31:59.05472Z",
  "confirm_from": "2026-10-29T11:01:55Z",
  "confirm_until": "2026-10-29T11:11:55Z",
  "drop_until": "2026-10-29T10:31:55Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "88545777-c091-4a84-8e83-15db653a7dc0",
      "state": "RESERVED",
      "order": {
        "order_id": "0c6b0378-4e2f-4f7e-9345-af0caf1de291",
        "short_number": 23,
        "pickup_at": "2026-10-29T11:31:55Z",
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
      "reserved_at": "2026-10-29T08:31:59.05472Z",
      "confirm_from": "2026-10-29T11:01:55Z",
      "confirm_until": "2026-10-29T11:11:55Z",
      "drop_until": "2026-10-29T10:31:55Z"
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
      "id": "88545777-c091-4a84-8e83-15db653a7dc0",
      "state": "RESERVED",
      "order": {
        "order_id": "0c6b0378-4e2f-4f7e-9345-af0caf1de291",
        "short_number": 23,
        "pickup_at": "2026-10-29T11:31:55Z",
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
      "reserved_at": "2026-10-29T08:31:59.05472Z",
      "confirm_from": "2026-10-29T11:01:55Z",
      "confirm_until": "2026-10-29T11:11:55Z",
      "drop_until": "2026-10-29T10:31:55Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/88545777-c091-4a84-8e83-15db653a7dc0/confirm` → **409**

```json
{
  "command_id": "9aeac3d4-9bec-48a8-a210-7d814fcfa10f"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/88545777-c091-4a84-8e83-15db653a7dc0/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "975935fa-fbb2-425e-b1f2-52f88d9e3124"
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
  "session_id": "2e59eaeb-fbec-461e-9e8e-194590ad94a3",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM2MjAsImlhdCI6MTc5MzI2MjcyMCwianRpIjoiOTQ1YmFkZDEtMGViZC00M2E0LWJhNGMtN2Q5MzQ5YzEyZGEwIiwic2lkIjoiMmU1OWVhZWItZmJlYy00NjFlLTllOGUtMTk0NTkwYWQ5NGEzIn0.P9Ey9zJO0ztcQh6-S5FYJKJd0ck6i_YkWWF1aVQYSgA",
  "access_expires_at": "2026-10-29T08:47:00.50758038Z",
  "refresh_token": "wH_PTEMSjOl41cNact6bpvlPPCQLHINqQsPx3EhfPug",
  "refresh_expires_at": "2026-10-29T20:32:00.50706703Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/0c6b0378-4e2f-4f7e-9345-af0caf1de291` → **200**

```json
{
  "id": "0c6b0378-4e2f-4f7e-9345-af0caf1de291",
  "short_number": 23,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "63d8d60e-e94b-4173-9ea9-c488abc8c2f7",
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
  "created_at": "2026-10-29T08:31:57.305493Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-29T11:31:55Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "88545777-c091-4a84-8e83-15db653a7dc0",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-29T08:31:59.05472Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/0c6b0378-4e2f-4f7e-9345-af0caf1de291/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-29T08:31:57.306688Z",
      "actor": {
        "type": "CLIENT",
        "id": "63d8d60e-e94b-4173-9ea9-c488abc8c2f7",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "0c6b0378-4e2f-4f7e-9345-af0caf1de291",
        "preorder": true,
        "quote_id": "f22317dc-8468-4754-bbe0-ca0eae714656",
        "pickup_at": "2026-10-29T11:31:55Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "1edd0c25-d344-487b-951e-0ae95695a4d4"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-29T08:31:59.055925Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "0c6b0378-4e2f-4f7e-9345-af0caf1de291",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "88545777-c091-4a84-8e83-15db653a7dc0"
      },
      "correlation_id": "c0eaae71-8b50-469f-ab19-0ad3a93e6505"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 0c6b0378-4e2f-4f7e-9345-af0caf1de291, reservation 88545777-c091-4a84-8e83-15db653a7dc0.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-24768"
}
```

```json
{
  "challenge_id": "8e5cb2cf-c4cf-458b-a0a2-592125620ad2",
  "expires_at": "2026-10-29T08:37:01.381631541Z",
  "resend_available_at": "2026-10-29T08:32:02.381631541Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "850386",
  "sent_at": "2026-10-29T08:32:01.383974591Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8e5cb2cf-c4cf-458b-a0a2-592125620ad2",
  "code": "850386",
  "device_ref": "sandbox-24768"
}
```

```json
{
  "session_id": "d7bb41b1-e9f0-4045-aec5-03159ee59126",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MzYyMSwiaWF0IjoxNzkzMjYyNzIxLCJqdGkiOiIyYjg0ZjA4Ny0xMDBjLTQ0MGItOGQ0My1hZGVlOTMwNjU1MGMiLCJzaWQiOiJkN2JiNDFiMS1lOWYwLTQwNDUtYWVjNS0wMzE1OWVlNTkxMjYifQ.iGMFiy-r5qX50lnFNUOvc6jOpupgoAKeyjkXbPuQf3s",
  "access_expires_at": "2026-10-29T08:47:01.679442153Z",
  "refresh_token": "DmUctSvGW53sbxejM9QkXB5LrdhMJbXWz7YTdH4w-qI",
  "refresh_expires_at": "2026-11-28T08:32:01.678795543Z",
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
  "command_id": "9b839d0b-f895-47c5-ad82-8ec9c3d7c6d9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:32:02Z",
    "sequence": 1793262722237
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9fedfad7-ac0a-40ac-9646-46adcd1737ec",
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
  "last_heartbeat_at": "2026-10-29T08:32:02.256123Z",
  "last_location_at": "2026-10-29T08:32:02.256123Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672515846",
  "device_ref": "sandbox-11208"
}
```

```json
{
  "challenge_id": "49b57527-7b2b-456a-a9d3-733f6dc20801",
  "expires_at": "2026-10-29T08:37:02.527566779Z",
  "resend_available_at": "2026-10-29T08:32:03.527566779Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672515846` → **200**

```json
{
  "phone": "+380672515846",
  "audience": "CLIENT",
  "code": "520271",
  "sent_at": "2026-10-29T08:32:02.530626538Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "49b57527-7b2b-456a-a9d3-733f6dc20801",
  "code": "520271",
  "device_ref": "sandbox-11208"
}
```

```json
{
  "session_id": "483711ec-42ea-47c5-b39d-311e3e4fabe9",
  "subject": {
    "type": "CLIENT",
    "id": "5dda4284-2fe7-4f2e-a4ad-d7f70aee897d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZGRhNDI4NC0yZmU3LTRmMmUtYTRhZC1kN2Y3MGFlZTg5N2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzNjIyLCJpYXQiOjE3OTMyNjI3MjIsImp0aSI6IjYwYzhiOTcxLTgxMjEtNDc2ZS1iNzRiLTlmMzFkNzllODI3YyIsInNpZCI6IjQ4MzcxMWVjLTQyZWEtNDdjNS1iMzlkLTMxMWUzZTRmYWJlOSJ9.xqqOwQnBYBPgEDLFWyv_2XMhXoS9Mbx91AOFshG-yH8",
  "access_expires_at": "2026-10-29T08:47:02.829477575Z",
  "refresh_token": "HIQz6FqqoKEPBqa5OnEp_nteQ5FXOJp5NlU5C2xJVo0",
  "refresh_expires_at": "2026-11-28T08:32:02.828918604Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c19c3980-3be9-4468-b6fc-ac41c2e6bada",
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
  "id": "f4c01495-ec0b-47f8-a583-97cdbeec0c7f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:37:03.117364Z",
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
  "command_id": "7f5e08a0-64f1-496a-ac0f-d07362047336",
  "quote_id": "f4c01495-ec0b-47f8-a583-97cdbeec0c7f",
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
  "id": "09cddb0a-a3ad-45f3-9cff-2e683df172ca",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5dda4284-2fe7-4f2e-a4ad-d7f70aee897d",
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
  "created_at": "2026-10-29T08:32:03.412076Z",
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
    "id": "0e587d43-d3f4-4557-8e18-b8e578ec5210",
    "order_id": "09cddb0a-a3ad-45f3-9cff-2e683df172ca",
    "expires_at": "2026-10-29T08:32:18.415688Z",
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

`POST /api/driver/v1/offers/0e587d43-d3f4-4557-8e18-b8e578ec5210/accept` → **200**

```json
{
  "command_id": "cf3e6cfe-4294-44e2-a5d9-3d45b541e0e3"
}
```

```json
{
  "id": "d6a158f4-73d1-45bc-97b2-761398f403e9",
  "order_id": "09cddb0a-a3ad-45f3-9cff-2e683df172ca",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "031f812b-9d65-4134-bbae-ba89e60311c2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "031f812b-9d65-4134-bbae-ba89e60311c2",
  "order_id": "09cddb0a-a3ad-45f3-9cff-2e683df172ca",
  "assignment_id": "d6a158f4-73d1-45bc-97b2-761398f403e9",
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

`POST /api/driver/v1/work-sessions/9fedfad7-ac0a-40ac-9646-46adcd1737ec/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:32:04Z",
    "sequence": 1793262724528
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9fedfad7-ac0a-40ac-9646-46adcd1737ec",
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
  "last_heartbeat_at": "2026-10-29T08:32:04.54738Z",
  "last_location_at": "2026-10-29T08:32:04.54738Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "031f812b-9d65-4134-bbae-ba89e60311c2",
  "order_id": "09cddb0a-a3ad-45f3-9cff-2e683df172ca",
  "assignment_id": "d6a158f4-73d1-45bc-97b2-761398f403e9",
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

`POST /api/driver/v1/trips/031f812b-9d65-4134-bbae-ba89e60311c2/arrive` → **200**

```json
{
  "command_id": "27f2d62e-90db-4364-8a97-1e0871274285",
  "expected_version": 0
}
```

```json
{
  "id": "031f812b-9d65-4134-bbae-ba89e60311c2",
  "order_id": "09cddb0a-a3ad-45f3-9cff-2e683df172ca",
  "assignment_id": "d6a158f4-73d1-45bc-97b2-761398f403e9",
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
  "arrived_at": "2026-10-29T08:32:05.111659Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/031f812b-9d65-4134-bbae-ba89e60311c2/start` → **200**

```json
{
  "command_id": "28870548-0f8c-4bd3-a1e9-bb7cbc70f341",
  "expected_version": 1
}
```

```json
{
  "id": "031f812b-9d65-4134-bbae-ba89e60311c2",
  "order_id": "09cddb0a-a3ad-45f3-9cff-2e683df172ca",
  "assignment_id": "d6a158f4-73d1-45bc-97b2-761398f403e9",
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
  "arrived_at": "2026-10-29T08:32:05.111659Z",
  "started_at": "2026-10-29T08:32:05.397911Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/9fedfad7-ac0a-40ac-9646-46adcd1737ec/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:32:05Z",
    "sequence": 1793262725672
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9fedfad7-ac0a-40ac-9646-46adcd1737ec",
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
  "last_heartbeat_at": "2026-10-29T08:32:05.690376Z",
  "last_location_at": "2026-10-29T08:32:05.690376Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/031f812b-9d65-4134-bbae-ba89e60311c2/complete` → **200**

```json
{
  "command_id": "3d210b14-93a8-4f8b-b565-27ff5078b38f",
  "expected_version": 2,
  "reported_at": "2026-10-29T08:32:05Z",
  "cash_received": true
}
```

```json
{
  "id": "031f812b-9d65-4134-bbae-ba89e60311c2",
  "order_id": "09cddb0a-a3ad-45f3-9cff-2e683df172ca",
  "assignment_id": "d6a158f4-73d1-45bc-97b2-761398f403e9",
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
  "arrived_at": "2026-10-29T08:32:05.111659Z",
  "started_at": "2026-10-29T08:32:05.397911Z",
  "completed_at": "2026-10-29T08:32:05.972741Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/09cddb0a-a3ad-45f3-9cff-2e683df172ca/rating` → **200**

```json
{
  "command_id": "08d1912e-9b99-46c8-9df3-0ade8215c43f",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "09cddb0a-a3ad-45f3-9cff-2e683df172ca",
  "score": 5,
  "created_at": "2026-10-29T08:32:06.277201219Z"
}
```

`POST /api/driver/v1/orders/09cddb0a-a3ad-45f3-9cff-2e683df172ca/rating` → **200**

```json
{
  "command_id": "01b973b5-de5a-468c-9a89-2af8cf173444",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "09cddb0a-a3ad-45f3-9cff-2e683df172ca",
  "score": 4,
  "created_at": "2026-10-29T08:32:06.576952934Z"
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
  "session_id": "dc51f5cf-69c9-4a35-917c-8b343511d0b6",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM2MjcsImlhdCI6MTc5MzI2MjcyNywianRpIjoiNjA3NmE3YzgtMGIzZi00ZTVlLWFiOWMtYmUxNGRjN2E3NTgxIiwic2lkIjoiZGM1MWY1Y2YtNjljOS00YTM1LTkxN2MtOGIzNDM1MTFkMGI2In0.IN9B_LrwgEofQETMzS2IiJ1ht-qJVZ8s-r4cHNmDqeY",
  "access_expires_at": "2026-10-29T08:47:07.461280875Z",
  "refresh_token": "Z0a2VLlWcdgTwrOY7b9mm7PyIXTnf4KDfq4fS_YiHzM",
  "refresh_expires_at": "2026-10-29T20:32:07.46064664Z",
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
  "session_id": "901eb981-c8f2-40ae-ae11-62d6eecf5d88",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM2MjgsImlhdCI6MTc5MzI2MjcyOCwianRpIjoiZWU0Y2M2NmMtZjIwMS00Y2RlLThmOWEtMDk2MDczZWJiOWJkIiwic2lkIjoiOTAxZWI5ODEtYzhmMi00MGFlLWFlMTEtNjJkNmVlY2Y1ZDg4In0.JXbAFpbSffiJcyTwOPwtLisCYQB-hXRHRjVU7lIp-Os",
  "access_expires_at": "2026-10-29T08:47:08.043487929Z",
  "refresh_token": "c3ax9zoehquj0J3FBCpdZBTlesjcIi8uj0eg7jVDCd4",
  "refresh_expires_at": "2026-10-29T20:32:08.042877007Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/09cddb0a-a3ad-45f3-9cff-2e683df172ca/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "09cddb0a-a3ad-45f3-9cff-2e683df172ca",
      "author_type": "RIDER",
      "author_id": "5dda4284-2fe7-4f2e-a4ad-d7f70aee897d",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-29T08:32:06.277201Z"
    },
    {
      "order_id": "09cddb0a-a3ad-45f3-9cff-2e683df172ca",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "5dda4284-2fe7-4f2e-a4ad-d7f70aee897d",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-29T08:32:06.576953Z"
    }
  ]
}
```

Done: ratings for order 09cddb0a-a3ad-45f3-9cff-2e683df172ca.

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
  "session_id": "8d2028f8-cf47-424c-9161-76045a59d814",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM2MjgsImlhdCI6MTc5MzI2MjcyOCwianRpIjoiMDg2Mzk4ZmUtMmEzMi00ZmIzLWJkZTgtOTMwN2JhYWQ0OTZlIiwic2lkIjoiOGQyMDI4ZjgtY2Y0Ny00MjRjLTkxNjEtNzYwNDVhNTlkODE0In0.ln2KqxIiHnth2q3n4vAhl-Jfq-9JdcEbMMNcFkeE9Kw",
  "access_expires_at": "2026-10-29T08:47:08.919826481Z",
  "refresh_token": "yz6Grdj2cEgg73E4dBJDStUBYxiy-yT37OUlKfZLQ-I",
  "refresh_expires_at": "2026-10-29T20:32:08.919061673Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "81876aef-645b-4744-bbd6-aac3d16b387c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "606959a5-9f1f-4fe3-84c0-3476bc9cacd4",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T08:32:09.214679Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/606959a5-9f1f-4fe3-84c0-3476bc9cacd4` → **200**

```json
{
  "id": "606959a5-9f1f-4fe3-84c0-3476bc9cacd4",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T08:32:09.214679Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/606959a5-9f1f-4fe3-84c0-3476bc9cacd4` → **200**

```json
{
  "id": "606959a5-9f1f-4fe3-84c0-3476bc9cacd4",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T08:32:09.214679Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/606959a5-9f1f-4fe3-84c0-3476bc9cacd4` → **200**

```json
{
  "id": "606959a5-9f1f-4fe3-84c0-3476bc9cacd4",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T08:32:09.214679Z",
  "ready_at": "2026-10-29T08:32:11.841721Z",
  "expires_at": "2026-10-30T08:32:11.841721Z"
}
```

`GET /api/admin/v1/reports/exports/606959a5-9f1f-4fe3-84c0-3476bc9cacd4/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-29,23,10,13,0,0,18,5,0,21,1,0,1,7,1,5
total,23,10,13,0,0,18,5,0,21,1,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "76046b14-ef46-4f7a-a799-0bff80fef871",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "b2dbd578-d087-4964-ae21-0175a0b015ca",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T08:32:12.359306Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b2dbd578-d087-4964-ae21-0175a0b015ca` → **200**

```json
{
  "id": "b2dbd578-d087-4964-ae21-0175a0b015ca",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T08:32:12.359306Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b2dbd578-d087-4964-ae21-0175a0b015ca` → **200**

```json
{
  "id": "b2dbd578-d087-4964-ae21-0175a0b015ca",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T08:32:12.359306Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b2dbd578-d087-4964-ae21-0175a0b015ca` → **200**

```json
{
  "id": "b2dbd578-d087-4964-ae21-0175a0b015ca",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T08:32:12.359306Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b2dbd578-d087-4964-ae21-0175a0b015ca` → **200**

```json
{
  "id": "b2dbd578-d087-4964-ae21-0175a0b015ca",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T08:32:12.359306Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b2dbd578-d087-4964-ae21-0175a0b015ca` → **200**

```json
{
  "id": "b2dbd578-d087-4964-ae21-0175a0b015ca",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T08:32:12.359306Z",
  "ready_at": "2026-10-29T08:32:16.850106Z",
  "expires_at": "2026-10-30T08:32:16.850106Z"
}
```

`GET /api/admin/v1/reports/exports/b2dbd578-d087-4964-ae21-0175a0b015ca/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-29,UAH,10,1387.37,130.74,208.14,1179.23,10.52,0.00,162.97,182.97,795.00,50.00,105.17
total,UAH,10,1387.37,130.74,208.14,1179.23,10.52,0.00,162.97,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/cac026b4-f026-4199-b917-ce9d1f5badf3` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/cac026b4-f026-4199-b917-ce9d1f5badf3",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "04c9a22f-a098-4882-9f44-3e1f39f101f4"
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
  "device_ref": "sandbox-27063"
}
```

```json
{
  "challenge_id": "eee1e307-e982-4456-a2d4-a50c016803e1",
  "expires_at": "2026-10-29T08:37:18.385171662Z",
  "resend_available_at": "2026-10-29T08:32:19.385171662Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "005541",
  "sent_at": "2026-10-29T08:32:18.387595985Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eee1e307-e982-4456-a2d4-a50c016803e1",
  "code": "005541",
  "device_ref": "sandbox-27063"
}
```

```json
{
  "session_id": "b92f470d-989d-4d10-aecb-ebf1b85a7027",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MzYzOCwiaWF0IjoxNzkzMjYyNzM4LCJqdGkiOiI4OWU3YzY3ZC02ZTMxLTQ3OWMtOGE1NC0yMWFlYjFiZDFhZmIiLCJzaWQiOiJiOTJmNDcwZC05ODlkLTRkMTAtYWVjYi1lYmYxYjg1YTcwMjcifQ.uFVycWttz4FHN_iZKVqKINSeLxAJa4q9SlxgVDb-9oY",
  "access_expires_at": "2026-10-29T08:47:18.692664162Z",
  "refresh_token": "lFq6WL83kzIZcKuqoAol1R4z55d8P2l4lOKnIJQxJQ4",
  "refresh_expires_at": "2026-11-28T08:32:18.691981297Z",
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
  "command_id": "f0e128cc-424a-492e-9b50-15ba2679be17",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:32:19Z",
    "sequence": 1793262739528
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "54044ea2-c82d-4a66-84ca-00271f4b2c57",
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
  "last_heartbeat_at": "2026-10-29T08:32:19.549406Z",
  "last_location_at": "2026-10-29T08:32:19.549406Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "73bd35ad-a8cc-4dc3-814f-de8f772fc2c3",
  "points": [
    {
      "sequence": 1793262741872,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T08:31:21Z"
    },
    {
      "sequence": 1793262741880,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T08:32:21Z"
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
  "session_id": "2a4b3072-161d-4104-9e1c-e5683f967550",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM2NDIsImlhdCI6MTc5MzI2Mjc0MiwianRpIjoiZTQ0Yzg2OGItOTI2ZC00ZDA0LWFhMmYtODY3ZGRhYjczMGQ5Iiwic2lkIjoiMmE0YjMwNzItMTYxZC00MTA0LTllMWMtZTU2ODNmOTY3NTUwIn0.w69rpn6_AQzCneDUmd8hecoWrFXvA_T-uTAoF0OwxZc",
  "access_expires_at": "2026-10-29T08:47:22.49966868Z",
  "refresh_token": "A4s9ISYF1RQVc40g5qVwG05AkMV5_FhazWO_Oa5sMjQ",
  "refresh_expires_at": "2026-10-29T20:32:22.499115075Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "c30e8474-3d5d-440f-bef8-9b205b3738b8",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-29T08:32:21Z",
        "track_point_id": "f7537ca6-4a30-4bf5-a542-f751bc67be8d",
        "work_session_id": "54044ea2-c82d-4a66-84ca-00271f4b2c57"
      },
      "raised_by": null,
      "raised_at": "2026-10-29T08:32:21Z",
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
    "version": 4,
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

`POST /api/admin/v1/driver-risk-flags/c30e8474-3d5d-440f-bef8-9b205b3738b8/confirm` → **200**

```json
{
  "command_id": "c77c08e1-60ca-49af-bf83-0558e2678fe3",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "c30e8474-3d5d-440f-bef8-9b205b3738b8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-29T08:32:21Z",
    "track_point_id": "f7537ca6-4a30-4bf5-a542-f751bc67be8d",
    "work_session_id": "54044ea2-c82d-4a66-84ca-00271f4b2c57"
  },
  "raised_by": null,
  "raised_at": "2026-10-29T08:32:21Z",
  "reason": null,
  "reviewed_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
  "reviewed_at": "2026-10-29T08:32:23.375659Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/c30e8474-3d5d-440f-bef8-9b205b3738b8/dismiss` → **409**

```json
{
  "command_id": "6f2c7e87-1a39-4f6a-8c90-2d8b39336b4f",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/c30e8474-3d5d-440f-bef8-9b205b3738b8/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "2b1495c1-a2cc-4583-8960-fed5ca3c1c1a"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "d20ad1f9-aaa2-400c-8b4c-2957846497c8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "79308edd-a3df-46c4-922f-1b90991c64b7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
  "raised_at": "2026-10-29T08:32:23.965326Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/79308edd-a3df-46c4-922f-1b90991c64b7/dismiss` → **200**

```json
{
  "command_id": "6822bd2a-d1aa-4743-9d73-d0d2e19df306",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "79308edd-a3df-46c4-922f-1b90991c64b7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
  "raised_at": "2026-10-29T08:32:23.965326Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
  "reviewed_at": "2026-10-29T08:32:24.258397Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "2d3b264f-f062-40d6-8453-34dd53da88a9",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "c30e8474-3d5d-440f-bef8-9b205b3738b8"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "SUSPENDED",
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
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "85782d39-1a26-4896-83e2-d51f63705ba3",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T08:32:24.561393Z"
    }
  ]
}
```

Done: flag c30e8474-3d5d-440f-bef8-9b205b3738b8 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "f53af496-a466-4a4d-a6a3-0492bdfa64c4",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM2NDUsImlhdCI6MTc5MzI2Mjc0NSwianRpIjoiNGVlYTdjZmItZjJhZC00NjA2LTkwMjUtMmRiYmNiNjVjN2IwIiwic2lkIjoiZjUzYWY0OTYtYTQ2Ni00YTRkLWE2YTMtMDQ5MmJkZmE2NGM0In0.MqXtkXSUIfcPfqu8TUEdSV_khrOLgWv32-AUqiRld1s",
  "access_expires_at": "2026-10-29T08:47:25.431648186Z",
  "refresh_token": "gZJhLA8HTp8zcVUbGNFNKJngQZzVdVeEJ1wCgsdg6Y8",
  "refresh_expires_at": "2026-10-29T20:32:25.431058614Z",
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
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "85782d39-1a26-4896-83e2-d51f63705ba3",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T08:32:24.561393Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "57f34e67-7d38-424a-946c-b818549d1e3e",
  "expected_version": 5,
  "reason": "Sandbox clean-up"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "54044ea2-c82d-4a66-84ca-00271f4b2c57",
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
  "last_heartbeat_at": "2026-10-29T08:32:19.549406Z",
  "last_location_at": "2026-10-29T08:32:19.549406Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/54044ea2-c82d-4a66-84ca-00271f4b2c57/close` → **200**

```json
{
  "command_id": "822c7c28-1bf1-473d-bdd9-b779ec583fd8",
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
  "session_id": "96d2e32c-fff1-4f63-9803-a1cf59121722",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM2NDcsImlhdCI6MTc5MzI2Mjc0NywianRpIjoiMDQ3MDk1ODctMThkNS00Y2ViLWFhYTQtMDQxM2U5OTMxNzgwIiwic2lkIjoiOTZkMmUzMmMtZmZmMS00ZjYzLTk4MDMtYTFjZjU5MTIxNzIyIn0.17VWaSJB0VDAEg5MkWv6yZ9SRAa33a5ZcyZqZpsCXNY",
  "access_expires_at": "2026-10-29T08:47:27.162240609Z",
  "refresh_token": "wehn7NCQemON_Tk58b54qZ4ip3fXHURejeXW34vIuJs",
  "refresh_expires_at": "2026-10-29T20:32:27.161705567Z",
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
  "command_id": "8863f9f4-5ac2-403e-b4d1-5921bc662932",
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
  "changed_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T08:32:27.732857Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "8863f9f4-5ac2-403e-b4d1-5921bc662932",
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
  "changed_by": "85782d39-1a26-4896-83e2-d51f63705ba3",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T08:32:27.732857Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48005445641",
  "device_ref": "sandbox-8278"
}
```

```json
{
  "challenge_id": "bf5fb936-6535-45ea-9af7-b4b2579ce0bf",
  "expires_at": "2026-10-29T08:37:28.30812507Z",
  "resend_available_at": "2026-10-29T08:32:29.30812507Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48005445641` → **200**

```json
{
  "phone": "+48005445641",
  "audience": "CLIENT",
  "code": "334473",
  "sent_at": "2026-10-29T08:32:28.310702977Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bf5fb936-6535-45ea-9af7-b4b2579ce0bf",
  "code": "334473",
  "device_ref": "sandbox-8278"
}
```

```json
{
  "session_id": "0a105ad5-ded4-47a3-8d23-150d027fd348",
  "subject": {
    "type": "CLIENT",
    "id": "65fb0e1e-9668-4b9c-83a9-5f35d075c7a7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NWZiMGUxZS05NjY4LTRiOWMtODNhOS01ZjM1ZDA3NWM3YTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzNjQ4LCJpYXQiOjE3OTMyNjI3NDgsImp0aSI6ImY4NTFmNDczLTg2YzktNDc5NS1iMjE0LWFmMjllNDliMmY0NCIsInNpZCI6IjBhMTA1YWQ1LWRlZDQtNDdhMy04ZDIzLTE1MGQwMjdmZDM0OCJ9.CK2kCvhF3OrnJKKd1qfuVW_kWn100NtnmxKDTfDvynw",
  "access_expires_at": "2026-10-29T08:47:28.618479794Z",
  "refresh_token": "jUjwRK1c6eVw-B3_rseHvYTUXixD_Za7y6_5knoYCZo",
  "refresh_expires_at": "2026-11-28T08:32:28.61780413Z",
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
  "correlation_id": "9c09f598-bdb2-4c9d-866c-7fdfab42172b"
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
  "device_ref": "sandbox-17128"
}
```

```json
{
  "challenge_id": "b058e731-04ff-4f15-bb31-b9f501c7adb4",
  "expires_at": "2026-10-29T08:37:29.464200668Z",
  "resend_available_at": "2026-10-29T08:32:30.464200668Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "598726",
  "sent_at": "2026-10-29T08:32:29.466313822Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b058e731-04ff-4f15-bb31-b9f501c7adb4",
  "code": "598726",
  "device_ref": "sandbox-17128"
}
```

```json
{
  "session_id": "0dfda718-6740-4702-aa2f-74d98df35d09",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MzY0OSwiaWF0IjoxNzkzMjYyNzQ5LCJqdGkiOiIwNTBmZjI4MS1kY2MwLTQ4ODUtYmYyOS0wOWY4ZmExY2Y0Y2UiLCJzaWQiOiIwZGZkYTcxOC02NzQwLTQ3MDItYWEyZi03NGQ5OGRmMzVkMDkifQ.zhITqiBz9E7aZzX8QlQPRvE0-HKapmUX2a9shqIW3X0",
  "access_expires_at": "2026-10-29T08:47:29.774460767Z",
  "refresh_token": "Rgimpuqxfxc-FGdiiQTGl9--WDKyNM0ERrkyJp7Dqq8",
  "refresh_expires_at": "2026-11-28T08:32:29.773919203Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "57f00729-8ae9-43c7-be2e-7a58fc24f0e8",
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
  "last_heartbeat_at": "2026-10-29T08:31:58.500494Z",
  "last_location_at": "2026-10-29T08:31:58.500494Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/57f00729-8ae9-43c7-be2e-7a58fc24f0e8/handover` → **200**

```json
{
  "command_id": "7d6191c6-a6d7-4274-913c-f3b8ef43ecef",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "57f00729-8ae9-43c7-be2e-7a58fc24f0e8",
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
  "last_heartbeat_at": "2026-10-29T08:31:58.500494Z",
  "last_location_at": "2026-10-29T08:31:58.500494Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/57f00729-8ae9-43c7-be2e-7a58fc24f0e8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:32:30Z",
    "sequence": 1793262750635
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "57f00729-8ae9-43c7-be2e-7a58fc24f0e8",
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
  "last_heartbeat_at": "2026-10-29T08:32:30.654109Z",
  "last_location_at": "2026-10-29T08:32:30.654109Z",
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
  "session_id": "57f00729-8ae9-43c7-be2e-7a58fc24f0e8",
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
  "last_heartbeat_at": "2026-10-29T08:32:30.654109Z",
  "last_location_at": "2026-10-29T08:32:30.654109Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/57f00729-8ae9-43c7-be2e-7a58fc24f0e8/close` → **200**

```json
{
  "command_id": "f6a3fc31-c2ee-444e-bf77-55d6065f0f77",
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
  "correlation_id": "4cb180c3-e38c-48be-941e-55182d594532"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678308938",
  "device_ref": "sandbox-8716"
}
```

```json
{
  "challenge_id": "ae717fe9-3bc5-473e-9c39-f86672bba11f",
  "expires_at": "2026-10-29T08:37:32.064132914Z",
  "resend_available_at": "2026-10-29T08:32:33.064132914Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678308938` → **200**

```json
{
  "phone": "+380678308938",
  "audience": "CLIENT",
  "code": "881441",
  "sent_at": "2026-10-29T08:32:32.066279574Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ae717fe9-3bc5-473e-9c39-f86672bba11f",
  "code": "881441",
  "device_ref": "sandbox-8716"
}
```

```json
{
  "session_id": "087dddbb-f6ca-4e0e-a376-1d7639faa99f",
  "subject": {
    "type": "CLIENT",
    "id": "ca193248-9c57-4cfc-a8f8-364268a4e5b0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTE5MzI0OC05YzU3LTRjZmMtYThmOC0zNjQyNjhhNGU1YjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzNjUyLCJpYXQiOjE3OTMyNjI3NTIsImp0aSI6IjBlMzA2OTE2LTUwMTItNGQ0ZS1hMTUwLTU5ZmYyYTliZjgwMSIsInNpZCI6IjA4N2RkZGJiLWY2Y2EtNGUwZS1hMzc2LTFkNzYzOWZhYTk5ZiJ9.jsczJF9hvRAl0wFKqfvTkw4hRSp2iC3IRWm9aNnpweM",
  "access_expires_at": "2026-10-29T08:47:32.378187227Z",
  "refresh_token": "V_R_BSLL6MRF_G4YuVczNrebpHnKNiZIIMjCpttx8Ao",
  "refresh_expires_at": "2026-11-28T08:32:32.377669597Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "acd36cb1-c03f-44fd-9512-5b0759c4bd29",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "0f13278e-bb1d-4f03-8971-e16276b31705",
  "upload_path": "/api/rider/v1/uploads/0f13278e-bb1d-4f03-8971-e16276b31705",
  "expires_at": "2026-10-29T08:47:32.672174438Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/0f13278e-bb1d-4f03-8971-e16276b31705` → **200**

```json
{
  "file_id": "0f13278e-bb1d-4f03-8971-e16276b31705",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "cf0ab8a0-f883-4f69-889d-d6cbdfa342a7",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "0f13278e-bb1d-4f03-8971-e16276b31705"
  ]
}
```

```json
{
  "id": "80573f82-224c-4940-81d3-8f5d96126cc0",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "ca193248-9c57-4cfc-a8f8-364268a4e5b0",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T08:32:32.994383Z",
  "updated_at": "2026-10-29T08:32:32.994383Z",
  "respond_by": "2026-10-29T12:32:32.994383Z",
  "messages": [
    {
      "id": "a2199e6e-89e2-41a4-a27e-e36ebdca9fbb",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "ca193248-9c57-4cfc-a8f8-364268a4e5b0",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T08:32:32.99567Z",
      "attachments": [
        {
          "file_id": "0f13278e-bb1d-4f03-8971-e16276b31705",
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
  "session_id": "0175ec44-16bc-4622-914e-7f9e98c439e4",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM2NTMsImlhdCI6MTc5MzI2Mjc1MywianRpIjoiYTczMWIzZmQtZWVmYS00OWE0LWE0NzItMTQyODYxNjM3MzIzIiwic2lkIjoiMDE3NWVjNDQtMTZiYy00NjIyLTkxNGUtN2Y5ZTk4YzQzOWU0In0.hwGdTqj5df__7y1h25uIE9763UUKdnzWjCp-X8V3G7I",
  "access_expires_at": "2026-10-29T08:47:33.599914342Z",
  "refresh_token": "oBYwqCgF2x9JTCgaiJdWAEZW-PQ9SrF9tb_P3-sNuJo",
  "refresh_expires_at": "2026-10-29T20:32:33.599266854Z",
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
  "session_id": "ac19cd24-5071-4350-9806-265c746a718c",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM2NTQsImlhdCI6MTc5MzI2Mjc1NCwianRpIjoiNmVjNzFjZTgtNmUwOC00NmZiLWFlNzctODhiN2EwYWM1YjliIiwic2lkIjoiYWMxOWNkMjQtNTA3MS00MzUwLTk4MDYtMjY1Yzc0NmE3MThjIn0.iVl-_oyU5CILeA3YBXvIaVOj-3amDXNqcMKQntYQjW4",
  "access_expires_at": "2026-10-29T08:47:34.169857964Z",
  "refresh_token": "iS3O3Ve1fxGOr_oxWhtNLM2N9zGOrjNIqI26GsDtvYY",
  "refresh_expires_at": "2026-10-29T20:32:34.169225246Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/80573f82-224c-4940-81d3-8f5d96126cc0/attachments/0f13278e-bb1d-4f03-8971-e16276b31705` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "14365fe7-c2a6-44bf-a88b-408ac3884b9b",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "5a42b48a-dda1-4e44-90ce-8d6ff69ec324",
  "upload_path": "/api/operator/v1/uploads/5a42b48a-dda1-4e44-90ce-8d6ff69ec324",
  "expires_at": "2026-10-29T08:47:34.466861102Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/5a42b48a-dda1-4e44-90ce-8d6ff69ec324` → **200**

```json
{
  "file_id": "5a42b48a-dda1-4e44-90ce-8d6ff69ec324",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/80573f82-224c-4940-81d3-8f5d96126cc0` → **200**

```json
{
  "id": "80573f82-224c-4940-81d3-8f5d96126cc0",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "ca193248-9c57-4cfc-a8f8-364268a4e5b0",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T08:32:32.994383Z",
  "updated_at": "2026-10-29T08:32:32.994383Z",
  "respond_by": "2026-10-29T12:32:32.994383Z",
  "messages": [
    {
      "id": "a2199e6e-89e2-41a4-a27e-e36ebdca9fbb",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "ca193248-9c57-4cfc-a8f8-364268a4e5b0",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T08:32:32.99567Z",
      "attachments": [
        {
          "file_id": "0f13278e-bb1d-4f03-8971-e16276b31705",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/80573f82-224c-4940-81d3-8f5d96126cc0/comments` → **200**

```json
{
  "command_id": "b98cb324-3468-4563-a9c4-11b1b70d8a1a",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "5a42b48a-dda1-4e44-90ce-8d6ff69ec324"
  ]
}
```

```json
{
  "id": "80573f82-224c-4940-81d3-8f5d96126cc0",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "ca193248-9c57-4cfc-a8f8-364268a4e5b0",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T08:32:32.994383Z",
  "updated_at": "2026-10-29T08:32:35.096449Z",
  "respond_by": "2026-10-29T12:32:32.994383Z",
  "messages": [
    {
      "id": "a2199e6e-89e2-41a4-a27e-e36ebdca9fbb",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "ca193248-9c57-4cfc-a8f8-364268a4e5b0",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T08:32:32.99567Z",
      "attachments": [
        {
          "file_id": "0f13278e-bb1d-4f03-8971-e16276b31705",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "aca0aaf1-9180-4f19-82ab-79f96943b961",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "85782d39-1a26-4896-83e2-d51f63705ba3",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T08:32:35.096001Z",
      "attachments": [
        {
          "file_id": "5a42b48a-dda1-4e44-90ce-8d6ff69ec324",
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

`GET /api/rider/v1/support/cases/80573f82-224c-4940-81d3-8f5d96126cc0` → **200**

```json
{
  "id": "80573f82-224c-4940-81d3-8f5d96126cc0",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "ca193248-9c57-4cfc-a8f8-364268a4e5b0",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T08:32:32.994383Z",
  "updated_at": "2026-10-29T08:32:35.096449Z",
  "respond_by": "2026-10-29T12:32:32.994383Z",
  "messages": [
    {
      "id": "a2199e6e-89e2-41a4-a27e-e36ebdca9fbb",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "ca193248-9c57-4cfc-a8f8-364268a4e5b0",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T08:32:32.99567Z",
      "attachments": [
        {
          "file_id": "0f13278e-bb1d-4f03-8971-e16276b31705",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "aca0aaf1-9180-4f19-82ab-79f96943b961",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T08:32:35.096001Z",
      "attachments": [
        {
          "file_id": "5a42b48a-dda1-4e44-90ce-8d6ff69ec324",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/80573f82-224c-4940-81d3-8f5d96126cc0/attachments/5a42b48a-dda1-4e44-90ce-8d6ff69ec324` → **200**

Done: support case 80573f82-224c-4940-81d3-8f5d96126cc0, rider attachment 0f13278e-bb1d-4f03-8971-e16276b31705, operator attachment 5a42b48a-dda1-4e44-90ce-8d6ff69ec324.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732817952",
  "device_ref": "sandbox-29060"
}
```

```json
{
  "challenge_id": "ca6c1ad8-8ce6-4375-ad8b-5221194e631c",
  "expires_at": "2026-10-29T08:37:35.720219716Z",
  "resend_available_at": "2026-10-29T08:32:36.720219716Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732817952` → **200**

```json
{
  "phone": "+380732817952",
  "audience": "CLIENT",
  "code": "711456",
  "sent_at": "2026-10-29T08:32:35.722678565Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ca6c1ad8-8ce6-4375-ad8b-5221194e631c",
  "code": "711456",
  "device_ref": "sandbox-29060"
}
```

```json
{
  "session_id": "3bd7693f-5f07-40fe-9879-a6b284f38d76",
  "subject": {
    "type": "CLIENT",
    "id": "51638a66-0010-41ed-9f4a-1da2953195f1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MTYzOGE2Ni0wMDEwLTQxZWQtOWY0YS0xZGEyOTUzMTk1ZjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzNjU2LCJpYXQiOjE3OTMyNjI3NTYsImp0aSI6ImNmZjYwMDBkLWNhMzQtNDM5OS05YWZiLWRlM2Y5NjFkMTdlNSIsInNpZCI6IjNiZDc2OTNmLTVmMDctNDBmZS05ODc5LWE2YjI4NGYzOGQ3NiJ9.MiPER98tRb31CehcCGAHunHs4MCBOrws0zHItldTnFY",
  "access_expires_at": "2026-10-29T08:47:36.038037979Z",
  "refresh_token": "hDByJZtEiilHoUY9X7ZMhiO1da65ZgaDvxneuv03ib0",
  "refresh_expires_at": "2026-11-28T08:32:36.037347306Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "4ad9099d-b752-45cb-9c9f-9d1ea5a95852",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "251d99be-369d-48c0-822b-e78120bc9f09",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-251d99be-369d-48c0-822b-e78120bc9f09",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "593018d4b932fdc7f0e6c875e5e458ea",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=251d99be-369d-48c0-822b-e78120bc9f09",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732817952"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=251d99be-369d-48c0-822b-e78120bc9f09",
  "expires_at": "2026-10-29T09:02:36.322148Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/251d99be-369d-48c0-822b-e78120bc9f09` → **200**

```json
{
  "id": "251d99be-369d-48c0-822b-e78120bc9f09",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T09:02:36.322148Z",
  "card": {
    "id": "79056995-7331-43c8-9858-f6a4b5f1ceca",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8415",
    "card_type": "Visa",
    "created_at": "2026-10-29T08:32:36.614169Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "be37e13e-30ea-4944-b8dd-517fb704cda7",
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
  "id": "dd2d1861-5353-45c7-9f60-09404798cb84",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:37:36.919238Z",
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
  "command_id": "4edea884-b482-4793-8353-513b5091f4df",
  "quote_id": "dd2d1861-5353-45c7-9f60-09404798cb84",
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
  "id": "c6630501-dabd-4eb0-af12-56f82e5a9c50",
  "short_number": 25,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "51638a66-0010-41ed-9f4a-1da2953195f1",
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
  "created_at": "2026-10-29T08:32:37.218114Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c6630501-dabd-4eb0-af12-56f82e5a9c50` → **200**

```json
{
  "id": "c6630501-dabd-4eb0-af12-56f82e5a9c50",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "51638a66-0010-41ed-9f4a-1da2953195f1",
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
  "created_at": "2026-10-29T08:32:37.218114Z",
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

`GET /api/rider/v1/orders/c6630501-dabd-4eb0-af12-56f82e5a9c50` → **200**

```json
{
  "id": "c6630501-dabd-4eb0-af12-56f82e5a9c50",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "51638a66-0010-41ed-9f4a-1da2953195f1",
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
  "created_at": "2026-10-29T08:32:37.218114Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c6630501-dabd-4eb0-af12-56f82e5a9c50/switch-to-cash` → **200**

```json
{
  "command_id": "942b8f1d-f4e4-4eeb-81e2-4b724826dba9",
  "expected_version": 3
}
```

```json
{
  "id": "c6630501-dabd-4eb0-af12-56f82e5a9c50",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "51638a66-0010-41ed-9f4a-1da2953195f1",
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
  "created_at": "2026-10-29T08:32:37.218114Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c6630501-dabd-4eb0-af12-56f82e5a9c50/switch-to-cash` → **409**

```json
{
  "command_id": "a54f759d-fa60-447e-a254-4ddd0e51e438",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/c6630501-dabd-4eb0-af12-56f82e5a9c50/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "8ebc66e0-93d2-4ae3-b0d8-6b8700a6c49d"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/c6630501-dabd-4eb0-af12-56f82e5a9c50` → **200**

```json
{
  "id": "c6630501-dabd-4eb0-af12-56f82e5a9c50",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "51638a66-0010-41ed-9f4a-1da2953195f1",
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
  "created_at": "2026-10-29T08:32:37.218114Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c6630501-dabd-4eb0-af12-56f82e5a9c50/cancel` → **200**

```json
{
  "command_id": "81017276-7a28-477b-92b1-1addd3cd8f4a",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c6630501-dabd-4eb0-af12-56f82e5a9c50",
  "short_number": 25,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "51638a66-0010-41ed-9f4a-1da2953195f1",
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
  "created_at": "2026-10-29T08:32:37.218114Z",
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
  "session_id": "de02ebac-7180-4b0e-94d5-4c4c06e8e097",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM2NTksImlhdCI6MTc5MzI2Mjc1OSwianRpIjoiYmUxMmIxYzYtMzY0NC00YzU2LWJjZmItZGZlNzExMjRjOWRlIiwic2lkIjoiZGUwMmViYWMtNzE4MC00YjBlLTk0ZDUtNGM0YzA2ZThlMDk3In0.IXFuOXnCCAt4jgNu8X3hDjDrQsZDY2M4jfAIsNo7nCU",
  "access_expires_at": "2026-10-29T08:47:39.604965945Z",
  "refresh_token": "Owc7RtsW9f5AAdUWrUGWWZlQQnYMaO27QjgCQ_eDSDY",
  "refresh_expires_at": "2026-10-29T20:32:39.604403133Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-10495"
}
```

```json
{
  "challenge_id": "c941b068-44e2-4fe2-96f3-bdafc5bc26ea",
  "expires_at": "2026-10-29T08:37:39.878855716Z",
  "resend_available_at": "2026-10-29T08:32:40.878855716Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "603247",
  "sent_at": "2026-10-29T08:32:39.880963552Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c941b068-44e2-4fe2-96f3-bdafc5bc26ea",
  "code": "603247",
  "device_ref": "sandbox-10495"
}
```

```json
{
  "session_id": "f4f376e8-c5c2-4f57-8adb-014a450d5ec0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MzY2MCwiaWF0IjoxNzkzMjYyNzYwLCJqdGkiOiI0MWVmZWVhMi03NWJlLTQ0MWYtOTY2ZC1kYmVhZDc3NGY2MzEiLCJzaWQiOiJmNGYzNzZlOC1jNWMyLTRmNTctOGFkYi0wMTRhNDUwZDVlYzAifQ.3A17WP0g4wb2KEjzUS6Z_8siGFXdMdHDNjesvUSiOek",
  "access_expires_at": "2026-10-29T08:47:40.186986946Z",
  "refresh_token": "8qW88GP_uGc7rbQogVAD554t0t4ZVNpWO7ibwBEv_t0",
  "refresh_expires_at": "2026-11-28T08:32:40.186458126Z",
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

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
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
  },
  "phone": "+380500000003",
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "85782d39-1a26-4896-83e2-d51f63705ba3",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T08:32:24.561393Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "85782d39-1a26-4896-83e2-d51f63705ba3",
      "reason": "Sandbox clean-up",
      "at": "2026-10-29T08:32:26.002045Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "5fca4bd4-c33f-4eb9-b11a-804a27f6ff4c",
  "expected_version": 7,
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
  "version": 8,
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
  "device_ref": "sandbox-24207"
}
```

```json
{
  "challenge_id": "9a3834fe-473d-4b44-bbdb-b568cc5ad727",
  "expires_at": "2026-10-29T08:37:41.354232535Z",
  "resend_available_at": "2026-10-29T08:32:42.354232535Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "305928",
  "sent_at": "2026-10-29T08:32:41.356553074Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9a3834fe-473d-4b44-bbdb-b568cc5ad727",
  "code": "305928",
  "device_ref": "sandbox-24207"
}
```

```json
{
  "session_id": "f79618d5-ea35-47ac-b899-267375adca73",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MzY2MSwiaWF0IjoxNzkzMjYyNzYxLCJqdGkiOiJkNDc1YTFiOS0yZDFiLTRmZDctYTAwYi00MmE3NTJlMjA1MTQiLCJzaWQiOiJmNzk2MThkNS1lYTM1LTQ3YWMtYjg5OS0yNjczNzVhZGNhNzMifQ.htwhWl9wtP-Y-SoeuYAZ6oh1733HQz9Th7T9CrrSWkM",
  "access_expires_at": "2026-10-29T08:47:41.652896095Z",
  "refresh_token": "W8SdmCe8Hvv0OjmkooU8rTue87oKSzXIlJontu8BaGE",
  "refresh_expires_at": "2026-11-28T08:32:41.652313796Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9fedfad7-ac0a-40ac-9646-46adcd1737ec",
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
  "last_heartbeat_at": "2026-10-29T08:32:05.690376Z",
  "last_location_at": "2026-10-29T08:32:05.690376Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/9fedfad7-ac0a-40ac-9646-46adcd1737ec/handover` → **200**

```json
{
  "command_id": "94cc3938-aebc-4582-9bf2-9eace65834e9",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9fedfad7-ac0a-40ac-9646-46adcd1737ec",
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
  "last_heartbeat_at": "2026-10-29T08:32:05.690376Z",
  "last_location_at": "2026-10-29T08:32:05.690376Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/9fedfad7-ac0a-40ac-9646-46adcd1737ec/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:32:42Z",
    "sequence": 1793262762486
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9fedfad7-ac0a-40ac-9646-46adcd1737ec",
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
  "last_heartbeat_at": "2026-10-29T08:32:42.505353Z",
  "last_location_at": "2026-10-29T08:32:42.505353Z",
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
  "command_id": "9db51fd1-2de4-472e-9abb-8d07f868f3a5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:32:43Z",
    "sequence": 1793262763681
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "71db2930-9734-4ab8-b614-545c83912e39",
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
  "last_heartbeat_at": "2026-10-29T08:32:43.087599Z",
  "last_location_at": "2026-10-29T08:32:43.087599Z",
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
  "session_id": "4ea3853c-1d60-4bb0-8c91-0965fc6eb322",
  "subject": {
    "type": "STAFF",
    "id": "85782d39-1a26-4896-83e2-d51f63705ba3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTc4MmQzOS0xYTI2LTQ4OTYtODNlMi1kNTFmNjM3MDViYTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjM2NjMsImlhdCI6MTc5MzI2Mjc2MywianRpIjoiMzdmMzQ2OTgtMzVhOS00MjUwLWI0NmEtNzAyNTA0YmRkMGI5Iiwic2lkIjoiNGVhMzg1M2MtMWQ2MC00YmIwLThjOTEtMDk2NWZjNmViMzIyIn0.OxBZvoEp8HO2hXapzUZQitzw9E-TH2EN530pllYKu6U",
  "access_expires_at": "2026-10-29T08:47:43.677127856Z",
  "refresh_token": "UqWilE1YPXGc5e-YFqG2NnI6f9z53FCXnqrCX5Xhn2c",
  "refresh_expires_at": "2026-10-29T20:32:43.676395859Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "1dab5b37-554c-428c-ae31-e905f86a2793",
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
  "id": "50c3fdff-08de-4ee1-9fff-53fda984dc48",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:37:43.977610Z",
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
  "command_id": "ab789ab1-63e0-4a37-9db5-682ab9623b3b",
  "quote_id": "50c3fdff-08de-4ee1-9fff-53fda984dc48",
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
  "id": "486ff3fe-fe78-4160-b891-e65e76ce4a2b",
  "short_number": 26,
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
  "created_at": "2026-10-29T08:32:44.283074Z",
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
    "id": "90f5adda-e403-4030-b9d7-d36ee50f817b",
    "order_id": "486ff3fe-fe78-4160-b891-e65e76ce4a2b",
    "expires_at": "2026-10-29T08:32:59.286891Z",
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

`POST /api/driver/v1/offers/90f5adda-e403-4030-b9d7-d36ee50f817b/accept` → **200**

```json
{
  "command_id": "b3bfebdd-75bb-46e3-8133-32fc68d875fb"
}
```

```json
{
  "id": "41491799-0747-4d93-a9b8-486b697bf3c9",
  "order_id": "486ff3fe-fe78-4160-b891-e65e76ce4a2b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f410c492-4a01-48d1-98ca-57b8220b3e9b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f410c492-4a01-48d1-98ca-57b8220b3e9b",
  "order_id": "486ff3fe-fe78-4160-b891-e65e76ce4a2b",
  "assignment_id": "41491799-0747-4d93-a9b8-486b697bf3c9",
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

`POST /api/driver/v1/work-sessions/71db2930-9734-4ab8-b614-545c83912e39/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:32:45Z",
    "sequence": 1793262765718
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "71db2930-9734-4ab8-b614-545c83912e39",
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
  "last_heartbeat_at": "2026-10-29T08:32:45.737164Z",
  "last_location_at": "2026-10-29T08:32:45.737164Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f410c492-4a01-48d1-98ca-57b8220b3e9b/arrive` → **200**

```json
{
  "command_id": "111dbed0-f889-4e3a-bf8c-26aac2fae329",
  "expected_version": 0
}
```

```json
{
  "id": "f410c492-4a01-48d1-98ca-57b8220b3e9b",
  "order_id": "486ff3fe-fe78-4160-b891-e65e76ce4a2b",
  "assignment_id": "41491799-0747-4d93-a9b8-486b697bf3c9",
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
  "arrived_at": "2026-10-29T08:32:46.027524Z",
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

`POST /api/driver/v1/trips/f410c492-4a01-48d1-98ca-57b8220b3e9b/start` → **200**

```json
{
  "command_id": "b48efdd7-5d23-480c-85df-1d0b5caa7e97",
  "expected_version": 1
}
```

```json
{
  "id": "f410c492-4a01-48d1-98ca-57b8220b3e9b",
  "order_id": "486ff3fe-fe78-4160-b891-e65e76ce4a2b",
  "assignment_id": "41491799-0747-4d93-a9b8-486b697bf3c9",
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
  "arrived_at": "2026-10-29T08:32:46.027524Z",
  "started_at": "2026-10-29T08:32:46.319075Z",
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

`POST /api/driver/v1/trips/f410c492-4a01-48d1-98ca-57b8220b3e9b/complete` → **200**

```json
{
  "command_id": "2f6a33f4-5fc3-4465-8f99-f73811281880",
  "expected_version": 2,
  "reported_at": "2026-10-29T08:32:46Z",
  "cash_received": true
}
```

```json
{
  "id": "f410c492-4a01-48d1-98ca-57b8220b3e9b",
  "order_id": "486ff3fe-fe78-4160-b891-e65e76ce4a2b",
  "assignment_id": "41491799-0747-4d93-a9b8-486b697bf3c9",
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
  "arrived_at": "2026-10-29T08:32:46.027524Z",
  "started_at": "2026-10-29T08:32:46.319075Z",
  "completed_at": "2026-10-29T08:32:46.619841Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/486ff3fe-fe78-4160-b891-e65e76ce4a2b` → **200**

```json
{
  "id": "486ff3fe-fe78-4160-b891-e65e76ce4a2b",
  "short_number": 26,
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
    "id": "41491799-0747-4d93-a9b8-486b697bf3c9",
    "order_id": "486ff3fe-fe78-4160-b891-e65e76ce4a2b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f410c492-4a01-48d1-98ca-57b8220b3e9b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T08:32:44.283074Z",
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
      "balance_minor": 28209,
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
  "session_id": "9fedfad7-ac0a-40ac-9646-46adcd1737ec",
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
  "last_heartbeat_at": "2026-10-29T08:32:42.505353Z",
  "last_location_at": "2026-10-29T08:32:42.505353Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9fedfad7-ac0a-40ac-9646-46adcd1737ec/close` → **200**

```json
{
  "command_id": "53c346aa-f2bd-4a2e-b86b-81c35f84cfaf",
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
  "session_id": "71db2930-9734-4ab8-b614-545c83912e39",
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
  "last_heartbeat_at": "2026-10-29T08:32:45.737164Z",
  "last_location_at": "2026-10-29T08:32:45.737164Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/71db2930-9734-4ab8-b614-545c83912e39/close` → **200**

```json
{
  "command_id": "ca201bf4-aa1c-4212-9e19-0144500ea854",
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

Done: terminal order 486ff3fe-fe78-4160-b891-e65e76ce4a2b by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-18065"
}
```

```json
{
  "challenge_id": "571e2c05-5e1d-43ab-9a2e-06ec7b718a17",
  "expires_at": "2026-10-29T08:37:51.633920508Z",
  "resend_available_at": "2026-10-29T08:32:52.633920508Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "349205",
  "sent_at": "2026-10-29T08:32:51.636494737Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "571e2c05-5e1d-43ab-9a2e-06ec7b718a17",
  "code": "349205",
  "device_ref": "sandbox-18065"
}
```

```json
{
  "session_id": "748ca78e-c7c2-4ddb-b8b2-ad97b6d9a550",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MzY3MSwiaWF0IjoxNzkzMjYyNzcxLCJqdGkiOiJhMDA0ZDNmMy0wNzg1LTQ0YjctYjAyNC0yNzY1YTEyYjk1YmQiLCJzaWQiOiI3NDhjYTc4ZS1jN2MyLTRkZGItYjhiMi1hZDk3YjZkOWE1NTAifQ.O2I1NGOhHUE7zloAviCS-onQW4_nP22xgm-f6rIrweI",
  "access_expires_at": "2026-10-29T08:47:51.934083398Z",
  "refresh_token": "BIlBgiLgFVajbVfwrZAckXDuF4vQqbXFhqApvtOuGtM",
  "refresh_expires_at": "2026-11-28T08:32:51.933532648Z",
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
  "device_ref": "sandbox-3169"
}
```

```json
{
  "challenge_id": "6280823c-2f41-4493-b351-5ce2130f4f07",
  "expires_at": "2026-10-29T08:37:52.485656328Z",
  "resend_available_at": "2026-10-29T08:32:53.485656328Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "724742",
  "sent_at": "2026-10-29T08:32:52.487783327Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6280823c-2f41-4493-b351-5ce2130f4f07",
  "code": "724742",
  "device_ref": "sandbox-3169"
}
```

```json
{
  "session_id": "2f818201-d748-4e9e-9f25-1288fbc1cd98",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MzY3MiwiaWF0IjoxNzkzMjYyNzcyLCJqdGkiOiI4Njg2NDhjYy04YWJlLTQ1NjEtYmU1MC1jNWZmN2M2ZWYzOTgiLCJzaWQiOiIyZjgxODIwMS1kNzQ4LTRlOWUtOWYyNS0xMjg4ZmJjMWNkOTgifQ.LP4xO4o2Ax4yTuuHAi7Ps2_8NGm8Sh-rz9hUoLtO8Y0",
  "access_expires_at": "2026-10-29T08:47:52.795681176Z",
  "refresh_token": "qPpPziY5lQzpO_jJaJkkiUyQCvnSWg8WwAqhMjiO7g8",
  "refresh_expires_at": "2026-11-28T08:32:52.795135716Z",
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
  "device_ref": "sandbox-22479"
}
```

```json
{
  "challenge_id": "eb6cca32-d4db-49df-8965-90e06c048da5",
  "expires_at": "2026-10-29T08:37:53.350972434Z",
  "resend_available_at": "2026-10-29T08:32:54.350972434Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "021714",
  "sent_at": "2026-10-29T08:32:53.35316702Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eb6cca32-d4db-49df-8965-90e06c048da5",
  "code": "021714",
  "device_ref": "sandbox-22479"
}
```

```json
{
  "session_id": "b2fe5a95-c009-4b7c-80ee-9eae3d8fb0b5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MzY3MywiaWF0IjoxNzkzMjYyNzczLCJqdGkiOiI1YjMyYjMxZS1mMmRlLTRlN2MtOWZkYy0yNzUzMDRmNTE4ZTQiLCJzaWQiOiJiMmZlNWE5NS1jMDA5LTRiN2MtODBlZS05ZWFlM2Q4ZmIwYjUifQ.-OTWI25p_m9bHoMIEoA-DTcT266ZIVQbjAei-xrWhtg",
  "access_expires_at": "2026-10-29T08:47:53.661721138Z",
  "refresh_token": "z5PwfayWWLGIN8W_uDUQEc3SjfSjqFt49Jz_ezn6_Cg",
  "refresh_expires_at": "2026-11-28T08:32:53.66116636Z",
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
  "phone": "+380697846143",
  "device_ref": "sandbox-4884"
}
```

```json
{
  "challenge_id": "03a1f0c0-18fb-4bb1-9cb6-c90f3f9b2804",
  "expires_at": "2026-10-29T08:37:54.208371616Z",
  "resend_available_at": "2026-10-29T08:32:55.208371616Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380697846143` → **200**

```json
{
  "phone": "+380697846143",
  "audience": "CLIENT",
  "code": "669627",
  "sent_at": "2026-10-29T08:32:54.210615203Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "03a1f0c0-18fb-4bb1-9cb6-c90f3f9b2804",
  "code": "669627",
  "device_ref": "sandbox-4884"
}
```

```json
{
  "session_id": "d6930093-6772-4945-9a7c-14ea0bf2b6ad",
  "subject": {
    "type": "CLIENT",
    "id": "5470e448-df61-4143-8062-b2f26c81bd1f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDcwZTQ0OC1kZjYxLTQxNDMtODA2Mi1iMmYyNmM4MWJkMWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYzNjc0LCJpYXQiOjE3OTMyNjI3NzQsImp0aSI6IjllOTVjOGY0LTdjNDAtNDI0ZC1iMjIyLTJjODFjZjdmY2I3YiIsInNpZCI6ImQ2OTMwMDkzLTY3NzItNDk0NS05YTdjLTE0ZWEwYmYyYjZhZCJ9.lCOI1tj_L84Bml7j2gGPNROQYew-3xY93hbYr47rQ6w",
  "access_expires_at": "2026-10-29T08:47:54.512798715Z",
  "refresh_token": "aLmW9hLn10RhWKbph2wZzaKJdTY2Z-yuH4pMyW40_ek",
  "refresh_expires_at": "2026-11-28T08:32:54.512234149Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "99379c73-2e3d-4d37-a728-e7522f017de5",
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
  "id": "0a5004a2-c4fb-4e67-b951-43206f4e9a12",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:37:54.793285Z",
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
  "command_id": "0798663a-3b9f-4352-8f7f-aee7c72526ca",
  "quote_id": "0a5004a2-c4fb-4e67-b951-43206f4e9a12",
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
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T08:32:55.082878Z",
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
  "blizz_orders_total": 27,
  "blizz_orders_cancelled_total": 14,
  "blizz_orders_unfulfilled_total": 1,
  "blizz_dispatch_first_offer_seconds_count": 17,
  "blizz_dispatch_assigned_seconds_count": 16,
  "blizz_offers_total": 19,
  "blizz_dispatch_excluded_total": 9,
  "blizz_sms_sent_total": 69
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 16
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 13.364193354
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 4.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 17
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.164122467
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 16.0
blizz_offers_total{application="blizz-taxi-server",outcome="DECLINED"} 1.0
blizz_offers_total{application="blizz-taxi-server",outcome="REVOKED"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="false"} 19.0
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
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 62.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/50a92b21-8e65-468a-9601-26997bfa4596` → **200**

```json
{
  "id": "50a92b21-8e65-468a-9601-26997bfa4596",
  "short_number": 27,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5470e448-df61-4143-8062-b2f26c81bd1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T08:32:55.082878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793263086948E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793263087129E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793263087129E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793263087131E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.79326308713E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
