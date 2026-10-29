# Sandbox transcript (2026-10-29T07:19:59Z, c78c6f4)

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
  "correlation_id": "a3696d84-db2f-4466-b47b-923d56e17cdd"
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
  "session_id": "8b0c459f-5fea-4503-ae63-42c313842ee5",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTkzMDcsImlhdCI6MTc5MzI1ODQwNywianRpIjoiM2E5NzFmZTktMWIwZC00ZjdlLTkzNGQtZjY2ODc4ZGRlZThmIiwic2lkIjoiOGIwYzQ1OWYtNWZlYS00NTAzLWFlNjMtNDJjMzEzODQyZWU1In0.cFdkHc0xqCXV76cSQ89ss78Na_NcnnDJQzpYZnbRj5I",
  "access_expires_at": "2026-10-29T07:35:07.159467795Z",
  "refresh_token": "Cq3psSA2b0fvHvLfAVtSg9qWztBOs9ACdODbCyIYigA",
  "refresh_expires_at": "2026-10-29T19:20:07.156992612Z",
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
  "session_id": "7adaf9fd-6339-4244-bdb9-3e727187ac75",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTkzMDgsImlhdCI6MTc5MzI1ODQwOCwianRpIjoiNmQ3NzcwYjMtNjBhOC00OThiLWI4NDctNmE1OWY0OWFjOTE1Iiwic2lkIjoiN2FkYWY5ZmQtNjMzOS00MjQ0LWJkYjktM2U3MjcxODdhYzc1In0.eW_rRynEhFeMof4jBRti_YSIbNcuKKHzqOLsbkiZSDU",
  "access_expires_at": "2026-10-29T07:35:08.750435246Z",
  "refresh_token": "DgU3JPpuWAdeyr0xRN6o3IspAfbdJyZIfvqH-j_LMsA",
  "refresh_expires_at": "2026-10-29T19:20:08.749248916Z",
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
  "device_ref": "sandbox-32460"
}
```

```json
{
  "challenge_id": "4aa9f1e4-3e09-49fc-9b39-59a04d945575",
  "expires_at": "2026-10-29T07:25:09.391377401Z",
  "resend_available_at": "2026-10-29T07:20:10.391377401Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "854556",
  "sent_at": "2026-10-29T07:20:09.402512408Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4aa9f1e4-3e09-49fc-9b39-59a04d945575",
  "code": "854556",
  "device_ref": "sandbox-32460"
}
```

```json
{
  "session_id": "e751044c-83f6-4c6f-ad73-24374977796f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI1OTMwOSwiaWF0IjoxNzkzMjU4NDA5LCJqdGkiOiI1OTM1OTFhMS1iNTNkLTQ0MTYtYTJlNy1jMzEzMWNlM2I1NTAiLCJzaWQiOiJlNzUxMDQ0Yy04M2Y2LTRjNmYtYWQ3My0yNDM3NDk3Nzc5NmYifQ.pzQb0qhLroLiIUH_y8D1o2VzBugVzB3hr72p7rBuLDU",
  "access_expires_at": "2026-10-29T07:35:09.74527263Z",
  "refresh_token": "vGKD80odR1V8wI1TCEXspYH2RJvN8zbzST4bfgJ-RiI",
  "refresh_expires_at": "2026-11-28T07:20:09.744058235Z",
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
  "command_id": "9df5fd75-5362-4a82-b2af-c582f87a9eb1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:20:10Z",
    "sequence": 1793258410323
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f3f4fa93-d764-4149-aafc-13c4dcd45fb1",
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
  "last_heartbeat_at": "2026-10-29T07:20:10.431617Z",
  "last_location_at": "2026-10-29T07:20:10.431617Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635144911",
  "device_ref": "sandbox-24529"
}
```

```json
{
  "challenge_id": "a07bab45-c307-4d75-bfa4-8163b38f8282",
  "expires_at": "2026-10-29T07:25:10.734528669Z",
  "resend_available_at": "2026-10-29T07:20:11.734528669Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635144911` → **200**

```json
{
  "phone": "+380635144911",
  "audience": "CLIENT",
  "code": "466747",
  "sent_at": "2026-10-29T07:20:10.738282036Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a07bab45-c307-4d75-bfa4-8163b38f8282",
  "code": "466747",
  "device_ref": "sandbox-24529"
}
```

```json
{
  "session_id": "a2b17fc5-f253-4b40-acae-f1b9d67ef401",
  "subject": {
    "type": "CLIENT",
    "id": "57ed46c3-1c8c-4e3a-b750-038427fdb64b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1N2VkNDZjMy0xYzhjLTRlM2EtYjc1MC0wMzg0MjdmZGI2NGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5MzExLCJpYXQiOjE3OTMyNTg0MTEsImp0aSI6ImE3OTk4MWE1LTI1NTYtNGQyNC05OWU0LTkzZWNiZjJjZWYyMyIsInNpZCI6ImEyYjE3ZmM1LWYyNTMtNGI0MC1hY2FlLWYxYjlkNjdlZjQwMSJ9.3g_OyEdu48jAy0Ka-oeORno7dAur3rV0Zi9tOyliWR0",
  "access_expires_at": "2026-10-29T07:35:11.045722818Z",
  "refresh_token": "nF_0FQZsnyeqNkvujr5L8S8EX2LMlJYnm21JweWaTGM",
  "refresh_expires_at": "2026-11-28T07:20:11.044843245Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2f3b1fed-cd55-49ae-8661-cddff90e9c98",
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
  "id": "40e5c0f9-fe53-4d75-bc77-f5b0d434c811",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:25:11.360227Z",
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
  "command_id": "6c231aae-d26a-4169-873c-f4e895138f34",
  "quote_id": "40e5c0f9-fe53-4d75-bc77-f5b0d434c811",
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
  "id": "642e5eb9-1691-4340-8c27-fb2ebe13bc40",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "57ed46c3-1c8c-4e3a-b750-038427fdb64b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:20:11.742784Z",
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
    "id": "c40efaa3-b297-451a-b9d9-02da943ecaa1",
    "order_id": "642e5eb9-1691-4340-8c27-fb2ebe13bc40",
    "expires_at": "2026-10-29T07:20:26.753445Z",
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

`POST /api/driver/v1/offers/c40efaa3-b297-451a-b9d9-02da943ecaa1/accept` → **200**

```json
{
  "command_id": "8cd111d2-87b4-45a0-a9cd-026f8fe7505e"
}
```

```json
{
  "id": "bc71f6ba-dcea-4d10-831d-508ff5f5b91f",
  "order_id": "642e5eb9-1691-4340-8c27-fb2ebe13bc40",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "29499b55-226a-47f0-98f0-00561507ee4a",
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
  "command_id": "be781040-5d78-4acd-b051-8aaf4f6729b7",
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
  "changed_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T07:20:12.996299557Z"
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
  "id": "29499b55-226a-47f0-98f0-00561507ee4a",
  "order_id": "642e5eb9-1691-4340-8c27-fb2ebe13bc40",
  "assignment_id": "bc71f6ba-dcea-4d10-831d-508ff5f5b91f",
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

`POST /api/driver/v1/work-sessions/f3f4fa93-d764-4149-aafc-13c4dcd45fb1/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:20:13Z",
    "sequence": 1793258413913
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f3f4fa93-d764-4149-aafc-13c4dcd45fb1",
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
  "last_heartbeat_at": "2026-10-29T07:20:13.940002Z",
  "last_location_at": "2026-10-29T07:20:13.940002Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/29499b55-226a-47f0-98f0-00561507ee4a/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "aa5f0c0c-8f99-42ae-986c-0242b500a3c7",
  "expected_version": 0
}
```

```json
{
  "id": "29499b55-226a-47f0-98f0-00561507ee4a",
  "order_id": "642e5eb9-1691-4340-8c27-fb2ebe13bc40",
  "assignment_id": "bc71f6ba-dcea-4d10-831d-508ff5f5b91f",
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
  "arrived_at": "2026-10-29T07:20:14.245098Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/29499b55-226a-47f0-98f0-00561507ee4a/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "8c0ffc5a-f046-4809-bced-acaa18a18840",
  "expected_version": 1
}
```

```json
{
  "id": "29499b55-226a-47f0-98f0-00561507ee4a",
  "order_id": "642e5eb9-1691-4340-8c27-fb2ebe13bc40",
  "assignment_id": "bc71f6ba-dcea-4d10-831d-508ff5f5b91f",
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
  "arrived_at": "2026-10-29T07:20:14.245098Z",
  "started_at": "2026-10-29T07:20:14.540837Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/29499b55-226a-47f0-98f0-00561507ee4a/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "f903feed-641f-4f48-bc81-cd36d2f47c23",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:20:14Z",
  "cash_received": true
}
```

```json
{
  "id": "29499b55-226a-47f0-98f0-00561507ee4a",
  "order_id": "642e5eb9-1691-4340-8c27-fb2ebe13bc40",
  "assignment_id": "bc71f6ba-dcea-4d10-831d-508ff5f5b91f",
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
  "arrived_at": "2026-10-29T07:20:14.245098Z",
  "started_at": "2026-10-29T07:20:14.540837Z",
  "completed_at": "2026-10-29T07:20:14.859259Z",
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
  "session_id": "f3f4fa93-d764-4149-aafc-13c4dcd45fb1",
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
  "last_heartbeat_at": "2026-10-29T07:20:13.940002Z",
  "last_location_at": "2026-10-29T07:20:13.940002Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f3f4fa93-d764-4149-aafc-13c4dcd45fb1/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "d025d03b-b102-4ac9-9a48-08dcd01d2532",
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
  "command_id": "ae08d945-3a21-47a3-b9c5-b60edf737bf2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:20:15Z",
    "sequence": 1793258415757
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
  "correlation_id": "8ff6f6e6-dd54-4274-b0a0-e6c2f056766b",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "96b70047-256d-4e5b-9e24-6d67ac0de0bf",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:20:16Z",
    "sequence": 1793258416635
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1093b675-b9d3-452c-8e8d-7df513addca6",
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
  "last_heartbeat_at": "2026-10-29T07:20:16.086621Z",
  "last_location_at": "2026-10-29T07:20:16.086621Z",
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
  "changed_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T07:20:12.9963Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "1185ddd4-712e-4f8c-b947-d5d6e09f0865",
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
  "changed_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T07:20:16.685793497Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1093b675-b9d3-452c-8e8d-7df513addca6",
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
  "last_heartbeat_at": "2026-10-29T07:20:16.086621Z",
  "last_location_at": "2026-10-29T07:20:16.086621Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1093b675-b9d3-452c-8e8d-7df513addca6/close` → **200**

```json
{
  "command_id": "c282ba2e-e730-4484-812e-821a1660045f",
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
  "session_id": "c3850b9e-7f6c-431d-a843-dd6fb06881a7",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTkzMTcsImlhdCI6MTc5MzI1ODQxNywianRpIjoiNzcyNmE3YTItOGE2OS00MmM5LTg4NmUtNzI5YTFmOTYzZDc2Iiwic2lkIjoiYzM4NTBiOWUtN2Y2Yy00MzFkLWE4NDMtZGQ2ZmIwNjg4MWE3In0.eCzBqVShVnjTsGQ5HXZX4EXdRKKm3LWBhnfbcj8yo2s",
  "access_expires_at": "2026-10-29T07:35:17.879869642Z",
  "refresh_token": "gmzA52spMcelh8a4-o8K8HkHyGTnSHrDCzL4cuqDEpo",
  "refresh_expires_at": "2026-10-29T19:20:17.879033477Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "acca507d-1d51-414e-8239-d613963cb0a4",
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
  "id": "35bd6e42-1254-4965-9822-bc0fa60e6f6d",
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
  "created_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
  "created_at": "2026-10-29T07:20:18.181392Z",
  "updated_at": "2026-10-29T07:20:18.181392Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639493855",
  "device_ref": "sandbox-16443"
}
```

```json
{
  "challenge_id": "0e66d946-d752-4339-a6f4-50eea610f7a9",
  "expires_at": "2026-10-29T07:25:18.49579907Z",
  "resend_available_at": "2026-10-29T07:20:19.49579907Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639493855` → **200**

```json
{
  "phone": "+380639493855",
  "audience": "CLIENT",
  "code": "448100",
  "sent_at": "2026-10-29T07:20:18.4996044Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0e66d946-d752-4339-a6f4-50eea610f7a9",
  "code": "448100",
  "device_ref": "sandbox-16443"
}
```

```json
{
  "session_id": "59ce0995-5496-45fd-bf97-931b826ff886",
  "subject": {
    "type": "CLIENT",
    "id": "b6306c9c-403f-43df-9e40-5b4e9b6c0f07"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNjMwNmM5Yy00MDNmLTQzZGYtOWU0MC01YjRlOWI2YzBmMDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5MzE4LCJpYXQiOjE3OTMyNTg0MTgsImp0aSI6Ijg1ODk0NTI1LWQ0NDgtNGMyNi04MWRmLWU3YjNhZDNhNWRkZiIsInNpZCI6IjU5Y2UwOTk1LTU0OTYtNDVmZC1iZjk3LTkzMWI4MjZmZjg4NiJ9.xYpQQO_FiB3SFDCzskP2atbSYkiYTujuoLm4SkK2y2M",
  "access_expires_at": "2026-10-29T07:35:18.813570731Z",
  "refresh_token": "0ow8QOFw-5PcYmI7qL8BaoG4alqW_5T9Y4w7v0LAD9s",
  "refresh_expires_at": "2026-11-28T07:20:18.812672284Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380639493855` → **200**

```json
{
  "client_id": "b6306c9c-403f-43df-9e40-5b4e9b6c0f07"
}
```

`POST /api/admin/v1/rider-wallets/b6306c9c-403f-43df-9e40-5b4e9b6c0f07/top-ups` → **201**

```json
{
  "command_id": "562260ab-e6af-4d3e-9c7c-c0f40b4d0f22",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "b6306c9c-403f-43df-9e40-5b4e9b6c0f07",
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
      "id": "f83ea8e1-79bd-4094-bc82-a02ead1f5bb3",
      "at": "2026-10-29T07:20:19.39663Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1db72557-beda-4e86-9a35-7d2ffdeb7ea9",
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
  "id": "1a9fab21-188c-4494-b8f6-73fce6741ef4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:25:19.703340Z",
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
      "id": "35bd6e42-1254-4965-9822-bc0fa60e6f6d",
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
  "device_ref": "sandbox-26162"
}
```

```json
{
  "challenge_id": "fb0f2ae3-a642-473b-819f-8441c94a4eeb",
  "expires_at": "2026-10-29T07:25:19.991123431Z",
  "resend_available_at": "2026-10-29T07:20:20.991123431Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "007575",
  "sent_at": "2026-10-29T07:20:19.994446369Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fb0f2ae3-a642-473b-819f-8441c94a4eeb",
  "code": "007575",
  "device_ref": "sandbox-26162"
}
```

```json
{
  "session_id": "116bf360-1078-4887-9f79-54700cf07894",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI1OTMyMCwiaWF0IjoxNzkzMjU4NDIwLCJqdGkiOiIyYmI3OWU4Ni03MjkwLTQ4NmItYTlhZi1hNmMzZjM4NjJiYjQiLCJzaWQiOiIxMTZiZjM2MC0xMDc4LTQ4ODctOWY3OS01NDcwMGNmMDc4OTQifQ.KsTtc6oA8hcT4LiuebkoMSiDi6U_fbBb3nFo28s4uzE",
  "access_expires_at": "2026-10-29T07:35:20.300499692Z",
  "refresh_token": "5EuxHVW1DPHrkyo097DD7PaNecxrquhN1wlAvMU_tUs",
  "refresh_expires_at": "2026-11-28T07:20:20.299752049Z",
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
  "command_id": "80fa0223-f0cc-43ef-8935-7f481a4a7f56",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:20:20Z",
    "sequence": 1793258420864
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d75a9c22-8ca3-4952-9d5c-2700e3fe114d",
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
  "last_heartbeat_at": "2026-10-29T07:20:20.888067Z",
  "last_location_at": "2026-10-29T07:20:20.888067Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "5ea6426f-c156-45b1-aca8-53c33c06d541",
  "quote_id": "1a9fab21-188c-4494-b8f6-73fce6741ef4",
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
  "id": "b08c447b-f1b8-4dcb-9bfc-c41c7e33b8c2",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b6306c9c-403f-43df-9e40-5b4e9b6c0f07",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:20:21.192588Z",
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
  "client_id": "b6306c9c-403f-43df-9e40-5b4e9b6c0f07",
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
      "id": "f83ea8e1-79bd-4094-bc82-a02ead1f5bb3",
      "at": "2026-10-29T07:20:19.39663Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
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
    "id": "58623b18-bd59-4963-9f5d-32a970238171",
    "order_id": "b08c447b-f1b8-4dcb-9bfc-c41c7e33b8c2",
    "expires_at": "2026-10-29T07:20:36.201503Z",
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

`POST /api/driver/v1/offers/58623b18-bd59-4963-9f5d-32a970238171/accept` → **200**

```json
{
  "command_id": "61e8e050-3fe7-4d28-b0bf-9286aa14e9e4"
}
```

```json
{
  "id": "dff13f1b-9d73-4b28-97bd-0be681775824",
  "order_id": "b08c447b-f1b8-4dcb-9bfc-c41c7e33b8c2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7496a185-e952-477d-9b74-a8c356d48946",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7496a185-e952-477d-9b74-a8c356d48946",
  "order_id": "b08c447b-f1b8-4dcb-9bfc-c41c7e33b8c2",
  "assignment_id": "dff13f1b-9d73-4b28-97bd-0be681775824",
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

`POST /api/driver/v1/work-sessions/d75a9c22-8ca3-4952-9d5c-2700e3fe114d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:20:22Z",
    "sequence": 1793258422638
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d75a9c22-8ca3-4952-9d5c-2700e3fe114d",
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
  "last_heartbeat_at": "2026-10-29T07:20:22.660863Z",
  "last_location_at": "2026-10-29T07:20:22.660863Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7496a185-e952-477d-9b74-a8c356d48946/arrive` → **200**

```json
{
  "command_id": "4ef9c5f7-de3c-4fef-981a-a18b5ccb0f0f",
  "expected_version": 0
}
```

```json
{
  "id": "7496a185-e952-477d-9b74-a8c356d48946",
  "order_id": "b08c447b-f1b8-4dcb-9bfc-c41c7e33b8c2",
  "assignment_id": "dff13f1b-9d73-4b28-97bd-0be681775824",
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
  "arrived_at": "2026-10-29T07:20:22.955616Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7496a185-e952-477d-9b74-a8c356d48946/start` → **200**

```json
{
  "command_id": "af13ec39-ea6f-4717-a531-a86404b2b808",
  "expected_version": 1
}
```

```json
{
  "id": "7496a185-e952-477d-9b74-a8c356d48946",
  "order_id": "b08c447b-f1b8-4dcb-9bfc-c41c7e33b8c2",
  "assignment_id": "dff13f1b-9d73-4b28-97bd-0be681775824",
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
  "arrived_at": "2026-10-29T07:20:22.955616Z",
  "started_at": "2026-10-29T07:20:23.258094Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/7496a185-e952-477d-9b74-a8c356d48946/complete` → **200**

```json
{
  "command_id": "b19e065b-b8b5-456d-b686-3a52f5b3b1c3",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:20:23Z",
  "cash_received": true
}
```

```json
{
  "id": "7496a185-e952-477d-9b74-a8c356d48946",
  "order_id": "b08c447b-f1b8-4dcb-9bfc-c41c7e33b8c2",
  "assignment_id": "dff13f1b-9d73-4b28-97bd-0be681775824",
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
  "arrived_at": "2026-10-29T07:20:22.955616Z",
  "started_at": "2026-10-29T07:20:23.258094Z",
  "completed_at": "2026-10-29T07:20:23.607333Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "b6306c9c-403f-43df-9e40-5b4e9b6c0f07",
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
      "id": "14f65974-3966-42d4-83d5-60afe9a91c12",
      "at": "2026-10-29T07:20:24.354716Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "b08c447b-f1b8-4dcb-9bfc-c41c7e33b8c2"
    },
    {
      "id": "f83ea8e1-79bd-4094-bc82-a02ead1f5bb3",
      "at": "2026-10-29T07:20:19.39663Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/35bd6e42-1254-4965-9822-bc0fa60e6f6d/archive` → **200**

```json
{
  "command_id": "8b4dbddd-e815-4c2d-a769-4a715f937557",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "35bd6e42-1254-4965-9822-bc0fa60e6f6d",
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
  "created_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
  "created_at": "2026-10-29T07:20:18.181392Z",
  "updated_at": "2026-10-29T07:20:27.217432Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d75a9c22-8ca3-4952-9d5c-2700e3fe114d",
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
  "last_heartbeat_at": "2026-10-29T07:20:22.660863Z",
  "last_location_at": "2026-10-29T07:20:22.660863Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d75a9c22-8ca3-4952-9d5c-2700e3fe114d/close` → **200**

```json
{
  "command_id": "5237bd7f-8368-47aa-8278-fb2fc7ec1db7",
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

Done: order b08c447b-f1b8-4dcb-9bfc-c41c7e33b8c2.

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
  "session_id": "f44b5e54-a46b-4699-85a6-2e25bc526a4f",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTkzMjgsImlhdCI6MTc5MzI1ODQyOCwianRpIjoiOTUyYjM2YTktNDU2Yy00OTNiLWEyZDktM2QxMmY3MDBmNGUxIiwic2lkIjoiZjQ0YjVlNTQtYTQ2Yi00Njk5LTg1YTYtMmUyNWJjNTI2YTRmIn0.w66OwmMV6jHb1t5xVR4GWInvQhjPI-ts5sdE-CMfZzI",
  "access_expires_at": "2026-10-29T07:35:28.38828271Z",
  "refresh_token": "OMwsVNVNaMNotyp1HZp5MHIOLFfeKYeX5Ec5YkFCN-A",
  "refresh_expires_at": "2026-10-29T19:20:28.387591888Z",
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
  "command_id": "0926e885-07b2-412c-a88e-5ee7bc85b28d",
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
  "session_id": "d50196df-65ba-43f0-a094-ab7d85883a81",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTkzMjksImlhdCI6MTc5MzI1ODQyOSwianRpIjoiNjFiZTVkMjUtNDdhMy00MDRjLThkZmItYzMxY2M3N2UzZjk5Iiwic2lkIjoiZDUwMTk2ZGYtNjViYS00M2YwLWEwOTQtYWI3ZDg1ODgzYTgxIn0.kNAvQvQ9e0WlJoYxeMonigETJ3d2HgR2qPUaq9W-bzU",
  "access_expires_at": "2026-10-29T07:35:29.54473989Z",
  "refresh_token": "5lxuLu09YQMdxvXsBC9mtw5kQYBClosAVZy7qoB0MIY",
  "refresh_expires_at": "2026-10-29T19:20:29.5439477Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.162822514",
    "linkedid": "1730052700.162822514",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673730926"
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
    "id": "1730052700.162822514",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "b2c0910a-e82d-470e-aeb8-ea2abc718f3c",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380673730926",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T07:20:29.825378Z",
      "answered_at": null,
      "ended_at": "2026-10-29T07:20:29.851694Z",
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
    "id": "1730052600.1018421706",
    "linkedid": "1730052600.1018421706",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673730926"
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
      "id": "6774856b-2e61-4871-95af-e02aef9bcf1a",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673730926",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T07:20:30.166692Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/6774856b-2e61-4871-95af-e02aef9bcf1a/answer` → **200**

```json
{
  "command_id": "bb62732f-159a-467c-b40a-839a3d8960c2"
}
```

```json
{
  "id": "6774856b-2e61-4871-95af-e02aef9bcf1a",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673730926",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
  "order_ids": [],
  "started_at": "2026-10-29T07:20:30.166692Z",
  "answered_at": "2026-10-29T07:20:30.484774Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1018421706",
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
    "id": "1730052600.1018421706",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "6774856b-2e61-4871-95af-e02aef9bcf1a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673730926",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
      "order_ids": [],
      "started_at": "2026-10-29T07:20:30.166692Z",
      "answered_at": "2026-10-29T07:20:30.484774Z",
      "ended_at": "2026-10-29T07:20:30.789328Z",
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
      "id": "6774856b-2e61-4871-95af-e02aef9bcf1a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673730926",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
      "order_ids": [],
      "started_at": "2026-10-29T07:20:30.166692Z",
      "answered_at": "2026-10-29T07:20:30.484774Z",
      "ended_at": "2026-10-29T07:20:30.789328Z",
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
      "id": "6774856b-2e61-4871-95af-e02aef9bcf1a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673730926",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
      "order_ids": [],
      "started_at": "2026-10-29T07:20:30.166692Z",
      "answered_at": "2026-10-29T07:20:30.484774Z",
      "ended_at": "2026-10-29T07:20:30.789328Z",
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
      "id": "6774856b-2e61-4871-95af-e02aef9bcf1a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673730926",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
      "order_ids": [],
      "started_at": "2026-10-29T07:20:30.166692Z",
      "answered_at": "2026-10-29T07:20:30.484774Z",
      "ended_at": "2026-10-29T07:20:30.789328Z",
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
      "id": "6774856b-2e61-4871-95af-e02aef9bcf1a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673730926",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
      "order_ids": [],
      "started_at": "2026-10-29T07:20:30.166692Z",
      "answered_at": "2026-10-29T07:20:30.484774Z",
      "ended_at": "2026-10-29T07:20:30.789328Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T07:20:38.015489Z"
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
      "id": "6774856b-2e61-4871-95af-e02aef9bcf1a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673730926",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
      "order_ids": [],
      "started_at": "2026-10-29T07:20:30.166692Z",
      "answered_at": "2026-10-29T07:20:30.484774Z",
      "ended_at": "2026-10-29T07:20:30.789328Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T07:20:38.015489Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/6774856b-2e61-4871-95af-e02aef9bcf1a/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/6774856b-2e61-4871-95af-e02aef9bcf1a/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=6774856b-2e61-4871-95af-e02aef9bcf1a` → **200**

```json
{
  "changes": [
    {
      "id": "4003b401-e22c-4ea4-a16f-3552b3ca0033",
      "occurred_at": "2026-10-29T07:20:40.597551Z",
      "actor_type": "STAFF",
      "actor_id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "6774856b-2e61-4871-95af-e02aef9bcf1a",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"b7299ef8-c513-4bee-9d2c-3808a55457bf\", \"order_ids\": []}",
      "correlation_id": "06072147-5219-4886-9766-d64e3ee5f0b9"
    },
    {
      "id": "9e507b56-27ed-47bd-a034-6e7f94c183b1",
      "occurred_at": "2026-10-29T07:20:40.564696Z",
      "actor_type": "STAFF",
      "actor_id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "6774856b-2e61-4871-95af-e02aef9bcf1a",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"b7299ef8-c513-4bee-9d2c-3808a55457bf\", \"order_ids\": []}",
      "correlation_id": "98d74c75-ad03-4ef6-93cc-baab592d5ea7"
    }
  ]
}
```

Done: call 6774856b-2e61-4871-95af-e02aef9bcf1a recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-8454"
}
```

```json
{
  "challenge_id": "3d35fefb-c70e-459a-97df-d5cd9f6432e1",
  "expires_at": "2026-10-29T07:25:40.931816701Z",
  "resend_available_at": "2026-10-29T07:20:41.931816701Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "733575",
  "sent_at": "2026-10-29T07:20:40.935714274Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3d35fefb-c70e-459a-97df-d5cd9f6432e1",
  "code": "733575",
  "device_ref": "sandbox-8454"
}
```

```json
{
  "session_id": "3cd1327e-470e-4c26-a464-df8974c24ef5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI1OTM0MSwiaWF0IjoxNzkzMjU4NDQxLCJqdGkiOiJjYjgwY2RjMi05OThhLTQ2ODItYjA0NC1iYjRiZDYxNGFjZWEiLCJzaWQiOiIzY2QxMzI3ZS00NzBlLTRjMjYtYTQ2NC1kZjg5NzRjMjRlZjUifQ.LqoaaS-InzxSsKmCSsmjXMa_9snGWISX6xByhmVuUzQ",
  "access_expires_at": "2026-10-29T07:35:41.238857899Z",
  "refresh_token": "UNAvcjN7V4uZQ70eBFJNEtaVnIp5k0khoGn0IbbgNiY",
  "refresh_expires_at": "2026-11-28T07:20:41.238229362Z",
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
  "command_id": "ef15c534-037f-42bc-a56a-f40cce226c23",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:20:41Z",
    "sequence": 1793258441789
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8d25368f-142b-4f9d-92ae-9c69d68247bf",
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
  "last_heartbeat_at": "2026-10-29T07:20:41.811935Z",
  "last_location_at": "2026-10-29T07:20:41.811935Z",
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
  "session_id": "b02105c8-b546-492d-8312-ccddd924eebd",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTkzNDIsImlhdCI6MTc5MzI1ODQ0MiwianRpIjoiZjk1OTZkY2UtZjNiNi00YmU5LTk2ZmUtZTQxODlmNTkyNWYyIiwic2lkIjoiYjAyMTA1YzgtYjU0Ni00OTJkLTgzMTItY2NkZGQ5MjRlZWJkIn0.5jPDNSKlaszcTsAxchDPUL66CKoFevwX9OXnPPPuAGY",
  "access_expires_at": "2026-10-29T07:35:42.403163723Z",
  "refresh_token": "M7JNkdkv6ZKdHEyY4_DN1TtLRx8-mOEbXndDuzO22h4",
  "refresh_expires_at": "2026-10-29T19:20:42.402486066Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c206b521-39e5-47f1-9048-ae0d15d26894",
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
  "id": "c4cab0a0-d344-4bd3-a132-e4f4f099cad1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:25:42.711570Z",
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
  "command_id": "e2be1e2c-0cfa-48fe-a275-64878029a2c0",
  "quote_id": "c4cab0a0-d344-4bd3-a132-e4f4f099cad1",
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
    "phone": "+380671927945"
  }
}
```

```json
{
  "id": "64e33138-bff1-4cdd-a6e6-fd499e7cdf21",
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
  "created_at": "2026-10-29T07:20:43.037401Z",
  "caller": {
    "name": "Олена",
    "phone": "+380671927945"
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
    "id": "5d0f170d-041d-4f0c-9941-fa85da0e6af8",
    "order_id": "64e33138-bff1-4cdd-a6e6-fd499e7cdf21",
    "expires_at": "2026-10-29T07:20:58.04466Z",
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

`POST /api/driver/v1/offers/5d0f170d-041d-4f0c-9941-fa85da0e6af8/accept` → **200**

```json
{
  "command_id": "070073ac-fc1f-4684-aba1-8fbe34963bbe"
}
```

```json
{
  "id": "095b9689-4948-4d1f-adf6-c03a869fa350",
  "order_id": "64e33138-bff1-4cdd-a6e6-fd499e7cdf21",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4e90f4ba-a363-401d-ace8-7c1f81973f10",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380671927945` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380671927945` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380671927945` → **200**

```json
[
  {
    "phone": "+380671927945",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:20:45.221770389Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671927945` → **200**

```json
[
  {
    "phone": "+380671927945",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:20:45.221770389Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380671927945` → **200**

```json
[
  {
    "phone": "+380671927945",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:20:45.221770389Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4e90f4ba-a363-401d-ace8-7c1f81973f10",
  "order_id": "64e33138-bff1-4cdd-a6e6-fd499e7cdf21",
  "assignment_id": "095b9689-4948-4d1f-adf6-c03a869fa350",
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
    "phone": "+380671927945"
  }
}
```

`POST /api/driver/v1/work-sessions/8d25368f-142b-4f9d-92ae-9c69d68247bf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:20:46Z",
    "sequence": 1793258446364
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8d25368f-142b-4f9d-92ae-9c69d68247bf",
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
  "last_heartbeat_at": "2026-10-29T07:20:46.38485Z",
  "last_location_at": "2026-10-29T07:20:46.38485Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4e90f4ba-a363-401d-ace8-7c1f81973f10/arrive` → **200**

```json
{
  "command_id": "d417c0a4-8d12-4618-8adc-fec3611c3a39",
  "expected_version": 0
}
```

```json
{
  "id": "4e90f4ba-a363-401d-ace8-7c1f81973f10",
  "order_id": "64e33138-bff1-4cdd-a6e6-fd499e7cdf21",
  "assignment_id": "095b9689-4948-4d1f-adf6-c03a869fa350",
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
  "arrived_at": "2026-10-29T07:20:46.676292Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671927945"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380671927945` → **200**

```json
[
  {
    "phone": "+380671927945",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:20:45.221770389Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671927945` → **200**

```json
[
  {
    "phone": "+380671927945",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:20:45.221770389Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671927945` → **200**

```json
[
  {
    "phone": "+380671927945",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:20:45.221770389Z"
  },
  {
    "phone": "+380671927945",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T07:20:48.233048804Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671927945` → **200**

```json
[
  {
    "phone": "+380671927945",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:20:45.221770389Z"
  },
  {
    "phone": "+380671927945",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T07:20:48.233048804Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380671927945` → **200**

```json
[
  {
    "phone": "+380671927945",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:20:45.221770389Z"
  },
  {
    "phone": "+380671927945",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T07:20:48.233048804Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/4e90f4ba-a363-401d-ace8-7c1f81973f10/start` → **200**

```json
{
  "command_id": "c5e3a4c5-7843-4d8f-bc90-a0d1c95bea0a",
  "expected_version": 1
}
```

```json
{
  "id": "4e90f4ba-a363-401d-ace8-7c1f81973f10",
  "order_id": "64e33138-bff1-4cdd-a6e6-fd499e7cdf21",
  "assignment_id": "095b9689-4948-4d1f-adf6-c03a869fa350",
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
  "arrived_at": "2026-10-29T07:20:46.676292Z",
  "started_at": "2026-10-29T07:20:49.111221Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671927945"
  }
}
```

`POST /api/driver/v1/trips/4e90f4ba-a363-401d-ace8-7c1f81973f10/complete` → **200**

```json
{
  "command_id": "d369bce8-91ba-41bc-b533-5c6fec0d5908",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:20:49Z",
  "cash_received": true
}
```

```json
{
  "id": "4e90f4ba-a363-401d-ace8-7c1f81973f10",
  "order_id": "64e33138-bff1-4cdd-a6e6-fd499e7cdf21",
  "assignment_id": "095b9689-4948-4d1f-adf6-c03a869fa350",
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
  "arrived_at": "2026-10-29T07:20:46.676292Z",
  "started_at": "2026-10-29T07:20:49.111221Z",
  "completed_at": "2026-10-29T07:20:49.419044Z",
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
  "session_id": "8d25368f-142b-4f9d-92ae-9c69d68247bf",
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
  "last_heartbeat_at": "2026-10-29T07:20:46.38485Z",
  "last_location_at": "2026-10-29T07:20:46.38485Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8d25368f-142b-4f9d-92ae-9c69d68247bf/close` → **200**

```json
{
  "command_id": "574d53ce-479e-4386-ab3e-ad0a4bc71288",
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
  "phone": "+380636089998",
  "device_ref": "sandbox-14197"
}
```

```json
{
  "challenge_id": "5a214373-4ae8-40e9-b85c-75b9ffe27e50",
  "expires_at": "2026-10-29T07:25:50.305724807Z",
  "resend_available_at": "2026-10-29T07:20:51.305724807Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636089998` → **200**

```json
{
  "phone": "+380636089998",
  "audience": "CLIENT",
  "code": "638600",
  "sent_at": "2026-10-29T07:20:50.30924589Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5a214373-4ae8-40e9-b85c-75b9ffe27e50",
  "code": "638600",
  "device_ref": "sandbox-14197"
}
```

```json
{
  "session_id": "433e8f89-eca7-455c-94ef-cf1aeefafa34",
  "subject": {
    "type": "CLIENT",
    "id": "3f13ed1b-ca12-4c5f-beab-19a7ef4cd604"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZjEzZWQxYi1jYTEyLTRjNWYtYmVhYi0xOWE3ZWY0Y2Q2MDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5MzUwLCJpYXQiOjE3OTMyNTg0NTAsImp0aSI6ImE0ODZlYmUzLTg5NjgtNGJmZC1iNjgwLTJjYmIxZGUzOGZkZSIsInNpZCI6IjQzM2U4Zjg5LWVjYTctNDU1Yy05NGVmLWNmMWFlZWZhZmEzNCJ9.PCVNFuqVGn4FxlLXGeCgfBQnwb8TcmSospAlypcFck4",
  "access_expires_at": "2026-10-29T07:35:50.626676406Z",
  "refresh_token": "vkQMpgTMkzwj6Z0z0yECa5vTpa6gVNk3I89bw0y8Llc",
  "refresh_expires_at": "2026-11-28T07:20:50.625927371Z",
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
  "device_ref": "sandbox-6026"
}
```

```json
{
  "challenge_id": "f34fc994-02a6-43c4-b613-a7e890e19b9a",
  "expires_at": "2026-10-29T07:25:51.194223133Z",
  "resend_available_at": "2026-10-29T07:20:52.194223133Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "209134",
  "sent_at": "2026-10-29T07:20:51.19701784Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f34fc994-02a6-43c4-b613-a7e890e19b9a",
  "code": "209134",
  "device_ref": "sandbox-6026"
}
```

```json
{
  "session_id": "be66b34d-807d-4d7b-a2bd-3a1ab93cff46",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI1OTM1MSwiaWF0IjoxNzkzMjU4NDUxLCJqdGkiOiI1ZTBjYTgzOC02MjYwLTQ0MjEtOTJkOS1hYTRkNTI3MWI4ZTUiLCJzaWQiOiJiZTY2YjM0ZC04MDdkLTRkN2ItYTJiZC0zYTFhYjkzY2ZmNDYifQ.IYCdb5F8VkiiPrgZpbzqUt2YNn3Hru-JlnSbZzAvy3k",
  "access_expires_at": "2026-10-29T07:35:51.499369547Z",
  "refresh_token": "KF-xoP_2-hyOYrYG98n5IBue8H-KPrTsUaP_7b2L7vI",
  "refresh_expires_at": "2026-11-28T07:20:51.498742703Z",
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
  "session_id": "aa69e890-78ea-4fad-804a-d84e05981304",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTkzNTIsImlhdCI6MTc5MzI1ODQ1MiwianRpIjoiODZjODkxYmUtNjc0OC00MmUyLWFmYjUtNDk1MDNlMjcyYTAzIiwic2lkIjoiYWE2OWU4OTAtNzhlYS00ZmFkLTgwNGEtZDg0ZTA1OTgxMzA0In0.BjmBreekU-ScSm9PGXNBnP9keeSsyqFLa1veW6gg44I",
  "access_expires_at": "2026-10-29T07:35:52.332369741Z",
  "refresh_token": "qZ3Bnr97ey4fW_JR1ikq0e7b4-l39DoeDvCuyqv8qTg",
  "refresh_expires_at": "2026-10-29T19:20:52.331753377Z",
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
  "session_id": "0318a328-d9fe-44df-96af-f3b405da5657",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTkzNTIsImlhdCI6MTc5MzI1ODQ1MiwianRpIjoiOWFkOTZmMmUtNjczZS00OWUyLWI3YzgtMzU2OGIxNjMyNjUxIiwic2lkIjoiMDMxOGEzMjgtZDlmZS00NGRmLTk2YWYtZjNiNDA1ZGE1NjU3In0.F14AbCf_-AYegWzS26-DuAMOdD5-Qiw14nENO6WeksM",
  "access_expires_at": "2026-10-29T07:35:52.898490389Z",
  "refresh_token": "5zw6czRd-0pD0iYzjsU4MdHZGILM3dKbLpvG39x4ZfA",
  "refresh_expires_at": "2026-10-29T19:20:52.897703298Z",
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
  "command_id": "8a7f1951-5be6-4717-b148-b92289ca52c1",
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
  "id": "58e7a271-e005-4527-b35e-ab84a6bc4576",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:25:53.459433Z",
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
  "command_id": "c0a53b6c-44ee-42aa-b6e4-7550b943a706",
  "quote_id": "58e7a271-e005-4527-b35e-ab84a6bc4576",
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
  "id": "90854826-e5f4-41b2-9f33-7d18d9fd6fe9",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f13ed1b-ca12-4c5f-beab-19a7ef4cd604",
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
  "created_at": "2026-10-29T07:20:53.765895Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/90854826-e5f4-41b2-9f33-7d18d9fd6fe9` → **200**

```json
{
  "id": "90854826-e5f4-41b2-9f33-7d18d9fd6fe9",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f13ed1b-ca12-4c5f-beab-19a7ef4cd604",
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
  "created_at": "2026-10-29T07:20:53.765895Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/90854826-e5f4-41b2-9f33-7d18d9fd6fe9/cancel` → **200**

```json
{
  "command_id": "1aaeaf44-e1f8-44d3-b578-238b56b7e162",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "90854826-e5f4-41b2-9f33-7d18d9fd6fe9",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3f13ed1b-ca12-4c5f-beab-19a7ef4cd604",
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
  "created_at": "2026-10-29T07:20:53.765895Z",
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
  "command_id": "defd54f9-471b-4d6c-bda9-d5dd5d059a52",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:20:54Z",
    "sequence": 1793258454982
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "19efbadd-bcb9-432a-b0dc-8a595a57b2aa",
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
  "last_heartbeat_at": "2026-10-29T07:20:55.002795Z",
  "last_location_at": "2026-10-29T07:20:55.002795Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-23998"
}
```

```json
{
  "challenge_id": "f8f072da-5f2e-4817-816e-ec619f4e8a4f",
  "expires_at": "2026-10-29T07:25:55.280327272Z",
  "resend_available_at": "2026-10-29T07:20:56.280327272Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "689348",
  "sent_at": "2026-10-29T07:20:55.28331355Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f8f072da-5f2e-4817-816e-ec619f4e8a4f",
  "code": "689348",
  "device_ref": "sandbox-23998"
}
```

```json
{
  "session_id": "16c8027f-6fae-4717-8d95-e384785ff605",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI1OTM1NSwiaWF0IjoxNzkzMjU4NDU1LCJqdGkiOiIwZTk1YjEwYi0yYjc0LTQ4ZjEtOGY1Ni03MWIwOTFkMjY3YjMiLCJzaWQiOiIxNmM4MDI3Zi02ZmFlLTQ3MTctOGQ5NS1lMzg0Nzg1ZmY2MDUifQ.rh_SvdLjtB4HhdykrTYaMW48i-0tOnbBjpdFBTFsDuk",
  "access_expires_at": "2026-10-29T07:35:55.586838909Z",
  "refresh_token": "Qir93I-AK-s66tj5felHpltlvDQKuL9VNd3mdzizizE",
  "refresh_expires_at": "2026-11-28T07:20:55.586200591Z",
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
  "command_id": "d8e5cd28-4c25-4992-bb2a-043ae744dc0e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:20:56Z",
    "sequence": 1793258456140
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2516dbb6-510f-4541-be40-c665bc2bebed",
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
  "last_heartbeat_at": "2026-10-29T07:20:56.160379Z",
  "last_location_at": "2026-10-29T07:20:56.160379Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e5cecd6e-c9e2-4051-9394-7b34d0d04ae1",
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
  "id": "575d8699-8ba6-4190-8adc-a8214271ec5d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:25:56.449093Z",
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
  "command_id": "beb347ab-02f1-48f1-8078-2aa84ab9e325",
  "quote_id": "575d8699-8ba6-4190-8adc-a8214271ec5d",
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
  "id": "d7397d2d-3958-43e0-8b33-d3dac6779a84",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f13ed1b-ca12-4c5f-beab-19a7ef4cd604",
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
  "created_at": "2026-10-29T07:20:56.743643Z",
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
    "id": "18776b88-7b41-4383-90eb-e0fa88509845",
    "order_id": "d7397d2d-3958-43e0-8b33-d3dac6779a84",
    "expires_at": "2026-10-29T07:21:11.747728Z",
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

`POST /api/driver/v1/offers/18776b88-7b41-4383-90eb-e0fa88509845/accept` → **200**

```json
{
  "command_id": "1ff44de5-b467-476f-8b4c-3209240929ae"
}
```

```json
{
  "id": "f1c91a01-d310-41f8-9a33-3b0e2287d869",
  "order_id": "d7397d2d-3958-43e0-8b33-d3dac6779a84",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1fed23f2-dbff-48b0-812f-cd59a74d0d66",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1fed23f2-dbff-48b0-812f-cd59a74d0d66",
  "order_id": "d7397d2d-3958-43e0-8b33-d3dac6779a84",
  "assignment_id": "f1c91a01-d310-41f8-9a33-3b0e2287d869",
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

`POST /api/driver/v1/trips/1fed23f2-dbff-48b0-812f-cd59a74d0d66/cancel` → **200**

```json
{
  "command_id": "48f7629d-1d91-44d5-b9e0-e1fdcdfde1ab",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "1fed23f2-dbff-48b0-812f-cd59a74d0d66",
  "order_id": "d7397d2d-3958-43e0-8b33-d3dac6779a84",
  "assignment_id": "f1c91a01-d310-41f8-9a33-3b0e2287d869",
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

`GET /api/rider/v1/orders/d7397d2d-3958-43e0-8b33-d3dac6779a84` → **200**

```json
{
  "id": "d7397d2d-3958-43e0-8b33-d3dac6779a84",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "3f13ed1b-ca12-4c5f-beab-19a7ef4cd604",
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
    "id": "f1c91a01-d310-41f8-9a33-3b0e2287d869",
    "order_id": "d7397d2d-3958-43e0-8b33-d3dac6779a84",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "1fed23f2-dbff-48b0-812f-cd59a74d0d66",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T07:20:56.743643Z",
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
    "id": "e0f76d87-56c5-4021-91ec-ef219efc3795",
    "order_id": "d7397d2d-3958-43e0-8b33-d3dac6779a84",
    "expires_at": "2026-10-29T07:21:12.89899Z",
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

`POST /api/driver/v1/offers/e0f76d87-56c5-4021-91ec-ef219efc3795/accept` → **200**

```json
{
  "command_id": "5669d4a8-08ec-4d73-b3e0-82f3be4dcc82"
}
```

```json
{
  "id": "511e2b04-a43c-460c-88f9-ad725325e509",
  "order_id": "d7397d2d-3958-43e0-8b33-d3dac6779a84",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5627810d-802c-404b-abc7-8a40bf3a3675",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5627810d-802c-404b-abc7-8a40bf3a3675",
  "order_id": "d7397d2d-3958-43e0-8b33-d3dac6779a84",
  "assignment_id": "511e2b04-a43c-460c-88f9-ad725325e509",
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

`POST /api/driver/v1/trips/5627810d-802c-404b-abc7-8a40bf3a3675/cancel` → **200**

```json
{
  "command_id": "32fa47f7-3540-44c1-9a7c-638fff9caf8f",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "5627810d-802c-404b-abc7-8a40bf3a3675",
  "order_id": "d7397d2d-3958-43e0-8b33-d3dac6779a84",
  "assignment_id": "511e2b04-a43c-460c-88f9-ad725325e509",
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
    "id": "d7397d2d-3958-43e0-8b33-d3dac6779a84",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T07:20:56.743643Z",
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
    "id": "90854826-e5f4-41b2-9f33-7d18d9fd6fe9",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T07:20:53.765895Z",
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

`GET /api/operator/v1/orders/d7397d2d-3958-43e0-8b33-d3dac6779a84/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T07:20:56.744351Z",
      "actor": {
        "type": "CLIENT",
        "id": "3f13ed1b-ca12-4c5f-beab-19a7ef4cd604",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d7397d2d-3958-43e0-8b33-d3dac6779a84",
        "quote_id": "575d8699-8ba6-4190-8adc-a8214271ec5d",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "01fb5733-29da-4354-8006-e2cb10746e1e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T07:20:56.746719Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d7397d2d-3958-43e0-8b33-d3dac6779a84",
        "attempt_id": "9659e4fd-b4b0-464a-850b-578461402a2f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "01fb5733-29da-4354-8006-e2cb10746e1e"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T07:20:56.75414Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "18776b88-7b41-4383-90eb-e0fa88509845",
        "order_id": "d7397d2d-3958-43e0-8b33-d3dac6779a84",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "01fb5733-29da-4354-8006-e2cb10746e1e"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T07:20:57.323376Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "18776b88-7b41-4383-90eb-e0fa88509845",
        "order_id": "d7397d2d-3958-43e0-8b33-d3dac6779a84",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "f1c91a01-d310-41f8-9a33-3b0e2287d869"
      },
      "correlation_id": "9a956ce3-76c4-4d83-ba16-b6119de1e445"
```

Done: orders 90854826-e5f4-41b2-9f33-7d18d9fd6fe9, d7397d2d-3958-43e0-8b33-d3dac6779a84.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732297328",
  "device_ref": "sandbox-31647"
}
```

```json
{
  "challenge_id": "fff92da4-1bdd-4dfd-97c3-c89f16701156",
  "expires_at": "2026-10-29T07:26:00.249136746Z",
  "resend_available_at": "2026-10-29T07:21:01.249136746Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732297328` → **200**

```json
{
  "phone": "+380732297328",
  "audience": "CLIENT",
  "code": "902226",
  "sent_at": "2026-10-29T07:21:00.252055298Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fff92da4-1bdd-4dfd-97c3-c89f16701156",
  "code": "902226",
  "device_ref": "sandbox-31647"
}
```

```json
{
  "session_id": "771d3588-3003-4b2b-aa86-216927c6fa9e",
  "subject": {
    "type": "CLIENT",
    "id": "6b56e75d-75f8-4b5a-a7a7-ace95568e7ba"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YjU2ZTc1ZC03NWY4LTRiNWEtYTdhNy1hY2U5NTU2OGU3YmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5MzYwLCJpYXQiOjE3OTMyNTg0NjAsImp0aSI6IjE5Yjc4Y2U1LWFkZjYtNGExOS04N2MxLTA2MzAzNTU0YWQwMCIsInNpZCI6Ijc3MWQzNTg4LTMwMDMtNGIyYi1hYTg2LTIxNjkyN2M2ZmE5ZSJ9.rM2PV65cQ-5A1DjuVLyPHbdRL7JKJak_n7L1uRAJGbo",
  "access_expires_at": "2026-10-29T07:36:00.551872801Z",
  "refresh_token": "-krYjPjNz_rO8HzwXV1efGtHJtZqwDcI65VfqgyzCVc",
  "refresh_expires_at": "2026-11-28T07:21:00.551265654Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "29fb366e-6a21-4858-956d-a1e2e02ef80e",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "566e96c7-2f4f-489a-99eb-2709351bb599",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-566e96c7-2f4f-489a-99eb-2709351bb599",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "e7cdf395cd51304a356b1756aecb02be",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=566e96c7-2f4f-489a-99eb-2709351bb599",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732297328"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=566e96c7-2f4f-489a-99eb-2709351bb599",
  "expires_at": "2026-10-29T07:51:00.830549Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/566e96c7-2f4f-489a-99eb-2709351bb599` → **200**

```json
{
  "id": "566e96c7-2f4f-489a-99eb-2709351bb599",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T07:51:00.830549Z",
  "card": {
    "id": "7ab9fd2a-e4b6-47c1-bf4b-b47c33fe55d7",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1147",
    "card_type": "Visa",
    "created_at": "2026-10-29T07:21:01.122111Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "7ab9fd2a-e4b6-47c1-bf4b-b47c33fe55d7",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****1147",
      "card_type": "Visa",
      "created_at": "2026-10-29T07:21:01.122111Z"
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
  "device_ref": "sandbox-6692"
}
```

```json
{
  "challenge_id": "92d591f4-723d-4753-a44a-27474d00c7bb",
  "expires_at": "2026-10-29T07:26:01.706322481Z",
  "resend_available_at": "2026-10-29T07:21:02.706322481Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "256020",
  "sent_at": "2026-10-29T07:21:01.709445407Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "92d591f4-723d-4753-a44a-27474d00c7bb",
  "code": "256020",
  "device_ref": "sandbox-6692"
}
```

```json
{
  "session_id": "655746e7-08da-421c-986f-c343b0e01e5e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI1OTM2MiwiaWF0IjoxNzkzMjU4NDYyLCJqdGkiOiIzMjc2YTRiOC0xY2Y0LTQzMWQtYjgwOC1mNTU4NTk3ZTFhNTEiLCJzaWQiOiI2NTU3NDZlNy0wOGRhLTQyMWMtOTg2Zi1jMzQzYjBlMDFlNWUifQ.RSv32qDP8vCwt-E7ItwB3-eqymSzRhA-1aicJO6Stig",
  "access_expires_at": "2026-10-29T07:36:02.023670938Z",
  "refresh_token": "jwhmSBmjDUeL_FZHWlnYDe4uMw2cBYb3p7UEBKa_fN4",
  "refresh_expires_at": "2026-11-28T07:21:02.02311721Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2516dbb6-510f-4541-be40-c665bc2bebed",
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
  "last_heartbeat_at": "2026-10-29T07:20:56.160379Z",
  "last_location_at": "2026-10-29T07:20:56.160379Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2516dbb6-510f-4541-be40-c665bc2bebed/handover` → **200**

```json
{
  "command_id": "e8a79db5-67c5-40e4-929a-93e852429940",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2516dbb6-510f-4541-be40-c665bc2bebed",
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
  "last_heartbeat_at": "2026-10-29T07:20:56.160379Z",
  "last_location_at": "2026-10-29T07:20:56.160379Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2516dbb6-510f-4541-be40-c665bc2bebed/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:21:02Z",
    "sequence": 1793258462868
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2516dbb6-510f-4541-be40-c665bc2bebed",
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
  "last_heartbeat_at": "2026-10-29T07:21:02.887907Z",
  "last_location_at": "2026-10-29T07:21:02.887907Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a0cf917a-6056-4237-ba4d-0a68e47db020",
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
  "id": "5cd91de0-ef65-46bd-aaa7-41f0541f1bf5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:26:03.183951Z",
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
  "command_id": "8ecd5b33-f3f4-410b-967e-7db53d42dbab",
  "quote_id": "5cd91de0-ef65-46bd-aaa7-41f0541f1bf5",
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
  "id": "b7c44b1a-cc23-4bc3-bc4e-33efe65491d5",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "6b56e75d-75f8-4b5a-a7a7-ace95568e7ba",
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
  "created_at": "2026-10-29T07:21:03.488605Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b7c44b1a-cc23-4bc3-bc4e-33efe65491d5` → **200**

```json
{
  "id": "b7c44b1a-cc23-4bc3-bc4e-33efe65491d5",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6b56e75d-75f8-4b5a-a7a7-ace95568e7ba",
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
  "created_at": "2026-10-29T07:21:03.488605Z",
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
    "id": "114281e2-43a6-4611-be26-50009e4899ec",
    "order_id": "b7c44b1a-cc23-4bc3-bc4e-33efe65491d5",
    "expires_at": "2026-10-29T07:21:18.570601Z",
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

`POST /api/driver/v1/offers/114281e2-43a6-4611-be26-50009e4899ec/accept` → **200**

```json
{
  "command_id": "e3185642-63b8-4514-abed-53d49808159a"
}
```

```json
{
  "id": "35dacd57-8b7e-49ac-89e4-46368b285980",
  "order_id": "b7c44b1a-cc23-4bc3-bc4e-33efe65491d5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8cd02e26-4521-49d4-9708-49f3046cfb2b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8cd02e26-4521-49d4-9708-49f3046cfb2b",
  "order_id": "b7c44b1a-cc23-4bc3-bc4e-33efe65491d5",
  "assignment_id": "35dacd57-8b7e-49ac-89e4-46368b285980",
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

`POST /api/driver/v1/work-sessions/2516dbb6-510f-4541-be40-c665bc2bebed/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:21:04Z",
    "sequence": 1793258464936
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2516dbb6-510f-4541-be40-c665bc2bebed",
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
  "last_heartbeat_at": "2026-10-29T07:21:04.957689Z",
  "last_location_at": "2026-10-29T07:21:04.957689Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8cd02e26-4521-49d4-9708-49f3046cfb2b/arrive` → **200**

```json
{
  "command_id": "63589184-baa8-48c5-9dae-0fb89731d2d1",
  "expected_version": 0
}
```

```json
{
  "id": "8cd02e26-4521-49d4-9708-49f3046cfb2b",
  "order_id": "b7c44b1a-cc23-4bc3-bc4e-33efe65491d5",
  "assignment_id": "35dacd57-8b7e-49ac-89e4-46368b285980",
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
  "arrived_at": "2026-10-29T07:21:05.248178Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8cd02e26-4521-49d4-9708-49f3046cfb2b/start` → **200**

```json
{
  "command_id": "7d300dcc-4924-4ff1-93de-0a7124d26c95",
  "expected_version": 1
}
```

```json
{
  "id": "8cd02e26-4521-49d4-9708-49f3046cfb2b",
  "order_id": "b7c44b1a-cc23-4bc3-bc4e-33efe65491d5",
  "assignment_id": "35dacd57-8b7e-49ac-89e4-46368b285980",
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
  "arrived_at": "2026-10-29T07:21:05.248178Z",
  "started_at": "2026-10-29T07:21:05.542825Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8cd02e26-4521-49d4-9708-49f3046cfb2b/complete` → **200**

```json
{
  "command_id": "4d3edf8e-8157-4fee-b0ba-4f29f68c0fe9",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:21:05Z",
  "cash_received": true
}
```

```json
{
  "id": "8cd02e26-4521-49d4-9708-49f3046cfb2b",
  "order_id": "b7c44b1a-cc23-4bc3-bc4e-33efe65491d5",
  "assignment_id": "35dacd57-8b7e-49ac-89e4-46368b285980",
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
  "arrived_at": "2026-10-29T07:21:05.248178Z",
  "started_at": "2026-10-29T07:21:05.542825Z",
  "completed_at": "2026-10-29T07:21:05.845734Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/b7c44b1a-cc23-4bc3-bc4e-33efe65491d5` → **200**

```json
{
  "id": "b7c44b1a-cc23-4bc3-bc4e-33efe65491d5",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "6b56e75d-75f8-4b5a-a7a7-ace95568e7ba",
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
    "id": "35dacd57-8b7e-49ac-89e4-46368b285980",
    "order_id": "b7c44b1a-cc23-4bc3-bc4e-33efe65491d5",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "8cd02e26-4521-49d4-9708-49f3046cfb2b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T07:21:03.488605Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b7c44b1a-cc23-4bc3-bc4e-33efe65491d5` → **200**

```json
{
  "id": "b7c44b1a-cc23-4bc3-bc4e-33efe65491d5",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "6b56e75d-75f8-4b5a-a7a7-ace95568e7ba",
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
    "id": "35dacd57-8b7e-49ac-89e4-46368b285980",
    "order_id": "b7c44b1a-cc23-4bc3-bc4e-33efe65491d5",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "8cd02e26-4521-49d4-9708-49f3046cfb2b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T07:21:03.488605Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b7c44b1a-cc23-4bc3-bc4e-33efe65491d5` → **200**

```json
{
  "id": "b7c44b1a-cc23-4bc3-bc4e-33efe65491d5",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "6b56e75d-75f8-4b5a-a7a7-ace95568e7ba",
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
    "id": "35dacd57-8b7e-49ac-89e4-46368b285980",
    "order_id": "b7c44b1a-cc23-4bc3-bc4e-33efe65491d5",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "8cd02e26-4521-49d4-9708-49f3046cfb2b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T07:21:03.488605Z",
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

`GET /api/rider/v1/orders/b7c44b1a-cc23-4bc3-bc4e-33efe65491d5/tip` → **200**

```json
{
  "order_id": "b7c44b1a-cc23-4bc3-bc4e-33efe65491d5",
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
  "available_until": "2026-10-30T07:21:05.845734Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/b7c44b1a-cc23-4bc3-bc4e-33efe65491d5/tip` → **201**

```json
{
  "command_id": "9e0ac2ad-21b3-4e5d-8eb3-7d124bd491a3",
  "amount_minor": 2500
}
```

```json
{
  "id": "93f645c8-9228-42c0-93c4-599b9e847153",
  "order_id": "b7c44b1a-cc23-4bc3-bc4e-33efe65491d5",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T07:21:09.582278Z"
}
```

`GET /api/rider/v1/orders/b7c44b1a-cc23-4bc3-bc4e-33efe65491d5/tip` → **200**

```json
{
  "order_id": "b7c44b1a-cc23-4bc3-bc4e-33efe65491d5",
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
  "available_until": "2026-10-30T07:21:05.845734Z",
  "open": false,
  "tip": {
    "id": "93f645c8-9228-42c0-93c4-599b9e847153",
    "order_id": "b7c44b1a-cc23-4bc3-bc4e-33efe65491d5",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T07:21:09.582278Z"
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
      "id": "58a1fd14-4b53-4dae-9ee7-d6858c5e8b3b",
      "at": "2026-10-29T07:21:06.630098Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "b7c44b1a-cc23-4bc3-bc4e-33efe65491d5",
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
      "id": "b3951a4a-b3a0-4c02-bb16-a5bb135338a9",
      "at": "2026-10-29T07:21:10.68084Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "b7c44b1a-cc23-4bc3-bc4e-33efe65491d5",
      "counterpart_id": null
    },
    {
      "id": "58a1fd14-4b53-4dae-9ee7-d6858c5e8b3b",
      "at": "2026-10-29T07:21:06.630098Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "b7c44b1a-cc23-4bc3-bc4e-33efe65491d5",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1758daad-5ae1-43a0-ab09-c22fea9a35a1",
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
  "id": "4e4d4614-68db-49b8-a1e0-9b00888e4e6c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:26:11.759504Z",
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
  "session_id": "ad7dc229-0353-4066-91b0-768531530d88",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTkzNzIsImlhdCI6MTc5MzI1ODQ3MiwianRpIjoiNDk4MWU1ZjQtMTUzMS00OTk4LWJlN2EtZDljNzM3YjA2OGEwIiwic2lkIjoiYWQ3ZGMyMjktMDM1My00MDY2LTkxYjAtNzY4NTMxNTMwZDg4In0.7LzOUSr2YQaNApYvsrhEtbbXtOfZM9hi-hut45jAfKo",
  "access_expires_at": "2026-10-29T07:36:12.346925558Z",
  "refresh_token": "penlzZt0PkIImRgTSjqwY4F3W3pNEOWzQZq-GAqJAf4",
  "refresh_expires_at": "2026-10-29T19:21:12.346375246Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380732297328` → **200**

```json
{
  "client_id": "6b56e75d-75f8-4b5a-a7a7-ace95568e7ba"
}
```

`POST /api/admin/v1/rider-wallets/6b56e75d-75f8-4b5a-a7a7-ace95568e7ba/top-ups` → **201**

```json
{
  "command_id": "62f3febf-03bb-4722-b095-bb89b3d0b43a",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "6b56e75d-75f8-4b5a-a7a7-ace95568e7ba",
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
      "id": "cf636b4f-8f82-4a0c-8431-92842910dba9",
      "at": "2026-10-29T07:21:12.896161Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "170ae787-45ee-4076-aaa6-5dabf9104a07",
  "quote_id": "4e4d4614-68db-49b8-a1e0-9b00888e4e6c",
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
  "id": "325756e2-f104-4a3a-b8db-9bd0c439825a",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6b56e75d-75f8-4b5a-a7a7-ace95568e7ba",
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
  "created_at": "2026-10-29T07:21:13.199277Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/325756e2-f104-4a3a-b8db-9bd0c439825a` → **200**

```json
{
  "id": "325756e2-f104-4a3a-b8db-9bd0c439825a",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6b56e75d-75f8-4b5a-a7a7-ace95568e7ba",
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
  "created_at": "2026-10-29T07:21:13.199277Z",
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
    "id": "72671e37-3e19-4462-9201-66baecf151f4",
    "order_id": "325756e2-f104-4a3a-b8db-9bd0c439825a",
    "expires_at": "2026-10-29T07:21:28.205867Z",
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

`POST /api/driver/v1/offers/72671e37-3e19-4462-9201-66baecf151f4/accept` → **200**

```json
{
  "command_id": "76050d82-2e73-4e04-b2ef-7f973df47a92"
}
```

```json
{
  "id": "cc29017e-22ca-4578-b094-dde3b2acdf73",
  "order_id": "325756e2-f104-4a3a-b8db-9bd0c439825a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e57715f6-1021-4553-b2f1-3490fd6cee5f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e57715f6-1021-4553-b2f1-3490fd6cee5f",
  "order_id": "325756e2-f104-4a3a-b8db-9bd0c439825a",
  "assignment_id": "cc29017e-22ca-4578-b094-dde3b2acdf73",
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

`POST /api/driver/v1/work-sessions/2516dbb6-510f-4541-be40-c665bc2bebed/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:21:14Z",
    "sequence": 1793258474654
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2516dbb6-510f-4541-be40-c665bc2bebed",
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
  "last_heartbeat_at": "2026-10-29T07:21:14.674129Z",
  "last_location_at": "2026-10-29T07:21:14.674129Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e57715f6-1021-4553-b2f1-3490fd6cee5f/arrive` → **200**

```json
{
  "command_id": "22db6000-e827-4ef4-9b3b-4d8c0334c9f5",
  "expected_version": 0
}
```

```json
{
  "id": "e57715f6-1021-4553-b2f1-3490fd6cee5f",
  "order_id": "325756e2-f104-4a3a-b8db-9bd0c439825a",
  "assignment_id": "cc29017e-22ca-4578-b094-dde3b2acdf73",
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
  "arrived_at": "2026-10-29T07:21:14.961087Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e57715f6-1021-4553-b2f1-3490fd6cee5f/start` → **200**

```json
{
  "command_id": "343dcc39-6f75-4cab-a4e4-b2c407532c54",
  "expected_version": 1
}
```

```json
{
  "id": "e57715f6-1021-4553-b2f1-3490fd6cee5f",
  "order_id": "325756e2-f104-4a3a-b8db-9bd0c439825a",
  "assignment_id": "cc29017e-22ca-4578-b094-dde3b2acdf73",
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
  "arrived_at": "2026-10-29T07:21:14.961087Z",
  "started_at": "2026-10-29T07:21:15.259725Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e57715f6-1021-4553-b2f1-3490fd6cee5f/complete` → **200**

```json
{
  "command_id": "cb1624b6-64ad-4aca-b14c-549361037470",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:21:15Z",
  "cash_received": true
}
```

```json
{
  "id": "e57715f6-1021-4553-b2f1-3490fd6cee5f",
  "order_id": "325756e2-f104-4a3a-b8db-9bd0c439825a",
  "assignment_id": "cc29017e-22ca-4578-b094-dde3b2acdf73",
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
  "arrived_at": "2026-10-29T07:21:14.961087Z",
  "started_at": "2026-10-29T07:21:15.259725Z",
  "completed_at": "2026-10-29T07:21:15.562317Z",
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
  "client_id": "6b56e75d-75f8-4b5a-a7a7-ace95568e7ba",
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
      "id": "0d311fa0-5fbd-487e-b70b-b5f7b2feaad0",
      "at": "2026-10-29T07:21:15.727895Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -16297,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "325756e2-f104-4a3a-b8db-9bd0c439825a"
    },
    {
      "id": "cf636b4f-8f82-4a0c-8431-92842910dba9",
      "at": "2026-10-29T07:21:12.896161Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
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

`GET /api/rider/v1/orders/325756e2-f104-4a3a-b8db-9bd0c439825a/tip` → **200**

```json
{
  "order_id": "325756e2-f104-4a3a-b8db-9bd0c439825a",
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
  "available_until": "2026-10-30T07:21:15.562317Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/325756e2-f104-4a3a-b8db-9bd0c439825a/tip` → **201**

```json
{
  "command_id": "532e6cf5-d45c-4b70-8ced-d191a5999ec0",
  "amount_minor": 2500
}
```

```json
{
  "id": "a7420ca0-993e-4a17-badd-85828ecc7d33",
  "order_id": "325756e2-f104-4a3a-b8db-9bd0c439825a",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T07:21:16.710769Z"
}
```

`GET /api/rider/v1/orders/325756e2-f104-4a3a-b8db-9bd0c439825a/tip` → **200**

```json
{
  "order_id": "325756e2-f104-4a3a-b8db-9bd0c439825a",
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
  "available_until": "2026-10-30T07:21:15.562317Z",
  "open": false,
  "tip": {
    "id": "a7420ca0-993e-4a17-badd-85828ecc7d33",
    "order_id": "325756e2-f104-4a3a-b8db-9bd0c439825a",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T07:21:16.710769Z"
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
      "id": "ca531447-fea7-41f5-8af5-3cad4b6510c4",
      "at": "2026-10-29T07:21:15.723756Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "325756e2-f104-4a3a-b8db-9bd0c439825a",
      "counterpart_id": null
    },
    {
      "id": "b3951a4a-b3a0-4c02-bb16-a5bb135338a9",
      "at": "2026-10-29T07:21:10.68084Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "b7c44b1a-cc23-4bc3-bc4e-33efe65491d5",
      "counterpart_id": null
    },
    {
      "id": "58a1fd14-4b53-4dae-9ee7-d6858c5e8b3b",
      "at": "2026-10-29T07:21:06.630098Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "b7c44b1a-cc23-4bc3-bc4e-33efe65491d5",
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
      "id": "7c225783-8d02-4996-b876-bc9b14ad43a9",
      "at": "2026-10-29T07:21:17.750959Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "325756e2-f104-4a3a-b8db-9bd0c439825a",
      "counterpart_id": null
    },
    {
      "id": "ca531447-fea7-41f5-8af5-3cad4b6510c4",
      "at": "2026-10-29T07:21:15.723756Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "325756e2-f104-4a3a-b8db-9bd0c439825a",
      "counterpart_id": null
    },
    {
      "id": "b3951a4a-b3a0-4c02-bb16-a5bb135338a9",
      "at": "2026-10-29T07:21:10.68084Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "b7c44b1a-cc23-4bc3-bc4e-33efe65491d5",
      "counterpart_id": null
    },
    {
      "id": "58a1fd14-4b53-4dae-9ee7-d6858c5e8b3b",
      "at": "2026-10-29T07:21:06.630098Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "b7c44b1a-cc23-4bc3-bc4e-33efe65491d5",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2516dbb6-510f-4541-be40-c665bc2bebed",
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
  "last_heartbeat_at": "2026-10-29T07:21:14.674129Z",
  "last_location_at": "2026-10-29T07:21:14.674129Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2516dbb6-510f-4541-be40-c665bc2bebed/close` → **200**

```json
{
  "command_id": "8c0d69c4-ba88-4176-a074-16767545fa71",
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

Done: card order 325756e2-f104-4a3a-b8db-9bd0c439825a.

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
  "phone": "+380730301929",
  "device_ref": "sandbox-22044"
}
```

```json
{
  "challenge_id": "a4f92596-2f37-4b69-a047-a6807ce7a393",
  "expires_at": "2026-10-29T07:26:19.681455013Z",
  "resend_available_at": "2026-10-29T07:21:20.681455013Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380730301929` → **200**

```json
{
  "phone": "+380730301929",
  "audience": "CLIENT",
  "code": "231970",
  "sent_at": "2026-10-29T07:21:19.683898125Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a4f92596-2f37-4b69-a047-a6807ce7a393",
  "code": "231970",
  "device_ref": "sandbox-22044"
}
```

```json
{
  "session_id": "54b30c65-a48d-4b89-b9e1-ee24f693fa2a",
  "subject": {
    "type": "CLIENT",
    "id": "bc3f7d09-bd98-4ff1-9a62-4d493f943705"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYzNmN2QwOS1iZDk4LTRmZjEtOWE2Mi00ZDQ5M2Y5NDM3MDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5Mzc5LCJpYXQiOjE3OTMyNTg0NzksImp0aSI6IjBmMWI4NzQxLTFhYTQtNDAzNS1iNTQ3LTFkMGMzNGIzNjZmNSIsInNpZCI6IjU0YjMwYzY1LWE0OGQtNGI4OS1iOWUxLWVlMjRmNjkzZmEyYSJ9.yjrByPyrMwIgsh7PxLcL00wWWSw7BDR_UD1bbYIJnBU",
  "access_expires_at": "2026-10-29T07:36:19.986401931Z",
  "refresh_token": "YFkbw3Y104AuElv1pC80iKptrrYKB3BGUBH4hWSrTfI",
  "refresh_expires_at": "2026-11-28T07:21:19.985802107Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "868a29cf-fd14-44c3-921f-59007e64996e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "0dd58f57-e0f4-428e-a079-4d5ddeaaa9f7",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-0dd58f57-e0f4-428e-a079-4d5ddeaaa9f7",
    "orderDate": "1793258480",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "7bc6ee8a28efc9fdd7894193a9002177",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=0dd58f57-e0f4-428e-a079-4d5ddeaaa9f7",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730301929"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=0dd58f57-e0f4-428e-a079-4d5ddeaaa9f7",
  "created_at": "2026-10-29T07:21:20.27227Z",
  "expires_at": "2026-10-29T07:51:20.27227Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/0dd58f57-e0f4-428e-a079-4d5ddeaaa9f7` → **200**

```json
{
  "id": "0dd58f57-e0f4-428e-a079-4d5ddeaaa9f7",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T07:21:20.27227Z",
  "expires_at": "2026-10-29T07:51:20.27227Z",
  "completed_at": "2026-10-29T07:21:20.569493Z",
  "masked_pan": "41****6028",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "bc3f7d09-bd98-4ff1-9a62-4d493f943705",
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
      "id": "e3628d02-5230-43bc-98c3-2f2e6acc6c52",
      "at": "2026-10-29T07:21:20.795722Z",
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
  "client_id": "bc3f7d09-bd98-4ff1-9a62-4d493f943705",
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
      "id": "e3628d02-5230-43bc-98c3-2f2e6acc6c52",
      "at": "2026-10-29T07:21:20.795722Z",
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
  "device_ref": "sandbox-13986"
}
```

```json
{
  "challenge_id": "fd71ea39-6778-4fbf-b10f-41f5816b7bea",
  "expires_at": "2026-10-29T07:26:21.488411409Z",
  "resend_available_at": "2026-10-29T07:21:22.488411409Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "862957",
  "sent_at": "2026-10-29T07:21:21.491750186Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fd71ea39-6778-4fbf-b10f-41f5816b7bea",
  "code": "862957",
  "device_ref": "sandbox-13986"
}
```

```json
{
  "session_id": "29551ce9-4d53-40ef-bfe2-0c44547fc92a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI1OTM4MSwiaWF0IjoxNzkzMjU4NDgxLCJqdGkiOiIyMDE5MmI3OS03YzBkLTRjMTktYTdiYy0wMjIzYzVmN2NiZmMiLCJzaWQiOiIyOTU1MWNlOS00ZDUzLTQwZWYtYmZlMi0wYzQ0NTQ3ZmM5MmEifQ.rx6P4tGL7pofNuFHNp3Rbv6vXJGBPmj6iHWjBJ12IWM",
  "access_expires_at": "2026-10-29T07:36:21.799454434Z",
  "refresh_token": "ggsvT1U-191g_NrTIZzRejDmyPTnJe3YmXc9TdkIsRA",
  "refresh_expires_at": "2026-11-28T07:21:21.798889395Z",
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
  "command_id": "59d8877c-a2a6-4a0d-9ff0-fab5dcf5191b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "c7745dbb-d03b-4bd7-a87a-65cc2a8fc1ea",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-c7745dbb-d03b-4bd7-a87a-65cc2a8fc1ea",
    "orderDate": "1793258482",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "6c791f68574f41ebdab8ebcf118ba7d6",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=c7745dbb-d03b-4bd7-a87a-65cc2a8fc1ea",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=c7745dbb-d03b-4bd7-a87a-65cc2a8fc1ea",
  "created_at": "2026-10-29T07:21:22.361063Z",
  "expires_at": "2026-10-29T07:51:22.361063Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/c7745dbb-d03b-4bd7-a87a-65cc2a8fc1ea` → **200**

```json
{
  "id": "c7745dbb-d03b-4bd7-a87a-65cc2a8fc1ea",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T07:21:22.361063Z",
  "expires_at": "2026-10-29T07:51:22.361063Z",
  "completed_at": "2026-10-29T07:21:22.648493Z",
  "masked_pan": "41****9080",
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
      "id": "c89a52a7-9088-4fe3-b1a2-16cd9331ba56",
      "at": "2026-10-29T07:21:22.806345Z",
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
  "command_id": "eea7cf27-2822-4e85-8a6a-4f1c13a94bd4",
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
  "correlation_id": "2fbe26e5-3695-4541-b33d-f2ddaf099cdf"
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
  "device_ref": "sandbox-5478"
}
```

```json
{
  "challenge_id": "02131fd1-9881-4201-bfd6-b0200f4934fb",
  "expires_at": "2026-10-29T07:26:23.526192461Z",
  "resend_available_at": "2026-10-29T07:21:24.526192461Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "562638",
  "sent_at": "2026-10-29T07:21:23.528617563Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "02131fd1-9881-4201-bfd6-b0200f4934fb",
  "code": "562638",
  "device_ref": "sandbox-5478"
}
```

```json
{
  "session_id": "3d1c5741-7236-4694-8af5-8d5c77b6617f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI1OTM4MywiaWF0IjoxNzkzMjU4NDgzLCJqdGkiOiIyNzczNjRjYS0zOWNhLTQwNzQtODlmMy0zNTAzMDJlZGNkM2QiLCJzaWQiOiIzZDFjNTc0MS03MjM2LTQ2OTQtOGFmNS04ZDVjNzdiNjYxN2YifQ.hCJTPo78XAR1oPbGZh3iEwDvc9kWfbuBlWiRnPow6Zo",
  "access_expires_at": "2026-10-29T07:36:23.838594906Z",
  "refresh_token": "CivkkKU_-c153USDHzCzDjG0UVDGae-m_RJKl9Sq_-Y",
  "refresh_expires_at": "2026-11-28T07:21:23.838058601Z",
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
  "command_id": "87d4e1ca-093b-4399-8dc7-22cf42ddbc31",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:21:24Z",
    "sequence": 1793258484387
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5dc094c3-1c7b-4f23-b5ad-3846f21025ec",
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
  "last_heartbeat_at": "2026-10-29T07:21:24.40651Z",
  "last_location_at": "2026-10-29T07:21:24.40651Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635312998",
  "device_ref": "sandbox-2494"
}
```

```json
{
  "challenge_id": "912d8005-0d5e-4f15-9eca-8e1ea04d5f46",
  "expires_at": "2026-10-29T07:26:24.69720653Z",
  "resend_available_at": "2026-10-29T07:21:25.69720653Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635312998` → **200**

```json
{
  "phone": "+380635312998",
  "audience": "CLIENT",
  "code": "084248",
  "sent_at": "2026-10-29T07:21:24.699724013Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "912d8005-0d5e-4f15-9eca-8e1ea04d5f46",
  "code": "084248",
  "device_ref": "sandbox-2494"
}
```

```json
{
  "session_id": "8bd80907-53cc-46b4-ba19-ad6c271ad092",
  "subject": {
    "type": "CLIENT",
    "id": "f5422beb-a5c3-4ad2-ad44-e87af6b571de"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNTQyMmJlYi1hNWMzLTRhZDItYWQ0NC1lODdhZjZiNTcxZGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5Mzg1LCJpYXQiOjE3OTMyNTg0ODUsImp0aSI6IjE2ODdhNjE3LTg0MWItNDU5MS05ZmI5LWEzYTZkMTMxNWI4MCIsInNpZCI6IjhiZDgwOTA3LTUzY2MtNDZiNC1iYTE5LWFkNmMyNzFhZDA5MiJ9.p4TTgck6G6cpx7Xckwkrz3sEeQu3skxk-3I30kb0YWE",
  "access_expires_at": "2026-10-29T07:36:25.006370885Z",
  "refresh_token": "NQLuQZdT6kv8zRLNH6s5_Irwg2oHjAK28QCCy2zUMZ4",
  "refresh_expires_at": "2026-11-28T07:21:25.005800437Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b1b87267-8208-48ad-a9f7-392f6c224efc",
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
  "id": "3909a596-f929-4eaa-82cb-c4b9537e2304",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:26:25.291627Z",
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
  "command_id": "ed4165c2-1a60-4831-a52e-3b7638daa0a4",
  "quote_id": "3909a596-f929-4eaa-82cb-c4b9537e2304",
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
  "id": "5a5d7d04-9381-4cd2-8134-7369d85f7dd6",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5422beb-a5c3-4ad2-ad44-e87af6b571de",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:21:25.598488Z",
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
    "id": "797c31a0-284c-4e76-ac8e-e7bf8202b9bf",
    "order_id": "5a5d7d04-9381-4cd2-8134-7369d85f7dd6",
    "expires_at": "2026-10-29T07:21:40.602139Z",
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

`POST /api/driver/v1/offers/797c31a0-284c-4e76-ac8e-e7bf8202b9bf/accept` → **200**

```json
{
  "command_id": "7bda3d47-95b5-4bd1-a045-7cf21ad2bac1"
}
```

```json
{
  "id": "8150bf5c-040a-4362-b2ea-d80f38b59ccb",
  "order_id": "5a5d7d04-9381-4cd2-8134-7369d85f7dd6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "23693b85-8688-4652-97e3-c189e17348b2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "23693b85-8688-4652-97e3-c189e17348b2",
  "order_id": "5a5d7d04-9381-4cd2-8134-7369d85f7dd6",
  "assignment_id": "8150bf5c-040a-4362-b2ea-d80f38b59ccb",
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

`POST /api/driver/v1/work-sessions/5dc094c3-1c7b-4f23-b5ad-3846f21025ec/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:21:26Z",
    "sequence": 1793258486739
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5dc094c3-1c7b-4f23-b5ad-3846f21025ec",
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
  "last_heartbeat_at": "2026-10-29T07:21:26.758624Z",
  "last_location_at": "2026-10-29T07:21:26.758624Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/23693b85-8688-4652-97e3-c189e17348b2/arrive` → **200**

```json
{
  "command_id": "e8b54415-0e21-45df-a155-3a0777440456",
  "expected_version": 0
}
```

```json
{
  "id": "23693b85-8688-4652-97e3-c189e17348b2",
  "order_id": "5a5d7d04-9381-4cd2-8134-7369d85f7dd6",
  "assignment_id": "8150bf5c-040a-4362-b2ea-d80f38b59ccb",
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
  "arrived_at": "2026-10-29T07:21:27.041148Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/23693b85-8688-4652-97e3-c189e17348b2/start` → **200**

```json
{
  "command_id": "ee73889f-9357-4a7d-92d2-04577dbaf935",
  "expected_version": 1
}
```

```json
{
  "id": "23693b85-8688-4652-97e3-c189e17348b2",
  "order_id": "5a5d7d04-9381-4cd2-8134-7369d85f7dd6",
  "assignment_id": "8150bf5c-040a-4362-b2ea-d80f38b59ccb",
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
  "arrived_at": "2026-10-29T07:21:27.041148Z",
  "started_at": "2026-10-29T07:21:27.361338Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/23693b85-8688-4652-97e3-c189e17348b2/complete` → **200**

```json
{
  "command_id": "8b1b73b0-d164-4469-a3af-22318eb1e82d",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:21:27Z",
  "cash_received": false
}
```

```json
{
  "id": "23693b85-8688-4652-97e3-c189e17348b2",
  "order_id": "5a5d7d04-9381-4cd2-8134-7369d85f7dd6",
  "assignment_id": "8150bf5c-040a-4362-b2ea-d80f38b59ccb",
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
  "arrived_at": "2026-10-29T07:21:27.041148Z",
  "started_at": "2026-10-29T07:21:27.361338Z",
  "completed_at": "2026-10-29T07:21:27.691426Z",
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
  "session_id": "1157504c-214e-4ab9-be3f-ca89f0ab3d79",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTkzODgsImlhdCI6MTc5MzI1ODQ4OCwianRpIjoiYmMyZDNiM2ItYzY3Zi00ZDFjLWEyZWUtMTJkZGYyODczMTI0Iiwic2lkIjoiMTE1NzUwNGMtMjE0ZS00YWI5LWJlM2YtY2E4OWYwYWIzZDc5In0.7skQrMWbkyDKKSWrgQPgLvAJCFhAmwcUWNtY5vhwqK0",
  "access_expires_at": "2026-10-29T07:36:28.326874669Z",
  "refresh_token": "7MYpJq4c1vqAZsO5vIBWyZcZtkdm5atAy5iB_km95A8",
  "refresh_expires_at": "2026-10-29T19:21:28.326204776Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/5a5d7d04-9381-4cd2-8134-7369d85f7dd6/cash-dispute` → **200**

```json
{
  "order_id": "5a5d7d04-9381-4cd2-8134-7369d85f7dd6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "f5422beb-a5c3-4ad2-ad44-e87af6b571de",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T07:21:27.862734Z",
  "decide_by": "2026-11-12T07:21:27.862734Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T07:21:27.862734Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "5a5d7d04-9381-4cd2-8134-7369d85f7dd6",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "f5422beb-a5c3-4ad2-ad44-e87af6b571de",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T07:21:27.862734Z",
      "decide_by": "2026-11-12T07:21:27.862734Z",
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

`POST /api/admin/v1/orders/5a5d7d04-9381-4cd2-8134-7369d85f7dd6/cash-dispute/decide` → **400**

```json
{
  "command_id": "6f7046a5-4fe5-4d7b-bd0b-1075bd69d4cb",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/5a5d7d04-9381-4cd2-8134-7369d85f7dd6/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "d7c5cdb8-3810-4df7-8859-a435dea58015",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/5a5d7d04-9381-4cd2-8134-7369d85f7dd6/cash-dispute/decide` → **200**

```json
{
  "command_id": "8499576d-9870-4897-a8b1-f46d5867eff8",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "5a5d7d04-9381-4cd2-8134-7369d85f7dd6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "f5422beb-a5c3-4ad2-ad44-e87af6b571de",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T07:21:27.862734Z",
  "decide_by": "2026-11-12T07:21:27.862734Z",
  "decision": "PAY_DRIVER",
  "decided_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T07:21:29.480537Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/5a5d7d04-9381-4cd2-8134-7369d85f7dd6/cash-dispute/decide` → **409**

```json
{
  "command_id": "204451f9-6f6b-4e4d-b25b-55463aab02b4",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/5a5d7d04-9381-4cd2-8134-7369d85f7dd6/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "8c0b6a88-cf71-43d1-8c96-2408174caa2f"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5dc094c3-1c7b-4f23-b5ad-3846f21025ec",
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
  "last_heartbeat_at": "2026-10-29T07:21:26.758624Z",
  "last_location_at": "2026-10-29T07:21:26.758624Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5dc094c3-1c7b-4f23-b5ad-3846f21025ec/close` → **200**

```json
{
  "command_id": "1fbd2826-d611-4c1b-9dce-7f794f28d97f",
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
  "session_id": "3af129ed-c00a-4705-9443-f0a50104cad0",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTkzOTAsImlhdCI6MTc5MzI1ODQ5MCwianRpIjoiMmU5NzFhOTktYTYzNy00YjFmLWE1MDAtODhiNWFlYzM4MmJmIiwic2lkIjoiM2FmMTI5ZWQtYzAwYS00NzA1LTk0NDMtZjBhNTAxMDRjYWQwIn0.fOMTEh0uWRfytVRFL6MYG2OwVISj_v5jNkGZCjAnDu0",
  "access_expires_at": "2026-10-29T07:36:30.925390863Z",
  "refresh_token": "dLEAGG_j0F_pSCGUPjDoY1Uuoth4dY3OBOaE3LLBdyQ",
  "refresh_expires_at": "2026-10-29T19:21:30.924774139Z",
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
  "phone": "+48600918209",
  "device_ref": "sandbox-27867"
}
```

```json
{
  "challenge_id": "066c147d-afa9-41d7-bdd8-74be93068350",
  "expires_at": "2026-10-29T07:26:31.764636837Z",
  "resend_available_at": "2026-10-29T07:21:32.764636837Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600918209` → **200**

```json
{
  "phone": "+48600918209",
  "audience": "CLIENT",
  "code": "555791",
  "sent_at": "2026-10-29T07:21:31.76717637Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "066c147d-afa9-41d7-bdd8-74be93068350",
  "code": "555791",
  "device_ref": "sandbox-27867"
}
```

```json
{
  "session_id": "09f987b4-5b12-41dd-b9eb-46682eeafc9f",
  "subject": {
    "type": "CLIENT",
    "id": "3d83825d-65f9-4776-b9bd-ad42bb60bc4a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZDgzODI1ZC02NWY5LTQ3NzYtYjliZC1hZDQyYmI2MGJjNGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5MzkyLCJpYXQiOjE3OTMyNTg0OTIsImp0aSI6ImRjNWFlYmMyLTJiNTEtNDM0NS04M2M4LWI1YTA4NTA3YzIzNSIsInNpZCI6IjA5Zjk4N2I0LTViMTItNDFkZC1iOWViLTQ2NjgyZWVhZmM5ZiJ9.miUwHHr5xv68F_x_Ze_IXW6ZTcOiRlYA7LBhqMzODpA",
  "access_expires_at": "2026-10-29T07:36:32.076833434Z",
  "refresh_token": "AKoUcZvTIe8PHi8GX-MjWKLaJw456Yx5qNYrBKO6EuQ",
  "refresh_expires_at": "2026-11-28T07:21:32.076158869Z",
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
  "command_id": "221df7e9-e027-4be5-9d97-33a8a54675f5",
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
  "correlation_id": "d4c40539-6f8d-48fb-b742-3def736c9dc2",
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
  "command_id": "afbd664f-70e7-487c-bb64-1d2306a0a855",
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
  "paused_at": "2026-10-29T07:21:33.178489245Z",
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
  "command_id": "31306f81-a58c-4bac-809f-b42281bb10a2",
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
  "id": "3ef7b795-4c3e-4279-98ad-547222ef17cf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:26:33.763094Z",
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
  "command_id": "b892e6aa-e933-4a13-9a3c-2742ffd06e9d",
  "quote_id": "3ef7b795-4c3e-4279-98ad-547222ef17cf",
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
  "correlation_id": "8cb257e6-241b-494d-8769-633cf0e53690"
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
  "paused_at": "2026-10-29T07:21:33.178489Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "de81eaef-b764-4050-aaee-8286fde71180",
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
  "command_id": "8030e101-78b3-4b6c-8340-cfad17dc281f",
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
  "command_id": "29bd40b8-4467-4ecf-b32a-6997d124fdeb",
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
  "id": "72f5b4b5-d220-465a-8b0b-07ecd3b2f54b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:26:35.509125Z",
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
  "command_id": "85ad9676-cf30-4fe3-ab46-3119354b3f30",
  "quote_id": "72f5b4b5-d220-465a-8b0b-07ecd3b2f54b",
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
  "correlation_id": "de4b5b96-3f04-4ceb-8fd5-2c6d0fbcb8b5"
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
  "command_id": "8732e656-ed2c-4771-9f44-8a38a5b03bf4",
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
  "command_id": "46c8fbab-8275-42ed-9006-98421268d60f",
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
  "id": "50148765-3f61-4fa1-8b95-fa40ad2529f3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:26:36.670349Z",
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
  "command_id": "56c6341b-eb33-44e6-bea5-02332be9b808",
  "quote_id": "50148765-3f61-4fa1-8b95-fa40ad2529f3",
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
  "correlation_id": "058833b9-ea8e-4d2b-97b8-f83530d7dd53"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "c817b1ae-4001-4a4f-a069-e33f4bdc60da",
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
  "correlation_id": "ce1033ce-e0f2-4aa6-90aa-1badaf401b3d"
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
  "command_id": "1f0e2a97-ac93-4875-8a1a-30c8490bc130",
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
  "phone": "+380679103604",
  "device_ref": "sandbox-13541"
}
```

```json
{
  "challenge_id": "50dd3ae6-6e08-4257-8c5b-4aa2ea184a93",
  "expires_at": "2026-10-29T07:26:38.13467337Z",
  "resend_available_at": "2026-10-29T07:21:39.13467337Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679103604` → **200**

```json
{
  "phone": "+380679103604",
  "audience": "CLIENT",
  "code": "528583",
  "sent_at": "2026-10-29T07:21:38.137213101Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "50dd3ae6-6e08-4257-8c5b-4aa2ea184a93",
  "code": "528583",
  "device_ref": "sandbox-13541"
}
```

```json
{
  "session_id": "14a6450e-d253-466b-973b-963889db0d10",
  "subject": {
    "type": "CLIENT",
    "id": "9a16cb15-199b-456e-9a1c-f70935d3b3c3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YTE2Y2IxNS0xOTliLTQ1NmUtOWExYy1mNzA5MzVkM2IzYzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5Mzk4LCJpYXQiOjE3OTMyNTg0OTgsImp0aSI6ImU1YjY4NTY4LTBmNzAtNDgxMi05YjdlLTQxNGRhYWM3NzlmYyIsInNpZCI6IjE0YTY0NTBlLWQyNTMtNDY2Yi05NzNiLTk2Mzg4OWRiMGQxMCJ9.2KQQ7zSqk4d3L8wL2a0ApMq87X4CVJAuY-7ijbtf4Qk",
  "access_expires_at": "2026-10-29T07:36:38.449101482Z",
  "refresh_token": "rW7Lxj7aF9JL7dm8sNNRY-S9kqZkbQCho7uuJll0Z5I",
  "refresh_expires_at": "2026-11-28T07:21:38.448564796Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9a16cb15-199b-456e-9a1c-f70935d3b3c3",
  "session_id": "14a6450e-d253-466b-973b-963889db0d10",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0f1c289c-1536-4abb-8459-eba5d2841f16",
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
  "id": "c29e76cd-e04f-42a7-bfcd-b7a556d9f77f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:26:39.009168Z",
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
  "challenge_id": "12983350-2c51-4743-af13-72b5485b7f43",
  "expires_at": "2026-10-29T07:26:41.298304642Z",
  "resend_available_at": "2026-10-29T07:21:42.298304642Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679103604` → **200**

```json
{
  "phone": "+380679103604",
  "audience": "CLIENT",
  "code": "825423",
  "sent_at": "2026-10-29T07:21:41.300363784Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "b4ab5a10-b2a6-4f21-9f85-cc2311e5dd30",
  "challenge_id": "12983350-2c51-4743-af13-72b5485b7f43",
  "otp_code": "825423"
}
```

```json
{
  "client_id": "9a16cb15-199b-456e-9a1c-f70935d3b3c3",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T07:21:41.618115468Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "c25cc4c6-e0cf-42b6-b04f-4e4678bd886e",
  "quote_id": "c29e76cd-e04f-42a7-bfcd-b7a556d9f77f",
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
  "correlation_id": "61854a6e-8b6b-47c9-9d16-d657a0019c63"
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
  "session_id": "7fbaaff6-473f-47dd-ade3-2858b3f5664a",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk0MDIsImlhdCI6MTc5MzI1ODUwMiwianRpIjoiZjMzYjY3MDAtNDFmNC00MWM1LTllOWEtZWFlNmYxNTdlMzA3Iiwic2lkIjoiN2ZiYWFmZjYtNDczZi00N2RkLWFkZTMtMjg1OGIzZjU2NjRhIn0.7_AfxUz43fgeBhrqDz8gPXc_VCEofeOZr3DIQuaTSQo",
  "access_expires_at": "2026-10-29T07:36:42.479708007Z",
  "refresh_token": "GHPAIiT6Mm9IW6LtQg0mDGIDGkMQNDjXCcWiUJhAv8g",
  "refresh_expires_at": "2026-10-29T19:21:42.479168376Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "9a16cb15-199b-456e-9a1c-f70935d3b3c3",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T07:21:41.618115Z",
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

`POST /api/admin/v1/client-deletions/9a16cb15-199b-456e-9a1c-f70935d3b3c3/complete` → **200**

```json
{
  "command_id": "22eb0047-8e44-4e4f-8ea9-9adbba4f592e",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "9a16cb15-199b-456e-9a1c-f70935d3b3c3",
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
  "correlation_id": "a54e1862-502c-4eaa-b24c-a7d332e4aed4"
}
```

Done: client 9a16cb15-199b-456e-9a1c-f70935d3b3c3 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665029230",
  "device_ref": "sandbox-12063"
}
```

```json
{
  "challenge_id": "60d3470c-fa52-4873-96b2-200027ca22d1",
  "expires_at": "2026-10-29T07:26:43.628461552Z",
  "resend_available_at": "2026-10-29T07:21:44.628461552Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665029230` → **200**

```json
{
  "phone": "+380665029230",
  "audience": "CLIENT",
  "code": "797342",
  "sent_at": "2026-10-29T07:21:43.631291385Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "60d3470c-fa52-4873-96b2-200027ca22d1",
  "code": "797342",
  "device_ref": "sandbox-12063"
}
```

```json
{
  "session_id": "3af21a1b-5c31-4337-98b0-3560a9eb31b5",
  "subject": {
    "type": "CLIENT",
    "id": "8687424e-1f8d-48cc-b3f3-84d0293cb6e2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Njg3NDI0ZS0xZjhkLTQ4Y2MtYjNmMy04NGQwMjkzY2I2ZTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5NDAzLCJpYXQiOjE3OTMyNTg1MDMsImp0aSI6IjVkNDY4ODUxLWZiYzEtNDk1OC1hMDFiLTE3ODVjNDk5YTEyMyIsInNpZCI6IjNhZjIxYTFiLTVjMzEtNDMzNy05OGIwLTM1NjBhOWViMzFiNSJ9.rojULgno67mzGhuiiwPOU9RBonPZIkCCqI2q3vgaCQo",
  "access_expires_at": "2026-10-29T07:36:43.938288548Z",
  "refresh_token": "DejNSEYo1L7N-6xNuXAyKcfrq9AESMMTZPpglAo16U0",
  "refresh_expires_at": "2026-11-28T07:21:43.937714412Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8687424e-1f8d-48cc-b3f3-84d0293cb6e2",
  "session_id": "3af21a1b-5c31-4337-98b0-3560a9eb31b5",
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
  "session_id": "90672af8-e174-4958-8473-6742ec2f920f",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk0MDQsImlhdCI6MTc5MzI1ODUwNCwianRpIjoiMmQ4NGUyOTgtZjY5My00OWMyLTk4NzQtOTYwOGUyZTM3OTNhIiwic2lkIjoiOTA2NzJhZjgtZTE3NC00OTU4LTg0NzMtNjc0MmVjMmY5MjBmIn0.ojvii32d-dlSdOotXTtLm02zWdRczkyHpvGDgSg4lSI",
  "access_expires_at": "2026-10-29T07:36:44.781947017Z",
  "refresh_token": "x-bS4SJr76nr8bptVgW1S39rlvoSDt9PSC5wxQTrovk",
  "refresh_expires_at": "2026-10-29T19:21:44.781207945Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=5029230&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "8687424e-1f8d-48cc-b3f3-84d0293cb6e2",
      "phone": "+380665029230",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T07:21:43.936204Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/8687424e-1f8d-48cc-b3f3-84d0293cb6e2` → **200**

```json
{
  "client": {
    "id": "8687424e-1f8d-48cc-b3f3-84d0293cb6e2",
    "phone": "+380665029230",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T07:21:43.936204Z",
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

`POST /api/admin/v1/clients/8687424e-1f8d-48cc-b3f3-84d0293cb6e2/block` → **400**

```json
{
  "command_id": "5c1aa95e-1915-4b15-91d9-5ded8112e11c",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/8687424e-1f8d-48cc-b3f3-84d0293cb6e2/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "a6b3389e-8e97-4783-bddf-1711703a43d6",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/8687424e-1f8d-48cc-b3f3-84d0293cb6e2/block` → **200**

```json
{
  "command_id": "2dd2a6e6-fdc0-42b2-853e-bc86c225c573",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "8687424e-1f8d-48cc-b3f3-84d0293cb6e2",
  "phone": "+380665029230",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T07:21:43.936204Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T07:21:45.975866Z",
    "by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
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
  "correlation_id": "42155d67-b38a-445e-97ed-0b4c3f2155c7"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665029230",
  "device_ref": "sandbox-21619"
}
```

```json
{
  "challenge_id": "0240673a-50c8-4f7d-bdd8-0e4b396f38a1",
  "expires_at": "2026-10-29T07:26:48.556250913Z",
  "resend_available_at": "2026-10-29T07:21:49.556250913Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665029230` → **200**

```json
{
  "phone": "+380665029230",
  "audience": "CLIENT",
  "code": "950728",
  "sent_at": "2026-10-29T07:21:48.558388391Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "0240673a-50c8-4f7d-bdd8-0e4b396f38a1",
  "code": "950728",
  "device_ref": "sandbox-21619"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "95ee9e2d-1a04-4745-aba6-238fe1b13467"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/8687424e-1f8d-48cc-b3f3-84d0293cb6e2` → **200**

```json
{
  "client": {
    "id": "8687424e-1f8d-48cc-b3f3-84d0293cb6e2",
    "phone": "+380665029230",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T07:21:43.936204Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T07:21:45.975866Z",
      "by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
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

`POST /api/admin/v1/clients/8687424e-1f8d-48cc-b3f3-84d0293cb6e2/unblock` → **200**

```json
{
  "command_id": "1be5754e-c1af-48b9-988d-7860c0c7e15a",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "8687424e-1f8d-48cc-b3f3-84d0293cb6e2",
  "phone": "+380665029230",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T07:21:43.936204Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665029230",
  "device_ref": "sandbox-7379"
}
```

```json
{
  "challenge_id": "0cdbb1b1-a28d-4835-b6be-27a3fe76acc0",
  "expires_at": "2026-10-29T07:26:51.746900648Z",
  "resend_available_at": "2026-10-29T07:21:52.746900648Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665029230` → **200**

```json
{
  "phone": "+380665029230",
  "audience": "CLIENT",
  "code": "125832",
  "sent_at": "2026-10-29T07:21:51.749368288Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0cdbb1b1-a28d-4835-b6be-27a3fe76acc0",
  "code": "125832",
  "device_ref": "sandbox-7379"
}
```

```json
{
  "session_id": "042031ed-4ce7-475a-b32b-8b1b063db346",
  "subject": {
    "type": "CLIENT",
    "id": "8687424e-1f8d-48cc-b3f3-84d0293cb6e2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Njg3NDI0ZS0xZjhkLTQ4Y2MtYjNmMy04NGQwMjkzY2I2ZTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5NDEyLCJpYXQiOjE3OTMyNTg1MTIsImp0aSI6ImZmNGI0MDEyLTA5YmEtNDhhYS04MjA2LTMxYTEyMmI3MzRhZSIsInNpZCI6IjA0MjAzMWVkLTRjZTctNDc1YS1iMzJiLThiMWIwNjNkYjM0NiJ9.ZqyzUBlz7_3TgLk8d9Njrd60soQWYygUoqV4sBzIHEI",
  "access_expires_at": "2026-10-29T07:36:52.053011757Z",
  "refresh_token": "IOEFIWWDnd2S0oezg2q_qWSkulPUXKA-9TKJWPjpI7A",
  "refresh_expires_at": "2026-11-28T07:21:52.05231506Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8687424e-1f8d-48cc-b3f3-84d0293cb6e2",
  "session_id": "042031ed-4ce7-475a-b32b-8b1b063db346",
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
  "phone": "+380665470679",
  "device_ref": "sandbox-13332"
}
```

```json
{
  "challenge_id": "223cb50d-65a1-4cc9-8ed7-eda0142e639e",
  "expires_at": "2026-10-29T07:26:52.615131783Z",
  "resend_available_at": "2026-10-29T07:21:53.615131783Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665470679` → **200**

```json
{
  "phone": "+380665470679",
  "audience": "CLIENT",
  "code": "278442",
  "sent_at": "2026-10-29T07:21:52.617388647Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "223cb50d-65a1-4cc9-8ed7-eda0142e639e",
  "code": "278442",
  "device_ref": "sandbox-13332"
}
```

```json
{
  "session_id": "966220dc-2ee7-4ebe-8c29-8b83f9fb72da",
  "subject": {
    "type": "CLIENT",
    "id": "6409af36-7c53-4ac7-b490-c4bcc470dbf6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NDA5YWYzNi03YzUzLTRhYzctYjQ5MC1jNGJjYzQ3MGRiZjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5NDEyLCJpYXQiOjE3OTMyNTg1MTIsImp0aSI6IjY3ZTFlYTg3LTdmMjEtNDdjMy05NGE5LThjZDA4ZWI1YzEzYSIsInNpZCI6Ijk2NjIyMGRjLTJlZTctNGViZS04YzI5LThiODNmOWZiNzJkYSJ9.ELyKKp-mF9eeft1XOIq2CuFHDiV-jtalKbpJfWCYKFo",
  "access_expires_at": "2026-10-29T07:36:52.916583401Z",
  "refresh_token": "k84m8DWlMRl4QUfrqqRZBXEj8QqTZLC8psVpZnIiatw",
  "refresh_expires_at": "2026-11-28T07:21:52.915932132Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "de6e9245-aa68-44e5-be4f-999fd919267c",
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
  "id": "50b279fd-0eaa-4ea5-943e-592921dcd366",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:26:53.197804Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 68167743-45f1-4346-80a3-24f8afd53170) → **201**

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
  "session_id": "b8124443-ba83-47fd-9a9b-7e643dcbebe4",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk0MTMsImlhdCI6MTc5MzI1ODUxMywianRpIjoiMTE0ZjAzYzQtZmZhMS00YTQ5LTliZGQtNzcxNTNkOWJhMzJkIiwic2lkIjoiYjgxMjQ0NDMtYmE4My00N2ZkLTlhOWItN2U2NDNkY2JlYmU0In0.RE-0rQhzmrSj8ZP6jQt6mDXVFNWfBUqvNiP0rwywt4E",
  "access_expires_at": "2026-10-29T07:36:53.810941535Z",
  "refresh_token": "owyg59yYy9igZtyHJEYBMBys-xX2xHFrn2459ZuI_aY",
  "refresh_expires_at": "2026-10-29T19:21:53.810271378Z",
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
  "session_id": "53b0f3e2-89e9-494b-83b9-ac39d968c5d0",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk0MTQsImlhdCI6MTc5MzI1ODUxNCwianRpIjoiNzY3YmRmYTctMTk4My00ZDRhLWJkMjMtNzE1Yjk5N2U4ODI4Iiwic2lkIjoiNTNiMGYzZTItODllOS00OTRiLTgzYjktYWMzOWQ5NjhjNWQwIn0.C_vTbTj7Ga4WDN6vDUFSfzB_va2bo61Tu1CplbjoiLI",
  "access_expires_at": "2026-10-29T07:36:54.379130737Z",
  "refresh_token": "sWhrr5P8JTvsBWOxj2OsLWLMn96vrGJQrz-KL_WgpVo",
  "refresh_expires_at": "2026-10-29T19:21:54.378556421Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c1b53fb6-1e3c-4894-a600-d78648ce699a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T07:21:53.482082Z",
      "actor": {
        "type": "CLIENT",
        "id": "6409af36-7c53-4ac7-b490-c4bcc470dbf6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "c1b53fb6-1e3c-4894-a600-d78648ce699a",
        "quote_id": "50b279fd-0eaa-4ea5-943e-592921dcd366",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "68167743-45f1-4346-80a3-24f8afd53170"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T07:21:53.483839Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c1b53fb6-1e3c-4894-a600-d78648ce699a",
        "attempt_id": "1bc2ab3f-0aae-4800-a780-5ed1f596c1a9",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "68167743-45f1-4346-80a3-24f8afd53170"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T07:21:53.490184Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c1b53fb6-1e3c-4894-a600-d78648ce699a",
        "attempt_id": "1bc2ab3f-0aae-4800-a780-5ed1f596c1a9"
      },
      "correlation_id": "68167743-45f1-4346-80a3-24f8afd53170"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "1bc2ab3f-0aae-4800-a780-5ed1f596c1a9",
        "generation": 1,
        "started_at": "2026-10-29T07:21:53.483Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T07:21:53.490184Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T07:21:53.484566Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/68167743-45f1-4346-80a3-24f8afd53170` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "c1b53fb6-1e3c-4894-a600-d78648ce699a:0",
      "order_id": "c1b53fb6-1e3c-4894-a600-d78648ce699a",
      "at": "2026-10-29T07:21:53.482082Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "c1b53fb6-1e3c-4894-a600-d78648ce699a:1",
      "order_id": "c1b53fb6-1e3c-4894-a600-d78648ce699a",
      "at": "2026-10-29T07:21:53.483839Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "c1b53fb6-1e3c-4894-a600-d78648ce699a:2",
      "order_id": "c1b53fb6-1e3c-4894-a600-d78648ce699a",
      "at": "2026-10-29T07:21:53.490184Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/dae008d5-1f6b-4e67-9c7f-122caba7d751` → **200**

```json
{
  "found": []
}
```

Done: request 68167743-45f1-4346-80a3-24f8afd53170 — order c1b53fb6-1e3c-4894-a600-d78648ce699a found by its id.

`GET /api/rider/v1/orders/c1b53fb6-1e3c-4894-a600-d78648ce699a` → **200**

```json
{
  "id": "c1b53fb6-1e3c-4894-a600-d78648ce699a",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6409af36-7c53-4ac7-b490-c4bcc470dbf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:21:53.48157Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c1b53fb6-1e3c-4894-a600-d78648ce699a/cancel` → **200**

```json
{
  "command_id": "72938f68-ca52-4685-b7f2-589f7dca8702",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c1b53fb6-1e3c-4894-a600-d78648ce699a",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6409af36-7c53-4ac7-b490-c4bcc470dbf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:21:53.48157Z",
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
  "phone": "+380639449168",
  "device_ref": "sandbox-30665"
}
```

```json
{
  "challenge_id": "d809f552-a07e-4d4a-ae9f-eab59c9e30b9",
  "expires_at": "2026-10-29T07:26:56.117930576Z",
  "resend_available_at": "2026-10-29T07:21:57.117930576Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639449168` → **200**

```json
{
  "phone": "+380639449168",
  "audience": "CLIENT",
  "code": "668290",
  "sent_at": "2026-10-29T07:21:56.120190571Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d809f552-a07e-4d4a-ae9f-eab59c9e30b9",
  "code": "668290",
  "device_ref": "sandbox-30665"
}
```

```json
{
  "session_id": "aaf4a6fa-4d0d-40f9-887e-3b9db9103a5f",
  "subject": {
    "type": "CLIENT",
    "id": "99e6bb60-5991-40d3-8434-95d157644544"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5OWU2YmI2MC01OTkxLTQwZDMtODQzNC05NWQxNTc2NDQ1NDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5NDE2LCJpYXQiOjE3OTMyNTg1MTYsImp0aSI6Ijc5ZmYzYTM0LWU3ZjEtNDIwZi1hY2YyLTQ3MzY3YWE2Y2Q1NCIsInNpZCI6ImFhZjRhNmZhLTRkMGQtNDBmOS04ODdlLTNiOWRiOTEwM2E1ZiJ9.MbbiwUqO7Z3UcAaQ47JjgxMpgeXWtBkcP5qajC37szM",
  "access_expires_at": "2026-10-29T07:36:56.432562875Z",
  "refresh_token": "2XD7tavVCRh1oBuaPd1CZ-i1MuCcuW0cBASYohfQUII",
  "refresh_expires_at": "2026-11-28T07:21:56.43202669Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "192dcdac-360a-4e73-9d29-f0348bb4654a",
  "expires_at": "2026-10-29T07:26:58.715074381Z",
  "resend_available_at": "2026-10-29T07:21:59.715074381Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639449168` → **200**

```json
{
  "phone": "+380639449168",
  "audience": "CLIENT",
  "code": "435106",
  "sent_at": "2026-10-29T07:21:58.717237656Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "3ecb37d2-5ada-42fb-9113-1345783991e3",
  "challenge_id": "192dcdac-360a-4e73-9d29-f0348bb4654a",
  "otp_code": "435106"
}
```

```json
{
  "id": "5d5e93c7-b89d-4b2c-9d26-ee3cedb3c508",
  "state": "PENDING",
  "created_at": "2026-10-29T07:21:59.029922Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/5d5e93c7-b89d-4b2c-9d26-ee3cedb3c508` → **200**

```json
{
  "id": "5d5e93c7-b89d-4b2c-9d26-ee3cedb3c508",
  "state": "PENDING",
  "created_at": "2026-10-29T07:21:59.029922Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/5d5e93c7-b89d-4b2c-9d26-ee3cedb3c508` → **200**

```json
{
  "id": "5d5e93c7-b89d-4b2c-9d26-ee3cedb3c508",
  "state": "PENDING",
  "created_at": "2026-10-29T07:21:59.029922Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/5d5e93c7-b89d-4b2c-9d26-ee3cedb3c508` → **200**

```json
{
  "id": "5d5e93c7-b89d-4b2c-9d26-ee3cedb3c508",
  "state": "PENDING",
  "created_at": "2026-10-29T07:21:59.029922Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/5d5e93c7-b89d-4b2c-9d26-ee3cedb3c508` → **200**

```json
{
  "id": "5d5e93c7-b89d-4b2c-9d26-ee3cedb3c508",
  "state": "PENDING",
  "created_at": "2026-10-29T07:21:59.029922Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/5d5e93c7-b89d-4b2c-9d26-ee3cedb3c508` → **200**

```json
{
  "id": "5d5e93c7-b89d-4b2c-9d26-ee3cedb3c508",
  "state": "PENDING",
  "created_at": "2026-10-29T07:21:59.029922Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/5d5e93c7-b89d-4b2c-9d26-ee3cedb3c508` → **200**

```json
{
  "id": "5d5e93c7-b89d-4b2c-9d26-ee3cedb3c508",
  "state": "PENDING",
  "created_at": "2026-10-29T07:21:59.029922Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/5d5e93c7-b89d-4b2c-9d26-ee3cedb3c508` → **200**

```json
{
  "id": "5d5e93c7-b89d-4b2c-9d26-ee3cedb3c508",
  "state": "PENDING",
  "created_at": "2026-10-29T07:21:59.029922Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/5d5e93c7-b89d-4b2c-9d26-ee3cedb3c508` → **200**

```json
{
  "id": "5d5e93c7-b89d-4b2c-9d26-ee3cedb3c508",
  "state": "READY",
  "created_at": "2026-10-29T07:21:59.029922Z",
  "ready_at": "2026-10-29T07:22:08.028501Z",
  "expires_at": "2026-11-05T07:22:08.028501Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/5d5e93c7-b89d-4b2c-9d26-ee3cedb3c508/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635918404",
  "device_ref": "sandbox-10152"
}
```

```json
{
  "challenge_id": "99ffb76b-eb3a-42ce-9bf7-d37983ab0922",
  "expires_at": "2026-10-29T07:27:08.540169724Z",
  "resend_available_at": "2026-10-29T07:22:09.540169724Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635918404` → **200**

```json
{
  "phone": "+380635918404",
  "audience": "CLIENT",
  "code": "110077",
  "sent_at": "2026-10-29T07:22:08.542708832Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "99ffb76b-eb3a-42ce-9bf7-d37983ab0922",
  "code": "110077",
  "device_ref": "sandbox-10152"
}
```

```json
{
  "session_id": "d306815c-4394-4e5d-8f5c-688a6d89b425",
  "subject": {
    "type": "CLIENT",
    "id": "e405ca60-14e1-4391-bfd2-b8b240c02bf3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNDA1Y2E2MC0xNGUxLTQzOTEtYmZkMi1iOGIyNDBjMDJiZjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5NDI4LCJpYXQiOjE3OTMyNTg1MjgsImp0aSI6IjkwMzVlYjIxLWIzNTEtNDRhZi1hZjI2LWNjMWU2NWFkN2I1NCIsInNpZCI6ImQzMDY4MTVjLTQzOTQtNGU1ZC04ZjVjLTY4OGE2ZDg5YjQyNSJ9.l_yO8T7WZK5HsAd_2wlDGJk71n2myOTV8GtfI1Q1Q7c",
  "access_expires_at": "2026-10-29T07:37:08.848640956Z",
  "refresh_token": "uI_scFM8Lj_Di0iH7UNJzlkkmdfzLK_bz3kw7_M-0TY",
  "refresh_expires_at": "2026-11-28T07:22:08.848108638Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/5d5e93c7-b89d-4b2c-9d26-ee3cedb3c508/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/5d5e93c7-b89d-4b2c-9d26-ee3cedb3c508/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4f672060-84f7-4b88-88f4-84e504b6698d"
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
  "session_id": "f8d05320-2c75-4d3f-be06-1b4d02c19349",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk0MjksImlhdCI6MTc5MzI1ODUyOSwianRpIjoiZTMzMjgzOWItNzFlNC00OTRkLTk2Y2YtMjIwMzYyZThhOThkIiwic2lkIjoiZjhkMDUzMjAtMmM3NS00ZDNmLWJlMDYtMWI0ZDAyYzE5MzQ5In0.YhJ4h594tkyr-MUhm1ZwCeRa8gaoV92eK-rUkt3OixA",
  "access_expires_at": "2026-10-29T07:37:09.6990023Z",
  "refresh_token": "78QT0UG5Sk12-B2pFKVQEY9F0VzVCqs8tQih501oG5I",
  "refresh_expires_at": "2026-10-29T19:22:09.698457589Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "99e6bb60-5991-40d3-8434-95d157644544",
  "session_id": "aaf4a6fa-4d0d-40f9-887e-3b9db9103a5f",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/99e6bb60-5991-40d3-8434-95d157644544/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "5d5e93c7-b89d-4b2c-9d26-ee3cedb3c508",
      "state": "READY",
      "created_at": "2026-10-29T07:21:59.029922Z",
      "ready_at": "2026-10-29T07:22:08.028501Z",
      "expires_at": "2026-11-05T07:22:08.028501Z",
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
  "device_ref": "sandbox-19057"
}
```

```json
{
  "challenge_id": "cbc28bb2-e8b5-4a22-88b1-7c1ac55f2581",
  "expires_at": "2026-10-29T07:27:10.552205195Z",
  "resend_available_at": "2026-10-29T07:22:11.552205195Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "640127",
  "sent_at": "2026-10-29T07:22:10.554495476Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cbc28bb2-e8b5-4a22-88b1-7c1ac55f2581",
  "code": "640127",
  "device_ref": "sandbox-19057"
}
```

```json
{
  "session_id": "4e1a3993-c463-4ca4-9b81-593be0ed726f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI1OTQzMCwiaWF0IjoxNzkzMjU4NTMwLCJqdGkiOiI3N2RhMzk0OC01ZTU4LTQ4YWQtYmIwOS00YTQxMzM0MjE2MjEiLCJzaWQiOiI0ZTFhMzk5My1jNDYzLTRjYTQtOWI4MS01OTNiZTBlZDcyNmYifQ.TEnqh229LSkTCi79SPW_FykjADojZpufTes1cyLbjec",
  "access_expires_at": "2026-10-29T07:37:10.859501722Z",
  "refresh_token": "VsSJJTQntvm__PAeMyx2KQIIy4sbrAmh83oyz7g_xd4",
  "refresh_expires_at": "2026-11-28T07:22:10.858864359Z",
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
  "device_ref": "sandbox-1850"
}
```

```json
{
  "challenge_id": "4173d8c0-e119-4980-b761-6f67a2e58d7f",
  "expires_at": "2026-10-29T07:27:11.403917267Z",
  "resend_available_at": "2026-10-29T07:22:12.403917267Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "252366",
  "sent_at": "2026-10-29T07:22:11.406415002Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4173d8c0-e119-4980-b761-6f67a2e58d7f",
  "code": "252366",
  "device_ref": "sandbox-1850"
}
```

```json
{
  "session_id": "b12074c6-141d-4e0a-a81e-634366ff1ae5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI1OTQzMSwiaWF0IjoxNzkzMjU4NTMxLCJqdGkiOiJkNjUyY2I2ZC0yNzczLTRkMTItODZiOS0yMWVjNTAxY2I5NGIiLCJzaWQiOiJiMTIwNzRjNi0xNDFkLTRlMGEtYTgxZS02MzQzNjZmZjFhZTUifQ.XVSYBRnGr9hl1y0vdRuBZqm4GgFHfa8YkUi3ffZJDrc",
  "access_expires_at": "2026-10-29T07:37:11.699688482Z",
  "refresh_token": "jcwCKi7OeCliVTbdEQCdVj1SOfpzgqoG3_YzAUx7YAY",
  "refresh_expires_at": "2026-11-28T07:22:11.699165351Z",
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
  "command_id": "e38a6c16-3bc2-4fd1-a319-a226f03b9111",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:22:12Z",
    "sequence": 1793258532234
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "82e94305-d489-4197-bcd1-e3ed55c718a3",
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
  "last_heartbeat_at": "2026-10-29T07:22:12.254535Z",
  "last_location_at": "2026-10-29T07:22:12.254535Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-22905"
}
```

```json
{
  "challenge_id": "93519846-7b9c-4b60-aa2e-3c88d78e0fde",
  "expires_at": "2026-10-29T07:27:12.536211025Z",
  "resend_available_at": "2026-10-29T07:22:13.536211025Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "524958",
  "sent_at": "2026-10-29T07:22:12.538820708Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "93519846-7b9c-4b60-aa2e-3c88d78e0fde",
  "code": "524958",
  "device_ref": "sandbox-22905"
}
```

```json
{
  "session_id": "ccc7634c-d1c2-4af1-9898-a444ebe5ff03",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI1OTQzMiwiaWF0IjoxNzkzMjU4NTMyLCJqdGkiOiIyNTVjNjFlZC0xMTllLTQ1OTktYTJmZS1lZjNhZjE1M2FjYzciLCJzaWQiOiJjY2M3NjM0Yy1kMWMyLTRhZjEtOTg5OC1hNDQ0ZWJlNWZmMDMifQ.CEL4cYX9_z2Mk-20EVTd7WVoX9X6gIav6xae6frL0G8",
  "access_expires_at": "2026-10-29T07:37:12.837714172Z",
  "refresh_token": "B_uDQuOj7hBCglUb2LjUmqNwG7rXFkhLcW8qBOOjYdM",
  "refresh_expires_at": "2026-11-28T07:22:12.837172166Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "19efbadd-bcb9-432a-b0dc-8a595a57b2aa",
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
  "last_heartbeat_at": "2026-10-29T07:20:55.002795Z",
  "last_location_at": "2026-10-29T07:20:55.002795Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/19efbadd-bcb9-432a-b0dc-8a595a57b2aa/handover` → **200**

```json
{
  "command_id": "3b82e0bd-fe10-4eec-abac-0acb76a2e096",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "19efbadd-bcb9-432a-b0dc-8a595a57b2aa",
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
  "last_heartbeat_at": "2026-10-29T07:20:55.002795Z",
  "last_location_at": "2026-10-29T07:20:55.002795Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/19efbadd-bcb9-432a-b0dc-8a595a57b2aa/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:22:13Z",
    "sequence": 1793258533678
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "19efbadd-bcb9-432a-b0dc-8a595a57b2aa",
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
  "last_heartbeat_at": "2026-10-29T07:22:13.698027Z",
  "last_location_at": "2026-10-29T07:22:13.698027Z",
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
  "session_id": "b570be58-6ff3-45eb-a5a2-8ec80b6e31e5",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk0MzQsImlhdCI6MTc5MzI1ODUzNCwianRpIjoiMDY4MTQwZWQtMTJiMS00OWNiLTgwMjUtMzJlZTMzMGRhZjdlIiwic2lkIjoiYjU3MGJlNTgtNmZmMy00NWViLWE1YTItOGVjODBiNmUzMWU1In0.YiYRUxJE50cXopEQkFlpCQdgZpJlLjw_rBNNDoComDQ",
  "access_expires_at": "2026-10-29T07:37:14.269166312Z",
  "refresh_token": "iLTSA-kE_uaDZhsXRRS63JmBd1kXLb7HqdSWnQv1drs",
  "refresh_expires_at": "2026-10-29T19:22:14.268519176Z",
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
  "session_id": "825958c3-70ed-4398-a9d3-c32f0ce1c794",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk0MzQsImlhdCI6MTc5MzI1ODUzNCwianRpIjoiYTZiOWMxOWEtODNhZi00YmZmLWJmY2MtMmYyNDg5NmMzZjcwIiwic2lkIjoiODI1OTU4YzMtNzBlZC00Mzk4LWE5ZDMtYzMyZjBjZTFjNzk0In0.BReyvl3KWgOfFAfMl1948VxGoaDWemgsd9Y-zC3qlu0",
  "access_expires_at": "2026-10-29T07:37:14.84112609Z",
  "refresh_token": "9rGKspteLz-yJrvOdmE__fhpnn45Gua7xbd7gbIVEeo",
  "refresh_expires_at": "2026-10-29T19:22:14.840486841Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380684302665",
  "device_ref": "sandbox-26467"
}
```

```json
{
  "challenge_id": "98ea61a3-b1e2-48e5-8b2e-ab6fc5656402",
  "expires_at": "2026-10-29T07:27:15.114772827Z",
  "resend_available_at": "2026-10-29T07:22:16.114772827Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380684302665` → **200**

```json
{
  "phone": "+380684302665",
  "audience": "CLIENT",
  "code": "805897",
  "sent_at": "2026-10-29T07:22:15.117234875Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "98ea61a3-b1e2-48e5-8b2e-ab6fc5656402",
  "code": "805897",
  "device_ref": "sandbox-26467"
}
```

```json
{
  "session_id": "00fc60ec-c787-41cb-b841-55765b309cb7",
  "subject": {
    "type": "CLIENT",
    "id": "796f4e67-c20f-49b7-bd85-29d9d179632d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3OTZmNGU2Ny1jMjBmLTQ5YjctYmQ4NS0yOWQ5ZDE3OTYzMmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5NDM1LCJpYXQiOjE3OTMyNTg1MzUsImp0aSI6IjlmMjlmYWEwLWJkMGQtNGU4Yi04ZTcyLTY5NjNkYTZjZWVhZCIsInNpZCI6IjAwZmM2MGVjLWM3ODctNDFjYi1iODQxLTU1NzY1YjMwOWNiNyJ9.00jJGPOUgc4v5eVdwW5VMuT7ljLCmIsvfrAzH-zfLo0",
  "access_expires_at": "2026-10-29T07:37:15.426011538Z",
  "refresh_token": "Sd67f7AEFKbOAnPHGzLnCPvBR5-NQZHYiFTmAaWAAPo",
  "refresh_expires_at": "2026-11-28T07:22:15.425460315Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1106f58c-eefa-4dba-862a-feb6933939dd",
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
  "id": "48ec3dba-9db7-451a-87f8-d4ed0098d86c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:27:15.706297Z",
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
  "command_id": "d7974b32-5be7-4971-8094-03c865d8dcee",
  "quote_id": "48ec3dba-9db7-451a-87f8-d4ed0098d86c",
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
  "id": "53c7e37f-2488-4501-9a63-edfdecbcf5b0",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "796f4e67-c20f-49b7-bd85-29d9d179632d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:22:16.000384Z",
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
    "id": "dfdf8234-9303-4987-9e21-c4e8c0fa3aa3",
    "order_id": "53c7e37f-2488-4501-9a63-edfdecbcf5b0",
    "expires_at": "2026-10-29T07:22:31.004169Z",
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

`POST /api/driver/v1/offers/dfdf8234-9303-4987-9e21-c4e8c0fa3aa3/reject` → **204**

```json
{
  "command_id": "b3b3f375-9131-47aa-b55a-a17f9ac88a71"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "816bbadd-5535-496b-8b23-bc0c2ceff79c",
    "order_id": "53c7e37f-2488-4501-9a63-edfdecbcf5b0",
    "expires_at": "2026-10-29T07:22:31.587888Z",
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

`POST /api/driver/v1/offers/816bbadd-5535-496b-8b23-bc0c2ceff79c/accept` → **200**

```json
{
  "command_id": "575b2cbf-4f0c-4639-8719-e4eb9775b476"
}
```

```json
{
  "id": "2cb4867a-9d79-402d-a05a-072c303ae445",
  "order_id": "53c7e37f-2488-4501-9a63-edfdecbcf5b0",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a36b91da-c007-4c68-a24d-d0af5c56a11a",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/53c7e37f-2488-4501-9a63-edfdecbcf5b0/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T07:22:16.000921Z",
      "actor": {
        "type": "CLIENT",
        "id": "796f4e67-c20f-49b7-bd85-29d9d179632d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "53c7e37f-2488-4501-9a63-edfdecbcf5b0",
        "quote_id": "48ec3dba-9db7-451a-87f8-d4ed0098d86c",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "e866e08e-7903-443e-b729-c316f4145951"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T07:22:16.00329Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "53c7e37f-2488-4501-9a63-edfdecbcf5b0",
        "attempt_id": "f25d46a1-e04a-4326-aa4c-d699d00d466f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "e866e08e-7903-443e-b729-c316f4145951"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T07:22:16.010104Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "dfdf8234-9303-4987-9e21-c4e8c0fa3aa3",
        "order_id": "53c7e37f-2488-4501-9a63-edfdecbcf5b0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "e866e08e-7903-443e-b729-c316f4145951"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T07:22:16.586887Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "dfdf8234-9303-4987-9e21-c4e8c0fa3aa3",
        "order_id": "53c7e37f-2488-4501-9a63-edfdecbcf5b0"
      },
      "correlation_id": "e61dc794-d9d7-40c8-9505-146bcf11e1d6"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 53c7e37f-2488-4501-9a63-edfdecbcf5b0 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/53c7e37f-2488-4501-9a63-edfdecbcf5b0` → **200**

```json
{
  "id": "53c7e37f-2488-4501-9a63-edfdecbcf5b0",
  "short_number": 10,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "796f4e67-c20f-49b7-bd85-29d9d179632d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "2cb4867a-9d79-402d-a05a-072c303ae445",
    "order_id": "53c7e37f-2488-4501-9a63-edfdecbcf5b0",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "a36b91da-c007-4c68-a24d-d0af5c56a11a",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T07:22:16.000384Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/53c7e37f-2488-4501-9a63-edfdecbcf5b0/cancel` → **200**

```json
{
  "command_id": "1428ec94-9c73-4941-b1b0-69ebaab9e6be",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "53c7e37f-2488-4501-9a63-edfdecbcf5b0",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "796f4e67-c20f-49b7-bd85-29d9d179632d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "2cb4867a-9d79-402d-a05a-072c303ae445",
    "order_id": "53c7e37f-2488-4501-9a63-edfdecbcf5b0",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "a36b91da-c007-4c68-a24d-d0af5c56a11a",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T07:22:16.000384Z",
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
  "session_id": "82e94305-d489-4197-bcd1-e3ed55c718a3",
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
  "last_heartbeat_at": "2026-10-29T07:22:12.254535Z",
  "last_location_at": "2026-10-29T07:22:12.254535Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/82e94305-d489-4197-bcd1-e3ed55c718a3/close` → **200**

```json
{
  "command_id": "4cf63350-1e7c-4d92-8dd7-f9f52c9b04ed",
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
  "session_id": "19efbadd-bcb9-432a-b0dc-8a595a57b2aa",
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
  "last_heartbeat_at": "2026-10-29T07:22:13.698027Z",
  "last_location_at": "2026-10-29T07:22:13.698027Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/19efbadd-bcb9-432a-b0dc-8a595a57b2aa/close` → **200**

```json
{
  "command_id": "a048f9d8-45fb-4de1-adb5-cf59c933ab4e",
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
  "session_id": "8a526778-3b8b-42c9-89ff-82efc4c28d5c",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk0MzksImlhdCI6MTc5MzI1ODUzOSwianRpIjoiZmRmMGQ5OTUtZDU2Ni00ZjRiLWI5ODUtYzdhMjAwOTQxNzBmIiwic2lkIjoiOGE1MjY3NzgtM2I4Yi00MmM5LTg5ZmYtODJlZmM0YzI4ZDVjIn0.SRqBo5XXz8i-VAolrLqajSKmpLWp-lzH6FgKdjQw1Co",
  "access_expires_at": "2026-10-29T07:37:19.554443424Z",
  "refresh_token": "vGhA0-dO40muJaROfHQUl4Eh_3T-e_Zph1h7TejZVDs",
  "refresh_expires_at": "2026-10-29T19:22:19.553763071Z",
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
  "command_id": "11bca283-decf-4247-b404-e9b52ed27443",
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
  "changed_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T07:22:20.121568Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "ba346791-3619-4ae2-907a-9a0326b0dd76",
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
  "correlation_id": "4aabd264-b98b-4343-a11e-9782a0a9d204"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "1a048213-ab13-491d-95cb-3c59737cde94",
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
  "correlation_id": "aacd5751-0249-4bf5-b867-eab33a312333"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632282830",
  "device_ref": "sandbox-15442"
}
```

```json
{
  "challenge_id": "3a455f43-7f8d-4172-8917-cc849a367dbc",
  "expires_at": "2026-10-29T07:27:20.988294374Z",
  "resend_available_at": "2026-10-29T07:22:21.988294374Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632282830` → **200**

```json
{
  "phone": "+380632282830",
  "audience": "CLIENT",
  "code": "604132",
  "sent_at": "2026-10-29T07:22:20.991396891Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3a455f43-7f8d-4172-8917-cc849a367dbc",
  "code": "604132",
  "device_ref": "sandbox-15442"
}
```

```json
{
  "session_id": "e4731d14-3fa9-4ea7-9a89-28ac66ad7e3e",
  "subject": {
    "type": "CLIENT",
    "id": "02ce4ce6-ed18-48b3-a2de-0359ac429c00"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMmNlNGNlNi1lZDE4LTQ4YjMtYTJkZS0wMzU5YWM0MjljMDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5NDQxLCJpYXQiOjE3OTMyNTg1NDEsImp0aSI6Ijc5NzJmODFkLTRlNzgtNGU0OC05YTJkLWJlM2QxNGQ1MDFkYiIsInNpZCI6ImU0NzMxZDE0LTNmYTktNGVhNy05YTg5LTI4YWM2NmFkN2UzZSJ9.Z7fKjlms-EmVOyHqfcZFuKCqhGNacRDAPkmBPDfl4GY",
  "access_expires_at": "2026-10-29T07:37:21.331679356Z",
  "refresh_token": "7rmALMKSnlWApKaRigabqzHFLhRPPwycVl5ZhSvcv3s",
  "refresh_expires_at": "2026-11-28T07:22:21.331038858Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cfa51eca-c623-4525-adf6-795dce10ef66",
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
  "id": "02afc0a7-a571-427e-8b88-bf58317ac3af",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:27:21.612523Z",
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
  "command_id": "bee75c2e-d786-49fe-82e5-df324bb9272d",
  "quote_id": "02afc0a7-a571-427e-8b88-bf58317ac3af",
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
  "correlation_id": "c0d00638-1958-4d53-b286-07696fc0de94"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "7b6299c4-9270-46c9-ac42-be6604a33250",
  "quote_id": "02afc0a7-a571-427e-8b88-bf58317ac3af",
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
  "id": "536075b3-6820-4b14-ba94-2c63ea336be3",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02ce4ce6-ed18-48b3-a2de-0359ac429c00",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:22:22.183661Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/536075b3-6820-4b14-ba94-2c63ea336be3/cancel` → **200**

```json
{
  "command_id": "a8bab359-81ec-456c-8448-bce66c525437",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "536075b3-6820-4b14-ba94-2c63ea336be3",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "02ce4ce6-ed18-48b3-a2de-0359ac429c00",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:22:22.183661Z",
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
  "command_id": "0ea872e5-791b-475f-ac0b-dc1764d718e7",
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
  "changed_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T07:22:22.795641Z"
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
      "changed_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T07:22:22.795641Z"
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
  "device_ref": "sandbox-2940"
}
```

```json
{
  "challenge_id": "da4fbcf5-df58-4573-9be6-16000aa36992",
  "expires_at": "2026-10-29T07:27:23.650733057Z",
  "resend_available_at": "2026-10-29T07:22:24.650733057Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "122845",
  "sent_at": "2026-10-29T07:22:23.653224835Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "da4fbcf5-df58-4573-9be6-16000aa36992",
  "code": "122845",
  "device_ref": "sandbox-2940"
}
```

```json
{
  "session_id": "d63416f7-5a63-4084-9140-deb1c54c24bb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI1OTQ0MywiaWF0IjoxNzkzMjU4NTQzLCJqdGkiOiI4YWEwNzVhNi1iNTNmLTRjNmItYWNlMS0wY2ZlYTFjNmUwNjEiLCJzaWQiOiJkNjM0MTZmNy01YTYzLTQwODQtOTE0MC1kZWIxYzU0YzI0YmIifQ.cHoatGv66BTZpHMR2XlXKkG0tQqfbm9xdY9nyOpDkY4",
  "access_expires_at": "2026-10-29T07:37:23.951334475Z",
  "refresh_token": "vhd-5TbATDR6UVy7ydobObfBA6N9Er0Ur8Lbt8hsvP0",
  "refresh_expires_at": "2026-11-28T07:22:23.950694594Z",
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
  "command_id": "a4ee754e-2728-423d-8c3e-f39455a4fe49",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:22:24Z",
    "sequence": 1793258544507
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a13e3462-9356-4b70-b23f-6d3368b961e8",
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
  "last_heartbeat_at": "2026-10-29T07:22:24.526196Z",
  "last_location_at": "2026-10-29T07:22:24.526196Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671657620",
  "device_ref": "sandbox-5256"
}
```

```json
{
  "challenge_id": "1d34cbea-8217-4099-b17e-feb292ced986",
  "expires_at": "2026-10-29T07:27:24.815441202Z",
  "resend_available_at": "2026-10-29T07:22:25.815441202Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671657620` → **200**

```json
{
  "phone": "+380671657620",
  "audience": "CLIENT",
  "code": "289054",
  "sent_at": "2026-10-29T07:22:24.817602206Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1d34cbea-8217-4099-b17e-feb292ced986",
  "code": "289054",
  "device_ref": "sandbox-5256"
}
```

```json
{
  "session_id": "d4187e77-86c8-4c7f-9881-6a6458c79365",
  "subject": {
    "type": "CLIENT",
    "id": "691fe3ea-b729-415f-899f-7ca595077694"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTFmZTNlYS1iNzI5LTQxNWYtODk5Zi03Y2E1OTUwNzc2OTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5NDQ1LCJpYXQiOjE3OTMyNTg1NDUsImp0aSI6ImMxYjI0YTc5LTZmNmUtNDZjYy04N2U5LWQyOWY2ZDU1ZGNkZiIsInNpZCI6ImQ0MTg3ZTc3LTg2YzgtNGM3Zi05ODgxLTZhNjQ1OGM3OTM2NSJ9.n9KkK1SIDdN3bOnRVristEocHEuFUcN_eyn2negYm-U",
  "access_expires_at": "2026-10-29T07:37:25.122460742Z",
  "refresh_token": "bft-8OYLIB-CTY9YQv3E03v4A4pbSdruuDkMRv4tAZE",
  "refresh_expires_at": "2026-11-28T07:22:25.121832424Z",
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
  "command_id": "3a0e3786-1141-4b38-b7fb-0f35e6521dd0",
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
  "id": "dae28cc3-1c23-4916-b97b-90a75c7f3cc4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:27:25.685554Z",
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
  "command_id": "7a258c15-e8f5-4518-bf56-6112ceeff2e2",
  "platform": "ANDROID",
  "token": "sandbox-driver-ecb9f5d4-cb7b-4bdd-9f2e-59e71d10fedc"
}
```

```json
{
  "id": "b11d02ba-7f36-4c82-b673-c332285ec2c2",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T07:22:25.980085Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "17ed0c97-eaf7-42c2-bfcb-7d82c4883e61",
  "platform": "ANDROID",
  "token": "sandbox-rider-34a28893-0947-465a-acd6-daa00fc36f1d"
}
```

```json
{
  "id": "b217564e-e0b9-4899-b8f2-d237f447110f",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T07:22:26.263197Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "76669300-a23e-450e-b476-2d81bfd552dc",
  "quote_id": "dae28cc3-1c23-4916-b97b-90a75c7f3cc4",
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
  "id": "e714a1dc-473f-414b-9ceb-621a73e83300",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "691fe3ea-b729-415f-899f-7ca595077694",
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
  "created_at": "2026-10-29T07:22:26.555373Z",
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
    "id": "5969938d-fc57-4030-9f0f-db041e08ff19",
    "order_id": "e714a1dc-473f-414b-9ceb-621a73e83300",
    "expires_at": "2026-10-29T07:22:41.559131Z",
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

`POST /api/driver/v1/offers/5969938d-fc57-4030-9f0f-db041e08ff19/accept` → **200**

```json
{
  "command_id": "2269e00e-7758-47ef-b874-180cb34781fa"
}
```

```json
{
  "id": "4c697a6e-0335-4359-bf8a-98aad1a62761",
  "order_id": "e714a1dc-473f-414b-9ceb-621a73e83300",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "56ce34ca-551e-4c32-904d-d173a997a82f",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T07:22:26.531Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T07:22:26.531Z` → **200**

```json
[
  {
    "at": "2026-10-29T07:22:27.460914097Z",
    "token_suffix": "10fedc",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "940aff4f-3529-4525-b528-78309788bed9",
      "order_version": "2",
      "order_id": "e714a1dc-473f-414b-9ceb-621a73e83300",
      "type": "driver.offer",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380671657620&after=2026-10-29T07:22:26.531Z` → **200**

```json
[
  {
    "at": "2026-10-29T07:22:28.466658232Z",
    "token_suffix": "c36f1d",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "db98aafe-603f-4539-baf4-18ad3a399f0c",
      "order_version": "3",
      "order_id": "e714a1dc-473f-414b-9ceb-621a73e83300",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/e714a1dc-473f-414b-9ceb-621a73e83300/messages` → **201**

```json
{
  "command_id": "36b7d524-76cf-4c51-b23f-005497ab745a",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "c2c262cc-95a3-400f-816b-8eb5d20afa19",
  "order_id": "e714a1dc-473f-414b-9ceb-621a73e83300",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T07:22:28.536724472Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "56ce34ca-551e-4c32-904d-d173a997a82f",
  "order_id": "e714a1dc-473f-414b-9ceb-621a73e83300",
  "assignment_id": "4c697a6e-0335-4359-bf8a-98aad1a62761",
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

`POST /api/driver/v1/trips/56ce34ca-551e-4c32-904d-d173a997a82f/messages` → **201**

```json
{
  "command_id": "668fe887-c379-42a2-b54c-0eb4c873d9e9",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "9d381ca1-cc22-45b0-aa51-25741595fdd8",
  "order_id": "e714a1dc-473f-414b-9ceb-621a73e83300",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T07:22:29.095233065Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/e714a1dc-473f-414b-9ceb-621a73e83300/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/56ce34ca-551e-4c32-904d-d173a997a82f/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380671657620"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/a13e3462-9356-4b70-b23f-6d3368b961e8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:22:29Z",
    "sequence": 1793258549917
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a13e3462-9356-4b70-b23f-6d3368b961e8",
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
  "last_heartbeat_at": "2026-10-29T07:22:29.935767Z",
  "last_location_at": "2026-10-29T07:22:29.935767Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "56ce34ca-551e-4c32-904d-d173a997a82f",
  "order_id": "e714a1dc-473f-414b-9ceb-621a73e83300",
  "assignment_id": "4c697a6e-0335-4359-bf8a-98aad1a62761",
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

`POST /api/driver/v1/trips/56ce34ca-551e-4c32-904d-d173a997a82f/arrive` → **200**

```json
{
  "command_id": "d13831f3-ca31-4a0e-9db0-a23ea21805e9",
  "expected_version": 0
}
```

```json
{
  "id": "56ce34ca-551e-4c32-904d-d173a997a82f",
  "order_id": "e714a1dc-473f-414b-9ceb-621a73e83300",
  "assignment_id": "4c697a6e-0335-4359-bf8a-98aad1a62761",
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
  "arrived_at": "2026-10-29T07:22:30.507636Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/56ce34ca-551e-4c32-904d-d173a997a82f/start` → **200**

```json
{
  "command_id": "8af98e68-c28e-4d5d-82cc-011b16614e15",
  "expected_version": 1
}
```

```json
{
  "id": "56ce34ca-551e-4c32-904d-d173a997a82f",
  "order_id": "e714a1dc-473f-414b-9ceb-621a73e83300",
  "assignment_id": "4c697a6e-0335-4359-bf8a-98aad1a62761",
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
  "arrived_at": "2026-10-29T07:22:30.507636Z",
  "started_at": "2026-10-29T07:22:30.787871Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/a13e3462-9356-4b70-b23f-6d3368b961e8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:22:31Z",
    "sequence": 1793258551701
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a13e3462-9356-4b70-b23f-6d3368b961e8",
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
  "last_heartbeat_at": "2026-10-29T07:22:31.088592Z",
  "last_location_at": "2026-10-29T07:22:31.088592Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/56ce34ca-551e-4c32-904d-d173a997a82f/complete` → **200**

```json
{
  "command_id": "877014d9-583f-469a-81b1-90c29dfb2ec6",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:22:31Z",
  "cash_received": true
}
```

```json
{
  "id": "56ce34ca-551e-4c32-904d-d173a997a82f",
  "order_id": "e714a1dc-473f-414b-9ceb-621a73e83300",
  "assignment_id": "4c697a6e-0335-4359-bf8a-98aad1a62761",
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
  "arrived_at": "2026-10-29T07:22:30.507636Z",
  "started_at": "2026-10-29T07:22:30.787871Z",
  "completed_at": "2026-10-29T07:22:31.386503Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/e714a1dc-473f-414b-9ceb-621a73e83300` → **200**

```json
{
  "id": "e714a1dc-473f-414b-9ceb-621a73e83300",
  "short_number": 12,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "691fe3ea-b729-415f-899f-7ca595077694",
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
    "id": "4c697a6e-0335-4359-bf8a-98aad1a62761",
    "order_id": "e714a1dc-473f-414b-9ceb-621a73e83300",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "56ce34ca-551e-4c32-904d-d173a997a82f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T07:22:26.555373Z",
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
    "id": "e714a1dc-473f-414b-9ceb-621a73e83300",
    "short_number": 12,
    "status": "FULFILLED",
    "created_at": "2026-10-29T07:22:26.555373Z",
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
    "id": "56ce34ca-551e-4c32-904d-d173a997a82f",
    "order_id": "e714a1dc-473f-414b-9ceb-621a73e83300",
    "order_short_number": 12,
    "created_at": "2026-10-29T07:22:27.13759Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "23693b85-8688-4652-97e3-c189e17348b2",
    "order_id": "5a5d7d04-9381-4cd2-8134-7369d85f7dd6",
    "order_short_number": 8,
    "created_at": "2026-10-29T07:21:26.191893Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "4e90f4ba-a363-401d-ace8-7c1f81973f10",
    "order_id": "64e33138-bff1-4cdd-a6e6-fd499e7cdf21",
    "order_short_number": 3,
    "created_at": "2026-10-29T07:20:43.665069Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "7496a185-e952-477d-9b74-a8c356d48946",
    "order_id": "b08c447b-f1b8-4dcb-9bfc-c41c7e33b8c2",
    "order_short_number": 2,
    "created_at": "2026-10-29T07:20:22.085541Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "29499b55-226a-47f0-98f0-00561507ee4a",
    "order_id": "642e5eb9-1691-4340-8c27-fb2ebe13bc40",
    "order_short_number": 1,
    "created_at": "2026-10-29T07:20:12.391461Z",
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

`GET /api/rider/v1/orders/e714a1dc-473f-414b-9ceb-621a73e83300/tip` → **200**

```json
{
  "order_id": "e714a1dc-473f-414b-9ceb-621a73e83300",
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
  "available_until": "2026-10-30T07:22:31.386503Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/e714a1dc-473f-414b-9ceb-621a73e83300/tip` → **201**

```json
{
  "command_id": "bc004395-4923-4ad0-9227-d8ce3ca24c8e",
  "amount_minor": 1100
}
```

```json
{
  "id": "88eade71-52e2-4a87-8f8c-0caa44e98921",
  "order_id": "e714a1dc-473f-414b-9ceb-621a73e83300",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T07:22:36.378526Z"
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
  "session_id": "e7a1e029-6929-4e6a-9254-56af98035b83",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk0NTYsImlhdCI6MTc5MzI1ODU1NiwianRpIjoiMWFlNDY0YzQtMmMyZS00NTc3LTkzNmEtYTJiYjQ5YjQ0ZjFlIiwic2lkIjoiZTdhMWUwMjktNjkyOS00ZTZhLTkyNTQtNTZhZjk4MDM1YjgzIn0.u2dZF9vjDXqOBuyrCJMGby0s24zRh4EdzFrZ7hMKig4",
  "access_expires_at": "2026-10-29T07:37:36.948719945Z",
  "refresh_token": "jgnvDqPvDx9eATXi0R7Gr0jSq6h1zYI4tP13FXyXPYE",
  "refresh_expires_at": "2026-10-29T19:22:36.94813156Z",
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
          "CARD": 1,
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
      "CARD": 1,
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
  "generated_at": "2026-10-29T07:22:37.225325554Z"
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
  "generated_at": "2026-10-29T07:22:37.499952527Z"
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
  "session_id": "6ef5cad0-7349-4fa5-acde-0b69592b661b",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk0NTgsImlhdCI6MTc5MzI1ODU1OCwianRpIjoiMGI1YTU5YWMtYTc3OS00ZmM3LTk3OTktNjU2MTc5MGIxZTQ2Iiwic2lkIjoiNmVmNWNhZDAtNzM0OS00ZmE1LWFjZGUtMGI2OTU5MmI2NjFiIn0.OpdNkyysbRGu4JFFdmHdm86xkXQT22xkz9sRLS1LE3U",
  "access_expires_at": "2026-10-29T07:37:38.071825183Z",
  "refresh_token": "ciDcLrS32Sy1-4WP6yqQJQggLsq92YEjj6C8q8NWtSI",
  "refresh_expires_at": "2026-10-29T19:22:38.071127487Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e714a1dc-473f-414b-9ceb-621a73e83300/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T07:22:26.555957Z",
      "actor": {
        "type": "CLIENT",
        "id": "691fe3ea-b729-415f-899f-7ca595077694",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e714a1dc-473f-414b-9ceb-621a73e83300",
        "quote_id": "dae28cc3-1c23-4916-b97b-90a75c7f3cc4",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "f1da6ad8-2f17-4dc3-ad4e-03e665b19dd8"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T07:22:26.55828Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e714a1dc-473f-414b-9ceb-621a73e83300",
        "attempt_id": "eee812e5-5f15-4da6-b2f0-6a7966713d7a",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f1da6ad8-2f17-4dc3-ad4e-03e665b19dd8"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T07:22:26.561462Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "5969938d-fc57-4030-9f0f-db041e08ff19",
        "order_id": "e714a1dc-473f-414b-9ceb-621a73e83300",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "f1da6ad8-2f17-4dc3-ad4e-03e665b19dd8"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T07:22:27.139156Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "5969938d-fc57-4030-9f0f-db041e08ff19",
        "order_id": "e714a1dc-473f-414b-9ceb-621a73e83300",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "4c697a6e-0335-4359-bf8a-98aad1a62761"
      },
      "correlation_id": "a346a059-6e2d-4f30-b6b4-88ca8855ad69"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T07:22:38.631332166Z",
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
      "last_location_at": "2026-10-29T07:22:31.088592Z",
      "order_id": null
    }
  ]
}
```

Done: order e714a1dc-473f-414b-9ceb-621a73e83300.

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
  "session_id": "1a9f3bbc-2659-4e5f-8b9b-bc4d2ea95814",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk0NTksImlhdCI6MTc5MzI1ODU1OSwianRpIjoiYmU4YjRlOTYtYzY5Yy00YzhhLWJiNzMtNmU1MjFmMDQ4MGJlIiwic2lkIjoiMWE5ZjNiYmMtMjY1OS00ZTVmLThiOWItYmM0ZDJlYTk1ODE0In0.y01Uj4nIm8OPzguuCbPbw5QciDRcJVR0rBnIuqq7n90",
  "access_expires_at": "2026-10-29T07:37:39.230330111Z",
  "refresh_token": "sWmT4sLHSSbB94MMtP6HqLvGxz1k0Hf9fw86cBx4S48",
  "refresh_expires_at": "2026-10-29T19:22:39.229667183Z",
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
  "command_id": "7ce3c3a5-2a02-4509-9578-41aeb4f279fe",
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
  "timestamp": "2026-10-29T07:22:40.000+0000",
  "channel": {
    "id": "1730052000.2056919745",
    "linkedid": "1730052000.2056919745",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673075928"
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
  "timestamp": "2026-10-29T07:22:40.000+0000",
  "channel": {
    "id": "1730052000.2056919745",
    "linkedid": "1730052000.2056919745",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673075928"
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
  "session_id": "e38dc8cd-ecd7-4ef7-a0b2-f22edf0d3de4",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk0NjAsImlhdCI6MTc5MzI1ODU2MCwianRpIjoiY2IxNGY5MjEtODY0Yi00NGVmLTlkYmItOTE0YjZmOWIxYThjIiwic2lkIjoiZTM4ZGM4Y2QtZWNkNy00ZWY3LWEwYjItZjIyZWRmMGQzZGU0In0.FcVODb3y6bxSiaUbXwZNME8vyA__qDTlZvOfW9_mrvw",
  "access_expires_at": "2026-10-29T07:37:40.391773431Z",
  "refresh_token": "5fvGEyWJdaI08ffcJ9DjL5UGU5-Q7AncLBE_zIjiMnY",
  "refresh_expires_at": "2026-10-29T19:22:40.391184358Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "1e41c996-1a50-47ac-a78b-86dac7f851bf",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673075928",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T07:22:40Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/1e41c996-1a50-47ac-a78b-86dac7f851bf/answer` → **200**

```json
{
  "command_id": "f079ecac-9684-4785-892d-ba9bf5ab553a"
}
```

```json
{
  "id": "1e41c996-1a50-47ac-a78b-86dac7f851bf",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673075928",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
  "order_ids": [],
  "started_at": "2026-10-29T07:22:40Z",
  "answered_at": "2026-10-29T07:22:40.976958Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2056919745",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "9904d0d7-8148-4055-8b77-792313765565",
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
  "id": "a9e6115f-3b41-44e9-b1cb-32ae19059093",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:27:41.286444Z",
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
  "command_id": "aca7a834-773c-4fe9-b277-585fc829d1b1",
  "quote_id": "a9e6115f-3b41-44e9-b1cb-32ae19059093",
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
    "phone": "+380673075928"
  },
  "call_id": "1e41c996-1a50-47ac-a78b-86dac7f851bf"
}
```

```json
{
  "id": "9a9f76ae-7d9b-402c-8f86-99bb079526b4",
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
  "created_at": "2026-10-29T07:22:41.57775Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673075928"
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
    "id": "1730052000.2056919745",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "1e41c996-1a50-47ac-a78b-86dac7f851bf",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673075928",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
      "order_ids": [
        "9a9f76ae-7d9b-402c-8f86-99bb079526b4"
      ],
      "started_at": "2026-10-29T07:22:40Z",
      "answered_at": "2026-10-29T07:22:40.976958Z",
      "ended_at": "2026-10-29T07:22:41.894601Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "6774856b-2e61-4871-95af-e02aef9bcf1a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673730926",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
      "order_ids": [],
      "started_at": "2026-10-29T07:20:30.166692Z",
      "answered_at": "2026-10-29T07:20:30.484774Z",
      "ended_at": "2026-10-29T07:20:30.789328Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T07:20:38.015489Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/9a9f76ae-7d9b-402c-8f86-99bb079526b4` → **200**

```json
{
  "id": "9a9f76ae-7d9b-402c-8f86-99bb079526b4",
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
  "created_at": "2026-10-29T07:22:41.57775Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673075928"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/9a9f76ae-7d9b-402c-8f86-99bb079526b4` → **200**

```json
{
  "id": "9a9f76ae-7d9b-402c-8f86-99bb079526b4",
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
  "created_at": "2026-10-29T07:22:41.57775Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673075928"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/9a9f76ae-7d9b-402c-8f86-99bb079526b4/cancel` → **200**

```json
{
  "command_id": "bd3b527d-83b8-408d-9030-6783f96392ea",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "9a9f76ae-7d9b-402c-8f86-99bb079526b4",
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
  "created_at": "2026-10-29T07:22:41.57775Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673075928"
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

Done: call 1e41c996-1a50-47ac-a78b-86dac7f851bf with order 9a9f76ae-7d9b-402c-8f86-99bb079526b4.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15430"
}
```

```json
{
  "challenge_id": "938f055c-1170-46f2-ad1c-656ff255fa1b",
  "expires_at": "2026-10-29T07:27:43.100445996Z",
  "resend_available_at": "2026-10-29T07:22:44.100445996Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "815100",
  "sent_at": "2026-10-29T07:22:43.103239314Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "938f055c-1170-46f2-ad1c-656ff255fa1b",
  "code": "815100",
  "device_ref": "sandbox-15430"
}
```

```json
{
  "session_id": "2ebb7591-16dd-4b3e-aa0b-7ea6d076c044",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI1OTQ2MywiaWF0IjoxNzkzMjU4NTYzLCJqdGkiOiIzYjU1ZjdmYi1kODg4LTRhMDEtYWQ5Ni1hNzAwMDhlN2UyNmUiLCJzaWQiOiIyZWJiNzU5MS0xNmRkLTRiM2UtYWEwYi03ZWE2ZDA3NmMwNDQifQ.UFXMjQrM8TPsIvrCv1s0nWh3XBxH2kXbXSkS3YWoM0A",
  "access_expires_at": "2026-10-29T07:37:43.406445133Z",
  "refresh_token": "U87qM9zU03_Y1BhbzEnFnFTMwZrbqxVZhPvj_y047pY",
  "refresh_expires_at": "2026-11-28T07:22:43.405832189Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a13e3462-9356-4b70-b23f-6d3368b961e8",
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
  "last_heartbeat_at": "2026-10-29T07:22:31.088592Z",
  "last_location_at": "2026-10-29T07:22:31.088592Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a13e3462-9356-4b70-b23f-6d3368b961e8/handover` → **200**

```json
{
  "command_id": "4dc9a051-8508-4b73-82aa-36553b7bc316",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a13e3462-9356-4b70-b23f-6d3368b961e8",
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
  "last_heartbeat_at": "2026-10-29T07:22:31.088592Z",
  "last_location_at": "2026-10-29T07:22:31.088592Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a13e3462-9356-4b70-b23f-6d3368b961e8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:22:44Z",
    "sequence": 1793258564248
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a13e3462-9356-4b70-b23f-6d3368b961e8",
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
  "last_heartbeat_at": "2026-10-29T07:22:44.266949Z",
  "last_location_at": "2026-10-29T07:22:44.266949Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666242285",
  "device_ref": "sandbox-10714"
}
```

```json
{
  "challenge_id": "7416b73f-422c-4faa-8202-a2cbc328a91f",
  "expires_at": "2026-10-29T07:27:44.54410127Z",
  "resend_available_at": "2026-10-29T07:22:45.54410127Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666242285` → **200**

```json
{
  "phone": "+380666242285",
  "audience": "CLIENT",
  "code": "633068",
  "sent_at": "2026-10-29T07:22:44.546253548Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7416b73f-422c-4faa-8202-a2cbc328a91f",
  "code": "633068",
  "device_ref": "sandbox-10714"
}
```

```json
{
  "session_id": "adc91219-f8ff-41ef-9ee7-1d493b078c00",
  "subject": {
    "type": "CLIENT",
    "id": "8c202951-d77c-4159-973e-b456d942075f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YzIwMjk1MS1kNzdjLTQxNTktOTczZS1iNDU2ZDk0MjA3NWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5NDY0LCJpYXQiOjE3OTMyNTg1NjQsImp0aSI6ImFhMWE2NzZkLTk2YTgtNDNlMS04N2IwLTc3NDZlOGI2ZDNmNiIsInNpZCI6ImFkYzkxMjE5LWY4ZmYtNDFlZi05ZWU3LTFkNDkzYjA3OGMwMCJ9.g5O9TKFFUGUVrv59URT1QmCAmyeShD84xJQpF5aRr3Q",
  "access_expires_at": "2026-10-29T07:37:44.846044544Z",
  "refresh_token": "aEKaDFnlai2mM3WlQsB-fuzf04kNNIWvXSru-peaTwE",
  "refresh_expires_at": "2026-11-28T07:22:44.845521564Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "135d5569-f24f-4a80-8589-dea88a770548",
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
  "id": "ed48802b-8c06-4f3e-b866-ba0be1076c71",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:27:45.127238Z",
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
  "command_id": "b0d0a3cf-9195-49a2-98e3-7f9afefdcf39",
  "quote_id": "ed48802b-8c06-4f3e-b866-ba0be1076c71",
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
  "id": "25d10885-b7db-4310-a873-39741543d8c2",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8c202951-d77c-4159-973e-b456d942075f",
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
  "created_at": "2026-10-29T07:22:45.433615Z",
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
    "id": "942d1e8e-24dc-4499-8bdc-58b5bd8d9d42",
    "order_id": "25d10885-b7db-4310-a873-39741543d8c2",
    "expires_at": "2026-10-29T07:23:00.436619Z",
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

`POST /api/driver/v1/offers/942d1e8e-24dc-4499-8bdc-58b5bd8d9d42/accept` → **200**

```json
{
  "command_id": "ae41b042-0437-45cc-83fa-59ef2daa9916"
}
```

```json
{
  "id": "821b075e-3826-4c5f-9b6c-93417f83272d",
  "order_id": "25d10885-b7db-4310-a873-39741543d8c2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f12afb96-f1a4-4529-83da-097742bd3cc6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f12afb96-f1a4-4529-83da-097742bd3cc6",
  "order_id": "25d10885-b7db-4310-a873-39741543d8c2",
  "assignment_id": "821b075e-3826-4c5f-9b6c-93417f83272d",
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

`POST /api/driver/v1/work-sessions/a13e3462-9356-4b70-b23f-6d3368b961e8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:22:46Z",
    "sequence": 1793258566585
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a13e3462-9356-4b70-b23f-6d3368b961e8",
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
  "last_heartbeat_at": "2026-10-29T07:22:46.603748Z",
  "last_location_at": "2026-10-29T07:22:46.603748Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f12afb96-f1a4-4529-83da-097742bd3cc6/arrive` → **200**

```json
{
  "command_id": "394430c8-0f2b-4b13-8f9d-51fbbe9ae17b",
  "expected_version": 0
}
```

```json
{
  "id": "f12afb96-f1a4-4529-83da-097742bd3cc6",
  "order_id": "25d10885-b7db-4310-a873-39741543d8c2",
  "assignment_id": "821b075e-3826-4c5f-9b6c-93417f83272d",
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
  "arrived_at": "2026-10-29T07:22:46.886337Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f12afb96-f1a4-4529-83da-097742bd3cc6/start` → **200**

```json
{
  "command_id": "0066ade3-239f-4545-aff7-982c5f475370",
  "expected_version": 1
}
```

```json
{
  "id": "f12afb96-f1a4-4529-83da-097742bd3cc6",
  "order_id": "25d10885-b7db-4310-a873-39741543d8c2",
  "assignment_id": "821b075e-3826-4c5f-9b6c-93417f83272d",
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
  "arrived_at": "2026-10-29T07:22:46.886337Z",
  "started_at": "2026-10-29T07:22:47.172189Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/a13e3462-9356-4b70-b23f-6d3368b961e8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:22:47Z",
    "sequence": 1793258567455
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a13e3462-9356-4b70-b23f-6d3368b961e8",
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
  "last_heartbeat_at": "2026-10-29T07:22:47.474014Z",
  "last_location_at": "2026-10-29T07:22:47.474014Z",
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
  "device_ref": "sandbox-22575"
}
```

```json
{
  "challenge_id": "5cb7fbf6-2917-4ed8-a350-e5906cd9763f",
  "expires_at": "2026-10-29T07:27:47.747278079Z",
  "resend_available_at": "2026-10-29T07:22:48.747278079Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "248303",
  "sent_at": "2026-10-29T07:22:47.749740283Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5cb7fbf6-2917-4ed8-a350-e5906cd9763f",
  "code": "248303",
  "device_ref": "sandbox-22575"
}
```

```json
{
  "session_id": "fbecbe2b-87a9-4501-8d8f-325c6c6b4be6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI1OTQ2OCwiaWF0IjoxNzkzMjU4NTY4LCJqdGkiOiJjNjY3OTk1OC0wYzNmLTRmMGEtOTk4NS00NzU5YWEzNWQ0ZDAiLCJzaWQiOiJmYmVjYmUyYi04N2E5LTQ1MDEtOGQ4Zi0zMjVjNmM2YjRiZTYifQ.QoOfxuKFvB7JF5pyRawIVBGFMhWN5Fg1SqLGMDqtF5E",
  "access_expires_at": "2026-10-29T07:37:48.059984788Z",
  "refresh_token": "aQhrwW-psTl-qlrtXHuWnoJe1eDuGngUezWhm36qZqk",
  "refresh_expires_at": "2026-11-28T07:22:48.059400333Z",
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
  "command_id": "ce14a832-cdf3-491a-89bd-c6607b5b696a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:22:48Z",
    "sequence": 1793258568618
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a92fee64-5337-49a4-8582-eef11375fba8",
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
  "last_heartbeat_at": "2026-10-29T07:22:48.637771Z",
  "last_location_at": "2026-10-29T07:22:48.637771Z",
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
  "session_id": "8edc452e-ccbe-4c46-9381-74869376ad23",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk0NjksImlhdCI6MTc5MzI1ODU2OSwianRpIjoiMDdlMjEyMDQtNTlhOC00OGE0LWIyYjQtNzEwZTgwOThmMGVmIiwic2lkIjoiOGVkYzQ1MmUtY2NiZS00YzQ2LTkzODEtNzQ4NjkzNzZhZDIzIn0.pTzFCiZH1dMdl_RyWJ2az6G-rkwx5jaZhe-ZDrMu8do",
  "access_expires_at": "2026-10-29T07:37:49.210616712Z",
  "refresh_token": "cFja_uNMn9I0CA1tBJoWryiDCKdwHBGmzUQxjM1hgCQ",
  "refresh_expires_at": "2026-10-29T19:22:49.210081068Z",
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
  "session_id": "4c0cf521-e48b-4427-8c31-8fe7a29ad220",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk0NjksImlhdCI6MTc5MzI1ODU2OSwianRpIjoiYWFkOWQxMDgtOGQ4Yy00YTQzLTgzMGYtMmM4NWRkOWUyZWE0Iiwic2lkIjoiNGMwY2Y1MjEtZTQ4Yi00NDI3LThjMzEtOGZlN2EyOWFkMjIwIn0.pV6tk4MyuFVYupa3T68rfmPgau5x4NgSsWe6PwA8Efs",
  "access_expires_at": "2026-10-29T07:37:49.766632913Z",
  "refresh_token": "cwckFBdV2LRUhKW3-2JMKzD7j2tzkd8kAkThhsolN7A",
  "refresh_expires_at": "2026-10-29T19:22:49.766064878Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/25d10885-b7db-4310-a873-39741543d8c2` → **200**

```json
{
  "id": "25d10885-b7db-4310-a873-39741543d8c2",
  "short_number": 14,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "8c202951-d77c-4159-973e-b456d942075f",
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
    "id": "821b075e-3826-4c5f-9b6c-93417f83272d",
    "order_id": "25d10885-b7db-4310-a873-39741543d8c2",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "f12afb96-f1a4-4529-83da-097742bd3cc6",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T07:22:45.433615Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/25d10885-b7db-4310-a873-39741543d8c2/interrupt` → **200**

```json
{
  "command_id": "62d86e9a-3d93-428d-8a1d-f80f16522671",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "25d10885-b7db-4310-a873-39741543d8c2",
    "short_number": 14,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "8c202951-d77c-4159-973e-b456d942075f",
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
      "id": "821b075e-3826-4c5f-9b6c-93417f83272d",
      "order_id": "25d10885-b7db-4310-a873-39741543d8c2",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "f12afb96-f1a4-4529-83da-097742bd3cc6",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T07:22:45.433615Z",
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
    "id": "338f1974-1840-45f7-8d6f-6cd12abe4af0",
    "short_number": 15,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "8c202951-d77c-4159-973e-b456d942075f",
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
    "id": "2f5550d2-e3a7-44a6-95b2-27093c50d562",
    "order_id": "338f1974-1840-45f7-8d6f-6cd12abe4af0",
    "expires_at": "2026-10-29T07:23:05.361633Z",
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

`POST /api/driver/v1/offers/2f5550d2-e3a7-44a6-95b2-27093c50d562/accept` → **200**

```json
{
  "command_id": "86ae02a4-4b78-4163-a46f-0f824359e27a"
}
```

```json
{
  "id": "07515202-4d97-4f73-96ef-41cecf056f63",
  "order_id": "338f1974-1840-45f7-8d6f-6cd12abe4af0",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6457156a-46b1-4351-86e8-6e5a7baea008",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6457156a-46b1-4351-86e8-6e5a7baea008",
  "order_id": "338f1974-1840-45f7-8d6f-6cd12abe4af0",
  "assignment_id": "07515202-4d97-4f73-96ef-41cecf056f63",
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
  "session_id": "a92fee64-5337-49a4-8582-eef11375fba8",
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
  "last_heartbeat_at": "2026-10-29T07:22:48.637771Z",
  "last_location_at": "2026-10-29T07:22:48.637771Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/a92fee64-5337-49a4-8582-eef11375fba8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:22:51Z",
    "sequence": 1793258571837
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a92fee64-5337-49a4-8582-eef11375fba8",
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
  "last_heartbeat_at": "2026-10-29T07:22:51.856102Z",
  "last_location_at": "2026-10-29T07:22:51.856102Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6457156a-46b1-4351-86e8-6e5a7baea008/arrive` → **200**

```json
{
  "command_id": "e1af31b1-79da-4911-94ef-31644ec23d29",
  "expected_version": 0
}
```

```json
{
  "id": "6457156a-46b1-4351-86e8-6e5a7baea008",
  "order_id": "338f1974-1840-45f7-8d6f-6cd12abe4af0",
  "assignment_id": "07515202-4d97-4f73-96ef-41cecf056f63",
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
  "arrived_at": "2026-10-29T07:22:52.141902Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6457156a-46b1-4351-86e8-6e5a7baea008/start` → **200**

```json
{
  "command_id": "922c59b6-2066-4de7-bc21-b61b4649afbf",
  "expected_version": 1
}
```

```json
{
  "id": "6457156a-46b1-4351-86e8-6e5a7baea008",
  "order_id": "338f1974-1840-45f7-8d6f-6cd12abe4af0",
  "assignment_id": "07515202-4d97-4f73-96ef-41cecf056f63",
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
  "arrived_at": "2026-10-29T07:22:52.141902Z",
  "started_at": "2026-10-29T07:22:52.448822Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6457156a-46b1-4351-86e8-6e5a7baea008/complete` → **200**

```json
{
  "command_id": "51aa13c6-b185-433b-970b-841d924d09d1",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:22:52Z"
}
```

```json
{
  "id": "6457156a-46b1-4351-86e8-6e5a7baea008",
  "order_id": "338f1974-1840-45f7-8d6f-6cd12abe4af0",
  "assignment_id": "07515202-4d97-4f73-96ef-41cecf056f63",
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
  "arrived_at": "2026-10-29T07:22:52.141902Z",
  "started_at": "2026-10-29T07:22:52.448822Z",
  "completed_at": "2026-10-29T07:22:52.738288Z",
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
    "id": "338f1974-1840-45f7-8d6f-6cd12abe4af0",
    "short_number": 15,
    "status": "FULFILLED",
    "created_at": "2026-10-29T07:22:50.351642Z",
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
    "id": "25d10885-b7db-4310-a873-39741543d8c2",
    "short_number": 14,
    "status": "CANCELLED",
    "created_at": "2026-10-29T07:22:45.433615Z",
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

`GET /api/operator/v1/orders/25d10885-b7db-4310-a873-39741543d8c2/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T07:22:45.434127Z",
      "actor": {
        "type": "CLIENT",
        "id": "8c202951-d77c-4159-973e-b456d942075f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "25d10885-b7db-4310-a873-39741543d8c2",
        "quote_id": "ed48802b-8c06-4f3e-b866-ba0be1076c71",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "7c9efe21-f1db-4dcb-bb67-36b6e337b820"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T07:22:45.435911Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "25d10885-b7db-4310-a873-39741543d8c2",
        "attempt_id": "47f33058-6b9b-4737-99dc-54b4653679c5",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "7c9efe21-f1db-4dcb-bb67-36b6e337b820"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T07:22:45.438588Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "942d1e8e-24dc-4499-8bdc-58b5bd8d9d42",
        "order_id": "25d10885-b7db-4310-a873-39741543d8c2",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "7c9efe21-f1db-4dcb-bb67-36b6e337b820"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T07:22:46.040895Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "942d1e8e-24dc-4499-8bdc-58b5bd8d9d42",
        "order_id": "25d10885-b7db-4310-a873-39741543d8c2",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "821b075e-3826-4c5f-9b6c-93417f83272d"
      },
      "correlation_id": "a55ef11c-5245-43c8-a640-152b8604278b"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/338f1974-1840-45f7-8d6f-6cd12abe4af0/tip` → **200**

```json
{
  "order_id": "338f1974-1840-45f7-8d6f-6cd12abe4af0",
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
  "available_until": "2026-10-30T07:22:52.738288Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/338f1974-1840-45f7-8d6f-6cd12abe4af0/tip` → **409**

```json
{
  "command_id": "305e1059-4dd2-419c-aaee-fb55a6947b88",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/338f1974-1840-45f7-8d6f-6cd12abe4af0/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "abcdd10a-4dc5-4ba4-99e3-d385e2c13733"
}
```

Done: interrupted 25d10885-b7db-4310-a873-39741543d8c2, follow-up 338f1974-1840-45f7-8d6f-6cd12abe4af0.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a13e3462-9356-4b70-b23f-6d3368b961e8",
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
  "last_heartbeat_at": "2026-10-29T07:22:47.474014Z",
  "last_location_at": "2026-10-29T07:22:47.474014Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a13e3462-9356-4b70-b23f-6d3368b961e8/close` → **200**

```json
{
  "command_id": "78fc986c-7e15-4870-a781-3707f2b436f6",
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
  "session_id": "a92fee64-5337-49a4-8582-eef11375fba8",
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
  "last_heartbeat_at": "2026-10-29T07:22:51.856102Z",
  "last_location_at": "2026-10-29T07:22:51.856102Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a92fee64-5337-49a4-8582-eef11375fba8/close` → **200**

```json
{
  "command_id": "f96dfb22-d314-4e68-9650-57d7d2bb1a9a",
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
  "session_id": "36a45a47-0078-45aa-aaf0-deedecc7f6cb",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk0NzgsImlhdCI6MTc5MzI1ODU3OCwianRpIjoiNzA2MWNlNjgtZWU2NS00ZDU2LTk5N2QtMWUxZmQyNDhjZjNlIiwic2lkIjoiMzZhNDVhNDctMDA3OC00NWFhLWFhZjAtZGVlZGVjYzdmNmNiIn0.e7gg1b9gQC40vZfhCRCstAmuQSUE_jZbJGASFWmrQuA",
  "access_expires_at": "2026-10-29T07:37:58.875958581Z",
  "refresh_token": "QtMvwFawHxaBXSsgVmsqMTGIBl1WBQArVK9sbiMkRXA",
  "refresh_expires_at": "2026-10-29T19:22:58.875412908Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "400311ce-1925-49d4-b89b-56308b03509b",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T07:22:59Z"
}
```

```json
{
  "id": "28a453b0-f716-426b-b47f-24795f97c614",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T07:22:59Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/28a453b0-f716-426b-b47f-24795f97c614/publish` → **200**

```json
{
  "command_id": "a68978ab-8d4e-4124-9e8e-1221f00071aa",
  "expected_version": 0
}
```

```json
{
  "id": "28a453b0-f716-426b-b47f-24795f97c614",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T07:22:59.464279Z",
  "published_at": "2026-10-29T07:22:59.464279Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "28a453b0-f716-426b-b47f-24795f97c614",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T07:22:59.464279Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635299730",
  "device_ref": "sandbox-24302"
}
```

```json
{
  "challenge_id": "cae8c4d2-8f63-4755-877b-81090e4651bc",
  "expires_at": "2026-10-29T07:28:00.018293614Z",
  "resend_available_at": "2026-10-29T07:23:01.018293614Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635299730` → **200**

```json
{
  "phone": "+380635299730",
  "audience": "CLIENT",
  "code": "693567",
  "sent_at": "2026-10-29T07:23:00.021133838Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cae8c4d2-8f63-4755-877b-81090e4651bc",
  "code": "693567",
  "device_ref": "sandbox-24302"
}
```

```json
{
  "session_id": "7bdd1464-578c-46c8-9a39-16414081b23e",
  "subject": {
    "type": "CLIENT",
    "id": "40e0943d-65d6-4bb0-97a9-21c9a05f4385"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MGUwOTQzZC02NWQ2LTRiYjAtOTdhOS0yMWM5YTA1ZjQzODUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5NDgwLCJpYXQiOjE3OTMyNTg1ODAsImp0aSI6IjRlZTFlZTQ0LTE3ZmEtNGVkNC1hMDFjLTBmMmM4NTc0YjhlNSIsInNpZCI6IjdiZGQxNDY0LTU3OGMtNDZjOC05YTM5LTE2NDE0MDgxYjIzZSJ9.bP5H4xAzUi1_9Yjz06ZKoO6bXSxAmFGg0esMkZzzor8",
  "access_expires_at": "2026-10-29T07:38:00.313628063Z",
  "refresh_token": "BM2e-HHOB-jXTpHaxQYjaE0Qo3VT7sIWsE1ufpjXl38",
  "refresh_expires_at": "2026-11-28T07:23:00.313122565Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "28a453b0-f716-426b-b47f-24795f97c614",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T07:22:59.464279Z",
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
  "command_id": "ec2137ba-4610-4d6f-828c-45b7106aa8ac",
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
  "id": "64a2b781-35d1-4b0a-b2cc-cc93ded78221",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:28:00.875736Z",
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
  "command_id": "d97fed6a-8059-4147-a289-8627410729d8",
  "quote_id": "64a2b781-35d1-4b0a-b2cc-cc93ded78221",
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
  "correlation_id": "5042c383-c1ba-45ee-863c-419c8424580d"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "c20c3222-b12f-4c57-a44a-2108b5351f16",
  "version_id": "28a453b0-f716-426b-b47f-24795f97c614",
  "language": "uk"
}
```

```json
{
  "version_id": "28a453b0-f716-426b-b47f-24795f97c614",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T07:23:01.451121Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e83d9c56-57e4-47bd-8360-a644f2a77d13",
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
  "id": "65ad57fd-e524-41d2-91ee-69b826aba9d9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:28:01.723103Z",
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
  "command_id": "84e3285f-8c0a-4468-bea1-5232508a50f0",
  "quote_id": "65ad57fd-e524-41d2-91ee-69b826aba9d9",
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
  "id": "3022ba8e-6867-4493-9c94-874d74275aaf",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "40e0943d-65d6-4bb0-97a9-21c9a05f4385",
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
  "created_at": "2026-10-29T07:23:02.021825Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3022ba8e-6867-4493-9c94-874d74275aaf` → **200**

```json
{
  "id": "3022ba8e-6867-4493-9c94-874d74275aaf",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "40e0943d-65d6-4bb0-97a9-21c9a05f4385",
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
  "created_at": "2026-10-29T07:23:02.021825Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3022ba8e-6867-4493-9c94-874d74275aaf/cancel` → **200**

```json
{
  "command_id": "5af8a208-7ad4-409a-887b-f113fd1d95b2",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3022ba8e-6867-4493-9c94-874d74275aaf",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "40e0943d-65d6-4bb0-97a9-21c9a05f4385",
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
  "created_at": "2026-10-29T07:23:02.021825Z",
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

`POST /api/admin/v1/legal-documents/28a453b0-f716-426b-b47f-24795f97c614` → **409**

```json
{
  "command_id": "64705e2a-e068-4e47-8fcd-04c42ae7eab9",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T07:23:02Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/28a453b0-f716-426b-b47f-24795f97c614",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "2cd2a6e8-d4f7-4049-97fc-f67b8e30a97a"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "31d74e1a-dca9-4a8f-909a-7081f3c254dd",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T07:23:03Z"
}
```

```json
{
  "id": "414cf28e-e2b8-45b2-b4b4-77277f432691",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T07:23:03Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/414cf28e-e2b8-45b2-b4b4-77277f432691/publish` → **200**

```json
{
  "command_id": "cf45c2e3-65e4-416d-b67e-05ee3329d9f1",
  "expected_version": 0
}
```

```json
{
  "id": "414cf28e-e2b8-45b2-b4b4-77277f432691",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T07:23:03.497903Z",
  "published_at": "2026-10-29T07:23:03.497903Z",
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
  "device_ref": "sandbox-42"
}
```

```json
{
  "challenge_id": "c3ae7ee8-5edd-43ce-baad-42064e169c10",
  "expires_at": "2026-10-29T07:28:03.781654192Z",
  "resend_available_at": "2026-10-29T07:23:04.781654192Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "300663",
  "sent_at": "2026-10-29T07:23:03.783904599Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c3ae7ee8-5edd-43ce-baad-42064e169c10",
  "code": "300663",
  "device_ref": "sandbox-42"
}
```

```json
{
  "session_id": "9d03bdeb-3c84-4a5a-835d-5b21ede7a80f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI1OTQ4NCwiaWF0IjoxNzkzMjU4NTg0LCJqdGkiOiIxNzYyOGJmZC02MjVhLTQyYjUtOTU0Ni0zMzcxNjgwZTE4ODgiLCJzaWQiOiI5ZDAzYmRlYi0zYzg0LTRhNWEtODM1ZC01YjIxZWRlN2E4MGYifQ.ukapLbkVZUxXB_F1JQbGzcJHYjMJEYtJSHLC9K2na3U",
  "access_expires_at": "2026-10-29T07:38:04.082927729Z",
  "refresh_token": "LXhShWlo2CdlSFIcF_scOt8ynGkfB02qnkDdNYlZdwg",
  "refresh_expires_at": "2026-11-28T07:23:04.082423173Z",
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
  "command_id": "ee8def5e-99b6-416d-92c2-b37c87f80239",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:23:04Z",
    "sequence": 1793258584624
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "01511acb-479b-48ee-af0d-bb24e8c7dbe4",
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
  "last_heartbeat_at": "2026-10-29T07:23:04.642803Z",
  "last_location_at": "2026-10-29T07:23:04.642803Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673638906",
  "device_ref": "sandbox-24600"
}
```

```json
{
  "challenge_id": "2829836e-6e36-43cb-a538-d519b4a80e72",
  "expires_at": "2026-10-29T07:28:04.920904996Z",
  "resend_available_at": "2026-10-29T07:23:05.920904996Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673638906` → **200**

```json
{
  "phone": "+380673638906",
  "audience": "CLIENT",
  "code": "355299",
  "sent_at": "2026-10-29T07:23:04.923129205Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2829836e-6e36-43cb-a538-d519b4a80e72",
  "code": "355299",
  "device_ref": "sandbox-24600"
}
```

```json
{
  "session_id": "5512a2ca-f4c0-4c8d-a071-8dfa1e287ced",
  "subject": {
    "type": "CLIENT",
    "id": "50816c0c-a5cb-4c16-9616-119417c84b86"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MDgxNmMwYy1hNWNiLTRjMTYtOTYxNi0xMTk0MTdjODRiODYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5NDg1LCJpYXQiOjE3OTMyNTg1ODUsImp0aSI6IjFhNjdmY2Q5LTBmMTktNDQyZi04MTk5LWI3Zjc4ZDk5ZDZkMiIsInNpZCI6IjU1MTJhMmNhLWY0YzAtNGM4ZC1hMDcxLThkZmExZTI4N2NlZCJ9.nB_HV4g1SmTjYsHEGA-D-DuoOkvTW9rglWamE28N9-s",
  "access_expires_at": "2026-10-29T07:38:05.223109617Z",
  "refresh_token": "UIja4HPhUw6xBDkFcLOhOva776fHtGHPrRhwCnutFZE",
  "refresh_expires_at": "2026-11-28T07:23:05.222208745Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4cc6d97a-a160-4b73-b7da-577f491cba49",
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
  "id": "5eb51d3c-9e90-490c-a11b-c371065f12e7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:28:05.510825Z",
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
  "command_id": "e4afbfd0-57e5-44c9-b25b-7501c4a483a3",
  "quote_id": "5eb51d3c-9e90-490c-a11b-c371065f12e7",
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
    "phone": "+380670874254"
  }
}
```

```json
{
  "id": "4b625205-4fe4-44c8-aef7-443b7d20fb06",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "50816c0c-a5cb-4c16-9616-119417c84b86",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:23:05.815901Z",
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
    "id": "14e54e28-275e-4271-b7c9-329aef832299",
    "order_id": "4b625205-4fe4-44c8-aef7-443b7d20fb06",
    "expires_at": "2026-10-29T07:23:20.820492Z",
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

`POST /api/driver/v1/offers/14e54e28-275e-4271-b7c9-329aef832299/accept` → **200**

```json
{
  "command_id": "fdeb6704-f673-4862-b6bc-1ab104927b16"
}
```

```json
{
  "id": "586e27f2-eb8f-4697-8cc6-d5597c9bea01",
  "order_id": "4b625205-4fe4-44c8-aef7-443b7d20fb06",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2a435929-e519-448a-a762-cc22595f602e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2a435929-e519-448a-a762-cc22595f602e",
  "order_id": "4b625205-4fe4-44c8-aef7-443b7d20fb06",
  "assignment_id": "586e27f2-eb8f-4697-8cc6-d5597c9bea01",
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
    "phone": "+380670874254"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "39668966-2d63-4233-94d0-18b97204b436",
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
  "id": "e14da6ca-53b3-4ff1-8aed-a1857d968192",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:28:07.005460Z",
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
  "command_id": "5f5e5577-a91f-46d3-8cba-46b1db9a4070",
  "quote_id": "e14da6ca-53b3-4ff1-8aed-a1857d968192",
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
  "id": "77acf0d4-b35f-4ccf-adba-9dadf8a58312",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "50816c0c-a5cb-4c16-9616-119417c84b86",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:23:07.297645Z",
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
  "command_id": "f788c034-aede-4e7e-a4f4-ed0d7efa1500",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T10:23:07Z"
}
```

```json
{
  "id": "4f6e6b5c-d3d1-45b7-808a-b34ccacddf8b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:28:07.620943Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T10:23:07Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8e141378-f077-4216-804f-cb33f279ca32",
  "quote_id": "4f6e6b5c-d3d1-45b7-808a-b34ccacddf8b",
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
  "pickup_at": "2026-10-29T10:23:07Z"
}
```

```json
{
  "id": "6b77a53f-09da-460b-971e-334934a771e9",
  "short_number": 19,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "50816c0c-a5cb-4c16-9616-119417c84b86",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T07:23:07.909735Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T10:23:07Z",
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
  "command_id": "a4ccbb66-dcd9-4729-b275-caf3316dccf9",
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
  "id": "73e058e4-3bdc-4bf1-8a46-2a8dfe11aa5a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:28:08.209618Z",
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
  "command_id": "3442b632-be75-433a-8d24-bd32a34a2f57",
  "quote_id": "73e058e4-3bdc-4bf1-8a46-2a8dfe11aa5a",
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
  "correlation_id": "f71abc95-1288-4e89-a07b-229f02c62ce6"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "6b77a53f-09da-460b-971e-334934a771e9",
      "short_number": 19,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "50816c0c-a5cb-4c16-9616-119417c84b86",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-29T07:23:07.909735Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T10:23:07Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "77acf0d4-b35f-4ccf-adba-9dadf8a58312",
      "short_number": 18,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "50816c0c-a5cb-4c16-9616-119417c84b86",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-29T07:23:07.297645Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "4b625205-4fe4-44c8-aef7-443b7d20fb06",
      "short_number": 17,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "77acf0d4-b35f-4ccf-adba-9dadf8a58312",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "50816c0c-a5cb-4c16-9616-119417c84b86",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:23:07.297645Z",
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

`GET /api/rider/v1/orders/4b625205-4fe4-44c8-aef7-443b7d20fb06` → **200**

```json
{
  "id": "4b625205-4fe4-44c8-aef7-443b7d20fb06",
  "short_number": 17,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "50816c0c-a5cb-4c16-9616-119417c84b86",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "586e27f2-eb8f-4697-8cc6-d5597c9bea01",
    "order_id": "4b625205-4fe4-44c8-aef7-443b7d20fb06",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "2a435929-e519-448a-a762-cc22595f602e",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T07:23:05.815901Z",
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
    "location_at": "2026-10-29T07:23:04.642803Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/4b625205-4fe4-44c8-aef7-443b7d20fb06/cancel` → **200**

```json
{
  "command_id": "312dd2fc-b473-40d3-aebc-c8bc857fdd78",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4b625205-4fe4-44c8-aef7-443b7d20fb06",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "50816c0c-a5cb-4c16-9616-119417c84b86",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "586e27f2-eb8f-4697-8cc6-d5597c9bea01",
    "order_id": "4b625205-4fe4-44c8-aef7-443b7d20fb06",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "2a435929-e519-448a-a762-cc22595f602e",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T07:23:05.815901Z",
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

`GET /api/rider/v1/orders/77acf0d4-b35f-4ccf-adba-9dadf8a58312` → **200**

```json
{
  "id": "77acf0d4-b35f-4ccf-adba-9dadf8a58312",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "50816c0c-a5cb-4c16-9616-119417c84b86",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:23:07.297645Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/77acf0d4-b35f-4ccf-adba-9dadf8a58312/cancel` → **200**

```json
{
  "command_id": "936ca107-79e8-4bb2-892c-d27f6d4bf27d",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "77acf0d4-b35f-4ccf-adba-9dadf8a58312",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "50816c0c-a5cb-4c16-9616-119417c84b86",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:23:07.297645Z",
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

`GET /api/rider/v1/orders/6b77a53f-09da-460b-971e-334934a771e9` → **200**

```json
{
  "id": "6b77a53f-09da-460b-971e-334934a771e9",
  "short_number": 19,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "50816c0c-a5cb-4c16-9616-119417c84b86",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T07:23:07.909735Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T10:23:07Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/6b77a53f-09da-460b-971e-334934a771e9/cancel` → **200**

```json
{
  "command_id": "6f08df91-42ee-4de8-8293-4593bffa2639",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "6b77a53f-09da-460b-971e-334934a771e9",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "50816c0c-a5cb-4c16-9616-119417c84b86",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T07:23:07.909735Z",
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
  "pickup_at": "2026-10-29T10:23:07Z",
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
  "session_id": "01511acb-479b-48ee-af0d-bb24e8c7dbe4",
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
  "last_heartbeat_at": "2026-10-29T07:23:04.642803Z",
  "last_location_at": "2026-10-29T07:23:04.642803Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/01511acb-479b-48ee-af0d-bb24e8c7dbe4/close` → **200**

```json
{
  "command_id": "93921c0f-01fb-417d-94e3-3a2b9c5bf3b5",
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

Done: orders 4b625205-4fe4-44c8-aef7-443b7d20fb06, 77acf0d4-b35f-4ccf-adba-9dadf8a58312, 6b77a53f-09da-460b-971e-334934a771e9.

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
  "session_id": "a1c7c117-9fd8-4199-9d9b-8b331fbb21f3",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk0OTIsImlhdCI6MTc5MzI1ODU5MiwianRpIjoiYzYwYzQ2NWMtYTRjYS00YThiLTg1ZmUtZGQ3M2U5ZTVhZWMzIiwic2lkIjoiYTFjN2MxMTctOWZkOC00MTk5LTlkOWItOGIzMzFmYmIyMWYzIn0.T2GktkFAUit4TLrcAU4XjQEN2UA8PzSMEsvnr1hHuhw",
  "access_expires_at": "2026-10-29T07:38:12.044130724Z",
  "refresh_token": "oN5etYO_fwScpq4ybMra0jt3HRue9eeEESCpxV_s7GM",
  "refresh_expires_at": "2026-10-29T19:23:12.043507888Z",
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
  "session_id": "5dc7a644-52ff-4571-a674-f1576bce6f0c",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk0OTIsImlhdCI6MTc5MzI1ODU5MiwianRpIjoiOWJjMjc2OGMtNjY3Zi00MDg4LTkxMjgtZWZmODQ2NTBiZmVhIiwic2lkIjoiNWRjN2E2NDQtNTJmZi00NTcxLWE2NzQtZjE1NzZiY2U2ZjBjIn0.KpD_H26nNDfK3Oq6EETBj7Tiz4M6vw_C0nHBXKJ6tJA",
  "access_expires_at": "2026-10-29T07:38:12.621151994Z",
  "refresh_token": "pFKWL0IYtiswad7i3_FZuvT1NTlhtfNVtIcHCcVWNsg",
  "refresh_expires_at": "2026-10-29T19:23:12.620559585Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-11509"
}
```

```json
{
  "challenge_id": "c2dd9c12-d746-4d5f-b914-d512213b725b",
  "expires_at": "2026-10-29T07:28:12.90142293Z",
  "resend_available_at": "2026-10-29T07:23:13.90142293Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "598635",
  "sent_at": "2026-10-29T07:23:12.904471261Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c2dd9c12-d746-4d5f-b914-d512213b725b",
  "code": "598635",
  "device_ref": "sandbox-11509"
}
```

```json
{
  "session_id": "5454107f-768b-4a24-91e8-aeab68dedf9a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI1OTQ5MywiaWF0IjoxNzkzMjU4NTkzLCJqdGkiOiJhNWM0NzlkOC0zMzA2LTRlMzYtODQxOS1mZmI1ZTdmZDU5ZjQiLCJzaWQiOiI1NDU0MTA3Zi03NjhiLTRhMjQtOTFlOC1hZWFiNjhkZWRmOWEifQ.CJN8BXuD-9L00hAenWBOwKfzJbWZdbh1dhug3apEfWw",
  "access_expires_at": "2026-10-29T07:38:13.210465649Z",
  "refresh_token": "oefhPeUAIulYLjujp5XYE1zQsV0m-i0Y1iTqgUFLBPg",
  "refresh_expires_at": "2026-11-28T07:23:13.209826934Z",
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
  "command_id": "4d5cadb8-03e1-4708-b7ea-77868f49f599",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:23:13Z",
    "sequence": 1793258593765
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ecfc08f-d26e-489f-acb6-acbedef1c50a",
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
  "last_heartbeat_at": "2026-10-29T07:23:13.784192Z",
  "last_location_at": "2026-10-29T07:23:13.784192Z",
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
  "command_id": "5cf9fd05-341c-4136-a08f-b22d7f8dd426",
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
  "effective_at": "2026-10-29T07:23:14.361658Z",
  "changed_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T07:20:49.425398Z",
  "last_entries": [
    {
      "order_id": "64e33138-bff1-4cdd-a6e6-fd499e7cdf21",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T07:20:49.425398Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "3af785c7-08fb-46f5-a81e-c04ebba04470",
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
  "id": "bcb2105e-2030-412d-b665-192fad72403f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:28:14.928200Z",
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
  "command_id": "bd80edfb-5629-4e66-b5eb-dc5d58f34029",
  "quote_id": "bcb2105e-2030-412d-b665-192fad72403f",
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
    "phone": "+3806711117923"
  }
}
```

```json
{
  "id": "1b93637a-4b36-4866-b6d2-14280001e28e",
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
  "created_at": "2026-10-29T07:23:15.220301Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711117923"
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
    "id": "0ad4742c-f1c5-4825-9bd3-c588a588ede4",
    "order_id": "1b93637a-4b36-4866-b6d2-14280001e28e",
    "expires_at": "2026-10-29T07:23:30.224997Z",
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

`POST /api/driver/v1/offers/0ad4742c-f1c5-4825-9bd3-c588a588ede4/accept` → **200**

```json
{
  "command_id": "f9576c38-d4de-4a80-8dd8-d8f1b71d68fb"
}
```

```json
{
  "id": "16e4f61f-1887-46de-85f5-bda423f8003c",
  "order_id": "1b93637a-4b36-4866-b6d2-14280001e28e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "31c36930-f853-40c7-a173-05e132f79068",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "31c36930-f853-40c7-a173-05e132f79068",
  "order_id": "1b93637a-4b36-4866-b6d2-14280001e28e",
  "assignment_id": "16e4f61f-1887-46de-85f5-bda423f8003c",
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
    "phone": "+3806711117923"
  }
}
```

`POST /api/driver/v1/work-sessions/2ecfc08f-d26e-489f-acb6-acbedef1c50a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:23:16Z",
    "sequence": 1793258596351
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ecfc08f-d26e-489f-acb6-acbedef1c50a",
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
  "last_heartbeat_at": "2026-10-29T07:23:16.369617Z",
  "last_location_at": "2026-10-29T07:23:16.369617Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/31c36930-f853-40c7-a173-05e132f79068/arrive` → **200**

```json
{
  "command_id": "eb9d8e57-f0b1-4470-8627-7f168d08dab2",
  "expected_version": 0
}
```

```json
{
  "id": "31c36930-f853-40c7-a173-05e132f79068",
  "order_id": "1b93637a-4b36-4866-b6d2-14280001e28e",
  "assignment_id": "16e4f61f-1887-46de-85f5-bda423f8003c",
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
  "arrived_at": "2026-10-29T07:23:16.662479Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711117923"
  }
}
```

`POST /api/driver/v1/trips/31c36930-f853-40c7-a173-05e132f79068/start` → **200**

```json
{
  "command_id": "529d3c66-8447-411b-b177-51ca25ae355c",
  "expected_version": 1
}
```

```json
{
  "id": "31c36930-f853-40c7-a173-05e132f79068",
  "order_id": "1b93637a-4b36-4866-b6d2-14280001e28e",
  "assignment_id": "16e4f61f-1887-46de-85f5-bda423f8003c",
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
  "arrived_at": "2026-10-29T07:23:16.662479Z",
  "started_at": "2026-10-29T07:23:16.953148Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711117923"
  }
}
```

`POST /api/driver/v1/trips/31c36930-f853-40c7-a173-05e132f79068/complete` → **200**

```json
{
  "command_id": "cba15555-cc88-4143-9479-54818c259061",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:23:17Z",
  "cash_received": true
}
```

```json
{
  "id": "31c36930-f853-40c7-a173-05e132f79068",
  "order_id": "1b93637a-4b36-4866-b6d2-14280001e28e",
  "assignment_id": "16e4f61f-1887-46de-85f5-bda423f8003c",
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
  "arrived_at": "2026-10-29T07:23:16.662479Z",
  "started_at": "2026-10-29T07:23:16.953148Z",
  "completed_at": "2026-10-29T07:23:17.241234Z",
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
  "command_id": "3e395084-eed6-4f14-b891-0d49b28cb1fb",
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
  "id": "f69b1edb-ff22-4cb3-bdcc-353a57a3c035",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:28:17.549587Z",
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
  "command_id": "005b8102-a0e0-4698-b09d-3dd42ad67d2c",
  "quote_id": "f69b1edb-ff22-4cb3-bdcc-353a57a3c035",
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
    "phone": "+380671112624"
  }
}
```

```json
{
  "id": "93c6a6b7-0366-4882-9703-ea6150aba9e2",
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
  "created_at": "2026-10-29T07:23:17.840621Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671112624"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/93c6a6b7-0366-4882-9703-ea6150aba9e2` → **200**

```json
{
  "id": "93c6a6b7-0366-4882-9703-ea6150aba9e2",
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
  "created_at": "2026-10-29T07:23:17.840621Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671112624"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/93c6a6b7-0366-4882-9703-ea6150aba9e2/cancel` → **200**

```json
{
  "command_id": "1da9167b-3b8a-4b0d-9840-b2670245bea7",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "93c6a6b7-0366-4882-9703-ea6150aba9e2",
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
  "created_at": "2026-10-29T07:23:17.840621Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671112624"
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
  "staff_id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-29T07:20:49.425398Z",
  "last_entries": [
    {
      "order_id": "93c6a6b7-0366-4882-9703-ea6150aba9e2",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-29T07:23:18.455511Z"
    },
    {
      "order_id": "1b93637a-4b36-4866-b6d2-14280001e28e",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-29T07:23:17.246246Z"
    },
    {
      "order_id": "64e33138-bff1-4cdd-a6e6-fd499e7cdf21",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T07:20:49.425398Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ecfc08f-d26e-489f-acb6-acbedef1c50a",
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
  "last_heartbeat_at": "2026-10-29T07:23:16.369617Z",
  "last_location_at": "2026-10-29T07:23:16.369617Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2ecfc08f-d26e-489f-acb6-acbedef1c50a/close` → **200**

```json
{
  "command_id": "c2bd90d8-ad7f-4958-aac1-5311021e230b",
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

Done: operator bonus for fulfilled 1b93637a-4b36-4866-b6d2-14280001e28e and operator-fault cancellation 93c6a6b7-0366-4882-9703-ea6150aba9e2.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677704037",
  "device_ref": "sandbox-28718"
}
```

```json
{
  "challenge_id": "e13b5d87-7e06-4650-b246-18591536a08c",
  "expires_at": "2026-10-29T07:28:21.648357975Z",
  "resend_available_at": "2026-10-29T07:23:22.648357975Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677704037` → **200**

```json
{
  "phone": "+380677704037",
  "audience": "CLIENT",
  "code": "184688",
  "sent_at": "2026-10-29T07:23:21.650756597Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678953860",
  "device_ref": "sandbox-26851",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "5a13da16-d576-446d-9bd6-650f241a39d4",
  "expires_at": "2026-10-29T07:28:21.952454835Z",
  "resend_available_at": "2026-10-29T07:23:22.952454835Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678953860` → **200**

```json
{
  "phone": "+380678953860",
  "audience": "CLIENT",
  "code": "779248",
  "sent_at": "2026-10-29T07:23:21.954637541Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678460000",
  "device_ref": "sandbox-12271"
}
```

```json
{
  "challenge_id": "695c2e0a-06d2-4f0b-a1d6-31089ab34cbc",
  "expires_at": "2026-10-29T07:28:22.260590822Z",
  "resend_available_at": "2026-10-29T07:23:23.260590822Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678460000` → **200**

```json
{
  "phone": "+380678460000",
  "audience": "CLIENT",
  "code": "783263",
  "sent_at": "2026-10-29T07:23:22.26436404Z",
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
  "session_id": "861908c7-0929-4c3b-98ef-3dd1b421f152",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk1MDIsImlhdCI6MTc5MzI1ODYwMiwianRpIjoiOGJiYmM3Y2UtYmM2Zi00OWE1LWExNjAtZDUyNDQ4ZDI5YzFiIiwic2lkIjoiODYxOTA4YzctMDkyOS00YzNiLTk4ZWYtM2RkMWI0MjFmMTUyIn0.M1WOeMH_kZ0UmXEJcVMNF0ihg0-xsLUK7gh9GcfjS1s",
  "access_expires_at": "2026-10-29T07:38:22.864438539Z",
  "refresh_token": "Rq8NFROgk4M1hgilpPdtUs5yKAEGMsHrkutLoxZ4_uQ",
  "refresh_expires_at": "2026-10-29T19:23:22.863738179Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678460000` → **200**

```json
{
  "deliveries": [
    {
      "id": "5c7958fa-b5e2-463f-b5ad-0b1ca6f45171",
      "challenge_id": "695c2e0a-06d2-4f0b-a1d6-31089ab34cbc",
      "phone": "+380678460000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-6f19d567-0ef6-4aba-af2e-bd3a265f9495",
      "error": null,
      "attempted_at": "2026-10-29T07:23:22.264726Z"
    },
    {
      "id": "cf4ca3fe-3dfe-4ac7-b5bf-a70d306acd5c",
      "challenge_id": "695c2e0a-06d2-4f0b-a1d6-31089ab34cbc",
      "phone": "+380678460000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-29T07:23:22.263271Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380678460000` → **200**

```json
{
  "phone": "+380678460000",
  "audience": "CLIENT",
  "code": "783263",
  "sent_at": "2026-10-29T07:23:22.26436404Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678953860` → **200**

```json
{
  "deliveries": [
    {
      "id": "afe9b322-fabf-4a37-96ec-34e870abe5e5",
      "challenge_id": "5a13da16-d576-446d-9bd6-650f241a39d4",
      "phone": "+380678953860",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-8bd49e0c-fbe7-4b02-9ad1-d25d70b8b4f3",
      "error": null,
      "attempted_at": "2026-10-29T07:23:21.954926Z"
    }
  ]
}
```

Done: SMS to +380677704037, a call to +380678953860, SMS then a call to +380678460000.

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
  "session_id": "bd3007c7-080a-4f54-8d6e-a98ac3b3372b",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk1MDQsImlhdCI6MTc5MzI1ODYwNCwianRpIjoiYTEwN2U0MDQtYWNhYi00MGQ0LTgxNDQtNjZmMTc4YTZjOGY3Iiwic2lkIjoiYmQzMDA3YzctMDgwYS00ZjU0LThkNmUtYTk4YWMzYjMzNzJiIn0.cGuvn2w8Ne9QKWnxynDpDw5k--ZxD39OmJ54JNN4GzY",
  "access_expires_at": "2026-10-29T07:38:24.038633915Z",
  "refresh_token": "pAo5SNlvB0bNod3KuOVJiAzMtulsJZn62KMb2yJR5lI",
  "refresh_expires_at": "2026-10-29T19:23:24.038036396Z",
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
  "session_id": "3b1cdef2-3f1f-4a3e-a48b-ec05e90b9044",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk1MDQsImlhdCI6MTc5MzI1ODYwNCwianRpIjoiNDhiNWYwZmMtY2U2ZC00NzY0LWJiY2UtNjQ4YTMyYzQwOWFlIiwic2lkIjoiM2IxY2RlZjItM2YxZi00YTNlLWE0OGItZWMwNWU5MGI5MDQ0In0.-CEu2iNfNY77To9ledJItG78owGtJOj7GzB16XL97rg",
  "access_expires_at": "2026-10-29T07:38:24.604194165Z",
  "refresh_token": "ejh4s0zkD1zwYQbOTuwoIeUyAYef2-ZSEq_Geir-csQ",
  "refresh_expires_at": "2026-10-29T19:23:24.603651047Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
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

`POST /api/admin/v1/staff-extensions/e1fa4bd3-44f6-4371-81e1-20056c5ede23` → **200**

```json
{
  "command_id": "fb508a41-c8d5-4e52-bbb7-1f0283fcd9c3",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "a8c0eebf-299f-403c-9804-6772307b79b3",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T07:23:25.732307Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T07:23:25.732307Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "862fcb30-cf95-44ae-912f-dc4724ac8d14",
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
  "id": "0d89111f-bc36-4b8c-be7d-196bf2ba0833",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:28:26.300646Z",
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
  "command_id": "9d9e9e8b-f042-48c0-b41d-d5e9caf6f87d",
  "quote_id": "0d89111f-bc36-4b8c-be7d-196bf2ba0833",
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
    "phone": "+380677673895"
  }
}
```

```json
{
  "id": "1f9cdedf-aa9c-4a4c-9f20-1c891b2e740a",
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
  "created_at": "2026-10-29T07:23:26.590431Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677673895"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/1f9cdedf-aa9c-4a4c-9f20-1c891b2e740a/calls` → **201**

```json
{
  "command_id": "e28cb194-454e-4771-93fb-f44c6f5a6580",
  "to": "CALLER"
}
```

```json
{
  "id": "c38f2725-581e-41a1-ac27-c676990cb9d7",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
  "order_ids": [
    "1f9cdedf-aa9c-4a4c-9f20-1c891b2e740a"
  ],
  "started_at": "2026-10-29T07:23:26.91418Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/1f9cdedf-aa9c-4a4c-9f20-1c891b2e740a/calls` → **201**

```json
{
  "command_id": "e28cb194-454e-4771-93fb-f44c6f5a6580",
  "to": "CALLER"
}
```

```json
{
  "id": "c38f2725-581e-41a1-ac27-c676990cb9d7",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
  "order_ids": [
    "1f9cdedf-aa9c-4a4c-9f20-1c891b2e740a"
  ],
  "started_at": "2026-10-29T07:23:26.91418Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "c38f2725-581e-41a1-ac27-c676990cb9d7",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380677673895",
    "at": "2026-10-29T07:23:26.916719057Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "c38f2725-581e-41a1-ac27-c676990cb9d7",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.20131",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "c38f2725-581e-41a1-ac27-c676990cb9d7"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "c38f2725-581e-41a1-ac27-c676990cb9d7",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=1f9cdedf-aa9c-4a4c-9f20-1c891b2e740a` → **200**

```json
{
  "calls": [
    {
      "id": "c38f2725-581e-41a1-ac27-c676990cb9d7",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
      "order_ids": [
        "1f9cdedf-aa9c-4a4c-9f20-1c891b2e740a"
      ],
      "started_at": "2026-10-29T07:23:26.91418Z",
      "answered_at": "2026-10-29T07:23:27.602674Z",
      "ended_at": "2026-10-29T07:23:27.625602Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=1f9cdedf-aa9c-4a4c-9f20-1c891b2e740a` → **200**

```json
{
  "calls": [
    {
      "id": "c38f2725-581e-41a1-ac27-c676990cb9d7",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
      "order_ids": [
        "1f9cdedf-aa9c-4a4c-9f20-1c891b2e740a"
      ],
      "started_at": "2026-10-29T07:23:26.91418Z",
      "answered_at": "2026-10-29T07:23:27.602674Z",
      "ended_at": "2026-10-29T07:23:27.625602Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T07:23:28.052867Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/1f9cdedf-aa9c-4a4c-9f20-1c891b2e740a` → **200**

```json
{
  "id": "1f9cdedf-aa9c-4a4c-9f20-1c891b2e740a",
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
  "created_at": "2026-10-29T07:23:26.590431Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677673895"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/1f9cdedf-aa9c-4a4c-9f20-1c891b2e740a/cancel` → **200**

```json
{
  "command_id": "80a3ef49-4729-42ab-82c2-6cd04fad9334",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "1f9cdedf-aa9c-4a4c-9f20-1c891b2e740a",
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
  "created_at": "2026-10-29T07:23:26.590431Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677673895"
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
  "command_id": "1e75a1de-5088-418d-a49d-b94760df2a47",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-29T07:23:30.927884Z",
  "extension": "101"
}
```

Done: outgoing call c38f2725-581e-41a1-ac27-c676990cb9d7 from order 1f9cdedf-aa9c-4a4c-9f20-1c891b2e740a, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635248920",
  "device_ref": "sandbox-23559"
}
```

```json
{
  "challenge_id": "32230ed2-5935-45f7-b006-4ae9967b0647",
  "expires_at": "2026-10-29T07:28:31.225618319Z",
  "resend_available_at": "2026-10-29T07:23:32.225618319Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635248920` → **200**

```json
{
  "phone": "+380635248920",
  "audience": "CLIENT",
  "code": "629881",
  "sent_at": "2026-10-29T07:23:31.228217544Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "32230ed2-5935-45f7-b006-4ae9967b0647",
  "code": "629881",
  "device_ref": "sandbox-23559"
}
```

```json
{
  "session_id": "5e647fbe-73df-49dd-8772-ddac500c2532",
  "subject": {
    "type": "CLIENT",
    "id": "3dd08b6d-94e3-42e8-a5de-05a347c3db35"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZGQwOGI2ZC05NGUzLTQyZTgtYTVkZS0wNWEzNDdjM2RiMzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5NTExLCJpYXQiOjE3OTMyNTg2MTEsImp0aSI6Ijk1NjdkYWEwLTk4NjktNDIxNC05MGRhLTVkMmM0Mzg1MWVlNyIsInNpZCI6IjVlNjQ3ZmJlLTczZGYtNDlkZC04NzcyLWRkYWM1MDBjMjUzMiJ9.sKlOf1JvDiYJU0jyW3VYk0z3oll2VPkAkrKB07Xh1uo",
  "access_expires_at": "2026-10-29T07:38:31.552689722Z",
  "refresh_token": "3GjpO_RIIoPywbMWL22kC4WC1Y5uZVcrQQeNHjfbTDI",
  "refresh_expires_at": "2026-11-28T07:23:31.552144329Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3dd08b6d-94e3-42e8-a5de-05a347c3db35",
  "session_id": "5e647fbe-73df-49dd-8772-ddac500c2532",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635248920",
  "device_ref": "sandbox-15589"
}
```

```json
{
  "challenge_id": "29805889-361c-41bb-8f39-01ae731763d6",
  "expires_at": "2026-10-29T07:28:34.11022052Z",
  "resend_available_at": "2026-10-29T07:23:35.11022052Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635248920` → **200**

```json
{
  "phone": "+380635248920",
  "audience": "CLIENT",
  "code": "956869",
  "sent_at": "2026-10-29T07:23:34.112514935Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "29805889-361c-41bb-8f39-01ae731763d6",
  "code": "956869",
  "device_ref": "sandbox-15589"
}
```

```json
{
  "session_id": "e3c42abc-aa64-4eee-8e4a-5e9a6d06ea7d",
  "subject": {
    "type": "CLIENT",
    "id": "3dd08b6d-94e3-42e8-a5de-05a347c3db35"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZGQwOGI2ZC05NGUzLTQyZTgtYTVkZS0wNWEzNDdjM2RiMzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5NTE0LCJpYXQiOjE3OTMyNTg2MTQsImp0aSI6ImIwNWU2YzJlLThiNzYtNDY0MS1iZjZmLWRiNGVhOWQ5ZTVlNSIsInNpZCI6ImUzYzQyYWJjLWFhNjQtNGVlZS04ZTRhLTVlOWE2ZDA2ZWE3ZCJ9.nShOLRYRfJuXpC0G75M9Ga3dw72xnMc-cl6HjGfL2tA",
  "access_expires_at": "2026-10-29T07:38:34.414435181Z",
  "refresh_token": "GLwuATfuIkZuIwSRYKZBtPmjhZ-QJYpen8n06ijb27c",
  "refresh_expires_at": "2026-11-28T07:23:34.413651887Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "437ed71a-e02e-4e40-914d-1a5660132f8c",
  "expires_at": "2026-10-29T07:28:36.692883298Z",
  "resend_available_at": "2026-10-29T07:23:37.692883298Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635248920` → **200**

```json
{
  "phone": "+380635248920",
  "audience": "CLIENT",
  "code": "932013",
  "sent_at": "2026-10-29T07:23:36.695438591Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380631058542"
}
```

```json
{
  "challenge_id": "563bc053-318c-4e00-9c3a-0de6c5ebc92f",
  "expires_at": "2026-10-29T07:28:37.003104148Z",
  "resend_available_at": "2026-10-29T07:23:38.003104148Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631058542` → **200**

```json
{
  "phone": "+380631058542",
  "audience": "CLIENT",
  "code": "417902",
  "sent_at": "2026-10-29T07:23:37.005074936Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "559bebb4-a220-4b1e-834b-175fe0f8f3b0",
  "current_challenge_id": "437ed71a-e02e-4e40-914d-1a5660132f8c",
  "current_code": "000000",
  "new_challenge_id": "563bc053-318c-4e00-9c3a-0de6c5ebc92f",
  "new_code": "417902"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "eb4112b5-fb8a-4f24-baa9-d07e9853f48a"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "8a224ec2-14c2-41da-866c-5d9c906fca38",
  "current_challenge_id": "437ed71a-e02e-4e40-914d-1a5660132f8c",
  "current_code": "932013",
  "new_challenge_id": "563bc053-318c-4e00-9c3a-0de6c5ebc92f",
  "new_code": "417902"
}
```

```json
{
  "subject_id": "3dd08b6d-94e3-42e8-a5de-05a347c3db35",
  "phone": "+380631058542",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3dd08b6d-94e3-42e8-a5de-05a347c3db35",
  "session_id": "5e647fbe-73df-49dd-8772-ddac500c2532",
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
  "correlation_id": "4209c885-4b4b-43bb-a120-f4f6d73e51a5"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631058542",
  "device_ref": "sandbox-3727"
}
```

```json
{
  "challenge_id": "2f11d4ea-556d-4f15-80d0-98f006771c8d",
  "expires_at": "2026-10-29T07:28:40.412823889Z",
  "resend_available_at": "2026-10-29T07:23:41.412823889Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631058542` → **200**

```json
{
  "phone": "+380631058542",
  "audience": "CLIENT",
  "code": "885418",
  "sent_at": "2026-10-29T07:23:40.424539769Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2f11d4ea-556d-4f15-80d0-98f006771c8d",
  "code": "885418",
  "device_ref": "sandbox-3727"
}
```

```json
{
  "session_id": "8cf986f3-5735-45b5-947d-b68deea10bbd",
  "subject": {
    "type": "CLIENT",
    "id": "3dd08b6d-94e3-42e8-a5de-05a347c3db35"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZGQwOGI2ZC05NGUzLTQyZTgtYTVkZS0wNWEzNDdjM2RiMzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5NTIwLCJpYXQiOjE3OTMyNTg2MjAsImp0aSI6ImJhNjEwZGZlLWViYjktNGY4OC04OGU1LTM5YjY0YTVkZTY5YyIsInNpZCI6IjhjZjk4NmYzLTU3MzUtNDViNS05NDdkLWI2OGRlZWExMGJiZCJ9.4HnlSP509zVJ7wka2AhP3tdo8Z0CGK4C-jckvcf1YyU",
  "access_expires_at": "2026-10-29T07:38:40.727728948Z",
  "refresh_token": "GKfPSdPhkKsiGo7Ngwqr1BVSrMFlOnD-5-XbngyUlG4",
  "refresh_expires_at": "2026-11-28T07:23:40.727169683Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3dd08b6d-94e3-42e8-a5de-05a347c3db35",
  "session_id": "8cf986f3-5735-45b5-947d-b68deea10bbd",
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
  "session_id": "2efffea2-6381-460b-9e63-50036fd7fec3",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk1MjEsImlhdCI6MTc5MzI1ODYyMSwianRpIjoiZmEwNWM2MmUtOWExMC00NTAzLTlhNzQtNTUyMmVkYWFjNWE5Iiwic2lkIjoiMmVmZmZlYTItNjM4MS00NjBiLTllNjMtNTAwMzZmZDdmZWMzIn0.a9MtQhaQR4zpNC9k40ECGU3YCj9shPTBj-PjOsUm5aw",
  "access_expires_at": "2026-10-29T07:38:41.553893519Z",
  "refresh_token": "9Y6Q4LhBIrkG94-VkNN_fj-SRpX--Zp3S31iOFuqAbM",
  "refresh_expires_at": "2026-10-29T19:23:41.553384054Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/3dd08b6d-94e3-42e8-a5de-05a347c3db35` → **200**

```json
{
  "client": {
    "id": "3dd08b6d-94e3-42e8-a5de-05a347c3db35",
    "phone": "+380631058542",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T07:23:31.550558Z",
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

`POST /api/admin/v1/clients/3dd08b6d-94e3-42e8-a5de-05a347c3db35/phone/new-code` → **201**

```json
{
  "phone": "+380634312380"
}
```

```json
{
  "challenge_id": "86968344-c027-44c2-ae15-61b4feb7b437",
  "expires_at": "2026-10-29T07:28:42.155323966Z",
  "resend_available_at": "2026-10-29T07:23:43.155323966Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634312380` → **200**

```json
{
  "phone": "+380634312380",
  "audience": "CLIENT",
  "code": "424143",
  "sent_at": "2026-10-29T07:23:42.158196621Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/3dd08b6d-94e3-42e8-a5de-05a347c3db35/phone` → **422**

```json
{
  "command_id": "8aad1769-1e89-4223-be77-603a1c133be5",
  "expected_version": 3,
  "new_challenge_id": "86968344-c027-44c2-ae15-61b4feb7b437",
  "new_code": "424144",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/3dd08b6d-94e3-42e8-a5de-05a347c3db35/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "92e33074-f7b7-43cc-9079-1875c65fa433"
}
```

`POST /api/admin/v1/clients/3dd08b6d-94e3-42e8-a5de-05a347c3db35/phone` → **400**

```json
{
  "command_id": "4982237a-080f-4739-9f59-829c32427924",
  "expected_version": 3,
  "new_challenge_id": "86968344-c027-44c2-ae15-61b4feb7b437",
  "new_code": "424143",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/3dd08b6d-94e3-42e8-a5de-05a347c3db35/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "7bef59b2-7290-4783-9891-e7ffc60dcb54",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/3dd08b6d-94e3-42e8-a5de-05a347c3db35/phone` → **200**

```json
{
  "command_id": "f30e56a8-e5de-490e-a4d9-9099a92d12fd",
  "expected_version": 3,
  "new_challenge_id": "86968344-c027-44c2-ae15-61b4feb7b437",
  "new_code": "424143",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "3dd08b6d-94e3-42e8-a5de-05a347c3db35",
  "phone": "+380634312380",
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
  "correlation_id": "73624bee-3c31-4d19-837b-ccebf633cef1"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634312380",
  "device_ref": "sandbox-1307"
}
```

```json
{
  "challenge_id": "0ad56f5d-98de-4741-95f8-9fc0c9cbed98",
  "expires_at": "2026-10-29T07:28:43.629616561Z",
  "resend_available_at": "2026-10-29T07:23:44.629616561Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634312380` → **200**

```json
{
  "phone": "+380634312380",
  "audience": "CLIENT",
  "code": "937919",
  "sent_at": "2026-10-29T07:23:43.632617681Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0ad56f5d-98de-4741-95f8-9fc0c9cbed98",
  "code": "937919",
  "device_ref": "sandbox-1307"
}
```

```json
{
  "session_id": "525faca8-ffa0-4d5a-8a01-aa86b43d3f21",
  "subject": {
    "type": "CLIENT",
    "id": "3dd08b6d-94e3-42e8-a5de-05a347c3db35"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZGQwOGI2ZC05NGUzLTQyZTgtYTVkZS0wNWEzNDdjM2RiMzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5NTIzLCJpYXQiOjE3OTMyNTg2MjMsImp0aSI6Ijk1YTZjZmFlLWVlM2MtNGUxYS05OTE5LTQ5NzkwY2M5OGI0YiIsInNpZCI6IjUyNWZhY2E4LWZmYTAtNGQ1YS04YTAxLWFhODZiNDNkM2YyMSJ9.z5NDdC_qCJYJtR-b0opIo5kksTivfr3TuVtVUgfMeKY",
  "access_expires_at": "2026-10-29T07:38:43.942451623Z",
  "refresh_token": "rg8N_34dcnSM6KmYKRWrLodbP4kZyuziZzBeeuSmdEo",
  "refresh_expires_at": "2026-11-28T07:23:43.941843244Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3dd08b6d-94e3-42e8-a5de-05a347c3db35",
  "session_id": "525faca8-ffa0-4d5a-8a01-aa86b43d3f21",
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
  "phone": "+380633878432",
  "device_ref": "sandbox-19148"
}
```

```json
{
  "challenge_id": "0c96420f-c38a-4edd-9ff9-dd56c399c03d",
  "expires_at": "2026-10-29T07:28:44.501576576Z",
  "resend_available_at": "2026-10-29T07:23:45.501576576Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633878432` → **200**

```json
{
  "phone": "+380633878432",
  "audience": "CLIENT",
  "code": "272279",
  "sent_at": "2026-10-29T07:23:44.503805326Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0c96420f-c38a-4edd-9ff9-dd56c399c03d",
  "code": "272279",
  "device_ref": "sandbox-19148"
}
```

```json
{
  "session_id": "bca0691a-e0b7-4994-a22f-5954b06535e2",
  "subject": {
    "type": "CLIENT",
    "id": "27867720-5235-4284-bff9-76a7300fcd95"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNzg2NzcyMC01MjM1LTQyODQtYmZmOS03NmE3MzAwZmNkOTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5NTI0LCJpYXQiOjE3OTMyNTg2MjQsImp0aSI6IjgyNTBmZmE3LTJmYjUtNDZhYS1iNmRkLTczMTBhNDJhODJlZCIsInNpZCI6ImJjYTA2OTFhLWUwYjctNDk5NC1hMjJmLTU5NTRiMDY1MzVlMiJ9.xwJB44cqDYGBfE2PHvISzTemi7eZQqI3HibFOnI34kY",
  "access_expires_at": "2026-10-29T07:38:44.813608738Z",
  "refresh_token": "_wT8eGvhRqy745oX34IRmUlFnGsqIgZt8M_6uUc0Bpw",
  "refresh_expires_at": "2026-11-28T07:23:44.813026046Z",
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
  "session_id": "09c05b27-4b66-4b31-82c6-95e4c5b418dd",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk1MjUsImlhdCI6MTc5MzI1ODYyNSwianRpIjoiNzlmMjMzZTUtODA2MC00ZjYxLTk4NzgtOTE1MTMxODgxOGM1Iiwic2lkIjoiMDljMDViMjctNGI2Ni00YjMxLTgyYzYtOTVlNGM1YjQxOGRkIn0.uBp8OTNOwUhpYEnXhE__PO4WTy34h223JuQi9ZT5syg",
  "access_expires_at": "2026-10-29T07:38:45.964724079Z",
  "refresh_token": "59dVCkY9GM4rRs6Ae9_FlFB5lbyjLJ3mtS0nt0WDDzk",
  "refresh_expires_at": "2026-10-29T19:23:45.964169369Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380633878432` → **200**

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
  "correlation_id": "15735e34-a54a-4299-ba68-a368fff2d3ab"
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
  "session_id": "57996eb0-f1c3-4334-8f7a-f007ae01bf9b",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk1MjcsImlhdCI6MTc5MzI1ODYyNywianRpIjoiNWNlYWIxZjQtODkzZi00Mzg1LWFiNDYtZDRhNjA0ZGEyYzc0Iiwic2lkIjoiNTc5OTZlYjAtZjFjMy00MzM0LThmN2EtZjAwN2FlMDFiZjliIn0.QJ2pR2NCDriSYOJwece_RKw-HCPOzPy8Yzqublk53Ao",
  "access_expires_at": "2026-10-29T07:38:47.125217722Z",
  "refresh_token": "PL46rnZbPIC35lyL67eQBDExazQ8jsLnoYc_sX4vXOM",
  "refresh_expires_at": "2026-10-29T19:23:47.124612278Z",
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
  "changed_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T07:20:16.685793Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "8431e587-5a01-4984-af47-8a099855e55f",
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
  "changed_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-29T07:23:47.685769073Z"
}
```

## The rider books the airport for 2026-10-29T10:23:46Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600717448",
  "device_ref": "sandbox-16229"
}
```

```json
{
  "challenge_id": "f4d9dee4-9f87-4715-a152-5425bcac1d63",
  "expires_at": "2026-10-29T07:28:47.981096157Z",
  "resend_available_at": "2026-10-29T07:23:48.981096157Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600717448` → **200**

```json
{
  "phone": "+48600717448",
  "audience": "CLIENT",
  "code": "353085",
  "sent_at": "2026-10-29T07:23:47.983418388Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f4d9dee4-9f87-4715-a152-5425bcac1d63",
  "code": "353085",
  "device_ref": "sandbox-16229"
}
```

```json
{
  "session_id": "e20d66b1-79bc-4278-aa55-41bc1f1875bc",
  "subject": {
    "type": "CLIENT",
    "id": "f490a814-f9cd-4b4b-90d5-ff7c2c05fc78"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNDkwYTgxNC1mOWNkLTRiNGItOTBkNS1mZjdjMmMwNWZjNzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5NTI4LCJpYXQiOjE3OTMyNTg2MjgsImp0aSI6IjM0ODBmNTg4LWI2MGUtNDM2OS04ZmVjLTEzNGY5NDBjMjI3ZSIsInNpZCI6ImUyMGQ2NmIxLTc5YmMtNDI3OC1hYTU1LTQxYmMxZjE4NzViYyJ9.9hlLny6i_nJ8wrUDs-rMZHo6OlPL3bFJtetVHvN407U",
  "access_expires_at": "2026-10-29T07:38:48.290490526Z",
  "refresh_token": "Nw9b0SjKu4Ue6baeiHYFusac4dH3FC8xcRFKrac3mdc",
  "refresh_expires_at": "2026-11-28T07:23:48.289955112Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8d673f3f-961b-4304-9fcb-c3687edc4647",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-29T10:23:46Z"
}
```

```json
{
  "id": "ac66b412-1188-44ec-b697-e1a270890b8b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:28:48.583734Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T10:23:46Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "e1fe11bd-f7df-42b7-be18-93987fb4bde2",
  "quote_id": "ac66b412-1188-44ec-b697-e1a270890b8b",
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
  "pickup_at": "2026-10-29T10:23:46Z"
}
```

```json
{
  "id": "d8c59f36-578b-43b4-a30c-3920fe7b0ebe",
  "short_number": 23,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f490a814-f9cd-4b4b-90d5-ff7c2c05fc78",
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
  "created_at": "2026-10-29T07:23:48.888951Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T10:23:46Z",
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
  "device_ref": "sandbox-12187"
}
```

```json
{
  "challenge_id": "82bf7ae8-1bae-46cd-9928-2d3ccc41258f",
  "expires_at": "2026-10-29T07:28:49.185006168Z",
  "resend_available_at": "2026-10-29T07:23:50.185006168Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "104869",
  "sent_at": "2026-10-29T07:23:49.187472493Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "82bf7ae8-1bae-46cd-9928-2d3ccc41258f",
  "code": "104869",
  "device_ref": "sandbox-12187"
}
```

```json
{
  "session_id": "f3c7bfd1-781f-4578-9b46-9d3b441af6b0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI1OTUyOSwiaWF0IjoxNzkzMjU4NjI5LCJqdGkiOiIyNDY1ZWQ3Zi04NWUyLTRmOGYtYTRmNi0wZmUxNjQ0NzliMjEiLCJzaWQiOiJmM2M3YmZkMS03ODFmLTQ1NzgtOWI0Ni05ZDNiNDQxYWY2YjAifQ.tOCUrqJG3n6FVMwTsJTPLPiIvYqUAX9RaYrpLxw0q5Q",
  "access_expires_at": "2026-10-29T07:38:49.482471101Z",
  "refresh_token": "t2YNRk7q_xvdITHOLGdaRby9cPnaWibLmOzSv4UjDe4",
  "refresh_expires_at": "2026-11-28T07:23:49.481907535Z",
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
  "command_id": "0a5a33d2-6eaf-4e55-a014-7366a907ba41",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:23:50Z",
    "sequence": 1793258630395
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "2cae981e-3a46-4e5c-b653-4a0cb1cd49d9",
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
  "last_heartbeat_at": "2026-10-29T07:23:50.057994Z",
  "last_location_at": "2026-10-29T07:23:50.057994Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "d8c59f36-578b-43b4-a30c-3920fe7b0ebe",
      "short_number": 23,
      "pickup_at": "2026-10-29T10:23:46Z",
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

`POST /api/driver/v1/preorders/d8c59f36-578b-43b4-a30c-3920fe7b0ebe/reserve` → **200**

```json
{
  "command_id": "dd68e929-8980-46eb-8088-58ab46fcfd11"
}
```

```json
{
  "id": "9db3f58f-b79e-4e26-b385-55d735660ac5",
  "state": "RESERVED",
  "order": {
    "order_id": "d8c59f36-578b-43b4-a30c-3920fe7b0ebe",
    "short_number": 23,
    "pickup_at": "2026-10-29T10:23:46Z",
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
  "reserved_at": "2026-10-29T07:23:50.627049Z",
  "confirm_from": "2026-10-29T09:53:46Z",
  "confirm_until": "2026-10-29T10:03:46Z",
  "drop_until": "2026-10-29T09:23:46Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "9db3f58f-b79e-4e26-b385-55d735660ac5",
      "state": "RESERVED",
      "order": {
        "order_id": "d8c59f36-578b-43b4-a30c-3920fe7b0ebe",
        "short_number": 23,
        "pickup_at": "2026-10-29T10:23:46Z",
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
      "reserved_at": "2026-10-29T07:23:50.627049Z",
      "confirm_from": "2026-10-29T09:53:46Z",
      "confirm_until": "2026-10-29T10:03:46Z",
      "drop_until": "2026-10-29T09:23:46Z"
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
      "id": "9db3f58f-b79e-4e26-b385-55d735660ac5",
      "state": "RESERVED",
      "order": {
        "order_id": "d8c59f36-578b-43b4-a30c-3920fe7b0ebe",
        "short_number": 23,
        "pickup_at": "2026-10-29T10:23:46Z",
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
      "reserved_at": "2026-10-29T07:23:50.627049Z",
      "confirm_from": "2026-10-29T09:53:46Z",
      "confirm_until": "2026-10-29T10:03:46Z",
      "drop_until": "2026-10-29T09:23:46Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/9db3f58f-b79e-4e26-b385-55d735660ac5/confirm` → **409**

```json
{
  "command_id": "3c8cc7cb-54bc-4df1-b4ed-1021f6d5790a"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/9db3f58f-b79e-4e26-b385-55d735660ac5/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "caef0fc9-3dc4-49f7-8fc3-655213b80bbd"
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
  "session_id": "d3639991-3b0f-4c9c-a5f3-48ccf2fb54df",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk1MzIsImlhdCI6MTc5MzI1ODYzMiwianRpIjoiZWNhZTVkZGMtYWRjOC00M2RiLThhYmUtZjM0MWY0MjY2YjBiIiwic2lkIjoiZDM2Mzk5OTEtM2IwZi00YzljLWE1ZjMtNDhjY2YyZmI1NGRmIn0.kwAKbd0zNgKYZ2OxWyA5EwzZv-dd-1hNz8oC5ErURG0",
  "access_expires_at": "2026-10-29T07:38:52.059346971Z",
  "refresh_token": "rJlR8mUwcj5wUWRi6TSbPPjgQiR7VJjA9zgT2dL_J9M",
  "refresh_expires_at": "2026-10-29T19:23:52.05877529Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d8c59f36-578b-43b4-a30c-3920fe7b0ebe` → **200**

```json
{
  "id": "d8c59f36-578b-43b4-a30c-3920fe7b0ebe",
  "short_number": 23,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "f490a814-f9cd-4b4b-90d5-ff7c2c05fc78",
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
  "created_at": "2026-10-29T07:23:48.888951Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-29T10:23:46Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "9db3f58f-b79e-4e26-b385-55d735660ac5",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-29T07:23:50.627049Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/d8c59f36-578b-43b4-a30c-3920fe7b0ebe/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-29T07:23:48.890196Z",
      "actor": {
        "type": "CLIENT",
        "id": "f490a814-f9cd-4b4b-90d5-ff7c2c05fc78",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "d8c59f36-578b-43b4-a30c-3920fe7b0ebe",
        "preorder": true,
        "quote_id": "ac66b412-1188-44ec-b697-e1a270890b8b",
        "pickup_at": "2026-10-29T10:23:46Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "c54d32ee-2cdc-477d-99e9-be45a1252c1c"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-29T07:23:50.628275Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d8c59f36-578b-43b4-a30c-3920fe7b0ebe",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "9db3f58f-b79e-4e26-b385-55d735660ac5"
      },
      "correlation_id": "bc99d601-31be-4d84-93a4-bc3bd5c6516c"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order d8c59f36-578b-43b4-a30c-3920fe7b0ebe, reservation 9db3f58f-b79e-4e26-b385-55d735660ac5.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-25033"
}
```

```json
{
  "challenge_id": "685aeb54-518e-4874-a3b6-3081a28941ba",
  "expires_at": "2026-10-29T07:28:52.923393947Z",
  "resend_available_at": "2026-10-29T07:23:53.923393947Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "778514",
  "sent_at": "2026-10-29T07:23:52.925527129Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "685aeb54-518e-4874-a3b6-3081a28941ba",
  "code": "778514",
  "device_ref": "sandbox-25033"
}
```

```json
{
  "session_id": "560ea51a-d19b-41b4-8db5-b6e272e72459",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI1OTUzMywiaWF0IjoxNzkzMjU4NjMzLCJqdGkiOiI1YjdhNTEyOS03YWJkLTQ2MTAtOWM0Zi1kNzlmZmMzMTAwZmEiLCJzaWQiOiI1NjBlYTUxYS1kMTliLTQxYjQtOGRiNS1iNmUyNzJlNzI0NTkifQ.Rdt28gsuA25KqiaGRIVx567ys2YSzjoh-1jtiwWSRZ8",
  "access_expires_at": "2026-10-29T07:38:53.225676102Z",
  "refresh_token": "hjO7CUc52ZQP6zA1IwWJ48AHydqSKU_c5Pg21ne9fKU",
  "refresh_expires_at": "2026-11-28T07:23:53.225057381Z",
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
  "command_id": "3994d41e-f6c6-4930-8ce4-6f8212681696",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:23:53Z",
    "sequence": 1793258633805
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7ce76439-8bcc-4af4-b7fa-17087baa0cdc",
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
  "last_heartbeat_at": "2026-10-29T07:23:53.824225Z",
  "last_location_at": "2026-10-29T07:23:53.824225Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675299315",
  "device_ref": "sandbox-23737"
}
```

```json
{
  "challenge_id": "fb0ef733-29be-4e44-b91d-2cd6d917618d",
  "expires_at": "2026-10-29T07:28:54.105394074Z",
  "resend_available_at": "2026-10-29T07:23:55.105394074Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675299315` → **200**

```json
{
  "phone": "+380675299315",
  "audience": "CLIENT",
  "code": "274135",
  "sent_at": "2026-10-29T07:23:54.107960056Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fb0ef733-29be-4e44-b91d-2cd6d917618d",
  "code": "274135",
  "device_ref": "sandbox-23737"
}
```

```json
{
  "session_id": "cbbb75fc-6ee6-4844-89df-da1ef565f9cf",
  "subject": {
    "type": "CLIENT",
    "id": "d0aa6559-3bc2-4143-b006-1989a193a753"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMGFhNjU1OS0zYmMyLTQxNDMtYjAwNi0xOTg5YTE5M2E3NTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5NTM0LCJpYXQiOjE3OTMyNTg2MzQsImp0aSI6Ijk4YTNjNTgwLTNiNDAtNDI0Zi05YjdhLTFmZWVmYjhhZmRjMSIsInNpZCI6ImNiYmI3NWZjLTZlZTYtNDg0NC04OWRmLWRhMWVmNTY1ZjljZiJ9.6MiOpYMHDVGC-uqg8u6XSr1vEClA-5u7AWY7AksbJqk",
  "access_expires_at": "2026-10-29T07:38:54.414506167Z",
  "refresh_token": "NR7riP20AaJCf99GNQDAb2EqlvG9Eyion-JJjp6Pn3E",
  "refresh_expires_at": "2026-11-28T07:23:54.413903664Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9fe35711-e6d3-4761-8300-4e4868a6c156",
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
  "id": "81782978-fbdd-4aa9-8f35-6956d8802c5d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:28:54.691465Z",
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
  "command_id": "b76783bd-e317-42a1-b029-59576b11957b",
  "quote_id": "81782978-fbdd-4aa9-8f35-6956d8802c5d",
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
  "id": "746dc1eb-ddae-4835-9210-cb85d4e2f06e",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d0aa6559-3bc2-4143-b006-1989a193a753",
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
  "created_at": "2026-10-29T07:23:54.99176Z",
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
    "id": "a27da1f8-4f75-4209-a29e-850f918ed1ce",
    "order_id": "746dc1eb-ddae-4835-9210-cb85d4e2f06e",
    "expires_at": "2026-10-29T07:24:09.995178Z",
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

`POST /api/driver/v1/offers/a27da1f8-4f75-4209-a29e-850f918ed1ce/accept` → **200**

```json
{
  "command_id": "4e977047-c98d-4c0a-a41f-27ce6946fa0c"
}
```

```json
{
  "id": "bac3596a-6a1d-4b15-8cc6-f5fb7524ad61",
  "order_id": "746dc1eb-ddae-4835-9210-cb85d4e2f06e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "736d337a-dfbb-4302-9637-ec55177b182d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "736d337a-dfbb-4302-9637-ec55177b182d",
  "order_id": "746dc1eb-ddae-4835-9210-cb85d4e2f06e",
  "assignment_id": "bac3596a-6a1d-4b15-8cc6-f5fb7524ad61",
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

`POST /api/driver/v1/work-sessions/7ce76439-8bcc-4af4-b7fa-17087baa0cdc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:23:56Z",
    "sequence": 1793258636125
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7ce76439-8bcc-4af4-b7fa-17087baa0cdc",
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
  "last_heartbeat_at": "2026-10-29T07:23:56.14437Z",
  "last_location_at": "2026-10-29T07:23:56.14437Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "736d337a-dfbb-4302-9637-ec55177b182d",
  "order_id": "746dc1eb-ddae-4835-9210-cb85d4e2f06e",
  "assignment_id": "bac3596a-6a1d-4b15-8cc6-f5fb7524ad61",
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

`POST /api/driver/v1/trips/736d337a-dfbb-4302-9637-ec55177b182d/arrive` → **200**

```json
{
  "command_id": "3c3d1c93-ad12-4daf-9adc-c913445189b3",
  "expected_version": 0
}
```

```json
{
  "id": "736d337a-dfbb-4302-9637-ec55177b182d",
  "order_id": "746dc1eb-ddae-4835-9210-cb85d4e2f06e",
  "assignment_id": "bac3596a-6a1d-4b15-8cc6-f5fb7524ad61",
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
  "arrived_at": "2026-10-29T07:23:56.704365Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/736d337a-dfbb-4302-9637-ec55177b182d/start` → **200**

```json
{
  "command_id": "3e907803-dda2-4dde-9e63-c81eb42dfeff",
  "expected_version": 1
}
```

```json
{
  "id": "736d337a-dfbb-4302-9637-ec55177b182d",
  "order_id": "746dc1eb-ddae-4835-9210-cb85d4e2f06e",
  "assignment_id": "bac3596a-6a1d-4b15-8cc6-f5fb7524ad61",
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
  "arrived_at": "2026-10-29T07:23:56.704365Z",
  "started_at": "2026-10-29T07:23:56.995123Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/7ce76439-8bcc-4af4-b7fa-17087baa0cdc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:23:57Z",
    "sequence": 1793258637275
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7ce76439-8bcc-4af4-b7fa-17087baa0cdc",
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
  "last_heartbeat_at": "2026-10-29T07:23:57.294556Z",
  "last_location_at": "2026-10-29T07:23:57.294556Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/736d337a-dfbb-4302-9637-ec55177b182d/complete` → **200**

```json
{
  "command_id": "c08366db-6e1b-4c94-aa2f-a91310bfbfb5",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:23:57Z",
  "cash_received": true
}
```

```json
{
  "id": "736d337a-dfbb-4302-9637-ec55177b182d",
  "order_id": "746dc1eb-ddae-4835-9210-cb85d4e2f06e",
  "assignment_id": "bac3596a-6a1d-4b15-8cc6-f5fb7524ad61",
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
  "arrived_at": "2026-10-29T07:23:56.704365Z",
  "started_at": "2026-10-29T07:23:56.995123Z",
  "completed_at": "2026-10-29T07:23:57.583168Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/746dc1eb-ddae-4835-9210-cb85d4e2f06e/rating` → **200**

```json
{
  "command_id": "b60006c2-17c7-45d7-a7ca-2779594e9ac9",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "746dc1eb-ddae-4835-9210-cb85d4e2f06e",
  "score": 5,
  "created_at": "2026-10-29T07:23:57.886463105Z"
}
```

`POST /api/driver/v1/orders/746dc1eb-ddae-4835-9210-cb85d4e2f06e/rating` → **200**

```json
{
  "command_id": "3ebaf7bf-ca63-4c36-905d-aa16fd01262f",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "746dc1eb-ddae-4835-9210-cb85d4e2f06e",
  "score": 4,
  "created_at": "2026-10-29T07:23:58.170545556Z"
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
  "session_id": "18ad9802-be0c-43e6-8a37-fa728df74c35",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk1MzksImlhdCI6MTc5MzI1ODYzOSwianRpIjoiYTJiOWRmYjUtNjlkZC00ZWQ1LThlMzctZjM2MzkyNTI5MzIyIiwic2lkIjoiMThhZDk4MDItYmUwYy00M2U2LThhMzctZmE3MjhkZjc0YzM1In0.K-bfbisEcXFuFTpgNW2etCjRncxyJpkQu9SPz7gQr2M",
  "access_expires_at": "2026-10-29T07:38:59.017789625Z",
  "refresh_token": "kuRAtmj4AOoREz1XixKFXbdp-gNlULYfFBxHBlKpwpQ",
  "refresh_expires_at": "2026-10-29T19:23:59.01725316Z",
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
  "session_id": "f79429ca-1ed9-4137-b039-30550d463733",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk1MzksImlhdCI6MTc5MzI1ODYzOSwianRpIjoiYjYyMTg1NjEtODM0Ny00NGNjLTgxN2YtZTJmNTE5Yjk1YWI3Iiwic2lkIjoiZjc5NDI5Y2EtMWVkOS00MTM3LWIwMzktMzA1NTBkNDYzNzMzIn0.YEY36_mJTlYvoMlPHiKdd3byg4Jjfwaft0ZGjGZLrnM",
  "access_expires_at": "2026-10-29T07:38:59.584991239Z",
  "refresh_token": "zlNSDjAZz8SYvmqw586Spg3-5-BwhRK9C1TlbCWTGs8",
  "refresh_expires_at": "2026-10-29T19:23:59.584480301Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/746dc1eb-ddae-4835-9210-cb85d4e2f06e/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "746dc1eb-ddae-4835-9210-cb85d4e2f06e",
      "author_type": "RIDER",
      "author_id": "d0aa6559-3bc2-4143-b006-1989a193a753",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-29T07:23:57.886463Z"
    },
    {
      "order_id": "746dc1eb-ddae-4835-9210-cb85d4e2f06e",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "d0aa6559-3bc2-4143-b006-1989a193a753",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-29T07:23:58.170546Z"
    }
  ]
}
```

Done: ratings for order 746dc1eb-ddae-4835-9210-cb85d4e2f06e.

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
  "session_id": "3fec0bde-97fa-44dc-827d-40884916cd33",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk1NDAsImlhdCI6MTc5MzI1ODY0MCwianRpIjoiMzljNzY3ZDYtM2YwYS00NTMwLWJjZjEtYTFhNTVlYWE5NWE1Iiwic2lkIjoiM2ZlYzBiZGUtOTdmYS00NGRjLTgyN2QtNDA4ODQ5MTZjZDMzIn0.F_f8PuhUFsm0rhDmlES3QUFVNN7Gd2ENf3Q569O0Qb0",
  "access_expires_at": "2026-10-29T07:39:00.457378895Z",
  "refresh_token": "eX1_38vtWiHwbl04aU_-uLV-mIj_wOiLiwdqq_izq8g",
  "refresh_expires_at": "2026-10-29T19:24:00.456641636Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "b4df4ef8-c696-4f4d-a272-2b499cc89e78",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "c328e7a7-d60d-42df-bdc4-04c463cb0309",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:24:00.736279Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/c328e7a7-d60d-42df-bdc4-04c463cb0309` → **200**

```json
{
  "id": "c328e7a7-d60d-42df-bdc4-04c463cb0309",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:24:00.736279Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/c328e7a7-d60d-42df-bdc4-04c463cb0309` → **200**

```json
{
  "id": "c328e7a7-d60d-42df-bdc4-04c463cb0309",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:24:00.736279Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/c328e7a7-d60d-42df-bdc4-04c463cb0309` → **200**

```json
{
  "id": "c328e7a7-d60d-42df-bdc4-04c463cb0309",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T07:24:00.736279Z",
  "ready_at": "2026-10-29T07:24:03.095278Z",
  "expires_at": "2026-10-30T07:24:03.095278Z"
}
```

`GET /api/admin/v1/reports/exports/c328e7a7-d60d-42df-bdc4-04c463cb0309/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-29,23,10,13,0,0,18,5,0,21,1,0,1,7,1,5
total,23,10,13,0,0,18,5,0,21,1,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "3dc7fd32-6834-4961-a4de-2f2d049e22f0",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "3da60d14-6aef-4324-bf72-4b7d0fafbfe7",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:24:03.919698Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3da60d14-6aef-4324-bf72-4b7d0fafbfe7` → **200**

```json
{
  "id": "3da60d14-6aef-4324-bf72-4b7d0fafbfe7",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:24:03.919698Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3da60d14-6aef-4324-bf72-4b7d0fafbfe7` → **200**

```json
{
  "id": "3da60d14-6aef-4324-bf72-4b7d0fafbfe7",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:24:03.919698Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3da60d14-6aef-4324-bf72-4b7d0fafbfe7` → **200**

```json
{
  "id": "3da60d14-6aef-4324-bf72-4b7d0fafbfe7",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:24:03.919698Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3da60d14-6aef-4324-bf72-4b7d0fafbfe7` → **200**

```json
{
  "id": "3da60d14-6aef-4324-bf72-4b7d0fafbfe7",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:24:03.919698Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3da60d14-6aef-4324-bf72-4b7d0fafbfe7` → **200**

```json
{
  "id": "3da60d14-6aef-4324-bf72-4b7d0fafbfe7",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T07:24:03.919698Z",
  "ready_at": "2026-10-29T07:24:08.103266Z",
  "expires_at": "2026-10-30T07:24:08.103266Z"
}
```

`GET /api/admin/v1/reports/exports/3da60d14-6aef-4324-bf72-4b7d0fafbfe7/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-29,UAH,10,1387.37,130.74,208.14,1179.23,10.52,0.00,162.97,182.97,795.00,50.00,105.17
total,UAH,10,1387.37,130.74,208.14,1179.23,10.52,0.00,162.97,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/9de8d7d5-6a74-4e28-993d-bae163bc5200` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/9de8d7d5-6a74-4e28-993d-bae163bc5200",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "45b11390-dcd6-4422-b50c-4e3d76452942"
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
  "device_ref": "sandbox-25768"
}
```

```json
{
  "challenge_id": "fc1535e5-4433-44d8-af17-791beda7985c",
  "expires_at": "2026-10-29T07:29:10.023337539Z",
  "resend_available_at": "2026-10-29T07:24:11.023337539Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "495873",
  "sent_at": "2026-10-29T07:24:10.026512111Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fc1535e5-4433-44d8-af17-791beda7985c",
  "code": "495873",
  "device_ref": "sandbox-25768"
}
```

```json
{
  "session_id": "ec8346af-6488-4cbd-b806-c9b9f2b0d07a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI1OTU1MCwiaWF0IjoxNzkzMjU4NjUwLCJqdGkiOiJmNmNkNWFmZi1mNGQ0LTQxMzgtOTNkNC04NGZjZGZhNjI0OGYiLCJzaWQiOiJlYzgzNDZhZi02NDg4LTRjYmQtYjgwNi1jOWI5ZjJiMGQwN2EifQ.X8HnExgmX57Jt_x1ddB9pB0ibDqID8OJ2gfUWzvm6RM",
  "access_expires_at": "2026-10-29T07:39:10.339659807Z",
  "refresh_token": "ZWFdM6IE17nUJ-negEMYdkzgxVtHyU21ZgM4b6P6v1Y",
  "refresh_expires_at": "2026-11-28T07:24:10.3390423Z",
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
  "command_id": "82b4585d-bb49-47f7-98c5-8e46f179d59d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:24:11Z",
    "sequence": 1793258651190
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "38973a9b-31c4-413f-b616-68f5dfcdb3b4",
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
  "last_heartbeat_at": "2026-10-29T07:24:11.210865Z",
  "last_location_at": "2026-10-29T07:24:11.210865Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "a0f3afe1-4087-479a-bedf-da05d0ef3f9a",
  "points": [
    {
      "sequence": 1793258653508,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T07:23:13Z"
    },
    {
      "sequence": 1793258653515,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T07:24:13Z"
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
  "session_id": "ac54a60e-ea90-432b-8ee0-741c0e3231c1",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk1NTQsImlhdCI6MTc5MzI1ODY1NCwianRpIjoiMmJhNjZkYjQtYjNkZC00ZWEwLTg4NzItMzU2OTQ2YTY1NGZmIiwic2lkIjoiYWM1NGE2MGUtZWE5MC00MzJiLThlZTAtNzQxYzBlMzIzMWMxIn0.2-sCLU7fhApU0XvoSAqFkGqzx6RPwOdNRyuEYMngipI",
  "access_expires_at": "2026-10-29T07:39:14.14080581Z",
  "refresh_token": "BShwR6iYvH2xJLTWVtrCfUhbO4N6qzCs3tA7n1vtEaY",
  "refresh_expires_at": "2026-10-29T19:24:14.140217628Z",
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
      "id": "783353f6-f20f-4eb2-a1ff-fe9c308569a7",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-29T07:24:13Z",
        "track_point_id": "d8bc8f33-66ee-4ec1-8c6b-a586b94d26ee",
        "work_session_id": "38973a9b-31c4-413f-b616-68f5dfcdb3b4"
      },
      "raised_by": null,
      "raised_at": "2026-10-29T07:24:13Z",
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

`POST /api/admin/v1/driver-risk-flags/783353f6-f20f-4eb2-a1ff-fe9c308569a7/confirm` → **200**

```json
{
  "command_id": "2e84a642-a936-4a0b-a9d4-465f29bb9af2",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "783353f6-f20f-4eb2-a1ff-fe9c308569a7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-29T07:24:13Z",
    "track_point_id": "d8bc8f33-66ee-4ec1-8c6b-a586b94d26ee",
    "work_session_id": "38973a9b-31c4-413f-b616-68f5dfcdb3b4"
  },
  "raised_by": null,
  "raised_at": "2026-10-29T07:24:13Z",
  "reason": null,
  "reviewed_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
  "reviewed_at": "2026-10-29T07:24:16.342457Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/783353f6-f20f-4eb2-a1ff-fe9c308569a7/dismiss` → **409**

```json
{
  "command_id": "8057da37-6c7c-445c-aa8d-d7ef339b197d",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/783353f6-f20f-4eb2-a1ff-fe9c308569a7/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "30f1c0c1-fe9f-4e3c-92e9-ed294a9d73aa"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "1658c5a6-a602-41f2-9225-ebc38c225807",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "572d6c64-8a9a-4c8f-a787-a98ed3e38cc1",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
  "raised_at": "2026-10-29T07:24:16.928714Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/572d6c64-8a9a-4c8f-a787-a98ed3e38cc1/dismiss` → **200**

```json
{
  "command_id": "525777f2-b410-44f1-8c01-31fd781d4f39",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "572d6c64-8a9a-4c8f-a787-a98ed3e38cc1",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
  "raised_at": "2026-10-29T07:24:16.928714Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
  "reviewed_at": "2026-10-29T07:24:17.233174Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "96634fcc-885c-47d3-a3b4-55c4d79b163c",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "783353f6-f20f-4eb2-a1ff-fe9c308569a7"
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
      "actor_id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T07:24:17.540855Z"
    }
  ]
}
```

Done: flag 783353f6-f20f-4eb2-a1ff-fe9c308569a7 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "91102534-cbb8-4cae-b4cd-5750bbe0851f",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk1NTgsImlhdCI6MTc5MzI1ODY1OCwianRpIjoiN2FkZmE4MmYtYjRhZi00NzJjLTk1MTctMWRmNTA5MDU1YTFlIiwic2lkIjoiOTExMDI1MzQtY2JiOC00Y2FlLWI0Y2QtNTc1MGJiZTA4NTFmIn0.65btyjec4b4GJ51GGEgJxelXfWVV9HaLjW_eaJ4scao",
  "access_expires_at": "2026-10-29T07:39:18.413252817Z",
  "refresh_token": "url1KlzkOYgpfVN-IKEk1VrqdA_O0FJAboBzMMR6on8",
  "refresh_expires_at": "2026-10-29T19:24:18.412652203Z",
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
      "actor_id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T07:24:17.540855Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "dde3f07d-c784-46ca-96b6-ef2d93079d54",
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
  "session_id": "38973a9b-31c4-413f-b616-68f5dfcdb3b4",
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
  "last_heartbeat_at": "2026-10-29T07:24:11.210865Z",
  "last_location_at": "2026-10-29T07:24:11.210865Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/38973a9b-31c4-413f-b616-68f5dfcdb3b4/close` → **200**

```json
{
  "command_id": "56ddf11f-3909-4ada-997c-69cecb37c06f",
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
  "session_id": "0561eea9-e01f-4338-847c-2f0f50ed25a6",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk1NjAsImlhdCI6MTc5MzI1ODY2MCwianRpIjoiNjAyNDJiNTUtN2YxMi00ZmVlLTliODEtNDgwNWM5ODQ3NDY0Iiwic2lkIjoiMDU2MWVlYTktZTAxZi00MzM4LTg0N2MtMmYwZjUwZWQyNWE2In0.SGhg-g6r_ybPdwTBSnTcQKkZwBTw6C6oH-lNfuY304E",
  "access_expires_at": "2026-10-29T07:39:20.157297841Z",
  "refresh_token": "36HtSALCAlOebFR4gcOyhBEWduMfzQWCTT8Ur8hvyAc",
  "refresh_expires_at": "2026-10-29T19:24:20.156700412Z",
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
  "command_id": "245cf705-2647-4cbe-a3cf-6da9e933d472",
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
  "changed_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T07:24:20.734072Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "245cf705-2647-4cbe-a3cf-6da9e933d472",
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
  "changed_by": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T07:24:20.734072Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48280990471",
  "device_ref": "sandbox-28889"
}
```

```json
{
  "challenge_id": "66c14f5a-d88c-4798-946f-81581f70912a",
  "expires_at": "2026-10-29T07:29:21.329147627Z",
  "resend_available_at": "2026-10-29T07:24:22.329147627Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48280990471` → **200**

```json
{
  "phone": "+48280990471",
  "audience": "CLIENT",
  "code": "321156",
  "sent_at": "2026-10-29T07:24:21.331956791Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "66c14f5a-d88c-4798-946f-81581f70912a",
  "code": "321156",
  "device_ref": "sandbox-28889"
}
```

```json
{
  "session_id": "fcd143d5-c7d5-4c35-9a4a-9d9bb23f322d",
  "subject": {
    "type": "CLIENT",
    "id": "7f5b589b-dbae-421c-93cf-32453cc6d1ff"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZjViNTg5Yi1kYmFlLTQyMWMtOTNjZi0zMjQ1M2NjNmQxZmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5NTYxLCJpYXQiOjE3OTMyNTg2NjEsImp0aSI6ImM0NTZlMDY5LWUzZmQtNDRiZC05ZTE4LTZkNmY5ZGZiMzFkYSIsInNpZCI6ImZjZDE0M2Q1LWM3ZDUtNGMzNS05YTRhLTlkOWJiMjNmMzIyZCJ9.6C6SFpuCafS0cQZdNgO05CJTpuLDvHiitsCp41noaGo",
  "access_expires_at": "2026-10-29T07:39:21.629795248Z",
  "refresh_token": "rtNCILk5f77AW958M9r0MkWD8ed7-yT7c1RJ5jZMKYo",
  "refresh_expires_at": "2026-11-28T07:24:21.629228946Z",
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
  "correlation_id": "959c9f1c-6123-44ad-97a3-ce9a8d301d67"
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
  "device_ref": "sandbox-1259"
}
```

```json
{
  "challenge_id": "7497fc02-a6a7-43ba-bcb7-d072da2b74d7",
  "expires_at": "2026-10-29T07:29:22.481901428Z",
  "resend_available_at": "2026-10-29T07:24:23.481901428Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "228652",
  "sent_at": "2026-10-29T07:24:22.484866565Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7497fc02-a6a7-43ba-bcb7-d072da2b74d7",
  "code": "228652",
  "device_ref": "sandbox-1259"
}
```

```json
{
  "session_id": "65f56e5b-74ad-4e26-833e-9bcbfe43efe1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI1OTU2MiwiaWF0IjoxNzkzMjU4NjYyLCJqdGkiOiI1NzI2OTE0MC0wYmE3LTRiNTktYWRiNS1lM2ViMDM2MGVmNGQiLCJzaWQiOiI2NWY1NmU1Yi03NGFkLTRlMjYtODMzZS05YmNiZmU0M2VmZTEifQ.1llJcamdoG4IN3HweE2P11KK6K8tYp4Qe7KTIHm0T90",
  "access_expires_at": "2026-10-29T07:39:22.789354227Z",
  "refresh_token": "cvi1cwaVS2v3qr9i21cf1E5KynPnN4CwffTKqEyoMsE",
  "refresh_expires_at": "2026-11-28T07:24:22.788756631Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "2cae981e-3a46-4e5c-b653-4a0cb1cd49d9",
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
  "last_heartbeat_at": "2026-10-29T07:23:50.057994Z",
  "last_location_at": "2026-10-29T07:23:50.057994Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/2cae981e-3a46-4e5c-b653-4a0cb1cd49d9/handover` → **200**

```json
{
  "command_id": "ee9b20cf-ec5e-462f-98ac-b65ddf5ef110",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "2cae981e-3a46-4e5c-b653-4a0cb1cd49d9",
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
  "last_heartbeat_at": "2026-10-29T07:23:50.057994Z",
  "last_location_at": "2026-10-29T07:23:50.057994Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/2cae981e-3a46-4e5c-b653-4a0cb1cd49d9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:24:23Z",
    "sequence": 1793258663633
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "2cae981e-3a46-4e5c-b653-4a0cb1cd49d9",
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
  "last_heartbeat_at": "2026-10-29T07:24:23.652538Z",
  "last_location_at": "2026-10-29T07:24:23.652538Z",
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
  "session_id": "2cae981e-3a46-4e5c-b653-4a0cb1cd49d9",
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
  "last_heartbeat_at": "2026-10-29T07:24:23.652538Z",
  "last_location_at": "2026-10-29T07:24:23.652538Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2cae981e-3a46-4e5c-b653-4a0cb1cd49d9/close` → **200**

```json
{
  "command_id": "b2eb8d57-c845-49b4-bf9e-fe48bb164712",
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
  "correlation_id": "a5119339-cea2-48d8-8358-255d331c64f2"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678703517",
  "device_ref": "sandbox-25341"
}
```

```json
{
  "challenge_id": "4d6129e1-95fa-45f8-a5d7-77be934cef99",
  "expires_at": "2026-10-29T07:29:25.069117278Z",
  "resend_available_at": "2026-10-29T07:24:26.069117278Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678703517` → **200**

```json
{
  "phone": "+380678703517",
  "audience": "CLIENT",
  "code": "802176",
  "sent_at": "2026-10-29T07:24:25.071312723Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4d6129e1-95fa-45f8-a5d7-77be934cef99",
  "code": "802176",
  "device_ref": "sandbox-25341"
}
```

```json
{
  "session_id": "77eb34aa-86c8-4e09-8e4d-8eeef4621fbf",
  "subject": {
    "type": "CLIENT",
    "id": "e25152b9-821a-4902-9fa6-498184cfd9a9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMjUxNTJiOS04MjFhLTQ5MDItOWZhNi00OTgxODRjZmQ5YTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5NTY1LCJpYXQiOjE3OTMyNTg2NjUsImp0aSI6IjcxMjE2MTdhLTIwMmEtNDU4Mi1iZDg1LWIxZDVhNDMwZjcwNiIsInNpZCI6Ijc3ZWIzNGFhLTg2YzgtNGUwOS04ZTRkLThlZWVmNDYyMWZiZiJ9.hJKnJXihxgcIfZlAIMvATlyZ8XrlXs9oJ66d5hR2-Uw",
  "access_expires_at": "2026-10-29T07:39:25.386482842Z",
  "refresh_token": "IGkF335_7kYb5ZsWb4YNH4vRpJ_oGv286904f4sqnjU",
  "refresh_expires_at": "2026-11-28T07:24:25.385746098Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "59aded5e-6fd8-4967-89ef-6e884d7e7e45",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "935c2b0d-2a5e-4265-b05c-0009b5146e39",
  "upload_path": "/api/rider/v1/uploads/935c2b0d-2a5e-4265-b05c-0009b5146e39",
  "expires_at": "2026-10-29T07:39:25.685593411Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/935c2b0d-2a5e-4265-b05c-0009b5146e39` → **200**

```json
{
  "file_id": "935c2b0d-2a5e-4265-b05c-0009b5146e39",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "749d4029-57c5-4e08-8b5c-54da1477cf17",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "935c2b0d-2a5e-4265-b05c-0009b5146e39"
  ]
}
```

```json
{
  "id": "db29377c-88e6-42e5-b082-2af2442ba8d1",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "e25152b9-821a-4902-9fa6-498184cfd9a9",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T07:24:25.999902Z",
  "updated_at": "2026-10-29T07:24:25.999902Z",
  "respond_by": "2026-10-29T11:24:25.999902Z",
  "messages": [
    {
      "id": "b278f364-6bef-47f1-9495-4569a9c9f2d4",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "e25152b9-821a-4902-9fa6-498184cfd9a9",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T07:24:26.000906Z",
      "attachments": [
        {
          "file_id": "935c2b0d-2a5e-4265-b05c-0009b5146e39",
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
  "session_id": "a8701bc3-623c-4702-808c-d1057f3b96cd",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk1NjYsImlhdCI6MTc5MzI1ODY2NiwianRpIjoiZmExMGZkOGQtMTdhZC00MTJiLWIyOTUtOWI2ZDVjMmU0YjkyIiwic2lkIjoiYTg3MDFiYzMtNjIzYy00NzAyLTgwOGMtZDEwNTdmM2I5NmNkIn0.YzE11epspeOx-t1GLU-PN6PsSxaKPXvQmIdAPRL4CWk",
  "access_expires_at": "2026-10-29T07:39:26.603694745Z",
  "refresh_token": "MFyGe-Pe9eHNff5oHlplo6VrGll8kwutQYd32vsVApo",
  "refresh_expires_at": "2026-10-29T19:24:26.603094291Z",
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
  "session_id": "ee0c3ff9-7277-4c32-a55b-8268e2f9001d",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk1NjcsImlhdCI6MTc5MzI1ODY2NywianRpIjoiOWQ3Y2Q0ZTctZmExMy00MzM3LTg0OGUtMGMxODQ1NDczMjk3Iiwic2lkIjoiZWUwYzNmZjktNzI3Ny00YzMyLWE1NWItODI2OGUyZjkwMDFkIn0.kuWWXrCo1j5cB7ofEeu-Pof2EB1n3xAjsui75ZeDsbE",
  "access_expires_at": "2026-10-29T07:39:27.211035082Z",
  "refresh_token": "-yNdCNzJPFY98PqkWBdiauc5De-_fYJP4aJrztfyiPE",
  "refresh_expires_at": "2026-10-29T19:24:27.210374746Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/db29377c-88e6-42e5-b082-2af2442ba8d1/attachments/935c2b0d-2a5e-4265-b05c-0009b5146e39` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "471f01a8-f2f9-4ad9-a9af-cc0af2d8558d",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "93879cce-b808-4713-8ec3-95f7b7156a3c",
  "upload_path": "/api/operator/v1/uploads/93879cce-b808-4713-8ec3-95f7b7156a3c",
  "expires_at": "2026-10-29T07:39:27.529339293Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/93879cce-b808-4713-8ec3-95f7b7156a3c` → **200**

```json
{
  "file_id": "93879cce-b808-4713-8ec3-95f7b7156a3c",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/db29377c-88e6-42e5-b082-2af2442ba8d1` → **200**

```json
{
  "id": "db29377c-88e6-42e5-b082-2af2442ba8d1",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "e25152b9-821a-4902-9fa6-498184cfd9a9",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T07:24:25.999902Z",
  "updated_at": "2026-10-29T07:24:25.999902Z",
  "respond_by": "2026-10-29T11:24:25.999902Z",
  "messages": [
    {
      "id": "b278f364-6bef-47f1-9495-4569a9c9f2d4",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "e25152b9-821a-4902-9fa6-498184cfd9a9",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T07:24:26.000906Z",
      "attachments": [
        {
          "file_id": "935c2b0d-2a5e-4265-b05c-0009b5146e39",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/db29377c-88e6-42e5-b082-2af2442ba8d1/comments` → **200**

```json
{
  "command_id": "39636a72-2b34-4a0e-b868-ec96611bedf7",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "93879cce-b808-4713-8ec3-95f7b7156a3c"
  ]
}
```

```json
{
  "id": "db29377c-88e6-42e5-b082-2af2442ba8d1",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "e25152b9-821a-4902-9fa6-498184cfd9a9",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T07:24:25.999902Z",
  "updated_at": "2026-10-29T07:24:28.131215Z",
  "respond_by": "2026-10-29T11:24:25.999902Z",
  "messages": [
    {
      "id": "b278f364-6bef-47f1-9495-4569a9c9f2d4",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "e25152b9-821a-4902-9fa6-498184cfd9a9",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T07:24:26.000906Z",
      "attachments": [
        {
          "file_id": "935c2b0d-2a5e-4265-b05c-0009b5146e39",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "fc43af17-bb2c-4929-82f1-de27324211b9",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T07:24:28.130637Z",
      "attachments": [
        {
          "file_id": "93879cce-b808-4713-8ec3-95f7b7156a3c",
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

`GET /api/rider/v1/support/cases/db29377c-88e6-42e5-b082-2af2442ba8d1` → **200**

```json
{
  "id": "db29377c-88e6-42e5-b082-2af2442ba8d1",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "e25152b9-821a-4902-9fa6-498184cfd9a9",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T07:24:25.999902Z",
  "updated_at": "2026-10-29T07:24:28.131215Z",
  "respond_by": "2026-10-29T11:24:25.999902Z",
  "messages": [
    {
      "id": "b278f364-6bef-47f1-9495-4569a9c9f2d4",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "e25152b9-821a-4902-9fa6-498184cfd9a9",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T07:24:26.000906Z",
      "attachments": [
        {
          "file_id": "935c2b0d-2a5e-4265-b05c-0009b5146e39",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "fc43af17-bb2c-4929-82f1-de27324211b9",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T07:24:28.130637Z",
      "attachments": [
        {
          "file_id": "93879cce-b808-4713-8ec3-95f7b7156a3c",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/db29377c-88e6-42e5-b082-2af2442ba8d1/attachments/93879cce-b808-4713-8ec3-95f7b7156a3c` → **200**

Done: support case db29377c-88e6-42e5-b082-2af2442ba8d1, rider attachment 935c2b0d-2a5e-4265-b05c-0009b5146e39, operator attachment 93879cce-b808-4713-8ec3-95f7b7156a3c.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737309193",
  "device_ref": "sandbox-32591"
}
```

```json
{
  "challenge_id": "cde1f8e1-af58-4471-b339-48298395d709",
  "expires_at": "2026-10-29T07:29:28.742835466Z",
  "resend_available_at": "2026-10-29T07:24:29.742835466Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380737309193` → **200**

```json
{
  "phone": "+380737309193",
  "audience": "CLIENT",
  "code": "359570",
  "sent_at": "2026-10-29T07:24:28.745203461Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cde1f8e1-af58-4471-b339-48298395d709",
  "code": "359570",
  "device_ref": "sandbox-32591"
}
```

```json
{
  "session_id": "2acdf20f-a62b-4dc0-9a5d-66432f47c75d",
  "subject": {
    "type": "CLIENT",
    "id": "2ff2559e-b754-4499-a8ce-1451e6a7783d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmYyNTU5ZS1iNzU0LTQ0OTktYThjZS0xNDUxZTZhNzc4M2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5NTY5LCJpYXQiOjE3OTMyNTg2NjksImp0aSI6IjIxMjUyMWJkLTgyMWYtNDFiYi05M2IwLTkzMjc2YWY1Y2YzZiIsInNpZCI6IjJhY2RmMjBmLWE2MmItNGRjMC05YTVkLTY2NDMyZjQ3Yzc1ZCJ9.bibZYeu-65TJGB8MZQ-_MBG-s3uAxgpNaC4X7r0TpnI",
  "access_expires_at": "2026-10-29T07:39:29.052125652Z",
  "refresh_token": "9rO0vwOZYvFhTPabKh-FUF6CM09pCJquc4GG9udlj9g",
  "refresh_expires_at": "2026-11-28T07:24:29.051352911Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "341bb5be-b0e1-4619-90b4-86167061f90e",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "bf255f8e-7e02-4261-b701-9cb09f2343a7",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-bf255f8e-7e02-4261-b701-9cb09f2343a7",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "8fbb9698eb80e0f10170dc295e429661",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=bf255f8e-7e02-4261-b701-9cb09f2343a7",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737309193"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=bf255f8e-7e02-4261-b701-9cb09f2343a7",
  "expires_at": "2026-10-29T07:54:29.343606Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/bf255f8e-7e02-4261-b701-9cb09f2343a7` → **200**

```json
{
  "id": "bf255f8e-7e02-4261-b701-9cb09f2343a7",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T07:54:29.343606Z",
  "card": {
    "id": "f2ac1a05-1fe1-4615-a0f5-add98f1f4bab",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4576",
    "card_type": "Visa",
    "created_at": "2026-10-29T07:24:29.626828Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "865cf1d0-6d7e-41a8-96ae-bd9b786888d2",
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
  "id": "1bd184e5-2647-4239-9ae9-baccd07d426a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:29:29.929728Z",
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
  "command_id": "463719b7-f7a0-4c32-86c2-e0cdd0db90c2",
  "quote_id": "1bd184e5-2647-4239-9ae9-baccd07d426a",
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
  "id": "5c2c1c3c-c47d-4d78-b2ca-f757f99c8dc4",
  "short_number": 25,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "2ff2559e-b754-4499-a8ce-1451e6a7783d",
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
  "created_at": "2026-10-29T07:24:30.231652Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5c2c1c3c-c47d-4d78-b2ca-f757f99c8dc4` → **200**

```json
{
  "id": "5c2c1c3c-c47d-4d78-b2ca-f757f99c8dc4",
  "short_number": 25,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "2ff2559e-b754-4499-a8ce-1451e6a7783d",
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
  "created_at": "2026-10-29T07:24:30.231652Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5c2c1c3c-c47d-4d78-b2ca-f757f99c8dc4` → **200**

```json
{
  "id": "5c2c1c3c-c47d-4d78-b2ca-f757f99c8dc4",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2ff2559e-b754-4499-a8ce-1451e6a7783d",
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
  "created_at": "2026-10-29T07:24:30.231652Z",
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

`GET /api/rider/v1/orders/5c2c1c3c-c47d-4d78-b2ca-f757f99c8dc4` → **200**

```json
{
  "id": "5c2c1c3c-c47d-4d78-b2ca-f757f99c8dc4",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2ff2559e-b754-4499-a8ce-1451e6a7783d",
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
  "created_at": "2026-10-29T07:24:30.231652Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5c2c1c3c-c47d-4d78-b2ca-f757f99c8dc4/switch-to-cash` → **200**

```json
{
  "command_id": "81103551-02e0-43c6-89d2-306d70af0d30",
  "expected_version": 3
}
```

```json
{
  "id": "5c2c1c3c-c47d-4d78-b2ca-f757f99c8dc4",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "2ff2559e-b754-4499-a8ce-1451e6a7783d",
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
  "created_at": "2026-10-29T07:24:30.231652Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5c2c1c3c-c47d-4d78-b2ca-f757f99c8dc4/switch-to-cash` → **409**

```json
{
  "command_id": "75c37fff-860b-4c85-94ae-3a70dca3efaf",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/5c2c1c3c-c47d-4d78-b2ca-f757f99c8dc4/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "92f4acf1-6fc7-4174-a212-0973f29f93da"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/5c2c1c3c-c47d-4d78-b2ca-f757f99c8dc4` → **200**

```json
{
  "id": "5c2c1c3c-c47d-4d78-b2ca-f757f99c8dc4",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "2ff2559e-b754-4499-a8ce-1451e6a7783d",
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
  "created_at": "2026-10-29T07:24:30.231652Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5c2c1c3c-c47d-4d78-b2ca-f757f99c8dc4/cancel` → **200**

```json
{
  "command_id": "d747dc2d-c4c2-49e6-b6e7-8f54ca082215",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5c2c1c3c-c47d-4d78-b2ca-f757f99c8dc4",
  "short_number": 25,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "2ff2559e-b754-4499-a8ce-1451e6a7783d",
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
  "created_at": "2026-10-29T07:24:30.231652Z",
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
  "session_id": "927ba7b2-7ec2-4955-b991-f5ff556a8b4f",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk1NzMsImlhdCI6MTc5MzI1ODY3MywianRpIjoiM2RlMDBiNDAtNjAxYi00ZWMwLTlmYjItMjY2MmUyYjhkZDBiIiwic2lkIjoiOTI3YmE3YjItN2VjMi00OTU1LWI5OTEtZjVmZjU1NmE4YjRmIn0.AANOj9U3wfbpyDJxhYZwbWpSe_daXASRZd20ijqtDmw",
  "access_expires_at": "2026-10-29T07:39:33.903633011Z",
  "refresh_token": "DH8e_bT59HWE7PwjStO20O5s5YV7unw4Q73htEHPC1o",
  "refresh_expires_at": "2026-10-29T19:24:33.902959792Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-17449"
}
```

```json
{
  "challenge_id": "9dc2b674-734f-4dfe-8aa6-566922af0989",
  "expires_at": "2026-10-29T07:29:34.19628648Z",
  "resend_available_at": "2026-10-29T07:24:35.19628648Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "505248",
  "sent_at": "2026-10-29T07:24:34.198889641Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9dc2b674-734f-4dfe-8aa6-566922af0989",
  "code": "505248",
  "device_ref": "sandbox-17449"
}
```

```json
{
  "session_id": "aca0c677-92ac-4b3e-bd5f-62155dae455b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI1OTU3NCwiaWF0IjoxNzkzMjU4Njc0LCJqdGkiOiJjOTFhNDVjMy1mN2Q0LTRhYTEtYTkyNi1kOWM5YTM3Mjg4ZmUiLCJzaWQiOiJhY2EwYzY3Ny05MmFjLTRiM2UtYmQ1Zi02MjE1NWRhZTQ1NWIifQ.VII5u1ipDx0Jyt3qvuYObv043rqyEYr6XwWkNaUcjlc",
  "access_expires_at": "2026-10-29T07:39:34.511703658Z",
  "refresh_token": "TLZeJjAjaXz9Ple7lTzCJb2VA8oP1B6JGyjN41OS-ok",
  "refresh_expires_at": "2026-11-28T07:24:34.511183552Z",
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
      "actor_id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T07:24:17.540855Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23",
      "reason": "Sandbox clean-up",
      "at": "2026-10-29T07:24:18.986903Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "db2f8bf8-ae5f-495f-b0b8-f477cc074edd",
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
  "device_ref": "sandbox-21945"
}
```

```json
{
  "challenge_id": "92be36fa-1439-47ab-91c4-2f82f8cd69ea",
  "expires_at": "2026-10-29T07:29:35.615887673Z",
  "resend_available_at": "2026-10-29T07:24:36.615887673Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "284000",
  "sent_at": "2026-10-29T07:24:35.618223872Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "92be36fa-1439-47ab-91c4-2f82f8cd69ea",
  "code": "284000",
  "device_ref": "sandbox-21945"
}
```

```json
{
  "session_id": "780d13aa-3fd2-4e8e-aef5-70784bab4f44",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI1OTU3NSwiaWF0IjoxNzkzMjU4Njc1LCJqdGkiOiJlYTE3YWEwMS1iZmRlLTRlMDktOGMzZS1hZmNmMTNjZDkxNDkiLCJzaWQiOiI3ODBkMTNhYS0zZmQyLTRlOGUtYWVmNS03MDc4NGJhYjRmNDQifQ.MWcB_iS5qLPesBpUHn1X8jXJYdkHR3viCASKRwvWCxk",
  "access_expires_at": "2026-10-29T07:39:35.915034827Z",
  "refresh_token": "ZPCB_nx4cGoUHdhMdU5z8za6bgT7ylBe_hv3zAmsa9I",
  "refresh_expires_at": "2026-11-28T07:24:35.914480427Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7ce76439-8bcc-4af4-b7fa-17087baa0cdc",
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
  "last_heartbeat_at": "2026-10-29T07:23:57.294556Z",
  "last_location_at": "2026-10-29T07:23:57.294556Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7ce76439-8bcc-4af4-b7fa-17087baa0cdc/handover` → **200**

```json
{
  "command_id": "572beb5e-be22-43d8-829c-797dcb6d9809",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7ce76439-8bcc-4af4-b7fa-17087baa0cdc",
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
  "last_heartbeat_at": "2026-10-29T07:23:57.294556Z",
  "last_location_at": "2026-10-29T07:23:57.294556Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7ce76439-8bcc-4af4-b7fa-17087baa0cdc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:24:36Z",
    "sequence": 1793258676759
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7ce76439-8bcc-4af4-b7fa-17087baa0cdc",
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
  "last_heartbeat_at": "2026-10-29T07:24:36.778586Z",
  "last_location_at": "2026-10-29T07:24:36.778586Z",
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
  "command_id": "51c4e93f-4bab-4023-b0f8-aba16afcb8c0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:24:37Z",
    "sequence": 1793258677359
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6991de35-80e0-466f-919b-2978f08a222f",
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
  "last_heartbeat_at": "2026-10-29T07:24:37.379044Z",
  "last_location_at": "2026-10-29T07:24:37.379044Z",
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
  "session_id": "18e6dfac-a2b5-427b-97f6-f96fccb2f24c",
  "subject": {
    "type": "STAFF",
    "id": "e1fa4bd3-44f6-4371-81e1-20056c5ede23"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWZhNGJkMy00NGY2LTQzNzEtODFlMS0yMDA1NmM1ZWRlMjMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNTk1NzcsImlhdCI6MTc5MzI1ODY3NywianRpIjoiMjkwNWQxMzYtODljNi00MjUzLThhYzMtYTdmZDQ5MjRiMDllIiwic2lkIjoiMThlNmRmYWMtYTJiNS00MjdiLTk3ZjYtZjk2ZmNjYjJmMjRjIn0.t5FWWDM4-xepTWDnfnsKYd-Ww-cbxNeRBKroPKQ3Q_s",
  "access_expires_at": "2026-10-29T07:39:37.956231938Z",
  "refresh_token": "h8RWZjs9kWD2kNhiVTPnr7QgMWRyaKI50YCOuQGJ_d8",
  "refresh_expires_at": "2026-10-29T19:24:37.955650289Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "bf80faef-fabf-4398-8f9b-2bcefb07407f",
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
  "id": "efd8f98a-b0cb-4836-b6a0-2d12cee6aa80",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:29:38.231225Z",
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
  "command_id": "6d7b2d9b-654c-4ef8-8028-3fab09b83ec3",
  "quote_id": "efd8f98a-b0cb-4836-b6a0-2d12cee6aa80",
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
  "id": "5a04378c-f81e-43ae-8eb2-a3736aea4d00",
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
  "created_at": "2026-10-29T07:24:38.524665Z",
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
    "id": "1f015487-8b62-4792-bee0-49abad2ae710",
    "order_id": "5a04378c-f81e-43ae-8eb2-a3736aea4d00",
    "expires_at": "2026-10-29T07:24:53.529542Z",
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

`POST /api/driver/v1/offers/1f015487-8b62-4792-bee0-49abad2ae710/accept` → **200**

```json
{
  "command_id": "9d8055e7-8863-4c7a-a669-8c91662fb99d"
}
```

```json
{
  "id": "1c2270d4-86ba-482d-8725-82730b1efc84",
  "order_id": "5a04378c-f81e-43ae-8eb2-a3736aea4d00",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "35393ad2-c43e-472a-bbb9-b3f04d6e583a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "35393ad2-c43e-472a-bbb9-b3f04d6e583a",
  "order_id": "5a04378c-f81e-43ae-8eb2-a3736aea4d00",
  "assignment_id": "1c2270d4-86ba-482d-8725-82730b1efc84",
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

`POST /api/driver/v1/work-sessions/6991de35-80e0-466f-919b-2978f08a222f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:24:39Z",
    "sequence": 1793258679951
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6991de35-80e0-466f-919b-2978f08a222f",
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
  "last_heartbeat_at": "2026-10-29T07:24:39.969842Z",
  "last_location_at": "2026-10-29T07:24:39.969842Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/35393ad2-c43e-472a-bbb9-b3f04d6e583a/arrive` → **200**

```json
{
  "command_id": "3a0bef61-5257-4829-9f12-9176702aecb2",
  "expected_version": 0
}
```

```json
{
  "id": "35393ad2-c43e-472a-bbb9-b3f04d6e583a",
  "order_id": "5a04378c-f81e-43ae-8eb2-a3736aea4d00",
  "assignment_id": "1c2270d4-86ba-482d-8725-82730b1efc84",
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
  "arrived_at": "2026-10-29T07:24:40.253873Z",
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

`POST /api/driver/v1/trips/35393ad2-c43e-472a-bbb9-b3f04d6e583a/start` → **200**

```json
{
  "command_id": "c9c9db73-8955-4704-83ac-cf14f7dcbaf6",
  "expected_version": 1
}
```

```json
{
  "id": "35393ad2-c43e-472a-bbb9-b3f04d6e583a",
  "order_id": "5a04378c-f81e-43ae-8eb2-a3736aea4d00",
  "assignment_id": "1c2270d4-86ba-482d-8725-82730b1efc84",
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
  "arrived_at": "2026-10-29T07:24:40.253873Z",
  "started_at": "2026-10-29T07:24:40.549661Z",
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

`POST /api/driver/v1/trips/35393ad2-c43e-472a-bbb9-b3f04d6e583a/complete` → **200**

```json
{
  "command_id": "8df25385-76d0-4994-9f9c-abf1b4f55774",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:24:40Z",
  "cash_received": true
}
```

```json
{
  "id": "35393ad2-c43e-472a-bbb9-b3f04d6e583a",
  "order_id": "5a04378c-f81e-43ae-8eb2-a3736aea4d00",
  "assignment_id": "1c2270d4-86ba-482d-8725-82730b1efc84",
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
  "arrived_at": "2026-10-29T07:24:40.253873Z",
  "started_at": "2026-10-29T07:24:40.549661Z",
  "completed_at": "2026-10-29T07:24:40.842625Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/5a04378c-f81e-43ae-8eb2-a3736aea4d00` → **200**

```json
{
  "id": "5a04378c-f81e-43ae-8eb2-a3736aea4d00",
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
    "id": "1c2270d4-86ba-482d-8725-82730b1efc84",
    "order_id": "5a04378c-f81e-43ae-8eb2-a3736aea4d00",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "35393ad2-c43e-472a-bbb9-b3f04d6e583a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T07:24:38.524665Z",
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
  "session_id": "7ce76439-8bcc-4af4-b7fa-17087baa0cdc",
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
  "last_heartbeat_at": "2026-10-29T07:24:36.778586Z",
  "last_location_at": "2026-10-29T07:24:36.778586Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7ce76439-8bcc-4af4-b7fa-17087baa0cdc/close` → **200**

```json
{
  "command_id": "93c773f4-f179-49e3-ab61-00748b056701",
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
  "session_id": "6991de35-80e0-466f-919b-2978f08a222f",
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
  "last_heartbeat_at": "2026-10-29T07:24:39.969842Z",
  "last_location_at": "2026-10-29T07:24:39.969842Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6991de35-80e0-466f-919b-2978f08a222f/close` → **200**

```json
{
  "command_id": "fa40107f-c5e1-49fc-8dc6-b2301c111cbb",
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

Done: terminal order 5a04378c-f81e-43ae-8eb2-a3736aea4d00 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-5964"
}
```

```json
{
  "challenge_id": "8e9ad088-63ea-458c-b54c-383285a850c0",
  "expires_at": "2026-10-29T07:29:45.845358697Z",
  "resend_available_at": "2026-10-29T07:24:46.845358697Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "310604",
  "sent_at": "2026-10-29T07:24:45.847912187Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8e9ad088-63ea-458c-b54c-383285a850c0",
  "code": "310604",
  "device_ref": "sandbox-5964"
}
```

```json
{
  "session_id": "0f1fd897-7709-4cf2-95f2-f00ee982604f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI1OTU4NiwiaWF0IjoxNzkzMjU4Njg2LCJqdGkiOiJhZjc4NWYxZS0zYTk1LTQwZjgtYjc3Ni0zMzYwYjU4OWJjMWIiLCJzaWQiOiIwZjFmZDg5Ny03NzA5LTRjZjItOTVmMi1mMDBlZTk4MjYwNGYifQ.ZhnYj6ZwN1ciHw5jZH4wdVxMqHPhMBkeTmpWyecWmBM",
  "access_expires_at": "2026-10-29T07:39:46.155268041Z",
  "refresh_token": "31tZYK758WkNM1tmUisfhPhPZh-t8yjtPPAiade9X8k",
  "refresh_expires_at": "2026-11-28T07:24:46.154698434Z",
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
  "device_ref": "sandbox-14399"
}
```

```json
{
  "challenge_id": "69bf8fe5-6132-41b0-980c-87acaa637d01",
  "expires_at": "2026-10-29T07:29:46.707187893Z",
  "resend_available_at": "2026-10-29T07:24:47.707187893Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "019601",
  "sent_at": "2026-10-29T07:24:46.70946943Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "69bf8fe5-6132-41b0-980c-87acaa637d01",
  "code": "019601",
  "device_ref": "sandbox-14399"
}
```

```json
{
  "session_id": "2dbe1a1c-6b49-42b7-9e24-f674c3ee2bb4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI1OTU4NywiaWF0IjoxNzkzMjU4Njg3LCJqdGkiOiI2OGQzOTNhYS00OWFiLTQzMTEtOTliMi05Y2RkOTE1MGVhZDIiLCJzaWQiOiIyZGJlMWExYy02YjQ5LTQyYjctOWUyNC1mNjc0YzNlZTJiYjQifQ.lw1BWwtrmAVyVgAoE5-x7Js3vWXRr2mWbDEkDqUMASY",
  "access_expires_at": "2026-10-29T07:39:47.022798723Z",
  "refresh_token": "5QfwFcStxf6lFt1z5XF9hy09HR0mbOwbeYN6MGNY1T0",
  "refresh_expires_at": "2026-11-28T07:24:47.022240758Z",
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
  "device_ref": "sandbox-12218"
}
```

```json
{
  "challenge_id": "f30f8442-8d72-4e84-93e1-1f38b6bb08c3",
  "expires_at": "2026-10-29T07:29:47.590020433Z",
  "resend_available_at": "2026-10-29T07:24:48.590020433Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "971997",
  "sent_at": "2026-10-29T07:24:47.592200679Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f30f8442-8d72-4e84-93e1-1f38b6bb08c3",
  "code": "971997",
  "device_ref": "sandbox-12218"
}
```

```json
{
  "session_id": "0e4681d9-accc-4673-bc97-bba0054b2420",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI1OTU4NywiaWF0IjoxNzkzMjU4Njg3LCJqdGkiOiIxNmNkNzQ0My1jZDM5LTQ1NjYtOTg0NS04NDQzNDM4YTZhZjAiLCJzaWQiOiIwZTQ2ODFkOS1hY2NjLTQ2NzMtYmM5Ny1iYmEwMDU0YjI0MjAifQ.jZbWyasikMi6dQ31YNrhX9Q71pCr11Kdp39BLvRwils",
  "access_expires_at": "2026-10-29T07:39:47.885809508Z",
  "refresh_token": "oCWvFUjMbhAbXlJIEpl04pr60i-Qh199nlHY1UxnbrA",
  "refresh_expires_at": "2026-11-28T07:24:47.885235125Z",
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
  "phone": "+380692814235",
  "device_ref": "sandbox-25156"
}
```

```json
{
  "challenge_id": "6d5520f5-e216-41da-8145-01594f800272",
  "expires_at": "2026-10-29T07:29:48.426303673Z",
  "resend_available_at": "2026-10-29T07:24:49.426303673Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380692814235` → **200**

```json
{
  "phone": "+380692814235",
  "audience": "CLIENT",
  "code": "408196",
  "sent_at": "2026-10-29T07:24:48.42869177Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6d5520f5-e216-41da-8145-01594f800272",
  "code": "408196",
  "device_ref": "sandbox-25156"
}
```

```json
{
  "session_id": "2df11cd7-256d-4423-9746-7b52bd20b415",
  "subject": {
    "type": "CLIENT",
    "id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NmU2M2NhZC01Mjg4LTRjMmYtYThjNS05YjFiZjFhYWI0N2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjU5NTg4LCJpYXQiOjE3OTMyNTg2ODgsImp0aSI6IjhlMWJkMWUyLTYzNDEtNDkyMS05MjIzLTI0ZWUyMGRiYmVmOCIsInNpZCI6IjJkZjExY2Q3LTI1NmQtNDQyMy05NzQ2LTdiNTJiZDIwYjQxNSJ9.MiLKzwjo1Ww_3JJd8TTcUmzmnMA0sMhldxDeYZdT1wU",
  "access_expires_at": "2026-10-29T07:39:48.727517623Z",
  "refresh_token": "plQGI0-9i2mgK3dxWS6TC0gGK_RXaALl9XeruLT6TjU",
  "refresh_expires_at": "2026-11-28T07:24:48.727011043Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "69ccfdb1-5fdd-4b7b-ba6c-b6d9f19dd710",
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
  "id": "583b6485-6468-440c-b6a8-a918320c15c4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:29:48.999777Z",
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
  "command_id": "cafc8239-6a64-4648-8972-871a35f0d64d",
  "quote_id": "583b6485-6468-440c-b6a8-a918320c15c4",
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
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:24:49.293522Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 12.481473632
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 4.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 17
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.157456165
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

`GET /api/rider/v1/orders/57741ff0-2e74-4e64-b49c-569867475ee3` → **200**

```json
{
  "id": "57741ff0-2e74-4e64-b49c-569867475ee3",
  "short_number": 27,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "56e63cad-5288-4c2f-a8c5-9b1bf1aab47c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:24:49.293522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```
